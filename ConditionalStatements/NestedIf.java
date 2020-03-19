package ConditionalStatements;
import java.util.Scanner;

public class NestedIf {

		public static void main(String[] args) {
			
			System.out.println("enter first number");
			Scanner sc = new Scanner (System.in);
			int a = sc.nextInt();
			System.out.println("enter second number");
			int b = sc.nextInt();
			System.out.println("enter third number");
			int c = sc.nextInt();
			
			int result = 0;
			
			if ( a > b)
			{
				if (a > c)
				{
					result = a;
				}
				else 
				{ result = c;
					
				}
			}
			else if (b > c)
			{
				result = b;
				
			}
			else 
			{
				result = c;
			}
				
			
			
			System.out.println("the greatest number is " + result);
			
			// how to write the same program in ternary statements
			
			int f = 10;
			int q = 30;
			int l = 12;
			
	int z = f > q ? f > l ? f : l : q >l ? q : l ; 
	System.out.println(z);
	
			
			
			
			
		}
		
			
		
}
