package PageObjects;

import base.ApplicationPageBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCard  extends ApplicationPageBase {


    @FindBy(xpath = "//a[text()='here']")
    private WebElement continueShopping;

    @FindBy(partialLinkText = "\"Should I Be Kind Today?\" Print")
    private WebElement itemLink;
    @FindBy(css = "button#AddToCart")
    private WebElement addToCard;

    @FindBy(xpath = "//a[@class='button outline continue-shopping']")
    private WebElement connitueShoppinBtn;

    @FindBy(xpath = "//div[@class='product-title']//h1")
    private WebElement titleOfItemShouldIBeNice;

    public void goToShoppinCard(){
        click(continueShopping,"continueShopping");
        click(itemLink,"Should I Be Kind Today? Print");
        click(addToCard,"addtoCard");
        click(connitueShoppinBtn,"ContinuetoShopping");
    }

    public String getTitleShouldBenice(){
        String actualText = getText(titleOfItemShouldIBeNice,"ShouldBeNice");
        return actualText;
    }

}
