 package pages.tech;

import actions.LoginActions;
import actions.WaitActions;
import actions.WebElementActions;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import tests.TestDriverActions;
import utils.TestListener;
import utils.WaitMethods;

import java.util.List;
import java.util.Random;

public class EC_Tech_WoParts extends TestDriverActions {
   Random randomGenerator = new Random();

   @FindBy(xpath = "//span[text()='Scan Employee Badge']/following::input[1]")
   public WebElement TechBadge;

   @FindBy(xpath = "//span[text()='Go']")
   public WebElement go_btn;

   @FindBy(xpath = "//label[text()='Unit #:']/following::a[1]")
   public WebElement unit_Number;

   @FindBy(xpath = "(//a[text()='Parts'])[1]")
   public WebElement parts_tab;

   @FindBy(xpath = "//label[text()='Part #:']/preceding::label[1]")
   public WebElement label_Labour;

   @FindBy(xpath = "//label[text()='Part #:']")
   public WebElement label_part_hash;

   @FindBy(xpath = "//label[contains(text(),'Part #:')]/following::input[1]")
   public WebElement txt_part;

   @FindBy(xpath = "//label[text()='Part #:']/following::a[1]/img")
   public WebElement search_icon;

   @FindBy(xpath = "//label[text()='Quantity  (EA):']")
   public WebElement label_Quantity;

   @FindBy(xpath = "//label[text()='Quantity  (EA):']/following::input[1]")
   public WebElement txt_quantity;

   @FindBy(xpath = "//span[text()='Non-Catalog Part']/following::th")
   public WebElement column_SR;

   @FindBy(xpath = "//span[text()='#']")
   public WebElement hash;

   @FindBy(xpath = "//span[text()='Part Number']")
   public WebElement label_part_Number;

   @FindBy(xpath = "//span[text()='Core']")
   public WebElement label_core;

   @FindBy(xpath = "//span[text()='Actual Quantity']")
   public WebElement label_ActualQuantity;

   @FindBy(xpath = "//span[text()='Charge Quantity']")
   WebElement label_ChargeQuantity;

   @FindBy(xpath = "//span[text()='Total Charge']")
   WebElement label_TotalCharge;

   @FindBy(xpath = "//span[text()='Total Charge']/following::span[1]")
   WebElement column_attachIcon;

   @FindBy(xpath = "//span[text()='Total Charge']/following::span[2]")
   WebElement column_crossIcon;

   @FindBy(xpath = "//div[text()='No data to display']")
   WebElement label_NodataDisplay;

   @FindBy(xpath = "//li[contains(@class,'AFAutoSuggestItem')]")
   WebElement number_15_762;

   @FindBy(xpath = "//label[text()='Warehouse:']")
   WebElement label_warehouse;

   @FindBy(xpath = "//label[text()='Warehouse:']/following::a[1]")
   WebElement txt_warehouse;

   @FindBy(xpath = "//label[text()='Warehouse:']/following::label[1]")
   WebElement label_partDescription;

   @FindBy(xpath = "//label[text()='Part Description:']/following::div[1]")
   WebElement txt_partDescription;

   @FindBy(xpath = "//label[text()='On Hand  (EA):']")
   WebElement label_OnHandEA;

   @FindBy(xpath = "//label[text()='On Hand  (EA):']/following::td[1]")
   WebElement txt_OnHandEA;

   @FindBy(xpath = "//span[text()='Store Room']")
   WebElement label_StoreRoom;

   @FindBy(xpath = "//span[text()='Row Number']")
   WebElement label_RowNumber;

   @FindBy(xpath = "//span[text()='Shelf']")
   WebElement label_Shelf;

   @FindBy(xpath = "//span[text()='Bin Number']")
   WebElement label_BinNumber;


   @FindBy(xpath = "//div[contains(@id,'cbIssuePar')]/a/span")
   WebElement btn_IssuePart;


   @FindBy(xpath = "//span[text()='Total Charge']/following::td[3]")
   WebElement label_partDescription1;

   @FindBy(xpath = "//span[text()='Total Charge']/following::span[6]")
   WebElement label_EA1;

   @FindBy(xpath = "//span[text()='Total Charge']/following::span[7]/a")
   WebElement EA1;

   @FindBy(xpath = "//a[contains(@id,'cRTWAP1')]//img")
   WebElement crossIcon;

   @FindBy(xpath = "//a[contains(@id,'cilWAP')]/img")
   WebElement DeleteIcon;


   @FindBy(xpath = "(//span[text()='Cancel'])[2]")
   WebElement btn_cancle;

   @FindBy(xpath = "//div[contains(@id,'cbIssuePart')]//a//span")
   WebElement btn_coreReturn;

   @FindBy(xpath = "//span[text()='Non-Catalog Part']")
   WebElement btn_NonCatalogPart;

   @FindBy(xpath = "//div[text()='Create and issue Non-Catalog Part']")
   WebElement createIssueNonCatalogPart;

   @FindBy(xpath = "(//label[text()='Part#:'])[1]")
   WebElement label_part1;

   @FindBy(xpath = "(//label[text()='Part#:'])[1]/following::input[1]")
   WebElement txtfield_part;

   @FindBy(xpath = "//label[text()='Description:']/preceding::input[1]")
   public WebElement NCP_Part;

   @FindBy(xpath = "//td[contains(@id,'pwIssuePartNonCatalog::tb')]/following::label[3]")
   WebElement label_description1;
   @FindBy(xpath = "//td[contains(@id,'pwIssuePartNonCatalog::tb')]/following::input[2]")
   WebElement txtfield_description;

   @FindBy(xpath = "(//label[text()='Quantity:'])[1]")
   WebElement label_Quantity1;

   @FindBy(xpath = "(//label[text()='Quantity:'])[1]/following::input[1]")
   WebElement txtfield_Quantity;

   @FindBy(xpath = "(//label[text()='Quantity:'])[1]/following::span[3]")
   WebElement asterisk_unit;

   @FindBy(xpath = "//label[text()='Unit Cost:']")
   WebElement label_UnitCost;

   @FindBy(xpath = "//label[text()='Unit Cost:']/following::input[1]")
   WebElement txtfield_UnitCost;

   @FindBy(xpath = "//div[contains(@id,'cbCancel')]")
   WebElement cancle;

   @FindBy(xpath = "(//span[text()='Issue Part'])[2]")
   WebElement IssuePart;

   @FindBy(xpath = "//span[text()='Total Charge']/following::a[2]")
   WebElement ncpPartName;

   @FindBy(xpath = "//span[text()='Total Charge']/following::a[3]")
   WebElement NCPartDescription;

   @FindBy(xpath = "//span[text()='Total Charge']/following::span[6]")
   WebElement EA1_label;

   @FindBy(xpath = "//span[text()='Total Charge']/following::a[4]")
   WebElement EA1_2;

   @FindBy(xpath = "(//a[contains(.,'Lab')])[1]")
   WebElement btn_Labour;

   @FindBy(xpath = "//span[text()='Start']/following::a[2]")
   WebElement VMRSName_Img;

   @FindBy(xpath = "//label[text()='Complaint:']/following::textarea[1]")
   WebElement complaint_textarea;

   @FindBy(xpath = "//label[text()='Cause/Reason:']/following::textarea[1]")
   WebElement cause_textarea;

