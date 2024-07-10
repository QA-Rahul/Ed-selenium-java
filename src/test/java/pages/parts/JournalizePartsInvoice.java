  package pages.parts;

import actions.ReusableActions;
import actions.WaitActions;
import actions.WebElementActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import tests.TestDriverActions;
import utils.TestListener;
import utils.WaitMethods;

import java.io.FileNotFoundException;
import java.util.List;

public class JournalizePartsInvoice extends TestDriverActions {

    @FindBy(xpath = "//span[text()='Generate Journals']")
    WebElement btn_GenerateJournals;

    @FindBy(xpath = "//label[text()='All Periods']/preceding::input[1]")
    WebElement checkbox_allPeriods;

    @FindBy(xpath = "//label[text()='Period:']/following::select[1]")
    WebElement period_dropdwn;

    @FindBy(xpath = "//span[text()='Refresh']")
    WebElement btn_refresh;

    @FindBy(xpath = "//span[text()='Selected']/following::input[1]")
    WebElement checkbox;

    @FindBy(xpath = "(//span[text()='Generate Journals'])[2]")
    WebElement GenerateJournals;

    @FindBy(xpath = "//td[text()='Service Board']")
    WebElement service_board;

    @FindBy(xpath = "(//a[contains(text(),'Financial Manager')])[1]")
    WebElement financialManager;

    @FindBy(xpath = "(//a[text()='Export Journals'])[1]")
    WebElement ExportJournals;

    @FindBy(xpath = "//td[contains(@id,'c16')]")
    WebElement date_cell;

//    @FindBy(xpath = "//a[text()='Sign Out']")
    @FindBy(xpath = "(//span[contains(@id,'si1')]/following::td)[4]")
    WebElement btn_signOut;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement inputbox_Username;

    @FindBy(xpath = "//h1[text()='Working...Please Wait']")
    List<WebElement> loder;

    @FindBy(xpath = "//a[text()='Financials']")
    WebElement Financials;

    @FindBy(xpath = "//td[text()='Financial Manager']")
    WebElement Financial_Manager;

    @FindBy(xpath = "//a[text()='Service']")
    WebElement menu_Service;

     public JournalizePartsInvoice(WebDriver driver){
         this.driver = driver;
         this.waitMethods = new WaitMethods(driver);
     }


    /**
     * go to Finance Manager
     * @throws FileNotFoundException
     * @throws InterruptedException
     */
     public void gotoFinanceManager() throws FileNotFoundException, InterruptedException {
//        ReusableActions.getActions(driver).clickParentMenu("Financials");
//        ReusableActions.getActions(driver).clickChildMenu("Financial Manager");

         waitMethods.waitForElementToBeRefreshedAndClickable(Financials);
         WebElementActions.getActions(driver).clickElement(Financials);

         waitMethods.waitForElementToBeRefreshedAndClickable(Financial_Manager);
         WebElementActions.getActions(driver).clickElement(Financial_Manager);

         TestListener.saveScreenshotPNG(driver);


    }

    // Added Extra Steps which is not present in script

    /**
     * Extra Steps
     * click on drop dwon
     */
     public void clickOnDropDown() throws InterruptedException {

         waitMethods.waitForElementToBeRefreshedAndIsVisible(period_dropdwn);
        WebElementActions.getActions(driver).elementSelectByVisibilityText(period_dropdwn,"1");
        TestListener.saveScreenshotPNG(driver);

    }
    /**
     * Extra Steps
     * click on refresh button
     */
     public void clickOnRefreshButton() throws InterruptedException {

         waitMethods.waitForElementToBeRefreshedAndClickable(period_dropdwn);
        WebElementActions.getActions(driver).clickElement(btn_refresh);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * click on Generate Journalize tab
     */
     public void clickOnGenerateJournalize() throws InterruptedException {

         waitMethods.waitForElementToBeRefreshedAndClickable(btn_GenerateJournals);
        WebElementActions.getActions(driver).clickElement(btn_GenerateJournals);

         waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * click on Check Box
     */
     public void clickOnCheckBoxofPeriod() throws InterruptedException {

         waitMethods.waitForElementToBeRefreshedAndClickable(checkbox_allPeriods);
        WebElementActions.getActions(driver).clickElement(checkbox_allPeriods);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * click on checkbox
     */
     public void clickOnCheckBox() throws InterruptedException {

         waitMethods.waitForElementToBeRefreshedAndClickable(checkbox);
        WebElementActions.getActions(driver).clickElement(checkbox);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * click on Grnerate Journals
     */
     public void clickOnGenerateJournalsBtn() throws InterruptedException {

         waitMethods.waitForElementToBeRefreshedAndClickable(GenerateJournals);
        WebElementActions.getActions(driver).clickElement(GenerateJournals);

         waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**click On Service Board */
     public void clickOnServiceBoard() throws InterruptedException, FileNotFoundException {

//        ReusableActions.getActions(driver).clickParentMenu("Service");
//        ReusableActions.getActions(driver).clickChildMenu("Service Board");
         waitMethods.waitForElementToBeRefreshedAndClickable(menu_Service);
         WebElementActions.getActions(driver).clickElement(menu_Service);

         waitMethods.waitForElementToBeRefreshedAndClickable(service_board);
         WebElementActions.getActions(driver).clickElement(service_board);

         waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);

    }
    /**
     * click on financial manager
     */
     public void clickOnFinancialManager() throws InterruptedException {

         waitMethods.waitForElementToBeRefreshedAndClickable(financialManager);
        WebElementActions.getActions(driver).clickElement(financialManager);

         waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * verify Today's Date
     */
     public void verifyTodaysdateColumn() throws InterruptedException {
         Thread.sleep(3000);
         waitMethods.waitForElementToBeRefreshedAndIsVisible(date_cell);
        Assert.assertTrue(date_cell.isDisplayed());
    }
    /**
     * click on sign out and verify username
     */
     public void clickOnSignOutVerifyUsername() throws InterruptedException {

         waitMethods.waitForElementToBeRefreshedAndClickable(btn_signOut);
        Thread.sleep(3000);
        WebElementActions.getActions(driver).clickElement(btn_signOut);

         waitMethods.waitForElementToBeRefreshedAndIsVisible(date_cell);
        Assert.assertTrue(inputbox_Username.isDisplayed());
        TestListener.saveScreenshotPNG(driver);
    }

}
