package table;
import java.util.*;

public class tableof10 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int nth = sc.nextInt();
	for(int i = 1;i<=nth;i++) {
		System.out.printf("%d * %d = %d\n",n,i,n*i);
		
	}
	sc.close();
	}
}

	


