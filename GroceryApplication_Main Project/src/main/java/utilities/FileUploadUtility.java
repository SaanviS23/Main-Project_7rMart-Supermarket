package utilities;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebElement;

public class FileUploadUtility

{
	public void fileUploadusingSendKeys(WebElement element, String IMAGE)

	{
		element.sendKeys(IMAGE);
	}

	public void fileUplaodUsingRobotClass(WebElement element, String IMAGE) throws AWTException

	{
		StringSelection s = new StringSelection(IMAGE); 
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null); 

		Robot robot = new Robot(); 
		robot.delay(2000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

	}

}
