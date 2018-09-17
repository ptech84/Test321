package com.crm.qa.testcases;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class SampleTest {
	
	public static void main(String[] args) {
		
	
	
	ArrayList<String> list = new ArrayList<String>();
	list.add("praveen");
	list.add("hjkp");
	
	for(int i=0;i<list.size();i++) {
		System.out.println(list.get(i));
	}
	
	SimpleJava java = new SimpleJava("praveen", 33, "hjkp");
	SimpleJava java1 = new SimpleJava("sam", 34, "nab");
	SimpleJava java2= new SimpleJava("tram", 36, "tab");
	ArrayList<SimpleJava> obj = new ArrayList<SimpleJava>();
	obj.add(java);
	obj.add(java1);
	obj.add(java2);
	
	Iterator<SimpleJava> it = obj.iterator();
while(it.hasNext()) {
	SimpleJava el = it.next();
	System.out.println(el.age);
	System.out.println(el.name);
	System.out.println(el.school);
}

ArrayList<String> list1 = new ArrayList<String>();
list1.add("naveen");
list1.add("hjkp");


list1.addAll(list);
System.out.println("*******************");
Iterator it1=list1.iterator();
while(it1.hasNext()) {
	System.out.println(it1.next());
}


LinkedList<String> ll = new LinkedList<String>();
ll.add("praveen");
ll.add("chaitra");
ll.addFirst("virat");
ll.addLast("tom");

ListIterator li = ll.listIterator();
System.out.println("********listiterator*******");
while(li.hasNext()) {
	li.next();
	boolean t = li.hasPrevious();
	System.out.println(t);
	
	
}



//for(int j=0;j<ll.size();j++) {
//	System.out.println("************linkedlist********");
//	System.out.println(ll.get(j));
//}


HashSet<String> hs = new HashSet<String>();
hs.add("tom");
hs.add("harry");
hs.add("parry");
System.out.println("*******hashset*********");
System.out.println(hs);

System.out.println("***************************************");



TreeSet<String> ts = new TreeSet<String>();
ts.add("Raghu");
ts.add("Virat");
ts.add("Praveen");

Iterator<String> itr = ts.iterator();
System.out.println("*******TreeSet*******");
while(itr.hasNext()) {
	System.out.println(itr.next());
}


HashMap<String,Integer> hm = new HashMap<String,Integer>();
hm.put("mddress", 35);
hm.put("Aerox", 2145);
hm.put("Virat", 100);

Set<Map.Entry<String, Integer>> se = hm.entrySet();
for(Map.Entry<String, Integer> i : se) {
	System.out.println("***********HashMap**********");
	System.out.println(i.getKey() + " " + i.getValue());
	
}


TreeMap<String,Integer> tm = new TreeMap<String,Integer>();

tm.put("mAME", 12);
tm.put("aest", 13);
tm.put("vev", 14);

System.out.println("*************TreeMap************");
Set<Map.Entry<String,Integer>> m = tm.entrySet();
for(Map.Entry<String,Integer> im:m) {
	System.out.println(im.getKey() + " " + im.getValue());
}


























	
	
	
	
	
	
}}