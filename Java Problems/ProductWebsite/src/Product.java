
public abstract class Product
{

	private String color; 

	public String getColor()
	{
		return color;
	}

	public void setColor(String color) 
	{
		this.color = color;
	}

	
	public Product(String color) 
	{
		this.color = color;
	}

	public abstract String specifications();	
}
