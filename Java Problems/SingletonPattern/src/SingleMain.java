
public class SingleMain {

	

	public static void main(String[] args) {
		
		
		Singleton newInstance = Singleton.getInstance();
		System.out.println("1st Instance ID: "+System.identityHashCode(newInstance));
		System.out.println(newInstance.getLetterList());
		System.out.println(newInstance.getTiles(7));
		System.out.println(newInstance.getLetterList());
		
		
		Singleton SecondInstance = Singleton.getInstance();
		System.out.println("2nd Instance ID: "+ System.identityHashCode(SecondInstance));
		System.out.println(SecondInstance.getLetterList());
		System.out.println(SecondInstance.getTiles(7));
		System.out.println(SecondInstance.getLetterList());
		
		Singleton ThirdInstance = Singleton.getInstance();
		System.out.println("3rd Instance ID: "+ System.identityHashCode(ThirdInstance));
		System.out.println(ThirdInstance.getLetterList());
		System.out.println(ThirdInstance.getTiles(7));
		System.out.println(ThirdInstance.getLetterList());
	}

}
