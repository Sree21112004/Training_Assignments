package oopsprmgs;
class EmployeeDetail{
	int empID=1000;
	String empName="Dharma";
	
	void displayEmployeeDetails() {
		System.out.printf("Employee Details: "+"\nEmpID: "+empID+"\nEmp Name: "+empName);
	}
}
class Manager extends EmployeeDetail{
	float empSalary=80000.05f;
	void displayManager() {
		System.out.printf("\nManager Info: "+"\nEmpID: "+empID+"\nEmp Name: "+empName+"\nSalary: "+empSalary);
	}
}
public class InheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager object = new Manager();
		object.displayEmployeeDetails();
		object.displayManager();
	}

}
