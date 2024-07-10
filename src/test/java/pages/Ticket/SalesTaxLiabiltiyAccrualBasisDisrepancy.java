package pages.Ticket;

import actions.WebElementActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import tests.TestDriverActions;
import utils.TestListener;
import utils.WaitMethods;

public class SalesTaxLiabiltiyAccrualBasisDisrepancy extends TestDriverActions {

    @FindBy(xpath="//a[text()='Reports']")
    WebElement reports_menu;
    @FindBy(xpath="//span[text()='Reports']")
    WebElement title_Reports;
    @FindBy(xpath="//h1[text()='Report Categories']")
    WebElement title_ReportCategories;
    @FindBy(xpath="//h1[text()='Available Reports For AP']")
    WebElement title_AvailableReportsForAP;
    @FindBy(xpath="//h1[text()='Report Parameters']")
    WebElement tirle_ReportParameters;
    @FindBy(xpath="//span[text()='AR']")
    WebElement category_AR;
    @FindBy(xpath = "//span[text()='Sales Tax Liability Accrual Basis']")
    WebElement txt_SalesTaxLiabilityAccrualBasis;
    @FindBy(xpath = "//label[text()='From Date:']")
    WebElement label_FromDate;
    @FindBy(xpath = "//label[text()='From Date:']/following::input[1]")
    WebElement txtbox_FromDate;
    @FindBy(xpath = "//label[text()='To Date:']")
    WebElement txt_ToDate;
    @FindBy(xpath = "//label[text()='To Date:']/following::input[1]")
    WebElement txtbox_ToDate;


    public SalesTaxLiabiltiyAccrualBasisDisrepancy(WebDriver driver){
        this.driver = driver;
        this.waitMethods = new WaitMethods(driver);
    }

    /*
        go to Reports Screen
     */
    public void gotoReportsScreen() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(reports_menu);
        WebElementActions.getActions(driver).clickElement(reports_menu);
        TestListener.saveScreenshotPNG(driver);
    }
    /*
         verify title Reports
     */
    public void verifyTitleReports() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(title_Reports);
        Assert.assertTrue(title_Reports.isDisplayed());
    }
    /*
         verify Report Categories
     */
    public void verifyReportCategories() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(title_ReportCategories);
        Assert.assertTrue(title_ReportCategories.isDisplayed());
    }
    /*
         verify Available Reports For AP
     */
    public void verifyAvailableReportsForAP() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(title_AvailableReportsForAP);
        Assert.assertTrue(title_AvailableReportsForAP.isDisplayed());
    }
    /*
         verify Report Parameters
     */
    public void verifyReportParameters() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(tirle_ReportParameters);
        Assert.assertTrue(tirle_ReportParameters.isDisplayed());
    }
    /*
         verify category AR
     */
    public void verifycategory_AR() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(category_AR);
        Assert.assertTrue(category_AR.isDisplayed());
    }
    /*
         click on category AR
     */
    public void clickOnAR() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(category_AR);
        WebElementActions.getActions(driver).clickElement(category_AR);
    }
    /*
         click on available reports of AR
     */
    public void clickOnSalesTaxLiabilityAccrualBasis() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(txt_SalesTaxLiabilityAccrualBasis);
        WebElementActions.getActions(driver).clickElement(txt_SalesTaxLiabilityAccrualBasis);
    }








}
