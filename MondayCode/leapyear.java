import java.util.Scanner;
import java.lang.Math;

public class BasicOperation {
	 public static void main(String[] args){
			Scanner sCan = new Scanner(System.in);
			
	System.out.print("Input the year: ");
	int year = sCan.nextInt();

	boolean a = (year % 4) == 0;
	boolean b = (year % 100) != 0;
	boolean c = ((year % 100 == 0) && (year % 400 == 0));

	if (a && (b || c))
	{
		System.out.println(year + " is a leap year");
	}
	else
	{
		System.out.println(year + " is not a leap year");
	}
			
}
	}
