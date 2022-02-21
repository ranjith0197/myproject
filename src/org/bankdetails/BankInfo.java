
package org.bankdetails;

public class BankInfo extends AxisBank{
	private void savings() {
		// TODO Auto-generated method stub
		System.out.println("savings");
	}
	private void fixed() {
		// TODO Auto-generated method stub
		System.out.println("fixed");
	}
	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		super.deposit();
		System.out.println("deposit 2");
	}
	public static void main(String[] args) {
		BankInfo b=new BankInfo();
		b.savings();
		b.fixed();
		b.deposit();
	}

}
