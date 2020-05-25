package datmaker.plusdata;

import javax.xml.bind.DatatypeConverter;

public class Conversion {
	public byte[] getHex(String str) {
		String s = Integer.toHexString(Integer.valueOf(str));
		for(int i = s.length(); i <= 8; i++) {
			s = "0" + s;
		}
		return this.getLittelEndian(s);
	}

	byte[] getLittelEndian(String str) {
		String s = "";
		for(int i = 7; i >= 0; i--) {
			s += str.substring(i);
		}
		return DatatypeConverter.parseHexBinary(s);
	}
}
