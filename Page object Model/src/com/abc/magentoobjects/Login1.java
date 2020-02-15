package com.abc.magentoobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login1 {
		WebDriver driver;
		By email=By.id("email");
		By password=By.id("pass");
		By login=By.id("send2");
		 
		public Login1(WebDriver driver)
		{
			this.driver=driver;
		}
		public void typeEmail(String em)
		{
			driver.findElement(email).sendKeys(em);
		}
		public void typePassword(String pw)
		{
			driver.findElement(password).sendKeys(pw);
		}
		public void clickOnlogin()
		{
			driver.findElement(login).click();
		}

}
