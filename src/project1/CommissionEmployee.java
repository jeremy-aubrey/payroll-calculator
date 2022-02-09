package project1;

public class CommissionEmployee extends Employee {
	
	private int grossSales;
	private double commissionRate;

	public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, int grossSales, double commissionRate) {
		super(firstName, lastName, socialSecurityNumber);
		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
	}

	@Override
	public double earnings() {
		double earnings = grossSales * commissionRate;
		return earnings;
	}

}
