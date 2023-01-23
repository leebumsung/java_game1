package com.leebumsung.game01;

public class CalculateCard {
	
//	CalculateCard calCard = new CalculateCard();
//	GameManager gameM = new GameManager();
	
	int c1result = 0;
	int fc1result = 0;
	public void resultCard1(int result1) {
		for(int i = 1; i <= 2; i++) {
		c1result += result1;
		fc1result = c1result % 10;
		}
//		gameM.result(fc1result);
//		System.out.println("첫번째 결과 : " +  fc1result);
	
	}
	
	int c2result = 0;
	int fc2result = 0;
	public void resultCard2(int result2) {
		for(int i = 0; i <= 2; i++) {
		c2result += result2;
		fc2result = c2result % 10;
		}
//		gameM.result(fc2result);
//		System.out.println("두번째 결과 : " +  fc2result);
		
	}
	
	
//	public void finalResult(int fc1, int fc2) {
//		if(fc1 > fc2) {
//			System.out.println("1번 케릭터 win");
//		} else if (fc1 < fc2) {
//			System.out.println("2번 케릭터 win");
//		} else if (fc1 == fc2) {
//			System.out.println("동점입니다.");
//		} else;
//	}
}
