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

//	WO045208
public class HideShopSuppliesOnWOInvoiceParameterNotWorking extends TestDriverActions {

    @FindBy(xpath = "//a[contains(.,'AMERICANBODY )')]/child::span")
    WebElement corpId;
    @FindBy(xpath = "//label[contains(.,' Select Corporation:')]/parent::td/following-sibling::td/child::input")
    WebElement SelectCorporation;
    @FindBy(xpath = "//a[contains(.,'Select')]")
    WebElement Select;
    @FindBy(xpath = "//label[contains(text(),'Invoiced')]//../input")
    WebElement InvoiceBoolean;
    @FindBy(xpath = "//input[contains(@id,':itSearch::content')]")
    WebElement serachTextArea;

    @FindBy(xpath = "//a[contains(.,'Refresh')]")
    WebElement Refresh;

    @FindBy(xpath = "(//a[contains(.,'WO0')])[1]")
    WebElement referance;
    @FindBy(xpath = "(//span[contains(text(),'Customer Invoice')])[2]")
    WebElement Customerinvoice;
    @FindBy(xpath = "//span[text()='Back to Complete RO']")
    WebElement BackToCompleteRo;
    @FindBy(xpath = "(//a[contains(.,'Global System Parameters')])[1]")
    WebElement GlobalSystemParameters;

    @FindBy(xpath = "(//label[contains(text(),'Search:')]/following::td/child::input)[1]")
    WebElement SearchTextArea;

    @FindBy(xpath = "//span[contains(text(),'905 Truck and Trailer Repair')]")
    WebElement TrailerRepair;

    @FindBy(xpath = "//h1[contains(.,'SHOW_SHOP_SUPPLIES_ON_WO_INVOICE')]")
    WebElement tital_SHOW_SHOP;

    @FindBy(xpath = "//td[contains(.,'Active:')]/child::label")
    WebElement Active;

    @FindBy(xpath = "(//td[contains(.,'Active:')]/child::label/following::td/child::span)[1]")
    WebElement Active_Value;

    @FindBy(xpath = "//label[text()='System Value:']")
    WebElement SystemInput;

    @FindBy(xpath = "(//label[contains(.,'System Value:')]/following::td)[1]")
    WebElement Systemvalue;

    @FindBy(xpath = "(//label[text()='System Value:'])/preceding-sibling::span")
    WebElement RequiredSystemValue;
    @FindBy(xpath = "(//label[text()='System Value:'])[2]")
    WebElement SystemValue;
    @FindBy(xpath = "//label[text()='System Value:']/parent::td/following-sibling::td/child::textarea")
    WebElement SystemValue_Textarea;
    @FindBy(xpath = "(//a[contains(.,'Cancel')])[2]")
    WebElement Cancel;
    @FindBy(xpath = "//a[contains(.,'Save / Exit')]")
    WebElement SaveExit;
    @FindBy(xpath = "//span[text()='Delete Customer Invoice']")
    WebElement DeleteCustomerInvoice;
    @FindBy(xpath = "//a[contains(.,'Sign Out')]")
    WebElement btn_signOut;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement inputbox_Username;
    @FindBy(xpath = "//a[text()='Service']")
    WebElement menu_Service;
    @FindBy(xpath = "//td[text()='Complete RO']")
    WebElement subMenu_CompleteRo;
    @FindBy(xpath = "//a[text()='Perfit']")
    WebElement Perfit;
    @FindBy(xpath = "//td[text()='Security Setup']")
    WebElement SecuritySetUp;
    @FindBy(xpath = "//h1[contains(.,'Working...Please Wait')]")
    List<WebElement> loder;


    public HideShopSuppliesOnWOInvoiceParameterNotWorking(WebDriver driver){
        this.driver = driver ;
        this.waitMethods = new WaitMethods(driver);
    }



    /**
     * go to complete ro screen
     */
    public void gotoCompleteRo() throws FileNotFoundException, InterruptedException {

        waitMethods.waitForElementToBeRefreshedAndClickable(menu_Service);
        WebElementActions.getActions(driver).clickElement(menu_Service);

        waitMethods.waitForElementToBeRefreshedAndClickable(subMenu_CompleteRo);
        WebElementActions.getActions(driver).clickElement(subMenu_CompleteRo);

        TestListener.saveScreenshotPNG(driver);
    }

    /*click On CorPoId**/
    public void clickOnCorPoId() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(corpId);
        WebElementActions.getActions(driver).clickElement(corpId);

        waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }

    /*enterCorporation**/
    public void enterCorporation() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(SelectCorporation);
        WebElementActions.getActions(driver).inputText(SelectCorporation, appProp61.getProperty("1145"));
    }

    /*click on Select Button **/
    public void clickOnSelect() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(Select);
        WebElementActions.getActions(driver).clickElement(Select);

        waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }


    /*click on invoice**/
    public void clickOnInvoice() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(InvoiceBoolean);
        WebElementActions.getActions(driver).clickElement(InvoiceBoolean);

        waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }

    /*enter Ro Invoice Number **/
    public void enterRoInvoiceNumber() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(serachTextArea);
        WebElementActions.getActions(driver).inputText(serachTextArea, appProp61.getProperty("invoiceRO"));

        waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);

    }

    /*click on Refresh Button **/
    public void clickOnRefresh() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(Refresh);
        WebElementActions.getActions(driver).clickElement(Refresh);

        waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }

    /*verify InvoiceRo**/
    public void verifyInvoiceRO() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(referance);
        Assert.assertTrue(referance.isDisplayed());
    }

    /*click On InnvoiceRO **/
    public void clickOnInvoiceRO() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(referance);
        WebElementActions.getActions(driver).clickElement(referance);

        waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }


    /*clilck On customer invoice **/
    public void clickOnCustomerInvoice() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(Customerinvoice);
        WebElementActions.getActions(driver).clickElement(Customerinvoice);
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
            //      System.out.println(pdfFullText);

            if (pdfFullText.contains("Shop Charges:")) {
                System.out.println("All taxes are visible and the being calculated properly.");

            }

            fis.close();
            waitMethods.loadingWait(loder);

        }
    }
    /*click On Back To complete Ro**/
    public void clickOnBackToCompleteRO () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(BackToCompleteRo);
        WebElementActions.getActions(driver).clickElement(BackToCompleteRo);
        waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /*go to Security Setup **/
    public void gotoSecuritySetup () throws FileNotFoundException, InterruptedException {
//        ReusableActions.getActions().clickParentMenu("Perfit");
//        ReusableActions.getActions().clickChildMenu("Security Setup");

        waitMethods.waitForElementToBeRefreshedAndClickable(Perfit);
        WebElementActions.getActions(driver).clickElement(Perfit);

        waitMethods.waitForElementToBeRefreshedAndClickable(SecuritySetUp);
        WebElementActions.getActions(driver).clickElement(SecuritySetUp);


    }
    /*click on Global System Parameter**/
    public void clickOnGlobalSystemParameter () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(GlobalSystemParameters);
        WebElementActions.getActions(driver).clickElement(GlobalSystemParameters);
        waitMethods.loadingWait(loder);
    }
     /*enter the Search SHOW_SHOP_SUPPLIES_ON_WO_INVOICE **/
    public void entertheShowshopSupplies () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(SearchTextArea);
        WebElementActions.getActions(driver).inputText(SearchTextArea, appProp61.getProperty("show"));
        SearchTextArea.sendKeys(Keys.ENTER);
        waitMethods.loadingWait(loder);

    }

    /*verify the tital**/
    public void verifytital () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(tital_SHOW_SHOP);
        Assert.assertTrue(tital_SHOW_SHOP.isDisplayed());

    }
    /*verify Active and system value **/
    public void verifyActive () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(Active);
        Assert.assertTrue(Active.isDisplayed());

        waitMethods.waitForElementToBeRefreshedAndIsVisible(Active_Value);
        Assert.assertTrue(Active_Value.isDisplayed());

        waitMethods.waitForElementToBeRefreshedAndIsVisible(SystemInput);
        Assert.assertTrue(SystemInput.isDisplayed());

        waitMethods.waitForElementToBeRefreshedAndIsVisible(Systemvalue);
        Assert.assertTrue(Systemvalue.isDisplayed());


    }
    /*click On 905Truck and Trailer **/
    public void  clickOn905TruckandTrailerRepair () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(TrailerRepair);
        WebElementActions.getActions(driver).clickElement(TrailerRepair);
    }

    /*verify RequiredSystemValue ,SystemValue**/
    public void RequiredSystemValue () throws InterruptedException {

        waitMethods.waitForElementToBeRefreshedAndIsVisible(RequiredSystemValue);
        Assert.assertTrue(RequiredSystemValue.isDisplayed());

        waitMethods.waitForElementToBeRefreshedAndIsVisible(SystemValue);
        Assert.assertTrue(SystemValue.isDisplayed());


    }
    /*enter the SystemValue **/
    public void enterSystemValue () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(SystemValue_Textarea);
        WebElementActions.getActions(driver).inputText(SystemValue_Textarea, appProp61.getProperty("N"));

    }

   /*click On Save/Exit **/
    public void clickOnSaveExit () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(SaveExit);
        WebElementActions.getActions(driver).clickElement(SaveExit);
        waitMethods.loadingWait(loder);

    }
    /*verify delete customer invoice**/
    public void verifyDeleteCustomerInvoice () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(DeleteCustomerInvoice);
        Assert.assertTrue(DeleteCustomerInvoice.isDisplayed());
    }

    /*click on Singout **/
    public void clickOnsignOut () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(btn_signOut);
        WebElementActions.getActions(driver).clickElement(btn_signOut);
        waitMethods.loadingWait(loder);

    }
    /*click on UserName **/
    public void clickOnUserName () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(inputbox_Username);
        WebElementActions.getActions(driver).clickElement(inputbox_Username);


    }

}




