package com.abc.utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.abc.magentoobjects.Home;
import com.abc.magentoobjects.Login1;
import com.abc.magentoobjects.Welcome;

public class MagentoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("http://www.magento.com");
		
		Welcome w=new Welcome(driver);
		w.clickOnMyAccount();
		
		Login1 l=new Login1(driver);
		l.typeEmail("ihassan395@gmail.com");
		l.typePassword("Welcome@123");
		l.clickOnlogin();
		
		Home h=new Home(driver);
		h.clickOnlogout1();
		driver.quit();
		
	}

}
