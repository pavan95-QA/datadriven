package com.testing.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


import com.testing.utility.XLS_Reader;

public class datadriven {
	static WebDriver driver;
	static String build="http://way2automation.com/way2auto_jquery/index.php";
	
	@Test
	public static void fieread() {
		System.setProperty("webdriver.gecko.driver","./Drivers//geckodriver.exe");
		driver=new FirefoxDriver();	
		driver.get(build);
		
		//driving the test data by using excel sheet : data driven test
		XLS_Reader read=new XLS_Reader("C:\\Users\\welcome\\eclipse-workspace\\com.testing\\src\\test\\java\\com\\tesing\\TestData\\Regestrationform.xlsx");
		int rowcount=read.getRowCount("Registration");
		for(int i=2;i<=rowcount;i++) {
		String name=read.getCellData("Registration","Name", i);
		String phone=read.getCellData("Registration","Phone", i);
		String email=read.getCellData("Registration","Email", i);
		String country=read.getCellData("Registration","Country", i);
		String city=read.getCellData("Registration","City", i);
		String username=read.getCellData("Registration","Username", i);
		String password=read.getCellData("Registration","Password", i);
		
		//webdriver:code
		
		WebElement nameTF=driver.findElement(By.xpath("//input[@name='name']"));
		WebElement phoneTF=driver.findElement(By.xpath("//input[@name='phone']"));
		WebElement emailTF=driver.findElement(By.xpath("//input[@name='email']"));
		WebElement cityTF=driver.findElement(By.xpath("//input[@name='city']"));
		WebElement countryTFF=driver.findElement(By.xpath("//select[@name='country']"));
		WebElement usernameTF=driver.findElement(By.xpath("//div[@id='load_box']//input[@name='username']"));
		WebElement passwordTF=driver.findElement(By.xpath("//div[@id='load_box']//input[@name='password']"));
		
		//operations
		nameTF.clear();
		nameTF.sendKeys(name);
		phoneTF.clear();
		phoneTF.sendKeys(phone);
		emailTF.clear();
		emailTF.sendKeys(email);
		Select st=new Select(countryTFF);
		st.selectByVisibleText(country);
		cityTF.clear();
		cityTF.sendKeys(city);
		usernameTF.clear();
		usernameTF.sendKeys(username);
		passwordTF.clear();
		passwordTF.sendKeys(password);
		}	
	}
}
