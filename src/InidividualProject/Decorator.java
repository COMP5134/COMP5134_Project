package InidividualProject;

public class Decorator implements Option {

	private String description; 
	private double price;
	
	public Decorator(String description, double price)
	{
		super();
		this.description = description;
		this.price = price;
	}
	
	public String getDescription() {
		return description;
	}

//	public void setDescription(String description) {
//		this.description = description;
//	}

//	public void setPrice(double price) {
//		this.price = price;
//	}

	public double getPrice() {
		return price;
	}

}
