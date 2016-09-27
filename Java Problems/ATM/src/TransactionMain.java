
import java.util.ArrayList;
import java.util.Scanner;

public class TransactionMain 
{

	AtmImplementer atm;
	private static Scanner sc;
	static ArrayList<TransactionMain>array1;
    
	public TransactionMain(AtmImplementer atm) 
	{
		this.atm = atm;
        atm.register(atm);
	}
	
	public static void main(String...args)
	{
		array1 = new ArrayList<TransactionMain>();		
		CustomerImplementer customer1 = new CustomerImplementer("baljeet",28,"2000 Bay area Blvd.");
		AtmImplementer one = new AtmImplementer(customer1);
		TransactionMain trans = new TransactionMain(one);
		one.deposit(1000);
		System.out.println(one.balanceEnquiry());
		System.out.println(one);
		array1.add(trans);
	   
		CustomerImplementer customer2 = new CustomerImplementer("abhishek",30,"3000 Bay area Blvd.");
		AtmImplementer two = new AtmImplementer(customer2);
		TransactionMain trans2 = new TransactionMain(two);
		array1.add(trans2);
		for(TransactionMain t:array1)
		{
			System.out.println(t);
			
		}
		
	}
	public String toString() {
		return "TransactionMain [atm=" + atm + "]";
	}


}
