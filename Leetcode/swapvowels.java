import java.util.*;
class Main{
    String swapp(String s1)
    {
        int len = s1.length();
        String vowel = "aeiouAEIOU";
        char [] arr = s1.toCharArray();
        int right = len-1;
        int left = 0;
        while(left<right)
        {
            while(left <right && vowel.indexOf(arr[left])==-1) left++;
            while (left<right && vowel.indexOf(arr[right])==-1) right--;
            
            char temp = arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        return new String(arr);
    }
    
    public static void main(String [] args){
        Scanner  sc = new Scanner(System.in);
        String a = sc.next();
        Main obj = new Main();
        String k = obj.swapp(a);
        System.out.println(k);
        
    }
}