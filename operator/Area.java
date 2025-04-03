package operator;
import java.util.*;

public class Area {
	Area(float length,float breadth){
	length = 2.3f;
	breadth = 3.4f;
	}
	void ar() {
		System.out.println("Area:"+length*breadth);
	}
	public static void main(String [ ] args) {
		Scanner sc  = new Scanner(System.in);
		float length = sc.nextFloat();
		float breadth = sc.nextFloat();
		
	
	Area areaa = new Area(length,breadth);
	areaa.ar();
	sc.close();
	}
}
