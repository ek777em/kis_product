public class Company
{
	private ArrayList<Product> products;
	private String name = "IBM";
	private LinkedList<Product> products;

	public Company(String name)
	{
		this.products = new ArrayList<>();
		this.name = name;
		this.products = new LinkedList<Product>();
	}
}
