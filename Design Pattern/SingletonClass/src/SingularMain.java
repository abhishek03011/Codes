
public class SingularMain {

	public SingularMain() {
		// TODO Auto-generated constructor stub
	}

	
		public static void main(String...args)
		{
			Single thread1 = Single.getThread();
			System.out.println("Thread Id : "+ System.identityHashCode(thread1));
			System.out.println(thread1.showNumbers());
			System.out.println(thread1.getNumber(5));
			
			Single thread2 = Single.getThread();
			System.out.println("Thread Id : "+ System.identityHashCode(thread2));
			System.out.println(thread2.showNumbers());
			System.out.println(thread2.getNumber(5));
			
			
		}
	

}
