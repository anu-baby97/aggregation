package aggregation;

public class Address {
	private String houseName,streetName;
	private int zipCode;	

	public void setHouseName(String houseName) {
		this.houseName = houseName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	
	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

	public String getHouseName() {
		return houseName;
	}
	
	public String getStreetName() {
		return streetName;
	}
	
	public int getZipCode() {
		return zipCode;
	}

	
}
