
package StepDefinitians;

import org.openqa.selenium.support.PageFactory;

import PageObjects.HomePage;
import PageObjects.ShoppingCard;
import base.ApplicationPageBase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ShoppingCardSteps extends ApplicationPageBase {

    HomePage homePage = PageFactory.initElements(driver,HomePage.class);
    ShoppingCard shoppingCard = PageFactory.initElements(driver,ShoppingCard.class);

    @Given("^User should be in ShoppingCard$")
    public void user_should_be_in_ShoppingCard(){
        homePage.goToshoppingCard();
    }

    @When("^Click on continue btn and choose item ShouldBeKindToday and add to card$")
    public void click_on_continue_btn_and_choose_item_ShouldBeKindToday_and_add_to_card() {
        shoppingCard.goToShoppinCard();
    }

    @Then("^User Should successfully add item to the bracket$")
    public void user_Should_successfully_add_item_to_the_bracket() {
//        assertExpection(shoppingCard.getTitleShouldBenice(),"shouldBeNice","\"Should I Be Kind Today?\" Print");
    }
}
