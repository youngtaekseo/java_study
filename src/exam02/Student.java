package exam02;

import java.util.ArrayList;
import java.util.List;

public class Student implements Comparable<Object> {
	private String name;
	private int totRank;
	private int korRank;
	private int engRank;
	private int matRank;
	private int totSum;
	private double totAvg;
	private Subject sj;
	private final int SUBJECT_COUNT = 3;
	private String[] titles = {"성명", "국어", "영어", "수학", "총합", "평균", "전체등수", "국어등수", "영어등수", "수학등수"};
	
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
			return name + "\t" + sj.toString() + "\t" + totSum + "\t" + String.format("%.1f", totAvg);
		else
			return name + "\t\t" + sj.toString() + "\t" + totSum + "\t" + String.format("%.1f", totAvg);
	}
	
	// 등수계산
	public void calcRank(List<Student> stList) {
		Student stMy = null, stYou = null;		
		int totRank, korRank, engRank, matRank;
		
		for(int i = 0; i < stList.size(); i++) {
			totRank = 1;
			korRank = 1;			
			engRank = 1;
			matRank = 1;
			
			stMy = stList.get(i);

			for(int j = 0; j < stList.size(); j++) {
				stYou = stList.get(j);
				
				// 전체등수
				if(stMy.getTotSum() < stYou.getTotSum()) {
					totRank++;
				}
				
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
			
			stMy.setTotRank(totRank); // 전체등수
			stMy.setKorRank(korRank); // 국어등수			
			stMy.setEngRank(engRank); // 영어등수
			stMy.setMatRank(matRank); // 수학등수
		}		
	}	
	
	// 출력 : 성적, 합계
	public void printScore(List<Student> stList) {
		Student student;
		int totalSum = 0;
		double totalAvg = 0;
		
		// 타이틀 출력
		for(int i = 0; i < titles.length; i++) {
			if(i == 0) {
				System.out.print(titles[i]+"\t\t");	
			} else {
				System.out.print(titles[i]+"\t");
			}				
		}
		System.out.println("");
		System.out.println("=====================================================================================");
		
		// 성적출력		
		for(int i = 0; i < stList.size(); i++) {
			student = stList.get(i);
			System.out.println(student.showStudentInfo() 
							  + "\t " + (student.getTotRank()) + "/" + SUBJECT_COUNT  
					          + "\t  " + student.getKorRank() 
					          + "\t  " + student.getEngRank() 
					          + "\t  " + student.getMatRank());
			System.out.println("-------------------------------------------------------------------------------------");	
		}	
		
		// 전체총합
		for(int j = 0; j < stList.size(); j++) {
			totalSum += stList.get(j).getTotSum();
		}		
		 		
		// 전체평균
		totalAvg = (double) totalSum / (stList.size() * SUBJECT_COUNT);
		System.out.print("전체총합:" + totalSum);
		System.out.printf("\t전체평균:%.1f %n", totalAvg);
		System.out.println("=====================================================================================");		
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
	
	public int getTotRank() {
		return totRank;
	}
	
	public void setTotRank(int totRank) {
		this.totRank = totRank;
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
        return (this.getTotSum() - st.getTotSum()) * (-1);
	}
}
