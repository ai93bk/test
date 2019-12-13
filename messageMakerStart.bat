@echo off
rem **********
rem �ϐ��̐ݒ�

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
fsutil volume diskfree C:\ | find "�󂫃o�C�g����">%TEMP%\diskfree.tmp
for /f "tokens=3" %%a in (%TEMP%\diskfree.tmp) do set DISKFREE=%%a
del /q %TEMP%\diskfree.tmp
rem ***************************************
rem MMT/bin/�Ƀ��b�N�t�@�C�������邩�`�F�b�N
if exist car_messageMaker.lock (

  echo �J�n:�c�[�����s
  rem **************************
  rem ���b�N�t�@�C�����������ꍇ

  if not exist ../log/car_messageMaker_%yyyy%%mm%%dd%.log (
    type nul > ../log/car_messageMaker_%yyyy%%mm%%dd%.log
  )
  echo %yyyy%%mm%%dd%%H%%M%%S%: >> ../log/car_messageMaker_%yyyy%%mm%%dd%.log
  echo [I010014]�J�n�FBash/Shell >> ../log/car_messageMaker_%yyyy%%mm%%dd%.log
  echo [W010002]���Ɏ��s���Ă��邽�ߑ��d���s�ł��܂��� �t�@�C���p�X�FMMT/bin/car_messageMaker.lock >> ../log/car_messageMaker_%yyyy%%mm%%dd%.log
  echo �x���F���ɋN�����Ă��邽�ߑ��d���s�ł��܂���
  echo [I010015]�I���FBash/Shell >> ../log/car_messageMaker_%yyyy%%mm%%dd%.log
  echo �I��:�c�[�����s
  echo; >> ../log/car_messageMaker_%yyyy%%mm%%dd%.log
) else (
  echo �J�n:�c�[�����s
  rem *****************************
  rem ���b�N�t�@�C�����Ȃ������ꍇ
  rem ���b�N�t�@�C���쐬

  type nul > car_messageMaker.lock

  if not exist ../log/car_messageMaker_%yyyy%%mm%%dd%.log (
    type nul > ../log/car_messageMaker_%yyyy%%mm%%dd%.log
  )
  echo %yyyy%%mm%%dd%%H%%M%%S%: >> ../log/car_messageMaker_%yyyy%%mm%%dd%.log
  echo [I010014]�J�n�FBash/Shell >> ../log/car_messageMaker_%yyyy%%mm%%dd%.log

  rem ********************
  rem �f�B�X�N�t���`�F�b�N
  if "%DISKFREE:~0,3%%DISKFREE:~4,3%%DISKFREE:~8,3%%DISKFREE:~12,3%" LEQ "0" (
    echo [W010006]�f�B�X�N�e�ʂ������ς��̂��ߎ��s�ł��܂��� �f�B�X�N�e��:%DIKFREE% >> ../log/car_messageMaker_%yyyy%%mm%%dd%.log
  ) else (

    rem *******************
    rem �f�B���N�g���`�F�b�N
    echo �J�n�F�f�B���N�g���`�F�b�N
    if not exist ../bin (
      mkdir ..\bin
      echo [W020006]�f�B���N�g�������݂��܂��� �f�B���N�g���p�X�FMMT/bin >> ../log/car_messageMaker_%yyyy%%mm%%dd%.log
      echo �x���Fbin�f�B���N�g�������݂��܂���B�f�B���N�g�����쐬���܂��B 
    )
    if not exist ../conf (
      mkdir ..\conf
      echo [W020006]�f�B���N�g�������݂��܂��� �f�B���N�g���p�X�FMMT/conf >> ../log/car_messageMaker_%yyyy%%mm%%dd%.log
      echo �x���Fconf�f�B���N�g�������݂��܂���B�f�B���N�g�����쐬���܂��B 
    )
    if not exist ../in (
      mkdir ..\in
      echo [W020006]�f�B���N�g�������݂��܂��� �f�B���N�g���p�X�FMMT/in >> ../log/car_messageMaker_%yyyy%%mm%%dd%.log
      echo �x���Fin�f�B���N�g�������݂��܂���B�f�B���N�g�����쐬���܂��B 
    )
    if not exist ../in/error (
      mkdir ..\in\error
      echo [W020006]�f�B���N�g�������݂��܂��� �f�B���N�g���p�X�FMMT/in/error >> ../log/car_messageMaker_%yyyy%%mm%%dd%.log
      echo �x���Ferror�f�B���N�g�������݂��܂���B�f�B���N�g�����쐬���܂��B 
    )
    if not exist ../in/success (
      mkdir ..\in\success
      echo [W020006]�f�B���N�g�������݂��܂��� �f�B���N�g���p�X�FMMT/in/success >> ../log/car_messageMaker_%yyyy%%mm%%dd%.log
      echo �x���Fsuccess�f�B���N�g�������݂��܂���B�f�B���N�g�����쐬���܂��B 
    )
    if not exist ../lib (
      mkdir ..\lib
      echo [W020006]�f�B���N�g�������݂��܂��� �f�B���N�g���p�X�FMMT/lib >> ../log/car_messageMaker_%yyyy%%mm%%dd%.log
      echo �x���Flib�f�B���N�g�������݂��܂���B�f�B���N�g�����쐬���܂��B 
    )
    if not exist ../log (
      mkdir ..\log
      echo [W020006]�f�B���N�g�������݂��܂��� �f�B���N�g���p�X�FMMT/log >> ../log/car_messageMaker_%yyyy%%mm%%dd%.log
      echo �x���Flog�f�B���N�g�������݂��܂���B�f�B���N�g�����쐬���܂��B 
    )
    if not exist ../out (
      mkdir ..\out
      echo [W020006]�f�B���N�g�������݂��܂��� �f�B���N�g���p�X�FMMT/out >> ../log/car_messageMaker_%yyyy%%mm%%dd%.log
      echo �x���Fout�f�B���N�g�������݂��܂���B�f�B���N�g�����쐬���܂��B 
    )
    echo �I���F�f�B���N�g���`�F�b�N

    rem **************************
    rem �v���p�e�B�t�@�C���`�F�b�N
    if not exist ../conf/car_messageMaker_Config.propaties (
      echo [W010003]�v���p�e�B�t�@�C�������݂��܂��� �t�@�C���p�X�FMMT/conf/car_messageMaker_Config.propaties >> ../log/car_messageMaker_%yyyy%%mm%%dd%.log
      echo �x���F�v���p�e�B�t�@�C�������݂��܂��� 
    ) else (
      if %errorlevel% neq 0 (
        rem ****
      ) else (
        if ""%bin_path%""=="""" (
          echo [W010004]�v���p�e�B�t�@�C�����̐ݒ�l�Ɍ�肪����܂� �t�@�C���p�X�FMMT/conf/car_messageMaker_Config.propaties �ݒ�l:bin_path >> ../log/car_messageMaker_%yyyy%%mm%%dd%.log
          echo �x���F�v���p�e�B�t�@�C������Java���s�p�X�Ɍ�肪����܂�
        ) else (
          if ""%lib_path%""=="""" (
            echo [W010004]�v���p�e�B�t�@�C�����̐ݒ�l�Ɍ�肪����܂� �t�@�C���p�X�FMMT/conf/car_messageMaker_Config.propaties �ݒ�l:lib_path >> ../log/car_messageMaker_%yyyy%%mm%%dd%.log
            echo �x���F�v���p�e�B�t�@�C������Java���C�u�����p�X�Ɍ�肪����܂�
          ) else (

            rem *******************
            rem Jar���s
            echo [I010016]�J�n�FJava�v���O���� >> ../log/car_messageMaker_%yyyy%%mm%%dd%.log
            set PATH=%bin_path%;%lib_path%;
            java -jar ../lib/MMT.jar
            echo �J�n�FJava�v���O����
            if %errorlevel% neq 0 (
              echo �x���FJava�v���O�������s
            ) else (
              echo [I010017]�I���FJava�v���O���� >> ../log/car_messageMaker_%yyyy%%mm%%dd%.log
              echo �I���FJava�v���O����
            )
          )
        )
      )
    )
  )
  echo [I010015]�I���FBash/Shell >> ../log/car_messageMaker_%yyyy%%mm%%dd%.log
  echo �I��:�c�[�����s
  echo; >> ../log/car_messageMaker_%yyyy%%mm%%dd%.log
  del car_messageMaker.lock
)