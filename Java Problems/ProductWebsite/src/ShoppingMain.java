import java.util.*;
public class ShoppingMain {

	public ShoppingMain() {
		// TODO Auto-generated constructor stub
	}
public static void main(String... args)
{
	ArrayList<Shirt> prod = new ArrayList<Shirt>();
	prod.add(new Shirt("Zara","FullShirt","XL","red","Yes Two Day Shipping",10));
    prod.add(0,new Shirt("Nike","Tee-Shirt","XL","green","Blazing Green",20));
	

	prod.forEach((temp)->{
		System.out.println(temp);
	});
}
	
}
