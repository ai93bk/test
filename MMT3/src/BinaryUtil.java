
public class BinaryUtil {
	//チェックコード取得
	//先頭から末尾の一つ前までが対象
	public static byte getCheckCode(byte[] byteArray) {
		byte crc = 0;
		return calcCRC8(byteArray, crc, 0, byteArray.length - 1);
	}

	//チェックコード取得
	//バイト配列の指定位置から指定サイズ分までが対象
	public static byte getCheckCode(int offset, int totalSize, byte[]... byteArrays) {
		byte crc = 0;
		int size = 0;
		int remainingByteNum = totalSize;
		for(byte[] byteArray : byteArrays) {
			if(byteArray.length - 1 < offset) {
				offset -= byteArray.length;
			}else {
				size = byteArray.length - offset;
				if(size > remainingByteNum) {
					size = remainingByteNum;
				}
				crc = calcCRC8(byteArray, crc, offset,size);
				offset = 0;
				remainingByteNum -= size;
			}
		}
		return crc;
	}

	public static byte calcCRC8(byte[] byteArray, int offset, int len) {
		byte crc =0;
		return calcCRC8(byteArray, crc, offset, len);
	}

	public static byte calcCRC8(byte[] byteArray, byte crc,int offset, int size) {
		for(int i = offset; i < offset + size; i++) {
			crc = calcCRC8(byteArray[i],crc);
		}
		return crc;
	}

	public static byte calcCRC8(byte dataByte, int crc) {
		int poly = 0xD5;
		crc ^= dataByte;
		for(int j = 0; j < 8; j++) {
			if((crc & 0x80) != 0) {
				crc = ((crc << 1) ^ poly);
			}else {
				crc <<= 1;
			}
			crc &= 0xFF;
		}
		return (byte) crc;
	}
}
