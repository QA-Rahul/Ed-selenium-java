 package pages.Estimate;

import actions.LoginActions;
import org.openqa.selenium.WebDriver;
import tests.TestDriverActions;
import org.openqa.selenium.JavascriptExecutor;
import tests.TestDriverActions;
import actions.ReusableActions;
import actions.WaitActions;
import actions.WebElementActions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import tests.TestDriverActions;
import utils.TestListener;
import utils.WaitMethods;

import java.io.FileNotFoundException;
import java.util.List;

//import static actions.WaitActions.waitForElementToBeRefreshedAndClickable;

public class SubmitAnEstimateServiceManager extends TestDriverActions {
    @FindBy(xpath = "//a[contains(text(),'Service Board')]")
    public WebElement label_ServiceBoard;
    @FindBy(xpath = "(//span[text()='Estimate'])[1]")
    public WebElement label_ScrollBar;
    @FindBy(xpath = "//img[contains(@id,':0:ctbNewEstimate::icon')]")
    public WebElement icon_Plus;
    @FindBy(xpath = "//span[contains(.,'Yes')]")
    public WebElement btn_Yes;

    @FindBy(xpath = "//div[contains(@id,':0:phRE::content')]//div[6]//div[2]")
    public WebElement label_EstimateNumber;

    @FindBy(xpath = "//label[text()='Location:']//preceding-sibling::span")
    public WebElement label_RequiredLocation;

    @FindBy(xpath = "//label[text()='Location:']")
    public WebElement label_Locaion;

    @FindBy(xpath = "//a[contains(@id,'clFacName')]")
    public WebElement label_ThemeTwo;

    @FindBy(xpath = "//label[contains(text(),'Owner:')]")
    public WebElement label_Owner;

    @FindBy(xpath = "//table[contains(@id,':rRE:0:ci1:')]")
    public WebElement label_OwnerName;

    @FindBy(xpath = "//label[text()='Unit #:']")
    public WebElement label_Unit;

    @FindBy(xpath = "(//div[contains(@id,':0:phRE::content')]//div[3]//div[2])[1]")
    public WebElement label_UnitValue;

    @FindBy(xpath = "//label[text()='Year:']")
    public WebElement label_Year;

    @FindBy(xpath = "(//div[contains(@id,':0:phRE::content')]//div[3]//div[2])[1]")
    public WebElement label_YearValue;

    @FindBy(xpath = "//label[text()='Make & Model:']")
    public WebElement label_MakeAndModel;

    @FindBy(xpath = "//div[contains(@id,':0:phRE::content')]//div[5]//div[2]")
    public WebElement label_MakeandModelValue;

    @FindBy(xpath = "//label[text()='Notes:']")
    public WebElement label_Notes;

    @FindBy(xpath = "//textarea[contains(@id,'itEstuniNotes::content')]")
    public WebElement label_NoteTextArea;

    @FindBy(xpath = "//label[text()='Date:']/preceding-sibling::span")
    public WebElement label_ReqiredDate;

    @FindBy(xpath = "//label[text()='Date:']")
    public WebElement label_Date;

    @FindBy(xpath = "//span[contains(@id,'idEstimateDateStz::content')]")
    public WebElement label_TODate;

    @FindBy(xpath = "(//label[text()='Internal Ref#:'])[1]")
    public WebElement label_InternalRef;

    @FindBy(xpath = "//input[contains(@id,'it12::content')]")
    public WebElement label_InternalRefTextArea;

    @FindBy(xpath = "(//label[text()='Internal Notes:'])[1]")
    public WebElement label_InternalNotes;

    @FindBy(xpath = "//textarea[contains(@id,':0:it1::content')]")
    public WebElement label_InternalNotesTextArea;

    @FindBy(xpath = "//a[contains(.,'(0)')]")
    public WebElement label_ZeroImg;

    @FindBy(xpath = "//img[contains(@id,':0:cbPEST::icon')]//following-sibling::span")
    public WebElement label_RepairEstimate;

    @FindBy(xpath = "//label[contains(.,'Lab')]")
    public WebElement label_Labour;

    @FindBy(xpath = "//table[contains(@id,'E:0:pgl9')]")
    public WebElement label_LabourValue;

    @FindBy(xpath = "//label[text()='Parts:']")
    public WebElement label_Parts;

