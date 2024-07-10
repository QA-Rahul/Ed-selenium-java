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

public class AddInactiveCheckBoxOnTechTimeSheet extends TestDriverActions {

    @FindBy(xpath = "//span[text()='Complete RO']")
    WebElement title_CompleteRO;
    @FindBy(xpath = "//h1[text()='Things To Do']")
    WebElement subtitle_ThingsToDo;
    @FindBy(xpath = "//a[contains(@id,'clInv')]")
    WebElement link_ManageInvoices;
    @FindBy(xpath = "//a[contains(@id,'cl4')]")
    WebElement link_timesheet;
    @FindBy(xpath = "//a[text()='Update Customer PO Number']")
    WebElement link_UpdateCustomerPONumber;
    @FindBy(xpath = "//a[contains(@id,'clBRC')]")
    WebElement link_BulkROClosing;
    @FindBy(xpath = "//a[contains(@id,'clBRI')]")
    WebElement link_BulkROInvoicing;
    @FindBy(xpath = "(//a[text()='Generate Consolidate Invoice'])[1]")
    WebElement link_GenerateConsolidateInvoice;
    @FindBy(xpath = "//a[contains(@id,'clPOI')]")
    WebElement link_ProcessPoInvoice;
    @FindBy(xpath = "(//a[text()='Circle Check Inspections'])[1]")
    WebElement link_CircleCheckInspections;
    @FindBy(xpath = "(//a[contains(@id,'sdiTSA::disAcr')])[1]")
    WebElement subtitle_TechnicianScannedTime;
    @FindBy(xpath = "//label[text()='Technician:']")
    WebElement label_Technician;
    @FindBy(xpath = "//label[text()='Technician:']/following::input[1]")
    WebElement txtbox_Technician;
    @FindBy(xpath = "//a[contains(@id,'cilH')]")
    WebElement searchIcon_technician;
    @FindBy(xpath = "//label[text()='Location:']")
    WebElement txt_location;
    @FindBy(xpath = "//label[text()='Location:']/following::input[1]")
    WebElement txtbox_location;
    @FindBy(xpath = "//a[contains(@id,'cilF')]")
    WebElement searchIcon_location;
    @FindBy(xpath = "//label[text()='From Date:']")
    WebElement txt_fromDate;
    @FindBy(xpath = "//label[text()='From Date:']/following::input[1]")
    WebElement txtbox_fromDate;
    @FindBy(xpath = "//label[text()='To Date:']")
    WebElement txt_ToDate;
    @FindBy(xpath = "//label[text()='To Date:']/following::input[1]")
    WebElement txtbox_ToDate;
    @FindBy(xpath = "//h1[text()='Search and Select Technician']")
    WebElement txt_SearchandSelectTechnician ;
    @FindBy(xpath = "//label[contains(@id,'qryId1:conj_afrlblBy')]")
    WebElement txt_match;
    @FindBy(xpath = "//input[contains(@id,'qryId1:conj:_0')]")
    WebElement radioButton_all;
    @FindBy(xpath = "//label[text()='All']")
    WebElement txt_all;
    @FindBy(xpath = "//input[contains(@id,'qryId1:conj:_1')]")
    WebElement radioButton_any;
    @FindBy(xpath = "//label[text()='Any']")
    WebElement txt_any;
    @FindBy(xpath = "(//label[text()='First Name'])[1]")
    WebElement txt_firstName;
    @FindBy(xpath = "(//label[text()='Last Name'])[1]")
    WebElement txt_lastName;
    @FindBy(xpath = "(//label[text()='Last Name'])[1]/following::input[1]")
    WebElement txtbox_lastName;
    @FindBy(xpath = "(//label[text()='Employee Number'])[1]")
    WebElement txt_employeeNumber;
    @FindBy(xpath = "(//label[text()='Employee Number'])[1]/following::input[1]")
    WebElement txtbox_employeeNumber;
    @FindBy(xpath = "//div[contains(@id,'qryId1:_search')]")
    WebElement btn_search;
    @FindBy(xpath = "//div[contains(@id,'qryId1:_reset')]")
    WebElement btn_reset;
    @FindBy(xpath = "(//div[contains(@id,'adFlds')])[1]")
    WebElement btn_addFields;
    @FindBy(xpath = "(//div[contains(@id,'reorder')])[1]")
    WebElement btn_reorder;
    @FindBy(xpath = "//input[contains(@id,'sbc3::content')]")
    WebElement checkbox_IncludeInactive;
    @FindBy(xpath = "//label[text()='Include Inactive']")
    WebElement txt_IncludeInactive;
    @FindBy(xpath = "//div[contains(@id,'ctbClose')]")
    WebElement btn_cancle;

