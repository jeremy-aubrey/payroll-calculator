package project1;

public class BasePlusCommissionEmployee extends CommissionEmployee {
	
	private double baseSalary;
	
	public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate, double baseSalary) {
		super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
		this.baseSalary = baseSalary;
	}
	
	@Override
	public double earnings() {
		System.out.print("Base Salary: $" + String.format("%.2f", baseSalary) + "; ");
		double earnings = super.earnings() + baseSalary;
		return earnings;
	}

}
