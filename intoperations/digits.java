package table;
import java.util.*;

public class digits {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int p =0;
		
		while(n!=0) {
			System.out.println(n%10);
			p = n/10;
			n = p;
			
		}
		sc.close();
	}
	

}
