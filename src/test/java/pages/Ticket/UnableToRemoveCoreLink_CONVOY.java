package pages.Ticket;

import actions.ReusableActions;
import actions.WaitActions;
import actions.WebElementActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import tests.TestDriverActions;
import utils.TestListener;
import utils.WaitMethods;

import java.io.FileNotFoundException;
import java.util.List;

public class UnableToRemoveCoreLink_CONVOY extends TestDriverActions {

 // @FindBy(xpath = "(//span[text()='Part #']/parent::div/parent::th/parent::tr/following::div/table/tbody/tr/td/span/child::a)[1]")

 @FindBy(xpath = "//h2[text()='Part List']")
 WebElement PartList;

 @FindBy(xpath = "//span[text()='Part #']")
 WebElement PartHash1;

 @FindBy(xpath = "//span[text()='Description']")
 WebElement Description;

 @FindBy(xpath = "//span[text()='Preferred Vendor']")
 WebElement PreferredVendor;

 @FindBy(xpath = "//span[text()='Manufacturer']")
 WebElement Manudactuer;

 @FindBy(xpath = "//span[text()='VMRS SYS/ASM']")
 WebElement VMRSSYS;

 @FindBy(xpath = "//span[text()='Vendor Catalog']")
 WebElement vendorCatalog;

 @FindBy(xpath = "//span[text()='Product Group']")
 WebElement ProductGroup;

 //@FindBy(xpath = "(//tr[@role='row']/td[1])[1]")
 @FindBy(xpath = "(//span[text()='Part #']/parent::div/parent::th/parent::tr/following::div/table/tbody/tr/td/span/child::a)[1]")
 WebElement PartNumber;
 @FindBy(xpath = "//a[contains(.,'More Info')]/span")
 WebElement moreInfo;
 @FindBy(xpath = "//td[contains(@id,':0:pw3::tb')]/child::div")
 WebElement label_Title;
 @FindBy(xpath = "//label[contains(text(),'Default Preferred Vendor:')]")
 WebElement DefaultPreferredVendor;

 @FindBy(xpath = "//img[contains(@id,':0:cit1::icon')]")
 WebElement cross;

 @FindBy(xpath = "//label[text()='Default Preferred Vendor:']/parent::td/following-sibling::td/table//tbody/tr/td[2]/child::a")
 WebElement DefaultPreferredVendorValue;

 @FindBy(xpath = "//a[contains(.,'New Vendor')]/span")
 WebElement NewVendor;

 @FindBy(xpath = "//label[text()='Code:']/preceding-sibling::span")
 WebElement RequiredCore;

 @FindBy(xpath = "//label[text()='Code:']")
 WebElement Code;

 @FindBy(xpath = "//label[text()='Code:']/parent::td/following-sibling::td/child::input")
 WebElement CodeTextArea;

 @FindBy(xpath = "//label[contains(text(),'Name:')]/preceding-sibling::span")
 WebElement RequiredName;

 @FindBy(xpath = "//label[contains(text(),'Name:')]")
 WebElement Name;

 @FindBy(xpath = "//label[contains(text(),'Name:')]/parent::td/following-sibling::td/child::input")
 WebElement NameTextarea;

 @FindBy(xpath = "//label[text()='Payment Term:']/preceding-sibling::span")
 WebElement RequiredPaymentTerm;

 @FindBy(xpath = "//label[text()='Payment Term:']")
 WebElement PaymentTerm;

 @FindBy(xpath = "//label[text()='Payment Term:']/parent::td/following-sibling::td/child::select")
 WebElement paymentTermTextarea;

 @FindBy(xpath = "//label[contains(text(),'Currency:')]/preceding-sibling::span")
 WebElement RequiredCurrency;

 @FindBy(xpath = "//label[contains(text(),'Currency:')]")
 WebElement Currency;

 @FindBy(xpath = "//label[contains(text(),'Currency:')]/parent::td/following-sibling::td/select")
 WebElement Currencydropdown;
 @FindBy(xpath = "//label[contains(text(),'Country:')]//preceding-sibling::span")
 WebElement RequiredCountry;

