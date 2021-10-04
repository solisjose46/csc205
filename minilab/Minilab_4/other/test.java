import java.io.File;
import java.io.FileNotFoundException;
//import java.lang.IllegalArgumentException
import java.util.Scanner;

public class test
{
	public static void main (String [] args)
	{
		File file = new File("test_cases.txt");
		Scanner input = null;
		try{
			input = new Scanner(file);

		}
		catch(FileNotFoundException e){
			System.out.println("file not found!");
		}
		
		String parse;
		
		Tech compareMe = new Tech("Bob", 3, 123456);

		while(input.hasNextLine()){
			parse = input.nextLine();

			if(parse.compareTo("Tech") == 0){
				System.out.println("TESTING TECH");
				System.out.println("--------------");
				input.nextLine();
				int nums = input.nextInt();
				input.nextLine();

				for(int i = 0; i < nums; i++){
					String worker = input.nextLine();
					Scanner text = new Scanner(worker);
					Tech temp;
					text.useDelimiter(", ");
					String name = text.next();
					text.useDelimiter(", ");
					int rating = text.nextInt();
					text.useDelimiter(", ");
					int id = text.nextInt();
					
					System.out.println("\nmaking Tech with args: " + name + " " + rating + " " + id);
					
					try{
						if(rating < 1 || rating > 5){
							System.out.println("Exception incoming ....");
						}
						temp = new Tech(name, rating, id);
						if(temp.rating > compareMe.rating){
							System.out.println("Should be positive: " + temp.compareTo(compareMe)); 
						}
						else if(temp.rating < compareMe.rating){
							System.out.println("Should be negative: " + temp.compareTo(compareMe)); 
						}
						else if(temp.id > compareMe.id){
							System.out.println("Should be positive: " + temp.compareTo(compareMe)); 
						}
						else if(temp.id < compareMe.id){
							System.out.println("Should be negative: " + temp.compareTo(compareMe)); 
						}
						else{
							System.out.println("Should be zero: " + temp.compareTo(compareMe));
						}
						System.out.println(temp.toString());
						System.out.println("temp.bonus is zero?: " + temp.calculateBonus(0.0));

					}
					catch(IllegalArgumentException e){
						System.out.println("Illegal argument: " + rating);
					}

				}

			}
			else if(parse.compareTo("Processor") == 0){
				System.out.println("TESTING Processor");
				System.out.println("--------------");
				input.nextLine();
				int nums = input.nextInt();
				input.nextLine();

				for(int i = 0; i < nums; i++){
					String worker = input.nextLine();
					Scanner text = new Scanner(worker);
					Processor temp;
					text.useDelimiter(", ");
					String name = text.next();
					text.useDelimiter(", ");
					int rating = text.nextInt();
					text.useDelimiter(", ");
					int id = text.nextInt();
					text.useDelimiter(", ");
					double bonus = text.nextDouble();
					System.out.println("\nmaking Tech with args: " + name + " " + rating + " " + id + " " + bonus);
					
					try{
						if(rating < 1 || rating > 5){
							System.out.println("Exception incoming ....");
						}
						temp = new Processor(name, rating, id, bonus);
						if(temp.rating > compareMe.rating){
							System.out.println("Should be positive: " + temp.compareTo(compareMe)); 
						}
						else if(temp.rating < compareMe.rating){
							System.out.println("Should be negative: " + temp.compareTo(compareMe)); 
						}
						else if(temp.id > compareMe.id){
							System.out.println("Should be positive: " + temp.compareTo(compareMe)); 
						}
						else if(temp.id < compareMe.id){
							System.out.println("Should be negative: " + temp.compareTo(compareMe)); 
						}
						else{
							System.out.println("Should be zero: " + temp.compareTo(compareMe));
						}
						System.out.println(temp.toString());
						System.out.println("calc bonus " + temp.calculateBonus(bonus));

					}
					catch(IllegalArgumentException e){
						System.out.println("Illegal argument: " + rating);
					}

				}


			}
			else if(parse.compareTo("Specialist") == 0){
				System.out.println("TESTING Specialist");
				System.out.println("--------------");
				input.nextLine();
				int nums = input.nextInt();
				input.nextLine();

				for(int i = 0; i < nums; i++){
					String worker = input.nextLine();
					Scanner text = new Scanner(worker);
					Specialist temp;
					text.useDelimiter(", ");
					String name = text.next();
					text.useDelimiter(", ");
					int rating = text.nextInt();
					text.useDelimiter(", ");
					int id = text.nextInt();
					text.useDelimiter(", ");
					double bonus = text.nextDouble();
					text.useDelimiter(", ");
					double profit = text.nextDouble();
					System.out.println("\nmaking Tech with args: " + name + " " + rating + " " + id + " " + bonus + " " + profit);
					
					try{
						if(rating < 1 || rating > 5){
							System.out.println("Exception incoming ....");
						}
						temp = new Specialist(name, rating, id, bonus, profit);
						if(temp.rating > compareMe.rating){
							System.out.println("Should be positive: " + temp.compareTo(compareMe)); 
						}
						else if(temp.rating < compareMe.rating){
							System.out.println("Should be negative: " + temp.compareTo(compareMe)); 
						}
						else if(temp.id > compareMe.id){
							System.out.println("Should be positive: " + temp.compareTo(compareMe)); 
						}
						else if(temp.id < compareMe.id){
							System.out.println("Should be negative: " + temp.compareTo(compareMe)); 
						}
						else{
							System.out.println("Should be zero: " + temp.compareTo(compareMe));
						}
						System.out.println(temp.toString());
						System.out.println("calc bonus " + temp.calculateBonus(bonus));

					}
					catch(IllegalArgumentException e){
						System.out.println("Illegal argument: " + rating);
					}

				}
			}
		}
	}
}
