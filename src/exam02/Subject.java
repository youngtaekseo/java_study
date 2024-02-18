package exam02;

public class Subject {
	private int kor; // 국어
	private int eng; // 영어
	private int mat; // 수학
	
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}

	@Override
	public String toString() {
		return kor + "\t" + eng + "\t" + mat;
	}
}
