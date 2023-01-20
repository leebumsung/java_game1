package com.leebumsung.game01;



public class CompareCard {
	
//	finalResult fR = new finalResult(c1result[1], c2result);
	
	int[] c1result = new int[2];
	public void resultCard1(int result1) {
		for(int i = 0; i < c1result.length; i++) {
		c1result[i] = result1;
		}
	}
	
	int[] c2result = new int[2];
	public void resultCard2(int result2) {
		for(int i = 0; i < c1result.length; i++) {
		c2result[i] = result2;
		}
	}
	
	public void finalResult(int result1, int result2) {
		if(result1 > result2) {
			System.out.println("1번 케릭터 win");
		} else if (result1 < result2) {
			System.out.println("2번 케릭터 win");
		} else if (result1 == result2) {
			System.out.println("동점입니다.");
		} else;
	}
}
