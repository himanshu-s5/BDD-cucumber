package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class LoginPage {

  protected WebDriver driver;
  protected WebDriverWait wait;

  public LoginPage(WebDriver driver){
    this.driver = driver;
    this.wait = new WebDriverWait(driver,Duration.ofSeconds(10));
    PageFactory.initElements(driver,this);
  }

  @FindBy (xpath="//span[normalize-space()='Account & Lists']")
  WebElement signInLink;
  @FindBy(id="ap_email")
  WebElement emailField;
  @FindBy(id="continue")
  WebElement continueButton;
  @FindBy(id="ap_password")
  WebElement passwordField;
  @FindBy(id = "signInSubmit")
  WebElement signInButton;
  @FindBy(id="nav-link-accountList-nav-line-1")
  WebElement validMessage;
@FindBy(xpath = "//h4[normalize-space()='There was a problem']")
WebElement errorMessage;


  public void clickSignInLink(){

    wait.until(ExpectedConditions.visibilityOf(signInLink));
    signInLink.click();
  }
  public void enterEmail(String email) {

    wait.until(ExpectedConditions.visibilityOf(emailField));
    emailField.sendKeys(email);
  }
  public void clickContinue(){

    wait.until(ExpectedConditions.elementToBeClickable(continueButton));
    continueButton.click();
  }
  public void passwordField(String password){

    wait.until(ExpectedConditions.visibilityOf(passwordField));
    passwordField.sendKeys(password);
  }
  public void clickToSign(){

    wait.until(ExpectedConditions.elementToBeClickable(signInButton));
    signInButton.click();
  }
  public String setValidMessage(){
    wait.until(ExpectedConditions.visibilityOf(validMessage));
    return validMessage.getText();
  }
  public String setErrorMessage(){

    wait.until(ExpectedConditions.visibilityOf(errorMessage));
    return errorMessage.getText();
  }

}
