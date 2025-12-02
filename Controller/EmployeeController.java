package Emp.Controller;

import Emp.Dao.EmployeeDAO;
import Emp.Model.Employee;



public class EmployeeController {
	EmployeeDAO ed=new EmployeeDAO();
	

	public boolean addEmployee(Employee e) {
		if(ed.addEmployee(e)) {
			return true;
		}
		else
		{
			System.out.println("Array Is Full!.....");
		}
		
		return false;
              
	}

	public Employee searchEmployeeById(int eid) {
             Employee e1=ed.searchEmployee(eid);
             
             if(e1!=null) {
            	 return e1;
             }
		return null;
	}

	public boolean updateEmployee(int id, double salary) {
		
               if(ed.updateEmployee(id,salary))
               {
            	   return true;
               }
		          return false;
	}

	public boolean removeEmployee(int id) {
               if(ed.removeEmployee(id)) {
            	   return true;
               }
		return false;
	}

	public void showAllEmployee() {
		ed.showAllEmployee();

	}

}
