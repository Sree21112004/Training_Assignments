package oopsprmgs;
class Employee{
	int empNo=1234;
	int display() {
		return empNo;
	}
	void display(String ename) {
		System.out.println("Employee Name: "+ename);
	}
	void display(int x) {
		System.out.println("Int: "+x);
	}
	void display(int x,int y) {
		System.out.printf("Int x: "+x+"\nInt y: "+y);
	}
}
public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee empObj = new Employee();
		System.out.println(empObj.display());
		empObj.display("Sree");
		empObj.display(20);
		empObj.display(30,40);
	}

}
