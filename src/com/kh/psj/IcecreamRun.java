package com.kh.psj;

import com.kh.psj.IcecreamFunction;

public class IcecreamRun {
	public static void main(String[] args) {
		IcecreamFunction iFunc = new IcecreamFunction();
		EXIT: while (true) {
			int choice = iFunc.printMenu();
			switch (choice) {
			case 1:
				iFunc.printSize();
				break;
			case 2:
				iFunc.inputFlavor();
				break;
			case 3:
				break;
			case 4:
				break EXIT;
			default:
				break;
			}
		}
	}
}
