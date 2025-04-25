package week4.day1;

public class Amazon extends CanaraBank {

	@Override
	public void cashOnDelivery() {
		System.out.println("Cash On Delivery");
		
	}

	@Override
	public void upiPayments() {
		System.out.println("UPI Payment Done");
		
	}

	@Override
	public void cardPayments() {
		System.out.println("Card Payments Done");
		
	}

	@Override
	public void internetBanking() {
		System.out.println("Internet Banking Activated");
		
	}

	public static void main(String[] args) {
		
		Amazon amazonOptions=new Amazon();
		amazonOptions.cardPayments();
		amazonOptions.cashOnDelivery();
		amazonOptions.internetBanking();
		amazonOptions.upiPayments();
		amazonOptions.recordPaymentDetails();
	}

	}


