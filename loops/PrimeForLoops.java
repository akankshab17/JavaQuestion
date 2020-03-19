package loops;
import java.util.Scanner;

public class PrimeForLoops {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("entrer the number");
		int n = sc.nextInt();
		boolean Prime = true;
		
		//for (int i= 2; i<n; i++)  as we know if number has a factor, one of them will come under underroot n soo
		// better solution
		for (int i= 2; i*i <n; i++) // i*i or under root n are same
		{
			if (n % i == 0)
			{  Prime = false;
				break;
			}
		}
	
		if ( n < 2)
		{
			Prime = false;
		}
		
		System.out.println("the given number is prime: " + Prime);
		
	}

}
