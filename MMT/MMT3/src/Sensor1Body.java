
public class Sensor1Body {
	byte[] type;
	byte[] s_dataNum;
	byte[] date;
	byte[] lat;
	byte[] lon;
	byte[] speed;
	byte[] position;
	byte[] mode;
	byte[] p_Accel;
	byte[][] fb_Accel;
	byte[][] lr_Accel;
	byte[][] ud_Accel;

	public Sensor1Body() {

	}

	public byte[] getType() {
		return type;
	}

	public void setType(byte[] type) {
		this.type = type;
	}

	public byte[] getS_dataNum() {
		return s_dataNum;
	}

	public void setS_dataNum(byte[] s_dataNum) {
		this.s_dataNum = s_dataNum;
	}

	public byte[] getDate() {
		return date;
	}

	public void setDate(byte[] date) {
		this.date = date;
	}

	public byte[] getLat() {
		return lat;
	}

	public void setLat(byte[] lat) {
		this.lat = lat;
	}

	public byte[] getLon() {
		return lon;
	}

	public void setLon(byte[] lon) {
		this.lon = lon;
	}

	public byte[] getSpeed() {
		return speed;
	}

	public void setSpeed(byte[] speed) {
		this.speed = speed;
	}

	public byte[] getPosition() {
		return position;
	}

	public void setPosition(byte[] position) {
		this.position = position;
	}

	public byte[] getMode() {
		return mode;
	}

	public void setMode(byte[] mode) {
		this.mode = mode;
	}

	public byte[] getP_Accel() {
		return p_Accel;
	}

	public void setP_Accel(byte[] p_Accel) {
		this.p_Accel = p_Accel;
	}

	public byte[][] getFb_Accel() {
		return fb_Accel;
	}

	public void setFb_Accel(byte[][] fb_Accel) {
		this.fb_Accel = fb_Accel;
	}

	public byte[][] getLr_Accel() {
		return lr_Accel;
	}

	public void setLr_Accel(byte[][] lr_Accel) {
		this.lr_Accel = lr_Accel;
	}

	public byte[][] getUd_Accel() {
		return ud_Accel;
	}

	public void setUd_Accel(byte[][] ud_Accel) {
		this.ud_Accel = ud_Accel;
	}

}
