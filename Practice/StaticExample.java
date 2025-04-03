// import java.util.*;
// public class sum{
//     public  static  void main(String [] args){
//         Scanner sc = new Scanner(System.in);
//         int k = sc.nextInt();
//         int l =  sc.nextInt();
//         int c = k+l;
//         System.out.print(c);
//     }
// }

// import java.util.*;
//  public class sum{
//     public static void main(String[] str){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int sum=0;
//         for(int i = 0;i<=n;i++){
//             sum+=i;
//         }
//         System.out.print(sum);
//     }
//  }

// import java.util.*;

// public class table {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int nth = sc.nextInt();
//         for (int i = 1; i <= nth; i++) {
//             System.out.printf("%d * %d = %d\n", n, i, n * i);
//         }

//         sc.close();

//     }

// }




// public class StaticExample {  

    
//     public static void main(String[] args) {
//         String a = "ababab";
//         String b = "abababab"; 
//         System.out.println(a/b); 
// }
// }

import java.util.*;
class Main{
    
    public String mergeAlternativey(String word1,String word2){
        int a = word1.length();
        int b = word2.length();
        String result ="";
        int i = 0;
        while(i<a||i<b){
            if(i<a) result += word1.charAt(i);
            if(i<b) result += word2.charAt(i);
            i++;
            
            
        }
        return result;
        
    }
        
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        Main obj = new Main();
        String sol = obj.mergeAlternativey(a,b);
        System.out.println(sol);
        
        
    }
}