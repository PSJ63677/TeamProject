package com.kh.psj;

import java.util.Scanner;

public class IcecreamFunction {
	Icecream icecream;
	
	public IcecreamFunction() {
		icecream = new Icecream();
	}

	public int printMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("===== �轺Ų��� =====");
		System.out.println("1. ���� ����");
		System.out.println("2. �� ����");
		System.out.println("3. �����ϱ�");
		System.out.print("���� : ");
		int choice= sc.nextInt();
		return choice;
	}
	
	public int printSize() {
		Scanner sc = new Scanner(System.in);
		System.out.println("===== ���� ���� =====");
		System.out.println("1. ����Ʈ(3������)");
		System.out.println("2. ����(4������)");
		System.out.println("3. �йи�(5������)");
		System.out.print("���� : ");
		int size = sc.nextInt();
		return size;
//		icecream.setSize(size);
	}
	
	public void inputFlavor() {
		System.out.println("===== �� ���� =====");
		System.out.println("��Ʈ���ݸ�Ĩ / �׸�Ƽ / �ǽ�Ÿġ�� / ���ݸ����� / �Ƹ�����");
		System.out.println("����ġ������ũ / �����¿ܰ��� / ��Ű��ũ�� / ���Ʈ / ���ý�Ÿ");
		System.out.println();
		Scanner sc = new Scanner(System.in);
		if(icecream.getSize() == 1) {
			System.out.println("����Ʈ 3�������� �Է����ּ���");
			System.out.println("1��°�� : ");
			String flavor1 = sc.next();
			System.out.println("2��°�� : ");
			String flavor2 = sc.next();
			System.out.println("3��°�� : ");
			String flavor3 = sc.next();			
//			icecream.setFlavor1(flavor1);
//			icecream.setFlavor2(flavor2);
//			icecreams.setFlavor3(flavor3);
//			icecreams.setFlavor4(flavor4);
//			icecreams.setFlavor5(flavor5);
//			System.out.println("�����Ͻ� ���� (" + icecreams.getFlavor1() + ", " + icecreams.getFlavor2() + ", " + icecreams.getFlavor3() + ") �Դϴ�.");
			System.out.println("������ �������ּ���.");
		} else if(icecream.getSize() == 2) {
			System.out.println("���� 4�������� �Է����ּ���");
			System.out.println("1��°�� : ");
			String flavor1 = sc.next();
			System.out.println("2��°�� : ");
			String flavor2 = sc.next();
			System.out.println("3��°�� : ");
			String flavor3 = sc.next();		
			System.out.println("4��°�� : ");
			String flavor4 = sc.next();
//			System.out.println("�����Ͻ� ���� (" + icecreams.getFlavor1() + ", " + icecreams.getFlavor2() + ", " + icecreams.getFlavor3() + ", " + icecreams.getFlavor4() + ") �Դϴ�.");
			System.out.println("������ �������ּ���.");
		} else if(icecream.getSize() == 3) {
			System.out.println("�йи� 5�������� �Է����ּ���");
			System.out.println("1��°�� : ");
			String flavor1 = sc.next();
			System.out.println("2��°�� : ");
			String flavor2 = sc.next();
			System.out.println("3��°�� : ");
			String flavor3 = sc.next();		
			System.out.println("4��°�� : ");
			String flavor4 = sc.next();
			System.out.println("5��°�� : ");
			String flavor5 = sc.next();
//			System.out.println("�����Ͻ� ���� (" + icecreams.getFlavor1() + ", " + icecreams.getFlavor2() + ", " + icecreams.getFlavor3() + ", " + icecreams.getFlavor4() + ", " + icecreams.getFlavor5() + ") �Դϴ�.");
			System.out.println("������ �������ּ���.");
		} else {
			
		}
	}
}
