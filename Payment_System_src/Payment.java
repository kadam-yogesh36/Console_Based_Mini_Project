package Online_Payment_System;

 enum Status{
	 PENDING,
	 SUCCESS,
	 FAILED
 }

public abstract class Payment{
	    String paymentId;
	    double amount;
	    String payerName;
	    Status status=Status.PENDING;
	    
	    
	    
	    
		public Payment(String paymentId, double amount, String payerName) {
			super();
			this.paymentId = paymentId;
			this.amount = amount;
			this.payerName = payerName;
			
		}
		public Payment() {
			super();
			this.paymentId = "PP48752545";
			this.amount = 500;
			this.payerName = "Yogesh Patil";
			
		}
		public String getPaymentId() {
			return paymentId;
		}
		public void setPaymentId(String paymentId) {
			this.paymentId = paymentId;
		}
		public double getAmount() {
			return amount;
		}
		public void setAmount(double amount) {
			this.amount = amount;
		}
		public String getPayerName() {
			return payerName;
		}
		public void setPayerName(String payerName) {
			this.payerName = payerName;
		}
		public Status getStatus() {
			return status;
		}
		public void setStatus(Status status) {
			this.status = status;
		}
	    
		
		
		final void process() {
			
			System.out.println("\nProccessing Payment......");
			
			// validate Payment details
			
			if(! validate()) {
				
			System.out.println("❌ Validation failed!");
			 status=Status.FAILED;
			 return;
			 
			}
			
			
			 
			
			
			//deductAmount function call
			deductAmount();
			//SendNotification  function call
			sendNotification();
			
			
			 status = Status.SUCCESS;
		      System.out.println("✔ Payment successful!");
			
			
		}
		
		
		abstract boolean validate();
		abstract void deductAmount();
		abstract void sendNotification();
		//display function
		void printSummary() {
	        System.out.println("----- Payment Summary -----");
	        System.out.println("Payment ID : " + paymentId);
	        System.out.println("Payer Name : " + payerName);
	        System.out.println("Amount     : " + amount);
	        System.out.println("Status     : " + status);
	       
	    }
		
		
		
	    
	    
	    
	    
	
}//class payment ends here

 
