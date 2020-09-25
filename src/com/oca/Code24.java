package com.cg.oca;


class SuperClass {
	 SuperClass(int x) {
	 System.out.println("Super");
	 }
	}
	public class Code24 extends SuperClass {
	 Code24() {
	 //this(10);
		 super(10);
		 //Superclass(10);
		 //super.SuperClass (10);
	 System.out.println("Sub 2");
	 }
	
	public static void main (String[] args) {
		Code24 r= new Code24();
	}
	}
