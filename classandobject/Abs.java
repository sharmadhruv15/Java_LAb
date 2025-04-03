package classandobject;

abstract class A{
	abstract void logic();
	abstract void logic2();
	void fun() {
		System.out.println("Funn");
	}
}
public class Abs extends A {
	void logic() {
		System.out.println("Definition 1 of the abstract method of the Class A");
	}
	void logic2() {
		System.out.println("Definition 2 of the abstract method of the Class A");
	}
	public static void main(String[] args) {
		Abs A = new Abs();
		A.fun();
		A.logic();
		A.logic2();
		
	}
	
}
// If we want to create the object of the Abstract class then its not possible to create the one 
// If we have the Abstract method into it and its definition if not available then we will not be able to define the object as the output will be Nothing.
