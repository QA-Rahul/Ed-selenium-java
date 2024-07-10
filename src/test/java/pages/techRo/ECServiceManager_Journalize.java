 package pages.techRo;

import actions.LoginActions;
import actions.ReusableActions;
import actions.WaitActions;
import actions.WebElementActions;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import tests.TestDriverActions;
import utils.TestListener;
import utils.WaitMethods;

import java.io.FileNotFoundException;
import java.util.List;

public class ECServiceManager_Journalize extends TestDriverActions {
    @FindBy(xpath = "(//a[text()='Financials']//..//following::td/child::div[@class='x193'])[1]")
    public WebElement label_Financial;

    @FindBy(xpath = "//td[text()='Financial Manager']")
    public WebElement label_FinancialManger;

    @FindBy(xpath = "//span[text()='Generate Journals']")
    public WebElement btn_GenerateJournals;

    @FindBy(xpath = "//input[contains(@id,'sbc1::content')]")
    public WebElement txt_AssertDisposal;

    @FindBy(xpath = "//div[contains(@id,'cb3')]//span[text()='Generate Journals']")
    public WebElement label_GenerateButton;

    @FindBy(xpath = "(//div[contains(@id,'::db')]/child::table)[1]")
    public WebElement label_NoDataPresent;

   @FindBy(xpath = "(//a[contains(text(),'Service Board')]/parent::div)[1]")
    public WebElement label_ServiceBoard;

    @FindBy(xpath = "(//a[text()='Complete RO'])[1]")
    public WebElement label_CompleteRO;

    @FindBy(xpath = "(//a[contains(text(),'Financial Manager')])[1]")
    public WebElement txt_FinancialManager;

    @FindBy(xpath = "//a[text()='Journal Sources']/parent::div[contains(@id,'::_afrTabCnt')]")
    public WebElement label_JournalSources;

//    @FindBy(xpath = "//span[text()='Sign Out']")
@FindBy(xpath = "(//span[contains(@id,'si1')]/following::td)[4]")
    public WebElement label_SignOut;

    @FindBy(xpath = "//h1[text()='Working...Please Wait']")
    List<WebElement> loder;

    @FindBy(xpath = "//td[contains(@id,'c16')]")
    WebElement todays_date;

    @FindBy(xpath = "//a[text()='Financials']")
    WebElement Financials;

    @FindBy(xpath = "//td[text()='Financial Manager']")
    WebElement Financial_Manager;

    @FindBy(xpath = "//a[text()='Service']")
    WebElement menu_Service;

    @FindBy(xpath = "//td[text()='Service Board']")
    WebElement ServiceBoard;

    @FindBy(xpath = "(//td[text()='Service Board'])[2]")
    WebElement ServiceBoard_EC;


    public ECServiceManager_Journalize(WebDriver driver){
        this.driver = driver;
        this.waitMethods = new WaitMethods(driver);
        this.webElementActions = new WebElementActions(driver);

    }


    /**goto Financials */
     public void gotoFinancials () throws InterruptedException, FileNotFoundException {

//        ReusableActions.getActions().clickParentMenu("Financials");
//        ReusableActions.getActions().clickChildMenu("Financial Manager");

         waitMethods.waitForElementToBeRefreshedAndClickable(Financials);
         WebElementActions.getActions(driver).clickElement(Financials);

         waitMethods.waitForElementToBeRefreshedAndClickable(Financial_Manager);
         WebElementActions.getActions(driver).clickElement(Financial_Manager);

        TestListener.saveScreenshotPNG(driver);

    }


    /** click On Generate Journals Button*/
     public void clickOnGenerateJournals () throws InterruptedException {

         waitMethods.waitForElementToBeRefreshedAndClickable(btn_GenerateJournals);
        WebElementActions.getActions(driver).clickElement(btn_GenerateJournals);
         waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);

    }
    /** select  Journals*/
     public void selectJournals() throws InterruptedException {

         waitMethods.waitForElementToBeRefreshedAndClickable(txt_AssertDisposal);
        WebElementActions.getActions(driver).clickElement(txt_AssertDisposal);
        TestListener.saveScreenshotPNG(driver);
    }
    /** click On Table Generate Journals Button */
     public void clickOnTableGenerateJournalsButton () throws InterruptedException {

         waitMethods.waitForElementToBeRefreshedAndClickable(label_GenerateButton);
        WebElementActions.getActions(driver).clickElement(label_GenerateButton);
         waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /** verify Element not Present */
     public void verifyElementNotPresent () throws InterruptedException {
         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_NoDataPresent);
        Assert.assertFalse(label_NoDataPresent.isDisplayed());

         waitMethods.loadingWait(loder);

    }
    /**click On Service Board */
     public void clickOnServiceBoard () throws InterruptedException, FileNotFoundException {

//        ReusableActions.getActions().clickParentMenu("Service");
//        ReusableActions.getActions().clickChildMenu("Service Board");

         waitMethods.waitForElementToBeRefreshedAndClickable(menu_Service);
         WebElementActions.getActions(driver).clickElement(menu_Service);

         if(LoginActions.environmentName.contains("NA") || (LoginActions.environmentName.contains("EU"))){
             waitMethods.waitForElementToBeRefreshedAndClickable(ServiceBoard);
             WebElementActions.getActions(driver).clickElement(ServiceBoard);
         }
         else if(LoginActions.environmentName.contains("EC")){
             waitMethods.waitForElementToBeRefreshedAndClickable(ServiceBoard_EC);
             WebElementActions.getActions(driver).clickElement(ServiceBoard_EC);
         }


        TestListener.saveScreenshotPNG(driver);

    }
    /**click On Financial Manager */
     public void clickOnFinancialManagerText () throws InterruptedException {

         waitMethods.waitForElementToBeRefreshedAndClickable(txt_FinancialManager);
        WebElementActions.getActions(driver).clickElement(txt_FinancialManager);
        TestListener.saveScreenshotPNG(driver);

    }
    /**
     * verify today's date
     */
     public void verifyTodaysDate() throws InterruptedException {
         waitMethods.waitForElementToBeRefreshedAndIsVisible(todays_date);
        org.testng.Assert.assertTrue(todays_date.isDisplayed());
    }
    /** click On  Journal Sources */
    public void clickOnJournalSources () throws InterruptedException {

        waitMethods.waitForElementToBeRefreshedAndClickable(label_JournalSources);
        WebElementActions.getActions(driver).clickElement(label_JournalSources);
        waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /** click On Sign Out */

     public void clickOnSignOut () throws InterruptedException {

         waitMethods.waitForElementToBeRefreshedAndClickable(label_SignOut);
        WebElementActions.getActions(driver).clickElement(label_SignOut);
        TestListener.saveScreenshotPNG(driver);
    }



}


