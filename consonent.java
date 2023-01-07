//consonent
import java.util.*;
public class consonent 
{
    public static void main(String[] args)
     {
		Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
		String str = sc.next();
		char a[] = str.toCharArray();
		int len = str.length();
		for(int i = 0; i < len; i++) {
			if(a[i] == 'c')
				a[i] = 't';
			else if(a[i] == 't')
				a[i] = 'c';
			else if(a[i] == 'd')
				a[i] = 'n';
			else if(a[i] == 'n')
				a[i] = 'd';
		}
		System.out.println(new String(a));
	}

}

