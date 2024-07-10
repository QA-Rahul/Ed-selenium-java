package pages.Ticket;

import actions.WebElementActions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import tests.TestDriverActions;
import utils.WaitMethods;

import java.util.List;

public class DefectManagerInspectedbyColumnBlank extends TestDriverActions {
    @FindBy(xpath = "(//a[text()='DDP'])[1]")
    WebElement submenu_DDp;
   @FindBy(xpath = "//span[text()='Scan Driver Badge']")
   WebElement txt_Scan_Driver_Badge;

   @FindBy(xpath = "//span[text()='Scan Driver Badge']/following::input[1]")
   WebElement inputBox_DriverBadge;

   @FindBy(xpath = "//div[contains(@id,'sfEnEmp:cbGo')]")
   WebElement btn_go;

   @FindBy(xpath = "//div[contains(@id,'cbSelectUnitLocal')]")
   WebElement btnSelect;

   @FindBy(xpath = "(//span[contains(text(),'Unit Owner')])[1]")
   WebElement colTitle_unitNumber;

   @FindBy(xpath = "(//span[contains(text(),'Unit #')])[1]")
   WebElement colTitle_Unit;
    @FindBy(xpath = "(//span[contains(text(),'VIN / Description')])[1]")
    WebElement colTitle_VIN;
    @FindBy(xpath = "(//span[contains(text(),'Serial Number')])[1]")
    WebElement colTitle_SerialNumber;
    @FindBy(xpath = "(//span[contains(text(),'License Plate')])[1]")
    WebElement colTitle_LicensePlate;
    @FindBy(xpath = "(//span[contains(text(),'Type')])[1]")
    WebElement colTitle_Type;
    @FindBy(xpath = "(//span[contains(text(),'Group')])[1]")
    WebElement colTitle_Group;
    @FindBy(xpath = "(//span[contains(text(),'Domicile Location')])[1]")
    WebElement colTitle_DomicileLocation;
    @FindBy(xpath = "(//span[contains(text(),'Current Location')])[1]")
    WebElement colTitle_CurrentLocation;
    @FindBy(xpath = "//span[text()='Driver Defect Report']")
    WebElement title_DriverDefectReport;
    @FindBy(xpath = "//td[contains(@id,'phM::_afrTtxt')]/div/h1")
    WebElement subtitle_WelcomeRustyAddams;
    @FindBy(xpath="//label[text()='Owner:']")
    WebElement txt_Owner ;
    @FindBy(xpath = "//label[text()='Search:']")
    WebElement txt_Search;
    @FindBy(xpath="//label[text()='Search:']/following::input[1]")
    WebElement txtBox_Search;

    @FindBy(xpath = "//a[contains(@id,'cilvmrsys')]/img")
    WebElement img_firstPart;
    @FindBy(xpath="//a[contains(@id,'ciAddVmrs')]/img")
    WebElement icon_plus;
    @FindBy(xpath="//div[contains(@id,'pslReason::t')]/span")
    WebElement title_reason;
    @FindBy(xpath = "//div[contains(@id,'cb10')]")
    WebElement selectbtnofreason;
    @FindBy(xpath="//td[contains(@id,'pwDefect::tb')]/div")
    WebElement title_airCondition_Modification;
    @FindBy(xpath = "//div[contains(@id,'pslDefect::t')]")
    WebElement airConditionAssembly;

