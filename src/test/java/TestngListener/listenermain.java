package TestngListener;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestngListener.listenerdemo.class)
public class listenermain {
	@Test
	public void googletitleverify() {
		System.setProperty("webdriver.gecko.driver","./Drivers//geckodriver.exe");
		WebDriver driver=new FirefoxDriver();	
	      driver.get("https://www.google.com/");
	      System.out.println(driver.getTitle());
	      driver.quit();
	}
}
