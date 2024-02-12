package exam;

import java.util.StringTokenizer;

public class StringToken {

	public static void main(String[] args) {
		String str = "tel 02-1234-5678";
		
		StringTokenizer st;
		
		st = new StringTokenizer(str);
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
		System.out.println("--------------------------------");
		
		st = new StringTokenizer(str, " -"); // 디폴트값 false, 구분자는 문자열에서 제외된다
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}		
		
		System.out.println("--------------------------------");
		
		st = new StringTokenizer(str, " -", true); // 옵셥이 true 이면 구분자도 문자열에 포함된다
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}

}
