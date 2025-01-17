package pages.Ticket;

import actions.ReusableActions;
import actions.WaitActions;
//import actions.WebElementActions;
import actions.WebElementActions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import tests.TestDriverActions;
import utils.TestListener;

import java.io.FileNotFoundException;
import java.util.List;

public class NonIcCompletedAndWorkFine extends TestDriverActions {


    @FindBy(xpath = "(//a[contains(@id,'cl9')])")
    WebElement partName;

    @FindBy(xpath = "//label[text()='Onhands:']")
    WebElement label_Onhands;
    @FindBy(xpath = "//label[text()='Onhands:']/following::span[1]")
    WebElement onhands_value;
    @FindBy(xpath = "//span[text()='Update']")
    WebElement btn_update;
    @FindBy(xpath = "//div[contains(@id,'cbCancel')]")
    WebElement btn_cancle;

    @FindBy(xpath = "//div[text()='Update Onhands']")
    WebElement UpdateOnhands;

    @FindBy(xpath = "(//label[text()='Part #:'])[2]")
    WebElement label_part;
    @FindBy(xpath = "(//label[text()='Part #:'])[2]/following::td[1]")
    WebElement nameOfPart;

    @FindBy(xpath = "//label[text()='Warehouse:']")
    WebElement warehouse;
    @FindBy(xpath = "//label[text()='Warehouse:']/following::td[1]")
    WebElement warehouse_name;
    @FindBy(xpath = "(//label[text()='Onhands:'])[2]")
    WebElement lable_Onhands;
    @FindBy(xpath = "(//label[text()='Onhands:'])[2]/following::input[1]")
    WebElement txtbox_Onhands;
    @FindBy(xpath = "//div[contains(@id,'cb4')]")
    WebElement cancle_btn;
    @FindBy(xpath = "//div[contains(@id,'ctbSaveExit')]")
    WebElement btn_SaveExit;
    @FindBy(xpath = "//a[contains(@id,'clQuickRepairEstimate')]")
    WebElement quickEstimate;
    @FindBy(xpath = "//div[contains(@id,'cbSelectUnitLocal')]")
    WebElement btn_select;
    @FindBy(xpath = "//div[contains(@id,'ctbAddLabor')]")
    WebElement addLabour;
    @FindBy(xpath = "(//a[text()='VMRS'])[1]")
    WebElement btn_VMRS;
    @FindBy(xpath = "//label[text()='Search:']/following::input[1]")
    WebElement searchBox;
    @FindBy(xpath = "//a[contains(@id,'cilvmrsys')]/img")
    WebElement img_firstLabour;
    @FindBy(xpath = "//a[contains(@id,'ciAddVmrs')]/img")
    WebElement plus_btn;
    @FindBy(xpath = "//div[contains(@id,'ctbOk')]")
    WebElement Ok_btn;
    @FindBy(xpath = "//span[text()='Submit']")
    WebElement btn_submit;
    @FindBy(xpath = "//div[contains(@id,'cb5')]")
    WebElement update;
    @FindBy(xpath = "(//a[text()='Repair Estimates In Progress'])[1]")
    WebElement RepairEstimateInProgress;
    @FindBy(xpath = "//div[contains(@id,'ctbCLF')]")
    WebElement ClearLocationFilters;

    @FindBy(xpath ="//td[contains(@id,'cFacName')]")
    List<WebElement> shop_location;
    @FindBy(xpath ="//td[contains(@id,'cEquipmentNumber')]")
    List<WebElement> unitNumber;
    @FindBy(xpath ="//td[contains(@id,'c2')]")
    WebElement pending_Estimate;
    @FindBy(xpath ="//input[contains(@id,'itEmployeeNumber::content')]")
    WebElement search_techBudge;
    @FindBy(xpath ="//span[text()='Go']")
    WebElement btn_go;
    @FindBy(xpath = "//div[contains(@id,'ctbAssignedWork')]")
    List<WebElement> btn_assignedWork;

    @FindBy(xpath = "//span[text()='More Units']")
    WebElement btn_MoreUnits;

