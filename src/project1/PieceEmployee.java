package project1;

public class PieceEmployee extends Employee {
	
	private double wage;
	private int pieces;
	
	public PieceEmployee(String firstName, String lastName, String socialSecurityNumber, double wage, int pieces) {
		super(firstName, lastName, socialSecurityNumber);
		this.wage = wage;
		this.pieces = pieces;
	}

	@Override
	public double earnings() {
		// TODO Auto-generated method stub
		return 0;
	}

}
