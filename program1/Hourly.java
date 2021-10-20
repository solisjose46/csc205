//*********************************************************************************
// CSC205: 33640 / online
// Program: 1 Employee tracking system
// Author: Jose Solis & 35558159
// Description: Interface for hourly workers, to be implemented by children
//*********************************************************************************

interface Hourly
{
	public int getHours();
	public void setHours(int hours);
	public void giveRaise(double raise);
}

