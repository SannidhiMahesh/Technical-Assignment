//washing machine
import java.util.*;
public class washingmachine 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int i;
        System.out.println("enter the weight in grams");
        i=sc.nextInt();
        if( i>7000)
         {
            System.out.println("OVERLOADE");
         }
         else if(i<0)
         {
            System.out.println("invalid input");
         }
         else if(i==0)
         {
            System.out.println(" time estimated is:0 minutes");
         }
         else
         {
             if(i>0 && i<=2000)
             {
                System.out.println("time estimated is:25 minutes");

             }
             else if(i>=2001 && i<=4000)
             {
                System.out.println("time estimated is:35 minutes");
             }
             else if(i>=4001 && i<=7000)
             {
                System.out.println("time estimated is:45 minutes");
             }
         }
    }
}
