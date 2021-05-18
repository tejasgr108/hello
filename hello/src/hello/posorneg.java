package hello;
import java.util.*;
public class posorneg {
	public static void main(String[] args) {
			try (Scanner input = new Scanner( System.in )) {
				int a = input.nextInt();
				if (a >= 0) {
					System.out.println("the no is positive");
				}
				else {
					System.out.println("the no is negative");
				}
			}
	}
	

}
