  package pages.parts;

import actions.LoginActions;
import actions.ReusableActions;
import actions.WaitActions;
import actions.WebElementActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import tests.TestDriverActions;
import tests.parts.Spotorderparts;
import utils.TestListener;
import utils.WaitMethods;

import java.io.FileNotFoundException;
import java.util.List;

public class Spotorderpart extends TestDriverActions {
    @FindBy(xpath = "(//a[text()='Spot Order']//parent::div)[1]")
    public WebElement label_SpotOrder;

    @FindBy(xpath = "//h1[contains(.,'Search Catalog')]")
    public WebElement label_SearchCatalog;

    @FindBy(xpath = "//select[contains(@id,'soc1::content')]")
    public WebElement label_SearchCatlogdropdown;

    @FindBy(xpath = "//input[contains(@id,'dc_it1::content')]")
    public WebElement label_SearchPartTextArea;

    @FindBy(xpath = "//span[text()='New Part']")
    public WebElement label_NewPart;

    @FindBy(xpath = "(//div[contains(@id,'pgl2')]/div/span)[1]")
    public WebElement text_OrderPart;

    @FindBy(xpath = "//h1[contains(.,'Order List')]")
    public WebElement label_OrderList;

    @FindBy(xpath = "//label[text()='Warehouse:']")
    public WebElement label_Warehouse;

    @FindBy(xpath = "(//label[text()='Total:'])[1]")
    public WebElement label_Total;

    @FindBy(xpath = "//span[text()='Refresh']")
    public WebElement btn_Refresh;

    @FindBy(xpath = "//span[text()='Part']")
    public WebElement txt_Part;

    @FindBy(xpath = "(//span[text()='UOM'])[1]")
    public WebElement txt_UOM;

    @FindBy(xpath = "//span[text()='Quantity']")
    public WebElement txt_Quantity;

    @FindBy(xpath = "//span[text()='Extended']")
    public WebElement txt_Extended;

    @FindBy(xpath = "//div[contains(@id,'t1::db')]")
    public WebElement txt_PleaseAddPartsFromTheCatalogList;

    @FindBy(xpath = "(//tr[contains(@id,'plam1')]/td[2])[1]")
    public WebElement txt_FullPartNumber;

    @FindBy(xpath = "(//div[contains(@id,'pgl2')]/div/span)[1]")
    public WebElement txt_OrderPartDescription;

    @FindBy(xpath = "(//label[text()='Part #:'])[1]")
    public WebElement label_Part;

    @FindBy(xpath = "(//label[text()='Price:'])[1]")
    public WebElement label_Price;

    @FindBy(xpath = "(//tr[contains(@id,'plam3')]/td[2])[1]")
    public WebElement label_PriceValue;

    @FindBy(xpath = "//td/table/tbody/tr[2]/td[2]/span")
    public WebElement label_TotalOrder;

    @FindBy(xpath = "(//label[text()='In Stock:'])[1]")
    public WebElement label_InStock;

    @FindBy(xpath = "(//tr[contains(@id,'plam2')]/td[2])[1]")
    public WebElement label_InStockValue;

    @FindBy(xpath = "(//label[text()='Notes:'])[1]")
    public WebElement label_Notes;

    @FindBy(xpath = "(//input[contains(@id,'ins1::content')])[1]")
    public WebElement label_value;

    @FindBy(xpath = "(//span[text()='Add'])[1]")
    public WebElement btn_Add;


    @FindBy(xpath = "(//td[contains(@id,'c5')]/span/span)[2]")
    public WebElement label_PartDescription;


    @FindBy(xpath = "(//td[contains(@id,'c5')]/span/span)[1]")
    public WebElement label_OrderpartDescription;

    @FindBy(xpath = "//table[contains(@id,':t1:0:pgl4')]")
    public WebElement label_FulPartNumber;

    @FindBy(xpath = "(//input[contains(@id,'ins2::content')])[1]")
    public WebElement label_Qauntityvalue;

    @FindBy(xpath = "(//span[contains(@id,'it7::content')])[1]")
    public WebElement label_Orderprice;

    @FindBy(xpath = "//span[contains(@id,'it2::content')]")
    public WebElement txt_TotalOrder;

    @FindBy(xpath = "//div[contains(@id,'t4::db')]")
    public WebElement label_UsetheSearchboxabovetosearchforparts;

    @FindBy(xpath = "//select[contains(@id,':soc1::content')]")
    public WebElement label_dropdown;

    @FindBy(xpath = "(//tr[contains(@id,'plam1')]/td[2])[1]")
    public WebElement label_SearchPartDescriptionsNumber;

    @FindBy(xpath = "(//tr[contains(@id,'plam1')]/td[2])[1]")
    public WebElement label_SearchPartDescription;


    @FindBy(xpath = "//table[contains(@id,'1:pgl4')]/tbody/tr/td[2]")
    public WebElement label_SeachPartDescriptionNumber;


    @FindBy(xpath = "//a[contains(@id,':ins1::increment')]")
    public WebElement label_aboveicon;


    @FindBy(xpath = "//a[contains(@id,':ins1::decrement')]")
    public WebElement label_Belowicon;

    @FindBy(xpath = "(//input[contains(@id,'ins2::content')])[1]")
    public WebElement label_PartQuantity;

    @FindBy(xpath = "//table[contains(@id,':t1:2:pgl4')]")
    public WebElement Text_CoreParentPart;

    @FindBy(xpath = "//label[text()='Total:']//parent::td//following-sibling::td//span")
    public WebElement label_CalculateOrderTotal;

    @FindBy(xpath = "//tr[2]/td[2]/span[contains(@id,':it2::content')]")
    public WebElement label_StoreText;

    @FindBy(xpath = "//a[contains(@id,'1:cil3')]/img")
    public WebElement label_Cancelimg;

    @FindBy(xpath = "//input[contains(@id,'ksq1:dc_it1::content')]")
    public WebElement input_PartSearchTextArea;

    @FindBy(xpath = "(//span[text()='Add'])[1]")
    public WebElement btn_ADD;

    @FindBy(xpath = "(//tr[2]/td/span/table/tbody/tr/td[2])[1]")
    public WebElement label_CoreParentPart;

    @FindBy(xpath = "(//tr[3]/td/span/table/tbody/tr/td[2])[1]")
    public WebElement label_CoreChildPart;

    @FindBy(linkText = "Issue PO")
    public WebElement btn_IssuePO;

    @FindBy(xpath = "//div[text()='Issue PO']")
    public WebElement label_IssuePO;

    @FindBy(xpath = "//span[text()='Vendor Name']")
    public WebElement label_VendorName;

    @FindBy(xpath = "//span[text()='Amount']")
    public WebElement label_Amount;

    @FindBy(xpath = "//th[contains(@id,'c16')]/div")
    public WebElement label_element;

    @FindBy(xpath = "//a[contains(@id,'cl8')]")
    public WebElement label_PartVendorName;

    @FindBy(xpath = "//td[contains(@id,'c12')]/span")
    public WebElement label_AmountValue;


    @FindBy(xpath = "//div[contains(@id,'cb13')]/a/span")
    public WebElement btn_Issuepo;

    @FindBy(xpath = "//div[text()='Purchase Order']")
    public WebElement label_PurchaseOrder;

