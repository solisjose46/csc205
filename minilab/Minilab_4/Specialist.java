//*********************************************************************************
// CSC205: 33640 / online
// Minilab: 4 Abstract
// Author: Jose Solis & 35558159
// Description: Tech, Processor and Specialist inherits from abstract Worker class
//*********************************************************************************


public class Specialist extends Worker
{
	//-------- data
	//inherited data and unique to Specialist class
	protected double bonusTarget;
	protected double profitSharing;

	//-------- constructors
	//parameterized constructor
	public Specialist(String name, int rating, int id, double bonusTarget, double profitSharing)
	{
		super(name, rating, id);
		this.bonusTarget = bonusTarget;
		this.profitSharing = profitSharing;
	
	}

	//-------- methods
	//compareTo is inherited

	//toString - returns object's representation as a String
	public String toString()
	{
		return super.toString() + " target: " + bonusTarget + " profit: " + profitSharing; 
	}

	//abstract class implemented here
	public double calculateBonus(double multiplier){
		return (bonusTarget + profitSharing) * multiplier;
	}

}

