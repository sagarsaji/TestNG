package ustbatchno3.TestNG;

import static org.testng.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.testng.annotations.Test;

public class Vishwasamudratest {

	
	@Test
	
	public void vishwatest() {
		vishwadetails v = new vishwadetails("Kochi",1800,1200);
		String city = "Kochi";
		//int expected = 1800;
		List<vishwadetails> ls = Arrays.asList(v);
		int ch = 1,sqft=1;
		assertEquals(Vishwasamudra.vishwa(ls,ch,city,sqft),1800);
		
//		ch = 2;
//		sqft=1;
//		expected = 1200;
//		assertEquals(expected,Vishwasamudra.vishwa(ls,ch,city,sqft));
	}
	
	
	
}
