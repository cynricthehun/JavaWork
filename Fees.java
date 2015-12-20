/*
 Java Programming
 703Y Meyer
 Java Programming Fifth Edition
 Chapter Two Exercise 12
 */
import java.util.Scanner;
public class Fees
{
	public static void main(String[] args)
	{
		//Instancing Keyboard
		Scanner keyBoard = new Scanner(System.in);
		
		//Declare Vars
		int enrolledHrs = 0;
		double bookAmount = 0.0;
		double totalFees = 0.0;
		double creditHour = 85.0;
		double athleticFee = 65.0;
		
		//Prompts
		System.out.println("Declare Enrolled Hours: ");
		enrolledHrs = keyBoard.nextInt();
		
		System.out.println("Declare Total Book Price: ");
		bookAmount = keyBoard.nextDouble();
		
		//Calculate
		double creditTotal = enrolledHrs * creditHour;
		totalFees = bookAmount + creditTotal + athleticFee; 
		
		//Output
		System.out.println("Credit Hours: " + enrolledHrs + " Book Prices: " + bookAmount );
		System.out.println("Athletic Fees: " + athleticFee + " Price per credit Hour: " + creditHour );
		System.out.println("Total Semester Price: " + totalFees );
	}
}
