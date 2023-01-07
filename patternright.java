//pattern right
import java.util.*;
public class patternright
 { public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the word");
        String str= sc.next();
        char word[]=str.toCharArray();
        int length=str.length();
        System.out.println("patter is:");
        for(int i=0;i<length;i++)
        {
            int index=0;
            for(int j=0;j<length;j++)
            {
              if(j>=i){
                System.out.print(word[index++]);}
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
    
}

    

