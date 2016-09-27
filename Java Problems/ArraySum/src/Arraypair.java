
public class Arraypair {

	static void sum(int [] ar,int sum)
	{
		for(int i = 0;i<ar.length;i++)
		{
			for(int j= i+1; j<ar.length;j++)
			{
				if(ar [i] + ar[j] == sum )
				{
					System.out.println(" (" + ar[i] + ","+ar[j]+ ")" );
				}
			}
		}
	}
	
	public static void main(String[] args) 
	{

		int[]ar = {4, 6, 5, -10, 8, 5, 20};
		Arraypair.sum(ar, 10);
	}

}
