package week3.day1.assignments;

public class AxisBank extends BankInfo {
	public void deposit() {

		System.out.println("Minimum deposit of Rs 2,00,00,000 with no maximum limit on deposits");
	}

	public static void main(String[] args) {

		BankInfo bankInfo = new BankInfo();
		bankInfo.saving();
		bankInfo.fixed();
		bankInfo.deposit();

		AxisBank axisBank = new AxisBank();
		axisBank.deposit();
	}
}

