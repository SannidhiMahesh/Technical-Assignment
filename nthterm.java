import java.util.*;
public class nthterm {

	public static void main(String[] args) {
		int n = new java.util.Scanner(System.in).nextInt();
		if(n > 0) {
			if(n % 2 != 0)
				System.out.println( (int) Math.pow(2, n / 2) );
			else
				System.out.println( (int) Math.pow(3, n / 2 - 1) );
		}
	}

}