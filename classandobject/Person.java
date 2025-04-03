package classandobject;

public class Person {
	
		int id ;
		String name;
		Person(){
		id = 101;
		name = "Aman";
		}
		Person(int x){
			System.out.println("This is the parametrized constructor 1");
		}
		void logic(){
			System.out.println(id +" "+name);
		}
		Person(int x,int y){
			System.out.println("This is the parametrized constructor 2");
		}
		Person(int x,int y,int z){
			System.out.println("This is the parametrized constructor 3");
		}
		Person(float x,int y,int z){
			System.out.println("This is the parametrized constructor 4");
		}
		
		public static void main (String[] a) {
			Person p1 = new Person();
			p1.logic();
			Person p2 = new Person(12);
			Person p3 = new Person(12,13);
			Person p4 = new Person(12,13,14);
			Person p5 = new Person(12.23f,13,14);

			
		}
		


}
