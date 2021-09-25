import java.util.Scanner;

public class test
{
	public static void main (String [] args)
	{
		int width = 0; int height = 0; int depth = 0;
		int choice = 0;

		Scanner input = new Scanner(System.in);
		System.out.println("Input box dimensions width/height/depth");
		width = input.nextInt();
		height = input.nextInt();
		depth = input.nextInt();
		
		System.out.printf("Testing new Box with dimensions %d x %d x %d\n", width, height, depth);
		try{
			Box box1 = new Box(width, height, depth);
			System.out.println(box1.toString());
			System.out.println("Width: " + box1.getWidth());
			System.out.println("Sum of Dimensions: " + box1.getSumOfDimensions());
			System.out.println("Surface Area: " + box1.getSurfaceArea());

		}
		catch(Throwable ex){
			ex.printStackTrace();
		}

	//	System.out.println("Test default constructor");
	//	Box boxy = new Box();
	//	System.out.println(boxy.toString());
	//	System.out.println("Width: " + boxy.getWidth());
	//	System.out.println("Sum of Dimensions: " + boxy.getSumOfDimensions());
	//	System.out.println("Surface Area: " + boxy.getSurfaceArea());

		//System.out.println("trying.. getPerimeter..");
		//boxy.getPerimeter(); //should throw error


	}
}
