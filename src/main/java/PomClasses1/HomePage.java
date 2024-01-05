package PomClasses1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public WebDriver driver;
	
	//Initialization
public HomePage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
@FindBy(xpath ="//button[@aria-label='Account settings']")

private WebElement accountSettingIcon;

public WebElement getAccountSettingIcon() { //Setter
	return accountSettingIcon;
	
}

@FindBy(xpath="//a[@href='/men' and @id='men']")
private WebElement menMenuLink;

public WebElement getmenMenuLink() {
	return menMenuLink;
	
}
@FindBy(xpath="//a[text()='T-shirts']")

private WebElement TshirtPopUpLink;

public WebElement getTshirtPopUpLink() {
	return TshirtPopUpLink;
	
}

	
}

