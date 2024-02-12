package exam;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.util.StringTokenizer;

public class FileReadWrite {

	public static void main(String[] args) {
		String str = "동해물과 백두산이\n마르고 닳도록";
		byte[] bt = {'a', 'b'};
		
		// 파일쓰기-1		
		try (Writer wr = new FileWriter("test.txt")) {
			wr.write(str);
			wr.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// 파일쓰기-2		
		try (FileOutputStream fos = new FileOutputStream("test2.txt");
			 OutputStreamWriter osw = new OutputStreamWriter(fos, "utf-8");
			 BufferedWriter bw = new BufferedWriter(osw);
			) 
		{
			bw.write(str);
			bw.flush();
		} catch (Exception e) {
			// TODO: handle exception
		}		
		

		// 파일쓰기-3
		try (FileOutputStream fos = new FileOutputStream("test3.txt");
			 BufferedOutputStream bos = new BufferedOutputStream(fos);			 
			) 
		{
			bos.write(bt);
			bos.write('\n');
			bos.write('1');
			bos.flush();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		// 파일쓰기-4
		try (Writer wt = new FileWriter("test4.txt");
			 BufferedWriter bw = new BufferedWriter(wt);
			) 
		{
			bw.write(str);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
//		try (
//				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//			) 
//		{
//			StringTokenizer iData;
//			
//			int iLoop = Integer.parseInt(br.readLine());
//			
//			for(int i = 0; i < iLoop; i++) {
//				iData = new StringTokenizer(br.readLine());
//				bw.write((Integer.parseInt(iData.nextToken()) + Integer.parseInt(iData.nextToken())) + "\n");
//			}
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
		
		// 파일읽기
		try (Reader rd = new FileReader("test.txt")) {
			int iData;
			String sData ="";
			while( (iData = rd.read()) != -1) {
				sData += (char) iData;
			}
			
			System.out.println(sData);
		} catch (IOException e) {
			e.printStackTrace();
		}
		


		
	}

}
