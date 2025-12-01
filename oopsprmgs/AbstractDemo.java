package oopsprmgs;

abstract class MobilePhone{
	abstract void calling();
	void browsing() {
		System.out.println("Browsing in phone");
	}
}
class Iphone extends MobilePhone{
	void calling() {
		System.out.println("Iphone calling");
	}
	void browsing() {
		System.out.println("Iphone browsing");
	}
}
public class AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MobilePhone mp = new Iphone();
		mp.calling();
		mp.browsing();
	}
}
