package oopsprmgs;

class EmployeeDetails{
	int empID=1000;
	String empName="Dharma";
	float empSalary=80000.05f;
	
	void displayEmployeeDetails() {
		System.out.printf("Employee Details: "+"\nEmpID: "+empID+"\nEmp Name: "+empName+"\nSalary: "+empSalary);
	}
}
public class ClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeDetails details=new EmployeeDetails();
		details.displayEmployeeDetails();
	}

}
