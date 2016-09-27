
public class CustomerImplementer implements Customer
{
	private String customerName;
	private int customerAge;
	private String customeraddress;

	public CustomerImplementer(String customerName,int customerAge,String customeraddress) 
	{
		this.customeraddress= customeraddress;
		this.customerAge= customerAge;
		this.customerName = customerName;
				
	}


	public String getName() {
		return customerName;
	}


	public void setName(String name) {
		customerName = name;
	}


	public int getAge() {
		return customerAge;
	}


	public void setAge(int age) {
		customerAge = age;
	}


	public String getAddress() {
		return customeraddress;
	}


	public void setAddress(String address) {
		this.customeraddress = address;
	}


	public String name() {
		
		return customerName;
	}


	public int age() {
		
		return customerAge;
	}

	public String Address() {
		
		return customeraddress;
	}
	
	public String toString() {
		return "Customer Name=" + customerName + ", Customer Age=" + customerAge
				+ ", Customer address=" + customeraddress;
	}
}
