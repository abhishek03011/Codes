import java.util.ArrayList;
import java.util.Scanner;
public class ProductMain 
{
	
	static String user = "";
    static String value = "";
    static String choice = "";
    static String card = "";
    static String done = "";
    static int check = 0;
    static String checker = "";
    private static Scanner user_input;
    static ArrayList<Object> obj = new ArrayList<Object>() ;
	public ProductMain() {
		// TODO Auto-generated constructor stub
	}
public static void main(String[] args)
{
ArrayList<Product> productList = new ArrayList<Product>();

productList.add(new Product(1,"Apple","MacBook","Laptop",1000.00));
productList.add(new Product(2,"zara","Shirt","Clothes",1000.00));
productList.add(new Product(3,"Orilley","HeadFirst","Book",1000.00));
productList.add(new Product(4,"Phillips","microwave","Appliance",1000.00));

System.out.println("Please enter your choice");
System.out.println("1.Show all the prodcuts");
System.out.println("2.Enter to search a prodcut");
System.out.println("3.Check prodcut in cart");
System.out.println("Enter your choice");
user_input = new Scanner(System.in);
user = user_input.nextLine();
String ch = "yes";
while (ch.equals("yes"))
{
switch(user)
{
case "1":
	productList.forEach((temp)->{
		System.out.println(temp);
	});
	break;
case "2":
	System.out.println("Enter a prodcut name to search");
	value = user_input.nextLine();
	int x = -100;
for (Product p : productList)
{
 if (value.equals(p.getProductName()))
 {
	 System.out.println(p);
	 x = 0;
	 System.out.println("Would You Like to buy this item Enter Yes or No");
	 choice = user_input.nextLine();
	 
	 if(choice.equals("yes"))
	 {
		 System.out.println("Enter Card Details");
		 card = user_input.nextLine();
		 check = 1;
		 
	 }
	 else
	 {
		 System.out.println("Thank you for your interest");
	 }
	 if (check == 1)
	 {	
	System.out.println("Your Payment has been approved!!!");
	System.out.println("Your Details are as follows");
	System.out.println("Product Name: " + p.getProductName());
	System.out.println("Product Detail: " + p.getProductDetail());
	System.out.println("Product Code: " + p.GetProductCode());
	System.out.println("Product Price: " + p.getPrice());
	obj.add(p);
	 }
 }
}
if (x != 0)
{
	 System.out.println("Not Found");
}
break;
case "3":
	if (obj.isEmpty())
	{
	System.out.println("Cart is empty");
	}
	else
	{
		
		obj.forEach((xemp)->{
			System.out.println(xemp);
		});
		}
	break;
default:
	System.out.println("Enter a valid choice");	
}

System.out.println("Would you like to continue");
System.out.println("Enter yes or no");
ch = user_input.nextLine();
if(ch.equals("yes"))
{
	System.out.println("Enter your choice again!!!!!");
	System.out.println("Please enter your choice");
	System.out.println("1.Show all the prodcuts");
	System.out.println("2.Enter to search a prodcut");
	System.out.println("3.Check prodcut in cart");
	user = user_input.nextLine();
}
else
{
	System.out.println("Thank you!! See you again");
}

}

}	
}
