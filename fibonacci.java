package loops;
import java.util.Scanner;j

public class FibonacciSeries {

	public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				
				System.out.println("how many fibonacci number you want ");
				int number = sc.nextInt();
				 int f = 0; // first number
				 int s = 1; // second number

				 System.out.print(f + " " + s +  " " );
				 
				 for ( int i= 0; i < number-2 ; i++ ) // remember n-2 as already 2 numbers are printed
				 {
					   int t = f + s;
					   
					  System.out.print(t + " ");
					  
					  f = s;
					  s = t;
					 
					 
				 }
	}

}