    @FindBy(xpath ="//input[contains(@id,'sSEquQ:sqSu:dc_it1::content')]")
    WebElement search_Unit;
    @FindBy(xpath ="//div[contains(@id,'cbSelectUnitLocal')]")
    WebElement selectBtn;
    @FindBy(xpath = "//h1[text()='Work Required']/following::div[10][contains(text(),'No data to display')]")
    List<WebElement> LabourRequired;
    @FindBy(xpath = "//input[contains(@id,'searchVmrs:dc_it1::content')]")
    WebElement search_text;
    @FindBy(xpath = "//a[contains(@id,'cilvmrsys')]/img")
    WebElement FirstLabour_img;
    @FindBy(xpath = "//a[contains(@id,'ciAddVmrs')]/img")
    WebElement plusIcon;
    @FindBy(xpath = "//div[contains(@id,'ctbOk')]")
    WebElement btnAdd;
    @FindBy(xpath = "//span[text()='More Work ...']")
    WebElement btn_moreWork;
    @FindBy(xpath = "(//a[contains(@id,'sdiVmrs::disAcr')])[1]")
    WebElement tab_VMRS;
    @FindBy(xpath = "//a[contains(@id,'ciWorkRequired')]/img")
    WebElement img_workRequired;
    @FindBy(xpath = "(//a[text()='Parts'])[1]")
    public WebElement parts_tab;
    @FindBy(xpath = "//label[contains(text(),'Part #:')]/following::input[1]")
    public WebElement txt_part;
    @FindBy(xpath = "//li[contains(@class,'AFAutoSuggestItem')]")
    WebElement listOfElement;
    @FindBy(xpath = "//div[contains(@id,'cbIssuePar')]/a/span")
    WebElement btn_IssuePart;
    @FindBy(xpath ="//div[contains(@id,'pgl8')]")
    List<WebElement> estimate_hash;
    @FindBy(xpath = "//a[contains(@id,'clEstimateNumber')]")
    WebElement estimate_Number;
    @FindBy(xpath ="//div[contains(@id,'cbAutoApproveD')]")
    WebElement approve_btn;
    @FindBy(xpath ="//div[contains(@id,'cbOkTS')]")
    WebElement ApproveEstimate;
    @FindBy(xpath ="//div[contains(@id,'cbCanTS')]")
    WebElement canclebtn;
    @FindBy(xpath = "//a[text()='Sign Out']")
    WebElement btn_signOut;

    @FindBy(xpath = "//h1[text()='Working...Please Wait']")
    List<WebElement> loder;

    @FindBy(xpath = "//a[contains(@id,'pt1:smc3::drop')]")
    WebElement estimateStatusDropdown;

    @FindBy(xpath = "//label[text()='Pending Approval']/child::input[1]")
    WebElement checkBox_pendingApproval;

    @FindBy(xpath = "//div[contains(@id,'cbRFQ')]")
    WebElement search_btn;
    /**
     * go to Part Master screen
     *
     * @throws FileNotFoundException
     * @throws InterruptedException
     */
      public void gotoPartMaster() throws FileNotFoundException, InterruptedException {
        ReusableActions.getActions(driver).clickParentMenu("Parts");
        ReusableActions.getActions(driver).clickChildMenu("Part Master");

          waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }

    /**
     * click on one of the part
     */
      public void clickOnPart() throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndClickable(partName);
        WebElementActions.getActions(driver).clickElement(partName);

          waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }

    /**
     * Verify onhand value
     */
     public void verifyOnHand() throws InterruptedException {
         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_Onhands);
        Assert.assertTrue(label_Onhands.isDisplayed());
        Assert.assertTrue(onhands_value.isDisplayed());
        Assert.assertTrue(btn_update.isDisplayed());

    }

    /**
     * click on Update button
     */
      public void clickOnUpdate() throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndClickable(btn_update);
        WebElementActions.getActions(driver).clickElement(btn_update);

          waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }

    /**
     * verify update onhands pop up
     */
      public void verifyUpdateOnHands() throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndIsVisible(UpdateOnhands);
        Assert.assertTrue(label_part.isDisplayed());
        Assert.assertTrue(nameOfPart.isDisplayed());
        Assert.assertTrue(warehouse.isDisplayed());
        Assert.assertTrue(warehouse_name.isDisplayed());
        Assert.assertTrue(lable_Onhands.isDisplayed());
        Assert.assertTrue(txtbox_Onhands.isDisplayed());

    }

    /**
     * update onhands value with 00
     */
      public void updateOnhandValue() throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndClickable(txtbox_Onhands);
        WebElementActions.getActions(driver).inputText(txtbox_Onhands, appProp.getProperty("value"));

          waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }

    /**
     * click on update
     */
      public void clickOnUpdateButton() throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndClickable(update);
        WebElementActions.getActions(driver).clickElement(update);

          waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }

    /**
     * click on save and exit button
     */
      public void clickOnSaveExitBtn() throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndClickable(btn_SaveExit);
        WebElementActions.getActions(driver).clickElement(btn_SaveExit);

          waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }

    /**
     * go to service board screen
     */
      public void gotoServiceBoardScreen() throws FileNotFoundException, InterruptedException {
        Thread.sleep(3000);
        ReusableActions.getActions(driver).clickParentMenu("Service");
        ReusableActions.getActions(driver).clickChildMenu("Service Board");

          waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }

    /**
     * click on quick estimate
     */
      public void clickOnQuickEstimate() throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndClickable(quickEstimate);
        WebElementActions.getActions(driver).clickElement(quickEstimate);

          waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }

    /**
     * click on select button
     */
      public void clickOnSelect() throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndClickable(btn_select);
        WebElementActions.getActions(driver).clickElement(btn_select);

          waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }

    /**
     * click on Add Labour
     */
      public void clickOnAddlabour() throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndClickable(addLabour);
        WebElementActions.getActions(driver).clickElement(addLabour);

          waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }

    /**
     * click on VMRS
     */
      public void clickOnVMRS() throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndClickable(btn_VMRS);
        WebElementActions.getActions(driver).clickElement(btn_VMRS);

          waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }

    /**
     * Search First Labour
     */
      public void searchFirstLabour() throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndClickable(searchBox);
        WebElementActions.getActions(driver).inputText(searchBox, appProp.getProperty("FirstName"));

          waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }

    /**
     * click on FirstLabour Image
     */
      public void clickOnFirstLabourImg() throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndClickable(img_firstLabour);
        WebElementActions.getActions(driver).clickElement(img_firstLabour);

          waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }

    /**
     * click on plus button
     */
      public void clickOnPlus() throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndClickable(plus_btn);
        WebElementActions.getActions(driver).clickElement(plus_btn);

          waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }

    /**
     * click on Add button
     */
      public void clickOnAdd() throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndClickable(Ok_btn);
        WebElementActions.getActions(driver).clickElement(Ok_btn);

          waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }

    /**
     * click on submit button
     */
      public void clickOnSubmit() throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndClickable(btn_submit);
        WebElementActions.getActions(driver).clickElement(btn_submit);

          waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }

    /**
     * click on Repair Estimate OIn Progress
     */
      public void repairEstimateInProgress() throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndClickable(RepairEstimateInProgress);
        WebElementActions.getActions(driver).clickElement(RepairEstimateInProgress);

          waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * click on Clear Location Filters button
     */
      public void clickOnClearLocationFilter() throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndClickable(ClearLocationFilters);
        WebElementActions.getActions(driver).clickElement(ClearLocationFilters);

          waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     *   verify pending estimate with loaction and unit number
     */
      public void verifyPendingEstimate() throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndIsVisible(shop_location.get(0));
        Assert.assertTrue(shop_location.get(0).isDisplayed());
        Assert.assertTrue(unitNumber.get(0).isDisplayed());
        Assert.assertTrue(pending_Estimate.isDisplayed());
    }
    /**
     * click on Estimate Status dropdown
     */
      public void clickOnEstimateStatusDropdown() throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndClickable(estimateStatusDropdown);
        WebElementActions.getActions(driver).clickElement(estimateStatusDropdown);

    }
    /**
     * click on Pending approval checkbox
     */
      public void clickOnPendingApprovalCheckbox() throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndClickable(checkBox_pendingApproval);
        WebElementActions.getActions(driver).clickElement(checkBox_pendingApproval);
    }
    /**
     * click on search button
     */
      public void clickOnSearch() throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndClickable(search_btn);
        WebElementActions.getActions(driver).clickElement(search_btn);
    }
    /**
     * click on Estimate number
     */
      public void clickOnEstimatenumber() throws InterruptedException {

          waitMethods.waitForElementToBeRefreshedAndClickable(estimate_Number);
          WebElementActions.getActions(driver).clickElement(estimate_Number);

          waitMethods.loadingWait(loder);
          TestListener.saveScreenshotPNG(driver);

    }
    /**
     * click on Approve button
     */
      public void clickonApproveButton() throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndClickable(approve_btn);
        WebElementActions.getActions(driver).clickElement(approve_btn);

          waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     *  Approve an estimate
     */
      public void approveAnEstimate() throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndClickable(ApproveEstimate);
        WebElementActions.getActions(driver).clickElement(ApproveEstimate);

          waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }

    /**
     * Click on Sign out
     */
        public void clickOnSignOut() throws InterruptedException {
            waitMethods.waitForElementToBeRefreshedAndClickable(btn_signOut);
          WebElementActions.getActions(driver).clickElement(btn_signOut);

            waitMethods.loadingWait(loder);
          TestListener.saveScreenshotPNG(driver);
      }
    /**
     *  Enter Techbadge
     */
      public void enterTechbadge() throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndClickable(search_techBudge);
        WebElementActions.getActions(driver).inputText(search_techBudge, appProp.getProperty("TechBadge"));
    }
    /**
     *  click on go
     */
      public void clickOnGo() throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndClickable(btn_go);
        WebElementActions.getActions(driver).clickElement(btn_go);

          waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * click on More Unit
     */
      public void clickMoreUnit() throws InterruptedException {
        Thread.sleep(8000);
        if (btn_assignedWork.size() > 0) {
            waitMethods.waitForElementToBeRefreshedAndClickable(btn_assignedWork.get(0));
            WebElementActions.getActions(driver).clickElement(btn_assignedWork.get(0));

            waitMethods.loadingWait(loder);
            TestListener.saveScreenshotPNG(driver);
        }
        Thread.sleep(2000);
          waitMethods.waitForElementToBeRefreshedAndClickable(btn_MoreUnits);
        WebElementActions.getActions(driver).clickElement(btn_MoreUnits);

          waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);

    }
    /**
     * enter unit in search box
     */
      public void enterUnit() throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndClickable(search_Unit);
        WebElementActions.getActions(driver).inputText(search_Unit, appProp.getProperty("unitNumber"));
    }
    /**
     * click on select button
     */
      public void clickOnSelectButtton() throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndClickable(selectBtn);
        WebElementActions.getActions(driver).clickElement(selectBtn);
    }
    /**
     * Extra Step - If labour not present/display
     */
      public void addWorkRequired() throws InterruptedException {
        Thread.sleep(15000);
        if(LabourRequired.size()>0){

            waitMethods.waitForElementToBeRefreshedAndClickable(btn_moreWork);
            WebElementActions.getActions(driver).clickElement(btn_moreWork);

            waitMethods.waitForElementToBeRefreshedAndClickable(tab_VMRS);
            WebElementActions.getActions(driver).clickElement(tab_VMRS);

            waitMethods.waitForElementToBeRefreshedAndClickable(search_text);
            WebElementActions.getActions(driver).inputText(search_text,appProp.getProperty("FirstLaborItem"));

            waitMethods.waitForElementToBeRefreshedAndClickable(FirstLabour_img);
            WebElementActions.getActions(driver).clickElement(FirstLabour_img);

            waitMethods.waitForElementToBeRefreshedAndClickable(plusIcon);
            WebElementActions.getActions(driver).clickElement(plusIcon);

            waitMethods.waitForElementToBeRefreshedAndClickable(btnAdd);
            WebElementActions.getActions(driver).clickElement(btnAdd);

        }
    }
    /**
     * Extra Step
     */
      public void clickWorkRequired() throws InterruptedException {

          waitMethods.waitForElementToBeRefreshedAndClickable(img_workRequired);
        WebElementActions.getActions(driver).clickElement(img_workRequired);
    }
    /**
     * click on Parts Tab
     */
      public void clickOnPartsTab() throws InterruptedException {

          waitMethods.waitForElementToBeRefreshedAndClickable(parts_tab);
        WebElementActions.getActions(driver).clickElement(parts_tab);

          waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * Enter Part number
     */
      public void enterPartnumber() throws InterruptedException {
        WebElementActions.getActions(driver).inputText(txt_part, appProp.getProperty("PartName"));
          waitMethods.waitForElementToBeRefreshedAndClickable(listOfElement);
        Thread.sleep(2000);
        WebElementActions.getActions(driver).clickElement(listOfElement);
    }
    /**
     * click on Issue Part
     */
      public void clickOnIssuePart() throws InterruptedException {

          waitMethods.waitForElementToBeRefreshedAndClickable(btn_IssuePart);
        WebElementActions.getActions(driver).clickElement(btn_IssuePart);

        waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * verify element
     */
      public void verifyElement(){

      }



}
