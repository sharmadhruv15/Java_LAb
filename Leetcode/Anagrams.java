//Anagrams
import java.util.*;
class Main{
    boolean check(String s1,String s2){
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        if(s1.length()!=s2.length()){
            return false;
        }
        else{
            char [] c1 = s1.toCharArray();
            char [] c2 = s2.toCharArray();
            Arrays.sort(c1);
            Arrays.sort(c2);
            return Arrays.equals(c1,c2);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        Main obj = new Main();
        System.out.print(obj.check(s1,s2)); 
    }
}