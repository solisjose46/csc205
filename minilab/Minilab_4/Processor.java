//*********************************************************************************
// CSC205: 33640 / online
// Minilab: 4 Abstract
// Author: Jose Solis & 35558159
// Description: Tech, Processor and Specialist inherits from abstract Worker class
//*********************************************************************************


public class Processor extends Worker
{
	//-------- data
	//inherited data and unique to Processor class
	protected double bonusTarget;

	//-------- constructors
	//parameterized constructor
	public Processor(String name, int rating, int id, double bonusTarget)
	{
		super(name, rating, id);
		this.bonusTarget = bonusTarget;
	}

	//-------- methods
	//compareTo is inherited

	//toString - returns object's representation as a String
	public String toString()
	{
		return super.toString() + " target: " + bonusTarget; 
	}

	//abstract class implemented here
	public double calculateBonus(double multiplier){
		return bonusTarget * multiplier;
	}

}

