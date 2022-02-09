//********************************************************************
//
//  Developer:     Jeremy Aubrey
//
//  Project #:     One
//
//  File Name:     PieceEmployee.java
//
//  Course:        COSC 4301 - Modern Programming
//
//  Due Date:      2/13/2022
//
//  Instructor:    Fred Kumi 
//
//  Description:   PieceEmployee concrete class that inherits from the 
//                 Employee class. PieceEmployee implements the abstract
//                 earnings method of Employee.
//
//********************************************************************

package project1;

public class PieceEmployee extends Employee {
	
	private double wage;
	private int pieces;
	
	//constructor
	public PieceEmployee(String firstName, String lastName, String socialSecurityNumber, double wage, int pieces) {
		
		super(firstName, lastName, socialSecurityNumber);
		this.wage = wage;
		this.pieces = pieces;
		
	}//end constructor
	
    //***************************************************************
    //
    //  Method:       earnings (Non Static)
    // 
    //  Description:  Calculates the earnings for a PieceEmployee.
    //                Earnings are defined as the product of the 
	//                number of pieces produces and the wage per piece.
	//
    //  Parameters:   None
    //
    //  Returns:      double 
    //
    //**************************************************************
	@Override
	public double earnings() {
		System.out.println("Wage Per Peice: $" + wage + "; Pieces produced: " + pieces);
		double earnings = wage * pieces;
		return earnings;
		
	}//end earnings method
	
}//end PieceEmployee class
