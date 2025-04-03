package classandobject;

class add {
	int a,b,c;
	void input(int x,int y) {
		a = x;
		b = y;
		
	}
	void cal() {
		c = a+b;
	}
	void display() {
		System.out.println("a+b :"+c);
	}

}

public class addtwonumbers {
	public static void main (String[] args) {
		add obj = new add();
		obj.input(12,15);
		obj.cal();
		obj.display();
		
	}
	
}
