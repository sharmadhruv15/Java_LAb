package constructor;
import java.util.Scanner;

public class Areaofrect {
	int length,breadth;
	
	Areaofrect(int l,int b){
		length = l;
		breadth = b;
	}
	void area() {
		System.out.println("Area of rectangle is :"+(length*breadth));
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		int breadth = sc.nextInt();
		Areaofrect ar = new Areaofrect(len,breadth);
		ar.area();
		sc.close();
	}
	

}
