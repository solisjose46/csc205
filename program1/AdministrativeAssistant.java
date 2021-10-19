//*********************************************************************************
// CSC205: 33640 / online
// Program: 1 Employee tracking system
// Author: Jose Solis & 35558159
// Description: This class extednds Employee and implements Hourly
//*********************************************************************************

class AdministrativeAssistant extends Employee implements Hourly
{
	//-------- data -- inherited
	//String name, double salary, double cash
	protected int hours;
	
	//constructor
	AdministrativeAssistant(String name, double salary, int hours){
		this.super(name, salary);
		this.hours = hours;
	}
	
	//implemented methods -- inherited
	//getName(), getSalary, getCash()
	//getPaid()

	//Override parent abstract
	@Override
	public void giveRaise(double raise){
		this.salary+=(raise);
	}
	@Override
	public void getPaid(){
		this.cash = (this.salary * this.hours);
	}

	public int getHours(){
		return this.hours;
	}
	public void setHours(int hours){
		this.hours = hours;
	}
}

