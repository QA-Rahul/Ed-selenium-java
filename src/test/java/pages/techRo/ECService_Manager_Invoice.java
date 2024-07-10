 package pages.techRo;

import actions.LoginActions;
import actions.ReusableActions;
import actions.WaitActions;
import actions.WebElementActions;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import tests.TestDriverActions;
import utils.TestListener;
import utils.WaitMethods;

import java.io.FileNotFoundException;
import java.util.List;

public class ECService_Manager_Invoice extends TestDriverActions {

    @FindBy(xpath = "//input[contains(@id,'itSearch::content')]")
    public WebElement input_SearchTextArea;

    @FindBy(xpath = "//a[contains(@id,':0:sfRM:tWoR:0:cl2')]")
    public WebElement input_ReferenceNumber ;

    @FindBy(xpath = "//label[contains(text(),'RO Date:')]")
    public WebElement label_RODate;

    @FindBy(xpath = "//a[contains(@id,'idReadingDate::glyph')]")
    public WebElement label_ReadingDateGraph;

    @FindBy(xpath = "//span[text()='Refresh']")
    public WebElement btn_Refresh;


    @FindBy(xpath = "//div[contains(@id,'cbROSM')]/a/span")
    public WebElement btn_Invoice;

    @FindBy(xpath = "//label[text()='Internal RO:']/following::input[1]")
    public WebElement InternalRO_txtbox;

    @FindBy(xpath = "//label[text()='RO Date:']")
    public WebElement label_RODate1;

    @FindBy(xpath = "//input[contains(@id,':idReadingDate::content')]")
    public WebElement input_RoDate;


    @FindBy(xpath = "(//span[contains(@id,':0:olWON')]//following::div)[1]")
    public WebElement label_RoNumber;

//    @FindBy(xpath = "//span[text()='Sign Out']")
@FindBy(xpath = "(//span[contains(@id,'si1')]/following::td)[4]")
    public WebElement label_SignOut;

    @FindBy(xpath = "//input[contains(@id,'username::content')]")
    public WebElement label_UserNameTextArea;

    @FindBy(xpath = "//h1[text()='Working...Please Wait']")
    List<WebElement> loder;

    @FindBy(xpath = "//div[contains(@id,'msgDlg::_ttxt')]")
    WebElement warning_error_msg;

    @FindBy(xpath = "//td[contains(@class,'af|message::detail-cell')]")
    WebElement error_msg;

    @FindBy(xpath = "(//div[contains(@id,'cancel')]/a/span)[1]")
    WebElement ok_btn;

    @FindBy(xpath = "//div[contains(@id,'cbCancel')]")
    WebElement close_btn;

    @FindBy(xpath = "//div[contains(@id,'ctbCancel')]")
    WebElement cancle_btn;

    @FindBy(xpath = "//label[text()='Invoice Date:']/following::input[1]")
    WebElement invoiceDate;

    @FindBy(xpath = "//a[text()='Service']")
    WebElement menu_Service;

    @FindBy(xpath = "//td[text()='Complete RO']")
    WebElement subMenu_CompleteRo;

    @FindBy(xpath="//div[contains(@id,'d1_msgDlg_cancel')]")
    WebElement error_ok;


    public ECService_Manager_Invoice(WebDriver driver){
        this.driver = driver;
        this.waitMethods = new WaitMethods(driver);
    }


    /**click on complete Ro */
     public void goToCompleteROScreen() throws InterruptedException, FileNotFoundException {

//        ReusableActions.getActions().clickParentMenu("Service");
//        ReusableActions.getActions().clickChildMenu("Complete RO");


         waitMethods.waitForElementToBeRefreshedAndClickable(menu_Service);
         WebElementActions.getActions(driver).clickElement(menu_Service);

         waitMethods.waitForElementToBeRefreshedAndClickable(subMenu_CompleteRo);
         WebElementActions.getActions(driver).clickElement(subMenu_CompleteRo);

         TestListener.saveScreenshotPNG(driver);
    }
    /**wait element present SearchList */
     public void verifyElementPresent () throws InterruptedException {

         waitMethods.waitForElementToBeRefreshedAndIsVisible(input_ReferenceNumber);
        Assert.assertTrue(input_ReferenceNumber.isDisplayed());

    }

