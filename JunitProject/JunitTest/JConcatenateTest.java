package JunitTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class JConcatenateTest {

	@Test
	public void test() {
		JunitExample jtest=new JunitExample();
		String result=jtest.Concatenate("Software 1", "Construction");
		assertEquals("SoftwareConstruction", result);
		
	}

}
