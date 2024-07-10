package pages.Ticket;

import actions.ReusableActions;
import actions.WaitActions;
//import actions.WebElementActions;
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
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public class BalanceSheetAndIncomeStatementNotPopulatingData extends TestDriverActions {

    @FindBy(xpath="//span[text()='Financial']")
    WebElement reportCategories_Financial;
    @FindBy(xpath = "//span[text()='Balance Sheet']")
    WebElement BalanceSheet;
    @FindBy(xpath = "//span[text()='Income Statement']")
    WebElement IncomeStatement;
    @FindBy(xpath = "//label[text()='Report Type:']/following::select[1]")
    WebElement select_ReportType;
    @FindBy(xpath = "(//label[text()='Report Specification:']/following::select)[1]")
    WebElement select_ReportSpecification;
    @FindBy(xpath = "(//label[text()='Accounting Year:']/following::select)[1]")
    WebElement select_AccountingYear;
    @FindBy(xpath = "//span[text()='Run Report']")
    WebElement btn_runReport;
    @FindBy(xpath = "(//label[text()='Accounting Period:']/following::select)[1]")
    WebElement select_AccountingPeriod;
    @FindBy(xpath = "//span[text()='Sign Out']")
    WebElement btn_signOut;
    @FindBy(xpath = "//input[@name='username']")
    public WebElement inputbox_Username;
    @FindBy(xpath = "(//a[contains(@id,'sdi6::disAcrBlw')])[1]")
    WebElement btn_reportHistory;
    @FindBy(xpath = "//a[contains(@id,'gl1')]")
    WebElement btn_view;

    @FindBy(xpath = "//div[@class='toast-item-text']")
    List<WebElement> queue;


    @FindBy(xpath = "//h1[text()='Working...Please Wait']")
    List<WebElement> loder;

    public BalanceSheetAndIncomeStatementNotPopulatingData(WebDriver driver){
        this.driver = driver;
        this.waitMethods = new WaitMethods(driver);
    }

    public void gotoReports() throws FileNotFoundException, InterruptedException {
        ReusableActions.getActions(driver).clickParentMenu("Reports");
    }
    /**
     * click on Finanace
     */
      public void clickOnFinance() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(reportCategories_Financial);
        WebElementActions.getActions(driver).clickElement(reportCategories_Financial);

          waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * click on Base sheet
     */
      public void clickOnBalanceSheet() throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndClickable(BalanceSheet);
        WebElementActions.getActions(driver).clickElement(BalanceSheet);

          waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * Select Balance Sheet from Report type
     */
      public void selectBalanceSheet() throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndClickable(select_ReportType);
        WebElementActions.getActions(driver).elementSelectByVisibilityText(select_ReportType,"Balance Sheet");

          waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * Select Balance Sheet from Report specification
     */
      public void selectReportSpecification() throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndClickable(select_ReportSpecification);
        WebElementActions.getActions(driver).elementSelectByVisibilityText(select_ReportSpecification,"Balance Sheet");

          waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * select accounting year
     */
      public void selectAccountingYear() throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndClickable(select_AccountingYear);
        WebElementActions.getActions(driver).elementSelectByVisibilityText(select_AccountingYear,"2022");

          waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * select accounting period
     */
      public void selectAccountiongPeriod() throws InterruptedException, FileNotFoundException {
          waitMethods.waitForElementToBeRefreshedAndClickable(select_AccountingPeriod);
        WebElementActions.getActions(driver).elementSelectByVisibilityText(select_AccountingPeriod,"10");

//        Thread.sleep(5000);
//        ReusableActions.getActions().deleteDownloadedFile();

          waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * click on Run Report
     */
      public void clickOnRunReport() throws InterruptedException, FileNotFoundException {
          waitMethods.waitForElementToBeRefreshedAndClickable(btn_runReport);
        WebElementActions.getActions(driver).clickElement(btn_runReport);

          waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * click on Income Statement
     */
      public void clickOnIncomeStatement() throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndClickable(IncomeStatement);
        WebElementActions.getActions(driver).clickElement(IncomeStatement);

          waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * Select Income statement from Report Type
     */
      public void selectIncomeStatement() throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndClickable(select_ReportType);
        WebElementActions.getActions(driver).elementSelectByVisibilityText(select_ReportType,"Income Statement");

          waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * Select Income statement from Report Specification
     */
      public void selectIncome_ReportSpecification() throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndClickable(select_ReportSpecification);
        WebElementActions.getActions(driver).elementSelectByVisibilityText(select_ReportSpecification,"Income Statement");

          waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * click on Report history
     */
      public void clickOnReportHistory() throws InterruptedException, FileNotFoundException {
        int count = 0;
        while (count < 20) {
            //           System.out.println("Size of queue is :"+queue.size());
            Thread.sleep(1000);
            count++;
            if (queue.size() > 0) {

                waitMethods.waitForElementToBeRefreshedAndClickable(btn_reportHistory);
                WebElementActions.getActions(driver).clickElement(btn_reportHistory);
            }
            Thread.sleep(2000);
            waitMethods.waitForElementToBeRefreshedAndClickable(btn_view);
            WebElementActions.getActions(driver).clickElement(btn_view);
        }
          waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * click on view
     */
    public void clickOnView() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(btn_view);
        WebElementActions.getActions(driver).clickElement(btn_view);



        waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
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
    /**
     * Click on sign out
     */
      public void clickOnSignOut() throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndClickable(btn_signOut);
          WebElementActions.getActions(driver).clickElement(btn_signOut);

    }
    /**
     * verify username
     */
       public void verifyUsername() throws InterruptedException {
           waitMethods.waitForElementToBeRefreshedAndIsVisible(inputbox_Username);
         Assert.assertTrue(inputbox_Username.isDisplayed());

         TestListener.saveScreenshotPNG(driver);
     }
    }
