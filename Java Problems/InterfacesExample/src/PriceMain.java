
public class PriceMain {

	public static void main(String[] args) 
	{
	
		Apple   a = new Apple();
		Oranges b = new Oranges();
		
		System.out.println("The Apple Price "+ a.prices());
		System.out.println("The Apple Name "+ a.Names("Jhon"));
		System.out.println("The Oranges Price" + b.prices());
		System.out.println("The Oranges Price "+ b.Names("Chris"));

	}

}
