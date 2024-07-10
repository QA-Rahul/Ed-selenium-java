package tests.Ticket;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import tests.TestDriverActions;

@Listeners({utils.TestListener.class})
@Epic("Testing")
@Feature("Make And Models BeComing In Active LOTSVENTURES")

public class MakeAndModelsBeComingInActiveLOTSVENTURES extends TestDriverActions {

    @Test(priority=0,description="T_001_go to Standard Codes Screen",enabled=true)
    @Description("Test Description - go to Standard Codes Screen")
    public void T_001_gotoStandardCodesScreen() throws InterruptedException {
        loginPage.loginWithValidCredentials(appProp67.getProperty("username"),appProp67.getProperty("password"));
        makAndModels.gotoStandardCodesScreen();
    }

    @Test(priority=1,description="T_002_verify title Standard Codes",enabled=true)
    @Description("Test Description - verify title Standard Codes")
    public void T_002_verifyTitleStandardCodes() throws InterruptedException {
        makAndModels.verifyTitleStandardCodes();
    }

    @Test(priority=2,description="T_003_verify text Things To Do",enabled=true)
    @Description("Test Description - verify text Things To Do")
    public void T_003_verifytextThingsToDo() throws InterruptedException {
        makAndModels.verifytextThingsToDo();
    }

    @Test(priority=3,description="T_004_verify title Repair Order Types",enabled=true)
    @Description("Test Description - verify title Repair Order Types")
    public void T_004_verifyTitleRepairOrderTypes() throws InterruptedException {
        makAndModels.verifyTitleRepairOrderTypes();
    }

    @Test(priority=4,description="T_005_verify add button",enabled=true)
    @Description("Test Description - verify add button")
    public void T_005_verifyAddButton() throws InterruptedException{
          makAndModels.verifyAddButton();
    }

    @Test(priority=5,description="T_006_verify link Manage Equipment Codes",enabled=true)
    @Description("Test Description - verify link Manage Equipment Codes")
    public void T_006_verifyLinkManageEquipmentCodes() throws InterruptedException{
        makAndModels.verifyLinkManageEquipmentCodes();
    }

    @Test(priority=6,description="T_007_click on link Manage Equipment Codes",enabled=true)
    @Description("Test Description - click on link Manage Equipment Codes")
    public void T_007_clickOnLinkManagementEquipmentCodes() throws InterruptedException{
        makAndModels.clickOnLinkManagementEquipmentCodes();
    }
    @Test(priority=7,description="T_008_verify various tab in Standard Code",enabled=true)
    @Description("Test Description - verify various tab in Standard Code")
    public void T_008_verifyVariousTab() throws InterruptedException{
        makAndModels.verifyVariousTab();
    }

    @Test(priority=8,description="T_009_verify title class",enabled=true)
    @Description("Test Description - verify title class")
    public void T_009_verifyTitleClass() throws InterruptedException{
        makAndModels.verifyTitleClass();
    }

    @Test(priority=9,description="T_010_verify add button",enabled=true)
    @Description("Test Description - verify add button")
    public void T_010_verifyAddBtn() throws InterruptedException{
        makAndModels.verifyAddBtn();
    }

    @Test(priority=10,description="T_011_verify class column",enabled=true)
    @Description("Test Description - verify class column")
    public void T_011_verifyClassColumn() throws InterruptedException{
        makAndModels.verifyClassColumn();
    }
    @Test(priority=11,description="T_012_click on make and model",enabled=true)
    @Description("Test Description - click on make and model")
    public void T_012_clickOnMakeandModel() throws InterruptedException{
        makAndModels.clickOnMakeandModel();
    }

    @Test(priority=12,description="T_013_verify radio button with names",enabled=true)
    @Description("Test Description - verify radio button with names")
    public void T_013_verifyRadioButtonName() throws InterruptedException{
        makAndModels.verifyRadioButtonName();
    }
    @Test(priority=13,description="T_014_verify title Makes",enabled=true)
    @Description("Test Description - verify title Makes")
    public void T_014_verifyTitleMakes() throws InterruptedException{
        makAndModels.verifyTitleMakes();
    }

    @Test(priority=14,description="T_015_verify column of makes table",enabled=true)
    @Description("Test Description - verify column of makes table")
    public void T_015_verifyColumnOftable() throws InterruptedException{
        makAndModels.verifyColumnOftable();
    }
    @Test(priority=15,description="T_016_verify name of makes and checkbox of second row",enabled=true)
    @Description("Test Description - verify name of makes and checkbox of second row")
    public void T_016_verifySecondRow() throws InterruptedException{
        makAndModels.verifySecondRow();
    }

    @Test(priority=16,description="T_017_click on name of Makes",enabled=true)
    @Description("Test Description - click on name of Makes")
    public void T_017_clickOfNameMakes() throws InterruptedException{
        makAndModels.clickOfNameMakes();
    } @Test(priority=17,description="T_018_click on check box of second row name",enabled=true)
    @Description("Test Description - click on check box of second row name")
    public void T_018_clickOnCheckBoxSecondRow() throws InterruptedException{
        makAndModels.clickOnCheckBoxSecondRow();
    }

