import java.util.*;
public class reversethestring {

	public static void main(String[] args) {
		String input = new java.util.Scanner(System.in).nextLine();
		if(input != null) {
			StringTokenizer str = new StringTokenizer(input, ".");
			String output = str.nextToken();
			while(str.hasMoreElements()) {
				output = str.nextToken() + "." + output;
			}
			System.out.println(output);
		}
	}

}