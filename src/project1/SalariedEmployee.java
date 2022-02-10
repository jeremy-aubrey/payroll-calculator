//********************************************************************
//
//  Developer:     Jeremy Aubrey
//
//  Project #:     One
//
//  File Name:     SalariedEmployee.java
//
//  Course:        COSC 4301 - Modern Programming
//
//  Due Date:      2/13/2022
//
//  Instructor:    Fred Kumi 
//
//  Description:   SalariedEmployee concrete class that inherits from the 
//                 abstract Employee class. SalariedEmployee implements 
//                 the abstract earnings method of Employee.
//
//********************************************************************

package project1;

public class SalariedEmployee extends Employee {
	
	private double weeklySalary;
	
	//constructor
	public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double weeklySalary) {
		
		super(firstName, lastName, socialSecurityNumber);
		this.weeklySalary = weeklySalary;
		
	}//end constructor

    //***************************************************************
    //
    //  Method:       earnings (Non Static)
    // 
    //  Description:  Returns the weekly salary for an SalariedEmployee.
    //
    //  Parameters:   None
    //
    //  Returns:      double 
    //
    //***************************************************************
	@Override
	public double earnings() {
		
		return weeklySalary;
		
	}//end earnings method

}//end SalariedEmployee class
