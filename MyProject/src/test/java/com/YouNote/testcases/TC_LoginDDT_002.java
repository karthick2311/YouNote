package com.YouNote.testcases;

import java.io.IOException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.YouNote.pageObjects.LoginPage;
import com.YouNote.utilities.XLUtils;

public class TC_LoginDDT_002 extends BaseClass
{

	@Test(dataProvider="LoginData")
	public void loginDDT(String MobileNumber,String Pwd) throws InterruptedException
	{
		LoginPage lp=new LoginPage(driver);
		lp.setMobileNumber(MobileNumber);
		logger.info("user name provided");
		lp.setPassword(Pwd);
		logger.info("password provided");
		lp.clickSubmit();

		
		Thread.sleep(3000);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		if(url.equals("https://dev.younote.in/"))
		{
			System.out.println("passed");
			logger.warn("Login failed");
		}
		else
		{
			System.out.println("fail");
			Thread.sleep(3000);
			
		}
        driver.navigate().refresh();

		
	}
	
	
	
	@DataProvider(name="LoginData")
	String [][] getData() throws IOException
	{
		String path="C:\\Users\\karthick\\eclipse-workspace\\MyProject\\src\\test\\java\\com\\YouNote\\testData\\LoginData.xlsx";
		
		int rownum=XLUtils.getRowCount(path, "Sheet1");
		int colcount=XLUtils.getCellCount(path,"Sheet1",1);
		
		String logindata[][]=new String[rownum][colcount];
		
		for(int i=1;i<=rownum;i++)
		{
			for(int j=0;j<colcount;j++)
			{
				logindata[i-1][j]=XLUtils.getCellData(path,"Sheet1", i,j);//1 0
			}

		}
	return logindata;

	}
	
}