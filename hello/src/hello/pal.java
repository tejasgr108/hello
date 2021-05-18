package hello;
import java.util.*;

public class pal {
	public static void main (String[] args) {
		try (Scanner in1 = new Scanner(System.in)) {
			int num;
			num = in1.nextInt();
			int rev = 0;
			int temp = num;
			while(num>0) {
				rev = rev*10;
				rev = rev + num%10;
				num = num/10;
			}
			if(temp == rev) {
				System.out.println("the number is palindrom");
			}
			else {
				System.out.println("the number is not a palindrom");
			}
		}
	}
	

}
