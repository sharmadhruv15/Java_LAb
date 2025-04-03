// You are using Java
//Take three user inputs as current value,a,b
import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        for(int i = 0;i<n;i++){
            int curr = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int sum = curr;
            for (int j = 0;j<b;j++)
            {
                sum += Math.pow(2,j)*a;
                System.out.print(sum+" ");
                
            }
            System.out.print("\n");
        }
    }
}
