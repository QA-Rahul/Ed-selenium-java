package pages.Ticket;

import actions.WebElementActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import tests.TestDriverActions;
import utils.TestListener;
import utils.WaitMethods;

import java.util.List;

public class FedExNonRepairBillnotAutoSearchingLocationsorVendors extends TestDriverActions {


    @FindBy(xpath = "//td/a[text()='Parts']")
    WebElement Parts;
    @FindBy(xpath = "(//td[text()='AP Invoices'])[2]")
    WebElement AP_Invoices;
    @FindBy(xpath = "(//a[contains(@id,'sdi2::disAcr')])[1]")
    WebElement btn_nonRepairBill;
    @FindBy(xpath = "//span[text()='AP Invoice Manager']")
    WebElement txt_APInvoiceManager;
    @FindBy(xpath = "//label[text()='Vendor:']")
    WebElement txt_vendor;
    @FindBy(xpath = "//input[contains(@id,'itSearchVendorSelect::content')]")
    WebElement txtbox_vendor;
    @FindBy(xpath = "//input[contains(@id,'itSearchVendorSelect::content')]/following::a[1]")
    WebElement searchicon;
    @FindBy(xpath = "//label[text()='From Date:']")
    WebElement txt_fromDate;
    @FindBy(xpath = "//input[contains(@id,'id8::content')]")
    WebElement txtbox_fromDate;
    @FindBy(xpath = "//div[contains(@id,'cb1')]")
    WebElement btn_refresh;
    @FindBy(xpath = "(//label[text()='Name']/following::input)[1]")
    WebElement txtbox_search;
    @FindBy(xpath = "//div[contains(@id,'qryId1:_search')]")
    WebElement search_btn;
    @FindBy(xpath = "//div[contains(@id,'ctb4')]")
    WebElement tab_nonRepairBill;
    @FindBy(xpath = "//label[text()='Location:']")
    WebElement txt_location;
    @FindBy(xpath = "//label[text()='Location:']/following::input[1]")
    WebElement txtbox_location;
    @FindBy(xpath = "//a[contains(@id,'facNameId::lovIconId')]")
    WebElement locations_searchicon;
    @FindBy(xpath = "//label[text()='Invoice #:']")
    WebElement txt_invoice;
    @FindBy(xpath = "//label[text()='Invoice #:']/following::input[1]")
    WebElement txtbox_invoice;
    @FindBy(xpath = "//label[text()='Invoice Date:']")
    WebElement txt_invoiceDate;
    @FindBy(xpath = "//label[text()='Invoice Date:']/following::input[1]")
    WebElement txtbox_invoiceDate;
    @FindBy(xpath = "//a[contains(@id,'id1::glyph')]")
    WebElement invoice_calendericon;
    @FindBy(xpath = "//label[text()='Due Date:']")
    WebElement label_DueDate;
    @FindBy(xpath = "//label[text()='Due Date:']/following::input[1]")
    WebElement txtbox_dueDate;
    @FindBy(xpath = "//a[contains(@id,'id2::glyph')]")
    WebElement dueDate_searchicon;
    @FindBy(xpath = "//label[text()='Description:']")
    WebElement txt_description;
    @FindBy(xpath = "//label[text()='Description:']/following::input[1]")
    WebElement txtbox_description;
    @FindBy(xpath = "//label[text()='Notes:']")
    WebElement txt_notes;
    @FindBy(xpath = "//label[text()='Notes:']/following::textarea[1]")
    WebElement txtbox_notes;
    @FindBy(xpath = "//label[text()='Sub Total:']")
    WebElement txt_subTotal;
    @FindBy(xpath = "//label[text()='Taxes:']")
    WebElement txt_taxes;
    @FindBy(xpath = "//label[text()='Total:']")
    WebElement txt_total;
    @FindBy(xpath = "//div[contains(@id,'cb6')]")
    WebElement btn_cancle;
    @FindBy(xpath = "//div[contains(@id,'cb7')]")
    WebElement btn_ok;
    @FindBy(xpath = "//div[contains(@id,'cb5')]")
    WebElement btn_submit;
    @FindBy(xpath = "//div[contains(@id,'facNameId_afrLovDialogId::_ttxt')]")
    WebElement txt_SearchandSelectLocation;
    @FindBy(xpath = "//h1[text()='Search']")
    WebElement title_search;
    @FindBy(xpath = "(//label[text()='Name'])[1]")
    WebElement txt_name;
    @FindBy(xpath = "(//label[text()='Name'])[1]/following::input[1]")
    WebElement txtbox_name;
    @FindBy(xpath = "(//label[text()='Code'])[1]")
    WebElement txt_code;
    @FindBy(xpath = "(//label[text()='Code'])[1]/following::input[1]")
    WebElement txtbox_code;
    @FindBy(xpath = "(//label[text()='Address'])[1]")
    WebElement txt_address;
    @FindBy(xpath = "(//label[text()='Address']/following::input)[1]")
    WebElement txtbox_address;
    @FindBy(xpath = "//label[text()='City']")
    WebElement txt_city;
    @FindBy(xpath = "(//label[text()='City']/following::input)[1]")
    WebElement txtbox_city;
    @FindBy(xpath = "(//label[text()='Province'])[1]")
    WebElement txt_Provience;
    @FindBy(xpath = "(//label[text()='Province']/following::input)[1]")
    WebElement txtbox_provience;
    @FindBy(xpath = "(//label[text()='Phone'])[1]")
    WebElement txt_phone;
    @FindBy(xpath = "(//label[text()='Phone']/following::input)[1]")
    WebElement txtbox_phone;
    @FindBy(xpath = "//div[contains(@id,'facNameId_afrLovInternalQueryId:_search')]")
    WebElement btn_search;
    @FindBy(xpath = "//div[contains(@id,'facNameId_afrLovInternalQueryId:_reset')]")
    WebElement btn_reset;
    @FindBy(xpath = "(//div[contains(@id,'facNameId_afrLovInternalQueryId:adFlds')])[1]")
    WebElement btn_addFields;
    @FindBy(xpath = "//div[contains(@id,'facNameId_afrLovInternalQueryId:reorder')]")
    WebElement btn_reorder;
    @FindBy(xpath = "//div[contains(@id,'facNameId_afrLovDialogId_ok')]")
    WebElement btnOk;
    @FindBy(xpath = "//div[contains(@id,'facNameId_afrLovDialogId_cancel')]")
    WebElement btnCancle;
    @FindBy(xpath = "//div[contains(@id,'supNameId_afrLovDialogId::_ttxt')]")
    WebElement label_SearchandSelectVendor;
    @FindBy(xpath = "//div[contains(@id,'supNameId_afrLovDialogId_ok')]")
    WebElement btnOk_Vendor;
    @FindBy(xpath = "//div[contains(@id,'supNameId_afrLovDialogId_cancel')]")
    WebElement btnCancle_Vendor;
    @FindBy(xpath = "//div[contains(@id,'supNameId_afrLovInternalQueryId:_search')]")
    WebElement searchbtn_vendor;
    @FindBy(xpath = "//input[contains(@id,'supNameId::content')]")
    WebElement vendor_textbox;
    @FindBy(xpath = "//a[contains(@id,'supNameId::lovIconId')]")
    WebElement vendor_searchIcon;
    @FindBy(xpath = " //td[contains(@id,'facNameId_afrLovInternalTableId')]")
    WebElement firstRow_location;

