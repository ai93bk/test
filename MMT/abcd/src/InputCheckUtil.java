import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.apache.log4j.Logger;

public class InputCheckUtil {
	Logger log = Logger.getLogger(Main.class);
	GetLogUtil glu = new GetLogUtil();
	String s = null;
	int rownum = 0;
	int colnum = 0;

	public InputCheckUtil(String str) {
		this.s = str;
	}

	public boolean CheckSensorData1(int col,int row) {
		this.colnum=col;
		this.rownum=row;
		if(col==1) {
			if(!(MeasureDate())) {
				return false;
			}
		}else if(col==2) {
			if(!(RegisterDate())) {
				return false;
			}
		}else if(col==3) {
			if(!(Command())) {
				return false;
			}
		}else if(col==4) {
			if(!(TerminalCategory())) {
				return false;
			}
		}else if(col==5) {
			if(!(IP())) {
				return false;
			}
		}else if(col==6) {
			if(!(IMEI())) {
				return false;
			}
		}else if(col==7) {
			if(!(Lat())) {
				return false;
			}
		}else if(col==8) {
			if(!(Lon())) {
				return false;
			}
		}else if(col==9) {
			if(!(Speed())) {
				return false;
			}
		}else if(col==10) {
			if(!(Position())) {
				return false;
			}
		}else if(col==11) {
			if(!(MeasureMode())) {
				return false;
			}
		}else if(col==12) {
			if(!(PositionAccel())) {
				return false;
			}
		}else if(col>=13 && col<=22) {
			if(!(FrontBehindAccel())) {
				return false;
			}
		}else if(col>=23 &&col <=32) {
			if(!(LeftRightAccel())) {
				return false;
			}
		}else if(col>=33 && col<=42) {
			if(!(UpDownAccel())) {
				return false;
			}
		}
		return true;
	}

	public boolean CheckSensorData2(int col,int row) {
		this.colnum=col;
		this.rownum=row;
		if(col==1) {
			if(!(MeasureDate())) {
				return false;
			}
		}else if(col==2) {
			if(!(RegisterDate())) {
				return false;
			}
		}else if(col==3) {
			if(!(Command())) {
				return false;
			}
		}else if(col==4) {
			if(!(TerminalCategory())) {
				return false;
			}
		}else if(col==5) {
			if(!(IP())) {
				return false;
			}
		}else if(col==6) {
			if(!(IMEI())) {
				return false;
			}
		}else if(col==7) {
			if(!(Lat())) {
				return false;
			}
		}else if(col==8) {
			if(!(Lon())) {
				return false;
			}
		}else if(col==9) {
			if(!(Speed())) {
				return false;
			}
		}else if(col==10) {
			if(!(Position())) {
				return false;
			}
		}else if(col==11) {
			if(!(MeasureMode())) {
				return false;
			}
		}else if(col>=13 && col<=22) {
			if(!(FrontBehindAccel())) {
				return false;
			}
		}else if(col>=23 &&col <=32) {
			if(!(LeftRightAccel())) {
				return false;
			}
		}else if(col>=33 && col<=42) {
			if(!(UpDownAccel())) {
				return false;
			}
		}else if(col>=43 && col <= 52) {
			if(!(AccelCorrection())) {
				return false;
			}
		}else if(col==53) {
			if(!(Quality())) {
				return false;
			}
		}else if(col== 54) {
			if(!(SatelliteNum())) {
				return false;
			}
		}else if(col== 55) {
			if(!(PDOP())) {
				return false;
			}
		}else if(col== 56) {
			if(!(Height())) {
				return false;
			}
		}else if(col == 57) {
			if(!(PositionCorrection())) {
				return false;
			}
		}else if(col == 58) {
			if(!(LatSector())) {
				return false;
			}
		}else if(col == 59) {
			if(!(LonSector())) {
				return false;
			}
		}
		return true;
	}

	boolean MeasureDate(){
		if((NullCheck()&&CountCheck(14,14)&&FormatCheck())) {
			return true;
		}
		return false;
	}
	boolean RegisterDate(){
		if((NullCheck()&&CountCheck(14,14)&&FormatCheck())) {
			return true;
		}
		return false;
	}
	boolean Command(){
		if((NullCheck()&&CountCheck(8,8))){
			if((FormatCheck(1,1,"1")||FormatCheck(1,1,"2"))){
				if(FormatCheck(2,6,"00000")) {
					if((FormatCheck(7,7,"1")||FormatCheck(7,7,"2")||FormatCheck(7,7,"3")||FormatCheck(7,7,"4")||FormatCheck(7,7,"5"))) {
						if((FormatCheck(8,8,"1")||FormatCheck(8,8,"2"))) {
							return true;
						}
					}
				}
			}
		}
		return false;
	}

	boolean TerminalCategory(){
		if((NullCheck()&&CountCheck(4,4)&&FormatCheck(0,9999))) {
			return true;
		}
		return false;
	}

	boolean IP(){
		if((NullCheck()&&CountCheck(12,12)&&FormatCheck(1,3,0,255)&&FormatCheck(4,6,0,255)&&FormatCheck(7,9,0,255)&&FormatCheck(10,12,0,255))) {
			return true;
		}
		return false;
	}

