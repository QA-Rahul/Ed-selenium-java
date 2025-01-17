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

public class CustomerProofPartOrder extends TestDriverActions {


    @FindBy(xpath = "//span[contains(.,'( corproId=')]")
    WebElement CorproId;
    @FindBy(xpath = "//label[contains(.,'Search ')]/parent::td/following-sibling::td/child::input")
    WebElement searchandSelectCarporation;

    @FindBy(xpath = "(//a[contains(.,'Select')])[1]")
    WebElement Select;
    @FindBy(xpath = "//input[contains(@id,':itSearch::content')]")
    WebElement SearchTextArea;

    @FindBy(xpath = "//a[contains(.,'Refresh')]")
    WebElement Refresh;

    @FindBy(xpath = "(//a[contains(text(),'O0')])[1]")
    public WebElement label_ReferenceNumber;

    @FindBy(xpath = "//a[contains(.,'Customer Proof')]")
    WebElement Customerproof;

    @FindBy(xpath = "//a[contains(@id,':0:clPopupWoact')]/child::span")
    WebElement Labour;

    @FindBy(xpath = "//h2[contains(text(),'Body Moldings - Exterior')]")
    WebElement BodyMoldings;

    @FindBy(xpath = "(//a[contains(.,'Re-Sequence')])[2]")
    WebElement Resequence;

    @FindBy(xpath = "//a[contains(.,'Show Parts Details')]/child::span")
    WebElement ShowPartsDetailes;

    @FindBy(xpath = "//th[contains(.,'Part Number')]/child::div[2]/span")
    WebElement partNumber;

    @FindBy(xpath = "//th[contains(.,'Core')]/div/span")
    WebElement core;

    @FindBy(xpath = "//th[contains(.,'Actual Quantity')]/div[2]/span")
    WebElement actualQuantity;

    @FindBy(xpath = "//th[contains(.,'Unit Cost')]/div[2]/span")
    WebElement UnitCost;

    @FindBy(xpath = "(//th[contains(.,'Total Cost')]/div[2]/span)[2]")
    WebElement TotalCost;

    @FindBy(xpath = "//th[contains(.,'Charge Quantity')]/div[2]/span")
    WebElement ChargeQuantity;

    @FindBy(xpath = "//th[contains(.,'Unit Charge')]/div[2]/span")
    WebElement unitcharge;

    @FindBy(xpath = "(//th[contains(.,'Total Charge')]/div[2]/span)[2]")
    WebElement TotalCharge;

    @FindBy(xpath = "//td[contains(@id,':tPartsCItemasCode')]")
    WebElement PartNumber;

    @FindBy(xpath = "(//td[contains(.,'Body Moldings - Exterior')]/div)[2]")
    WebElement BodyMoldingsExterior;


    @FindBy(xpath = "(//img[@title='Change Sequence'])[1]")
    WebElement seq1;

    @FindBy(xpath = "//label[contains(.,'Part #')]")
    WebElement Parthash;

    @FindBy(xpath = "//label[contains(.,'Part #')]/following::td[1]")
    WebElement PartHashValue;

    @FindBy(xpath = "//label[contains(.,'Change Seq# from 1 to')]/preceding-sibling::span")
    WebElement RequiredChangeSeq;

    @FindBy(xpath = "//label[contains(.,'Change Seq# from 1 to')]")
    WebElement ChangeSeq;

    @FindBy(xpath = "//input[contains(@id,':1:it4::content')]")
    WebElement changeSeqTextarea;

    @FindBy(xpath = "(//a[contains(.,'Cancel')])[1]")
    WebElement btn_Cancel;

    @FindBy(xpath = "(//a[contains(.,'OK')]/child::span)[2]")
    WebElement btn_Ok;

    @FindBy(xpath = "(//img[@title='Change Sequence'])[2]")
    WebElement seq2;

    @FindBy(xpath = "(//img[@title='Change Sequence'])[3]")
    WebElement seq3;

    @FindBy(xpath = "(//img[@title='Change Sequence'])[4]")
    WebElement seq4;

    @FindBy(xpath = "(//img[@title='Change Sequence'])[5]")
    WebElement seq5;

    @FindBy(xpath = "(//a[contains(.,'Close')])[3]")
    WebElement btn_close;

    @FindBy(xpath = "//h1[contains(.,'Working...Please Wait')]")
    List<WebElement> loder;

    @FindBy(xpath = "//a[contains(.,'Sign Out')]")
    WebElement btn_signOut;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement inputbox_Username;

    @FindBy(xpath = "//a[text()='Service']")
    WebElement menu_Service;
    @FindBy(xpath = "//td[text()='Complete RO']")
    WebElement subMenu_CompleteRo;


    public CustomerProofPartOrder(WebDriver driver){
        this.driver = driver;
        this.waitMethods = new WaitMethods(driver);
    }

    /*go to CompleteRo**/
        public void gotoCompleteRo() throws FileNotFoundException, InterruptedException {

            waitMethods.waitForElementToBeRefreshedAndClickable(menu_Service);
            WebElementActions.getActions(driver).clickElement(menu_Service);

            waitMethods.waitForElementToBeRefreshedAndClickable(subMenu_CompleteRo);
            WebElementActions.getActions(driver).clickElement(subMenu_CompleteRo);

            TestListener.saveScreenshotPNG(driver);
        }

    /* click PF User in American Body**/
    public void clickPFCorproID () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(CorproId);
        WebElementActions.getActions(driver).clickElement(CorproId);

        waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);

    }
    /* select  PF User in American Body**/
    public void selectPFUser () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(searchandSelectCarporation);
        WebElementActions.getActions(driver).inputText(searchandSelectCarporation, appProp73.getProperty("PFUser"));
        waitMethods.loadingWait(loder);

        waitMethods.waitForElementToBeRefreshedAndIsVisible(Select);
        WebElementActions.getActions(driver).clickElement(Select);

        TestListener.saveScreenshotPNG(driver);
    }

    /*enter Referance Number **/
    public void enterReferanceNumber () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(SearchTextArea);
        WebElementActions.getActions(driver).inputText(SearchTextArea, appProp73.getProperty("Referance"));

        TestListener.saveScreenshotPNG(driver);
    }
    /*click on Refresh **/
    public void clickOnRefresh () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(Refresh);
        WebElementActions.getActions(driver).clickElement(Refresh);

        waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /*click On Referance **/
    public void clickOnReferance () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(label_ReferenceNumber);
        WebElementActions.getActions(driver).clickElement(label_ReferenceNumber);

        TestListener.saveScreenshotPNG(driver);
    }
      /*click On Customer proof**/
    public void clickcustomerProof () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(Customerproof);
        WebElementActions.getActions(driver).clickElement(Customerproof);

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
                System.out.println("ALl Part Number Sequence as per Actual Part and PDF Part ");

            }

            fis.close();
            waitMethods.loadingWait(loder);
            TestListener.saveScreenshotPNG(driver);
        }
    }
    /*verify labour**/
    public void verifyLabour() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(Labour);
        Assert.assertTrue(Labour.isDisplayed());

    }
    /*verify Body Moldings**/
    public void verifyBodyMoldings () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(BodyMoldings);
        Assert.assertTrue(BodyMoldings.isDisplayed());

        waitMethods.waitForElementToBeRefreshedAndIsVisible(Resequence);
        Assert.assertTrue(Resequence.isDisplayed());

    }
    /*click On ShowPartsDetailes**/
    public void verifyShowPartsDetailes () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(ShowPartsDetailes);
        Assert.assertTrue(ShowPartsDetailes.isDisplayed());

        waitMethods.waitForElementToBeRefreshedAndIsVisible(partNumber);
        Assert.assertTrue(partNumber.isDisplayed());

        waitMethods.waitForElementToBeRefreshedAndIsVisible(core);
        Assert.assertTrue(core.isDisplayed());

        waitMethods.waitForElementToBeRefreshedAndIsVisible(actualQuantity);
        Assert.assertTrue(actualQuantity.isDisplayed());

        waitMethods.waitForElementToBeRefreshedAndIsVisible(UnitCost);
        Assert.assertTrue(UnitCost.isDisplayed());

        waitMethods.waitForElementToBeRefreshedAndIsVisible(TotalCost);
        Assert.assertTrue(TotalCost.isDisplayed());

        waitMethods.waitForElementToBeRefreshedAndIsVisible(ChargeQuantity);
        Assert.assertTrue(ChargeQuantity.isDisplayed());

        waitMethods.waitForElementToBeRefreshedAndIsVisible(unitcharge);
        Assert.assertTrue(unitcharge.isDisplayed());

        waitMethods.waitForElementToBeRefreshedAndIsVisible(TotalCharge);
        Assert.assertTrue(TotalCharge.isDisplayed());


    }
     /*verify Part Number **/
    public void verifyPartNumber () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(PartNumber);
        Assert.assertTrue(PartNumber.isDisplayed());

    }
   /*click On Resequence **/
    public void clickOnResquence () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(Resequence);
        WebElementActions.getActions(driver).clickElement(Resequence);

    }
    /*verify Tital **/
   public void verifyBodyMoldingsExterior () throws InterruptedException {
       waitMethods.waitForElementToBeRefreshedAndIsVisible(BodyMoldingsExterior);
       Assert.assertTrue(BodyMoldingsExterior.isDisplayed());

       TestListener.saveScreenshotPNG(driver);
   }
   /*  click On Seq Number **/
   public void clickOnSeqNumber () throws InterruptedException {
       waitMethods.waitForElementToBeRefreshedAndClickable(seq1);
       WebElementActions.getActions(driver).clickElement(seq1);

       TestListener.saveScreenshotPNG(driver);
   }
   /*verify Part and PartHash**/
    public void verifyPart () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(Parthash);
        Assert.assertTrue(Parthash.isDisplayed());

        waitMethods.waitForElementToBeRefreshedAndIsVisible(PartHashValue);
        Assert.assertTrue(PartHashValue.isDisplayed());

        waitMethods.waitForElementToBeRefreshedAndIsVisible(RequiredChangeSeq);
        Assert.assertTrue(RequiredChangeSeq.isDisplayed());

        waitMethods.waitForElementToBeRefreshedAndIsVisible(ChangeSeq);
        Assert.assertTrue(ChangeSeq.isDisplayed());

    }
  /*Enter the Sequence 1st Number **/
    public void  entertheSeqNumber1 () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(changeSeqTextarea);
        WebElementActions.getActions(driver).inputText(changeSeqTextarea, appProp73.getProperty("ChangeSeq1"));

        TestListener.saveScreenshotPNG(driver);
    }
    /*click On OK Button**/
    public void clickOnOK () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(btn_Ok);
        WebElementActions.getActions(driver).clickElement(btn_Ok);

        waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /*click On Sequence 2nd Number **/
    public void  clickOnSeqNumber2 () throws InterruptedException {

        waitMethods.waitForElementToBeRefreshedAndClickable(seq2);
        WebElementActions.getActions(driver).clickElement(seq2);

        TestListener.saveScreenshotPNG(driver);
    }

    /*Enter the Sequence 2nd Number **/
    public void  entertheSeqNumber2 () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(changeSeqTextarea);
        WebElementActions.getActions(driver).inputText(changeSeqTextarea, appProp73.getProperty("ChangeSeq2"));

        TestListener.saveScreenshotPNG(driver);
    }
    /*click on Sequence 3**/
    public void clickOnSequence3 () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(seq3);
        WebElementActions.getActions(driver).clickElement(seq3);

        TestListener.saveScreenshotPNG(driver);
    }
   /*Enter the Sequence 3**/
   public void entertheSequence3 () throws InterruptedException {
       waitMethods.waitForElementToBeRefreshedAndClickable(changeSeqTextarea);
       WebElementActions.getActions(driver).inputText(changeSeqTextarea, appProp73.getProperty("ChangeSeq3"));

       TestListener.saveScreenshotPNG(driver);
   }
   /*click On seq 4**/
   public void clickOnSeq4 () throws InterruptedException {
       waitMethods.waitForElementToBeRefreshedAndClickable(seq4);
       WebElementActions.getActions(driver).clickElement(seq4);

       TestListener.saveScreenshotPNG(driver);
   }
    /*Enter the Sequence 4**/
    public void entertheSequence4 () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(changeSeqTextarea);
        WebElementActions.getActions(driver).inputText(changeSeqTextarea, appProp73.getProperty("ChangeSeq4"));

        TestListener.saveScreenshotPNG(driver);
    }
  /*click On Close**/
    public void clickOnClsoe () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(btn_close);
        WebElementActions.getActions(driver).clickElement(btn_close);

        TestListener.saveScreenshotPNG(driver);
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

        TestListener.saveScreenshotPNG(driver);
    }

}