    @FindBy(xpath = "//span[text()='Sign Out']")
    WebElement btn_signOut;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement inputbox_Username;


    @FindBy(xpath = "//h1[text()='Working...Please Wait']")
    List<WebElement> loder;

    @FindBy(xpath = "//a[text()='Service']")
    WebElement menu_Service;
    @FindBy(xpath = "//td[text()='Complete RO']")
    WebElement subMenu_CompleteRo;

    public AddInactiveCheckBoxOnTechTimeSheet(WebDriver driver){
         this.driver = driver;
         this.waitMethods = new WaitMethods(driver);
    }

    /*
      go to completeRoScreen
     */
    public void gotoCompleteRoScreen() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(menu_Service);
        WebElementActions.getActions(driver).clickElement(menu_Service);

        waitMethods.waitForElementToBeRefreshedAndClickable(subMenu_CompleteRo);
        WebElementActions.getActions(driver).clickElement(subMenu_CompleteRo);

        waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /*
       verify title Complete To
     */
      public void verifyCompleteRo() throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndIsVisible(title_CompleteRO);
          Assert.assertTrue(title_CompleteRO.isDisplayed());
      }
    /*
     verify subtitle ThingsToDo
   */
    public void verifyThingsToDo() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(subtitle_ThingsToDo);
        Assert.assertTrue(subtitle_ThingsToDo.isDisplayed());
    }
    /*
       verify link Manage Invoices
     */
    public void verifylink_ManageInvoices() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(link_ManageInvoices);
        Assert.assertTrue(link_ManageInvoices.isDisplayed());
    }
    /*
       verify link timesheet
     */
    public void verifylink_timesheet() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(link_timesheet);
        Assert.assertTrue(link_timesheet.isDisplayed());
    }/*
       verify link UpdateCustomerPONumber
     */
    public void verifylink_UpdateCustomerPONumber() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(link_UpdateCustomerPONumber);
        Assert.assertTrue(link_UpdateCustomerPONumber.isDisplayed());
    }
    /*
       verify link BulkROClosing
     */
    public void verifylink_BulkROClosing() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(link_BulkROClosing);
        Assert.assertTrue(link_BulkROClosing.isDisplayed());
    }
    /*
       verify link BulkROInvoicing
     */
    public void verifylink_BulkROInvoicing() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(link_BulkROInvoicing);
        Assert.assertTrue(link_BulkROInvoicing.isDisplayed());
    }/*
       verify link GenerateConsolidateInvoice
     */
    public void verifylink_GenerateConsolidateInvoice() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(link_GenerateConsolidateInvoice);
        Assert.assertTrue(link_GenerateConsolidateInvoice.isDisplayed());
    }
    /*
       verify link ProcessPoInvoice
     */
    public void verifylink_ProcessPoInvoice() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(link_ProcessPoInvoice);
        Assert.assertTrue(link_ProcessPoInvoice.isDisplayed());
    }
    /*
       verify link CircleCheckInspections
     */
    public void verifylink_CircleCheckInspections() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(link_CircleCheckInspections);
        Assert.assertTrue(link_CircleCheckInspections.isDisplayed());
    }
    /*
       click on TimeSheet link
     */
    public void clickOnTimesheet() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(link_timesheet);
        WebElementActions.getActions(driver).clickElement(link_timesheet);
    }
    /*
       verify subtitleTechnicianScannedTime
     */
    public void verifysubtitle_TechnicianScannedTime()throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(subtitle_TechnicianScannedTime);
        Assert.assertTrue(subtitle_TechnicianScannedTime.isDisplayed());
    }
    /*
       verify label Technician
     */
    public void verifylabel_Technician()throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(label_Technician);
        Assert.assertTrue(label_Technician.isDisplayed());
    }
    /*
       verify textbox Technician
     */
    public void verifytxtbox_label_Technician()throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(txtbox_Technician);
        Assert.assertTrue(txtbox_Technician.isDisplayed());
    }
    /*
       verify searchIcon_technician
     */
    public void verifysearchIcon_technician()throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(searchIcon_technician);
        Assert.assertTrue(searchIcon_technician.isDisplayed());
    }
    /*
       verify text location
     */
    public void verifytxt_location() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_location);
        Assert.assertTrue(txt_location.isDisplayed());
    }
    /*
       verify textbox location
     */
    public void verifytxtbox_location()throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(txtbox_location);
        Assert.assertTrue(txtbox_location.isDisplayed());
    }
    /*
       verify search icon location
     */
    public void verifysearchIcon_location()throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(searchIcon_location);
        Assert.assertTrue(searchIcon_location.isDisplayed());
    }
    /*
       verify text fromDate
     */
    public void verifytextfromDate()throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_fromDate);
        Assert.assertTrue(txt_fromDate.isDisplayed());
    }
    /*
       verify textbox fromDate
     */
    public void verifytextboxfromDate()throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(txtbox_fromDate);
        Assert.assertTrue(txtbox_fromDate.isDisplayed());
    }
    /*
       verify text ToDate
     */
    public void verifytextToDate() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_ToDate);
        Assert.assertTrue(txt_ToDate.isDisplayed());
    }
    /*
       verify textbox ToDate
     */
    public void verifytxtbox_ToDate() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(txtbox_ToDate);
        Assert.assertTrue(txtbox_ToDate.isDisplayed());
    }
    /*
     click on search icon of Technician
     */
    public void clickOnSearchIconTechnician() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(searchIcon_technician);
        WebElementActions.getActions(driver).clickElement(searchIcon_technician);

        waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /*
       verify text SearchandSelectTechnician
     */
    public void verifytxt_SearchandSelectTechnician()throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_SearchandSelectTechnician);
        Assert.assertTrue(txt_SearchandSelectTechnician.isDisplayed());
    }
    /*
       verify text match
     */
    public void verifytextmatch() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_match);
        Assert.assertTrue(txt_match.isDisplayed());
    }
    /*
       verify radio button all
     */
    public void verifyRadioButtonAll() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(radioButton_all);
        Assert.assertTrue(radioButton_all.isDisplayed());
    }
    /*
       verify text all
     */
    public void  verifytextAll() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_all);
        Assert.assertTrue(txt_all.isDisplayed());
    }
    /*
       verify radio button any
     */
    public void verifyRadioButtonAny() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(radioButton_any);
        Assert.assertTrue(radioButton_any.isDisplayed());
    }/*
       verify text any
     */
    public void verifytextAny() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_any);
        Assert.assertTrue(txt_any.isDisplayed());
    }
    /*
       verify text firstName
     */
    public void verifytextfirstName() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_firstName);
        Assert.assertTrue(txt_firstName.isDisplayed());
    }
    /*
       verify text lastName
     */
    public void verifytxt_lastName() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_lastName);
        Assert.assertTrue(txt_lastName.isDisplayed());
    }
    /*
       verify textbox lastName
     */
    public void verifytxtbox_lastName()throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(txtbox_lastName);
        Assert.assertTrue(txtbox_lastName.isDisplayed());
    }
    /*
       verify text employeeNumber
     */
    public void verifytxt_employeeNumber()throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_employeeNumber);
        Assert.assertTrue(txt_employeeNumber.isDisplayed());
    }/*
       verify textbox employeeNumber
     */
    public void verifytxtbox_employeeNumber() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(txtbox_employeeNumber);
        Assert.assertTrue(txtbox_employeeNumber.isDisplayed());
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
    public void btn_reset() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(btn_reset);
        Assert.assertTrue(btn_reset.isDisplayed());
    }
    /*
       verify button addFields
     */
    public void btn_addFields() throws InterruptedException{
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
       verify checkbox Include Inactive
     */
    public void verifycheckbox_IncludeInactive() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(checkbox_IncludeInactive);
        Assert.assertTrue(checkbox_IncludeInactive.isDisplayed());
    }
    /*
       click on checkbox Include Inactive
     */
    public void clickOnCheckboxIncludeInactive() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(checkbox_IncludeInactive);
        WebElementActions.getActions(driver).clickElement(checkbox_IncludeInactive);

        waitMethods.loadingWait(loder);

    }
    /*
       verify text IncludeInactive
     */
    public void verifytxt_IncludeInactive() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_IncludeInactive);
        Assert.assertTrue(txt_IncludeInactive.isDisplayed());

        TestListener.saveScreenshotPNG(driver);
    }
    /*
       verify button cancle
     */
    public void verifybtn_cancle() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(btn_cancle);
        Assert.assertTrue(btn_cancle.isDisplayed());
    }
    /*
      click on cancle button
     */
    public void clickOnCanclebutton() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(btn_cancle);
        WebElementActions.getActions(driver).clickElement(btn_cancle);

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
        waitMethods.waitForElementToBeRefreshedAndIsVisible(inputbox_Username);
        Assert.assertTrue(inputbox_Username.isDisplayed());

        TestListener.saveScreenshotPNG(driver);
    }



}