   @FindBy(xpath = "//label[text()='Correction/Task:']/following::textarea[1]")
   WebElement task_textarea;

   @FindBy(xpath = "//label[text()='Progress']/following::a[1]")
   WebElement progrss_hyperlink;

   @FindBy(xpath = "//h1[text()='Select Progress']/following::a[1]/span")
   WebElement select_btn;

   @FindBy(xpath = "//div[contains(@id,'ctbOk')]")
   WebElement btn_Ok;

   @FindBy(xpath = "(//a[text()='Summary'])[1]")
   WebElement summary_tab;

   @FindBy(xpath = "(//label[text()='PO Number:'])[1]")
   WebElement label_PoNumber;

   @FindBy(xpath = "(//label[text()='PO Number:'])[1]/following::input[1]")
   WebElement txtfield_PoNumber;

   @FindBy(xpath = "(//label[text()='Internal RO:'])[1]")
   WebElement label_InternalRO;

   @FindBy(xpath = "(//label[text()='Internal RO:'])[1]/following::input[1]")
   WebElement txtfield_RoInternal;

   @FindBy(xpath = "(//label[text()='Internal Notes:'])[1]")
   WebElement InternalNotes;

   @FindBy(xpath = "(//label[text()='Internal Notes:'])[1]/following::a[1]")
   WebElement hyperlink_InternalNotes;

   @FindBy(xpath = "(//label[text()='Notes:'])[1]")
   WebElement notes;
   @FindBy(xpath = "(//label[text()='Notes:'])[1]/following::a[1]")
   WebElement notes_hyperlink;

   @FindBy(xpath = "(//label[text()='RO Date:'])[1]")
   WebElement RoDate;

   @FindBy(xpath = "//span[text()='Reading Type']")
   WebElement ReadingType;

   @FindBy(xpath = "//h1[text()='Labour and Parts']")
   WebElement LabourParts;

   @FindBy(xpath = "//span[text()='Unit Ready']")
   WebElement UnitReady;

   @FindBy(xpath = "//span[text()='Unit Ready']/following::a[1]")
   WebElement AeroDynamicDevice;
   @FindBy(xpath = "//span[text()='Start']/following::a[2]")
   WebElement hyperlink_AeroDynamicDevice;

   @FindBy(xpath = "//span[text()='Unit Ready']/following::a[3]")
   WebElement hyperlink_AccessoriesDevice;

   @FindBy(xpath = "//span[text()='Pause']")
   WebElement btn_pause;

   @FindBy(xpath = "(//span[text()='Select'])[1]")
   WebElement btn_select;

   @FindBy(xpath = "(//span[text()='OK'])[1]")
   WebElement btn_ok;

   @FindBy(xpath = "//label[text()='Unit #:']/following::a[1]")
   WebElement hyperlink_Unit;

//   @FindBy(xpath = "//span[text()='Sign Out']")
@FindBy(xpath = "(//span[contains(@id,'si1')]/following::td)[4]")
   WebElement btn_signOut;

   @FindBy(xpath = "//input[@name='username']")
   public WebElement inputbox_Username;

   @FindBy(xpath = "//a[contains(@id,':cRTWAP1')]/img")
   WebElement crossIcon_core;

   @FindBy(xpath = "//a[contains(@id,'cilWAP')]/img")
   WebElement deleteIcon_core;

   @FindBy(xpath = "//span[text()='Undo Pause']")
   List<WebElement> undo_pause;

   @FindBy(xpath = "//span[text()='Pause']")
   WebElement pause;

   @FindBy(xpath = "//div[contains(@id,'ctbUnd')]")
   WebElement pause_unpause;


   @FindBy(xpath = "//span[text()='Current Location']/following::a[3]/span")
   WebElement select_btn_TechRO;

   @FindBy(xpath = "//span[text()='Clear Screen']")
   WebElement btn_clear;

   @FindBy(xpath = "//h1[contains(text(),'Working...Please Wait')]")
   List<WebElement> loder;

   @FindBy(xpath = "//span[text()='Start']/following::td[2]")
   WebElement firstrow_cell;

   @FindBy(xpath = "//a[contains(@id,'tWoAct:1:ciDWoAct1')]")
   List<WebElement> crossFirst_Icon;

   @FindBy(xpath = "(//label[text()='Parts#'])[1]/following::input[1]")
   WebElement input_parts;

   @FindBy(xpath = "//span[text()='Search']")
   WebElement search_btn;

   @FindBy(xpath = "(//span[text()='Cancel'])[1]")
   WebElement cancle_btn;

   @FindBy(xpath = "(//span[text()='Select'])[2]")
   WebElement select_button;

//new added element

   @FindBy(xpath = "(//label[text()='Notes:'])[3]/following::textarea")
   WebElement notes_textarea;

   @FindBy(xpath = "(//span[text()='OK'])[2]")
   WebElement OK_btn;

   @FindBy(xpath = "(//a[text()='Accessories Group'])[1]")
   WebElement VMRSName_Accessories;

   @FindBy(xpath = "(//span[text()='Aerodynamic Devices'])[2]")
   public WebElement VMRSName_AerodynamicDevices1;

   @FindBy(xpath = "//a[contains(@id,'clPopupWoact')]")
   List<WebElement> VMRSName;

//    @FindBy(xpath = "//a[text()='Aerodynamic Devices']")   //(//a[text()='Aerodynamic Devices'])[1]
//    List<WebElement> FirstWorkRequired;

   @FindBy(xpath = "(//span[text()='Aerodynamic Devices'])[2]")
   WebElement FirstWorkRequired_AeroDynamic;

   @FindBy(xpath = "//label[text()='Cause/Reason:']/following::a[1]")
   WebElement cause_reason;

   @FindBy(xpath = "//label[text()='Task:']/following::a[1]")
   WebElement task;

   @FindBy(xpath = "//div[contains(@id,'cbSelectSerrea')]/a/span")
   WebElement select_cause_Reason;

   @FindBy(xpath = "//div[contains(@id,'cbSelectWotas')]/a/span")
   public WebElement label_select_cause_Reason;

   @FindBy(xpath = "(//span[text()='Cancel'])[2]")
   WebElement cancleBtn;

   @FindBy(xpath = "//ul[@class='AFAutoSuggestItemsContainer']/li[1]")
   WebElement corePart;

   //(//span[text()='Select'])[1]
   @FindBy(xpath = "(//label[text()='Search Unit:'])[2]/preceding::input[1]")
   WebElement SearchUnit;

   @FindBy(xpath = "(//span[text()='Select'])[1]")
   WebElement select1;

   @FindBy(xpath = "//span[text()='Defer Work']")
   WebElement Defer_btn;

   @FindBy(xpath = "//label[text()='Please enter your reason:']/following::textarea")
   WebElement defer_input;

   @FindBy(xpath = "(//span[text()='Cancel'])[1]")
   WebElement Cancle_btn;

   @FindBy(xpath = "//span[text()='More Units']")
   WebElement btn_MoreUnits;


   @FindBy(xpath = "//div[contains(@id,'ctbAssignedWork')]")
   List<WebElement> btn_assignedWork;

   @FindBy(xpath = "//a[contains(@id,'ciWorkRequired')]/img")
   WebElement img_workRequired;

