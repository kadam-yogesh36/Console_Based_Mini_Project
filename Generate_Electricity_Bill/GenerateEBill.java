package Electricity_Bill;

import java.util.Scanner;

public class GenerateEBill {
	public static void main(String[] args) {
		
		        Scanner sc = new Scanner(System.in);

		        System.out.println("Select Customer Type:");
		        System.out.println("1. Residential");
		        System.out.println("2. Commercial");
		        System.out.print("Enter choice: ");
		        int choice = sc.nextInt();

		        sc.nextLine(); 

		        System.out.print("Enter Customer Name: ");
		        String name = sc.nextLine();

		        System.out.print("Enter Units Consumed: ");
		        int units = sc.nextInt();

		        ElectricityBill bill;
		        sc.close();
		        
		        // SWITCH STATEMENT
		    
		        switch (choice) {

		            case 1:
		                bill = new ResidentialBill(units,name);
		                break;

		            case 2:
		                bill = new CommercialBill(units,name);
		                break;

		            default:
		                System.out.println("Invalid choice!");
		                return; 
		        }

		        System.out.println("\n----- BILL SUMMARY -----");
		        bill.generateBill();
		        
		    }
		

	}


