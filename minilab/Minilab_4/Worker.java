//*********************************************************************************
// CSC205: 33640 / online
// Minilab: 4 Abstract
// Author: Jose Solis & 35558159
// Description: Tech, Processor and Specialist inherits from abstract Worker class
//*********************************************************************************


public abstract class Worker implements Comparable<Worker>
{
	//-------- data
	protected String name;
	protected Integer rating;
	protected Integer id;

	//-------- constructors
	//parameterized constructor
	public Worker(String name, int rating, int id)
	{
		if(rating < 1 || rating > 5){
			throw new IllegalArgumentException("Rating cannot be less than 1 or greater 5");
		}

		this.name = name;
		this.rating = Integer.valueOf(rating);
		this.id = Integer.valueOf(id);
	}

	//-------- methods
	@Override
	public int compareTo(Worker other){
		int compareRating = this.rating.compareTo(other.rating);
		int compareID = this.id.compareTo(other.id);

		if(compareRating == 0){
			return compareID;
		}

		return compareRating;
	}

	//toString - returns object's representation as a String
	public String toString()
	{
		return this.getClass().getName() + ": " + this.name + " rating: " + this.rating + " id: " + this.id; 
	}

	//abstract classe to implement in subclasses
	public abstract double calculateBonus(double multiplier);

}

