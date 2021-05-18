package hello;

public class count {
	int number;
	public count() {
		System.out.println("default connstructor called");
		
	}
	public count(int a) {
		number = a;
		System.out.println("second constructor is called");
	}
    public count(int a,int b) {
    	number = a*b;
    	System.out.println("third constructor is called");
    }
    
    public static void main(String[] args) {
    	count obj =new count();
    	count obj1 =new count(9);
    	count obj2 =new count(3,8);
    	System.out.print(obj.number);
    	System.out.print(obj1.number);
    	System.out.print(obj2.number);
    	
    }
}
