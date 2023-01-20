package com.leebumsung.game01;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		CharacterManager characterManager = new CharacterManager();
		GameManager gameManger = new GameManager();
		
		while(true) {
			System.out.println();
			System.out.println("==========카드 게임============");
			System.out.println("1. FirstCharacter");
			System.out.println("2. SecondCharacter");
			System.out.println("3. 1번째 케릭터 두장의 카드를 받으세요");
			System.out.println("4. 2번째 케릭터 두장의 카드를 받으세요");
			System.out.println("5. 결과를 확인하세요");
			System.out.println("9. 게임종료");
			System.out.println("번호를 입력하세요 : ");
			
			int no = sc.nextInt();
			
			switch(no) {
			case 1 :
//				choiceCharacter();
				characterManager.inputCharacterInfom1();
				characterManager.printCharacter1();
				break;
			case 2 :
				characterManager.inputCharacterInfom2();
				characterManager.printCharacter2();
				break;
			case 3 :
				gameManger.CardPlay1();
				break;
			case 4 :
				gameManger.CardPlay2();
				break;
			case 5 :
				gameManger.result();
				break;
			case 9 :
				System.out.println("게임종료합니다.");
				return;
			default :
				System.out.println("정확한 번호를 입력하세요.");
				break;
			}
		}
		
//		private int choiceCharactor() {
//			}
	}
}
