//*********************************************************************************
// CSC205: 33640 / online
// Program: 1 Employee tracking system
// Author: Jose Solis & 35558159
// Description: Where main is. Create employees. give raise and other employee actions.
//*********************************************************************************

import java.util.Scanner;
import  java.util.ArrayList;

class Company
{
	public static void main (String [] args)
	{
		final int EMPLOYEE_COUNT = 5;
		ArrayList<Employee> employees = new ArrayList<Employee>();
		ArrayList<Employee> hourlyEmployees = new ArrayList<Employee>();
		Scanner input = new Scanner(System.in);
		char command;
		String temp;

		do{
			System.out.println("\na.\tAdd an Employee\nb.\tList all Employees\nc.\tGive an Employee a raise\nd.\tGive Paychecks\ne.\tChange someone's hours\nf.\tQuit");
			temp = input.next();
			command = temp.toUpperCase().charAt(0);
			
			if(command == 'A'){
				
				String name;
				double salary;

				if(employees.size() < EMPLOYEE_COUNT){
					System.out.print("Enter name and salary, in that order: ");
					name = input.next();
					salary = input.nextDouble();			

					System.out.println("\nIs this employee hourly? y or n");
					temp = input.next();
					command = temp.toUpperCase().charAt(0);

					if(command == 'Y'){
						System.out.print("Enter hours this employee will work: ");
						int hours = input.nextInt();
						AdministrativeAssistant admin = new AdministrativeAssistant(name, salary, hours);
						employees.add(admin);
						hourlyEmployees.add(admin);
						System.out.println();
					}
					else{
						SoftwareEngineer engineer = new SoftwareEngineer(name, salary);
						employees.add(engineer);
					}
					System.out.println(name + " was hired!");
				}
				else{
					System.out.println("Employee capacity reached!");
				}


			}
			else if(command == 'B'){
				for(int i = 0; i < employees.size(); i++){
					

					if(AdministrativeAssistant.class.isInstance(employees.get(i))){
						AdministrativeAssistant admin = (AdministrativeAssistant) employees.get(i);
						System.out.println("name: " + admin.getName() + " salary: " + admin.getSalary() + " hours: " + admin.getHours() + " position: Administrative Assistant");
					}
					else{
						SoftwareEngineer engineer = (SoftwareEngineer) employees.get(i);
						System.out.println("name: " + engineer.getName() + " salary: " + engineer.getSalary() + " position: Software Engineer");					
					}
				}
			}
			else if(command == 'C'){

				if(!(employees.size() < 0)){
					System.out.println("Enter the name of the Employee to give raise to: ");
					String name = input.next();
					boolean found = false;
					for(int i = 0; i < employees.size(); i++){
						if(employees.get(i).getName().equals(name)){
							System.out.println("Employee found! enter raise to give employee");
							double raise = input.nextDouble();
							employees.get(i).giveRaise(raise);
							found = true;
							System.out.println(employees.get(i).getName() + " is happy!");
							break;
						}
					}
					if(!found){
						System.out.println("Employee not found!");
					}
				}
				else{
					System.out.println("No employees at this time...");
				}
			}
			else if(command == 'D'){
				if(employees.size() > 0){
					for(int i = 0; i < employees.size(); i++){
						employees.get(i).getPaid();
					}
					System.out.println("Paid!");
				}
				else{
					System.out.println("No employees at this time... no pay for you!");
				}
			}
			else if(command == 'E'){
				System.out.print("Change whoose hours?: ");
				String name = input.next();

				boolean found = false;

				for(int i = 0; i < hourlyEmployees.size(); i++){
					if(hourlyEmployees.get(i).getName().equals(name)){
						AdministrativeAssistant admin = (AdministrativeAssistant) hourlyEmployees.get(i);
						System.out.println("\nEmployee found! this employee's current hours: " + admin.getHours());
						System.out.println("Enter new hours for this employee: ");
						admin.setHours(input.nextInt());
						System.out.println(admin.getName() + " will now work " + admin.getHours());
						found = true;
						break;
					}
				}
				if(!found){
					System.out.println("\nEmployee does not exist or is not an hourly employee");
				}
			}
			else if(command == 'F'){
				System.out.println("Exit program");
			}
			else{
				System.out.println("Invalid option");
			}

		}while(command != 'F');
	}
}



