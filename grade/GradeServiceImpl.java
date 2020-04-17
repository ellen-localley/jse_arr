package com.jse.grade;

public class GradeServiceImpl implements GradeService {

	private Grade[] grades;
	private int count;

	public GradeServiceImpl() {
		grades = new Grade[5];
		count = 0;
	}

	@Override
	public void add(Grade grade) {
		grades[count] = grade;
		count++;
	}

	@Override
	public int total(Grade grade) {
		return grade.getKor() + grade.getEng() + grade.getMath() + grade.getJava();
	}

	@Override
	public int avg(Grade grade) {
		return total(grade) / 4;
	}

	@Override
	public String record(Grade grade) {
		String result = "";
		int avg = avg(grade);
		if (avg >= 90) {
			result = "A";
		} else if (avg >= 80) {
			result = "B";
		} else if (avg >= 70) {
			result = "C";
		} else if (avg >= 60) {
			result = "D";
		} else if (avg >= 50) {
			result = "E";
		} else {
			result = "F";
		}
		return result;
	}

//	@Override
//	public String printGrades() {
//		String result = "";
//		Grade[] grades = getGrades();
//		for (int i = 0; i < 5; i++) {
//			result += String.format("[%s : 총점 %d 점, 평균 %d 점,학점 : %s]", 
//					grades[i].getName(), 
//					total(grades[i]),
//					avg(grades[i]), 
//					record(grades[i]));
//		}
//		return result;
//	}

	@Override
	public Grade[] list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Grade detail(Grade grade) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return count;
	}

	@Override
	public void update(Grade grade) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Grade grade) {
		// TODO Auto-generated method stub

	}

	@Override
	public String ranking() {
		// TODO Auto-generated method stub
		return null;
	}
}
