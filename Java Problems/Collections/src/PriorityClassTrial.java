
import java.util.PriorityQueue;
import java.util.Iterator;

public class PriorityClassTrial {

	public static void main(String...args)
	{
	PriorityQueue<String> a = new PriorityQueue<String>();	
	a.add("One");
	a.add("Two");
	a.add("Three");
	a.add("Wow");
	
	System.out.println("Head is : "+ a.element());
	System.out.println("Head is : "+ a.peek());
	System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
	Iterator<String> al = a.iterator();
	while(al.hasNext())
	{
		System.out.println(al.next());
	}
	
	System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
	
	a.remove();
	a.poll();
	
	Iterator<String> bl = a.iterator();
	while(bl.hasNext())
	{
		System.out.println(bl.next());
	}
	
	}
	
	
	

}
