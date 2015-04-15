package InidividualProject;

import junit.framework.Test;
import junit.framework.TestSuite;


public class testSuite extends TestSuite
{
public static Test suite() {
TestSuite suite = new TestSuite("Sample Tests");

// Add one entry for each test class
// or test suite.
suite.addTestSuite(FlavorTest.class);
suite.addTestSuite(DecoratorTest.class);
suite.addTestSuite(IceCreamMakerTest.class);
suite.addTestSuite(IceCreamDecoratorMakerTest.class);
suite.addTestSuite(POSSystemTest.class);


return suite;
}
}