   @FindBy(xpath = "//a[contains(@id,'ciSRT')]/img")
   WebElement img_StandardRepairOrder;

   @FindBy(xpath = "//td[text()='Total Hours:']")
   List<WebElement> totalHours;

   @FindBy(xpath = "//a[contains(@id,'ciKey')]/img")
   WebElement icon_Keyboard;

   @FindBy(xpath = "//div[contains(@id,'tWa:0:pgl5')]/div")
   WebElement FirstLabor;

   @FindBy(xpath = "//div[contains(@id,'tWa:1:pgl5')]/div")
   WebElement SecondLabor;

   @FindBy(xpath = "//div[contains(@id,'pgl30')]/div[2]")
   WebElement Active_laborname;

   @FindBy(xpath = "//h2[contains(text(),'Top Used Services')]")
   WebElement subtitle_TopUsedServices;

   @FindBy(xpath = "//a[contains(@id,'cilvmrsys')]/img")
   WebElement img_Accessories;

   @FindBy(xpath = "//a[contains(@id,'j_id2087508152_1d3400e3_1')]/img")
   WebElement img_Aerodynamic;
   @FindBy(xpath = "//a[contains(@id,'ciAddVmrs')]/img")
   WebElement plus_sign;

   @FindBy(xpath = "//a[contains(@id,'clPopupWoaS')]")
   List<WebElement> laborAndParts;

  @FindBy(xpath = "//h1[text()='Work Required']/following::a[contains(@id,'ciWorkRequired')]")
  List<WebElement> LabourRequired;

   @FindBy(xpath = "//span[text()='More Work ...']")
   WebElement btn_moreWork;

   @FindBy(xpath = "(//a[contains(@id,'sdiVmrs::disAcr')])[1]")
   WebElement tab_VMRS;

   @FindBy(xpath = "//input[contains(@id,'searchVmrs:dc_it1::content')]")
   WebElement search_txt;

   @FindBy(xpath = "//a[contains(@id,'cilvmrsys')]/img")
   WebElement FirstLabour_img;

   @FindBy(xpath = "//a[contains(@id,'ciAddVmrs')]/img")
   WebElement plusIcon;

   @FindBy(xpath = "//div[contains(@id,'ctbOk')]")
   WebElement btnAdd;

   @FindBy(xpath = "//div[contains(@id,'tsvd::db')]")
   List<WebElement> noDataToDisplay;

     public EC_Tech_WoParts(WebDriver driver){
         this.driver = driver;
         this.waitMethods = new WaitMethods(driver);
     }


   /**
    * Enter TechBadge in the textfield
    */
      public void enterTechBadge() throws InterruptedException {

          if(LoginActions.environmentName.contains("EU")){
              waitMethods.waitForElementToBeRefreshedAndClickable(TechBadge);
              WebElementActions.getActions(driver).inputText(TechBadge, appProp29.getProperty("TechBadge"));
          } else if(LoginActions.environmentName.contains("NA")){
              waitMethods.waitForElementToBeRefreshedAndClickable(TechBadge);
              WebElementActions.getActions(driver).inputText(TechBadge, appProp45.getProperty("TechBadge"));
          } else if(LoginActions.environmentName.contains("QA")){
              waitMethods.waitForElementToBeRefreshedAndClickable(TechBadge);
              WebElementActions.getActions(driver).inputText(TechBadge, appProp.getProperty("TechBadge"));
          }

          TestListener.saveScreenshotPNG(driver);

    }

    /**
     * click on Go button
     */
      public void clickOnGoBtn() throws InterruptedException {

          waitMethods.waitForElementToBeRefreshedAndClickable(go_btn);
        WebElementActions.getActions(driver).clickElement(go_btn);

          waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }

    /**
     * Extra Step
     * click on Select Tab
     */
      public void clickOnSelectTab() throws InterruptedException {

          waitMethods.waitForElementToBeRefreshedAndClickable(select_btn_TechRO);
        WebElementActions.getActions(driver).clickElement(select_btn_TechRO);

          waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }

