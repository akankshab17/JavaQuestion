package loops;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the number of rows and columns that is same");
		int n = sc.nextInt();
		
		for (int i = 0; i <n; i++)
		{ for (int j = 0; j< n; j++)
		   { System.out.print("* ");
	        }
		System.out.println();
		}
	
	


//pattern 2
		System.out.println("enter the number ");
		int p = sc.nextInt();
    
        for (int m= 0; m < p; m++)
        { for (int q =0 ; q<= m; q++)
          {
        	System.out.print("* " );
          }
        	System.out.println();
        }
	
	}
	
}