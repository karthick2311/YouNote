package com.YouNote.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

Properties pro;
	
	public ReadConfig()
	{
		File src = new File("./Configuration/config.properties");

		try {
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		} catch (Exception e) {
			System.out.println("Exception is " + e.getMessage());
		}
	}
	
	public String getApplicationURL()
	{
		String url=pro.getProperty("baseURL");
		return url;
	}
	public String getMobileNumer()
	{
		String url=pro.getProperty("MobileNumber");
		return url;
	}
	public String getPassword()
	{
		String url=pro.getProperty("Password");
		return url;
	}
	public String getChromepath()
	{
		String url=pro.getProperty("Chromepath");
		return url;
	}
	public String getGeckodriver()
	{
		String url=pro.getProperty("Geckodriver");
		return url;
	}
	public String getSelectionBox()
	{
		String url=pro.getProperty("SelectionBox");
		return url;
	}
}
