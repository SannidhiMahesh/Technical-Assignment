//series
import java.util.*;
public class sum 
{
    public static void main(String[] args)
     {
		Scanner sc=new Scanner(System.in);
        int num;
        System.out.println("enter the number");
        num=sc.nextInt();
		double fact = 1, result = 0;
		for(int i = 1; i <= num; i ++) {
			fact *= i;
			if(i % 2 == 0)
				result -= (i / fact);
			else
				result += (i / fact);
			System.out.println(fact + " " + result);
		}
		System.out.println("result="+result);
	}

}
    

