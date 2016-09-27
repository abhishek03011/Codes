import java.util.HashMap;
import java.util.Map;
public class HasHtableTrial {

	public static void main(String...args)
	{
	HashMap<Integer,String> al = new HashMap<Integer,String>();
	
	al.put(1, null);
	al.put(4, "abhishek");
	al.put(2,"ShuldGetAJob");
	al.put(3,"By the end of this month");
	
	for(Map.Entry m: al.entrySet())
	{
		System.out.println(m.getKey()+" "+m.getValue());
	}
			
		
		
		
	}

}
