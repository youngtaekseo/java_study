package exam;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if(num == 0 || num <= 0) {
			System.out.println("1 이상의 양수만 입력하세요");
		} else {
			if(num%2 == 0) {
				System.out.println(num + "는(은) 짝수 입니다.");
			} else {
				System.out.println(num + "는(은) 홀수 입니다.");
			}
		}
	}
}
