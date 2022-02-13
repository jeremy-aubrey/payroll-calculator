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
		
		//do not allow negative inputs
		if(baseSalary >= 0) {
			this.baseSalary = baseSalary;
		} else {
			this.baseSalary = 0.00;
		}
		
	}//end constructor
	
    //***************************************************************
    //
    //  Method:       getBaseSalary (Non Static)
    // 
    //  Description:  Returns the employee's base salary.
    //
    //  Parameters:   None
    //
    //  Returns:      double 
    //
    //***************************************************************
    public double getBaseSalary() {
    	
		return baseSalary;
		
	}//end getBaseSalary method

    //***************************************************************
    //
    //  Method:       setBaseSalary (Non Static)
    // 
    //  Description:  Sets the employee's base salary if value is 
    //                non-negative.
    //
    //  Parameters:   double
    //
    //  Returns:      N/A 
    //
    //***************************************************************
	public void setBaseSalary(double baseSalary) {
		
		if(baseSalary >= 0) {
			this.baseSalary = baseSalary;
		} else {
			this.baseSalary = 0.00;
		}
		
	}//end setBaseSalary method

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
