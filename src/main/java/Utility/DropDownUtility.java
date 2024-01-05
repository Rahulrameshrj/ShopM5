package Utility;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDownUtility{

	public void selectDropdownByVisibleText(String textofOption,WebElement selectTagofDropDown) {
	Select select=new Select(selectTagofDropDown);
	select.selectByVisibleText(textofOption);
	}
	public void selectDropdownByValueattributeValue(String ValueattributeValue,WebElement selectTagofDropDown) {
		Select select=new Select(selectTagofDropDown);
		select.selectByValue(ValueattributeValue);
}
	public void selectDropdownByIndex(int index,WebElement selectTagofDropDown) {
		Select select=new Select(selectTagofDropDown);
		select.selectByIndex(index);
}
	public void deselectDropdownByVisibleText(String textofOption,WebElement selectTagofDropDown) {
		Select select=new Select(selectTagofDropDown);
		select.deselectByVisibleText(textofOption);
}
	public void deselectDropdownByValueattributeValue(String ValueattributeValue,WebElement selectTagofDropDown) {
		Select select=new Select(selectTagofDropDown);
		select.deselectByValue(ValueattributeValue);
}
	public void deselectDropdownByIndex(int index,WebElement selectTagofDropDown) {
		Select select=new Select(selectTagofDropDown);
		select.deselectByIndex(index);
}
	public ArrayList<String> ToGetallOptionText(WebElement selectTagofDropDown){
		Select select =new Select(selectTagofDropDown);
		List<WebElement> allOptions=select.getOptions();
ArrayList<String> allOptionsTexts=new ArrayList<String>();
for(WebElement ele:allOptions) {
	allOptionsTexts.add(ele.getText());
	
}
return allOptionsTexts;
	}
	public WebElement ToGetPerticularOptiononIndex(WebElement selectTagOfDropDown,int indexOfOption) {
	Select select = new Select(selectTagOfDropDown);
	List<WebElement> allOptions=select.getOptions();
	WebElement perticularOptiononWebElement =allOptions.get(indexOfOption);
	return 	perticularOptiononWebElement;
}	
	
}

