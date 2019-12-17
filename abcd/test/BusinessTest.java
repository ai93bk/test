import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.IOException;

import org.junit.jupiter.api.Test;
import org.powermock.reflect.Whitebox;

class BusinessTest {
	Business b = new Business();

	void testReadCSV() throws IOException {
		Whitebox.setInternalState(b, "csv_path_list",b.gpu.getCSVPathList());
		b.readline=b.readCSV(1);
		assertEquals(b.readline.get(0).length,60);
	}

	void testToMoveDat() throws IOException {
		Whitebox.setInternalState(b, "csv_path_list",b.gpu.getCSVPathList());
		Whitebox.setInternalState(b, "errorfile",new int[b.gpu.getLength()]);
		b.readline=b.readCSV(1);
		b.setHead(1);
		b.setSensor1Body(1);
		b.toMoveDat("00", 0);
		b.writeSensor1(1);
		b.plusCheckCode();
		b.toMoveCSV("0");
	}

	/*
	 *
	 * 実行：エラーファイルの最新化
	 *
	 */
	Business b2 = new Business();
	void testExecute_main() throws IOException {
		Whitebox.setInternalState(b, "errorfile",new int[b.gpu.getLength()]);
		b.execute_main();
	}
	/*
	 *
	 * ファイル無し実行：gpuファイルリストの最新化
	 *
	 */
	void testExecute_main2() throws IOException {
		GetPathUtil.in_list=new File(Business.in_dir).listFiles();
		Whitebox.setInternalState(b, "gpu",new GetPathUtil());
		b.execute_main();
	}

	@Test
	void doing() throws IOException{
		//testReadCSV();
		testToMoveDat();
		testExecute_main();
		testExecute_main2();
	}
}

//Downloads
//https://github.com/powermock/powermock/wiki/Downloads
/*
@Test
public void testSample() throws Exception {
	//https://techblog.gmo-ap.jp/2017/03/13/mockでユニットテストを簡単にしよう%EF%BC%81/
	/* set up */
/*    SampleService sampleService = mock(SampleService.class);
    MockSample suv = new MockSample(sampleService);
    // Mockの動作を定義
    when(sampleService.isSomething(100)).thenReturn(true);

    /* execute */
/*    int actual = suv.validate(100);

    /* verify */
  /**  assertThat(actual, is(-1));

}

/*
@RunWith(PowerMockRunner.class)
@PrepareForTest({Business.class, Calendar.class})
public class FixSysDateUsingPowerMock1 {
	//https://qiita.com/OcchiNecchi/items/889515b33bc12655bcec
    Business b = new Business();

    @Before
    public void setUp(){
        setDatemock();
    }


    @Test
    public void test() {
        b.getCl();
    }

    /**
     * システム日付けを固定する
     * この方法だとミリ秒まで固定できない
     */
 /*   private static void setDatemock(){
        Calendar cal = Calendar.getInstance();
        //時間を2018年1月1日10時10分10秒にセットする(月は0が1月)
        cal.set(2018, 0,1,10,10,10);
        try {
            PowerMockito.whenNew(.class).withNoArguments().thenReturn(cal.getTime());
            when(new Date()).thenReturn(cal.getTime());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }*/