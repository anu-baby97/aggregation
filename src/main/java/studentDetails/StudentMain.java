package studentDetails;

public class StudentMain {

	public static void main(String[] args) {
		BasicDetails obj=new BasicDetails();
		obj.setName("Anu");
		obj.setRoll_no(65);
		
		StudentAddress a = new StudentAddress();
		a.setHouseName("XYZ House");
		a.setStreetName("ABC Street");
		a.setZipCode(12367);
		
		obj.setAddress(a);
		
		System.out.println("Name: "+obj.getName()+", Roll number: "+obj.getRoll_no()+", Address: "+obj.getAddress().getHouseName()+ ","
				+obj.getAddress().getStreetName()+","+obj.getAddress().getZipCode());

	}

}
