package pages.Ticket;

import actions.WebElementActions;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import tests.TestDriverActions;
import utils.TestListener;
import utils.WaitMethods;

import java.time.LocalDate;
import java.time.Year;

public class AccountingPeriodErrorAMERIT extends TestDriverActions {

    @FindBy(xpath = "//a[text()='Financials']")
    WebElement Financials;
    @FindBy(xpath = "//td[text()='Financial Manager']")
    WebElement Financial_Manager;
    @FindBy(xpath = "//span[text()='Financial Manager']")
    WebElement title_FinancialManager;
    @FindBy(xpath = "//td[contains(text(),'Welcome to Financial Manager.')]")
    WebElement txt_FinancialManagerDescription;
    @FindBy(xpath = "//h1[text()='Things To Do']")
    WebElement txt_ThingsToDo;
    @FindBy(xpath = "//span[text()='Accounting Periods']")
    WebElement link_accountingPeriods;
    @FindBy(xpath = "//h1[text()='Accounting Years']")
    WebElement title_AccountingYears;
    @FindBy(xpath = "//span[text()='Add Accounting Year']")
    WebElement btn_AddAccountingYear;
    @FindBy(xpath = "//th[contains(@id,'tAccyea:cACYY')]")
    WebElement col_AccountingYear;
    @FindBy(xpath = "//th[contains(@id,'tAccyea:c7')]")
    WebElement col_Periods;
    @FindBy(xpath = "//th[contains(@id,'tAccyea:c8')]")
    WebElement col_StartDate;
    @FindBy(xpath = "//th[contains(@id,'tAccyea:c4')]")
    WebElement col_EndDate;
    @FindBy(xpath = "//input[contains(@id,'tAccyea:0:id3::content')]")
    WebElement startDate_inputBox;
    @FindBy(xpath = "//a[contains(@id,'id3::glyph')]")
    WebElement start_calenderIcon;
    @FindBy(xpath = "//input[contains(@id,'tAccyea:0:id4::content')]")
    WebElement endDate_inputbox;
    @FindBy(xpath = "//a[contains(@id,'id4::glyph')]")
    WebElement end_calenderIcon;
    @FindBy(xpath = "//h1[contains(text(),'Accounting Year:')]")
    WebElement AccountingYear;
    @FindBy(xpath = "//div[contains(@id,'rACP:0:bAACP')]")
    WebElement btn_AddAccountingPeriod;
    @FindBy(xpath = "//label[text()='Accounting Year:']/preceding::div[1]")
    WebElement title_AddAccountingYear;
    @FindBy(xpath = "//label[text()='Accounting Year:']")
    WebElement txt_AccountingYear;
    @FindBy(xpath = "//label[text()='Accounting Year:']/following::input[1]")
    WebElement txtbox_AccountingYear;
    @FindBy(xpath = "//div[contains(@id,'bAAYCan')]")
    WebElement btn_cancle;
    @FindBy(xpath = "//div[contains(@id,'bAAYAdd')]")
    WebElement btn_AddCountingYear;
    @FindBy(xpath = "(//span[contains(@id,'si1')]/following::td)[4]")
    WebElement btn_signOut;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement inputbox_Username;




    public AccountingPeriodErrorAMERIT(WebDriver driver){
        this.driver = driver;
        waitMethods = new WaitMethods(driver);
    }

    public void gotoFinanceScreen() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(Financials);
        WebElementActions.getActions(driver).clickElement(Financials);

        waitMethods.waitForElementToBeRefreshedAndClickable(Financial_Manager);
        WebElementActions.getActions(driver).clickElement(Financial_Manager);

