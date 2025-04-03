package classandobject;


class a extends b{
	void funa()
	{
	System.out.println("This is class a");
	}
	
}
class b{
	void funb()
	{
	System.out.println("This is class b");
	}
}

class c{
	void func()
	{
	System.out.println("This is class b");
	}
}


public class StaticExample {  
	public static int a = 10;
	public static void main(String[] args) {
		System.out.println(StaticExample.a); 
		
		a obj = new a();
		obj.funb();
		obj.funa();
	}
}

