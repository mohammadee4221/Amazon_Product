package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import BaseTest.BaseTest;

public class AmazonAppPage extends BaseTest {
	
	public AmazonAppPage() {
		PageFactory.initElements(driver, this);
	}
	
	 @FindBy(how=How.CSS, using="#twotabsearchtextbox") WebElement searchBox;
	 @FindBy(how=How.CSS, using=".nav-search-submit") WebElement searchButton;
	 @FindBy(how=How.XPATH, using="//*[@id=\"priceblock_ourprice\"]")public WebElement iPhoneAmazonPrice;
	 @FindBy(how=How.XPATH, using="//span[@class='a-size-medium a-color-base a-text-normal' and contains(text(), \"Apple iPhone XR (64GB) - Yellow\")]") WebElement iphone;
	 	
	 public void searchIPhone() {
		searchBox.sendKeys("iPhone XR (64GB) - Yellow");
		searchButton.click();
	 }

	 public void selectIPhone() {
		iphone.click();
	 }	
}
