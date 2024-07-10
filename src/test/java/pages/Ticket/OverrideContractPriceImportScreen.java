package pages.Ticket;

import actions.ReusableActions;
import actions.WaitActions;
//import actions.WebElementActions;
import actions.WebElementActions;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import tests.TestDriverActions;
import utils.TestListener;
import utils.WaitMethods;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public class OverrideContractPriceImportScreen extends TestDriverActions {

    @FindBy(xpath = "(//a[contains(@id,'sdi11::disAcrBlw')])[1]")
    WebElement tab_ImportPartsContractPriceOverride;
    @FindBy(xpath = "//h1[text()='Import Parts Contract Price Overrides']")
    WebElement title_ImportPartsContractPriceOverride;
    @FindBy(xpath = "//div[contains(@id,'cb1')]")
    WebElement tab_downloadTemplate;
    @FindBy(xpath = "(//label[text()='Date Format:'])[1]")
    WebElement label_dateFormat;
    @FindBy(xpath = "(//label[text()='Date Format:'])[1]/following::select")
    List<WebElement> select_dateFormat;
    @FindBy(xpath = "//label[text()='File to be uploaded:']")
    WebElement label_Filetobeuploaded;
    @FindBy(xpath = "//input[contains(@type,'file')]")
    WebElement tab_fileuploaded;
    @FindBy(xpath = "//div[contains(@id,'ctb1')]")
    WebElement tab_import;
    @FindBy(xpath = "//div[contains(@id,'ctb5')]")
    WebElement tab_refresh;
    @FindBy(xpath = "//span[text()='Import Date']")
    WebElement colName_ImportDate;
    @FindBy(xpath = "//span[text()='File Name']")
    WebElement colName_FileName;
    @FindBy(xpath = "//span[text()='Status']")
    WebElement colName_status;
    @FindBy(xpath = "//span[text()='Records Imported']")
    WebElement colName_RecordImported;
    @FindBy(xpath = "//span[text()='Data Errors']")
    WebElement colName_DataErrors;
    @FindBy(xpath = "//span[text()='File Errors']")
    WebElement colName_FileErrors;
    @FindBy(xpath = "//div[contains(@id,'pw11::_ttxt')]")
    WebElement importMessage_title;
    @FindBy(xpath = "//textarea[contains(@id,'it2::content')]")
    WebElement importMessage;
    @FindBy(xpath = "//div[contains(@id,'cb21')]")
    WebElement btn_ok;
    @FindBy(xpath = "(//a[text()='Parts List'])[1]")
    WebElement tab_partList;
    @FindBy(xpath = "(//a[contains(@id,'cl9')])[3]")
    WebElement part_name;
    @FindBy(xpath = "//select[contains(@id,'soc3::content')]")
    WebElement product_group;
    @FindBy(xpath = "//div[contains(@id,'ctbMoreInfo')]")
    WebElement MoreInfo;
    @FindBy(xpath = "(//a[text()='Costs & Pricing'])[1]")
    WebElement tab_costandPricing;
    @FindBy(xpath = "(//a[text()='Override Contract Pricing'])[1]")
    WebElement tab_OverrideContractPricing;
    @FindBy(xpath = "//span[text()='Contract']")
    WebElement col_contract;
    @FindBy(xpath = "//span[text()='Effective']")
    WebElement col_effective;
    @FindBy(xpath = "//span[text()='Basis']")
    WebElement col_basis;
    @FindBy(xpath = "//span[text()='Basis']/following::th[1]")
    WebElement col_percent;
    @FindBy(xpath = "//span[text()='Price']")
    WebElement col_price;
    @FindBy(xpath = "//span[text()='Core %']")
    WebElement col_core;
    @FindBy(xpath = "//span[text()='Core Price']")
    WebElement col_corePrice;
    @FindBy(xpath = "(//span[text()='Active'])[2]")
    WebElement col_Active;
    @FindBy(xpath = "//td[contains(@id,'c39')]")
    WebElement value_contract;
    @FindBy(xpath = "//div[contains(@id,'ctbSaveExit')]")
    WebElement saveExit;
    @FindBy(xpath = "//td[contains(@id,'c3')]")
    List<WebElement> col_ImportDate;
    @FindBy(xpath = "//td[contains(@id,'c5')]")
    WebElement records_Imported;
    @FindBy(xpath = "//td[contains(@id,'c16')]")
    WebElement data_error;
    @FindBy(xpath = "//td[contains(@id,'c64')]")
    WebElement file_error;
    @FindBy(xpath = "//span[text()='Add Override']")
    WebElement AddOverride;
    @FindBy(xpath = "(//select[contains(@id,'soc1::content')])[2]")
    WebElement selectContract;
    @FindBy(xpath = "//label[text()='Percent:']/following::input[1]")
    WebElement percent_value;
    @FindBy(xpath = "//label[text()='Core %:']/following::input[1]")
    WebElement core_value;
    @FindBy(xpath = "//div[contains(text(),'Override Contract Pricing ')]")
    WebElement overrideContractPricing;
    @FindBy(xpath = "//label[text()='Contract']")
    WebElement contract;
    @FindBy(xpath = "//label[text()='Currency']")
    WebElement currency;
    @FindBy(xpath = "//label[text()='Effective Date:']")
    WebElement effectiveDate;
    @FindBy(xpath = "//label[text()='Effective Date:']/following::input[1]")
    WebElement txtbox_effectiveDate;
    @FindBy(xpath = "//label[text()='Currency']/following::select[1]")
    WebElement select_currency;
    @FindBy(xpath = "//label[text()='Basis:']")
    WebElement basis;
    @FindBy(xpath = "//label[text()='Basis:']/following::input[1]")
    WebElement radio_Percentage;
    @FindBy(xpath = "//label[text()='Percent']")
    WebElement percent;
    @FindBy(xpath = "//label[text()='Percent']/following::input[1]")
    WebElement price_radio;
    @FindBy(xpath = "//label[text()='Price']")
    WebElement price;
    @FindBy(xpath = "//label[text()='Core %:']")
    WebElement core;
    @FindBy(xpath = "(//label[text()='Active'])[2]")
    WebElement active;
    @FindBy(xpath = "(//label[text()='Active'])[2]/preceding::input[1]")
    WebElement checkbox_active;
    @FindBy(xpath = "(//div[contains(@id,'cb2')])[3]")
    WebElement btn_cancle;
    @FindBy(xpath = "//div[contains(@id,'cb3')]")
    WebElement Ok;
    @FindBy(xpath = "//div[contains(@id,'cbOK')]")
    WebElement ok;

    @FindBy(xpath = "//span[text()='Sign Out']")
    WebElement btn_signOut;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement inputbox_Username;

     @FindBy(xpath = "//h1[text()='Working...Please Wait']")
     List<WebElement> loder;

     public OverrideContractPriceImportScreen(WebDriver driver){
         this.driver = driver;
         this.waitMethods = new WaitMethods(driver);
     }

    public void gotoPartMaster() throws FileNotFoundException, InterruptedException {

        ReusableActions.getActions(driver).clickParentMenu("Parts");
        ReusableActions.getActions(driver).clickChildMenu("Part Master");

        TestListener.saveScreenshotPNG(driver);
    }

    /**
     * Click on Import Parts Contract Price Overrides
     */
     public void clickOnImportPartsContractPriceOverride() throws InterruptedException {
         waitMethods.waitForElementToBeRefreshedAndClickable(tab_ImportPartsContractPriceOverride);
        WebElementActions.getActions(driver).clickElement(tab_ImportPartsContractPriceOverride);

         waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * Verify Import Parts title with some tab like download,import and refresh
     */
      public void verifyImportPartsTitle() throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndIsVisible(title_ImportPartsContractPriceOverride);
        Assert.assertTrue(title_ImportPartsContractPriceOverride.isDisplayed());

    }
    public void verifytab_downloadTemplate() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(tab_downloadTemplate);
        Assert.assertTrue(tab_downloadTemplate.isDisplayed());

    }

    public void verify_label_dateFormat() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(label_dateFormat);
        Assert.assertTrue(label_dateFormat.isDisplayed());

    }
    public void verify_select_dateFormat() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(select_dateFormat.get(0));
        Assert.assertTrue(select_dateFormat.get(0).isDisplayed());

    }
    public void verify_label_Filetobeuploaded() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(label_Filetobeuploaded);
        Assert.assertTrue(label_Filetobeuploaded.isDisplayed());

    }
    public void verify_textbox_fileuploaded() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(tab_fileuploaded);
        Assert.assertTrue(tab_fileuploaded.isDisplayed());

    }
    public void verify_tab_import() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(tab_import);
        Assert.assertTrue(tab_import.isDisplayed());

    }
    public void verify_tab_refresh() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(tab_refresh);
        Assert.assertTrue(tab_refresh.isDisplayed());


        TestListener.saveScreenshotPNG(driver);
    }

    /**
     * verify column names
     * @throws InterruptedException
     */
      public void verify_colName_ImportDate() throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndIsVisible(colName_ImportDate);
        Assert.assertTrue(colName_ImportDate.isDisplayed());

    }
    public void verify_colName_FileName() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(colName_FileName);
        Assert.assertTrue(colName_FileName.isDisplayed());

    }
    public void verify_colName_status() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(colName_status);
        Assert.assertTrue(colName_status.isDisplayed());

    }
    public void verify_colName_RecordImported() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(colName_RecordImported);
        Assert.assertTrue(colName_RecordImported.isDisplayed());

    }
    public void verify_colName_DataErrors() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(colName_DataErrors);
        Assert.assertTrue(colName_DataErrors.isDisplayed());

    }public void verify_colName_FileErrors() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(colName_FileErrors);
        Assert.assertTrue(colName_FileErrors.isDisplayed());


        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * Click on Date Format
     */
      public void clickOnDateFormat() throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndClickable(select_dateFormat.get(0));
         WebElementActions.getActions(driver).elementSelectByVisibilityText(select_dateFormat.get(0),"DD/MM/YYYY");

          waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * click on choose file to upload file
     */
       public void clickOnChooseFile() throws InterruptedException, AWTException {

           waitMethods.waitForElementToBeRefreshedAndClickable(tab_fileuploaded);
           WebElementActions.getActions(driver).uploadFile(tab_fileuploaded,"\\data\\overrideContract\\ImportPriceOverrideTemplate-final.xlsx");


           waitMethods.loadingWait(loder);
         TestListener.saveScreenshotPNG(driver);
     }
    /**
     * click on choose file to upload invalid datafile
     */
      public void clickOnChooseFile_Invalid() throws InterruptedException, AWTException {

          waitMethods.waitForElementToBeRefreshedAndClickable(tab_fileuploaded);
        WebElementActions.getActions(driver).uploadFile(tab_fileuploaded,"\\data\\overrideContract\\ImportPriceOverrideTemplate_invalid.xlsx");

          waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * Import the uploaded file by clicking on import button
     */
        public void clickOnImportTab() throws InterruptedException {
            waitMethods.waitForElementToBeRefreshedAndClickable(tab_import);
          WebElementActions.getActions(driver).clickElement(tab_import);

            waitMethods.loadingWait(loder);
          TestListener.saveScreenshotPNG(driver);
      }
    /**
     *  verify the message while importing
     */
      public void verifyMessageTitle() throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndIsVisible(importMessage_title);
        Assert.assertTrue(importMessage_title.isDisplayed());
    }
    public void verifyMessage() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(importMessage);
        Assert.assertTrue(importMessage.isDisplayed());
    }
    public void verifyOk() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(btn_ok);
        Assert.assertTrue(btn_ok.isDisplayed());
    }
    /**
     * click on Ok button
     */
      public void clickOnOK() throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndClickable(btn_ok);
        WebElementActions.getActions(driver).clickElement(btn_ok);

          waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * click on Download Template
     */
       public void clickOnDownloadTemplate() throws InterruptedException {

         Thread.sleep(5000);
         ReusableActions.deleteDownloadedFile();

           waitMethods.waitForElementToBeRefreshedAndClickable(tab_downloadTemplate);
         WebElementActions.getActions(driver).clickElement(tab_downloadTemplate);

           waitMethods.loadingWait(loder);
         TestListener.saveScreenshotPNG(driver);
     }
    /**
     * verify template data
     */
      public void verifyTemplateData() throws InterruptedException, IOException {
        Thread.sleep(10000);
        File dir = new File(System.getProperty("user.dir") + "\\downloadFiles");
        File[] dirContents = dir.listFiles();
        String fileName = dirContents[0].getName();
        String url = System.getProperty("user.dir") + "\\downloadFiles\\" + fileName;
        File file = new File(url);
        FileInputStream fis = new FileInputStream(file);
        Workbook workbook = new XSSFWorkbook(fis);
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
        ReusableActions.deleteDownloadedFile();

          waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);

    }
    /**
     * verify that valid file successfully import
     */
      public void verifyFileImportedSuccessfully() throws InterruptedException {

        if (records_Imported.getText().contains("1") ) {
            waitMethods.waitForElementToBeRefreshedAndIsVisible(records_Imported);
            Assert.assertTrue(records_Imported.isDisplayed());
        }

        if (data_error.getText().contains("0") ) {
            waitMethods.waitForElementToBeRefreshedAndIsVisible(data_error);
            Assert.assertTrue(data_error.isDisplayed());
            }

        if (file_error.getText().contains("0") ) {
            waitMethods.waitForElementToBeRefreshedAndIsVisible(file_error);
            Assert.assertTrue(file_error.isDisplayed());

        }
    }
    /**
     * Go to Part list
     */
      public void gotoPartList() throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndClickable(tab_partList);
        WebElementActions.getActions(driver).clickElement(tab_partList);

          waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * click on Part Number
     */
      public void clickPartNumber() throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndClickable(part_name);
        WebElementActions.getActions(driver).clickElement(part_name);

          waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }

    /**
     * select group product
     */
      public void selectGroupProduct() throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndClickable(product_group);
        WebElementActions.getActions(driver).elementSelectByVisibilityText(product_group,appProp50.getProperty("GroupProduct"));

          waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }

    /**
     * click on More Info
     */
      public void clickMoreInfo() throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndClickable(MoreInfo);
        WebElementActions.getActions(driver).clickElement(MoreInfo);

          waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }

    /**
     * click on cost and pricing
     */
      public void clickOnCostPricing() throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndClickable(tab_costandPricing);
        WebElementActions.getActions(driver).clickElement(tab_costandPricing);

          waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }

    /**
     * click on overRide Contract Pricing
     */
      public void clickOverRideContractPricing() throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndClickable(tab_OverrideContractPricing);
        WebElementActions.getActions(driver).clickElement(tab_OverrideContractPricing);

          waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * click on AddContract
     */
      public void clickOnAddContract() throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndClickable(AddOverride);
        WebElementActions.getActions(driver).clickElement(AddOverride);

          waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * verify  overRide Contract Pricing
     */
      public void verifyOverRideContractPricing() throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndIsVisible(overrideContractPricing);
        Assert.assertTrue(overrideContractPricing.isDisplayed());

    }
    public void verifyContract() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(contract);
        Assert.assertTrue(contract.isDisplayed());

    }
    public void verifySelectContract() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(selectContract);
        Assert.assertTrue(selectContract.isDisplayed());

        TestListener.saveScreenshotPNG(driver);
    }
    public void verifyCurrency() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(currency);
        Assert.assertTrue(currency.isDisplayed());

        TestListener.saveScreenshotPNG(driver);
    }
    public void verifyEffectiveDate() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(effectiveDate);
        Assert.assertTrue(effectiveDate.isDisplayed());

        TestListener.saveScreenshotPNG(driver);
    }
    public void verifytxtbox_effectiveDate() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(txtbox_effectiveDate);
        Assert.assertTrue(txtbox_effectiveDate.isDisplayed());

        TestListener.saveScreenshotPNG(driver);
    }
    public void verifyselect_currency() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(select_currency);
        Assert.assertTrue(select_currency.isDisplayed());

        TestListener.saveScreenshotPNG(driver);
    }
    public void verifybasis() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(basis);
        Assert.assertTrue(basis.isDisplayed());

        TestListener.saveScreenshotPNG(driver);
    }public void verifyradio_Percentage() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(radio_Percentage);
        Assert.assertTrue(radio_Percentage.isDisplayed());

        TestListener.saveScreenshotPNG(driver);
    }
    public void verifypercent() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(percent);
        Assert.assertTrue(percent.isDisplayed());

        TestListener.saveScreenshotPNG(driver);
    }
    public void verifyprice_radio() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(price_radio);
        Assert.assertTrue(price_radio.isDisplayed());

        TestListener.saveScreenshotPNG(driver);
    }
    public void verifyprice() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(price);
        Assert.assertTrue(price.isDisplayed());

        TestListener.saveScreenshotPNG(driver);
    }
    public void verifycore() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(core);
        Assert.assertTrue(core.isDisplayed());

        TestListener.saveScreenshotPNG(driver);
    }
    public void verifycheckbox_active() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(checkbox_active);
        Assert.assertTrue(checkbox_active.isDisplayed());

        TestListener.saveScreenshotPNG(driver);
    }
    public void verifyactive() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(active);
        Assert.assertTrue(active.isDisplayed());

        TestListener.saveScreenshotPNG(driver);
    }

    /**
     * select contract
     * */
      public void selectContract() throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndClickable(selectContract);
        WebElementActions.getActions(driver).elementSelectByVisibilityText(selectContract,"55545 (Bearing)");

          waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }

    /**
     * enter percent
     */
      public void enterPercent() throws InterruptedException {

        String percent= String.valueOf(WebElementActions.getActions(driver).randomNumber(1,10));

          waitMethods.waitForElementToBeRefreshedAndClickable(percent_value);
        WebElementActions.getActions(driver).inputText(percent_value,percent);

          waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }

    /**
     * enter core
     */
      public void enterCore() throws InterruptedException {
        String core= String.valueOf(WebElementActions.getActions(driver).randomNumber(1,10));

          waitMethods.waitForElementToBeRefreshedAndClickable(core_value);
        WebElementActions.getActions(driver).inputText(core_value,core);

          waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }

    /**
     * click on OK
     */
      public void clickOK() throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndClickable(Ok);
        WebElementActions.getActions(driver).clickElement(Ok);

          waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }

    /**
     * verify columns in override Contract Pricing
     */
      public void verifyContractColumn() throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndIsVisible(col_contract);
        Assert.assertTrue(col_contract.isDisplayed());

        TestListener.saveScreenshotPNG(driver);

    }
    public void verifyEffective() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(col_effective);
        Assert.assertTrue(col_effective.isDisplayed());

        TestListener.saveScreenshotPNG(driver);

    }
    public void verifyBasis() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(col_basis);
        Assert.assertTrue(col_basis.isDisplayed());

        TestListener.saveScreenshotPNG(driver);

    }
    public void verifyPercent() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(col_percent);
        Assert.assertTrue(active.isDisplayed());

        TestListener.saveScreenshotPNG(driver);

    }
    public void verifyPrice() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(col_price);
        Assert.assertTrue(col_price.isDisplayed());

        TestListener.saveScreenshotPNG(driver);

    }
    public void verifyCore() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(col_core);
        Assert.assertTrue(active.isDisplayed());

        TestListener.saveScreenshotPNG(driver);

    }
    public void verifyCorePrice() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(col_corePrice);
        Assert.assertTrue(col_corePrice.isDisplayed());

        TestListener.saveScreenshotPNG(driver);

    }
    public void verifyActive() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(col_Active);
        Assert.assertTrue(col_Active.isDisplayed());

        TestListener.saveScreenshotPNG(driver);

    }

    /**
     * Verify new entry added by import
     */
      public void verifyNewEntry() throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndIsVisible(value_contract);
        Assert.assertTrue(value_contract.isDisplayed());

        TestListener.saveScreenshotPNG(driver);

    }
    public void verifyImportDate() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(col_ImportDate.get(0));
        Assert.assertTrue(col_ImportDate.get(0).isDisplayed());

        TestListener.saveScreenshotPNG(driver);

    }
    public void verifyrecords_Imported() throws InterruptedException {
        Thread.sleep(3000);
        waitMethods.waitForElementToBeRefreshedAndIsVisible(records_Imported);
        Assert.assertTrue(records_Imported.isDisplayed());

        TestListener.saveScreenshotPNG(driver);

    }
    public void verifydata_error() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(data_error);
        Assert.assertTrue(data_error.isDisplayed());

        TestListener.saveScreenshotPNG(driver);

    }

    /**
     * click on OK
     */
      public void clickok() throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndClickable(ok);
        WebElementActions.getActions(driver).clickElement(ok);

          waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);

    }

    /**
     *click on save and exit
     */
      public void clicksaveExit() throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndClickable(saveExit);
        Thread.sleep(3000);
        WebElementActions.getActions(driver).clickElement(saveExit);

          waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);

    }
    /**
     *
     * deselect the dropdown of date format
     */
       public void deselectDateFormat() throws InterruptedException {

           waitMethods.waitForElementToBeRefreshedAndClickable(select_dateFormat.get(0));
         WebElementActions.getActions(driver).deselectElements(select_dateFormat.get(0),"DD/MM/YYYY");

           waitMethods.loadingWait(loder);
         TestListener.saveScreenshotPNG(driver);
     }
    /**
     * verify that Invalid file successfully import
     */
      public void verifyInvalidFileImportedSuccessfully() throws InterruptedException {

        if (records_Imported.getText().contains("0") ) {
            waitMethods.waitForElementToBeRefreshedAndIsVisible(records_Imported);
            Assert.assertTrue(records_Imported.isDisplayed());
        }

        if (data_error.getText().contains("1") ) {
            waitMethods.waitForElementToBeRefreshedAndIsVisible(data_error);
            Assert.assertTrue(data_error.isDisplayed());
        }

        if (file_error.getText().contains("0") ) {
            waitMethods.waitForElementToBeRefreshedAndIsVisible(file_error);
            Assert.assertTrue(file_error.isDisplayed());

        }
    }

    /**
     * Click on sign out and verify username
     */
      public void clickOnSignOutAndVerifyName() throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndClickable(btn_signOut);
        Thread.sleep(3000);
        WebElementActions.getActions(driver).clickElement(btn_signOut);


         waitMethods.waitForElementToBeRefreshedAndIsVisible(inputbox_Username);
        Assert.assertTrue(inputbox_Username.isDisplayed());

        TestListener.saveScreenshotPNG(driver);
    }



}
