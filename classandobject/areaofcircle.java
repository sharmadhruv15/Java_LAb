package classandobject;
import java.util.*;

public class areaofcircle {
	float r,areaa;
	areaofcircle (float r ){
		areaa = 3.14f*r*r;
		
	}
	void ar() {
		System.out.println(areaa);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float rad = sc.nextFloat();
		
		areaofcircle area = new areaofcircle(rad);
		area.ar();
		
		
		sc.close();
	}

}
