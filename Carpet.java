/*
 Java Programming
 703Y Meyer
 Java Programming Fifth Edition
 Chapter Two Exercise 12
 */
public class Carpet
{
	public static void main(String[] args)
	{	
		//Vars
		int Length = 15;
		int Width = 15;
		int Area = 0;
		double Price = 0.25;
		double finalPrice = 0.0;
		
		//Calculate
		Area = Length + Width;
		finalPrice = Price * Area;
			
		//Output
		System.out.println("The floor space is: " + Area + " square.");
		System.out.println("Price per foot is: " + Price + ".");
		System.out.println("The total cost to carpet: " + Area + " square is " + finalPrice + ".");
	}
}