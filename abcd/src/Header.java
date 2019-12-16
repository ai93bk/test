
public class Header {
	byte[] startCoode;
	byte[] command;
	byte[] sequence1;
	byte[] sequence2;
	byte[] sequence3;
	byte[] terminalCat;
	byte[] ip;
	byte[] imei;
	byte[] dataSize;

	public Header() {

	}

	public byte[] getStartCoode() {
		return startCoode;
	}

	public void setStartCoode(byte[] startCoode) {
		this.startCoode = startCoode;
	}

	public byte[] getCommand() {
		return command;
	}

	public void setCommand(byte[] command) {
		this.command = command;
	}

	public byte[] getTerminalCat() {
		return terminalCat;
	}

	public void setTerminalCat(byte[] terminalCat) {
		this.terminalCat = terminalCat;
	}

	public byte[] getIp() {
		return ip;
	}

	public void setIp(byte[] ip) {
		this.ip = ip;
	}

	public byte[] getImei() {
		return imei;
	}

	public void setImei(byte[] imei) {
		this.imei = imei;
	}

	public byte[] getDataSize() {
		return dataSize;
	}

	public void setDataSize(byte[] dataSize) {
		this.dataSize = dataSize;
	}

	public byte[] getSequence1() {
		return sequence1;
	}

	public void setSequence1(byte[] sequence1) {
		this.sequence1 = sequence1;
	}

	public byte[] getSequence2() {
		return sequence2;
	}

	public void setSequence2(byte[] sequence2) {
		this.sequence2 = sequence2;
	}

	public byte[] getSequence3() {
		return sequence3;
	}

	public void setSequence3(byte[] sequence3) {
		this.sequence3 = sequence3;
	}

}
