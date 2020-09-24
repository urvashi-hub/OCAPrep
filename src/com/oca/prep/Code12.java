package com.oca.prep;

public class Code12 {
public static void main(String args[]) {
	int myArray[] = {1,2,3,4,5}; 
	//for(int n : myArray[]) { System.out.println(n); }
	for(int n : myArray) { System.out.println(n); }
	System.out.println("output 2 ");
	for(int n=1; n < 5; n++) { System.out.println(myArray[n]); }
	System.out.println("output 3");
	for(int n=1; n <= 4; n++) { System.out.println(myArray[n]); }
}
}
