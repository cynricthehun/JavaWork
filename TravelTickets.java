/*
 Java Programming
 703Y Meyer
 Java Programming Fifth Edition
 Chapter Two Exercise 12
 */
import java.util.Scanner;
public class TravelTickets
{
	public static void main(String[] args)
	{
		//instancing the keyboard
		Scanner keyBoard = new Scanner(System.in);
		
		//Declare Vars
		String ticketAgent = "";
		int sixDigits = 0;
		
		//Prompts
		System.out.println("Declare Ticket: ");
		sixDigits = keyBoard.nextInt();
		
		//Check Truth
		boolean truth = (sixDigits % 10 == (sixDigits / 10) % 7);
		
		//Output
		System.out.println("Agent: " + ticketAgent + " Ticket: " + sixDigits );
		System.out.println("This ticket is: " + truth);
	}
}
