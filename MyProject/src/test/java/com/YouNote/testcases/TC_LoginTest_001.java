package com.YouNote.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.YouNote.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass{

	WebDriver ldriver;	

	@Test
	public void loginTest() throws InterruptedException {
		LoginPage lp=new LoginPage(driver);

		//logger.info("URL is opened");
		driver.get(baseURL);
		WebElement YouNoteLogo=driver.findElement(By.xpath("//*[@class=\"MuiAvatar-img css-1pqm26d-MuiAvatar-img\"]"));
		System.out.println(YouNoteLogo.isDisplayed());
		logger.info("YouNoteLogo is displyed");
		WebElement YouNoteHomepageImage=driver.findElement(By.xpath("//*[@class=\"ant-image-img\"]"));
		System.out.println(YouNoteHomepageImage.isDisplayed());
		logger.info("YouNoteHomepageImage is displayed");
		WebElement LoginText=driver.findElement(By.xpath("//*[@class=\"MuiTypography-root MuiTypography-h6 makeStyles-customTitle-171 makeStyles-primaryFont-6 makeStyles-bold-172 css-us09l-MuiTypography-root\"]"));
		System.out.println(LoginText.isDisplayed());
		logger.info("LoginText is displayed");
		Thread.sleep(3000);

		WebElement MobileNumberInputBox=driver.findElement(By.id("mui-1"));
		System.out.println(MobileNumberInputBox.isDisplayed());
		System.out.println(MobileNumberInputBox.isEnabled());
		MobileNumberInputBox.sendKeys("8344307156");
		logger.info("MobileNumberInputBox is displayed");
		WebElement PasswordInputBox=driver.findElement(By.id("mui-2"));
		System.out.println(PasswordInputBox.isDisplayed());
		System.out.println(PasswordInputBox.isEnabled());
		PasswordInputBox.sendKeys("Kar@2311");
		logger.info("PasswordInputBox is displayed");
		WebElement LoginButton=driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div[2]/div/form/button"));
		System.out.println(LoginButton.isDisplayed());
		System.out.println(LoginButton.isEnabled());
		//LoginButton.click();
		logger.info("LoginButton is displayed");
		
		WebElement ForgotPasswordText=driver.findElement(By.xpath("//*[@href=\"/forgot-password\"]"));
		System.out.println(ForgotPasswordText.isDisplayed()+"is displayed");
		System.out.println(ForgotPasswordText.isEnabled()+"is Enabled");
		logger.info("ForgotPasswordText is displyed");
		Thread.sleep(3000);

		WebElement DontAcct=driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div[2]/div/p[1]/span"));
		System.out.println(DontAcct.isDisplayed());
		logger.info("Don't have an account? is displyed");
		
		WebElement RegisterText=driver.findElement(By.xpath("//*[@href=\"/register\"]"));
		System.out.println(RegisterText.isDisplayed());
		System.out.println(RegisterText.isEnabled());
		logger.info("RegisterText is displyed");
		
		WebElement ChangeLanhuageText=driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div/div[2]/div/p[2]/span"));
		System.out.println(ChangeLanhuageText.isDisplayed());
		logger.info("ChangeLanhuageText is displyed");
		Thread.sleep(3000);
		
		WebElement lan = driver.findElement(By.xpath("//*[@style=\"background-color: transparent;\"]")); 
	    lan.getText();
	    System.out.println(lan);
		
		WebElement English=driver.findElement(By.xpath("//*[@aria-haspopup=\"listbox\"]"));
		System.out.println(English.isDisplayed());
		System.out.println(English.isEnabled());
		logger.info("EnglishText is displyed");
		English.click();
		Thread.sleep(3000);
		// Locate dropdown element on web page by By.xpath. 
	  
	    WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"menu-\"]/div[3]/ul")); 

	// Verify the dropdown is enabled and visible. 
	   if(dropdown.isEnabled() && dropdown.isDisplayed()) 
	   { 
	      System.out.println("Dropdown is enabled and visible"); 
	   } 
	  else { 
	      System.out.println("Dropdown is not visible"); 
	  } 
	// Create an object of Select class and pass the dropdown of type WebElement as an argument. 
		Thread.sleep(3000);

	   WebElement lantamil=driver.findElement(By.xpath("//*[@id=\"menu-\"]/div[3]/ul/li[2]"));
	   lantamil.click();
		Thread.sleep(3000);

		WebElement lan2=driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div/div[2]/div"));
		lan2.getText();
		System.out.println("Befer text"+lan+"After selecting the tamil language"+lan2);
		if(lan.equals(lan2)) {
		System.out.println("failed");
	}
		else {
			System.out.println("Passed");
		}

		WebElement SelectionBox=driver.findElement(By.xpath("//*[@type=\"checkbox\"]"));
		 System.out.println(SelectionBox.isDisplayed());
		System.out.println(SelectionBox.isEnabled());
		System.out.println(SelectionBox.isSelected());
		logger.info("SelectionBox is displyed");
		
		WebElement StaySignedInText=driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div/div[2]/div/p[2]/label/span[2]/span"));
		System.out.println(StaySignedInText.isDisplayed());
		logger.info("StaySignedInText is displyed");
		Thread.sleep(2000);

		
//		LoginPage lp=new LoginPage(driver);
//		lp.setMobileNumber(MobileNumber);
//		lp.setPassword(PassWord);
//		lp.clickSubmit();
		
		
		
		
}
}