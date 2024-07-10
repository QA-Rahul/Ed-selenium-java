package pages.fleet;

import actions.ReusableActions;
import actions.WaitActions;
import actions.WebElementActions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import tests.TestDriverActions;
import utils.TestListener;

import java.io.FileNotFoundException;
import java.util.List;

public class SetUpWorkRequired extends TestDriverActions {

    @FindBy(xpath = "(//label[text()='Search Unit:']/following::input[1])[1]")
    WebElement txt_searchunit;

    @FindBy(xpath = "//span[text()='Current Location']/following::a[1]/span")
    WebElement hyperlink_number;

    // @FindBy(xpath = "//span[text()='More Info']")
    @FindBy(xpath = "(//span[text()='Save / Exit'])[1]/following::span[1]")
    WebElement btn_moreInfo;

    @FindBy(xpath = "(//a[text()='Work Required'])[1]")
    WebElement btn_workRequired;

    @FindBy(xpath = "//span[text()='More Work ...']")
    WebElement btn_moreWork;

    @FindBy(xpath = "(//a[text()='VMRS'])[1]")
    WebElement btn_VMRS;

    @FindBy(xpath = "//label[text()='Search:']/following::td[6]/a/img")
    WebElement img_airIntakeSystem;

    @FindBy(xpath = "(//span[text()='Description'])[1]/following::a[1]/img")
    WebElement plus_icon;

    @FindBy(xpath = "//span[text()='Add']")
    WebElement btn_add;

    @FindBy(xpath = "(//span[text()='Save / Exit'])[2]")
    WebElement WorkRequired_SaveExit;

    @FindBy(xpath = "(//span[text()='Save / Exit'])[1]")
    WebElement btn_saveExit;

    @FindBy(xpath = "//a[text()='Sign Out']")
    WebElement btn_signOut;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement inputbox_Username;

    @FindBy(xpath = "//h1[text()='Working...Please Wait']")
    List<WebElement> loder;
    @FindBy(xpath = "//a[text()='Fleet']")
    WebElement menu_Fleet;
    @FindBy(xpath = "//td[text()='Unit Master']")
    WebElement subMenu_UnitMaster;




    /**
     * click on fleet
     *  Go to Unit master
     */
     public void gotoUnitMaster() throws FileNotFoundException, InterruptedException {
//        ReusableActions.getActions(driver).clickParentMenu("Fleet");
//        ReusableActions.getActions(driver).clickChildMenu("Unit Master");

         waitMethods.waitForElementToBeRefreshedAndClickable(menu_Fleet);
         WebElementActions.getActions(driver).clickElement(menu_Fleet);

         waitMethods.waitForElementToBeRefreshedAndClickable(subMenu_UnitMaster);
         WebElementActions.getActions(driver).clickElement(subMenu_UnitMaster);

         TestListener.saveScreenshotPNG(driver);
    }

    /**
     *  Type Unit Number 118888
     */
     public void enterUnitNumber() throws InterruptedException {

         waitMethods.waitForElementToBeRefreshedAndClickable(txt_searchunit);
        WebElementActions.getActions(driver).inputText(txt_searchunit,prop.getProperty("UnitNumber"));

         waitMethods.loadingWait(loder);

        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * click on 118888
     */
     public void clickOnHyperLink() throws InterruptedException {
        Thread.sleep(5000);

         waitMethods.waitForElementToBeRefreshedAndClickable(hyperlink_number);
        WebElementActions.getActions(driver).clickElement(hyperlink_number);

         waitMethods.loadingWait(loder);

        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * click on Moreinfo button
     */
     public void clickOnMoreInfo() throws InterruptedException {

         waitMethods.waitForElementToBeRefreshedAndClickable(btn_moreInfo);
        WebElementActions.getActions(driver).clickElement( btn_moreInfo);

         waitMethods.loadingWait(loder);

        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * click on Work requird tab
     */
     public void clickOnWorkRequired() throws InterruptedException {

         waitMethods.waitForElementToBeRefreshedAndClickable(btn_workRequired);
        WebElementActions.getActions(driver).clickElement(btn_workRequired);

         waitMethods.loadingWait(loder);

        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * click on More work tab
     */
     public void clickOnMoreWork() throws InterruptedException {

         waitMethods.waitForElementToBeRefreshedAndClickable(btn_moreWork);
        WebElementActions.getActions(driver).clickElement(btn_moreWork);

         waitMethods.loadingWait(loder);

        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * click on VMRS tab
     */
     public void clickOnVMRS() throws InterruptedException {

         waitMethods.waitForElementToBeRefreshedAndClickable(btn_VMRS);
        WebElementActions.getActions(driver).clickElement(btn_VMRS);

         waitMethods.loadingWait(loder);

        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * click on Image Air Intake System
     */
     public void clickOnAirIntakeSystem() throws InterruptedException {

         waitMethods.waitForElementToBeRefreshedAndClickable(img_airIntakeSystem);
        WebElementActions.getActions(driver).clickElement(img_airIntakeSystem);

         waitMethods.loadingWait(loder);

        TestListener.saveScreenshotPNG(driver);

    }
    /**
     * click on plus icon
     */
     public void clickOnPlusIcon() throws InterruptedException {

         waitMethods.waitForElementToBeRefreshedAndClickable(plus_icon);
        WebElementActions.getActions(driver).clickElement(plus_icon);

         waitMethods.loadingWait(loder);

        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * click on Add button
     */
     public void clickOnAddbutton() throws InterruptedException {

         waitMethods.waitForElementToBeRefreshedAndClickable(btn_add);
        WebElementActions.getActions(driver).clickElement(btn_add);

         waitMethods.loadingWait(loder);

        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * click on save and exit of work required
     */
     public void clickOnSaveAndExit() throws InterruptedException {

         waitMethods.waitForElementToBeRefreshedAndClickable(WorkRequired_SaveExit);
        Thread.sleep(3000);
        WebElementActions.getActions(driver).clickElement(WorkRequired_SaveExit);

         waitMethods.loadingWait(loder);

        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * click on save and exit
     */
     public void clickOnSaveAndExit2() throws InterruptedException {

         waitMethods.waitForElementToBeRefreshedAndClickable(btn_saveExit);
        WebElementActions.getActions(driver).clickElement(btn_saveExit);

         waitMethods.loadingWait(loder);

        TestListener.saveScreenshotPNG(driver);
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


