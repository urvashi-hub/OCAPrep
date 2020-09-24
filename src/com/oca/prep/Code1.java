package com.oca.prep;

public class Code1 { 
        private int i = 1; 
        public static void main(String argv[]){ 
           int i = 2; 
           Code1 s = new Code1 (); 
           s.someMethod(); 
        } 
        public static void someMethod(){ 
           System.out.println(i); 
        } 
      } 

