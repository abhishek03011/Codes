public class Heap 
{

	public int count;
	public int[] array;
	public int capacity;
	public int heap_type;
	
	public Heap(int capacity,int heap_type)
	{
		this.count = 0;
	}
	
	public int Parent(int i)
	{
		if(i<=0 || i >= this.count)
		return -1;	
	return i-1/2;
	}
	
	public int leftChild(int i)
	{
		int left = 2*i+1;
		if(left>=this.count)
			return -1;
		return left;
	}

	public int rightChild(int i)
	{
		int right = 2*i+2;
		if(right>=this.count)
			return -1;
		return right;
	}
	
	public int getMaximum()
	{
		if(this.count == 0)
			return -1;
		return this.array[0];
	}
 
	public void percolateDown(int i)
	{
		int l ,r ,max ,temp;
		l = leftChild(i);
		r = rightChild(i);
		if(l!=-1 && this.array[l]>this.array[i])
			max = l;
		else max = i;
		if(r!=-1 && this.array[r]>this.array[max])
			max = r;
		if(max!=i)
		{
			temp = this.array[i];
			this.array[i] = this.array[max];
			this.array[max] = temp;
		}
		percolateDown(max);
	}
	
	public int deleteMax()
	{
		if(this.count==0)
			return -1;
		int max = this.array[0];
		this.array[0] = this.array[this.count-1];
		this.count--;
		percolateDown(0);
		return max;
	}
	
	public void Insert(int data)
	{
		int i;
		if(this.count == this.capacity)
			ResizeHeap();
		this.count++;
		i = this.count-1;
		while(i>=0 && data>this.array[(i-1)/2])
		{
			this.array[i]= this.array[(i-1)/2];
		}
		this.array[i] = data;
	}

	public void ResizeHeap()
	{
		int [] array_old = new int[this.capacity];
		System.arraycopy(array, 0, array_old, 0, this.count-1);
		this.array = new int[this.capacity*2];
		if(this.array==null)
		{
			System.out.println("memory error");
			return;
		}
		for(int i = 0;i<this.capacity;i++)
			this.array[i] = array_old[i];
		this.capacity*=2;
		array_old = null;
	}
	
	public void Destroy()
	{
		this.count = 0;
		this.array = null;
		
	}
	
	
	
}
