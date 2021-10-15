import java.util.Scanner;

public class Minilab_5{
    public static void main(String [] args){
        //need to test:
        //toString A
        //distanceTo B
        //equals C
        //inQuadrant D
        //translate E
	//copy constructure F
        //Q for quit
	
        Scanner input = new Scanner(System.in);

	Point defP = new Point();
	Point p1 = new Point(6,9);
	Point copy2 = new Point(p1);

	//toSting(), default constructor and parameter, copy
	System.out.println("---To string---");
	System.out.println("default: " + defP.toString());
	System.out.println("p1: " + p1.toString());
	System.out.println("copy to p1: " + copy2.toString());
	
	//distanceTo(Point)
	System.out.println("---distanceTo---");
	double dist = p1.distanceTo(defP);
	System.out.println("distance from p1 to default: " + dist);
	try{
		p1.distanceTo(null);
	}
	catch(Exception e){
		System.out.println("null was passed");
	}
	
	//equals(Point)
	System.out.println("---equals---");
	System.out.println("default = p1?: " + defP.equals(p1));
	System.out.println("p1 = p1?: " + p1.equals(p1));
	//inQuadrant(int)
	System.out.println("---in Quad---");
	//---1
	System.out.println("is p1 in quad 1: " + p1.inQuadrant(1));
	//---4
	System.out.println("is default in quad 4: " + defP.inQuadrant(4));
	//---2
	System.out.println("is p1 in quad 2: " + p1.inQuadrant(2));
	//---3
	System.out.println("is p1 in quad 3: " + p1.inQuadrant(3));
	//---0
	try{
		p1.inQuadrant(0);
	}
	catch(Exception e){
		System.out.println("There is no quad 0");
	}
	//---5
	try{
		p1.inQuadrant(5);
	}
	catch(Exception e){
		System.out.println("There is no quad 5");
	}
	//translate(int, int)
	System.out.println("---translate---");
	defP.translate(1,1);
	System.out.println("translate 1 1 to default: " + defP.toString());
	//copy -- null exception
	try{
		Point except = new Point(null);
	}
	catch(Exception e){
		System.out.println("Copy was null!");
	}

//        do{
//            String inputString = input.next();
//            char command = inputString.toUpperCase().charAt(0);
//
//            if(command == 'A' || command == 'B' || command == 'C' || command == 'D' || command == 'E' || command == 'F'){
//                Point test;
//                int num, x, y;
//                String shouldBe;
//                
//                num = input.nextInt();
//
//                for(int i = 0; i < num; i++){
//                   x = input.nextInt();
//                   y = input.nextInt();
//                   shouldBe = input.next();
//                   test = new Point(x, y);
//                   
//		   switch(command){
//                       case 'A':
//			       System.out.println("-----toString()-----");
//			       System.out.println("Test: " + test.toString());
//			       break;
//                       case 'B':
//			       System.out.println("-----distanceTo(Point)-----");
//			       int x2, y2;
//			       x2 = input.nextInt();
//			       y2 = input.nextInt();
//			       Point test2 = new Point(x2, y2);
//			       System.out.println("Test: " + test.distanceTo(test2));
//			       break;
//                       case 'C':
//			       System.out.println("-----equals(Object)-----");
//			       int x2, y2;
//			       x2 = input.nextInt();
//			       y2 = input.nextInt();
//			       Point test2 = new Point(x2, y2);
//			       System.out.println("Test: " + test.equals(test2));
//			       break;
//                       case 'D':
//			       System.out.println("-----inQuadrant(int)-----");
//			       int quad = input.nextInt();
//			       System.out.println("Test: " + test.inQuadrant(quad);
//			       break;
//                       case 'E':
//			       System.out.println("-----translate(int, int)-----");
//			       int x2, y2;
//			       x2 = input.nextInt();
//			       y2 = input.nextInt();
//			       System.out.println("Test: " + test.translate(x2, y2));
//			       break;
//                       case 'F':
//			       System.out.println("-----Copy constructure-----");
//			       Point copy = new Point(test);
//			       try{
//				       System.out.println("Test: " + copy.toString());
//			       }
//			       catch(exception e){
//				       System.out.println("null was passed");
//			       }
//			       System.out.println("Test: " + copy.toString());
//			       break;
//                   }
//
//                   System.out.println("Should BE: " + shouldBe + "\n");
//		   System.out.println("------------------------------");
//                }
//            }
//            else if(command == 'Q'){
//                System.out.println("** Program Quit **");
//            }
//        }while(command != 'Q');
//
    }
}
