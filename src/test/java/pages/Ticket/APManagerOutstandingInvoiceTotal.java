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



public class APManagerOutstandingInvoiceTotal extends TestDriverActions {

    String invoiceName = WebElementActions.getActions(driver).randomAlphaNumeric(7);


    @FindBy(xpath = "//a[text()='Financials']")
    WebElement Financials;
    @FindBy(xpath = "//span[contains(.,'( corproId=')]")
    WebElement CorproId;
    @FindBy(xpath = "//label[contains(.,'Search ')]/parent::td/following-sibling::td/child::input")
    WebElement searchandSelectCarporation;

    @FindBy(xpath = "(//a[contains(.,'Select')])[1]")
    WebElement Select;

    @FindBy(xpath = "//span[contains(text(),'Add New')]")
    WebElement label_AddNewMiscInvoice;

    @FindBy(xpath = "(//label[contains(text(),'Vendor:')])[3]")
    WebElement label_SearchandSelectVendor;

    @FindBy(xpath = "//span[text()='New Vendor']")
    WebElement label_NewVendor;

    @FindBy(xpath = "//span[text()='Name']")
    WebElement label_Name;

    @FindBy(xpath = "//span[text()='Code']")
    WebElement label_Code;

    @FindBy(xpath = "//span[text()='Address']")
    WebElement label_Address;

    @FindBy(xpath = "//span[text()='Phone']")
    WebElement label_Phone;

    @FindBy(xpath = "(//span[text()='Cancel'])[1]")
    WebElement label_cancel;

    @FindBy(xpath = "//input[contains(@id,':it2::content')]")
   WebElement  txt_SerachandselectVendor;

    @FindBy(xpath = "//span[text()='Search']")
    WebElement btn_Search;

    @FindBy(xpath = "(//span[text()='Select'])[1]")
    WebElement btn_Select;

    @FindBy(xpath = "(//td[contains(.,'Vendor Misc Invoice')])[2]")
    WebElement label_VendorMiscInvoice;

    @FindBy(xpath = "//label[text()='Vendor:']/preceding-sibling::span")
    WebElement label_RequiredVendor;

    @FindBy(xpath = "(//label[text()='Vendor:'])[3]")
    WebElement label_Vendor;

    @FindBy(xpath = "//a[contains(.,'905TRUCK')]")
    WebElement label_905TRUCK;

    @FindBy(xpath = "//label[contains(text(),'Invoice #:')]/preceding-sibling::span")
    WebElement label_RequiredInvoice;

    @FindBy(xpath = "(//td[contains(.,'Invoice #:')]/child::label)[2]")
    WebElement label_Invoice;

    @FindBy(xpath = "//input[contains(@id,':it3::content')]")
    WebElement label_InvoiceTextArea;

    @FindBy(xpath = "//label[text()='Type:']/preceding-sibling::span")
    WebElement label_RequiredType;

    @FindBy(xpath = "//label[text()='Type:']")
    WebElement label_type;

    @FindBy(xpath = "//select[contains(@id,':soc2::content')]")
    WebElement label_typeTextarea;

    @FindBy(xpath = "//span[contains(text(),'Add Line Item')]")
    WebElement label_AddLineItems;

    @FindBy(xpath = "//label[contains(.,'Account#:')]/preceding-sibling::span")
    WebElement label_RequiredAccount;

    @FindBy(xpath = "//label[contains(.,'Account#:')]")
    WebElement label_AccountHash;

    @FindBy(xpath = "//select[contains(@id,':soc4::content')]")
    WebElement label_AccountTextArea;

    @FindBy(xpath = "//label[text()='Division:']/preceding-sibling::span")
    WebElement label_RequiredDevision;

    @FindBy(xpath = "//label[text()='Division:']")
    WebElement label_Devision;

    @FindBy(xpath = "(//select[contains(@id,':soc1::content')])[2]")
    WebElement input_DevisionTextArea;

    @FindBy(xpath = "//label[contains(.,'Description:')]/preceding-sibling::span")
    WebElement label_RequiredDescription;

    @FindBy(xpath = "(//label[contains(.,'Description:')])[2]")
    WebElement label_Description;

