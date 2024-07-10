  package pages.service;

import actions.ReusableActions;
import actions.WaitActions;
import actions.WebElementActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import tests.TestDriverActions;
import utils.TestListener;
import utils.WaitMethods;

import java.io.FileNotFoundException;
import java.util.List;

public class   ECServiceManager_ChangeCustomerPOafterInvoicing extends TestDriverActions {

    @FindBy(xpath = "//a[text()='Update Customer PO Number']")
    WebElement label_updateCustomerPoNum;

    @FindBy(xpath = "//div[text()='Update Customer PO Number']")
    WebElement subtitle_UpdateCustomerPoNum;

    @FindBy(xpath = "//label[text()='Invoiced To:']")
    WebElement label_invoicedTo;

    @FindBy(xpath = "//label[text()='Invoiced To:']/following::input[1]")
    WebElement txt_invoicedTo;

    @FindBy(xpath = "//label[text()='Invoiced To:']/following::td[2]/a/img")
    WebElement search_icon;

    @FindBy(xpath = "//label[text()='Invoiced To:']/following::span[1]")
    WebElement asterisk_invoiceFrom;

    @FindBy(xpath = "//label[text()='Invoice From Date:']")
    WebElement label_InvoiceFrom;

    @FindBy(xpath = "//label[text()='Invoice From Date:']/following::input[1]")
    WebElement txt_InvoiceFrom;

    @FindBy(xpath = "//label[text()='Invoice From Date:']/following::span[3]")
    WebElement asterisk_InvoiceTo;

    @FindBy(xpath = "//label[text()='Invoice To Date:']")
    WebElement label_InvoiceTo;

    @FindBy(xpath = "//label[text()='Invoice To Date:']/following::input[1]")
    WebElement txt_InvoiceTo;

    @FindBy(xpath = "//span[text()='Generate']")
    WebElement label_generate;

    @FindBy(xpath = "//span[text()='Invoice Number']")
    WebElement label_invoiceNumber;

    @FindBy(xpath = "//span[text()='Invoice Date']")
    WebElement label_invoiceDate;

    @FindBy(xpath = "//span[text()='RO Number']")
    WebElement label_RoNumber;

    @FindBy(xpath = "//span[text()='Customer Name']")
    WebElement label_customerName;

    @FindBy(xpath = "(//span[text()='Customer PO#'])[2]")
    WebElement label_CustomerPo;

    @FindBy(xpath = "//span[text()='Reprint']")
    WebElement label_Reprint;

    @FindBy(xpath = "(//span[text()='Cancel'])[1]")
    WebElement btn_cancle;

    @FindBy(xpath = "(//span[text()='Save / Exit'])[1]")
    WebElement btn_saveExit;

    @FindBy(xpath = "(//span[contains(@id,'si1')]/following::td)[4]")
    WebElement btn_signOut;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement inputbox_Username;

    @FindBy(xpath = "//h1[text()='Working...Please Wait']")
    List<WebElement> loder;

    @FindBy(xpath = "//a[text()='Service']")
    WebElement menu_Service;
    @FindBy(xpath = "//td[text()='Complete RO']")
    WebElement subMenu_CompleteRo;

    public WebDriver driver;

    public ECServiceManager_ChangeCustomerPOafterInvoicing(WebDriver driver){
        this.driver = driver;
        this.waitMethods = new WaitMethods(driver);
 //       this.webElementActions = new WebElementActions(driver);

    }

    public void gotoCompleteRo() throws FileNotFoundException, InterruptedException {
//        ReusableActions.getActions().clickParentMenu("Service");
//        ReusableActions.getActions().clickChildMenu("Complete RO");

        waitMethods.waitForElementToBeRefreshedAndClickable(menu_Service);
        WebElementActions.getActions(driver).clickElement(menu_Service);

        waitMethods.waitForElementToBeRefreshedAndClickable(subMenu_CompleteRo);
        WebElementActions.getActions(driver).clickElement(subMenu_CompleteRo);


        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * click on Update Customer PO Number
     */
        public void clickOnUpdateCustomerPoNumber() throws InterruptedException {
           waitMethods.waitForElementToBeRefreshedAndClickable(label_updateCustomerPoNum);
        WebElementActions.getActions(driver).clickElement(label_updateCustomerPoNum);

           waitMethods.loadingWait(loder);

          TestListener.saveScreenshotPNG(driver);
      }
    /**
     * verify the elements
     */
        public void verifyElement() throws InterruptedException {

           waitMethods.waitForElementToBeRefreshedAndIsVisible(subtitle_UpdateCustomerPoNum);
          Assert.assertTrue(subtitle_UpdateCustomerPoNum.isDisplayed());
          Assert.assertTrue(label_invoicedTo.isDisplayed());
          Assert.assertTrue(txt_invoicedTo.isDisplayed());
          Assert.assertTrue(search_icon.isDisplayed());
          Assert.assertTrue(asterisk_invoiceFrom.isDisplayed());
          Assert.assertTrue(label_InvoiceFrom.isDisplayed());
          Assert.assertTrue(txt_InvoiceFrom.isDisplayed());
          Assert.assertTrue(asterisk_InvoiceTo.isDisplayed());
          Assert.assertTrue(label_InvoiceTo.isDisplayed());
          Assert.assertTrue(txt_InvoiceTo.isDisplayed());
          Assert.assertTrue(label_generate.isDisplayed());
          Assert.assertTrue(label_invoiceNumber.isDisplayed());
          Assert.assertTrue(label_invoiceDate.isDisplayed());
          Assert.assertTrue(label_RoNumber.isDisplayed());
          Assert.assertTrue(label_customerName.isDisplayed());
          Assert.assertTrue(label_CustomerPo.isDisplayed());
          Assert.assertTrue(label_Reprint.isDisplayed());
          Assert.assertTrue(btn_cancle.isDisplayed());
          Assert.assertTrue(btn_saveExit.isDisplayed());

          TestListener.saveScreenshotPNG(driver);

      }
    /**
     * click on save and Exit button
     */
      public void clickOnSaveExit() throws InterruptedException {

         waitMethods.waitForElementToBeRefreshedAndClickable(btn_saveExit);
        WebElementActions.getActions(driver).clickElement(btn_saveExit);


    }
    /**
     * click on sign out button
     * verify username
     */
      public void clickOnSignOut () throws InterruptedException {

          waitMethods.waitForElementToBeRefreshedAndClickable(btn_signOut);
          WebElementActions.getActions(driver).clickElement(btn_signOut);

          waitMethods.waitForElementToBeRefreshedAndIsVisible(inputbox_Username);
          Assert.assertTrue(inputbox_Username.isDisplayed());

        TestListener.saveScreenshotPNG(driver);
    }


}
