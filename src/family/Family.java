package family;

public class Family {

	public static void main(String[] args) {
		People ratendra = new People();
		ratendra.setFirstName("Ratendra");
		ratendra.setLastName("Khand");
		ratendra.setAge("64");
		ratendra.address = "1234 dumpster fire";
		System.out.println(ratendra.getFirstName());
		System.out.println(ratendra.getLastName());
		
		System.out.println(fullName);
		int num1 = 2;
		String num2 = "3";
		// Example of string concatination
		String fullName=ratendra.getFirstName()+" "+ratendra.getLastName();
		System.out.println(num1+num2); // outputs -> 23
		// Example of type casting from string to integer
		System.out.println(num1+Integer.parseInt(num2)); // outputs -> 5
//		ratendra.display();
	}

}

