package sql.creator;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
	static int loop = 500000;
	static String sql1 = "insert into dg_upstream_req(seq_no,ip_addr.data_length,dte_term_type,tele_msg_id,serial_no,event_time,send_data,recv_time,last_send_time,deny_retry_flag) select '";
	static String sql2 = "',ip_addr,data_length,dte_term_type,tele_msg_id,serial_no,event_time,send_data,recv_time,last_send_time,deny_retry_flag from dg_upstream_req where seq_no = '09020020002220200930120206000000031';";
	static String seq_no1 = "09020020002220200930120206000";
	static int seq_no2 = 31;
	static String filename = "sqldump.sql";

	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter(filename,false);
			for(int i = 0; i < loop; i++) {
				fw.write(sql1 + seq_no1 + String.format("%06d",seq_no2) + sql2 + "\n");
				seq_no2++;
			}
			fw.close();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}
