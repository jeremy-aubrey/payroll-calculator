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
//                 abstract Employee class. PieceEmployee implements the abstract
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
		
		//do not allow negative inputs
		if(wage >= 0) {
			this.wage = wage;
		} else {
			this.wage = 0.00;
		}
		
		if(pieces >= 0) {
			this.pieces = pieces;
		} else {
			this.pieces = 0;
		}
		
	}//end constructor
	
    //***************************************************************
    //
    //  Method:       getWage (Non Static)
    // 
    //  Description:  Returns the employee's wage.
    //
    //  Parameters:   None
    //
    //  Returns:      double 
    //
    //***************************************************************
    public double getWage() {
		
    	return wage;
    	
	}//end getWage method

    //***************************************************************
    //
    //  Method:       setWage (Non Static)
    // 
    //  Description:  Sets the employee's wage if value is non-negative.
    //
    //  Parameters:   double
    //
    //  Returns:      N/A 
    //
    //***************************************************************
	public void setWage(double wage) {
		
		if(wage >= 0) {
			this.wage = wage;
		} else {
			this.wage = 0.00;
		}
		
	}//end setWage method

    //***************************************************************
    //
    //  Method:       getPieces (Non Static)
    // 
    //  Description:  Returns the employee's pieces produced.
    //
    //  Parameters:   None
    //
    //  Returns:      int 
    //
    //***************************************************************
	public int getPieces() {
		
		return pieces;
		
	}//end getPieces method

    //***************************************************************
    //
    //  Method:       setPieces (Non Static)
    // 
    //  Description:  Sets the employee's pieces produced if value is 
    //                non-negative.
    //
    //  Parameters:   int
    //
    //  Returns:      N/A 
    //
    //***************************************************************
	public void setPieces(int pieces) {

		if(pieces >= 0) {
			this.pieces = pieces;
		} else {
			this.pieces = 0;
		}
		
	}//end setPieces method

    //***************************************************************
    //
    //  Method:       earnings (Non Static)
    // 
    //  Description:  Calculates the earnings for a PieceEmployee.
    //                Earnings are defined as the product of the 
    //                number of pieces produces and the wage per piece.
    //                Prints earnings details.
    //
    //  Parameters:   None
    //
    //  Returns:      double 
    //
    //**************************************************************
	@Override
	public double earnings() {

		System.out.println("Wage Per Peice: $" + wage + "; Pieces produced: " + pieces);
		return wage * pieces;
		
	}//end earnings method
	
}//end PieceEmployee class
