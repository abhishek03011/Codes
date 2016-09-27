
public class AnimalMain {

	public AnimalMain() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal nadir = new Dog();
		Animal birdy = new Bird();

		System.out.println("Nadir: "+nadir.trytofly());
		nadir.SetAbilitytofly(new ItFlys());
		System.out.println("Nadir: "+nadir.trytofly());
		System.out.println("Birdy: "+birdy.trytofly());
	}

}
