@echo off
goto :input_scale



:input_scale
set scale=
echo �W�v�̊Ԋu��I�����Ă�������
set /p scale="1�F1���@2�F10���@3�F60���F"
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
echo WARNING�F1�`3�̐��l����͂��Ă�������
goto :input_scale

:judge_path
@if "%1" equ "" (
  goto :input_readfile
) else (
  goto :jar_start_2
)

:input_readfile
set input_str=
set /p input_str="�ǂݍ��ރ��O�t�@�C���p�X����͂��Ă��������F"
goto :jar_start_1

:jar_start_1
echo �������c�[�����s���B���΂炭���҂����������B������
java -jar ../lib/log_type_count.jar %input_str% %~dp0 %scale%
goto :end
 
:jar_start_2
echo �������c�[�����s���B���΂炭���҂����������B������
java -jar ../lib/log_type_count.jar %1 %~dp0 %scale%
goto :end

:end
echo �������c�[�����s�I��������
pause