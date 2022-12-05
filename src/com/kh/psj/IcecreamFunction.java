package com.kh.psj;

import java.util.Scanner;

public class IcecreamFunction {
	Icecream icecream;
	
	public IcecreamFunction() {
		icecream = new Icecream();
	}

	public int printMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("===== 배스킨라빈스 =====");
		System.out.println("1. 종류 선택");
		System.out.println("2. 맛 선택");
		System.out.println("3. 결제하기");
		System.out.print("선택 : ");
		int choice= sc.nextInt();
		return choice;
	}
	
	public int printSize() {
		Scanner sc = new Scanner(System.in);
		System.out.println("===== 종류 선택 =====");
		System.out.println("1. 파인트(3가지맛)");
		System.out.println("2. 쿼터(4가지맛)");
		System.out.println("3. 패밀리(5가지맛)");
		System.out.print("선택 : ");
		int size = sc.nextInt();
		return size;
//		icecream.setSize(size);
	}
	
	public void inputFlavor() {
		System.out.println("===== 맛 선택 =====");
		System.out.println("민트초콜릿칩 / 그린티 / 피스타치오 / 초콜릿무스 / 아몬드봉봉");
		System.out.println("뉴욕치즈케이크 / 엄마는외계인 / 쿠키앤크림 / 요거트 / 슈팅스타");
		System.out.println();
		Scanner sc = new Scanner(System.in);
		if(icecream.getSize() == 1) {
			System.out.println("파인트 3가지맛을 입력해주세요");
			System.out.println("1번째맛 : ");
			String flavor1 = sc.next();
			System.out.println("2번째맛 : ");
			String flavor2 = sc.next();
			System.out.println("3번째맛 : ");
			String flavor3 = sc.next();			
//			icecream.setFlavor1(flavor1);
//			icecream.setFlavor2(flavor2);
//			icecreams.setFlavor3(flavor3);
//			icecreams.setFlavor4(flavor4);
//			icecreams.setFlavor5(flavor5);
//			System.out.println("선택하신 맛은 (" + icecreams.getFlavor1() + ", " + icecreams.getFlavor2() + ", " + icecreams.getFlavor3() + ") 입니다.");
			System.out.println("결제를 진행해주세요.");
		} else if(icecream.getSize() == 2) {
			System.out.println("쿼터 4가지맛을 입력해주세요");
			System.out.println("1번째맛 : ");
			String flavor1 = sc.next();
			System.out.println("2번째맛 : ");
			String flavor2 = sc.next();
			System.out.println("3번째맛 : ");
			String flavor3 = sc.next();		
			System.out.println("4번째맛 : ");
			String flavor4 = sc.next();
//			System.out.println("선택하신 맛은 (" + icecreams.getFlavor1() + ", " + icecreams.getFlavor2() + ", " + icecreams.getFlavor3() + ", " + icecreams.getFlavor4() + ") 입니다.");
			System.out.println("결제를 진행해주세요.");
		} else if(icecream.getSize() == 3) {
			System.out.println("패밀리 5가지맛을 입력해주세요");
			System.out.println("1번째맛 : ");
			String flavor1 = sc.next();
			System.out.println("2번째맛 : ");
			String flavor2 = sc.next();
			System.out.println("3번째맛 : ");
			String flavor3 = sc.next();		
			System.out.println("4번째맛 : ");
			String flavor4 = sc.next();
			System.out.println("5번째맛 : ");
			String flavor5 = sc.next();
//			System.out.println("선택하신 맛은 (" + icecreams.getFlavor1() + ", " + icecreams.getFlavor2() + ", " + icecreams.getFlavor3() + ", " + icecreams.getFlavor4() + ", " + icecreams.getFlavor5() + ") 입니다.");
			System.out.println("결제를 진행해주세요.");
		} else {
			
		}
	}
}
