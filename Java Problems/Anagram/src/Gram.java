import java.util.Arrays;

public class Gram {

static boolean anagram(String s1, String s2)
{
	String first = s1.replaceAll("\\s","");
	String second = s2.replaceAll("\\s", "");

	if(first.length()==second.length())
	{
		char[] str1 = first.toLowerCase().toCharArray();
		char[] str2 = second.toLowerCase().toCharArray();
		
		Arrays.sort(str1);
		Arrays.sort(str2);
		
		if(Arrays.equals(str1, str2))
		{
			 System.out.println(first+ " are anagaram " + second);
			return true;
			
		}
		
	}
	return false;
	
   
	
}
	public static void main(String[] args) 
	{
	//System.out.println(Gram.anagram("peek", "keep"));
	SecondMethod method = new SecondMethod();
	System.out.println(method.second("Mother In Law", "Hitler Woman"));
	}

	
	
}
