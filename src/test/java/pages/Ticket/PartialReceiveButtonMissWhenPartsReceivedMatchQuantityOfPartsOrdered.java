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

// 1705 Ticket
public class PartialReceiveButtonMissWhenPartsReceivedMatchQuantityOfPartsOrdered extends TestDriverActions {

    @FindBy(xpath = "//a[text()='Parts']")
    WebElement Parts;
    @FindBy(xpath = "//td[text()='Order Parts']")
    WebElement OrderParts;
    @FindBy(xpath = "//span[text()='Order Parts']")
    WebElement title_OrderParts;
    @FindBy(xpath = "//h1[text()='Search Catalog']")
    WebElement title_SearchCatalog;
    @FindBy(xpath = "//select[contains(@id,'soc1::content')]")
    WebElement select_ByParts;
    @FindBy(xpath = "//input[contains(@id,'ksq1:dc_it1::content')]")
    WebElement txtbox_ByParts;
    @FindBy(xpath = "//input[contains(@id,'ins1::content')]")
    WebElement select_IncreamentBox;
    @FindBy(xpath = "//div[contains(@id,'cb1')]/descendant::span")
    WebElement btn_add;
    @FindBy(xpath = "//h1[text()='Order List']")
    WebElement txt_OrderList;
    @FindBy(xpath = "//label[text()='Warehouse:']")
    WebElement txt_WareHouse;
    @FindBy(xpath = "//select[contains(@id,'pt1:soc3::content')]")
    WebElement selectBox_WareHouse;
    @FindBy(xpath = "//div[contains(@id,'pt1:cb9')]/descendant::span")
    WebElement tab_IssuePO;
    @FindBy(xpath = "//div[contains(@id,'pt1:cb11')]/descendant::span")
    WebElement tab_Refresh;
    @FindBy(xpath = "//td[contains(@id,'pw3::tb')]/descendant::div")
    WebElement title_IssuePO;
    @FindBy(xpath = "//span[text()='Vendor Name']")
    WebElement col_VendorName;
    @FindBy(xpath = "//span[text()='Amount']")
    WebElement col_Amount;
    @FindBy(xpath = "//select[contains(@id,'soc4::content')]")
    WebElement select_Option;
    @FindBy(xpath = "//div[contains(@id,'cb13')]/descendant::span")
    WebElement btn_IssuePo;
    @FindBy(xpath = "//td[contains(@id,'pw5::tb')]/descendant::div")
    WebElement title_PurchaseOrder;
    @FindBy(xpath = "//label[text()='Location:']")
    WebElement txt_Location;
    @FindBy(xpath = "//label[text()='Location:']/following::span[1]")
    WebElement Location_Name;
    @FindBy(xpath = "//label[text()='Vendor:']")
    WebElement txt_Vendor;
    @FindBy(xpath = "(//label[text()='Vendor:']/following::span)[1]")
    WebElement Vendor_Name;
    @FindBy(xpath = "//table[contains(@id,'itSearchPartSelect')]/descendant::label")
    WebElement txt_Part;
    @FindBy(xpath = "//input[contains(@id,'itSearchPartSelect::content')]")
    WebElement txtbox_Part;
    @FindBy(xpath =  "//li[contains(@class,'AFAutoSuggestItem')]")
    WebElement part_list;
    @FindBy(xpath = "(//label[text()='Qty:'])[1]")
    WebElement txt_Qty;
    @FindBy(xpath = "//input[contains(@id,'itaq::content')]")
    WebElement select_Qty;
    @FindBy(xpath = "//div[contains(@id,'cbAddPart')]/descendant::span")
    WebElement tab_AddPart;
    @FindBy(xpath = "//span[text()='Part #']")
    WebElement col_part;
    @FindBy(xpath = "//span[text()='Vendor Part #']")
    WebElement col_VendorPart;
    @FindBy(xpath = "(//span[text()='Description'])[1]")
    WebElement col_Description;
    @FindBy(xpath = "//span[text()='Current Onhands']")
    WebElement col_CurrentOnhands;
    @FindBy(xpath = "//span[text()='Order Quantity']")
    WebElement col_OrderQuantity;
    @FindBy(xpath = "(//span[text()='UOM'])[2]")
    WebElement col_UOM;
    @FindBy(xpath = "//span[text()='Stock UOM']")
    WebElement col_StockUOM;
    @FindBy(xpath = "//span[text()='Conv']")
    WebElement col_Conv;
    @FindBy(xpath = "//span[text()='Unit Cost']")
    WebElement col_UnitCost;
    @FindBy(xpath = "//span[text()='Core']")
    WebElement col_core;
    @FindBy(xpath = "//span[text()='Extended Cost']")
    WebElement col_ExtendedCost;
    @FindBy(xpath = "//span[text()='Link/Delink Labour']")
    WebElement col_LinkDelinkLabour;
    @FindBy(xpath = "//div[contains(@id,'bLlabor')]/descendant::span")
    WebElement tab_link;
    @FindBy(xpath = "//div[contains(@id,'cb4')]/descendant::span")
    WebElement tab_CopyPO;
    @FindBy(xpath = "//span[text()='Void']")
    WebElement tab_Void;
    @FindBy(xpath = "//div[contains(@id,'ctbOK')]/descendant::span")
    WebElement tab_OK;
    @FindBy(xpath = "//span[text()='Submit / Print PO']")
    WebElement tab_saveExit;
    @FindBy(xpath = "//input[contains(@id,'it9::content')]")
    WebElement OrderQuantity;
    @FindBy(xpath = "(//a[text()='Suggested Orders'])[1]")
    WebElement tab_SuggestedOrder;
    @FindBy(xpath = "(//a[text()='WIP POs'])[1]")
    WebElement tab_WIPPos;
    @FindBy(xpath = "(//a[text()='Order History'])[1]")
    WebElement tab_orderHistory;
    @FindBy(xpath = "(//a[text()='Tire Order Errors'])[1]")
    WebElement tab_TireOrderErrors;
    @FindBy(xpath = "//h1[text()='WIP POs']")
    WebElement title_WIPPos;
    @FindBy(xpath = "//label[text()='Warehouse:']")
    WebElement txt_Warehouse;
    @FindBy(xpath = "(//label[text()='Warehouse:']/following::select)[1]")
    WebElement txtbox_Warehouse;
    @FindBy(xpath = "//label[text()='Search:']")
    WebElement txt_search;
    @FindBy(xpath = "//input[contains(@id,'itSearch::content')]")
    WebElement txtbox_search;
    @FindBy(xpath = "//span[text()='Refresh']")
    WebElement btn_Refresh;
    @FindBy(xpath = "//th[contains(@id,'t9_opPO:c36')]/descendant::span")
    WebElement col_Order;
    @FindBy(xpath = "//th[contains(@id,'t9_opPO:c27')]/descendant::span")
    WebElement col_PODate;
    @FindBy(xpath = "//span[text()='Vendor']")
    WebElement col_Vendor;
    @FindBy(xpath = "//span[text()='Warehouse']")
    WebElement col_Warehouse;
    @FindBy(xpath = "//span[text()='Reference']")
    WebElement col_Reference;
    @FindBy(xpath = "//span[text()='Status']")
    WebElement col_Status;
    @FindBy(xpath = "//a[contains(@id,'cil5')]/descendant::span")
    WebElement PO_Number;
    @FindBy(xpath = "(//tr[contains(@id,'plam11')]/descendant::label)[1]")
    WebElement link_NotYetReceived;
    @FindBy(xpath = "//div[contains(@id,'cbClose')]/descendant::span")
    WebElement tab_cancle;
    @FindBy(xpath = "(//div[contains(@id,'cb114')]/descendant::span)[2]")
    WebElement tab_ReOpen;
    @FindBy(xpath = "(//div[contains(@id,'cb4')]/descendant::span)[2]")
    WebElement tab_CopyPo;
    @FindBy(xpath = "//div[contains(@id,'cb18')]/descendant::span")
    WebElement tab_ClosePO;
    @FindBy(xpath = "//div[contains(@id,'ctb1')]/descendant::span")
    WebElement tab_ReceivePart;
    @FindBy(xpath = "(//td[contains(@id,'cDeleteItem')]/descendant::a)[1]")
    WebElement cross_icon;
    @FindBy(xpath = "//input[contains(@id,'itReplenishQuantity::content')]")
    WebElement ReceivingQty;
    @FindBy(xpath = "(//span[text()='Receive Parts'])[2]")
    WebElement ReceiveParts;
    @FindBy(xpath = "//td[contains(@id,'pwInv::tb')]/descendant::div")
    WebElement title_InvoiceOptional;
    @FindBy(xpath = "//div[contains(@id,'ctbCancelPopupInv')]/descendant::span")
    WebElement btn_cancle;
    @FindBy(xpath = "//div[contains(@id,'ctbSavePopupInv')]/descendant::span")
    WebElement btn_ReceiveParts;
    @FindBy(xpath = "//tr[contains(@id,'plam11')]/descendant::span")
    WebElement link_ViewReceived;
    @FindBy(xpath = "//td[contains(@id,'pw1::tb')]/descendant::div")
    WebElement title_ReceivingInfo;
    @FindBy(xpath = "//th[contains(@id,'t2:c48')]/descendant::span")
    WebElement col_receiving;
    @FindBy(xpath = "//th[contains(@id,'t2:c41')]/descendant::span")
    WebElement col_TransactionDate;
    @FindBy(xpath = "//th[contains(@id,'t2:c42')]/descendant::span")
    WebElement col_PartCode;
    @FindBy(xpath = "//th[contains(@id,'t2:c43')]/descendant::span")
    WebElement col_PartDescription;
    @FindBy(xpath = "//th[contains(@id,'t2:c44')]/descendant::span")
    WebElement col_Quantity;
    @FindBy(xpath = "//th[contains(@id,'t2:c45')]/descendant::span")
    WebElement col_UOM1;
    @FindBy(xpath = "//td[contains(@id,'c42')]/descendant::span")
    WebElement PartCode_Name;
    @FindBy(xpath = "//td[contains(@id,'c44')]/descendant::span")
    WebElement Quantity_Number;
    @FindBy(xpath = "//div[contains(@id,'cb9')]/descendant::span")
    WebElement btn_Ok;
    @FindBy(xpath = "(//td[contains(@id,'t1_itms:1:c4')]/descendant::span)[2]")
    WebElement Part_Name;
    @FindBy(xpath = "(//div[contains(@id,'t1_itms:1:bLlabor')]/descendant::span)[2]")
    WebElement Link_Btn;
    @FindBy(xpath = "//span[text()='Sign Out']")
    WebElement btn_signOut;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement inputbox_Username;
/*    @FindBy(xpath=)
    WebElement;
    @FindBy(xpath=)
    WebElement;
    @FindBy(xpath=)
    WebElement;
    @FindBy(xpath=)
    WebElement;
    @FindBy(xpath=)
    WebElement;
    */





