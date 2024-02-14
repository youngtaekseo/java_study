package exam;

public class AsterikTree {

	public static void main(String[] args) {
		for(int i = 0; i < 5; i++) {
			// 공백 출력
			for(int j = 4; j > i; j--) {
				System.out.print(" ");
			}
			
			// * 출력
			for(int j = 0; j < (i*2) + 1; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		System.out.println("----------------------");
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 9; j++) {
				if(j <= (5-i)) {
					System.out.print(" ");
				} else if(j >= (5+i)) {
					break;
				} else {
					System.out.print("*");	
				}				
			}
			
			System.out.println();
		}		
	}

}
