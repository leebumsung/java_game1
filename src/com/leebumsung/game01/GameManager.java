package com.leebumsung.game01;

public class GameManager {

	SelectCard sCard = new SelectCard();
	CompareCard cCard = new CompareCard();
	
	public void CardPlay1() {
		
		sCard.selectCard1();
	}
	
	public void CardPlay2() {
		
		sCard.selectCard2();
	}
	
	public void result() {
		cCard.finalResult(0, 0);
	}
}