    @FindBy( id = "cl1")
    WebElement btn_signOut;
    @FindBy(xpath= "//input[@name='username']")
    WebElement txtbox_username;

 /*   @FindBy(xpath = "")
    WebElement;
    @FindBy(xpath = "")
    WebElement;*/

    @FindBy(xpath = "//h1[text()='Working...Please Wait']")
    List<WebElement> loder;

    public FedExNonRepairBillnotAutoSearchingLocationsorVendors(WebDriver driver){
        this.driver = driver;
        this.waitMethods = new WaitMethods(driver);
    }

    /*
       go to AP Invoices screen
     */
    public void gotoPartScreen() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(Parts);
        WebElementActions.getActions(driver).clickElement(Parts);

        waitMethods.waitForElementToBeRefreshedAndClickable(AP_Invoices);
        WebElementActions.getActions(driver).clickElement(AP_Invoices);

    }

    /*
      click on non repair bill button
     */
    public void clickOnNonRepairBill() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(btn_nonRepairBill);
        WebElementActions.getActions(driver).clickElement(btn_nonRepairBill);

        waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /*
       verify AP Invoice Manager
     */
     public void verifyAPInvoiceManager() throws InterruptedException {
         waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_APInvoiceManager);
         Assert.assertTrue(txt_APInvoiceManager.isDisplayed());
     }
    /*
       verify text vendor
     */
    public void verifytxt_vendor() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_vendor);
        Assert.assertTrue(txt_vendor.isDisplayed());
    }
    /*
      verify textbox vendor
     */
    public void verifytxtbox_vendor() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(txtbox_vendor);
        Assert.assertTrue(txtbox_vendor.isDisplayed());
    }
    /*
       verify Search icon of vendor
     */
    public void verifySearchicon() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(searchicon);
        Assert.assertTrue(searchicon.isDisplayed());
    }
    /*
       verify text from Date
     */
    public void verifytxt_fromDate() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_fromDate);
        Assert.assertTrue(txt_fromDate.isDisplayed());
    }
    /*
      verify textbox from Date
     */
    public void verifytxtbox_fromDate() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(txtbox_fromDate);
        Assert.assertTrue(txtbox_fromDate.isDisplayed());
    }
    /*
     verify non repair bill button
    */
    public void verifyNonRepairBill() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(btn_nonRepairBill);
        Assert.assertTrue(btn_nonRepairBill.isDisplayed());
    }

    /*
     verify refresh button
    */
    public void verifybtnrefresh() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(btn_refresh);
        Assert.assertTrue(btn_refresh.isDisplayed());
    }
    /*
      click on search button
     */
    public void clickOnSearchbtn() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(tab_nonRepairBill);
        WebElementActions.getActions(driver).clickElement(tab_nonRepairBill);

        waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);

    }

    /*
     verify  Location
   */
    public void verifytxt_Location() throws InterruptedException{
        Thread.sleep(3000);
        waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_location);
        Assert.assertTrue(txt_location.isDisplayed());
    }
    /*
      verify textbox of location
     */
    public void verifytxtbox_location() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(txtbox_location);
        Assert.assertTrue(txtbox_location.isDisplayed());
    }
    /*
       verify search icon of location
     */
    public void verifylocations_searchicon() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(locations_searchicon);
        Assert.assertTrue(locations_searchicon.isDisplayed());
    }
    /*
       verify invoice
     */
    public void verifytxt_invoice() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_invoice);
        Assert.assertTrue(txt_invoice.isDisplayed());
    }
    /*
      verify textbox invoice
     */
    public void verifytxtbox_invoice() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(txtbox_invoice);
        Assert.assertTrue(txtbox_invoice.isDisplayed());
    }
    /*
       verify invoice date
     */
    public void verifytxt_invoiceDate() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_invoiceDate);
        Assert.assertTrue(txt_invoiceDate.isDisplayed());
    }
    /*
       verify textbox invoice date
     */
    public void verifytxtbox_invoiceDate() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(txtbox_invoiceDate);
        Assert.assertTrue(txtbox_invoiceDate.isDisplayed());
    }
    /*
       verify calender icon of invoice
     */
    public void verifyinvoice_calendericon() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(invoice_calendericon);
        Assert.assertTrue(invoice_calendericon.isDisplayed());
    }
    /*
       verify label due date
     */
    public void VerifyDueDate() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(label_DueDate);
        Assert.assertTrue(label_DueDate.isDisplayed());
    }
    /*
        verify textbox Due date
     */
    public void verifytxtbox_dueDate() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(txtbox_dueDate);
        Assert.assertTrue(txtbox_dueDate.isDisplayed());
    }
    /*
       verify serach icon of due date
     */
    public void verifydueDate_searchicon() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(dueDate_searchicon);
        Assert.assertTrue(dueDate_searchicon.isDisplayed());
    }
    /*
       verify description
     */
    public void verifytextDescription() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_description);
        Assert.assertTrue(txt_description.isDisplayed());
    }
    /*
        verify  notes
     */
    public void verifyLabelNotes() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_notes);
        Assert.assertTrue(txt_notes.isDisplayed());
    }
    /*
       verify textbox notes
     */
    public void verifyTextboxNotes() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(txtbox_notes);
        Assert.assertTrue(txtbox_notes.isDisplayed());
    }
    /*
       verify subTotal
     */
    public void verifysubTotal() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_subTotal);
        Assert.assertTrue(txt_subTotal.isDisplayed());
    }
    /*
       verify taxes
     */
    public void verifyTaxes() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_taxes);
        Assert.assertTrue(txt_taxes.isDisplayed());
    }
    /*
      verify total
     */
    public void verifyTotal() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_total);
        Assert.assertTrue(txt_total.isDisplayed());
    }
    /*
       verify cancle button
     */
    public void verifyCancleButton() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(btn_cancle);
        Assert.assertTrue(btn_cancle.isDisplayed());
    }
    /*
       verify button ok
     */
    public void verifyBtnOk() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(btn_ok);
        Assert.assertTrue(btn_ok.isDisplayed());
    }
    /*
       verify button submit
     */
    public void verifySubmit() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(btn_submit);
        Assert.assertTrue(btn_submit.isDisplayed());
    }
    /*
     verify description texbox
    */
    public void verifytxtbox_description() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(txtbox_description);
        Assert.assertTrue(txtbox_description.isDisplayed());
    }
    /*
       enter location
     */
    public void enterLocation() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(txtbox_location);
        WebElementActions.getActions(driver).inputText(txtbox_location,appProp54.getProperty("location"));

        TestListener.saveScreenshotPNG(driver);
    }
    /*
       click on search icon of location
     */
    public void clickSearchIconofLocation() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(locations_searchicon);
        WebElementActions.getActions(driver).clickElement(locations_searchicon);
    }
    /*
      verify title Search and select Location
     */
    public void verifytxt_SearchandSelectLocation() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_SearchandSelectLocation);
        Assert.assertTrue(txt_SearchandSelectLocation.isDisplayed());
    }

    /*
       verify search subtitle
     */
    public void verifytitle_search() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(title_search);
        Assert.assertTrue(title_search.isDisplayed());
    }
    /*
      verify text name
     */
    public void verifytxt_name() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_name);
        Assert.assertTrue(txt_name.isDisplayed());
    }

    /*
       verify textbox name
     */
    public void verifytxtbox_name() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(txtbox_name);
        Assert.assertTrue(txtbox_name.isDisplayed());
    }
    /*
      verify code
     */
    public void verifyCode() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_code);
        Assert.assertTrue(txt_code.isDisplayed());
    }

    /*
       verify textbox code
     */
    public void verifytxtbox_code() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(txtbox_code);
        Assert.assertTrue(txtbox_code.isDisplayed());
    }
    /*
      verify text address
     */
    public void verifytxt_address() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_address);
        Assert.assertTrue(txt_address.isDisplayed());
    }

    /*
       verify textbox address
     */
    public void verifytxtbox_address() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(txtbox_address);
        Assert.assertTrue(txtbox_address.isDisplayed());
    }
    /*
      verify text city
     */
    public void verifytxt_city() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_city);
        Assert.assertTrue(txt_city.isDisplayed());
    }

    /*
       verify textbox city
     */
    public void verifytxtbox_city() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(txtbox_city);
        Assert.assertTrue(txtbox_city.isDisplayed());
    }
    /*
      verify text Provience
     */
    public void verifytxt_Provience() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_Provience);
        Assert.assertTrue(txt_Provience.isDisplayed());
    }

    /*
       verify textbox provience
     */
    public void verifytxtbox_provience() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(txtbox_provience);
        Assert.assertTrue(txtbox_provience.isDisplayed());
    }
    /*
      verify text phone
     */
    public void verifytxt_phone() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_phone);
        Assert.assertTrue(txt_phone.isDisplayed());
    }

    /*
       verify button search
     */
    public void verifybtn_search() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(btn_search);
        Assert.assertTrue(btn_search.isDisplayed());
    }
    /*
       verify button reset
     */
    public void verifybtn_reset() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(btn_reset);
        Assert.assertTrue(btn_reset.isDisplayed());
    }
    /*
       verify button add fields
     */
    public void verifybtn_addFields() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(btn_addFields);
        Assert.assertTrue(btn_addFields.isDisplayed());
    }
    /*
       verify button reorder
     */
    public void verifybtn_reorder() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(btn_reorder);
        Assert.assertTrue(btn_reorder.isDisplayed());
    }

    /*
       verify button ok
     */
    public void verifybtnOk() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(btnOk);
        Assert.assertTrue(btnOk.isDisplayed());
    }
    /*
       verify button cancle
     */
    public void verifybtnCancle() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(btnCancle);
        Assert.assertTrue(btnCancle.isDisplayed());
    }
    /*
       verify textbox phone
     */
    public void verifytxtbox_phone() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(txtbox_phone);
        Assert.assertTrue(txtbox_phone.isDisplayed());
    }

    /*
       click on search button
     */
    public void clickOnSearch() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(btn_search);
        WebElementActions.getActions(driver).clickElement(btn_search);

        waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /*
      click on first row of Location name
    */
    public void clickOnFirstRow() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(firstRow_location);
        WebElementActions.getActions(driver).clickElement(firstRow_location);

        waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /*
      click on Ok button
    */
    public void clickOnOK() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(btnOk);
        WebElementActions.getActions(driver).clickElement(btnOk);

        waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /*
     enter vendor name
     */
    public void enterVendor() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(vendor_textbox);
        WebElementActions.getActions(driver).inputText(vendor_textbox,appProp54.getProperty("vendor"));

        waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /*
       click on search icon of vendor
     */
     public void clickOnsearchIcon() throws InterruptedException {
         waitMethods.waitForElementToBeRefreshedAndClickable(vendor_searchIcon);
         WebElementActions.getActions(driver).clickElement(vendor_searchIcon);
     }
     /*
        verify Title of search and select vendor
      */
     public void verifylabel_SearchandSelectVendor() throws InterruptedException{
         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_SearchandSelectVendor);
         Assert.assertTrue(label_SearchandSelectVendor.isDisplayed());
     }
     /*
        verify search button of vendor
      */
     public void verifysearchbtn_vendor() throws InterruptedException{
         waitMethods.waitForElementToBeRefreshedAndIsVisible(searchbtn_vendor);
         Assert.assertTrue(searchbtn_vendor.isDisplayed());
     }
    /*
       verify ok button of vendor
     */
    public void verifybtnOk_Vendor() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(btnOk_Vendor);
        Assert.assertTrue(btnOk_Vendor.isDisplayed());
    }
    /*
        verify cancle button of vendor
      */
    public void verifybtnCancle_Vendor() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(btnCancle_Vendor);
        Assert.assertTrue(btnCancle_Vendor.isDisplayed());

        TestListener.saveScreenshotPNG(driver);
    }
    /*
       click on search icon of vendor
   */
    public void clickOnsearchbtn_vendor() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(searchbtn_vendor);
        WebElementActions.getActions(driver).clickElement(searchbtn_vendor);

        waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /*
   click on search icon of vendor
    */
    public void clickOnbtnOk_Vendor() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(btnOk_Vendor);
        WebElementActions.getActions(driver).clickElement(btnOk_Vendor);

        waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    String invoiceNumber = String.valueOf(WebElementActions.getActions(driver).randomNumber(10000,10000000));
    /*
      enter invoice number
     */
    public void enterInvoiceNumber() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(txtbox_invoice);
        WebElementActions.getActions(driver).inputText(txtbox_invoice,invoiceNumber);

        waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /*
      click on ok button
     */
    public void clickOnOKButton() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(btn_ok);
        WebElementActions.getActions(driver).clickElement(btn_ok);

        waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /*
   click on sign out
    */
    public void clickOnSignOut() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(btn_signOut);
        WebElementActions.getActions(driver).clickElement(btn_signOut);
    }
    /*
    verify username
    */
    public void verifyUsername() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(txtbox_username);
        Assert.assertTrue(txtbox_username.isDisplayed());

        TestListener.saveScreenshotPNG(driver);
    }




}
