import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc =  new Scanner(System.in);
        StringBuilder s1 = new StringBuilder(sc.nextLine());        
        System.out.println(s1.substring(1,3));
        s1.insert(1,"Hii");
        System.out.println(s1.substring(1,3));
        System.out.println(s1);
        StringBuilder s2 = new StringBuilder(sc.nextLine());
        s2.append("Nothing");
        System.out.println(s2);

    }
}