	boolean IMEI(){
		if((NullCheck()&&CountCheck(1,16)&&FormatCheck(0L,999999999999999L))) {
			return true;
		}
		return false;
	}
	boolean Lat(){
		if((NullCheck()&&CountCheck(8,8))) {
			return true;
		}
		return false;
	}
	boolean Lon(){
		if((NullCheck()&&CountCheck(9,9))) {
			return true;
		}
		return false;
	}
	boolean Speed(){
		if(!(NullCheck()&&CountCheck(1,4)&&FormatCheck(0,9999))) {
			return false;
		}
		return true;
	}
	boolean Position(){
		if(!(NullCheck()&&CountCheck(1,3)&&FormatCheck(0,359))) {
			return false;
		}
		return true;
	}
	boolean MeasureMode() {
		if((NullCheck()&&CountCheck(1,1)&&FormatCheck(1,4))) {
			return true;
		}
		return false;
	}
	boolean PositionAccel(){
		if((NullCheck()&&CountCheck(1,5))){
			if((FormatCheck(1,1,"-")&&(FormatCheck(2,this.s.length(),0,9999)))) {
				return true;
			}else if((FormatCheck(1,this.s.length(),0,9999))) {
				return true;
			}
		}
		return false;
	}
	boolean FrontBehindAccel(){
		if((NullCheck()&&CountCheck(1,6))){
			if((FormatCheck(1,1,"-")&&(FormatCheck(2,this.s.length(),0,29999)))) {
				return true;
			}else if((FormatCheck(1,this.s.length(),0,29999))) {
				return true;
			}
		}
		return false;
	}
	boolean LeftRightAccel(){
		if((NullCheck()&&CountCheck(1,6))){
			if((FormatCheck(1,1,"-")&&(FormatCheck(2,this.s.length(),0,29999)))) {
				return true;
			}else if((FormatCheck(1,this.s.length(),0,29999))) {
				return true;
			}
		}
		return false;
	}
	boolean UpDownAccel(){
		if((NullCheck()&&CountCheck(1,6))){
			if((FormatCheck(1,1,"-")&&(FormatCheck(2,this.s.length(),0,29999)))) {
				return true;
			}else if((FormatCheck(1,this.s.length(),0,29999))) {
				return true;
			}
		}
		return false;
	}
	boolean AccelCorrection(){
		if((NullCheck()&&CountCheck(1,1)&&FormatCheck(0,2))) {
					return true;
				}
		return false;
	}
	boolean Quality(){
		if((NullCheck()&&CountCheck(1,1)&&FormatCheck(0,2))) {
					return true;
				}
		return false;
	}
	boolean SatelliteNum(){
		if((NullCheck()&&CountCheck(1,2)&&FormatCheck(0,12))) {
					return true;
				}
		return false;
	}
	boolean PDOP(){
		if((NullCheck()&&CountCheck(1,3)&&FormatCheck(0,500))) {
					return true;
				}
		return false;
	}
	boolean Height(){
		if((NullCheck()&&CountCheck(1,6))) {
			if((FormatCheck(1,1,"-")&&(FormatCheck(2,this.s.length(),0,30000)))) {
				return true;
			}else if((FormatCheck(1,this.s.length(),0,30000))) {
				return true;
			}
			return false;
		}
		return false;
	}
	boolean PositionCorrection(){
		if((NullCheck()&&CountCheck(1,1)&&FormatCheck(0,2))) {
			return true;
		}
		return false;
	}
	boolean LatSector(){
		if((NullCheck()&&CountCheck(1,1))) {
			if((FormatCheck(1,1,"N")||FormatCheck(1,1,"S")||FormatCheck(1,1,"0"))) {
				return true;
			}
			return false;
		}
		return false;
	}
	boolean LonSector(){
		if((NullCheck()&&CountCheck(1,1))) {
			if((FormatCheck(1,1,"E")||FormatCheck(1,1,"W")||FormatCheck(1,1,"0"))) {
				return true;
			}
			return false;
		}
		return false;
	}


	boolean NullCheck() {
		if(this.s.equals("")) {
			log.warn(glu.getWarnLog(9)+"\t"+this.rownum+"行目 "+this.colnum+"列目");
			return false;
		}
		return true;
	}
	boolean CountCheck(int min,int max) {
		if(!(this.s.length()>=min&&this.s.length()<=max)) {
			log.warn(glu.getWarnLog(10)+this.rownum+"行目 "+this.colnum+"列目");
			return false;
		}
		return true;
	}
	boolean FormatCheck() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
		sdf.setLenient(false);
		try {
			sdf.parse(this.s);
			return true;
		}catch(ParseException e) {
			return false;
		}
	}
	boolean FormatCheck(int min,int max) {
		if(!(Integer.valueOf(this.s)>=min&&Integer.valueOf(this.s)<=max)) {
			return false;
		}
		return true;
	}
	boolean FormatCheck(long min,long max) {
		if(!(Long.valueOf(this.s)>=min&&Long.valueOf(this.s)<=max)) {
			return false;
		}
		return true;
	}
	boolean FormatCheck(int from,int to,String str) {
		if(!(this.s.substring(from-1,to).equals(str))) {
			return false;
		}
		return true;
	}
	boolean FormatCheck(int from,int to,int min,int max) {
		if(!(Integer.valueOf(this.s.substring(from-1,to))>=min&&Integer.valueOf(this.s.substring(from-1,to))<=max)) {
			return false;
		}
		return true;
	}
}
