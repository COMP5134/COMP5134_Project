package InidividualProject;

public class IceCreamMaker extends IceCream {
	
	protected Option option;
	
	public IceCreamMaker() {
		description = "";
	}
	
	public IceCreamMaker(Option option) {
		description = option.getDescription();
		price = option.getPrice();
	}
	public double getPrice() {
			return price;
	}
}
