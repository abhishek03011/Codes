import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
public class Set3
{
	public static void LinkedHash(int[] array)
	{
		System.out.println("Array with duplicates");
		
		for(int i = 0; i < array.length;i++)
			System.out.print(array[i]+"\t");
		
		Set<Integer> set = new LinkedHashSet<Integer>();
		
		for(int i = 0 ; i<array.length;i++)
			set.add(array[i]);
		

		@SuppressWarnings("unused")
		Object[] s = set.toArray();
		
		
		
		int[] arr = new int[set.size()];
		int index = 0;
		for(Integer i : set)
			arr[index++] = i;
		
		System.out.println();
		System.out.println("The removed duplicates is");
		for(int i = 0 ; i < arr.length; i++)
			System.out.print(arr[i]+"\t");
	
		
	}

	static void HashSet(int[]array)
	{
		System.out.println("Array with duplicates");
		
		for(int i = 0; i < array.length;i++)
			System.out.print(array[i]+"\t");
		
		Set<Integer> set = new HashSet<Integer>();
		
		for(int i = 0 ; i<array.length;i++)
			set.add(array[i]);
		

		@SuppressWarnings("unused")
		Object[] s = set.toArray();
		
		
		
		int[] arr = new int[set.size()];
		int index = 0;
		for(Integer i : set)
			arr[index++] = i;
		
		System.out.println();
		System.out.println("The removed duplicates is");
		for(int i = 0 ; i < arr.length; i++)
			System.out.print(arr[i]+"\t");
	
	}
	public static void duplicates(int[] array)
	{
		
		System.out.println("Array with duplicates");
		
		for(int i = 0; i < array.length;i++)
			System.out.print(array[i]+"\t");

		int size = array.length;
		
		for(int i = 0 ; i < size;i++)
		{
			for(int j = i+1;j<size;j++)
			{
				if(array[i]==array[j])
				{
					array[j]= array[size-1];
					
					size--;
					
					j--;
				}
				
				
			}
		}
		System.out.println();
		System.out.println("Array without Duplicates");
		int ar2[] = Arrays.copyOf(array, size);
		for(int i = 0; i<ar2.length;i++)
			System.out.print(ar2[i]+"\t");
	}
	
	public static void main(String[] args) 
	{
		HashSet(new int[] {4, 3, 2, 4, 9, 2});
	}

}
