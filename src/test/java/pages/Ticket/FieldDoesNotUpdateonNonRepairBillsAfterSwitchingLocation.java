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
import java.util.List;

public class FieldDoesNotUpdateonNonRepairBillsAfterSwitchingLocation extends TestDriverActions {

    @FindBy(xpath = "//a[text()='Service']")
    WebElement menu_Service;

    @FindBy(xpath = "//td[text()='Complete RO']")
    WebElement subMenu_CompleteRo;
    @FindBy(xpath = "//span[text()='Complete RO']")
    WebElement title_CompleteRo;
    @FindBy(xpath = "(//label[text()='Location:'])[1]")
    WebElement txt_Location;
    @FindBy(xpath = "//input[contains(@id,'itSearchFacilitySelect::content')]")
    WebElement txtbox_Location;
    @FindBy(xpath = "//img[contains(@id,'cilF::icon')]")
    WebElement searchIcon_location;
    @FindBy(xpath = "//h1[text()='Ready to Submit']")
    WebElement subtitle_ReadyToSubmit;
    @FindBy(xpath = "//div[contains(@id,'sfRM:ctbNRB')]")
    WebElement btn_nonRepairBill;
    @FindBy(xpath = "//div[contains(@id,'sfRM:cbNWO')]")
    WebElement btn_newRo;
    @FindBy(xpath = "(//label[text()='Location:'])[2]")
    WebElement label_location;
    @FindBy(xpath = "(//label[text()='Location:'])[2]/following::a[1]")
    WebElement lacation_name;

    @FindBy(xpath = "//label[text()='Invoice Date:']")
    WebElement txt_invoiceDate;
    @FindBy(xpath = "(//label[text()='Invoice Date:']/following::input)[1]")
    WebElement txtbox_invoicedate;
    @FindBy(xpath = "//a[contains(@id,'glyph')]")
    WebElement calendericon_invoicedate;
    @FindBy(xpath = "//label[text()='Customer:']")
    WebElement txt_customer;
    @FindBy(xpath = "//input[contains(@id,'cusNameId::content')]")
    WebElement txtbox_customer;
    @FindBy(xpath = "//a[contains(@id,'cusNameId::lovIconId')]")
    WebElement searchIcon_customer;
    @FindBy(xpath = "//label[text()='Sub Total:']")
    WebElement txt_subTotal;
    @FindBy(xpath = "//label[text()='Sub Total:']/following::span[1]")
    WebElement value_subTotal;
    @FindBy(xpath = "(//label[text()='Taxes:'])[2]")
    WebElement txt_taxes;
    @FindBy(xpath = "(//label[text()='Taxes:'])[2]/following::a[1]")
    WebElement value_taxes;
    @FindBy(xpath = "//label[text()='Total:']")
    WebElement txt_total;
    @FindBy(xpath = "//label[text()='Total:']/following::span[1]")
    WebElement value_total;
    @FindBy(xpath = "//span[text()='Seq']")
    WebElement txt_seq;
    @FindBy(xpath = "//span[text()='Account #']")
    WebElement txt_account;
    @FindBy(xpath = "//span[text()='Description/Notes']")
    WebElement txt_description_notes;
    @FindBy(xpath = "//span[text()='Quantity']")
    WebElement txt_quantity;
    @FindBy(xpath = "//span[text()='Unit Charge']")
    WebElement txt_unitCharge;
    @FindBy(xpath = "//span[text()='Amount']")
    WebElement txt_amount;
    @FindBy(xpath = "//span[text()='Tax Ovr.']")
    WebElement txt_taxOvr;
    @FindBy(xpath = "//h1[text()='Revenue Accounts']")
    WebElement title_revenueAccounts;
    @FindBy(xpath = "//input[contains(@id,'glsq:dc_it1::content')]/preceding::label[1]")
    WebElement txt_search;
    @FindBy(xpath = "//input[contains(@id,'glsq:dc_it1::content')]")
    WebElement txtbox_search;
    @FindBy(xpath = "//div[contains(@id,'cb6')]")
    List<WebElement> btn_add;
    @FindBy(xpath = "(//span[text()='Cancel'])[1]")
    WebElement btn_cancle;
    @FindBy(xpath = "(//span[text()='OK'])[1]")
    WebElement btn_ok;
    @FindBy(xpath = "(//span[text()='Invoice'])[1]")
    WebElement btn_invoice;
    @FindBy(xpath = "//div[contains(@id,'cusNameId_afrLovDialogId::_ttxt')]")
    WebElement title_SearchandSelect_CusName;
    @FindBy(xpath = "//h1[text()='Search']")
    WebElement title_search;
    @FindBy(xpath = "(//label[text()='Code'])[1]")
    WebElement txt_code;
    @FindBy(xpath = "(//label[text()='Code'])[1]/following::input[1]")
    WebElement txtbox_code;
    @FindBy(xpath = "(//label[text()='Name'])[1]")
    WebElement txt_name;
    @FindBy(xpath = "(//label[text()='Name'])[1]/following::input[1]")
    WebElement txtbox_name;
    @FindBy(xpath = "//div[contains(@id,'cusNameId_afrLovInternalQueryId:_search')]")
    WebElement btn_search;
    @FindBy(xpath = "//div[contains(@id,'cusNameId_afrLovInternalQueryId:_reset')]")
    WebElement btn_reset;
    @FindBy(xpath = "//div[contains(@id,'cusNameId_afrLovDialogId_ok')]")
    WebElement ok_btn;
    @FindBy(xpath = "//div[contains(@id,'cusNameId_afrLovDialogId_cancel')]")
    WebElement cancle_btn;
    @FindBy(xpath = "//td[contains(@id,'cusNameId_afrLovInternalTableId:8:col0')]")
    WebElement nameOfcustomer;
    @FindBy(xpath = "//label[text()='Bill To:']")
    WebElement txt_billTo;
    @FindBy(xpath = "//select[contains(@id,'soc2::content')]")
    WebElement select_billTo;
    @FindBy(xpath = "//li[contains(@class,'AFAutoSuggestItem')]")
    WebElement location_name;
    @FindBy(xpath = "//input[contains(@id,'it6::content')]")
    WebElement firstEntry_table;
    @FindBy(xpath = "//select[contains(@id,'soc1::content')]")
    List<WebElement> dropdown_fedexCategory;
    @FindBy(xpath = "//div[contains(@id,'cb4')]")
    WebElement btn_submit;

