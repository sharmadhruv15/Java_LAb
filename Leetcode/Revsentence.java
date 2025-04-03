//To swap the whole whole words from the string 
import java.util.*;
class Main{
    
    
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);        
        String s1 = sc.nextLine();
        String words[] = s1.trim().split("\\s+");
        StringBuilder str = new StringBuilder("");
        for(int i = words.length-1;i>=0;i--)
        {
            str.append(words[i]);
            if(i!=0){
                str.append(" ");
            }
        }
        System.out.print(str);
    }
}