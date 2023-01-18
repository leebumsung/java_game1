package com.leebumsung.game01;

public class GamerListManager {

	public GamerDTO[] listGamer1() {
		
		return new GamerDTO[] {
			new GamerDTO(1, "niceGuy", '남'),
		};
	}
	
	public GamerDTO[] listGamer2() {
		
		return new GamerDTO[] {
			new GamerDTO(2, "wonderWomen", '여')
		};
	}
}
