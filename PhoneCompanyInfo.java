public class PhoneCompanyInfo extends PhoneInfo {
	private String company;
	
	public PhoneCompanyInfo(String name, String phone, String comp) {
		super(name, phone);
		this.company = comp;
	}
	
	public String getCompany() { return company; }
	public void setCompany(String comp) { this.company = comp; }

	public void printInfo() {
		super.printInfo();
		System.out.println("company : " + company);
	}
}
