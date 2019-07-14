package com.hyewon.backjack;

import java.util.ArrayList;
import java.util.List;

public class Gamer {
	protected List<Card> myCards = new ArrayList();

	// ī������ޱ�
	public void setCard(Card c) {
		myCards.add(c);
	}

	// ī�����
	public int openCards(boolean isShow) {
		int sum = 0;
		for (Card c : myCards) {
			sum += c.getScore();
			if (isShow)
				System.out.println(c);
		}
		return sum;
	}
}
