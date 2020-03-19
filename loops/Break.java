package loops;

import java.util.Scanner;

public class Break {
	public static void main(String[] args) {

	Scanner sc = new Scanner (System.in);
	
//	System.out.println("entrer the positive number");
//	int n = sc.nextInt();
//	
//	for (int i =0; i<= n; i++)
//	{
//		if (i == 9) 
//			break;
//		else 
//			System.out.println(i);
//	}
         
	for (;;)   // take input until user inputs a negative number (infinity loop)
	{
	
		System.out.println("enter the number");
		int x = sc.nextInt();
		if (x<0)
		{ System.out.println("oops a negative number");
			break;}
		System.out.println(x);
	}
	System.out.println("now i am out of loop as u pressed a negative number");
	
	
	
	
     }
}