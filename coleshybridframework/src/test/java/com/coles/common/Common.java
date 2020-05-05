package com.coles.common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;		//selenium interface
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class Common {

		private static String getURL = "https://www.coles.com.au/";
		public static String getGetURL() {
			return getURL;
	}
	
		WebDriver driver;	//selenium interface, instance variable/class level variable
		
		public static WebDriver getbrowser (String browserName,WebDriver driver) {
			if (browserName.equalsIgnoreCase("chorme")) {
				System.setProperty("webdriver.chorme.driver","./Driver/chromedriver.exe");
				driver = new ChromeDriver();
	}
			if (browserName.equalsIgnoreCase("opera")) {
				System.setProperty("webdriver.opera.driver","./Browser/operadriver");
				driver=new OperaDriver();
	}
			else if (browserName.equalsIgnoreCase("geckodriver")) {
				System.setProperty("webdriver.firefox.driver","./Browser/operadriver");
				driver=new FirefoxDriver();
	}
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
			return driver;
	}
		
	
}
