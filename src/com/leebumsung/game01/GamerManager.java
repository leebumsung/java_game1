package com.leebumsung.game01;

public class GamerManager {

	public void inputGamerInfom1() {
		
		GamerDTO[] gamers = new GamerDTO[1];
		
		gamers[0] = new GamerDTO(1, "niceGuy", '남');
		
		GamerInsertInfo gamerInsertInfo = new GamerInsertInfo();
		gamerInsertInfo.insert(gamers);	
	}
	
	public void inputGamerInfom2() {
		
		GamerDTO[] gamers = new GamerDTO[1];
	
		gamers[0] = new GamerDTO(2, "wonderWomen", '여');
		
		GamerInsertInfo gamerInsertInfo = new GamerInsertInfo();
		gamerInsertInfo.insert(gamers);
		
	}
	
	public void printGamer1() {
		GamerDTO[] listGamer1 = new GamerListManager().listGamer1();
		System.out.println("선택하신 게이머는 " + listGamer1[0] + " 입니다.");
	}
	
	public void printGamer2() {
		GamerDTO[] listGamer2 = new GamerListManager().listGamer2();
		System.out.println("선택하신 게이머는 " + listGamer2[0] + " 입니다.");
	}
}




