package hello;

public class op1 {
	static int fact (int n) {
		if (n!=1) {
			return n*(fact(n-1));
		}
		else {
			return 1;
		}
	
		
	}
	public static void main(String[] args) {
		System.out.println("the factorial of a no = "+fact(3));
		
		

	}

}
