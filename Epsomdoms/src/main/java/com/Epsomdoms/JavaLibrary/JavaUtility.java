package com.Epsomdoms.JavaLibrary;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 * This class provides theResusable Method to Perform Java-Related Actions
 * -By Calling Inbuilt Methods
 * 
 * @author SURYA REDDY
 */
public class JavaUtility {
	
	/**
	 * This Method is used to Pause
	 * @param long time
	 * @return void*/
	public void pause(long time) {

		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {

			e.printStackTrace();
			
		}
	}
	public int generateRandomNum(int limit) {
		Random random=new Random();
		return random.nextInt(limit);
	}
	
	public String getCurrentTime() {
	    Date date=new Date();
	    SimpleDateFormat sdf=new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
	    return sdf.format(date);
		
	}

}
