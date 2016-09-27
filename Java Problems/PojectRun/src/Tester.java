import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeMap;

public class Tester {

	public Tester() {
		
	}

	private static int checkPalindrome(String str) {
	    String s1 = "";
	    int N = str.length(), count = 0;
	    Set<String> palindromeArray = new HashSet<String>();
	    //  check all the possible combinations
	    TreeMap<Integer,String> hm=new TreeMap<Integer,String>();  
	    
	    
	    
	    for (int i = 2; i <= N; i++) {
	        for (int j = 0; j <= N; j++) {
	            int k = i + j - 1;
	            if (k >= N)
	                continue;
	            s1 = str.substring(j, i + j);
	            if (s1.equals(new StringBuilder(s1).reverse().toString())) {
	                palindromeArray.add(s1);
	            }
	        }

	    }
	    
	    return palindromeArray.size() + N ;
	   
	}
	
	
	public static String withoutX2(String str) 
	{
		if(str.length()>1)
		{
		String[] a = str.split("");
		String p = str;
		String z = str;
		if(a[1].equals("x") && a[0].equals("x")){
			 z =  p.substring(2);  
			 System.out.println("1 if " + z);
		}
		else if(a[1].equals("x")){
		     z = p.substring(0,1)+p.substring(2);
		     System.out.println("2 if " + z);
		}
		     
		     else if (a[0].equals("x") && str.length()>1){
			z = p.substring(1);
			 System.out.println("3 if " + z);
		     }
		else if(a[0].equals("x") && str.length()==1){
			z="";
			 System.out.println("4 if " + z);
		}
			 else{
			z = str;
			 System.out.println("5 if " + z);
			 }
	return z;
		}
		else
			return null;
	}

	public static String withoutX(String str) 
	{

	  if(str.startsWith("x") && str.endsWith("x"))
			  return  str.substring(1, str.length()-1);
	  else if (str.startsWith("x") && !str.endsWith("x"))
		  return str.substring(1,str.length());
	  else if (str.endsWith("x") && !str.startsWith("x"))
		  return str.substring(0,str.length()-1);
	  
	  return str;
	  
	}

	public static String startWord(String str, String word) 
	{
	if(str.length()>0 && word.length()> 0 && word.substring(0,word.length()).equals(str.substring(0,word.length())))
			return word;
	else if(str.length()>0 && word.length()> 0 && word.substring(1,word.length()).equals(str.substring(1,word.length())))
		return "h"+word.substring(1,word.length());
	else if(str.length()>0 && word.length()==1)
		return "h";
	
	return "";
	  
	}

	public static String deFront(String str) {    
		  
		char[] a = str.toCharArray();
		for(char b:a)
		{
			System.out.println(b);
		}
		return "";
	}

	
	public static void main(String[] args) 
	{
	
//String b = Tester.withoutX2("aahi");
//String c = Tester.withoutX("ssxssx");

		//String D = Tester.startWord("hippo", "i");System.out.println(D);
String E = Tester.deFront("Hello");
	
	}

}
