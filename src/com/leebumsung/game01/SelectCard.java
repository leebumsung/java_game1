package com.leebumsung.game01;

public class SelectCard {

	CompareCard cCard = new CompareCard();
	
	public void selectCard() {
	String[] shapes = {"SPADE", "CLOVER", "HEART", "DIAMOND"};
	String[] cardNumbers = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "JACK", "QUEEN", "KING"};
	
	int result = 0;
	for(int i = 1; i <= 2; i++) {
		int shape = (int) (Math.random() * shapes.length);
		int cardNum = (int) (Math.random() * cardNumbers.length);
		if(cardNum == 10) {
			selectCard(); } 
		else if (cardNum == 11) {
			selectCard();} 
		else if (cardNum == 12) {
			selectCard();}
		else {
			System.out.println("받은카드는 " + shapes[shape] + ", " + cardNumbers[cardNum] + " 입니다.");
			result += Integer.parseInt(cardNumbers[cardNum]);
			System.out.println("받은 카드합은 : " + result + "입니다");
			cCard.compareCard(result);
			}
		System.out.println();
		}
	
	}
}
