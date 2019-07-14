package com.hyewon.backjack;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		CardDeck cd = new CardDeck();
		Dealer dealer = new Dealer();
		Gamer gamer = new Gamer();

		for (int i = 0; i < 2; i++) {
			Card c = cd.getCard();
			dealer.setCard(c);

			c = cd.getCard();
			gamer.setCard(c);
		}

		dealer.addCardMore(cd);

		Scanner scan = new Scanner(System.in);

		while (true) {
			int sum = gamer.openCards(true);
			System.out.printf("합계값은 %d입니다\n", sum);
			System.out.println("카드를 더 받으시겠습니까? (y\\n)");

			String answer = scan.next();

			if (answer.equals("y")) {
				Card c = cd.getCard();
				gamer.setCard(c);
			} else {
				break;
			}
		}

		scan.close();
		Role.whoIsWin(gamer, dealer);
	}

}
