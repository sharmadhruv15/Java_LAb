// You are using Java-17version 
import java.util.*;
class Main{
    public static void main(String []  args){
        Scanner sc = new Scanner(System.in);
        int s1 = sc.nextInt();
        int s2 = sc.nextInt();
        
        int [][] arr = new int[s1][s2];
        for(int i = 0;i<s1;i++){
            for(int j = 0;j<s2;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i = 0;i<s1;i++){
            for(int j = 0;j<s2;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.print("\n");
        }
        
    }
}