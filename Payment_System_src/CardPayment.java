package Online_Payment_System;

import java.util.Scanner;

public class CardPayment extends Payment{
    String cardNumber;
    String cvv;
private String cardPin;
    
    
    
    
	 public CardPayment() {
		super();
		this.cardNumber = "1234567890115234";
		this.cvv = "365";
		this.cardPin="0001";
		
		
	}
	
	 public CardPayment(String paymentId, double amount, String payerName, String cardNumber, String cvv,String pin) {
		super(paymentId, amount, payerName);
		this.cardNumber = cardNumber;
		this.cvv = cvv;
		this.cardPin=pin;
	}
	 public String getCardNumber() {
		 return cardNumber;
	 }
	 public void setCardNumber(String cardNumber) {
		 this.cardNumber = cardNumber;
	 }
	 public String getCvv() {
		 return cvv;
	 }
	 public void setCvv(String cvv) {
		 this.cvv = cvv;
	 }
	 
	 
	 public String getCardPin() {
		return cardPin;
	}

	 public void setCardPin(String cardPin) {
		 this.cardPin = cardPin;
	 }

	 void printSummary() {
		 super.printSummary();
		 System.out.println("Card Number : **** **** **** " + cardNumber.substring(12));
		 System.out.println("CVV : ***");
		 
	 }
	 
	boolean validate() { 
		
         Scanner sc=new Scanner(System.in);
		System.out.print("Enetr 4 Digit Card PIN : ");
		String inputpin=sc.nextLine();
		
		
		System.out.println("Validating Payment....");
		
		
		if(amount <=0) {
			   System.out.println("❌ Amount must be greater than 0");
	            return false;
		}
		
		 if (!inputpin.equals(this.cardPin)) {
		        System.out.println("❌ Incorrect PIN!");
		        return false;
		    }
		if(! cardNumber.matches("\\d{16}")) {
			System.out.println("❌ Card number must be exactly 16 digits");
           return false;
			
		}
		
		if(!cvv.matches("\\d{3}")) {
			
			System.out.println("❌ CVV must be exactly 3 digits");
           return false;
		}
		
		
		
		
		 if (!inputpin.matches("\\d{4}")) {
	            System.out.println("❌ PIN must be exactly 4 digits");
	            return false;
	        }
		  System.out.println("✅ Card Validation Successful!");
	        return true;
	        
	        
	}
	// deductAmount function override
	void deductAmount() {
		
		  System.out.println("💳 Deducting amount ₹" + amount + " from card: " + cardNumber);
		  
	}
    
	// sendNotofication function Override
	void sendNotification() {
		
		 System.out.println("📩 Sending payment notification to " + payerName);
	}
    

     
}//class cardPayment ends here


