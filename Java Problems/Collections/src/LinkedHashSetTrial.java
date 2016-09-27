import java.util.*;
public class LinkedHashSetTrial {

	public static void main(String[] args) 
	{
		LinkedHashSet<String> a = new LinkedHashSet<String>();
		a.add("ballu");
		a.add("Gandu");
		a.add("yoyo");
		a.add("yoyo1");
		
		for(String b : a)
		{
			System.out.println(b);
		}
	}

}
