package pages.Ticket;

import actions.WebElementActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import tests.TestDriverActions;
import utils.TestListener;
import utils.WaitMethods;

import java.util.List;

public class PartChargeNotOpeningConsistently extends TestDriverActions {

    @FindBy(xpath = "//a[text()='Service']")
    WebElement menu_Service;
    @FindBy(xpath = "(//td[text()='Service Board'])[2]")
    WebElement subMenu_ServiceBoard;
    @FindBy(xpath = "//span[text()='Service Board']")
    WebElement title_ServiceBoard;
    @FindBy(xpath = "//h1[text()='Things To Do']")
    WebElement title_ThingsToDo;
    @FindBy(xpath = "//h1[text()='Arrivals']")
    WebElement title_Arrivals;
    @FindBy(xpath = "//a[contains(@id,'pt1:clROWIP')]")
    WebElement link_WorkInProgress;
    @FindBy(xpath = "//h1[text()='Work In Progress']")
    WebElement title_WorkInProgress;
    @FindBy(xpath = "//label[text()='Location Filters:']")
    WebElement txt_LocationFilters;
    @FindBy(xpath = "(//label[text()='Location Filters:']/following::span)[1]")
    WebElement NameOf_LocationFilters;
    @FindBy(xpath = "//div[contains(@id,'pt1:ctbCLF')]/descendant::span")
    WebElement tab_ClearLocationFilters;
    @FindBy(xpath = "//div[contains(@id,'ctbRefresh')]/descendant::span")
    WebElement tab_Refresh;
    @FindBy(xpath = "//label[contains(@id,'sfWIPQ:smc3_afrlblBy')]")
    WebElement txt_WIPStatus;
    @FindBy(xpath = "//input[contains(@id,'sfWIPQ:smc3::content')]")
    WebElement txtbox_WIPStaus;
    @FindBy(xpath = "//label[text()='Search:']")
    WebElement txt_Search;
    @FindBy(xpath = "//input[contains(@id,'sfWIPQ:itSearch::content')]")
    WebElement txtbox_search;
    @FindBy(xpath = "//div[contains(@id,'sfWIPQ:cbSearch')]/descendant::span")
    WebElement tab_search;
    @FindBy(xpath = "//div[contains(@id,'sfWIPQ:cbNWO')]/descendant::span")
    WebElement tab_NewRepairOrder;
    @FindBy(xpath = "//h1[text()='New Repair Order']")
    WebElement title_NewRepairOrder;
    @FindBy(xpath = "//span[contains(@id,'rWO:0:ol2')]/descendant::label")
    WebElement txt_Location;
    @FindBy(xpath = "//input[contains(@id,'itSearchFacilitySelect::content')]")
    WebElement txtbox_Location;
    @FindBy(xpath = "//span[contains(@id,'sSEquQ:ol22')]/descendant::label")
    WebElement txt_SearchUnit;
    @FindBy(xpath = "//input[contains(@id,'sSEquQ:sqSu:dc_it1::content')]")
    WebElement txtbox_searchUnit;
    @FindBy(xpath = "//div[contains(@id,'sSEquQ:cbNU')]/descendant::span")
    WebElement btn_NewUnit;
    @FindBy(xpath = "//div[contains(@id,'sSEquQ:ctbSAS')]/descendant::span")
    WebElement btn_ShowAdvancedSearch;
    @FindBy(xpath = "(//div[contains(@id,'cbSelectUnitLocal')]/descendant::span)[1]")
    WebElement btn_select;
    @FindBy(xpath = "//h1[text()='Repair Order']")
    WebElement title_RepairOrder;
    @FindBy(xpath = "//span[contains(@id,'rWO:1:olFac')]/descendant::label")
    WebElement Location;
    @FindBy(xpath = "//a[contains(@id,'rWO:1:clFac')]/descendant::span")
    WebElement LocationName;
    @FindBy(xpath = "//span[contains(@id,'rWO:1:olOwn')]/descendant::label")
    WebElement txt_UnitOwner;
    @FindBy(xpath = "//span[contains(@id,'rWO:1:olOwn')]/following::span[1]")
    WebElement UnitOwner_Name;
    @FindBy(xpath = "(//a[contains(@id,'sdiLP::disAcr')])[1]")
    WebElement btn_LabourAndParts;
    @FindBy(xpath = "(//a[contains(@id,'sdiPC::disAcr')])[1]")
    WebElement btn_Parent_Child;
    @FindBy(xpath = "(//a[contains(@id,'sdiPO::disAcr')])[1]")
    WebElement btn_purchasing;
    @FindBy(xpath = "//h2[text()='Labour']")
    WebElement txt_Labour;
    @FindBy(xpath = "//div[contains(@id,'rWO:1:bwares')]/descendant::span")
    WebElement tab_Resequence;
    @FindBy(xpath = "//div[contains(@id,'cbSHLBD')]/descendant::span")
    WebElement tab_ShowLabourDetails;
    @FindBy(xpath = "//div[contains(@id,'ctbAddLabor')]/descendant::span")
    WebElement tab_AddLabour;
    @FindBy(xpath = "//div[contains(@id,'1:cbSHPD')]/descendant::span")
    WebElement tab_ShowPartDetails;
    @FindBy(xpath = "//div[contains(@id,'rWO:1:bvwp')]/descendant::span")
    WebElement tab_ViewParts;
    @FindBy(xpath = "//div[contains(@id,'ctbIssuePart')]/descendant::span")
    WebElement tab_AddParts;
    @FindBy(xpath = "//div[contains(@id,'sfROQ:cbNWO')]/descendant::span")
    List<WebElement> btn_NewRepairOrder;
    @FindBy(xpath = "//td[contains(@id,'rWO:1:pw1::tb')]/descendant::div")
    WebElement title_AddLabour;
    @FindBy(xpath = "//span[contains(@id,'rlbg:1:ol3')]/descendant::label")
    WebElement UnitOwner;
    @FindBy(xpath = "//span[contains(@id,'rlbg:1:ol3')]/following::span[1]")
    WebElement NameUnitOwner;
    @FindBy(xpath = "//span[contains(@id,'rlbg:1:ol4')]/descendant::label")
    WebElement txt_Unit;
    @FindBy(xpath = "//span[contains(@id,'rlbg:1:ol4')]/following::span[1]")
    WebElement NameOf_Unit;
    @FindBy(xpath = "(//a[contains(@id,'rlbg:1:sdiSP::disAcr')])[1]")
    WebElement tab_ServiceProgram;
    @FindBy(xpath = "(//a[contains(@id,'rlbg:1:sdiMOTOR::disAcr')])[1]")
    WebElement tab_Motor;
    @FindBy(xpath = "(//a[contains(@id,'sdiVmrs::disAcr')])[1]")
    WebElement tab_VMRS;
    @FindBy(xpath = "(//a[contains(@id,'sdiROH::disAcr')])[1]")
    WebElement tab_UnitHistory;
    @FindBy(xpath = "(//a[contains(@id,'sdiOURO::disAcr')])[1]")
    WebElement tab_OtherHistory;
    @FindBy(xpath = "//label[text()='Search:']")
    WebElement Text_Search;
    @FindBy(xpath = "//input[contains(@id,'rlbg:1:searchVmrs:dc_it1::content')]")
    WebElement txtbox_Search;
    @FindBy(xpath = "//a[contains(@id,'rlbg:1:cilvmrsys')]")
    WebElement img_AccessoriesGroup;
    @FindBy(xpath = "//a[contains(@id,'tVmrs:0:ciAddVmrs')]")
    WebElement plus_icon;
    @FindBy(xpath = "//div[contains(@id,'ctbCancel')]/descendant::span")
    WebElement tab_Cancle;
    @FindBy(xpath = "//div[contains(@id,'ctbOk')]/descendant::span")
    WebElement tab_OK;
    @FindBy(xpath = "//td[contains(@id,'pw2::tb')]/descendant::div")
    WebElement title_IssuePart;
    @FindBy(xpath = "//span[contains(@id,'r11:1:olFac')]/descendant::label")
    WebElement Location_IssuePart;
    @FindBy(xpath = "//span[contains(@id,'r11:1:olFac')]/following::div[1]")
    WebElement LocationName_IssuePart;
    @FindBy(xpath = "//span[contains(@id,'r11:1:ol3')]/descendant::label")
    WebElement UnitOwner_IssuePart;
    @FindBy(xpath = "//span[contains(@id,'r11:1:ol3')]/following::div[1]")
    WebElement UnitOwnerName_IssuePart;
    @FindBy(xpath = "//span[contains(@id,'r11:1:ol10')]/descendant::label")
    WebElement Unit_IssuePart;
    @FindBy(xpath = "//span[contains(@id,'r11:1:ol10')]/following::div[1]")
    WebElement UnitName_IssuePart;
    @FindBy(xpath = "//span[contains(@id,'r11:1:ol14')]/descendant::label")
    WebElement Year_IssuePart;
    @FindBy(xpath = "//span[contains(@id,'r11:1:ol15')]/descendant::label")
    WebElement RO_IssuePart;
    @FindBy(xpath = "//span[contains(@id,'r11:1:ol5')]/descendant::label")
    WebElement Labour_IssuePart;
    @FindBy(xpath = "//span[contains(@id,'r11:1:ol5')]/following::div[1]")
    WebElement LabourName_IssuePart;
    @FindBy(xpath = "//table[contains(@id,'itSearchPartSelect')]/descendant::label")
    WebElement Part_IssuePart;
    @FindBy(xpath = "//input[contains(@id,'itSearchPartSelect::content')]")
    WebElement txtboxPart_IssuePart;
    @FindBy(xpath = "//li[contains(@class,'AFAutoSuggestItem')]")
    WebElement list_PartNumber;
    @FindBy(xpath = "//span[contains(@id,'r11:1:ol8')]/descendant::label")
    WebElement Quantity_IssuePart;
    @FindBy(xpath = "(//span[contains(@id,'r11:1:ol8')]/following::input)[1]")
    WebElement txtboxQuantity_IssuePart;
    @FindBy(xpath = "//div[contains(@id,'cbIssuePart')]/descendant::span")
    WebElement btn_IssuePart;
    @FindBy(xpath = "(//div[contains(@id,'ctbClose')])[2]/descendant::span")
    WebElement btn_close;
    @FindBy(xpath = "(//div[contains(@id,'tParts:1:pgl9')]/descendant::span)[1]")
    WebElement link_PartNumber;
    @FindBy(xpath = "//td[contains(@id,'pwPOH::tb')]/descendant::div")
    WebElement title_RepairAccessoriesGroup;
    @FindBy(xpath = "//span[contains(@id,'rPOH:1:olSHP')]/descendant::label")
    WebElement txt_Part;
    @FindBy(xpath = "//span[contains(@id,'rPOH:1:olSHP')]/following::div[1]")
    WebElement Part_Name;
    @FindBy(xpath = "//span[contains(@id,'rPOH:1:ol18')]/descendant::label")
    WebElement txt_PartDescription;
    @FindBy(xpath = "//span[contains(@id,'rPOH:1:ol18')]/following::div[1]")
    WebElement PartDescription_Name;
    @FindBy(xpath = "//span[contains(@id,'rPOH:1:ol19')]/descendant::label")
    WebElement text_Labour;
    @FindBy(xpath = "//span[contains(@id,'rPOH:1:ol19')]/following::select[1]")
    WebElement select_Labour;
    @FindBy(xpath = "//span[contains(@id,'rPOH:1:ol20')]/descendant::label")
    WebElement txt_PartFailure;
    @FindBy(xpath = "//span[contains(@id,'rPOH:1:ol20')]/following::select")
    WebElement select_PartFailure;
    @FindBy(xpath = "//span[contains(@id,'rPOH:1:olAQ')]/descendant::label")
    WebElement txt_ActualQuantity;
    @FindBy(xpath = "//span[contains(@id,'rPOH:1:olAQ')]/following::input[1]")
    WebElement txtbox_ActualQuantity;
    @FindBy(xpath = "//span[contains(@id,'rPOH:1:olUC')]/descendant::label")
    WebElement txt_UnitCost;
    @FindBy(xpath = "//span[contains(@id,'rPOH:1:olTC')]/descendant::label")
    WebElement txt_TotalCost;
    @FindBy(xpath = "//span[contains(@id,'rPOH:1:ol9')]/descendant::label")
    WebElement txt_ChargeQuantity;
    @FindBy(xpath = "(//span[contains(@id,'rPOH:1:ol9')]/following::input)[1]")
    WebElement txtbox_ChargeQuantity;
    @FindBy(xpath = "//label[text()='Unit Charge:']")
    WebElement txt_UnitCharge;
    @FindBy(xpath = "//input[contains(@id,'itUnitChargeCurrency::content')]")
    WebElement txtbox_UnitCharge;
    @FindBy(xpath = "//label[text()='Total Charge:']")
    WebElement txt_TotalCharge;
    @FindBy(xpath = "//div[contains(@id,'rPOH:1:cb1')]/descendant::span")
    WebElement btn_cancle;
    @FindBy(xpath = "//span[text()='Save / Exit']")
    WebElement btn_SaveExit;
    @FindBy(xpath = "//a[contains(@id,'tParts:0:cl3')]/descendant::span")
    WebElement link_PartNumber2;
    @FindBy(xpath = "(//td[contains(@id,'tParts:1:c10')]/descendant::span)[2]")
    WebElement link_UnitCharge1;
    @FindBy(xpath = "(//td[contains(@id,'tParts:0:c10')]/descendant::span)[2]")
    WebElement link_UnitCharge2;
    @FindBy(xpath = "//span[text()='Sign Out']")
    WebElement btn_signOut;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement inputbox_Username;
/*    @FindBy(xpath = "")
    WebElement;
    @FindBy(xpath = "")
    WebElement;
    @FindBy(xpath = "")
    WebElement;
    @FindBy(xpath = "")
    WebElement;
    @FindBy(xpath = "")
    WebElement;
    @FindBy(xpath = "")
    WebElement;
    @FindBy(xpath = "")
    WebElement;


  */
    @FindBy(xpath = "//h1[text()='Working...Please Wait']")
    List<WebElement> loder;



