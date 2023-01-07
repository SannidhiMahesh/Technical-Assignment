//fibonacci series
import java.util.*;
public class fibonacci 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int fib1=0;
        int fib2=1,fib=0,num,n;
        System.out.println("enter the number ");
        num=sc.nextInt();
        System.out.println("fibonacci series is:");
       System.out.println(fib1+" "+fib2);
        for(int i=0;i<num;i++)
        {
        System.out.println(fib);
            
            fib=fib1+fib2;
            fib1=fib2;
            fib2=fib;
            
            
        }
        
    }
}
