
public class Second 
{
	public Second(int[] ar)
	{
		int largest = 0, secondlargest = 0;
		if(ar[0]>ar[1])
		{
			largest = ar[0];
			secondlargest = ar[1];
		}
		else
		{
			largest = ar[1];
			secondlargest = ar[0];
		}
		
		for(int i = 2; i< ar.length;i++)
		{
			if(ar[i]>largest)
			{
				secondlargest = largest;
				largest = ar[i];
			}
			else if(ar[i]<largest && ar[i]>secondlargest)
			{
				secondlargest = ar[i];
			}
		}
		System.out.println("Second Largest " + secondlargest);
	}
	
public static void main(String...args)
{
	int[] ar = {1,2,3,4,5,6,7,8};
	
	Second sec = new Second(ar);
}
}
