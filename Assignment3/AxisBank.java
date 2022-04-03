package week3.day1;

public class AxisBank extends BankInfo {
	
	public void deposit() {
		
		System.out.println("deposit amount is 10000");
	}

	public static void main(String[] args) {
		
		AxisBank amount = new AxisBank();
		amount.deposit();

	}

}
