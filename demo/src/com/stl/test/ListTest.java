package com.stl.test;

import java.util.ArrayList;

public class ListTest {
	public static final String ACCEPT_PHOTO_STATUS_FLAG = "S" ;
	public static final String REJECT_PHOTO_STATUS_FLAG = "F" ;
	public static final String AUDITED_PHOTO_STATUS_FLAG = "K" ;
	public static final String DEFAULT_PHOTO_STATUS_FLAG = "D" ;
	public static void main(String[] args) {
		/*ArrayList<String> alStrName = new ArrayList<String>() ;
		alStrName.add("x") ;
		alStrName.add("x") ;
		alStrName.add(null) ;
		alStrName.add(null) ;
		
		System.out.println(alStrName.size());*/
		
		Object []arrObj = new Object[]{"x","y"} ;
		String[] arrStr = (String[])arrObj ;
		System.out.println(arrStr);

	}

}
