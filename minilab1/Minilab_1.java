//***************************************************************
// CSC205: 33640
// Minilab: 1
// Author: Jose Solis Salazar
// Description:
//***************************************************************

import java.util.Scanner;

public class Minilab_1
{
	public static void main (String [] args)
	{
		//Get nonzero int from user
		Scanner userInputInt = new Scanner(System.in);
		System.out.println("Please enter a non-zero integer");

		int userNonZeroInt;
		while(userInputInt.hasNextInt()){
			//test for non int inputs and handle errors
			userNonZeroInt = userInputInt.nextInt();
			if(userNonZeroInt != 0){
				break;
			}
			else{
				System.out.println("Number cannot be zero; please reenter");
			}
		}

		//Get doubles to analyze from user
		Scanner userInputDouble = new Scanner(System.in);
		System.out.println("Please enter doubles to analyze (negative to stop)");
		
		double userDouble;
		
		int numberOfDoubles = 0;
		int numberGreaterThanHalf = 0;
		int numberOfMultiples = 0;
		int numberWithinFive = 0;
		
		final int FIVE = 5;
		double halfInt = userNonZeroInt / 2;

		while(userInputDouble.hasNextDouble()){
			userDouble = userInputDouble.nextDouble();
			if(userDouble < 0){
				System.out.println("--negative--");
				break;
			}
			else{
				numberOfDoubles++;

			}
		}
		userInputInt.close();
		userInputDouble.close();
	}

}
