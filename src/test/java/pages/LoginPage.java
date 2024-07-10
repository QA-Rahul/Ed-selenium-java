package pages;

import actions.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tests.TestDriverActions;
import utils.TestListener;
import utils.WaitMethods;

import java.util.List;

public class LoginPage extends TestDriverActions {

    @FindBy(name = "username")
    public WebElement inputbox_Username;

    @FindBy(name = "password")
    public WebElement inputbox_Password;

    @FindBy(xpath = "//div[@id='signin']")
    public WebElement btn_Login;

    @FindBy(xpath = "//div[@role='menuitem']")
    public WebElement ddl_country;

    @FindBy(xpath = "//img[contains(@src,'flag-en_CA')]")
    public WebElement flag_CA;

    @FindBy(xpath = "//div[text()='Username or Password was not found!']")
    public WebElement error_Message;

    @FindBy(xpath = "//td[text()='Welcome, Shop Manager']")
    public WebElement shop_manager;

    @FindBy(xpath = "//img[contains(@src,'lg.gif')]")
    public WebElement loder_icon;

    @FindBy(xpath = "//h1[contains(.,'Signing In...Please Wait')]")
    List<WebElement> loder;

    @FindBy(xpath = "//div[@aria-label='English']")
    WebElement country_English;

    @FindBy(xpath = "//div[@class='x193']")
    List<WebElement> dropdown;

    @FindBy(xpath = "//td[text()='English']")
    WebElement CA_flag;


    public WebDriver driver;

     public LoginPage(WebDriver driver){
         this.driver=driver;
         this.waitMethods = new WaitMethods(driver);
 //       this.action = new WaitActions(driver);
         this.webElementActions = new WebElementActions(driver);

     }

    /**
     * Select Country from drop down     waitForElement
     */
    public void selectCountryFromDropDown() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(ddl_country);
        WebElementActions.getActions(driver).clickElement(ddl_country);
        waitMethods.waitForElementToBeRefreshedAndClickable(flag_CA);
        WebElementActions.getActions(driver).clickElement(flag_CA);
        waitMethods.waitForElementToBeRefreshedAndClickable(country_English);
    }
    /**
     * Enter Username
     *
     * @param userName
     */

    public void enterUserName(String userName) throws InterruptedException {
        Thread.sleep(3000);
        waitMethods.waitForElementToBeRefreshedAndIsVisible(inputbox_Username);
        Thread.sleep(3000);
        WebElementActions.getActions(driver).inputText(inputbox_Username, userName);

    }

    /**
     * Enter Password to login
     *
     * @param password
     */
    public void enterPassword(String password) throws InterruptedException {
        WebElementActions.getActions(driver).inputText(inputbox_Password, password);
    }

    /**
     * Click on Login Button
     */
    public void clickLoginButton() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(btn_Login);
        WebElementActions.getActions(driver).clickElement(btn_Login);
    }

    /**
     * Enter wrong username
     * @param un
     */
    public void enterInvalidUsername(String un) throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(inputbox_Username);
        WebElementActions.getActions(driver).inputText(inputbox_Username, un);
    }

    /**
     * Enter wrong password
     * @param pwd
     */
    public void enterInvalidPassword(String pwd) throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(inputbox_Password);
        WebElementActions.getActions(driver).inputText(inputbox_Password,pwd);
    }
    /**
     * login with invalid username and password
     */
    public void loginWithInvalidCredentials(String userName,String passWord) throws InterruptedException {
        enterInvalidUsername(userName);
        enterInvalidPassword(passWord);
        clickLoginButton();

        TestListener.saveScreenshotPNG(driver);
   }

    /**
     * Login with valid username and invalid password
     * @return
     * @throws InterruptedException
     */
  public void loginWithValidUsernameInvalidpassword(String userName,String passWord) throws InterruptedException {
      enterUserName(userName);
      enterInvalidPassword(passWord);
      clickLoginButton();

      TestListener.saveScreenshotPNG(driver);
  }

    /**
     * Login with valid username and valid password
     * @return
     * @throws InterruptedException
     */
  public void loginWithValidCredentials(String userName,String passWord) throws InterruptedException {
      enterUserName(userName);
      enterPassword(passWord);
  //    inputbox_Password.sendKeys(Keys.TAB);
      clickLoginButton();

      waitMethods.loadingWait(loder);

 //     WaitActions.getWaits().pageLoadTimeOutUsingJavaScript();

      TestListener.saveScreenshotPNG(driver);
  }

    /**
     * Verify validation message
     * @param validationMessage
     * @return
     */
  public boolean assertMessage(String validationMessage) throws InterruptedException {
      waitMethods.waitForElementToBeRefreshedAndIsVisible(error_Message);
      return error_Message.getText().equals(validationMessage);
  }

    /**
     * Check that page title returns
     * @param pageTitle
     * @return
     */
  public boolean assertCheck(String pageTitle)
  {
      String Pagetitle = driver.getTitle();
      return Pagetitle.equals(pageTitle);
  }



}
