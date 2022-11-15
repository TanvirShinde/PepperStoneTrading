package com.Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseTest.BaseTest;
import com.utility.ExcelReader;

public class LoginPage extends BaseTest {

	@FindBy(xpath = "//*[@id='field5']")
	private WebElement email_txt_Box;
	
	@FindBy(xpath = "//*[@id='field7']")
	private WebElement password_txt_Box;
	
	@FindBy(xpath = "//*[@type='submit']")
	private WebElement Login_Button;
	
	public LoginPage () {
	
		PageFactory.initElements(driver, this);
	}
	
	public void loginPepperStone () throws IOException, InterruptedException {
		
		email_txt_Box.sendKeys(ExcelReader.readData(0, 1));
		
		Thread.sleep(2000);
		
		password_txt_Box.sendKeys(ExcelReader.readData(1, 1));
		
		Thread.sleep(2000);
		
		Login_Button.click();
		
	}
}
