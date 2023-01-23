package com.leebumsung.game01;

public class GameManager {

	SelectCard sCard = new SelectCard();
	CalculateCard calcCard = new CalculateCard();
	
	public void CardPlay1() {
		
		sCard.selectCard1();
	}
	
	public void CardPlay2() {
		
		sCard.selectCard2();
	}
	
	
	public void result() {
		int fc1 = sCard.selectCard1();
		int fc2 = sCard.selectCard2();
		if(fc1 > fc2) {
			System.out.println("1번 케릭터 win");
		} else if (fc1 < fc2) {
			System.out.println("2번 케릭터 win");
		} else if (fc1 == fc2) {
			System.out.println("동정입니다.");
		} else;
	}
}