 @FindBy(xpath = "//label[contains(text(),'Country:')]")
 WebElement Country;

 @FindBy(xpath = "//label[contains(text(),'Country:')]/parent::td/following-sibling::td/select")
 WebElement countryTextArea;

 @FindBy(xpath = "(//a[contains(.,'OK')])[2]")
 WebElement OkButton;
 @FindBy(xpath = "(//label[text()='Product Group:']/preceding-sibling::span)[2]")
 WebElement label_RequiredProductGroup;

 @FindBy(xpath = "(//label[text()='Product Group:'])[2]")
 WebElement label_ProductGroup;

 @FindBy(xpath = "(//select[contains(@id,':0:soc3::content')])[2]")
 WebElement selectdropdown;

 @FindBy(xpath = "(//label[text()='Core Part #:'])[1]")
 WebElement CorePart;

 @FindBy(xpath = "//a[contains(.,'Select Core Part')]")
 WebElement selectCorePart;

 @FindBy(xpath = "//label[text()='Core Part #:']/parent::td/following-sibling::td/child::a")
 WebElement label_CorePart;

 @FindBy(xpath = "//a[contains(.,'Delink Core')]")
 WebElement DelinkCore;

 @FindBy(xpath = "//a[contains(.,'Yes')]")
 WebElement Yes;

 @FindBy(xpath = "(//p[contains(.,'Warehouse SHOP has an On hand of')]/parent::div/preceding-sibling::div/child::img)[2]")
 WebElement AlertClose;

 @FindBy(xpath = "//label[contains(text(),'Create New Core Part')]/preceding-sibling::input")
 WebElement RadioButton;

 @FindBy(xpath = "//label[contains(text(),'Create New Core Part')]")
 WebElement CreateNewCorePart;

 @FindBy(xpath = "(//label[text()='Part #:']/preceding-sibling::span)[3]")
 WebElement RequiredPart;

 @FindBy(xpath = "(//label[text()='Part #:'])[3]")
 WebElement partHash;

 @FindBy(xpath = "(//label[text()='Part #:']/parent::td/following-sibling::td/child::input)[2]")
 WebElement PartValue;

 @FindBy(xpath = "(//label[text()='Description:']/preceding-sibling::span)[3]")
 WebElement RequiredDescription;

 @FindBy(xpath = "(//label[text()='Description:'])[3]")
 WebElement Description1;

 @FindBy(xpath = "(//label[text()='Description:']/parent::td/following-sibling::td/child::input)[2]")
 WebElement DescriptionValue;

 @FindBy(xpath = "//label[text()='Standard Cost:']/preceding-sibling::span")
 WebElement RequiredStandardCost;

 @FindBy(xpath = "//label[text()='Standard Cost:']")
 WebElement StandardCost;

 @FindBy(xpath = "//label[text()='Standard Cost:']/parent::td/following-sibling::td/child::input")
 WebElement StandardCostValue;

 @FindBy(xpath = "//label[text()='Last Purchase Cost:']/preceding-sibling::span")
 WebElement RequiredLastPurchaseCost;


 @FindBy(xpath = "//label[text()='Last Purchase Cost:']")
 WebElement LastPurchaseCost;

 @FindBy(xpath = "//label[text()='Last Purchase Cost:']/parent::td/following-sibling::td/child::input")
 WebElement LastPurchaseCostTextArea;

 @FindBy(xpath = "//label[contains(text(),'Retail Markup')]")
 WebElement RetailMaekup;

 @FindBy(xpath = "//label[contains(text(),'Retail Markup')]/parent::td/following-sibling::td/child::input")
 WebElement RetailMarkupTextArea;

 @FindBy(xpath = "//label[text()='Retail Price:']")
 WebElement RetailPrice;

 @FindBy(xpath = "//label[text()='Retail Price:']/parent::td/following-sibling::td/child::input")
 WebElement RetailPriceTextArea;

