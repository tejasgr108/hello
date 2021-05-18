package hello;
class animals{
	public void sound() {
		System.out.println("shouting");
		}
}
class dog extends animals{
	public void dog1() {
		System.out.println("the dog is barking");
	}
}
class cat extends dog{
	public void cat1(){
		System.out.println("the cat meow");
	}
}
public class inther {
	public static void main(String[] args) {
		cat  d1 =new cat();
		d1.dog1();
		d1.sound();
		d1.cat1();
		
		
	}

}
