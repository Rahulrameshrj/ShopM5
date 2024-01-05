package Utility;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersUtility extends BaseClass implements ITestListener{
	

public void onTestFailure(ITestResult result) {
String failedMethod=result.getMethod().getMethodName().toString();

TakesScreenshot ts=(TakesScreenshot)driver;
File tempFile=ts.getScreenshotAs(OutputType.FILE);
String currentTime = LocalDateTime.now().toString().replace(':','-');

File permanentFile= new File("./scr/text/resources/screenshots/"+currentTime+failedMethod+".png");

try {
	FileHandler.copy(tempFile,permanentFile);
}catch(IOException e) {
	e.printStackTrace();
}
}
@Override
public  void onTestStart(ITestResult result) {
}
@Override	
public void onTestSuccess(ITestResult result) {
}
@Override
public void onTestSkipped(ITestResult result) {
}

@Override
public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	
}
@Override
public void onStart(ITestContext context) {
	
}
@Override
public void onFinish(ITestContext context) {
}



}