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
//                 Employee class. HourlyEmployee implements the abstract
//                 earnings method of Employee.
//
//********************************************************************

package project1;

public class HourlyEmployee extends Employee {
	
	private double wage;
	private double hours;
	
	//constructor
	public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double wage, double hours) {
		
		super(firstName, lastName, socialSecurityNumber);
		this.wage = wage;
		this.hours = hours;
		
	}//end constructor
	
    //***************************************************************
    //
    //  Method:       earnings (Non Static)
    // 
    //  Description:  Calculates the earnings for a HourlyEmployee.
    //                Earnings are defined as the product of the 
	//                hourly wage and the hours worked.
	//
    //  Parameters:   None
    //
    //  Returns:      double 
    //
    //***************************************************************
	@Override
	public double earnings() {
		
		System.out.println("Hourly wage: $" + wage + "; Hours Worked: " + String.format("%.2f", hours));
		double earnings = wage * hours;
		return earnings;
		
	}//end earnings method

}
