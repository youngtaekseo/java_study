package exam02;

public class Star {

	public static void main(String[] args) {
		
		System.out.println("--------------------------------------1");		
//		* 
//		* * 
//		* * * 
//		* * * * 
//		* * * * *
		
		for(int i = 1; i < 6; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			
			System.out.println("");
		}

		System.out.println("--------------------------------------2");		
//              *
//      	  * *
//    		* * *
//  	  * * * *
//      * * * * *		
		for(int i = 1; i < 6; i++) {
			for(int j = 4; j >= i; j--) {
				System.out.print(" ");
			}
			
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}			
			
			System.out.println("");
		}		
		
		System.out.println("--------------------------------------3");			
//		* * * * * 
//		* * * * 
//		* * * 
//		* * 
//		* 
		
		for(int i = 1; i < 6; i++) {			
			for(int j = 5; j >= i; j--) {
				System.out.print("* ");
			}			
			
			System.out.println("");
		}		
		
		System.out.println("--------------------------------------4");			
//		* * * * * 
//		  * * * * 
//		    * * * 
//		      * * 
//		        * 
		
		for(int i = 1; i < 6; i++) {	
			for(int j = 1; j < i; j++) {
				System.out.print("  ");
			}
			
			for(int j = 5; j >= i; j--) {
				System.out.print("* ");
			}			
			
			System.out.println("");
		}			
	}

}

