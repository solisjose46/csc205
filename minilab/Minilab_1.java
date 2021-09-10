//***************************************************************
// CSC205: 33640 / online
// Minilab: 1
// Author: Jose Solis & 35558159
// Description: csc205 review, user inputs non zero int and a series of doubles to compare against non zero int to answer four questions
//***************************************************************

import java.util.Scanner;

public class Minilab_1
{
	public static void main (String [] args)
	{
		//Intro prompt
		System.out.println("This program will receive a first (non-zero) integer and then a series of\n(non-negative) doubles.   It will count how many doubles\nare received, count how many doubles are greater than half of the first integer,\ncount how many doubles are multiples of the first integer,\nand count how many doubles are within 5 of the first integer.");
		System.out.println("");
		//lab constant
		final int FIVE = 5;

		//initialize variables that will answer lab questions
		int numberOfDoubles = 0;
		int numberGreaterThanHalf = 0;
		int numberOfMultiples = 0;
		int numberWithinFive = 0;

		//Get nonzero int from user
		System.out.println("Please enter a non-zero integer");
		Scanner userInput = new Scanner(System.in);

		int nonzeroInt = 0; //This is our nonzero int input
		double halfInt = 0; //used to answer q2
		double lowerLimit = 0; //used for within FIVE question
		double upperLimit = 0;

		while(userInput.hasNext()){
			if(userInput.hasNextInt()){
				nonzeroInt = userInput.nextInt();
				if(nonzeroInt != 0){
					halfInt = (double) nonzeroInt / 2;
					lowerLimit = nonzeroInt - FIVE;
					upperLimit = nonzeroInt + FIVE;
					break;
				}
				else{
					System.out.println("Number cannot be zero; please reenter");
				}
			}
			else{
				//continue loop if current token is not nonzero int
				userInput.next();
			}
		}
		
		//Get doubles to analyze from user
		System.out.println("");
		System.out.println("Please enter doubles to analyze (negative to stop)");

		double userDouble = 0;

		while(userInput.hasNext()){
			if(userInput.hasNextDouble()){
				userDouble = userInput.nextDouble();
				if(userDouble < 0){
					//negative exists this loop
					break;
				}
				else{
					numberOfDoubles++;
					if(userDouble > halfInt){
						numberGreaterThanHalf++;
					}
					if((double) userDouble % nonzeroInt == 0){
						numberOfMultiples++;
					}
					if(lowerLimit <= userDouble && userDouble <= upperLimit){
						numberWithinFive++;
					}
				}
			}
			else{
				//continue loop if current token is a not double (filters for char)
				userInput.next();
			}
		}

		//Answer the questions
		System.out.println("");
		System.out.println("How many doubles were analyzed? " + numberOfDoubles);
		System.out.println("How many are greater than half of " + nonzeroInt + "? " + numberGreaterThanHalf);
		System.out.println("How many are multiples of " + nonzeroInt + "? " + numberOfMultiples);
		System.out.println("How many are within 5 of " + nonzeroInt + "? " + numberWithinFive);

		userInput.close();
	}
}
