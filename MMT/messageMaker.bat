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
rem ���O�t�@�C���쐬�폜


for /f "tokens=1,* delims==" %%a in (../conf/path.propaties) do (
  set %%a=%%b
)
   set PATH=%binbat%;%libbat%;
   java -jar ../lib/MMT.jar

if exist car_messageMaker.lock (
  rem ���b�N�t�@�C���������ꍇ

  call :date %d
  call :date %yyyy
  call :date %mm
  call :date %dd


  rem ���O�t�@�C���쐬�ƃ��b�Z�[�W�ǋL
  if not exist ../log/car_messageMaker%yyyy%%mm%%dd%.log (
    type nul > ../log/car_messageMaker%yyyy%%mm%%dd%.log
    echo I010014�J�n�FBash/Shell >> ../log/car_messageMaker%yyyy%%mm%%dd%.log
    echo W010002���Ɏ��s���Ă��邽�ߑ��d���s�ł��܂��� >> ../log/car_messageMaker%yyyy%%mm%%dd%.log
    echo I010015�I���FBash/Shell >> ../log/car_messageMaker%yyyy%%mm%%dd%.log
    echo;  >> ../log/car_messageMaker%yyyy%%mm%%dd%.log
  ) else (
    echo I010014�J�n�FBash/Shell >> ../log/car_messageMaker%yyyy%%mm%%dd%.log
    echo W010002���Ɏ��s���Ă��邽�ߑ��d���s�ł��܂��� >> ../log/car_messageMaker%yyyy%%mm%%dd%.log
    echo I010015�I���FBash/Shell >> ../log/car_messageMaker%yyyy%%mm%%dd%.log
    echo;  >> ../log/car_messageMaker%yyyy%%mm%%dd%.log
  )
  echo ���Ɏ��s���Ă��邽�ߑ��d���s�ł��܂���

) else (
  rem ���b�N�t�@�C���Ȃ������ꍇ

  call :date %d
  call :date %yyyy
  call :date %mm
  call :date %dd

  rem ���b�N�t�@�C���쐬
  type nul > car_messageMaker.lock

  rem ���O�t�@�C���쐬
  if not exist ../log/car_messageMaker%yyyy%%mm%%dd%.log (
    type nul > ../log/car_messageMaker%yyyy%%mm%%dd%.log
  )

  rem �f�B���N�g���`�F�b�N
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
