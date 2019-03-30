public class location {

	private String locName; //name of location
	private String address;
	private int locID; //location ID
	
	public location(String n, String addr, int id) {
		locName = n;
		address = addr;
		locID = id;
	}
	
	public String getName() {
		return locName;
	}
	
	public String getAddress() {
		return address;
	}
	
	public int getID() {
		return locID;
	}
	
	public void setName(String name) {
		this.locName = name;
	}
	
	public void setAddress(String addr) {
		this.address = addr;
	}
	
	public void setID(int id) {
		this.locID = id;
	}
}