//chocolate
import java.util.*;
public class chocolate
{
  public static void main(String[] args) 
  {
    Scanner sc=new Scanner(System.in);
    int n, temp=0,c=0;
    System.out.println("enter the value of n");
    n=sc.nextInt();
    int a[]=new int[n+1];
    
    System.out.println("enter the values");
    for(int i=0;i<n;i++)
    {
        a[i]=sc.nextInt();
    }
    for(int i=0;i<n;i++)
    {
       if(a[i]==0)
       {
     
       
       for(int j=i;j<n;j++)
       a[j]=a[j+1];
       i--;
       n--;
       c++;

       }
    }
    for(int i=0;i<n+c;i++)
    {
       System.out.println(a[i]+" "); 
    }
  } 
}
