@echo off	
@if "%1" equ "" (
  set USR_INPUT_STR=
  set /P USR_INPUT_STR="•¶Žš—ñ‚ð“ü—Í‚µ‚Ä‚­‚¾‚³‚¢: "
  java -jar ../lib/log_type_count.jar %USR_INPUT_STR%
) else (
  java -jar ../lib/log_type_count.jar %1
)

pause