package com.nk.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class BaseTestObject {

	protected static WebDriver uiDriver;
	
	VideoRecord objvideo = new VideoRecord();
	ScreenCapturing objscreencap = new ScreenCapturing();
	
	public static String propertyFilePath = System.getProperty("user.dir")+"\\src\\test\\resource\\TestData\\testData.properties";
	public static String chromeDriverPath = System.getProperty("user.dir")+"\\src\\test\\resource\\Drivers\\chromedriver.exe";
	
	FileInputStream fileInput =null;
	//Properties ObjProperty = getPropertyContents();
	Properties ObjProperty=getPropertyContents();
	
	public String browser = ObjProperty.getProperty("browser");
	public String url = ObjProperty.getProperty("url");
	/**
	 
     * This function will execute before each Test tag in testng.xml
 
     * @param browser
 
     * @throws Exception
 
     */
	private static final Properties prop = new Properties();

	private static void loadPropertiesFile() 
	{
		InputStream input = null;

		try
		{
			input = new FileInputStream(propertyFilePath);
			// load a properties file
			prop.load(input);
		} 
		catch (IOException ex) 
		{
			ex.printStackTrace();
		} 
		finally 
		{
			if (input != null) 
			{
				try
				{
					input.close();
				} 
				catch (IOException e) 
				{
					e.printStackTrace();
				}
			}
		}
	}

	public static Properties getPropertyContents() {
		loadPropertiesFile();
		return prop;
	}
	
	
	
	@BeforeClass(alwaysRun = true)
    public void setup() throws Exception
	{
        if(browser.equalsIgnoreCase("FF"))
        {
            uiDriver = new FirefoxDriver();
        }
        else if(browser.equalsIgnoreCase("GC"))
        {
            System.setProperty("webdriver.chrome.driver",chromeDriverPath);
            uiDriver = new ChromeDriver();
        }
        else if(browser.equalsIgnoreCase("IE")){
            //System.setProperty("webdriver.ie.driver","C:\\IEdriver.exe");
            //uiDriver = new InternetExplorerDriver();
        }
        else
        {
        	
        	throw new Exception("Browser is not correct");
        }
        objvideo.startRecording();
        uiDriver.manage().deleteAllCookies();
        uiDriver.get(url);
        Thread.sleep(1000);
        uiDriver.manage().window().maximize();
        uiDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
        
}
	@AfterClass
	public void tearDown() throws Exception{
		
			Thread.sleep(1000);
			System.out.println();
			objscreencap.CaptureScreen();
			uiDriver.quit();
			objvideo.stopRecording();
			System.out.println("==================================================================================================");
			
	}
}