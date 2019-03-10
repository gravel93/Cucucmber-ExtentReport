package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

	@FindBy(xpath = "//a[@id='customer_register_link'][1]")
	private WebElement clickCreateAccount;

	@FindBy(xpath = "//img[@alt='Common Deer']")
	private WebElement logoVerification;

//    LoginPage Elements

	@FindBy(xpath = "//a[@id='customer_login_link'][1]")
	private WebElement loginLink;

	@FindBy(css = "a#CartButton")
	private WebElement cardBtn;

	public void loginLink() {
		loginLink.click();
	}

	public void createAccountPage() {
		
		clickCreateAccount.click();
	}

	public void goToshoppingCard() {
		cardBtn.click();
	}

	public boolean logoVerification() {
		boolean logoDis = logoVerification.isDisplayed();
		return logoDis;
	}
}
