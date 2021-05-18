package hello;
import java.util.*;

public class if2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n =in.nextInt();
		in.close();
		for (int i=2;i<n;) {
			if(n%i == 0) {
				System.out.println("num is not prime"+n);
				break;
			}
			else {
				System.out.println("num is prime"+n);
				break;
			}
			
		}
	}

}
