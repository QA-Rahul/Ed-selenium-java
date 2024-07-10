 package pages.tech;

import actions.ReusableActions;
import actions.WaitActions;
import actions.WebElementActions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import tests.TestDriverActions;
import utils.TestListener;
import utils.WaitMethods;

import java.io.FileNotFoundException;
import java.util.List;

public class PauseLabor extends TestDriverActions {

    @FindBy(xpath = "//span[contains(text(),'Scan Employee Badge')]/following::input[1]")
    WebElement enter_Techbadge;

    @FindBy(xpath = "//span[text()='Go']")
    WebElement btn_Go;

    @FindBy(xpath = "//div[contains(@id,'ctbAssignedWork')]")
    List<WebElement> btn_assignedWork;

    @FindBy(xpath = "//span[text()='More Units']")
    WebElement btn_MoreUnits;

    @FindBy(xpath = "(//label[text()='Search Unit:'])[1]/following::input[1]")
    WebElement searchunit_Firstname;

    @FindBy(xpath = "//div[contains(@id,'cbSelectUnitLocal')]")
    WebElement btn_select;

    @FindBy(xpath = "//div[contains(@id,'ctbLabourGuide')]/a/span")
    WebElement btn_MoreUnit;

   @FindBy(xpath = "(//a[contains(text(),'VMRS')])[1]")
    WebElement btn_VMRS;

    @FindBy(xpath = "//a[contains(@id,'cilvmrsys')]/img")
    WebElement img_MarineWork;

   @FindBy(xpath = "//a[contains(@id,'ciAddVmrs')]/img")
    WebElement btn_plus ;

    @FindBy(xpath = "//textarea[contains(@id,'itComplaint::content')]")
    WebElement complaint_textbox;

   @FindBy(xpath = "//div[contains(@id,'ctbOk')]/a/span")
    WebElement btn_add;

   @FindBy(xpath = "//a[contains(@id,'ciWorkRequired')]/img")
    WebElement  img_WorkRequired;

    @FindBy(xpath = "//div[contains(@id,'ctbPause')]/a/span")
    WebElement btn_pause;

    @FindBy(xpath = "//a[contains(@id,'clStartJob')]/span[2]")
    WebElement label_CurrentJob_PauseWork;

    @FindBy(xpath = "//a[contains(@id,'cl1')]/span[2]")
    WebElement label_Unit_FirstUnit;

    @FindBy(xpath = "//table[contains(@id,'ptTRO:pgl2')]/tbody/tr/td[3]/span")
    WebElement lable_pause;

   @FindBy(xpath = "//span[contains(@id,'ot3')]/label")
    WebElement selectAssignedWork;

    @FindBy(xpath = "(//div[contains(@id,'ctbSelect')]/a)[1]")
    WebElement select_btn;

    @FindBy(xpath = "(//a[contains(text(),'Summary')])[1]")
    WebElement btn_Summary;

   @FindBy(xpath = "//div[contains(@id,'unitReadyButtonId')]/a/span")
    WebElement btn_unitReady;

    @FindBy(xpath = "//div[contains(@id,'ctbSelectAssignedWork')]/a/span")
    WebElement Select_button;

    @FindBy(xpath = "//img[contains(@id,'ciWoactStartId::icon')]")
    WebElement clock_icon;

//    @FindBy(xpath = "//a[text()='Sign Out']")
@FindBy(xpath = "(//span[contains(@id,'si1')]/following::td)[4]")
    WebElement btn_signOut;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement inputbox_Username;

    @FindBy(xpath = "//h1[contains(text(),'Working...Please Wait')]")
    List<WebElement> loder;

   public PauseLabor(){
       this.driver = driver;
       this.waitMethods = new WaitMethods(driver);
   }

