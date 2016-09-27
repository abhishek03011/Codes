
public class BodyMassIndex 
{
private double weight;
private double height;
	public BodyMassIndex(double weight,double height) 
	{
		this.weight = weight;
		this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		if(weight > 0 && weight < 300)
		{
		this.weight = weight;
		}
		else
		{
			System.out.println("Enter correct weight");
		}
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		if(height > 0 && height < 300)
		{
		this.height = height;
		}
		else
		{
			System.out.println("Enter correct height");
		}
	}

	public double calculator()
	{
		return (703 * weight)/Math.pow(height, 2);	
	}
	
	public void display()
	{
		System.out.println("Hi my bmi is"+ calculator());
	}
}