    @FindBy(xpath = "//textarea[contains(@id,'notesKeyboard::content')]")
    WebElement txtarea_notes;
    @FindBy(xpath="//div[contains(@id,'cbDefectCancel')]")
    WebElement btn_cancle_airAssembly;
    @FindBy(xpath = "//div[contains(@id,'cbDefectOk')]")
    WebElement btn_ok_airAssembly;
    @FindBy(xpath="//span[text()='Finish']")
    WebElement btn_finish;
    @FindBy(xpath = "//span[text()='Defect Report Summary']")
    WebElement title_DefectReportSummary;
    @FindBy(xpath="//div[contains(@id,'cb6')]")
    WebElement btnCancle_defectSummaryReport;
    @FindBy(xpath = "//div[contains(@id,'cb7')]")
    List<WebElement> btnSign;
    @FindBy(xpath="//div[contains(@id,'cb28')]")
    WebElement btn_Ok;
    @FindBy(xpath="//span[text()='Signature Inspector']")
    WebElement title_signatureInspector;
    @FindBy(xpath = "//div[contains(@id,'j_idt')]/canvas")
    WebElement signature_box;
    @FindBy(xpath="//div[contains(@id,'cb4')]")
    WebElement cancle_signatureInspector;
    @FindBy(xpath = "//div[contains(@id,'cb5')]")
    WebElement clear_signatureInspector;
    @FindBy(xpath="//div[contains(@id,'cb8')]")
    WebElement ok_signatureInspector;
    @FindBy(xpath = "//a[text()='Fleet']")
    WebElement menu_Fleet;
    @FindBy(xpath = "//td[text()='Defect Manager']")
    WebElement subTitle_defectManager;
    @FindBy(xpath="//span[text()='Defect Manager']")
    WebElement title_DefectManager;
    @FindBy(xpath="//h1[text()='Defect Report History']")
    WebElement subtitle_DefectReportHistory;
    @FindBy(xpath="//span[text()='Unit #']")
    WebElement label_unit;
    @FindBy(xpath="//span[text()='Unit Owner']")
    WebElement label_UnitOwner;
    @FindBy(xpath="//span[text()='Inspection#']")
    WebElement label_Inspection;
    @FindBy(xpath="//span[text()='Inspection Date']")
    WebElement label_InspectionDate;
    @FindBy(xpath="//span[text()='Inspected by']")
    WebElement label_InspectedBy;
    @FindBy(xpath="//span[text()='Inspection Status']")
    WebElement label_InspectionStatus;
    @FindBy(xpath="//span[text()='Defects Reported / Defects Repaired']")
    WebElement Label_DefectsReported_DefectsRepaired;
    @FindBy(xpath="//span[text()='Rectified RO#']")
    WebElement label_RectifiedRO;
    @FindBy(xpath="//td[contains(@id,'c24')]")
    WebElement list_inspectedBy;
    @FindBy(xpath = "//span[text()='Sign Out']")
    WebElement btn_signOut;
    @FindBy(xpath= "//input[@name='username']")
    WebElement txtbox_username;
    @FindBy(xpath="//a[contains(@id,'cilvmrsys')]/img")
    WebElement icon_vehiclePart;

     public DefectManagerInspectedbyColumnBlank(WebDriver driver){
         this.driver = driver;
         this.waitMethods = new WaitMethods(driver);
     }



