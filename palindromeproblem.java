import java.util.*;
public class palindromeproblem {
	public static void main(String[] args) {
		String str = new java.util.Scanner(System.in).next();//enter the string
		char c[] = str.toUpperCase().toCharArray();
		int len = str.length();
		for(int i = 0; i < len / 2; i++) {
			if(c[i] != c[len - i - 1]) {
				System.out.println("NO");
				return;
			}	
		}
		System.out.println("YES");
	}
}