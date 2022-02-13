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
	public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, 
			double grossSales, double commissionRate) 
	{	
		super(firstName, lastName, socialSecurityNumber);
		
		//do not allow negative inputs
		if(grossSales >= 0) {
			this.grossSales = grossSales;
		} else {
			this.grossSales = 0.00;
		}
		
		if(commissionRate >= 0) {
			this.commissionRate = commissionRate;
		} else {
			this.commissionRate = 0.00;
		}
		
	}//end constructor
	
    //***************************************************************
    //
    //  Method:       getGrossSales (Non Static)
    // 
    //  Description:  Returns the employee's gross sales.
    //
    //  Parameters:   None
    //
    //  Returns:      double 
    //
    //***************************************************************
    public double getGrossSales() {
    	
		return grossSales;
		
	}//end getGrossSales method

    //***************************************************************
    //
    //  Method:       setGrossSales (Non Static)
    // 
    //  Description:  Sets the employee's gross sales if value is 
    //                non-negative.
    //
    //  Parameters:   double
    //
    //  Returns:      N/A 
    //
    //***************************************************************
	public void setGrossSales(double grossSales) {
		
		if(grossSales >= 0) {
			this.grossSales = grossSales;
		} else {
			this.grossSales = 0.00;
		}
		
	}//end setGrossSales method

    //***************************************************************
    //
    //  Method:       getCommissionRate (Non Static)
    // 
    //  Description:  Returns the employee's commission rate.
    //
    //  Parameters:   None
    //
    //  Returns:      double 
    //
    //***************************************************************
	public double getCommissionRate() {
		
		return commissionRate;
		
	}//end getCommissionRate method

    //***************************************************************
    //
    //  Method:       setCommissionRate (Non Static)
    // 
    //  Description:  Sets the employee's commission rate if value is 
    //                non-negative.
    //
    //  Parameters:   double
    //
    //  Returns:      N/A 
    //
    //***************************************************************
	public void setCommissionRate(double commissionRate) {
		
		if(commissionRate >= 0) {
			this.commissionRate = commissionRate;
		} else {
			this.commissionRate = 0.00;
		}
		
	}//end setCommissionRate method

    //***************************************************************
    //
    //  Method:       earnings (Non Static)
    // 
    //  Description:  Calculates the earnings for a CommissionEmployee.
    //                Earnings are defined as the product of gross sales 
    //                and commission rate. Prints earnings details.
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
