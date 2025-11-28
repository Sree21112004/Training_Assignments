package oopsprmgs;

class BankAcc{
	private long accNo;
	private float balance;
	public long getAccNo() {
		return accNo;
	}
	public void setAccNo(long accNo) {
		this.accNo = accNo;
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	
}
public class EncapsulationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAcc bankAcc= new BankAcc();
		bankAcc.setAccNo(34567890);
		long accNo = bankAcc.getAccNo();
		System.out.println("Acc No: "+accNo);
		bankAcc.setBalance(90000.99f);
		float balance = bankAcc.getBalance();
		System.out.println("Balance: Rs. "+balance);
	}

}