 @FindBy(xpath = "//span[text()='Link Core']")
 WebElement LinkCore;

 @FindBy(xpath = "(//a[contains(.,'Cancel')])[4]")
 WebElement Cancel;
 @FindBy(xpath = "//span[text()='Delink Core']")
 WebElement DelinkCore1;

 @FindBy(xpath = "(//a[contains(.,'Cancel')]/span)[3]")
 WebElement CancelButton;

 @FindBy(xpath = "//span[text()='Save / Exit']")
 WebElement SaveExit;

 @FindBy(xpath = "//span[text()='Add New Adjustment']")
 WebElement AddNewAdjustment;

 @FindBy(xpath = "(//td[contains(.,'Select Warehouse')])[2]")
 WebElement SelectWarehouse;

 @FindBy(xpath = "(//label[text()='Warehouse:']/preceding-sibling::span)[2]")
 WebElement RequiredWarehouse;

 @FindBy(xpath = "(//label[text()='Warehouse:'])[2]")
 WebElement Warehouse;

 @FindBy(xpath = "//label[text()='Warehouse:']/parent::td/following-sibling::td/child::select")
 WebElement WarehouseTextArea;

 @FindBy(xpath = "(//span[text()='OK'])[1]")
 WebElement okButton;

 @FindBy(xpath = "(//div[contains(@id,':cbCancel')]/a)[2]")
 WebElement Cancel2;

 @FindBy(xpath = "//span[contains(@id,'it1::content')]")
 WebElement WarehouseValue;

 @FindBy(xpath = "//label[text()='Adjustment Type:']/preceding-sibling::span")
 WebElement RequiredAdjustmentTye;

 @FindBy(xpath = "(//label[text()='Adjustment Type:'])[3]")
 WebElement AdjustmentType;

 @FindBy(xpath = "(//select[contains(@id,':soc2::content')])[2]")
 WebElement AdjustmentValue;

 @FindBy(xpath = "//label[text()='Part #:']")
 WebElement partHash1;

 @FindBy(xpath = "//label[text()='Part #:']/parent::td/following-sibling::td/child::input")
 WebElement PartTextArea;

 @FindBy(xpath = "//li[contains(@id,':0:itSearchPartSelect::su0')]")
 WebElement partPopup;

 @FindBy(xpath = "(//label[text()='Quantity:'])[1]")
 WebElement Quantity1;

 @FindBy(xpath = "//label[text()='Quantity:']/parent::td/following-sibling::td/child::table")
 WebElement QuantityTextArea;

 @FindBy(xpath = "//a[contains(.,'Add Part')]")
 WebElement AddPart;

 @FindBy(xpath = "//label[text()='Part Description:']")
 WebElement PartDescription;

 @FindBy(xpath = "//label[text()='Part Description:']/following::td[1]")
 WebElement PartDescribtionValue;

 @FindBy(xpath = "//label[text()='On Hand  (EA):']/following::td[1]")
 WebElement OnHandvalue;

 @FindBy(xpath = "//label[text()='On Hand  (EA):']")
 WebElement OnHandEA;

 //@FindBy(xpath = "//span[text()='Adjust Inventory']")
 @FindBy(xpath = "(//a[contains(.,'Cancel')]/span)[2]")
 WebElement cancelButoon;

 @FindBy(xpath = "(//a[contains(text(),'Stock Availability')])[1]")
 WebElement StockAvailablity;

 @FindBy(xpath = "//span[text()='MOBILE4 (BROKER)']")
 WebElement MOBILEBROKER;
 @FindBy(xpath = "//a[contains(.,'Sign Out')]")
 public WebElement label_Signout;
 @FindBy(xpath = "//input[contains(@id,'username::content')]")
 public WebElement label_UserNameTextArea;

 @FindBy(xpath = "//a[text()='Parts']")
 WebElement Parts;
 @FindBy(xpath = "//td[text()='Part Master']")
 WebElement PartMaster;

