package com.kh.psj;

public class Icecream {
	private int size;
	private String flavor1;
	private String flavor2;
	private String flavor3;
	private String flavor4;
	private String flavor5;

	public Icecream() {}
	
	public Icecream(int size, String flavor1, String flavor2, String flavor3, String flavor4, String flavor5) {
		this.size = size;
		this.flavor1 = flavor1;
		this.flavor2 = flavor2;
		this.flavor3 = flavor3;
		this.flavor4 = flavor4;
		this.flavor5 = flavor5;
	}
	
	public int getSize() {
		return this.size;
	}
	public String getFlavor1() {
		return this.flavor1;
	}
	public String getFlavor2() {
		return this.flavor2;
	}
	public String getFlavor3() {
		return this.flavor3;
	}
	public String getFlavor4() {
		return this.flavor4;
	}
	public String getFlavor5() {
		return this.flavor5;
	}
	
	
	public void setSize(int size) {
		this.size = size;
	}
	public void setFlavor1(String flavor1) {
		this.flavor1 = flavor1;
	}
	public void setFlavor2(String flavor2) {
		this.flavor2 = flavor2;
	}
	public void setFlavor3(String flavor3) {
		this.flavor3 = flavor3;
	}
	public void setFlavor4(String flavor4) {
		this.flavor4 = flavor4;
	}
	public void setFlavor5(String flavor5) {
		this.flavor5 = flavor5;
	}
}
