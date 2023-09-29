package week3.day2;

public class Amazon extends CanaraBank{
 

	@Override
	public void cashOnDelivery() {
		System.out.println("COD done");
	}

	@Override
	public void upiPayments() {
		System.out.println("UPI done");
		
	}

	@Override
	public void cardPayments() {
		System.out.println("CardPayment done");
	}

	@Override
	public void internetBanking() {
		System.out.println("InternetBanking done");
		
	}
	public static void main(String[] args) {
        Amazon amazon = new Amazon();
        amazon.recordPaymentDetails();
    	
        amazon.cashOnDelivery();
        amazon.upiPayments();
        amazon.cardPayments();
        amazon.internetBanking();

      
}
	
}

