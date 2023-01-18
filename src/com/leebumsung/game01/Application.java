package com.leebumsung.game01;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("==========카드 게임============");
			System.out.println("1. FirstGamer");
			System.out.println("2. SecondGamer");
			System.out.println("9. 게임종료");
			System.out.println("게이머 선택");
			
			int no = sc.nextInt();
			
			switch(no) {
			case 1 :
			case 2 :
			case 9 :
			default :
					
			}
		}
	}
}