 @FindBy(xpath = "//td[text()='Inventory Adjustment']")
 WebElement InventoryAdjustment;

 @FindBy(xpath = "//h1[contains(.,'Working...Please Wait')]")
 List<WebElement> loder;


    public UnableToRemoveCoreLink_CONVOY(WebDriver driver){
         this.driver = driver;
         this.waitMethods = new WaitMethods(driver);
    }


 /**
  * Click on Parts
  * click on Part Master
  */
 public void gotoPartMaster() throws FileNotFoundException, InterruptedException {

  waitMethods.waitForElementToBeRefreshedAndClickable(Parts);
  WebElementActions.getActions(driver).clickElement(Parts);

  waitMethods.waitForElementToBeRefreshedAndClickable(PartMaster);
  WebElementActions.getActions(driver).clickElement(PartMaster);

  TestListener.saveScreenshotPNG(driver);
 }

 /**
  * verify Part List
  */
 public void verifyPartList() throws InterruptedException {
  waitMethods.waitForElementToBeRefreshedAndIsVisible(PartList);
  Assert.assertTrue(PartList.isDisplayed());
  Assert.assertTrue(PartHash1.isDisplayed());
  Assert.assertTrue(Description.isDisplayed());
  Assert.assertTrue(PreferredVendor.isDisplayed());
  Assert.assertTrue(Manudactuer.isDisplayed());
  Assert.assertTrue(VMRSSYS.isDisplayed());
  Assert.assertTrue(vendorCatalog.isDisplayed());
  Assert.assertTrue(ProductGroup.isDisplayed());

 }

 /**
  * go to part Master
  */
 public void clickonPartNumber() throws InterruptedException {
  waitMethods.waitForElementToBeRefreshedAndClickable(PartNumber);
  WebElementActions.getActions(driver).clickElement(PartNumber);
  waitMethods.loadingWait(loder);

 }

 /**
  * click on more info
  */
 public void clickmoreinfo() throws InterruptedException {

  waitMethods.waitForElementToBeRefreshedAndClickable(moreInfo);
  WebElementActions.getActions(driver).clickElement(moreInfo);
 }

 /**
  * verify Title
  */
 public void verifytitle() throws InterruptedException {
  waitMethods.waitForElementToBeRefreshedAndIsVisible(label_Title);
  Assert.assertTrue(label_Title.isDisplayed());

  waitMethods.waitForElementToBeRefreshedAndIsVisible(DefaultPreferredVendor);
  Assert.assertTrue(DefaultPreferredVendor.isDisplayed());

 }

 /***verify DefaultPreferredValue*/
 public void verfyDefaultpreferredValue() throws InterruptedException {

  waitMethods.waitForElementToBeRefreshedAndClickable(DefaultPreferredVendorValue);
  WebElementActions.getActions(driver).clickElement(DefaultPreferredVendorValue);

  waitMethods.waitForElementToBeRefreshedAndClickable(NewVendor);
  WebElementActions.getActions(driver).clickElement(NewVendor);

  waitMethods.waitForElementToBeRefreshedAndIsVisible(RequiredCore);
  Assert.assertTrue(RequiredCore.isDisplayed());

  waitMethods.waitForElementToBeRefreshedAndIsVisible(Code);
  Assert.assertTrue(Code.isDisplayed());

 }

 String partNumber = WebElementActions.getActions(driver).randomAlphaNumeric(10);

 /**
  * Enter part
  */
 public void enterPartNumber() throws InterruptedException {

  waitMethods.waitForElementToBeRefreshedAndClickable(CodeTextArea);
  WebElementActions.getActions(driver).inputText(CodeTextArea,appProp81.getProperty("vendarname"));
   System.out.println(CodeTextArea.getText());

  TestListener.saveScreenshotPNG(driver);
 }

 /*verify Name ,Required,TestArea */
 public void verifyName() throws InterruptedException {
  waitMethods.waitForElementToBeRefreshedAndIsVisible(RequiredName);
  Assert.assertTrue(RequiredName.isDisplayed());

  waitMethods.waitForElementToBeRefreshedAndIsVisible(Name);
  Assert.assertTrue(Name.isDisplayed());
 }

