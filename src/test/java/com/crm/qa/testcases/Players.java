package com.crm.qa.testcases;

public class Players {
	
	String firstname;
	String lastname;
	String contactno;
	
	Players(String fn,String ln, String cn){
		this.firstname=fn;
		this.lastname=ln;
		this.contactno=cn;
	}
	
	public String toString() {
		return firstname + lastname + contactno;
		
	}

}
