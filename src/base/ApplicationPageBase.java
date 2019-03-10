package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.aventstack.extentreports.model.Log;
import com.cucumber.listener.Reporter;
import com.gargoylesoftware.htmlunit.javascript.host.Console;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.logging.Logger;

public class ApplicationPageBase {

	public static WebDriver driver = null;

	// return status of link if it is enabled
	public static boolean isEnableStatus(WebDriver driver, WebElement web) {
		boolean en = web.isEnabled();
		return en;
	}

	public static void sendKeys(WebElement webElement, String webElementName, String keys) {
		webElement.clear();
		Reporter.addStepLog("Sending to " + webElementName);
		webElement.sendKeys(keys);
		Reporter.addStepLog("Key sent to" + webElementName);
	}

	public static String getText(WebElement webElement, String webElementName) {
		
		Reporter.addStepLog("Sending to " + webElementName);
		String actualText = webElement.getText();
		Reporter.addStepLog("Key sent to" + webElementName);

		return actualText;

	}

	public static void click(WebElement webElement, String webElementName) {
		Reporter.addStepLog("Click " + webElementName);
		webElement.click();
		Reporter.addStepLog("Clicked " + webElementName);
	}

	public static Properties loadProperties() throws IOException {
		Properties prop = new Properties();
		File filepath = new File(System.getProperty("user.dir") + "/src/test/resources/secret.properties");
		InputStream ism = new FileInputStream(filepath.getAbsoluteFile());
		prop.load(ism);
		ism.close();
		return prop;
	}

	public static boolean isDisplayed(WebElement web, String webName) {
		boolean isDis = web.isDisplayed();
		return isDis;
	}

	public static void assertExpection(String function, String WebElementName, String expected) {
		String ExpectedText = expected;
//        TestLogger.log("Getting text from " + WebElementName);
		Assert.assertEquals(expected, function);
//        TestLogger.log("Text Matched");
	}

}
