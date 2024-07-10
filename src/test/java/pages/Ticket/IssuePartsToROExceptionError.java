package pages.Ticket;

import actions.WebElementActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import tests.TestDriverActions;
import utils.TestListener;
import utils.WaitMethods;

import java.util.List;

public class IssuePartsToROExceptionError extends TestDriverActions {

    @FindBy(xpath = "//a[text()='Parts']")
    WebElement Parts;
    @FindBy(xpath = "//td[text()='Issue Parts to RO']")
    WebElement IssuePartstoRO;
    @FindBy(xpath = "//span[text()='Scan Employee Badge']")
    WebElement ScanEmployeeBadge;
    @FindBy(xpath = "//span[text()='Scan Employee Badge']/following::input[1]")
    WebElement txtbox_ScanEmployeeBadge;
    @FindBy(xpath = "//div[contains(@id,'sfEnEmp:cbGo')]")
    WebElement btn_Go;
    @FindBy(xpath = "//label[text()='Employee:']")
    WebElement txt_employee;
    @FindBy(xpath = "//label[text()='Employee:']/following::td[1]")
    WebElement txt_employeeName;
    @FindBy(xpath = "//h1[text()='Work In Progress']")
    WebElement title_WorkInProgress;
    @FindBy(xpath = "//label[text()='Repair Location:']")
    WebElement txt_RepairLocation;
    @FindBy(xpath = "//label[text()='Repair Location:']/following::input[1]")
    WebElement txtbox_RepairLocation;
    @FindBy(xpath = "//label[text()='Search Work In Progress:']")
    WebElement txt_searchWorkInProgress;
    @FindBy(xpath = "//label[text()='Search Work In Progress:']/following::input[1]")
    WebElement txtbox_searchWorkInProgress;
    @FindBy(xpath = "//div[contains(@id,'bSWIP')]")
    WebElement btn_Refresh;
    @FindBy(xpath = "//div[contains(@id,'bSELWA')]")
    WebElement btn_select;
    @FindBy(xpath = "//div[text()='Issue Part']")
    WebElement issuePart;
    @FindBy(xpath = "//label[text()='Location:']")
    WebElement txt_location;
    @FindBy(xpath = "//label[text()='Location:']/following::div[1]")
    WebElement location_name;
    @FindBy(xpath = "//label[text()='Unit Owner:']")
    WebElement txt_UnitOwner;
    @FindBy(xpath = "//label[text()='Unit Owner:']/following::div[1]")
    WebElement UnitOwner_name;
    @FindBy(xpath = "//label[text()='Unit #:']")
    WebElement txt_unit;
    @FindBy(xpath = "//label[text()='Unit #:']/following:: div[1]")
    WebElement unit_name;
    @FindBy(xpath = "//label[text()='RO#:']")
    WebElement txt_RO;
    @FindBy(xpath = "//label[text()='RO#:']/following::div[1]")
    WebElement RO_name;
    @FindBy(xpath = "//h1[text()='PM Oil Service']")
    WebElement txt_RepairAerodynamicDevices;
    @FindBy(xpath = "//div[contains(@id,'ctbClose')]")
    WebElement btn_close;
    @FindBy(xpath = "//a[text()='Perfit']")
    WebElement perfit;
    @FindBy(xpath = "//td[text()='Report Setup']")
    WebElement ReportSetup;
    @FindBy(xpath = "(//a[contains(@id,'sdi1::disAcr')])[1]")
    WebElement tab_categories;
    @FindBy(xpath = "(//a[contains(@id,'sdi2::disAcr')])[1]")
    WebElement tab_report;
    @FindBy(xpath = "//label[text()='Search:']")
    WebElement search;
    @FindBy(xpath = "//label[text()='Search:']/following::input[1]")
    WebElement txtbox_search;
    @FindBy(xpath = "//div[contains(@id,'ctb3')]")
    WebElement tab_newReport;
    @FindBy(xpath = "//h3[text()='Report 12MonthCosts']")
    WebElement title_Report12MonthCosts;
    @FindBy(xpath = "//h3[text()='Report Versions']")
    WebElement txt_ReportVersions;

    @FindBy(xpath = "(//span[contains(@id,'si1')]/following::td)[4]")
    WebElement btn_signOut;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement inputbox_Username;


    @FindBy(xpath = "//h1[text()='Working...Please Wait']")
     List<WebElement> loder;


    public IssuePartsToROExceptionError(WebDriver driver){
        this.driver = driver;
        this.waitMethods = new WaitMethods(driver);
    }

    /*
       go to Issue Tech Part Screen
     */
    public void gotoIssueTechPartScreen() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(Parts);
        WebElementActions.getActions(driver).clickElement(Parts);