 String var = WebElementActions.getActions(driver).randomAlphaNumeric(10);

 public void typenameTextArea() throws InterruptedException {

  waitMethods.waitForElementToBeRefreshedAndClickable(NameTextarea);
  WebElementActions.getActions(driver).inputText(NameTextarea, var);

 }

 /**
  * verify  RequiredPaymentTerm,Payment term,
  */
 public void verifyRequiredPaymentTerm() throws InterruptedException {
  waitMethods.waitForElementToBeRefreshedAndIsVisible(RequiredPaymentTerm);
  Assert.assertTrue(RequiredPaymentTerm.isDisplayed());

  waitMethods.waitForElementToBeRefreshedAndIsVisible(PaymentTerm);
  Assert.assertTrue(PaymentTerm.isDisplayed());

  Select objSelect = new Select(paymentTermTextarea);
  objSelect.selectByVisibleText("DUENOW");

 }

 /**
  * verify Currancy
  */
 public void verifyCurrancy() throws InterruptedException {
  waitMethods.waitForElementToBeRefreshedAndIsVisible(RequiredCurrency);
  Assert.assertTrue(RequiredCurrency.isDisplayed());

  waitMethods.waitForElementToBeRefreshedAndIsVisible(Currency);
  Assert.assertTrue(Currency.isDisplayed());

  Select objSelect = new Select(Currencydropdown);
  objSelect.selectByVisibleText("CAD");

 }

 /**
  * verify country
  **/
 public void verifyCountry() throws InterruptedException {
  waitMethods.waitForElementToBeRefreshedAndIsVisible(RequiredCountry);
  Assert.assertTrue(RequiredCountry.isDisplayed());

  waitMethods.waitForElementToBeRefreshedAndIsVisible(Country);
  Assert.assertTrue(Country.isDisplayed());

  Select objSelect = new Select(countryTextArea);
  objSelect.selectByVisibleText("Canada");
  waitMethods.loadingWait(loder);

 }

 /**
  * click on ok
  */
 public void clicknOk() throws InterruptedException {

  waitMethods.waitForElementToBeRefreshedAndIsVisible(Cancel);
  Assert.assertTrue(Cancel.isDisplayed());

  waitMethods.waitForElementToBeRefreshedAndClickable(OkButton);
  WebElementActions.getActions(driver).clickElement(OkButton);

  waitMethods.loadingWait(loder);


 }

 /*verify product Group **/
 public void RequiredproductGroup() throws InterruptedException {

  waitMethods.waitForElementToBeRefreshedAndIsVisible(label_RequiredProductGroup);
  Assert.assertTrue(label_RequiredProductGroup.isDisplayed());

  waitMethods.waitForElementToBeRefreshedAndIsVisible(label_ProductGroup);
  Assert.assertTrue(label_ProductGroup.isDisplayed());

  waitMethods.loadingWait(loder);

 }

 /**verify corepart*/
 public void verifyCorePart() throws InterruptedException {

  waitMethods.waitForElementToBeRefreshedAndIsVisible(CorePart);
  Assert.assertTrue(CorePart.isDisplayed());
  waitMethods.loadingWait(loder);

 }
 /**select reandom Number*/


   /** click on corePart*/
   public void clickOnCorePart () throws InterruptedException {

    waitMethods.waitForElementToBeRefreshedAndClickable(label_CorePart);
     WebElementActions.getActions(driver).clickElement(label_CorePart);

    waitMethods.waitForElementToBeRefreshedAndClickable(DelinkCore);
     WebElementActions.getActions(driver).clickElement(DelinkCore);

    waitMethods.waitForElementToBeRefreshedAndClickable(Yes);
     WebElementActions.getActions(driver).clickElement(Yes);
    waitMethods.loadingWait(loder);

     //String Alert = new String("Warehouse SHOP has an On hand of");

     //  WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(AlertClose);
     // WebElementActions.getActions().clickElement(AlertClose);
     //  WaitActions.getWaits().loadingWait(loder);

     }

