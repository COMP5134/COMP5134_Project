package InidividualProject;


import junit.framework.TestCase;

public class IceCreamDecoratorMakerTest extends TestCase {

	private IceCreamDecoratorMaker iceCreamDecoratorMaker;
	public void setUp()
	{
		iceCreamDecoratorMaker = new IceCreamDecoratorMaker(new IceCreamMaker(new Flavor("Chocolate", 20)), new Decorator("M&M", 5));
	}
	public void testIceCreamDecoratorMaker()
	{

		String expectedDescription = "Chocolate with M&M";
		double expectedPrice = 25;
		
		assertEquals(expectedDescription, iceCreamDecoratorMaker.getDescription());
		assertEquals(expectedPrice, iceCreamDecoratorMaker.getPrice());
		
		
		iceCreamDecoratorMaker = new IceCreamDecoratorMaker(iceCreamDecoratorMaker, new Decorator("Stawberry", 4));
		
		expectedDescription = "Chocolate with M&M with Stawberry";
		expectedPrice = 29;
		
		assertEquals(expectedDescription, iceCreamDecoratorMaker.getDescription());
		assertEquals(expectedPrice, iceCreamDecoratorMaker.getPrice());
		
	}

}
