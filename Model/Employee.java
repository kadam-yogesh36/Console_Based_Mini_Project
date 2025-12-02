package Emp.Model;

public abstract class Employee {
	int e_Id;
	String name;
	double basicSalary;

	Employee() { // default constructor

		this.e_Id = 5021;
		this.name = "Shubham";
		this.basicSalary = 15000;
	}

	Employee(int e_Id, String name, double basicSalary) { // Parameterized constructor
		super();

		this.e_Id = e_Id;
		this.name = name;
		this.basicSalary = basicSalary;
	}

	public int getE_Id() {
		return e_Id;
	}

	void setE_Id(int e_Id) {
		this.e_Id = e_Id;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}

	@Override
	public String toString() {
		return "\nEmployee_ Id= " + e_Id + "\nEmployee Name=" + name + "\nBasic Salary=" + basicSalary;
	}

	// calculate salary function
	abstract double calSal();

	void display() {
		System.out.println("Employee ID: " + this.e_Id);
		System.out.println("Employee Name: " + this.name);
		System.out.println("Salary : " + this.basicSalary);
	}

}// Employeee class ends here