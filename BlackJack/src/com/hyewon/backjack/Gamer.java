package com.hyewon.backjack;

import java.util.ArrayList;
import java.util.List;

public class Gamer {
	protected List<Card> myCards = new ArrayList();

	// 카드한장받기
	public void setCard(Card c) {
		myCards.add(c);
	}

	// 카드오픈
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
