package exam02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentTest {

	public static void main(String[] args) {	
		List<Student> stList = new ArrayList<Student>();
		Student student;
		
		student = new Student("Tony");
		student.addSubject(88, 95, 80);
		stList.add(student);
		
		student = new Student("Tiffany");
		student.addSubject(90, 93, 85);
		stList.add(student);
		
		student = new Student("Jennifer");
		student.addSubject(83, 90, 86);
		stList.add(student);		
		
		// 정렬
		Collections.sort(stList);
		
		// 등수계산
		student.calcRank(stList);	
		
		// 성적출력
		student.printScore(stList);
	}
}
