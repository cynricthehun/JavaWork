/*
 Java Programming
 703Y Meyer
 Java Programming Fifth Edition
 Chapter Two Exercise 12
 */
import java.util.Scanner;
public class Time2 
{
	public static void main(String[] args)
	{
		//Instancing Keyboard
		Scanner keyBoard = new Scanner(System.in);
		
		//Vars
		int minutes = 0;
		int hours = 0;
		
		//Prompts
		System.out.println("Declare Minutes: ");
		minutes = keyBoard.nextInt();
		
		//Calculating
		hours = minutes / 60;
		minutes = hours % 60;
		
		//Output
		System.out.println("Hours: " + hours + " Minutes: " + minutes );
	}
}
