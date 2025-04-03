package operator;

public class name {
	String name = "Dhruv";
	int age =12;
	int pincode = 12345;
	String city = "Jammu";
	void out()
	{
		System.out.println(name+" "+age+" "+pincode+" "+city);
	}

	public static void main(String[] args) {
		name s1 = new name();
		s1.out();
	}
	

}
