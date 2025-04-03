import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.nextLine();
        s1 = s1.replaceAll("[^a-zA-z ]","");
        String [] arr = s1.split("\\s+");
        int len = arr.length;
        for(int i= 0;i<=len;i++)
        {
            System.out.println(arr[i]);
        }
    }
}