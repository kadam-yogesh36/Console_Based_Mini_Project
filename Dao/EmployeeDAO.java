package Emp.Dao;
import Emp.Model.*;


public class EmployeeDAO {
	  static Employee [] eArr;
	  static int count;
	  
	  static {
		  eArr=new Employee[14];
		  count=0;
		  eArr[count++]=new SalesManager(1020,"Yogesh Patil",25000,1500,10);
		  eArr[count++]=new SalesManager(1030,"shankar ingle",35000,15200,12);
		  eArr[count++]=new SalesManager(1050,"Pradip rathod",20000,1000,18);
		  eArr[count++]=new SalesManager(1040,"Rohan Patil",30000,2500,15);
		  eArr[count++]=new Admin(2021,"Sneha ingle",45000,4500);
		  eArr[count++]=new Admin(2022,"Sapana ",45000,450);
		  eArr[count++]=new Admin(2023,"Pavan ingle",50000,455);
		  eArr[count++]=new Admin(2023,"Pratik Pavar",35000,458);
		  eArr[count++]=new Admin(2024,"Pallavi Shinde",2458,254);
		  eArr[count++]=new HR(3025,"Shantanu khise",25455,5875);
		  eArr[count++]=new HR(3026,"Shubham Akymwar",45755,2545);
		  eArr[count++]=new HR(3027,"Omkar Kadam",35455,6525);
		  eArr[count++]=new HR(3028,"Amol Avlod",47858,3545);
	  }

	  public boolean addEmployee(Employee e) {
		     if(count<eArr.length) {
		    	 eArr[count++]=e;
		    	 return true;
		     }
		return false;
	  }

	  public Employee searchEmployee(int eid) {
              for(int i=0;i<count;i++) {
            	  if(eArr[i].getE_Id()==eid) {
            		  return eArr[i];
            	  }
              }
            
		return null;
	  }

	  public boolean updateEmployee(int id, double salary) {
		  for(int i=0;i<count;i++) {
        	  if(eArr[i].getE_Id()==id) {
        		  eArr[i].setBasicSalary(salary);
        		  return true;
        	  }
        		
        	  }
		return false;
	  }

	  public boolean removeEmployee(int id) {
		  for(int i=0;i<count;i++) {
        	  if(eArr[i].getE_Id()==id) {
        		  for(int j=i;j<count;j++) {
        			  eArr[j]=eArr[j+1];
        		  }
        		  eArr[--count] =null;
        		  return true;
        	  }
        		 
        	  }
		return false;
	  }

	  public void showAllEmployee() {
		  for(int i=0;i<count;i++) {
			  System.out.println("------------Details Of Employeee "+(i+1)+"--------------------");
			  System.out.println(eArr[i]);
		  }
		
	  }
	  
	  

}
