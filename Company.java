public class Company
{
	private TreeSet<Product> products;
	private String name = "IBM";
	private LinkedList<Product> products;

	public Company(String name)
	{
		this.products = new TreeSet<>();
		this.name = name;
		this.products = new LinkedList<Product>();
	}
}
