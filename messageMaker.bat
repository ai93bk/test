@echo off
chcp 65001
set d=%date: =0%
set yyyy=%d:~0,4%
set mm=%d:~5,2%
set dd=%d:~8,2%

set t=%time: =0%
set HH=%t:~0,2%
set MM=%t:~3,2%
set SS=%t:~6,2%
echo %yyyy%%mm%%dd%%HH%%MM%%SS% >> ../log/car_messageMaker%yyyy%%mm%%dd%.log
rem ログファイル作成削除


for /f "tokens=1,* delims==" %%a in (../conf/path.propaties) do (
  set %%a=%%b
)
   set PATH=%binbat%;%libbat%;
   java -jar ../lib/MMT.jar

if exist car_messageMaker.lock (
  rem ロックファイルあった場合

  call :date %d
  call :date %yyyy
  call :date %mm
  call :date %dd


  rem ログファイル作成とメッセージ追記
  if not exist ../log/car_messageMaker%yyyy%%mm%%dd%.log (
    type nul > ../log/car_messageMaker%yyyy%%mm%%dd%.log
    echo I010014開始：Bash/Shell >> ../log/car_messageMaker%yyyy%%mm%%dd%.log
    echo W010002既に実行しているため多重実行できません >> ../log/car_messageMaker%yyyy%%mm%%dd%.log
    echo I010015終了：Bash/Shell >> ../log/car_messageMaker%yyyy%%mm%%dd%.log
    echo;  >> ../log/car_messageMaker%yyyy%%mm%%dd%.log
  ) else (
    echo I010014開始：Bash/Shell >> ../log/car_messageMaker%yyyy%%mm%%dd%.log
    echo W010002既に実行しているため多重実行できません >> ../log/car_messageMaker%yyyy%%mm%%dd%.log
    echo I010015終了：Bash/Shell >> ../log/car_messageMaker%yyyy%%mm%%dd%.log
    echo;  >> ../log/car_messageMaker%yyyy%%mm%%dd%.log
  )
  echo 既に実行しているため多重実行できません

) else (
  rem ロックファイルなかった場合

  call :date %d
  call :date %yyyy
  call :date %mm
  call :date %dd

  rem ロックファイル作成
  type nul > car_messageMaker.lock

  rem ログファイル作成
  if not exist ../log/car_messageMaker%yyyy%%mm%%dd%.log (
    type nul > ../log/car_messageMaker%yyyy%%mm%%dd%.log
  )

  rem ディレクトリチェック
  if not exist ../conf (
    mkdir ..\conf
  )

  rem java -jar ../lib/Hello.jar

  del car_messageMaker.lock
)

:date
set d=%date: =0%
set yyyy=%d:~0,4%
set mm=%d:~5,2%
set dd=%d:~8,2%
