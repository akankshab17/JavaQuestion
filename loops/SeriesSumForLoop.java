package loops;

import java.util.Scanner;

public class SeriesSumForLoop {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("entrer the positive number");
		float n = sc.nextFloat();
		float sum = 0;
		for (float i=1; i<= n ; i++)
		{
			sum = sum + (1/i);
			
			
		}
System.out.println("sum of the series is " + sum);
	}

}
