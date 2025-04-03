package classandobject;

import java.util.*;



public class Atm {
	int accno;
	float balance;
	Atm(int accno,float balance,float withdraw){
		if(withdraw<balance) {
			System.out.print("Balance is :"+(balance-withdraw));
		}
		else {
			System.out.print("Insufficient Balance");
		}
		
	}
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int accnoo = sc.nextInt();
		float balancee = sc.nextFloat();
		float withdraww = sc.nextFloat();
		Atm ball = new Atm(accnoo,balancee,withdraww);
		
		
		
	}

}
