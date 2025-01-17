 package pages.techRo;

import actions.LoginActions;
import actions.ReusableActions;
import actions.WaitActions;
import actions.WebElementActions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import tests.TestDriverActions;
import utils.TestListener;
import utils.WaitMethods;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Random;

public class ServiceManagerPartsRelatedTasks extends TestDriverActions {
    @FindBy(xpath = "//span[text()='Add Parts']")
    public  WebElement label_AddPart1;

    @FindBy(xpath = "//div[contains(@id,'cancel')]//span[text ()='OK']")
    public WebElement  btn_AlertOk;

    @FindBy(xpath = "(//span[contains(.,'Add Lab')])[1]")
    public  WebElement label_AddLabor;

    @FindBy(xpath = "(//a[text()='VMRS'])[1]")
    public  WebElement label_VMRS;

    @FindBy(xpath = "//img[@title='Accessories Group']")
    public WebElement label_AccessoriesGroup;


    @FindBy(xpath = "//img[contains(@id,':ciAddVmrs::icon')]")
    public WebElement label_AddGroup;

    @FindBy(xpath = "//span[text()='Add']")
    public WebElement label_AddGroupButton;

    @FindBy(xpath = "(//img[contains(@id,':ciAddVmrs::icon')])[1]")
    public WebElement label_Add;

   // @FindBy(xpath = "//div[contains(@id,':1:ctbOk')]/a/child::span[text()='Add']")
   // public WebElement label_AddButton;

    @FindBy(xpath = "//span[text()='Add']")
    public WebElement label_AddButton;

    @FindBy(xpath = "//div[contains(@id,'pgltWAIDX')]//div")
    List<WebElement> SrNo;

    @FindBy(xpath = "//img[@title='Automatic/Manual Chassis Lubricator']")
    public WebElement AutomaticManual;

    @FindBy(xpath = "(//a[contains(text(),'O0')])[1]")
    public WebElement label_ReferenceNumber;

    @FindBy(xpath = "(//div[contains(@id,'pgltWAIDX')]/div)[1]")
    public WebElement label_SrNo;

    @FindBy(xpath = "(//div[contains(@id,':tParts::db')]//table//div//a/child::span[contains(@id,'::text')])[1]")
    public WebElement label_PartsSrNo;

    @FindBy(xpath = "//span[text()='Warehouses']")
    public WebElement label_WareHouse;

    @FindBy(xpath = "//span[text()='On Hand']")
    public WebElement label_OnHand;

    @FindBy(xpath = "//span[text()='Store Room']")
    public WebElement label_StoreRoom;

    @FindBy(xpath = "//span[text()='Row Number']")
    public WebElement label_RowNumber;

    @FindBy(xpath = "//span[text()='Shelf']")
    public WebElement label_Shelf;

    @FindBy(xpath = "//span[text()='Bin Number']")
    public WebElement label_BinNumber;

    @FindBy(xpath = "//label[text()='Part #:']/preceding-sibling::span")
    public WebElement label_PartRequired;

    @FindBy(xpath = "//label[text()='Part #:']")
    public WebElement label_Part;

    @FindBy(xpath = "(//label[text()='Part #:']/parent::span/following::div)[1]")
    public WebElement label_PartTextArea;

    @FindBy(xpath = "//label[text()='Part Description:']")
    public WebElement label_PartDescription;

    @FindBy(xpath = "(//label[text()='Part Description:']/following::div)[1]")
    public WebElement label_PartDescriptionTextArea;

    @FindBy(xpath = "(//label[text()='Part Description:']/parent::span/parent::div//following-sibling::div//span//span)[1]")
    public WebElement label_laborRequired;

    @FindBy(xpath = "(//label[text()='Part Description:']/parent::span/parent::div//following-sibling::div//span//label)[1]")
    public WebElement label_Labor;

    @FindBy(xpath = "(//label[text()='Part Description:']/parent::span/parent::div//following-sibling::div//span//select)[1] ")
    public WebElement label_LaborDropDown;

    @FindBy(xpath = "//label[text()='Part Failure:']/preceding-sibling::span")
    public WebElement label_PartFailureRequired;

    @FindBy(xpath = "//label[text()='Part Failure:']")
    public WebElement label_PartFailure;

    @FindBy(xpath = "//label[text()='Part Failure:']/following::div//span//select")
    public WebElement label_PartFailureDropDown;

    @FindBy(xpath = " //label[text()='Charge Quantity (EA):']/preceding-sibling::span")
    public WebElement label_ChargeQuantityRequired;

    @FindBy(xpath = "//label[text()='Charge Quantity (EA):']")
    public WebElement label_ChargeQuantity;

