
  package pages.parts;

import actions.LoginActions;
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
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class CounterSale extends TestDriverActions {

    @FindBy(xpath = "//a[text()='Parts']")
    WebElement label_parts;

    @FindBy(xpath = "//td[text()='Counter Sale Manager']")
    WebElement label_counterSaleManager;

    @FindBy(xpath = "//h1[contains(text(),'Things To Do')]")
    WebElement label_thingsTodo;

    @FindBy(xpath = "//h1[contains(text(),'Things To Do')]/following::a[1]")
    WebElement label_toBeInvoiced;

    @FindBy(xpath = "//h1[contains(text(),'Things To Do')]/following::a[2]")
    WebElement label_orderRequest;

    @FindBy(xpath = "//h1[contains(text(),'Things To Do')]/following::a[3]")
    WebElement label_retailParts;

    @FindBy(xpath = "//h1[contains(text(),'Things To Do')]/following::a[4]")
    WebElement label_backOrders;

    @FindBy(xpath = "//h1[contains(text(),'Things To Do')]/following::a[5]")
    WebElement label_lostSale;

    @FindBy(xpath = "//h1[contains(text(),'Things To Do')]/following::a[6]")
    WebElement label_history;

    @FindBy(xpath = "//h1[contains(text(),'Things To Do')]/following::a[7]")
    WebElement label_addNewCounterSale;

    @FindBy(xpath = "//h1[contains(text(),'Things To Do')]/following::a[8]")
    WebElement label_updateCustomerPoNumber;

    @FindBy(xpath = "//h1[contains(text(),'Things To Do')]/following::a[9]")
    WebElement label_counterSaleReturn;

    @FindBy(xpath = "//h1[contains(text(),'Things To Do')]/following::a[10]")
    WebElement label_generateRecurringInvoice;

    @FindBy(xpath = "//h1[text()='To Be Invoiced']")
    WebElement label_tobeInvoiced2;

    @FindBy(xpath = "//label[text()='Open Sales']")
    WebElement label_openSales;

    @FindBy(xpath = "//label[text()='Received Order Requests']")
    WebElement label_receivedOrderRequests;

    @FindBy(xpath = "//h1[text()='Sales List']")
    WebElement label_SaleList_EC;
    @FindBy(xpath = "//h2[text()='Sales List']")
    WebElement label_salesList_NA;

    @FindBy(xpath = "//table[@class='x17f x184']/descendant::td[2]")
    WebElement today_saledate;

    @FindBy(xpath = "//label[text()='Status:']")
    WebElement label_status;

    @FindBy(xpath = "//label[text()='Status:']/following::select")
    WebElement drpdown_status;

    @FindBy(xpath = "//label[text()='Location:']")
    WebElement label_location;

    @FindBy(xpath = "//label[text()='Location:']/following::input[1]")
    WebElement txt_location_field;

    @FindBy(xpath = "//label[text()='Location:']/following::a[1]")
    WebElement icon_search;

    @FindBy(xpath = "//label[text()='Search:']")
    WebElement label_search;

    @FindBy(xpath = "//label[text()='Search:']/following::input[1]")
    WebElement txt_search_field;

    @FindBy(xpath = "//span[text()='Refresh']")
    WebElement btn_refresh;

    @FindBy(xpath = "//span[text()='Add New Counter Sale']")
    WebElement btn_addNewCounterSale;

    @FindBy(xpath = "//span[text()='Sale #']")
    WebElement label_sale;

    @FindBy(xpath = "//span[text()='Sale Date']")
    WebElement label_saledate;

    @FindBy(xpath = "//span[text()='Customer']")
    WebElement label_customer;

    @FindBy(xpath = "//span[text()='Location']")
    WebElement label_location2;

    @FindBy(xpath = "//span[text()='Ship To']")
    WebElement label_shipTo;

    @FindBy(xpath = "//span[text()='Customer PO#']")
    WebElement label_customerPo;

    @FindBy(xpath = "//span[text()='From Order Req.']")
    WebElement label_fromOrderReq;

    // @FindBy(xpath = "//h1[text()=' - Sale Summary']")
    @FindBy(xpath = "//h1[text()='1CS100056 - Sale Summary']")
    WebElement label_saleSummary;

    @FindBy(xpath = "//span[text()='Void']")
    WebElement label_void;

    @FindBy(xpath = "//span[text()='Estimate']")
    WebElement label_estimate;

    @FindBy(xpath = "//label[text()='Sub Total:']")
    WebElement label_subTotal;

    @FindBy(xpath = "//label[text()='Sub Total:']/following::td[3]")
    WebElement subTotal_value;

    @FindBy(xpath = "//label[text()='Taxes:']")
    WebElement label_taxes;

    @FindBy(xpath = "//label[text()='Taxes:']/following::td[3]")
    WebElement taxes_value;

    @FindBy(xpath = "//label[text()='Surcharges:']")
    WebElement label_surcharges;

    @FindBy(xpath = "//label[text()='Surcharges:']/following::td[3]")
    WebElement surcharges_value;

    @FindBy(xpath = "//label[text()='Grand Total:']")
    WebElement label_grandTotal;
    @FindBy(xpath = "//label[text()='Grand Total:']/following::td[3]")
    WebElement grandTotal_value;

    @FindBy(xpath = "//h1[text()='Search and Select Location']/following::input[3]")
    WebElement txt_name;

    @FindBy(xpath = "//h1[text()='Search and Select Location']/following::input[4]")
    WebElement txt_code;

    @FindBy(xpath = "//span[text()='Search']")
    WebElement btn_search;

    @FindBy(xpath = "//span[text()='Search']/following::span[18]")
    WebElement btn_select;

    @FindBy(xpath = "//td[@class='x4w']/following::label[10]")
    WebElement label_location1;

    @FindBy(xpath = "//td[@class='x4w']/following::input[9]")
    WebElement txt_location1_field;

    @FindBy(xpath = "//td[@class='x4w']/following::a[@class='xgm'][3]")
    WebElement icon_searchLocation;

    @FindBy(xpath = "//span[text()='New']")
    WebElement btn_new;

    @FindBy(xpath = "//td[@class='x4w']/following::label[12]")
    WebElement label_customer1;

    @FindBy(xpath = "//td[@class='x4w']/following::input[10]")
    WebElement txt_customer1_field;

    @FindBy(xpath = "//label[text()='Customer:']/following::a[1]")
    WebElement icon_searchCustomer;

    @FindBy(xpath = "//span[text()='New']/following::span[1]")
    WebElement btn_cancle1;

    @FindBy(xpath = "//span[text()='New']/following::span[2]")
    WebElement btn_ok1;

    @FindBy(xpath = "//label[text()='Code:']")
    WebElement label_code;

    @FindBy(xpath = "//label[text()='Code:']/following::input[1]")
    WebElement txt_code_field;

    @FindBy(xpath = "//label[text()='Name:']")
    WebElement label_name;

    @FindBy(xpath = "//label[text()='Name:']/following::input[1]")
    WebElement txt_name_field;

    @FindBy(xpath = "//label[text()='ZIP Code:']/following::span[5]")
    WebElement btn_ok2;

    @FindBy(xpath = "//a[contains(@id,'cl5')]")
    WebElement open_customerSale;
    ////tr[@class='p_AFFocused x17d p_AFSelected']/td[3]/descendant::a
    @FindBy(xpath = "//div[text()='Counter Sale']")
    WebElement label_counterSale;

    @FindBy(xpath = "//div[text()='Counter Sale']/following::span[1]")
    WebElement label_location3_asterisk;

    @FindBy(xpath = "//div[text()='Counter Sale']/following::label[1]")
    WebElement label_location3;

    @FindBy(xpath = "//div[text()='Counter Sale']/following::a[1]")
    WebElement txt_location3_field;

    @FindBy(xpath = "//div[text()='Counter Sale']/following::span[13]")
    WebElement label_customer3_asterisk;

    @FindBy(xpath = "//div[text()='Counter Sale']/following::label[9]")
    WebElement label_customer3;

    @FindBy(xpath = "//div[text()='Counter Sale']/following::a[9]")
    WebElement txt_customer3_field;

    @FindBy(xpath = "//label[text()='Sale#:']")
    WebElement label_sale2;

    @FindBy(xpath = "//label[text()='Sale#:']/following::span[1]")
    WebElement txt_sale_field;

    @FindBy(xpath = "//label[text()='Sale#:']/following::span[2]")
    WebElement saleDate_asterisk;

    @FindBy(xpath = "//label[text()='Sale Date:']")
    WebElement label_saleDate;

    @FindBy(xpath = "//label[text()='Sale Date:']/following::input[1]")
    WebElement txt_saleDate_field;

    @FindBy(xpath = "//label[text()='Sale Date:']/following::a[1]")
    WebElement saleDate_datePicker;

    @FindBy(xpath = "//label[text()='Reference:']")
    WebElement label_reference;

    @FindBy(xpath = "//label[text()='Reference:']/following::input[1]")
    WebElement txt_reference_field;

    @FindBy(xpath = "//label[text()='Internal PO#:']")
    WebElement label_internalPo;

    @FindBy(xpath = "//label[text()='Internal PO#:']/following::input[1]")
    WebElement txt_internalPo_field;

    @FindBy(xpath = "//label[text()='Internal PO#:']/following::label[2]")
    WebElement label_customerPo2;

    @FindBy(xpath = "//label[text()='Internal PO#:']/following::input[2]")
    WebElement txt_customerPo_field;

    @FindBy(xpath = "//label[text()='Ship To:']")
    WebElement label_shipTo2;

    @FindBy(xpath = "//label[text()='Ship To:']/following::a[1]")
    WebElement hyperlink_shipTo;

    @FindBy(xpath = "//label[text()='Ship From:']")
    WebElement label_shipFrom;

    @FindBy(xpath = "//label[text()='Ship From:']/following::a[1]")
    WebElement hyperlink_shipFrom;

    @FindBy(xpath = "//label[text()='Notes:']")
    WebElement label_notes;

    @FindBy(xpath = "//label[text()='Notes:']/following::a[1]")
    WebElement hyperlink_notes;

    @FindBy(xpath = "//label[text()='Internal PO#:']/following::label[5]")
    WebElement label_subTotal2;

    @FindBy(xpath = "//label[text()='Internal PO#:']/following::td[14]")
    WebElement subtotal2_value;

    @FindBy(xpath = "//label[text()='Internal PO#:']/following::label[6]")
    WebElement label_taxes2;

    @FindBy(xpath = "//label[text()='Internal PO#:']/following::label[7]")
    WebElement label_surcharges2;

    @FindBy(xpath = "//label[text()='Internal PO#:']/following::td[22]")
    WebElement surcharges2_value;

    @FindBy(xpath = "//label[text()='Internal PO#:']/following::label[8]")
    WebElement label_grandTotal2;

    @FindBy(xpath = "//label[text()='Internal PO#:']/following::td[28]")
    WebElement grandTotal2_value;

    @FindBy(xpath = "//label[text()='Internal PO#:']/following::td[30]")
    WebElement label_CAD;

    @FindBy(xpath = "//a[text()='View Profit and Loss']")
    WebElement label_viewProfitandLoss;

    @FindBy(xpath = "//h1[text()='Sale Items']")
    WebElement label_saleItems;

    @FindBy(xpath = "//label[text()='Part#:']")
    WebElement label_parts2;

    @FindBy(xpath = "//label[text()='Part#:']/following::input[1]")
    WebElement txt_parts_field;

    @FindBy(xpath =  "//li[contains(@class,'AFAutoSuggestItem')]")
    WebElement tooltip_parts_customer;
    @FindBy(xpath = "//ul[@class='AFAutoSuggestItemsContainer']/li")
    WebElement tooltip_parts_core;

    @FindBy(xpath = "//label[text()='Quantity:']")
    WebElement label_quantity2;

    @FindBy(xpath = "//label[text()='Quantity:']/following::input[1]")
    WebElement txt_quantity2_field;

    @FindBy(xpath = "//label[text()='Warehouse:']/following::label[3]")
    WebElement label_notes2;

    @FindBy(xpath = "//label[text()='Warehouse:']/following::a[2]")
    WebElement hyperlink_ThesearePartNote;

    @FindBy(xpath = "//div[text()='Notes']/following::span[1]")
    WebElement label_popupNotes;

    @FindBy(xpath = "//span[text()='Close']")
    WebElement btn_close;

    @FindBy(xpath = "//span[text()='Add Part']")
    WebElement btn_addParts;

    @FindBy(xpath = "//a[contains(@id,'citD1')]/child::img")
    WebElement close1;

    @FindBy(xpath = "//a[contains(@id,':trashButtonIssite')]/child::img")
    WebElement delete;

    @FindBy(xpath = "//span[text()='New Part']")
    WebElement btn_newParts;

    @FindBy(xpath = "//span[text()='Order Parts']")
    WebElement label_orderParts;

    @FindBy(xpath = "//span[text()='Seq']")
    WebElement label_seq;

    @FindBy(xpath = "//span[text()='Part and Description']")
    WebElement label_partAndDescription;

    @FindBy(xpath = "//span[text()='Core']")
    WebElement label_core;

    @FindBy(xpath = "//span[text()='UOM']")
    WebElement label_uom;

    @FindBy(xpath = "//span[text()='Order Qty']")
    WebElement label_orderQty;

    @FindBy(xpath = "//span[text()='Charge Qty']")
    WebElement label_chargeQty;

    @FindBy(xpath = "//span[text()='B/O Qty']")
    WebElement label_BOqty;

    @FindBy(xpath = "//span[text()='Lost Sales']")
    WebElement label_lostSale2;

    @FindBy(xpath = "//span[text()='Charge']")
    WebElement label_charge;

    @FindBy(xpath = "//span[text()='Extended']")
    WebElement label_extended;

    @FindBy(xpath = "//span[contains(text(),'Order Parts')]/following::span[13]")
    WebElement btn_void;

    @FindBy(xpath = "//span[text()='Save / Exit']")
    WebElement btn_saveExit;

    @FindBy(xpath = "//span[text()='Pick List']")
    WebElement btn_pickList;

    @FindBy(xpath = "//span[text()='Pick List']/following::span[2]")
    WebElement btn_estimate;

    @FindBy(xpath = "//span[text()='Pick List']/following::span[3]")
    WebElement btn_copy;

    @FindBy(xpath = "//span[text()='Invoice']")
    WebElement btn_invoice;

    @FindBy(xpath = "//label[text()='Invoice Date:']")
    WebElement label_invoiceDate;

    @FindBy(xpath = "//label[text()='Invoice Date:']/following::input[1]")
    WebElement txt_invoiceDate_field;

    @FindBy(xpath = "//label[text()='Invoice Date:']/following::a[1]")
    WebElement invoice_datePicker;

    @FindBy(xpath = "(//a[contains(@id,'citD1')])[1]")
    WebElement cross_icon;

    @FindBy(xpath = "//span[text()='Order Parts']/following::a[1]/img")
    WebElement delete_icon;

    @FindBy(xpath = "//span[text()='Core Return']")
    WebElement btn_coreReturn;

    @FindBy(xpath = "//label[text()='Core Return']")
    WebElement chekbox_coreReturn;

    @FindBy(xpath = "//span[text()='Extended']/following::a[1]")
    WebElement expand_icon;

    @FindBy(xpath = "//label[text()='Status:']/following::a[text()='History'][1]")
    WebElement tab_history;

    @FindBy(xpath = "//a[text()='ABC111']")
    WebElement customer_entry;
    @FindBy(xpath = "//label[text()='Status:']/following::input[2]")
    WebElement radio_voided;

    @FindBy(xpath = "//div[contains(@id,'pte1:pc1:cb2')]/descendant::span")
    WebElement btn_refresh2;

    @FindBy(xpath="(//td[contains(@id,'c30')]/descendant::span)[2]")
    WebElement CSNumber ;
    @FindBy(xpath = "(//span[contains(@id,'si1')]/following::td)[4]")
    WebElement btn_signOut;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement inputbox_Username;

    @FindBy(xpath = "//input[contains(@id,'it31::content')]")
    List<WebElement> add_quantity;

    @FindBy(xpath = "//label[text()='Lost Sale Reason:']/following::a[1]")
    WebElement hyperlink_select;

    @FindBy(xpath = "//div[text()='Lost Sale Reason']")
    WebElement title_lostSaleReason;

    @FindBy(xpath = "//div[text()='Lost Sale Reason']/following::span[1]")
    WebElement lostSaleReason_asterisk;

    @FindBy(xpath = "//div[text()='Lost Sale Reason']/following::label")
    WebElement label_lostSaleReason;

    @FindBy(xpath = "//div[text()='Lost Sale Reason']/following::select")
    WebElement txt_lostSaleReason;

    @FindBy(xpath = "//div[text()='Lost Sale Reason']/following::span[2]")
    WebElement btn_addLostSale;

    @FindBy(xpath = "//div[text()='Lost Sale Reason']/following::span[3]")
    WebElement btn_cancle;

    @FindBy(xpath = "//div[text()='Lost Sale Reason']/following::span[4]")
    WebElement btn_saveExitLost;

    @FindBy(xpath = "//div[text()='Lost Sale Reason']/following::select")
    WebElement opt_delivery;

    @FindBy(xpath = "//a[text()='Delivery ']")
    WebElement label_delivery;

    @FindBy(xpath = "//a[contains(text(),'Non-stock item')]")
    WebElement NonStockItem;

    @FindBy(xpath = "//label[text()='Internal PO#:']/following::a[1]")
    WebElement hyperlink_taxes;

    @FindBy(xpath = "//h1[text()='Available']/following::a[3]/img")
    WebElement greenPlus_icon;

    @FindBy(xpath = "//div[contains(text(),'Taxes')]/following::span[text()='OK'][1]")
    WebElement btn_taxesOk;

    @FindBy(xpath = "//td[contains(@id,'c23')]/descendant::a")
    public List<WebElement> history_sale ;

    @FindBy(xpath="(//span[contains(text(),'Cancel')])[1]")
    WebElement cancle_corepart;

    @FindBy(xpath = "//input[contains(@id,':val00::content')]")
    WebElement PartTextArea;

    @FindBy(xpath = "//span[contains(text(),'Search')]")
    WebElement Search1;

    @FindBy(xpath = "(//span[contains(text(),'Select')])[1]")
    WebElement Select1;

    @FindBy(xpath = "//h1[contains(text(),'Search and Select Parts')]")
    public WebElement SearchandSelect;

    @FindBy(xpath="//td[contains(@id,'c23')]/descendant::a")
    WebElement invoiceNumber;

    @FindBy(xpath = "//label[text()='From Date:']")
    WebElement txt_fromDate;

    @FindBy(xpath = "//input[contains(@id,'pte1:id1::content')]")
    WebElement txtbox_fromDate;

    @FindBy(xpath = "//label[text()='To Date:']")
    WebElement txt_Todate;

    @FindBy(xpath = "//input[contains(@id,'pte1:id2::content')]")
    WebElement txtbox_Todate;

    @FindBy(xpath = "//h1[contains(.,'Working...Please Wait')]")
    List<WebElement> loder;

    @FindBy(xpath = "//label[text()='Invoice Date:']/following::input[1]")
    WebElement InvoiceDate;

    @FindBy(xpath = "//a[text()='Parts']")
    WebElement Parts;

    @FindBy(xpath = "//td[text()='Counter Sale Manager']")
    WebElement CounterSaleManager;

    public CounterSale(WebDriver driver){
        this.driver = driver;
        this.waitMethods = new WaitMethods(driver);

    }
    /**
     * Click on Parts
     * click on counter sale manager
     */
     public void gotoCounterSaleManagerScreen() throws FileNotFoundException, InterruptedException {

         waitMethods.waitForElementToBeRefreshedAndClickable(Parts);
         WebElementActions.getActions(driver).clickElement(Parts);

         waitMethods.waitForElementToBeRefreshedAndClickable(CounterSaleManager);
         WebElementActions.getActions(driver).clickElement(CounterSaleManager);


         TestListener.saveScreenshotPNG(driver);
    }

    /**
     * verify counter sale manager elements
     */
     public void counterSaleManager() throws InterruptedException {

         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_thingsTodo);
        Assert.assertTrue(label_thingsTodo.isDisplayed());
        Assert.assertTrue(label_toBeInvoiced.isDisplayed());
        Assert.assertTrue(label_orderRequest.isDisplayed());
        Assert.assertTrue(label_retailParts.isDisplayed());
        Assert.assertTrue(label_backOrders.isDisplayed());
        Assert.assertTrue(label_lostSale.isDisplayed());
        Assert.assertTrue(label_history.isDisplayed());
        Assert.assertTrue(label_addNewCounterSale.isDisplayed());
        Assert.assertTrue(label_updateCustomerPoNumber.isDisplayed());
        Assert.assertTrue(label_counterSaleReturn.isDisplayed());
        Assert.assertTrue(label_generateRecurringInvoice.isDisplayed());

        TestListener.saveScreenshotPNG(driver);
    }

    /**
     * verify to be invoiced element
     */
     public void toBeInvoiced() throws InterruptedException {

         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_tobeInvoiced2);
        Assert.assertTrue(label_tobeInvoiced2.isDisplayed());
        Assert.assertTrue(label_openSales.isDisplayed());
        Assert.assertTrue(label_receivedOrderRequests.isDisplayed());
        if(LoginActions.environmentName.contains("EC")){
            waitMethods.waitForElementToBeRefreshedAndIsVisible(label_SaleList_EC);
            Assert.assertTrue(label_SaleList_EC.isDisplayed());
        }
        else if(LoginActions.environmentName.contains("NA")){
            waitMethods.waitForElementToBeRefreshedAndIsVisible(label_salesList_NA);
            Assert.assertTrue(label_salesList_NA.isDisplayed());
        }
        Assert.assertTrue(label_status.isDisplayed());
        Assert.assertTrue(drpdown_status.isDisplayed());
        Assert.assertTrue(label_location.isDisplayed());
        Assert.assertTrue(txt_location_field.isDisplayed());
        Assert.assertTrue(label_search.isDisplayed());
        Assert.assertTrue(txt_search_field.isDisplayed());
        Assert.assertTrue(btn_refresh.isDisplayed());
        Assert.assertTrue(btn_addNewCounterSale.isDisplayed());
        Assert.assertTrue(label_sale.isDisplayed());
        Assert.assertTrue(label_saledate.isDisplayed());
        Assert.assertTrue(label_customer.isDisplayed());
        Assert.assertTrue(label_location2.isDisplayed());
        Assert.assertTrue(label_shipTo.isDisplayed());
        Assert.assertTrue(label_customerPo.isDisplayed());
        Assert.assertTrue(label_fromOrderReq.isDisplayed());

        TestListener.saveScreenshotPNG(driver);
    }

    /**
     * verify sale summary element
     */
     public void saleSummary() throws InterruptedException {

         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_void);
        Assert.assertTrue(label_void.isDisplayed());
        Assert.assertTrue(label_estimate.isDisplayed());
        Assert.assertTrue(label_subTotal.isDisplayed());
        Assert.assertTrue(subTotal_value.isDisplayed());
        Assert.assertTrue(label_taxes.isDisplayed());
        Assert.assertTrue(taxes_value.isDisplayed());
        Assert.assertTrue(label_surcharges.isDisplayed());
        Assert.assertTrue(surcharges_value.isDisplayed());
        Assert.assertTrue(label_grandTotal.isDisplayed());
        Assert.assertTrue(grandTotal_value.isDisplayed());

        TestListener.saveScreenshotPNG(driver);
    }

    /**
     * click on search button
     */
     public void clickOnSearch() throws InterruptedException {

         waitMethods.waitForElementToBeRefreshedAndIsVisible(icon_search);
        WebElementActions.getActions(driver).clickElement(icon_search);


         waitMethods.waitForElementToBeRefreshedAndIsVisible(btn_search);
        WebElementActions.getActions(driver).clickElement(btn_search);

         waitMethods.waitForElementToBeRefreshedAndIsVisible(btn_select);
        WebElementActions.getActions(driver).clickElement(btn_select);

         waitMethods.loadingWait(loder);


         waitMethods.waitForElementToBeRefreshedAndClickable(txt_location_field);
        Thread.sleep(2000);
        WebElementActions.getActions(driver).clickElement(txt_location_field);

         waitMethods.loadingWait(loder);

        TestListener.saveScreenshotPNG(driver);

    }

    /**
     * click on add new counter sale button
     */
     public void addNewCounterSale() throws InterruptedException {

         waitMethods.waitForElementToBeRefreshedAndClickable(btn_addNewCounterSale);
        WebElementActions.getActions(driver).clickElement(btn_addNewCounterSale);

         waitMethods.loadingWait(loder);

        TestListener.saveScreenshotPNG(driver);
    }

    /**
     * verify  pop up
     */
     public void locationPopUp() throws InterruptedException {

         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_location1);
        Assert.assertTrue(label_location1.isDisplayed());
        Assert.assertTrue(txt_location1_field.isDisplayed());
        Assert.assertTrue(icon_searchLocation.isDisplayed());
        Assert.assertTrue(btn_new.isDisplayed());
        Assert.assertTrue(label_customer1.isDisplayed());
        Assert.assertTrue(txt_customer1_field.isDisplayed());
        Assert.assertTrue(icon_searchCustomer.isDisplayed());
        Assert.assertTrue(btn_cancle1.isDisplayed());
        Assert.assertTrue(btn_ok1.isDisplayed());

        TestListener.saveScreenshotPNG(driver);
    }

    /**
     * click on new button
     */
     public void addDataLocationPopUp() throws InterruptedException {

         waitMethods.waitForElementToBeRefreshedAndClickable(btn_new);
        WebElementActions.getActions(driver).clickElement(btn_new);

         waitMethods.loadingWait(loder);

        TestListener.saveScreenshotPNG(driver);
    }

    /**
     * add code
     * add name
     * click on ok button
     * check that today's date is displayed
     */
     public void newCustomer() throws InterruptedException {

         waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_code_field);
        String code = String.valueOf(WebElementActions.getActions(driver).randomAlphaNumeric(7));
        WebElementActions.getActions(driver).inputText(txt_code_field, code);
        String name = WebElementActions.getActions(driver).randomAlphaNumeric(10);
        WebElementActions.getActions(driver).inputText(txt_name_field, name);
        WebElementActions.getActions(driver).clickElement(btn_ok2);

        //       WaitActions.getWaits().loadingWait(loder);

         waitMethods.waitForElementToBeRefreshedAndIsVisible(btn_ok1);
        Thread.sleep(3000);
        WebElementActions.getActions(driver).clickElement(btn_ok1);

        //       WaitActions.getWaits().loadingWait(loder);


         waitMethods.waitForElementToBeRefreshedAndIsVisible(btn_saveExit);
        WebElementActions.getActions(driver).clickElement(btn_saveExit);



         waitMethods.waitForElementToBeRefreshedAndIsVisible(today_saledate);
        System.out.println("Todays date is :"+ReusableActions.todaysdate());
        Assert.assertTrue(today_saledate.isDisplayed());

        TestListener.saveScreenshotPNG(driver);

    }

    /**
     * verify the element present in counter sale page
     */
     public void displayCounterSale() throws InterruptedException {

         waitMethods.waitForElementToBeRefreshedAndClickable(open_customerSale);
        Thread.sleep(5000);
        WebElementActions.getActions(driver).clickElement(open_customerSale);

         waitMethods.loadingWait(loder);

         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_counterSale);
        Assert.assertTrue(label_counterSale.isDisplayed());
        Assert.assertTrue(label_location3_asterisk.isDisplayed());
        Assert.assertTrue(label_location3.isDisplayed());
        Assert.assertTrue(txt_location3_field.isDisplayed());
        Assert.assertTrue(label_customer3_asterisk.isDisplayed());
        Assert.assertTrue(label_customer3.isDisplayed());
        Assert.assertTrue(txt_customer3_field.isDisplayed());
        Assert.assertTrue(label_sale2.isDisplayed());
        Assert.assertTrue(txt_sale_field.isDisplayed());
        Assert.assertTrue(saleDate_asterisk.isDisplayed());
        Assert.assertTrue(label_saleDate.isDisplayed());
        Assert.assertTrue(txt_saleDate_field.isDisplayed());
        Assert.assertTrue(saleDate_datePicker.isDisplayed());
        Assert.assertTrue(label_reference.isDisplayed());
        Assert.assertTrue(txt_reference_field.isDisplayed());
        Assert.assertTrue(label_internalPo.isDisplayed());
        Assert.assertTrue(txt_internalPo_field.isDisplayed());
        Assert.assertTrue(label_customerPo2.isDisplayed());
        Assert.assertTrue(txt_customerPo_field.isDisplayed());
        Assert.assertTrue(label_shipTo2.isDisplayed());
        Assert.assertTrue(hyperlink_shipTo.isDisplayed());
        Assert.assertTrue(label_shipFrom.isDisplayed());
        Assert.assertTrue(hyperlink_shipFrom.isDisplayed());
        Assert.assertTrue(label_notes.isDisplayed());
        Assert.assertTrue(hyperlink_notes.isDisplayed());
        Assert.assertTrue(label_subTotal2.isDisplayed());
        Assert.assertTrue(subtotal2_value.isDisplayed());
        Assert.assertTrue(label_taxes2.isDisplayed());
        Assert.assertTrue(label_surcharges2.isDisplayed());
        Assert.assertTrue(surcharges2_value.isDisplayed());
        Assert.assertTrue(label_grandTotal2.isDisplayed());
        Assert.assertTrue(grandTotal2_value.isDisplayed());
        Assert.assertTrue(label_CAD.isDisplayed());
        Assert.assertTrue(label_viewProfitandLoss.isDisplayed());
        Assert.assertTrue(label_saleItems.isDisplayed());
        Assert.assertTrue(label_parts2.isDisplayed());
        Assert.assertTrue(txt_parts_field.isDisplayed());
        Assert.assertTrue(label_quantity2.isDisplayed());
        Assert.assertTrue(txt_quantity2_field.isDisplayed());
        Assert.assertTrue(btn_addParts.isDisplayed());
        Assert.assertTrue(btn_newParts.isDisplayed());
        Assert.assertTrue(label_orderParts.isDisplayed());
        Assert.assertTrue(label_seq.isDisplayed());
        Assert.assertTrue(label_partAndDescription.isDisplayed());
        Assert.assertTrue(label_core.isDisplayed());
        Assert.assertTrue(label_uom.isDisplayed());
        Assert.assertTrue(label_orderQty.isDisplayed());
        Assert.assertTrue(label_chargeQty.isDisplayed());
        Assert.assertTrue(label_BOqty.isDisplayed());
        Assert.assertTrue(label_lostSale2.isDisplayed());
        Assert.assertTrue(label_charge.isDisplayed());
        Assert.assertTrue(label_extended.isDisplayed());
        Assert.assertTrue(btn_void.isDisplayed());
        Assert.assertTrue(btn_saveExit.isDisplayed());
        Assert.assertTrue(btn_pickList.isDisplayed());
        Assert.assertTrue(btn_estimate.isDisplayed());
        Assert.assertTrue(btn_copy.isDisplayed());
        Assert.assertTrue(btn_invoice.isDisplayed());
        Assert.assertTrue(label_invoiceDate.isDisplayed());
        Assert.assertTrue(txt_invoiceDate_field.isDisplayed());
        Assert.assertTrue(invoice_datePicker.isDisplayed());

        TestListener.saveScreenshotPNG(driver);
    }

    /**
     * send value in parts
     */
     public void addPart() throws InterruptedException {
         if(LoginActions.environmentName.contains("EC")){
             waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_parts_field);
             Thread.sleep(3000);
             txt_parts_field.sendKeys(appProp10.getProperty("PartNumber"));
             WebElementActions.getActions(driver).clickElement(tooltip_parts_customer);
             txt_parts_field.clear();
             Thread.sleep(3000);
             WebElementActions.getActions(driver).inputText(txt_parts_field, appProp10.getProperty("PartNumber"));

         } else if(LoginActions.environmentName.contains("NA")){
             waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_parts_field);
             WebElementActions.getActions(driver).inputText(txt_parts_field, appProp37.getProperty("PartNumber"));
             WebElementActions.getActions(driver).clickElement(tooltip_parts_customer);
