

package hello;
import java.util.*;
public class if1 {
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int a = in.nextInt();
		in.close();
		if(a>0) {
			System.out.println("number is positive ");		
		}
		else if(a<0) {
			System.out.println("number is negative");
		}
		else {
			System.out.println("number is equl to zero");
		}
		
	}

}
