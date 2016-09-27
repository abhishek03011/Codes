import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
public class HashMapTrial
{
	

	public static void main(String...args)
	{
		HashMap<Integer,String> a = new HashMap<Integer,String>();
		a.put(0, "Gnadmare");
		a.put(1, "wow");
		a.put(1, "TRIAL");
		
		for (Iterator<Entry<Integer, String>> iterator = a.entrySet().iterator(); iterator.hasNext();)
		{
			Entry<Integer, String> m = iterator.next();
			System.out.println(m.getKey()+"  "+m.getValue());
		}
		
		
	}

}