    @FindBy(xpath = "//label[text()='Charge Quantity (EA):']/parent::span/parent::div/following-sibling::div/child::table//div//input")
    public WebElement label_ChargeQuantityTextArea;

    @FindBy(xpath = "//table[contains(@id,'pgl7')]/tbody/tr/td[2]/span")
    public WebElement label_StoreText;

    @FindBy(xpath = "//label[text()='Unit Charge:']")
    public WebElement label_UnitCharge;

    @FindBy(xpath = "//input[contains(@id,':itUnitChargeCurrency::content')]")
    public WebElement txt_UnitChargeTextBox;

    @FindBy(xpath = "//label[text()='Total Charge:']")
    public WebElement label_TotalCharge;

    @FindBy(xpath = "//table[contains(@id,'pgl7')]/tbody/tr/td[2]/span")
    public WebElement label_TotalChargeValue;


    @FindBy(xpath = "(//div[contains(@id,'pslStockOnHand::b')]//a//span)[1]")
    public WebElement label_CancelButton;

    @FindBy(xpath = "//div[contains(@id,':0:rPOH:1:cb2')]//a//span")
    public WebElement label_OkButton;


    @FindBy(xpath = "//span[text()='Add Parts']")
    public WebElement label_AddPart;

    @FindBy(xpath = "//img[contains(@id,'vmrImage')]")
    public WebElement label_Img;

    @FindBy(xpath = "//a[contains(@id,'clPartsStockOnHand')]")
    public WebElement label_PartName;

    @FindBy(xpath = "//input[contains(@id,':itSearchPartSelect::content')]")
    public WebElement txt_PartTextArea;


    @FindBy(xpath = "//li[contains(@id,':itSearchPartSelect::su0')]")
    public WebElement label_PartNumber;

    @FindBy(xpath = "//span[text()='Issue Part']")
    public WebElement btn_IssuePartBtn;

    @FindBy(xpath = "(//a[contains(@id,'clPartsStockOnHand')])[1]")
    public WebElement label_NewPartName;

    @FindBy(xpath = "//td[contains(@id,'ctWAPAQ')]/span")
    public WebElement label_ChargeQuantityTwo;

    @FindBy(xpath = "//div[contains(@id,':ctbncp')]//a//img/following-sibling::span")
    public WebElement btn_NonCatalogPart;

    @FindBy(xpath = "//input[contains(@id,':itItemasCode::content')]")
    public WebElement input_PartTextArea;

    @FindBy(xpath = "//input[contains(@id,'itItemasDescription::content')]")
    public WebElement input_DescriptionTextArea;

    @FindBy(xpath = "//label[text()='Unit Cost: (Required)']/preceding-sibling::input")
    public WebElement input_UnitTextArea;

    @FindBy(xpath = "//div[contains(@id,':cbOK')]//span[text()='Issue Part']")
    public WebElement btn_IssuePart;

    @FindBy(xpath = "(//div[contains(@id,':tWAP::db')]//table//td//div//a[contains(@id,':clPartsStockOnHand')])[1]")
    public WebElement  txt_PartOnHand;

    //@FindBy(xpath = "(//span[contains(text(),'Accessories Group')]/parent::a/following::a[4]/child::img)[2]")
   @FindBy(xpath = "(//td[contains(@id,'ctWoActDelete')]/span)[3]")
   List<WebElement> img_CrossIcon1;

 //   @FindBy(xpath = "(//span[contains(text(),'Automatic/Manual Chassis')]/parent::a/following::a[4]/child::img)[2]")
   @FindBy(xpath = "(//td[contains(@id,'ctWoActDelete')]/span)[4]")
   List<WebElement> img_CrossIcon2;

    @FindBy(xpath = "//span[contains(text(),'Add Lab')]/following::img[1]")
    public WebElement label_Delete3;

    @FindBy(xpath = " (//table[contains(@id,':pgRTWAP')]//tbody//a/child::img)[1]")
    public WebElement img_CrossIcon;

    @FindBy(xpath = "//img[contains(@id,':cilWAP::icon')]")
    public WebElement img_DeleteIcon;

    @FindBy(xpath = "(//div[contains(@id,'ctbClose')])[2]")
    public WebElement btn_Close;

    @FindBy(xpath = "(//span[contains(@id,'si1')]/following::td)[4]")
    public WebElement label_SignOut;

    @FindBy(xpath = "//input[contains(@id,'username::content')]")
    public WebElement label_UserName;

    @FindBy(xpath = "//h1[text()='Working...Please Wait']")
    List<WebElement> loder;

    @FindBy(xpath = "//div[contains(@id,':tParts::db')]")
    public WebElement label_NoDataDisplay;