     /**click on corePart*/
     public void clickOnCorePartTwo () throws InterruptedException {
      waitMethods.waitForElementToBeRefreshedAndClickable(label_CorePart);
      WebElementActions.getActions(driver).clickElement(label_CorePart);

      waitMethods.waitForElementToBeRefreshedAndIsVisible(DelinkCore);
      Assert.assertTrue(DelinkCore.isDisplayed());

      waitMethods.loadingWait(loder);
     }



   /**click on Cacel Button*/
   public void clickOnCancelButton () throws InterruptedException {

    waitMethods.waitForElementToBeRefreshedAndClickable(CancelButton);
    WebElementActions.getActions(driver).clickElement(CancelButton);

    waitMethods.waitForElementToBeRefreshedAndClickable(Cancel2);
    WebElementActions.getActions(driver).clickElement(Cancel2);
    waitMethods.loadingWait(loder);

    waitMethods.waitForElementToBeRefreshedAndClickable(SaveExit);
    WebElementActions.getActions(driver).clickElement(SaveExit);

    waitMethods.loadingWait(loder);

   }
 /**
  * Click on Parts
  * click on Inventory Adjustment
  */
 public  void  gotoInventoryAdjustment() throws FileNotFoundException, InterruptedException {
  waitMethods.loadingWait(loder);
  Thread.sleep(3000);
//  ReusableActions.getActions().clickParentMenu("Parts");
//  ReusableActions.getActions().clickChildMenu("Inventory Adjustment");

  waitMethods.waitForElementToBeRefreshedAndClickable(Parts);
  WebElementActions.getActions(driver).clickElement(Parts);

  waitMethods.waitForElementToBeRefreshedAndClickable(InventoryAdjustment);
  WebElementActions.getActions(driver).clickElement(InventoryAdjustment);

  TestListener.saveScreenshotPNG(driver);
  waitMethods.loadingWait(loder);

 }
 /**click on New Adjustment */
 public void clickonNewAdjustment () throws InterruptedException {
  waitMethods.waitForElementToBeRefreshedAndIsVisible(AddNewAdjustment);
  WebElementActions.getActions(driver).clickElement(AddNewAdjustment);
  waitMethods.loadingWait(loder);

 }
 /*verify SelectWarehouse **/
 public void verifySelectWarehouse  () throws InterruptedException {
  waitMethods.waitForElementToBeRefreshedAndIsVisible(SelectWarehouse);
  Assert.assertTrue(SelectWarehouse.isDisplayed());

  waitMethods.waitForElementToBeRefreshedAndIsVisible(RequiredWarehouse);
  Assert.assertTrue(RequiredWarehouse.isDisplayed());

  waitMethods.waitForElementToBeRefreshedAndIsVisible(Warehouse);
  Assert.assertTrue(Warehouse.isDisplayed());

 }
 /**select warehouseTextArea*/
 public void selectWareHouse () {
  Select objSelect=new Select(WarehouseTextArea);
  objSelect.selectByVisibleText("MOBILE4 (BROKER)");

 }
 /**click on OK Button */
 public void clickOnOkButton () throws InterruptedException {
  waitMethods.waitForElementToBeRefreshedAndClickable(okButton);
  WebElementActions.getActions(driver).clickElement(okButton);
  waitMethods.loadingWait(loder);

 }
 /**verify warehouseName*/
 public void verifyWarehouseName () throws InterruptedException {
  waitMethods.waitForElementToBeRefreshedAndIsVisible(WarehouseValue);
  Assert.assertTrue(WarehouseValue.isDisplayed());

  waitMethods.waitForElementToBeRefreshedAndIsVisible(AdjustmentType);
  Assert.assertTrue(AdjustmentType.isDisplayed());

 }
 /**select Adjustment value */
 public void selectAdjustmentvalue () {
  Select objSelect =new Select(AdjustmentValue);
  objSelect.selectByVisibleText("PART_MERGE");


 }

