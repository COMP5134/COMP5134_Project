package InidividualProject;


import junit.framework.TestCase;

public class FlavorTest extends TestCase {

	private Flavor flavor;
	public void setUp()
	{
		flavor = new Flavor("Chocolate", 20);
	}
	public void testFlavor()
	{
		double expectedPrice = 20;
		String expectedDescription = "Chocolate";

		assertEquals(expectedDescription, flavor.getDescription());
		assertEquals(expectedPrice, flavor.getPrice());
	}

}
