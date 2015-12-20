/*
 Java Programming
 703Y Meyer
 Java Programming Fifth Edition
 Chapter Two Exercise 12
 */
import java.util.Scanner;
public class Carpet2
{
	public static void main(String[] args)
	{
		//Instancing Keyboard
		Scanner keyBoard = new Scanner(System.in);
		
		//Vars
		int Length = 0;
		int Width = 0;
		int Area = 0;
		double Price = 0.0;
		double finalPrice = 0.0;
		
		//Prompts
		System.out.println("Declare Length: ");
		Length = keyBoard.nextInt();
			
		System.out.println("Declare Width: ");
		Width = keyBoard.nextInt();
		
		System.out.println("Declare Price: ");
		Price = keyBoard.nextDouble();
		
		//Calculate
		Area = Length + Width;
		finalPrice = Price * Area;
		
		//Output
		System.out.println("The floor space is: " + Area + " square.");
		System.out.println("Price per foot is: " + Price + ".");
		System.out.println("The total cost to carpet: " + Area + " square is " + finalPrice + ".");
	}
}