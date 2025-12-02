package oopsprmgs;

class BankAcc1 {
	long accNo;
	double balance;

	public BankAcc1(long accNo, double balance) {
		this.accNo = accNo;
		this.balance = balance;
	}

	public void deposit(double amt) {
		balance += amt;
		System.out.printf("Deposited: rs." + amt + "\nCurrent Balance: rs." + balance);
	}

	public void withdraw(double amt) {
		if (amt <= balance) {
			balance -= amt;
			System.out.printf("\nWithdrawn: rs." + amt + "\nCurrent Balance: rs." + balance);
		} else {
			System.out.println("Insufficient balance!");
		}
	}

	public void displayDetails() {
		System.out.printf("\nAcc No: " + accNo + "\nBalance: rs." + balance);
	}
}

class SavingsAcc extends BankAcc1 {
	private double intRate;

	public SavingsAcc(long accNo, double balance, double intRate) {
		super(accNo, balance);
		this.intRate = intRate;
		// TODO Auto-generated constructor stub
	}

	public void addInt() {
		double interest = (balance * intRate) / 100;
		balance += interest;
		System.out.printf("\nInterest Added: rs." + interest + "\nUpdated Balance: " + balance);
	}
}

class SalaryAcc extends BankAcc1 {
	private double monthlySal;

	public SalaryAcc(long accNo, double balance, double monthlySal) {
		super(accNo, balance);
		this.monthlySal = monthlySal;
	}

	public void creditSalary() {
		balance += monthlySal;
		System.out.printf("\nSalary Credited: ₹" + monthlySal + " | Updated Balance: ₹" + balance);
	}
}

public class BankAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingsAcc sa = new SavingsAcc(12345, 5000, 5);
		sa.deposit(2000);
		sa.addInt();
		sa.withdraw(3000);
		sa.displayDetails();

		System.out.println("\n---- Salary Account ----");
		SalaryAcc salaryAcc = new SalaryAcc(98765, 8000, 25000);
		salaryAcc.creditSalary();
		salaryAcc.withdraw(10000);
		salaryAcc.displayDetails();
	}

}
