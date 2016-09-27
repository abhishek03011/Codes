package classtrial;

public class classB {
 
	classA del = new classA();
	double p = 0;
	private int h ;
	private int g ;
    classA classaa;
	public classB(int r, int t,String x) {
		// TODO Auto-generated constructor stub
		System.out.println("The name is: "+ x );
		this.h = r;
		this.g = t;
	}
	
	public void adder()
	{
		
		
		p = classaa.add(h,g);
		System.out.println("The sum is");
		System.out.println(p);
	}
	
	public static void main(String[] args)
	{
		//double sum = 0; 
		
		classB c = new classB(10,16,"Abhishek");
		//
		//sum = b.add(10,15);
		c.adder();
		//System.out.println(sum);
	}

}