 /**enter the part value */
 public void partValue () throws InterruptedException {
  waitMethods.waitForElementToBeRefreshedAndIsVisible(PartTextArea);
  WebElementActions.getActions(driver).inputText(PartTextArea,appProp81.getProperty("vendarname"));




 }
 /**clickonPartValuePopup*/
 public void clickonPartValuePopup () throws InterruptedException {
  waitMethods.waitForElementToBeRefreshedAndClickable(partPopup);
  WebElementActions.getActions(driver).clickElement(partPopup);

 }
 /**verify Quantity */
 public void verifyQauantity () throws InterruptedException {
  waitMethods.waitForElementToBeRefreshedAndIsVisible(Quantity1);
  Assert.assertTrue(Quantity1.isDisplayed());

  waitMethods.waitForElementToBeRefreshedAndIsVisible(QuantityTextArea);
  Assert.assertTrue(QuantityTextArea.isDisplayed());

 }

 /*verify part description ,On Hand**/
 public  void verifypartdescription () throws InterruptedException {
  waitMethods.waitForElementToBeRefreshedAndIsVisible(PartDescription);
  Assert.assertTrue(PartDescription.isDisplayed());

  waitMethods.waitForElementToBeRefreshedAndIsVisible(PartDescribtionValue);
  Assert.assertTrue(PartDescribtionValue.isDisplayed());

  waitMethods.waitForElementToBeRefreshedAndIsVisible(OnHandvalue);
  Assert.assertTrue(OnHandvalue.isDisplayed());


 }
 /**click on Add */
 public void verifyonAddButton () throws InterruptedException {
  waitMethods.waitForElementToBeRefreshedAndIsVisible(AddPart);
  Assert.assertTrue(AddPart.isDisplayed());

 }
 /**click on  Adjest inventory */
 public void clickonCancel () throws InterruptedException {
  waitMethods.waitForElementToBeRefreshedAndClickable(cancelButoon);
  WebElementActions.getActions(driver).clickElement(cancelButoon);

 }
 /**
  * Click on Parts
  * click on Part Master
  */
 public  void gotoPartMasterTwo() throws FileNotFoundException, InterruptedException {
  waitMethods.loadingWait(loder);
  Thread.sleep(3000);
//  ReusableActions.getActions().clickParentMenu("Parts");
//  ReusableActions.getActions().clickChildMenu("Part Master");

  waitMethods.waitForElementToBeRefreshedAndClickable(Parts);
  WebElementActions.getActions(driver).clickElement(Parts);

  waitMethods.waitForElementToBeRefreshedAndClickable(PartMaster);
  WebElementActions.getActions(driver).clickElement(PartMaster);

  TestListener.saveScreenshotPNG(driver);
  waitMethods.loadingWait(loder);
 }

 /**click on stock availablity */
 public void clickonStockAvailablity () throws InterruptedException {

  waitMethods.waitForElementToBeRefreshedAndClickable(StockAvailablity);
  WebElementActions.getActions(driver).clickElement(StockAvailablity);

  waitMethods.waitForElementToBeRefreshedAndIsVisible(MOBILEBROKER);
  Assert.assertTrue(MOBILEBROKER.isDisplayed());

 }

 /**click On Sign Out */
 public void clickOnSignOut () throws InterruptedException {

  waitMethods.waitForElementToBeRefreshedAndClickable(label_Signout);
  WebElementActions.getActions(driver).clickElement(label_Signout);
  TestListener.saveScreenshotPNG(driver);
 }
 /**click On UserName TextArea*/
 public void clickOnUserNameTextArea () throws InterruptedException {

  waitMethods.waitForElementToBeRefreshedAndClickable(label_UserNameTextArea);
  WebElementActions.getActions(driver).clickElement(label_UserNameTextArea);
  TestListener.saveScreenshotPNG(driver);
 }


}
