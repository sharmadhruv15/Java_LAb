package classandobject;

class Student{
	private int id;
	private String name;
//	WE are making them private to hide them 
	Student(int id , String name){
		this.id  = id;
		this.name = name;
	}
	void display() {
		System.out.println(id+" "+name);
	}
}
public class Studetailsss {
	public static void main(String[] args) {
		Student x = new Student(101,"Rahul");
		x.display();
		x.display();
	}
	
	

}
