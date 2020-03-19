package operators;

public class BitwiseOperators {

	public static void main(String[] args) {
		
		int p = 5;
		int q = 6;
		
		int c = p & q;  // AND BITWISE 

		int d = p|q;    // OR BITWISE
		
		int e = p >> 1;   // right shift one time means divide by 2 
		int f = p >> 2;    // right shift two  time means divide by 2 again 
		
		int g = q << 1;  // left shift q one time means multiply by 2 
		int h = q << 2;  // left shift q two time means multiply by 2 again
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		
		// for assignment operators we just have to assign
		
		int r = 5;
		r += 2 ;
		r &= 2 ;
		


	}

}
