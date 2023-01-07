import java.util.*;
public class riskitem 
{
   public static void main(String[] args)
   {
    Scanner sc=new Scanner(System.in);
    int n,i=0;
    System.out.println("enter the n value");
    n=sc.nextInt();
    System.out.println("enter the array elements");
    int a[]=new int[n+1];
    for( i=0;i<n;i++)
    {
       a[i]=sc.nextInt(); 
    }
    Arrays.sort(a);
    System.out.println("sorted array is:");
    for( i=0;i<n;i++)
    {
        System.out.println(+a[i]+" ");
    }

 } 
}
