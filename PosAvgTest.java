import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PosAvgTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void indexOfStationTest() throws IOException 
	{
	
		PosAvg posAvg = new PosAvg("NRMN");
		int expected = 77;
		int reality = posAvg.indexOfStation(); 
		
		assertEquals(expected, reality);
	}

}
