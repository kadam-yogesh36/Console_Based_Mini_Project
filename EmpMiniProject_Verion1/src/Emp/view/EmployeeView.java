package Emp.view;


import java.util.InputMismatchException;
import java.util.Scanner;

import Emp.Controller.EmployeeController;
import Emp.Model.*;


public class EmployeeView {
	EmployeeController bc = new EmployeeController();

	public EmployeeView(EmployeeController bc) {
		super();
		this.bc = bc;
	}

	Scanner sc = new Scanner(System.in);

	public void showOptions() {
      
		int choice=-1;
		int ch;
		int id;
		double salary;
		do {
			try {
			System.out.println("==============* Employee Management System *================");
			System.out.println("1. Add Employee");
			System.out.println("2. Search Employee");
			System.out.println("3. Update Employee");
			System.out.println("4. Remove Employee");
			System.out.println("5. Show All Employees");
			System.out.println("0. Exit....");
			System.out.println("Enter choice->");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
                  try {
				System.out.println("\n1.Salesmanager\n2. Admin\n3. HR\nEnter Choice->");
				 ch = sc.nextInt();
				System.out.println("Enter ID:");
			     id = sc.nextInt();
				sc.nextLine();
				System.out.println("Enter Name:");
				String name = sc.nextLine();
				System.out.println("Enter BasicSalary:");
				 salary = sc.nextDouble();
				

				if (ch == 1) {
					System.out.println("Enter Incetives:");
					double incentive = sc.nextDouble();
					System.out.println("Enter Target:");
					int target = sc.nextInt();
					if(bc.addEmployee(new SalesManager(id, name, salary, incentive, target))) {
					System.out.println("SalesManager Added Succesfully ✅......");
					}
					
				} else if (ch == 2) {
					System.out.println("Enter Allowance:");
					double allowance = sc.nextDouble();
					if(bc.addEmployee(new Admin(id, name, salary, allowance))) {
					System.out.println("Admin Added Succesfully ✅......");
					}
				} else if (ch == 3) {
					System.out.println("Enter Commission:");
					double csmn = sc.nextDouble();
					if(bc.addEmployee(new HR(id, name, salary, csmn))) {
					System.out.println("HR Added Succesfully ✅......");
					}
					
					

				} else {
					System.out.println("❌Invalid Type......");
				}
                  }
                  catch(InputMismatchException e) {
                	  System.out.println("Enter Valid Input!........");
                	  sc.nextLine();
                	  
                  }
				break;

			case 2:
				try {
				System.out.println("Search Employee By ID (Enter ID):");
				id = sc.nextInt();
				Employee e = bc.searchEmployeeById(id);
				if (e != null)
					System.out.println("Found: " + e);
				else
					System.out.println("Employee not found.");
				} catch(InputMismatchException e) {
					System.out.println("Invalid Input!...Enter Numbers Only...");
				}
				break;
			case 3:
				try {
				System.out.println("Enter Id to Update: ");
				id = sc.nextInt();
				System.out.println("Enter new Salary: ");
				salary = sc.nextDouble();
				if (bc.updateEmployee(id, salary)) {
					System.out.println("updated Succesfully!.....");
				} else {
					System.out.println("Employee Not Found!....");
				}
				}
				catch(InputMismatchException e) {
					System.out.println("Invalid Input!...Enter Numbers Only...");
				}
				break;
			case 4:
				try {
				System.out.println("Enter Id to Remove:");
				id = sc.nextInt();
				if (bc.removeEmployee(id)) {
					System.out.println("✅Remove SuccessFully!....");
				} else {
					System.out.println("❌Employee Not Found!....");
				}
				}
				catch(InputMismatchException e) {
					System.out.println("Invalid Input!...Enter Numbers Only...");
				}
				
				break;

			case 5:
				
				bc.showAllEmployee();
				break;

			}
			}
			
			catch (InputMismatchException e) {
	            System.out.println("❌ Invalid input! Enter only numbers.");
	            sc.nextLine(); // clear invalid input
	        }

		

		} while (choice != 0);

	}

}
