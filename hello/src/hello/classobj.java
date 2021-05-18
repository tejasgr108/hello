package hello;

 class add{
	public int add1(int a,int b) {
		int sum1 = a+b;
		return sum1;
	}
		
	}
	
public class classobj {
	public static void main(String[] args) {
		add a = new add();
		System.out.println("the sum of numbers  = "+a.add1(45,92));
	}

}
