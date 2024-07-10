package tests.Ticket;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import tests.TestDriverActions;

@Listeners({utils.TestListener.class})
@Epic("Testing")
@Feature("Part Charge Not Opening Consistently")

public class PartChargeNotOpeningConsistently extends TestDriverActions {

    @Test(priority=0,description="T_001_Login the Page and go to Service Board Screen",enabled=true)
    @Description("Test Description - Login the Page and go to Service Board Screen")
    public void T_001_gotoServiceBoard() throws InterruptedException {
        loginPage.loginWithValidCredentials(appProp70.getProperty("username"),appProp70.getProperty("password"));
        partChargeNotOpening.gotoServiceBoard();
    }

    @Test(priority=1,description="T_002_verify title Service Board",enabled=true)
    @Description("Test Description - verify title Service Board")
    public void T_002_verifyTitleServiceBoard() throws InterruptedException {
        partChargeNotOpening.verifyTitleServiceBoard();
    }

    @Test(priority=2,description="T_003_verify title Things To Do",enabled=true)
    @Description("Test Description - verify title Things To Do")
    public void T_003_verifyTitleThingsToDo() throws InterruptedException{
        partChargeNotOpening.verifyTitleThingsToDo();
    }

    @Test(priority=3,description="T_004_verify title Arrivals",enabled=true)
    @Description("Test Description - verify title Arrivals")
    public void T_004_verifyTitleArrivals() throws InterruptedException{
        partChargeNotOpening.verifyTitleArrivals();
    }

    @Test(priority=4,description="T_005_verify link Work In Progress",enabled=true)
    @Description("Test Description - verify link Work In Progress")
    public void T_005_verifyLinkWorkInProgress() throws InterruptedException{
        partChargeNotOpening.verifyLinkWorkInProgress();
    }

    @Test(priority=5,description="T_006_click on link Work In Progress",enabled=true)
    @Description("Test Description - click on link Work In Progress")
    public void T_006_clickWorkInProgress() throws InterruptedException{
        partChargeNotOpening.clickWorkInProgress();
    }

    @Test(priority=6,description="T_007_verify title Work In Progress",enabled=true)
    @Description("Test Description - verify title Work In Progress")
    public void T_007_verifyTitleWorkInProgress() throws InterruptedException{
        partChargeNotOpening.verifyTitleWorkInProgress();
    }

    @Test(priority=7,description="T_008_verify text Location Filters",enabled=true)
    @Description("Test Description - verify text Location Filters")
    public void T_008_verifyTextLocationFilters() throws InterruptedException{
        partChargeNotOpening.verifyTextLocationFilters();
    }
     @Test(priority=8,description="T_009_verify tab Clear Location Filters",enabled=true)
    @Description("Test Description - verify tab Clear Location Filters")
    public void T_009_verifyTabClearLocationFilters() throws InterruptedException{
        partChargeNotOpening.verifyTabClearLocationFilters();
    }

    @Test(priority=9,description="T_010_verify tab Refresh",enabled=true)
    @Description("Test Description - verify tab Refresh")
    public void T_010_verifyTabRefresh() throws InterruptedException{
        partChargeNotOpening.verifyTabRefresh();
    }
     @Test(priority=10,description="T_011_verify WIP Status",enabled=true)
    @Description("Test Description - verify WIP Status")
    public void T_011_verifyWIPStatus() throws InterruptedException{
        partChargeNotOpening.verifyWIPStatus();
    }

    @Test(priority=11,description="T_012_verify Search",enabled=true)
    @Description("Test Description - verify Search")
    public void T_012_verifySearch() throws InterruptedException{
        partChargeNotOpening.verifySearch();
    }
     @Test(priority=12,description="T_013_verify tab Search and New Repair Order",enabled=true)
    @Description("Test Description - verify tab Search and New Repair Order")
    public void T_013_verifyTabSearch_NewRepairOrder() throws InterruptedException{
        partChargeNotOpening.verifyTabSearch_NewRepairOrder();
    }

    @Test(priority=13,description="T_014_ click on tab New Repair Order",enabled=true)
    @Description("Test Description -  click on tab New Repair Order")
    public void T_014_clickOnTabNewRepairOrder() throws InterruptedException{
        partChargeNotOpening.clickOnTabNewRepairOrder();
    }
     @Test(priority=14,description="T_015_verify New Repair Order",enabled=true)
    @Description("Test Description - verify New Repair Order")
    public void T_015_verifyTitleNewRepairOrder() throws InterruptedException{
        partChargeNotOpening.verifyTitleNewRepairOrder();
    }

