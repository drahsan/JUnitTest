package JunitTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class JmultiplicationTest {
//test
	@Test
	public void test() {
		JunitExample jtest=new JunitExample();
		int result=jtest.multiplication(30,70);
		assertEquals(2100, result);
	}

}
