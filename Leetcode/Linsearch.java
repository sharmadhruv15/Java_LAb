import java.util.*;
class Main{
    int arrr(int b,int arr[]){
        for(int i = 0;i<arr.length;i++)
        {
            if(arr[i]==b) {
                return i;
            }
            
        }
    return -1;
    }
    
    public static void main(String [] args){
        
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int a = sc.nextInt();
        
        int [] arr = new int[k];
        int i = 0;
        while(i<k){
            arr[i]= sc.nextInt();
            i++;
        }
        Main obj = new Main();
        int q = obj.arrr(a,arr);
        System.out.print(q);
        
        
        
    }
}