    public PartialReceiveButtonMissWhenPartsReceivedMatchQuantityOfPartsOrdered(WebDriver driver){
           this.driver = driver;
           this.waitMethods = new WaitMethods(driver);
    }

    /**
     * goto order parts Screen
     */
    public void gotoOrderPartsScreen() throws FileNotFoundException, InterruptedException {

        waitMethods.waitForElementToBeRefreshedAndClickable(Parts);
        WebElementActions.getActions(driver).clickElement(Parts);

        waitMethods.waitForElementToBeRefreshedAndClickable(OrderParts);
        WebElementActions.getActions(driver).clickElement(OrderParts);

        TestListener.saveScreenshotPNG(driver);

    }
    /*
         verify title Order Parts
     */
      public void verifyTitleOrderParts() throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndIsVisible(title_OrderParts);
          Assert.assertTrue(title_OrderParts.isDisplayed());
    }
      /*
         verify title Search Catalog
     */
      public void verifySearchCatalog() throws InterruptedException{
          waitMethods.waitForElementToBeRefreshedAndIsVisible(title_SearchCatalog);
          Assert.assertTrue(title_SearchCatalog.isDisplayed());
          Assert.assertTrue(select_ByParts.isDisplayed());
          Assert.assertTrue(txtbox_ByParts.isDisplayed());
    }
    /*
         verify select Increament box and add button
     */
      public void verifyIncreament_AddBtn() throws InterruptedException{
          waitMethods.waitForElementToBeRefreshedAndIsVisible(select_IncreamentBox);
          Assert.assertTrue(select_IncreamentBox.isDisplayed());
          Assert.assertTrue(btn_add.isDisplayed());
    }
    /*
         verify Order List
     */
      public void verifyOrderList() throws InterruptedException{
          waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_OrderList);
          Assert.assertTrue(txt_OrderList.isDisplayed());
    }
    /*
         verify WareHouse
     */
      public void verifyWarehouse() throws InterruptedException{
          waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_WareHouse);
          Assert.assertTrue(txt_WareHouse.isDisplayed());
          Assert.assertTrue(selectBox_WareHouse.isDisplayed());
    }
    /*
         verify tab IssuePO and Refresh
     */
      public void verifyIssuePO_Refresh() throws InterruptedException{
          waitMethods.waitForElementToBeRefreshedAndIsVisible(tab_IssuePO);
          Assert.assertTrue(tab_IssuePO.isDisplayed());
          Assert.assertTrue(tab_Refresh.isDisplayed());
    }
    /*
         enter first part
     */
      public void enterFirstPart() throws InterruptedException{
          waitMethods.waitForElementToBeRefreshedAndClickable(txtbox_ByParts);
          WebElementActions.getActions(driver).inputText(txtbox_ByParts,appProp83.getProperty("firstPart"));

          TestListener.saveScreenshotPNG(driver);
    }
    /*
         Increase part by 4
     */
      public void IncreasePartBy4() throws InterruptedException{
          waitMethods.waitForElementToBeRefreshedAndClickable(select_IncreamentBox);
          WebElementActions.getActions(driver).inputText(select_IncreamentBox,appProp83.getProperty("firstIncreament"));

          TestListener.saveScreenshotPNG(driver);
    }
    /*
         click on Add button
     */
      public void clickOnAddButton() throws InterruptedException{
          waitMethods.waitForElementToBeRefreshedAndClickable(btn_add);
          WebElementActions.getActions(driver).clickElement(btn_add);

          TestListener.saveScreenshotPNG(driver);
    }
    /*
         click on Issue PO
     */
      public void clickOnIssuePO() throws InterruptedException{
          waitMethods.waitForElementToBeRefreshedAndClickable(tab_IssuePO);
          WebElementActions.getActions(driver).clickElement(tab_IssuePO);

          TestListener.saveScreenshotPNG(driver);
    }
    /*
         verify title IssuePO
     */
      public void verifyTitleIssuePO() throws InterruptedException{
          waitMethods.waitForElementToBeRefreshedAndIsVisible(title_IssuePO);
          Assert.assertTrue(title_IssuePO.isDisplayed());
    }
    /*
         verify column present in IssuePO table
     */
      public void verifyColumnIssuePo() throws InterruptedException{
          waitMethods.waitForElementToBeRefreshedAndIsVisible(col_VendorName);
          Assert.assertTrue(col_VendorName.isDisplayed());
          Assert.assertTrue(col_Amount.isDisplayed());
    }
    /*
        select vendor name
     */
      public void selectVendorName() throws InterruptedException{
          waitMethods.waitForElementToBeRefreshedAndClickable(select_Option);
          WebElementActions.getActions(driver).elementSelectByVisibilityText(select_Option,appProp83.getProperty("vendorName"));

          TestListener.saveScreenshotPNG(driver);
    }
    /*
         click on Issue Po
     */
      public void clickInIssuePOBtn() throws InterruptedException{
          waitMethods.waitForElementToBeRefreshedAndClickable(btn_IssuePo);
          WebElementActions.getActions(driver).clickElement(btn_IssuePo);

          TestListener.saveScreenshotPNG(driver);
    }
    /*
         verify title Purchase Order
     */
      public void verifyTitlePurchaseOrder() throws InterruptedException{
          waitMethods.waitForElementToBeRefreshedAndIsVisible(title_PurchaseOrder);
          Assert.assertTrue(title_PurchaseOrder.isDisplayed());
    }
    /*
         verify Location
     */
      public void verifyLocation() throws InterruptedException{
          waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_Location);
          Assert.assertTrue(txt_Location.isDisplayed());
          Assert.assertTrue(Location_Name.isDisplayed());
    }
    /*
         verify Vendor
     */
      public void verifyVendor() throws InterruptedException{
          waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_Vendor);
          Assert.assertTrue(txt_Vendor.isDisplayed());
          Assert.assertTrue(Vendor_Name.isDisplayed());
    }
    /*
         verify Part
     */
      public void verifyPart() throws InterruptedException{
          waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_Part);
          Assert.assertTrue(txt_Part.isDisplayed());
          Assert.assertTrue(txtbox_Part.isDisplayed());
    }
    /*
         verify Quantity
     */
      public void verifyQuantity() throws InterruptedException{
          waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_Qty);
          Assert.assertTrue(txt_Qty.isDisplayed());
          Assert.assertTrue(select_Qty.isDisplayed());
    }
    /*
         Add Part in Purchase Order
     */
    public void addPart() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndClickable(txtbox_Part);
        WebElementActions.getActions(driver).inputText(txtbox_Part,appProp83.getProperty("secondPart"));

        WebElementActions.getActions(driver).clickElement(part_list);

        TestListener.saveScreenshotPNG(driver);
    }
    /*
         enter Quantity
     */
      public void enterQuantity() throws InterruptedException{
          waitMethods.waitForElementToBeRefreshedAndClickable(select_Qty);
          WebElementActions.getActions(driver).inputText(select_Qty,appProp83.getProperty("secondIncreament"));

          TestListener.saveScreenshotPNG(driver);
    }
     /*
        click on Add Part
     */
      public void clickOnAddPart() throws InterruptedException{
          waitMethods.waitForElementToBeRefreshedAndClickable(tab_AddPart);
          WebElementActions.getActions(driver).clickElement(tab_AddPart);

          TestListener.saveScreenshotPNG(driver);
    }
     /*
         verify column of Purchase Order
     */
      public void verifyColumnPurchaseOrder() throws InterruptedException{
          waitMethods.waitForElementToBeRefreshedAndIsVisible(col_part);
          Assert.assertTrue(col_part.isDisplayed());
          Assert.assertTrue(col_VendorPart.isDisplayed());
          Assert.assertTrue(col_Description.isDisplayed());
          Assert.assertTrue(col_CurrentOnhands.isDisplayed());
          Assert.assertTrue(col_OrderQuantity.isDisplayed());
          Assert.assertTrue(col_UOM.isDisplayed());
          Assert.assertTrue(col_StockUOM.isDisplayed());
          Assert.assertTrue(col_Conv.isDisplayed());
          Assert.assertTrue(col_UnitCost.isDisplayed());
          Assert.assertTrue(col_core.isDisplayed());
          Assert.assertTrue(col_ExtendedCost.isDisplayed());
          Assert.assertTrue(col_LinkDelinkLabour.isDisplayed());
          Assert.assertTrue(tab_link.isDisplayed());
          Assert.assertTrue(link_NotYetReceived.isDisplayed());
    }
     /*
         verify copypo void ok save exit tabs
     */
      public void verifyCopyPOTabs() throws InterruptedException{
          waitMethods.waitForElementToBeRefreshedAndIsVisible(tab_CopyPO);
          Assert.assertTrue(tab_CopyPO.isDisplayed());
          Assert.assertTrue(tab_Void.isDisplayed());
          Assert.assertTrue(tab_OK.isDisplayed());
          Assert.assertTrue(tab_saveExit.isDisplayed());
    }
     /*
          verify Order Quantity
     */
      public void verifyOrderQuantity() throws InterruptedException{
          waitMethods.waitForElementToBeRefreshedAndIsVisible(OrderQuantity);
          Assert.assertTrue(OrderQuantity.isDisplayed());
    }
     /*
          click on Save and Exit
     */
      public void clickOnSaveExit() throws InterruptedException{
          waitMethods.waitForElementToBeRefreshedAndClickable(tab_saveExit);
          WebElementActions.getActions(driver).clickElement(tab_saveExit);

          TestListener.saveScreenshotPNG(driver);
    }
     /*
         verify tab
     */
      public void verifyTabs() throws InterruptedException{
          waitMethods.waitForElementToBeRefreshedAndIsVisible(tab_SuggestedOrder);
          Assert.assertTrue(tab_SuggestedOrder.isDisplayed());
          Assert.assertTrue(tab_WIPPos.isDisplayed());
          Assert.assertTrue(tab_orderHistory.isDisplayed());
          Assert.assertTrue(tab_TireOrderErrors.isDisplayed());
    }
     /*
         click on WIPPos tab
     */
      public void clickOnWIPPos() throws InterruptedException{
          waitMethods.waitForElementToBeRefreshedAndClickable(tab_WIPPos);
          WebElementActions.getActions(driver).clickElement(tab_WIPPos);

          TestListener.saveScreenshotPNG(driver);
    }
    /*
         verify title WIPPos
     */
      public void verifyTitleWIPPos() throws InterruptedException{
          waitMethods.waitForElementToBeRefreshedAndIsVisible(title_WIPPos);
          Assert.assertTrue(title_WIPPos.isDisplayed());

    }
    /*
         verify Warehouse
     */
      public void verifyWarehouseName() throws InterruptedException{
          waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_Warehouse);
          Assert.assertTrue(txt_Warehouse.isDisplayed());
          Assert.assertTrue(txtbox_Warehouse.isDisplayed());
    }
    /*
         verify Search box and refresh button
     */
      public void verifySearchBoxAndRefreshbtn() throws InterruptedException{
          waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_search);
          Assert.assertTrue(txt_search.isDisplayed());
          Assert.assertTrue(txtbox_search.isDisplayed());
          Assert.assertTrue(btn_Refresh.isDisplayed());
    }
     /*
        verify WIPPos table column
     */
      public void verifyWIPPosTable() throws InterruptedException{
          waitMethods.waitForElementToBeRefreshedAndIsVisible(col_Order);
          Assert.assertTrue(col_Order.isDisplayed());
          Assert.assertTrue(col_PODate.isDisplayed());
          Assert.assertTrue(col_Vendor.isDisplayed());
          Assert.assertTrue(col_Warehouse.isDisplayed());
          Assert.assertTrue(col_Reference.isDisplayed());
          Assert.assertTrue(col_Status.isDisplayed());
          Assert.assertTrue(PO_Number.isDisplayed());

    }
    /*
         click On PONumber
     */
      public void clickOnPONumber() throws InterruptedException{
          waitMethods.waitForElementToBeRefreshedAndClickable(PO_Number);
          WebElementActions.getActions(driver).clickElement(PO_Number);

          TestListener.saveScreenshotPNG(driver);
    }
    /*
         verify Purchase Order tab
     */
      public void verifyPurchaseOrderTab() throws InterruptedException{
          waitMethods.waitForElementToBeRefreshedAndIsVisible(tab_cancle);
          Assert.assertTrue(tab_cancle.isDisplayed());
          Assert.assertTrue(tab_ReOpen.isDisplayed());
          Assert.assertTrue(tab_CopyPo.isDisplayed());
          Assert.assertTrue(tab_ClosePO.isDisplayed());
          Assert.assertTrue(tab_ReceivePart.isDisplayed());
    }
    /*
         click on Receive Part
     */
      public void clickOnReceivePart() throws InterruptedException{
          waitMethods.waitForElementToBeRefreshedAndClickable(tab_ReceivePart);
          WebElementActions.getActions(driver).clickElement(tab_ReceivePart);

          TestListener.saveScreenshotPNG(driver);
    }
    /*
         click on cross icon
     */
      public void clickOnCrossIcon() throws InterruptedException{
          waitMethods.waitForElementToBeRefreshedAndClickable(cross_icon);
          WebElementActions.getActions(driver).clickElement(cross_icon);

          TestListener.saveScreenshotPNG(driver);
    }
    /*
         enter Receive quantity
     */
      public void enterReceivingQuantity() throws InterruptedException{
          waitMethods.waitForElementToBeRefreshedAndClickable(ReceivingQty);
          WebElementActions.getActions(driver).inputText(ReceivingQty,appProp83.getProperty("receiveQty"));

          TestListener.saveScreenshotPNG(driver);
    }
    /*
           click Receive Part
     */
      public void clickReceivePart() throws InterruptedException{
          waitMethods.waitForElementToBeRefreshedAndClickable(ReceiveParts);
          WebElementActions.getActions(driver).clickElement(ReceiveParts);

          TestListener.saveScreenshotPNG(driver);
    }
    /*
         verify title Invoice Optional
     */
      public void verifyTitleInvoiceOptional() throws InterruptedException{
          waitMethods.waitForElementToBeRefreshedAndIsVisible(title_InvoiceOptional);
          Assert.assertTrue(title_InvoiceOptional.isDisplayed());
          Assert.assertTrue(btn_cancle.isDisplayed());
          Assert.assertTrue(btn_ReceiveParts.isDisplayed());
    }
      /*
         click on Receive Part button
     */
      public void clickReceivePartButton() throws InterruptedException{
          waitMethods.waitForElementToBeRefreshedAndClickable(btn_ReceiveParts);
          WebElementActions.getActions(driver).clickElement(btn_ReceiveParts);

          TestListener.saveScreenshotPNG(driver);
    }
      /*
         verify link View Received
     */
      public void verifyLinkViewReceived() throws InterruptedException{
          waitMethods.waitForElementToBeRefreshedAndIsVisible(link_ViewReceived);
          Assert.assertTrue(link_ViewReceived.isDisplayed());
    }
      /*
         click on link View Received
     */
      public void clickonLinkViewReceived() throws InterruptedException{
          waitMethods.waitForElementToBeRefreshedAndClickable(link_ViewReceived);
          WebElementActions.getActions(driver).clickElement(link_ViewReceived);

          TestListener.saveScreenshotPNG(driver);
    }
    /*
         verify title Receiving Info
     */
      public void verifyReceivingInfo() throws InterruptedException{
          waitMethods.waitForElementToBeRefreshedAndIsVisible(title_ReceivingInfo);
          Assert.assertTrue(title_ReceivingInfo.isDisplayed());

    }
    /*
         verify column of Receiving Info table
     */
      public void verifyColumnReceivingInfo() throws InterruptedException{
          waitMethods.waitForElementToBeRefreshedAndIsVisible(col_receiving);
          Assert.assertTrue(col_receiving.isDisplayed());
          Assert.assertTrue(col_TransactionDate.isDisplayed());
          Assert.assertTrue(col_PartCode.isDisplayed());
          Assert.assertTrue(col_PartDescription.isDisplayed());
          Assert.assertTrue(col_Quantity.isDisplayed());
          Assert.assertTrue(col_UOM1.isDisplayed());
          Assert.assertTrue(btn_Ok.isDisplayed());
    }
      /*
         verify Part Code Name
     */
      public void verifyPartCodeName() throws InterruptedException{
          waitMethods.waitForElementToBeRefreshedAndIsVisible(PartCode_Name);
          Assert.assertTrue(PartCode_Name.isDisplayed());
    }
     /*
         verify Quantity Number
     */
      public void verifyQuantityNumber() throws InterruptedException{
          waitMethods.waitForElementToBeRefreshedAndIsVisible(Quantity_Number);
          Assert.assertTrue(Quantity_Number.isDisplayed());
    }
    /*
         click on Ok button
    */
    public void clickOnOKButton() throws InterruptedException{
          waitMethods.waitForElementToBeRefreshedAndClickable(btn_Ok);
          WebElementActions.getActions(driver).clickElement(btn_Ok);

          TestListener.saveScreenshotPNG(driver);
    }
    /*
         verify Part name and link button
     */
      public void verifyPartName_LinkButton() throws InterruptedException{
          waitMethods.waitForElementToBeRefreshedAndIsVisible(Part_Name);
          Assert.assertTrue(Part_Name.isDisplayed());
          Assert.assertTrue(Link_Btn.isDisplayed());
    }
    /*
         click on close button
     */
      public void clickOnCloseButton() throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndClickable(tab_cancle);
          WebElementActions.getActions(driver).clickElement(tab_cancle);

          TestListener.saveScreenshotPNG(driver);
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
