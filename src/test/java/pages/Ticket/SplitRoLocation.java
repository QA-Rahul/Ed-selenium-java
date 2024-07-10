package pages.Ticket;

import actions.ReusableActions;
import actions.WaitActions;
//import actions.WebElementActions;
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

public class SplitRoLocation extends TestDriverActions {

    @FindBy(xpath = "//span[text()='New RO']")
    WebElement btn_newRo;

    @FindBy(xpath = "//div[contains(@id,'cbSelectUnitLocal')]")
    WebElement btn_select;

    @FindBy(xpath = "//div[contains(@id,'cbCancel')]")
    WebElement btn_cancle;

    @FindBy(xpath = "//div[contains(@id,'ctbAddLabor')]")
    WebElement btn_addLabor;

    @FindBy(xpath = "(//a[contains(@id,'sdiVmrs::disAcr')])[1]")
    WebElement btn_VMRS;

    @FindBy(xpath = "//input[contains(@id,'searchVmrs:dc_it1::content')]")
    WebElement textarea_Search;

    @FindBy(xpath = "//a[contains(@id,'cilvmrsys')]/img")
    WebElement img_Accessories;

    @FindBy(xpath = "//a[contains(@id,'j_id781141642_be8aace_1')]/img")
    WebElement img_AerodynamicDevices;

    @FindBy(xpath = "//a[contains(@id,'ciAddVmrs')]/img")
    WebElement plusIcon;

    @FindBy(xpath = "//div[contains(@id,'ctbOk')]")
    WebElement btn_Ok;

    @FindBy(xpath = "(//div[contains(@id,'cbROS')])[1]")
    WebElement btn_splitRo;

    @FindBy(xpath = "//div[contains(@id,'cbNWO')]")
    WebElement NewRo;

    @FindBy(xpath = "//label[text()='Location:']")
    WebElement Location;

    @FindBy(xpath = "//label[text()='Location:']/following::input[1]")
    WebElement location_area;

    @FindBy(xpath = "//label[text()='Location:']/following::a[1]")
    WebElement location_name;

    @FindBy(xpath = "//label[text()='Owner:']")
    WebElement owner;

    @FindBy(xpath = "//label[text()='Owner:']/following::div[1]")
    WebElement owner_name;

    @FindBy(xpath = "//label[text()='Unit #:']")
    WebElement unit;

    @FindBy(xpath = "//label[text()='Unit #:']/following::a[1]")
    WebElement unit_name;

    @FindBy(xpath = "(//span[text()='#'])[1]")
    WebElement hash;

    @FindBy(xpath = "(//span[text()='P'])[1]")
    WebElement P;

    @FindBy(xpath = "(//span[text()='Description'])[1]")
    WebElement description;

    @FindBy(xpath = "(//span[text()='Estimated Hours'])[1]")
    WebElement estimateHours;

    @FindBy(xpath = "(//span[text()='Charge Hours'])[1]")
    WebElement charge_Hours;
    @FindBy(xpath = "(//span[text()='Hourly Charge'])[1]")
    WebElement Hourly_Charge;

    @FindBy(xpath = "(//span[text()='Total Charge'])[1]")
    WebElement Total_charge;
    @FindBy(xpath = "(//td[contains(@id,'pwWBDN::tb')])[2]/div")
    WebElement createNewRo;

    @FindBy(xpath = "(//label[text()='Location:'])[2]/following::a[1]")
    WebElement location_name_createRo;

    @FindBy(xpath = "(//label[text()='Location:'])[2]")
    WebElement location_createRo;

    @FindBy(xpath = "(//label[text()='Owner:'])[2]")
    WebElement owner_creatrRo;
    @FindBy(xpath = "(//label[text()='Owner:'])[2]/following::a[1]")
    WebElement owner_name_createRo;
    @FindBy(xpath = "(//label[text()='Unit #:'])[2]/following::a[1]")
    WebElement unit_name_createRo;
    @FindBy(xpath = "(//label[text()='Unit #:'])[2]")
    WebElement unit_createRo;
    @FindBy(xpath = "(//label[text()='Invoice To:'])[2]")
    WebElement InvoiceRo;
    @FindBy(xpath = "(//label[text()='Invoice To:'])[2]/following::a[1]")
    WebElement InvoiceRo_name;
    @FindBy(xpath = "//label[text()='Date:']")
    WebElement date;
    @FindBy(xpath = "//label[text()='Date:']/following::input[1]")
    WebElement date_input;

