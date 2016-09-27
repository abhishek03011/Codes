
public class Testerain {

	public Testerain() {
	}

	public void downcasting(TestAbstractClass abs)
	{
		if (abs instanceof Tester)
		{
			Tester a = (Tester)abs;	
		a.message();
		}
		if(abs instanceof Tester2)
		{
			Tester2 b = (Tester2)abs;
			b.message();
		}
	}
	
	public static void main(String...args)
	{
		TestAbstractClass test = new Tester();
		
		test.display();
	    
		Testerain teaser = new Testerain();
		teaser.downcasting(test);
	}
}
