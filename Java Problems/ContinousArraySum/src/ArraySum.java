import java.util.ArrayList;

public class ArraySum 
{
	ArrayList<Integer> list;

	ArraySum()
	{
		list = new ArrayList<Integer>();
	}
	
	public ArrayList<Integer> Summer(int[]ar, int number)
	{
		int sum = 0;
		for(int i = 0 ;i<ar.length;i++)
		{
			
			sum = ar[i];
			for(int j = i+1;j<ar.length;j++)
			{
				sum = sum+ar[j];	
				if(sum == number)
				{
					list.add(ar[j]);
					return list;
				}
				
			}
			
		}
		
		
		
		return list;
	}
	
	public static void main(String...args)
	{
		int []ar =  {12, 5, 31, 9, 21, 8};
		ArraySum a = new ArraySum();
		System.out.println(a.Summer(ar, 45));
	}
}
