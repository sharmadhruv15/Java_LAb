import java.util.*;
class Main{
    
    int gcd(int a,int b){
        while(b!=0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        if(!(s1+s2).equals(s2+s1)){
            System.out.print("");
        }
        else{
            Main obj = new Main();
            int sublen = obj.gcd(s1.length(),s2.length());
            System.out.print(s1.substring(0,sublen));
            
        }
    }
}