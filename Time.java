/*
 Java Programming
 703Y Meyer
 Java Programming Fifth Edition
 Chapter Two Exercise 12
 */
public class Time 
{
	public static void main(String[] args)
	{
		//Var
		int minutes = 122;
		int hours = 0;
		
		//Calculate
		hours = minutes / 60;
		minutes = hours % 60;
		
		//Output
		System.out.println("Hours: " + hours + " Minutes: " + minutes );
	}
}
