package Emp.Model;


public class HR extends Employee {
	double commission;

	public HR() { // default constructor
		super();
		this.commission = 500;
	}

	public HR(int id, String name, double salary, double commission) { // Parameterized constructor
		super(id, name, salary);
		this.commission = commission;
	}

	double getCommission() {
		return commission;
	}

	void setCommission(double commission) {
		this.commission = commission;
	}

	// calculate salary function

	double calSal() {
		return this.basicSalary + this.commission;
	}

	@Override
	public String toString() {
		return super.toString() + "\nCommission= " + commission + "\n";
	}

	void display() {
		super.display();
		System.out.println("Commission :" + this.commission);
	}

}// hr class ends here
