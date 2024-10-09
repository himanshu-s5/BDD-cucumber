package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.cucumber.java.en.*;
import pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class CommonSteps {
  public static WebDriver driver;
  public static LoginPage loginPage;

  @Before
  public void setUp() {
    if (driver == null) {
      WebDriverManager.chromedriver().setup();
      driver = new ChromeDriver();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
      driver.manage().deleteAllCookies();
      driver.manage().window().maximize();
      loginPage = new LoginPage(driver);
    }
  }

  @Given("user is on the amazon login page")
  public void user_is_on_the_amazon_login_page() {
    driver.get("https://www.amazon.in");
    loginPage.clickSignInLink();
  }

  @After
  public void tearDown() {
    if (driver != null) {
      driver.quit();
      driver = null;
    }
  }
}
