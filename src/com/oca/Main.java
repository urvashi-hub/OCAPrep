package com.cg.oca;

public class Main { 
	      public static void main(String[] args) { 
	          Main one = new Main(); 
	          Main two = new Main(); 
	          Main three = one; 
	          one = null; 
	          Main four = one; 
	          three = null; 
	          two = null; 
	         two = new Main(); 
	         System.gc(); 
	     } 
	    } 
//The Main object from line 3 is first eligible for garbage collection immediately following line 8.
//The Main object from line 4 is first eligible for garbage collection immediately following line 9.