
public class Employee {
String Name;
String id;
Address address;
	public Employee(String Name,String id, Address address) {
		// TODO Auto-generated constructor stub
		this.Name = Name;
		this.id = id;
		this.address = address;
	}
void display()
{
	System.out.println("Name is :" +Name+" Id is :" +id+"");
	System.out.println("Street Name is :" + address.streetName+" Apartment Number :"+address.aptNumber+" City :"+
	address.city+" Address state :"+address.state+"Address Country :"+address.country);
}
public static void main(String...args)
{
Address address1 = new Address("2000 Bay area Blvd","915","Houston","77058","Texas","USA");	
Address address2 = new Address("2000 Bay area Blvd","123","Houston","77058","Texas","USA");	

Employee emp1 = new Employee("Abhishek","1",address1);
Employee emp2 = new Employee("Ritesh","2",address2);

emp1.display();
emp2.display();
}
}