    /**
     * Extra Step
     * click on select button
     *
     * @throws InterruptedException
     */
      public void clickMoreUnit() throws InterruptedException {
        Thread.sleep(10000);
        if (btn_assignedWork.size() > 0) {
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

    /**
     * Extra Step
     * Enter Unit Number(118888)  //span[text()='More Units']
     */
      public void enterUnitNumber() throws InterruptedException {

          if(LoginActions.environmentName.contains("EU")){
              waitMethods.waitForElementToBeRefreshedAndClickable(SearchUnit);
              WebElementActions.getActions(driver).inputText(SearchUnit, appProp29.getProperty("UnitNumber"));
          } else if(LoginActions.environmentName.contains("NA")){
              waitMethods.waitForElementToBeRefreshedAndClickable(SearchUnit);
              WebElementActions.getActions(driver).inputText(SearchUnit, appProp45.getProperty("UnitNumber"));
          } else if(LoginActions.environmentName.contains("QA")){
              waitMethods.waitForElementToBeRefreshedAndClickable(SearchUnit);
              WebElementActions.getActions(driver).inputText(SearchUnit, appProp.getProperty("UnitNumber"));
          }


          waitMethods.loadingWait(loder);

    }

    /**
     * click on select button
     *
     * @throws InterruptedException
     */
      public void clickSelect() throws InterruptedException {

          waitMethods.waitForElementToBeRefreshedAndClickable(select1);
        WebElementActions.getActions(driver).clickElement(select1);
          waitMethods.loadingWait(loder);

          Thread.sleep(10000);
          if(noDataToDisplay.size()>0){

              waitMethods.waitForElementToBeRefreshedAndClickable(btn_moreWork);
              WebElementActions.getActions(driver).clickElement(btn_moreWork);

              waitMethods.waitForElementToBeRefreshedAndClickable(tab_VMRS);
              WebElementActions.getActions(driver).clickElement(tab_VMRS);

              waitMethods.waitForElementToBeRefreshedAndClickable(FirstLabour_img);
              WebElementActions.getActions(driver).clickElement(FirstLabour_img);

              waitMethods.waitForElementToBeRefreshedAndClickable(plusIcon);
              WebElementActions.getActions(driver).clickElement(plusIcon);

              waitMethods.waitForElementToBeRefreshedAndClickable(btnAdd);
              WebElementActions.getActions(driver).clickElement(btnAdd);

          }
          Thread.sleep(10000);

          if (totalHours.size() > 0) {

              if (LoginActions.environmentName.contains("EU") || (LoginActions.environmentName.contains("NA"))) {

                  waitMethods.waitForElementToBeRefreshedAndClickable(img_workRequired);
                  WebElementActions.getActions(driver).clickElement(img_workRequired);
              }
          }
    }

    public void clickOnUnitNumber() throws InterruptedException {
        Thread.sleep(2000);
        waitMethods.waitForElementToBeRefreshedAndClickable(hyperlink_Unit);
        WebElementActions.getActions(driver).clickElement(hyperlink_Unit);

        waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }

    /**
     * verify unit number
     */
      public void verifyUnitNumber() throws InterruptedException {

          waitMethods.waitForElementToBeRefreshedAndClickable(unit_Number);
        Assert.assertTrue(unit_Number.isDisplayed());
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * Extra Step
     */
      public void addWorkRequired() throws InterruptedException {
        Thread.sleep(15000);
        if(noDataToDisplay.size()>0){

            waitMethods.waitForElementToBeRefreshedAndClickable(btn_moreWork);
            WebElementActions.getActions(driver).clickElement(btn_moreWork);

            waitMethods.waitForElementToBeRefreshedAndClickable(tab_VMRS);
            WebElementActions.getActions(driver).clickElement(tab_VMRS);

            waitMethods.waitForElementToBeRefreshedAndClickable(search_txt);
            WebElementActions.getActions(driver).inputText(search_txt,appProp.getProperty("FirstLaborItem"));

            waitMethods.waitForElementToBeRefreshedAndClickable(FirstLabour_img);
            WebElementActions.getActions(driver).clickElement(FirstLabour_img);

            waitMethods.waitForElementToBeRefreshedAndClickable(plusIcon);
            WebElementActions.getActions(driver).clickElement(plusIcon);

            waitMethods.waitForElementToBeRefreshedAndClickable(btnAdd);
            WebElementActions.getActions(driver).clickElement(btnAdd);

        }
    }

    /**
     * Extra Step
     */
      public void clickWorkRequired() throws InterruptedException {
        Thread.sleep(10000);

        if (totalHours.size() > 0) {

            if (LoginActions.environmentName.contains("EU") || (LoginActions.environmentName.contains("NA")) )
            {

                waitMethods.waitForElementToBeRefreshedAndClickable(img_workRequired);
                WebElementActions.getActions(driver).clickElement(img_workRequired);
            }

        }
    }

    /**
     * click on Parts Tab
     */
      public void clickOnPartsTab() throws InterruptedException {

              waitMethods.waitForElementToBeRefreshedAndClickable(parts_tab);
        WebElementActions.getActions(driver).clickElement(parts_tab);

              waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }

    /**
     * click on icon Keyboard
     */
      public void clickOnKeyboardImg() throws InterruptedException {
        if (LoginActions.environmentName.contains("EU")) {
            waitMethods.waitForElementToBeRefreshedAndClickable(icon_Keyboard);
            WebElementActions.getActions(driver).clickElement(icon_Keyboard);

            waitMethods.loadingWait(loder);
            TestListener.saveScreenshotPNG(driver);
        }
    }

    /**
     * verify parts tab Element (Check the Generic setup of the screen)
     */
      public void verifyElementOfPart() throws InterruptedException {

          waitMethods.waitForElementToBeRefreshedAndIsVisible(label_Labour);
        Assert.assertTrue(label_Labour.isDisplayed());
        waitMethods.waitForElementToBeRefreshedAndIsVisible(label_part_hash);
        Assert.assertTrue(label_part_hash.isDisplayed());
        Assert.assertTrue(txt_part.isDisplayed());
        waitMethods.waitForElementToBeRefreshedAndIsVisible(search_icon);
        Assert.assertTrue(search_icon.isDisplayed());
        Assert.assertTrue(label_Quantity.isDisplayed());
        Assert.assertTrue(txt_quantity.isDisplayed());
        waitMethods.loadingWait(loder);

        TestListener.saveScreenshotPNG(driver);

    }

    /**
     * verify firstlabor and secondlabor
     */
      public void verifyLabourPresent() throws InterruptedException {
        if (LoginActions.environmentName.contains("EU")) {
            waitMethods.waitForElementToBeRefreshedAndIsVisible(FirstLabor);
            Assert.assertTrue(FirstLabor.isDisplayed());
            Assert.assertTrue(SecondLabor.isDisplayed());
            Assert.assertTrue(Active_laborname.isDisplayed());
            Assert.assertTrue(FirstLabor.isDisplayed());
        }
    }

    /**
     * Check out the parts list area
     */
      public void verifyPartListArea() throws InterruptedException {

          waitMethods.waitForElementToBeRefreshedAndIsVisible(hash);
        Assert.assertTrue(hash.isDisplayed());
        Assert.assertTrue(label_part_Number.isDisplayed());
        Assert.assertTrue(label_core.isDisplayed());
        Assert.assertTrue(label_ActualQuantity.isDisplayed());
        Assert.assertTrue(label_ChargeQuantity.isDisplayed());
        Assert.assertTrue(label_TotalCharge.isDisplayed());
// Assert.assertTrue(column_attachIcon.isDisplayed());
// Assert.assertTrue(column_crossIcon.isDisplayed());
// Assert.assertTrue(label_NodataDisplay.isDisplayed());
              waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }

    /**
     * Enter Part             -23078
     */
      public void enterPart() throws InterruptedException {

        if (LoginActions.environmentName.contains("QA")) {
            waitMethods.waitForElementToBeRefreshedAndClickable(txt_part);
            WebElementActions.getActions(driver).inputText(txt_part, appProp.getProperty("PartName"));
            Thread.sleep(3000);
            waitMethods.waitForElementToBeRefreshedAndClickable(number_15_762);
            WebElementActions.getActions(driver).clickElement(number_15_762);
            Thread.sleep(7000);
            waitMethods.waitForElementToBeRefreshedAndClickable(txt_part);
            WebElementActions.getActions(driver).inputText(txt_part, appProp.getProperty("PartName"));
            Thread.sleep(4000);
            WebElementActions.getActions(driver).inputText(txt_part, appProp.getProperty("PartName"));

            waitMethods.waitForElementToBeRefreshedAndClickable(number_15_762);
            WebElementActions.getActions(driver).clickElement(number_15_762);

        } else if (LoginActions.environmentName.contains("NA")) {
            waitMethods.waitForElementToBeRefreshedAndClickable(txt_part);
            WebElementActions.getActions(driver).inputText(txt_part, appProp45.getProperty("PartName"));
            waitMethods.waitForElementToBeRefreshedAndClickable(number_15_762);
            Thread.sleep(2000);
            WebElementActions.getActions(driver).clickElement(number_15_762);
        } else if(LoginActions.environmentName.contains("EU")){
            waitMethods.waitForElementToBeRefreshedAndClickable(txt_part);
            WebElementActions.getActions(driver).inputText(txt_part, appProp29.getProperty("PartName"));
            Thread.sleep(2000);
            waitMethods.waitForElementToBeRefreshedAndClickable(number_15_762);

            WebElementActions.getActions(driver).clickElement(number_15_762);
        }
              waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);


    }

    /**
     * Verify Part Details Pannel
     */
      public void verifyPartDetailsPannel() throws InterruptedException {

          waitMethods.waitForElementToBeRefreshedAndIsVisible(label_warehouse);
        Assert.assertTrue(label_warehouse.isDisplayed());
        Assert.assertTrue(txt_warehouse.isDisplayed());
        waitMethods.waitForElementToBeRefreshedAndIsVisible(label_partDescription);
        Assert.assertTrue(label_partDescription.isDisplayed());
        Assert.assertTrue(txt_partDescription.isDisplayed());
        Assert.assertTrue(label_OnHandEA.isDisplayed());
        Assert.assertTrue(txt_OnHandEA.isDisplayed());
        Assert.assertTrue(label_StoreRoom.isDisplayed());
        Assert.assertTrue(label_RowNumber.isDisplayed());
        Assert.assertTrue(label_Shelf.isDisplayed());
        Assert.assertTrue(label_BinNumber.isDisplayed());

              waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }

    /**
     * click on Issue Part
     */
      public void clickOnIssuePart() throws InterruptedException {

          waitMethods.waitForElementToBeRefreshedAndClickable(btn_IssuePart);
          WebElementActions.getActions(driver).clickElement(btn_IssuePart);

          waitMethods.loadingWait(loder);
          TestListener.saveScreenshotPNG(driver);
    }

    /**
     * The part should now show with a quantity of 1
     */
      public void verifyPartAdded() throws InterruptedException {

          waitMethods.waitForElementToBeRefreshedAndIsVisible(label_partDescription1);
          Assert.assertTrue(label_partDescription1.isDisplayed());

          waitMethods.waitForElementToBeRefreshedAndIsVisible(label_EA1);
          Assert.assertTrue(label_EA1.isDisplayed());

          waitMethods.waitForElementToBeRefreshedAndIsVisible(crossIcon);
          Assert.assertTrue(crossIcon.isDisplayed());

          waitMethods.waitForElementToBeRefreshedAndIsVisible(DeleteIcon);
          Assert.assertTrue(DeleteIcon.isDisplayed());

          waitMethods.loadingWait(loder);
          TestListener.saveScreenshotPNG(driver);
    }

    /**
     * click on cross button
     */
      public void clickOnCrossBtn() throws InterruptedException {

          waitMethods.waitForElementToBeRefreshedAndClickable(crossIcon);
         WebElementActions.getActions(driver).clickElement(crossIcon);


              waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);

    }

    /**
     * click on Delete button
     */
      public void clickOnDeleteBtn() throws InterruptedException {

              waitMethods.waitForElementToBeRefreshedAndClickable(DeleteIcon);
        WebElementActions.getActions(driver).clickElement(DeleteIcon);


              waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }

    /**
     * Verify No data display
     */
      public void verifyNoDataDisplay() throws InterruptedException {

          waitMethods.waitForElementToBeRefreshedAndIsVisible(label_NodataDisplay);
        Assert.assertTrue(label_NodataDisplay.isDisplayed());
        TestListener.saveScreenshotPNG(driver);
    }

    /**
     * Enter Core Part
     */
      public void enterCorePart() throws InterruptedException {

        if (LoginActions.environmentName.contains("QA")) {
            waitMethods.waitForElementToBeRefreshedAndClickable(txt_part);
            WebElementActions.getActions(driver).inputText(txt_part, appProp.getProperty("CorePart"));
            Thread.sleep(3000);
            waitMethods.waitForElementToBeRefreshedAndClickable(corePart);
            WebElementActions.getActions(driver).clickElement(corePart);
            Thread.sleep(5000);
            WebElementActions.getActions(driver).inputText(txt_part, appProp.getProperty("CorePart"));
            Thread.sleep(3000);
            WebElementActions.getActions(driver).inputText(txt_part, appProp.getProperty("CorePart"));
            Thread.sleep(3000);
            waitMethods.waitForElementToBeRefreshedAndClickable(corePart);
            WebElementActions.getActions(driver).clickElement(corePart);
            Thread.sleep(3000);
            waitMethods.loadingWait(loder);
            TestListener.saveScreenshotPNG(driver);

        }
    }

    /**
     * click on Search icon
     */
      public void clickOnSearchIcon() throws InterruptedException {
        if (LoginActions.environmentName.contains("QA")) {
            waitMethods.waitForElementToBeRefreshedAndClickable(search_icon);
            WebElementActions.getActions(driver).clickElement(search_icon);
            waitMethods.loadingWait(loder);
            TestListener.saveScreenshotPNG(driver);
        }
    }

    /**
     * type core part
     */
      public void typeCorePart() throws InterruptedException {

        if (LoginActions.environmentName.contains("QA")) {
            waitMethods.waitForElementToBeRefreshedAndClickable(input_parts);
            WebElementActions.getActions(driver).inputText(input_parts, appProp.getProperty("CorePart"));
            waitMethods.loadingWait(loder);
        }
    }

    /**
     * click on search button
     */
      public void clickOnSearchBtn() throws InterruptedException {
        if (LoginActions.environmentName.contains("QA")) {
            waitMethods.waitForElementToBeRefreshedAndClickable(search_btn);
            WebElementActions.getActions(driver).clickElement(search_btn);
            waitMethods.loadingWait(loder);
        }
    }

    /**
     * click on select button
     */
      public void selectButton() throws InterruptedException {
        if (LoginActions.environmentName.contains("QA")) {
            waitMethods.waitForElementToBeRefreshedAndClickable(select_button);
            WebElementActions.getActions(driver).clickElement(select_button);
            waitMethods.loadingWait(loder);
        }
    }

    /**
     * click on cancle button
     */
      public void clickOnCancleButton() throws InterruptedException {

              waitMethods.waitForElementToBeRefreshedAndClickable(cancle_btn);
        WebElementActions.getActions(driver).clickElement(cancle_btn);
              waitMethods.loadingWait(loder);
    }

    /**
     * click on Core Return button
     */
      public void clickOnCoreReturn() throws InterruptedException {
        if (LoginActions.environmentName.contains("QA")) {
            waitMethods.waitForElementToBeRefreshedAndClickable(btn_coreReturn);
            Thread.sleep(2000);
            WebElementActions.getActions(driver).clickElement(btn_coreReturn);
            Thread.sleep(10000);
            waitMethods.loadingWait(loder);
            TestListener.saveScreenshotPNG(driver);
        }
    }

    /**
     * click on cross button
     */
      public void clickOnCrossBtnCore() throws InterruptedException {
        if (LoginActions.environmentName.contains("QA")) {
            waitMethods.waitForElementToBeRefreshedAndClickable(crossIcon_core);
            WebElementActions.getActions(driver).clickElement(crossIcon_core);
            Thread.sleep(10000);
            waitMethods.loadingWait(loder);
            TestListener.saveScreenshotPNG(driver);
        }
    }

    /**
     * click on Delete button
     */
      public void clickOnDeleteBtnCore() throws InterruptedException {
        if (LoginActions.environmentName.contains("QA")) {
            waitMethods.waitForElementToBeRefreshedAndClickable(deleteIcon_core);
            WebElementActions.getActions(driver).clickElement(deleteIcon_core);
            Thread.sleep(10000);
            waitMethods.loadingWait(loder);
            TestListener.saveScreenshotPNG(driver);
        }
    }

    /**
     * again enter CorePart
     */
      public void againEnterCorePart() throws InterruptedException {

              waitMethods.waitForElementToBeRefreshedAndClickable(txt_part);
        WebElementActions.getActions(driver).inputText(txt_part, appProp.getProperty("CorePart"));
        TestListener.saveScreenshotPNG(driver);
    }

    /**
     * click on cancle button
     */
      public void clickOnCancleBtn() throws InterruptedException {

              waitMethods.waitForElementToBeRefreshedAndClickable(btn_cancle);
        WebElementActions.getActions(driver).clickElement(btn_cancle);

              waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }

    /**
     * click on Non-catalog part
     */
      public void clickOnNonCatalogPart() throws InterruptedException {
        if (LoginActions.environmentName.contains("QA") || (LoginActions.environmentName.contains("NA"))){
 //               || LoginActions.environmentName.contains("EU")) {
            //       System.out.println("clickOnNonCatalogPart()");
            waitMethods.waitForElementToBeRefreshedAndClickable(btn_NonCatalogPart);
            WebElementActions.getActions(driver).clickElement(btn_NonCatalogPart);
            System.out.println("btn_NonCatalogPart...:" + btn_NonCatalogPart);
            //       Thread.sleep(10000);
            waitMethods.loadingWait(loder);
            TestListener.saveScreenshotPNG(driver);
        }
    }

    /**
     * Verify element of Non-catalog part
     */

      public void verifyNonCatalogPartElement() throws InterruptedException {
        if (LoginActions.environmentName.contains("QA") || (LoginActions.environmentName.contains("NA"))){
 //
            Thread.sleep(3000);
            waitMethods.waitForElementToBeRefreshedAndIsVisible(createIssueNonCatalogPart);
            Assert.assertTrue(createIssueNonCatalogPart.isDisplayed());
            Assert.assertTrue(label_part1.isDisplayed());
            Assert.assertTrue(txtfield_part.isDisplayed());
            Assert.assertTrue(label_description1.isDisplayed());
            Assert.assertTrue(txtfield_description.isDisplayed());
            Assert.assertTrue(label_Quantity1.isDisplayed());
            Assert.assertTrue(txtfield_Quantity.isDisplayed());
            Assert.assertTrue(asterisk_unit.isDisplayed());
            Assert.assertTrue(label_UnitCost.isDisplayed());
            Assert.assertTrue(txtfield_UnitCost.isDisplayed());
            Assert.assertTrue(cancle.isDisplayed());
            Assert.assertTrue(IssuePart.isDisplayed());

            waitMethods.loadingWait(loder);
            TestListener.saveScreenshotPNG(driver);
        }
    }

    /**
     * random NCPartName
     */
      String NCPartName = WebElementActions.getActions(driver).randomAlphaNumeric(10);

    /**
     * type NCPartName
     */
      public void typeNCPartName() throws InterruptedException {
        if (LoginActions.environmentName.contains("QA") || (LoginActions.environmentName.contains("NA"))){
            Thread.sleep(5000);
            waitMethods.waitForElementToBeRefreshedAndClickable(NCP_Part);
            WebElementActions.getActions(driver).inputText(NCP_Part, NCPartName);
            waitMethods.loadingWait(loder);
            TestListener.saveScreenshotPNG(driver);
        }
    }

    /**
     * type NCPartDescription
     */
      public void typeNCPartDescription() throws InterruptedException {
        if (LoginActions.environmentName.contains("QA")  ) {
            waitMethods.waitForElementToBeRefreshedAndClickable(txtfield_description);
            WebElementActions.getActions(driver).inputText(txtfield_description, appProp.getProperty("NCPartDescription"));
        } else if((LoginActions.environmentName.contains("NA"))) {
            waitMethods.waitForElementToBeRefreshedAndClickable(txtfield_description);
            WebElementActions.getActions(driver).inputText(txtfield_description, appProp45.getProperty("NCPartDescription"));
        }
            waitMethods.loadingWait(loder);
            TestListener.saveScreenshotPNG(driver);

    }

    /**
     * type Unit cost
     */
      public void typeUnitcost() throws InterruptedException {
        if (LoginActions.environmentName.contains("QA")) {
            waitMethods.waitForElementToBeRefreshedAndClickable(txtfield_UnitCost);
            WebElementActions.getActions(driver).inputText(txtfield_UnitCost, appProp.getProperty("Unitcost"));
        } else if(LoginActions.environmentName.contains("NA")) {
            waitMethods.waitForElementToBeRefreshedAndClickable(txtfield_UnitCost);
            WebElementActions.getActions(driver).inputText(txtfield_UnitCost, appProp45.getProperty("Unitcost"));
        }
            waitMethods.loadingWait(loder);
            TestListener.saveScreenshotPNG(driver);
 //       }
    }

    /**
     * click on Issue Part
     */
      public void clickOnIssuePart2() throws InterruptedException {
        if (LoginActions.environmentName.contains("QA") || (LoginActions.environmentName.contains("NA"))){
//                || LoginActions.environmentName.contains("EU")) {
            waitMethods.waitForElementToBeRefreshedAndClickable(IssuePart);
        WebElementActions.getActions(driver).clickElement(IssuePart);
        Thread.sleep(3000);
            waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    }
    /**
     * The part should now show with a quantity of 1
     */
      public void verifyNonCatalogPartAdded() throws InterruptedException {
        if (LoginActions.environmentName.contains("QA") || (LoginActions.environmentName.contains("NA"))){
//                || LoginActions.environmentName.contains("EU")){
            waitMethods.waitForElementToBeRefreshedAndIsVisible(ncpPartName);
        Assert.assertTrue(ncpPartName.isDisplayed());
        Assert.assertTrue(NCPartDescription.isDisplayed());
            waitMethods.waitForElementToBeRefreshedAndIsVisible(EA1_label);
        Assert.assertTrue(EA1_label.isDisplayed());
        Assert.assertTrue(EA1_2.isDisplayed());
        Assert.assertTrue(crossIcon.isDisplayed());
        Assert.assertTrue(DeleteIcon.isDisplayed());
            waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }

}
    /**
     * verify name NCPartDescription
     */
      public void verifyNCPartDescription() throws InterruptedException {

              waitMethods.waitForElementToBeRefreshedAndIsVisible(NCPartDescription);
        Assert.assertTrue(NCPartDescription.isDisplayed());
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * click on Labour Tab
     */
      public void clickOnLabour() throws InterruptedException {
        if (LoginActions.environmentName.contains("QA")) {
            waitMethods.waitForElementToBeRefreshedAndClickable(btn_Labour);
            WebElementActions.getActions(driver).clickElement(btn_Labour);

            waitMethods.loadingWait(loder);
            TestListener.saveScreenshotPNG(driver);
        }
    }
    /**
     * click on VMRSName (Aerodynamic Device)
     */
      public void clickOnVMRSName() throws InterruptedException {
        if (LoginActions.environmentName.contains("QA")) {
            Thread.sleep(10000);
            WebElementActions.getActions(driver).moveOnTargetElement(VMRSName.get(0));
            waitMethods.waitForElementToBeRefreshedAndIsVisible(VMRSName_Accessories);

            String accessories1 = VMRSName_Accessories.getAttribute("title");

            for (int i = 0; i < VMRSName.size(); i++) {
                System.out.println(VMRSName.get(i).getAttribute("title"));
                if (VMRSName.get(i).getAttribute("title").contains(accessories1)) {
                    WebElementActions.getActions(driver).moveOnTargetElement(VMRSName.get(i));


                    WebElementActions.getActions(driver).clickElement(VMRSName.get(i));
                    break;
                }
            }
                WebElementActions.getActions(driver).moveOnTargetElement(firstrow_cell);

              waitMethods.waitForElementToBeRefreshedAndClickable(VMRSName_Img);
              WebElementActions.getActions(driver).clickElement(VMRSName_Img);

            waitMethods.loadingWait(loder);
            TestListener.saveScreenshotPNG(driver);
        }
    }

    /**
     * Enter notes notes_textarea
     */
      public void typeNotes() throws InterruptedException {
        if (LoginActions.environmentName.contains("QA")) {
            waitMethods.waitForElementToBeRefreshedAndClickable(notes_textarea);
            WebElementActions.getActions(driver).inputText(notes_textarea, "Complaint");
            waitMethods.loadingWait(loder);
            TestListener.saveScreenshotPNG(driver);
        }
    }

    /**
     * click on cause/Reason
     */
      public void click_Cause_Reason() throws InterruptedException {
        if (LoginActions.environmentName.contains("QA")) {
            waitMethods.waitForElementToBeRefreshedAndClickable(cause_reason);
            WebElementActions.getActions(driver).clickElement(cause_reason);
            waitMethods.loadingWait(loder);
            TestListener.saveScreenshotPNG(driver);
        }
    }

    /**
     * click on select
     */
      public void clickOnSelect() throws InterruptedException {
        if (LoginActions.environmentName.contains("QA")) {
            waitMethods.waitForElementToBeRefreshedAndClickable(select_cause_Reason);
            WebElementActions.getActions(driver).clickElement(select_cause_Reason);
            waitMethods.loadingWait(loder);
            TestListener.saveScreenshotPNG(driver);
        }
    }
    public void clickOnSelect2() throws InterruptedException {
        if (LoginActions.environmentName.contains("QA")) {
            waitMethods.waitForElementToBeRefreshedAndClickable(label_select_cause_Reason);
            WebElementActions.getActions(driver).clickElement(label_select_cause_Reason);
            waitMethods.loadingWait(loder);
            TestListener.saveScreenshotPNG(driver);
        }
    }

    /**
     * click on cancle button
     */
      public void clickOnCancle() throws InterruptedException {
        if (LoginActions.environmentName.contains("QA")) {
            waitMethods.waitForElementToBeRefreshedAndClickable(cancleBtn);
            WebElementActions.getActions(driver).clickElement(cancleBtn);
            waitMethods.loadingWait(loder);
            TestListener.saveScreenshotPNG(driver);
        }
    }

    /**
     *  click on  task
     */
       public void clickOnTask() throws InterruptedException {
         if (LoginActions.environmentName.contains("QA")) {
             waitMethods.waitForElementToBeRefreshedAndClickable(task);
             WebElementActions.getActions(driver).clickElement(task);
         }
     }
    /**
     * Click on Ok button OK_btn
     */
      public void clickOk() throws InterruptedException {
        if (LoginActions.environmentName.contains("QA")) {
            waitMethods.waitForElementToBeRefreshedAndClickable(OK_btn);
            WebElementActions.getActions(driver).clickElement(OK_btn);

            waitMethods.loadingWait(loder);
            TestListener.saveScreenshotPNG(driver);
        }
    }


    /**
     * Enter complaint notes
     */
      public void typeComplaintNote1() throws InterruptedException {
        if (LoginActions.environmentName.contains("QA") || LoginActions.environmentName.contains("EU")) {
            waitMethods.waitForElementToBeRefreshedAndClickable(complaint_textarea);
            WebElementActions.getActions(driver).inputText(complaint_textarea, "Complaint");
            TestListener.saveScreenshotPNG(driver);
        }
    }
    /**
     * Enter Cause/Reason
     */
      public void typeCause_Reason() throws InterruptedException {
        if (LoginActions.environmentName.contains("QA") || LoginActions.environmentName.contains("EU")) {
            waitMethods.waitForElementToBeRefreshedAndClickable(cause_textarea);
            WebElementActions.getActions(driver).inputText(cause_textarea, "Cause/Reason");
            TestListener.saveScreenshotPNG(driver);
        }
    }
    /**
     * Enter Correction/Task
     */
      public void typeCorrection_Task()throws InterruptedException {
        if (LoginActions.environmentName.contains("QA") || LoginActions.environmentName.contains("EU")) {
            waitMethods.waitForElementToBeRefreshedAndClickable(task_textarea);
            WebElementActions.getActions(driver).inputText(task_textarea, "Correction/Task");
            TestListener.saveScreenshotPNG(driver);
        }
    }
    /**
     * click on "0% by Moises Olivas on" hyperlink
     */
      public void clickOnMoisesOlivashyperlink() throws InterruptedException {

                waitMethods.waitForElementToBeRefreshedAndClickable(progrss_hyperlink);
        WebElementActions.getActions(driver).clickElement(progrss_hyperlink);

                waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * click on cause/reason hyperlink hyperlink_breakdown
     */
      public void cause_reason_hyperlink() throws InterruptedException {

//        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(hyperlink_breakdown);
//        WebElementActions.getActions().clickElement(hyperlink_breakdown);

                waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }

    /**
     * click on select button selectBtn
     */
      public void clickOnSelectbutton() throws InterruptedException {

// WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(select_btn);
// WebElementActions.getActions().clickElement(select_btn);

//        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(selectBtn);
//        WebElementActions.getActions().clickElement(selectBtn);

                waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * click ok button
     */
      public void clickOkbutton() throws InterruptedException {
        if (LoginActions.environmentName.contains("QA") || LoginActions.environmentName.contains("EU")) {
            waitMethods.waitForElementToBeRefreshedAndClickable(btn_Ok);
            WebElementActions.getActions(driver).clickElement(btn_Ok);

            waitMethods.loadingWait(loder);
            TestListener.saveScreenshotPNG(driver);
        }
    }
    /**
     * click on FirstLaborItem (Aerodynamic Devices)
     */
      public void clickOnFirstLaborItem() throws InterruptedException {  //FirstWorkRequired_AeroDynamic
        if (LoginActions.environmentName.contains("QA")) {
            Thread.sleep(10000);

            WebElementActions.getActions(driver).moveOnTargetElement(VMRSName.get(0));
            waitMethods.waitForElementToBeRefreshedAndIsVisible(FirstWorkRequired_AeroDynamic);
            String aeroDynamic = FirstWorkRequired_AeroDynamic.getAttribute("title");

            for (int i = 0; i < VMRSName.size(); i++) {
                System.out.println(VMRSName.get(i).getAttribute("title"));
                if (VMRSName.get(i).getAttribute("title").contains(aeroDynamic)) {
                    WebElementActions.getActions(driver).moveOnTargetElement(VMRSName.get(i));

                    //       WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(VMRSName.get(0));
                    WebElementActions.getActions(driver).clickElement(VMRSName.get(i));
                    break;
                }
            }


            waitMethods.waitForElementToBeRefreshedAndClickable(hyperlink_AeroDynamicDevice);
           WebElementActions.getActions(driver).clickElement(hyperlink_AeroDynamicDevice);

            waitMethods.loadingWait(loder);
            TestListener.saveScreenshotPNG(driver);
        }
    }

    /**
     * Enter complaint notes
     */
      public void typeComplaintNote2() throws InterruptedException {
        if (LoginActions.environmentName.contains("QA") || LoginActions.environmentName.contains("EU")) {
            waitMethods.waitForElementToBeRefreshedAndClickable(complaint_textarea);
            WebElementActions.getActions(driver).inputText(complaint_textarea, "Complaint2");
            TestListener.saveScreenshotPNG(driver);
        }
    }
    /**
     * Enter Cause/Reason
     */
      public void typeCause_Reason2() throws InterruptedException {
        if (LoginActions.environmentName.contains("QA") || LoginActions.environmentName.contains("EU")) {
            waitMethods.waitForElementToBeRefreshedAndClickable(cause_textarea);
            WebElementActions.getActions(driver).inputText(cause_textarea, "cause2 ");
            TestListener.saveScreenshotPNG(driver);
        }
    }
    /**
     * Enter Correction/Task
     */
      public void typeCorrection_Task2()throws InterruptedException {
         if (LoginActions.environmentName.contains("QA") || LoginActions.environmentName.contains("EU")) {
             waitMethods.waitForElementToBeRefreshedAndClickable(task_textarea);
            WebElementActions.getActions(driver).inputText(task_textarea, "repair2");
            TestListener.saveScreenshotPNG(driver);
        }
    }
/**
 * new Added Steps
 *
 */
    /**
     * click on Summary tab
     */
      public void clickOkSummaryTab() throws InterruptedException {

                waitMethods.waitForElementToBeRefreshedAndClickable(summary_tab);
        WebElementActions.getActions(driver).clickElement(summary_tab);
                waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * Verify the element of Summary tab
     */
      public void verifySummaryTabElement() throws InterruptedException {

                waitMethods.waitForElementToBeRefreshedAndIsVisible(label_PoNumber);
        Assert.assertTrue(label_PoNumber.isDisplayed());
        Assert.assertTrue(txtfield_PoNumber.isDisplayed());
        Assert.assertTrue(label_InternalRO.isDisplayed());
        Assert.assertTrue(txtfield_RoInternal.isDisplayed());
        Assert.assertTrue(InternalNotes.isDisplayed());
        Assert.assertTrue(hyperlink_InternalNotes.isDisplayed());
        Assert.assertTrue(notes.isDisplayed());
        Assert.assertTrue(notes_hyperlink.isDisplayed());
        Assert.assertTrue(RoDate.isDisplayed());
        Assert.assertTrue(ReadingType.isDisplayed());
        Assert.assertTrue(LabourParts.isDisplayed());
                waitMethods.waitForElementToBeRefreshedAndIsVisible(UnitReady);
        Assert.assertTrue(UnitReady.isDisplayed());
        Assert.assertTrue(hyperlink_AccessoriesDevice.isDisplayed());
                waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }

    /**
     * click on pause button
     */
      public void clickOnPauseButton() throws InterruptedException {
          Thread.sleep(8000);
         if(undo_pause.size() > 0)
         {
             waitMethods.waitForElementToBeRefreshedAndClickable(undo_pause.get(0));
             WebElementActions.getActions(driver).clickElement(undo_pause.get(0));

         }
         Thread.sleep(2000);
                waitMethods.waitForElementToBeRefreshedAndClickable(pause);
        WebElementActions.getActions(driver).clickElement(pause);

                waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * click on Clear button
     */
      public void clickOnClearButton() throws InterruptedException {

        Thread.sleep(2000);
                waitMethods.waitForElementToBeRefreshedAndClickable(btn_clear);
        WebElementActions.getActions(driver).clickElement(btn_clear);

                waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * click on Select button
     */
      public void clickOnSelectButton() throws InterruptedException {

                waitMethods.waitForElementToBeRefreshedAndClickable(btn_select);
        WebElementActions.getActions(driver).clickElement(btn_select);

                waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * click on Unit Ready button
     */
      public void clickOnUnitReadyButton() throws InterruptedException {

                waitMethods.waitForElementToBeRefreshedAndClickable(UnitReady);
        WebElementActions.getActions(driver).clickElement(UnitReady);
                waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * click on Ok button
     */
      public void clickOnOkButton() throws InterruptedException {

                waitMethods.waitForElementToBeRefreshedAndClickable(btn_ok);
        WebElementActions.getActions(driver).clickElement(btn_ok);

                waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * click on cancle button
     */
      public void clickOnCancleBtn1() throws InterruptedException {

                waitMethods.waitForElementToBeRefreshedAndClickable(Cancle_btn);
        WebElementActions.getActions(driver).clickElement(Cancle_btn);

                waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * enter defer reason button
     */
      public void inputDeferReason() throws InterruptedException {
        if (LoginActions.environmentName.contains("QA") ) {
            waitMethods.waitForElementToBeRefreshedAndClickable(defer_input);
            WebElementActions.getActions(driver).inputText(defer_input, appProp.getProperty("DefereReason"));

            waitMethods.loadingWait(loder);
            TestListener.saveScreenshotPNG(driver);
        }
    }
    /**
     * click on defer button
     */
      public void clickOnDefere() throws InterruptedException {

                waitMethods.waitForElementToBeRefreshedAndClickable(Defer_btn);
        WebElementActions.getActions(driver).clickElement(Defer_btn);

                waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     *  EU url steps
     *  click on Accessories group
     */
      public void clickOnAccessoriesGroup() throws InterruptedException {
        if(LoginActions.environmentName.contains("EU")) {
            Thread.sleep(5000);
            if (totalHours.size() > 0) {
                WebElementActions.getActions(driver).moveOnTargetElement(subtitle_TopUsedServices);

                waitMethods.waitForElementToBeRefreshedAndClickable(img_Accessories);
                WebElementActions.getActions(driver).clickElement(img_Accessories);

                waitMethods.waitForElementToBeRefreshedAndClickable(plus_sign);
                WebElementActions.getActions(driver).clickElement(plus_sign);

                Thread.sleep(3000);

                waitMethods.waitForElementToBeRefreshedAndClickable(img_Aerodynamic);
                WebElementActions.getActions(driver).clickElement(img_Aerodynamic);

                waitMethods.waitForElementToBeRefreshedAndClickable(plus_sign);
                WebElementActions.getActions(driver).clickElement(plus_sign);

            }
        }
    }
        /**
         * click on Accessories group
         */
          public void clickOnAccessoriesLink() throws InterruptedException {
            if(LoginActions.environmentName.contains("EU")) {
                waitMethods.waitForElementToBeRefreshedAndClickable(laborAndParts.get(0));
                WebElementActions.getActions(driver).clickElement(laborAndParts.get(0));
            }
    }
        /**
         * click on Aerodynamic group
         */
          public void clickOnAerodynamicLink() throws InterruptedException {
            if (LoginActions.environmentName.contains("EU")) {
     //           if(laborAndParts.contains("Complaint")){
                for (int i = 0; i < laborAndParts.size(); i++) {
                    waitMethods.waitForElementToBeRefreshedAndClickable(laborAndParts.get(1));
                WebElementActions.getActions(driver).clickElement(laborAndParts.get(1));
            }
            }
        }

    /**
     * click on sign out button
     * verify username
     */
      public void clickOnSignOut() throws InterruptedException {

          waitMethods.waitForElementToBeRefreshedAndClickable(btn_signOut);
  //      Thread.sleep(3000);
          WebElementActions.getActions(driver).clickElement(btn_signOut);


          waitMethods.waitForElementToBeRefreshedAndIsVisible(inputbox_Username);
          Assert.assertTrue(inputbox_Username.isDisplayed());
          TestListener.saveScreenshotPNG(driver);
    }


}