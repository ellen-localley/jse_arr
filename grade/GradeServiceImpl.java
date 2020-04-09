package com.jse.grade;

public class GradeServiceImpl implements GradeService {

	private Grade[] grades;
	private int count;

	public GradeServiceImpl() {
		grades = new Grade[3];
		count = 0;
	}

	@Override
	public void setGrades(Grade[] grades) {
		this.grades = grades;

	}

	@Override
	public Grade[] getGrades() {
		return grades;
	}

	@Override
	public void setCount(int count) {
		this.count = count;

	}

	@Override
	public int getCount() {
		return count;
	}

	@Override
	public void add(Grade grade) {
		grades[count] = grade;
		count++;
	}

	@Override
	public int total(Grade grade) {
		return grade.getKor() + grade.getEng() + grade.getMath();
	}

	@Override
	public int avg(Grade grade) {
		return total(grade) / 3;
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

	@Override
	public String printGrades() {
		String result = "";
		for (int i = 0; i < 3; i++) {
			Grade[] grades = getGrades();
			result += String.format("[%s : 총점 %d 점, 평균 %d 점,학점 : %s]", 
					grades[i].getName(), 
					total(grades[i]),
					avg(grades[i]), 
					record(grades[i]));
		}
		return result;
	}

}
