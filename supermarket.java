//supermarket
import java.util.*;
public class supermarket 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int N ,i=1,temp=0,mul=0;
        System.out.println("enter the value of n ");
        N=sc.nextInt();
        while(N!=0)
        {
            temp=N%10;
            mul=i*temp;
            i=mul;
            N=N/10;
        }
        
        System.out.println(mul);
    }
}
