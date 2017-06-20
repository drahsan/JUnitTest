package JunitTest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ JadditionTest.class, JConcatenateTest.class,
		JmultiplicationTest.class })
public class AllTests {

}
