package com.leebumsung.game01;

public class CharacterManager {
	
	public void printCharacter1() {
		CharacterDTO[] listCharacter1 = new CharacterListManager().listCharacter1();
		System.out.println("선택하신 케릭터 정보 \n-----------------" + listCharacter1[0]);
	}

	public void printCharacter2() {
		CharacterDTO[] listCharacter2 = new CharacterListManager().listCharacter2();
		System.out.println(" 선택하신 케릭터 정보 \n-----------------" + listCharacter2[0]);
	}
	
	public void printCharacter3() {
		CharacterDTO[] listCharacter3 = new CharacterListManager().listCharacter3();
		System.out.println("선택하신 케릭터 정보 \n-----------------" + listCharacter3[0]);
	}

	public void printCharacter4() {
		CharacterDTO[] listCharacter4 = new CharacterListManager().listCharacter4();
		System.out.println(" 선택하신 케릭터 정보 \n-----------------" + listCharacter4[0]);
	}
}




