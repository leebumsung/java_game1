package com.leebumsung.game01;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		CharacterManager characterManager = new CharacterManager();
		GameManager gamePlayManger = new GameManager();
		
		boolean bool = true;
		while(bool) {
			System.out.println("==========카드 게임============");
			System.out.println("1. FirstCharacter");
			System.out.println("2. SecondCharacter");
			System.out.println("8. 게임시작");
			System.out.println("9. 게임종료");
			System.out.println("번호를 입력하세요 : ");
			
			int no = sc.nextInt();
			
			switch(no) {
			case 1 :
				characterManager.inputCharacterInfom1();
				characterManager.printCharacter1();
				bool = false;
				break;
			case 2 :
				characterManager.inputCharacterInfom2();
				characterManager.printCharacter2();
				bool = false;
				break;
			case 8 :
				gamePlayManger.CardPlay();
				bool = false;
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
}
