package Emp.app;

import Emp.View.EmployeeView;
import Emp.Controller.EmployeeController;

public class EmployeeApp {
	
		public static void main(String[] args) {
			EmployeeController bc = new EmployeeController();
			EmployeeView view = new EmployeeView(bc);

			view.showOptions();
		
	}


}
