package pages.Ticket;

import actions.ReusableActions;
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
import java.io.IOException;
import java.util.List;

public class RepairOrderReportUnitOwnerSpacing extends TestDriverActions {


    @FindBy(xpath = "//a[text()='Service']")
    WebElement menu_Service;
    @FindBy(xpath = "//td[text()='Complete RO']")
    WebElement subMenu_CompleteRO;
    @FindBy(xpath = "//span[text()='Complete RO']")
    WebElement title_CompleteRO;
    @FindBy(xpath = "//table[contains(@id,'itSearchFacilitySelect')]/descendant::label")
    WebElement txt_Location;
    @FindBy(xpath = "//input[contains(@id,'itSearchFacilitySelect::content')]")
    WebElement txtbox_Location;
    @FindBy(xpath = "//h1[text()='Ready to Submit']")
    WebElement title_ReadyToSubmit;
    @FindBy(xpath = "//div[contains(@id,'sfRM:ctbNRB')]/descendant::span")
    WebElement tab_NonRepairBill;
    @FindBy(xpath = "//div[contains(@id,'sfRM:cbNWO')]/descendant::span")
    WebElement tab_NewRO;
    @FindBy(xpath = "//h1[text()='New Repair Order']")
    WebElement txt_NewRepairOrder;
    @FindBy(xpath = "(//span[contains(@id,'ol2')]/descendant::label)[1]")
    WebElement Location_NewRepairOrder;
    @FindBy(xpath = "//input[contains(@id,'itSearchFacilitySelect::content')]")
    WebElement txtboxLocation_NewRepairOrder;
    @FindBy(xpath = "//span[contains(@id,'sSEquQ:ol22')]/descendant::label")
    WebElement txt_SearchUnit;
    @FindBy(xpath = "//input[contains(@id,'sSEquQ:sqSu:dc_it1::content')]")
    WebElement txtbox_SearchUnit;
    @FindBy(xpath = "//div[contains(@id,'sSEquQ:cbNU')]/descendant::span")
    WebElement tab_NewUnit;
    @FindBy(xpath = "//div[contains(@id,'sSEquQ:ctbSAS')]/descendant::span")
    WebElement tab_ShowAdvancedSearch;
    @FindBy(xpath = "//div[contains(@id,'cbSelectUnitLocal')]/descendant::span")
    WebElement tab_Select;
    @FindBy(xpath = "//div[contains(@id,'cbCancel')]/descendant::span")
    List<WebElement> btn_close;
    @FindBy(xpath = "//h1[text()='Repair Order']")
    WebElement title_RepairOrder;
    @FindBy(xpath = "//span[contains(@id,'olFac')]/descendant::label")
    WebElement Location_RepairOrder;
    @FindBy(xpath = "//a[contains(@id,'clFac')]/descendant::span")
    WebElement LocationName_RepairOrder;
    @FindBy(xpath = "//span[contains(@id,'olOwn')]/descendant::label")
    WebElement UnitOwner;
    @FindBy(xpath = "(//span[contains(@id,'olOwn')]/following::span)[1]")
    WebElement UnitOwnerName;
    @FindBy(xpath = "//div[contains(@id,'sdiLP::ti::_afrTabCnt')]/descendant::a")
    WebElement Tab_LabourParts;
    @FindBy(xpath = "//div[contains(@id,'sdiPC::ti::_afrTabCnt')]/descendant::a")
    WebElement Tab_ParentChild;
    @FindBy(xpath = "//div[contains(@id,'sdiPO::ti::_afrTabCnt')]/descendant::a")
    WebElement Tab_Purchasing;
    @FindBy(xpath = "//div[contains(@id,'bwares')]/descendant::span")
    WebElement tab_Resequence;
    @FindBy(xpath = "//div[contains(@id,'cbSHLBD')]/descendant::span")
    WebElement tab_showLabourDetails;
    @FindBy(xpath = "//div[contains(@id,'ctbAddLabor')]/descendant::span")
    WebElement tab_AddLabour;
    @FindBy(xpath = "//div[contains(@id,'cbSHPD')]/descendant::span")
    WebElement tab_showPartsDetails;
    @FindBy(xpath = "//div[contains(@id,'bvwp')]/descendant::span")
    WebElement tab_ViewParts;
    @FindBy(xpath = "//div[contains(@id,'ctbIssuePart')]/descendant::span")
    WebElement tab_AddParts;
    @FindBy(xpath = "//div[contains(@id,'cbROCT')]/descendant::span")
    WebElement tab_CostProof;
    @FindBy(xpath = "//div[contains(@id,'cbROCP')]/descendant::span")
    WebElement tab_CustomerProof;
    @FindBy(xpath = "//div[contains(@id,'rWO:1:b2')]/descendant::span")
    WebElement tab_QuickEstimate;
    @FindBy(xpath = "//div[contains(@id,'cbPKL')]/descendant::span")
    WebElement tab_PickList;
    @FindBy(xpath = "//div[contains(@id,'cbPrnWo')]/descendant::span")
    WebElement tab_RepairOrder;
    @FindBy(xpath = "//a[contains(@id,'ciTFR')]/descendant::span")
    WebElement arrow_backToCompleteRo;
/*    @FindBy(xpath = "")
    WebElement ;
    @FindBy(xpath = "")
    WebElement ;
    @FindBy(xpath = "")
    WebElement ;
    @FindBy(xpath = "")
    WebElement ;
    @FindBy(xpath = "")
    WebElement ;
    @FindBy(xpath = "")
    WebElement ;
    @FindBy(xpath = "")
    WebElement ;
    @FindBy(xpath = "")
    WebElement ;
    */