    @FindBy(xpath = "//table[contains(@id,':0:pgl7')]")
    public WebElement label_PartsValue;

    @FindBy(xpath = "//label[text()='Shop Charges:']")
    public WebElement label_ShopCharges;

    @FindBy(xpath = "(//table[contains(@id,':0:pgl11')])[2]")
    public WebElement label_ShopChargesValue;

    @FindBy(xpath = "//label[text()='Surcharge:']")
    public WebElement label_Surcharges;

    @FindBy(xpath = "//table[contains(@id,':0:pgl17')]")
    public WebElement label_SuchargesValue;

    @FindBy(xpath = "//label[text()='Sub Total:']")
    public WebElement txt_SubTotal;

    @FindBy(xpath = "(//table[contains(@id,':0:pgl10')])[1]")
    public WebElement label_SubTotalValue;

    @FindBy(xpath = "//label[text()='Tax:']")
    public WebElement label_Tax;

    @FindBy(xpath = "//table[contains(@id,':0:pgl18')]")
    public WebElement label_TaxValue;

    @FindBy(xpath = "//label[text()='Total:']")
    public WebElement label_Total;
    @FindBy(xpath = "//table[contains(@id,':0:pgl21')]")
    public WebElement label_TotalValue;

    @FindBy(xpath = "//h2[contains(.,'Lab')]")
    public WebElement label_Labor;

    @FindBy(xpath = "//img[contains(@id,'ctbAddLabor::icon')]")
    public WebElement label_AddLabor;

    @FindBy(xpath = "(//span[text()='#'])[1]")
    public WebElement label_Hash;

    @FindBy(xpath = "//span[text()='Description']")
    public WebElement label_Description;

    @FindBy(xpath = "//span[text()='Estimated Hours']")
    public WebElement label_EstimatedHours;

    @FindBy(xpath = "//span[text()='Hourly Charge']")
    public WebElement label_HourlyCharge;

    @FindBy(xpath = "(//span[text()='Total Charge'])[1]")
    public WebElement label_TotalCharge;

    @FindBy(xpath = "//th[contains(@id,'tEstact:c11')]/div")
    public WebElement label_Element;

    @FindBy(xpath = "//th[contains(@id,'tEstact:cActDelete')]/div")
    public WebElement label_Delete;

    @FindBy(xpath = "//div[contains(@id,'tEstact::db')]")
    public WebElement label_NoDataDisplay;

    @FindBy(xpath = "//span[text()='Add Parts']")
    public WebElement label_AddParts;

    @FindBy(xpath = "//th[contains(@id,'tEstpar:c5')]/div")
    public WebElement label_HashTwo;

    @FindBy(xpath = "//span[text()='Part #']")
    public WebElement label_Part2;

    @FindBy(xpath = "//span[text()='Core']")
    public WebElement label_Core;

    @FindBy(xpath = "//span[text()='Estimated Quantity']")
    public WebElement label_EstimatedQuantity;

    @FindBy(xpath = "//span[text()='Unit Charge']")
    public WebElement label_UnitCharge;

    @FindBy(xpath = "//th[contains(@id,'ctEstparTotalChargeCurrency')]/div")
    public WebElement label_TotalChargeTwo;

    @FindBy(xpath = "//th[contains(@id,'tEstpar:c1')]/div")
    public WebElement label_IMG;

    @FindBy(xpath = "//th[contains(@id,'tEstpar:ctEstparDelete')]/div")
    public WebElement label_DeleteTwo;

    @FindBy(xpath = "//textarea[contains(@id,'itEstuniNotes::content')]")
    public WebElement label_ExternalNotes;

    @FindBy(xpath = "//span[contains(.,'Add Lab')]")
    public WebElement btn_AddLabour;

    @FindBy(xpath = "(//a[text()='VMRS'])[1]")
    public WebElement label_VMRS;

    @FindBy(xpath = "//a[contains(@id,'cilvmrsys')]/img")
    public WebElement label_AcessoriesGroup;

    @FindBy(xpath = "//a[contains(@id,'ciAddVmrs')]/img")
    public WebElement label_AddVmrs;

    @FindBy(xpath = "(//td/span/span)[1]")
    public WebElement label_LaborItem;

    @FindBy(xpath = "//img[contains(@id,':0:ciAddVmrs::icon')]")
    public WebElement label_Plusimg;


