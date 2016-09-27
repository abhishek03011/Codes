import java.util.HashMap;

public class SecondMethod {


	public boolean second(String s1, String s2)
	{
		s1 = s1.replaceAll("\\s", "").toLowerCase();
		s2 = s2.replaceAll("\\s", "").toLowerCase();
		boolean status = true;
		
		if(s1.length()!=s2.length())
		{
			status = false;
		}
			else
		{
			HashMap<Character,Integer> maps = new HashMap<Character,Integer>();
			
			for(int i =0 ; i<s1.length();i++)
			{
				char charasKey = s1.charAt(i);
				int count = 0;
				if(maps.containsKey(charasKey))
				{
					count = maps.get(charasKey);
				}
				maps.put(charasKey, ++count);
				
				charasKey = s2.charAt(i);
				
				count = 0;
				if(maps.containsKey(charasKey))
					count = maps.get(charasKey);
				
				maps.put(charasKey,--count);
				
			}
			for(int value: maps.values())
			{
				if(value != 0)
					status = false;
			}
		}
		
		
		if(status)
		{
			System.out.println("Are anagram ");
		}
		return status;
		
	}
}
