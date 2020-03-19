
package loops;
import java.util.Scanner;


public class LoopPower {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int x = sc.nextInt();
		System.out.println("enter the power");
		int y = sc.nextInt();
		
		
	
	int m = 1;
	
	for (int i = 0; i< y; i++)
	{
		m = m* x;
		
	}
System.out.println(m);
	}

}