    /*
         click on DDT subMenu
     */
    public void clickOnDDT() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(submenu_DDp);
        WebElementActions.getActions(driver).clickElement(submenu_DDp);
    }
    /*
        verify scan driver badge
     */
    public void verifyScanDriverBadge() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_Scan_Driver_Badge);
        Assert.assertTrue(txt_Scan_Driver_Badge.isDisplayed());
        Assert.assertTrue(inputBox_DriverBadge.isDisplayed());
    }
    /*
        enter driver badge
     */
    public void enterDriverBadge() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(inputBox_DriverBadge);
        WebElementActions.getActions(driver).inputText(inputBox_DriverBadge,appProp46.getProperty("driverBadge"));
    }
    /*
      click on Go button
     */
    public void clickOnGo() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(btn_go);
        WebElementActions.getActions(driver).clickElement(btn_go);
    }
    /*
        verify  Unit Number column name
     */
    public void verifyUnitNumber() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(colTitle_unitNumber);
        Assert.assertTrue(colTitle_unitNumber.isDisplayed());
    }
    /*
        verify Unit column name
     */
    public void verifyUnit() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(colTitle_Unit);
        Assert.assertTrue(colTitle_Unit.isDisplayed());
    }
    /*
        verify VIN column name
     */
    public void verifyVin() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(colTitle_VIN);
        Assert.assertTrue(colTitle_VIN.isDisplayed());
    }
    /*
        verify Serial Number column name
     */
    public void verifySerialNumber() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(colTitle_SerialNumber);
        Assert.assertTrue(colTitle_SerialNumber.isDisplayed());
    }
    /*
        verify License Plate column name
     */
    public void verifyLicensePlate() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(colTitle_LicensePlate);
        Assert.assertTrue(colTitle_LicensePlate.isDisplayed());
    }
    /*
        verify type column name
     */
    public void verifyType() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(colTitle_Type);
        Assert.assertTrue(colTitle_Type.isDisplayed());
    }
    /*
        verify group column name
     */
    public void verifyGroup() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(colTitle_Group);
        Assert.assertTrue(colTitle_Group.isDisplayed());
    }
    /*
        verify Domicile location column name
     */
    public void verifyDomicileLocation() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(colTitle_DomicileLocation);
        Assert.assertTrue(colTitle_DomicileLocation.isDisplayed());
    }
    /*
        verify current location column name
     */
    public void verifyCurrentLocation() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(colTitle_CurrentLocation);
        Assert.assertTrue(colTitle_CurrentLocation.isDisplayed());
    }
    /*
    click on select
     */
    public void clickonSelect() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(btnSelect);
        WebElementActions.getActions(driver).clickElement(btnSelect);
    }
    /*
       verify title
     */
    public void verifyTitle() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(title_DriverDefectReport);
        Assert.assertTrue(title_DriverDefectReport.isDisplayed());
    }
    /*
       verify subtitle with driver name
     */
    public void verifySubTitle() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(subtitle_WelcomeRustyAddams);
        Assert.assertTrue(subtitle_WelcomeRustyAddams.isDisplayed());
    }
    /*
      verify owner
     */
    public void verifyOwner() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_Owner);
        Assert.assertTrue(txt_Owner.isDisplayed());
    }
    /*
    verify search field is present
     */
    public void verifySearchBox() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_Search);
        Assert.assertTrue(txt_Search.isDisplayed());
        Assert.assertTrue(txtBox_Search.isDisplayed());
    }
    /*
        enter any part name
     */
    public void enterPartName() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(txtBox_Search);
        WebElementActions.getActions(driver).inputText(txtBox_Search,appProp46.getProperty("FirstPart"));
    }
    /*
        click on part image
     */
    public void clickOnImage() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(img_firstPart);
        WebElementActions.getActions(driver).clickElement(img_firstPart);
    }
    /*
      click on plus icon
     */
    public void clickOnPlusIcon() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(icon_plus);
        WebElementActions.getActions(driver).clickElement(icon_plus);
    }
    /*
       verify reason title present
     */
    public void verifyTitleReason() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(title_reason);
        Assert.assertTrue(title_reason.isDisplayed());
    }
    /*
        click on select button
     */
    public void clickonselectButton() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(selectbtnofreason);
        WebElementActions.getActions(driver).clickElement(selectbtnofreason);
    }
    /*
      verify air condition/modification
     */
    public void verifyAirCondition_Modification() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(title_airCondition_Modification);
        Assert.assertTrue(title_airCondition_Modification.isDisplayed());
    }
    /*
       verify title Air Condition Assembly
     */
    public void verifyAirConditionAssembly() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(airConditionAssembly);
        Assert.assertTrue(airConditionAssembly.isDisplayed());
    }
    /*
      verify notes area
     */
    public void verifyNotesArea() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(txtarea_notes);
        Assert.assertTrue(txtarea_notes.isDisplayed());
    }
    /*
       Enter notes
     */
    public void enterNotes() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(txtarea_notes);
        WebElementActions.getActions(driver).inputText(txtarea_notes,"This is test driver");
    }
    /*
        verify cancle and ok button
     */
    public void verifyCancleOkbutton() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(btn_cancle_airAssembly);
        Assert.assertTrue(btn_cancle_airAssembly.isDisplayed());
        Assert.assertTrue(btn_ok_airAssembly.isDisplayed());
    }
    /*
     click on Ok button
     */
    public void clickOnOk() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(btn_ok_airAssembly);
        WebElementActions.getActions(driver).clickElement(btn_ok_airAssembly);
    }
    /*
        click on finish button
     */
    public void clickOnFinish() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(btn_finish);
        WebElementActions.getActions(driver).clickElement(btn_finish);
    }
    /*
      verify title Defect Report Summary
     */
    public void verifyDefectReportSummary() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(title_DefectReportSummary);
        Assert.assertTrue(title_DefectReportSummary.isDisplayed());
    }
    /*
       verify cancle and ok button of Defect Report Summary
    */
    public void verifyCancleSignButton() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(btnCancle_defectSummaryReport);
        Assert.assertTrue(btnCancle_defectSummaryReport.isDisplayed());
        if(btnSign.size() > 0) {
            Assert.assertTrue(btnSign.get(0).isDisplayed());
        } else {
            Assert.assertTrue(btn_Ok.isDisplayed());
        }
    }
    /*
    click on Ok button
    */
    public void clickOnOKbtn() throws InterruptedException {
        Thread.sleep(8000);
         if(btnSign.size() > 0) {
             waitMethods.waitForElementToBeRefreshedAndClickable(btnSign.get(0));
             WebElementActions.getActions(driver).clickElement(btnSign.get(0));

             waitMethods.waitForElementToBeRefreshedAndIsVisible(title_signatureInspector);
             Assert.assertTrue(title_signatureInspector.isDisplayed());

             waitMethods.waitForElementToBeRefreshedAndIsVisible(signature_box);
             Assert.assertTrue(signature_box.isDisplayed());
             waitMethods.waitForElementToBeRefreshedAndIsVisible(cancle_signatureInspector);
             Assert.assertTrue(cancle_signatureInspector.isDisplayed());
             Assert.assertTrue(clear_signatureInspector.isDisplayed());
             Assert.assertTrue(ok_signatureInspector.isDisplayed());

              Thread.sleep(3000);

              Actions action = new Actions(driver);
             Action signature = action.moveToElement(signature_box,100,50)
                     .clickAndHold()
                     .moveByOffset(150,50)
                     .click()
                     .build();
                     signature.perform();

             Thread.sleep(3000);
             waitMethods.waitForElementToBeRefreshedAndClickable(ok_signatureInspector);
             WebElementActions.getActions(driver).clickElement(ok_signatureInspector);
         }
          else {
             waitMethods.waitForElementToBeRefreshedAndClickable(btn_Ok);
             WebElementActions.getActions(driver).clickElement(btn_Ok);
         }
    }
    /*
      verify title signature Inspector
     */
    public void verifytitle_signatureInspector() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(title_signatureInspector);
        Assert.assertTrue(title_signatureInspector.isDisplayed());
    }
    /*
     verify  signature box
    */
    public void verifysignaturebox() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(signature_box);
        Assert.assertTrue(signature_box.isDisplayed());
    }
    /*
      verify cancle, clear and ok button
   */
    public void verifyCancleClearOkBtn() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(cancle_signatureInspector);
        Assert.assertTrue(cancle_signatureInspector.isDisplayed());
        Assert.assertTrue(clear_signatureInspector.isDisplayed());
        Assert.assertTrue(ok_signatureInspector.isDisplayed());

    }
    /*
      click on Ok buttton
     */
    public void clickOnOK() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(ok_signatureInspector);
        WebElementActions.getActions(driver).clickElement(ok_signatureInspector);
    }
    /*
      Go to Defect Manager present in fleet
     */
    public void goToDefectManager() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(menu_Fleet);
        WebElementActions.getActions(driver).clickElement(menu_Fleet);

        waitMethods.waitForElementToBeRefreshedAndClickable(subTitle_defectManager);
        WebElementActions.getActions(driver).clickElement(subTitle_defectManager);
    }
    /*
       verify title Defect manager
     */
    public void VerifytitleDefectManager() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(title_DefectManager);
        Assert.assertTrue(title_DefectManager.isDisplayed());
    }
    /*
       verify subtitle Defect Report History
    */
     public void verifyDefectReportHistory() throws InterruptedException {
         waitMethods.waitForElementToBeRefreshedAndIsVisible(subtitle_DefectReportHistory);
         Assert.assertTrue(subtitle_DefectReportHistory.isDisplayed());
     }
     /*
         verify unit
     */
     public void verifyLabelUnit() throws InterruptedException {
         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_unit);
         Assert.assertTrue(label_unit.isDisplayed());
     }
    /*
       verify UnitOwner
   */
    public void verifylabel_UnitOwner() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(label_UnitOwner);
        Assert.assertTrue(label_UnitOwner.isDisplayed());
    }
    /*
       verify Inspection
   */
    public void verifylabel_Inspection() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(label_Inspection);
        Assert.assertTrue(label_Inspection.isDisplayed());
    }
    /*
      verify InspectionDate
   */
    public void verifylabel_InspectionDate() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(label_InspectionDate);
        Assert.assertTrue(label_InspectionDate.isDisplayed());
    }
    /*
     verify Inspected By
  */
    public void verifylabel_InspectedBy() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(label_InspectedBy);
        Assert.assertTrue(label_InspectedBy.isDisplayed());
    }
    /*
    verify Inspection Status
   */
    public void verifylabel_InspectionStatus() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(label_InspectionStatus);
        Assert.assertTrue(label_InspectionStatus.isDisplayed());
    }
    /*
   verify Defects Reported Defects Repaired
   */
    public void verifyDefectsReported_DefectsRepaired() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(Label_DefectsReported_DefectsRepaired);
        Assert.assertTrue(Label_DefectsReported_DefectsRepaired.isDisplayed());
    }
    /*
    verify Rectified RO
   */
    public void verifyRectifiedRO() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(label_RectifiedRO);
        Assert.assertTrue(label_RectifiedRO.isDisplayed());
    }
    /*
    verify inspected By
   */
    public void verifylist_inspectedBy() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(list_inspectedBy);
        Assert.assertTrue(list_inspectedBy.isDisplayed());

        String driverName= list_inspectedBy.getText();
        System.out.println("Inspected by :"+driverName);
    }
    /*
    click on sign out
     */
    public void clickOnSignOut() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(btn_signOut);
        WebElementActions.getActions(driver).clickElement(btn_signOut);
    }
    /*
    verify username
    */
     public void verifyUsername() throws InterruptedException {
         waitMethods.waitForElementToBeRefreshedAndIsVisible(txtbox_username);
         Assert.assertTrue(txtbox_username.isDisplayed());
     }



}