    @FindBy(xpath = "//input[contains(@id,':it9::content')]")
    WebElement label_DescriptionTextArea;

    @FindBy(xpath ="//label[text()='Unit Cost:']/preceding-sibling::span")
    WebElement label_RequiredUnitCost;

    @FindBy(xpath = "//label[text()='Unit Cost:']")
    WebElement label_UnitCost;

    @FindBy(xpath = "//label[text()='Unit Cost:']/parent::td/following-sibling::td/child::input")
    WebElement label_UnitCostTextArea;

    @FindBy(xpath = "//label[text()='UOM:']")
    WebElement label_UOM;

    @FindBy(xpath = "//select[contains(@id,':soc3::content')]")
    WebElement label_UOMTextArea;

    @FindBy(xpath = "//label[text()='Extended:']")
    WebElement label_Extended;

    @FindBy(xpath ="(//label[text()='Extended:']/parent::td/following::td/child::span)[1]")
    WebElement label_extendedValue;

    @FindBy(xpath = "(//a[contains(.,'Cancel')])[2]")
    WebElement btn_cancel;

    @FindBy(xpath = "(//a[contains(.,'Save / Exit')])[2]")
    WebElement btn_SaveExit;

    @FindBy(xpath = "(//a[contains(.,'Delete')])[2]")
    WebElement btn_Delete;

    @FindBy(xpath = "(//a[contains(.,'Save / Exit')])[2]")
    WebElement btn_SaveExit2;

    @FindBy(xpath = "(//a[contains(.,'Finalize')])[2]")
    WebElement btn_Finalize;

    @FindBy(xpath = "//a[contains(.,'Display Totals')]")
    WebElement btn_DisplayTotals;

    @FindBy(xpath = "//span[contains(text(),'Current')]")
    WebElement label_Current;

    @FindBy(xpath = "//td[contains(@id,':c4')]/span")
    List<WebElement> label_CurrentValue1;

    @FindBy(xpath = "//td[contains(@id,':c8')]")
    List<WebElement> label_30to60;

    @FindBy(xpath = "(//td[contains(@id,':0:c4')]/span)[1]")
    WebElement label_Currentvalue2;

    @FindBy(xpath = "(//td[contains(@id,':1:c4')]/span)[1]")
    WebElement label_Currentvalue3;

    @FindBy(xpath = "//span[contains(@id,':0:tsi:obc1')]")
    WebElement label_CurrentTotal;

    @FindBy(xpath = "//span[contains(@id,':0:tsi:ot13')]")
    WebElement getLabel_30to90Total;

    @FindBy(xpath = "(//td[contains(.,'905 Truck ')])[3]")
    WebElement label_Location;
    @FindBy(xpath = "//a[contains(.,'Un-Finalize')]")
    WebElement  label_UnFinalize;
    @FindBy(xpath = "(//a[contains(.,'Finalize')])[1]")
    WebElement Finalize;
    @FindBy(xpath = "(//a[contains(.,'Delete')])[1]")
    WebElement label_Delete;

    @FindBy(xpath = "//a[contains(.,'Yes')]")
    WebElement btn_Yes;

    @FindBy(xpath = "//a[contains(.,'Sign Out')]")
    WebElement btn_signOut;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement inputbox_Username;

    @FindBy(xpath = "//td[text()='AP Manager']")
    WebElement AP_Manager;
    @FindBy(xpath = "//h1[contains(.,'Working...Please Wait')]")
    List<WebElement> loder;



    public APManagerOutstandingInvoiceTotal(WebDriver driver){
        this.driver = driver;
        this.waitMethods = new WaitMethods(driver);
    }




    /*go to AP  Manager **/
    public void gotoApManager() throws FileNotFoundException, InterruptedException {

        waitMethods.waitForElementToBeRefreshedAndClickable(Financials);
        WebElementActions.getActions(driver).clickElement(Financials);

        waitMethods.waitForElementToBeRefreshedAndClickable(AP_Manager);
        WebElementActions.getActions(driver).clickElement(AP_Manager);

        TestListener.saveScreenshotPNG(driver);

    }

