package classandobject;



public class Studentt {
	int id;
	String name;
	String course;
	String clg_name;
	
	Studentt(int i,String n,String c,String cl) {
		id = i;
		name = n;
		course = c;
		clg_name = cl;
	}
	void getdata() {
		System.out.println(id +" "+name +" "+ course +" "+clg_name);
	}
	public static void main(String [] args) {
		Studentt stu1 = new Studentt(1, "Dhruv", "B.Tech","Miet");
		
		stu1.getdata();
		Studentt stu2 = new Studentt(2, "Aman", "B.Tech","Miet");
		
		stu2.getdata();
		
	}

}
