package Utility;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtility {
	/*
	 * Author: Rahul /When we get Element click intercepted exception When
	 * element id hidden by other element then we will use java script click it 
	 * will take webDriver object and element ref on which you want to perform
	 *  javaScript click
	 */
public void javaScriptClick(WebDriver driver,WebElement ele) {
	JavascriptExecutor jse=(JavascriptExecutor)driver;
	jse.executeScript("arguments[0].click();",ele);
	
}

/**
 * Author:Rahul to avoid ElementClickInterceptedException
 * 
 * @param driver
 * @param ele
 * @param data
 */
	public void javaScriptSendKeys(WebDriver driver,WebElement ele,String data){
	JavascriptExecutor jse= (JavascriptExecutor)driver;
	jse.executeScript("arguments[0].Value=arguments[1];",ele,data);
	}
	/**
	 * Author:rahul this method will scroll the webpage till given element
	 * 
	 * @param driver
	 * @param ele
	 * 
	 */
	
	public void javaScriptScrollTillWebElement(WebDriver driver,WebElement ele) {
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView(true);", ele);
		
	}
	
	/**
	 * Author:Rahul this method will scroll the webpage with given coordinates
	 * 
	 * @param driver
	 * @param xCoordinate
	 * @param yCoordinate
	 */
	
	public void javaScriptScrollByCoordinates(WebDriver driver, int xCoordinate,int yCoorinate) {
	JavascriptExecutor jse =(JavascriptExecutor)driver;
	jse.executeScript("scrollBy("+ xCoordinate +","+ yCoorinate +")");
	}
	/**
	 * Author: rahul this method will highlight the webelement borer with 2px
	 * solid red color
	 * 
	 * @param driver
	 * @param ele
	 */
	public void javaScriptHighLightWebelement(WebDriver driver, WebElement ele) {
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		jse.executeScript("arguments[0].style.border='2px solid red';", ele);
	}
	/**Author: rahul to perform mouse overactions on webelement
	 * 
	 * @param driver
	 * @param ele
	 */
	
	public void mouseOverAction(WebDriver driver, WebElement ele) {
		Actions action =new Actions(driver);
		action.moveToElement(ele).perform();
	}
	/**
	 * to perform right operation on webelement
	 * 
	 * @param driver
	 * @param ele
	 */
	
	public void rightClick(WebDriver driver, WebElement ele) {
		Actions action = new Actions(driver);
		action.contextClick(ele).perform();
	}
	/**
	 * to perform double operation on webelement
	 * 
	 * @param driver
	 * @param ele 
	 * 
	 */
	
	public void doubleClick(WebDriver driver,WebElement ele) {
	Actions action = new Actions(driver);
	action.doubleClick(ele).perform();
}
	/**
	 * To perform dragAndDrop operation between two elements
	 * 
	 * @param driver
	 * @param draggingElement
	 * @param droppingElement
	 */
	
	public void dragAndDrop(WebDriver driver, WebElement draggingElement,WebElement droppingElement) {
		Actions action =new Actions(driver);
		action.dragAndDrop(draggingElement, droppingElement).perform();
	}
	/**
	 * To perform clickAndHold operation between two elements
	 * 
	 * @param driver
	 * @param ele
	 */
	public void clickAndHold(WebDriver driver,WebElement ele) {
		Actions action =new Actions(driver);
		action.clickAndHold(ele).perform();
	}
	
	/**
	 * To perform scrolling of webpage till the webelement
	 * 
	 * @param driver
	 * @param ele
	 */
	
	public void scrollToWebElementByActionsClass(WebDriver driver,WebElement ele) {
		Actions action = new Actions(driver);
		action.scrollToElement(ele).perform();
	}
	/**
	 * this method will wait untill given element reaches to click able state
	 * 
	 * @param driver
	 * @param ele
	 */

public void explicitlyWaitForElementToBeClickable(WebDriver driver,By locator,int timeDelay) {
WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(timeDelay));
wait.until(ExpectedConditions.elementToBeClickable(locator));
}
/**
 * this method will wait until given element is visible
 * 
 * @param driver
 * @param ele
 * @param timeDelay
 */
public void explicityWaitForElementToBeVisible(WebDriver driver,WebElement ele, int timeDelay) {
	WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(timeDelay));
wait.until(ExpectedConditions.visibilityOf(ele));
}
/**
 * this method will wait untill alert is present
 * 
 * @param driver
 * @param timeDelay
 */
public void explicityWaitForAlert(WebDriver driver, int timeDelay) {
	WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(timeDelay));
wait.until(ExpectedConditions.alertIsPresent());
}
/**
 * this method will wait until particular page or particular(given)url is
 * appers
 * 
 * @param driver
 * @param timeDelay
 * @param Completeurl
 */
public void explicityWaitForurl(WebDriver driver, int timeDelay,String Completeurl) {
	WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(timeDelay));
wait.until(ExpectedConditions.urlToBe(Completeurl));
}
/**
 * this method will wait until particular page is displayed/appears
 * 
 * @param driver
 * @param timeDelay
 * @param CompleteTitle
 */
public void explicityWaitForTitle(WebDriver driver, int timeDelay,String CompleteTitle) {
	WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(timeDelay));
wait.until(ExpectedConditions.urlToBe(CompleteTitle));
}
}





