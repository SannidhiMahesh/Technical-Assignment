// java program to swap the vowles in given string
import java.util.*;
public class vowels
{
     public static void main(String[] args)
     {
        Scanner sc=new Scanner(System.in);
        System.out.println("entert the string");
        String str=sc.next();
        int len=str.length();
        char a[]=str.toCharArray();
        for(int i=0;i<len;i++)
        {
         if(a[i]=='e')
             a[i]='o';
         else if(a[i]=='o')
            a[i]='e';
         else if(a[i]=='i')
            a[i]='u';
         else if(a[i]=='u')
            a[i]='i';
        }
        System.out.println(new String(a));
        
     }
}