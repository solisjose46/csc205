//*********************************************************************************
// CSC205: 33640 / online
// Minilab: 3
// Author: Jose Solis & 35558159
// Description: The Box class inherits properties and methods from Rectangle class
//*********************************************************************************


public class Box extends Rectangle 
{
	//-------- data
	protected int depth;

	//-------- constructors
	//default constructor
	public Box()
	{
		super();
		this.depth = 6;
	}

	//parameterized constructor
	public Box(int theWidth, int theHeight, int theDepth)
	{
		super(theWidth, theHeight);
		if (theDepth < 0){
			throw new IllegalArgumentException("a dimension cannot be negative");
		}
		this.depth = theDepth;
	}

	//-------- methods
	//toString - returns its representation as a String, including width then height
	//                (the this.getClass().getName() will evaluate to "Rectangle" here
	public String toString()
	{
		return this.getClass().getName() + ": " + width + "x" + height + "x" + depth;
	}

	//getPerimeter - returns exception, boxes do not have perimeters!
	public int getPerimeter()
	{
		throw new IllegalStateException("A box does not have a perimeter like its 2d counterpart, the rectangle. Try getSurfaceArea()");
	}

	//getSumOfDimensions - returns the sum of its 3 dimensions
	public int getSumOfDimensions()
	{
		return super.getSumOfDimensions() + this.depth;

	}
	//suraface area of a rectangular prism aka box
	public int getSurfaceArea()
	{
		return 2*(this.height * this.width + this.height * this.depth + this.width * this.depth);
	}

}