    @Test(priority=15,description="T_016_verify Location",enabled=true)
    @Description("Test Description - verify Location")
    public void T_016_verifyLocation() throws InterruptedException{
        partChargeNotOpening.verifyLocation();
    }
     @Test(priority=16,description="T_017_verify Search Unit",enabled=true)
    @Description("Test Description - verify Search Unit")
    public void T_017_verifySearchUnit() throws InterruptedException{
        partChargeNotOpening.verifySearchUnit();
    }

    @Test(priority=17,description="T_018_verify button New Unit and Show Advanced Search",enabled=true)
    @Description("Test Description - verify button New Unit and Show Advanced Search")
    public void T_018_verifyNewUnitAndShowAdvancedSearch() throws InterruptedException{
        partChargeNotOpening.verifyNewUnitAndShowAdvancedSearch();
    }
    @Test(priority=18,description="T_019_click on button Select",enabled=true)
    @Description("Test Description - click on button Select")
    public void T_019_clickOnSelectButton() throws InterruptedException{
        partChargeNotOpening.clickOnSelectButton();
    }

    @Test(priority=19,description="T_020_verify title Repair Order",enabled=true)
    @Description("Test Description - verify title Repair Order")
    public void T_020_verifyTitleRepairOrder() throws InterruptedException{
        partChargeNotOpening.verifyTitleRepairOrder();
    }
    @Test(priority=20,description="T_021_verify Location",enabled=true)
    @Description("Test Description - verify Location")
    public void T_021_verifyLocationOfRepairOrder() throws InterruptedException{
        partChargeNotOpening.verifyLocationOfRepairOrder();
    }

    @Test(priority=21,description="T_022_verify Unit Owner of Repair Owner",enabled=true)
    @Description("Test Description - verify Unit Owner of Repair Owner")
    public void T_022_verifyUnitOwnerOfRepairOwner() throws InterruptedException{
        partChargeNotOpening.verifyUnitOwnerOfRepairOwner();
    }
    @Test(priority=22,description="T_023_verify button Labour and Parts",enabled=true)
    @Description("Test Description - verify button Labour and Parts")
    public void T_023_verifyTabLabourParts() throws InterruptedException{
        partChargeNotOpening.verifyTabLabourParts();
    }

    @Test(priority=23,description="T_024_verify Labour",enabled=true)
    @Description("Test Description - verify Labour")
    public void T_024_verifyLabour() throws InterruptedException{
        partChargeNotOpening.verifyLabour();
    }
    @Test(priority=24,description="T_025_verify tabs present on Labour and Parts section",enabled=true)
    @Description("Test Description - verify tabs present on Labour and Parts section")
    public void T_025_verifyTabsOfLabourAndParts() throws InterruptedException{
        partChargeNotOpening.verifyTabsOfLabourAndParts();
    }

    @Test(priority=25,description="T_026_click on Add Labour",enabled=true)
    @Description("Test Description - click on Add Labour")
    public void T_026_clickOnAddLabour() throws InterruptedException{
        partChargeNotOpening.clickOnAddLabour();
    }
    @Test(priority=26,description="T_027_verify title Add Labour",enabled=true)
    @Description("Test Description - verify title Add Labour")
    public void T_027_verifyTitleAddLabour() throws InterruptedException{
        partChargeNotOpening.verifyTitleAddLabour();
    }

    @Test(priority=27,description="T_028_verify Unit Owner of Add Labour",enabled=true)
    @Description("Test Description - verify Unit Owner of Add Labour")
    public void T_028_verifyUnitOwnerOfAddLabour() throws InterruptedException{
        partChargeNotOpening.verifyUnitOwnerOfAddLabour();
    }
    @Test(priority=28,description="T_029_verify Unit",enabled=true)
    @Description("Test Description - verify Unit")
    public void T_029_verifyUnit() throws InterruptedException{
        partChargeNotOpening.verifyUnit();
    }

    @Test(priority=29,description="T_030_verify tabs of Add Labour",enabled=true)
    @Description("Test Description - verify tabs of Add Labour")
    public void T_030_verifyTabsOfAddLabour() throws InterruptedException{
        partChargeNotOpening.verifyTabsOfAddLabour();
    }
    @Test(priority=30,description="T_031_click on VMRS Tab",enabled=true)
    @Description("Test Description - click on VMRS Tab")
    public void T_031_clickOnVMRSTab() throws InterruptedException{
        partChargeNotOpening.clickOnVMRSTab();
    }
    @Test(priority=31,description="T_032_verify text search",enabled=false)
    @Description("Test Description - verify text search")
    public void T_032_verifyTextSearch() throws InterruptedException{
        partChargeNotOpening.verifyTextSearch();
    }
    @Test(priority=32,description="T_033_enter Accessories Group",enabled=true)
    @Description("Test Description - enter Accessories Group")
    public void T_033_enterAccessoriesGroup() throws InterruptedException{
        partChargeNotOpening.enterAccessoriesGroup();
    }

