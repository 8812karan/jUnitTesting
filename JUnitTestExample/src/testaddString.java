import static org.junit.Assert.*;

import org.junit.Test;


public class testaddString {

	@Test
	public void test() {
		jUnitTesting junitstring = new jUnitTesting(); 
		String result = junitstring.addStrings("capstone", "project"); 
		assertEquals("capstoneproject", result); 

	}

}
