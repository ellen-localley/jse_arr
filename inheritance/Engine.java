package com.jse.inheritance;

import javax.swing.JOptionPane;

public class Engine {
	public static void main(String[] args) {
		PhoneService service = new PhoneService();
		String message = "";
		while (true) {
			System.out.println();
			switch (JOptionPane.showInputDialog("0.Exit 1.집전화입력 2.집전화출력" 
					+ " 3.휴대전화입력 4.휴대전화출력 5.아이폰 6.아이폰출력 7.갤럭시 8.갤럭시출력")) {
			case "0":
				return;
			case "1":
				for (int i = 0; i < 3; i++) {
					String[] values = JOptionPane.showInputDialog("전화번호,이름,회사를 입력하세요").split(",");
					service.add(new Phone(values[0], values[1], values[2]));
				}
				break;

			case "2":
				Phone[] phones = service.getPhones();
				message = "";
				for (int i = 0; i < 3; i++) {
					message += String.format("전화번호:%s, 이름:%s, 회사:%s \n", 
							phones[i].getPhoneNumber(),
							phones[i].getName(), 
							phones[i].getCompany());
				}
				JOptionPane.showMessageDialog(null, message);
				break;

			case "3":
				for (int i = 0; i < 3; i++) {
					String[] values = JOptionPane.showInputDialog("전화번호,이름,회사를 입력하세요").split(",");
					service.add(new CelPhone(values[0], values[1], values[2], true));
				}
				break;

			case "4":
				CelPhone[] celPhones = service.getCelPhones();
				message = "";
				for (int i = 0; i < 3; i++) {
					message += String.format("전화번호:%s, 이름:%s, 회사:%s, 휴대가능여부:%s \n", 
							celPhones[i].getPhoneNumber(),
							celPhones[i].getName(), 
							celPhones[i].getCompany(), 
							celPhones[i].getMove());
				}
				JOptionPane.showMessageDialog(null, message);
				break;
				
			case "5":
				for (int i=0;i<3;i++) {
					String[] values = JOptionPane.showInputDialog("전화번호,이름,회사,휴대,검색가능여부를 입력하세요").split(",");
					service.add(new Iphone(values[0], values[1], values[2], true, values[4]));
				}
				break;
				
			case "6":
				Iphone[] iPhones = service.getIphones();
				message = "";
				for (int i=0; i<3; i++) {
					message += String.format("전화번호:%s, 이름:%s, 회사:%s, 휴대가능여부:%s, 검색가능여부:%s \n", 
							iPhones[i].getPhoneNumber(),
							iPhones[i].getName(), 
							iPhones[i].getCompany(), 
							iPhones[i].getMove(),
							iPhones[i].getSearch());
							
				}
				JOptionPane.showMessageDialog(null, message);
				break;
				
			case "7":
				for (int i=0;i<3;i++) {
					String[] values = JOptionPane.showInputDialog("전화번호,이름,회사,휴대,검색,사이즈를 입력하세요").split(",");
					service.add(new GalaxyNote(values[0], values[1], values[2], true, values[4], values[5]));
				}
				break;
				
			case "8":
				GalaxyNote[] galaxyNotes = service.getGalaxyNotes();
				message = "";
				for (int i=0;i<3;i++) {
					message += String.format("전화번호:%s, 이름:%s, 회사:%s, 휴대가능여부:%s, 검색가능여부:%s, 사이즈:%s \n", 
							galaxyNotes[i].getPhoneNumber(),
							galaxyNotes[i].getName(), 
							galaxyNotes[i].getCompany(), 
							galaxyNotes[i].getMove(),
							galaxyNotes[i].getSearch(),
							galaxyNotes[i].getBigSize());
				}
				JOptionPane.showMessageDialog(null, message);
				break;
			}
		}
	}
}
