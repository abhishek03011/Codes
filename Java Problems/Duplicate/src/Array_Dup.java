import java.util.HashSet;
public class Array_Dup {

	static void check(String[] array)
	{
		HashSet<String> hash = new HashSet<String>();
		for(String element: array)
		{
			if(!hash.add(element))
				System.out.println("Duplicate element is : " + element);
		}
		
	}
	
	public static void main(String[] args) 
	{
		String[] array = {"abc", "def", "mno", "xyz", "pqr", "xyz", "def"};
		boolean status = false;
		for(int i = 0; i< array.length;i++)
			for(int j = i+1;j<array.length;j++)
				if ((array[i].equals(array[j])) && (i!=j))
					System.out.println("The duplicate element in array is : " + array[j]);
		
		Array_Dup.check(array);
	}
}
