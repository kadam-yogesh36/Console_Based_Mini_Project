package Emp.Model;



public class Admin extends Employee {

	double allowance;

	Admin() { // default constructor
		super();
		this.allowance = 2500;
	}

	public Admin(int id, String name, double salary, double allowance) { // parameterized constructor
		super(id, name, salary);
		this.allowance = allowance;
	}

	double getAllowance() {
		return allowance;
	}

	void setAllowance(double allowance) {
		this.allowance = allowance;
	}

	// calculate salary function

	double calSal() {
		return this.basicSalary + allowance;

	}

	@Override
	public String toString() {
		return super.toString() + "\nAllowance= " + allowance + "\n";
	}

	void display() {
		super.display();
		System.out.println("Allowance : " + this.allowance);
	}

}// Admin class Ends here