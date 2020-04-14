package com.jse.grade;
import javax.swing.JOptionPane;
import com.jse.util.Constants;
public class GradeController {
	public static void main(String[] args) {
		GradeService gradeService = new GradeServiceImpl();
		Grade grade = null;
		while (true) {
			switch (JOptionPane.showInputDialog(Constants.GRADE_MENU)) {
			case "0": return;
			case "1":
				for (int i = 0; i < 3; i++) {
					String[] values = JOptionPane.showInputDialog(Constants.GRADE_INPUT).split(",");
					grade = new Grade();
					grade.setName(values[0]);
					grade.setKor(Integer.parseInt(values[1]));
					grade.setEng(Integer.parseInt(values[2]));
					grade.setMath(Integer.parseInt(values[3]));
					gradeService.add(grade);
				}
				break;
			case "2": 
				JOptionPane.showMessageDialog(null, gradeService.printGrades());
				break;
			case "3": 
				JOptionPane.showMessageDialog(null, gradeService.ranking());
				break;
			}
		}
	}
}
