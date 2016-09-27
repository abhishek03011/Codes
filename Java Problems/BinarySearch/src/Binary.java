import java.util.*;
public class Binary 
{

	private static int[]ar = new int[16];;
	
	public Binary() 
	{		
		for(int i = 0; i<ar.length;i++)
		{
		this.ar[i] = (int) (Math.random()*10);
		}
	}

	public int binarySearch(int item)
	{
		int low,high,mid;
		low = 0 ; high = this.ar.length-1;
		while(low<=high)
		{
			mid = low + (high-low)/2;
			if(this.ar[mid] == item)
				return mid;
			else if(ar[mid]< item)
				low = mid+1;
			else
				high = mid-1;	
		}
		return -1;
	}
	
	public int Recursive(int low, int high, int data)
	{
		int mid = low + (high+low)/2;
		
		if(ar[mid]== data)
			return mid;
		else if (ar[mid] <data) 
			return Recursive(mid+1,high,data);
		else return Recursive(low,mid-1,data);
		
	}
	public static void main(String[] args)
	{
	Binary a = new Binary();
 for(int i =0 ; i< ar.length;i++)
	 System.out.println(ar[i]);
 System.out.println("yaayaya");
 System.out.println(a.Recursive(0,ar.length-1,5));
	}

}