        TestListener.saveScreenshotPNG(driver);
    }
    /*
      verify title Financial Manager
    */
    public void verifyTitleFinancialManager() throws InterruptedException {

        waitMethods.waitForElementToBeRefreshedAndIsVisible(title_FinancialManager);
        Assert.assertTrue(title_FinancialManager.isDisplayed());
    }
    /*
       verify Financial manager description
     */
    public void verifyFinancialManagerDescription() throws InterruptedException {

        waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_FinancialManagerDescription);
        Assert.assertTrue(txt_FinancialManagerDescription.isDisplayed());

    }
    /*
      verify Things To Do
    */
    public void verifyThingsToDo() throws InterruptedException {

        waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_ThingsToDo);
        Assert.assertTrue(txt_ThingsToDo.isDisplayed());
        Assert.assertTrue(link_accountingPeriods.isDisplayed());
    }
    /*
       click on accounting period link
     */
     public void clickOnAccountingPeriod() throws InterruptedException{
         waitMethods.waitForElementToBeRefreshedAndClickable(link_accountingPeriods);
         WebElementActions.getActions(driver).clickElement(link_accountingPeriods);

         TestListener.saveScreenshotPNG(driver);
     }
     /*
         verify title Accounting Years
      */
      public void verifyTitle_AccountingYears() throws InterruptedException{

          waitMethods.waitForElementToBeRefreshedAndIsVisible(title_AccountingYears);
          Assert.assertTrue(title_AccountingYears.isDisplayed());
      }
    /*
          verify Add Accounting Year
     */
    public void verifyAddAccountingYear() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(btn_AddAccountingYear);
        Assert.assertTrue(btn_AddAccountingYear.isDisplayed());
    }
    /*
          verify Accounting Year
     */
    public void verifyAccountingYear() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(AccountingYear);
        Assert.assertTrue(AccountingYear.isDisplayed());
    }
    /*
         verify button Add Accounting Period
     */
    public void verifybtn_AddAccountingPeriod() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(btn_AddAccountingPeriod);
        Assert.assertTrue(btn_AddAccountingPeriod.isDisplayed());
    }
    /*
         verify Accounting year coulmn
     */
    public void verifyAccountingYearCoulmn() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(col_AccountingYear);
        Assert.assertTrue(col_AccountingYear.isDisplayed());
        Assert.assertTrue(col_Periods.isDisplayed());
        Assert.assertTrue(col_StartDate.isDisplayed());
        Assert.assertTrue(col_EndDate.isDisplayed());

    }
    /*
         verify start date , end date fields
     */
    public void verifyStartDateEndDate() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(startDate_inputBox);
        Assert.assertTrue(startDate_inputBox.isDisplayed());
        Assert.assertTrue(start_calenderIcon.isDisplayed());
        Assert.assertTrue(endDate_inputbox.isDisplayed());
        Assert.assertTrue(end_calenderIcon.isDisplayed());

    }
    /*
       click on Add Accounting Year btn
     */
    public void clickAddAccountingYear() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndClickable(btn_AddAccountingYear);
        WebElementActions.getActions(driver).clickElement(btn_AddAccountingYear);
    }
    /*
          verify title Add Accounting Year
     */
      public void verifytitle_AddAccountingYear() throws InterruptedException{
          waitMethods.waitForElementToBeRefreshedAndIsVisible(title_AddAccountingYear);
          Assert.assertTrue(title_AddAccountingYear.isDisplayed());
    }
    /*
         verify text Accounting Year
     */
      public void verifytxt_AccountingYear() throws InterruptedException{
          waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_AccountingYear);
          Assert.assertTrue(txt_AccountingYear.isDisplayed());
          Assert.assertTrue(txtbox_AccountingYear.isDisplayed());
    }
    /*
          verify cancle and AddCountingYear
     */
      public void verifybtn_AddCountingYear() throws InterruptedException{
          waitMethods.waitForElementToBeRefreshedAndIsVisible(btn_cancle);
          Assert.assertTrue(btn_cancle.isDisplayed());
          Assert.assertTrue(btn_AddCountingYear.isDisplayed());
    }
    /*
          enter year on Accounting Year
     */
       public void enterYear() throws InterruptedException{
           LocalDate currentDate = LocalDate.now();
           LocalDate increamentYear= currentDate.plusYears(1);
           int Year = increamentYear.getYear();
           System.out.println(Year);
          waitMethods.waitForElementToBeRefreshedAndClickable(txtbox_AccountingYear);
          WebElementActions.getActions(driver).inputText(txtbox_AccountingYear,String.valueOf(Year));
    }
    /*
       click on button Add Counting Year
     */
      public void clickAddCountingYear() throws InterruptedException{
          waitMethods.waitForElementToBeRefreshedAndClickable(btn_AddCountingYear);
          WebElementActions.getActions(driver).clickElement(btn_AddCountingYear);
    }
    /*
         Enter date in start date field
     */
      public void enterDateStartDate() throws InterruptedException{
          waitMethods.waitForElementToBeRefreshedAndClickable(startDate_inputBox);
          WebElementActions.getActions(driver).inputText(startDate_inputBox,appProp64.getProperty("startDate"));
    }
    /*
         enter date in end date field
     */
      public void enterDateEndDate() throws InterruptedException{
          waitMethods.waitForElementToBeRefreshedAndClickable(endDate_inputbox);
          WebElementActions.getActions(driver).inputText(endDate_inputbox,appProp64.getProperty("endDate"));
          Thread.sleep(2000);
          endDate_inputbox.sendKeys(Keys.TAB);
    }
    /**
     * click on sign out button
     * verify username
     */
    public void clickOnSignOut() throws InterruptedException {

        waitMethods.waitForElementToBeRefreshedAndClickable(btn_signOut);
        WebElementActions.getActions(driver).clickElement(btn_signOut);


        waitMethods.waitForElementToBeRefreshedAndIsVisible(inputbox_Username);
        Assert.assertTrue(inputbox_Username.isDisplayed());

        TestListener.saveScreenshotPNG(driver);
    }













}
