package com.hyewon.backjack;

import java.util.ArrayList;
import java.util.List;

public class CardDeck {
	private List<Card> cards = new ArrayList();// object타입을 배열에 넣을수있음! <>이거를 쓰면 무조건 Card타입만 넣고 뺼수있음

	public CardDeck() {
		for (int i = 0; i < Card.shapes.length; i++) {
			for (int z = 1; z <= Card.MAX_NO; z++) {
				Card c = new Card(Card.shapes[i], z);
				cards.add(c);// 빼는건 cards.get(index)(index만 넣을수있음), 삭제는 delete 다 삭제는 clear > 넣을때마다 인덱스가 자동으로
								// 올라간다
			}
		}
	}

	public Card getCard() {
		if (cards.size() == 0) {
			return null;
		}
		
		int randomIdx = (int) (Math.random() * cards.size());
		Card c = cards.get(randomIdx);
		cards.remove(c);
		return c;

	}
}
