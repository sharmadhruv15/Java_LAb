package classandobject;



public class student {
	int id;
	String name;
	String course;
	String clg_name;
	
	void setdata(int i,String n,String c,String cl) {
		id = i;
		name = n;
		course = c;
		clg_name = cl;
	}
	void getdata() {
		System.out.println(id +" "+name +" "+ course +" "+clg_name);
	}
	public static void main(String [] args) {
		student stu1 = new student();
		stu1.setdata(1, "Dhruv", "B.Tech","Miet");
		stu1.getdata();
		student stu2 = new student();
		stu2.setdata(2, "Aman", "B.Tech","Miet");
		stu2.getdata();
		
	}

}
