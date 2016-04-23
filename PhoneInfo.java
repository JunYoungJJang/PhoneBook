public class PhoneInfo {
	private String name;
	private String phoneNumber;
	
	public PhoneInfo(String name, String phone) { this.name = name; this.phoneNumber = phone; }
	
	public String getName() { return name; }
	public String getPhone() { return phoneNumber; }
	public void setName(String name) { this.name = name; }
	public void setPhone(String phone) { this.phoneNumber = phone; }
	
	public String toString() {
		return name + ", " + phoneNumber;
	}
	
	public void printInfo() {
		System.out.println("name : " + getName());
		System.out.println("phone : " + getPhone());
	}
}