    @FindBy(xpath = "//label[text()='Location:']//preceding-sibling::span")
    public WebElement label_RequiredLocation;

    @FindBy(xpath = "//label[text()='Location:']")
    public WebElement label_location;

    @FindBy(xpath = "//label[text()='Location:']//parent::td//following::td[3]/child::a")
    public WebElement label_LocationValue;

    @FindBy(xpath = "//label[text()='Vendor:']//preceding-sibling::span")
    public WebElement label_RequiredVendor;

    @FindBy(xpath = "//label[text()='Vendor:']")
    public WebElement label_vendor;

    @FindBy(xpath = "//label[text()='Vendor:']//parent::td//following::td[3]/child::a")
    public WebElement label_Vendorvalue;

    @FindBy(xpath = "//label[text()='PO#:']")
    public WebElement label_PO;

    @FindBy(xpath = "(//label[text()='PO#:']//parent::td//following::td)[1]")
    public WebElement label_POValue;

    @FindBy(xpath = "//label[text()='Reference:']")
    public WebElement label_Reference;

    @FindBy(xpath = "//span[contains(@id,':0:it1')]/child::input")
    public WebElement label_ReferenceTextarea;

    @FindBy(xpath = "//label[text()='PO Date:']")
    public WebElement label_PODate;

    @FindBy(xpath = "//a[contains(@id,'id1::glyph')]")
    public WebElement label_PODatePresent;


    @FindBy(xpath = "//tr[contains(@id,'plam24')]/td/label")
    public WebElement label_TransportPriority;

    @FindBy(xpath = "//select[contains(@id,'soc11::content')]")
    public WebElement TransportPriorityTextArea;

    @FindBy(xpath = "//tr[contains(@id,'plam511')]/td/label")
    public WebElement txt_Notes;

    @FindBy(xpath = "//textarea[contains(@id,'it2::content')]")
    public WebElement label_NotesTextArea;

    @FindBy(xpath = "//span[text()='Import Standard Notes']")
    public WebElement label_ImportStandardNotes;

    @FindBy(xpath = "//label[text()='Ship From:']")
    public WebElement label_ShipForm;

    @FindBy(xpath = "//label[text()='Ship From:']//parent::td//following::td[3]/child::a")
    public WebElement label_ShipFormValue;

    @FindBy(xpath = "//label[text()='Ship To:']")
    public WebElement label_ShipTo;

    @FindBy(xpath = "//label[text()='Ship To:']//parent::td//following::td[3]/child::a")
    public WebElement label_ShipToValue;

    @FindBy(xpath = "//label[text()='Submitted Date:']")
    public WebElement label_SubmittedDate;

    @FindBy(xpath = "//label[text()='Receiving Info:']")
    public WebElement label_ReceivingInfo;

    @FindBy(xpath = "(//label[text()='Receiving Info:']//following::td)[1]")
    public WebElement label_ReceivingInfoValue;

    @FindBy(xpath = "//img[contains(@id,'ciPOATT::icon')]")
    public WebElement img_Icon;

    @FindBy(xpath = "//a[contains(@id,'clPOATT')]")
    public WebElement label_Zero;

    @FindBy(xpath = "//label[text()='Voided Date:']")
    public WebElement label_VoidedDate;

    @FindBy(xpath = "//label[text()='Closed Date:']")
    public WebElement label_ClosedDate;

    @FindBy(xpath = "//label[text()='Parts:']")
    public WebElement Text_Part;

    @FindBy(xpath = "//label[text()='Parts:']//parent::td//following::td[4]/child::span")
    public WebElement label_PartValue;

    @FindBy(xpath = "//label[text()='Added Cost:']")
    public WebElement label_AddedCost;

    @FindBy(xpath = "//label[text()='Added Cost:']//parent::td/following::td[4]//child::a")
    public WebElement label_AddedCostValue;

    @FindBy(xpath = "//label[text()='Sub Total:']")
    public WebElement label_SubTotal;

    @FindBy(xpath = "//label[text()='Sub Total:']//parent::td//following::td[4]/child::span")
    public WebElement label_SubTotalValue;

    @FindBy(xpath = "//label[text()='Taxes:']")
    public WebElement label_Taxes;

    @FindBy(xpath = "(//label[text()='Taxes:']//parent::td//following::td//table)[1]")
    public WebElement label_TaxesValue;

    @FindBy(xpath = "//tr[contains(@id,':0:plam9')]//td//child::label")
    public WebElement txt_Total;

    @FindBy(xpath = "//table[contains(@id,'itSearchPartSelect')]/tbody/tr/td/span")
    public WebElement label_RequiredPart;

    @FindBy(xpath = "//table[contains(@id,'itSearchPartSelect')]/tbody/tr/td/label")
    public WebElement Txt_Part;

    @FindBy(xpath = "//input[contains(@id,'itSearchPartSelect::content')]")
    public WebElement input_PartTextArea;

    @FindBy(xpath = "//img[contains(@id,'cilF::icon')]")
    public WebElement label_SearchIcon;

    @FindBy(xpath = "(//label[text()='Qty:'])[1]")
    public WebElement label_Qty;


    @FindBy(xpath = "//input[contains(@id,'itaq::content')]")
    public WebElement label_Qtyvalue;

    @FindBy(xpath = "//span[contains(.,'Add Part')]")
    public WebElement label_AddPart;

    @FindBy(xpath = "//span[text()='Part #']")
    public WebElement label_PartHash;

    @FindBy(xpath = "//span[text()='Vendor Part #']")
    public WebElement label_VendorPart;

    @FindBy(xpath = "//span[text()='Description']")
    public WebElement label_Description;

    @FindBy(xpath = "//span[text()='Order Quantity']")
    public WebElement label_OrderQuantity;

    @FindBy(xpath = "(//th[contains(@id,'t1_itms:c1')])[1]")
    public WebElement label_UOM;

    @FindBy(xpath = "//span[text()='Stock UOM']")
    public WebElement label_StockUOM;

    @FindBy(xpath = "//span[text()='Conv']")
    public WebElement label_Conv;

    @FindBy(xpath = "//span[text()='Unit Cost']")
    public WebElement label_UnitCost;

    @FindBy(xpath = "//span[text()='Core']")
    public WebElement label_Core;

    @FindBy(xpath = "//span[text()='Extended Cost']")
    public WebElement label_ExtendedCost;

    @FindBy(xpath = "//th[contains(@id,'t1_itms:cDelIt')]/div")
    public WebElement label_CancelIcon;

    @FindBy(xpath = "//span[contains(.,'Link/Delink Lab')]")
    public WebElement label_LinkDelinkLabor;

    @FindBy(xpath = "(//td[contains(@id,'t1_itms:0:c6')]/span)[1]")
    public WebElement label_OrderpartDescriptionNotes;

    @FindBy(xpath = "(//input[contains(@id,'it9::content')])[1]")
    public WebElement input_value;

    @FindBy(xpath = "(//img[contains(@id,'ciDeleteItem::icon')])[1]")
    public WebElement label_DeleteIcon;

    @FindBy(xpath = "(//td[contains(@id,'cActLink')]/descendant::a)[1]")
    public WebElement btn_Link;

    @FindBy(xpath = "//span[contains(.,'Copy PO')]")
    public WebElement btn_CopyPO;

