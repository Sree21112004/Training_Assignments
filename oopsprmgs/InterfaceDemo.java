package oopsprmgs;
class Printer implements Printable{
	@Override
	public void print() {
		System.out.println(printerName+" is printing");
	}
}
public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printable p1 = new Printer();
		p1.print();
	}

}
