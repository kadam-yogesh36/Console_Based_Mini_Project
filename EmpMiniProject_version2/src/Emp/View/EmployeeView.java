package Emp.View;

import java.util.List;
import java.util.Scanner;
import Emp.Model.*;
import Emp.exceptionhandling.InputHelper;
import Emp.Controller.EmployeeController;

public class EmployeeView {
	
	
	static {
	    System.out.println(
	        "\u001B[36m====================================================\n" +
	        "   WELCOME TO EMPLOYEE MANAGEMENT SYSTEM\n" +
	        "====================================================\u001B[0m\n" +

	        "\u001B[33mProject Name  :\u001B[0m Employee Management System\n" +
	        "\u001B[33mProject Type  :\u001B[0m Console Based Java Application\n" +
	        "\u001B[33mDeveloped By  :\u001B[0m Kadam Yogesh\n" +
	        "\u001B[33mTechnology    :\u001B[0m Core Java\n" +

	        "\u001B[36m----------------------------------------------------\u001B[0m\n" +

	        "\u001B[32mFeatures:\u001B[0m\n" +
	        "- Add New Employee\n" +
	        "- View Employee Details\n" +
	        "- Update Employee Information\n" +
	        "- Delete Employee Record\n" +
	        "- Search Employee by ID\n" +

	        "\u001B[36m----------------------------------------------------\u001B[0m\n" +

	        "\u001B[34mPlease select an option from the menu to continue...\u001B[0m\n" +

	        "\u001B[36m====================================================\u001B[0m\n"
	    );
	}


    EmployeeController ec = new EmployeeController();

    public EmployeeView(EmployeeController bc) {
        this.ec = bc;
    }

    Scanner sc = new Scanner(System.in);

  
    

   
    public void showOptions() {

        int choice = -1;
        int id;
        double salary;

        do {

            System.out.println("==============* Employee Management System *================");
            System.out.println("1. Add Employee");
            System.out.println("2. Search Employee");
            System.out.println("3. Update Employee");
            System.out.println("4. Remove Employee");
            System.out.println("5. Sort Employees");
            System.out.println("6. Show All Employees");
            System.out.println("0. Exit....");

            choice = InputHelper.getInt("Enter Choice->");

            switch (choice) {

                
                case 1:
                    int ch;

                    do {
                        System.out.println("\n1. Sales Manager\n2. Admin\n3. HR\n0. Exit");
                        ch = InputHelper.getInt("Enter Choice->");

                        switch (ch) {

                            case 1:
                                id = getUniqueId(); 
                                String name = InputHelper.getValidName("Enter Name:");
                                salary = InputHelper.getDouble("Enter Salary:");
                                double incentive = InputHelper.getDouble("Enter Incentive:");
                                int target = InputHelper.getInt("Enter Target:");

                                if (ec.addEmployee(new SalesManager(id, name, salary, incentive, target))) {
                                    System.out.println("SalesManager Added Successfully!");
                                }
                                break;

                            case 2:
                                id = getUniqueId(); // ← use here too
                                name = InputHelper.getValidName("Enter Name:");
                                salary = InputHelper.getDouble("Enter Salary:");
                                double allowance = InputHelper.getDouble("Enter Allowance:");

                                if (ec.addEmployee(new Admin(id, name, salary, allowance))) {
                                    System.out.println("Admin Added Successfully!");
                                }
                                break;

                            case 3:
                                id = getUniqueId(); // ← and here
                                name = InputHelper.getValidName("Enter Name:");
                                salary = InputHelper.getDouble("Enter Salary:");
                                double csmn = InputHelper.getDouble("Enter Commission:");

                                if (ec.addEmployee(new HR(id, name, salary, csmn))) {
                                    System.out.println("HR Added Successfully!");
                                }
                                break;

                            case 0:
                                System.out.println("Returning to main menu…");
                                break;

                            default:
                                System.out.println("❌ Invalid choice! Please enter only 1, 2, 3 or 0.");
                                continue; // loop continues
                        }

                    } while (ch != 0);

                    break; // break case 1

                case 2:
                    id = InputHelper.getInt("Search Employee By ID (Enter ID):");
                    Employee emp = ec.searchEmployeeById(id);

                    if (emp != null)
                        System.out.println("Found: " + emp);
                    else
                        System.out.println("Employee not found.");
                    break;

                case 3:
                    id = InputHelper.getInt("Enter ID to Update: ");
                    salary = InputHelper.getDouble("Enter New Salary: ");

                    if (ec.updateEmployee(id, salary))
                        System.out.println("Updated Successfully!");
                    else
                        System.out.println("Employee Not Found!");
                    break;

                case 4:
                    id = InputHelper.getInt("Enter ID To Remove: ");

                    if (ec.removeEmployee(id))
                        System.out.println("✅ Removed Successfully!");
                    else
                        System.out.println("❌ Employee Not Found!");

                    break;

                
                case 5:
                    int sortChoice = -1;

                    do {
                        System.out.println("1. Sort by ID");
                        System.out.println("2. Sort by Salary");
                        System.out.println("3. Sort by Name");
                        System.out.println("0. Exit");
                        sortChoice = InputHelper.getInt("Enter Choice: ");

                        if (sortChoice == 0) {
                            System.out.println("Exiting sort menu...");
                            break;
                        }

                        List<Employee> sortedList = ec.sortEmployee(sortChoice);

                        if (sortedList != null)
                            System.out.println(sortedList);

                    } while (sortChoice != 0);

                    break;

                
                case 6:
                    ec.showAllEmployee();
                    break;

                case 0:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid Input!");
                    
            }

        } while (choice != 0);
    }
    
    
    public int getUniqueId() {
        int id;
        do {
            id = InputHelper.getInt("Enter ID: ");

            
            if (ec.isIdExists(id)) {
                System.out.println("❌ This ID already exists! Please enter a different ID.");
            } else {
                break;  
            }

        } while (true);

        return id;
    }
}
