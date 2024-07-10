package pages.Ticket;

import actions.WebElementActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import tests.TestDriverActions;
import utils.TestListener;
import utils.WaitMethods;

import java.io.FileNotFoundException;

public class AddSearchFieldToTheTelematicsManagerImportReadingsTab extends TestDriverActions {

    @FindBy(xpath = "//a[text()='Fleet']")
    WebElement menu_Fleet;
    @FindBy(xpath = "//td[text()='Telematics Manager']")
    WebElement TelematicsManager;
    @FindBy(xpath = "//span[text()='Telematics Manager']")
    WebElement title_TelematicsManager;
    @FindBy(xpath = "//td[text()='Manage all your telematic equipment and resolve any reading import errors.']")
    WebElement description_telematicsManager;
    @FindBy(xpath = "//h1[text()='Things To Do']")
    WebElement title_ThingsToDo;
    @FindBy(xpath = "//a[contains(@id,'pt1:cl1')]")
    WebElement link_TelematicUnits;
    @FindBy(xpath = "//a[contains(@id,'pt1:cl2')]")
    WebElement link_ImportReadings;
    @FindBy(xpath = "//a[contains(@id,'pt1:cl6')]")
    WebElement link_Integration;
    @FindBy(xpath = "//label[text()='Import From Date:']")
    WebElement txt_ImportFromDate;
    @FindBy(xpath = "//input[contains(@id,'pt1:id1::content')]")
    WebElement txtbox_ImportFromDate;
    @FindBy(xpath = "//a[contains(@id,'pt1:id1::glyph')]")
    WebElement startCalender_icon;
    @FindBy(xpath = "//label[text()='Import To Date:']")
    WebElement txt_ImportToDate;
    @FindBy(xpath = "//input[contains(@id,'pt1:id2::content')]")
    WebElement txtbox_ImportToDate;
    @FindBy(xpath = "//a[contains(@id,'pt1:id2::glyph')]")
    WebElement endCalender_icon;
    @FindBy(xpath = "//label[text()='Show Imported Data With No Errors']/preceding::input[1]")
    WebElement checkbox_ShowImportedDatawithnoError;
    @FindBy(xpath = "//label[text()='Show Imported Data With No Errors']")
    WebElement txt_ShowImportedDatawithnoError;
    @FindBy(xpath = "//label[text()='Search:']")
    WebElement txt_Search;
    @FindBy(xpath = "//label[text()='Search:']/following::input[1]")
    WebElement txtbox_Search;
    @FindBy(xpath = "//span[text()='Refresh']")
    WebElement Btn_Refresh;
    @FindBy(xpath = "//span[text()='Import Date']")
    WebElement txt_ImportDate;
    @FindBy(xpath = "//span[text()='Unit Owner']")
    WebElement txt_UnitOwner;
    @FindBy(xpath = "//span[text()='Unit Number']")
    WebElement txt_UnitNumber;
    @FindBy(xpath = "//span[text()='Reading Date']")
    WebElement txt_ReadingDate;
    @FindBy(xpath = "//span[text()='Reading Value']")
    WebElement txt_ReadingValue;
    @FindBy(xpath = "//span[text()='Reading Type']")
    WebElement txt_ReadingType;
    @FindBy(xpath = "//span[text()='UOM']")
    WebElement txt_UOM;
    @FindBy(xpath = "//span[text()='Imported']")
    WebElement txt_Imported;
    @FindBy(xpath = "//label[text()='Source:']")
    WebElement txt_Source;
    @FindBy(xpath = "//label[text()='Errors:']")
    WebElement txt_Errors;
    @FindBy(xpath = "//div[contains(@id,'tERIF::db')]")
    WebElement NoDataToDisplay;
    @FindBy(xpath = "//td[contains(@id,'tERIF:0:c9')]/descendant::a[1]")
    WebElement link_UnitNumber;
    @FindBy(xpath = "//td[contains(@id,'pt1:tERIF:2:c7')]/span")
    WebElement link_UnitOwner;
    @FindBy(xpath = "//span[text()='Sign Out']")
    WebElement btn_signOut;

    @FindBy(xpath = "//input[@name='username']")
     WebElement inputbox_Username;

 /*   @FindBy(xpath = "")
    WebElement;
    @FindBy(xpath = "")
    WebElement;
    @FindBy(xpath = "")
    WebElement;
    @FindBy(xpath = "")
    WebElement;*/


     public AddSearchFieldToTheTelematicsManagerImportReadingsTab(WebDriver driver){
         this.driver = driver;
         waitMethods = new WaitMethods(driver);
     }

