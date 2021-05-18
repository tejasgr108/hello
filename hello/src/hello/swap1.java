package hello;

public class swap1 {
	public static void main(String[] args) {
		int firstnum = 7;
		int secondnum = 5;
		System.out.println("numbers before swapping"+firstnum  +secondnum);
		int temp = 0;
		temp = firstnum;
		firstnum = secondnum;
		secondnum = temp;
		System.out.println("numbers after swapping"+firstnum  +secondnum);
		
	}

}