    public void enterTechBadge() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(enter_Techbadge);
        WebElementActions.getActions(driver).inputText(enter_Techbadge,appProp38.getProperty("TechBadge"));

    }

    public void clickOnGo() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(btn_Go);
        WebElementActions.getActions(driver).clickElement(btn_Go);

        waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }

    public void clickMoreUnits() throws InterruptedException {
        Thread.sleep(8000);
        if(btn_assignedWork.size()> 0)
        {
            waitMethods.waitForElementToBeRefreshedAndClickable(btn_assignedWork.get(0));
            WebElementActions.getActions(driver).clickElement(btn_assignedWork.get(0));

            waitMethods.loadingWait(loder);
            TestListener.saveScreenshotPNG(driver);
        }
        Thread.sleep(2000);
        waitMethods.waitForElementToBeRefreshedAndClickable(btn_MoreUnits);
        WebElementActions.getActions(driver).clickElement(btn_MoreUnits);

        waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);

    }

    public void enterFirstUnit() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(searchunit_Firstname);
        WebElementActions.getActions(driver).inputText(searchunit_Firstname,appProp38.getProperty("FirstUnit"));

        waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }

    public void clickSelectButton() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(btn_select);
        WebElementActions.getActions(driver).clickElement(btn_select);

        waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }

    public void clickMoreWorks() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(btn_MoreUnit);
        WebElementActions.getActions(driver).clickElement(btn_MoreUnit);

        waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);

    }

    public void clickVMRS() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(btn_VMRS);
        WebElementActions.getActions(driver).clickElement(btn_VMRS);

        waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);

    }

    public void clickVMRSImg() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(img_MarineWork);
        WebElementActions.getActions(driver).clickElement(img_MarineWork);

        waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);

    }

    public void clickPlusbtn() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(btn_plus);
        WebElementActions.getActions(driver).clickElement(btn_plus);

        waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);

    }

    public void enterTextComplaintBox() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(complaint_textbox);
        WebElementActions.getActions(driver).inputText(complaint_textbox,appProp38.getProperty("Text"));

        waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);

    }

    public void clickOnAdd() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(btn_add);
        WebElementActions.getActions(driver).clickElement(btn_add);

        waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);

    }

    public void clickAccessoriesImg() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(img_WorkRequired);
        WebElementActions.getActions(driver).clickElement(img_WorkRequired);

        waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);

    }

    public void clickPauseButton() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(btn_pause);
        WebElementActions.getActions(driver).clickElement(btn_pause);

        waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);

    }

    public void verifyPauseWork_FirstUnit() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(label_CurrentJob_PauseWork);
        Assert.assertTrue(label_CurrentJob_PauseWork.isDisplayed());
        Assert.assertTrue(label_Unit_FirstUnit.isDisplayed());

    }

    public void enterSecondunit() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(searchunit_Firstname);
        WebElementActions.getActions(driver).inputText(searchunit_Firstname,appProp38.getProperty("SecondUnit"));

        waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }

    public void verifyPause() throws InterruptedException {
       Thread.sleep(2000);
        waitMethods.waitForElementToBeRefreshedAndIsVisible(lable_pause);
        Assert.assertTrue(lable_pause.isDisplayed());
    }

    public void clickAssignedWork() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(btn_assignedWork.get(0));
        WebElementActions.getActions(driver).clickElement(btn_assignedWork.get(0));

        waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }

    public void verifySelectAssignedWork() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(selectAssignedWork);
        Assert.assertTrue(selectAssignedWork.isDisplayed());
    }

    public void clickOnSelect() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(select_btn);
        WebElementActions.getActions(driver).clickElement(select_btn);

        waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }

    public void clickOnSummary() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(btn_Summary);
        WebElementActions.getActions(driver).clickElement(btn_Summary);

        waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);

    }

    public void clickOnUnitReady() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(btn_unitReady);
        WebElementActions.getActions(driver).clickElement(btn_unitReady);

        waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);

    }

    public void click_Select() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(Select_button);
        WebElementActions.getActions(driver).clickElement(Select_button);
        waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);

    }

    public void clickClockIcon() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(clock_icon);
        WebElementActions.getActions(driver).clickElement(clock_icon);

        waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);

    }

    /**
     * click on signOut btn
     * verify username
     */
     public void clickOnSignOut() throws InterruptedException {

         waitMethods.waitForElementToBeRefreshedAndClickable(btn_signOut);
 //       Thread.sleep(4000);
        WebElementActions.getActions(driver).clickElement(btn_signOut);


         waitMethods.waitForElementToBeRefreshedAndIsVisible(inputbox_Username);
        Assert.assertTrue(inputbox_Username.isDisplayed());

        TestListener.saveScreenshotPNG(driver);
    }



}
