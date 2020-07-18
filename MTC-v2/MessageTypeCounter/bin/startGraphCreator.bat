@echo off
goto :input_scale



:input_scale
set scale=
echo 集計の間隔を選択してください
set /p scale="1：1分　2：10分　3：60分："
goto :judge_scale

:judge_scale
if "%scale%" equ "1" (
  goto :judge_path
) else if "%scale%" equ "2" (
  goto :judge_path
) else if "%scale%" equ "3" (
  goto :judge_path
) else (
  goto :error_scale
)

:error_scale
echo;
echo WARNING：1～3の数値を入力してください
goto :input_scale

:judge_path
@if "%1" equ "" (
  goto :input_readfile
) else (
  goto :jar_start_2
)

:input_readfile
set input_str=
set /p input_str="読み込むログファイルパスを入力してください："
goto :jar_start_1

:jar_start_1
echo ＊＊＊ツール実行中。しばらくお待ちください。＊＊＊
java -jar ../lib/log_type_count.jar %input_str% %~dp0 %scale%
goto :end
 
:jar_start_2
echo ＊＊＊ツール実行中。しばらくお待ちください。＊＊＊
java -jar ../lib/log_type_count.jar %1 %~dp0 %scale%
goto :end

:end
echo ＊＊＊ツール実行終了＊＊＊
pause