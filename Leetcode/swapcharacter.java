import java.util.*;
class Main{
    // public static void main(String args[]){
    //     Scanner sc = new Scanner(System.in);
    //     String a = sc.next();
    //     char [] s = a.toCharArray();
    //     int len = s.length-1;
        
    //     while(len>=0){
    //         System.out.print(s[len]);
    //         len--;
    //     }
    // }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        StringBuilder a = new StringBuilder(sc.next());
        int len = a.length();
        for(int i = 0;i<(len/2);i++){
            char atfront = a.charAt(i);
            char atlast = a.charAt(len-i-1);
            
            a.setCharAt(i,atlast);
            a.setCharAt(len-i-1,atfront);
            
            
            
        }
        System.out.print(a);
    }
    
}