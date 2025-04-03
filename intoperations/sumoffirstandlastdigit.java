//package table;
//import java.util.*;
//public class sumoffirstandlastdigit {
//	public static void main(String args) {
//	Scanner sc = new Scanner(System.in);
//	int n = sc.nextInt();
//	int sum = n%10;
//	int firstdigit = 0;
//	while(n>=10) {
//		n /=10;
//	}
//	firstdigit = n;
//	
//	sc.close();
//	System.out.print(firstdigit+sum);
//	}
//	
//}
package table;
import java.util.*;

public class sumoffirstandlastdigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int lastDigit = n % 10;  
        int firstDigit = 0;

        while (n >= 10) {
            n /= 10;  
        }
        firstDigit = n;

        sc.close();
        int sum = firstDigit + lastDigit;
        System.out.println("Sum of the first and last digit: " + sum);
    }
}





















