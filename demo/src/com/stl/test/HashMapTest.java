package com.stl.test;

import java.util.HashMap;

public class HashMapTest {


	public static void main(String[] args) {
		HashMap<String,Object> hm = new HashMap<String, Object>(4) ;
		hm.put("abcdef",1) ;
		hm.put("abcdfG",2) ;
		hm.put("abcdfH",3) ;
		hm.put("abcdfM",4) ;
		hm.put("abcdfK",5) ;
		
		hm.put("AaAaAa",5) ;
		hm.put("AaAaBB",5) ;
		hm.put("AaBBAa",5) ;
		hm.put("AaBBBB",5) ;
		hm.put("BBBBBB",5) ;
		
	}

}
/*see a test method, basically, so long as you match, a1*31+b1 = a2*31 +b2, which means (a1-a2)*31=b2-b1*/