    @FindBy(xpath = "//textarea[contains(@id,'itComplaint::content')]")
    public WebElement label_EstimateNote;

    @FindBy(xpath = "//div[contains(@id,'ctbOk')]/a/span")
    public WebElement label_OkButton;

    @FindBy(xpath = "//a[contains(@id,'ciDAct1')]/img")
    public WebElement label_Deleteimg;

    @FindBy(xpath = "//a[contains(@id,'trashButtonActId:dc_cil1')]/img")
    public WebElement label_Trashimg;

    @FindBy(xpath = "//div[contains(@id,'tEstact::db')]")
    public WebElement label_NoDataToDisplay;

    @FindBy(xpath = "//div[contains(@id,'ctbAddParts')]/a/span")
    public WebElement label_AddPart;

    @FindBy(xpath = "//input[contains(@id,'itSearchPartSelect::content')]")
    public WebElement label_PartNumber;

    @FindBy(xpath = "//li[contains(@class,'AFAutoSuggestItem')]")
    WebElement list_PartName;

   @FindBy(xpath = "//li[contains(@class,'AFAutoSuggestItem')]")
    public WebElement label_PartName;

    @FindBy(xpath = "//span[text()='Add Part']")
    public WebElement label_Part;

    @FindBy(xpath = "//div[contains(@id,'cbIssuePart')]/a/span")
    public WebElement label_IssueButton;

    @FindBy(xpath = "//span[contains(.,'Close')]")
    public WebElement btn_close;

    @FindBy(xpath = "//td[contains(@id,'c2')]/span/span")
    public WebElement label_LaborCost;

    @FindBy(xpath = "//table[contains(@id,'pgl9')]/tbody/tr/td[2]")
    public WebElement label_LaborCostHeader;

    @FindBy(xpath = "//td[contains(@id,'ctEstparTotalChargeCurrency')]/span/span")
    public WebElement label_PartCost;

    @FindBy(xpath = "//table[contains(@id,'pgl7')]/tbody/tr/td[2]")
    public WebElement label_PartCostHeader;

    @FindBy(xpath = "//table[contains(@id,'pgl11')]/tbody/tr/td[2]")
    public WebElement label_SHopChargesHeader;

    @FindBy(xpath = "//div[3]/div/div[6]/table/tbody/tr/td[2]")
    public WebElement label_TotalHeader;

    @FindBy(xpath = "//span[text()='Submit']")
    public WebElement btn_Submit;
    @FindBy(xpath = "(//table[contains(@id,'pgles01')]/tbody/tr/td[3])[1]")
    public WebElement label_PendingApprovals;

    @FindBy(xpath = "(//span[contains(@id,'si1')]/following::td)[4]")
    public  WebElement btn_signOut;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement inputbox_Username;

    @FindBy(xpath = "//h1[text()='Working...Please Wait']")
    List<WebElement> loder;

    @FindBy(xpath = "//a[text()='Service']")
    WebElement Service;

    @FindBy(xpath = "//td[text()='Service Board']")
    WebElement ServiceBoard;

    @FindBy(xpath = "(//td[text()='Service Board'])[2]")
    WebElement ServiceBoard_EC;

    @FindBy(xpath ="//div[contains(@id,'cbIssuePart')]/a/span")
    WebElement btn_addPart;

    public SubmitAnEstimateServiceManager(WebDriver driver){
        this.driver = driver;
        this.waitMethods = new WaitMethods(driver);
        this.webElementActions = new WebElementActions(driver);
    }



    /**goto Service Borad*/

