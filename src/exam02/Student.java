package exam02;

import java.util.ArrayList;
import java.util.List;

public class Student implements Comparable<Object> {
	private String name;
	private int korRank;
	private int engRank;
	private int matRank;
	private int totSum;
	private double totAvg;
	private Subject sj;
	private final int SUBJECT_COUNT = 3;
	
	// 생성자
	public Student(String name) {
		this.name = name;
	}	
	
	// 과목추가
	public void addSubject(int kor, int eng, int mat) {
		sj = new Subject();
		sj.setKor(kor); // 국어
		sj.setEng(eng); // 영어
		sj.setMat(mat); // 수학
		
		setTotSum(kor + eng + mat);
		setTotAvg((double)totSum / SUBJECT_COUNT);		
	}
	
	// 학생별 성적표시
	public String showStudentInfo() {
		if(name.length() > 7)
			return name + "\t" + sj.toString() + "\t\t총합:" + totSum + " 평균:" + String.format("%.1f", totAvg);
		else
			return name + "\t\t" + sj.toString() + "\t\t총합:" + totSum + " 평균:" + String.format("%.1f", totAvg);
	}
	
	// 등수계산
	public void calcRank(List<Student> stList) {
		Student stMy = null, stYou = null;		
		int korRank, engRank, matRank;
		
		for(int i = 0; i < stList.size(); i++) {
			korRank = 1;			
			engRank = 1;
			matRank = 1;
			
			stMy = stList.get(i);

			for(int j = 0; j < stList.size(); j++) {
				stYou = stList.get(j);
				
				// 국어
				if(stMy.getSj().getKor() < stYou.getSj().getKor()) {
					korRank++;
				}
				
				// 영어
				if(stMy.getSj().getEng() < stYou.getSj().getEng()) {
					engRank++;
				}
				
				// 수학
				if(stMy.getSj().getMat() < stYou.getSj().getMat()) {
					matRank++;
				}				
			}	
			
			stMy.setKorRank(korRank); // 국어			
			stMy.setEngRank(engRank); // 영어
			stMy.setMatRank(matRank); // 수학
		}		
	}	
	
	// 출력 : 성적, 합계
	public void printScore(List<Student> stList) {
		Student student;
		int totalSum = 0;
		double totalAvg = 0;
		
		// 성적출력		
		for(int i = 0; i < stList.size(); i++) {
			student = stList.get(i);
			System.out.println(student.showStudentInfo() 
							  + "\t\t전체등수:" + (i+1) + "/" + SUBJECT_COUNT  
					          + "\t국어등수:"   + student.getKorRank() 
					          + " 영어등수:"    + student.getEngRank() 
					          + " 수학등수:"    + student.getMatRank());
			System.out.println("----------------------------------------------------------------------------------------------------------------");	
		}	
		
		// 전체총합
		for(int j = 0; j < stList.size(); j++) {
			totalSum += stList.get(j).getTotSum();
		}		
		 		
		// 전체평균
		totalAvg = (double) totalSum / (stList.size() * SUBJECT_COUNT);
		System.out.print("전체총합:" + totalSum);
		System.out.printf("\t전체평균:%.1f %n", totalAvg);
		System.out.println("================================================================================================================");		
	}

	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public int getTotSum() {
		return totSum;
	}

	public void setTotSum(int totSum) {
		this.totSum = totSum;
	}

	public double getTotAvg() {
		return totAvg;
	}

	public void setTotAvg(double totAvg) {
		this.totAvg = totAvg;
	}
	
	public int getKorRank() {
		return korRank;
	}

	public void setKorRank(int korRank) {
		this.korRank = korRank;
	}

	public int getEngRank() {
		return engRank;
	}

	public void setEngRank(int engRank) {
		this.engRank = engRank;
	}

	public int getMatRank() {
		return matRank;
	}

	public void setMatRank(int matRank) {
		this.matRank = matRank;
	}

	public Subject getSj() {
		return sj;
	}

	public void setSj(Subject sj) {
		this.sj = sj;
	}

	@Override
	public int compareTo(Object o) {
		if( !(o instanceof Student)) return -1;		
		Student st = (Student) o;       
        return (this.totSum - st.totSum) * (-1);
	}
}
