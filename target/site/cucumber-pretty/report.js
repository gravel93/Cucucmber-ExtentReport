$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/features/shoppingCarrd.feature");
formatter.feature({
  "line": 2,
  "name": "ShoppingCard Feature",
  "description": "",
  "id": "shoppingcard-feature",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@FunctionalTest"
    }
  ]
});
formatter.before({
  "duration": 9020636279,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "verify shopping card functionality",
  "description": "",
  "id": "shoppingcard-feature;verify-shopping-card-functionality",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User should be in ShoppingCard",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Click on continue btn and choose item ShouldBeKindToday and add to card",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User Should successfully add item to the bracket",
  "keyword": "Then "
});
formatter.match({
  "location": "ShoppingCardSteps.user_should_be_in_ShoppingCard()"
});
formatter.result({
  "duration": 843912956,
  "status": "passed"
});
formatter.match({
  "location": "ShoppingCardSteps.click_on_continue_btn_and_choose_item_ShouldBeKindToday_and_add_to_card()"
});
formatter.result({
  "duration": 3623329831,
  "error_message": "java.lang.NullPointerException\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(Unknown Source)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source)\r\n\tat java.lang.reflect.Method.invoke(Unknown Source)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:51)\r\n\tat com.sun.proxy.$Proxy16.click(Unknown Source)\r\n\tat base.ApplicationPageBase.click(ApplicationPageBase.java:45)\r\n\tat PageObjects.ShoppingCard.goToShoppinCard(ShoppingCard.java:25)\r\n\tat StepDefinitians.ShoppingCardSteps.click_on_continue_btn_and_choose_item_ShouldBeKindToday_and_add_to_card(ShoppingCardSteps.java:24)\r\n\tat ✽.When Click on continue btn and choose item ShouldBeKindToday and add to card(src/features/shoppingCarrd.feature:6)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "ShoppingCardSteps.user_Should_successfully_add_item_to_the_bracket()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 1215402979,
  "status": "passed"
});
});