    @FindBy(xpath = "//span[contains(.,'Void')]")
    public WebElement btn_void;

    @FindBy(xpath = "//div[contains(@id,'ctbOK')]/a/span")
    public WebElement btn_Ok;

    @FindBy(xpath = "//span[contains(.,'Submit / Print PO')]")
    public WebElement btn_SubmitPrintPO;

    @FindBy(xpath = "//div[contains(@id,':spotOrderTab::tiB')]//following::div[8]/child::a[contains(.,'WIP')]")
    public WebElement label_WIPPOs;

    @FindBy(xpath = "//h1[contains(.,'WIP POs')]")
    public WebElement txt_WIPPOs;

    @FindBy(xpath = "//label[text()='Warehouse:']")
    public WebElement txt_Warehouse;

    @FindBy(xpath = "//select[contains(@id,'soc1::content')]")
    public WebElement input_WarehouseTextArea;
    @FindBy(xpath = "//label[text()='Search:']")
    public WebElement label_Search;

    @FindBy(xpath = "//input[contains(@id,'itSearch::content')]")
    public WebElement input_SearchTextArea;

    @FindBy(xpath = "//span[text()='Refresh']")
    public WebElement btn_RefreshButton;

    @FindBy(xpath = "//span[text()='Order #']")
    public WebElement label_Order;

    @FindBy(xpath = "//th[contains(@id,'t9_opPO:c27')]/descendant::span")
    public WebElement label_Date;

    @FindBy(xpath = "//span[text()='Vendor']")
    public WebElement Text_vendor;

    @FindBy(xpath = "//span[text()='Warehouse']")
    public WebElement Text_Warehouse;

    @FindBy(xpath = "//span[text()='Reference']")
    public WebElement Text_Reference;

    @FindBy(xpath = "//span[text()='Status']")
    public WebElement txt_Status;

    @FindBy(xpath = "(//a[contains(@id,'cil5')]/span)[1]")
    public WebElement label_PoNumber;


    @FindBy(xpath = "(//label[text()='PO#:']//parent::td//following-sibling::td)[2]")
    public WebElement label_PONumber;

    @FindBy(xpath = "(//label[text()='Total:']//parent::td//following-sibling::td)[2]")
    public WebElement label_OrderTotal;

    @FindBy(xpath = "(//span[contains(.,'Heathrow Truck Centre')])[1]")
    public WebElement txt_VendorName;

    @FindBy(xpath = "//a[contains(@id,':t9_opPO:0:cil5')]//following::td[2]")
    public WebElement txt_Vendorname;

    @FindBy(xpath = "(//td[contains(.,'Open')])[1]")
    public WebElement label_Open;

    @FindBy(xpath = "//h1[contains(.,'Order Summary')]")
    public WebElement label_OrderSummary;

    @FindBy(xpath = "(//label[text()='Vendor:'])[1]")
    public WebElement text_Vendor;

    @FindBy(xpath = "(//label[text()='Vendor:']/parent::td//following::td/child::span)[1]")
    public WebElement input_VendorValue;

    @FindBy(xpath = "//label[text()='Address:']")
    public WebElement label_Address;

    @FindBy(xpath = "(//tr[contains(@id,'plam5')]/td/label)[1]")
    public WebElement label_PoDate;

    @FindBy(xpath = "//table[contains(@id,'pgl4')]/tbody/tr/td[2]/span")
    public WebElement label_POPartCost;

    @FindBy(xpath = "//tr[contains(@id,':0:r2:2:plam9')]//td[3]/child::span")
    public WebElement Text_OrderTotal;


    @FindBy(xpath = "(//div[contains(@id,':r2:0:t3')]//following::div[6]//child::a//span[text()='Submit / Print PO'])[2]")
    public WebElement label_SubmitPrintPOButton;

    @FindBy(xpath = "//div[contains(@id,':0:r2:2:cb3')]//a/child::span")
    public WebElement btn_SubmitPrintPOButton;


//    @FindBy(xpath = "//span[text()='Sign Out']")
    @FindBy(xpath = "(//span[contains(@id,'si1')]/following::td)[4]")
    public WebElement label_Signout;

    @FindBy(xpath = "//input[contains(@id,'username::content')]")
    public WebElement label_UserNameTextArea;

    @FindBy(xpath = "//h1[text()='Working...Please Wait']")
    List<WebElement> loder;

    @FindBy(xpath = "//a[text()='Parts']")
    WebElement Parts;

    @FindBy(xpath = "//td[text()='Order Parts']")
    WebElement OrderParts;

    public Spotorderpart(WebDriver driver){
        this.driver = driver;
        this.waitMethods = new WaitMethods(driver);
        this.webElementActions = new WebElementActions(driver);

    }

    /**
     * goto order parts Screen
     */
     public void gotoOrderPartsScreen() throws FileNotFoundException, InterruptedException {
 //        waitMethods.loadingWait(loder);
 //       Thread.sleep(3000);
//        ReusableActions.getActions().clickParentMenu("Parts");
//        ReusableActions.getActions().clickChildMenu("Order Parts");

         waitMethods.waitForElementToBeRefreshedAndClickable(Parts);
         WebElementActions.getActions(driver).clickElement(Parts);

         waitMethods.waitForElementToBeRefreshedAndClickable(OrderParts);
         WebElementActions.getActions(driver).clickElement(OrderParts);

        TestListener.saveScreenshotPNG(driver);

    }

    /**
     * click On spot Order
     */
     public void clickOnSpotOrder() throws InterruptedException {
         waitMethods.waitForElementToBeRefreshedAndClickable(label_SpotOrder);
        WebElementActions.getActions(driver).clickElement(label_SpotOrder);
        TestListener.saveScreenshotPNG(driver);
    }

