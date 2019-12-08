
public class Header {
	byte[] startCoode;
	byte[] command;
	byte[] sequence;
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

	public byte[] getSequence() {
		return sequence;
	}

	public void setSequence(byte[] sequence) {
		this.sequence = sequence;
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

}
