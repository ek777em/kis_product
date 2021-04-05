public class Product
{
	private String name = "Coca Cola";
	private float price = 10;
	private boolean onStock = true;
	private int id;

	public Product(String name, float price, boolean onStock, int id)
	{
		this.name = name;
		this.price = price;
		this.onStock = onStock;
		this.id = id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public float getPrice()
	{
		return price;
	}

	public void setPrice(float price)
	{
		this.price = price;
	}

	public boolean getOnStock()
	{
		return onStock;
	}

	public void setOnStock(boolean onStock)
	{
		this.onStock = onStock;
	}
}
