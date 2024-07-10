package pages.Ticket;

import actions.ReusableActions;
import actions.WaitActions;
import actions.WebElementActions;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import tests.TestDriverActions;
import utils.TestListener;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import utils.WaitMethods;


public class TechnicianTimeEntriestobelogged extends TestDriverActions {

    @FindBy(xpath = "//a[contains(.,'Non Repair')]")
    WebElement btn_Non_RepairBills;
    @FindBy(xpath = "(//label[text()='Location:']/preceding-sibling::span)[2]")
    WebElement label_RequiredLocation;

    @FindBy(xpath = "(//label[text()='Location:'])[2]")
    WebElement Location;
    @FindBy(xpath = "//label[text()='Reference:']")
    WebElement referance;

    @FindBy(xpath = "//label[text()='Invoice Date:']/preceding-sibling::span")
    WebElement label_RequiredInvoiceDate;

    @FindBy(xpath = "//label[text()='Invoice Date:']")
    WebElement label_InvoiceDate;

    @FindBy(xpath = "//label[text()='Invoice Date:']/parent::td/following-sibling::td/child::input")
    public WebElement todays_Date;

    @FindBy(xpath = "//label[text()='Customer:']/preceding-sibling::span")
    public WebElement RequiredCustomer;

    @FindBy(xpath = "//label[text()='Customer:']")
    public WebElement label_Customer;

    @FindBy(xpath = "(//label[text()='Customer:']/following::td/child::input)[1]")
    public WebElement txt_CustomerTextArea;

    @FindBy(xpath = "//input[contains(@id,':0:it13::content')]")
    public WebElement txt_CustomerPO;

    @FindBy(xpath = "//input[contains(@id,':0:cusNameId::content')]")
    public WebElement label_CustomerPOTextArea;

    @FindBy(xpath = "//li[text()='905 Truck and Trailer Repair']")
    public WebElement label_dropdown905;

    @FindBy(xpath = "(//a[contains(.,'Add')])[1]")
    public WebElement label_Add;

    @FindBy(xpath = "//label[text()='Technician:']/preceding-sibling::span")
    public WebElement RequiredTechanician;

    @FindBy(xpath = "//label[text()='Technician:']")
    public WebElement label_Technician;

    @FindBy(xpath = "//input[contains(@id,':itSearchEmployeeSelect::content')]")
    public WebElement txt_TechanicanTextArea;

    @FindBy(xpath = "//a[contains(.,'Add Technician Time')]")
    public WebElement btn_AddTechanicanTime;

    @FindBy(xpath = "//span[text()='Technician is required.']")
    public WebElement TechnicianIsRequired;

    @FindBy(xpath = "(//span[text()='OK'])[2]")
    public WebElement label_Ok;

    @FindBy(xpath = "//span[contains(text(),' timesheet entry for zero time.')]")
    public WebElement txt_timeSheetentryforzerotime;

    @FindBy(xpath = "(//a[contains(.,'OK')])[2]")
    public WebElement txt_Ok;

    @FindBy(xpath = "//input[contains(@id,'it4::content')]")
    public WebElement chargeHours;

    @FindBy(xpath = "//input[contains(@id,':it10::content')]")
    public WebElement Minutes;

    @FindBy(xpath = "(//td[contains(.,'The number must be between 0 and 59.')])[3]")
    public WebElement txt_thenumberMustbeZerotoFifitynign;

    @FindBy(xpath = "(//img[contains(@src,'DeleteEna')])[2]")
    public WebElement img_Cancel;

    @FindBy(xpath = "//img[contains(@src,'icon_bg_delete_cancel_ena.png')]")
    public WebElement img_cancelSymbol;

    @FindBy(xpath = "//div[contains(@id,':0:b1')]//a[contains(.,'Close')]")
    public WebElement btn_Close;

    @FindBy(xpath = "(//a[contains(.,'Cancel')])[1]")
    public WebElement btn_Cancel2;

    @FindBy(xpath = "(//a[contains(.,'OK')])[1]")
    public WebElement btn_Ok;

    @FindBy(xpath = "(//span[text()='OK'])[2]")
    public WebElement Ok1;

    @FindBy(xpath = "//input[contains(@id,':it9::content')]")
    public WebElement UnitCharge;

    @FindBy(xpath = "//input[contains(@id,'it8::content')]")
    public WebElement Quantity;

    @FindBy(xpath = "(//a[contains(text(),'OI0003')])[1]")
    public WebElement Referance;


