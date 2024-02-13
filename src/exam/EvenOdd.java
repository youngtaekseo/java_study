package exam;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);		
		int num = sc.nextInt();
		
		if(num%2 == 0) {
			System.out.println(num +"는(은) 짝수입니다.");
		} else {
			System.out.println(num +"는(은) 홀수입니다.");
		}
	}

}
