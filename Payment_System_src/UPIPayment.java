package Online_Payment_System;

import java.util.Scanner;

public class UPIPayment extends Payment {
	                String upiId;
                    String upiPin;
	                 //Default constructor
	  
					public UPIPayment() {
						super();
						this.upiId="Yogesh@ybl";
						this.upiPin="0045";
					}

					//parameterized constructor
					public UPIPayment(String paymentId, double amount, String payerName, String upiId,String upipin) {
						super(paymentId, amount, payerName);
						this.upiId = upiId;
						this.upiPin=upipin;
					}
                       //setters and getters
					public String getUpiId() {
						return upiId;
					}

					public void setUpiId(String upiId) {
						this.upiId = upiId;
					}
	                
					
					
					public String getUpiPin() {
						return upiPin;
					}

					public void setUpiPin(String upiPin) {
						this.upiPin = upiPin;
					}

					void printSummary() {
						super.printSummary();
						System.out.println("UPI ID :"+this.upiId);
					}
	                
					boolean validate() {

				         Scanner sc=new Scanner(System.in);
						System.out.print("Enetr 4 Digit UPI PIN : ");
						String inputpin=sc.nextLine();
						
						
						if (!upiId.contains("@") || upiId.indexOf("@") != upiId.lastIndexOf("@")) {
						    System.out.println("❌ Invalid UPI ID format");
						    return false;
						}
						
						if(amount <1 || amount > 100000) {
							
							System.out.println("❌ Amount must be between 1 and 100000");
				            return false;
							
						}
						if (!inputpin.equals(this.upiPin)) {
						    System.out.println("❌ Incorrect UPI PIN!");
						    return false;
						}
						
						if (!inputpin.matches("\\d{4}")) {
				            System.out.println("❌ PIN must be exactly 4 digits");
				            return false;
				        }
					  System.out.println("✅ UPI Validation Successful!");
				        return true;
				}//validation functions ends here
					
					
					void deductAmount() {
						
						System.out.println("📱 Deducting ₹" + amount + " via UPI ID: " + upiId);
						
					}
					
					void sendNotification() {
						 System.out.println("🔔 Sending UPI Payment Notification to " + payerName);
					}
                 
					
					
					
}// class upiPayment ends here
