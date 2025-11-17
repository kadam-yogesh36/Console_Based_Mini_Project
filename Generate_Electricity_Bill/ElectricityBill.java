package Electricity_Bill;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public abstract class ElectricityBill {
	                 int units;
	                 String consumerName;
	                 
					 public ElectricityBill() {// Default  constructor
						super();
						this.units = 25;
						this.consumerName = "Yogesh Patil";
						
					}
					 public ElectricityBill(int units, String consumerName) {  //Parameterized Constructor
						super();
						this.units = units;
						this.consumerName = consumerName;
					}
					 
					 //setters and getters
					 public int getUnits() {
						 return units;
					 }
					 public void setUnits(int units) {
						 this.units = units;
					 }
					 public String getConsumerName() {
						 return consumerName;
					 }
					 public void setConsumerName(String consumerName) {
						 this.consumerName = consumerName;
					 }
					 
					 
	                 //showUasage Function....
					 void showUsage() {
						 System.out.println("\nConsumer Name : " +this.consumerName);
						 System.out.println("Units Consumed: "+this.units);
						 
					 }
					 
					 //abstract method calculateBill
					 abstract double calculateBill();
					 //generate BIll Final Method 
					 final void generateBill() {
						 
						 System.out.println("Generating Bill.........");
					        String billNo = "EB-" + (int) (Math.random() * 9000 + 1000);
					        String date = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm a"));
					        System.out.println("\n=================== ELECTRICITY BILL ====================");
					        System.out.println("Bill Number : " + billNo);
					        System.out.println("Date & Time : " + date);
					        System.out.println("Customer    : " + consumerName);
					        System.out.println("Units Used  : " + units);
						 
						 double amount=calculateBill();
						 
						 
						 //5% tax add
						 
				double tax=amount* 0.05;
				
				//fixed RS.50 charge
				double fixedCharge=50;
				
				double finalAmount=amount + tax +fixedCharge;
				
				System.out.println("Base Amount : RS. "+amount);
				 System.out.println("Tax (5%): RS. "+tax);
				 System.out.println("Fixed Charge : Rs. "+fixedCharge);
				 System.out.println("--------------------------------------------------------------------------------------");
				 System.out.println("Final BillAmount : "+finalAmount);
					
						 
						 
						 
	           }
					 
					 

}//class Electricity Bill ends here







