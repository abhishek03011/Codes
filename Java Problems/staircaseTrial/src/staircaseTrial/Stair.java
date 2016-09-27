package staircaseTrial;

import java.util.Scanner;

public class Stair {

	public static void main(String[] args) 
	{
		 Scanner in = new Scanner(System.in);
	     int n = in.nextInt();
	     int j = n;
	     for(int i = 1;i<=n;i++)
	     {
	    	 for( j = n ; j >i;j--)
	    	 {
	    		 System.out.print("#");
	    	 }
	    	for(int k = i;k<=j;k++)
	    	{
	    	 System.out.print("*");
	    	}
	    	 System.out.println();
	     }

	}

}
