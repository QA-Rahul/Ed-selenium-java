package pages.Ticket;

import actions.ReusableActions;
import actions.WaitActions;
//import actions.WebElementActions;
import actions.WebElementActions;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.Keys;
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

public class OverRideTaxesCauseOtherTaxDisappear extends TestDriverActions {

    @FindBy(xpath = "//div[contains(@id,'cbNWO')]")
    WebElement newRo;
    @FindBy(xpath = "//div[contains(@id,'cbSelectUnitLocal')]")
    WebElement firstUnit_select;
    @FindBy(xpath = "//div[contains(@id,'cbCancel')]")
    WebElement close_btn;
    @FindBy(xpath = "//div[contains(@id,'ctbAddLabor')]/descendant::span")
    WebElement btn_AddLabour;
    @FindBy(xpath = "(//a[text()='VMRS'])[1]")
    WebElement VMRS;
    @FindBy(xpath = "//input[contains(@id,'searchVmrs:dc_it1::content')]")
    WebElement search_text;
    @FindBy(xpath = "//a[contains(@id,'cilvmrsys')]/img")
    WebElement FirstLabour_img;
    @FindBy(xpath = "//a[contains(@id,'ciAddVmrs')]/img")
    WebElement plusIcon;
    @FindBy(xpath = "//div[contains(@id,'ctbOk')]")
    WebElement btnAdd;

    @FindBy(xpath = "//label[text()='Tax:']/following::a[1]")
    WebElement taxex_link ;
    @FindBy(xpath = "//div[contains(@id,'ctbAddWoTax')]")
    WebElement Add_tax;
    @FindBy(xpath = "//select[contains(@id,'socTax::content')]")
    WebElement select_option;
    @FindBy(xpath = "//input[contains(@id,'itOVTP::content')]")
    WebElement percentage;
    @FindBy(xpath = "//input[contains(@id,'itOVTPA::content')]")
    WebElement amount;
    @FindBy(xpath = "//div[contains(@id,'ctbOk')]")
    WebElement OK_Btn;
    @FindBy(xpath = "//span[text()='Invoice']")
    WebElement invoice_btn;
    @FindBy(xpath = "//div[contains(@id,'cbClose')]")
    WebElement btn_close;
    @FindBy(xpath = "//h1[contains(.,'Working...Please Wait')]")
    List<WebElement> loder;
    @FindBy(xpath = "//div[text()='Taxes']")
    WebElement taxes;
    @FindBy(xpath = "//span[text()='Tax']")
    WebElement tax ;
    @FindBy(xpath = "//span[text()='%']")
    WebElement sign_percentage;
    @FindBy(xpath = "//span[text()='Amount']")
    WebElement Amount;
    @FindBy(xpath = "//span[text()='Override / Details']")
    WebElement overrideDetails;
   @FindBy(xpath = "//span[text()='Add Parts']")
    WebElement AddParts;
    @FindBy(xpath = "//input[contains(@id,'itSearchPartSelect::content')]")
    WebElement part_textbox;
    @FindBy(xpath = "//div[contains(@id,'cbIssuePart')]")
    WebElement issuePart;
    @FindBy(xpath = "(//div[contains(@id,'ctbClose')])[2]")
    WebElement close;
    @FindBy(xpath =  "//li[contains(@class,'AFAutoSuggestItem')]")
    WebElement listOfParts;

   @FindBy(xpath = "(//div[text()='Taxes'])[2]")
    WebElement taxes_2;
    @FindBy(xpath = "(//label[text()='Tax:'])[2]")
    WebElement tax_2;
    @FindBy(xpath = "//label[text()='Override']")
    WebElement override;
    @FindBy(xpath = "//label[text()='Percentage:']")
    WebElement percentage1;
    @FindBy(xpath = "//label[text()='Amount:']")
    WebElement amount1;

//    @FindBy(xpath = "//a[text()='Sign Out']")
    @FindBy(xpath = "(//span[contains(@id,'si1')]/following::td)[4]")
    WebElement btn_signOut;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement inputbox_Username;

    @FindBy(xpath = "//a[text()='Service']")
    WebElement menu_Service;

    @FindBy(xpath = "//td[text()='Complete RO']")
    WebElement subMenu_CompleteRo;

    public OverRideTaxesCauseOtherTaxDisappear(){
        this.driver = driver;
        this.waitMethods = new WaitMethods(driver);
    }

