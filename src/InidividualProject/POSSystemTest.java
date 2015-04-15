package InidividualProject;


import junit.framework.TestCase;

public class POSSystemTest extends TestCase {

	private POSSystem pos;
	public void setUp()
	{
		pos = new POSSystem();
	}
	public void testPOSSystem()
	{

		POSSystem pos = new POSSystem();
		
		pos.addFlavorButton("Chocolate", 20);
		
		pos.addDecoratorButton("M&M", 5);
		
		pos.setLayout();
		pos.setAdminLayout();
		
	}

}
