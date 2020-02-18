
public class Test {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println(getHex("-16",2));
	}

	public static String getHex(String s,int len) {
		if(s.substring(0,1).equals("-")) {
			//2進数文字列に変換
			String str = Integer.toBinaryString(Integer.valueOf(s.substring(1)));
			String ss = "";
			//文字列の長さがlen*8になるまで先頭に0埋め
			for(int i=str.length(); i<len*8; i++) {
				str = "0"+ str;
			}
			System.out.println("str:"+str);

			//01反転
			for(int i=0; i<str.length(); i++) {
				if(str.substring(i,i+1).equals("0")) {
					ss=ss+"1";
				}else if(str.substring(i,i+1).equals("1")) {
					ss=ss+"0";
				}
			}
			System.out.println("ss :"+ss);

			//01反転後の値に+1
			int num=0;
			for(int i=0; i<ss.length(); i++) {
				if(ss.substring(i,i+1).equals("0")) {
					num=i;
				}
			}
			int k=ss.length();
			ss=ss.substring(0,num)+"1";
			for(int i=ss.length(); i<k; i++) {
				ss = ss + "0";
			}
			if(ss.substring(0,1).equals("0")) {
				ss="1"+ss.substring(0);
			}
			System.out.println("ss :"+ss);
			return Integer.toHexString(Integer.parseInt(ss, 2));
		}
		return "";
	}
}
