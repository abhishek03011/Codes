import java.util.Scanner;
import java.util.*;
public class ArrayList 
{
private static ArrayList<Integer> array;
ArrayList<Integer> list = new ArrayList<Integer>();  
	 private static Scanner input;
	public ArrayList() 
	{
	array = new ArrayList();
	}

	public static void fillarray(int length)
	{
		for(int i = 0; i<10;i++)
		{
		  
		}
	}
	public static void main (String...args)
	{
		int length = 0;
		System.out.println("Input");
		input = new Scanner(System.in);
		while(input.hasNextInt())
		{
		fillarray(length);
		}
		
	}
}
