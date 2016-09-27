import java.util.*;
public class StringTest {

	String x = "Parrot";
	
	String b = "Pa  rrot";
	public StringTest() {
		// TODO Auto-generated constructor stub
	}

	public void test()
	{
		
		ArrayList<Integer> array = new ArrayList<Integer>();
		String b = "";
		int counter = 0;
		String c ="";
		String a  = "asdsadsadfasfasabhisheksdasdaabhishekadasdsadasdabhishek";
		
		for(int i = 0 ;i<a.length()-7;i++)
		{
			if(a.substring(i,i+8 ).equals("abhishek"))
			{
				b = a.substring(i,i+8);
			for(int j = 0;j<b.length();j++)
			{
		    c = b.substring(0, 1);
		    c = c.toUpperCase();
		    a = c + b.substring(1, 8);
			}
				System.out.println(a);
				counter ++;
				array.add(i);
			
			}
			
				
			
			
			
		}
	System.out.println(counter);
	for(int temp:array)
	{
		System.out.println(temp);
		
	}
	}
	

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		StringTest ac = new StringTest();
		ac.test();

	}

}
