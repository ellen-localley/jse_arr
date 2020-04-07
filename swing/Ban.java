package com.jse.swing;

public class Ban {
	private GradeBean[]	grades;
	public Ban() {
		grades=new GradeBean[100];
	}
	
	public void setGrades(GradeBean[] grades) {
		this.grades=grades;
	}
	
	public GradeBean[] getGrades() {
		
		return grades;
	}

}
