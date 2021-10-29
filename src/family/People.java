package family;

public class People {
	private String firstName;
	private String lastName;
	private String age;
	private String phoneNumber;
	public String address;
	
	People(){
		this.firstName="not assigned";
	}
	
	People(String fn, String ln) {
		this.firstName = fn;
		this.lastName = ln;
	}
	People(String fn, String ln, String age, String addr) {
		this.firstName=fn;
		this.lastName=ln;
		this.age=age;
		this.address=address;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void display() {
		System.out.printf("first name -> %s, last name -> %s. age -> %s, address -> %s \n",this.firstName, this.lastName, this.age, this.address);
	}
	
	
	
}
