package Emp.App;

import Emp.Controller.EmployeeController;
import Emp.view.EmployeeView;

public class EmployeeApp {
	
		public static void main(String[] args) {
			EmployeeController bc = new EmployeeController();
			EmployeeView view = new EmployeeView(bc);

			view.showOptions();
		
	}


}
