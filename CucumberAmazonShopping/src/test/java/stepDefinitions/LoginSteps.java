package stepDefinitions;

import io.cucumber.java.en.*;
import org.testng.Assert;
import pages.LoginPage;

public class LoginSteps {
  LoginPage loginPage = CommonSteps.loginPage;

  @When("user enters valid credentials")
  public void user_enters_valid_credentials() {
    loginPage.enterEmail("abc@gmail.com");
    loginPage.clickContinue();
    loginPage.passwordField("Admin@");
    loginPage.clickToSign();
  }

  @Then("user should be logged in successfully")
  public void user_should_be_logged_in_successfully() {

     String message = loginPage.setValidMessage();
    Assert.assertTrue(message.contains("Himanshu"), "User is not logged in");
  }
}
