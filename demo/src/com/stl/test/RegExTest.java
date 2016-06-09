package com.stl.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExTest {

	public static void main(String[] args) {
		String strRegEx = "@[A-Za-z\\d_-]+\\."+"[A-Za-z\\d_-]+" ;
		System.out.println(strRegEx);
		String str = "tableA.id=@tableB.name and tableB.id=@tableC.id " ;
		Pattern p = null ;
		Matcher m = null ;
		p = Pattern.compile(strRegEx);
		m = p.matcher(str);
		int count = 0 ;
		String subStr ;
		while(m.find()) {
	         count++;
	         System.out.println("Match number "+count);
	         System.out.println("start(): "+m.start());
	         System.out.println("end(): "+m.end());
	         subStr = str.substring(m.start()+1, m.end()) ;
	         System.out.println(subStr +"  length : "+subStr.length());
	    }
		System.out.println("count:"+count);
	}

}