    @FindBy(xpath = "(//span[text()='Invoice'])[2]")
    public WebElement btn_Invoice;

    @FindBy(xpath = "(//td[contains(.,'Receipts to Apply')])[3]")
    public WebElement txt_ReceiptstoApply;

    @FindBy(xpath = "//label[contains(.,'Invoice Total:')]")
    public WebElement InvocieTotal;

    @FindBy(xpath = "//label[contains(.,'Invoice Total:')]/following::td[1]")
    public WebElement InvoiceTotalValue;

    @FindBy(xpath = "//span[contains(.,'Tender')]")
    public WebElement Tendor;

    @FindBy(xpath = "//span[contains(.,'Payment Amount')]")
    public WebElement txt_PaymentAmout;

    @FindBy(xpath = "(//span[contains(.,'Description')])[2]")
    public WebElement txt_Description;

    @FindBy(xpath = "(//span[contains(.,'Reference')])[2]")
    public WebElement txt_Referance;

    @FindBy(xpath = "//select[contains(@id,':soc1::content')]")
    public WebElement txt_Account1;

    @FindBy(xpath = "(//select[contains(@id,':soc2::content')])[2]")
    public WebElement txt_Account2;

    @FindBy(xpath = "//select[contains(@id,':soc3::content')]")
    public WebElement txt_Account3;

    @FindBy(xpath = "(//span[text()='Invoice'])[3]")
    public  WebElement Invoice;

    @FindBy(xpath = "(//a[contains(.,'Reports')])[2]")
    public WebElement Reports;

    @FindBy(xpath = "//span[text()='Employees']")
    public WebElement Employees;

    @FindBy(xpath = "//td[contains(.,'Time Sheet Export')]")
    public WebElement TimeSheetExport;

    @FindBy(xpath = "(//a[contains(.,'Run Report')])[2]")
    public WebElement RunReport;

    @FindBy(xpath = "//label[contains(text(),'Hide Non-RO Times')]/preceding-sibling::input")
    public WebElement HideNon_ROTimes;


    @FindBy(xpath = "//label[contains(text(),'Description:')]")
    public WebElement lebal_Description;

    @FindBy(xpath = "//label[contains(text(),'Notes:')]")
    public WebElement lebal_Note;

    @FindBy(xpath = "//label[contains(.,'Sub Total:')]")
    public WebElement lebal_SubTotal;

    @FindBy(xpath = "//label[contains(.,'Sub Total:')]//parent::td//following-sibling::td//table//tr//following-sibling::td/child::span")
    public WebElement input_subTotalZero;

    @FindBy(xpath = "//td[contains(.,'Sub Total:')]/parent::tr/following-sibling::tr[1]/child::td[1]/child::label")
    public WebElement label_Taxes;

    @FindBy(xpath = "//a[@class='xgn']/span")
    public WebElement input_TaxesZero;

    @FindBy(xpath = "//label[text()='Total:']")
    WebElement txt_total;

    @FindBy(xpath = "//td[contains(.,'Sub Total:')]/parent::tr/following-sibling::tr[3]//child::tr/child::td[2]/span")
    public WebElement input_Tatalzero;


    @FindBy(xpath = "//span[contains(.,'Seq')]")
    public WebElement label_Seq;

    @FindBy(xpath = "//span[contains(text(),'Account #')]")
    public WebElement label_Account;

    @FindBy(xpath = "//span[contains(text(),'Description/Notes')]")
    public WebElement label_DescriptionNotes;

    @FindBy(xpath = "//span[text()='Timesheet Entries']")
    public WebElement lebal_timeSheetEntries;

    @FindBy(xpath = "//span[contains(text(),'Quantity')]")
    public WebElement lebal_Quantity;

    @FindBy(xpath = "//span[contains(text(),'Unit Charge')]")
    public WebElement lebal_UnitCharge;

    @FindBy(xpath = "//span[contains(text(),'Amount')]")
    public WebElement lebal_Amount;

    @FindBy(xpath = "//span[contains(text(),'Tax Ovr.')]")
    public WebElement lebal_TaxOvr;
    @FindBy(xpath = "//a[contains(.,'Sign Out')]")
    WebElement btn_signOut;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement inputbox_Username;
    @FindBy(xpath = "//a[text()='Service']")
    WebElement menu_Service;
    @FindBy(xpath = "//td[text()='Complete RO']")
    WebElement subMenu_CompleteRo;

