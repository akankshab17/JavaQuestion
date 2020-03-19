package ConditionalStatements;
import java.util.Scanner;


public class IfElseIf {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int number = sc.nextInt();
		
		if (number <= 10 )
		{
			System.out.println("number is less than 10");
		}
		else if (number >= 10 && number <= 20 )
		{
			System.out.println("number is greater than 10 but less than 20 ");
			
		}
		else if (number >= 20 && number <= 30)
		{
			System.out.println("number is greater than 20 but less than 30");
		}
		else 
		{
			System.out.println("number is greater than 30");
		}

	// ternary statements
		
		
	int x = (number < 20)	? 5 : 8 ;
	
	System.out.println(x);
	
		
		
		
		
	}

}
