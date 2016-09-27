package tester;

public class lodu {

	public lodu() {
		// TODO Auto-generated constructor stub
	}
	
	 public boolean twoSum(int x, int y, int z)
	    {
         
		 int temp = 0;
		 if ( z < y)
		 {
			 temp = y - x;
			 
		 }
		while (temp != x)
		{
			temp ++;
			y--;
		}
		 
		if(y==z)
	    return true;
		
		return false;
	    }
	   
	   
	    
	public static void main(String...args)
	{
		lodu a = new lodu();
        boolean b = a.twoSum(6, 10, 8);
		
			System.out.println(b);
		
	}
}
