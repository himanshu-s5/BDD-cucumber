package stepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.LoginPage;

import java.time.Duration;

public class InvalidLoginSteps {

  LoginPage loginPage = CommonSteps.loginPage;

  @When("user enters invalid credentials")
  public void user_enters_invalid_credentials() {
    loginPage.enterEmail("anshu@gmail.com");
    loginPage.clickContinue();
    loginPage.passwordField("Amazon");
    loginPage.clickToSign();
  }

  @Then("user should see an error message for invalid login")
  public void user_should_see_an_error_message_for_invalid_login() {
    WebDriverWait wait = new WebDriverWait(CommonSteps.driver,Duration.ofSeconds(5));
    wait.until(ExpectedConditions.urlContains("ap"));
    String url = CommonSteps.driver.getCurrentUrl();
    Assert.assertTrue(url.contains("ap"), "user is not on Login page");
  }
}
