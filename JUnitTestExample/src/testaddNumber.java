import static org.junit.Assert.*;

import org.junit.Test;


public class testaddNumber {

	@Test
	public void test() {
		jUnitTesting jUnit = new jUnitTesting ();
		int result = jUnit.addNumbers(100, 200); 
		assertEquals (300, result); 
	}

}
