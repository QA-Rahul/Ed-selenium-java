package tests.Ticket;

import actions.LoginActions;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import tests.TestDriverActions;

import java.io.FileNotFoundException;

@Listeners({utils.TestListener.class})
@Epic("Testing")
@Feature("Defect Manager Inspected by Column Blank")

public class DefectManagerInspectedbyColumnBlank extends TestDriverActions {

   @Test(priority=0,description="T_001_Enter valid credentials",enabled=true)
   @Description("Test Description: Enter valid credentials")
   public void T_001_gotoLogin() throws InterruptedException {
       loginPage.loginWithValidCredentials(appProp46.getProperty("username"),appProp46.getProperty("password"));
       defectmanager.clickOnDDT();
   }

    @Test(priority=1,description="T_002_Verify Scan Driver Badge present",enabled=true)
    @Description("Test Description: Verify Scan Driver Badge present")
    public void T_002_verifyScanDriverBadge() throws InterruptedException {
        defectmanager.verifyScanDriverBadge();
    }
   @Test(priority=2,description="T_003_Login with badge driver",enabled=true)
   @Description("Test Description: Login with badge driver")
    public void T_003_LoginwithBadgeDriver() throws InterruptedException {
       defectmanager.enterDriverBadge();
   }
   @Test(priority=3,description="T_004_click on go button")
   @Description("Test Description: click on go button")
    public void T_004_clickOnGo() throws InterruptedException{
       defectmanager.clickOnGo();
   }