    /** enter Data In Search TextArea */
     public void  enterDataInSearchTextArea () throws InterruptedException {
         if(LoginActions.environmentName.contains("EC")) {
             waitMethods.waitForElementToBeRefreshedAndClickable(input_SearchTextArea);
             WebElementActions.getActions(driver).inputText(input_SearchTextArea,appProp16.getProperty("RoNumber"));
         } else if(LoginActions.environmentName.contains("EU")){
             waitMethods.waitForElementToBeRefreshedAndClickable(input_SearchTextArea);
             WebElementActions.getActions(driver).inputText(input_SearchTextArea,appProp23.getProperty("RoNumber"));
         } else if(LoginActions.environmentName.contains("NA")){
             waitMethods.waitForElementToBeRefreshedAndClickable(input_SearchTextArea);
             WebElementActions.getActions(driver).inputText(input_SearchTextArea,appProp42.getProperty("RoNumber"));
         } else if(LoginActions.environmentName.contains("QA")){
             waitMethods.waitForElementToBeRefreshedAndClickable(input_SearchTextArea);
             WebElementActions.getActions(driver).inputText(input_SearchTextArea,appProp.getProperty("RoNumber"));
         }


         waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);

    }

    /**click On Ro Number */
     public void clickOnRoNumber  () throws InterruptedException {

         waitMethods.waitForElementToBeRefreshedAndClickable(input_ReferenceNumber);
        WebElementActions.getActions(driver).clickElement(input_ReferenceNumber);

         waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);

    }

    /**
     *  verify RO Date and calender Icon
     */
     public void verifyRODate1() throws InterruptedException {
         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_RODate);
        Assert.assertTrue(label_RODate.isDisplayed());
        Assert.assertTrue(label_ReadingDateGraph.isDisplayed());

    }

    /**
     * enter duplicateInternalPO number
     */
     public void enterDuplicateInternalPONumber() throws InterruptedException {
        if (LoginActions.environmentName.contains("EC")) {

            waitMethods.waitForElementToBeRefreshedAndClickable(InternalRO_txtbox);
            WebElementActions.getActions(driver).inputText(InternalRO_txtbox, appProp16.getProperty("RoNumber"));

        }  else if(LoginActions.environmentName.contains("NA")){
            waitMethods.waitForElementToBeRefreshedAndClickable(InternalRO_txtbox);
            WebElementActions.getActions(driver).inputText(InternalRO_txtbox, appProp42.getProperty("RoNumber"));
        }
         Thread.sleep(2000);
         InternalRO_txtbox.sendKeys(Keys.TAB);

         waitMethods.loadingWait(loder);
         TestListener.saveScreenshotPNG(driver);
    }
    /**
     * verify warning pop up element
     */
       public void verifyWarningPopUpElement() throws InterruptedException {
          if (LoginActions.environmentName.contains("EC") || (LoginActions.environmentName.contains("NA"))) {
              waitMethods.waitForElementToBeRefreshedAndIsVisible(warning_error_msg);
              Assert.assertTrue(warning_error_msg.isDisplayed());
              Assert.assertTrue(error_msg.isDisplayed());
              Assert.assertTrue(ok_btn.isDisplayed());
          }
      }
    /**
     *  click on Ok button
     */
     public void clickOKButton() throws InterruptedException {
        if (LoginActions.environmentName.contains("EC") || (LoginActions.environmentName.contains("NA"))) {
            waitMethods.waitForElementToBeRefreshedAndClickable(ok_btn);
            WebElementActions.getActions(driver).clickElement(ok_btn);

            TestListener.saveScreenshotPNG(driver);
        }
    }
    /**
     * enter Internal PO Number
     */
     public void enterInternalPONumber() throws InterruptedException {
        String PONumber = String.valueOf(WebElementActions.getActions(driver).randomNumber(1000, 100000000));
        if (LoginActions.environmentName.contains("EC") || (LoginActions.environmentName.contains("NA"))) {
            waitMethods.waitForElementToBeRefreshedAndClickable(InternalRO_txtbox);
            WebElementActions.getActions(driver).inputText(InternalRO_txtbox, PONumber);
            Thread.sleep(2000);
            InternalRO_txtbox.sendKeys(Keys.TAB);

            waitMethods.loadingWait(loder);
            TestListener.saveScreenshotPNG(driver);
        }
    }


    /**verify RO Date ,ReadingDate Graph */
     public void verifyRODate ()throws InterruptedException {
        if (LoginActions.environmentName.contains("EU")) {
            waitMethods.waitForElementToBeRefreshedAndIsVisible(label_RODate1);
            Assert.assertTrue(label_RODate1.isDisplayed());
            waitMethods.waitForElementToBeRefreshedAndIsVisible(label_ReadingDateGraph);
            Assert.assertTrue(label_ReadingDateGraph.isDisplayed());
        }
    }

    /** Store Ro Number */
     public void storeRoNumber () throws InterruptedException {
         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_RoNumber);
        System.out.println("RoNumber");
        String originalWindow=driver.getWindowHandle () ;


    }
    /**
     * change invoice date      ---- extra step
     */
     public void changeInvoiceDate() throws InterruptedException {
         waitMethods.waitForElementToBeRefreshedAndClickable(invoiceDate);
        WebElementActions.getActions(driver).inputText(invoiceDate,"22/02/2024");

         waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /** click Invoice Button */
     public void clickInvoiceButton () throws InterruptedException {

         waitMethods.waitForElementToBeRefreshedAndClickable(btn_Invoice);
        WebElementActions.getActions(driver).clickElement(btn_Invoice);

         waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);


    }

    /**
     * click on close button
     */
     public void clickOnclose() throws InterruptedException {
        if (LoginActions.environmentName.contains("NA")) {
            Thread.sleep(3000);
            waitMethods.waitForElementToBeRefreshedAndClickable(close_btn);
            WebElementActions.getActions(driver).clickElement(close_btn);

            waitMethods.loadingWait(loder);
            TestListener.saveScreenshotPNG(driver);
        }
    }

    /**
     * click on cancle button
     */
     public void clickOncancle() throws InterruptedException {
        if (LoginActions.environmentName.contains("EC")) {
            waitMethods.waitForElementToBeRefreshedAndClickable(cancle_btn);
            WebElementActions.getActions(driver).clickElement(cancle_btn);

            waitMethods.loadingWait(loder);
            TestListener.saveScreenshotPNG(driver);
        }
    }
    /**
     * click ok - error pop up --- extra step
     */
    public void clickOk() throws InterruptedException {
        if (LoginActions.environmentName.contains("EC") || (LoginActions.environmentName.contains("NA"))) {
            waitMethods.waitForElementToBeRefreshedAndClickable(error_ok);
            WebElementActions.getActions(driver).clickElement(error_ok);
        }
    }
    /**click in Sign out Button */
     public void clickSignOut () throws InterruptedException {
         waitMethods.waitForElementToBeRefreshedAndClickable(label_SignOut);
        WebElementActions.getActions(driver).clickElement(label_SignOut);

    }

    /**click UserName TextArea */
    public void ClickUserNameTextArea () throws InterruptedException {

        waitMethods.waitForElementToBeRefreshedAndIsVisible(label_UserNameTextArea);
        Assert.assertTrue(label_UserNameTextArea.isDisplayed());
        TestListener.saveScreenshotPNG(driver);

    }

}
