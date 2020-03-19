package loops;
import java.math.BigInteger;
import java.util.Scanner;
public class FactorialForLoops {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the number whose factoiral you want");
		long number = sc.nextLong();
//		Long factorial = Long.valueOf(1);
		BigInteger factorial = BigInteger.valueOf(1);
		
		for ( long i = number; i> 1; i--)
		{
			factorial = factorial.multiply(BigInteger.valueOf(i));
		}
		
		System.out.println( factorial );

		
	}
	

}
