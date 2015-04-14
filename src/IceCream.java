package InidividualProject;

public class IceCream {
	
	Flavor flavor;
	Decorator decorator;
	
	public IceCream()
	{
		super();
		this.flavor = null;
		this.decorator = null;
	}
	
	public void addFlavor(Flavor flavor)
	{
		this.flavor = flavor;
	}
	
	
	public void addDecorator(Decorator decorator)
	{
		this.decorator = decorator;
	}
	
	public int getIceCreamPrice()
	{
		return flavor.getPrice() + decorator.getPrice();
	}
	

}
