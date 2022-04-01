package com.YouNote.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver ldriver;	
	public LoginPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(id="mui-1")
	@CacheLookup
	WebElement MobileNumber;
	
	@FindBy(id="mui-2")
	@CacheLookup
	WebElement PassWord;
	
	@FindBy(xpath="/html/body/div/div[2]/div/div/div[2]/div/form/button")
	@CacheLookup
	WebElement Login;
	
	@FindBy(xpath="//*[@class=\"MuiAvatar-img css-1pqm26d-MuiAvatar-img\"]")
	@CacheLookup
	WebElement YouNoteLogo;
	
	@FindBy(xpath="//*[@class=\"ant-image-img\"]")
	@CacheLookup
	WebElement YouNoteHomepageImage;
	
	@FindBy(xpath="//*[@class=\"MuiTypography-root MuiTypography-h6 makeStyles-customTitle-171 makeStyles-primaryFont-6 makeStyles-bold-172 css-us09l-MuiTypography-root\"]")
	@CacheLookup
	WebElement LoginText;
	
	@FindBy(xpath="//*[@href=\"/forgot-password\"]")
	@CacheLookup
	WebElement ForgotPassword;
	
	@FindBy(linkText="Don't have an account?")
	@CacheLookup
	WebElement DontAcct;
	
	@FindBy(linkText="Register")
	@CacheLookup
	WebElement RegisterText;

	@FindBy(linkText="Change Language?")
	@CacheLookup
	WebElement ChangeLanhuageText;
	
	@FindBy(linkText="English")
	@CacheLookup
	WebElement EnglishText;
	
	@FindBy(xpath="//*[@class=\"PrivateSwitchBase-input css-1m9pwf3\"]")
	@CacheLookup
	WebElement SelectionBox;
	
	@FindBy(linkText="Stay Signed In")
	@CacheLookup
	WebElement StaySignedInText;
	
	
	
	public void setMobileNumber(String MobilleNumber)
	{
		MobileNumber.sendKeys(MobilleNumber);
	}
	public void setPassword(String pwd)
	{
		PassWord.sendKeys(pwd);
	}

	public void clickSubmit()
	{
		Login.click();
	}

	public void setYouNoteLogo(String YounoteLogo)
	{
		PassWord.sendKeys(YounoteLogo);
	}

	public void setYouNoteHomepageImage(String YouNoteHomepageImage)
	{
		PassWord.sendKeys(YouNoteHomepageImage);
	}

	public void setLoginText(String LoginText)
	{
		PassWord.sendKeys(LoginText);
	}

	public void setForgotPassword(String ForgotPassword)
	{
		PassWord.sendKeys(ForgotPassword);
	}
	public void setDontAcct(String DontAcct)
	{
		PassWord.sendKeys(DontAcct);
	}

	public void setRegisterText(String RegisterText)
	{
		PassWord.sendKeys(RegisterText);
	}
	public void setChangeLanhuageText(String ChangeLanhuageText)
	{
		PassWord.sendKeys(ChangeLanhuageText);
	}
	public void setEnglishText(String EnglishText)
	{
		PassWord.sendKeys(EnglishText);
	}
	public void setSelectionBox(String SelectionBox)
	{
		PassWord.sendKeys(SelectionBox);
	}
	public void setStaySignedInText(String StaySignedInText)
	{
		PassWord.sendKeys(StaySignedInText);
	}

	
	
}

