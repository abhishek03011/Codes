import java.util.*;
public class CheckFibo {

	public CheckFibo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		    Integer i1 = 127;
		 
	        Integer i2 = 127;
	 
	        System.out.println(i1 == i2);
	 
	        Integer i3 = 128;
	 
	        Integer i4 = 128;
	 
	        System.out.println(i3 == i4);
		// TODO Auto-generated method stub
		System.out.println("Input number");
     @SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
     int input = sc.nextInt();
     int first = 0;
     int second = 1;
     int third = 0;
     
     while(third<input)
     {
    	 third = first + second;
    	 first = second;
    	 second = third;
     }
     
     if(third==input)
    	 System.out.println("The number is palindrome");
     else
    	 System.out.println("The number is not palindrome");
	}

	
	
}
