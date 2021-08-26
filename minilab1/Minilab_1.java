//***************************************************************
// CSC205: 33640
// Minilab: 1
// Author: Jose Solis Salazar
// Description: csc205 review, user inputs non zero int and a series of doubles to compare against non zero int to answer four questions
//***************************************************************

//notes: complete, just add error handling for non int/double inputs and run test cases

import java.util.Scanner;

public class Minilab_1
{
	public static void main (String [] args)
	{
		//lab constant
		final int FIVE = 5;

		//Get nonzero int from user
		System.out.println("Please enter a non-zero integer");
		Scanner userInputInt = new Scanner(System.in);

		int userNonZeroInt = 0; //This is our nonzero int input
		double halfInt = 0;

		while(userInputInt.hasNextInt()){
			//*************test for non int inputs and handle errors****************
			userNonZeroInt = userInputInt.nextInt();
			if(userNonZeroInt != 0){
				halfInt = userNonZeroInt / 2;
				break;
			}
			else{
				System.out.println("Number cannot be zero; please reenter");
			}
		}

		//initialize variables that will answer lab questions
		int numberOfDoubles = 0;
		int numberGreaterThanHalf = 0;
		int numberOfMultiples = 0;
		int numberWithinFive = 0;

		int lowerLimit = userNonZeroInt - FIVE;
		int upperLimit = userNonZeroInt + FIVE;//consider using absoulute value to condense code
		
		//Get doubles to analyze from user
		System.out.println("Please enter doubles to analyze (negative to stop)");
		Scanner userInputDouble = new Scanner(System.in);

		double userDouble = 0;

		while(userInputDouble.hasNextDouble()){
			//*************test for non int inputs and handle errors****************
			userDouble = userInputDouble.nextDouble();
			if(userDouble < 0){
				break;
			}
			else{
				numberOfDoubles++;
				if(userDouble > halfInt){
					numberGreaterThanHalf++;
				}
				if(userDouble % userNonZeroInt == 0){
					numberOfMultiples++;
				}
				if(lowerLimit <= userDouble && userDouble <= upperLimit){
					numberWithinFive++;
				}
			}
		}

		System.out.println("How many doubles were analyzed? " + numberOfDoubles);
		System.out.println("How many are greater than half of " + userNonZeroInt + "? " + numberGreaterThanHalf);
		System.out.println("How many are multiples of " + userNonZeroInt + "? " + numberOfMultiples);
		System.out.println("How many are within 5 of " + userNonZeroInt + "? " + numberWithinFive);

		userInputInt.close();
		userInputDouble.close();
	}
}
