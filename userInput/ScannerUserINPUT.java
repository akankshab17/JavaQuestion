package userInput;
import java.util.Scanner;

public class ScannerUserINPUT {

	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		//String hello = sc.nextLine();
		//System.out.println(hello);

		// a program for simple interest
		/**int principal = 5000;
		*float rate = 2.5f; // write f at the end as the complier will think yeh double hai 2.5 or double ko float mai ni daal sakte toh manual type casting karni padegi.
		*int time = 5;
		*float simpleInterest = (principal * rate * time )/ 100;
		System.out.println("the simple interest is" + simpleInterest);*/
		
		Scanner sc = new Scanner(System.in);
		int principal = sc.nextInt();
		float rate = sc.nextFloat();
		int time = sc.nextInt();
		float simpleInterest = (principal * rate * time )/ 100;
		System.out.println("the simple interest is" + simpleInterest);
		
		
		
	
	} 

}
