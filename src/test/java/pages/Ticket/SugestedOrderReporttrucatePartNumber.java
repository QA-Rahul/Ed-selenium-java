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
import org.testng.Assert;
import tests.TestDriverActions;
import utils.TestListener;
import utils.WaitMethods;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public class SugestedOrderReporttrucatePartNumber extends TestDriverActions {
    @FindBy(xpath = "(//a[contains(.,'Suggested Orders')])[1]")
    WebElement suggestedOrders;

    @FindBy(xpath = "//h1[text()='Restocks']")
    WebElement restocks;

    @FindBy(xpath = "//span[text()='Generate Orders']")
    WebElement GenerateOrders;

    @FindBy(xpath = "(//label[text()='Vendor:']/parent::td/following::td/child::input)[2]")
    WebElement vendorTextArea;

    @FindBy(xpath = "(//a[contains(.,'Generate')])[3]")
    WebElement Generate;
    @FindBy(xpath = "(//span[text()='Vendor'])[1]")
    WebElement vendor;

    @FindBy(xpath = "(//span[contains(@class,'data-container')])[1]")
    WebElement vendorName;

    @FindBy(xpath = "//span[text()='Part #']")
    WebElement PartHash;

    @FindBy(xpath = "//span[text()='Vendor Part #']")
    WebElement vendorPartHash;

    @FindBy(xpath = "//span[text()='Description']")
    WebElement Description;

    @FindBy(xpath = "//span[text()='Suggested Quantity']")
    WebElement SuggestedQuantity;

    @FindBy(xpath = "//span[text()='Quantity to Order']")
    WebElement QuantitytoOrder;

    @FindBy(xpath = "//span[text()='UOM']")
    WebElement UOM;

    @FindBy(xpath = "//span[text()='Stock UOM']")
    WebElement StockUOM;

    @FindBy(xpath = "//span[text()='Conv']")
    WebElement Conv;

   @FindBy(xpath = "//span[text()='Unit Cost']")
    WebElement UnitCost;

   @FindBy(xpath = "(//a[@title='Expand']/parent::td/following-sibling::td/child::span)[1]")
   WebElement PartName;

   @FindBy(xpath = "//h1[text()='Parts List']")
   WebElement PartList;

    @FindBy(xpath = "//label[text()='Search:']/parent::td/following-sibling::td/child::input")
    WebElement SearchTextArea;

    @FindBy(xpath = "//span[text()='Refresh']")
    WebElement btn_refresh;

    @FindBy(xpath = "//span[text()='Active']/following::td[1]/span/a")
    WebElement hyperlink_partNumber;
    @FindBy(xpath = "//span[text()='Part #']//parent::div/parent::th/parent::tr/th[11]/following::div/table/tbody/tr/td[2]/child::span")
     WebElement PartValue;
     @FindBy(xpath = "//span[text()='Submit / Print PO']")
    WebElement SubmitPrintPO;
     @FindBy(xpath = "//span[text()='Edit PO']")
    WebElement EditPO;

     @FindBy(xpath = "//span[text()='Save / Exit']")
    WebElement SaveExit;

     @FindBy(xpath = "(//span[text()='Print List'])[3]")
      WebElement PrintList;

     @FindBy(xpath = "(//span[text()='Cancel'])[1]")
     WebElement Cancel;

    @FindBy(xpath = "//a[text()='Sign Out']")
    WebElement btn_signOut;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement inputbox_Username;
    @FindBy(xpath = "//a[text()='Parts']")
    WebElement Parts;
    @FindBy(xpath = "//td[text()='Part Master']")
    WebElement PartMaster;
    @FindBy(xpath = "//td[text()='Order Parts']")
    WebElement OrderParts;
    @FindBy(xpath = "//h1[contains(.,'Working...Please Wait')]")
    List<WebElement> loder;


    public SugestedOrderReporttrucatePartNumber(WebDriver driver){
        this.driver = driver;
        this.waitMethods = new WaitMethods(driver);
    }


    /**goto order parts Screen*/
    public void gotoOrderPartsScreen() throws FileNotFoundException, InterruptedException {

        waitMethods.waitForElementToBeRefreshedAndClickable(Parts);
        WebElementActions.getActions(driver).clickElement(Parts);

        waitMethods.waitForElementToBeRefreshedAndClickable(OrderParts);
        WebElementActions.getActions(driver).clickElement(OrderParts);

        TestListener.saveScreenshotPNG(driver);

    }
    /**click on Suggested Orders*/
    public void clickOnSuggestedOrders () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(suggestedOrders);
        WebElementActions.getActions(driver).clickElement(suggestedOrders);
        waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);

    }
    /*verify Restocks and verify Vendor**/
    public void verifyRestocks () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(restocks);
        Assert.assertTrue(restocks.isDisplayed());
        waitMethods.loadingWait(loder);

    }
    /*click on Genrate Orders**/
    public void clickOnGenrateOrder () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(GenerateOrders);
        WebElementActions.getActions(driver).clickElement(GenerateOrders);
        waitMethods.loadingWait(loder);

    }
    /*enter on vendorTextArea **/
    public void enterVendorTextArea () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(vendorTextArea);
        WebElementActions.getActions(driver).inputText(vendorTextArea,appProp78.getProperty("acme"));
        vendorTextArea.sendKeys(Keys.ENTER);
        waitMethods.loadingWait(loder);
    }
    /* click on Generate Button **/
    public void clickOnGenerate () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(Generate);
        WebElementActions.getActions(driver).clickElement(Generate);
        waitMethods.loadingWait(loder);
    }
    /*click on vendor Name **/
    public void clickonVendorName () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(vendorName);
        WebElementActions.getActions(driver).clickElement(vendorName);
        waitMethods.loadingWait(loder);
    }
    /*verify Part #, vendor Part# **/
   public void veifypartHash () throws InterruptedException {
       waitMethods.waitForElementToBeRefreshedAndIsVisible(PartHash);
       Assert.assertTrue(PartHash.isDisplayed());

       waitMethods.waitForElementToBeRefreshedAndIsVisible(vendorPartHash);
       Assert.assertTrue(vendorPartHash.isDisplayed());

   }
   /*verify Description ,Suggested Quantity **/
    public void verifyDescription () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(Description);
        Assert.assertTrue(Description.isDisplayed());

        waitMethods.waitForElementToBeRefreshedAndIsVisible(SuggestedQuantity);
        Assert.assertTrue(SuggestedQuantity.isDisplayed());

    }
    /*verify Quantity to order and UOM  **/
    public void verifyUOM () throws InterruptedException {

        waitMethods.waitForElementToBeRefreshedAndIsVisible(UOM);
        Assert.assertTrue(UOM.isDisplayed());
        waitMethods.loadingWait(loder);
    }
  /*verify Stock UOM and Conv and UnitCost**/
    public void verifyStockUOM () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(StockUOM);
        Assert.assertTrue(StockUOM.isDisplayed());

        waitMethods.waitForElementToBeRefreshedAndIsVisible(Conv);
        Assert.assertTrue(Conv.isDisplayed());
    }
      /*verify UnitCost **/
     public void verifyUnitCost () throws InterruptedException {
         waitMethods.waitForElementToBeRefreshedAndIsVisible(UnitCost);
        Assert.assertTrue(UnitCost.isDisplayed());

         waitMethods.waitForElementToBeRefreshedAndIsVisible(PartName);
        Assert.assertTrue(PartName.isDisplayed());

        System.out.println(PartName.getText());
         waitMethods.loadingWait(loder);


    }
      /*verify submit po and Edit PO **/
    public void verifysubmitPO () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(SubmitPrintPO);
        Assert.assertTrue(SubmitPrintPO.isDisplayed());

        waitMethods.waitForElementToBeRefreshedAndIsVisible(EditPO);
        Assert.assertTrue(EditPO.isDisplayed());


    }
        /*verify SAVE Exit and Print List**/
        public void verifySaveExit () throws InterruptedException {

            waitMethods.waitForElementToBeRefreshedAndIsVisible(SaveExit);
        Assert.assertTrue(SaveExit.isDisplayed());

            waitMethods.waitForElementToBeRefreshedAndIsVisible(PrintList);
        Assert.assertTrue(PrintList.isDisplayed());

            waitMethods.waitForElementToBeRefreshedAndIsVisible(Cancel);
        Assert.assertTrue(Cancel.isDisplayed());

    }
   /*click on Print List**/
    public void clickOnPrintList () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(PrintList);
        WebElementActions.getActions(driver).clickElement(PrintList);
        Thread.sleep(7000);
       String OriginalWindow =driver.getWindowHandle();
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

            if(pdfFullText.contains("6304F2AS1AU0"))
            {
                System.out.println("Random part generated 12 characters");

            }
            fis.close();
        }
    }
    /**click on Cancel button */
    public void clickOnCancel () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(Cancel);
        WebElementActions.getActions(driver).clickElement(Cancel);
        waitMethods.loadingWait(loder);


    }
     /*go to Part Master **/
    public void gotoPartMaster () throws FileNotFoundException, InterruptedException {
        waitMethods.loadingWait(loder);
        Thread.sleep(3000);

        waitMethods.waitForElementToBeRefreshedAndClickable(Parts);
        WebElementActions.getActions(driver).clickElement(Parts);

        waitMethods.waitForElementToBeRefreshedAndClickable(PartMaster);
        WebElementActions.getActions(driver).clickElement(PartMaster);

        TestListener.saveScreenshotPNG(driver);


    }
    /*verify PartList **/
    public void  verifyPartLsit () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(PartList);
        Assert.assertTrue(PartList.isDisplayed());

    }
    /**enter part Number*/
    public void enterPartNumber () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(SearchTextArea);
        WebElementActions.getActions(driver).inputText(SearchTextArea,appProp78.getProperty("partname"));

    }
   /*click on Refresh**/
    public void clickOnRefresh () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(btn_refresh);
        WebElementActions.getActions(driver).clickElement(btn_refresh);
    }
    /* verify PartName**/
    public void verifyPartName () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(hyperlink_partNumber);
        Assert.assertTrue(hyperlink_partNumber.isDisplayed());

    }
    /*click on signout **/
   public void clickOnSignOut () throws InterruptedException {
       waitMethods.waitForElementToBeRefreshedAndClickable(btn_signOut);
       WebElementActions.getActions(driver).clickElement(btn_signOut);
   }
   /*click on UserName **/
    public void clickOnUserName () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(inputbox_Username);
        WebElementActions.getActions(driver).clickElement(inputbox_Username);
    }
}
