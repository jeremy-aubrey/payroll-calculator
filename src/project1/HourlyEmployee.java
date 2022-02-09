package project1;

public class HourlyEmployee extends Employee {
	
	private double wage;
	private int hours;

	public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double wage, int hours) {
		super(firstName, lastName, socialSecurityNumber);
		this.wage = wage;
		this.hours = hours;
	}

	@Override
	public double earnings() {
		// TODO Auto-generated method stub
		return 0;
	}

}
