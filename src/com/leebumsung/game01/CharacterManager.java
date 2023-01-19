package com.leebumsung.game01;

public class CharacterManager {

	public void inputCharacterInfom1() {
		
		CharacterDTO[] character = new CharacterDTO[1];
		
		character[0] = new CharacterDTO(1, "niceGuy", '남');
		
		CharacterInsertInfo gamerInsertInfo = new CharacterInsertInfo();
		gamerInsertInfo.insert(character);	
	}
	
	public void inputCharacterInfom2() {
		
		CharacterDTO[] characters = new CharacterDTO[1];
	
		characters[0] = new CharacterDTO(2, "wonderWomen", '여');
		
		CharacterInsertInfo characterInsertInfo = new CharacterInsertInfo();
		characterInsertInfo.insert(characters);
	}
	
	public void printCharacter1() {
		CharacterDTO[] listCharacter1 = new CharacterListManager().listCharacter1();
		System.out.println("선택하신 케릭터 정보 \n-----------------" + listCharacter1[0]);
	}

	public void printCharacter2() {
		CharacterDTO[] listCharacter2 = new CharacterListManager().listCharacter2();
		System.out.println(" 선택하신 케릭터 정보 \n-----------------" + listCharacter2[0]);
	}
}




