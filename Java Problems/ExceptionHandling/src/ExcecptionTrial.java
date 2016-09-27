import java.io.FileReader;
import java.io.IOException;
import java.rmi.RemoteException;

import javax.naming.InsufficientResourcesException;

public class ExcecptionTrial 
{

	static int[] ar = new int[10];
	private static int b;

	public static void errors() throws RemoteException,InsufficientResourcesException
	{
		throw new RemoteException("Kick Ass");
	}
	public static void main(String...args) throws RemoteException,InsufficientResourcesException,IOException
	{
		 try(FileReader fr=new FileReader("/Users/abhishekkumar/Desktop/text.txt")){
	         char [] a = new char[50];
	         fr.read(a); // reads the contentto the array
	         for(char c : a)
	         System.out.println(c); //prints the characters one by one
	      }catch(IOException e){
	          e.printStackTrace();
	       }
		
		try
		{
		ExcecptionTrial.errors();
		}
		catch(RemoteException e)
		{
			System.out.println(e);
		}
		try{  
			    try{  
			     System.out.println("going to divide");  
			     setB(39/0);  
			    }catch(ArithmeticException e){System.out.println(e);}  
			   
			    try{  
			    int a[]=new int[5];  
			    a[5]=4;  
			    }catch(ArrayIndexOutOfBoundsException e){System.out.println(e);}  
			     
			    System.out.println("other statement");  
			  }
		 catch(Exception e)
		 {
			 
			 System.out.println("handeled");
		 }  
			  
			  System.out.println("normal flow..");  
			 
	}
	public static int getB() {
		return b;
	}
	public static void setB(int b) {
		ExcecptionTrial.b = b;
	}
	
}
