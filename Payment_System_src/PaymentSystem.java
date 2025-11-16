package Online_Payment_System;

import java.util.Scanner;

public class PaymentSystem {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Payment p1=new CardPayment();
		System.out.println("Enter Payment ID: ");
		p1.setPaymentId(sc.nextLine());
		System.out.println("Enter Amount :");
		p1.setAmount(sc.nextDouble());
		sc.nextLine();
		System.out.println("Enter Payer Name:");
		p1.setPayerName(sc.nextLine());
		System.out.println("Enter Card Number");
		((CardPayment)p1).setCardNumber(sc.nextLine());
		System.out.println("Enter Cvv:");
		((CardPayment)p1).setCvv(sc.nextLine());
		p1.process();
		p1.printSummary();
		System.out.println("\n\n");
		p1=new UPIPayment();
		System.out.println("Enter Payment ID: ");
		p1.setPaymentId(sc.nextLine());
		System.out.println("Enter Amount :");
		p1.setAmount(sc.nextDouble());
		sc.nextLine();
		System.out.println("Enter Payer Name:");
		p1.setPayerName(sc.nextLine());
		System.out.println("Enter UPI ID :");
		((UPIPayment)p1).setUpiId(sc.nextLine());
		
		p1.process();
		p1.printSummary();
		p1.process();
		p1.printSummary();
	}

}
