package com.stl.test;

import java.util.StringTokenizer;
import java.util.regex.Pattern;

public class StringParse {

	

	public static void main(String[] args) {
		String pattern = "/storage/extSdCard:/storage/UsbDriveA:/storage/UsbDriveB" ;
		String pattern1 = "/storage/sdcard1" ;
		StringTokenizer st = new StringTokenizer(pattern1,":");
		while(st.hasMoreTokens()){
			System.out.println(st.nextToken());
		}
		
	}

}
