package com.leebumsung.game01;

public class GamerInsertInfo {

	public void insert(GamerDTO[] gamers) {
		
		for(int i = 0; i < gamers.length; i++) {
			System.out.println(gamers[i].getNicName() + "님이 입장하셨습니다.");
		}
	}
}
