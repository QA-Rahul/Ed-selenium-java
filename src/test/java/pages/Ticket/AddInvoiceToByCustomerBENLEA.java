package pages.Ticket;

import actions.LoginActions;
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

public class AddInvoiceToByCustomerBENLEA extends TestDriverActions {

    @FindBy(xpath = "//a[text()='Administration']")
    WebElement menu_Administration;

    @FindBy(xpath = "(//td[text()='Customer'])[2]")
    WebElement subMenu_Customer;

    @FindBy(xpath = "//span[text()='Customer Manager']")
    WebElement title_CustomerManager;
    @FindBy(xpath = "//h1[text()='Customers List']")
    WebElement subtitle_CustomersList;
    @FindBy(xpath = "//label[text()='Search:']")
    WebElement txt_search;
    @FindBy(xpath = "//input[contains(@id,'dc_it1::content')]")
    WebElement search_txtbox;
    @FindBy(xpath = "//label[text()='Include Inactive:']")
    WebElement txt_IncludeInactive;

    @FindBy(xpath = "//span[contains(text(),'Add Customer')]")
    WebElement btn_Add_Customer;
    @FindBy(xpath = "//h2[text()='Customers List']")
    WebElement txt_CustomerList;
    @FindBy(xpath = "//span[contains(text(),'Name')]")
    WebElement label_name;
    @FindBy(xpath = "//span[text()='Code']")
    WebElement label_code;
    @FindBy(xpath = "//span[text()='Phone']")
    WebElement label_phone;
    @FindBy(xpath = "//span[text()='City']")
    WebElement label_city;
    @FindBy(xpath = "//span[text()='Address']")
    WebElement label_address;
    @FindBy(xpath = "//span[text()='Province']")
    WebElement label_province;
    @FindBy(xpath = "//span[text()='Postal Code']")
    WebElement label_postalcode;
    @FindBy(xpath = "//span[text()='Country']")
    WebElement label_country;
    @FindBy(xpath = "//span[text()='Active']")
    WebElement label_active;
    @FindBy(xpath = "(//td[contains(@id,'ct1name')])[2]/span/div/div/a")
    WebElement nameof_customer;
    @FindBy(xpath = "//label[text()='Code:']")
    WebElement txt_code;
    @FindBy(xpath = "//label[text()='Code:']/following::input[1]")
    WebElement txtbox_code;
    @FindBy(xpath = "//label[text()='Name:']")
    WebElement txt_name;
    @FindBy(xpath = "//label[text()='Name:']/following::input[1]")
    WebElement txtbox_name;
    @FindBy(xpath = "(//a[text()='Invoice To Customer'])[1]")
    WebElement tab_invoiceToCustomer;
    @FindBy(xpath = "//input[contains(@id,'sbc8::content')]")
    WebElement checkbox;
    @FindBy(xpath = "//label[text()='Include Voided']")
    WebElement txt_IncludeVoided;
    @FindBy(xpath = "//div[contains(@id,'cmdToolbarbutton25')]")
    WebElement btn_add;
    @FindBy(xpath = "//span[text()='Effective Date']")
    WebElement txt_EffectiveDate;
    @FindBy(xpath = "//span[text()='Invoice To Customer']")
    WebElement txt_InvoiceToCustomer;
    @FindBy(xpath = "//span[text()='Voided']")
    WebElement txt_voided;
    @FindBy(xpath = "//div[text()='Invoice To Customer']")
    WebElement title_InvoiceToCustomer;
    @FindBy(xpath = "//label[text()='Effective Date:']")
    WebElement label_EffectiveDate;
    @FindBy(xpath = "//label[text()='Effective Date:']/following::input[1]")
    WebElement txtbox_effectiveDate;
    @FindBy(xpath = "//a[contains(@id,'glyph')]")
    WebElement calender_icon;
    @FindBy(xpath = "//label[text()='Invoice To Customer:']")
    WebElement label_InvoiceToCustomer;
    @FindBy(xpath = "//input[contains(@id,'itSearchCustomerSelect::content')]")
    WebElement txtbox_InvoiceToCustomer;
    @FindBy(xpath = "//a[contains(@id,'cilV')]")
    WebElement magneficient_icon;
    @FindBy(xpath = "//div[contains(@id,'cb11')]")
    WebElement btn_cancle;
    @FindBy(xpath = "//div[contains(@id,'cb19')]")
    WebElement btn_saveExit;
    @FindBy(xpath = "//h1[text()='Search and Select Customer']")
    WebElement title_searchandselectcustomer;
    @FindBy(xpath = "//div[contains(@id,'sfCusQ:qryId1:_search')]")
    WebElement tab_search;
    @FindBy(xpath = "//div[contains(@id,'sfCusQ:qryId1:_reset')]")
    WebElement tab_reset;
    @FindBy(xpath = "(//div[contains(@id,'sfCusQ:qryId1:adFlds')])[1]")
    WebElement tab_AddFields;
    @FindBy(xpath = "(//div[contains(@id,'sfCusQ:qryId1:reorder')])[1]")
    WebElement tab_records;
    @FindBy(xpath = "//div[contains(@id,'cbSelectCus')]")
    WebElement tab_select;
    @FindBy(xpath = "//td[contains(@id,'table1:0:column2')]/span/a")
    WebElement nameof_invoiceToCustomer;
    @FindBy(xpath = "//label[text()='Effective Date:']/following::td[1]")
    WebElement currentDateandTime_Effectivedate;
    @FindBy(xpath = "//label[text()='Invoice To Customer:']/following::td[1]")
    WebElement Nameof_invoiceToCustomer;
    @FindBy(xpath = "//div[contains(@id,'cb10')]")
    WebElement btn_void;
    @FindBy(xpath = "//span[text()='Voided']/following::img[@title='Checked']")
    WebElement checkbox_clickSign;
    @FindBy(xpath = "//div[@id='cb3']")
    WebElement canclebtn;
    @FindBy(xpath = "//div[@id='cb2']")
    WebElement btn_ok;
    @FindBy(xpath = "//a[text()='Service']")
    WebElement menu_Service;
    @FindBy(xpath = "//td[text()='Complete RO']")
    WebElement subMenu_CompleteRo;
    @FindBy(xpath = "//span[text()='Complete RO']")
    WebElement title_CompleteRo;
    @FindBy(xpath = "//h1[text()='Ready to Submit']")
    WebElement subtitle_ReadyToSubmit;
    @FindBy(xpath = "//label[text()='Location:']")
    WebElement txt_Location;
    @FindBy(xpath = "//input[contains(@id,'itSearchFacilitySelect::content')]")
    WebElement txtbox_location;
    @FindBy(xpath = "//td[contains(@id,'c1')]/span/a")
    WebElement referenceNumber;
    @FindBy(xpath = "//h1[text()='Repair Order']")
    WebElement title_RepairOrder;
    @FindBy(xpath = "//label[text()='Unit Owner:']")
    WebElement txt_UnitOwner;
    @FindBy(xpath = "(//label[text()='Unit Owner:']/following::span)[1]")
    WebElement nameOf_UnitOwner;
    @FindBy(xpath = "//label[text()='Invoice To:']")
    WebElement txt_InvoiceTo;
    @FindBy(xpath = "(//label[text()='Invoice To:']/following::span)[1]")
    WebElement nameOf_InvoiceTo;
    @FindBy(xpath = "(//span[contains(@id,'si1')]/following::td)[4]")
    WebElement btn_signOut;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement inputbox_Username;
    @FindBy(xpath = "(//li[contains(@class,'AFAutoSuggestItem')])[3]")
    WebElement listOfElement;
/*    @FindBy(xpath = "")
    WebElement;
    @FindBy(xpath = "")
    WebElement;
    @FindBy(xpath = "")
    WebElement;
    @FindBy(xpath = "")
    WebElement;
    @FindBy(xpath = "")
    WebElement;
       */
       @FindBy(xpath = "//h1[text()='Working...Please Wait']")
       List<WebElement> loder;

