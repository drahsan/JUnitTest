package JunitTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class JadditionTest {

	@Test
	public void test() {
		JunitExample jtest=new JunitExample();
		int result=jtest.addition(30,70);
		assertEquals(100, result);
	}

}
