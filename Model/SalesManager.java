package Emp.Model;



public class SalesManager extends Employee {

	double incentives;
	int target;

	SalesManager() { // default constructor
		super();
		this.incentives = 1500;
		this.target = 1500000;
	}

	public SalesManager(int id, String name, double salary, double incentives, int target) { // Parameterized constructor
		super(id, name, salary);

		this.incentives = incentives;
		this.target = target;
	}

	double getIncentives() {
		return incentives;
	}

	void setIncentives(double incentives) {
		this.incentives = incentives;
	}

	int getTarget() {
		return target;
	}

	void setTarget(int target) {
		this.target = target;
	}

	// calculate salary function

	// calculate salary function
	double calSal() {
		return basicSalary + incentives;
	}

	public String toString() {

		return super.toString() + "\nIncentives = " + incentives + "\nTarget = " + target + "\n";
	}

	void display() {
		super.display();
		System.out.println("Incentives is : " + this.incentives);
		System.out.println("Target : " + this.target);
	}

}// Sales Manager class ends here
