//********************************************************************
//
//  Developer:     Jeremy Aubrey
//
//  Project #:     One
//
//  File Name:     HourlyEmployee.java
//
//  Course:        COSC 4301 - Modern Programming
//
//  Due Date:      2/13/2022
//
//  Instructor:    Fred Kumi 
//
//  Description:   HourlyEmployee concrete class that inherits from the 
//                 abstract Employee class. HourlyEmployee implements the 
//                 abstract earnings method of Employee.
//
//********************************************************************

package project1;

public class HourlyEmployee extends Employee {
	
	private double wage;
	private double hours;
	
	//constructor
	public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double wage, double hours) {
		
		super(firstName, lastName, socialSecurityNumber);
		
		//do not allow negative inputs
		if(wage >= 0) {
			this.wage = wage;
		} else {
			this.wage = 0.00;
		}
		
		if(hours >= 0) {
			this.hours = hours;
		} else {
			this.hours = 0.0;
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
    //  Parameters:   None
    //
    //  Returns:      N/A 
    //
    //***************************************************************
	public void setWage(double wage) {
		
		if(wage >= 0 ) {
			this.wage = wage;
		} else {
			this.wage = 0.00;
		}
		
	}//end setWage method

    //***************************************************************
    //
    //  Method:       getHours (Non Static)
    // 
    //  Description:  Returns the employee's hours.
    //
    //  Parameters:   None
    //
    //  Returns:      double 
    //
    //***************************************************************
	public double getHours() {
		
		return hours;
		
	}//end getHours method

    //***************************************************************
    //
    //  Method:       setHours (Non Static)
    // 
    //  Description:  Sets the employee's hours if value is non-negative.
    //
    //  Parameters:   None
    //
    //  Returns:      N/A 
    //
    //***************************************************************
	public void setHours(double hours) {
		
		if(hours >= 0) {
			this.hours = hours;
		} else {
			this.hours = 0.0;
		}
		
	}//end setHours method

	//***************************************************************
    //
    //  Method:       earnings (Non Static)
    // 
    //  Description:  Calculates the earnings for a HourlyEmployee.
    //                Earnings are defined as the product of the 
    //                hourly wage and the hours worked.
    //                Prints earnings details.
    //
    //  Parameters:   None
    //
    //  Returns:      double 
    //
    //***************************************************************
	@Override
	public double earnings() {
		
		double overtimeHours = 0;
		double overtimeWage = Math.round((wage * 1.5) * 100.0) / 100.0; //round to 2 decimal places
		double earnings = wage * hours; //default, no overtime
		
		//if overtime, recalculate earnings
		if(hours - 40 > 0) {
			
			overtimeHours = hours - 40;
			earnings = (wage * 40) + (overtimeWage * overtimeHours);
			
		} 
		
		System.out.println("Hourly wage: $" + wage + "; Regular Hours Worked: " + String.format("%.2f", hours));
		System.out.println("Overtime wage: $" + overtimeWage + "; Overtime Hours Worked: "
		+ String.format("%.2f", overtimeHours));
		
		return earnings;
		
	}//end earnings method

}//end HourlyEmployee class
