package com.hyewon.backjack;

public class Dealer extends Gamer{
	public void addCardMore(CardDeck cd) {
		int sum = openCards(false);
		if(sum <= 16) {
			Card c = cd.getCard();
			setCard(c);
		}
	}
	
	
}