        waitMethods.waitForElementToBeRefreshedAndClickable(IssuePartstoRO);
        WebElementActions.getActions(driver).clickElement(IssuePartstoRO);

    }
    /*
        verify Scan Employee Badge
     */
    public void verifyScanEmployeeBadge() throws InterruptedException {

        waitMethods.waitForElementToBeRefreshedAndIsVisible(ScanEmployeeBadge);
        Assert.assertTrue(ScanEmployeeBadge.isDisplayed());
        Assert.assertTrue(txtbox_ScanEmployeeBadge.isDisplayed());
        Assert.assertTrue(btn_Go.isDisplayed());
    }
    /*
        enter name of Badge
     */
    public void enterNameOfBadge() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(txtbox_ScanEmployeeBadge);
        WebElementActions.getActions(driver).inputText(txtbox_ScanEmployeeBadge, appProp60.getProperty("badge"));

        TestListener.saveScreenshotPNG(driver);
    }
    /*
       click on Go button
     */
    public void clickOnGoBtn() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(btn_Go);
        WebElementActions.getActions(driver).clickElement(btn_Go);

        waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /*
       verify employee
     */
    public void verifyEmployee() throws InterruptedException {

        waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_employee);
        Assert.assertTrue(txt_employee.isDisplayed());
        Assert.assertTrue(txt_employeeName.isDisplayed());
    }
    /*
       verify Work In progress
     */
    public void verifyWorkInProgress() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(title_WorkInProgress);
        Assert.assertTrue(title_WorkInProgress.isDisplayed());

    }
    /*
       verify Repair Location
     */
    public void verifyRepairLocation() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_RepairLocation);
        Assert.assertTrue(txt_RepairLocation.isDisplayed());
        Assert.assertTrue(txtbox_RepairLocation.isDisplayed());
    }
    /*
       verify Search Work In Progress
     */
    public void verifySearchWorkInProgress() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_searchWorkInProgress);
        Assert.assertTrue(txt_searchWorkInProgress.isDisplayed());
        Assert.assertTrue(txtbox_searchWorkInProgress.isDisplayed());

    }
    /*
       verify select button
     */
    public void verifySelectBtn() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(btn_Refresh);
        Assert.assertTrue(btn_Refresh.isDisplayed());
        Assert.assertTrue(btn_select.isDisplayed());
    }
    /*
       Click on select btn
     */
    public void clickOnSelectBtn() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndClickable(btn_select);
        WebElementActions.getActions(driver).clickElement(btn_select);

        waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /*
       verify title Issue Part
     */
     public void verifyIssuePart() throws InterruptedException{
         waitMethods.waitForElementToBeRefreshedAndIsVisible(issuePart);
         Assert.assertTrue(issuePart.isDisplayed());

    }/*
       verify location
     */
     public void verifyLocation() throws InterruptedException{
         waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_location);
         Assert.assertTrue(txt_location.isDisplayed());
         Assert.assertTrue(location_name.isDisplayed());
    }/*
       verify Unit Owner
     */
     public void verifyUnitOwner() throws InterruptedException{
         waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_UnitOwner);
         Assert.assertTrue(txt_UnitOwner.isDisplayed());
         Assert.assertTrue(UnitOwner_name.isDisplayed());
    }/*
       verify Unit
     */
     public void verifyUnit() throws InterruptedException{
         waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_unit);
         Assert.assertTrue(txt_unit.isDisplayed());
         Assert.assertTrue(unit_name.isDisplayed());
    }/*
       verify RO
     */
     public void verifyRO() throws InterruptedException{
         waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_RO);
         Assert.assertTrue(txt_RO.isDisplayed());
         Assert.assertTrue(RO_name.isDisplayed());
    }/*
       verify Repair Aerodynamic Devices
     */
     public void verifyRepairAerodynamicDevices() throws InterruptedException{
         waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_RepairAerodynamicDevices);
         Assert.assertTrue(txt_RepairAerodynamicDevices.isDisplayed());
         Assert.assertTrue(btn_close.isDisplayed());
    }/*
       click on close button
     */
     public void clickOnCloseBtn() throws InterruptedException{
         waitMethods.waitForElementToBeRefreshedAndClickable(btn_close);
         WebElementActions.getActions(driver).clickElement(btn_close);

         waitMethods.loadingWait(loder);
         TestListener.saveScreenshotPNG(driver);
    }
    /*
       go to Report setup screen
     */
     public void gotoReportSetupScreen() throws InterruptedException{
         waitMethods.waitForElementToBeRefreshedAndClickable(perfit);
         WebElementActions.getActions(driver).clickElement(perfit);

         waitMethods.waitForElementToBeRefreshedAndClickable(ReportSetup);
         WebElementActions.getActions(driver).clickElement(ReportSetup);

     }
    /*
       verify tab categories
     */
     public void verifyCategories() throws InterruptedException{
         waitMethods.waitForElementToBeRefreshedAndIsVisible(tab_categories);
         Assert.assertTrue(tab_categories.isDisplayed());
         Assert.assertTrue(tab_report.isDisplayed());
    }
    /*
       verify search
     */
     public void verifySearch() throws InterruptedException{
         waitMethods.waitForElementToBeRefreshedAndIsVisible(search);
         Assert.assertTrue(search.isDisplayed());
         Assert.assertTrue(txtbox_search.isDisplayed());
         Assert.assertTrue(tab_newReport.isDisplayed());
    }
    /*
       verify Report 12 Month Costs
     */
     public void verifyReport12MonthCosts() throws InterruptedException{
         waitMethods.waitForElementToBeRefreshedAndIsVisible(title_Report12MonthCosts);
         Assert.assertTrue(title_Report12MonthCosts.isDisplayed());
         Assert.assertTrue(txt_ReportVersions.isDisplayed());
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