    @FindBy(xpath = "//h1[text()='Working...Please Wait']")
    List<WebElement> loder;

    public TechnicianTimeEntriestobelogged(WebDriver driver){
        this.driver = driver;
        this.waitMethods = new WaitMethods(driver);
    }

    /**
     * go to complete RO Screen
     */
    public void goToCompleteROScreen() throws InterruptedException, FileNotFoundException {

        waitMethods.waitForElementToBeRefreshedAndClickable(menu_Service);
        WebElementActions.getActions(driver).clickElement(menu_Service);

        waitMethods.waitForElementToBeRefreshedAndClickable(subMenu_CompleteRo);
        WebElementActions.getActions(driver).clickElement(subMenu_CompleteRo);

        TestListener.saveScreenshotPNG(driver);

    }

    /*click on Non-Repair Bills **/
    public void clickOnNonRepairBills() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(btn_Non_RepairBills);
        WebElementActions.getActions(driver).clickElement(btn_Non_RepairBills);


    }

    /*verify Required location,location,Referance **/
    public void verifyRequiredLcoation() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(label_RequiredLocation);
        Assert.assertTrue(label_RequiredLocation.isDisplayed());

        waitMethods.waitForElementToBeRefreshedAndIsVisible(Location);
        Assert.assertTrue(Location.isDisplayed());

        waitMethods.waitForElementToBeRefreshedAndIsVisible(referance);
        Assert.assertTrue(referance.isDisplayed());


    }

    /*verify RequiredInvoicedate , Invoicedate ,invoiceTextarea **/
    public void verifyRequiredInvoiceDate() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(label_RequiredInvoiceDate);
        Assert.assertTrue(label_RequiredInvoiceDate.isDisplayed());

        waitMethods.waitForElementToBeRefreshedAndIsVisible(label_InvoiceDate);
        Assert.assertTrue(label_InvoiceDate.isDisplayed());

        waitMethods.waitForElementToBeRefreshedAndIsVisible(todays_Date);
        System.out.println("Todays date is :" + ReusableActions.todaysdate());
        Assert.assertTrue(todays_Date.isDisplayed());
        TestListener.saveScreenshotPNG(driver);
    }

    /*verify RequiredCustomer, Customer,textArea **/
    public void verifyRequiredCstomer() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(RequiredCustomer);
        Assert.assertTrue(RequiredCustomer.isDisplayed());

        waitMethods.waitForElementToBeRefreshedAndIsVisible(label_Customer);
        Assert.assertTrue(label_Customer.isDisplayed());

        waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_CustomerTextArea);
        Assert.assertTrue(txt_CustomerTextArea.isDisplayed());
    }

    /* verify customerPO ,CustomerTextArea**/
    public void verifyCustomerPO() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_CustomerPO);
        Assert.assertTrue(txt_CustomerPO.isDisplayed());

        waitMethods.waitForElementToBeRefreshedAndIsVisible(label_CustomerPOTextArea);
        Assert.assertTrue(label_CustomerPOTextArea.isDisplayed());
    }

    /*verify Note,Description **/
    public void verifyDescription() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(lebal_Description);
        Assert.assertTrue(lebal_Description.isDisplayed());

        waitMethods.waitForElementToBeRefreshedAndIsVisible(lebal_Note);
        Assert.assertTrue(lebal_Note.isDisplayed());

    }

    /*verify sub-total,Taxes,total**/
    public void verifySubtotal() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(lebal_SubTotal);
        Assert.assertTrue(lebal_SubTotal.isDisplayed());

        waitMethods.waitForElementToBeRefreshedAndIsVisible(label_Taxes);
        Assert.assertTrue(label_Taxes.isDisplayed());

        waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_total);
        Assert.assertTrue(txt_total.isDisplayed());

    }

    /*verify Seq ,Account#, Description/Notes,TimeSheetEntries**/
    public void verifySeq() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(label_Seq);
        Assert.assertTrue(label_Seq.isDisplayed());

        waitMethods.waitForElementToBeRefreshedAndIsVisible(label_Account);
        Assert.assertTrue(label_Account.isDisplayed());

        waitMethods.waitForElementToBeRefreshedAndIsVisible(label_DescriptionNotes);
        Assert.assertTrue(label_DescriptionNotes.isDisplayed());

        waitMethods.waitForElementToBeRefreshedAndIsVisible(lebal_timeSheetEntries);
        Assert.assertTrue(lebal_timeSheetEntries.isDisplayed());
    }

    /*verify Quantity,UnitCharge,Amount,TaxOver**/
    public void verifyQuantity() throws InterruptedException {

        waitMethods.waitForElementToBeRefreshedAndIsVisible(lebal_Quantity);
        Assert.assertTrue(lebal_Quantity.isDisplayed());

        waitMethods.waitForElementToBeRefreshedAndIsVisible(lebal_UnitCharge);
        Assert.assertTrue(lebal_UnitCharge.isDisplayed());

        waitMethods.waitForElementToBeRefreshedAndIsVisible(lebal_Amount);
        Assert.assertTrue(lebal_Amount.isDisplayed());

        waitMethods.waitForElementToBeRefreshedAndIsVisible(lebal_TaxOvr);
        Assert.assertTrue(lebal_TaxOvr.isDisplayed());

    }

    /* enter the name on CustomerTextArea **/
    public void entertheCustomerTextArea() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(txt_CustomerTextArea);
        WebElementActions.getActions(driver).inputText(txt_CustomerTextArea, appProp79.getProperty("Customer"));
        waitMethods.loadingWait(loder);
        WebElementActions.getActions(driver).clickElement(label_dropdown905);
        Thread.sleep(3000);

    }

    /*Add on TimeSheetEntrires**/
    public void addTimesheetEntries() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(label_Add);
        WebElementActions.getActions(driver).clickElement(label_Add);
    }

    /*verify Techanican **/
    public void verifyTechanican() throws InterruptedException {

        waitMethods.waitForElementToBeRefreshedAndIsVisible(RequiredTechanician);
        Assert.assertTrue(RequiredTechanician.isDisplayed());

        waitMethods.waitForElementToBeRefreshedAndIsVisible(label_Technician);
        Assert.assertTrue(label_Technician.isDisplayed());

        waitMethods.waitForElementToBeRefreshedAndIsVisible(btn_AddTechanicanTime);
        Assert.assertTrue(btn_AddTechanicanTime.isDisplayed());

    }

    /*click On AddTechanicanTime**/
    public void clickOnAddTechnican() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(btn_AddTechanicanTime);
        WebElementActions.getActions(driver).clickElement(btn_AddTechanicanTime);
        Thread.sleep(3000);
        waitMethods.loadingWait(loder);
    }

    /*verify Technician is required.**/
    public void TechnicianIsRequired() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(TechnicianIsRequired);
        Assert.assertTrue(TechnicianIsRequired.isDisplayed());
        waitMethods.loadingWait(loder);
    }

    /*lick On Ok **/
    public void clickOnOk() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(label_Ok);
        WebElementActions.getActions(driver).clickElement(label_Ok);
        waitMethods.loadingWait(loder);
    }

    /*enter Techanician **/
    public void enterTechanician() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(txt_TechanicanTextArea);
        WebElementActions.getActions(driver).inputText(txt_TechanicanTextArea, appProp79.getProperty("Techanician1"));
        waitMethods.loadingWait(loder);

    }

    /*verify cannot create a timeSheet entry for zero time**/
    public void verifyCreateTimeSheetEntry() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_timeSheetentryforzerotime);
        Assert.assertTrue(txt_timeSheetentryforzerotime.isDisplayed());
        waitMethods.loadingWait(loder);

        waitMethods.waitForElementToBeRefreshedAndClickable(txt_Ok);
        WebElementActions.getActions(driver).clickElement(txt_Ok);

    }

    /*enter ChargeHours Textarea**/
    public void enterChargeHourstextarea() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(chargeHours);
        WebElementActions.getActions(driver).inputText(chargeHours, appProp79.getProperty("ChargeHours"));

        waitMethods.waitForElementToBeRefreshedAndClickable(Minutes);
        WebElementActions.getActions(driver).inputText(Minutes, appProp79.getProperty("Minutes"));

    }

    /*verify The number must be 0 to 59**/
    public void verifyTheNumberMustbeZerotoFiftynign() throws InterruptedException {

        waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_thenumberMustbeZerotoFifitynign);
        Assert.assertTrue(txt_thenumberMustbeZerotoFifitynign.isDisplayed());



    }

    /*enter charge Hours and minutes **/
    public void enterChargeHours() throws InterruptedException {

        waitMethods.waitForElementToBeRefreshedAndClickable(chargeHours);
        WebElementActions.getActions(driver).inputText(chargeHours, appProp79.getProperty("ChargeHours1"));

        waitMethods.waitForElementToBeRefreshedAndClickable(Minutes);
        WebElementActions.getActions(driver).inputText(Minutes, appProp79.getProperty("Minutes1"));
        waitMethods.loadingWait(loder);

    }

    /* Clear and Enter the Techanican **/
    public void entertheTechanican2() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(txt_TechanicanTextArea);
        txt_TechanicanTextArea.clear();
        WebElementActions.getActions(driver).inputText(txt_TechanicanTextArea, appProp79.getProperty("Techanician2"));
        txt_TechanicanTextArea.sendKeys(Keys.ENTER);
        waitMethods.loadingWait(loder);
    }

    /*enter charge Hours and minutes **/
    public void enterChargeHours2() throws InterruptedException {

        waitMethods.waitForElementToBeRefreshedAndClickable(chargeHours);
        WebElementActions.getActions(driver).inputText(chargeHours, appProp79.getProperty("ChargeHours2"));

        waitMethods.waitForElementToBeRefreshedAndClickable(Minutes);
        WebElementActions.getActions(driver).inputText(Minutes, appProp79.getProperty("Minutes2"));
        waitMethods.loadingWait(loder);
    }

    /*click on Cancel **/
    public void clickOnCancel() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(img_Cancel);
        WebElementActions.getActions(driver).clickElement(img_Cancel);
    }

    /*verify cancel img**/
    public void verifyCancelImg() throws InterruptedException {

        waitMethods.waitForElementToBeRefreshedAndIsVisible(img_cancelSymbol);
        Assert.assertTrue(img_cancelSymbol.isDisplayed());

    }

    /*click on close **/
    public void clickOnClose() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(btn_Close);
        WebElementActions.getActions(driver).clickElement(btn_Close);

    }

    /*verify close ,ok Invoice **/
    public void verifyclose() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(btn_Cancel2);
        Assert.assertTrue(btn_Cancel2.isDisplayed());

        waitMethods.waitForElementToBeRefreshedAndIsVisible(btn_Ok);
        Assert.assertTrue(btn_Ok.isDisplayed());

        waitMethods.waitForElementToBeRefreshedAndIsVisible(btn_Invoice);
        Assert.assertTrue(btn_Invoice.isDisplayed());

    }

    /*click on Ok button**/
    public void clickOnOkButton() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(btn_Ok);
        WebElementActions.getActions(driver).clickElement(btn_Ok);
        waitMethods.loadingWait(loder);
    }

    /* Alert the Quantity. Either increase the Quantity or remove some of the technician time**/
    public void verifyEitherincreasetheQuantity() throws InterruptedException {
        String Alert = new String("When using this revenue account 15, the total of all the timesheet entry hours cannot be larger than the Quantity. Either increase the Quantity or remove some of the technician time.");
        Thread.sleep(3000);
        waitMethods.waitForElementToBeRefreshedAndClickable(Ok1);
        WebElementActions.getActions(driver).clickElement(Ok1);
    }

    /*enter UnitCharges TextArea**/
    public void enterUnitChargeTextArea() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(UnitCharge);
        WebElementActions.getActions(driver).inputText(UnitCharge, appProp79.getProperty("UnitCharge"));
        waitMethods.loadingWait(loder);

    }

    /*Edit Quantity **/
    public void editQuantity() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(Quantity);
        WebElementActions.getActions(driver).inputText(Quantity, appProp79.getProperty("Quantity"));
        waitMethods.loadingWait(loder);
    }

    /*verify Sub-Total value ,Taxes value Total value **/
    public void verifySubTotalValue() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(input_subTotalZero);
        Assert.assertTrue(input_subTotalZero.isDisplayed());

        waitMethods.waitForElementToBeRefreshedAndIsVisible(input_TaxesZero);
        Assert.assertTrue(input_TaxesZero.isDisplayed());

        waitMethods.waitForElementToBeRefreshedAndIsVisible(input_Tatalzero);
        Assert.assertTrue(input_Tatalzero.isDisplayed());
    }

    /*click On Reference**/
    public void clickOnReference() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(Referance);
        WebElementActions.getActions(driver).clickElement(Referance);
    }

    /*click On Invoie **/
    public void clickOnInvoice() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(btn_Invoice);
        WebElementActions.getActions(driver).clickElement(btn_Invoice);
    }

    /*verify Receipts to Apply **/
    public void verifyReceiptstoApply() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_ReceiptstoApply);
        Assert.assertTrue(txt_ReceiptstoApply.isDisplayed());

        waitMethods.waitForElementToBeRefreshedAndIsVisible(InvocieTotal);
        Assert.assertTrue(InvocieTotal.isDisplayed());

        waitMethods.waitForElementToBeRefreshedAndIsVisible(InvoiceTotalValue);
        Assert.assertTrue(InvoiceTotalValue.isDisplayed());

    }

    /*verify Tendor**/
    public void verifyTendor() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(Tendor);
        Assert.assertTrue(Tendor.isDisplayed());

        waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_PaymentAmout);
        Assert.assertTrue(txt_PaymentAmout.isDisplayed());

        waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_Description);
        Assert.assertTrue(txt_Description.isDisplayed());

        waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_Referance);
        Assert.assertTrue(txt_Referance.isDisplayed());
    }

    /*Select Tendor Account **/
    public void SelectAccount() throws InterruptedException {
        Select objSelect = new Select(txt_Account1);
        objSelect.selectByVisibleText("ACCOUNT");
        waitMethods.loadingWait(loder);
    }
    /*Select Tendor Account2**/
    public void SelectAccount2 () throws InterruptedException {
        Select objSelect = new Select(txt_Account2);
        objSelect.selectByVisibleText("ACCOUNT");
        waitMethods.loadingWait(loder);
    }
    /*Select Tendor Account3**/
    public void SelectAccount3 () throws InterruptedException {
        Select objSelect = new Select(txt_Account3);
        objSelect.selectByVisibleText("ACCOUNT");
        waitMethods.loadingWait(loder);

    }
    /*click on Invoice **/
    public void clickOnInvoice2 () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(Invoice);
        WebElementActions.getActions(driver).clickElement(Invoice);
        waitMethods.loadingWait(loder);

    }

    /**
     *  verify taxes on PDF
     */
    public void VerifyTaxesonPDF() throws InterruptedException, IOException {

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
            //       System.out.println(pdfFullText);

            if(pdfFullText.contains("INVOICE"))
            {
                System.out.println("Total (CAD) ");

            }

            fis.close();
            waitMethods.loadingWait(loder);

        }
    }
    /*click on Report**/
    public void clickOnReport () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(Reports);
        WebElementActions.getActions(driver).clickElement(Reports);
        waitMethods.loadingWait(loder);
    }
    /*click on Employee**/
    public void clickOnEmployee () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(Employees);
        WebElementActions.getActions(driver).clickElement(Employees);
        waitMethods.loadingWait(loder);
    }
   /*click on Employee TimeSheet Export**/
    public void clickOnEmployeeTimeSheetExport  () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(TimeSheetExport);
        WebElementActions.getActions(driver).clickElement(TimeSheetExport);
        waitMethods.loadingWait(loder);

    }
   /*click On RunReport **/
    public void clickOnRunReport () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(RunReport);
        WebElementActions.getActions(driver).clickElement(RunReport);
        waitMethods.loadingWait(loder);

    }
    /* verify Read Excel **/
    public void readExcel() throws InterruptedException, IOException {

        Thread.sleep(10000);
        File dir = new File(System.getProperty("user.dir") + "\\downloadFiles");
        File[] dirContents = dir.listFiles();
        String fileName = dirContents[0].getName();
        String url = System.getProperty("user.dir") + "\\downloadFiles\\" + fileName;
        File file = new File(url);
        FileInputStream fis = new FileInputStream(file);
        Workbook workbook = new HSSFWorkbook(fis);
        Sheet sheet = workbook.getSheetAt(0);
        //Iterate through rows and columns to read data
        for (Row row : sheet) {
            for (Cell cell : row) {
                System.out.print(cell.toString() + "\t");
            }
            System.out.println();  //move to next row
        }
        fis.close();
        Thread.sleep(10000);
        TestListener.saveScreenshotPNG(driver);

    }
    /*click On HideNon_ROTimes **/
    public void clickOnHideNon_ROTimes () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(HideNon_ROTimes);
        WebElementActions.getActions(driver).clickElement(HideNon_ROTimes);
        waitMethods.loadingWait(loder);

    }
    /*click On UserName **/
    public void clickOnUsername () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(btn_signOut);
        WebElementActions.getActions(driver).clickElement(btn_signOut);

        waitMethods.waitForElementToBeRefreshedAndClickable(inputbox_Username);
        WebElementActions.getActions(driver).clickElement(inputbox_Username);
    }

}


