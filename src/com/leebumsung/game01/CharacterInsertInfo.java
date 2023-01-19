package com.leebumsung.game01;

public class CharacterInsertInfo {

	public void insert(CharacterDTO[] characters) {
		
		for(int i = 0; i < characters.length; i++) {
			System.out.println(characters[i].getCharacterName() + " 님이 입장하셨습니다.");
			System.out.println("----------------------");
		}
	}
}
