//********************************************************************
//
//  Developer:     Jeremy Aubrey
//
//  Project #:     One
//
//  File Name:     CommissionEmployee.java
//
//  Course:        COSC 4301 - Modern Programming
//
//  Due Date:      2/13/2022
//
//  Instructor:    Fred Kumi 
//
//  Description:   CommissionEmployee concrete class that inherits from the 
//                 abstract Employee class. CommissionEmployee implements 
//                 the abstract earnings method of Employee.
//
//********************************************************************

package project1;

public class CommissionEmployee extends Employee {
	
	private double grossSales;
	private double commissionRate;
	
	//constructor
	public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate) {
		
		super(firstName, lastName, socialSecurityNumber);
		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
		
	}//end constructor

    //***************************************************************
    //
    //  Method:       earnings (Non Static)
    // 
    //  Description:  Calculates the earnings for a CommissionEmployee.
    //                Earnings are defined as the product of gross sales 
	//                and commission rate.
	//
    //  Parameters:   None
    //
    //  Returns:      double 
    //
    //***************************************************************
	@Override
	public double earnings() {
		
		System.out.println("Gross Sales: $" + String.format("%.2f", grossSales) + "; Commission Rate: " + commissionRate);
		return grossSales * commissionRate;
		
	}//end earnings method

}//end CommissionEmployee class
