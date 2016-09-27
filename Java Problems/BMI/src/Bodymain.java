import java.util.Scanner;

public class Bodymain {

	private static double weight;
	private static double height;
	static Scanner sc;

	public static void main(String...args)
	{
	sc  = new Scanner(System.in);
	System.out.println("Enter the height in inches");
	
	if(sc.hasNextDouble())
	{
	 height = sc.nextDouble();
	}
	else
	{
		System.out.println("Incorrect height value");
		height = 0.0;
	}
	
	
	System.out.println("Enter Weight in pounds");
	if(sc.hasNextDouble())
	{
		 weight = sc.nextDouble();
	}
	else
	{
		System.out.println("Incorrect weight value");
		weight = 0.0;
	}
	BodyMassIndex body = new BodyMassIndex(weight,height);
	body.display();
	}
}
