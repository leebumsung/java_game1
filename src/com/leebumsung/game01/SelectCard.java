package com.leebumsung.game01;

public class SelectCard {
	
	String[] shapes = {"SPADE", "CLOVER", "HEART", "DIAMOND"};
	String[] cardNumbers = {"ACE", "2", "3", "4", "5", "6", "7", "8", "9", "10", "JACK", "QUEEN", "KING"};
	
	public int selectCard1() {
	int result1 = 0;
	for(int i = 1; i <= 2; i++) {
		int shape = (int) (Math.random() * shapes.length);
		int cardNum = (int) (Math.random() * cardNumbers.length);
		
		if(cardNum == 10 || cardNum == 11 || cardNum == 12) {
			i -= i;
			continue;}
		else {
			System.out.println("첫번째 케릭터가 받은카드는 " + shapes[shape] + ", " + cardNumbers[cardNum] + " 입니다.");
			if(cardNumbers[cardNum] == "ACE") {cardNumbers[cardNum] = cardNumbers[cardNum].replace("ACE", "1");}
			result1 += Integer.parseInt(cardNumbers[cardNum]);
			System.out.println("첫번째 케릭터가 받은 카드합은 : " + result1 + " 입니다");
			}
		}
	return result1;
	}	
	
	public int selectCard2() {
		int result2 = 0;
		for(int i = 1; i <= 2; i++) {
			int shape = (int) (Math.random() * shapes.length);
			int cardNum = (int) (Math.random() * cardNumbers.length);
			
			if(cardNum == 10 || cardNum == 11 || cardNum == 12) {
				i -= i;
				continue;}
			else {
				System.out.println("두번째 케릭터가 받은카드는 " + shapes[shape] + ", " + cardNumbers[cardNum] + " 입니다.");
				if(cardNumbers[cardNum] == "ACE") {cardNumbers[cardNum] = cardNumbers[cardNum].replace("ACE", "1");}
				result2 += Integer.parseInt(cardNumbers[cardNum]);
				System.out.println("두번째 케릭터가 받은 카드합은 : " + result2 + " 입니다");
				}
			}
		return result2;
		}
	
}

