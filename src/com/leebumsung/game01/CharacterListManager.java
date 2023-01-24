package com.leebumsung.game01;

public class CharacterListManager {

	public CharacterDTO[] listCharacter1() {
		
		return new CharacterDTO[] {
			new CharacterDTO(1, "niceGuy", '남', 10)
		};
	}

	public CharacterDTO[] listCharacter2() {
		
		return new CharacterDTO[] {
			new CharacterDTO(2, "wonderWomen", '여', 10)
		};
	}
	public CharacterDTO[] listCharacter3() {
		
		return new CharacterDTO[] {
			new CharacterDTO(3, "smartGuy", '남', 11)
		};
	}

	public CharacterDTO[] listCharacter4() {
		
		return new CharacterDTO[] {
			new CharacterDTO(4, "prettyWomen", '여', 11)
		};
	}
}
