package pages.Ticket;

import actions.ReusableActions;
import actions.WebElementActions;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import tests.TestDriverActions;
import utils.TestListener;
import utils.WaitMethods;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class SalesTaxLiabilityCashBasisCalculationIssueBROTHERTON extends TestDriverActions {

    @FindBy(xpath="//a[text()='Reports']")
    WebElement reports_menu;
    @FindBy(xpath="//span[text()='Reports']")
    WebElement title_Reports;
    @FindBy(xpath="//h1[text()='Report Categories']")
    WebElement title_ReportCategories;
    @FindBy(xpath="//h1[text()='Available Reports For AP']")
    WebElement title_AvailableReportsForAP;
    @FindBy(xpath="//h1[text()='Report Parameters']")
    WebElement tirle_ReportParameters;
    @FindBy(xpath="//span[text()='AR']")
    WebElement category_AR;
    @FindBy(xpath = "//span[text()='Sales Tax Liability Cash Basis']")
    WebElement txt_SalesTaxLiabilityCashBasis;
    @FindBy(xpath = "//label[text()='From Date:']")
    WebElement label_FromDate;
    @FindBy(xpath = "//label[text()='From Date:']/following::input[1]")
    WebElement txtbox_FromDate;
    @FindBy(xpath = "//label[text()='To Date:']")
    WebElement txt_ToDate;
    @FindBy(xpath = "//label[text()='To Date:']/following::input[1]")
    WebElement txtbox_ToDate;
    @FindBy(xpath = "//div[contains(@id,'pte1:ctb2')]/descendant::span")
    WebElement btn_RunReport;




     public SalesTaxLiabilityCashBasisCalculationIssueBROTHERTON(WebDriver driver){
         this.driver = driver;
         this.waitMethods = new WaitMethods(driver);
     }

     /*
          go to Report screen
      */
     public void gotoReportScreen() throws InterruptedException {
         waitMethods.waitForElementToBeRefreshedAndClickable(reports_menu);
         WebElementActions.getActions(driver).clickElement(reports_menu);
         TestListener.saveScreenshotPNG(driver);
     }
    /*
       verify title Reports
   */
    public void verifyTitleReports() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(title_Reports);
        Assert.assertTrue(title_Reports.isDisplayed());
    }
    /*
         verify Report Categories
     */
    public void verifyReportCategories() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(title_ReportCategories);
        Assert.assertTrue(title_ReportCategories.isDisplayed());
    }
    /*
         verify Available Reports For AP
     */
    public void verifyAvailableReportsForAP() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(title_AvailableReportsForAP);
        Assert.assertTrue(title_AvailableReportsForAP.isDisplayed());
    }
    /*
         verify Report Parameters
     */
    public void verifyReportParameters() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(tirle_ReportParameters);
        Assert.assertTrue(tirle_ReportParameters.isDisplayed());
    }
    /*
         verify category AR
     */
    public void verifycategory_AR() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(category_AR);
        Assert.assertTrue(category_AR.isDisplayed());
    }
    /*
         click on category AR
     */
    public void clickOnAR() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(category_AR);
        WebElementActions.getActions(driver).clickElement(category_AR);
    }
    /*
         click on available reports of AR
     */
    public void clickOnSalesTaxLiabilityAccrualBasis() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(txt_SalesTaxLiabilityCashBasis);
        WebElementActions.getActions(driver).clickElement(txt_SalesTaxLiabilityCashBasis);
    }
    /*
        verify FromDate and ToDate
     */
    public void verifyFromdateToDate() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(label_FromDate);
        Assert.assertTrue(label_FromDate.isDisplayed());
        Assert.assertTrue(txtbox_FromDate.isDisplayed());
        Assert.assertTrue(txt_ToDate.isDisplayed());
        Assert.assertTrue(txtbox_ToDate.isDisplayed());
        Assert.assertTrue(btn_RunReport.isDisplayed());

    }
    /*
        enter From Date
     */
    public void enterFromDate() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(txtbox_FromDate);
        WebElementActions.getActions(driver).inputText(txtbox_FromDate,appProp69.getProperty("fromDate"));
    }
    /*
       enter To Date
    */
    public void enterToDate() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(txtbox_ToDate);
        WebElementActions.getActions(driver).inputText(txtbox_ToDate,appProp69.getProperty("toDate"));
    }

    /*
       click on Run Report
    */
    public void clickOnRunReport() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(btn_RunReport);
        WebElementActions.getActions(driver).clickElement(btn_RunReport);
    }
    /**
     * Verify PDF data
     */
    public void verifyPDF() throws InterruptedException, IOException {
//        Thread.sleep(5000);
//        ReusableActions.deleteDownloadedFile();

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
            if(pdfFullText.contains("Accounting Year:2022")){
                System.out.println("No data populate in year 2022");
            }
            fis.close();
        }
        Thread.sleep(10000);
        ReusableActions.deleteDownloadedFile();
    }
    /*
       enter From Date
    */
 /*   public void a(){

    }

    /*
       enter From Date
    */
/*    public void a(){

    }

         */







}
