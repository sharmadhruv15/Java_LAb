package classandobject;
import java.util.*;
public class Studetails {
	String name;
	int id;
	int sem;
	String branch;
	Studetails(int id, int sem,String name,String branch){
		System.out.println(id+" "+name+" "+sem+" "+branch);
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int id = sc.nextInt();
		int sem  = sc.nextInt();
		String name = sc.nextLine();
		String branch = sc.nextLine();
		
		
		Studetails stu = new Studetails(id,sem,name,branch);
		sc.close();
		
		
		
		
		
	}

}
