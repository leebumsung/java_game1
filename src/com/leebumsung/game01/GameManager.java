package com.leebumsung.game01;

public class GameManager {

	SelectCard sCard = new SelectCard();
	
	public void result() {
		System.out.println("--------------------------------");
		int fc1 = sCard.selectCard1();
		System.out.println("--------------------------------");
		int fc2 = sCard.selectCard2();
		System.out.println("--------------------------------");
		if((fc1 % 10) > (fc2 % 10)) {
			System.out.println("======게임 결과=====");
			System.out.println("1번 케릭터 win");
			System.out.println("----------------");
		} else if ((fc1 % 10) < (fc2 % 10)) {
			System.out.println("======게임 결과=====");
			System.out.println("2번 케릭터 win");
			System.out.println("----------------");
		} else if ((fc1 % 10) == (fc2 % 10)) {
			System.out.println("======게임 결과=====");
			System.out.println("동점입니다.");
			System.out.println("-----------------");
		} else;
	}
}
