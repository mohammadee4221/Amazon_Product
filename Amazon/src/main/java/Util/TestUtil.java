package Util;

import BaseTest.BaseTest;

public class TestUtil extends BaseTest{
	
	
	//public static long PAGE_LOAD_TIMEOUT = 20;
	public static long IMPLICIT_WAIT = 30;
	
	public void switchToWindow() {
		for (String winHandle : driver.getWindowHandles()) {
		    driver.switchTo().window(winHandle); 
		}
	}
}
