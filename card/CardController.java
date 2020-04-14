package com.jse.card;

import javax.swing.JOptionPane;

public class CardController {
	public static void main(String[] args) {
		CardService service = new CardServiceImpl();
		Card card = null;
		String message = "";
		while (true) {
			switch (JOptionPane.showInputDialog("0.Exit  1.카드 3장 받기   2.출력")) {
			case "0": return;
			case "1":
				for (int i = 0; i < 3; i++) {
					String[] values = JOptionPane.showInputDialog("카드 3장 받기 - 모양,숫자").split(",");
					card = new Card();
					card.setKind(values[0]);
					card.setNumber(Integer.parseInt(values[1]));
					service.add(card);
				}

				break;
			case "2": 
				Card[] cards = service.getCards();
				message = "";
				for (int i = 0; i < 3; i++) {
					message += cards[i].toString()+"\n";
				}
				JOptionPane.showMessageDialog(null, message);
				break;
			}
		}
	}

}
