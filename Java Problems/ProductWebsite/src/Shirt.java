
public class Shirt extends Product{

	public static int shirtQuantity;
	
	private String shirtBrand;
	private String shirtType;
	private String shirtSize;
    private String specs;
    private String shirtPrime ;
	
	
	public Shirt(String shirtBrand, String shirtType,String shirtSize,String color,String ShirtPrime,int quantity) {
		super(color);
		this.shirtBrand = shirtBrand;
		this.shirtSize = shirtSize;
		this.shirtType = shirtType;
		this.shirtPrime = ShirtPrime;
		shirtQuantity = quantity;
		specs = specifications();
	}
	@Override public String specifications() {
		
		// TODO Auto-generated method stub
		String prime = this.shirtPrime;
		String type = this.shirtType;
		String Size = this.shirtSize;
	     
		return prime+" "+type+" "+Size;
	}
	
	@Override public String toString()
	{
		return "Shirt [shirtBrand=" + shirtBrand + ", shirtType=" + shirtType + ", shirtSize=" 
	     + shirtSize + ", specs="+ specs + ",color="+ getColor() +",Quantity="+ shirtQuantity +"]";
	}

	
}
