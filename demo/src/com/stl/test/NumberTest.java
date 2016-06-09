package com.stl.test;

public class NumberTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int num = 999999 ; 
		System.out.println(getCodedString(num));

	}

	public static String getCodedString(int num) {
		String s = Integer.toString(num) ;
		if(s.length() == 1){
			return "0000" + s ;
		}else if ( s.length() == 2 ){
			return "000" + s ;
		}else if ( s.length() == 3 ){
			return "00" + s ;
		}else if ( s.length() == 4 ){
			return "0" + s ;
		}else if ( s.length() == 5 ){
			return  s ;
		}else
			return "" ;
	}
}

