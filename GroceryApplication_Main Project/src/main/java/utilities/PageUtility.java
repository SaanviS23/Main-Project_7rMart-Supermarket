package utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class PageUtility // Repetitive steps for page class created under Page utility , it should be
							// rich

{

// Dropdown Methods

	public void selectByVisibleTextMethod(WebElement elementName, String visibletext)

	{
		Select select = new Select(elementName);
		select.selectByVisibleText(visibletext);

	}

	public void selectBybyValueMethod(WebElement elementName,String value)

	{
		Select select = new Select(elementName);
		select.selectByValue(value);

	}

	public void selectBybyIndexMethod(WebElement elementName, int index)

	{
		Select select = new Select(elementName);
		select.selectByIndex(index);
	

	}

//Action Class Methods

	public void dragAndDropMethod(WebDriver driver, WebElement dragItem, WebElement dropItem)

	{
		Actions obj = new Actions(driver);
		obj.dragAndDrop(dragItem, dropItem).build().perform();
	}

	public void rightClick(WebDriver driver, WebElement elementName)

	{
		Actions rightObj = new Actions(driver);
		rightObj.contextClick(elementName).perform();
	}

	public void mouseOver(WebDriver driver, WebElement elementName)

	{
		Actions mouseclk = new Actions(driver);
		mouseclk.moveToElement(elementName).perform();
	}

	public void click(WebDriver driver, WebElement elementName)

	{

		Actions click = new Actions(driver);
		click.click(elementName).perform();

	}

	public void doubleClick(WebDriver driver, WebElement elementName) {

		Actions click = new Actions(driver);
		click.doubleClick(elementName).perform();

	}

//javascript Methods

	public void scrollToptoBottom(WebDriver driver)

	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,150)", "");

	}

	public void scrollBottomToTop(WebDriver driver)

	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,-150)", "");

	}

	public void javascriptSendKeys(WebDriver driver, WebElement elementName, String value)

	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='value';", elementName);

	}

	public void javascriptClick(WebDriver driver, WebElement elementName)

	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", elementName);

	}

}