    @FindBy(xpath = "(//span[contains(@id,'si1')]/following::td)[4]")
    WebElement btn_signOut;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement inputbox_Username;
    @FindBy(xpath = "//h1[text()='Working...Please Wait']")
    List<WebElement> loder;
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
    @FindBy(xpath = "")
    WebElement;
    @FindBy(xpath = "")
    WebElement;
    @FindBy(xpath = "")
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

    public FieldDoesNotUpdateonNonRepairBillsAfterSwitchingLocation(WebDriver driver){
        this.driver = driver;
        this.waitMethods = new WaitMethods(driver);
    }

    /*
       Go to complete Ro page
     */
    public void gotoCompleteRo() throws FileNotFoundException, InterruptedException {

        waitMethods.waitForElementToBeRefreshedAndClickable(menu_Service);
        WebElementActions.getActions(driver).clickElement(menu_Service);

        waitMethods.waitForElementToBeRefreshedAndClickable(subMenu_CompleteRo);
        WebElementActions.getActions(driver).clickElement(subMenu_CompleteRo);


        TestListener.saveScreenshotPNG(driver);
    }
    /*
         verify Complete Ro
     */
      public void verifyCompleteRo() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(title_CompleteRo);
        Assert.assertTrue(title_CompleteRo.isDisplayed());
      }
    /*
         verify text Location
     */
    public void verifytextLocation() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_Location);
        Assert.assertTrue(txt_Location.isDisplayed());
    }
    /*
        verify textbox Location
     */
    public void verifytxtbox_Location() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(txtbox_Location);
        Assert.assertTrue(txtbox_Location.isDisplayed());
    }
    /*
        verify search icon of location
     */
    public void verifysearchIcon_location() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(searchIcon_location);
        Assert.assertTrue(searchIcon_location.isDisplayed());
    }
    /*
        verify Ready To Submit
     */
    public void verifysubtitle_ReadyToSubmit() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(subtitle_ReadyToSubmit);
        Assert.assertTrue(subtitle_ReadyToSubmit.isDisplayed());
    }
    /*
         verify button non Repair Bill
     */
    public void btn_nonRepairBill() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(btn_nonRepairBill);
        Assert.assertTrue(btn_nonRepairBill.isDisplayed());
    }
    /*
         verify button newRo
     */
    public void verifybtn_newRo() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(btn_newRo);
        Assert.assertTrue(btn_newRo.isDisplayed());
    }
    /*
        enter location
     */
    public void enterLocation() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(txtbox_Location);
        WebElementActions.getActions(driver).inputText(txtbox_Location,appProp56.getProperty("location"));
        Thread.sleep(2000);
        WebElementActions.getActions(driver).clickElement(location_name);

        waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);

    }
    /*
       click on non repair bill button
     */
    public void clickOnNonRepairBill() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndClickable(btn_nonRepairBill);
        WebElementActions.getActions(driver).clickElement(btn_nonRepairBill);

        waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /*
        verify location
     */
    public void verifylabel_location() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(label_location);
        Assert.assertTrue(label_location.isDisplayed());
    }
    /*
        verify name of lacation
     */
    public void verifylacation_name() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(lacation_name);
        Assert.assertTrue(lacation_name.isDisplayed());
    }
    /*
        verify invoice Date
     */
    public void verifytxt_invoiceDate() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_invoiceDate);
        Assert.assertTrue(txt_invoiceDate.isDisplayed());
    }
    /*
        verify textbox invoice date
     */
    public void verifytxtbox_invoicedate() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(txtbox_invoicedate);
        Assert.assertTrue(txtbox_invoicedate.isDisplayed());
    }
    /*
        verify calender icon invoicedate
     */
    public void verifycalendericon_invoicedate() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(calendericon_invoicedate);
        Assert.assertTrue(calendericon_invoicedate.isDisplayed());
    }
    /*
         verify text customer
     */
    public void verifytxt_customer() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_customer);
        Assert.assertTrue(txt_customer.isDisplayed());
    }
    /*
         verify textbox customer
     */
    public void verifytxtbox_customer() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(txtbox_customer);
        Assert.assertTrue(txtbox_customer.isDisplayed());
    }
    /*
          verify search icon of customer
     */
    public void verifysearchIcon_customer() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(searchIcon_customer);
        Assert.assertTrue(searchIcon_customer.isDisplayed());
    }
    /*
         verify text subTotal
     */
    public void verifytxt_subTotal() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_subTotal);
        Assert.assertTrue(txt_subTotal.isDisplayed());
    }
    /*
        verify value of subTotal
     */
    public void verifyvalue_subTotal() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(value_subTotal);
        Assert.assertTrue(value_subTotal.isDisplayed());
    }
    /*
         verify text taxes
     */
    public void verifytxt_taxes() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_taxes);
        Assert.assertTrue(txt_taxes.isDisplayed());
    }/*
         verify value of taxes
     */
    public void verifyvalue_taxes() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(value_taxes);
        Assert.assertTrue(value_taxes.isDisplayed());
    }
    /*
        verify text total
     */
    public void verifytxt_total() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_total);
        Assert.assertTrue(txt_total.isDisplayed());
    }
    /*
         verify value of total
     */
    public void verifyvalue_total() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(value_total);
        Assert.assertTrue(value_total.isDisplayed());
    }
    /*
         verify text seq
     */
    public void verifytxt_seq() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_seq);
        Assert.assertTrue(txt_seq.isDisplayed());
    }
    /*
        verify  text account
     */
    public void verifytxt_account() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_account);
        Assert.assertTrue(txt_account.isDisplayed());
    }
    /*
        verify text description notes
     */
    public void verifytxt_description_notes() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_description_notes);
        Assert.assertTrue(txt_description_notes.isDisplayed());
    }
    /*
         verify text quantity
     */
    public void verifytxt_quantity() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_quantity);
        Assert.assertTrue(txt_quantity.isDisplayed());
    }
    /*
         verify text unitCharge
     */
    public void verifytxt_unitCharge() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_unitCharge);
        Assert.assertTrue(txt_unitCharge.isDisplayed());
    }
    /*
          verify text amount
     */
    public void verifytxt_amount() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_amount);
        Assert.assertTrue(txt_amount.isDisplayed());
    }
    /*
         verify text taxOvr
     */
    public void verifytxt_taxOvr() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_taxOvr);
        Assert.assertTrue(txt_taxOvr.isDisplayed());
    }
    /*
         verify title revenueAccounts
     */
    public void verifytitle_revenueAccounts() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(title_revenueAccounts);
        Assert.assertTrue(title_revenueAccounts.isDisplayed());
    }
    /*
        verify text search
     */
    public void verifytxt_search() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_search);
        Assert.assertTrue(txt_search.isDisplayed());
    }
    /*
         verify textbox search
     */
    public void verifytxtbox_search() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(txtbox_search);
        Assert.assertTrue(txtbox_search.isDisplayed());
    }
    /*
         verify button add
     */
    public void verifybtn_add() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(btn_add.get(0));
        Assert.assertTrue(btn_add.get(0).isDisplayed());
    }
    /*
         verify button cancle
     */
    public void verifybtn_cancle() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(btn_cancle);
        Assert.assertTrue(btn_cancle.isDisplayed());
    }/*
        verify button ok
     */
    public void verifybtn_ok() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(btn_ok);
        Assert.assertTrue(btn_ok.isDisplayed());
    }
    /*
        verify button invoice
     */
    public void verifybtn_invoice() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(btn_invoice);
        Assert.assertTrue(btn_invoice.isDisplayed());
    }
    /*
         click on search icon of customer
     */
    public void clickSearchIconCustomer() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndClickable(searchIcon_customer);
        WebElementActions.getActions(driver).clickElement(searchIcon_customer);

        waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /*
          verify seach and select customer name
     */
    public void verifySearchSelect() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(title_SearchandSelect_CusName);
        Assert.assertTrue(title_SearchandSelect_CusName.isDisplayed());
    }
    /*
         verify title search
     */
    public void verifytitle_search() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(title_search);
        Assert.assertTrue(title_search.isDisplayed());
    }
    /*
        verify text code
     */
    public void verifytxt_code() throws InterruptedException{
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
          verify ok button
     */
    public void verifyok_btn() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(ok_btn);
        Assert.assertTrue(ok_btn.isDisplayed());
    }
    /*
          verify cancle button
     */
    public void verifycancle_btn() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(cancle_btn);
        Assert.assertTrue(cancle_btn.isDisplayed());
    }
    /*
        Search and select customer FedEx Ground
     */
    public void enterCustomer() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndClickable(txtbox_name);
        WebElementActions.getActions(driver).inputText(txtbox_name,appProp56.getProperty("customer"));
    }
    /*
        click on search button
     */
    public void clickSearchbtn() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndClickable(btn_search);
        WebElementActions.getActions(driver).clickElement(btn_search);

        waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }/*
        click on name Of customer
     */
    public void clickOnNameOfCustomer() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndClickable(nameOfcustomer);
        WebElementActions.getActions(driver).clickElement(nameOfcustomer);

        waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /*
        click on ok button
     */
    public void clickOnOkbtn() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndClickable(ok_btn);
        WebElementActions.getActions(driver).clickElement(ok_btn);

        waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /*
       verify billTo
     */
    public void verifyBillTo() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_billTo);
        Assert.assertTrue(txt_billTo.isDisplayed());
    }
    /*
         verify dropdown of bill to
     */
    public void verifyDropdownBillTo() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(select_billTo);
        Assert.assertTrue(select_billTo.isDisplayed());
    }
    /*
        select the location of bill to dropdown
     */
    public void selectLocationofBillTo() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndClickable(select_billTo);
        WebElementActions.getActions(driver).elementSelectByVisibilityText(select_billTo,appProp56.getProperty("billTo"));

        waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /*
          verify first entry of table
     */
    public void verifyfirstEntry_table() throws InterruptedException{
         waitMethods.waitForElementToBeRefreshedAndIsVisible(firstEntry_table);
         Assert.assertTrue(firstEntry_table.isDisplayed());
    }
    /*
        click on add button
     */
    public void clickOnAddBtn() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndClickable(btn_add.get(1));
        WebElementActions.getActions(driver).clickElement(btn_add.get(1));

        waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /*
        select fedex category from first entry
     */
    public void selectFedexCategory() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndClickable(dropdown_fedexCategory.get(0));
        WebElementActions.getActions(driver).elementSelectByVisibilityText(dropdown_fedexCategory.get(0),"Moving equipment in the yard");
    }
    /*
         select fedex category from second entry
     */
    public void selectSecondFedexcategory() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndClickable(dropdown_fedexCategory.get(1));
        WebElementActions.getActions(driver).elementSelectByVisibilityText(dropdown_fedexCategory.get(1),"Cutting off or removing locks on trailers");

        waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /*
        click on submit
     */
    public void clickOnSubmit() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndClickable(btn_submit);
        WebElementActions.getActions(driver).clickElement(btn_submit);

        waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
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
