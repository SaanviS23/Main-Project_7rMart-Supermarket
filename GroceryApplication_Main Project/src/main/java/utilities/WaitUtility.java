package utilities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtility

//Explicit wait - Specific for a element in the framework, working based on condition (Intelligent wait/Dynamic wait)
//Fluent Wait (Intelligent wait/Dynamic wait) - Interval can be customized. and wait for the set timing(poll timing) to check the condition
//Implicit wait -Applicable for all elements inside framework,  working without condition
{

	public static final int IMPLICITWAIT = 5;

	public static final int EXPLICITWAIT = 10;

	public void waitForElementToBeClickable(WebDriver driver, WebElement element)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICITWAIT));
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	public void waitForElementToBeSelected(WebDriver driver, WebElement element) 
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICITWAIT));
		wait.until(ExpectedConditions.elementToBeSelected(element));
	}

	public void waitForElementToBeSelectedcond1(WebDriver driver, WebElement element) 
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICITWAIT));
		wait.until(ExpectedConditions.visibilityOfElementLocated((By) element));
	}

}
