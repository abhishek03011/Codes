
public abstract class Ship {

	private String name;
	private double speed;
	private double damage;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	public double getDamage() {
		return damage;
	}
	public void setDamage(double damage) {
		this.damage = damage;
	}
	
	public void followEnemyShip()
	{
		System.out.println(getName()+ " is following the hero");
	}
	
	public void displayEnemyShip()
	{
		System.out.println(getName() + " is on the screen");
	}
	public void enemyShootsShip()
	{
		System.out.println(getName() + " atttacks and does " + getDamage() + " damage to hero");
	}
	
}
