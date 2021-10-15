//***************************************************************
// CSC205: 33640 / online
// Minilab: 5
// Author: Jose Solis & 35558159
// Description: Object of class Point represents a point on the xy cartesian plane
//***************************************************************

import java.lang.Math;

public class Point implements PointInterface
{
	//Object's data members
	private int x;
	private int y;

	//constructors
	//--default
	public Point(){
		this.x = 2;
		this.y = -7;
	}
	//--Parameterized
	public Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	//--copy
	public Point(Point copyPoint){
		if(copyPoint == null){
			throw new IllegalArgumentException("Object cannot be null!");
		}
		this.x = copyPoint.x;
		this.y = copyPoint.y;
	}
	//methods implemented
	@Override
	public String toString(){
		return "(" + this.x + "," + this.y + ")";
	}

	@Override
	public double distanceTo(Point otherPoint) {
		double distanceTo = 0.0;
		distanceTo = Math.sqrt(Math.pow((this.x - otherPoint.x), 2) + Math.pow((this.y - otherPoint.y), 2));
		return distanceTo;
	}
	@Override
	public boolean equals(Object obj){
		if(this == obj){
			return true;
		}
		return false;
	}

	@Override
	public boolean inQuadrant(int quadrant) {
		if(quadrant < 1 || quadrant > 4){
			throw new IllegalArgumentException("quadrant must be 1-4!");
		}

		if(quadrant == 1){
			if(this.x > 0 && this.y > 0){
				return true;
			}
		}
		else if(quadrant == 2){
			if(this.x < 0 && this.y > 0){
				return true;
			}
		}
		else if(quadrant == 3){
			if(this.x < 0 && this.y < 0){
				return true;
			}
		}
		else if(quadrant == 4){
			if(this.x > 0 && this.y < 0){
				return true;
			}
		}

		return false;
	}

	@Override
	public void translate(int xMove, int yMove) {
		this.x+=xMove;
		this.y+=yMove;
	}
}
