package classandobject;
import java.util.*;

public class Addsub {
    int a, b;
    String op;

    Addsub(int a, int b, String op) {
        if (op.equals("+")) {
            System.out.println("Sum is: " + (a + b));
        } else if (op.equals("-")) {
            System.out.println("Difference is: " + (a - b));
        } else if (op.equals("/")) {
            if (b != 0) {
                System.out.println("Division is: " + (a / b));
            } else {
                System.out.println("Division by zero is not allowed.");
            }
        } else if (op.equals("*")) {
            System.out.println("Product is: " + (a * b));
        } else {
            System.out.println("Wrong operation");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int  b = sc.nextInt();
        System.out.print("Enter operation (+, -, *, /): ");
        String c = sc.next();

        Addsub ab = new Addsub(a, b, c);
        sc.close();
    }
}