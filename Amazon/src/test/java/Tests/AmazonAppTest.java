package Tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import BaseTest.BaseTest;
import Pages.AmazonAppPage;
import Util.TestUtil;
import Pages.FlipkartAppPage;

public class AmazonAppTest extends BaseTest{
	
	FlipkartAppPage flipkartAppPage;
	AmazonAppPage amazonAppPage;
	TestUtil testUtil;
	
	public AmazonAppTest(){
		super();		
	}
	
	@BeforeMethod
	public void setUp() throws InterruptedException {				
		
		amazonAppPage = new AmazonAppPage();
		flipkartAppPage = new FlipkartAppPage();
		testUtil = new TestUtil();
		
	}
	
	@Test(priority=0)
	public void amazonsearchIPhone(){
		
		amazonAppPage.searchIPhone();
		amazonAppPage.selectIPhone();
		testUtil.switchToWindow();
		String text = amazonAppPage.iPhoneAmazonPrice.getText();
		System.out.println("Amazon Price : " + text);		
		String text_removecurrencysymbol = text.substring(1,text.length());
		text_removecurrencysymbol = text_removecurrencysymbol.replaceAll("\\.0*$|\\s|[^a-zA-Z0-9]","");
		int Price1 = Integer.parseInt(text_removecurrencysymbol);
		System.out.println("Amazon Final Price : " +Price1);
		driver.navigate().to("https://www.flipkart.com/");

		flipkartAppPage.searchIPhoneFlip();
		flipkartAppPage.selectIPhoneFlip();
		testUtil.switchToWindow();
		String text2 = flipkartAppPage.iPhoneFlipkartPrice.getText();
		System.out.println("Flipkart Price: " + text2);
		String text2_removecurrencysymbol = text2.substring(1,text2.length());
		text2_removecurrencysymbol = text2_removecurrencysymbol.replaceAll("[^a-zA-Z0-9]","");				
		int Price2 = Integer.parseInt(text2_removecurrencysymbol);
		System.out.println("Flipkart Final Price : " +Price2);
        System.out.println("Iphone Min Price : " +Math.min(Price1,Price2)); 		
	
	}
		
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
}
