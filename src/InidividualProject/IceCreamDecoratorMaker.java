package InidividualProject;

public class IceCreamDecoratorMaker extends IceCreamDecorator {
	protected IceCream icecream; 
	protected Option option;
	
	public IceCreamDecoratorMaker(IceCream icecream, Option option) {
		this.icecream = icecream;
		description = option.getDescription();
		price = option.getPrice();
	}
	public String getDescription() {
		return icecream.getDescription() + " with " + description;
	}
	public double getPrice() {
		return icecream.getPrice() + price;
	}
}