    public PartChargeNotOpeningConsistently(WebDriver driver){
        this.driver = driver;
        this.waitMethods = new WaitMethods(driver);
    }


    /*
       go to Service Board Screen
     */
    public void gotoServiceBoard() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(menu_Service);
        WebElementActions.getActions(driver).clickElement(menu_Service);

        waitMethods.waitForElementToBeRefreshedAndClickable(subMenu_ServiceBoard);
        WebElementActions.getActions(driver).clickElement(subMenu_ServiceBoard);

        TestListener.saveScreenshotPNG(driver);
    }
    /*
        verify title Service Board
     */
    public void verifyTitleServiceBoard() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(title_ServiceBoard);
        Assert.assertTrue(title_ServiceBoard.isDisplayed());
    }
    /*
        verify title Things To Do
     */
    public void verifyTitleThingsToDo() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(title_ThingsToDo);
        Assert.assertTrue(title_ThingsToDo.isDisplayed());
    }
    /*
        verify title Arrivals
     */
    public void verifyTitleArrivals() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(title_Arrivals);
        Assert.assertTrue(title_Arrivals.isDisplayed());
    }
    /*
        verify link Work In Progress
     */
    public void verifyLinkWorkInProgress() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(link_WorkInProgress);
        Assert.assertTrue(link_WorkInProgress.isDisplayed());
    }
    /*
        click on link Work In Progress
     */
    public void clickWorkInProgress() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(link_WorkInProgress);
        WebElementActions.getActions(driver).clickElement(link_WorkInProgress);
        waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /*
        verify title Work In Progress
     */
     public void verifyTitleWorkInProgress() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(title_WorkInProgress);
        Assert.assertTrue(title_WorkInProgress.isDisplayed());
    }
    /*
        verify text Location Filters
     */
     public void verifyTextLocationFilters() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_LocationFilters);
        Assert.assertTrue(txt_LocationFilters.isDisplayed());
        Assert.assertTrue(NameOf_LocationFilters.isDisplayed());
    }
    /*
        verify tab Clear Location Filters
     */
     public void verifyTabClearLocationFilters() throws InterruptedException{
         waitMethods.waitForElementToBeRefreshedAndIsVisible(tab_ClearLocationFilters);
         Assert.assertTrue(tab_ClearLocationFilters.isDisplayed());

    }
    /*
        verify tab Refresh
     */
     public void verifyTabRefresh() throws InterruptedException{
          waitMethods.waitForElementToBeRefreshedAndIsVisible(tab_Refresh);
          Assert.assertTrue(tab_Refresh.isDisplayed());
    }
    /*
        verify WIP Status
     */
     public void verifyWIPStatus() throws InterruptedException{
         waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_WIPStatus);
         Assert.assertTrue(txt_WIPStatus.isDisplayed());
         Assert.assertTrue(txtbox_WIPStaus.isDisplayed());
    }
    /*
        verify Search
     */
     public void verifySearch() throws InterruptedException{
          waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_Search);
          Assert.assertTrue(txt_Search.isDisplayed());
          Assert.assertTrue(txtbox_search.isDisplayed());
    }
    /*
        verify tab Search and New Repair Order
     */
     public void verifyTabSearch_NewRepairOrder() throws InterruptedException{
         waitMethods.waitForElementToBeRefreshedAndIsVisible(tab_search);
         Assert.assertTrue(tab_search.isDisplayed());
         Assert.assertTrue(tab_NewRepairOrder.isDisplayed());
    }
    /*
        click on tab New Repair Order
     */
     public void clickOnTabNewRepairOrder() throws InterruptedException{
         waitMethods.waitForElementToBeRefreshedAndIsVisible(tab_NewRepairOrder);
         WebElementActions.getActions(driver).clickElement(tab_NewRepairOrder);

         waitMethods.loadingWait(loder);
         TestListener.saveScreenshotPNG(driver);
    }
    /*
        verify New Repair Order
     */
     public void verifyTitleNewRepairOrder() throws InterruptedException{
         waitMethods.waitForElementToBeRefreshedAndIsVisible(title_NewRepairOrder);
         Assert.assertTrue(title_NewRepairOrder.isDisplayed());

    }
    /*
        verify Location
     */
     public void verifyLocation() throws InterruptedException{
         waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_Location);
         Assert.assertTrue(txt_Location.isDisplayed());
         Assert.assertTrue(txtbox_Location.isDisplayed());
    }
    /*
        verify Search Unit
     */
     public void verifySearchUnit() throws InterruptedException{
         waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_SearchUnit);
         Assert.assertTrue(txt_SearchUnit.isDisplayed());
         Assert.assertTrue(txtbox_searchUnit.isDisplayed());

    }
    /*
        verify button New Unit and Show Advanced Search
     */
     public void verifyNewUnitAndShowAdvancedSearch() throws InterruptedException{
         waitMethods.waitForElementToBeRefreshedAndIsVisible(btn_NewUnit);
         Assert.assertTrue(btn_NewUnit.isDisplayed());
         Assert.assertTrue(btn_ShowAdvancedSearch.isDisplayed());
         Assert.assertTrue(btn_select.isDisplayed());
    }
    /*
        click on button Select
     */
     public void clickOnSelectButton() throws InterruptedException{
         waitMethods.waitForElementToBeRefreshedAndIsVisible(btn_select);
         WebElementActions.getActions(driver).clickElement(btn_select);
          Thread.sleep(10000);
          if(btn_NewRepairOrder.size() > 0) {
              waitMethods.waitForElementToBeRefreshedAndIsVisible(btn_NewRepairOrder.get(0));
              WebElementActions.getActions(driver).clickElement(btn_NewRepairOrder.get(0));
          }
         waitMethods.loadingWait(loder);
         TestListener.saveScreenshotPNG(driver);
    }
     /*
        verify title Repair Order
     */
     public void verifyTitleRepairOrder() throws InterruptedException{
         waitMethods.waitForElementToBeRefreshedAndIsVisible(title_RepairOrder);
         Assert.assertTrue(title_RepairOrder.isDisplayed());
    }
     /*
        verify Location
     */
     public void verifyLocationOfRepairOrder() throws InterruptedException{
         waitMethods.waitForElementToBeRefreshedAndIsVisible(Location);
         Assert.assertTrue(Location.isDisplayed());
         Assert.assertTrue(LocationName.isDisplayed());
    }
    /*
        verify Unit Owner of Repair Owner
     */
     public void verifyUnitOwnerOfRepairOwner() throws InterruptedException{
         waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_UnitOwner);
         Assert.assertTrue(txt_UnitOwner.isDisplayed());
         Assert.assertTrue(UnitOwner_Name.isDisplayed());
    }
     /*
        verify button Labour and Parts
     */
     public void verifyTabLabourParts() throws InterruptedException{
         waitMethods.waitForElementToBeRefreshedAndIsVisible(btn_LabourAndParts);
         Assert.assertTrue(btn_LabourAndParts.isDisplayed());
         Assert.assertTrue(btn_Parent_Child.isDisplayed());
         Assert.assertTrue(btn_purchasing.isDisplayed());
    }
     /*
        verify Labour
     */
     public void verifyLabour() throws InterruptedException{
         waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_Labour);
         Assert.assertTrue(txt_Labour.isDisplayed());
    }
     /*
        verify tabs present on Labour and Parts section
     */
     public void verifyTabsOfLabourAndParts() throws InterruptedException{
         waitMethods.waitForElementToBeRefreshedAndIsVisible(tab_Resequence);
         Assert.assertTrue(tab_Resequence.isDisplayed());
         Assert.assertTrue(tab_ShowLabourDetails.isDisplayed());
         Assert.assertTrue(tab_AddLabour.isDisplayed());
         Assert.assertTrue(tab_ShowPartDetails.isDisplayed());
         Assert.assertTrue(tab_ViewParts.isDisplayed());
         Assert.assertTrue(tab_AddParts.isDisplayed());

    }
     /*
        click on Add Labour
     */
     public void clickOnAddLabour() throws InterruptedException{
         waitMethods.waitForElementToBeRefreshedAndIsVisible(tab_AddLabour);
         WebElementActions.getActions(driver).clickElement(tab_AddLabour);
    }
     /*
        verify title Add Labour
     */
     public void verifyTitleAddLabour() throws InterruptedException{
         waitMethods.waitForElementToBeRefreshedAndIsVisible(title_AddLabour);
         Assert.assertTrue(title_AddLabour.isDisplayed());
    }
     /*
        verify Unit Owner of Add Labour
     */
     public void verifyUnitOwnerOfAddLabour() throws InterruptedException{
         waitMethods.waitForElementToBeRefreshedAndIsVisible(UnitOwner);
         Assert.assertTrue(UnitOwner.isDisplayed());
         Assert.assertTrue(NameUnitOwner.isDisplayed());
    }
     /*
        verify Unit
     */
     public void verifyUnit() throws InterruptedException{
         waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_Unit);
         Assert.assertTrue(txt_Unit.isDisplayed());
         Assert.assertTrue(NameOf_Unit.isDisplayed());
    }
     /*
        verify tabs of Add Labour
     */
     public void verifyTabsOfAddLabour() throws InterruptedException{
          waitMethods.waitForElementToBeRefreshedAndIsVisible(tab_ServiceProgram);
          Assert.assertTrue(tab_ServiceProgram.isDisplayed());
          Assert.assertTrue(tab_Motor.isDisplayed());
          Assert.assertTrue(tab_VMRS.isDisplayed());
          Assert.assertTrue(tab_UnitHistory.isDisplayed());
          Assert.assertTrue(tab_OtherHistory.isDisplayed());
    }
     /*
        click on VMRS Tab
     */
     public void clickOnVMRSTab() throws InterruptedException{
         waitMethods.waitForElementToBeRefreshedAndIsVisible(tab_VMRS);
         WebElementActions.getActions(driver).clickElement(tab_VMRS);
    }
     /*
        verify text search
     */
     public void verifyTextSearch() throws InterruptedException{
         waitMethods.waitForElementToBeRefreshedAndIsVisible(Text_Search);
         Assert.assertTrue(Text_Search.isDisplayed());
         Assert.assertTrue(txtbox_Search.isDisplayed());
    }
     /*
        enter Accessories Group
     */
     public void enterAccessoriesGroup() throws InterruptedException{
         waitMethods.waitForElementToBeRefreshedAndIsVisible(txtbox_Search);
         WebElementActions.getActions(driver).inputText(txtbox_Search,appProp70.getProperty("Search"));
    }
    /*
        click on Image Accessories Group
     */
      public void clickOnAccessoriesGroup() throws InterruptedException{
          waitMethods.waitForElementToBeRefreshedAndIsVisible(img_AccessoriesGroup);
          WebElementActions.getActions(driver).clickElement(img_AccessoriesGroup);
    }
     /*
         click on Plus Icon
     */
     public void clickOnPlusIcon() throws InterruptedException{
         waitMethods.waitForElementToBeRefreshedAndIsVisible(plus_icon);
         WebElementActions.getActions(driver).clickElement(plus_icon);
    }
     /*
        verify Cancle and OK Tab
     */
     public void verifyCancleOKTab() throws InterruptedException{
         waitMethods.waitForElementToBeRefreshedAndIsVisible(tab_Cancle);
         Assert.assertTrue(tab_Cancle.isDisplayed());
         Assert.assertTrue(tab_OK.isDisplayed());
    }
     /*
        click on OK Tab
     */
     public void clickOnOKTab() throws InterruptedException{
         waitMethods.waitForElementToBeRefreshedAndIsVisible(tab_OK);
         WebElementActions.getActions(driver).clickElement(tab_OK);
    }
     /*
        click on Add Part
     */
     public void clickOnAddPart() throws InterruptedException{
         waitMethods.waitForElementToBeRefreshedAndIsVisible(tab_AddParts);
         WebElementActions.getActions(driver).clickElement(tab_AddParts);
    }
    /*
        verify title Issue Part
     */
     public void verifyTitleIssuePart() throws InterruptedException{
         waitMethods.waitForElementToBeRefreshedAndIsVisible(title_IssuePart);
         Assert.assertTrue(title_IssuePart.isDisplayed());
    }
     /*
        verify Issue Part fields
     */
     public void verifyIssuePartFields() throws InterruptedException{
         waitMethods.waitForElementToBeRefreshedAndIsVisible(Location_IssuePart);
         Assert.assertTrue(Location_IssuePart.isDisplayed());
         Assert.assertTrue(LocationName_IssuePart.isDisplayed());
         Assert.assertTrue(UnitOwner_IssuePart.isDisplayed());
         Assert.assertTrue(UnitOwnerName_IssuePart.isDisplayed());
         Assert.assertTrue(Unit_IssuePart.isDisplayed());
         Assert.assertTrue(UnitName_IssuePart.isDisplayed());
         Assert.assertTrue(Year_IssuePart.isDisplayed());
         Assert.assertTrue(RO_IssuePart.isDisplayed());
         Assert.assertTrue(Labour_IssuePart.isDisplayed());
         Assert.assertTrue(LabourName_IssuePart.isDisplayed());
    }
     /*
        verify part and quantity field
     */
     public void verifyPartAndQuantityField() throws InterruptedException{
         waitMethods.waitForElementToBeRefreshedAndIsVisible(Part_IssuePart);
         Assert.assertTrue(Part_IssuePart.isDisplayed());
         Assert.assertTrue(txtboxPart_IssuePart.isDisplayed());
         Assert.assertTrue(Quantity_IssuePart.isDisplayed());
         Assert.assertTrue(txtboxQuantity_IssuePart.isDisplayed());
         Assert.assertTrue(btn_IssuePart.isDisplayed());
         Assert.assertTrue(btn_close.isDisplayed());
    }
    /*
         enter Part Number
     */
     public void enterPartNumber() throws InterruptedException{
         waitMethods.waitForElementToBeRefreshedAndIsVisible(txtboxPart_IssuePart);
         WebElementActions.getActions(driver).inputText(txtboxPart_IssuePart,appProp70.getProperty("partNumber"));
         Thread.sleep(5000);
         WebElementActions.getActions(driver).clickElement(list_PartNumber);
         waitMethods.loadingWait(loder);
         TestListener.saveScreenshotPNG(driver);

    }
    /*
        click on Issue Part
     */
     public void clickOnIssuePart() throws InterruptedException{
         waitMethods.waitForElementToBeRefreshedAndIsVisible(btn_IssuePart);
         WebElementActions.getActions(driver).clickElement(btn_IssuePart);
    }
    /*
        click on close button
     */
     public void clickOnCloseButton() throws InterruptedException{
         waitMethods.waitForElementToBeRefreshedAndIsVisible(btn_close);
         WebElementActions.getActions(driver).clickElement(btn_close);
    }
    /*
        enter second part
     */
     public void enterSecondPart() throws InterruptedException{
         waitMethods.waitForElementToBeRefreshedAndIsVisible(txtboxPart_IssuePart);
         WebElementActions.getActions(driver).inputText(txtboxPart_IssuePart,appProp70.getProperty("partNumber2"));
         Thread.sleep(3000);
         WebElementActions.getActions(driver).clickElement(list_PartNumber);
         waitMethods.loadingWait(loder);
         TestListener.saveScreenshotPNG(driver);
    }
    /*
        click on link part number
     */
     public void clickOnLinkPartNumber() throws InterruptedException{
         waitMethods.waitForElementToBeRefreshedAndIsVisible(link_PartNumber);
         WebElementActions.getActions(driver).clickElement(link_PartNumber);
    }
    /*
        verify title Repair Accessories Group
     */
     public void verifyTitleRepairAccessoriesGroup() throws InterruptedException{
         waitMethods.waitForElementToBeRefreshedAndIsVisible(title_RepairAccessoriesGroup);
         Assert.assertTrue(title_RepairAccessoriesGroup.isDisplayed());
    }
    /*
        verify Part
     */
     public void verifyPart() throws InterruptedException{
         waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_Part);
         Assert.assertTrue(txt_Part.isDisplayed());
         Assert.assertTrue(Part_Name.isDisplayed());
    }
    /*
        verify Part Description
     */
     public void verifyPartDescription() throws InterruptedException{
         waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_PartDescription);
         Assert.assertTrue(txt_PartDescription.isDisplayed());
         Assert.assertTrue(PartDescription_Name.isDisplayed());
    }
     /*
        verify Labour
     */
     public void verifyLabourName() throws InterruptedException{
          waitMethods.waitForElementToBeRefreshedAndIsVisible(text_Labour);
          Assert.assertTrue(text_Labour.isDisplayed());
          Assert.assertTrue(select_Labour.isDisplayed());
    }
     /*
        verify Part Failure
     */
     public void verifyPartFailure() throws InterruptedException{
         waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_PartFailure);
         Assert.assertTrue(txt_PartFailure.isDisplayed());
         Assert.assertTrue(select_PartFailure.isDisplayed());
    }
     /*
        verify text Actual Quantity
     */
     public void verifyActualQuantity() throws InterruptedException{
           waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_ActualQuantity);
           Assert.assertTrue(txt_ActualQuantity.isDisplayed());
           Assert.assertTrue(txtbox_ActualQuantity.isDisplayed());
    }
     /*
        verify Unit Cost
     */
     public void verifyUnitCost() throws InterruptedException{
         waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_UnitCost);
         Assert.assertTrue(txt_UnitCost.isDisplayed());
         Assert.assertTrue(txt_TotalCost.isDisplayed());
    }
    /*
        verify Charge Quantity
     */
     public void verifyChargeQuantity() throws InterruptedException{
         waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_ChargeQuantity);
         Assert.assertTrue(txt_ChargeQuantity.isDisplayed());
         Assert.assertTrue(txtbox_ChargeQuantity.isDisplayed());
    }
     /*
        verify Unit Charge
     */
     public void verifyUnitCharge() throws InterruptedException{
         waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_UnitCharge);
         Assert.assertTrue(txt_UnitCharge.isDisplayed());
         Assert.assertTrue(txtbox_UnitCharge.isDisplayed());
         Assert.assertTrue(txt_TotalCharge.isDisplayed());
    }
     /*
        verify cancle and saveExit button
     */
     public void verifyCancleSaveExit() throws InterruptedException{
         waitMethods.waitForElementToBeRefreshedAndIsVisible(btn_cancle);
         Assert.assertTrue(btn_cancle.isDisplayed());
         Assert.assertTrue(btn_SaveExit.isDisplayed());
    }
     /*
        Enter Unit Charge
     */
     public void enterUnitCharge() throws InterruptedException{
         waitMethods.waitForElementToBeRefreshedAndIsVisible(txtbox_UnitCharge);
         WebElementActions.getActions(driver).inputText(txtbox_UnitCharge,appProp70.getProperty("unitCharge"));
    }
     /*
        click on SaveExit
     */
     public void clickOnSaveExit() throws InterruptedException{
         waitMethods.waitForElementToBeRefreshedAndIsVisible(btn_SaveExit);
         WebElementActions.getActions(driver).clickElement(btn_SaveExit);
    }
     /*
         click on link of second Part Number
     */
     public void clickOnSecondLink() throws InterruptedException{
         waitMethods.waitForElementToBeRefreshedAndIsVisible(link_PartNumber2);
         WebElementActions.getActions(driver).clickElement(link_PartNumber2);
    }
     /*
        verify Unit Charge link one
     */
     public void verifyUnitChargeOne() throws InterruptedException{
         waitMethods.waitForElementToBeRefreshedAndIsVisible(link_UnitCharge1);
         Assert.assertTrue(link_UnitCharge1.isDisplayed());

    }
    /*
        verify Unit charge link two
     */
     public void verifyUnitChargeTwo() throws InterruptedException{
         waitMethods.waitForElementToBeRefreshedAndIsVisible(link_UnitCharge2);
         Assert.assertTrue(link_UnitCharge2.isDisplayed());

    }
    /**
     * Click on sign out and verify username
     */
    public void clickOnSignOutAndVerifyName() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(btn_signOut);
        WebElementActions.getActions(driver).clickElement(btn_signOut);

        waitMethods.waitForElementToBeRefreshedAndIsVisible(inputbox_Username);
        Assert.assertTrue(inputbox_Username.isDisplayed());

        TestListener.saveScreenshotPNG(driver);
    }
  









}
