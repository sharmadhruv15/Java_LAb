import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char [] s = a.toCharArray();
        int len = s.length-1;
        
        while(len>=0){
            System.out.print(s[len]);
            len--;
        }
    }
    
}