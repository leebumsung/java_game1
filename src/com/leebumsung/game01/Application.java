package com.leebumsung.game01;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		GameManager gameManger = new GameManager();
		
		while(true) {
			System.out.println();
			System.out.println("==========카드 게임===========");
			System.out.println("1. 케릭터 선택");
			System.out.println("2. play game !");
			System.out.println("9. 게임종료");
			System.out.println("번호를 입력하세요 : ");
			
			int no = sc.nextInt();
			
			switch(no) {
			case 1 :
				choiceCharacter();
				break;
			case 2 :
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
	}
	
	private static void choiceCharacter() {
		Scanner sc = new Scanner(System.in);
		CharacterManager characterManager = new CharacterManager();

		while(true) {
			System.out.println();
			System.out.println("========== Character 2개를 고르세요 ===========");
			System.out.println("1. niceGuy");
			System.out.println("2. wonderWomen");
			System.out.println("3. smartGuy");
			System.out.println("4. prettyWomen");
			System.out.println("9. 메인메뉴");
			System.out.println("번호를 입력하세요 : ");
			
			int no = sc.nextInt();
			
			switch(no) {
			case 1 :
				characterManager.printCharacter1();
				break;
			case 2 :
				characterManager.printCharacter2();
				break;
			case 3 :
				characterManager.printCharacter3();
				break;
			case 4 :
				characterManager.printCharacter4();
				break;
			case 9 :
				System.out.println("메인메뉴로 돌아갑니다.");
				return;
			default :
				System.out.println("정확한 번호를 입력하세요.");
				break;
			}
		}
	}
}
