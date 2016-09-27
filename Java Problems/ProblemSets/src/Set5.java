
public class Set5 {

	public Set5() {
		// TODO Auto-generated constructor stub
	}

	public static void array(int ar[],int input)
	{
		
		int sum = 0;
		
		for(int i = 0; i<ar.length;i++)
		{
			sum = ar[i];
		
			for(int j = i+1; j<ar.length;j++)
			{
				sum = sum + ar[j];
			if(sum == input)
			{
				for(int k = i;k<=j;k++)
				{
					System.out.print(ar[k]+ " ");
				}
			}
			
			else if(sum<input)
			{
				continue;
			}
			
			else if(sum>input)
			{
				break;
			}
			
			}
		}
	
		
		
	}
	
	public static void array1(int ar[],int input)
	{
		int sum = ar[0];
		int start = 0;
		
		for(int i = 1; i < ar.length;i++)
		{
			sum = sum + ar[i];
			
			while(sum>input && start<=i-1)
			{
				sum = sum - ar[start];
				start++;
			}
			
			if(input==sum)
			{
				for(int k = start ; k<=i;k++ )
				System.out.print(ar[k] + "  ");
			}
		}
	}
	
	public static void main(String[] args) {
		//array(new int[]{42, 15, 12, 8, 6, 32},27);
		array1(new int[]{42, 15, 12, 8, 6, 32},27);

	}

}
