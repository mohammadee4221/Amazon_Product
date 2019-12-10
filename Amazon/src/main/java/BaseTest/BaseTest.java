package BaseTest;
 
import java.io.IOException;
import java.util.concurrent.TimeUnit; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

import Util.TestUtil;
 
public class BaseTest {
 
	public static WebDriver driver;
	@BeforeSuite
	 public static void initialization() throws IOException{
	 
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Fameena\\Downloads\\chromedriver_win32 (5)\\chromedriver.exe");		 
		 driver = new ChromeDriver(); 
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		 driver.get("https://www.amazon.in");					 
							
	 } 
 
}
