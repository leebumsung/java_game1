package com.leebumsung.game01;

public class CharacterDTO {

	private int characterNum;
	private String characterName;
	private char gender;
	private int level;
	
	public CharacterDTO() {}

	public CharacterDTO(int characterNum, String characterName, char gender, int level) {
		super();
		this.characterNum = characterNum;
		this.characterName = characterName;
		this.gender = gender;
		this.level = level;
	}

	public int getCharacterNum() {
		return characterNum;
	}

	public void setCharacterNum(int characterNum) {
		this.characterNum = characterNum;
	}

	public String getCharacterName() {
		return characterName;
	}

	public void setCharacterName(String characterName) {
		this.characterName = characterName;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	@Override
	public String toString() {
		return "\n 케릭터번호: " + characterNum 
			 + "번\n 이    름: " + characterName 
			 + " \n 성    별: " + gender
			 + " \n 레    밸: " + level;
	}
}
