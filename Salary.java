// ************************************************************
// Salary.java
// Computes the raise and new salary for an employee
// ************************************************************
import java.text.DecimalFormat;
import java.util.Scanner;

public class Salary
{
	
	public static void main (String[] args)
	{
		double currentSalary; // current annual salary
		int rating; // performance rating   (0 to 3)
		double raise = 0; // dollar amount of the raise
		Scanner scan = new Scanner(System.in);
	
		// Get the current salary and performance rating
		System.out.print ("Enter the current salary: $");
		currentSalary = scan.nextDouble();
		System.out.print ("Enter the performance rating (0=unacceptable, 1=poor, 2=good, and 3=excellent): ");
		rating = scan.nextInt();
	
		// Compute the raise
		if (rating == 3)
		{
			raise = .06 * currentSalary;
			System.out.println("Excellent performance!");
		}
		else if(rating == 2)
		{
			raise = .04 * currentSalary;
			System.out.println("Good performance!");
		}
		else if(rating == 1)
		{
			raise = .015 * currentSalary;
			System.out.println("Poor performance.");
		}
		
		else
		{
			System.out.println("Performance was unacceptable");
		}
		
		// Print the results
		DecimalFormat fmt = new DecimalFormat("0.00");
		System.out.println ("Amount of your raise: $" + fmt.format(raise));
		System.out.println ("Your new salary: $" + fmt.format(currentSalary + raise) );
		
		scan.close();
	}
}
