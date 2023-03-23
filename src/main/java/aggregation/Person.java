package aggregation;

public class Person {
	private String name;
	private int age;
	private Address address; //a class used as an object in another class, HAS-A relationship
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public Address getAddress() {
		return address;
	}
	
	public static void main(String args[]) {
		
		Person p = new Person();
		p.setName("Anu");
		p.setAge(24);
		
		Address a = new Address();
		a.setHouseName("XYZ");
		a.setStreetName("abc");
		a.setZipCode(16734);
		
		p.setAddress(a);
		
		System.out.println("Name: "+p.getName()+", Age: "+p.getAge()+", Address: "+p.getAddress().getHouseName()+ ","
		+p.getAddress().getStreetName()+","+p.getAddress().getZipCode());
		
	}
}
