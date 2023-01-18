package com.leebumsung.game01;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		GamerManager gameManager = new GamerManager();
		
		boolean bool = true;
		while(bool) {
			System.out.println("==========카드 게임============");
			System.out.println("1. FirstGamer");
			System.out.println("2. SecondGamer");
			System.out.println("8. 게임시작");
			System.out.println("9. 게임종료");
			System.out.println("번호를 입력하세요 : ");
			
			int no = sc.nextInt();
			
			switch(no) {
			case 1 :
				gameManager.inputGamerInfom1();
				gameManager.printGamer1();
				bool = false;
				break;
			case 2 :
				gameManager.inputGamerInfom2();
				gameManager.printGamer2();
				bool = false;
				break;
			case 8 :
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
