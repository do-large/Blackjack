package com.hyewon.backjack;

public class Card {
	public static final String[] shapes = { "spade", "heart", "clover", "diamond" };
	public static final String[] markers = { "A", "J", "Q", "K" };
	public static final int MAX_NO= 13;
	private String shape;
	private String marker; // A, 2~10, J,Q,K
	private int score;

	@Override
	public String toString() {
		return shape + ":" + marker+":" + score;
	}
	
	public Card(String shape, int no) {
		setShape(shape);
		creatMarkerScore(no);
	}
	
	public String getShape() {
		return shape;
	}

	private void setShape(String shape) {
		for (int i = 0; i < shapes.length; i++) {
			if (shape.equals(shapes[i])) {
				this.shape = shape;
				return;// 중요중요 이게없으면 항상 널값만 들어가게됨
			}
		}
		this.shape = "";
		return; // void라도 이게 자동으로 항상 들어감
	}

	public String getMarker() {
		return marker;
	}

	private void creatMarkerScore(int no) {// 마커, 스코어 처리용
		if (no == 1) {
			setMarker("A");
			setScore(no);
		} else if (no >= 2 && no <= 10) {
			setMarker(Integer.toString(no));
			setScore(no);
		} else if (no <= 13) {
			if (no == 11) {
				setMarker("j");
			} else if (no == 12) {
				setMarker("Q");
			} else if (no == 13) {
				setMarker("K");
			}
			setScore(10);
		} else {
			setMarker("");
			setScore(0);
		}
	}

	private void setMarker(String marker) {
		this.marker = marker;
	}

	public int getScore() {
		return score;
	}

	private void setScore(int score) {
		this.score = score;
	}

}
