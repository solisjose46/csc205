//*********************************************************************************
// CSC205: 33640 / online
// Program: 1 Employee tracking system
// Author: Jose Solis & 35558159
// Description: Employee tracking system. This is class inherits from Employee and implements abstract class
//*********************************************************************************

class SoftwareEngineer extends Employee
{
	//-------- data -- inherited
	//String name, double salary, double cash
	
	//constructor
	SoftwareEngineer(String name, double salary){
		this.name = name;
		this.salary = salary;
		this.cash = 0;
	}
	
	//implemented methods -- inherited
	//getName(), getSalary(), getCash()
	//getPaid()

	//abstract methods -- to implement
	public void giveRaise(double raise){
		this.salary+=(this.salary * raise);
	}
}