    /* click PF User in American Body**/
    public void clickPFCorproID () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(CorproId);
        WebElementActions.getActions(driver).clickElement(CorproId);
        waitMethods.loadingWait(loder);

    }
    /* select  PF User in American Body**/
    public void selectPFUser () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(searchandSelectCarporation);
        WebElementActions.getActions(driver).inputText(searchandSelectCarporation, appProp.getProperty("PFUser"));
        waitMethods.loadingWait(loder);

        waitMethods.waitForElementToBeRefreshedAndIsVisible(Select);
        WebElementActions.getActions(driver).clickElement(Select);

    }


    /*click on add new MISC Invoice**/
    public void clickOnNewInvoice () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(label_AddNewMiscInvoice);
        WebElementActions.getActions(driver).clickElement(label_AddNewMiscInvoice);

        waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /*verify Search and Select Vendor **/
    public void verifySearchAndSelectVendor () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(label_SearchandSelectVendor);
        Assert.assertTrue(label_SearchandSelectVendor.isDisplayed());

        waitMethods.waitForElementToBeRefreshedAndIsVisible(label_NewVendor);
        Assert.assertTrue(label_NewVendor.isDisplayed());

    }
      public void  verifyName () throws InterruptedException {

          waitMethods.waitForElementToBeRefreshedAndIsVisible(label_Name);
        Assert.assertTrue(label_Name.isDisplayed());

          waitMethods.waitForElementToBeRefreshedAndIsVisible(label_Code);
        Assert.assertTrue(label_Code.isDisplayed());

          waitMethods.waitForElementToBeRefreshedAndIsVisible(label_Address);
        Assert.assertTrue(label_Address.isDisplayed());

          waitMethods.waitForElementToBeRefreshedAndIsVisible(label_Phone);
        Assert.assertTrue(label_Phone.isDisplayed());

    }
    /*enter vendors name **/
  public void entervendorName () throws InterruptedException {
      waitMethods.waitForElementToBeRefreshedAndClickable(txt_SerachandselectVendor);
      WebElementActions.getActions(driver).inputText(txt_SerachandselectVendor,appProp71.getProperty("vendorsName"));
      TestListener.saveScreenshotPNG(driver);
  }
  /*click on Search **/
    public void clickOnSearch () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(btn_Search);
        WebElementActions.getActions(driver).clickElement(btn_Search);

    }
    /*click on Select button **/
    public void clickOnSelectbutton () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(btn_Select);
        WebElementActions.getActions(driver).clickElement(btn_Select);
        waitMethods.loadingWait(loder);
    }
    /*verify Tital Vendor Misc Invoice**/
    public void verifyVendorMiscInvoice () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(label_VendorMiscInvoice);
        Assert.assertTrue(label_VendorMiscInvoice.isDisplayed());

        waitMethods.waitForElementToBeRefreshedAndIsVisible(label_RequiredVendor);
        Assert.assertTrue(label_RequiredVendor.isDisplayed());

        waitMethods.waitForElementToBeRefreshedAndIsVisible(label_Vendor);
        Assert.assertTrue(label_Vendor.isDisplayed());

        waitMethods.waitForElementToBeRefreshedAndIsVisible(label_905TRUCK);
        Assert.assertTrue(label_905TRUCK.isDisplayed());

    }
    /*verify Required invoice ,invoice invoice value **/
    public void verifyRequiredInvoice () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(label_RequiredInvoice);
        Assert.assertTrue(label_RequiredInvoice.isDisplayed());

        waitMethods.waitForElementToBeRefreshedAndIsVisible(label_Invoice);
        Assert.assertTrue(label_Invoice.isDisplayed());

        waitMethods.waitForElementToBeRefreshedAndIsVisible(label_InvoiceTextArea);
        Assert.assertTrue(label_InvoiceTextArea.isDisplayed());
    }
    /*verify Required Type ,type,typeTextArea**/
    public void verifyRequiredtype () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(label_RequiredType);
        Assert.assertTrue(label_RequiredType.isDisplayed());

        waitMethods.waitForElementToBeRefreshedAndIsVisible(label_type);
        Assert.assertTrue(label_type.isDisplayed());

        waitMethods.waitForElementToBeRefreshedAndIsVisible(label_typeTextarea);
        Assert.assertTrue(label_typeTextarea.isDisplayed());

    }

    /*enter the Invoice # **/
    public void enterInvoiceHash () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(label_InvoiceTextArea);
        WebElementActions.getActions(driver).inputText(label_InvoiceTextArea,invoiceName);
        TestListener.saveScreenshotPNG(driver);

    }
    /*select dropdown  type **/
    public void selecType() throws InterruptedException {
        Select objselect= new Select(label_typeTextarea);
        objselect.selectByVisibleText("ADMIN - Administration");
        waitMethods.loadingWait(loder);

    }
    /*click on Add Line Item**/
    public void clickOnAddLineItem () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(label_AddLineItems);
        WebElementActions.getActions(driver).clickElement(label_AddLineItems);

    }
    /*verify Required Account,Account Hash,AccountTextArea**/
    public void verifyRequiredAccount () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(label_RequiredAccount);
        Assert.assertTrue(label_RequiredAccount.isDisplayed());

        waitMethods.waitForElementToBeRefreshedAndIsVisible(label_AccountHash);
        Assert.assertTrue(label_AccountHash.isDisplayed());

        waitMethods.waitForElementToBeRefreshedAndIsVisible(label_AccountTextArea);
        Assert.assertTrue(label_AccountTextArea.isDisplayed());

    }
    /*select dropdown  Account Hash**/
    public void verifyAccountHash () throws InterruptedException {
        Select objselect=new Select(label_AccountTextArea);
        objselect.selectByVisibleText("1230 Inventory, Special Order");

    }
    /*verify Required Devision ,Devision,DevisionTextArea **/
    public void verifyRequiredDevision () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(label_RequiredDevision);
        Assert.assertTrue(label_RequiredDevision.isDisplayed());

        waitMethods.waitForElementToBeRefreshedAndIsVisible(label_Devision);
        Assert.assertTrue(label_Devision.isDisplayed());

        waitMethods.waitForElementToBeRefreshedAndIsVisible(input_DevisionTextArea);
        Assert.assertTrue(input_DevisionTextArea.isDisplayed());

    }
    /*select dropdown Devision**/
    public void selectDevision () {
        Select objselect =new Select(input_DevisionTextArea);
        objselect.selectByVisibleText("ADMIN");

    }
    /*verify RequiredDescription ,Description,DescriptionTextArea**/
    public void verifyRequiredDescription () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(label_RequiredDescription);
        Assert.assertTrue(label_RequiredDescription.isDisplayed());

        waitMethods.waitForElementToBeRefreshedAndIsVisible(label_Description);
        Assert.assertTrue(label_Description.isDisplayed());

        waitMethods.waitForElementToBeRefreshedAndIsVisible(label_DescriptionTextArea);
        Assert.assertTrue(label_DescriptionTextArea.isDisplayed());
    }
     /*verify Required UnitCost ,UnitCost,UnitCostTextArea**/
    public void verifyRequiredUnitCost () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(label_RequiredUnitCost);
        Assert.assertTrue(label_RequiredUnitCost.isDisplayed());

        waitMethods.waitForElementToBeRefreshedAndIsVisible(label_UnitCost);
        Assert.assertTrue(label_UnitCost.isDisplayed());

        waitMethods.waitForElementToBeRefreshedAndIsVisible(label_UnitCostTextArea);
        Assert.assertTrue(label_UnitCostTextArea.isDisplayed());

    }
    /*enter Unit Quantity **/
    public void enterUnitQuantity () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(label_UnitCostTextArea);
        WebElementActions.getActions(driver).inputText(label_UnitCostTextArea,appProp71.getProperty("UnitCost"));
        TestListener.saveScreenshotPNG(driver);
    }

    /*verify Extend and ExtendValue **/
    public void verifyExtend () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(label_Extended);
        Assert.assertTrue(label_Extended.isDisplayed());

        waitMethods.waitForElementToBeRefreshedAndIsVisible(label_extendedValue);
        Assert.assertTrue(label_extendedValue.isDisplayed());

    }
    /*verify Cancel ,save/Exit **/
    public void verifyCancel () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(btn_cancel);
        Assert.assertTrue(btn_cancel.isDisplayed());

        waitMethods.waitForElementToBeRefreshedAndIsVisible(btn_SaveExit);
        Assert.assertTrue(btn_SaveExit.isDisplayed());
    }
    /*click On Save/Exit **/
    public void clickOnSaveExit () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(btn_SaveExit);
        WebElementActions.getActions(driver).clickElement(btn_SaveExit);
        waitMethods.loadingWait(loder);

    }
    /*verify Delete ,Save/Exit,Fanalize **/
    public void verifyDelete () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(btn_Delete);
        Assert.assertTrue(btn_Delete.isDisplayed());

        waitMethods.waitForElementToBeRefreshedAndIsVisible(btn_SaveExit2);
        Assert.assertTrue(btn_SaveExit2.isDisplayed());

        waitMethods.waitForElementToBeRefreshedAndIsVisible(btn_Finalize);
        Assert.assertTrue(btn_Finalize.isDisplayed());

    }
    /*click on Finalize **/
    public void clickOnFinalize () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(btn_Finalize);
        WebElementActions.getActions(driver).clickElement(btn_Finalize);
        waitMethods.loadingWait(loder);
    }
    /*click on Display Totals**/
    public void clickonDisplayTotals () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(btn_DisplayTotals);
        WebElementActions.getActions(driver).clickElement(btn_DisplayTotals);
        waitMethods.loadingWait(loder);
    }
    /*String Current Value **/
    public void addingcurrentValue () throws InterruptedException {
        for (int i = 0; i > label_CurrentValue1.size(); i++) {
            String count = String.valueOf(label_CurrentValue1.get(i).getText());
            System.out.println("Name of element in current" + count);

            int b = 0;
            b = b + i;
            System.out.println("Sum of element in current :" + b);

        }
    }
    /*adding 30to60 **/
    public void adding30to60 () {
        for (int i = 0; i > label_30to60.size(); i++) {
            String count = String.valueOf(label_30to60.get(i).getText());
            System.out.println("Name of element in 30 to 60" + count);

            int b = 0;
            b = b + i;
            System.out.println("Sum of element in 30 to 60 :" + b);
        }
    }

        /*verify Display Total Values**/
        public void verifyDisplayTotalValues() throws InterruptedException {
            waitMethods.waitForElementToBeRefreshedAndIsVisible(label_CurrentTotal);
            Assert.assertTrue(label_CurrentTotal.isDisplayed());

            waitMethods.waitForElementToBeRefreshedAndIsVisible(getLabel_30to90Total);
            Assert.assertTrue(getLabel_30to90Total.isDisplayed());
            waitMethods.loadingWait(loder);

        }
        /*click On Location**/
         public void clickOnlocation  () throws InterruptedException {
             waitMethods.waitForElementToBeRefreshedAndClickable(label_Location);
             WebElementActions.getActions(driver).clickElement(label_Location);
             waitMethods.loadingWait(loder);
         }

        /*click on Finalize**/
     public void clickOnFinalize2 () throws InterruptedException {
         waitMethods.waitForElementToBeRefreshedAndClickable(Finalize);
         WebElementActions.getActions(driver).clickElement(Finalize);
         waitMethods.loadingWait(loder);
     }

      /*click on Unfinalized**/
        public void clickOnUnfinalized () throws InterruptedException {
            waitMethods.waitForElementToBeRefreshedAndClickable(label_UnFinalize);
            WebElementActions.getActions(driver).clickElement(label_UnFinalize);
            waitMethods.loadingWait(loder);
        }
      /*click on Delete **/
     public void clickOnDelete () throws InterruptedException {
         waitMethods.waitForElementToBeRefreshedAndClickable(label_Delete);
         WebElementActions.getActions(driver).clickElement(label_Delete);
         waitMethods.loadingWait(loder);

     }
     /*click on Yes **/
    public void clickOnYes () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(btn_Yes);
        WebElementActions.getActions(driver).clickElement(btn_Yes);
        waitMethods.loadingWait(loder);

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














