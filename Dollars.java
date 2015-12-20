/*
 Java Programming
 703Y Meyer
 Java Programming Fifth Edition
 Chapter Two Exercise 12
 */
import java.util.Scanner;
public class Dollars
{
	public static void main(String[] args)
	{
		//Instancing Keyboard
		Scanner keyBoard = new Scanner(System.in);
		
		//Vars
		int dollars = 0;
		int twenty = 0;
		int tens = 0;
		int fives = 0;
		int ones = 0;
		
		//Prompts
		System.out.println("Declare Amount: ");
		dollars = keyBoard.nextInt();
		
		//Calculate
		twenty = dollars / 20;
		int holdme = dollars % 20;
		tens = holdme / 10;
		holdme = holdme % 10;
		fives = holdme / 5;
		holdme = holdme % 5;
		ones = holdme / 1;
		
		//Output
		System.out.println("Twentys: " + twenty + " Tens: "+ tens + " Fives: " + fives + " Ones: " + ones);
	}
}