    /**
     * verify Search CatlogDropdown
     */
     public void verifySearchCatlogDropDown() throws InterruptedException {

         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_SearchCatlogdropdown);
        Assert.assertTrue(label_SearchCatlogdropdown.isDisplayed());
    }

    /**
     * verify Search TextArea
     */
    public void verifySearchTextArea() throws InterruptedException {

        waitMethods.waitForElementToBeRefreshedAndIsVisible(label_SearchPartTextArea);
        Assert.assertTrue(label_SearchPartTextArea.isDisplayed());

    }

    /**
     * verify New Part
     */
     public void verifyNewPart() throws InterruptedException {

         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_NewPart);
        Assert.assertTrue(label_NewPart.isDisplayed());
    }

    /**
     * verify Order Parts
     */
    public void verifyOrderPart() throws InterruptedException {

        waitMethods.waitForElementToBeRefreshedAndIsVisible(text_OrderPart);
        Assert.assertTrue(text_OrderPart.isDisplayed());
    }

    /**
     * verify Order List
     */
     public void verifyOrderList() throws InterruptedException {

         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_OrderList);
        Assert.assertTrue(label_OrderList.isDisplayed());
    }

    /**
     * verify Warehouse
     */
     public void verifyWarehouse() throws InterruptedException {

         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_Warehouse);
        Assert.assertTrue(label_Warehouse.isDisplayed());
    }

    /**
     * verify TotalText
     */
     public void verifyTotalText() throws InterruptedException {

         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_Total);
        Assert.assertTrue(label_Total.isDisplayed());
    }

    /**
     * verify Refresh Text
     */
     public void verifyRefreshText() throws InterruptedException {

         waitMethods.waitForElementToBeRefreshedAndIsVisible(btn_Refresh);
        Assert.assertTrue(btn_Refresh.isDisplayed());
    }

    /**
     * verify TextPart
     */
     public void verifyTextPart() throws InterruptedException {

         waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_Part);
        Assert.assertTrue(txt_Part.isDisplayed());
    }

    /**
     * verify Text
     */
     public void verifyTextUOM() throws InterruptedException {

         waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_UOM);
        Assert.assertTrue(txt_UOM.isDisplayed());
    }

    /**
     * verify Quantity
     */
     public void verifyQuantity() throws InterruptedException {
         waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_Quantity);
        Assert.assertTrue(txt_Quantity.isDisplayed());
    }

    /**
     * verify Extended
     */
     public void verifyExtended() throws InterruptedException {
         waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_Extended);
        Assert.assertTrue(txt_Extended.isDisplayed());
    }

    /**
     * Please Add parts from the catalog list
     */
     public void verifyPleaseAddPart() throws InterruptedException {
         waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_PleaseAddPartsFromTheCatalogList);
        Assert.assertTrue(txt_PleaseAddPartsFromTheCatalogList.isDisplayed());
        TestListener.saveScreenshotPNG(driver);

    }

    /**
     * input partial part number
     */
     public void inputPartialPartNumber() throws InterruptedException {
         if(LoginActions.environmentName.contains("EC")) {
             waitMethods.waitForElementToBeRefreshedAndIsVisible(label_SearchPartTextArea);
             WebElementActions.getActions(driver).inputText(label_SearchPartTextArea, appProp7.getProperty("PartialPartNumber"));
         } else if(LoginActions.environmentName.contains("EU")){
             waitMethods.waitForElementToBeRefreshedAndIsVisible(label_SearchPartTextArea);
             WebElementActions.getActions(driver).inputText(label_SearchPartTextArea, appProp20.getProperty("PartialPartNumber"));
         } else if(LoginActions.environmentName.contains("NA")){
             waitMethods.waitForElementToBeRefreshedAndIsVisible(label_SearchPartTextArea);
             WebElementActions.getActions(driver).inputText(label_SearchPartTextArea, appProp35.getProperty("PartialPartNumber"));
         }else if(LoginActions.environmentName.contains("QA")){
             waitMethods.waitForElementToBeRefreshedAndIsVisible(label_SearchPartTextArea);
             WebElementActions.getActions(driver).inputText(label_SearchPartTextArea, appProp.getProperty("PartialPartNumber"));
         }

         waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);

    }


    /**
     * verify Full Part Number
     */
     public void verifyFullPartNumber() throws InterruptedException {
         waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_FullPartNumber);
        Assert.assertTrue(txt_FullPartNumber.isDisplayed());
    }

    /**
     * verify Order Part Description
     */
     public void verifyOrderPArtDescription() throws InterruptedException {

         waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_OrderPartDescription);
        Assert.assertTrue(txt_OrderPartDescription.isDisplayed());
         waitMethods.loadingWait(loder);
    }

    /**
     * verify Part Text
     */
     public void verifyPartText() throws InterruptedException {
         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_Part);
        Assert.assertTrue(label_Part.isDisplayed());
    }

    /**
     * verify price and Price Value
     */
     public void verifyPrice() throws InterruptedException {
         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_Price);
        Assert.assertTrue(label_Price.isDisplayed());

         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_PriceValue);
        Assert.assertTrue(label_PriceValue.isDisplayed());

    }

    /**
     * verify InStock and InStock Value
     */
     public void verifyInStock() throws InterruptedException {

         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_InStock);
        Assert.assertTrue(label_InStock.isDisplayed());

         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_InStockValue);
        Assert.assertTrue(label_InStockValue.isDisplayed());

    }

    /**
     * verify Notes
     */
     public void verifyNotes() throws InterruptedException {

         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_Notes);
        Assert.assertTrue(label_Notes.isDisplayed());

    }

    /**
     * verify value
     */
     public void verifyValue() throws InterruptedException {

         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_value);
        Assert.assertTrue(label_value.isDisplayed());

    }

    /**
     * clck On Add Button
     */
     public void clickOnAddButton() throws InterruptedException {

         waitMethods.waitForElementToBeRefreshedAndClickable(btn_Add);
        WebElementActions.getActions(driver).clickElement(btn_Add);
        TestListener.saveScreenshotPNG(driver);

    }

    /**
     * verify Order Part Description
     */
     public void verifyOrderpartDescription() throws InterruptedException {
         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_OrderpartDescription);
        Assert.assertTrue(label_OrderpartDescription.isDisplayed());

    }

    /**
     * verify Full Part Number
     */
     public void verifyFuLLPartNumber() throws InterruptedException {
         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_FulPartNumber);
        Assert.assertTrue(label_FulPartNumber.isDisplayed());
    }

    /**
     * verify Qauntity Value
     */
     public void verifyQauntityValue() throws InterruptedException {
         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_Qauntityvalue);
        Assert.assertTrue(label_Qauntityvalue.isDisplayed());
    }

    /**
     * verify order price
     */
     public void verifyorderprice() throws InterruptedException {
         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_Orderprice);
        Assert.assertTrue(label_Orderprice.isDisplayed());
    }

    /**
     * verify Total Order
     */
     public void verifyTotalOrder() throws InterruptedException {
         waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_TotalOrder);
        Assert.assertTrue(txt_TotalOrder.isDisplayed());

        Assert.assertTrue(label_Orderprice.isDisplayed());
        Assert.assertTrue(txt_TotalOrder.isDisplayed());
         waitMethods.loadingWait(loder);
    }

    /**
     * input part Name Wrench Wheel brace
     */
     public void inputPartNameWrenchWheelbrace() throws InterruptedException {

         if(LoginActions.environmentName.contains("EC")) {
             waitMethods.waitForElementToBeRefreshedAndClickable(label_SearchPartTextArea);
             WebElementActions.getActions(driver).inputText(label_SearchPartTextArea, appProp7.getProperty("SearchPartDescription"));
         } else if(LoginActions.environmentName.contains("EU")){
             waitMethods.waitForElementToBeRefreshedAndClickable(label_SearchPartTextArea);
             WebElementActions.getActions(driver).inputText(label_SearchPartTextArea, appProp20.getProperty("SearchPartDescription"));
         } else if(LoginActions.environmentName.contains("NA")){
             waitMethods.waitForElementToBeRefreshedAndClickable(label_SearchPartTextArea);
             WebElementActions.getActions(driver).inputText(label_SearchPartTextArea, appProp35.getProperty("SearchPartDescription"));
         }else if(LoginActions.environmentName.contains("QA")){
             waitMethods.waitForElementToBeRefreshedAndClickable(label_SearchPartTextArea);
             WebElementActions.getActions(driver).inputText(label_SearchPartTextArea, appProp.getProperty("SearchPartDescription"));
         }


           waitMethods.waitForElementToBeRefreshedAndIsVisible(label_UsetheSearchboxabovetosearchforparts);
            Assert.assertTrue(label_UsetheSearchboxabovetosearchforparts.isDisplayed());

        }

    /**
     * Select PartDescription Dropdown
     */
     public void selectPartDescriptionDropdown() throws InterruptedException {

         waitMethods.waitForElementToBeRefreshedAndClickable(label_dropdown);
        Select objSelect = new Select(label_dropdown);
        objSelect.selectByVisibleText("By Description");
         waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }

    /**
     * click On Add
     */
     public void clickOnAdd() throws InterruptedException {
         waitMethods.waitForElementToBeRefreshedAndClickable(btn_Add);
        WebElementActions.getActions(driver).clickElement(btn_Add);
         waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }

    /**
     * verify Search Part Description
     */
     public void verifySearchPartDescription() throws InterruptedException {

         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_PartDescription);
        Assert.assertTrue(label_PartDescription.isDisplayed());
    }

    /**
     * SearchPartDescriptionsNumber
     */
     public void verifySearchPartDescriptionNumber() throws InterruptedException {
         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_SeachPartDescriptionNumber);
        Assert.assertTrue(label_SeachPartDescriptionNumber.isDisplayed());
    }

    /**
     * verify price Order
     */
     public void verifypriceOrder() throws InterruptedException {
         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_Orderprice);
        Assert.assertTrue(label_Orderprice.isDisplayed());

    }

    /**
     * verify Part price
     */
     public void verifyPartPrice() throws InterruptedException {

         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_PriceValue);
        Assert.assertTrue(label_PriceValue.isDisplayed());
    }

    /**
     * verify Total Order Price
     */
     public void verifyTotalOrderPrice() throws InterruptedException {

         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_TotalOrder);
        Assert.assertTrue(label_TotalOrder.isDisplayed());
    }
    /**
     * verify Part price Two and Total Order
     */
     public void verifyPartPriceTwo() throws InterruptedException {
         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_PriceValue);
        Assert.assertTrue(label_PriceValue.isDisplayed());

         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_TotalOrder);
        Assert.assertTrue(label_TotalOrder.isDisplayed());
    }


    /**
     * SelectExactPart
     */
     public void SelectExactPart() throws InterruptedException {

         waitMethods.waitForElementToBeRefreshedAndClickable(label_dropdown);
        Select objSelect = new Select(label_dropdown);
        objSelect.selectByVisibleText("Exact Part #");
         waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }

    /**
     * Input Full Part Number
     */
     public void InputFullPartNumber() throws InterruptedException {

         if(LoginActions.environmentName.contains("EC")) {
             waitMethods.waitForElementToBeRefreshedAndClickable(label_SearchPartTextArea);
             WebElementActions.getActions(driver).inputText(label_SearchPartTextArea,appProp7.getProperty("FullPartNumber"));
         } else if(LoginActions.environmentName.contains("EU")){
             waitMethods.waitForElementToBeRefreshedAndClickable(label_SearchPartTextArea);
             WebElementActions.getActions(driver).inputText(label_SearchPartTextArea,appProp20.getProperty("FullPartNumber"));
         } else if(LoginActions.environmentName.contains("NA")){
             waitMethods.waitForElementToBeRefreshedAndClickable(label_SearchPartTextArea);
             WebElementActions.getActions(driver).inputText(label_SearchPartTextArea,appProp35.getProperty("FullPartNumber"));
         }else if(LoginActions.environmentName.contains("QA")){
             waitMethods.waitForElementToBeRefreshedAndClickable(label_SearchPartTextArea);
             WebElementActions.getActions(driver).inputText(label_SearchPartTextArea,appProp.getProperty("FullPartNumber"));
         }

         waitMethods.loadingWait(loder);
         waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_FullPartNumber);
            Assert.assertTrue(txt_FullPartNumber.isDisplayed());
            TestListener.saveScreenshotPNG(driver);

        }

    /**
     * verify value
     */
     public void verifyValueTwo() throws InterruptedException {

         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_value);
        Assert.assertTrue(label_value.isDisplayed());

    }

    /**
     * input Quantity value
     */
     public void inputQuantityValue() throws InterruptedException {

         if(LoginActions.environmentName.contains("EC")) {
             waitMethods.waitForElementToBeRefreshedAndClickable(label_value);
             label_value.clear();
             WebElementActions.getActions(driver).inputText(label_value, appProp7.getProperty("value"));
         } else if(LoginActions.environmentName.contains("EU")){
             waitMethods.waitForElementToBeRefreshedAndClickable(label_value);
             label_value.clear();
             WebElementActions.getActions(driver).inputText(label_value, appProp20.getProperty("value"));
         } else if(LoginActions.environmentName.contains("NA")){
             waitMethods.waitForElementToBeRefreshedAndClickable(label_value);
             label_value.clear();
             WebElementActions.getActions(driver).inputText(label_value, appProp35.getProperty("value"));
         }else if(LoginActions.environmentName.contains("QA")){
             waitMethods.waitForElementToBeRefreshedAndClickable(label_value);
             label_value.clear();
             WebElementActions.getActions(driver).inputText(label_value, appProp.getProperty("value"));
         }


         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_value);
            Assert.assertTrue(label_value.isDisplayed());
            TestListener.saveScreenshotPNG(driver);

        }

    /**
     * click on Increrement and verify value
     */
     public void clickOnIncerement() throws InterruptedException {

         waitMethods.waitForElementToBeRefreshedAndClickable(label_aboveicon);
        WebElementActions.getActions(driver).clickElement(label_aboveicon);

         waitMethods.waitForElementToBeRefreshedAndClickable(label_value);
        Assert.assertTrue(label_value.isDisplayed());
        TestListener.saveScreenshotPNG(driver);

    }

    /**
     * click on Decrement and verify Value
     */
     public void clickOnDecrement() throws InterruptedException {

         waitMethods.waitForElementToBeRefreshedAndClickable(label_Belowicon);
        WebElementActions.getActions(driver).clickElement(label_Belowicon);

         waitMethods.waitForElementToBeRefreshedAndClickable(label_value);
        Assert.assertTrue(label_value.isDisplayed());
        TestListener.saveScreenshotPNG(driver);
    }

    /**
     * click On Add Button
     */
     public void clickOnAddbutton() throws InterruptedException {

         waitMethods.waitForElementToBeRefreshedAndClickable(btn_Add);
        WebElementActions.getActions(driver).clickElement(btn_Add);
        TestListener.saveScreenshotPNG(driver);
    }

    /**
     * verify On Value Three
     */
     public void verifyOnValueThree() throws InterruptedException {
         waitMethods.waitForElementToBeRefreshedAndClickable(label_Belowicon);
        WebElementActions.getActions(driver).clickElement(label_Belowicon);

         waitMethods.waitForElementToBeRefreshedAndClickable(label_value);
        Assert.assertTrue(label_value.isDisplayed());
        TestListener.saveScreenshotPNG(driver);

    }

    /**
     * verify Calaculated Order Total  and Store Text
     */
     public void verifyCalculatedOrderTotal() throws InterruptedException {
         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_PartQuantity);
        Assert.assertTrue(label_PartQuantity.isDisplayed());
         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_StoreText);
        Assert.assertTrue(label_StoreText.isDisplayed());
        TestListener.saveScreenshotPNG(driver);

    }

    /**
     * click on cancel Img and  Order Total
     */
     public void clickOnlabelPartQuantity() throws InterruptedException {
         waitMethods.waitForElementToBeRefreshedAndClickable(label_Cancelimg);
        WebElementActions.getActions(driver).clickElement(label_Cancelimg);

         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_PartQuantity);
        Assert.assertTrue(label_PartQuantity.isDisplayed());
        TestListener.saveScreenshotPNG(driver);

    }

    /**
     * input core parent part
     */
     public void inputCoreParentPart() throws InterruptedException {

         if(LoginActions.environmentName.contains("EC")) {
             waitMethods.waitForElementToBeRefreshedAndClickable(label_SearchPartTextArea);
             WebElementActions.getActions(driver).inputText(label_SearchPartTextArea, appProp7.getProperty("CoreParentPart"));
             waitMethods.loadingWait(loder);
         } else if(LoginActions.environmentName.contains("EU")){
             waitMethods.waitForElementToBeRefreshedAndClickable(label_SearchPartTextArea);
             WebElementActions.getActions(driver).inputText(label_SearchPartTextArea, appProp20.getProperty("CoreParentPart"));
             waitMethods.loadingWait(loder);
         } else if(LoginActions.environmentName.contains("NA")){
             waitMethods.waitForElementToBeRefreshedAndClickable(label_SearchPartTextArea);
             WebElementActions.getActions(driver).inputText(label_SearchPartTextArea, appProp35.getProperty("CoreParentPart"));
             waitMethods.loadingWait(loder);
         }else if(LoginActions.environmentName.contains("QA")){
             waitMethods.waitForElementToBeRefreshedAndClickable(label_SearchPartTextArea);
             WebElementActions.getActions(driver).inputText(label_SearchPartTextArea, appProp.getProperty("CoreParentPart"));
             waitMethods.loadingWait(loder);
         }


         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_CalculateOrderTotal);
            Assert.assertTrue(label_CalculateOrderTotal.isDisplayed());
            TestListener.saveScreenshotPNG(driver);


    }


    /**click On Add Button */
    public void verifyAddButton () throws InterruptedException {

        waitMethods.waitForElementToBeRefreshedAndClickable(btn_Add);
        WebElementActions.getActions(driver).clickElement(btn_Add);
        TestListener.saveScreenshotPNG(driver);

    }

    /**verify Core Parent Part */
     public void verifyCoreParentpart () throws InterruptedException {

         waitMethods.waitForElementToBeRefreshedAndIsVisible(Text_CoreParentPart);
        Assert.assertTrue(label_CoreParentPart.isDisplayed());


    }
    /**verify Child Part */
     public void  verifyChildPart () throws InterruptedException {

         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_CoreChildPart);
        Assert.assertTrue(label_CoreChildPart.isDisplayed());

    }

    /** verify Store Text Order Total */
     public void verifyStoreTextOrderTotal () throws InterruptedException {
         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_StoreText);
        Assert.assertTrue(label_StoreText.isDisplayed());

    }
    /**click On Issue PO */
    public void clickOnIssuePO () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(btn_IssuePO);
        WebElementActions.getActions(driver).clickElement(btn_IssuePO);
        waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);

    }
    /**verify On Issue Po */
     public void verifyOnIssuePO () throws InterruptedException {

         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_IssuePO);
        Assert.assertTrue(label_IssuePO.isDisplayed());
    }
    /**verify Vendor Name */
     public void verifyVendorName () throws InterruptedException {

         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_VendorName);
        Assert.assertTrue(label_VendorName.isDisplayed());
    }
    /**verify Amount */
     public void verifyAmout () throws InterruptedException {
         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_Amount);
        Assert.assertTrue(label_Amount.isDisplayed());

    }
    /**verify Cancel Element */
     public void verifyCancelElement () throws InterruptedException {
         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_element);
        Assert.assertTrue(label_element.isDisplayed());
    }
    /**verify Part Vendor Name */
     public void verifyPartVendorName () throws InterruptedException {

         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_PartVendorName);
        Assert.assertTrue(label_PartVendorName.isDisplayed());
    }
    /**verify Order Total */
     public void verifyOrderTotal () throws InterruptedException {

         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_AmountValue);
        Assert.assertTrue(label_AmountValue.isDisplayed());
         waitMethods.loadingWait(loder);
    }

    /**click On Issue Po Button */
     public void clickOnIssuePOButton () throws InterruptedException {

         waitMethods.waitForElementToBeRefreshedAndClickable(btn_Issuepo);
        WebElementActions.getActions(driver).clickElement(btn_Issuepo);
//        Thread.sleep(3000);
         waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);

    }
    /**verify Purches Order */
     public void verifyPurchesOrder () throws InterruptedException {

         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_PurchaseOrder);
        Assert.assertTrue(label_PurchaseOrder.isDisplayed());


    }
    /**verify Required Location, Location , Location Value */
     public void RequiredLocation () throws InterruptedException {

         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_RequiredLocation);
        Assert.assertTrue(label_RequiredLocation.isDisplayed());

         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_location);
        Assert.assertTrue(label_location.isDisplayed());

         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_LocationValue);
        Assert.assertTrue(label_LocationValue.isDisplayed());
    }
    /**verify Required vendor , vendor ,vendor value */
     public void verifyRequiredVendor () throws InterruptedException {
         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_RequiredVendor);
        Assert.assertTrue(label_RequiredVendor.isDisplayed());

         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_vendor);
        Assert.assertTrue(label_vendor.isDisplayed());

         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_Vendorvalue);
        Assert.assertTrue(label_Vendorvalue.isDisplayed());
    }
    /**verify PO#  and PO# Value */
     public void verifyPO () throws InterruptedException {
         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_PO);
        Assert.assertTrue(label_PO.isDisplayed());

         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_POValue);
        Assert.assertTrue(label_POValue.isDisplayed());
    }
    /**verify Referance  and Referance TextArea */
     public void verifyReferance () throws InterruptedException {
         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_Reference);
        Assert.assertTrue(label_Reference.isDisplayed());

         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_ReferenceTextarea);
        Assert.assertTrue(label_ReferenceTextarea.isDisplayed());
        TestListener.saveScreenshotPNG(driver);
    }
    /**verify PO Date and PO Date Present */
     public void verifyPODate () throws InterruptedException {

         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_PODate);
        Assert.assertTrue(label_PODate.isDisplayed());

         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_PODatePresent);
        Assert.assertTrue(label_PODatePresent.isDisplayed());

    }
    /**verify TransPortPriority and verify Transport PriorityTextArea*/
     public void verifyTransPOrtPriority () throws InterruptedException {

         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_TransportPriority);
        Assert.assertTrue(label_TransportPriority.isDisplayed());

         waitMethods.waitForElementToBeRefreshedAndIsVisible(TransportPriorityTextArea);
        Assert.assertTrue(TransportPriorityTextArea.isDisplayed());
    }
    /**verify Notes TextArea */
     public void verifyNotesTextArea() throws InterruptedException {
         waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_Notes);
         Assert.assertTrue(txt_Notes.isDisplayed());

        waitMethods.waitForElementToBeRefreshedAndIsVisible(label_NotesTextArea);
        Assert.assertTrue(label_NotesTextArea.isDisplayed());

         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_ImportStandardNotes);
         Assert.assertTrue(label_ImportStandardNotes.isDisplayed());
    }
    /**verify ShipFrom  and shipForm value */
     public void verifyShipForm () throws InterruptedException {
         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_ShipForm);
        Assert.assertTrue(label_ShipForm.isDisplayed());

         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_ShipFormValue);
        Assert.assertTrue(label_ShipFormValue.isDisplayed());
    }
    /**verify ShipTo and ShipToValue */
     public void verifyShipTo () throws InterruptedException {
         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_ShipTo);
        Assert.assertTrue(label_ShipTo.isDisplayed());

         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_ShipToValue);
        Assert.assertTrue(label_ShipToValue.isDisplayed());
    }
    /**verify Submitted Date */
     public void verifySubmittedDate () throws InterruptedException {
         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_SubmittedDate);
        Assert.assertTrue(label_SubmittedDate.isDisplayed());
    }
    /**verify Receiving Info and Receving Info value  */
     public void verifyReceivingInfo () throws InterruptedException {
         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_ReceivingInfo);
        Assert.assertTrue(label_ReceivingInfo.isDisplayed());

         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_ReceivingInfoValue);
        Assert.assertTrue(label_ReceivingInfoValue.isDisplayed());
    }
    /**verify Image Icon and zero Img*/
     public void verifyImageIcon () throws InterruptedException {
         waitMethods.waitForElementToBeRefreshedAndIsVisible(img_Icon);
        Assert.assertTrue(img_Icon.isDisplayed());

         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_Zero);
        Assert.assertTrue(label_Zero.isDisplayed());
    }
    /**verify Void Date*/
     public void verifyVoidDate () throws InterruptedException {
         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_VoidedDate);
        Assert.assertTrue(label_VoidedDate.isDisplayed());
        TestListener.saveScreenshotPNG(driver);

    }
    /**verify Closed Date */
     public  void  verifyClosedDate () throws InterruptedException {
         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_ClosedDate);
        Assert.assertTrue(label_ClosedDate.isDisplayed());
    }
    /**verify Part and part value */
     public void verifyPart () throws InterruptedException {
         waitMethods.waitForElementToBeRefreshedAndIsVisible(Text_Part);
        Assert.assertTrue(Text_Part.isDisplayed());

         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_PartValue);
        Assert.assertTrue(label_PartValue.isDisplayed());
    }
    /**verify Add Cost and Add cost value */
     public void  verifyAddCost () throws InterruptedException {
         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_AddedCost);
        Assert.assertTrue(label_AddedCost.isDisplayed());

         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_AddedCostValue);
        Assert.assertTrue(label_AddedCostValue.isDisplayed());
    }
    /**verify SubTotal and SubTotal value */
     public void verifySubTotal () throws InterruptedException {
         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_SubTotal);
        Assert.assertTrue(label_SubTotal.isDisplayed());

         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_SubTotalValue);
        Assert.assertTrue(label_SubTotalValue.isDisplayed());
    }
    /**verify Taxes and Taxes Value */
     public void verifyTaxes () throws InterruptedException {
         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_Taxes);
        Assert.assertTrue(label_Taxes.isDisplayed());

         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_TaxesValue);
        Assert.assertTrue(label_TaxesValue.isDisplayed());
    }
    /**verify Total */
     public void verifyTotal () throws InterruptedException {
         waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_Total);
        Assert.assertTrue(txt_Total.isDisplayed());
    }
    /**verify Required Part ,PArt,Part TextArea */
     public void verifyRequiredPart () throws InterruptedException {
         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_RequiredPart);
        Assert.assertTrue(label_RequiredPart.isDisplayed());

         waitMethods.waitForElementToBeRefreshedAndIsVisible(Txt_Part);
        Assert.assertTrue(Txt_Part.isDisplayed());

         waitMethods.waitForElementToBeRefreshedAndIsVisible(input_PartTextArea);
        Assert.assertTrue(input_PartTextArea.isDisplayed());
    }
    /**verify Search Icon */
     public void  verifySearchIcon () throws InterruptedException {
         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_SearchIcon);
        Assert.assertTrue(label_SearchIcon.isDisplayed());
    }
    /**verify QTY and QTY value */
     public void verifyQTY () throws InterruptedException {
         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_Qty);
        Assert.assertTrue(label_Qty.isDisplayed());

         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_Qtyvalue);
        Assert.assertTrue(label_Qtyvalue.isDisplayed());
    }
    /**verify Add Part */
     public  void verifyAddPart  () throws InterruptedException {
         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_AddPart);
        Assert.assertTrue(label_AddPart.isDisplayed());
    }
    /**verify Part# */
     public void verifyPartHash () throws InterruptedException {
         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_PartHash);
        Assert.assertTrue(label_PartHash.isDisplayed());
    }
    /**verify vendor Part */
     public void verifyVendorPart () throws InterruptedException {
         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_VendorPart);
        Assert.assertTrue(label_VendorPart.isDisplayed());
    }
    /**verify Description */
     public void verifyDescription () throws InterruptedException {
         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_Description);
        Assert.assertTrue(label_Description.isDisplayed());
    }
    /**verify Order Quantity */
     public void verifyOrderQuantity () throws InterruptedException {
         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_OrderQuantity);
        Assert.assertTrue(label_OrderQuantity.isDisplayed());
    }
    /**verify UQM and Stock UQM */
     public  void verifyUOM () throws InterruptedException {
         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_UOM);
        Assert.assertTrue(label_UOM.isDisplayed());

         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_StockUOM);
        Assert.assertTrue(label_StockUOM.isDisplayed());
    }
    /**verify Conv*/
     public void verifyConv () throws InterruptedException {

         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_Conv);
        Assert.assertTrue(label_Conv.isDisplayed());
    }
    /**verify Unit Cost */
     public void verifyUnitCost () throws InterruptedException {
         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_UnitCost);
        Assert.assertTrue(label_UnitCost.isDisplayed());
    }
    /**verify core */
     public void verifyCore () throws InterruptedException {
         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_Core);
        Assert.assertTrue(label_Core.isDisplayed());
    }
    /**verify Extended cost*/
     public void verifyExtendedCost () throws InterruptedException {
         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_ExtendedCost);
        Assert.assertTrue(label_ExtendedCost.isDisplayed());
    }
    /**verify cancel Icon */
     public void verifyCancelIcon () throws InterruptedException {

         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_CancelIcon);
        Assert.assertTrue(label_CancelIcon.isDisplayed());
    }
    /** verify Link/Delink Loabor */
     public void verifyLinkDeLinkLabor () throws InterruptedException {
         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_LinkDelinkLabor);
        Assert.assertTrue(label_LinkDelinkLabor.isDisplayed());
    }
    /** verify Order Part Description */
     public void verifyOrderPartDescription () throws InterruptedException {
         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_OrderpartDescriptionNotes);
        Assert.assertTrue(label_OrderpartDescriptionNotes.isDisplayed());
    }
    /**verify Input Value */

     public void verifyInputValue () throws InterruptedException {
         waitMethods.waitForElementToBeRefreshedAndIsVisible(input_value);
        Assert.assertTrue(input_value.isDisplayed());
    }
    /**verify Delete Icon */
      public void verifyDeleteIcon () throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndIsVisible(label_DeleteIcon);
         Assert.assertTrue(label_DeleteIcon.isDisplayed());
     }
     /**verify Link Button */
      public void verifyLinkButton () throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndIsVisible(btn_Link);
         Assert.assertTrue(btn_Link.isDisplayed());
     }
     /**verify Copy PO */
      public void verifyCOpyPO () throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndIsVisible(btn_CopyPO);
         Assert.assertTrue(btn_CopyPO.isDisplayed());

     }
     /**verify void Button */
      public void verifyVoidButton () throws InterruptedException {

          waitMethods.waitForElementToBeRefreshedAndIsVisible(btn_void);
         Assert.assertTrue(btn_void.isDisplayed());
     }
     /**verify Ok button */
      public void verifyOKButton () throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndIsVisible(btn_Ok);
         Assert.assertTrue(btn_Ok.isDisplayed());
     }
     /**verify Submit Print PO */
      public void verifySubmitPrintPO () throws InterruptedException {

          waitMethods.waitForElementToBeRefreshedAndIsVisible(btn_SubmitPrintPO);
         Assert.assertTrue(btn_SubmitPrintPO.isDisplayed());
     }
     /**click on Ok Button */
      public void clickOnOKButton () throws InterruptedException {

          waitMethods.waitForElementToBeRefreshedAndClickable(btn_Ok);
        WebElementActions.getActions(driver).clickElement(btn_Ok);
          waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);

    }
    /**clickOn WIPPos */
     public void clickOnWIPPOs () throws InterruptedException {

         waitMethods.waitForElementToBeRefreshedAndClickable(label_WIPPOs);
        WebElementActions.getActions(driver).clickElement(label_WIPPOs);
         waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }

    /** verify WIPPOs*/
     public void verifyWIPPOs () throws InterruptedException {

         waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_WIPPOs);
            Assert.assertTrue(txt_WIPPOs.isDisplayed());

    }
    /** verify Warehouse and Ware house TextArea */
     public void verifyWarehouseText () throws InterruptedException {
         waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_Warehouse);
        Assert.assertTrue(txt_Warehouse.isDisplayed());

         waitMethods.waitForElementToBeRefreshedAndIsVisible(input_WarehouseTextArea);
        Assert.assertTrue(input_WarehouseTextArea.isDisplayed());
    }
    /**verify Search and search Icon */
     public void verifySearch () throws InterruptedException {
         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_Search);
        Assert.assertTrue(label_Search.isDisplayed());

         waitMethods.waitForElementToBeRefreshedAndIsVisible(input_SearchTextArea);
        Assert.assertTrue(input_SearchTextArea.isDisplayed());
    }
    /**verify Refresh button  */
     public void verifyRefreshButton () throws InterruptedException {
         waitMethods.waitForElementToBeRefreshedAndIsVisible(btn_RefreshButton);
        Assert.assertTrue(btn_RefreshButton.isDisplayed());
    }
    /**verify order */
     public void verifyOrder () throws InterruptedException {
         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_Order);
        Assert.assertTrue(label_Order.isDisplayed());
    }
    /**verify Date */
     public void verifyDate () throws InterruptedException {
         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_Date);
        Assert.assertTrue(label_Date.isDisplayed());
    }
    /**verify vendor */
     public void  verifyVendorText () throws InterruptedException {
         waitMethods.waitForElementToBeRefreshedAndIsVisible(Text_vendor);
        Assert.assertTrue(Text_vendor.isDisplayed());
    }
    /** verify Warehouse */
     public void verifyTextWarehouse () throws InterruptedException {
         waitMethods.waitForElementToBeRefreshedAndIsVisible(Text_Warehouse);
        Assert.assertTrue(Text_Warehouse.isDisplayed());
    }
    /**verify Text Refreance  */
     public void verifyTextReferance  () throws InterruptedException {
         waitMethods.waitForElementToBeRefreshedAndIsVisible(Text_Reference);
        Assert.assertTrue(Text_Reference.isDisplayed());
    }
    /**verify Text Status */
     public void verifyTextStatus () throws InterruptedException {
         waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_Status);
        Assert.assertTrue(txt_Status.isDisplayed());
    }
    /**verify PO Number */
     public void verifyPONumbewr () throws InterruptedException {

         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_PoNumber);
        Assert.assertTrue(label_PoNumber.isDisplayed());
    }
    /**verify Text VEndor NAme */
     public void verifyTextVendorName () throws InterruptedException {
         waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_Vendorname);
        Assert.assertTrue(txt_Vendorname.isDisplayed());

    }

    /** verify Open */
     public void verifyOpen () throws InterruptedException {

         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_Open);
        Assert.assertTrue(label_Open.isDisplayed());
    }
    /**verify Order Summary */
     public void verifyOrderSummary () throws InterruptedException {

         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_OrderSummary);
        Assert.assertTrue(label_OrderSummary.isDisplayed());
    }
    /**verify vendor and vendor value */
     public void verifyVendorvalue  () throws InterruptedException {

         waitMethods.waitForElementToBeRefreshedAndIsVisible(text_Vendor);
        Assert.assertTrue(text_Vendor.isDisplayed());

         waitMethods.waitForElementToBeRefreshedAndIsVisible(input_VendorValue);
        Assert.assertTrue(input_VendorValue.isDisplayed());

    }
    /**verify Address*/
     public void verifyAddress () throws InterruptedException {

         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_Address);
        Assert.assertTrue(label_Address.isDisplayed());

    }
    /**verify Po date and PO Part Cost and Order Total */
     public void verifyPoDate () throws InterruptedException {

         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_PoDate);
        Assert.assertTrue(label_PoDate.isDisplayed());

         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_POPartCost);
        Assert.assertTrue(label_POPartCost.isDisplayed());

    //    WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(Text_OrderTotal);
    //    Assert.assertTrue(Text_OrderTotal.isDisplayed())

        TestListener.saveScreenshotPNG(driver);

    }
    /**click On PO Number */
     public void clickOnPoNumber () throws InterruptedException {

         waitMethods.waitForElementToBeRefreshedAndClickable(label_PoNumber);
        WebElementActions.getActions(driver).clickElement(label_PoNumber);
        Assert.assertTrue(label_PoNumber.isDisplayed());
         waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);

    }
    /** verify PO Number and verify Order Total */
     public void verifyPONumber () throws InterruptedException {

         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_PONumber);
        Assert.assertTrue(label_PONumber.isDisplayed());

         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_OrderTotal);
        Assert.assertTrue(label_OrderTotal.isDisplayed());

        String originalWindow=driver.getWindowHandle() ;

         waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**click On Submit Print PO Button*/
     public void clickOnSumbmitPrintPOButton () throws InterruptedException {
         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_SubmitPrintPOButton);
            Assert.assertTrue(label_SubmitPrintPOButton.isDisplayed());

         waitMethods.waitForElementToBeRefreshedAndClickable(label_SubmitPrintPOButton);
            WebElementActions.getActions(driver).clickElement(label_SubmitPrintPOButton);

 //           Thread.sleep(3000);

         waitMethods.loadingWait(loder);
            TestListener.saveScreenshotPNG(driver);

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