    @FindBy(xpath = "//span[text()='Please select an Activity first']")
    public List <WebElement> txt_AlertMessage;

    @FindBy(xpath = "//a[text()='Service']")
    WebElement menu_Service;

    @FindBy(xpath = "//td[text()='Complete RO']")
    WebElement subMenu_CompleteRo;

    public ServiceManagerPartsRelatedTasks(WebDriver driver){
        this.driver = driver;
        this.waitMethods = new WaitMethods(driver);
        this.webElementActions = new WebElementActions(driver);

    }

    /**
     * go to complete RO Screen
     */
      public void goToCompleteROScreen() throws InterruptedException, FileNotFoundException {
//        ReusableActions.getActions().clickParentMenu("Service");
//        ReusableActions.getActions().clickChildMenu("Complete RO");

          waitMethods.waitForElementToBeRefreshedAndClickable(menu_Service);
          WebElementActions.getActions(driver).clickElement(menu_Service);

          waitMethods.waitForElementToBeRefreshedAndClickable(subMenu_CompleteRo);
          WebElementActions.getActions(driver).clickElement(subMenu_CompleteRo);

          waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);


    }
    /**click on Add Labour */
      public void clickOnAddLabour() throws InterruptedException {

          waitMethods.waitForElementToBeRefreshedAndIsVisible(label_AddLabor);
        WebElementActions.getActions(driver).clickElement(label_AddLabor);

          waitMethods.waitForElementToBeRefreshedAndIsVisible(label_VMRS);
        WebElementActions.getActions(driver).clickElement(label_VMRS);

          waitMethods.waitForElementToBeRefreshedAndIsVisible(label_AccessoriesGroup);
        WebElementActions.getActions(driver).clickElement(label_AccessoriesGroup);

          waitMethods.waitForElementToBeRefreshedAndIsVisible(label_Add);
        WebElementActions.getActions(driver).clickElement(label_Add);
          waitMethods.loadingWait(loder);


          waitMethods.waitForElementToBeRefreshedAndIsVisible(label_AddButton);
          WebElementActions.getActions(driver).clickElement(label_AddButton);
          waitMethods.loadingWait(loder);

    }
      public void clickOnAddLabour1() throws InterruptedException {

    /*      waitMethods.waitForElementToBeRefreshedAndIsVisible(label_AddLabor);
        WebElementActions.getActions(driver).clickElement(label_AddLabor);


          waitMethods.waitForElementToBeRefreshedAndIsVisible(label_VMRS);
        WebElementActions.getActions(driver).clickElement(label_VMRS);


          waitMethods.waitForElementToBeRefreshedAndIsVisible(AutomaticManual);
        WebElementActions.getActions(driver).clickElement(AutomaticManual);


          waitMethods.waitForElementToBeRefreshedAndIsVisible(label_Add);
        WebElementActions.getActions(driver).clickElement(label_Add);
          waitMethods.loadingWait(loder);


          waitMethods.waitForElementToBeRefreshedAndIsVisible(label_AddButton);
        Thread.sleep(2000);
        WebElementActions.getActions(driver).clickElement(label_AddButton);
          waitMethods.loadingWait(loder);  */

        Thread.sleep(8000);
        if(SrNo.size() > 5)
        {
//            WebElementActions.getActions(driver).moveOnTargetElement(SrNo.get(0));
            JavascriptExecutor js = (JavascriptExecutor)driver;
            js.executeScript("arguments[0].scrollIntoView();",SrNo.get(0));
            ((JavascriptExecutor) driver).executeScript("window.scrollBy(0, -400)");

            waitMethods.waitForElementToBeRefreshedAndClickable(SrNo.get(0));
                       Thread.sleep(3000);
            WebElementActions.getActions(driver).clickElement(SrNo.get(0));

        }
        else {
            waitMethods.waitForElementToBeRefreshedAndIsVisible(SrNo.get(0));
            WebElementActions.getActions(driver).clickElement(SrNo.get(0));
            waitMethods.loadingWait(loder);
        }



    }
    /**click On Add Parts*/
      public void clickOnAddParts () throws InterruptedException {

          waitMethods.waitForElementToBeRefreshedAndIsVisible(label_AddPart);
          WebElementActions.getActions(driver).clickElement(label_AddPart);

          waitMethods.waitForElementToBeRefreshedAndIsVisible(label_Img);
          WebElementActions.getActions(driver).clickElement(label_Img);


          if(LoginActions.environmentName.contains("EC")){
              waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_PartTextArea);
              WebElementActions.getActions(driver).inputText(txt_PartTextArea,appProp13.getProperty("PartValue"));
          } else  if(LoginActions.environmentName.contains("EU")){
              waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_PartTextArea);
              WebElementActions.getActions(driver).inputText(txt_PartTextArea,appProp25.getProperty("PartValue"));
          } else  if(LoginActions.environmentName.contains("NA")){
              waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_PartTextArea);
              WebElementActions.getActions(driver).inputText(txt_PartTextArea,appProp41.getProperty("PartValue"));
          } else  if(LoginActions.environmentName.contains("QA")){
              waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_PartTextArea);
              WebElementActions.getActions(driver).inputText(txt_PartTextArea,appProp.getProperty("PartValue"));
          }

