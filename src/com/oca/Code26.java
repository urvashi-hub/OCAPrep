package com.cg.oca;

public class Code26 {

		 public static void main(String[] args) {
		 int x = 10;
		 int y = 2;
		 try {
		 for (int z = 2; z >= 0; z--) {
		 int ans = x / z;
		System.out.print(ans+ " ");
		 }
		 } catch (Exception e1) {
		 System.out.println("E1");
		 } catch (ArithmeticException e1) {
		 System.out.println("E2");
		 }
		 }
		

}
//when already a catch block is present then arithmetic catch will be unreachable