    @Test(priority=33,description="T_034_click on Image Accessories Group",enabled=true)
    @Description("Test Description - click on Image Accessories Group")
    public void T_034_clickOnAccessoriesGroup() throws InterruptedException{
        partChargeNotOpening.clickOnAccessoriesGroup();
    }
    @Test(priority=34,description="T_035_click on Plus Icon",enabled=true)
    @Description("Test Description - click on Plus Icon")
    public void T_035_clickOnPlusIcon() throws InterruptedException{
        partChargeNotOpening.clickOnPlusIcon();
    }

    @Test(priority=35,description="T_036_verify Cancle and OK Tab",enabled=true)
    @Description("Test Description - verify Cancle and OK Tab")
    public void T_036_verifyCancleOKTab() throws InterruptedException{
        partChargeNotOpening.verifyCancleOKTab();
    }
    @Test(priority=36,description="T_037_click on OK Tab",enabled=true)
    @Description("Test Description - click on OK Tab")
    public void T_037_clickOnOKTab() throws InterruptedException{
        partChargeNotOpening.clickOnOKTab();
    }
    @Test(priority=37,description="T_038_click on Add Part",enabled=true)
    @Description("Test Description - click on Add Part")
    public void T_038_clickOnAddPart() throws InterruptedException{
        partChargeNotOpening.clickOnAddPart();
    }
    @Test(priority=38,description="T_039_verify title Issue Part",enabled=true)
    @Description("Test Description - verify title Issue Part")
    public void T_039_verifyTitleIssuePart() throws InterruptedException{
        partChargeNotOpening.verifyTitleIssuePart();
    }
    @Test(priority=39,description="T_040_verify Issue Part fields",enabled=true)
    @Description("Test Description - verify Issue Part fields")
    public void T_040_verifyIssuePartFields() throws InterruptedException{
        partChargeNotOpening.verifyIssuePartFields();
    }
    @Test(priority=40,description="T_041_verify part and quantity field",enabled=true)
    @Description("Test Description - verify part and quantity field")
    public void T_041_verifyPartAndQuantityField() throws InterruptedException{
        partChargeNotOpening.verifyPartAndQuantityField();
    }

    @Test(priority=41,description="T_042_enter Part Number",enabled=true)
    @Description("Test Description - enter Part Number")
    public void T_042_enterPartNumber() throws InterruptedException{
        partChargeNotOpening.enterPartNumber();
    }
    @Test(priority=42,description="T_043_click on Issue Part",enabled=true)
    @Description("Test Description - click on Issue Part")
    public void T_043_clickOnIssuePart() throws InterruptedException{
        partChargeNotOpening.clickOnIssuePart();
    }

    @Test(priority=43,description="T_044_click on close button",enabled=true)
    @Description("Test Description - click on close button")
    public void T_044_clickOnOKButton() throws InterruptedException{
        partChargeNotOpening.clickOnCloseButton();
    }
    @Test(priority=44,description="T_045_click on Add Part",enabled=true)
    @Description("Test Description - click on Add Part")
    public void T_045_clickOnAddPart() throws InterruptedException{
        partChargeNotOpening.clickOnAddPart();
    }

    @Test(priority=45,description="T_046_enter second part",enabled=true)
    @Description("Test Description - enter second part")
    public void T_046_enterSecondPart() throws InterruptedException{
        partChargeNotOpening.enterSecondPart();
    }
    @Test(priority=46,description="T_047_click on Issue Part",enabled=true)
    @Description("Test Description - click on Issue Part")
    public void T_047_clickOnIssuePart() throws InterruptedException{
        partChargeNotOpening.clickOnIssuePart();
    }

    @Test(priority=47,description="T_048_click on close button",enabled=true)
    @Description("Test Description - click on close button")
    public void T_048_clickOnCloseButton() throws InterruptedException{
        partChargeNotOpening.clickOnCloseButton();
    }
    @Test(priority=48,description="T_049_click on link part number",enabled=true)
    @Description("Test Description - click on link part number")
    public void T_049_clickOnLinkPartNumber() throws InterruptedException{
        partChargeNotOpening.clickOnLinkPartNumber();
    }

