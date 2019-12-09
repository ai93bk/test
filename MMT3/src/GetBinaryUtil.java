import javax.xml.bind.DatatypeConverter;

public class GetBinaryUtil {
	public GetBinaryUtil() {

	}
	public byte[] getHexBinary(String s,int len) {
		String str=Integer.toHexString(Integer.valueOf(s));
		for(int i=str.length(); i<len*2; i++) {
			str="0"+str;
		}
		return getHexBinary(str);
	}
	public byte[] getHexBinary(String s) {
		byte[] b = DatatypeConverter.parseHexBinary(s);
		byte[] sbyte = new byte[b.length];
		// リトルエンディアン
		int i=0;
		for(int j=b.length-1; j>=0; j--) {
			sbyte[i]=b[j];
			i++;
		}
		return sbyte;
	}
	public byte[] getBCDBinary(String s) {
		return DatatypeConverter.parseHexBinary(s);
	}
	public byte[] getBCDBinary(String s,int mode) {
		String str =  "";
		if(s.length()!=16) {
			for(int i=s.length(); i<16; i++) {
				str+="0";
			}
			str+=s;
		}
		return DatatypeConverter.parseHexBinary(str);
	}
	public byte[] getStringBinary(String s) {
		return s.getBytes();
	}
	public byte[] getStringBinary(String s,int min,int max) {
		return s.substring(min-1,max).getBytes();
	}
}
