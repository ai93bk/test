package datmaker.plusdata;

import javax.xml.bind.DatatypeConverter;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		TextInputStream tis = new TextInputStream();
		PlusData pd1 = new PlusData(DatatypeConverter.parseHexBinary(Integer.toHexString(Integer.valueOf(tis.readText()))));

		DatInputStream dis = new DatInputStream();
		PlusData pd4 = new PlusData(dis.readDat(args[0]));
		PlusData pd2 = new PlusData(DatatypeConverter.parseHexBinary(Integer.toHexString(Integer.valueOf((pd4.getLength()+2)/2))));
		PlusData pd3 = new PlusData(DatatypeConverter.parseHexBinary("30"));

		DatOutputStream dos = new DatOutputStream();
		dos.writeDat(pd1);
		dos.writeDat(pd2);
		dos.writeDat(pd3);
		dos.writeDat(pd4);
	}

}
