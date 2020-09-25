package com.cg.oca;

import java.util.ArrayList;
import java.util.List;

public class Code25 {
		 public static void main(String[] args) {
		 List<String> items = new ArrayList<>();
		 items.add("Pen");
		 items.add("Pencil");
		 items.add("Box");
		 items.add("Box");
		 for (String i : items) {
			 System.out.println(i);
		 }
		 for (String i : items) {
		 if (i.indexOf("P") == 0) {
		 continue;
		 } else {
		 System.out.print(i+" ");
		 }
		 }
		 }
		}


