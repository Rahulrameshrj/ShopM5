package Utility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import PomClasses1.AccountSettingPage;
import PomClasses1.LoginPage;
import PomClasses1.WelcomePage;

public class BaseClass {
public static WebDriver driver;
public DataUtility data=new DataUtility();
public WebDriverUtility wu=new WebDriverUtility();
public DropDownUtility dp =new DropDownUtility();

@BeforeClass
public void launchingBrowser()throws Throwable {
	System.out.println("---------launchingBrowser--------");
String BROWSER	=data.dataFromPropertiesFile("Browser");

if(BROWSER.equals("Chrome")) {
	driver=new ChromeDriver();
}
else if (BROWSER.equals("firefox")) {
driver=new FirefoxDriver();
}
else {
	driver = new ChromeDriver();
	}
String URL = data.dataFromPropertiesFile("URL");
driver.get(URL);
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
}

@BeforeMethod
public void loginToApplication() throws Throwable {
	System.out.println("-------loginToApplication-------");
	
	Thread.sleep(3000);
	WelcomePage WLPage = new WelcomePage(driver);
	Thread.sleep(2000);
	WelcomePage.getMainLoginButton().click();
	
	LoginPage Lpage = new LoginPage(driver);
	
	String password=data.dataFromPropertiesFile("UN");
	Lpage.getEmailTextField().sendKeys(emailId);
	
	String Password=data.dataFromPropertiesFile("Pass");
	Lpage.getPasswordTextField().sendKeys(Password);
	
Lpage.getLoginButton().click();
}
@AfterMethod
public void logoutFromApplication()throws Throwable {
	System.out.println("---------logoutFromApplication---------");
	Thread.sleep(6000);
	HomePage Hpage=new HomePage(driver);
	Hpage.javaScriptClick(driver);
	
	AccountSettingPage ASpage= new AccountSettingPage(driver);
	ASpage.getLogoutIcon().click();
}
	
@AfterMethod

public void quitBrowser() {
	System.out.println("---------quitBrowsert---------");
	driver.quit();	
}

}

