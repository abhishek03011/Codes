package baljeetAss6;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Assg6<AnyType extends Comparable<? super AnyType>>
{
	private static final int CUTOFF = 10;
	public static Scanner scanner = new Scanner(System.in);
	public static Scanner getValues = new Scanner(System.in);

	public static void main(String[] args) 
	{
		System.out.println("1. Insertion Sort");
		System.out.println("2. Shell Sort");
		System.out.println("3. Merge Sort");
		System.out.println("4. Quick Sort");
		System.out.println("5. Quit");
		System.out.print("Enter choice: ");
		int opt = scanner.nextInt();
		int userChoice = scanner.nextInt();
		
		if(userChoice == 5)
		{
			System.out.println("Thank you. Bye...");
			scanner.close();
			getValues.close();
			System.exit(0);
		}
		
		System.out.print("Enter the number of integers to be sorted: ");
		int numberOfItems = scanner.nextInt();
		
		System.out.println("Enter the " + numberOfItems + " integers: ");
		String stringIntegerValues = getValues.nextLine();				
		String[] stringIntegerArray = stringIntegerValues.split(" ");

		int[] intIntegerArray = new int[stringIntegerArray.length];
		for(int i=0; i<=stringIntegerArray.length-1; i++)
		{
			intIntegerArray[i] = Integer.parseInt(stringIntegerArray[i]);
		}
		
		switch(userChoice)
		{
		case 1: //Insertion Sort
			displayDuplicates(intIntegerArray);
			intIntegerArray = Arrays.stream(intIntegerArray).distinct().toArray();
			insertionSort(intIntegerArray);
			break;
		case 2: //Shell Sort
			displayDuplicates(intIntegerArray);
			intIntegerArray = Arrays.stream(intIntegerArray).distinct().toArray();
			shellSort(intIntegerArray);
			break;
		case 3: //Merge Sort
			displayDuplicates(intIntegerArray);
			intIntegerArray = Arrays.stream(intIntegerArray).distinct().toArray();
			mergeSortAlgorithm(intIntegerArray);
			break;
		case 4: //Quick Sort
			displayDuplicates(intIntegerArray);
			intIntegerArray = Arrays.stream(intIntegerArray).distinct().toArray();
			quickSort(intIntegerArray);
			break;
		}		
	}
	
	public static int[] removeDuplicates(int[] anIntegerArray) 
	{
	    return Arrays.stream(anIntegerArray).distinct().toArray();
	}
	
	public static void displayDuplicates(int[] anIntegerArray) 
    {	
		Set<Integer> set = new HashSet<Integer>();
        
        for(int i = 0; i < anIntegerArray.length ; i++) 
        {
            //If same integer is already present then add method will return FALSE 
            if(set.add(anIntegerArray[i]) == false) 
            {
                System.out.println("Duplicate element found : " + anIntegerArray[i]);
            }
        }
    }
     
	
	public static void insertionSort(int[] integerArray)
	{
		int[] arrayToBeSorted = integerArray.clone();
		
		for( int i=1; i<arrayToBeSorted.length; i++ )
		{
			Integer tmp = arrayToBeSorted[i];
			int j=i;
					
			for(; j>0 && tmp.compareTo(arrayToBeSorted[j-1])<0; j--)
				arrayToBeSorted[j] = arrayToBeSorted[j-1];
			arrayToBeSorted[j] = tmp;
		 }
		System.out.print("The resulting array is: ");
		for(int i:arrayToBeSorted)
		{
            System.out.print(i);
            System.out.print(" ");
        }
		
	}	

	public static void shellSort(int[] integerArray)
	{
		int[] arrayToBeSorted = integerArray.clone();
		for(int gap=arrayToBeSorted.length/2; gap>0; gap=gap==2 ? 1 : (int) (gap/2.2))
		for(int i=gap; i<arrayToBeSorted.length; i++ )
		{
			Integer tmp = arrayToBeSorted[ i ];
			int j = i;
		
			for( ; j>=gap&&tmp.compareTo(arrayToBeSorted[j-gap] )<0; j-=gap)
				arrayToBeSorted[ j ] = arrayToBeSorted[ j - gap ];
			arrayToBeSorted[ j ] = tmp;
		}
		
		System.out.print("The resulting array is: ");
		for(int i:arrayToBeSorted)
		{
            System.out.print(i);
            System.out.print(" ");
        }		
	}
	
	public static <AnyType extends Comparable<? super AnyType>> void mergeSortAlgorithm(int[] integerArray)
	{
		int[] arrayToBeSorted1 = integerArray.clone();
		Integer [] arrayToBeSorted = new Integer[arrayToBeSorted1.length];
		Integer[] tmpArray = new Integer[arrayToBeSorted.length];
		mergeSort(arrayToBeSorted, tmpArray, 0, arrayToBeSorted.length - 1);
	}

	 /**
	 * Internal method that makes recursive calls.
	 * @param a an array of Comparable items.
	 * @param tmpArray an array to place the merged result.
	 * @param left the left-most index of the subarray.
	 * @param right the right-most index of the subarray.
	 */
	 private static <AnyType extends Comparable<? super AnyType>> void mergeSort(Integer[] a, Integer[] tmpArray, int left, int right)
	 {
		 if( left < right )
		 {
			 // Here you would assign and fill oldArray

			 Integer[] newArray = new Integer[a.length];
			 int i = 0;
			 for (int value : a) {
			     newArray[i++] = Integer.valueOf(value);
			 }
			 int center = ( left + right ) / 2;
			 mergeSort( a, tmpArray, left, center );
			 mergeSort( a, tmpArray, center + 1, right );
			 merge(newArray, tmpArray, left, center + 1, right );
		 }
	 }
	 
	 /**
	 * Internal method that merges two sorted halves of a subarray.
	 * @param a an array of Comparable items.
	 * @param tmpArray an array to place the merged result.
	 * @param leftPos the left-most index of the subarray.
	 * @param rightPos the index of the start of the second half.
	 * @param rightEnd the right-most index of the subarray.
	 */
	 private static <AnyType extends Comparable<? super AnyType>> void merge(Integer[] a, Integer[] tmpArray, Integer leftPos, int rightPos, int rightEnd)
	 {
		 int leftEnd = rightPos - 1;
		 int tmpPos = leftPos;
		 int numElements = rightEnd - leftPos + 1;

		 // Main loop
		 while( leftPos <= leftEnd && rightPos <= rightEnd )
			 if( a[leftPos].compareTo(a[rightPos]) <= 0 )
				 tmpArray[ tmpPos++ ] = a[ leftPos++ ];
			 else
				 tmpArray[ tmpPos++ ] = a[ rightPos++ ];

		 while( leftPos <= leftEnd ) // Copy rest of first half
			 tmpArray[ tmpPos++ ] = a[ leftPos++ ];

		 while( rightPos <= rightEnd ) // Copy rest of right half
			 tmpArray[ tmpPos++ ] = a[ rightPos++ ];

		 // Copy tmpArray back
		 for( int i = 0; i < numElements; i++, rightEnd-- )
			 a[ rightEnd ] = tmpArray[ rightEnd ];
		 
		 System.out.print("The resulting array is: ");
		 for(int i:a)
			{
	            System.out.print(i);
	            System.out.print(" ");
	        }	
	 }
	
	public static void quickSort(int[] integerArray)
	{
		/**
		* Quicksort algorithm (driver)
		*/
		//int[] arrayToBeSorted = integerArray.clone();

		Integer[] arrayToBeSorted = new Integer[integerArray.length];
		int i = 0;
		for (int value : integerArray) {
			arrayToBeSorted[i++] = Integer.valueOf(value);
		}
		quickSort(arrayToBeSorted, 0, arrayToBeSorted.length - 1 );
	}

	/**
	* Internal quicksort method that makes recursive calls.
	* Uses median-of-three partitioning and a cutoff.
	*/
	private static <AnyType extends Comparable<? super AnyType>> void quickSort( Integer[] a, int low, int high )
	{
		if( low + CUTOFF > high )
			insertionSort(a, low, high );
		else
		{ // Sort low, middle, high
			int middle = ( low + high ) / 2;
			if( a[ middle ].compareTo( a[ low ] ) < 0 )
				swapReferences( a, low, middle );
			if( a[ high ].compareTo( a[ low ] ) < 0 )
				swapReferences( a, low, high );
			if( a[ high ].compareTo( a[ middle ] ) < 0 )
				swapReferences( a, middle, high );

			// Place pivot at position high - 1
			swapReferences( a, middle, high - 1 );
			Integer pivot = a[high-1];

			// Begin partitioning
			int i, j;
			for( i = low, j = high - 1; ; )
			{
				while( a[ ++i ].compareTo( pivot ) < 0 )
					;
				while( pivot.compareTo( a[ --j ] ) < 0 )
					;
				if( i >= j )
					break;
				swapReferences( a, i, j );
			}
			// Restore pivot
			swapReferences( a, i, high - 1 );

			quickSort( a, low, i - 1 ); // Sort small elements
			quickSort( a, i + 1, high ); // Sort large elements
		}
		System.out.print("The resulting array is: ");
		for(int i:a)
		{
            System.out.print(i);
            System.out.print(" ");
        }
	}
	
	
	/**
     * Internal insertion sort routine for subarrays
     * that is used by quicksort.
     * @param a an array of Comparable items.
     * @param low the left-most index of the subarray.
     * @param n the number of items to sort.
     */
    private static <AnyType extends Comparable<? super AnyType>> void insertionSort( AnyType [ ] a, int low, int high )
    {
        for( int p = low + 1; p <= high; p++ )
        {
            AnyType tmp = a[ p ];
            int j;

            for( j = p; j > low && tmp.compareTo( a[ j - 1 ] ) < 0; j-- )
                a[ j ] = a[ j - 1 ];
            a[ j ] = tmp;
        }
    }
    
    /**
     * Method to swap to elements in an array.
     * @param a an array of objects.
     * @param index1 the index of the first object.
     * @param index2 the index of the second object.
     */
    public static final <AnyType> void swapReferences( AnyType [ ] a, int index1, int index2 )
    {
        AnyType tmp = a[ index1 ];
        a[ index1 ] = a[ index2 ];
        a[ index2 ] = tmp;
    }
}