//          txt_PartTextArea.sendKeys(Keys.ENTER);
//          waitMethods.loadingWait(loder);
            Thread.sleep(2000);
          waitMethods.waitForElementToBeRefreshedAndIsVisible(label_PartNumber);
        WebElementActions.getActions(driver).clickElement(label_PartNumber);


          waitMethods.waitForElementToBeRefreshedAndClickable(btn_IssuePartBtn);
        WebElementActions.getActions(driver).clickElement(btn_IssuePartBtn);


          waitMethods.waitForElementToBeRefreshedAndIsVisible(btn_Close);
        WebElementActions.getActions(driver).clickElement(btn_Close);
          waitMethods.loadingWait(loder);
    }


    /**click On Reference Number*/
      public void clickOnReferenceNumber() throws InterruptedException {

          waitMethods.waitForElementToBeRefreshedAndIsVisible(label_ReferenceNumber);
        WebElementActions.getActions(driver).clickElement(label_ReferenceNumber);
        Thread.sleep(2000);
        TestListener.saveScreenshotPNG(driver);

    }

    /**click on Add Labour sr.No*/
      public void clickOnAddLabourSrNo() throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndClickable(label_SrNo);
        WebElementActions.getActions(driver).clickElement(label_SrNo);
    }

    /**click On Part Name*/
      public void clickOnPartName() throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndClickable(label_PartsSrNo);
        WebElementActions.getActions(driver).clickElement(label_PartsSrNo);
    }

    /**verify text Warehouse*/
      public void verifyWareHouse() throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndIsVisible(label_WareHouse);
        Assert.assertTrue(label_WareHouse.isDisplayed());
    }

    /**verify text On Han*/
      public void verifyOnHand() throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndIsVisible(label_OnHand);
        Assert.assertTrue(label_OnHand.isDisplayed());
    }

    /**verify text StoreRoom*/
      public void verifyStoreRoom() throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndIsVisible(label_StoreRoom);
        Assert.assertTrue(label_StoreRoom.isDisplayed());

    }

    /**verify text Row Number*/
      public void verifyRowNumber() throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndIsVisible(label_RowNumber);
        Assert.assertTrue(label_RowNumber.isDisplayed());

    }

    /**verify text Shelf*/
      public void verifyShelf() throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndIsVisible(label_Shelf);
        Assert.assertTrue(label_Shelf.isDisplayed());

    }

    /**verify text Bin Number*/
      public void verifyBinNumber() throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndIsVisible(label_BinNumber);
        Assert.assertTrue(label_BinNumber.isDisplayed());

    }

    /**verify text Part Required*/
      public void verifyPartRequired() throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndIsVisible(label_PartRequired);
        Assert.assertTrue(label_PartRequired.isDisplayed());

    }

    /**verify text Part # */
      public void verifyPart() throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndIsVisible(label_Part);
        Assert.assertTrue(label_Part.isDisplayed());
    }

    /**verify part Value*/
      public void verifyPartTextArea() throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndIsVisible(label_PartTextArea);
        Assert.assertTrue(label_PartTextArea.isDisplayed());

    }

    /**verify text Part Description*/
      public void verifyPartDescription() throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndIsVisible(label_PartDescription);
        Assert.assertTrue(label_PartDescription.isDisplayed());

    }

    /**verify PartDescription Value*/
      public void verifyPartDescriptionTextArea() throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndIsVisible(label_PartDescriptionTextArea);
        Assert.assertTrue(label_PartDescriptionTextArea.isDisplayed());

    }

    /**verify labor Required */
      public void verifyLaborRequired() throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndIsVisible(label_laborRequired);
        Assert.assertTrue(label_laborRequired.isDisplayed());

    }

    /**verify text labor*/
      public void verifyLabor() throws InterruptedException {

          waitMethods.waitForElementToBeRefreshedAndIsVisible(label_Labor);
        Assert.assertTrue(label_Labor.isDisplayed());

    }

    /**verify labor Dropdown */
      public void verifyLaborDropDown() throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndIsVisible(label_LaborDropDown);
        Assert.assertTrue(label_LaborDropDown.isDisplayed());


    }

    /**verify text part failure Required */
      public void verifyPartFailureRequired() throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndIsVisible(label_PartFailureRequired);
        Assert.assertTrue(label_PartFailureRequired.isDisplayed());

    }

    /**verify Text Part Failure */
      public void verifyPartFailure() throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndIsVisible(label_PartFailure);
        Assert.assertTrue(label_PartFailure.isDisplayed());

    }

    /**verify Part failure Dropdown*/
      public void verifyPartFailureDropDown() throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndIsVisible(label_PartFailureDropDown);
        Assert.assertTrue(label_PartFailureDropDown.isDisplayed());

    }

    /**verify Text ChargeQuantity Required*/
      public void verifyChargeQuantityRequired() throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndIsVisible(label_ChargeQuantityRequired);
        Assert.assertTrue(label_ChargeQuantityRequired.isDisplayed());
    }

    /**verify Text  Charge Quantity*/
      public void verifyChargeQuantity() throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndIsVisible(label_ChargeQuantity);
        Assert.assertTrue(label_ChargeQuantity.isDisplayed());

    }

    /**
     * verify Charge Quantity TextArea
     */
      public void verifyChargeQuantityTextArea() throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndIsVisible(label_ChargeQuantityTextArea);
        Assert.assertTrue(label_ChargeQuantityTextArea.isDisplayed());

    }

    /**
     * verify Text Unit Charge
     */
      public void verifyUnitCharge() throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndIsVisible(label_UnitCharge);
        Assert.assertTrue(label_UnitCharge.isDisplayed());
    }

    /**
     * verify Unit Charge TextBox
     */
      public void verifyUnitChargeTextBox() throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_UnitChargeTextBox);
        Assert.assertTrue(txt_UnitChargeTextBox.isDisplayed());
    }

    /**
     * verify Text Total Charge
     */
      public void verifyTotalCharge() throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndIsVisible(label_TotalCharge);
        Assert.assertTrue(label_TotalCharge.isDisplayed());

    }

    /**verify Total Charges Value */
      public void verifyTotalChargeValue() throws InterruptedException {

          waitMethods.waitForElementToBeRefreshedAndIsVisible(label_TotalChargeValue);
        Assert.assertTrue(label_TotalChargeValue.isDisplayed());
    }

    /**
     * verify Text Cancel Button
     */
      public void verifyCancelButton() throws InterruptedException {

          waitMethods.waitForElementToBeRefreshedAndIsVisible(label_CancelButton);
        Assert.assertTrue(label_CancelButton.isDisplayed());

    }

    /**
     * verify Text Ok Button
     */
      public void verifyOkButton() throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndIsVisible(label_OkButton);
        Assert.assertTrue(label_OkButton.isDisplayed());

    }

    /**
     * verify Charge Quantity Editable
     */
      public void verifyChargeQuantityEditable() throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndIsVisible(label_ChargeQuantityTextArea);
        Assert.assertTrue(label_ChargeQuantityTextArea.isDisplayed());
        TestListener.saveScreenshotPNG(driver);
    }

    /**
     * verify Unit Charge Text Area
     */
      public void verifyUnitChargeTextArea() throws InterruptedException {

          waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_UnitChargeTextBox);
        Assert.assertTrue(txt_UnitChargeTextBox.isDisplayed());
        TestListener.saveScreenshotPNG(driver);
    }

    /**
     * Store Text Old Total Charge
     */
      public void editChargeQuantity() throws InterruptedException {

          waitMethods.waitForElementToBeRefreshedAndIsVisible(label_StoreText);
        Assert.assertTrue(label_StoreText.isDisplayed());

        if (LoginActions.environmentName.contains("EU")) {
            waitMethods.waitForElementToBeRefreshedAndClickable(label_ChargeQuantityTextArea);
            WebElementActions.getActions(driver).inputText(label_ChargeQuantityTextArea, appProp25.getProperty("Two"));
        }
          waitMethods.waitForElementToBeRefreshedAndClickable(txt_UnitChargeTextBox);
            WebElementActions.getActions(driver).clickElement(txt_UnitChargeTextBox);


    }

    /**verify not text*/
      public void verifyOldTotalCharge() throws InterruptedException {

          waitMethods.waitForElementToBeRefreshedAndIsVisible(label_ChargeQuantityTextArea);
        Assert.assertTrue(label_ChargeQuantityTextArea.isDisplayed());
    }

    /**new Total Charges
     */
      public void newTotalCharges() throws InterruptedException {

          waitMethods.waitForElementToBeRefreshedAndIsVisible(label_TotalChargeValue);
        Assert.assertTrue(label_TotalChargeValue.isDisplayed());
    }

    /**
     * type Unit charges value
     */
      public void typeUnitChargeValue() throws InterruptedException {
        if (LoginActions.environmentName.contains("EU")) {
            waitMethods.waitForElementToBeRefreshedAndClickable(txt_UnitChargeTextBox);
            WebElementActions.getActions(driver).inputText(txt_UnitChargeTextBox, appProp25.getProperty("UnitChargeValue"));
        } else if(LoginActions.environmentName.contains("EC")){
            waitMethods.waitForElementToBeRefreshedAndClickable(txt_UnitChargeTextBox);
            WebElementActions.getActions(driver).inputText(txt_UnitChargeTextBox, appProp13.getProperty("UnitChargeValue"));
        } else if(LoginActions.environmentName.contains("NA")){
            waitMethods.waitForElementToBeRefreshedAndClickable(txt_UnitChargeTextBox);
            WebElementActions.getActions(driver).inputText(txt_UnitChargeTextBox, appProp41.getProperty("UnitChargeValue"));
        } else if(LoginActions.environmentName.contains("QA")) {
            waitMethods.waitForElementToBeRefreshedAndClickable(txt_UnitChargeTextBox);
            WebElementActions.getActions(driver).inputText(txt_UnitChargeTextBox, appProp.getProperty("UnitChargeValue"));
        }

            waitMethods.loadingWait(loder);

//        }
    }

    /**
     * click On Charge Quantity
     */
      public void clickOnChargeQuantity() throws InterruptedException {

          waitMethods.waitForElementToBeRefreshedAndClickable(label_ChargeQuantityTextArea);
        WebElementActions.getActions(driver).clickElement(label_ChargeQuantityTextArea);
          waitMethods.loadingWait(loder);
    }

    /**
     * verify not text
     */
      public void verifyNewTotalCharge() throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndIsVisible(label_TotalChargeValue);
        Assert.assertTrue(label_TotalChargeValue.isDisplayed());
    }


    /** verify Charge Quantity Editable*/
      public void verifyChargeQuantityEditable2() throws InterruptedException {
        if (LoginActions.environmentName.contains("QA")) {
            waitMethods.waitForElementToBeRefreshedAndClickable(label_ChargeQuantityTextArea);
            WebElementActions.getActions(driver).inputText(label_ChargeQuantityTextArea, appProp.getProperty("ChargeQuantity"));
            label_ChargeQuantityTextArea.sendKeys(Keys.ENTER);
            Assert.assertTrue(label_ChargeQuantityTextArea.isDisplayed());
            TestListener.saveScreenshotPNG(driver);
        }
    }
    /**verify Unit Charge Text Area */
      public void verifyUnitChargeTextArea2() throws InterruptedException {
            if (LoginActions.environmentName.contains("QA")) {
                waitMethods.waitForElementToBeRefreshedAndClickable(txt_UnitChargeTextBox);
                WebElementActions.getActions(driver).inputText(txt_UnitChargeTextBox, appProp.getProperty("UnitQuantity"));
                txt_UnitChargeTextBox.sendKeys(Keys.ENTER);
                Assert.assertTrue(txt_UnitChargeTextBox.isDisplayed());
                TestListener.saveScreenshotPNG(driver);
            }
        }



    /**click On Submit Button */
      public void clickOnOk() throws InterruptedException {

          waitMethods.waitForElementToBeRefreshedAndClickable(label_OkButton);
        WebElementActions.getActions(driver).clickElement(label_OkButton);
          waitMethods.loadingWait(loder);
    }

    /**
     * click On Add Part
     */
      public void clickOnAddPart() throws InterruptedException {

          waitMethods.waitForElementToBeRefreshedAndClickable(label_AddPart);
        WebElementActions.getActions(driver).clickElement(label_AddPart);
          waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);


    }

    /**
     * click on IMG
     */
      public void clickOnImg() throws InterruptedException {

          waitMethods.waitForElementToBeRefreshedAndIsVisible(label_Img);
        WebElementActions.getActions(driver).clickElement(label_Img);
          waitMethods.loadingWait(loder);

    }

    /**
     * verify text Part Name
     */
      public void verifyPartName() throws InterruptedException {

          waitMethods.waitForElementToBeRefreshedAndIsVisible(label_PartName);
        Assert.assertTrue(label_PartName.isDisplayed());
          waitMethods.loadingWait(loder);
    }

    /**
     * verify Text Part Area
     */
      public void verifyTextPartTextArea() throws InterruptedException {
           if(LoginActions.environmentName.contains("EC")){
               waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_PartTextArea);
               WebElementActions.getActions(driver).inputText(txt_PartTextArea,appProp13.getProperty("PartValue"));
           } else if(LoginActions.environmentName.contains("EU")){
               waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_PartTextArea);
               WebElementActions.getActions(driver).inputText(txt_PartTextArea,appProp25.getProperty("PartValue"));
           }else if(LoginActions.environmentName.contains("NA")){
               waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_PartTextArea);
               WebElementActions.getActions(driver).inputText(txt_PartTextArea,appProp41.getProperty("PartValue"));
           }else if(LoginActions.environmentName.contains("QA")){
               waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_PartTextArea);
               WebElementActions.getActions(driver).inputText(txt_PartTextArea,appProp.getProperty("PartValue"));
           }

          waitMethods.loadingWait(loder);
    }

    /**click On Part Number*/
      public void clickOnPartNumber() throws InterruptedException {

          waitMethods.waitForElementToBeRefreshedAndClickable(label_PartNumber);
          WebElementActions.getActions(driver).clickElement(label_PartNumber);
          waitMethods.loadingWait(loder);
          TestListener.saveScreenshotPNG(driver);
    }

    /**
     * click on issue Part
     */
      public void clickOnIssuePart() throws InterruptedException {

          waitMethods.waitForElementToBeRefreshedAndIsVisible(btn_IssuePartBtn);
          WebElementActions.getActions(driver).clickElement(btn_IssuePartBtn);
          waitMethods.loadingWait(loder);
          TestListener.saveScreenshotPNG(driver);

    }
    /**verify Part Name */
      public void verifyPartNameTwo () throws InterruptedException {

          waitMethods.waitForElementToBeRefreshedAndIsVisible(label_NewPartName);
        Assert.assertTrue(label_NewPartName.isDisplayed());

    }
    /** store and type  New Part */
      public void clickTextPartNumber () throws InterruptedException {

          if(LoginActions.environmentName.contains("EC")){
              waitMethods.waitForElementToBeRefreshedAndClickable(txt_PartTextArea);
              WebElementActions.getActions(driver).inputText(txt_PartTextArea,appProp13.getProperty("newPartNumber"));
          } else if(LoginActions.environmentName.contains("EU")){
              waitMethods.waitForElementToBeRefreshedAndClickable(txt_PartTextArea);
              WebElementActions.getActions(driver).inputText(txt_PartTextArea,appProp25.getProperty("newPartNumber"));
          }else if(LoginActions.environmentName.contains("NA")){
              waitMethods.waitForElementToBeRefreshedAndClickable(txt_PartTextArea);
              WebElementActions.getActions(driver).inputText(txt_PartTextArea,appProp41.getProperty("newPartNumber"));
          }else if(LoginActions.environmentName.contains("QA")){
              waitMethods.waitForElementToBeRefreshedAndClickable(txt_PartTextArea);
              WebElementActions.getActions(driver).inputText(txt_PartTextArea,appProp.getProperty("newPartNumber"));
          }


            txt_PartTextArea.sendKeys(Keys.ENTER);
            waitMethods.loadingWait(loder);
            TestListener.saveScreenshotPNG(driver);

        }

    /**click On Part Number */
      public void clickOnPartNumberTwo () throws InterruptedException {
          waitMethods.loadingWait(loder);
          waitMethods.waitForElementToBeRefreshedAndClickable(label_PartNumber);
        WebElementActions.getActions(driver).clickElement(label_PartNumber);
          waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);

    }
    /**click On Issue Part button*/
      public void clickOnIssuePartButton () throws InterruptedException {
          waitMethods.loadingWait(loder);
          waitMethods.waitForElementToBeRefreshedAndClickable(btn_IssuePartBtn);
        WebElementActions.getActions(driver).clickElement(btn_IssuePartBtn);
          waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);

    }
    /**verify Charge Quantity*/
      public void verifyChargeQuantityTwo () throws InterruptedException {

          waitMethods.waitForElementToBeRefreshedAndIsVisible(label_ChargeQuantityTwo);
        Assert.assertTrue(label_ChargeQuantityTwo.isDisplayed());

          waitMethods.waitForElementToBeRefreshedAndIsVisible(label_ChargeQuantityTwo);
        Assert.assertTrue(label_ChargeQuantityTwo.isDisplayed());

    }
    /**click on Non-CatalogPart*/
      public void clickOnNonCatalogPart () throws InterruptedException {


          waitMethods.waitForElementToBeRefreshedAndClickable(btn_NonCatalogPart);
        WebElementActions.getActions(driver).clickElement(btn_NonCatalogPart);
          waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**enter Part  and Description Text Area */
      public void inputPartTextArea () throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndClickable(input_PartTextArea);
        WebElementActions.getActions(driver).clickElement(input_PartTextArea);
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(1000);
        input_PartTextArea.sendKeys("DiskBreak" + randomInt );

          waitMethods.waitForElementToBeRefreshedAndClickable(input_DescriptionTextArea);
        WebElementActions.getActions(driver).clickElement(input_DescriptionTextArea);
        input_DescriptionTextArea.sendKeys("DiskBreak" + randomInt );
        System.out.println("DiskBreak" + randomInt );

    }
    /**enter the Input Text Area */
      public void inputUnitTextArea () throws InterruptedException {

          if(LoginActions.environmentName.contains("EC")){
              waitMethods.waitForElementToBeRefreshedAndClickable(input_UnitTextArea);
              WebElementActions.getActions(driver).inputText(input_UnitTextArea, appProp13.getProperty("Unit"));
          } else if(LoginActions.environmentName.contains("EU")){
              waitMethods.waitForElementToBeRefreshedAndClickable(input_UnitTextArea);
              WebElementActions.getActions(driver).inputText(input_UnitTextArea, appProp25.getProperty("Unit"));
          }else if(LoginActions.environmentName.contains("NA")){
              waitMethods.waitForElementToBeRefreshedAndClickable(input_UnitTextArea);
              WebElementActions.getActions(driver).inputText(input_UnitTextArea, appProp41.getProperty("Unit"));
          }else if(LoginActions.environmentName.contains("QA")){
              waitMethods.waitForElementToBeRefreshedAndClickable(input_UnitTextArea);
              WebElementActions.getActions(driver).inputText(input_UnitTextArea, appProp.getProperty("Unit"));
          }


          waitMethods.loadingWait(loder);

        }


    /**click on Issue PArt Button */
      public void clickIssuePart () throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndClickable(btn_IssuePart);
        WebElementActions.getActions(driver).clickElement(btn_IssuePart);
        Thread.sleep(5000);
          waitMethods.loadingWait(loder);

    }
    /**verify part stock On Hand*/
      public void verifyPartOnHand () throws InterruptedException {

          waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_PartOnHand);
        Assert.assertTrue(txt_PartOnHand.isDisplayed());

    }
    /**click on cancel icon*/
      public void clickOncancelicon () throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndIsVisible(img_CrossIcon) ;
        WebElementActions.getActions(driver).clickElement(img_CrossIcon);
          waitMethods.loadingWait(loder);
    }
    /**click on delete*/
      public void clickOnDelete () throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndIsVisible(img_DeleteIcon) ;
        WebElementActions.getActions(driver).clickElement(img_DeleteIcon);
          waitMethods.loadingWait(loder);
    }

    /**click On close Button */
      public void clickOnCloseButton () throws InterruptedException {

          waitMethods.waitForElementToBeRefreshedAndIsVisible(btn_Close) ;
        WebElementActions.getActions(driver).clickElement(btn_Close);
        TestListener.saveScreenshotPNG(driver);

    }
    /**click on image Cross Icon */
      public void clickImageCrossIcon () throws InterruptedException {

      //  WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(SrNo);
      //  WebElementActions.getActions().clickElement(SrNo);
        if (img_CrossIcon1.size()>1) {
            waitMethods.waitForElementToBeRefreshedAndClickable(img_CrossIcon1.get(1));
            Thread.sleep(2000);
            WebElementActions.getActions(driver).clickElement(img_CrossIcon1.get(1));

        }
        if (img_CrossIcon2.size()>1) {
            waitMethods.waitForElementToBeRefreshedAndClickable(img_CrossIcon2.get(1));
            Thread.sleep(2000);
            WebElementActions.getActions(driver).clickElement(img_CrossIcon2.get(1));

        }


          waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);

    }
    /**click on Image Delete Icon */
      public void clickImageDeleteIcon () throws InterruptedException {

          waitMethods.waitForElementToBeRefreshedAndIsVisible(label_Delete3);
        WebElementActions.getActions(driver).clickElement(label_Delete3);
          waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);

    }

    /**click On Sign Out */

      public void clickOnSignOut () throws InterruptedException {

          waitMethods.waitForElementToBeRefreshedAndIsVisible(label_SignOut);
        WebElementActions.getActions(driver).clickElement(label_SignOut);
        TestListener.saveScreenshotPNG(driver);

    }
    /**click on UserName */
    public void clickOnUsername () throws InterruptedException {

        waitMethods.waitForElementToBeRefreshedAndIsVisible(label_UserName);
        Assert.assertTrue(label_UserName.isDisplayed());

    }
}


