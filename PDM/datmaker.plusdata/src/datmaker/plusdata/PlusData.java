package datmaker.plusdata;

public class PlusData {
	byte[]  data = new byte[] {};

	public PlusData(byte[] data) {
		this.data = data;
	}

	public byte[] getData() {
		return this.data;
	}

	public int getLength() {
		return this.data.length;
	}
}
