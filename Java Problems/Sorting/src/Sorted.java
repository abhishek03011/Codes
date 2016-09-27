import java.util.ArrayList;
public class Sorted 
{

	public ArrayList<Integer> bubbleSort(ArrayList<Integer> ar)
	{
		int n= ar.size();
		System.out.println("Array size : " + n);
		for(int i=0;i<n;i++)
			for(int j=0;j<n-1-i;j++)
				if(ar.get(j)>ar.get(j+1))
				{
					int temp =ar.get(j);
					int temp2 = ar.get(j+1);
					ar.remove(j);
					ar.add(j, temp2);
					ar.remove(j+1);
					ar.add(j+1, temp);
				}
		
		return ar;
	}
	
	public ArrayList<Integer> selectionSort(ArrayList<Integer> br)
	{
	 int n = br.size(),min;
	 for (int i =0; i<n-1;i++)
	 {
		 min = i;
		 for(int j= i+1; j<n;j++)
			 if(br.get(j)<br.get(min))
				 min = j;
		 
		 int temp = br.get(min);
		 int temp1 = br.get(i);
		 br.remove(min);
		 br.add(min,temp1);
		 br.remove(i);
		 br.add(i,temp);	 
	 }
	return br;	
	}
	
	public ArrayList<Integer> insertion (ArrayList<Integer> cr)
	{
		int n = cr.size(), key,j;
		for(int i = 0; i< n ; i++)
		{
			key = cr.get(i);
			j = i -1;
			
			while(j>=0 && cr.get(j)>key)
			{
				cr.remove(j+1);
				cr.add(j+1,cr.get(j));
				j=j-1;
			}
			cr.remove(j+1);
			cr.add(j+1, key);
		}
		return cr;
	}
	
}
