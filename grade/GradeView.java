package com.jse.grade;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class GradeView extends JFrame implements ActionListener{
	private static final long serialVersionUID = 1L;
	private Container container; 
    private JLabel title,nameLabel,korLabel,engLabel,
    				mathLabel,javaLabel; 
    private JTextField nameText, korText, engText, mathText,
    					javaText; 
    private JTextArea resultText; 
    private JButton saveButton, listButton; 
    public GradeService gradeService;
    
    public GradeView() {
    	gradeService = new GradeServiceImpl();
    }
    
    public void open(){ 
    	setTitle("Swing Exercise"); 
        setBounds(300, 90, 900, 600); 
        setDefaultCloseOperation(EXIT_ON_CLOSE); 
        setResizable(false); 
  
        container = getContentPane(); 
        container.setLayout(null); 
  
        title = new JLabel("Swing Form"); 
        title.setFont(new Font("Arial", Font.PLAIN, 30)); 
        title.setSize(300, 30); 
        title.setLocation(300, 30); 
        container.add(title); 
  
        nameLabel = new JLabel("Name"); 
        nameLabel.setFont(new Font("Arial", Font.PLAIN, 20)); 
        nameLabel.setSize(100, 20); 
        nameLabel.setLocation(100, 100); 
        container.add(nameLabel); 
  
        nameText = new JTextField(); 
        nameText.setFont(new Font("맑은고딕", Font.PLAIN, 15)); 
        nameText.setSize(190, 20); 
        nameText.setLocation(200, 100); 
        container.add(nameText); 
  
        korLabel = new JLabel("Userid"); 
        korLabel.setFont(new Font("Arial", Font.PLAIN, 20)); 
        korLabel.setSize(100, 20); 
        korLabel.setLocation(100, 150); 
        container.add(korLabel); 
  
        korText = new JTextField(); 
        korText.setFont(new Font("맑은고딕", Font.PLAIN, 15)); 
        korText.setSize(150, 20); 
        korText.setLocation(200, 150); 
        container.add(korText); 
  
        engLabel = new JLabel("Password"); 
        engLabel.setFont(new Font("Arial", Font.PLAIN, 20)); 
        engLabel.setSize(100, 20); 
        engLabel.setLocation(100, 200); 
        container.add(engLabel); 
        
        engText = new JTextField(); 
        engText.setFont(new Font("맑은고딕", Font.PLAIN, 15)); 
        engText.setSize(150, 20); 
        engText.setLocation(200, 200); 
        container.add(engText);
  
        mathLabel = new JLabel("SSN"); 
        mathLabel.setFont(new Font("Arial", Font.PLAIN, 20)); 
        mathLabel.setSize(100, 20); 
        mathLabel.setLocation(100, 250); 
        container.add(mathLabel); 
        
        mathText = new JTextField(); 
        mathText.setFont(new Font("맑은고딕", Font.PLAIN, 15)); 
        mathText.setSize(150, 20); 
        mathText.setLocation(200, 250); 
        container.add(mathText);
  
        javaLabel = new JLabel("Address"); 
        javaLabel.setFont(new Font("Arial", Font.PLAIN, 20)); 
        javaLabel.setSize(100, 20); 
        javaLabel.setLocation(100, 300); 
        container.add(javaLabel); 
        
        javaText = new JTextField(); 
        javaText.setFont(new Font("맑은고딕", Font.PLAIN, 15)); 
        javaText.setSize(150, 20); 
        javaText.setLocation(200, 300); 
        container.add(javaText);
        
  
        saveButton = new JButton("Submit"); 
        saveButton.setFont(new Font("Arial", Font.PLAIN, 15)); 
        saveButton.setSize(100, 20); 
        saveButton.setLocation(150, 450); 
        saveButton.addActionListener(this);
        container.add(saveButton);
  
        listButton = new JButton("List"); 
        listButton.setFont(new Font("Arial", Font.PLAIN, 15)); 
        listButton.setSize(100, 20); 
        listButton.setLocation(270, 450); 
        listButton.addActionListener(this);
        container.add(listButton); 
  
        resultText = new JTextArea(); 
        resultText.setFont(new Font("맑은고딕", Font.PLAIN, 15)); 
        resultText.setSize(300, 400); 
        resultText.setLocation(500, 100); 
        resultText.setLineWrap(true); 
        resultText.setEditable(false); 
        container.add(resultText); 
 
        setVisible(true); 
    }

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == saveButton) {
			nameText.setText("홍길동,유관순,이순신,신사임당,이도");
			korText.setText("50,40,60,80,100");
			engText.setText("50,10,70,100,100");
			mathText.setText("50,60,80,70,100");
			javaText.setText("80,40,70,80,80");
			String data = String.format("%s/%s/%s/%s/%s", 
					nameText.getText(),
					korText.getText(),
					engText.getText(),
					mathText.getText(),
					javaText.getText());
			String[] arr = data.split("/");
			Grade[] grades = new Grade[5];
			String[] names = arr[0].split(",");
			String[] kors = arr[1].split(",");
			String[] engs = arr[2].split(",");
			String[] maths = arr[3].split(",");
			String[] javas = arr[4].split(",");
			for(int i=0; i<5; i++) {
				grades[i] = new Grade();
				grades[i].setName(names[i]);
				grades[i].setKor(Integer.parseInt(kors[i]));
				grades[i].setEng(Integer.parseInt(engs[i]));
				grades[i].setMath(Integer.parseInt(maths[i]));
				grades[i].setJava(Integer.parseInt(javas[i]));
				gradeService.add(grades[i]);
			}
		}else if(e.getSource() == listButton) {
			Grade[] grades = gradeService.list();
			String result = "";
			for(int i=0;i<grades.length;i++) {
				result += String.format("[%s : 총점 %d 점, 평균 %d 점,학점 : %s]\n", 
						grades[i].getName(), 
						gradeService.total(grades[i]),
						gradeService.avg(grades[i]), 
						gradeService.record(grades[i]));
			}
			nameText.setText("");
			korText.setText("");
			engText.setText("");
			mathText.setText("");
			javaText.setText("");
			resultText.setText(result);
		}
		
	}
}
