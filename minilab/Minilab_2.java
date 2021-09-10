//***************************************************************
// CSC205: 33640 / online
// Minilab: 2
// Author: Jose Solis & 35558159
// Description: csc205 review, create array of random ints to perform operations on. Size defined by user.
//***************************************************************

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Minilab_2
{
	public static void main (String [] args)
	{
		//constants here
		final int MAX_INT = 9; //0-8
		final int MAX_OCCURRENCE = 3;

		//make array from user inputs seed and arraySize
		int seed = 0;
		int arraySize = 0;
		int randomInts[];

		//Get seed from user
		System.out.println("Please enter a seed: ");
		Scanner input = new Scanner(System.in);
		seed = input.nextInt();

		//Get array size from user
		System.out.println("\nPlease enter the size of the array: ");
		
		while(input.hasNext()){
			if(input.hasNextInt()){
				int thisInt = input.nextInt();
				if(thisInt > 1){
					arraySize = thisInt;
					break;
				}
			}
			else{
				input.next();
			}
			
			System.out.println("\nArray size must be greater than 1.  Please reenter: ");
			
		}

		//make the array of random ints
		Random randomIntGenerator = new Random(seed);
		randomInts = new int[arraySize];
		for(int i = 0; i < arraySize; i++){
			randomInts[i] = randomIntGenerator.nextInt(MAX_INT);
		}

		//process users options
		int choice;

		while(true){
			System.out.println("\nPlease choose an option:");
			System.out.println("\t1\tPrint the array");
			System.out.println("\t2\tFind the average");
			System.out.println("\t3\tFind the largest element");
			System.out.println("\t4\tCount how many times 3 occurred");
			System.out.println("\t5\tCount how many elements are less than half of the first element");
			System.out.println("\t6\tFind how many times numbers repeat consecutively");
			System.out.println("\t7\tSwap the first and last elements");
			System.out.println("\t8\tExit");

			if(input.hasNextInt()){
				choice = input.nextInt();
				if(1 <= choice && choice <= 6){
					System.out.println("");
				}
				if(choice == 1){
					System.out.print("Array: ");
					for(int i = 0; i < randomInts.length; i++){
						System.out.print(randomInts[i] + "  ");
					}
					System.out.println("");
				}
				else if(choice == 2){
					double average = 0;
					for(int i = 0; i < randomInts.length; i++){
						average+=randomInts[i];
					}
					average = average / randomInts.length;
					System.out.println("Average:" + average);
				}
				else if(choice == 3){
					int max = randomInts[0];
					for(int i = 0; i < randomInts.length; i++){
						if(randomInts[i] > max){
							max = randomInts[i];
						}
					}
					System.out.println("Largest: " + max);
				}
				else if(choice == 4){
					int count = 0;
					for(int i = 0; i < randomInts.length; i++){
						if(randomInts[i] == MAX_OCCURRENCE){
							count++;
						}
					}
					System.out.println("3Count: " + count);
				}
				else if(choice == 5){
					double halfOfFirst = (double) randomInts[0] / 2;
					int count = 0;

					for(int i = 0; i < randomInts.length; i++){
						if(randomInts[i] < halfOfFirst){
							count++;
						}
					}
					System.out.println("Less than half of first: " + count);				
				}
				else if(choice == 6){
					int repeats = 0;
					for(int i = 0; i < randomInts.length; i++){
						if((i+1) < randomInts.length){
							if(randomInts[i] == randomInts[i+1]){
								repeats++;
							}
						}
					}
					System.out.println("Repeats: " + repeats);
				}
				else if(choice == 7){
					int swap = randomInts[randomInts.length - 1];
					randomInts[randomInts.length - 1] = randomInts[0];
					randomInts[0] = swap;
				}
				else if(choice == 8){
					break;
				}
				else{
					System.out.println("\nIllegal option, try again");
				}
			}
			else{
				System.out.println("\nIllegal option, try again");
				input.next();
			}
		}

	}
}