    @FindBy(xpath = "//div[contains(@id,'cbOK')]/a/span")
    WebElement btn_CreateNewRo;
    @FindBy(xpath = "//input[contains(@id,'sqFac:dc_it1::content')]")
    WebElement search_location;

    @FindBy(xpath = "(//div[contains(@id,'cbSelectFac')])[1]")
    WebElement select_btn;

    @FindBy(xpath = "//h1[contains(text(),'Split from RO')]")
    WebElement title_splitFromRoNumber;

    @FindBy(xpath = "//h1[text()='Split to RO']")
    WebElement splitToRo_title;
    @FindBy(xpath = "//span[text()='Split To RO#']")
    WebElement splitToHash;
    @FindBy(xpath = "//span[text()='Owner']")
    WebElement owner_splitToRo;

    @FindBy(xpath = "//span[text()='Unit #']")
    WebElement unit_hash;

    @FindBy(xpath = "//span[text()='Invoice To']")
    WebElement InvoiceTo;

    @FindBy(xpath = "//span[text()='RO Status']")
    WebElement RoStatus;

    @FindBy(xpath = "//div[contains(@id,'tWUT::db')]")
    WebElement noSuchElement;
    @FindBy(xpath = "//td[contains(@id,'ctWUTWO')]")
    WebElement new_row;
    @FindBy(xpath = "//a[contains(@id,'ciTFR')]")
    WebElement back_arrow_one;
    @FindBy(xpath = "//span[text()='Status']/following::a[1]")
    WebElement newRoNumber;

    @FindBy(xpath = "//td[contains(@id,'ctWUTWO')]/span")
    List<WebElement> newSplitRo;

    @FindBy(xpath = "//span[text()='Refresh']")
    WebElement refresh_btn;
    @FindBy(xpath =  "//li[contains(@class,'AFAutoSuggestItem')]")
    WebElement list_Location;
    @FindBy(xpath = "(//span[contains(@id,'si1')]/following::td)[4]")
    WebElement btn_signOut;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement inputbox_Username;

    @FindBy(xpath = "//h1[contains(.,'Working...Please Wait')]")
    List<WebElement> loder;

    public SplitRoLocation(WebDriver driver){
        this.driver = driver;
        this.waitMethods = new WaitMethods(driver);
    }

