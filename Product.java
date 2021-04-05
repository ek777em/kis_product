public class Product
{
	private String name = "Coca Cola";
	private float price = 10;
	
	

	public Product(String name, float price)
	{
		
		this.name = name;
		this.price = price;
		
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}
	
}