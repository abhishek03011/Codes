/* Program name: IntArrayTest.java
 * Author: Abhishek Kumar
 * Credit: Dr.Andrew Yang
 * Date: June 13, 2016
 */
 
/* Description: This is a test program for implementing an integer array.
 * A user-defined constructor, IntArrayTest( ), is used to assign data to A[].
 */
 
/* Compilation command: javac IntArrayTest.java
 * Execution command: java IntArrayTest -22
 */
public class IntArrayTest {

	    private final int SIZE = 15;
	    private int A[] = new int[SIZE]; // The array needs to be initialized
	    private int currentPosition = 0;
	 
	    // methods
	    public IntArrayTest( ) {
	        //System.out.println("length: " + A.length);
	        for (; currentPosition < A.length; currentPosition++) 
	        {
	            A[currentPosition] = (10 + currentPosition) % 5;
	        }
	        //return; // do not place a return here
	    }
	 
	    public double average()
	    {
	    	int sum = 0;
	    	for(int i = 0; i <A.length;i++)
	    	{
	    		sum = sum + A[i];
	    		System.out.println(A[i] +" was added: current sum = "+sum+".");
	    	}
	    	return sum/A.length;
	    }
	    public int search(int key) {
	    	int counter = 0;
	        for (int i = 0; i < A.length; i++) 
	        {
	        	
	            System.out.println(A[i]);
	            if (A[i] == key) 
	            {
	                counter++;;
	            }
	        } //for
	        if(counter != 0)
	        {
	        	return counter;
	        }
	        else
	        {
	        return -1;
	        }
	    } //search( )
	 
	    // main( )
	    public static void main(String args[]) {
	        IntArrayTest ar = new IntArrayTest( );
	        int key = Integer.parseInt(args[0]);
	        //the value to search for, input from command line
	 
	        System.out.println("My name is Abhishek.");
	        int result = ar.search(key);
	      
	        System.out.println("The average is "+ ar.average());
	    
	    } //main( )
	} // IntArrayTest class
