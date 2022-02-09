package project1;

public class BasePlusCommissionEmployee extends CommissionEmployee {
	
	private int baseSalary;
	
	public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, int grossSales, double commissionRate, int baseSalary) {
		super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
		this.baseSalary = baseSalary;
	}

}