    public static void gotoCompleteRo() throws FileNotFoundException, InterruptedException {
//        ReusableActions.getActions(driver).clickParentMenu("Service");
//        ReusableActions.getActions(driver).clickChildMenu("Complete RO");
    }
    /**
     * verify location
     */
      public void verifyLocation() throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndIsVisible(Location);
        Assert.assertTrue(Location.isDisplayed());
        Assert.assertTrue(location_area.isDisplayed());
    }
    /**
     * click on New Ro button
     */
      public void clickNewRo() throws InterruptedException {
 //       Thread.sleep(2000);
          waitMethods.waitForElementToBeRefreshedAndClickable(btn_newRo);
        WebElementActions.getActions(driver).clickElement(btn_newRo);

          waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * click on select unit
     */
      public void clickOnSelect() throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndClickable(btn_select);
        WebElementActions.getActions(driver).clickElement(btn_select);



          waitMethods.loadingWait(loder);
          TestListener.saveScreenshotPNG(driver);
    }
    /**
     * verify location and name of location
     */
       public void verifyLocationwithName() throws InterruptedException {
           waitMethods.waitForElementToBeRefreshedAndIsVisible(Location);
         Assert.assertTrue(Location.isDisplayed());
         Assert.assertTrue(location_name.isDisplayed());
     }
    /**
     * verify owner and name of owner
     */
       public void verifyOwnerName() throws InterruptedException {
           waitMethods.waitForElementToBeRefreshedAndIsVisible(owner);
         Assert.assertTrue(owner.isDisplayed());
         Assert.assertTrue(owner_name.isDisplayed());
     }
    /**
     * verify unit
     */
      public void verifyUnitName() throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndIsVisible(unit);
        Assert.assertTrue(unit.isDisplayed());
        Assert.assertTrue(unit_name.isDisplayed());
    }
    /**
     * verify hash
     */
      public void verifyHash() throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndIsVisible(hash);
        Assert.assertTrue(hash.isDisplayed());
    }
    /**
     * verify P
     */
      public void verifyP() throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndIsVisible(P);
        Assert.assertTrue(P.isDisplayed());
    }
    /**
     * verify description
     */
      public void verifyDescription() throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndIsVisible(description);
        Assert.assertTrue(description.isDisplayed());
    }
    /**
     * verify estimate hours
     */
      public void verifyEstimateHours() throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndIsVisible(estimateHours);
        Assert.assertTrue(estimateHours.isDisplayed());
    }
    /**
     * verify charge hours
     */
      public void verifyCharge_Hours() throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndIsVisible(charge_Hours);
        Assert.assertTrue(charge_Hours.isDisplayed());
    }
    /**
     * verify hourly charges
     */
      public void verifyHourly_Charge() throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndIsVisible(Hourly_Charge);
        Assert.assertTrue(Hourly_Charge.isDisplayed());
    }
    /**
     * verify Total charge
     */
      public void verifyTotalCharge() throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndIsVisible(Total_charge);
        Assert.assertTrue(Total_charge.isDisplayed());
    }
    /**
     * click on Add Labour
     */
      public void clickOnAddLabour() throws InterruptedException {
        Thread.sleep(2000);
          waitMethods.waitForElementToBeRefreshedAndClickable(btn_addLabor);
        WebElementActions.getActions(driver).clickElement(btn_addLabor);

          waitMethods.loadingWait(loder);

        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * click on VMRS
     */
      public void clickOnVMRS() throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndClickable(btn_VMRS);
        WebElementActions.getActions(driver).clickElement(btn_VMRS);

          waitMethods.loadingWait(loder);

        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * Enter First Labour
     */
      public void enterFirstLabour() throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndClickable(textarea_Search);
        WebElementActions.getActions(driver).inputText(textarea_Search,appProp53.getProperty("FirstLabour"));

          waitMethods.loadingWait(loder);

        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * click on firstlabour image
     */
      public void clickOnFirstLabourImg() throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndClickable(img_Accessories);
        WebElementActions.getActions(driver).clickElement(img_Accessories);

          waitMethods.loadingWait(loder);

        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * click on Plus button
     */
      public void clickOnPlusbtn() throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndClickable(plusIcon);
        WebElementActions.getActions(driver).clickElement(plusIcon);

          waitMethods.loadingWait(loder);

        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * click on Ok button
     */
      public void clickOnOkbtn() throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndClickable(btn_Ok);
        WebElementActions.getActions(driver).clickElement(btn_Ok);

          waitMethods.loadingWait(loder);

        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * Enter Second Labour
     */
      public void enterSecondLabour() throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndClickable(textarea_Search);
        WebElementActions.getActions(driver).inputText(textarea_Search,appProp53.getProperty("SecondLabour"));

          waitMethods.loadingWait(loder);

        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * click on Secondlabour image
     */
      public void clickOnSecondLabourImg() throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndClickable(img_Accessories);
        WebElementActions.getActions(driver).clickElement(img_Accessories);

          waitMethods.loadingWait(loder);

        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * click on split Ro
     */
      public void clickOnSplitRo() throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndClickable(btn_splitRo);
        WebElementActions.getActions(driver).clickElement(btn_splitRo);

          waitMethods.loadingWait(loder);

        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * click on NewRo
     */
      public void clickOnNewRo() throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndClickable(NewRo);
        WebElementActions.getActions(driver).clickElement(NewRo);

          waitMethods.loadingWait(loder);

        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * verify create New Ro
     */
      public void verifyCreateNewRo() throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndIsVisible(createNewRo);
        Assert.assertTrue(createNewRo.isDisplayed());
        Assert.assertTrue(location_createRo.isDisplayed());
        Assert.assertTrue(location_name_createRo.isDisplayed());
        Assert.assertTrue(owner_creatrRo.isDisplayed());
        Assert.assertTrue(owner_name_createRo.isDisplayed());
        Assert.assertTrue(unit_createRo.isDisplayed());
        Assert.assertTrue(unit_name_createRo.isDisplayed());
        Assert.assertTrue(InvoiceRo.isDisplayed());
        Assert.assertTrue(InvoiceRo_name.isDisplayed());
        Assert.assertTrue(date.isDisplayed());
        Assert.assertTrue(date_input.isDisplayed());
        Assert.assertTrue(btn_cancle.isDisplayed());
        Assert.assertTrue(btn_CreateNewRo.isDisplayed());

        TestListener.saveScreenshotPNG(driver);

    }
    /**
     * Click on Location name
     */
      public void clickOnLocationName() throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndClickable(location_name_createRo);
        WebElementActions.getActions(driver).clickElement(location_name_createRo);

          waitMethods.loadingWait(loder);

        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * Enter location in search area
     */
      public void enterSearchName() throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndClickable(search_location);
        WebElementActions.getActions(driver).inputText(search_location,appProp53.getProperty("LocationName"));

          waitMethods.loadingWait(loder);

        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * Click on Select
     */
      public void clickOnSelectBtn() throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndClickable(select_btn);
        WebElementActions.getActions(driver).clickElement(select_btn);

          waitMethods.loadingWait(loder);

        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * click on Create New Ro
     */
      public void clickOnCreateNewRo() throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndClickable(btn_CreateNewRo);
        WebElementActions.getActions(driver).clickElement(btn_CreateNewRo);

          waitMethods.loadingWait(loder);

        TestListener.saveScreenshotPNG(driver);
    }
    /**
     *  Verify split from RO Number
     */
       public void verifySplitFromRoNumber() throws InterruptedException {
           waitMethods.waitForElementToBeRefreshedAndIsVisible(title_splitFromRoNumber);
         Assert.assertTrue(title_splitFromRoNumber.isDisplayed());
     }
    /**
     * Verify Split To Ro
     */
      public void verifySplitToRo() throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndIsVisible(splitToRo_title);
        Assert.assertTrue(splitToRo_title.isDisplayed());
        Assert.assertTrue(splitToHash.isDisplayed());
        Assert.assertTrue(owner_splitToRo.isDisplayed());
        Assert.assertTrue(unit_hash.isDisplayed());
        Assert.assertTrue(InvoiceTo.isDisplayed());
        Assert.assertTrue(RoStatus.isDisplayed());
        Assert.assertTrue(noSuchElement.isDisplayed());

    }
    /**
     * verify new split ro number
     */
      public void verifyNewSplitRoNumber() throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndIsVisible(new_row);
        Assert.assertTrue(new_row.isDisplayed());
    }
    /**
     * click on back arrow
     */
      public void clickOnBackArrow() throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndClickable(back_arrow_one);
        WebElementActions.getActions(driver).clickElement(back_arrow_one);

          waitMethods.loadingWait(loder);

        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * Enter New Create Ro Location name into location
     */
      public void enterCreateRoLocation() throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndClickable(location_area);
           WebElementActions.getActions(driver).inputText(location_area, appProp53.getProperty("LocationName"));
           Thread.sleep(2000);
           location_area.sendKeys(appProp.getProperty("LocationName"));
            Thread.sleep(2000);
           WebElementActions.getActions(driver).clickElement(list_Location);

          waitMethods.loadingWait(loder);

        TestListener.saveScreenshotPNG(driver);


    }
    /**
     *  click on Refresh button
     */
      public void clickOnRefreshButton() throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndClickable(refresh_btn);
        WebElementActions.getActions(driver).clickElement(refresh_btn);

          waitMethods.loadingWait(loder);

        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * verify New Created Ro number
     */
      public void verifyNewRoNumber() throws InterruptedException {
        Thread.sleep(2000);
          waitMethods.waitForElementToBeRefreshedAndIsVisible(newRoNumber);
        Assert.assertTrue(newRoNumber.isDisplayed());
    }
    /**
     *  verify Change Location
     */
      public void verifyChangeLocation() throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndIsVisible(location_name);
        Assert.assertTrue(location_name.isDisplayed());
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
