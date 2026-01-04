package Emp.Dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import Emp.Model.*;

public class EmployeeDAO {
	public static ArrayList<Employee> eAL = new ArrayList<Employee>();
     static  final String  FILE_NAME="C:\\Users\\acer\\Desktop\\Employeedata.txt";
      
      
      static {
    	  File file=new File(FILE_NAME);
    	  if(file.exists() && file.length()>0) {
    		 
    		  loadFromFile();
    		  
    		  
    	  }
    	  else
    	  {
    		  
    		  EmployeeDAO.addDefaultEmployee();
    		  saveToFile();
    		  
    	  }
      }
      
      
      
	static void addDefaultEmployee(){

		eAL.add(new SalesManager(1020, "Yogesh Patil", 25000, 1500, 10));
		eAL.add(new SalesManager(1030, "shankar ingle", 35000, 15200, 12));
		eAL.add(new SalesManager(485, "Pradip rathod", 20000, 1000, 18));
		eAL.add(new SalesManager(354, "Rohan Patil", 30000, 2500, 15));
		eAL.add(new Admin(2029, "Sneha ingle", 45000, 4500));
		eAL.add(new Admin(2022, "Sapana ", 45000, 450));
		eAL.add(new Admin(2028, "Pavan ingle", 50000, 455));
		eAL.add(new Admin(552, "Pratik Pavar", 35000, 458));
		eAL.add(new Admin(875, "Pallavi Shinde", 2458, 254));
		eAL.add(new HR(1577, "Shantanu khise", 25455, 5875));
		eAL.add(new HR(3026, "Shubham Akymwar", 45755, 2545));
		eAL.add(new HR(15, "Omkar Kadam", 35455, 6525));
		eAL.add(new HR(055, "Amol Avlod", 47858, 3545));
	}

	private static void loadFromFile() {
		try (ObjectInputStream ois=new ObjectInputStream(new FileInputStream(FILE_NAME))){
			try {
				eAL=(ArrayList<Employee>) ois.readObject();
			} catch (ClassNotFoundException e) {
				
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			
			System.out.println("File Not Found!......"+FILE_NAME);
		} catch (IOException e) {
			
			e.printStackTrace();
		} 
		
	}

	public static  boolean addEmployee(Employee e) {
		for(Employee emp:eAL) {
			if(emp.getE_Id()==e.getE_Id()) {
				return false;
			}
				
		}
		eAL.add(e);
		saveToFile();
		return true;

	}

	public Employee searchEmployee(int eid) {

		// Using Advanced Loop

		for (Employee e : eAL) {
			if (e.getE_Id() == eid) {
				return e; // Found
			}
		}
		return null;

	}

	public boolean updateEmployee(int id, double salary) {

		// Using Advanced Loop
		for (Employee e : eAL) {
			if (e.getE_Id() == id) {
				e.setBasicSalary(salary); 
				saveToFile();// salary Update                
				return true;
			}
			
		}

		return false;

	}

	public boolean removeEmployee(int id) {
		// Using Advanced Loop
		for (Employee e : eAL) {
			if (e.getE_Id() == id) {
				eAL.remove(e);
				saveToFile();
				return true;
			}

		}
		return false;

	}

	public void showAllEmployee() {
	    if (eAL.isEmpty()) {
	        System.out.println("No employees found!");
	        return;
	    }

	    // Table Header
	    System.out.printf("%-5s | %-20s | %-10s%n", "ID", "Name", "Salary");
	    System.out.println("---------------------------------------------");

	    // Table Rows
	    for (Employee e : eAL) {
	        System.out.printf("%-5d | %-20s | %-10.2f%n",
	                e.getE_Id(),     // integer
	                e.getName(),   // string
	                e.getBasicSalary());  // double/float
	        
	    }
	}



	public List<Employee> getEmployee() {

		return eAL;
	}

	
	
	//SaveToFile Funtion 
	
	static void saveToFile() {
		try 
			(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
				oos.writeObject(eAL);
			
		} catch (FileNotFoundException e) {
			
			System.out.println(e);
		} catch (IOException e) {
			
			System.out.println(e);
		}
		
	}
}
