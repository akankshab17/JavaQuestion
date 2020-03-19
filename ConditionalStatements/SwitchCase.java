package ConditionalStatements;

public class SwitchCase {

	public static void main(String[] args) {
		int dayofweek = 5;
				
  switch (dayofweek)	
  {
  case 1: 
	  System.out.println("i am on leave");
	  break;
	  
  case 2: 
	  System.out.println("i am goin to college it is monday");
	  break;
  case 3 :
	  System.out.println("today is tuesday");
	  break;
  case 4: 
	  System.out.println("today is wednesday");
	  break;
  case 5 :
	  System.out.println("today is thursday");
	  break;
  case 6 :
	  System.out.println("today is friday");
	  break;
  case 7:
	  System.out.println("today is saturday");
  default : 
	  System.out.println("invalid input");
  
  }
  
  // to print same sentences twice for case 1 nd 2 or etc so dont do this as code will be dry means repetition
//	 case 1: 
//		  System.out.println("i am on leave");
//		  break;
//		  
//	  case 2: 
//		  System.out.println("i am on leave");
//		  break;
 // solution
  int dayofweekk = 7;
  switch (dayofweekk)	
  {
  case 1: 
  case 2:
  case 7:
	  System.out.println("i am on leave");
	  break;
	
  case 3 :
	  System.out.println("today is tuesday");
	  break;
  case 4: 
	  System.out.println("today is wednesday");
	  break;
  case 5 :
	  System.out.println("today is thursday");
	  break;
  case 6 :
	  System.out.println("today is friday");
	  break;

  default : 
	  System.out.println("invalid input");
  
  
  }
  
 int  b = 6;
  switch (b)
	{case 5 :
		  System.out.println("today is thursday");
		
	  case 6 :
		  System.out.println("today is friday");
		

	  default : 
		  System.out.println("invalid input");
	}
	  
	}
}
// what happens if i remove break