    public AddInvoiceToByCustomerBENLEA(WebDriver driver){
             this.driver = driver;
             waitMethods = new WaitMethods(driver);

         }


       /**
        * go to Customer screen
        * @throws InterruptedException
        */
    public void gotoCustomerScreen() throws InterruptedException {

        waitMethods.waitForElementToBeRefreshedAndClickable(menu_Administration);
        WebElementActions.getActions(driver).clickElement(menu_Administration);

        waitMethods.waitForElementToBeRefreshedAndClickable(subMenu_Customer);
        WebElementActions.getActions(driver).clickElement(subMenu_Customer);

        TestListener.saveScreenshotPNG(driver);
    }

    /*
           verify title Customer Manager
        */
    public void verifytitle_CustomerManager() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(title_CustomerManager);
        Assert.assertTrue(title_CustomerManager.isDisplayed());
    }

    /*
        verify Customer List
     */
    public void verifyCustomerList() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(subtitle_CustomersList);
        Assert.assertTrue(subtitle_CustomersList.isDisplayed());
        Assert.assertTrue(txt_search.isDisplayed());
        Assert.assertTrue(search_txtbox.isDisplayed());
        Assert.assertTrue(txt_IncludeInactive.isDisplayed());
        Assert.assertTrue(btn_Add_Customer.isDisplayed());
    }

    /*
        verify table of Customer List with customer name
     */
    public void verifyTableOfCustomerList() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_CustomerList);
        Assert.assertTrue(txt_CustomerList.isDisplayed());
        Assert.assertTrue(label_name.isDisplayed());
        Assert.assertTrue(label_code.isDisplayed());
        Assert.assertTrue(label_phone.isDisplayed());
        Assert.assertTrue(label_city.isDisplayed());
        Assert.assertTrue(label_address.isDisplayed());
        Assert.assertTrue(label_province.isDisplayed());
        Assert.assertTrue(label_postalcode.isDisplayed());
        Assert.assertTrue(label_country.isDisplayed());
        Assert.assertTrue(label_active.isDisplayed());
        Assert.assertTrue(nameof_customer.isDisplayed());

        TestListener.saveScreenshotPNG(driver);
    }

    /*
       click on customer name
     */
    public void clickOnCustomerName() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndClickable(nameof_customer);
        WebElementActions.getActions(driver).clickElement(nameof_customer);

        waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /*
        verify customer
     */
    public void verifyCustomer() throws InterruptedException{

        Thread.sleep(5000);
        driver.switchTo().frame(2);
        Assert.assertTrue(txt_code.isDisplayed());
        Assert.assertTrue(txtbox_code.isDisplayed());
        Assert.assertTrue(txt_name.isDisplayed());
        Assert.assertTrue(txtbox_name.isDisplayed());
        Assert.assertTrue(tab_invoiceToCustomer.isDisplayed());

        TestListener.saveScreenshotPNG(driver);
    }
    /*
        click on Invoice To Customer
     */
    public void clickOnInvoiceToCustomer() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndClickable(tab_invoiceToCustomer);
        WebElementActions.getActions(driver).clickElement(tab_invoiceToCustomer);

        waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /*
        verify check box of Include Voided
     */
    public void verifyIncludeVoided() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(checkbox);
        Assert.assertTrue(checkbox.isDisplayed());
        Assert.assertTrue(txt_IncludeVoided.isDisplayed());
    }
    /*
        verify Add button
     */
    public void verifyAddButton() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(btn_add);
        Assert.assertTrue(btn_add.isDisplayed());
    }
    /*
        verify columns name of Invoice To Customer table
     */
    public void verifyColumns() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_EffectiveDate);
        Assert.assertTrue(txt_EffectiveDate.isDisplayed());
        Assert.assertTrue(txt_InvoiceToCustomer.isDisplayed());
        Assert.assertTrue(txt_voided.isDisplayed());
    }
    /*
        click on Add button
     */
    public void clickOnAddBtn() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(btn_add);
        WebElementActions.getActions(driver).clickElement(btn_add);

        waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /*
        verify Invoice to customer pop up
     */
    public void verifyInvoicetocustomerpopup() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(title_InvoiceToCustomer);
        Assert.assertTrue(title_InvoiceToCustomer.isDisplayed());

    }
    /*
        verify Effective Date
     */
    public void verifyEffectiveDate() throws InterruptedException{
         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_EffectiveDate);
         Assert.assertTrue(label_EffectiveDate.isDisplayed());
         Assert.assertTrue(txtbox_effectiveDate.isDisplayed());
         Assert.assertTrue(calender_icon.isDisplayed());
    }
    /*
        verify Invoice To Customer
     */
    public void verifyInvoiceToCustomer() throws InterruptedException{
         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_InvoiceToCustomer);
         Assert.assertTrue(label_InvoiceToCustomer.isDisplayed());
         Assert.assertTrue(txtbox_InvoiceToCustomer.isDisplayed());
         Assert.assertTrue(magneficient_icon.isDisplayed());
    }
    /*
        verify Cancle and Save Exit button
     */
    public void verifyancle_SaveExit() throws InterruptedException{
          waitMethods.waitForElementToBeRefreshedAndIsVisible(btn_cancle);
          Assert.assertTrue(btn_cancle.isDisplayed());
          Assert.assertTrue(btn_saveExit.isDisplayed());

    }
    /*
       click on search icon
     */
    public void clickOnSearchIcon() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndClickable(magneficient_icon);
        WebElementActions.getActions(driver).clickElement(magneficient_icon);

        waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /*
        verify search and select customer
     */
    public void verifysearchandselectcustomer() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(title_searchandselectcustomer);
        Assert.assertTrue(title_searchandselectcustomer.isDisplayed());
    }
    /*
        verify tabs in search and select customer
     */
    public void verifytabsinsearchandselectcustomer() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(tab_search);
        Assert.assertTrue(tab_search.isDisplayed());
        Assert.assertTrue(tab_reset.isDisplayed());
        Assert.assertTrue(tab_AddFields.isDisplayed());
        Assert.assertTrue(tab_records.isDisplayed());
        Assert.assertTrue(tab_select.isDisplayed());
    }
    /*
        click on select tab
     */
    public void clickOnSelectTab() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(tab_select);
        WebElementActions.getActions(driver).clickElement(tab_select);

        waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
     /*
        click on save and exit
     */
    public void clickOnSaveExit() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(btn_saveExit);
        WebElementActions.getActions(driver).clickElement(btn_saveExit);

        waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
     /*
        enter invoice to customer
     */
    public void enterInvoiceToCustomer() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(txtbox_InvoiceToCustomer);
        WebElementActions.getActions(driver).inputText(txtbox_InvoiceToCustomer,"abc");

        WebElementActions.getActions(driver).clickElement(listOfElement);

        waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
     /*
        click on cancle
     */
    public void clickOnCancle() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(btn_saveExit);
        WebElementActions.getActions(driver).clickElement(btn_saveExit);

        waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
     /*
        click on link present in Invoice To Customer
     */
    public void clickOnInvoiceToCustomerLink() throws InterruptedException  {
        waitMethods.waitForElementToBeRefreshedAndClickable(nameof_invoiceToCustomer);
        WebElementActions.getActions(driver).clickElement(nameof_invoiceToCustomer);

        waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
     /*
        verify Invoice to Customer
     */
    public void verifyInvoicetoCustomer() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(title_InvoiceToCustomer);
        Assert.assertTrue(title_InvoiceToCustomer.isDisplayed());
        Assert.assertTrue(label_EffectiveDate.isDisplayed());
        Assert.assertTrue(currentDateandTime_Effectivedate.isDisplayed());
        Assert.assertTrue(Nameof_invoiceToCustomer.isDisplayed());
        Assert.assertTrue(btn_void.isDisplayed());
        Assert.assertTrue(btn_cancle.isDisplayed());
    }
     /*
       click on void button
     */
    public void clickOnVoidBtn() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(btn_void);
        WebElementActions.getActions(driver).clickElement(btn_void);

        waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
     /*
        click on checkbox
     */
    public void clickOnCheckbox() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(checkbox);
        WebElementActions.getActions(driver).clickElement(checkbox);

        waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /*
        verify new entry added with right sign of checkbox
     */
    public void verifyRightSignInCheckbox() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(checkbox_clickSign);
        Assert.assertTrue(checkbox_clickSign.isDisplayed());
    }
    /*
        verify cancle and ok button
    */
    public void verifyCancle_OKbutton() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(canclebtn);
        Assert.assertTrue(canclebtn.isDisplayed());
        Assert.assertTrue(btn_ok.isDisplayed());
    }
    /*
        click on OK button
     */
    public void clickOnOKBtn() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(btn_ok);
        WebElementActions.getActions(driver).clickElement(btn_ok);

        waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /*
        go to complete Ro screen
     */
    public void goToCompleteRoScreen() throws InterruptedException {
        Thread.sleep(5000);
        driver.switchTo().defaultContent();

        waitMethods.waitForElementToBeRefreshedAndClickable(menu_Service);
        WebElementActions.getActions(driver).clickElement(menu_Service);

        waitMethods.waitForElementToBeRefreshedAndClickable(subMenu_CompleteRo);
        WebElementActions.getActions(driver).clickElement(subMenu_CompleteRo);

        TestListener.saveScreenshotPNG(driver);

    }
    /*
        verify title Complete Ro
     */
    public void verifyTitleCompleteRo() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(title_CompleteRo);
        Assert.assertTrue(title_CompleteRo.isDisplayed());
    }
    /*
        verify element present in complete ro screen
     */
    public void verifyElementofCompleteRo() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(subtitle_ReadyToSubmit);
        Assert.assertTrue(subtitle_ReadyToSubmit.isDisplayed());
        Assert.assertTrue(txt_Location.isDisplayed());
        Assert.assertTrue(txtbox_location.isDisplayed());
        Assert.assertTrue(referenceNumber.isDisplayed());

    }
    /*
       click on Reference Number
    */
    public void clickOnReferenceNumber() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndClickable(referenceNumber);
        WebElementActions.getActions(driver).clickElement(referenceNumber);

        TestListener.saveScreenshotPNG(driver);
    }
    /*
        verify repair order
     */
    public void verifyRepairOrder() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(title_RepairOrder);
        Assert.assertTrue(title_RepairOrder.isDisplayed());
    }
    /*
        verify Unit Owner
     */
    public void verifyUnitOwner() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_UnitOwner);
        Assert.assertTrue(txt_UnitOwner.isDisplayed());
        Assert.assertTrue(nameOf_UnitOwner.isDisplayed());
    }
    /*
        verify Invoice To
     */
    public void verifyInvoiceTo() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_InvoiceTo);
        Assert.assertTrue(txt_InvoiceTo.isDisplayed());
        Assert.assertTrue(nameOf_InvoiceTo.isDisplayed());

        TestListener.saveScreenshotPNG(driver);
    }
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