     public  void gotoServiceBoardScreen() throws FileNotFoundException, InterruptedException {
//        ReusableActions.getActions().clickParentMenu("Service");
//        ReusableActions.getActions().clickChildMenu("Service Board");

         waitMethods.waitForElementToBeRefreshedAndClickable(Service);
         WebElementActions.getActions(driver).clickElement(Service);
          Thread.sleep(3000);
         if(LoginActions.environmentName.contains("NA")){
             waitMethods.waitForElementToBeRefreshedAndClickable(ServiceBoard);
             WebElementActions.getActions(driver).clickElement(ServiceBoard);
         }
        else if(LoginActions.environmentName.contains("EC")){
             waitMethods.waitForElementToBeRefreshedAndClickable(ServiceBoard_EC);
             WebElementActions.getActions(driver).clickElement(ServiceBoard_EC);
         }


         TestListener.saveScreenshotPNG(driver);
    }
    /**Scroll Horizontal */
     public void scrollElementTillView () throws InterruptedException {

        Thread.sleep(5000);
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView();",label_ScrollBar);
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0, -700)");
         waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);

    }
    /**click On Estimate*/
     public void clickOnEstimate () throws InterruptedException {

         waitMethods.waitForElementToBeRefreshedAndClickable(icon_Plus);
        WebElementActions.getActions(driver).clickElement(icon_Plus);

         waitMethods.loadingWait(loder);
//        TestListener.saveScreenshotPNG(driver);

    }
    /**clickOnYes*/
     public void clickOnYes () throws InterruptedException {

         waitMethods.waitForElementToBeRefreshedAndClickable(btn_Yes);
        WebElementActions.getActions(driver).clickElement(btn_Yes);
        TestListener.saveScreenshotPNG(driver);
    }
    /**StoreEstimateNumber */
     public void storeEstimateNumber () throws InterruptedException {

         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_EstimateNumber);
        Assert.assertTrue(label_EstimateNumber.isDisplayed());
    }
    /**verify RequiredLocation, Location ,Location Value */
     public void RequiredLocation () throws InterruptedException {
         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_RequiredLocation);
        Assert.assertTrue(label_RequiredLocation.isDisplayed());

         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_Locaion);
        Assert.assertTrue(label_Locaion.isDisplayed());

         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_ThemeTwo);
        Assert.assertTrue(label_ThemeTwo.isDisplayed());
        TestListener.saveScreenshotPNG(driver);
    }
    /**verify Owner And OwnerName*/
     public void verifyOwner () throws InterruptedException {

         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_Owner);
        Assert.assertTrue(label_Owner.isDisplayed());

         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_OwnerName);
        Assert.assertTrue(label_OwnerName.isDisplayed());
        TestListener.saveScreenshotPNG(driver);
    }
    /**verify Unit#,Unit Number */
     public void verifyUnitHash () throws InterruptedException {
         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_Unit);
        Assert.assertTrue(label_Unit.isDisplayed());

         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_UnitValue);
        Assert.assertTrue(label_UnitValue.isDisplayed());
        TestListener.saveScreenshotPNG(driver);
    }
    /**verify Year ,Yearvalue*/
     public void verifyYear () throws InterruptedException {

         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_Year);
        Assert.assertTrue(label_Year.isDisplayed());

         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_YearValue);
        Assert.assertTrue(label_YearValue.isDisplayed());
        TestListener.saveScreenshotPNG(driver);
    }
    /**verify Make&Model ,Make&Model value */
     public void verifyMakeandModel () throws InterruptedException {

         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_MakeAndModel);
        Assert.assertTrue(label_MakeAndModel.isDisplayed());

         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_MakeandModelValue);
        Assert.assertTrue(label_MakeandModelValue.isDisplayed());
        TestListener.saveScreenshotPNG(driver);
    }
    /**verify Notes ,NoteTextArea*/
     public void verifyNotes () throws InterruptedException {

         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_Notes);
        Assert.assertTrue(label_Notes.isDisplayed());


         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_NoteTextArea);
        Assert.assertTrue(label_NoteTextArea.isDisplayed());
        TestListener.saveScreenshotPNG(driver);
    }
    /**verify ReqiredDate, Date,Todays Date */
     public void verifyRequiredDate () throws InterruptedException {

         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_ReqiredDate);
        Assert.assertTrue(label_ReqiredDate.isDisplayed());


         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_Date);
        Assert.assertTrue(label_Date.isDisplayed());


         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_TODate);
        System.out.println("Todays date is :"+ReusableActions.todaysdate());
        Assert.assertTrue(label_TODate.isDisplayed());
        TestListener.saveScreenshotPNG(driver);
    }
    /**verify InternalRef#, Internal RefValue */
     public void verifyInternalRef () throws InterruptedException {

         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_InternalRef);
        Assert.assertTrue(label_InternalRef.isDisplayed());


         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_InternalRefTextArea);
        Assert.assertTrue(label_InternalRefTextArea.isDisplayed());

        TestListener.saveScreenshotPNG(driver);
    }
    /** verify InternalNotes ,InternalNotes TestArea */
     public void verifyInternalNotes () throws InterruptedException {

         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_InternalNotes);
        Assert.assertTrue(label_InternalNotes.isDisplayed());

         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_InternalNotesTextArea);
        Assert.assertTrue(label_InternalNotesTextArea.isDisplayed());
        TestListener.saveScreenshotPNG(driver);
    }
    /**verify image (0)*/
     public void  verifyzero() throws InterruptedException {

         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_ZeroImg);
        Assert.assertTrue(label_ZeroImg.isDisplayed());
    }
    /**verify Repair Estimate */
     public void verifyRepairEstimate () throws InterruptedException {
         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_RepairEstimate);
        Assert.assertTrue(label_RepairEstimate.isDisplayed());
        TestListener.saveScreenshotPNG(driver);

    }
    /**verify Labor ,LaborValue */
     public void verifyLabor () throws InterruptedException {

         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_Labour);
        Assert.assertTrue(label_Labour.isDisplayed());

         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_LabourValue);
        Assert.assertTrue(label_LabourValue.isDisplayed());
    }
    /** verify Part ,PartValue*/
     public void verifyPart () throws InterruptedException {

         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_Parts);
        Assert.assertTrue(label_Parts.isDisplayed());

         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_PartsValue);
        Assert.assertTrue(label_PartsValue.isDisplayed());
        TestListener.saveScreenshotPNG(driver);
    }
    /**verify Shop Charges:, Shop ChargesValue */
     public void verifyShopCharges () throws InterruptedException {

         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_ShopCharges);
        Assert.assertTrue(label_ShopCharges.isDisplayed());

         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_ShopChargesValue);
        Assert.assertTrue(label_ShopChargesValue.isDisplayed());

        TestListener.saveScreenshotPNG(driver);
    }
    /**verify Surcharge: and SurchargeValue */
     public void verifySurcharge () throws InterruptedException {
         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_Surcharges);
        Assert.assertTrue(label_Surcharges.isDisplayed());

         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_SuchargesValue);
        Assert.assertTrue(label_SuchargesValue.isDisplayed());
    }
    /**verify SubTotal ,SubTotal Value */
     public void verifysubTotal () throws InterruptedException {

         waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_SubTotal);
        Assert.assertTrue(txt_SubTotal.isDisplayed());

         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_SubTotalValue);
        Assert.assertTrue(label_SubTotalValue.isDisplayed());
    }
    /**verify Tax ,TaxValue */
     public void verifyTax () throws InterruptedException {

         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_Tax);
        Assert.assertTrue(label_Tax.isDisplayed());

         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_TaxValue);
        Assert.assertTrue(label_TaxValue.isDisplayed());
        TestListener.saveScreenshotPNG(driver);

    }
    /**verify Total ,TotalValue */
     public void  verifyTotal () throws InterruptedException {

         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_Total);
        Assert.assertTrue(label_Total.isDisplayed());

         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_TotalValue);
        Assert.assertTrue(label_TotalValue.isDisplayed());
    }
    /**verify Labour ,Add Labour */
     public void verifyLabour () throws InterruptedException {

         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_Labor);
        Assert.assertTrue(label_Labor.isDisplayed());

         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_AddLabor);
        Assert.assertTrue(label_AddLabor.isDisplayed());

    }
    /**verify # */
     public void verifyHash () throws InterruptedException {

         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_Hash);
        Assert.assertTrue(label_Hash.isDisplayed());
    }
    /**verify Description */
    public void verifyDescription () throws InterruptedException {

        waitMethods.waitForElementToBeRefreshedAndIsVisible(label_Description);
        Assert.assertTrue(label_Description.isDisplayed());
    }
    /**verify EstimatedHours */
     public void verifyEstimatedHours () throws InterruptedException {

         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_EstimatedHours);
        Assert.assertTrue(label_EstimatedHours.isDisplayed());
    }
    /**verify HourlyCharge */
     public void verifyHourlyCharge () throws InterruptedException {

         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_HourlyCharge);
        Assert.assertTrue(label_HourlyCharge.isDisplayed());
    }
    /**verify Total Charge  */
     public void verifyTotalCharge () throws InterruptedException {

         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_TotalCharge);
        Assert.assertTrue(label_TotalCharge.isDisplayed());
    }
    /**verify Element,verify Delete */
     public void verifyElement () throws InterruptedException {

         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_Element);
        Assert.assertTrue(label_Element.isDisplayed());

         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_Delete);
        Assert.assertTrue(label_Delete.isDisplayed());

        TestListener.saveScreenshotPNG(driver);
    }
    /**verify No Data Display */
     public void verifyNoDataDisplay () throws InterruptedException {

         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_NoDataDisplay);
        Assert.assertTrue(label_NoDataDisplay.isDisplayed());
        TestListener.saveScreenshotPNG(driver);

    }
    /**verify Add Parts */
     public void verifyAddParts () throws InterruptedException {

         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_AddParts);
        Assert.assertTrue(label_AddParts.isDisplayed());

    }
    /**verify #,Part#,Core */
     public void verifyHashTwo () throws InterruptedException {
         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_HashTwo);
        Assert.assertTrue(label_HashTwo.isDisplayed());

         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_Part2);
        Assert.assertTrue(label_Part2.isDisplayed());

         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_Core);
        Assert.assertTrue(label_Core.isDisplayed());

        TestListener.saveScreenshotPNG(driver);
    }
    /**verify EstimatedQuantity */
     public void verifyEstimatedQuantity () throws InterruptedException {
         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_EstimatedQuantity);
        Assert.assertTrue(label_EstimatedQuantity.isDisplayed());
    }
    /**verify Unit Charges */
     public void verifiyUnitCharges () throws InterruptedException {

         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_UnitCharge);
        Assert.assertTrue(label_UnitCharge.isDisplayed());

    }
    /**verify Total Charge  */
     public void verifyTotalChargeTwo () throws InterruptedException {
         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_TotalChargeTwo);
        Assert.assertTrue(label_TotalChargeTwo.isDisplayed());

    }
    /**verify Delete Img */
     public void verifyDeleteImg () throws InterruptedException {

         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_IMG);
        Assert.assertTrue(label_IMG.isDisplayed());
    }

    /**verify DeleteTwo*/
     public void verifyDeleteTwo () throws InterruptedException {
         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_DeleteTwo);
        Assert.assertTrue(label_DeleteTwo.isDisplayed());
        TestListener.saveScreenshotPNG(driver);
    }

    /** type External Notes  */
     public void ExternalNotes () throws InterruptedException {

         if (LoginActions.environmentName.contains("EC")) {
             waitMethods.waitForElementToBeRefreshedAndClickable(label_ExternalNotes);
             WebElementActions.getActions(driver).inputText(label_ExternalNotes, appProp8.getProperty("ExternalNotes"));
         } else if (LoginActions.environmentName.contains("EU")) {
             waitMethods.waitForElementToBeRefreshedAndClickable(label_ExternalNotes);
             WebElementActions.getActions(driver).inputText(label_ExternalNotes, appProp21.getProperty("ExternalNotes"));
         } else if (LoginActions.environmentName.contains("NA")) {
             waitMethods.waitForElementToBeRefreshedAndClickable(label_ExternalNotes);
             WebElementActions.getActions(driver).inputText(label_ExternalNotes, appProp36.getProperty("ExternalNotes"));
         } else if (LoginActions.environmentName.contains("QA")) {
             waitMethods.waitForElementToBeRefreshedAndClickable(label_ExternalNotes);
             WebElementActions.getActions(driver).inputText(label_ExternalNotes, appProp.getProperty("ExternalNotes"));
         }
     }

    /**click On Add Labour*/
     public void clickonAddLabour () throws InterruptedException {
         waitMethods.waitForElementToBeRefreshedAndClickable(btn_AddLabour);
        WebElementActions.getActions(driver).clickElement(btn_AddLabour);
         waitMethods.loadingWait(loder);
    }
    /**click on VMRS*/
     public void clickOnVMRS () throws InterruptedException {

         waitMethods.waitForElementToBeRefreshedAndClickable(label_VMRS);
        WebElementActions.getActions(driver).clickElement(label_VMRS);
         waitMethods.loadingWait(loder);

    }
    /**click On AcessoriesGroup */
     public void clickonAcessoriesGroup() throws InterruptedException {
         waitMethods.waitForElementToBeRefreshedAndClickable(label_AcessoriesGroup);
        WebElementActions.getActions(driver).clickElement(label_AcessoriesGroup);
        TestListener.saveScreenshotPNG(driver);
    }
    public void clickOnAddVmrs () throws InterruptedException {

        waitMethods.waitForElementToBeRefreshedAndClickable(label_AddVmrs);
        WebElementActions.getActions(driver).clickElement(label_AddVmrs);
        TestListener.saveScreenshotPNG(driver);
    }

    /**store LaborItem */
     public void verifyLaborItem () throws InterruptedException {

         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_LaborItem);
        Assert.assertTrue(label_LaborItem.isDisplayed());

    }
    /** click On Plus image  */
     public void clickOnPlusImg() throws InterruptedException {
         waitMethods.waitForElementToBeRefreshedAndClickable(label_Plusimg);
        WebElementActions.getActions(driver).clickElement(label_Plusimg);
         waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);

    }
    /**type Estimate Note */
     public void typeEstimateNote () throws InterruptedException {

         if (LoginActions.environmentName.contains("EC")) {
             waitMethods.waitForElementToBeRefreshedAndClickable(label_EstimateNote);
             WebElementActions.getActions(driver).inputText(label_EstimateNote,appProp8.getProperty("ExternalNotes"));
         } else if (LoginActions.environmentName.contains("EU")) {
             waitMethods.waitForElementToBeRefreshedAndClickable(label_EstimateNote);
             WebElementActions.getActions(driver).inputText(label_EstimateNote,appProp21.getProperty("ExternalNotes"));
         } else if (LoginActions.environmentName.contains("NA")) {
             waitMethods.waitForElementToBeRefreshedAndClickable(label_EstimateNote);
             WebElementActions.getActions(driver).inputText(label_EstimateNote,appProp36.getProperty("ExternalNotes"));
         } else if (LoginActions.environmentName.contains("QA")) {
             waitMethods.waitForElementToBeRefreshedAndClickable(label_EstimateNote);
             WebElementActions.getActions(driver).inputText(label_EstimateNote,appProp.getProperty("ExternalNotes"));
         }
         waitMethods.loadingWait(loder);

    }
    /** click On OK Button */
     public void clickOnOkButton () throws InterruptedException {
         waitMethods.waitForElementToBeRefreshedAndClickable(label_OkButton);
        WebElementActions.getActions(driver).clickElement(label_OkButton);
         waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**click On Delete Button */
     public void clickOnDeleteIcon () throws InterruptedException {

         waitMethods.waitForElementToBeRefreshedAndClickable(label_Deleteimg);
        WebElementActions.getActions(driver).clickElement(label_Deleteimg);
    }
    /**clickOnTrashButton */
     public void clickOnTrashButton () throws InterruptedException {
         waitMethods.waitForElementToBeRefreshedAndClickable(label_Trashimg);
        WebElementActions.getActions(driver).clickElement(label_Trashimg);
         waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);

    }
    /**verify No Data to Display */
     public void verifyNoDataToDisplay () throws InterruptedException {
         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_NoDataToDisplay);
        Assert.assertTrue(label_NoDataToDisplay.isDisplayed());
    }
    /**click On Add Parts */
     public void clickOnAddParts () throws InterruptedException {
         waitMethods.waitForElementToBeRefreshedAndClickable(label_AddPart);
        WebElementActions.getActions(driver).clickElement(label_AddPart);
         waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**type Part Number */
     public void typePartNumber () throws InterruptedException {

         if (LoginActions.environmentName.contains("EC")) {
             waitMethods.waitForElementToBeRefreshedAndClickable(label_PartNumber);
             WebElementActions.getActions(driver).inputText(label_PartNumber, appProp8.getProperty("PartNumber"));
         } else if (LoginActions.environmentName.contains("EU")) {
             waitMethods.waitForElementToBeRefreshedAndClickable(label_PartNumber);
             WebElementActions.getActions(driver).inputText(label_PartNumber, appProp21.getProperty("PartNumber"));
         } else if (LoginActions.environmentName.contains("NA")) {
             waitMethods.waitForElementToBeRefreshedAndClickable(label_PartNumber);
             WebElementActions.getActions(driver).inputText(label_PartNumber, appProp36.getProperty("PartNumber"));
         } else if (LoginActions.environmentName.contains("QA")) {
             waitMethods.waitForElementToBeRefreshedAndClickable(label_PartNumber);
             WebElementActions.getActions(driver).inputText(label_PartNumber, appProp.getProperty("PartNumber"));
         }

         Thread.sleep(3000);
         WebElementActions.getActions(driver).clickElement(list_PartName);

         waitMethods.loadingWait(loder);
            TestListener.saveScreenshotPNG(driver);
        }

    /**click On part */
     public void  clickOnPart () throws InterruptedException {

         waitMethods.waitForElementToBeRefreshedAndClickable(label_PartName);
        Thread.sleep(3000);
        WebElementActions.getActions(driver).clickElement(label_PartName);
         waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);


    }
    /**clickOnIssueButton*/
     public void clickOnIssueButton () throws InterruptedException {
         waitMethods.waitForElementToBeRefreshedAndClickable(label_IssueButton);
        WebElementActions.getActions(driver).clickElement(label_IssueButton);
         waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**click On Add Part Button*/
    public void clickOnAddPartButton () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(btn_addPart);
        WebElementActions.getActions(driver).clickElement(btn_addPart);
        waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }


    /**click On Close */
     public void clickOnClose () throws InterruptedException {
         waitMethods.waitForElementToBeRefreshedAndClickable(btn_close);
        WebElementActions.getActions(driver).clickElement(btn_close);
         waitMethods.loadingWait(loder);
    }
    /**store text*/
     public void  storeLaborCost () throws InterruptedException {
         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_LaborCost);
        Assert.assertTrue(label_LaborCost.isDisplayed());

    }
    /**store LaborCost Header*/
     public void storeLaborCostHeader () throws InterruptedException {

         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_LaborCostHeader);
        Assert.assertTrue(label_LaborCostHeader.isDisplayed());

         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_LaborCostHeader);
        Assert.assertTrue(label_LaborCostHeader.isDisplayed());
        TestListener.saveScreenshotPNG(driver);
    }
    /**storePart text,Part cost Header */
     public void storeparttext () throws InterruptedException {

         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_PartCost);
        Assert.assertTrue(label_PartCost.isDisplayed());

         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_PartCostHeader);
        Assert.assertTrue(label_PartCostHeader.isDisplayed());

         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_PartCostHeader);
        Assert.assertTrue(label_PartCostHeader.isDisplayed());
        TestListener.saveScreenshotPNG(driver);

    }
    /**Store ShopCharges Header*/
     public void storeshopchargesheader () throws InterruptedException {

         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_SHopChargesHeader);
        Assert.assertTrue(label_SHopChargesHeader.isDisplayed());
         waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**Store Total Charges Header*/
     public void TotalChargesHeader () throws InterruptedException {

         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_TotalHeader);
        Assert.assertTrue(label_TotalHeader.isDisplayed());
        String originalWindow=driver.getWindowHandle () ;
        TestListener.saveScreenshotPNG(driver);

    }
    /**click On Submit */
     public void clickOnSubmit () throws InterruptedException {

         waitMethods.waitForElementToBeRefreshedAndClickable(btn_Submit);
        WebElementActions.getActions(driver).clickElement(btn_Submit);
        String originalWindow=driver.getWindowHandle () ;
        TestListener.saveScreenshotPNG(driver);
    }
    /**verify Pending Approvals*/
     public void verifyPendingApprovals () throws InterruptedException {

        Thread.sleep(5000);
        JavascriptExecutor js = (JavascriptExecutor)driver;
         js.executeScript("arguments[0].scrollIntoView();",label_PendingApprovals);
       ((JavascriptExecutor) driver).executeScript("window.scrollBy(0, -1000)");
 /*        waitMethods.loadingWait(loder);
        Thread.sleep(3000);
        WebElementActions.getActions(driver).moveOnTargetElement(btn_estimate);
        Thread.sleep(1000); */
         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_PendingApprovals);
        Assert.assertTrue(label_PendingApprovals.isDisplayed());
        TestListener.saveScreenshotPNG(driver);


    }
    /** click On Sign Out*/
     public void  clikOnSignOut () throws InterruptedException {

         waitMethods.waitForElementToBeRefreshedAndClickable(btn_signOut);
        WebElementActions.getActions(driver).clickElement(btn_signOut);
        TestListener.saveScreenshotPNG(driver);
    }
    /**click on USername Testarea*/
     public void clickUsername () throws InterruptedException {

         waitMethods.waitForElementToBeRefreshedAndClickable(inputbox_Username);
        WebElementActions.getActions(driver).clickElement(inputbox_Username);
        TestListener.saveScreenshotPNG(driver);
    }

}
