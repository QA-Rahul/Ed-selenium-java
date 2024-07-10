package pages.Ticket;

import actions.ReusableActions;
import actions.WaitActions;
import actions.WebElementActions;
import com.google.j2objc.annotations.Weak;
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

public class EstimateFormatTaxIssue extends TestDriverActions {
    @FindBy(xpath = "//span[contains(.,'( corproId=')]")
    WebElement CorproId;
    @FindBy(xpath = "//label[contains(.,'Search ')]/parent::td/following-sibling::td/child::input")
    WebElement searchandSelectCarporation;

    @FindBy(xpath = "(//a[contains(.,'Select')])[1]")
    WebElement Select;

    @FindBy(xpath = "(//a[contains(text(),'Repair Estimates In Progress')])[2]")
    WebElement RepairEstimatesInProgress;

    @FindBy(xpath = "//h1[contains(.,'Repair Estimates In Progress')]")
    WebElement tital_RepairEstimatesInProgress;

    @FindBy(xpath = "//label[contains(text(),'Estimate Status:')]")
    WebElement EstimateStatus;

    @FindBy(xpath = "(//a[contains(.,'Quick Estimate')])[2]")
    WebElement label_QuickEstimate;
    @FindBy(xpath = "//span[text()='Location']")
    WebElement Location;
    @FindBy(xpath = "//span[text()='Unit Owner']")
    WebElement UnitOwner;

    @FindBy(xpath = "//span[text()='Unit Number']")
    WebElement UnitNumber;

    @FindBy(xpath = "//span[text()='Estimate Date']")
    WebElement EstimateDate;

    @FindBy(xpath = "//span[text()='Total']")
    WebElement Total;

    @FindBy(xpath = "//span[text()='Estimate#']")
    WebElement EstimateHash;

   @FindBy(xpath = "//span[text()='RO#']")
   WebElement ROHash;

   @FindBy(xpath = "(//a[contains(.,'RE00')])[1]")
   WebElement Estimate;

    @FindBy(xpath = "(//span[contains(.,'Add Lab')])[1]")
     WebElement label_AddLabor;

    @FindBy(xpath = "(//a[text()='VMRS'])[1]")
     WebElement label_VMRS;

    @FindBy(xpath = "//label[text()='Search:']/parent::td/following-sibling::td//child::input")
    WebElement SearchTextArea;

    @FindBy(xpath = "//img[@title='Air Conditioning, Heating & Ventilating System']")
     WebElement AirConditioning;

    @FindBy(xpath = "(//img[contains(@id,':ciAddVmrs::icon')])[1]")
    WebElement label_Add;

    @FindBy(xpath = "//input[contains(@id,':ittActEstimatedHours::content')]")
     WebElement EstimateHours;

    @FindBy(xpath = "//span[text()='Add']")
      WebElement label_AddButton;

    @FindBy(xpath = "//a[contains(.,'Air Conditioning, Heating & Ventilating System')]/parent::span/following::a[4]/child::img")
     List<WebElement> img_CrossOne;

    @FindBy(xpath = "//span[contains(text(),'Add Lab')]/following::img[1]")
     WebElement label_Delete1;

    @FindBy(xpath = "//span[text()='Repair Estimate']")
    WebElement RepairEstimate;

    @FindBy(xpath = "//a[contains(.,'Sign Out')]")
     WebElement label_SignOut;

    @FindBy(xpath = "//input[contains(@id,'username::content')]")
     WebElement label_UserName;

    @FindBy(xpath = "//a[text()='Service']")
    WebElement menu_Service;

    @FindBy(xpath = "//td[text()='Service Board']")
    WebElement subMenu_ServiceBoard;

    @FindBy(xpath = "//h1[text()='Working...Please Wait']")
    List<WebElement> loder;


    public EstimateFormatTaxIssue(WebDriver driver){
        this.driver = driver;
        this.waitMethods = new WaitMethods(driver);
    }



