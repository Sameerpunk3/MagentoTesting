package com.abc.magentoobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login {
		WebDriver driver;
		@FindBy(id="email")
		WebElement email;
		@FindBy(id="pass")
		WebElement password;
		@FindBy(id="send2")
		WebElement login;
		 
		public login(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		 
		public void typeEmail(String em) {
			email.sendKeys(em);
		}
		
		public void Password(String pw) {
			password.sendKeys(pw);
		}
		
		public void clickOnlogin()
		{
			login.click();
		}
	}
