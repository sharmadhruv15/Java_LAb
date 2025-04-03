package classandobject;

class A {
	void funa() {
		System.out.println("A Class");
	}
	A(){
		System.out.println("Class A Constructor");
	}
}
class B {
	void funb() {
		System.out.println("B Class");
	}
	B(){
		System.out.println("Class B Constructor");
	}
}

class C extends A {
	void func() {
		System.out.println("C Class");
	}
	C(){
		System.out.println("Class C Constructor");
	}
}



public class Inheritance {

	public static void main(String [] args) {
		
	C obj = new C();
	obj.funa();
	obj.func();
	new C();
	
	}
}
