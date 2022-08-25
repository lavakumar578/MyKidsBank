package com.mykidsbank.genericUtlity;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.mykidsbank.ObjectRepository.HomePage;
import com.mykidsbank.ObjectRepository.LoginPage;
import com.mykidsbank.ObjectRepository.MyKidsBankPage;

import io.github.bonigarcia.wdm.WebDriverManager;
/**
 * This class  is  used to get the common annotations
 * @author LAVA KUMAR

 * created by lavakumar

 */
public class BaseClass {
	public LoginPage loginPage;
	public HomePage homePage;
	public MyKidsBankPage myKidsBankPage;
	public WebDriver driver;
	public JavaLangUtility javaLangUtility;
	public long longTimeOut;
	public int randomNum;
	public String username;
	public String password;
	public String url;
	public String browser;
	public String bankerLogin;
	public DriverUtility driverUtility; 
	public static WebDriver staticdriver;
	
	/**
	 * This annotation is used to open Excel and Property file
	 * @throws IOException
	 */
	@BeforeSuite(groups="baseclass")
	public void beforeSuite() throws IOException
	{
		PropertiesUtility.openPropertyFile(ILocation.PROPERTYPATH);
		XlsxUtility.openExcel(PropertiesUtility.getDataFromProperty("excelpath"));		
	}
	/**
	 * This annotation is used to close the excel file
	 * @throws IOException

	 * hi this is lavakumar

	 */
	@AfterSuite(groups="baseclass")
	public void afterSuiteTest() throws IOException
	{
		XlsxUtility.setDataToExcel(PropertiesUtility.getDataFromProperty("excelpath"));
		XlsxUtility.closeExcel();
	}
	/**
	 * This annotation is used to perform loginAction
	 */
	@BeforeMethod(groups="baseclass")
	public void beforeMethodTest()
	{
		myKidsBankPage.bankerLogin(bankerLogin);
		loginPage.login(username,password );
	}
	/**
	 * This annotation is used to perform logout
	 */
	@AfterMethod(groups="baseclass")
	public void afterMethodTest()
	{
		homePage.signout();
	}
	/**
	 * This annotation is used to get common data from propertyfile
	 * create instance for all generic utilities
	 */
	//@Parameters("browser")
	@BeforeClass(groups="baseclass")
	public void beforeClassTest(/*String browser*/)
	{
		javaLangUtility=new JavaLangUtility();
		XlsxUtility.openDataFormtter();
		String timeout=PropertiesUtility.getDataFromProperty("timeOut");
		longTimeOut=javaLangUtility.stringToLong(timeout);
		randomNum=javaLangUtility.getRandomNumber(1000);
		username=PropertiesUtility.getDataFromProperty("userName");
		password=PropertiesUtility.getDataFromProperty("password");
		url=PropertiesUtility.getDataFromProperty("url");
		browser=PropertiesUtility.getDataFromProperty("browser");
		bankerLogin=PropertiesUtility.getDataFromProperty("bankerLogin");
//		browser=System.getProperty("BROWSER");
//		url=System.getProperty("URL");
//		username=System.getProperty("USERNAME");
//		password=System.getProperty("PASSWORD");
		switch(browser)
		{
		case "chrome":
			{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			break;
			}
		case "edge":
			{
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			break;
			}
		case "firefox":
		{
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		break;
		}
		}
		
		staticdriver=driver;
		myKidsBankPage=new MyKidsBankPage(driver);
		loginPage=new LoginPage(driver);
		homePage=new HomePage(driver);
		driverUtility = new DriverUtility(driver);
		DriverUtility.navigateApp(url, driver);
		DriverUtility.browserSetting(driver, longTimeOut);
		
		driverUtility.intiallizeAction(driver);

	}
	/**
	 *This annotation is used to logout
	 * @throws IOException 
	 */
	@AfterClass(groups="baseclass")
	public void afterClassTest() throws IOException
	{
		DriverUtility.quitBrowser(driver);
	}
	
	
	
	
}
