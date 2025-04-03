package classandobject;

public class Diffbwoverhidngandoverhiding {

	public static void main(String ... args) {
//		int arr [] = {1,2,3,4,5,6};
//		for(int val :arr) {
//			System.out.println(val);
//		}
//		System.out.println(6+"4"+8);
		String c = new String("Java");
		System.out.print(c.charAt(2));
		String b = new String("Programming");
		c.concat(b);
		System.out.println(c);
	}
}