    /**go to  Service Board  Screen*/
    public void goToServiceBoardScreen() throws InterruptedException, FileNotFoundException {

        waitMethods.waitForElementToBeRefreshedAndClickable(menu_Service);
        WebElementActions.getActions(driver).clickElement(menu_Service);

        waitMethods.waitForElementToBeRefreshedAndClickable(subMenu_ServiceBoard);
        WebElementActions.getActions(driver).clickElement(subMenu_ServiceBoard);

        TestListener.saveScreenshotPNG(driver);

        waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);

    }
    /* click PF User in American Body**/
    public void clickOnCorproId() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(CorproId);
        WebElementActions.getActions(driver).clickElement(CorproId);
        waitMethods.loadingWait(loder);

    }
    /* select  PF User in American Body**/
    public void selectPFUserInAmericanBody () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(searchandSelectCarporation);
        WebElementActions.getActions(driver).inputText(searchandSelectCarporation, appProp75.getProperty("AmericanBody"));
        waitMethods.loadingWait(loder);

        waitMethods.waitForElementToBeRefreshedAndIsVisible(Select);
        WebElementActions.getActions(driver).clickElement(Select);

    }

    /*click On Repair Estimates In Progress**/
    public void clickonRepairEstimatesInProgess() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(RepairEstimatesInProgress);
        WebElementActions.getActions(driver).clickElement(RepairEstimatesInProgress);
        waitMethods.loadingWait(loder);


    }
    /*verify Repair Estimate In Progress**/
    public void verifyOnRepairEstimateInProgess () throws InterruptedException {

        waitMethods.waitForElementToBeRefreshedAndIsVisible(tital_RepairEstimatesInProgress);
        Assert.assertTrue(tital_RepairEstimatesInProgress.isDisplayed());

        waitMethods.waitForElementToBeRefreshedAndIsVisible(EstimateStatus);
        Assert.assertTrue(EstimateStatus.isDisplayed());

        waitMethods.waitForElementToBeRefreshedAndIsVisible(label_QuickEstimate);
        Assert.assertTrue(label_QuickEstimate.isDisplayed());

    }
   /*verify Location **/
    public void verifyLocation () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(Location);
        Assert.assertTrue(Location.isDisplayed());

        waitMethods.waitForElementToBeRefreshedAndIsVisible(UnitOwner);
        Assert.assertTrue(UnitOwner.isDisplayed());

        waitMethods.waitForElementToBeRefreshedAndIsVisible(UnitNumber);
        Assert.assertTrue(UnitNumber.isDisplayed());

        waitMethods.waitForElementToBeRefreshedAndIsVisible(EstimateDate);
        Assert.assertTrue(EstimateDate.isDisplayed());

        waitMethods.waitForElementToBeRefreshedAndIsVisible(Total);
        Assert.assertTrue(Total.isDisplayed());

        waitMethods.waitForElementToBeRefreshedAndIsVisible(EstimateHash);
        Assert.assertTrue(EstimateHash.isDisplayed());

        waitMethods.waitForElementToBeRefreshedAndIsVisible(ROHash);
        Assert.assertTrue(ROHash.isDisplayed());
    }
    /*click On Estimate **/
    public void clickOnEstimate () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(Estimate);
        WebElementActions.getActions(driver).clickElement(Estimate);
        waitMethods.loadingWait(loder);
    }
   /*click On Add Labour**/
    public void clickOnAddLabour () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(label_AddLabor);
        WebElementActions.getActions(driver).clickElement(label_AddLabor);
        waitMethods.loadingWait(loder);


    }
    /*click On VMRs **/
    public void clickOnVMRS () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(label_VMRS);
        WebElementActions.getActions(driver).clickElement(label_VMRS);


    }
    /*enter the SearchTextArea Body Work**/
    public void entertheSearchTextArea  () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(SearchTextArea);
        WebElementActions.getActions(driver).inputText(SearchTextArea, appProp75.getProperty("AirConditioning"));
        waitMethods.loadingWait(loder);

    }

    /*click On Body Work **/
    public void clickOnBodyWork () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(AirConditioning);
        WebElementActions.getActions(driver).clickElement(AirConditioning);

    }
   /*click On Add **/
    public void clickOnAdd () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(label_Add);
        WebElementActions.getActions(driver).clickElement(label_Add);

    }
  /*enter the Estimate Hours **/
    public void entertheEstimateHours () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(EstimateHours);
        WebElementActions.getActions(driver).inputText(EstimateHours,appProp75.getProperty("EstimateHours"));
        waitMethods.loadingWait(loder);

    }
   /*click On Add Button **/
    public void clickOnAddButton () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(label_AddButton);
        WebElementActions.getActions(driver).clickElement(label_AddButton);

    }
  /*clickOnRepairEstimate**/
    public void clickOnRepairEstimate () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(RepairEstimate);
        WebElementActions.getActions(driver).clickElement(RepairEstimate);
        waitMethods.loadingWait(loder);

    }
    /**verify taxes on PDF*/
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

            if(pdfFullText.contains("American Body Company Inc."))
            {
                System.out.println("Estimate Total");

            }

            fis.close();
            waitMethods.loadingWait(loder);
        }
    }
    /*click on Cancel  icon**/
     public void clickOncancelIcon () throws InterruptedException {
         if (img_CrossOne.size() > 1) {
             Thread.sleep(2000);
             waitMethods.waitForElementToBeRefreshedAndIsVisible(img_CrossOne.get(1));
             WebElementActions.getActions(driver).clickElement(img_CrossOne.get(1));
             waitMethods.loadingWait(loder);

         }

     }
     /*click On Delete icon**/
    public void clickOnDeleteicon () throws InterruptedException {

        waitMethods.waitForElementToBeRefreshedAndIsVisible(label_Delete1);
        WebElementActions.getActions(driver).clickElement(label_Delete1);
        waitMethods.loadingWait(loder);

    }

    /*click On Sign OUt**/
    public void clickOnSignOut () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(label_SignOut);
        WebElementActions.getActions(driver).clickElement(label_SignOut);

    }
   /*click On UserName TextArea**/
   public void clickOnUserNameTextArea () throws InterruptedException {
       waitMethods.waitForElementToBeRefreshedAndIsVisible(label_UserName);
       WebElementActions.getActions(driver).clickElement(label_UserName);



   }



}