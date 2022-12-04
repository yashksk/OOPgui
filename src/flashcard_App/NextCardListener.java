package flashcard_App;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JTextArea;

public class NextCardListener implements ActionListener {
	
	private JTextArea question;
	private JTextArea answer;
	private ArrayList<FlashCard> cardList;
	public NextCardListener(ArrayList<FlashCard> cardList, JTextArea question, JTextArea answer) {
		this.cardList = cardList;
		this.question = question;
		this.answer = answer;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Button Clicked");
		FlashCard card = new FlashCard();
		cardList.add(card);
		clearCard();
	}

	private void clearCard() {
		// TODO Auto-generated method stub
		question.setText("");
		answer.setText("");
		question.requestFocus();
		
	}

}
