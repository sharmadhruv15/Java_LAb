import java.util.*;
class Main{
    String merge(String a,String b){
        char[] a1 = a.toCharArray();
        char[] b1 = b.toCharArray();
        
        int s1 =  a.length();
        int s2 = b.length();
        int i=0,j = 0;
        StringBuilder swp = new StringBuilder("");
        while(i<s1||j<s2){
            if(i<s1)
            {
                swp.append(a1[i]);
                i++;
            }
            if(j<s2) 
            {swp.append(b1[j]);
            j++;
            }
        }
        return swp.toString();
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s1 = (sc.next());
        String s2 = (sc.next());

        Main obj = new Main();
        String neww = obj.merge(s1,s2);
        System.out.print(neww);
    }
}