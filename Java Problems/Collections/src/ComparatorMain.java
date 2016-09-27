
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class ComparatorMain
{

	public static void main(String... args)
	{
		
		String[] ar = {"a","B","C","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v",
				"%%","a","B","C","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v",
				"%%%","a","B","C","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v",
		};
		
		ArrayList<String> list1 = new ArrayList<String>(Arrays.asList(ar)); 
		
		Iterator<String> h = list1.iterator();
		while(h.hasNext())
		{
			System.out.println(h.next());
		}
		
		ArrayList<String> list2 = new ArrayList<String>();
		for(int i =0;i<7;i++ )
		{
			list2.add(list1.remove(0));
		}
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^");
		Iterator<String> two = list2.iterator();
		while(two.hasNext())
		{
			System.out.println(two.next());
		}
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		ComparatorInterface a = new ComparatorInterface(new Student(30,"Aryan",20));
		ComparatorInterface b = new ComparatorInterface(new Student(20,"raj",25));
		ComparatorInterface c = new ComparatorInterface(new Student(25,"Sharma",30));
		ArrayList<ComparatorInterface> al = new ArrayList<ComparatorInterface>();
		
		al.add(a);
		al.add(b);
		al.add(c);
		
		
		
		
		Iterator<ComparatorInterface> as = al.iterator();
		while(as.hasNext())
		{
			System.out.println(as.next());
		}
		
		
		
	}
	
	
}
