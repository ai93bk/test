import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.Calendar;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import static org.hamcrest.CoreMatchers.*;

class BusinessTest {
	@Test
	void testGetTime1() {
		fail("まだ実装されていません");
	}

	@Test
	void testGetTime2() {
		fail("まだ実装されていません");
	}

	@Test
	void testSetLog4j_conf() {
		fail("まだ実装されていません");
	}

	@Test
	void testReadCSV() {
		fail("まだ実装されていません");
	}

	@Test
	void testCheckRecordNum() {
		fail("まだ実装されていません");
	}

	@Test
	void testCheckColmunNum() {
		fail("まだ実装されていません");
	}

	@Test
	void testCheckSensorType() {
		fail("まだ実装されていません");
	}

	@Test
	void testCheckInputData() {
		fail("まだ実装されていません");
	}

	@Test
	void testToMoveCSV() {
		fail("まだ実装されていません");
	}

	@Test
	void testToMoveDat() {
		fail("まだ実装されていません");
	}

	@Test
	void testSetHead() {
		fail("まだ実装されていません");
	}

	@Test
	void testSetSensor1Body() {
		fail("まだ実装されていません");
	}

	@Test
	void testSetSensor2Body() {
		fail("まだ実装されていません");
	}

	@Test
	void testWriteSensor1() {
		fail("まだ実装されていません");
	}

	@Test
	void testWriteSensor2() {
		fail("まだ実装されていません");
	}

	@Test
	void testPlusCheckCode() {
		fail("まだ実装されていません");
	}

	@Test
	void testExecute_main() {
		fail("まだ実装されていません");
	}
}

//Downloads
//https://github.com/powermock/powermock/wiki/Downloads

@Test
public void testSample() throws Exception {
	//https://techblog.gmo-ap.jp/2017/03/13/mockでユニットテストを簡単にしよう%EF%BC%81/
	/* set up */
    SampleService sampleService = mock(SampleService.class);
    MockSample suv = new MockSample(sampleService);
    // Mockの動作を定義
    when(sampleService.isSomething(100)).thenReturn(true);

    /* execute */
    int actual = suv.validate(100);

    /* verify */
    assertThat(actual, is(-1));

}


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
    private static void setDatemock(){
        Calendar cal = Calendar.getInstance();
        //時間を2018年1月1日10時10分10秒にセットする(月は0が1月)
        cal.set(2018, 0,1,10,10,10);
        try {
            PowerMockito.whenNew(.class).withNoArguments().thenReturn(cal.getTime());
            when(new Date()).thenReturn(cal.getTime());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }