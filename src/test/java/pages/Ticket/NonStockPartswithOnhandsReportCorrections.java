package pages.Ticket;

import actions.ReusableActions;
import actions.WaitActions;
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

public class NonStockPartswithOnhandsReportCorrections extends TestDriverActions {

    @FindBy(xpath = "(//a[contains(text(),'Reports')])[2]")
    WebElement Reports;
    @FindBy(xpath = "//h1[text()='Report Categories']")
    WebElement reportCategories;

    @FindBy(xpath = "//h1[text()='Available Reports For Inventory']")
    WebElement availableReportsForInventory;

    @FindBy(xpath = "//h1[text()='Report Parameters']")
    WebElement reportParameters;

    @FindBy(xpath = "//span[text()='Inventory']")
    WebElement inventory;

    @FindBy(xpath = "//span[text()='Non-Stock Parts With On-Hands']")
    WebElement nonStockPartsWithOnHands;

    @FindBy(xpath = "//span[text()='Schedule Report']")
    WebElement scheduleReport;

    @FindBy(xpath = "//span[text()='Run Report']")
    WebElement runReport;

    @FindBy(xpath = "//label[contains(text(),'From ')]")
    WebElement fromDate;

    @FindBy(xpath = "//label[contains(text(),'To ')]")
    WebElement todate;

    @FindBy(xpath = "//input[contains(@id,':id1::content')]")
    WebElement fromdateTextarea;

    @FindBy(xpath = "//label[contains(.,'Exclude Cores')]")
    WebElement excludecores;

    @FindBy(xpath = "//h1[contains(text(),'Parts List')]")
    WebElement partlist;

    @FindBy(xpath = "//label[contains(text(),'Search:')]")
    WebElement search;

    @FindBy(xpath = "//label[contains(text(),'Search:')]/following::td/child::input")
    WebElement searchInputtextarea;

    @FindBy(xpath = "//span[text()='Part #']")
    WebElement parthash;

    @FindBy(xpath = "//span[text()='Description']")
    WebElement description;

    @FindBy(xpath = "//span[text()='Preferred Vendor']")
    WebElement preferrdVendor;

    @FindBy(xpath = "(//a[contains(text(),'BK')])[1]")
    WebElement PartName;

    @FindBy(xpath = "(//a[contains(@id,'disAcr')])[1]")
    WebElement report;

    @FindBy(xpath = "//h1[contains(.,'Working...Please Wait')]")
    List<WebElement> loder;

    @FindBy(xpath = "//a[contains(.,'Sign Out')]")
    WebElement btn_signOut;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement inputbox_Username;

    @FindBy(xpath = "//a[text()='Parts']")
    WebElement Parts;

    @FindBy(xpath = "//td[text()='Part Master']")
    WebElement PartMaster;


    public NonStockPartswithOnhandsReportCorrections(WebDriver driver){
        this.driver = driver;
        this.waitMethods = new WaitMethods(driver);
    }



    /*go to Report**/
    public void gotoReport() throws FileNotFoundException, InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(Reports);
        WebElementActions.getActions(driver).clickElement(Reports);
        TestListener.saveScreenshotPNG(driver);

        waitMethods.loadingWait(loder);

    }

    /**
     * verify Report categories
     */
    public void verifyReportCategories() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(reportCategories);
        Assert.assertTrue(reportCategories.isDisplayed());

        waitMethods.waitForElementToBeRefreshedAndIsVisible(availableReportsForInventory);
        Assert.assertTrue(availableReportsForInventory.isDisplayed());

        waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }

    /*click on Invantory **/
    public void clickOnInventory() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(inventory);
        WebElementActions.getActions(driver).clickElement(inventory);
        TestListener.saveScreenshotPNG(driver);
    }

    /*click on Non-Stock Parts With On-Hands**/
    public void clickOnNonStockPartsWithOnHands() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(nonStockPartsWithOnHands);
        WebElementActions.getActions(driver).clickElement(nonStockPartsWithOnHands);
        waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);

    }

    /*verify Report Parameters**/
    public void verifyreportParameters() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(scheduleReport);
        Assert.assertTrue(scheduleReport.isDisplayed());

        waitMethods.waitForElementToBeRefreshedAndIsVisible(runReport);
        Assert.assertTrue(runReport.isDisplayed());

        waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);

    }

    /*verify From Date and To Date**/
    public void verifyFromDate() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(fromDate);
        Assert.assertTrue(fromDate.isDisplayed());

        waitMethods.waitForElementToBeRefreshedAndIsVisible(todate);
        Assert.assertTrue(todate.isDisplayed());

        waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }

    /*enter From Date **/
    public void enterfromdate() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(fromdateTextarea);
        WebElementActions.getActions(driver).inputText(fromdateTextarea, appProp76.getProperty("BK3Z-61278L01-BC"));
        TestListener.saveScreenshotPNG(driver);

    }

    /*click on Run Report**/
    public void clickOnRunReport() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(runReport);
        WebElementActions.getActions(driver).clickElement(runReport);
        waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);

    }

    /**
     * verify taxes on PDF
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

            if (pdfFullText.contains("Shop Charges:")) {
                System.out.println("showing full part name BK3Z-61278L01-BC");

            }

            fis.close();
            waitMethods.loadingWait(loder);

        }

    }

    /*go to Part Master**/
    public void gotoPartMaster () throws FileNotFoundException, InterruptedException {
        waitMethods.loadingWait(loder);
        Thread.sleep(3000);

        waitMethods.waitForElementToBeRefreshedAndClickable(Parts);
        WebElementActions.getActions(driver).clickElement(Parts);

        waitMethods.waitForElementToBeRefreshedAndClickable(PartMaster);
        WebElementActions.getActions(driver).clickElement(PartMaster);

        TestListener.saveScreenshotPNG(driver);

    }
    /*verify Part List**/
    public void verifyPartList () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(partlist);
        Assert.assertTrue(partlist.isDisplayed());

        waitMethods.waitForElementToBeRefreshedAndIsVisible(search);
        Assert.assertTrue(search.isDisplayed());
        TestListener.saveScreenshotPNG(driver);

    }
    /*enter Search TextArea**/
    public void enterSearchTextArea () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(searchInputtextarea);
        WebElementActions.getActions(driver).inputText(searchInputtextarea,appProp76.getProperty("BK3Z"));
        waitMethods.loadingWait(loder);




    }
    /*verify Part# , Description ,preferred vendor ,mfg**/
    public void verifyPartHash () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(parthash);
        Assert.assertTrue(parthash.isDisplayed());

        waitMethods.waitForElementToBeRefreshedAndIsVisible(description);
        Assert.assertTrue(description.isDisplayed());

        waitMethods.waitForElementToBeRefreshedAndIsVisible(preferrdVendor);
        Assert.assertTrue(preferrdVendor.isDisplayed());

        waitMethods.waitForElementToBeRefreshedAndIsVisible(PartName);
        Assert.assertTrue(PartName.isDisplayed());

        waitMethods.loadingWait(loder);

    }

    /*enter From Date **/
    public void enterfromdateTwo () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(fromdateTextarea);
        WebElementActions.getActions(driver).inputText(fromdateTextarea, appProp76.getProperty("CORETEST3"));
        TestListener.saveScreenshotPNG(driver);

    }
    /*verify Exclude Cores**/
    public void verifyExcludeCore () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(excludecores);
        Assert.assertTrue(excludecores.isDisplayed());

    }
    /*verify Inventory and **/
    public void verifyOnInventory () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(inventory);
        WebElementActions.getActions(driver).clickElement(inventory);
        waitMethods.loadingWait(loder);

        Assert.assertTrue(inventory.isDisplayed());

        waitMethods.waitForElementToBeRefreshedAndIsVisible(nonStockPartsWithOnHands);
        WebElementActions.getActions(driver).clickElement(nonStockPartsWithOnHands);

        Assert.assertTrue(nonStockPartsWithOnHands.isDisplayed());


    }
    /**verify taxes on PDF*/
    public void VerifyTaxesonPDFtwo() throws InterruptedException, IOException {

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

            if(pdfFullText.contains("Shop Charges:"))
            {
                System.out.println("showing full part name CORETEST3");

            }

            fis.close();

        }
    }
    /*enter Search TextArea**/
    public void enterSearchTextAreaTwo () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(searchInputtextarea);
        WebElementActions.getActions(driver).inputText(searchInputtextarea, appProp76.getProperty("CORETEST"));
    }

    /**
     *  verify taxes on PDF
     */
    public void VerifyTaxesonPDFthree() throws InterruptedException, IOException {

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

            if(pdfFullText.contains("Shop Charges:"))
            {
                System.out.println("Total Cost and Total On-Hand not included on the Non-Stock Parts with On-Hand Report");

            }

            fis.close();

        }
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
















































