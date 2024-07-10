 package pages.fleet;

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

public class CreateRedTagDMS extends TestDriverActions {

    @FindBy(xpath = "(//label[text()='Search Unit:'])[1]/following::input[1]")
    WebElement input_searchUnit;

    @FindBy(xpath = "//span[text()='Current Location']/following::a[1]")
    WebElement hyperlink_UnitNumber;

    @FindBy(xpath = "//span[text()='Red Tag']")
    WebElement btn_RedTag;

    @FindBy(xpath = "//div[text()='Red Tag']")
    WebElement subtitle_RedTag;

    @FindBy(xpath = "//div[contains(@id,'tsvd')]")
    List<WebElement> Work_Required;

    @FindBy(xpath = "(//label[text()='Status:'])[2]/preceding::span[1]")
    WebElement label_asterisk;
    @FindBy(xpath = "(//label[text()='Status:'])[2]")
    WebElement label_status;
    @FindBy(xpath = "(//label[text()='Status:'])[2]/following::select")
    WebElement dropdown_status;
    @FindBy(xpath = "(//label[text()='Notes:'])[2]/preceding::span[1]")
    WebElement label_asterisk_Notes;
    @FindBy(xpath = "(//label[text()='Notes:'])[2]")
    WebElement label_notes;
    @FindBy(xpath = "(//label[text()='Notes:'])[2]/following::textarea")
    WebElement notes_textarea;
    @FindBy(xpath = "(//label[text()='Notes:'])[2]/following::span[2]")
    WebElement btn_cancle;
    @FindBy(xpath = "(//label[text()='Notes:'])[2]/following::span[3]")
    WebElement btn_saveEit;

    @FindBy(xpath = "//label[text()='Status:']/following::a[1]")
    WebElement hyperlink_unavailable;

    @FindBy(xpath = "//span[text()='Update unit status to available']")
    WebElement btn_Updateunitstatustoavailable;

    @FindBy(xpath = "//textarea[contains(@id,'itSerdueNotesTS::content')]")
    //   List<WebElement> Work_required_note;
    WebElement Work_required_note;

    @FindBy(xpath = "//label[text()='Created Date:']")
//    List<WebElement> Created_Date;
    WebElement Created_Date;

    @FindBy(xpath = "//label[text()='Created by:']")
    //   List<WebElement> Created_by;
    WebElement Created_by;

    @FindBy(xpath = "//td[text()='Kevin Ingram Kevin Ingram']")
//    List<WebElement> Kevin_Ingram_Kevin_Ingram;
    WebElement Kevin_Ingram_Kevin_Ingram;
    @FindBy(xpath = "//span[text()='Available [AVAIL]']")
    WebElement Available_AVAIL;
    @FindBy(xpath = "//span[text()='Save / Exit']")
    WebElement SaveExit_btn;
    @FindBy(xpath = "//h1[text()='Working...Please Wait']")
    List<WebElement> loder;
    @FindBy(xpath = "//a[text()='Sign Out']")
    WebElement btn_signOut;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement inputbox_Username;
    @FindBy(xpath = "//a[text()='Fleet']")
    WebElement menu_Fleet;
    @FindBy(xpath = "//td[text()='Unit Master']")
    WebElement subMenu_UnitMaster;


    public CreateRedTagDMS(WebDriver driver){
        this.driver = driver;
        this.waitMethods = new WaitMethods(driver);
    }



    /*
     * Go to Unit Master Screen
     * */
     public void gotoUnitMasterScreen() throws FileNotFoundException, InterruptedException {
//        ReusableActions.getActions(driver).clickParentMenu("Fleet");
//        ReusableActions.getActions(driver).clickChildMenu("Unit Master");

         waitMethods.waitForElementToBeRefreshedAndClickable(menu_Fleet);
         WebElementActions.getActions(driver).clickElement(menu_Fleet);

         waitMethods.waitForElementToBeRefreshedAndClickable(subMenu_UnitMaster);
         WebElementActions.getActions(driver).clickElement(subMenu_UnitMaster);
    }
    /**
     * Enter UnitNumber
     */
     public void enterUnitNumber() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(input_searchUnit);
        WebElementActions.getActions(driver).inputText(input_searchUnit,prop.getProperty("UnitNumber"));

