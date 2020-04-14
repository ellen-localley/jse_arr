package com.jse.member;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LoginView extends JFrame implements ActionListener{
	
	JButton saveButton, cancelButton;
	JTextField[] textFields;
	JPanel[] panels;
	JLabel[] labels;
	
	private static final long serialVersionUID = 1L;
	public void open() {
		labels = new JLabel[5];
		panels = new JPanel[5];
		textFields = new JTextField[4];
		String[] names = {"회원가입","이름","아이디","패스워드","주민등록번호"};
		for(int i=0; i < names.length; i++) {
			labels[i] = new JLabel(names[i]);
			panels[i] = new JPanel();
		}
		
		labels[0] = new JLabel("회원가입");
		labels[1] = new JLabel("이름");
		labels[2] = new JLabel("아이디");
		labels[3] = new JLabel("패스워드");
		labels[4] = new JLabel("주민등록번호");
				
		textFields[0] = new JTextField();
		textFields[1] = new JTextField();
		textFields[2] = new JTextField();
		textFields[3] = new JTextField();
		this.setSize(600, 600);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		panel.setLayout(null);
		
		labels[0].setBounds(250, 20, 200, 80);
		labels[1].setBounds(100, 100, 100, 40);
		labels[2].setBounds(100, 150, 100, 40);
		labels[3].setBounds(100, 200, 100, 40);
		labels[4].setBounds(100, 250, 100, 40);
		
		
		
		
		textFields[0].setBounds(250, 100, 200, 30);
		textFields[1].setBounds(250, 150, 200, 30);
		textFields[2].setBounds(250, 200, 200, 30);
		textFields[3].setBounds(250, 250, 200, 30);
		
		saveButton = new JButton("저장");
		cancelButton = new JButton("취소");
		
		saveButton.addActionListener(this);
		cancelButton.addActionListener(this);
		
		saveButton.setBounds(120, 300, 122, 30);
		cancelButton.setBounds(300, 300, 122, 30);
		
		
		this.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == saveButton) {
			JOptionPane.showMessageDialog(this, textFields[0].getText());
		}else if(e.getSource() == cancelButton) {
			
		}
		
	}
	public void add(JPanel panel) {
		
	}
}
