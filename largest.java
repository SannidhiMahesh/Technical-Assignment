//largest number
import java.util.*;
 public class largest
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a,N,largest=0;
        System.out.println("enter the  total number of elements");
        a=sc.nextInt();
        System.out.println("enter the elements");
        for(int i=1;i<=a;i++)
        {
            N=sc.nextInt();
            if(N>=largest)
            {
                largest=N;
               
                
            }
           
        }
        System.out.println("largest number is:"+largest);
    }
}