    public RepairOrderReportUnitOwnerSpacing(WebDriver driver){
        this.driver = driver;
        this.waitMethods = new WaitMethods(driver);
    }

    /*
      go to Service Board Screen
    */
    public void gotoServiceBoard() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(menu_Service);
        WebElementActions.getActions(driver).clickElement(menu_Service);

        waitMethods.waitForElementToBeRefreshedAndClickable(subMenu_CompleteRO);
        WebElementActions.getActions(driver).clickElement(subMenu_CompleteRO);

        TestListener.saveScreenshotPNG(driver);
    }
    /*
        verify title CompleteRO
     */
    public void verifyTitleCompleteRO() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(title_CompleteRO);
        Assert.assertTrue(title_CompleteRO.isDisplayed());
    }
    /*
         verify Location of complete Ro
     */
    public void verifyLocationCompleteRo() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_Location);
        Assert.assertTrue(txt_Location.isDisplayed());
        Assert.assertTrue(txtbox_Location.isDisplayed());
    }
    /*
         verify Ready To Submit
     */
    public void verifyReadyToSubmit() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(title_ReadyToSubmit);
        Assert.assertTrue(title_ReadyToSubmit.isDisplayed());

    }
    /*
        verify tab Non Repair Bill and New RO
     */
    public void verifyNonRepairBill_NewRO() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(tab_NonRepairBill);
        Assert.assertTrue(tab_NonRepairBill.isDisplayed());
        Assert.assertTrue(tab_NewRO.isDisplayed());
    }
    /*
         click on New RO tab
     */
    public void clickOnNewRO() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(tab_NewRO);
        WebElementActions.getActions(driver).clickElement(tab_NewRO);

        TestListener.saveScreenshotPNG(driver);
    }
    /*
         verify title New Repair Order
     */
    public void verifyTitleNewRepairOrder() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_NewRepairOrder);
        Assert.assertTrue(txt_NewRepairOrder.isDisplayed());

    }
    /*
        verify Location New Repair Order
     */
    public void verifyLocationNewRepairOrder() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(Location_NewRepairOrder);
        Assert.assertTrue(Location_NewRepairOrder.isDisplayed());
        Assert.assertTrue(txtboxLocation_NewRepairOrder.isDisplayed());

    }
    /*
         verify Search Unit
     */
    public void verifySearchUnit() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_SearchUnit);
        Assert.assertTrue(txt_SearchUnit.isDisplayed());
        Assert.assertTrue(txtbox_SearchUnit.isDisplayed());
    }
    /*
         verify tab New Unit and show advanced search
     */
    public void verifyNewUnitShowAdvancedSearch() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(tab_NewUnit);
        Assert.assertTrue(tab_NewUnit.isDisplayed());
        Assert.assertTrue(tab_ShowAdvancedSearch.isDisplayed());
        Assert.assertTrue(tab_Select.isDisplayed());
    }
    /*
        Enter Unit Owner Name
     */
    public void enterUnitOwnerName() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(txtbox_SearchUnit);
        WebElementActions.getActions(driver).inputText(txtbox_SearchUnit,appProp82.getProperty("unitOwner"));
    }
    /*
         click on Select tab
     */
    public void clickOnSelectTab() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(tab_Select);
        WebElementActions.getActions(driver).clickElement(tab_Select);

        Thread.sleep(10000);
        if(btn_close.size() > 0){
            waitMethods.waitForElementToBeRefreshedAndClickable(btn_close.get(0));
            WebElementActions.getActions(driver).clickElement(btn_close.get(0));
        }

        TestListener.saveScreenshotPNG(driver);
    }
    /*
        verify title Repair Order
     */
    public void verifyTitleRepairOrder() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(title_RepairOrder);
        Assert.assertTrue(title_RepairOrder.isDisplayed());
    }
    /*
        verify Location of Repair Order
     */
    public void verifyLocationRepairOrder() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(Location_RepairOrder);
        Assert.assertTrue(Location_RepairOrder.isDisplayed());
        Assert.assertTrue(LocationName_RepairOrder.isDisplayed());
    }
    /*
         verify Unit Owner
     */
    public void verifyUnitOwner() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(UnitOwner);
        Assert.assertTrue(UnitOwner.isDisplayed());
        Assert.assertTrue(UnitOwnerName.isDisplayed());
    }
    /*
         verify tabs of labour
     */
    public void verifyTabsOfLabour() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(Tab_LabourParts);
        Assert.assertTrue(Tab_LabourParts.isDisplayed());
        Assert.assertTrue(Tab_ParentChild.isDisplayed());
        Assert.assertTrue(Tab_Purchasing.isDisplayed());
        Assert.assertTrue(tab_Resequence.isDisplayed());
        Assert.assertTrue(tab_showLabourDetails.isDisplayed());
        Assert.assertTrue(tab_AddLabour.isDisplayed());

    }
    /*
        verify tabs of parts
     */
    public void verifyTabsOfParts() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(tab_showPartsDetails);
        Assert.assertTrue(tab_showPartsDetails.isDisplayed());
        Assert.assertTrue(tab_ViewParts.isDisplayed());
        Assert.assertTrue(tab_AddParts.isDisplayed());

    }
    /*
         verify print tabs
     */
    public void verifyPrintTab() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(tab_CostProof);
        Assert.assertTrue(tab_CostProof.isDisplayed());
        Assert.assertTrue(tab_CustomerProof.isDisplayed());
        Assert.assertTrue(tab_QuickEstimate.isDisplayed());
        Assert.assertTrue(tab_PickList.isDisplayed());
        Assert.assertTrue(tab_RepairOrder.isDisplayed());
    }
    /*
        click on Repair Order tab
     */
    public void clickOnRepairOrderTab() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(tab_RepairOrder);
        WebElementActions.getActions(driver).clickElement(tab_RepairOrder);

        Thread.sleep(5000);
        ReusableActions.deleteDownloadedFile();
    }
    /**
     * Verify PDF data
     */
    public void verifyPDF() throws InterruptedException, IOException {
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
         //           System.out.println(pdfFullText);
 /*           Thread.sleep(15000);
            if(pdfFullText.contains("Unit Owner:905 TRUCK AND TRAILER REPAIR")){
                System.out.println("Unit Owner name display correctly");
            }  */
            String[] lines = pdfFullText.split("\\r?\\n");
            int rowIndex = 16 ;
//            if(rowIndex >=0 && rowIndex < lines.length){
//                String specificRow = lines[rowIndex];
              if(rowIndex >=0 && rowIndex <= lines.length) {
                  String specificRow = lines[rowIndex];
                  System.out.println("Specific Row: " + specificRow); // Assuming columns are separated by whitespace
              }

                // Ensure there are at least two columns and extract the second column
     /*           if (columns.length >= 2) {
                    String secondColumnValue = columns[1]; // Index 1 for the second column (zero-based index)
                    System.out.println("Second column value of row " + (rowIndex + 1) + ": " + secondColumnValue);
                } else {
                    System.out.println("Row does not have enough columns.");
                }
            }    */
            else {
                System.out.println("Invalid row index or No row found in the PDF");
            }
            fis.close();
        }

        Thread.sleep(10000);
        ReusableActions.deleteDownloadedFile();
    }
    /*
        click on arrow Back To Complete Ro
     */
    public void clickOnBackToCompleteRo() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(arrow_backToCompleteRo);
        WebElementActions.getActions(driver).clickElement(arrow_backToCompleteRo);
    }
    /*
        Enter Unit Owner Name
     */
    public void enterUnitOwner() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(txtbox_SearchUnit);
        WebElementActions.getActions(driver).inputText(txtbox_SearchUnit,appProp82.getProperty("UnitOwner"));
    }
    /*

     */
 /*   public void a() throws InterruptedException {

    }

    */




}
