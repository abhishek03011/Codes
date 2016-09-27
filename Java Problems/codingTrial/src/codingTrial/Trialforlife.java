package codingTrial;

public class Trialforlife {

	
	public void print(int n)
	{
		String x = "#";
		
		for(int i = n ;i>=1;i--)
		{
			for(int j=1 ;j<i;j++)
			{
				System.out.print(" ");
						
			}
			for(int h = n;h>=i;h--)
			{
			System.out.print(x);
			}
			System.out.println();
		}
		
	}
	
	public void printfun(int n)
	{
		for(int j = 0; j<n;j++)
		{		
		for(int i = j;i>=0;i--)
		{
			System.out.print("%");
		}
		
			System.out.println();
	}
	}
	public static void main(String[] args)
	{
		Trialforlife a = new Trialforlife();
		//a.print(6);
		//a.printfun(6);
		//a.printstarinquad(6);
	}



	public void printstarinquad(int n)
	{
	
		for(int i = n; i>=0;i--)
		{
			for(int j = 1;j<n;j++)
			{
				System.out.print(" ");
			}
			
			for(int k = n;k>=2*i-1;k--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}



}
