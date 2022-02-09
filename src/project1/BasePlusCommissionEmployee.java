//********************************************************************
//
//  Developer:     Jeremy Aubrey
//
//  Project #:     One
//
//  File Name:     BasePlusCommissionEmployee.java
//
//  Course:        COSC 4301 - Modern Programming
//
//  Due Date:      2/13/2022
//
//  Instructor:    Fred Kumi 
//
//  Description:   BasePlusCommissionEmployee concrete class that inherits 
//                 from the CommissionEmployee class. BasePlusCommissionEmployee 
//                 implements the abstract earnings method of Employee.
//
//********************************************************************

package project1;

public class BasePlusCommissionEmployee extends CommissionEmployee {
	
	private double baseSalary;
	
	//constructor
	public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, 
			double grossSales, double commissionRate, double baseSalary) 
	{	
		super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
		this.baseSalary = baseSalary;
		
	}//end constructor
	
    //***************************************************************
    //
    //  Method:       earnings (Non Static)
    // 
    //  Description:  Calculates the earnings for a BasePlusCommissionEmployee.
    //                Earnings are defined as the product of gross sales 
	//                and commission rate (implemented in super.earnings()) plus
	//                base salary. Prints earnings details.
	//                
    //  Parameters:   None
    //
    //  Returns:      double 
    //
    //***************************************************************
	@Override
	public double earnings() {
		
		System.out.print("Base Salary: $" + String.format("%.2f", baseSalary) + "; ");
		return super.earnings() + baseSalary;
		
	}//end earnings method

}//end BasePlusCommissionEmployee class
