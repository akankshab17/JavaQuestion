package loops;

public class TableForLoops {

	public static void main(String[] args) {
		for (int i = 1; i<=20; i++)
		{  System.out.print("table of " + i + ":  ");
			for (int j = 1; j<=10; j++)
			{
				System.out.print(i*j + " ");
				
			}
			System.out.println();
		}

	}

}
