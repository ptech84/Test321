package com.crm.qa.testcases;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Contacts {
	
	
	public static void main(String[] args) {
		
	
	
	Players pl = new Players("praveen", "naidu", "9591370444");
	Players pl1 = new Players("chaitra", "praveen", "9591370333");
	Players pl2 = new Players("chaitra", "praveen", "9591370333");
	
	HashSet<Players> hs = new HashSet<Players>();
	hs.add(pl);
	hs.add(pl1);
	System.out.println(hs);
	
	
	LinkedHashSet<Players> lhs = new LinkedHashSet<Players>();
	lhs.add(pl1);
	lhs.add(pl);
	
	System.out.println(lhs);
	
	}
}