    @Test(priority=18,description="T_019_click on fourth row",enabled=true)
    @Description("Test Description - click on fourth row")
    public void T_019_clickOnFourthRow() throws InterruptedException{
        makAndModels.clickOnFourthRow();
    }
    @Test(priority=19,description="T_020_click on Features and Values tab",enabled=true)
    @Description("Test Description - click on Features and Values tab")
    public void T_020_clickOnFeaturesAndValueTab() throws InterruptedException{
        makAndModels.clickOnFeaturesAndValueTab();
    }

    @Test(priority=20,description="T_021_verify title Features Codes",enabled=true)
    @Description("Test Description - verify title Features Codes")
    public void T_021_verifyTitleFeaturesCodes() throws InterruptedException{
        makAndModels.verifyTitleFeaturesCodes();
    }

    @Test(priority=21,description="T_022_verify Feature Code Table column",enabled=true)
    @Description("Test Description - verify Feature Code Table column")
    public void T_022_verifyFeatureCodeTableCol() throws InterruptedException{
        makAndModels.verifyFeatureCodeTableCol();
    }

    @Test(priority=22,description="T_023_click on Features and values of fourth row ",enabled=true)
    @Description("Test Description - click on Features and values of fourth row")
    public void T_023_clickOnFourthRowOfFeatures() throws InterruptedException{
        makAndModels.clickOnFourthRowOfFeatures();
    }

    @Test(priority=23,description="T_024_verify title Features Values",enabled=true)
    @Description("Test Description - verify title Features Values")
    public void T_024_verifyTitleFeaturesValues() throws InterruptedException{
        makAndModels.verifyTitleFeaturesValues();
    }

    @Test(priority=24,description="T_025_verify Features Values table column",enabled=true)
    @Description("Test Description - verify Features Values table column")
    public void T_025_verifyFeaturesValueTableCol() throws InterruptedException{
        makAndModels.verifyFeaturesValueTableCol();
    }
    @Test(priority=25,description="T_026_click on Value Column",enabled=true)
    @Description("Test Description - click on Value Column")
    public void T_026_clickOnValueColumn() throws InterruptedException{
        makAndModels.clickOnValueColumn();
    }

    @Test(priority=26,description="T_027_click on Active Column of Features Value",enabled=true)
    @Description("Test Description - click on Active Column of Features Value")
    public void T_027_clickOnActiveColumn() throws InterruptedException{
        makAndModels.clickOnActiveColumn();
    }

    @Test(priority=27,description="T_028_click on tab Maintaince Groups",enabled=true)
    @Description("Test Description - click on tab Maintaince Groups")
    public void T_028_clickOnTabMaintainceGroups() throws InterruptedException{
        makAndModels.clickOnTabMaintainceGroups();
    }

    @Test(priority=28,description="T_029_verify title Maintaince Groups",enabled=true)
    @Description("Test Description - verify title Maintaince Groups")
    public void T_029_verifyTitleMaintaince() throws InterruptedException{
        makAndModels.verifyTitleMaintaince();
    }
    @Test(priority=29,description="T_030_verify Maintaince Table column",enabled=true)
    @Description("Test Description - verify Maintaince Table column")
    public void T_030_verifyMaintainceTableColumn() throws InterruptedException{
        makAndModels.verifyMaintainceTableColumn();
    }

    @Test(priority=30,description="T_031_click on third row of maintaince",enabled=true)
    @Description("Test Description - click on third row of maintaince")
    public void T_031_clickOnThirdRowOfMaintaince() throws InterruptedException{
        makAndModels.clickOnThirdRowOfMaintaince();
    }

    @Test(priority=31,description="T_032_click on link manage part codes",enabled=true)
    @Description("Test Description - click on link manage part codes")
    public void T_032_clickOnLinkManagePartCodes() throws InterruptedException{
        makAndModels.clickOnLinkManagePartCodes();
    }
    @Test(priority=32,description="T_033_verify title Product Groups",enabled=true)
    @Description("Test Description - verify title Product Groups")
    public void T_033_verifyTitleProductGroups() throws InterruptedException{
        makAndModels.verifyTitleProductGroups();
    }

    @Test(priority=33,description="T_034_verify Product Code table column",enabled=true)
    @Description("Test Description - verify Product Code table column")
    public void T_034_verifyProductCodeColumn() throws InterruptedException{
        makAndModels.verifyProductCodeColumn();
    }

    @Test(priority=34,description="T_035_verify first row of Product table",enabled=true)
    @Description("Test Description - verify first row of Product table")
    public void T_035_verifyFirstRow() throws InterruptedException{
        makAndModels.verifyFirstRow();
    }

    @Test(priority=35,description="T_036_verify active checkbox present on first row",enabled=true)
    @Description("Test Description - verify active checkbox present on first row")
    public void T_036_verifyFirstCheckbox() throws InterruptedException{
        makAndModels.verifyFirstCheckbox();
    }
    @Test(priority=36,description="T_037_Click on sign out and verify username",enabled=true)
    @Description("Test Description - Click on sign out and verify username")
    public void T_037_clickOnSignOutAndVerifyName() throws InterruptedException{
        makAndModels.clickOnSignOutAndVerifyName();
    }






}