         waitMethods.loadingWait(loder);

        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * click on Unit Number
     */
     public void clickOnUnitNumber() throws InterruptedException {

         waitMethods.waitForElementToBeRefreshedAndClickable(hyperlink_UnitNumber);
        WebElementActions.getActions(driver).clickElement(hyperlink_UnitNumber);

         waitMethods.loadingWait(loder);

        TestListener.saveScreenshotPNG(driver);

    }
    /**
     * verify element present Red Tag
     */
     public void verifyRedTag() throws InterruptedException {

         waitMethods.waitForElementToBeRefreshedAndIsVisible(btn_RedTag);
        Assert.assertTrue(btn_RedTag.isDisplayed());
    }
    /**
     * click on Red Tag button
     */
    public void clickonRedTag() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(btn_RedTag);
        WebElementActions.getActions(driver).clickElement(btn_RedTag);

        waitMethods.loadingWait(loder);

        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * verify text Red Tag
     */
     public void verifyRedTag1() throws InterruptedException {

         waitMethods.waitForElementToBeRefreshedAndIsVisible(subtitle_RedTag);
        Assert.assertTrue(subtitle_RedTag.isDisplayed());
    }
    /**
     * verify element present Work Required list
     */
     public void verifyworkRequiredList() throws InterruptedException {

         waitMethods.waitForElementToBeRefreshedAndIsVisible(Work_Required.get(0));
        Assert.assertTrue(Work_Required.size() > 0);
    }
    /**
     * verify text *
     */
     public void verifyAsterisk() throws InterruptedException {

         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_asterisk);
        Assert.assertTrue(label_asterisk.isDisplayed());
    }
    /**
     * verify text Status:
     */
     public void verifyStatus() throws InterruptedException {

         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_status);
        Assert.assertTrue(label_status.isDisplayed());
    }
    /**
     * verify element present Status Drop-down
     */
     public void verifyDropDown() throws InterruptedException {

         waitMethods.waitForElementToBeRefreshedAndIsVisible(dropdown_status);
        Assert.assertTrue(dropdown_status.isDisplayed());
    }
    /**
     * verify text *
     */
     public void verifyAsterisk1() throws InterruptedException {

         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_asterisk_Notes);
        Assert.assertTrue(label_asterisk_Notes.isDisplayed());
    }
    /**
     * verify text Notes:
     */
     public void verifyNotes() throws InterruptedException {

         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_notes);
        Assert.assertTrue(label_notes.isDisplayed());
    }
    /**
     * verify element present Text Area of Notes
     */
     public void verifyAreaOfNotes() throws InterruptedException {

         waitMethods.waitForElementToBeRefreshedAndIsVisible(notes_textarea);
        Assert.assertTrue(notes_textarea.isDisplayed());
    }
    /**
     * verify element present Cancel
     */
     public void verifyCancle() throws InterruptedException {

         waitMethods.waitForElementToBeRefreshedAndIsVisible(btn_cancle);
        Assert.assertTrue(btn_cancle.isDisplayed());
    }
    /**
     * verify element present Save/Exit
     */
     public void verifySaveExit() throws InterruptedException {

         waitMethods.waitForElementToBeRefreshedAndIsVisible(btn_saveEit);
        Assert.assertTrue(btn_saveEit.isDisplayed());
    }
    /**
     * type Work required note(In notes text area)
     */
     public void enterWorkRequired() throws InterruptedException {
         waitMethods.waitForElementToBeRefreshedAndClickable(notes_textarea);
        WebElementActions.getActions(driver).inputText(notes_textarea,prop.getProperty("textarea"));
    }
    /**
     * click on Save/Exit
     */
     public void clickSaveExit() throws InterruptedException {
         waitMethods.waitForElementToBeRefreshedAndClickable(btn_saveEit);
        WebElementActions.getActions(driver).clickElement(btn_saveEit);
    }
    /**
     * verify element present Unavailable
     */
     public void verifyUnavailable() throws InterruptedException {

         waitMethods.waitForElementToBeRefreshedAndIsVisible(hyperlink_unavailable);
        Assert.assertTrue(hyperlink_unavailable.isDisplayed());
    }
    /**
     * verify element present 'Update unit status to available' button
     */
     public void verifyUpdateunitStatus() throws InterruptedException {

         waitMethods.waitForElementToBeRefreshedAndIsVisible(btn_Updateunitstatustoavailable);
        Assert.assertTrue(btn_Updateunitstatustoavailable.isDisplayed());
    }
    /**
     * click on 'Update unit status to available' button
     */
     public void clickUpdateunitstatus() throws InterruptedException {
         waitMethods.waitForElementToBeRefreshedAndClickable(btn_Updateunitstatustoavailable);
        WebElementActions.getActions(driver).clickElement(btn_Updateunitstatustoavailable);
    }
    /**
     * verify text Work required note
     */
     public void verifyWorkRequired() throws InterruptedException {

         waitMethods.waitForElementToBeRefreshedAndIsVisible(Work_required_note);
        Assert.assertTrue(Work_required_note.isDisplayed());

    }
    /**
     * verify text Created Date:
     */
     public void verifyCreatedDate() throws InterruptedException {

         waitMethods.waitForElementToBeRefreshedAndIsVisible(Created_Date);
        Assert.assertTrue(Created_Date.isDisplayed());
    }
    /**
     * verify text Created by:
     */
     public void verifyCreatedBy() throws InterruptedException {

         waitMethods.waitForElementToBeRefreshedAndIsVisible(Created_by);
        Assert.assertTrue(Created_by.isDisplayed());
    }
    /**
     * verify text DMSName(Kevin Ingram Kevin Ingram)
     */
     public void verifyDMSName() throws InterruptedException {

         waitMethods.waitForElementToBeRefreshedAndIsVisible(Kevin_Ingram_Kevin_Ingram);
        Assert.assertTrue(Kevin_Ingram_Kevin_Ingram.isDisplayed());
    }
    /**
     * verify text Available [AVAIL]
     */
     public void verifyAvailable() throws InterruptedException {

         waitMethods.waitForElementToBeRefreshedAndIsVisible(Available_AVAIL);
        Assert.assertTrue(Available_AVAIL.isDisplayed());
    }
    /**
     * type Un-red-tag notes
     */
     public void enterUnredTag() throws InterruptedException {
         waitMethods.waitForElementToBeRefreshedAndClickable(notes_textarea);
        WebElementActions.getActions(driver).inputText(notes_textarea,prop.getProperty("unRedTag"));
    }
    /**
     * click on Save/Exit
     */
     public void clickSaveExitBtn() throws InterruptedException {
         waitMethods.waitForElementToBeRefreshedAndClickable(btn_saveEit);
        WebElementActions.getActions(driver).clickElement(btn_saveEit);
         waitMethods.loadingWait(loder);

    }
    /**
     * verify element present Red Tag
     */
     public void verifyRedTagbtn() throws InterruptedException {

         waitMethods.waitForElementToBeRefreshedAndIsVisible(btn_RedTag);
        Assert.assertTrue(btn_RedTag.isDisplayed());
    }
    /**
     * click on Sign Out
     */
     public void clickOnSignOut () throws InterruptedException {

         waitMethods.waitForElementToBeRefreshedAndClickable(btn_signOut);
        WebElementActions.getActions(driver).clickElement(btn_signOut);

         waitMethods.waitForElementToBeRefreshedAndIsVisible(inputbox_Username);
        Assert.assertTrue(inputbox_Username.isDisplayed());
        TestListener.saveScreenshotPNG(driver);
    }

}
