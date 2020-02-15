package com.abc.magentoobjects;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Welcome {
		WebDriver driver;
		By MyAcct=By.linkText("My Account");
		
	public Welcome(WebDriver driver)
	{
			this.driver=driver;
	}
	public void clickOnMyAccount()
	{
		driver.findElement(MyAcct).click();
	}
}
	
	