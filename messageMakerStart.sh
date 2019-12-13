if [ -e car_messageMaker.lock ] ; then
  
  echo 開始：ツール実行
  today=$(date "+%Y%m%d")
  
  echo $(date "+%Y%m%d%H%M%S"): >> ../log/car_messageMaker_${today}.log
  echo [I010014]開始：Bash/Shell >> ../log/car_messageMaker_${today}.log
  echo [W010002]既に実行しているため多重実行できません >> ../log/car_messageMaker_${today}.log
  echo 既に実行しているため多重実行できません
  echo [I010015]終了：Bash/Shell >> ../log/car_messageMaker_${today}.log
  echo -e  >> ../log/car_messageMaker_${today}.log

else

  echo 開始：ツール実行
  today=$(date "+%Y%m%d")

  type vi > car_messageMaker.lock

  echo $(date "+%Y%m%d%H%M%S"): >> ../log/car_messageMaker_${today}.log
  echo [I010014]開始：Bash/Shell >> ../log/car_messageMaker_${today}.log

  area_limit=100
  disk_limit=`df / | tail -1 | /bin/sed 's/^.* \([0-9]*\)%.*$/\1/'`
  if [ $disk_limit -gt $area_limit ] ; then
    echo "ディスクフル"    
  else

    echo 開始：ディレクトリチェック
    if [ ! -e ../bin ] ; then
      mkdir ../bin
      echo [W020006]ディレクトリが存在しません ディレクトリパス：MMT/bin >> ../log/car_messageMaker_${today}.log
      echo 警告：binディレクトリが存在しません。ディレクトリを作成します。
    elif [ ! -e ../conf ] ; then
      mkdir ../conf
      echo [W020006]ディレクトリが存在しません ディレクトリパス：MMT/conf >> ../log/car_messageMaker_${today}.log
      echo 警告：confディレクトリが存在しません。ディレクトリを作成します。
    fi
    echo 終了：ディレクトリチェック

    if [ ! -e ../conf/car_messageMaker_config.propaties ] ; then
      echo [W010003]プロパティファイルが存在しません ファイルパス：MMT/conf/car_messageMaker_config.propaties >> ../log/car_messageMaker_${today}.log
      echo 警告：プロパティファイルが存在しません。
    else
      . ../conf/car_messageMaker_config.propaties
      if [ -z "$bin_path" ]; then
        echo [W010004]プロパティファイル中の設定値に誤りがあります ファイルパス：MMT/conf/car_messageMaker_config.propaties >> ../log/car_messageMaker_${today}.log
        echo 警告：プロパティファイル中のJAVA実行パスに誤りがあります。
      elif [ -z "$lib_path" ]; then
        echo [W010004]プロパティファイル中の設定値に誤りがあります ファイルパス：MMT/conf/car_messageMaker_config.propaties >> ../log/car_messageMaker_${today}.log
        echo 警告：プロパティファイル中のJAVAライブラリパスに誤りがあります。
      fi
      export PATH="$bin_path:$lib_path:$PATH"

      echo 開始：Javaプログラム
      echo [I010016]開始：javaプログラム >> ../log/car_messageMaker_${today}.log
      java -jar ../lib/MMT.jar
      if [ $? -eq "1" ] ; then
        echo 警告：Javaプログラム失敗
      else
         echo 終了：Javaプログラム
         echo [I010017]終了：javaプログラム >> ../log/car_messageMaker_${today}.log
         rm car_messageMaker.lock
      fi
    fi
  fi
  echo 終了：ツール実行
  echo [I010015]終了：Bash/Shell >> ../log/car_messageMaker_${today}.log
  echo -e  >> ../log/car_messageMaker${today}.log
fi
