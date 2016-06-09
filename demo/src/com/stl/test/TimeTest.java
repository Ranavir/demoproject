package com.stl.test;

import java.util.Calendar;
import java.util.Date;

public class TimeTest {

	public TimeTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		/*Date whateverDateYouWant = new Date();
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(whateverDateYouWant);

		int unroundedMinutes = calendar.get(Calendar.MINUTE);
		int mod = unroundedMinutes % 15;
		calendar.add(Calendar.MINUTE, mod < 8 ? -mod : (15-mod));*/
		System.out.println(Calendar.getInstance().get(Calendar.MILLISECOND) % 1000);
		for(int i = 0 ; i < 10 ; i++ ){
			Calendar calendar = Calendar.getInstance();
			System.out.println(calendar.getTime());
			
	        /*calendar.set(Calendar.SECOND, 0);
	        calendar.set(Calendar.MILLISECOND, 0);*/
			final int MINUTE_INTERVAL = 5 ;
			int milliinterval = 0 ; 
			
	        int min = calendar.get(Calendar.MINUTE) % MINUTE_INTERVAL;
	        int sec = calendar.get(Calendar.SECOND) % 60;
	        int milli = calendar.get(Calendar.MILLISECOND) % 1000;
	        System.out.println(min+" "+sec+" "+milli);
	        /*if(min > 0) {
	
	            calendar.add(Calendar.MINUTE, -min + MINUTE_INTERVAL);
	        }
	        if(sec > 0){
	        	calendar.add(Calendar.SECOND, -sec);
	        }
	        if(milli > 0){
	        	calendar.add(Calendar.MILLISECOND, -milli);
	        }*/
	        milliinterval = ((-min + MINUTE_INTERVAL) * 60 * 1000) - (sec * 1000) - milli ;
	        calendar.add(Calendar.MILLISECOND, milliinterval) ;
	        System.out.println(calendar.getTime()+"\n\n");
	        
	        
		}
		System.out.println(Calendar.getInstance().get(Calendar.MILLISECOND) % 1000);
	}

}
