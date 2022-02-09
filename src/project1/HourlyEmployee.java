package project1;

public class HourlyEmployee extends Employee {
	
	private double wage;
	private double hours;

	public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double wage, double hours) {
		super(firstName, lastName, socialSecurityNumber);
		this.wage = wage;
		this.hours = hours;
	}

	@Override
	public double earnings() {
		System.out.println("Hourly wage: $" + wage + "; Hours Worked: " + String.format("%.2f", hours));
		double earnings = wage * hours;
		return earnings;
	}

}
