/*
 Java Programming
 703Y Meyer
 Java Programming Fifth Edition
 Chapter Two Exercise 12
 */
import java.util.Scanner;
public class Room2 
{
	public static void main(String[] args)
	{
		//Instancing Keyboard
		Scanner keyBoard = new Scanner(System.in);
		
		//Vars
		int Length = 0;
		int Width = 0;
		int Area = 0;
		
		//Prompts
		System.out.println("Declare Length: ");
		Length = keyBoard.nextInt();
		
		System.out.println("Declare Width: ");
		Width = keyBoard.nextInt();
		
		//Calculate
		Area = Length + Width;
		
		//Output
		System.out.println("The floor space is: " + Area + "square feet.");
	}
}
