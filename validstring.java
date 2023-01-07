//valid string * and #
import java.util.*;
public class validstring 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string:");
        String str=sc.next();
        int len=str.length();
       char a[]=str.toCharArray();
        int s1=0,s2=0;
        for( int i=0;i<len;i++)
        {
            
            if(a[i]=='*')
            {
                s1++;
            }
            else
            {
                s2++;
            }
        }
        if(s1>s2)
        {
            System.out.println(s1-s2 + "-> positive integer(* is greater)");
        }
        else if(s1<s2)
        {
            System.out.println(s1-s2 + "-> negative integer (# is greater)");
        }
        
        else
        {
            System.out.println("0");
        }
    
    }
}
