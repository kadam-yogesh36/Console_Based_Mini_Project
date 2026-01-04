package Emp.Controller;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import Emp.Dao.EmployeeDAO;
import Emp.Model.Employee;

public class EmployeeController {
    EmployeeDAO ed = new EmployeeDAO();

    public boolean addEmployee(Employee e) {
        if (ed.addEmployee(e)) {
            return true;
        } 
        return false;
    }

    public Employee searchEmployeeById(int eid) {
        Employee e1 = ed.searchEmployee(eid);
        if (e1 != null) {
            return e1;
        }
        return null;
    }

    public boolean updateEmployee(int id, double salary) {
        if (ed.updateEmployee(id, salary)) {
            return true;
        }
        return false;
    }

    public boolean removeEmployee(int id) {
        if (ed.removeEmployee(id)) {
            return true;
        }
        return false;
    }

    public void showAllEmployee() {
        ed.showAllEmployee();
    }

    public List<Employee> sortEmployee(int search) {
        List<Employee> emplist = ed.getEmployee();
        switch (search) {
            case 1:
                Collections.sort(emplist, new Comparator<Employee>() {
                    @Override
                    public int compare(Employee e1, Employee e2) {
                        return e1.getE_Id() - e2.getE_Id();
                    }
                });
                break;
            case 2:
                Collections.sort(emplist, new Comparator<Employee>() {
                    @Override
                    public int compare(Employee e1, Employee e2) {
                        return (int) (e1.getBasicSalary() - e2.getBasicSalary());
                    }
                });
                break;
            case 3:
                Collections.sort(emplist, new Comparator<Employee>() {
                    public int compare(Employee e1, Employee e2) {
                        return e1.getName().compareToIgnoreCase(e2.getName());
                    }
                });
                break;
            default:
                System.out.println("Invalid Choice!...");
                return null;
        }
        return emplist;
    }

   
    public boolean isIdExists(int id) {
        List<Employee> list = ed.getEmployee(); // get current employee list from DAO
        for (Employee e : list) {
            if (e.getE_Id() == id) {
                return true;
            }
        }
        return false; // ID is unique
    }

}
