package InidividualProject;


import junit.framework.TestCase;

public class IceCreamMakerTest extends TestCase {

	private IceCreamMaker iceCreamMaker;
	public void setUp()
	{
		iceCreamMaker = new IceCreamMaker();
	}
	public void testIceCreamMaker()
	{

		String expectedDescription = "";
		double expectedPrice = 0;
		
		assertEquals(expectedDescription, iceCreamMaker.getDescription());
		
		iceCreamMaker = new IceCreamMaker(new Flavor("Chocolate", 20));
		expectedDescription = "Chocolate";
		assertEquals(expectedDescription, iceCreamMaker.getDescription());
		
		expectedPrice = 20;
		assertEquals(expectedPrice, iceCreamMaker.getPrice());
		
	}

}
