@echo off

@if "%1" equ "" (
  goto :input
) else (
  goto :jar_start_2
)

:input
set input_str=
set /p input_str="�ǂݍ��ރ��O�t�@�C���p�X����͂��Ă��������F"
goto :jar_start_1

:jar_start_1
echo �������c�[�����s���B���΂炭���҂����������B������
java -jar ../lib/log_type_count.jar %input_str% %~dp0
goto :end
 
:jar_start_2
echo �������c�[�����s���B���΂炭���҂����������B������
java -jar ../lib/log_type_count.jar %1 %~dp0
goto :end

:end
echo �������c�[�����s�I��������
pause