//             txt_parts_field.clear();
//             Thread.sleep(3000);
//             WebElementActions.getActions(driver).inputText(txt_parts_field, appProp37.getProperty("PartNumber"));


         } else if(LoginActions.environmentName.contains("QA")){
             waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_parts_field);
             Thread.sleep(3000);
             txt_parts_field.sendKeys(appProp.getProperty("PartNumber"));
             WebElementActions.getActions(driver).clickElement(tooltip_parts_customer);
             txt_parts_field.clear();
             Thread.sleep(3000);
             WebElementActions.getActions(driver).inputText(txt_parts_field, appProp.getProperty("PartNumber"));
             WebElementActions.getActions(driver).clickElement(tooltip_parts_customer);
         }

         waitMethods.loadingWait(loder);

        TestListener.saveScreenshotPNG(driver);
    }


    /**
     * verify the note
     * click on close button
     */
     public void notes() throws InterruptedException {
         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_notes2);
        Assert.assertTrue(label_notes2.isDisplayed());
        Assert.assertTrue(hyperlink_ThesearePartNote.isDisplayed());

         Thread.sleep(5000);
         waitMethods.waitForElementToBeRefreshedAndClickable(hyperlink_ThesearePartNote);
        WebElementActions.getActions(driver).clickElement(hyperlink_ThesearePartNote);

         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_popupNotes);
        Assert.assertTrue(label_popupNotes.isDisplayed());


         waitMethods.waitForElementToBeRefreshedAndClickable(btn_close);
        WebElementActions.getActions(driver).clickElement(btn_close);

         waitMethods.loadingWait(loder);

        TestListener.saveScreenshotPNG(driver);

    }

    /**
     * click on add parts button
     */
     public void clickOnaddParts() throws InterruptedException {
           Thread.sleep(10000);
        if(add_quantity.size() > 0){
            waitMethods.waitForElementToBeRefreshedAndClickable(close1);
            WebElementActions.getActions(driver).clickElement(close1);
            waitMethods.loadingWait(loder);

            waitMethods.waitForElementToBeRefreshedAndClickable(delete);
            WebElementActions.getActions(driver).clickElement(delete);

            waitMethods.loadingWait(loder);
            TestListener.saveScreenshotPNG(driver);


        }
              Thread.sleep(2000);
         waitMethods.waitForElementToBeRefreshedAndClickable(btn_addParts);
        WebElementActions.getActions(driver).clickElement(btn_addParts);
         waitMethods.loadingWait(loder);

        TestListener.saveScreenshotPNG(driver);
    }

    /**
     * send core part
     * click on core return button
     * click on cross icon and delete icon
     */
     public void addCorePart() throws InterruptedException {
        if (LoginActions.environmentName.contains("QA")) {
            waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_parts_field);
            txt_parts_field.sendKeys(appProp10.getProperty("CoreParentPart"));
            WebElementActions.getActions(driver).clickElement(tooltip_parts_core);
            Thread.sleep(2000);
            txt_parts_field.clear();

            //       WaitActions.getWaits().loadingWait(loder);

//        WaitActions.getWaits().waitForElementTobeClickable(cancle_corepart);
//        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(cancle_corepart);
//        WebElementActions.getActions().clickElement(cancle_corepart);

            WebElementActions.getActions(driver).inputText(txt_parts_field,appProp10.getProperty("CoreParentPart"));
            Thread.sleep(3000);
            WebElementActions.getActions(driver).clickElement(tooltip_parts_core);


            waitMethods.waitForElementToBeRefreshedAndIsVisible(chekbox_coreReturn);
            Assert.assertTrue(chekbox_coreReturn.isDisplayed());


            waitMethods.waitForElementToBeRefreshedAndIsVisible(btn_coreReturn);
            Assert.assertTrue(btn_coreReturn.isDisplayed());


            waitMethods.waitForElementToBeRefreshedAndClickable(btn_coreReturn);
            WebElementActions.getActions(driver).clickElement(btn_coreReturn);


            waitMethods.waitForElementToBeRefreshedAndClickable(cross_icon);
            WebElementActions.getActions(driver).clickElement(cross_icon);


            waitMethods.waitForElementToBeRefreshedAndClickable(delete_icon);
            WebElementActions.getActions(driver).clickElement(delete_icon);

            waitMethods.loadingWait(loder);

            TestListener.saveScreenshotPNG(driver);

        }
    }

    /**
     * increase the quantity
     * click on charge quantity
     * expand the element
     */
     public void addQtyAndExpand() throws InterruptedException {
         if(LoginActions.environmentName.contains("EC")){
             waitMethods.waitForElementToBeRefreshedAndIsVisible(add_quantity.get(0));
             WebElementActions.getActions(driver).inputText(add_quantity.get(0), appProp10.getProperty("add"));
             waitMethods.loadingWait(loder);

         } else if(LoginActions.environmentName.contains("NA")){
             waitMethods.waitForElementToBeRefreshedAndIsVisible(add_quantity.get(0));
             WebElementActions.getActions(driver).inputText(add_quantity.get(0), appProp37.getProperty("add"));
             waitMethods.loadingWait(loder);

         } else if(LoginActions.environmentName.contains("QA")) {
             waitMethods.waitForElementToBeRefreshedAndIsVisible(add_quantity.get(0));
             WebElementActions.getActions(driver).inputText(add_quantity.get(0), appProp.getProperty("add"));
             waitMethods.loadingWait(loder);
         }

         waitMethods.waitForElementToBeRefreshedAndClickable(label_chargeQty);
         WebElementActions.getActions(driver).clickElement(label_chargeQty);
         waitMethods.loadingWait(loder);


         waitMethods.waitForElementToBeRefreshedAndClickable(expand_icon);
         WebElementActions.getActions(driver).clickElement(expand_icon);

         waitMethods.loadingWait(loder);



        TestListener.saveScreenshotPNG(driver);
    }

    /**
     * click on select hyperlink
     * select delivery from dropdown
     * click on save and exit button
     */
     public void lostSaleReasonPopup() throws InterruptedException {

         waitMethods.waitForElementToBeRefreshedAndClickable(hyperlink_select);
        WebElementActions.getActions(driver).clickElement(hyperlink_select);

         waitMethods.loadingWait(loder);


         waitMethods.waitForElementToBeRefreshedAndIsVisible(title_lostSaleReason);
        Assert.assertTrue(title_lostSaleReason.isDisplayed());
         waitMethods.waitForElementToBeRefreshedAndIsVisible(lostSaleReason_asterisk);
        Assert.assertTrue(lostSaleReason_asterisk.isDisplayed());
        Assert.assertTrue(label_lostSaleReason.isDisplayed());
        Assert.assertTrue(txt_lostSaleReason.isDisplayed());
        Assert.assertTrue(btn_addLostSale.isDisplayed());
        Assert.assertTrue(btn_cancle.isDisplayed());
        Assert.assertTrue(btn_saveExitLost.isDisplayed());

        if(LoginActions.environmentName.contains("QA")||LoginActions.environmentName.contains("EC")) {
            waitMethods.waitForElementToBeRefreshedAndIsVisible(opt_delivery);
            WebElementActions.getActions(driver).elementSelectByVisibilityText(opt_delivery, "Delivery");
        }
        if(LoginActions.environmentName.contains("NA")){
            waitMethods.waitForElementToBeRefreshedAndIsVisible(opt_delivery);
            WebElementActions.getActions(driver).elementSelectByVisibilityText(opt_delivery,"Non-stock item");
        }


         waitMethods.waitForElementToBeRefreshedAndClickable(btn_saveExitLost);
        WebElementActions.getActions(driver).clickElement(btn_saveExitLost);

        if(LoginActions.environmentName.contains("QA")||LoginActions.environmentName.contains("EC")) {
            waitMethods.waitForElementToBeRefreshedAndIsVisible(label_delivery);
            Assert.assertTrue(label_delivery.isDisplayed());
        }
        if(LoginActions.environmentName.contains("NA")){
            waitMethods.waitForElementToBeRefreshedAndIsVisible(NonStockItem);
            Assert.assertTrue(NonStockItem.isDisplayed());
        }
         waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }

    /**
     * click on taxes hyperlink
     * click on green plus icon
     * click on Ok button
     */
     public void clickOnTaxexhyperlink() throws InterruptedException {

         waitMethods.waitForElementToBeRefreshedAndClickable(hyperlink_taxes);
        WebElementActions.getActions(driver).clickElement(hyperlink_taxes);

         waitMethods.loadingWait(loder);

         waitMethods.waitForElementToBeRefreshedAndClickable(greenPlus_icon);
        WebElementActions.getActions(driver).clickElement(greenPlus_icon);

         waitMethods.loadingWait(loder);

         waitMethods.waitForElementToBeRefreshedAndClickable(btn_taxesOk);
        WebElementActions.getActions(driver).clickElement(btn_taxesOk);

         waitMethods.loadingWait(loder);

        TestListener.saveScreenshotPNG(driver);

    }
    /**
     *
     */
     public String invoiceChangeYear(int yearToSubstract)
    {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.YEAR,-yearToSubstract);

         Date dateresult = calendar.getTime();
         SimpleDateFormat dateformat = new SimpleDateFormat("dd/MM/yyyy");

         return dateformat.format(dateresult);
    }

    /**
     * Click on invoice tab and history tab
     */
     public void invoiceNow() throws InterruptedException {
 //       if (LoginActions.environmentName.contains("QA") || LoginActions.environmentName.contains("EU") || LoginActions.environmentName.contains("NA")) {

         waitMethods.waitForElementToBeRefreshedAndClickable(InvoiceDate);
         WebElementActions.getActions(driver).inputText(InvoiceDate,invoiceChangeYear(1));

         waitMethods.waitForElementToBeRefreshedAndClickable(btn_invoice);
         WebElementActions.getActions(driver).clickElement(btn_invoice);

         waitMethods.loadingWait(loder);

            Thread.sleep(3000);
         waitMethods.waitForElementToBeRefreshedAndClickable(tab_history);
         WebElementActions.getActions(driver).clickElement(tab_history);

         waitMethods.loadingWait(loder);

            // convert WebElement into string
 /*           String matchNumber = invoiceNumber.toString();

            for (int i = 1; i <= history_sale.size(); i++) {
                //            Thread.sleep(5000);

                if (history_sale.get(i).getText().contains(matchNumber)) ;
                {
                    //          Thread.sleep(3000);
                    System.out.println("Sale number is :");
                    System.out.println(history_sale.get(i).getText());
                    break;
                }
            }
            System.out.println("Size is :" + history_sale.size());    */
         if(LoginActions.environmentName.contains("EC") ) {
             waitMethods.waitForElementToBeRefreshedAndClickable(txtbox_fromDate);
             WebElementActions.getActions(driver).inputText(txtbox_fromDate, appProp10.getProperty("fromDate"));
         }
         else if(LoginActions.environmentName.contains("NA") ){
             waitMethods.waitForElementToBeRefreshedAndClickable(txtbox_fromDate);
             WebElementActions.getActions(driver).inputText(txtbox_fromDate, appProp37.getProperty("fromDate"));
         }
         else if(LoginActions.environmentName.contains("QA") ){
             waitMethods.waitForElementToBeRefreshedAndClickable(txtbox_fromDate);
             WebElementActions.getActions(driver).inputText(txtbox_fromDate, appProp.getProperty("fromDate"));
         }
//         waitMethods.waitForElementToBeRefreshedAndClickable(txtbox_Todate);
//         WebElementActions.getActions(driver).inputText(txtbox_Todate,appProp10.getProperty(""));

         waitMethods.waitForElementToBeRefreshedAndClickable(btn_refresh2);
         WebElementActions.getActions(driver).clickElement(btn_refresh2);


         waitMethods.waitForElementToBeRefreshedAndIsVisible(CSNumber);
         Assert.assertTrue(CSNumber.isDisplayed());

            TestListener.saveScreenshotPNG(driver);

        }
 //   }

    /**
     * click on sign out button
     * verify username
     */
     public void clickOnSignOut () throws InterruptedException {

         waitMethods.waitForElementToBeRefreshedAndClickable(btn_signOut);
        WebElementActions.getActions(driver).clickElement(btn_signOut);

         waitMethods.waitForElementToBeRefreshedAndIsVisible(inputbox_Username);
        Assert.assertTrue(inputbox_Username.isDisplayed());

        TestListener.saveScreenshotPNG(driver);
    }


}



