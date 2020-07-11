@echo off

@if "%1" equ "" (
  goto :input
) else (
  goto :jar_start_2
)

:input
set input_str=
set /p input_str="読み込むログファイルパスを入力してください："
goto :jar_start_1

:jar_start_1
echo ＊＊＊ツール実行中。しばらくお待ちください。＊＊＊
java -jar ../lib/log_type_count.jar %input_str% %~dp0
goto :end
 
:jar_start_2
echo ＊＊＊ツール実行中。しばらくお待ちください。＊＊＊
java -jar ../lib/log_type_count.jar %1 %~dp0
goto :end

:end
echo ＊＊＊ツール実行終了＊＊＊
pause