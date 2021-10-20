//*********************************************************************************
// CSC205: 33640 / online
// Program: 1 Employee tracking system
// Author: Jose Solis & 35558159
// Description: Employee tracking system. This is abstract class for SoftwareEngineer
//*********************************************************************************

abstract class Employee
{
	//-------- data
	protected String name;
	protected double salary;
	protected double cash;

	public String getName(){
		return this.name;
	}
	public double getSalary(){
		return this.salary;
	}
	public double getCash(){
		return this.cash;
	}
	public void getPaid(){
		this.cash+=this.salary;
	}
	public abstract void giveRaise(double raise);
}

