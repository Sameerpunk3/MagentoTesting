package com.abc.utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.abc.magentoobjects.Home;
import com.abc.magentoobjects.Welcome;
import com.abc.magentoobjects.login;

public class MagentoTest {

	public static void main(String[] args) {
		WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("http://www.magento.com");
		
		Welcome w=new Welcome(driver);
		w.clickOnMyAccount();
		
		login l=new login(driver);
		l.typeEmail("ihassan395@gmail.com");
		l.Password("Welcome@123");
		l.clickOnlogin();
		
		Home h=new Home(driver);
		h.clickOnLogout();
		driver.quit();
		

	}

}
