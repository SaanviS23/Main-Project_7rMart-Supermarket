package utilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotUtility 
{
	public void getScreenShot(WebDriver driver, String failedTestCase) throws IOException 
	
	{
		//converting webdriver to screenshot mode(Typecasting) -imp code
		TakesScreenshot scrShot = (TakesScreenshot) driver; // TakesScreenshot Interface' capture the current situation of the //method Interface provided bytestNG-Selenium screenshot can't take screenshot so typecasting to take screenshots.
													
		File screenShot = scrShot.getScreenshotAs(OutputType.FILE);  //Capture the screenshot of failed test cases using getScreenshotAs method, store it as a  temporary file
		
		String timeStamp = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss").format(new Date()); //create date and time
		
		File f1 = new File(System.getProperty("user.dir") + "//outputScreenShot");   
		if (!f1.exists()) {
			f1.mkdirs(); // create a folder if it's doesn't exist.
		}
		String destination = System.getProperty("user.dir") + "//outputScreenShot//" + failedTestCase + timeStamp + ".png";//Decide final screenshot path
		
		File finalDestination = new File(destination); //
		
		FileHandler.copy(screenShot, finalDestination); //FileHandler class & copy() -Copy screenshots to final location, screenshots permanently saved to mentioned location.
	}
}
