package ConditionalStatements;

import java.util.Scanner;

public class Calculatorusingswitch {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter first number");
		int a = sc.nextInt();
		System.out.println("enter second number");
		int b = sc.nextInt();
		
		sc.nextLine();  // used becoz we took int as input now if we take string as input usme vo enter daal lega but we need string so ek string khali chalayenge ham 
		
		System.out.println("enter the operation");
		char operation = sc.nextLine().charAt(0);
//		int result;
		 int result = 0;
	
		switch (operation)
		{
		case '+'  :
		result = a + b;
			break;
		case '-' :
			result = a - b;
			break;
		case '/' :
			result = a/b;
			break;
		case '*' :
			result = a*b;
			break;
			
		default:
				System.out.println("invalid operator");
 		result = 0 ;
				
				
		
		
		
		
		}
		 System.out.println("the result is " + result);

	}

}
