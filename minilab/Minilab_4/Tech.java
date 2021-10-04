//*********************************************************************************
// CSC205: 33640 / online
// Minilab: 4 Abstract
// Author: Jose Solis & 35558159
// Description: Tech, Processor and Specialist inherits from abstract Worker class
//*********************************************************************************


public class Tech extends Worker
{
	//-------- data inherited from Worker

	//-------- constructors, call super for parent constructor
	//parameterized constructor
	public Tech(String name, int rating, int id)
	{
		super(name, rating, id);
	}

	//-------- methods
	//compareTo is inherited from Worker

	//toString - returns object's representation as a String, inherited
	
	//inherited from abstract parent, returns 0 no bonus for tech :(
	public double calculateBonus(double multiplier){
		return 0.0;
	}

}

