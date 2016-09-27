import java.util.HashMap;
import java.util.Set;
public class Duplicate {

	public Duplicate() {
		// TODO Auto-generated constructor stub
	}

	static void check(String str)
	{
		HashMap<Character,Integer> map = new HashMap<Character,Integer>();
		
		str = str.replaceAll("\\s", "");
		char[] charstr = str.toCharArray();
		
		for(char c:charstr )
		{
			if(map.containsKey(c))
			{
				map.put(c,map.get(c)+1);
			}
			else
			{
			map.put(c, 1);
		}
		}
		Set<Character> set = map.keySet();
		System.out.println("Duplicates in the string are ");
		
		for(char stringer:set)
		{
			if(map.get(stringer)>1)
				System.out.println( stringer +" : "+ map.get(stringer));
		}
		
	}
	public static void main(String[] args) 
	{
	
		Duplicate.check("hello manchester united");
		

	}

}
