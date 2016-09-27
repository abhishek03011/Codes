import java.util.Scanner;
public class ShipTesting {

	public static void main(String...args) {
		
		Ship StarTrek = null;
		Scanner sc = new Scanner(System.in);
		String input = "";
		System.out.println("Enter What Kind of Ship");
		if (sc.hasNextLine())
		{
			input = sc.nextLine();
		}
		if(input.equals("S"))
			doStuff(new StarTrekShip());
		else
			doStuff(new EnterpriseShip());
			
	}
	
	public static void doStuff(Ship aShip)
	{
		aShip.displayEnemyShip();
		aShip.followEnemyShip();
		aShip.enemyShootsShip();
	}

}
