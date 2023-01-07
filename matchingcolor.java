import java.util.*;
public class matchingcolor 
{
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n");
		int n = sc.nextInt();
		
		System.out.println("Enter values");
		int ary[] = new int[n];
        for(int i=0;i<n;i++)
        {
            ary[i]=sc.nextInt();
        }
        Arrays.sort(ary);
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(ary[i]==ary[i+1])
            {
                count++;
            }
            else
                i++;
        }
        System.out.println(count);
    }
    
}