package com.cg.oca;


	
	abstract class Writer {
		 public static void write() {
		 System.out.println("Writing...");
		 }
		}
		class Author extends Writer {
		 public static void write() {
		 System.out.println("Writing book");
		 }
		}
		public class Code23 extends Writer {
		 public static void write() {
		 System.out.println("Writing code");
		 }
		 public static void main(String[] args) {
		 Writer w = new Code23();
		 w.write();
		 }

}
