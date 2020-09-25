package com.cg.oca;

public class Code27 {
	public static void main(String[] args) {
	StringBuilder s1 = new StringBuilder("JavaLang");
	 String s2 = "Loves";
	 s1.append(s2);
	 System.out.println(s1);
	 System.out.println(s1.substring(4));
	 System.out.println(s1.indexOf(s2));
}
}
//.substring displays the string from the given int (LangLoves)
//.indexOf(s2) gives the index of first alphabet of s2 in s1