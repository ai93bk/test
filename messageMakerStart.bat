@echo off
rem **********
rem 変数の設定

set d=%date: =0%
set yyyy=%d:~0,4%
set mm=%d:~5,2%
set dd=%d:~8,2%
set t=%time: =0%
set H=%t:~0,2%
set M=%t:~3,2%
set S=%t~5,2%
for /f "tokens=1,* delims==" %%a in (../conf/car_messageMaker_Config.propaties) do (
  set %%a=%%b
)
fsutil volume diskfree C:\ | find "空きバイト総数">%TEMP%\diskfree.tmp
for /f "tokens=3" %%a in (%TEMP%\diskfree.tmp) do set DISKFREE=%%a
del /q %TEMP%\diskfree.tmp
rem ***************************************
rem MMT/bin/にロックファイルがあるかチェック
if exist car_messageMaker.lock (

  echo 開始:ツール実行
  rem **************************
  rem ロックファイルがあった場合

  if not exist ../log/car_messageMaker_%yyyy%%mm%%dd%.log (
    type nul > ../log/car_messageMaker_%yyyy%%mm%%dd%.log
  )
  echo %yyyy%%mm%%dd%%H%%M%%S%: >> ../log/car_messageMaker_%yyyy%%mm%%dd%.log
  echo [I010014]開始：Bash/Shell >> ../log/car_messageMaker_%yyyy%%mm%%dd%.log
  echo [W010002]既に実行しているため多重実行できません ファイルパス：MMT/bin/car_messageMaker.lock >> ../log/car_messageMaker_%yyyy%%mm%%dd%.log
  echo 警告：既に起動しているため多重実行できません
  echo [I010015]終了：Bash/Shell >> ../log/car_messageMaker_%yyyy%%mm%%dd%.log
  echo 終了:ツール実行
  echo; >> ../log/car_messageMaker_%yyyy%%mm%%dd%.log
) else (
  echo 開始:ツール実行
  rem *****************************
  rem ロックファイルがなかった場合
  rem ロックファイル作成

  type nul > car_messageMaker.lock

  if not exist ../log/car_messageMaker_%yyyy%%mm%%dd%.log (
    type nul > ../log/car_messageMaker_%yyyy%%mm%%dd%.log
  )
  echo %yyyy%%mm%%dd%%H%%M%%S%: >> ../log/car_messageMaker_%yyyy%%mm%%dd%.log
  echo [I010014]開始：Bash/Shell >> ../log/car_messageMaker_%yyyy%%mm%%dd%.log

  rem ********************
  rem ディスクフルチェック
  if "%DISKFREE:~0,3%%DISKFREE:~4,3%%DISKFREE:~8,3%%DISKFREE:~12,3%" LEQ "0" (
    echo [W010006]ディスク容量がいっぱいのため実行できません ディスク容量:%DIKFREE% >> ../log/car_messageMaker_%yyyy%%mm%%dd%.log
  ) else (

    rem *******************
    rem ディレクトリチェック
    echo 開始：ディレクトリチェック
    if not exist ../bin (
      mkdir ..\bin
      echo [W020006]ディレクトリが存在しません ディレクトリパス：MMT/bin >> ../log/car_messageMaker_%yyyy%%mm%%dd%.log
      echo 警告：binディレクトリが存在しません。ディレクトリを作成します。 
    )
    if not exist ../conf (
      mkdir ..\conf
      echo [W020006]ディレクトリが存在しません ディレクトリパス：MMT/conf >> ../log/car_messageMaker_%yyyy%%mm%%dd%.log
      echo 警告：confディレクトリが存在しません。ディレクトリを作成します。 
    )
    if not exist ../in (
      mkdir ..\in
      echo [W020006]ディレクトリが存在しません ディレクトリパス：MMT/in >> ../log/car_messageMaker_%yyyy%%mm%%dd%.log
      echo 警告：inディレクトリが存在しません。ディレクトリを作成します。 
    )
    if not exist ../in/error (
      mkdir ..\in\error
      echo [W020006]ディレクトリが存在しません ディレクトリパス：MMT/in/error >> ../log/car_messageMaker_%yyyy%%mm%%dd%.log
      echo 警告：errorディレクトリが存在しません。ディレクトリを作成します。 
    )
    if not exist ../in/success (
      mkdir ..\in\success
      echo [W020006]ディレクトリが存在しません ディレクトリパス：MMT/in/success >> ../log/car_messageMaker_%yyyy%%mm%%dd%.log
      echo 警告：successディレクトリが存在しません。ディレクトリを作成します。 
    )
    if not exist ../lib (
      mkdir ..\lib
      echo [W020006]ディレクトリが存在しません ディレクトリパス：MMT/lib >> ../log/car_messageMaker_%yyyy%%mm%%dd%.log
      echo 警告：libディレクトリが存在しません。ディレクトリを作成します。 
    )
    if not exist ../log (
      mkdir ..\log
      echo [W020006]ディレクトリが存在しません ディレクトリパス：MMT/log >> ../log/car_messageMaker_%yyyy%%mm%%dd%.log
      echo 警告：logディレクトリが存在しません。ディレクトリを作成します。 
    )
    if not exist ../out (
      mkdir ..\out
      echo [W020006]ディレクトリが存在しません ディレクトリパス：MMT/out >> ../log/car_messageMaker_%yyyy%%mm%%dd%.log
      echo 警告：outディレクトリが存在しません。ディレクトリを作成します。 
    )
    echo 終了：ディレクトリチェック

    rem **************************
    rem プロパティファイルチェック
    if not exist ../conf/car_messageMaker_Config.propaties (
      echo [W010003]プロパティファイルが存在しません ファイルパス：MMT/conf/car_messageMaker_Config.propaties >> ../log/car_messageMaker_%yyyy%%mm%%dd%.log
      echo 警告：プロパティファイルが存在しません 
    ) else (
      if %errorlevel% neq 0 (
        rem ****
      ) else (
        if ""%bin_path%""=="""" (
          echo [W010004]プロパティファイル中の設定値に誤りがあります ファイルパス：MMT/conf/car_messageMaker_Config.propaties 設定値:bin_path >> ../log/car_messageMaker_%yyyy%%mm%%dd%.log
          echo 警告：プロパティファイル中のJava実行パスに誤りがあります
        ) else (
          if ""%lib_path%""=="""" (
            echo [W010004]プロパティファイル中の設定値に誤りがあります ファイルパス：MMT/conf/car_messageMaker_Config.propaties 設定値:lib_path >> ../log/car_messageMaker_%yyyy%%mm%%dd%.log
            echo 警告：プロパティファイル中のJavaライブラリパスに誤りがあります
          ) else (

            rem *******************
            rem Jar実行
            echo [I010016]開始：Javaプログラム >> ../log/car_messageMaker_%yyyy%%mm%%dd%.log
            set PATH=%bin_path%;%lib_path%;
            java -jar ../lib/MMT.jar
            echo 開始：Javaプログラム
            if %errorlevel% neq 0 (
              echo 警告：Javaプログラム失敗
            ) else (
              echo [I010017]終了：Javaプログラム >> ../log/car_messageMaker_%yyyy%%mm%%dd%.log
              echo 終了：Javaプログラム
            )
          )
        )
      )
    )
  )
  echo [I010015]終了：Bash/Shell >> ../log/car_messageMaker_%yyyy%%mm%%dd%.log
  echo 終了:ツール実行
  echo; >> ../log/car_messageMaker_%yyyy%%mm%%dd%.log
  del car_messageMaker.lock
)