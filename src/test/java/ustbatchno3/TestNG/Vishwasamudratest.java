package ustbatchno3.TestNG;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import static org.testng.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.testng.annotations.Test;

@Test
public class Vishwasamudratest {
	public void vishwatest() {
		int expected = 1800;

		vishwadetails v = new vishwadetails("Kochi", 1800, 1200);
		String city = "kochi";
		List<vishwadetails> lss = Arrays.asList(v);
		int ch = 1, sq = 1;
		int actual = Vishwasamudra.vishwa(lss, ch, city, sq);
		assertEquals(expected, actual);
		ch = 2;
		expected = 1200;
		assertEquals(expected, Vishwasamudra.vishwa(lss, ch, city, sq));

	}

}