   @Test(priority=4,description="T_005_verify Unit Number ",enabled=true)
    @Description("Test Description: verify Unit Number")
    public void T_005_verifyUnitNumber() throws InterruptedException {
       defectmanager.verifyUnitNumber();
   }
    @Test(priority=5,description="T_006_verify Unit",enabled=true)
    @Description("Test Description: verify Unit")
    public void T_006_verifyUnit() throws InterruptedException {
          defectmanager.verifyUnit();
    }
    @Test(priority=6,description="T_007_verify Vin  ",enabled=true)
    @Description("Test Description: verify Vin")
    public void T_007_verifyVin() throws InterruptedException{
        defectmanager.verifyVin();
    }@Test(priority=7,description="T_008_Verify serial Number",enabled=true)
    @Description("Test Description: verify serial Number")
    public void T_008_verifySerialNumber() throws InterruptedException{
        defectmanager.verifySerialNumber();
    }
    @Test(priority=8,description="T_009_Verify liscense Plate",enabled=true)
    @Description("Test Description: verify liscense Plate")
    public void T_009_verifyLiscensePlate() throws InterruptedException{
        defectmanager.verifyLicensePlate();
    }
    @Test(priority=9,description="T_010_Verify type",enabled=true)
    @Description("Test Description: verify type")
    public void T_010_verifyType() throws InterruptedException{
        defectmanager.verifyType();
    }
    @Test(priority=10,description="T_011_verify group",enabled=true)
    @Description("Test Description: verify group")
    public void T_011_verifyGroup() throws InterruptedException{
        defectmanager.verifyGroup();
    }
    @Test(priority=11,description="T_012_verify domicile location",enabled=true)
    @Description("Test Description: verify domicile location")
    public void T_012_verifyDomicileLocation() throws InterruptedException{
        defectmanager.verifyDomicileLocation();
    }
   @Test(priority=12,description="T_013_verify currrent location",enabled=true)
    @Description("Test Description: verify currrent location")
    public void T_013_verifyCurrrentLocation() throws InterruptedException{
        defectmanager.verifyCurrentLocation();
    }
    @Test(priority=13,description="T_014_Select any unit",enabled=true)
    @Description("Test Description: Select any unit")
    public void T_014_selectAnyUnit() throws InterruptedException {
        defectmanager.clickonSelect();
    }
    @Test(priority=14,description="T_015_Verify driver defect report",enabled=true)
    @Description("Test Description: Verify driver defect report")
    public void T_015_verifyDriverDefectReport() throws InterruptedException{
         defectmanager.verifyTitle();
    }
     @Test(priority=15,description="T_016_verify WelCome to driver subtitle",enabled=true)
    @Description("Test Description:verify WelCome to driver subtitle")
    public void T_016_verifySubTitle() throws InterruptedException{
         defectmanager.verifySubTitle();
    }
    @Test(priority=16,description="T_017_verify Owner",enabled=true)
    @Description("Test Description:verify Owner")
    public void T_017_verifyOwner() throws InterruptedException{
         defectmanager.verifyOwner();
    }
    @Test(priority=17,description="T_018_verify search text",enabled=true)
    @Description("Test Description:verify search text")
    public void T_018_verifySearchBox() throws InterruptedException{
         defectmanager.verifySearchBox();
    }
    @Test(priority=18,description="T_019_Enter part name in search",enabled=false)
    @Description("Test Description:Enter part name in search")
    public void T_019_enterPartName() throws InterruptedException{
         defectmanager.enterPartName();
    }
    @Test(priority=19,description="T_020_click on part image",enabled=true)
    @Description("Test Description: click on part image")
    public void T_020_clickonPartImg() throws InterruptedException {
        defectmanager.clickOnImage();
    }
    @Test(priority=20,description="T_021_click on plus icon",enabled=true)
    @Description("Test Description: click on plus icon")
    public void T_021_clickOnPlusIcon() throws InterruptedException {
        defectmanager.clickOnPlusIcon();
    }
    @Test(priority=21,description="T_022_verify title Reason  ",enabled=true)
    @Description("Test Description: verify title Reason")
    public void T_022_verifyTitleReason() throws InterruptedException {
         defectmanager.verifyTitleReason();
    }
    @Test(priority=22,description="T_023_click on select button of reason",enabled=true)
    @Description("Test Description: click on select button of reason")
    public void T_023_clickonselectButton() throws InterruptedException {
          defectmanager.clickonselectButton();
    }
    @Test(priority=23,description="T_024_verify the title of Air condition and modofication",enabled=true)
    @Description("Test Description: verify the title of Air condition and modofication")
    public void T_024_verifyAirCondition_Modification() throws InterruptedException {
        defectmanager.verifyAirCondition_Modification();
    }
    @Test(priority=24,description="T_025_Verify subtitle Air Condition Assembly",enabled=true)
    @Description("Test Description:Verify subtitle Air Condition Assembly")
    public void T_025_verifyAirConditionAssembly() throws InterruptedException {
       defectmanager.verifyAirConditionAssembly();
    }
    @Test(priority=25,description="T_026_verify notes area",enabled=true)
    @Description("Test Description: verify notes area")
    public void T_026_verifyNotesArea() throws InterruptedException {
        defectmanager.verifyNotesArea();
    }
    @Test(priority=26,description="T_027_enter notes in textarea",enabled=true)
    @Description("Test Description: enter notes in textarea")
    public void T_027_enterNotes() throws InterruptedException {
        defectmanager.enterNotes();
    }
    @Test(priority=27,description="T_028_verify cancle and ok button",enabled=true)
    @Description("Test Description: verify cancle and ok button")
    public void T_028_verifyCancleOkbutton() throws InterruptedException {
        defectmanager.verifyCancleOkbutton();
    }
    @Test(priority=28,description="T_029_click on Ok button",enabled=true)
    @Description("Test Description:click on Ok button")
    public void T_029_clickOnOk() throws InterruptedException {
        defectmanager.clickOnOk();
    }
    @Test(priority=29,description="T_030_click on Finish button",enabled=true)
    @Description("Test Description: click on Finish button")
    public void T_030_clickOnFinish() throws InterruptedException {
        defectmanager.clickOnFinish();
    }
    @Test(priority=30,description="T_031_verify title Defect Report Summary",enabled=true)
    @Description("Test Description: verify title Defect Report Summary")
    public void T_031_verifyDefectReportSummary() throws InterruptedException {
         defectmanager.verifyDefectReportSummary();
    }
    @Test(priority=31,description="T_032_verify cancle and ok button of Defect Report Summary",enabled=true)
    @Description("Test Description:verify cancle and ok button of Defect Report Summary")
    public void T_032_verifyCancleSignButton() throws InterruptedException {
         defectmanager.verifyCancleSignButton();
    }
    @Test(priority=32,description="T_033_click on sign tab",enabled=true)
    @Description("Test Description: click on sign tab")
    public void T_033_clickOnSign() throws InterruptedException {
          defectmanager.clickOnOKbtn();
    }
    @Test(priority=33,description="T_034_verify title signature Inspector",enabled=false)
    @Description("Test Description: verify title signature Inspector")
    public void T_034_verifytitle_signatureInspector() throws InterruptedException {
          defectmanager.verifytitle_signatureInspector();
    }
    @Test(priority=34,description="T_035_verify signature box",enabled=false)
    @Description("Test Description: verify  signature box")
    public void T_035_() throws InterruptedException {
         defectmanager.verifysignaturebox();
    }
    @Test(priority=35,description="T_036_verify cancle, clear and ok button",enabled=false)
    @Description("Test Description: verify cancle, clear and ok button")
    public void T_036_() throws InterruptedException {
         defectmanager.verifyCancleClearOkBtn();
    }
    @Test(priority=36,description="T_037_click on Ok buttton",enabled=false)
    @Description("Test Description: click on Ok buttton")
    public void T_037_() throws InterruptedException {
         defectmanager.clickOnOK();
    }
    @Test(priority=37,description="T_038_Go to Defect Manager present in fleet",enabled=true)
    @Description("Test Description: Go to Defect Manager present in fleet")
    public void T_038_() throws InterruptedException {
         defectmanager.goToDefectManager();
    }
    @Test(priority=38,description="T_039_verify title Defect manager",enabled=true)
    @Description("Test Description:verify title Defect manager")
    public void T_039_VerifytitleDefectManager() throws InterruptedException{
        defectmanager.VerifytitleDefectManager();
    }
    @Test(priority=39,description="T_040_verify subtitle Defect Report History",enabled=true)
    @Description("Test Description: verify subtitle Defect Report History")
    public void T_040_() throws InterruptedException{
        defectmanager.verifyDefectReportHistory();
    }
    @Test(priority=40,description="T_041_verify unit",enabled=true)
    @Description("Test Description: verify unit")
    public void T_041_verifyUnit() throws InterruptedException{
         defectmanager.verifyLabelUnit();
    }
    @Test(priority=41,description="T_042_verify UnitOwner",enabled=true)
    @Description("Test Description: verify UnitOwner")
    public void T_042_verifylabel_UnitOwner() throws InterruptedException{
         defectmanager.verifylabel_UnitOwner();
    }
    @Test(priority=42,description="T_043_verify Inspection",enabled=true)
    @Description("Test Description:")
    public void T_043_verifylabel_Inspection() throws InterruptedException{
         defectmanager.verifylabel_Inspection();
    }
    @Test(priority=43,description="T_044_verify InspectionDate",enabled=true)
    @Description("Test Description:verify InspectionDate")
    public void T_044_verifylabel_InspectionDate() throws InterruptedException{
         defectmanager.verifylabel_InspectionDate();
    }
    @Test(priority=44,description="T_045_verify Inspected By",enabled=true)
    @Description("Test Description:verify Inspected By")
    public void T_045_verifylabel_InspectedBy() throws InterruptedException{
        defectmanager.verifylabel_InspectedBy();
    }
    @Test(priority=45,description="T_046_verify Inspection Status",enabled=true)
    @Description("Test Description:verify Inspection Status")
    public void T_046_verifylabel_InspectionStatus() throws InterruptedException{
         defectmanager.verifylabel_InspectionStatus();
    }
    @Test(priority=46,description="T_047_verify Defects Reported Defects Repaired",enabled=true)
    @Description("Test Description:verify Defects Reported Defects Repaired")
    public void T_047_verifyDefectsReported_DefectsRepaired() throws InterruptedException{
         defectmanager.verifyDefectsReported_DefectsRepaired();
    }
    @Test(priority=47,description="T_048_verify Rectified RO",enabled=true)
    @Description("Test Description:verify Rectified RO")
    public void T_048_verifyRectifiedRO() throws InterruptedException{
         defectmanager.verifyRectifiedRO();
    }
    @Test(priority=48,description="T_049_verify inspected By",enabled=true)
    @Description("Test Description:verify inspected By")
    public void T_049_verifylist_inspectedBy() throws InterruptedException{
         defectmanager.verifylist_inspectedBy();
    }
    @Test(priority=50,description="T_051_Click on Sign in and verify username",enabled=true)
    @Description("Test Description:Click on Sign in and verify username")
    public void T_051_clickOnSignOut() throws InterruptedException{
         defectmanager.clickOnSignOut();
         defectmanager.verifyUsername();
    }





}
