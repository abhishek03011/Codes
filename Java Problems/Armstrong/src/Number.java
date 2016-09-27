
public class Number {

	static boolean number(int number)
	{
		int copy = number;
		int digits = String.valueOf(copy).length();
		//System.out.println(digits);
		int sum = 0;
		
		while(copy!=0)
		{
			int last = copy%10;
			int temp = 1;
			for(int i = 0 ;i<digits;i++)
			{
			 temp = temp * last;
			}
			sum = sum + temp;
			copy = copy / 10;
		}
		
		if(sum == number)
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) 
	{
	System.out.println(Number.number(153));
	}

}