    /**
     * go to telematics manager screen
     */
    public void gotoTelematicsManagerScreen() throws InterruptedException, FileNotFoundException {

        waitMethods.waitForElementToBeRefreshedAndClickable(menu_Fleet);
        WebElementActions.getActions(driver).clickElement(menu_Fleet);

        waitMethods.waitForElementToBeRefreshedAndClickable(TelematicsManager);
        WebElementActions.getActions(driver).clickElement(TelematicsManager);


        TestListener.saveScreenshotPNG(driver);
    }
    /*
        verify title telematics manager
     */
    public void verifytitle_TelematicsManager() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(title_TelematicsManager);
        Assert.assertTrue(title_TelematicsManager.isDisplayed());
    }
    /*
        verify description telematics Manager
     */
    public void verifydescription_telematicsManager() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(description_telematicsManager);
        Assert.assertTrue(description_telematicsManager.isDisplayed());
    }
    /*
        verify title Things To Do with links
     */
    public void title_ThingsToDo() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(title_ThingsToDo);
        Assert.assertTrue(title_ThingsToDo.isDisplayed());
        Assert.assertTrue(link_TelematicUnits.isDisplayed());
        Assert.assertTrue(link_ImportReadings.isDisplayed());
        Assert.assertTrue(link_Integration.isDisplayed());
    }
    /*
        click on link Import Readings
     */
     public void clickOnImportReadings() throws InterruptedException {
         waitMethods.waitForElementToBeRefreshedAndClickable(link_ImportReadings);
         WebElementActions.getActions(driver).clickElement(link_ImportReadings);
     }
     /*
          verify Import From Date field
      */
    public void verifyImportFromDate() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_ImportFromDate);
        Assert.assertTrue(txt_ImportFromDate.isDisplayed());
        Assert.assertTrue(txtbox_ImportFromDate.isDisplayed());
        Assert.assertTrue(startCalender_icon.isDisplayed());
    }
    /*
        verify Import End Date field
     */
    public void verifyImportEndDate() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_ImportToDate);
        Assert.assertTrue(txt_ImportToDate.isDisplayed());
        Assert.assertTrue(txtbox_ImportToDate.isDisplayed());
        Assert.assertTrue(endCalender_icon.isDisplayed());
    }
    /*
         verify checkbox of show imported data with no error
     */
    public void verifycheckbox_ShowImportedDatawithnoError() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(checkbox_ShowImportedDatawithnoError);
        Assert.assertTrue(checkbox_ShowImportedDatawithnoError.isDisplayed());
        Assert.assertTrue(txt_ShowImportedDatawithnoError.isDisplayed());
    }
    /*
         verify search field
     */
     public void verifySearchField() throws InterruptedException {
         waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_Search);
         Assert.assertTrue(txt_Search.isDisplayed());
         Assert.assertTrue(txtbox_Search.isDisplayed());
    }
    /*
         verify refresh button
     */
     public void verifyRefreshButton() throws InterruptedException {
         waitMethods.waitForElementToBeRefreshedAndIsVisible(Btn_Refresh);
         Assert.assertTrue(Btn_Refresh.isDisplayed());
    }
    /*
        verify column names present in Telematics manager table
     */
     public void verifyColumnOfTelematicsManager() throws InterruptedException {
         waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_ImportDate);
         Assert.assertTrue(txt_ImportDate.isDisplayed());
         Assert.assertTrue(txt_UnitOwner.isDisplayed());
         Assert.assertTrue(txt_UnitNumber.isDisplayed());
         Assert.assertTrue(txt_ReadingDate.isDisplayed());
         Assert.assertTrue(txt_ReadingValue.isDisplayed());
         Assert.assertTrue(txt_ReadingType.isDisplayed());
         Assert.assertTrue(txt_UOM.isDisplayed());
         Assert.assertTrue(txt_Imported.isDisplayed());
         Assert.assertTrue(txt_Source.isDisplayed());
         Assert.assertTrue(txt_Errors.isDisplayed());
    }
    /*
         verify No Data To Display
     */
     public void verifyNoDataToDisplay() throws InterruptedException {
         waitMethods.waitForElementToBeRefreshedAndIsVisible(NoDataToDisplay);
         Assert.assertTrue(NoDataToDisplay.isDisplayed());
    }
    /*
        enter import from date
     */
    public void enterImportFromDate() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(txtbox_ImportFromDate);
        WebElementActions.getActions(driver).inputText(txtbox_ImportFromDate,appProp65.getProperty("FromDate"));
    }
    /*
        enter Import To date
     */
    public void enterImportToDate() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(txtbox_ImportToDate);
        WebElementActions.getActions(driver).inputText(txtbox_ImportToDate,appProp65.getProperty("ToDate"));
    }
    /*
        enter unit number in search field
     */
     public void enterUnitNumber() throws InterruptedException {
         waitMethods.waitForElementToBeRefreshedAndClickable(txtbox_Search);
         WebElementActions.getActions(driver).inputText(txtbox_Search,appProp65.getProperty("unitNumber"));
    }
    /*
       click on refresh button
     */
    public void clickOnRefreshButton() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(Btn_Refresh);
        WebElementActions.getActions(driver).clickElement(Btn_Refresh);
    }
    /*
        verify link of Unit Number
     */
     public void verifylinkOfUnitNumber() throws InterruptedException {
         waitMethods.waitForElementToBeRefreshedAndIsVisible(link_UnitNumber);
         Assert.assertTrue(link_UnitNumber.isDisplayed());
     }
    /*
         enter unit owner in search field
     */
     public void enterUnitOwner() throws InterruptedException {
         waitMethods.waitForElementToBeRefreshedAndClickable(txtbox_Search);
         WebElementActions.getActions(driver).inputText(txtbox_Search,appProp65.getProperty("unitOwner"));
    }
    /*
         verify link Unit Owner
     */
    public void verifylinkUnitOwner() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(link_UnitOwner);
        Assert.assertTrue(link_UnitOwner.isDisplayed());
    }
    /**
     * Click on sign out and verify username
     */
    public void clickOnSignOutAndVerifyName() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(btn_signOut);
        WebElementActions.getActions(driver).clickElement(btn_signOut);


        waitMethods.waitForElementToBeRefreshedAndIsVisible(inputbox_Username);
        Assert.assertTrue(inputbox_Username.isDisplayed());

        TestListener.saveScreenshotPNG(driver);
    }


}
