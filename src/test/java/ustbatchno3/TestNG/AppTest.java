package ustbatchno3.TestNG;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

	@Test
	public void employeetest() {
		Employee e = new Employee("sasi","fsd",22);
		assertEquals(e.getName(),"sasi");
		assertEquals(e.getAge(),22);
	}
	
}
