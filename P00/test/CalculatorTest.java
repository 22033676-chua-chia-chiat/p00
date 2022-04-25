import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		//fail("Not yet implemented");
	}
	
	
	@Test
	public void testAdd() {
		// Arrange
		int a = 4321;
	    int b = 1234;
	    Calculator cal = new Calculator();
	        
	    //Act
	    int actual = cal.add(a, b); 
	        
	    //Assert
	    int expected = 5555;
	    assertEquals (expected, actual);
	}
	
	
	@Test
	public void testsubtract() {
		// Arrange
		int a = 4321;
	    int b = 1234;
	    Calculator cal = new Calculator();
	        
	    //Act
	    int actual = cal.subtract(a, b); 
	        
	    //Assert
	    int expected = 3087;
	    assertEquals (expected, actual);
	}
	
	@Test
	public void testmult() {
		// Arrange
		int a = 4321;
	    int b = 2;
	    Calculator cal = new Calculator();
	        
	    //Act
	    int actual = cal.multiply(a, b); 
	        
	    //Assert
	    int expected = 8642;
	    assertEquals (expected, actual);
	}

}