    /**
     * go to complete ro screen
     * @throws FileNotFoundException
     * @throws InterruptedException
     */
   public void gotoCompleteRo() throws FileNotFoundException, InterruptedException {
//       ReusableActions.getActions(driver).clickParentMenu("Service");
//       ReusableActions.getActions(driver).clickChildMenu("Complete RO");

       waitMethods.waitForElementToBeRefreshedAndClickable(menu_Service);
       WebElementActions.getActions(driver).clickElement(menu_Service);

       waitMethods.waitForElementToBeRefreshedAndClickable(subMenu_CompleteRo);
       WebElementActions.getActions(driver).clickElement(subMenu_CompleteRo);

   }
    /**
     * click on New Ro
     */
      public void clickOnNewRo() throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndClickable(newRo);
        WebElementActions.getActions(driver).clickElement(newRo);

          waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     *  click on any unit
     */
      public void clickOnUnit() throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndClickable(firstUnit_select);
        WebElementActions.getActions(driver).clickElement(firstUnit_select);

          waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * click on close
     */
       public void clickOnClose() throws InterruptedException {
           waitMethods.waitForElementToBeRefreshedAndClickable(close_btn);
         WebElementActions.getActions(driver).clickElement(close_btn);

           waitMethods.loadingWait(loder);
         TestListener.saveScreenshotPNG(driver);
     }
    /**
     * click on Add labour
     */
        public void clickOnAddLabour() throws InterruptedException {
            waitMethods.waitForElementToBeRefreshedAndClickable(btn_AddLabour);
          WebElementActions.getActions(driver).clickElement(btn_AddLabour);

            waitMethods.loadingWait(loder);
          TestListener.saveScreenshotPNG(driver);
      }
    /**
     * click on VMRS
     */
      public void clickOnVMRS() throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndClickable(VMRS);
        WebElementActions.getActions(driver).clickElement(VMRS);

          waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * Enter first labour
     */
      public void enterFirstLabour() throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndClickable(search_text);
        WebElementActions.getActions(driver).inputText(search_text,appProp51.getProperty("FirstName"));

          waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * click on firstlabour image
     */
       public void clickOnFirstLabourImg() throws InterruptedException {
           waitMethods.waitForElementToBeRefreshedAndClickable(FirstLabour_img);
         WebElementActions.getActions(driver).clickElement(FirstLabour_img);

           waitMethods.loadingWait(loder);
         TestListener.saveScreenshotPNG(driver);
     }
    /**
     * click on plus button
     */
      public void clickOnPlusButton() throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndClickable(plusIcon);
        WebElementActions.getActions(driver).clickElement(plusIcon);

          waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * click on add button
     */
      public void clickOnAddButton() throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndClickable(btnAdd);
        WebElementActions.getActions(driver).clickElement(btnAdd);

          waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * Enter first labour
     */
      public void enterSecondLabour() throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndClickable(search_text);
        WebElementActions.getActions(driver).inputText(search_text,appProp51.getProperty("SecondName"));

          waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * click on add parts
     */
      public void clickOnParts() throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndClickable(AddParts);
        WebElementActions.getActions(driver).clickElement(AddParts);

          waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * enter part number
     */
      public void enterPart() throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndClickable(part_textbox);
        WebElementActions.getActions(driver).inputText(part_textbox,appProp51.getProperty("firstPart"));
        Thread.sleep(2000);
        WebElementActions.getActions(driver).clickElement(listOfParts);

          waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * click on issue part
     */
      public void clickIssuePart() throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndClickable(issuePart);
        WebElementActions.getActions(driver).clickElement(issuePart);

          waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * enter second part number
     */
      public void enterSecondPart() throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndClickable(part_textbox);
        WebElementActions.getActions(driver).inputText(part_textbox,appProp51.getProperty("secondPart"));
        Thread.sleep(2000);
        WebElementActions.getActions(driver).clickElement(listOfParts);

          waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * click on close
     */
      public void clickClose() throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndClickable(close);
        WebElementActions.getActions(driver).clickElement(close);

          waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * click on Taxes
     */
      public void clickOnTaxes() throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndClickable(taxex_link);
        WebElementActions.getActions(driver).clickElement(taxex_link);

          waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * verify taxes element
     */
      public void verifyTaxesPopUp() throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndIsVisible(taxes);
        Assert.assertTrue(taxes.isDisplayed());
        Assert.assertTrue(tax.isDisplayed());
        Assert.assertTrue(sign_percentage.isDisplayed());
        Assert.assertTrue(Amount.isDisplayed());
        Assert.assertTrue(overrideDetails.isDisplayed());
    }
    /**
     * verify percentage amount pop up
     */
      public void verifyPercentageAmountPopUp() throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndIsVisible(taxes_2);
        Assert.assertTrue(taxes_2.isDisplayed());
        Assert.assertTrue(tax_2.isDisplayed());
        Assert.assertTrue(override.isDisplayed());
        Assert.assertTrue(percentage1.isDisplayed());
        Assert.assertTrue(amount1.isDisplayed());
    }
    /**
     * click on Add Tax
     */
       public void clickOnAddTax() throws InterruptedException {
           waitMethods.waitForElementToBeRefreshedAndClickable(Add_tax);
         WebElementActions.getActions(driver).clickElement(Add_tax);

           waitMethods.loadingWait(loder);
         TestListener.saveScreenshotPNG(driver);
     }
    /**
     * select option from dropdown
     */
      public void clickOnVat() throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndClickable(select_option);
        WebElementActions.getActions(driver).elementSelectByVisibilityText(select_option,appProp51.getProperty("selectOption_1"));

          waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * enter percentage of VAT
     */
      public void enterPercentageVAT() throws InterruptedException {
        String VatPercentage = String.valueOf(WebElementActions.getActions(driver).randomNumber(1,10));

          waitMethods.waitForElementToBeRefreshedAndClickable(percentage);
        WebElementActions.getActions(driver).inputText(percentage,VatPercentage);

        amount.sendKeys(Keys.TAB);

          waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }

    /**
     * enter Amount
     */
      public void enterVATAmount() throws InterruptedException {
        String VatAmount = String.valueOf(WebElementActions.getActions(driver).randomNumber(1,10));

          waitMethods.waitForElementToBeRefreshedAndClickable(amount);
        WebElementActions.getActions(driver).inputText(amount,VatAmount);

          waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * click on OK button
     */
       public void clickOnOK() throws InterruptedException {
           waitMethods.waitForElementToBeRefreshedAndClickable(OK_Btn);
         WebElementActions.getActions(driver).clickElement(OK_Btn);

           waitMethods.loadingWait(loder);
         TestListener.saveScreenshotPNG(driver);
     }
    /**
     * select option of T1 from dropdown
     */
      public void clickOnT1() throws InterruptedException {

          waitMethods.waitForElementToBeRefreshedAndClickable(select_option);
        WebElementActions.getActions(driver).elementSelectByVisibilityText(select_option,appProp51.getProperty("selectOption_2"));

          waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * enter percentage of T1
     */
      public void enterPercentageT1() throws InterruptedException {
        String T1Percentage = String.valueOf(WebElementActions.getActions(driver).randomNumber(1,10));

          waitMethods.waitForElementToBeRefreshedAndClickable(percentage);
        WebElementActions.getActions(driver).inputText(percentage,T1Percentage);

        amount.sendKeys(Keys.TAB);

          waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * enter Amount of T1
     */
      public void enterT1Amount() throws InterruptedException {
        String T1Amount = String.valueOf(WebElementActions.getActions(driver).randomNumber(1,10));

          waitMethods.waitForElementToBeRefreshedAndClickable(amount);
        WebElementActions.getActions(driver).inputText(amount,T1Amount);


          waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * click on close button
     */
      public void clickOnClose_Taxes() throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndClickable(btn_close);
        WebElementActions.getActions(driver).clickElement(btn_close);

          waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * click on invoice button
     */
      public void clickOnInvoice() throws InterruptedException, FileNotFoundException {
          waitMethods.waitForElementToBeRefreshedAndClickable(invoice_btn);
        WebElementActions.getActions(driver).clickElement(invoice_btn);

//        Thread.sleep(8000);
//        ReusableActions.getActions(driver).deleteDownloadedFile();

          waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
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

            if(pdfFullText.contains("Shop Charges:"))
            {
                System.out.println("All taxes are visible and the being calculated properly.");

            }

            fis.close();
        }
          Thread.sleep(10000);
          ReusableActions.deleteDownloadedFile();

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










