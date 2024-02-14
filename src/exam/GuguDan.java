package exam;

public class GuguDan {

	public static void main(String[] args) {

		// 구구단
		System.out.println("===== 구구단 =====");
		for(int iGop = 0; iGop <= 9; iGop++) {
			for(int iDan = 2; iDan <= 9; iDan++) {
				if(iGop == 0) {
					System.out.print(iDan + "단" + "\t");
				} else {
					System.out.print(iDan + "*" + iGop + "=" + (iDan * iGop) + "\t");
				}				
			}
			
			System.out.println("");
		}	
		
		// 짝수 구구단
		System.out.println("");
		System.out.println("===== 짝수 구구단 =====");		
		for(int iGop = 0; iGop <= 9; iGop++) {
			for(int iDan = 2; iDan <= 9; iDan++) {
				if(iDan%2 == 0) {
					if(iGop == 0) {
						System.out.print(iDan + "단" + "\t");
					} else {
						System.out.print(iDan + "*" + iGop + "=" + (iDan * iGop) + "\t");
					}					
				}					
			}
			
			System.out.println("");
		}
		
		// 홀수 구구단
		System.out.println("");
		System.out.println("===== 홀수 구구단 =====");		
		for(int iGop = 0; iGop <= 9; iGop++) {
			for(int iDan = 2; iDan <= 9; iDan++) {
				if(iDan%2 != 0) {
					if(iGop == 0) {
						System.out.print(iDan + "단" + "\t");
					} else {
						System.out.print(iDan + "*" + iGop + "=" + (iDan * iGop) + "\t");
					}					
				}					
			}
			
			System.out.println("");
		}		
	}

}
