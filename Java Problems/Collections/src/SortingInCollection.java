import java.util.*;
public class SortingInCollection 
{

	public static void main(String[] args) 
	{
	ArrayList<Integer> al = new ArrayList<Integer>();
	al.add(10);
	al.add(20);
	al.add(3);
	al.add(12);
	
	Collections.sort(al);
	Iterator<Integer> a = al.iterator();
	while(a.hasNext())
	{
		System.out.println(a.next());
	}

	}

}
