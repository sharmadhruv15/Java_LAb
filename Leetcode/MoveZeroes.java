//move zeroes 
import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        for (int i = 0;i<n;i++){
            System.out.println(arr[i]);
        }
        int intpos = 0;
        for(int i = 0;i<arr.length;i++)
        {
            if(arr[i]!=0){
                arr[intpos++]=arr[i];
            }
        }
        while(intpos!=arr.length){
            arr[intpos++]=0;
        }
        for (int i = 0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}