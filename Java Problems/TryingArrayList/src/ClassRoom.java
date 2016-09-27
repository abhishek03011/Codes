import java.util.*;
public class ClassRoom 
{
	private int a;
	private int b;
	private Scanner da;

	public ClassRoom() 
	{
		a = 10;
		b = 20;
	}
	
	public ClassRoom(int a , int b)
	{
	this.a = a;
	this.b = b;
	}

	public int data()
	{
		int sum = 0;
		System.out.println("Enter the number");
		da = new Scanner (System.in);
		if(da.hasNextInt())
		{
		 sum += da.nextInt() + a + b; 
		}
		else
		{
			da = new Scanner(System.in);
		}
		return sum;
	}
	
	public static void main(String[] args)
	{
		ClassRoom duck = new ClassRoom(1,1);
		int x = duck.data();
		System.out.print("The sum is,");
		System.out.println(x);
	}
	
	
}
