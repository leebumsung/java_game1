package com.leebumsung.game01;

public class SelectCard {

	public void selectCard() {
	String[] shapes = {"SPADE", "CLOVER", "HEART", "DIAMOND"};
	String[] cardNumbers = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "JACK", "QUEEN", "KING", "ACE"};
	
	int shape = (int) (Math.random() * shapes.length);
	int cardNum = (int) (Math.random() * cardNumbers.length);
	
	System.out.println("받은카드는 " + shapes[shape] + ", " + cardNumbers[cardNum] + " 입니다.");
	
	}
}
