package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.ApplicationPageBase;

public class Login extends ApplicationPageBase {

	@FindBy(css = "input#CustomerEmail")
	private WebElement emailBox;

	@FindBy(css = "input#CustomerPassword")
	private WebElement passwordBox;

	@FindBy(xpath = "//input[@value='Sign In']")
	private WebElement logInBtn;

	public void login() {

		sendKeys(emailBox,"emailbox","222@mail.ru");
		sendKeys(emailBox,"passwordbox","41241fafa");
		click(logInBtn, "loginbtn");

	}

}
