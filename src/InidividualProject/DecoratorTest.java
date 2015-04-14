package InidividualProject;


import junit.framework.TestCase;

public class DecoratorTest extends TestCase {

	private Decorator decorator;
	public void setUp()
	{
		decorator = new Decorator("M&M", 5);
	}
	public void testFlavor()
	{
		double expectedPrice = 5;
		String expectedDescription = "M&M";

		assertEquals(expectedDescription, decorator.getDescription());
		assertEquals(expectedPrice, decorator.getPrice());
	}

}
