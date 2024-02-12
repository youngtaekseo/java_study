package exam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;

public class ForEach {

	public static void main(String[] args) {
		int[] sr = {1, 2, 3, 4, 5};
		int[] sr2 = new int[5];
		
		for(int i = 0; i < 5; i++) {
			System.out.println(sr[i]);
		}
		
		System.out.println("------------------------");
		
		for(Integer s: sr) {
			System.out.println(s);
		}
		
		System.out.println("------------------------");
		
		ArrayList<Integer> al = new ArrayList<>();
		al.add(1);
		al.add(2);
		al.add(3);
		
		for(Integer i: al) {
			System.out.println("for " + i);
		}
		
		System.out.println("------------------------");
		
		Consumer<Integer> ct = inData -> System.out.println("Consumer " + inData);
		al.forEach(ct);
		
		System.out.println("------------------------");

		// 람다식
		al.forEach(pData -> System.out.println("forEach " + pData));
		
		System.out.println("------------------------");
		
		int cnt = 0;
		cnt = (int) Arrays.stream(sr).count();
		System.out.println(cnt);
		
		System.out.println("------------------------");
		
		cnt = 0;
		cnt = Arrays.stream(sr).sum();
		System.out.println(cnt);		
		
		System.out.println("------------------------");
		
		System.arraycopy(sr, 0, sr2, 0, 5);
		Arrays.stream(sr2).forEach(pData -> System.out.println(pData));
	}

}
