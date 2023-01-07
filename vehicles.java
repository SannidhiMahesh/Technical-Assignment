//vehicle tyers
import java.util.*;

public class vehicles {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of vechicles");
		int v = sc.nextInt();
        System.out.println("entr the wheels");
		int w = sc.nextInt();
		if(w < 2 || w % 2 != 0 || w <= v) {
			System.out.println("INVALID INPUT");
			return;
		}
		int fw = (w - 2 * v) / 2;
		int tw = v - fw;
		System.out.println(tw + " " + fw);
	}
}
