package com.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
WebDriver driver; 
public LoginPage(WebDriver driver ) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	
}
@FindBy(xpath="//input[@id='email']")
WebElement login;
public WebElement getLogin() {
	return login;

}

//adding a comment
@FindBy(xpath="//input[@id='pass']")
 private WebElement password;
private WebElement getPassword() {
	return password;
}




}