    @Test(priority=49,description="T_050_verify title Repair Accessories Group",enabled=true)
    @Description("Test Description - verify title Repair Accessories Group")
    public void T_050_verifyTitleRepairAccessoriesGroup() throws InterruptedException{
        partChargeNotOpening.verifyTitleRepairAccessoriesGroup();
    }
    @Test(priority=50,description="T_051_verify Part",enabled=true)
    @Description("Test Description - verify Part")
    public void T_051_verifyPart() throws InterruptedException{
        partChargeNotOpening.verifyPart();
    }

    @Test(priority=51,description="T_052_verify Part Description",enabled=true)
    @Description("Test Description - verify Part Description")
    public void T_052_verifyPartDescription() throws InterruptedException{
        partChargeNotOpening.verifyPartDescription();
    }
    @Test(priority=52,description="T_053_verify Labour",enabled=true)
    @Description("Test Description - verify Labour")
    public void T_053_verifyLabourName() throws InterruptedException{
        partChargeNotOpening.verifyLabourName();
    }

    @Test(priority=53,description="T_054_verify Part Failure",enabled=true)
    @Description("Test Description - verify Part Failure")
    public void T_054_verifyPartFailure() throws InterruptedException{
        partChargeNotOpening.verifyPartFailure();
    }
    @Test(priority=54,description="T_055_verify text Actual Quantity",enabled=true)
    @Description("Test Description - verify text Actual Quantity")
    public void T_055_verifyActualQuantity() throws InterruptedException{
        partChargeNotOpening.verifyActualQuantity();
    }

    @Test(priority=55,description="T_056_verify Unit Cost",enabled=true)
    @Description("Test Description - verify Unit Cost")
    public void T_056_verifyUnitCost() throws InterruptedException{
        partChargeNotOpening.verifyUnitCost();
    }
    @Test(priority=56,description="T_057_verify Charge Quantity",enabled=true)
    @Description("Test Description - verify Charge Quantity")
    public void T_057_verifyChargeQuantity() throws InterruptedException{
        partChargeNotOpening.verifyChargeQuantity();
    }

    @Test(priority=57,description="T_058_verify Unit Charge",enabled=true)
    @Description("Test Description - verify Unit Charge")
    public void T_058_verifyUnitCharge() throws InterruptedException{
        partChargeNotOpening.verifyUnitCharge();
    }
    @Test(priority=58,description="T_059_verify cancle and saveExit button",enabled=true)
    @Description("Test Description - verify cancle and saveExit button")
    public void T_059_verifyCancleSaveExit() throws InterruptedException{
        partChargeNotOpening.verifyCancleSaveExit();
    }

    @Test(priority=59,description="T_060_Enter Unit Charge",enabled=true)
    @Description("Test Description - Enter Unit Charge")
    public void T_060_enterUnitCharge() throws InterruptedException{
        partChargeNotOpening.enterUnitCharge();
    }
    @Test(priority=60,description="T_061_click on SaveExit",enabled=true)
    @Description("Test Description - click on SaveExit")
    public void T_061_clickOnSaveExit() throws InterruptedException{
        partChargeNotOpening.clickOnSaveExit();
    }

    @Test(priority=61,description="T_062_click on link of second Part Number",enabled=true)
    @Description("Test Description - click on link of second Part Number")
    public void T_062_clickOnSecondLink() throws InterruptedException{
        partChargeNotOpening.clickOnSecondLink();
    }
    @Test(priority=62,description="T_063_Enter Unit Charge",enabled=true)
    @Description("Test Description - Enter Unit Charge")
    public void T_063_enterUnitCharge() throws InterruptedException{
        partChargeNotOpening.enterUnitCharge();
    }
    @Test(priority=63,description="T_064_click on SaveExit",enabled=true)
    @Description("Test Description - click on SaveExit")
    public void T_064_clickOnSaveExit() throws InterruptedException{
        partChargeNotOpening.clickOnSaveExit();
    }
    @Test(priority=64,description="T_065_verify Unit Charge link one",enabled=true)
    @Description("Test Description - verify Unit Charge link one")
    public void T_065_verifyUnitChargeOne() throws InterruptedException{
        partChargeNotOpening.verifyUnitChargeOne();
    }
    @Test(priority=65,description="T_066_verify Unit charge link two",enabled=true)
    @Description("Test Description - verify Unit charge link two")
    public void T_066_verifyUnitChargeTwo() throws InterruptedException{
        partChargeNotOpening.verifyUnitChargeTwo();
    }
    @Test(priority=66,description="T_067_Click on sign out and verify username",enabled=true)
    @Description("Test Description - Click on sign out and verify username")
    public void T_067_clickOnSignOutAndVerifyName() throws InterruptedException{
        partChargeNotOpening.clickOnSignOutAndVerifyName();
    }




}
