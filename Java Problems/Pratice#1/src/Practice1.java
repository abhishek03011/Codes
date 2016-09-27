import java.util.Scanner;
public class Practice1 {

	
	public static void main(String[] args) 
	{
	
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter number to print pyramid");
		int n = sc.nextInt();
		int count = 1;
		for(int i = n ; i >=1; i--)
		{
			for( int j =1 ; j <= 2*i; j++)
			{
				System.out.print(" ");
			}
			
			for(int j = i; j <=n; j++)
			{
			System.out.print(j+" ");
			}
			
			for(int j = n-1; j >= i;j--)
			{
				System.out.print(j +" ");
			}
			count++;
			System.out.println();
		}
		
		
	}

}
