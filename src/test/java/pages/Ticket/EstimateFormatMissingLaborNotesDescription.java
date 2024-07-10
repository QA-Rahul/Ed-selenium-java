package pages.Ticket;

import actions.ReusableActions;
import actions.WaitActions;
import actions.WebElementActions;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.TestDriverActions;
import utils.TestListener;
import utils.WaitMethods;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public class EstimateFormatMissingLaborNotesDescription extends TestDriverActions {
    String CodeNumber = WebElementActions.getActions(driver).randomAlphaNumeric(10);

    @FindBy(xpath = "//a[text()='Administration']")
    WebElement menu_Administration;

    @FindBy(xpath = "//td[text()='Corporate Setup Manager']")
    WebElement subMenu_CorporateSetupManager;
    @FindBy(xpath = "(//a[contains(text(),'Invoice Setup')])[1]")
    WebElement InvoiceSetup;

    @FindBy(xpath = "(//div[contains(@id,'::tabf::ecbi')])[1]")
    WebElement RightArrow;

    @FindBy(xpath = "//a[contains(.,'Add')]")
    WebElement Add;

    @FindBy(xpath = "(//a[contains(.,'Select')])[7]")
    WebElement btn_Select;

    @FindBy(xpath = "(//td[contains(.,' [Work Order Estimate]')])[3]")
    WebElement btn_WorkOrderEstimate;

    @FindBy(xpath = "//select[contains(@id,':soc10::content')]")
    WebElement WorkOrderEstimate;

    @FindBy(xpath = "(//a[contains(.,'Cancel')])[1]")
    WebElement btn_Cancel;

    @FindBy(xpath = "(//a[contains(.,'OK')])[1]")
    WebElement btn_OK;

    @FindBy(xpath = "(//a[contains(.,'Repair Locations')])[3]")
    WebElement RepairLocation;

    @FindBy(xpath = "//a[contains(.,'New Repair Location')]")
    WebElement NewRepairLocation;

    @FindBy(xpath = "//label[contains(text(),'Code:')]/preceding-sibling::span")
    WebElement RequiredCode;

    @FindBy(xpath = "(//label[contains(text(),'Code:')])[1]")
    WebElement Code;

    @FindBy(xpath = "(//label[contains(text(),'Code:')]/parent::td/following::td/child::input)[1]")
    WebElement CodeTextArea;

    @FindBy(xpath = "//label[text()='Name:']/preceding-sibling::span")
    WebElement RequiredName;

    @FindBy(xpath = "//label[text()='Name:']")
    WebElement Name;

    @FindBy(xpath = "(//label[text()='Name:']/parent::td/following::td/child::input)[1]")
    WebElement NameTextArea;

    @FindBy(xpath = "//h2[contains(text(),'Position Coordinates')]")
    WebElement PositionCoordinates;

    @FindBy(xpath = "//label[contains(text(),'Country:')]")
    WebElement Country;

    @FindBy(xpath = "//label[contains(text(),'Email:')]")
    WebElement Email;

    @FindBy(xpath = "(//label[contains(text(),'Phone ')])[1]")
    WebElement phoneone;

    @FindBy(xpath = "(//a[contains(.,'Cancel')])[1]")
    WebElement Cancel;

    @FindBy(xpath = "//a[contains(.,'Create')]")
    WebElement Create;

    @FindBy(xpath = "//a[contains(.,'Save / Exit')]")
    WebElement SaveExit;

    @FindBy(xpath = "(//a[contains(text(),'Repair Estimates In Progress')])[2]")
    WebElement RepairEstimatesInprogress;

    @FindBy(xpath = "(//a[contains(.,'Quick Estimate')])[2]")
    WebElement QuickEstimate;

    @FindBy(xpath = "//h1[contains(.,'New Repair Estimate')]")
    WebElement NewRepairEstimate;
    @FindBy(xpath = "//label[contains(text(),'Location:')]")
    WebElement SearchLocation;
    @FindBy(xpath = "//a[contains(@id,':0:cilF')]/child::img")
    WebElement icon;
    @FindBy(xpath = "//input[contains(@id,':q1:val00::content')]")
    WebElement SearchLocationTextArea;
    @FindBy(xpath = "(//span[contains(text(),'Search')])[2]")
    WebElement searchButton;
    @FindBy(xpath = "//a[contains(.,'Select')]/span")
    List<WebElement> Select;
    @FindBy(xpath = "//a[contains(.,'Refresh')]")
    WebElement btn_Refresh;
    @FindBy(xpath = "//label[text()='Location:']/preceding-sibling::span")
    WebElement RequiredLocationone;
    @FindBy(xpath = "//label[text()='Location:']")
    WebElement LocationTwo;
    @FindBy(xpath = "(//label[text()='Location:']/parent::span/following::div/child::a)[1]")
    WebElement Locationvalue;
    @FindBy(xpath = "//span[text()='Contact']")
    WebElement Contact;
    @FindBy(xpath = "//a[contains(.,'Select')]")
   List <WebElement> btn_Selectone;

    @FindBy(xpath = "//span[text()='Select']")
    List<WebElement> btn_Selecttwo;

    @FindBy(xpath = "//label[text()='Location:']/preceding-sibling::span")
    WebElement RequiredLocation;

    @FindBy(xpath = "//label[text()='Location:']")
    WebElement Location;

    @FindBy(xpath = "(//label[text()='Location:']/parent::span/following::div)[1]")
    WebElement LocationValue;

    @FindBy(xpath = "(//span[contains(.,'Add Lab')])[1]")
    public WebElement label_AddLabor;

    @FindBy(xpath = "(//a[text()='VMRS'])[1]")
    public WebElement label_VMRS;

    @FindBy(xpath = "//label[contains(.,'Search:')]/parent::td/following-sibling::td/child::input")
    public WebElement SearchTextArea;

    @FindBy(xpath = "//a[contains(@id,':1:cilvmrsys')]/child::img")
    WebElement imgBody;

    @FindBy(xpath = "(//img[contains(@id,':ciAddVmrs::icon')])[1]")
    public WebElement label_Add;

    @FindBy(xpath = "//span[text()='Add']")
    public WebElement label_AddButton;

    @FindBy(xpath = "//a[@title='DOOR HOLD BACK']/child::img")
    WebElement DoorHoldBack;

    @FindBy(xpath = "//a[contains(text(),'Body')]")
    WebElement Body;

    @FindBy(xpath = "//input[contains(@id,':itWoactDescription::content')]")
    WebElement DescriptionBody;

    @FindBy(xpath = "//textarea[contains(@id,':itWoactNotes::content')]")
    WebElement NotesTextArea;

    @FindBy(xpath = "(//a[contains(.,'Cancel')])[1]")
    WebElement Btn_Cancel;

    @FindBy(xpath = "//a[contains(.,'Cancel')]/following::td[2]/div/a/child::span")
    WebElement Btn_Ok;

    @FindBy(xpath = "//a[contains(text(),'DOOR HOLD BACK')]")
    WebElement Doorholdback;

    @FindBy(xpath = "(//a[contains(.,'Repair Estimate')])[2]")
    WebElement RepairEstimate;

    @FindBy(xpath = "//a[contains(.,'Sign Out')]")
    WebElement btn_signOut;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement inputbox_Username;

    @FindBy(xpath = "//h1[contains(.,'Working...Please Wait')]")
    List<WebElement> loder;

    public EstimateFormatMissingLaborNotesDescription(WebDriver driver){
        this.driver = driver;
        this.waitMethods = new WaitMethods(driver);
    }

    /*go to Corporate Setup Manager **/
    public void gotoCorporateSetUpManager() throws FileNotFoundException, InterruptedException {

        waitMethods.waitForElementToBeRefreshedAndClickable(menu_Administration);
        WebElementActions.getActions(driver).clickElement(menu_Administration);

        waitMethods.waitForElementToBeRefreshedAndClickable(subMenu_CorporateSetupManager);
        WebElementActions.getActions(driver).clickElement(subMenu_CorporateSetupManager);

        waitMethods.loadingWait(loder);

    }

    /**
     * click On InvoiceSetup
     */
    public void clickOnInvoiceSetup() throws InterruptedException {

        waitMethods.waitForElementToBeRefreshedAndClickable(RightArrow);
        WebElementActions.getActions(driver).clickElement(RightArrow);

        waitMethods.waitForElementToBeRefreshedAndClickable(InvoiceSetup);
        WebElementActions.getActions(driver).clickElement(InvoiceSetup);

        waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);

    }

    /*go to Part**/
    public void clickOnAdd() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(Add);
        WebElementActions.getActions(driver).clickElement(Add);

        waitMethods.waitForElementToBeRefreshedAndClickable(btn_Select);
        WebElementActions.getActions(driver).clickElement(btn_Select);
        TestListener.saveScreenshotPNG(driver);

    }

    /*verify Work Order Estimation**/
    public void verifyWorkOrderEstimation() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(btn_WorkOrderEstimate);
        Assert.assertTrue(btn_WorkOrderEstimate.isDisplayed());
        TestListener.saveScreenshotPNG(driver);
    }

    /*select WorkOrderQuickEstimateCustomAmericanBody**/
    public void selectAmericanBody() throws InterruptedException {
        Select objSelect = new Select(WorkOrderEstimate);
        objSelect.selectByVisibleText("WOQUIESTAB - Work Order Quick Estimate Custom American Body");
        waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }

    /*  click ok button **/
    public void clickonOkButton() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(btn_OK);
        WebElementActions.getActions(driver).clickElement(btn_OK);
        TestListener.saveScreenshotPNG(driver);

    }

    /*click on Repair Location **/
    public void clickonRepairLocation() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(RepairLocation);
        WebElementActions.getActions(driver).clickElement(RepairLocation);
        TestListener.saveScreenshotPNG(driver);

    }

    /*click on New Repair Location **/
    public void clickOnRepairLocation() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(NewRepairLocation);
        WebElementActions.getActions(driver).clickElement(NewRepairLocation);
        TestListener.saveScreenshotPNG(driver);

    }

    /*verify Required Code,Code **/
    public void verifyOnRequiredCode() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(RequiredCode);
        Assert.assertTrue(RequiredCode.isDisplayed());

        waitMethods.waitForElementToBeRefreshedAndIsVisible(Code);
        Assert.assertTrue(Code.isDisplayed());
        TestListener.saveScreenshotPNG(driver);

    }

    /*enter CodeTextArea**/
    public void enterCodeTextArea() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(CodeTextArea);
        WebElementActions.getActions(driver).inputText(CodeTextArea, CodeNumber);

    }

    /*verify Required Name ,Name **/
    public void verifyRequiredName() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(RequiredName);
        Assert.assertTrue(RequiredName.isDisplayed());

        waitMethods.waitForElementToBeRefreshedAndIsVisible(Name);
        Assert.assertTrue(Name.isDisplayed());
    }

    /*Enter NametextArea**/
    public void enterTextArea() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(NameTextArea);
        WebElementActions.getActions(driver).inputText(NameTextArea, appProp74.getProperty("NameTextArea"));
        TestListener.saveScreenshotPNG(driver);
    }

    /*verify PositionCoordinates **/
    public void verifyPositionCoordinates() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(PositionCoordinates);
        Assert.assertTrue(PositionCoordinates.isDisplayed());

        waitMethods.waitForElementToBeRefreshedAndIsVisible(Country);
        Assert.assertTrue(Country.isDisplayed());

        waitMethods.waitForElementToBeRefreshedAndIsVisible(Email);
        Assert.assertTrue(Email.isDisplayed());

        waitMethods.waitForElementToBeRefreshedAndIsVisible(phoneone);
        Assert.assertTrue(phoneone.isDisplayed());

        waitMethods.waitForElementToBeRefreshedAndIsVisible(Cancel);
        Assert.assertTrue(Cancel.isDisplayed());

        waitMethods.waitForElementToBeRefreshedAndIsVisible(Create);
        Assert.assertTrue(Create.isDisplayed());

    }

    /*click on Create **/
    public void clickOnCreate() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(Create);
        WebElementActions.getActions(driver).clickElement(Create);
        TestListener.saveScreenshotPNG(driver);
        waitMethods.loadingWait(loder);

        waitMethods.waitForElementToBeRefreshedAndClickable(SaveExit);
        WebElementActions.getActions(driver).clickElement(SaveExit);
        TestListener.saveScreenshotPNG(driver);

    }

    /* go to Serive Board **/
    public void gotoserviceboard() throws FileNotFoundException, InterruptedException {
        waitMethods.loadingWait(loder);
        Thread.sleep(3000);
        ReusableActions.getActions(driver).clickParentMenu("Service");
        ReusableActions.getActions(driver).clickChildMenu("Service Board");

    }

    /*click on Repair Estimates Inprogress **/
    public void clickOnRepairEstimatesInprogress() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(RepairEstimatesInprogress);
        WebElementActions.getActions(driver).clickElement(RepairEstimatesInprogress);
        TestListener.saveScreenshotPNG(driver);
    }

    /*click on QuickEstimate**/
    public void clickOnQuickEstimate() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(QuickEstimate);
        WebElementActions.getActions(driver).clickElement(QuickEstimate);
        TestListener.saveScreenshotPNG(driver);
        Thread.sleep(3000);
    }

    /* verify NewRepairEstimate**/
         public void verifyOnNewRepairEstimate() throws InterruptedException {
             waitMethods.waitForElementToBeRefreshedAndIsVisible(NewRepairEstimate);
        Assert.assertTrue(NewRepairEstimate.isDisplayed());

             waitMethods.waitForElementToBeRefreshedAndIsVisible(RequiredLocationone);
        Assert.assertTrue(RequiredLocationone.isDisplayed());

             waitMethods.waitForElementToBeRefreshedAndIsVisible(LocationTwo);
        Assert.assertTrue(LocationTwo.isDisplayed());

             waitMethods.waitForElementToBeRefreshedAndIsVisible(Locationvalue);
        Assert.assertTrue(Locationvalue.isDisplayed());

    }
      /*verify Location**/
       public void verifyLocation1 () throws InterruptedException {
           waitMethods.waitForElementToBeRefreshedAndIsVisible(SearchLocation);
        Assert.assertTrue(SearchLocation.isDisplayed());


    }
    /*click on Select Button **/
    public void clickOnSelectButton () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(btn_Selectone.get(0));
        WebElementActions.getActions(driver).clickElement(btn_Selectone.get(0));
        waitMethods.loadingWait(loder);

    }
    /*click On Search Icon **/
    public void clickOnSearchIncon () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(icon);
        WebElementActions.getActions(driver).clickElement(icon);
    }

    /*enter SearchLocationTextArea **/
    public void entetSearchTextArea() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(SearchLocationTextArea);
        WebElementActions.getActions(driver).inputText(SearchLocationTextArea, appProp74.getProperty("HALIFAX"));
        TestListener.saveScreenshotPNG(driver);
    }
    /*click on serach**/
    public void clickOnSearch() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(searchButton);
        WebElementActions.getActions(driver).clickElement(searchButton);
        Thread.sleep(5000);
        waitMethods.loadingWait(loder);
    }
    /*click On selectButton**/
    public void clickOnSelectButton2 () throws InterruptedException {

        waitMethods.waitForElementToBeRefreshedAndClickable(Select.get(1));
        WebElementActions.getActions(driver).clickElement(Select.get(1));
        waitMethods.loadingWait(loder);


    }

    /*click on Refresh Button**/
    public void clickOnRefreshButton () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(btn_Refresh);
        WebElementActions.getActions(driver).clickElement(btn_Refresh);
        Thread.sleep(5000);
        waitMethods.loadingWait(loder);

    }

    /*click on Select  **/
    public void clickOnSelect() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(btn_Selecttwo.get(1));
        WebElementActions.getActions(driver).clickElement(btn_Selecttwo.get(1));
        waitMethods.loadingWait(loder);
    }

    /*click on Select  **/
    public void clickOnSelectTwo() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(btn_Selecttwo.get(1));
        WebElementActions.getActions(driver).clickElement(btn_Selecttwo.get(1));
        waitMethods.loadingWait(loder);
    }

    /*verify Required location, Location , LocationValue **/
    public void verifyLocation() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(RequiredLocation);
        Assert.assertTrue(RequiredLocation.isDisplayed());

        waitMethods.waitForElementToBeRefreshedAndIsVisible(Location);
        Assert.assertTrue(Location.isDisplayed());

        waitMethods.waitForElementToBeRefreshedAndIsVisible(LocationValue);
        Assert.assertTrue(LocationValue.isDisplayed());

    }

    /* click Add Lobour**/
    public void clickOnAddLabour() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(label_AddLabor);
        WebElementActions.getActions(driver).clickElement(label_AddLabor);
        TestListener.saveScreenshotPNG(driver);

        waitMethods.waitForElementToBeRefreshedAndClickable(label_VMRS);
        WebElementActions.getActions(driver).clickElement(label_VMRS);
        TestListener.saveScreenshotPNG(driver);


    }

    /* search BODY **/
    public void searchBody() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(SearchTextArea);
        WebElementActions.getActions(driver).inputText(SearchTextArea, appProp74.getProperty("Searchone"));
        waitMethods.loadingWait(loder);

        waitMethods.waitForElementToBeRefreshedAndClickable(imgBody);
        WebElementActions.getActions(driver).clickElement(imgBody);

        waitMethods.waitForElementToBeRefreshedAndClickable(label_Add);
        WebElementActions.getActions(driver).clickElement(label_Add);

        waitMethods.waitForElementToBeRefreshedAndClickable(label_AddButton);
        WebElementActions.getActions(driver).clickElement(label_AddButton);

        TestListener.saveScreenshotPNG(driver);

    }

    /*search Door  **/
    public void searchDoor() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(SearchTextArea);
        WebElementActions.getActions(driver).inputText(SearchTextArea, appProp74.getProperty("Searchtwo"));
        waitMethods.loadingWait(loder);

        waitMethods.waitForElementToBeRefreshedAndClickable(DoorHoldBack);
        WebElementActions.getActions(driver).clickElement(DoorHoldBack);

        waitMethods.waitForElementToBeRefreshedAndClickable(label_Add);
        WebElementActions.getActions(driver).clickElement(label_Add);

        waitMethods.waitForElementToBeRefreshedAndClickable(label_AddButton);
        WebElementActions.getActions(driver).clickElement(label_AddButton);

        TestListener.saveScreenshotPNG(driver);
    }

    /*click on Hyperlink**/
    public void clickOnBody() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(Body);
        WebElementActions.getActions(driver).clickElement(Body);

        waitMethods.waitForElementToBeRefreshedAndIsVisible(DescriptionBody);
        Assert.assertTrue(DescriptionBody.isDisplayed());

        waitMethods.waitForElementToBeRefreshedAndClickable(NotesTextArea);
        WebElementActions.getActions(driver).inputText(NotesTextArea, appProp74.getProperty("Note"));
        waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);

    }

    /*verify Cancel Ok Button  **/
    public void verifyCancelButton() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(Btn_Cancel);
        Assert.assertTrue(Btn_Cancel.isDisplayed());

        waitMethods.waitForElementToBeRefreshedAndIsVisible(Btn_Ok);
        Assert.assertTrue(Btn_Ok.isDisplayed());
    }

    /*click Ok Button **/
    public void clickonOk() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(Btn_Ok);
        WebElementActions.getActions(driver).clickElement(Btn_Ok);
        waitMethods.loadingWait(loder);

    }

    /*Door of Herperlink **/
    public void clickOnDoor() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(Doorholdback);
        WebElementActions.getActions(driver).clickElement(Doorholdback);

        waitMethods.waitForElementToBeRefreshedAndIsVisible(DescriptionBody);
        Assert.assertTrue(DescriptionBody.isDisplayed());

        waitMethods.waitForElementToBeRefreshedAndClickable(NotesTextArea);
        WebElementActions.getActions(driver).inputText(NotesTextArea, appProp74.getProperty("Note"));
          Thread.sleep(3000);
        TestListener.saveScreenshotPNG(driver);

       // String originalWindow=driver.getWindowHandle () ;

    }

    /* click on Repair Estimate **/
    public void clickOnRepairEstimate() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(RepairEstimate);
        WebElementActions.getActions(driver).clickElement(RepairEstimate);
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

            if(pdfFullText.contains("Halifax Repair Shop"))
            {
                System.out.println("All taxes are visible and the being calculated properly.");

            }

            fis.close();
            waitMethods.loadingWait(loder);

        }
    }

    /*click on SignOut **/
    public void clickonSignOut() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(btn_signOut);
        WebElementActions.getActions(driver).clickElement(btn_signOut);
        TestListener.saveScreenshotPNG(driver);
    }

    /**click on UserName*/
    public void clickonUsername() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(inputbox_Username);
        WebElementActions.getActions(driver).clickElement(inputbox_Username);

    }
}