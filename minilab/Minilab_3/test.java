public class test
{
	public static void main (String [] args)
	{
		Box boxy = new Box();
		System.out.println(boxy.toString());
		System.out.println("Width: " + boxy.getWidth());
		System.out.println("Sum of Dimensions: " + boxy.getSumOfDimensions());
		System.out.println("Surface Area: " + boxy.getSurfaceArea());
		boxy.getPerimeter();
	}
}
