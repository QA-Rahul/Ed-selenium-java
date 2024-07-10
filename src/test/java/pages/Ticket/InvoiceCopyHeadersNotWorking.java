package pages.Ticket;

import actions.ReusableActions;
import actions.WebElementActions;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import tests.TestDriverActions;

import org.openqa.selenium.support.FindBy;
import utils.TestListener;
import utils.WaitMethods;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public class InvoiceCopyHeadersNotWorking extends TestDriverActions {

    @FindBy(xpath = "//a[text()='Administration']")
    WebElement menu_Administration;
    @FindBy(xpath = "//td[text()='Corporate Setup Manager']")
      WebElement submenu_CorporateSetupManager;
     @FindBy(xpath = "//span[text()='Corporate Setup Manager']")
      WebElement txt_corporateSetupManager;
     @FindBy(xpath = "//h1[text()='Corporate Profile']")
      WebElement title_CorporateProfile;
     @FindBy(xpath = "//h1[text()='Things To Do']")
      WebElement title_ThingsToDo;
    @FindBy(xpath = "//div[contains(@id,'pte1:sdi12::tiB::_afrTabCnt')]")
    WebElement tab_InvoiceSetup;
    @FindBy(xpath = "//div[contains(@id,'pte1:pt2::tabf::ecbi')]")
    WebElement greaterThanSign_scrollRight;
    @FindBy(xpath = "//div[contains(@id,'sdiCP::ti::_afrTabCnt')]/a")
    WebElement tab_format;
    @FindBy(xpath = "//div[contains(@id,'sdiIM::ti::_afrTabCnt')]/a")
    WebElement tab_logo;
    @FindBy(xpath = "//div[contains(@id,'sdiInv::ti::_afrTabCnt')]/a")
    WebElement tab_copies;
    @FindBy(xpath = "//h1[text()='Invoice Formats']")
    WebElement txt_invoiceFormat;
    @FindBy(xpath = "//div[contains(@id,'ctc10')]")
    WebElement btn_add;
    @FindBy(xpath = "//th[contains(@id,'t7:c24')]/descendant::span[1]")
    WebElement col_sequence;
    @FindBy(xpath = "//th[contains(@id,'t7:c23')]/descendant::span[1]")
    WebElement col_Heading;
    @FindBy(xpath = "//th[contains(@id,'t7:c21')]/descendant::span[1]")
    WebElement col_invoiceType;
    @FindBy(xpath = "//input[contains(@id,'t7:0:it23::content')]")
    WebElement row_mainCopy;
    @FindBy(xpath = "//input[contains(@id,'t7:1:it23::content')]")
    WebElement row_customerCopy;
    @FindBy(xpath = "//a[text()='Service']")
    WebElement menu_Service;

    @FindBy(xpath = "//td[text()='Complete RO']")
    WebElement subMenu_CompleteRo;
    @FindBy(xpath = "//span[text()='Complete RO']")
    WebElement title_completeRo;
    @FindBy(xpath = "//label[text()='Location:']")
    WebElement txt_location;
    @FindBy(xpath = "//input[contains(@id,'itSearchFacilitySelect::content')]")
    WebElement txtbox_location;
    @FindBy(xpath = "//label[text()='Status:']")
    WebElement txt_status;
    @FindBy(xpath = "//input[contains(@id,'sfRM:sorSts:_0')]")
    WebElement radiobtn_ReadyToSubmit;
    @FindBy(xpath = "//input[contains(@id,'sfRM:sorSts:_0')]/following::label[1]")
    WebElement txt_ReadyToSubmit;
    @FindBy(xpath = "//input[contains(@id,'sfRM:sorSts:_1')]")
    WebElement radiobtn_submitted;
    @FindBy(xpath = "//input[contains(@id,'sfRM:sorSts:_1')]/following::label[1]")
    WebElement txt_submitted;
    @FindBy(xpath = "//input[contains(@id,'sfRM:sorSts:_3')]")
    WebElement radiobtn_invoiced;
    @FindBy(xpath = "//input[contains(@id,'sfRM:sorSts:_3')]/following::label[1]")
    WebElement txt_invoiced;
    @FindBy(xpath = "//input[contains(@id,'sfRM:sorSts:_4')]")
    WebElement radiobtn_closed;
    @FindBy(xpath = "//input[contains(@id,'sfRM:sorSts:_4')]/following::label[1]")
    WebElement txt_closed;
    @FindBy(xpath = "//input[contains(@id,'sfRM:sorSts:_5')]")
    WebElement radiobtn_rejected;
    @FindBy(xpath = "//input[contains(@id,'sfRM:sorSts:_5')]/following::label[1]")
    WebElement txt_rejected;
    @FindBy(xpath = "//div[contains(@id,'sfRM:cbRef')]")
    WebElement btn_refresh;
    @FindBy(xpath = "(//label[text()='From Date:'])[1]")
    WebElement txt_fromDate;
    @FindBy(xpath = "//input[contains(@id,'sfRM:id1::content')]")
    WebElement txtbox_fromDate;
    @FindBy(xpath = "//label[text()='To Date:']")
    WebElement txt_toDate;
    @FindBy(xpath = "//input[contains(@id,'sfRM:id2::content')]")
    WebElement txtbox_Todate;
    @FindBy(xpath = "//h1[text()='Invoiced']")
    WebElement txt_Invoiced;
    @FindBy(xpath = "//span[text()='Owner']")
    WebElement txt_Owner;
    @FindBy(xpath = "//span[text()='Unit #']")
    WebElement txt_unit;
    @FindBy(xpath = "//span[text()='Customer PO#']")
    WebElement txt_CustomerPO;
    @FindBy(xpath = "//span[text()='Date']")
    WebElement txt_Date;
    @FindBy(xpath = "//span[text()='Reference']")
    WebElement txt_Reference;
    @FindBy(xpath = "//span[text()='Internal RO']")
    WebElement txt_InternalRO;
    @FindBy(xpath = "//span[text()='Invoice #']")
    WebElement txt_Invoice;
    @FindBy(xpath = "//span[text()='Total Charge']")
    WebElement txt_TotalCharge;
    @FindBy(xpath = "//span[text()='Status']")
    WebElement txt_Status;
    @FindBy(xpath = "(//td[contains(@id,'c10')]/descendant::a)[1]")
    WebElement referenceNumber;
    @FindBy(xpath = "//h1[text()='Repair Order']")
    WebElement title_RepairOrder;
    @FindBy(xpath = "//label[text()='Location:']")
    WebElement txt_Location;
    @FindBy(xpath = "//label[text()='Location:']/following::div[1]")
    WebElement location_name;
    @FindBy(xpath = "//div[contains(@id,'cbDWCIV')]")
    WebElement tab_DeleteCustomerInvoice;
    @FindBy(xpath = "//div[contains(@id,'cbPCINV')]")
    WebElement tab_CustomerInvoice;
    @FindBy(xpath = "//div[@class='toast-item-text']")
    List<WebElement> queue;
    @FindBy(xpath = "(//a[text()='Reports'])[2]")
    WebElement menu_Reports;
    @FindBy(xpath = "//div[contains(@id,'sdi6::tiB::_afrTabCnt')]/a")
    WebElement ReportHistory_tab;
    @FindBy(xpath = "//a[contains(@id,'gl1')]")
    WebElement view;
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
    */


     public InvoiceCopyHeadersNotWorking(WebDriver driver){
         this.driver = driver;
         this.waitMethods = new WaitMethods(driver);
     }

     /*
         go to corporate setup manager
      */
     public void gotoCorporateSetupManager() throws InterruptedException {
         waitMethods.waitForElementToBeRefreshedAndClickable(menu_Administration);
         WebElementActions.getActions(driver).clickElement(menu_Administration);

         waitMethods.waitForElementToBeRefreshedAndClickable(submenu_CorporateSetupManager);
         WebElementActions.getActions(driver).clickElement(submenu_CorporateSetupManager);
     }
     /*
         verify text corporate Setup Manager
      */
       public void verifycorporateSetupManager() throws InterruptedException {
           waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_corporateSetupManager);
           Assert.assertTrue(txt_corporateSetupManager.isDisplayed());
       }
     /*
        verify title Corporate Profile
      */
       public void verifytitle_CorporateProfile() throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndIsVisible(title_CorporateProfile);
          Assert.assertTrue(title_CorporateProfile.isDisplayed());
    }
    /*
        verify title Things To Do
     */
    public void verifytitle_ThingsToDo() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(title_ThingsToDo);
        Assert.assertTrue(title_ThingsToDo.isDisplayed());
    }
    /*
       verify tab_InvoiceSetup
     */
    public void verifytab_InvoiceSetup() throws InterruptedException {

        waitMethods.waitForElementToBeRefreshedAndClickable(greaterThanSign_scrollRight);
        WebElementActions.getActions(driver).clickElement(greaterThanSign_scrollRight);

        waitMethods.waitForElementToBeRefreshedAndIsVisible(tab_InvoiceSetup);
        Assert.assertTrue(tab_InvoiceSetup.isDisplayed());
    }
    /*
        click on tab Invoice Set up
     */
    public void clickOnTabInvoiceSetUp() throws InterruptedException {

        waitMethods.waitForElementToBeRefreshedAndClickable(tab_InvoiceSetup);
        WebElementActions.getActions(driver).clickElement(tab_InvoiceSetup);
    }
    /*
       verify tab format,logo and copies
     */
    public void verifyTabFormatLogoCopies() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(tab_format);
        Assert.assertTrue(tab_format.isDisplayed());
        Assert.assertTrue(tab_logo.isDisplayed());
        Assert.assertTrue(tab_copies.isDisplayed());
    }
    /*
        verify title invoice formats
     */
    public void verifyINVOICEformats() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_invoiceFormat);
        Assert.assertTrue(txt_invoiceFormat.isDisplayed());
        Assert.assertTrue(btn_add.isDisplayed());
    }
    /*
       click on tab copies
     */
    public void clickOnTabCopies() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(tab_copies);
        WebElementActions.getActions(driver).clickElement(tab_copies);
    }
     /*
       verify sequence column
     */
    public void verifySequenceColumn() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(col_sequence);
        Assert.assertTrue(col_sequence.isDisplayed());
    }
     /*
       verify heading column
     */
    public void verifyHeadingColumn() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(col_Heading);
        Assert.assertTrue(col_Heading.isDisplayed());
    }
     /*
       verify invoice type column
     */
    public void verifyInvoiceTypeColumn() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(col_invoiceType);
        Assert.assertTrue(col_invoiceType.isDisplayed());
    }
     /*
       verify main copy
     */
    public void verifyMainCopy() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(row_mainCopy);
        Assert.assertTrue(row_mainCopy.isDisplayed());
    }
     /*
       verify Customer copy
     */
    public void verifyCustomerCopy() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(row_customerCopy);
        Assert.assertTrue(row_customerCopy.isDisplayed());
    }
    /*
        go to completeRo screen
     */
    public void gotoCompleteRo() throws FileNotFoundException, InterruptedException {

        waitMethods.waitForElementToBeRefreshedAndClickable(menu_Service);
        WebElementActions.getActions(driver).clickElement(menu_Service);

        waitMethods.waitForElementToBeRefreshedAndClickable(subMenu_CompleteRo);
        WebElementActions.getActions(driver).clickElement(subMenu_CompleteRo);

        TestListener.saveScreenshotPNG(driver);
    }
     /*
       verify title complete ro
     */
    public void verifyTitleCompleteRo() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(title_completeRo);
        Assert.assertTrue(title_completeRo.isDisplayed());
    }
     /*
       verify location
     */
    public void verifyLocation() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_location);
        Assert.assertTrue(txt_location.isDisplayed());
        Assert.assertTrue(txtbox_location.isDisplayed());
    }
     /*
       verify text status
     */
    public void verifyTextStatus() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_status);
        Assert.assertTrue(txt_status.isDisplayed());
    }
     /*
       verify radio button Ready To Submit
     */
    public void verifyRadioBtnReadyToSubmit() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(radiobtn_ReadyToSubmit);
        Assert.assertTrue(radiobtn_ReadyToSubmit.isDisplayed());
        Assert.assertTrue(txt_ReadyToSubmit.isDisplayed());
    }
     /*
       verify radio button submitted
     */
    public void verifyradiobtnSubmitted() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(radiobtn_submitted);
        Assert.assertTrue(radiobtn_submitted.isDisplayed());
        Assert.assertTrue(txt_submitted.isDisplayed());
    }
     /*
       verify radio button invoiced
     */
    public void verifyRadiobtnInvoiced() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(radiobtn_invoiced);
        Assert.assertTrue(radiobtn_invoiced.isDisplayed());
        Assert.assertTrue(txt_invoiced.isDisplayed());
    }
     /*
       verify radio button closed
     */
    public void verifyRadiobtnClosed() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(radiobtn_closed);
        Assert.assertTrue(radiobtn_closed.isDisplayed());
        Assert.assertTrue(txt_closed.isDisplayed());
    }
     /*
       verify radio button closed
     */
    public void verifyRadiobtnRejected() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(radiobtn_rejected);
        Assert.assertTrue(radiobtn_rejected.isDisplayed());
        Assert.assertTrue(txt_rejected.isDisplayed());
    }
    /*
      verify from date field
    */
    public void verifyFromDateField() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_fromDate);
        Assert.assertTrue(txt_fromDate.isDisplayed());
        Assert.assertTrue(txtbox_fromDate.isDisplayed());
    }
     /*
       verify to date field
     */
    public void verifyToDateField() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_toDate);
        Assert.assertTrue(txt_toDate.isDisplayed());
        Assert.assertTrue(txtbox_Todate.isDisplayed());
    }
     /*
       verify refresh button
     */
    public void verifyRefreshButton() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(btn_refresh);
        Assert.assertTrue(btn_refresh.isDisplayed());
    }
    /*
       click on radio button invoiced
     */
    public void clickOnInvoiced() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(radiobtn_invoiced);
        WebElementActions.getActions(driver).clickElement(radiobtn_invoiced);
    }
    /*
       enter from date
    */
    public void enterFromDate() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(txtbox_fromDate);
        WebElementActions.getActions(driver).inputText(txtbox_fromDate,appProp66.getProperty("fromDate"));
    }
    /*
      enter To date
    */
    public void enterToDate() throws InterruptedException {
//         Thread.sleep(5000);
        waitMethods.waitForElementToBeRefreshedAndClickable(txtbox_Todate);
        WebElementActions.getActions(driver).inputText(txtbox_Todate,appProp66.getProperty("toDate"));
    }
     /*
       click on Refresh button
     */
    public void clickOnRefreshbtn() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(btn_refresh);
        WebElementActions.getActions(driver).clickElement(btn_refresh);
    }
     /*
       verify text invoiced
     */
    public void verifyInvoiced() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_Invoiced);
        Assert.assertTrue(txt_Invoiced.isDisplayed());
    }
     /*
       verify columns of invoice table
     */
    public void verifyColumnsofInvoice() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_Owner);
        Assert.assertTrue(txt_Owner.isDisplayed());
        Assert.assertTrue(txt_unit.isDisplayed());
        Assert.assertTrue(txt_CustomerPO.isDisplayed());
        Assert.assertTrue(txt_Date.isDisplayed());
        Assert.assertTrue(txt_Reference.isDisplayed());
        Assert.assertTrue(txt_InternalRO.isDisplayed());
        Assert.assertTrue(txt_Invoice.isDisplayed());
        Assert.assertTrue(txt_TotalCharge.isDisplayed());
        Assert.assertTrue(txt_Status.isDisplayed());

    }
     /*
         click on reference number
     */
    public void clickOnReferenceNumber() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(referenceNumber);
        WebElementActions.getActions(driver).clickElement(referenceNumber);
    }
    /*
       verify title Repair order
     */
    public void verifyTitleRepairOrder() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(title_RepairOrder);
        Assert.assertTrue(title_RepairOrder.isDisplayed());
    }
    /*
       verify Location
     */
    public void verifyLocationName() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_Location);
        Assert.assertTrue(txt_Location.isDisplayed());
        Assert.assertTrue(location_name.isDisplayed());
    }
    /*
       verify delete customer invoice
     */
    public void verifyDeleteCustomerInvoice() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(tab_DeleteCustomerInvoice);
        Assert.assertTrue(tab_DeleteCustomerInvoice.isDisplayed());
    }
    /*
       verify customer invoice tab
     */
    public void verifyCustomerInvoiceTab() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(tab_CustomerInvoice);
        Assert.assertTrue(tab_CustomerInvoice.isDisplayed());
    }
    /*
       click on Customer Invoice tab
     */
    public void clickOnCustomerInvoiceTab() throws InterruptedException, IOException {
        Thread.sleep(10000);
        ReusableActions.deleteDownloadedFile();

        waitMethods.waitForElementToBeRefreshedAndClickable(tab_CustomerInvoice);
        WebElementActions.getActions(driver).clickElement(tab_CustomerInvoice);

        Thread.sleep(5000);
        if(queue.size()>0){

            waitMethods.waitForElementToBeRefreshedAndClickable(menu_Reports);
            WebElementActions.getActions(driver).clickElement(menu_Reports);

            waitMethods.waitForElementToBeRefreshedAndClickable(ReportHistory_tab);
            WebElementActions.getActions(driver).clickElement(ReportHistory_tab);

            waitMethods.waitForElementToBeRefreshedAndClickable(view);
            WebElementActions.getActions(driver).clickElement(view);

        }

        Thread.sleep(10000);
        File dir = new File(System.getProperty("user.dir") + "\\downloadFiles");
        File[] dirContents = dir.listFiles();
        String fileName = dirContents[0].getName();
        String url = System.getProperty("user.dir") + "\\downloadFiles\\" + fileName;
        if (url.contains(".pdf")) {
            File file = new File(url);
            FileInputStream fis = new FileInputStream(file);
            PDDocument document = null;
            document = PDDocument.load(fis);
            PDFTextStripper pdfStripper = new PDFTextStripper();
            String pdfFullText = pdfStripper.getText(document);
            //        System.out.println(pdfFullText);
            Thread.sleep(5000);
            if(pdfFullText.contains("Main Copy") && pdfFullText.contains("Customer Copy")){
                System.out.println("Main Copy" + "Customer Copy");
            }
            fis.close();
        }
        Thread.sleep(10000);
        ReusableActions.deleteDownloadedFile();


    }
    /*
       verify
     */
 /*   public void b() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible();
        Assert.assertTrue(.isDisplayed());
    }
    /*
       verify
     */
 /*   public void b() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible();
        Assert.assertTrue(.isDisplayed());
    }
    /*
       verify
     */
 /*   public void b() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible();
        Assert.assertTrue(.isDisplayed());
    }
    /*
       verify
     */
 /*   public void b() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible();
        Assert.assertTrue(.isDisplayed());
    }












  */





}
