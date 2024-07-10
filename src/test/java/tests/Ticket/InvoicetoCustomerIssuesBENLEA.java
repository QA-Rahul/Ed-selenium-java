package tests.Ticket;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import tests.TestDriverActions;

@Listeners({utils.TestListener.class})
@Epic("Testing")
@Feature("Invoice to Customer Issues BENLEA")

public class InvoicetoCustomerIssuesBENLEA extends TestDriverActions {

    @Test(priority=0,description="T_001_go to Customer Screen",enabled=true)
    @Description("Test Description - go to Customer Screen")
    public void T_001_gotoCustomerScreen() throws InterruptedException {
        loginPage.loginWithValidCredentials(appProp68.getProperty("username"),appProp68.getProperty("password"));
        invoiceCustomerIssues.gotoCustomerScreen();
    }

    @Test(priority=1,description="T_002_verify all fields of Customer manager",enabled=true)
    @Description("Test Description -verify all fields of Customer manager")
    public void T_002_customerManagerTitle() throws InterruptedException{
        invoiceCustomerIssues.customerManagerTitle();
    }

    @Test(priority=2,description="T_003_Verify all elements of customer list table",enabled=true)
    @Description("Test Description - Verify all elements of customer list table")
    public void T_003_customerListTableTitle() throws InterruptedException{
        invoiceCustomerIssues.customerListTableTitle();
    }

    @Test(priority=3,description="T_004_ enter Aspire Trucking",enabled=true)
    @Description("Test Description -  enter Aspire Trucking")
    public void T_004_clickOnLinkCustomerName() throws InterruptedException{
        invoiceCustomerIssues.enterAspireTruckingInSearchBox();
    }

    @Test(priority=4,description="T_005_click on Customer Name link",enabled=true)
    @Description("Test Description - click on Customer Name link")
    public void T_005_clickOnLink() throws InterruptedException{
        invoiceCustomerIssues.clickOnLink();
    }

    @Test(priority=5,description="T_006_verify code and name of customer name",enabled=true)
    @Description("Test Description - verify code and name of customer name")
    public void T_006_verifyCodeAndName() throws InterruptedException{
        invoiceCustomerIssues.verifyCodeAndName();
    }
    @Test(priority=6,description="T_007_verify the tabs present",enabled=true)
    @Description("Test Description - verify the tabs present")
    public void T_007_verifyTabs() throws InterruptedException{
        invoiceCustomerIssues.verifyTabs();
    }

    @Test(priority=7,description="T_008_click on Invoice to Customer Tab",enabled=true)
    @Description("Test Description - click on Invoice to Customer Tab")
    public void T_008_clickOnInvoiceToCustomerTab() throws InterruptedException{
        invoiceCustomerIssues.clickOnInvoiceToCustomerTab();
    }

    @Test(priority=8,description="T_009_verify column name of Invoice To Customer table",enabled=true)
    @Description("Test Description - verify column name of Invoice To Customer table")
    public void T_009_verifyInvoiceToCustomerColumn() throws InterruptedException{
        invoiceCustomerIssues.verifyInvoiceToCustomerColumn();
    }

    @Test(priority=9,description="T_010_click on Add button",enabled=true)
    @Description("Test Description - click on Add button")
    public void T_010_clickOnAddBtn() throws InterruptedException{
        invoiceCustomerIssues.clickOnAddBtn();
    }

   @Test(priority=9,description="T_010_verify Pop up Invoice To Customer",enabled=true)
    @Description("Test Description - verify Pop up Invoice To Customer")
    public void T_010_verifyPopUpInvoiceToCustomer() throws InterruptedException{
        invoiceCustomerIssues.verifyPopUpInvoiceToCustomer();
    }

    @Test(priority=10,description="T_011_click on Magnificient icon",enabled=true)
    @Description("Test Description - click on Magnificient icon")
    public void T_011_clickOnMagnificientIcon() throws InterruptedException{
        invoiceCustomerIssues.searchUnitNumber();
    }

    @Test(priority=11,description="T_012_click on Save and exit",enabled=true)
    @Description("Test Description - click on Save and exit")
    public void T_012_clickOnSaveExit() throws InterruptedException{
        invoiceCustomerIssues.clickOnSaveExit();
    }

    @Test(priority=12,description="T_013_click on Ok button",enabled=true)
    @Description("Test Description - click on Ok button")
    public void T_013_clickOnOkBtn() throws InterruptedException{
        invoiceCustomerIssues.clickOnOkBtn();
    }

    @Test(priority=13,description="T_014_go to Complete Ro Screen",enabled=true)
    @Description("Test Description - go to Complete Ro Screen")
    public void T_014_gotoCompleteRoScreen() throws InterruptedException{
        invoiceCustomerIssues.gotoCompleteRoScreen();
    }
    @Test(priority=14,description="T_015_verify title complete Ro",enabled=true)
    @Description("Test Description - verify title complete Ro")
    public void T_015_verifyTitleCompleteRo() throws InterruptedException{
        invoiceCustomerIssues.verifyTitleCompleteRo();
    }
    @Test(priority=15,description="T_016_verify location",enabled=true)
    @Description("Test Description - verify location")
    public void T_016_verifyLocation() throws InterruptedException{
        invoiceCustomerIssues.verifyLocation();
    }
    @Test(priority=16,description="T_017_verify title Ready To Submit",enabled=true)
    @Description("Test Description - verify title Ready To Submit")
    public void T_017_verifyTitleReadyToSubmit() throws InterruptedException{
        invoiceCustomerIssues.verifyTitleReadyToSubmit();
    }
    @Test(priority=17,description="T_018_verify tabs new repair bill and new Ro",enabled=true)
    @Description("Test Description - verify tabs new repair bill and new Ro")
    public void T_018_verifyNewRepairBill() throws InterruptedException{
        invoiceCustomerIssues.verifyNewRepairBill();
    }
    @Test(priority=18,description="T_019_click on New Ro button",enabled=true)
    @Description("Test Description - click on New Ro button")
    public void T_019_clickOnNewRo() throws InterruptedException{
        invoiceCustomerIssues.clickOnNewRo();
    }
    @Test(priority=19,description="T_020_verify title New Repair Order",enabled=true)
    @Description("Test Description - verify title New Repair Order")
    public void T_020_verifyTitleNewRepairOrder() throws InterruptedException{
        invoiceCustomerIssues.verifyTitleNewRepairOrder();
    }@Test(priority=20,description="T_021_verify Location of new repair order",enabled=true)
    @Description("Test Description - verify Location of new repair order")
    public void T_021_verifyLocationOfNewRepairOrder() throws InterruptedException{
        invoiceCustomerIssues.verifyLocationOfNewRepairOrder();
    }
    @Test(priority=21,description="T_022_click on show Advanced Search",enabled=true)
    @Description("Test Description - click on show Advanced Search")
    public void T_022_clickOnSearchAdvancedSearch() throws InterruptedException{
        invoiceCustomerIssues.clickOnSearchAdvancedSearch();
    }
    @Test(priority=22,description="T_023_ verify search and select unit",enabled=true)
    @Description("Test Description - verify search and select unit")
    public void T_023_verifySearchandSelectUnit() throws InterruptedException{
        invoiceCustomerIssues.verifySearchandSelectUnit();
    }
    @Test(priority=23,description="T_024_verify unit",enabled=true)
    @Description("Test Description - verify unit")
    public void T_024_verifyUnit() throws InterruptedException{
        invoiceCustomerIssues.verifyUnit();
    }
    @Test(priority=24,description="T_025_verify Owner Name",enabled=true)
    @Description("Test Description - verify Owner Name")
    public void T_025_verifyOwnerName() throws InterruptedException{
        invoiceCustomerIssues.verifyOwnerName();
    }
    @Test(priority=25,description="T_026_verify serial Number",enabled=true)
    @Description("Test Description - verify serial Number")
    public void T_026_verifySerialNumber() throws InterruptedException{
        invoiceCustomerIssues.verifySerialNumber();
    }
    @Test(priority=26,description="T_027_verify description",enabled=true)
    @Description("Test Description - verify description")
    public void T_027_verifyDescription() throws InterruptedException{
        invoiceCustomerIssues.verifyDescription();
    }
    @Test(priority=27,description="T_028_verify Owner Code",enabled=true)
    @Description("Test Description - verify Owner Code")
    public void T_028_verifyOwnerCode() throws InterruptedException{
        invoiceCustomerIssues.verifyOwnerCode();
    }
    @Test(priority=28,description="T_029_verify VIN",enabled=true)
    @Description("Test Description - verify VIN")
    public void T_029_verifyVIN() throws InterruptedException{
        invoiceCustomerIssues.verifyVIN();
    }
    @Test(priority=29,description="T_030_verify Lisense Plate",enabled=true)
    @Description("Test Description - verify Lisense Plate")
    public void T_030_verifyLisensePlate() throws InterruptedException{
        invoiceCustomerIssues.verifyLisensePlate();
    }
    @Test(priority=30,description="T_031_verify tab search,reset,addfields,reorder",enabled=true)
    @Description("Test Description - verify tab search,reset,addfields,reorder")
    public void T_031_verifyTabSearch() throws InterruptedException{
        invoiceCustomerIssues.verifyTabSearch();
    }
    @Test(priority=31,description="T_032_enter owner name",enabled=true)
    @Description("Test Description - enter owner name")
    public void T_032_enterOwnername() throws InterruptedException{
        invoiceCustomerIssues.enterOwnername();
    }
    @Test(priority=32,description="T_033_ click on search button",enabled=true)
    @Description("Test Description -  click on search button")
    public void T_033_clickOnSearchButton() throws InterruptedException{
        invoiceCustomerIssues.clickOnSearchButton();
    }
    @Test(priority=33,description="T_034_ click on select button",enabled=true)
    @Description("Test Description -  click on select button")
    public void T_034_clickOnSelectButton() throws InterruptedException{
        invoiceCustomerIssues.clickOnSelectButton();
    }
    @Test(priority=34,description="T_035_verify title Repair Order",enabled=true)
    @Description("Test Description - verify title Repair Order")
    public void T_035_verifyRepairOrder() throws InterruptedException{
        invoiceCustomerIssues.verifyRepairOrder();
    }
    @Test(priority=35,description="T_036_verify Location present in complete Ro",enabled=true)
    @Description("Test Description - verify Location present in complete Ro")
    public void T_036_verifyLocationCompleteRo() throws InterruptedException{
        invoiceCustomerIssues.verifyLocationCompleteRo();
    }@Test(priority=36,description="T_037_verify Unit Owner",enabled=true)
    @Description("Test Description - verify Unit Owner")
    public void T_037_verifyUnitOwner() throws InterruptedException{
        invoiceCustomerIssues.verifyUnitOwner();
    }
    @Test(priority=37,description="T_038_verify InvoiceTo to check 905 is present",enabled=true)
    @Description("Test Description - verify InvoiceTo to check 905 is present")
    public void T_038_verifyInvoiceTo905() throws InterruptedException{
        invoiceCustomerIssues.verifyInvoiceTo905();
    }
    @Test(priority=38,description="T_039_click on Customer tab",enabled=true)
    @Description("Test Description - click on Customer tab")
    public void T_039_clickOnCustomerTab() throws InterruptedException{
        invoiceCustomerIssues.clickOnCustomerTab();
    }
    @Test(priority=39,description="T_040_ enter Aspire Trucking",enabled=true)
    @Description("Test Description -  enter Aspire Trucking")
    public void T_040_enterAspireTruckingInSearchBox() throws InterruptedException{
        invoiceCustomerIssues.enterAspireTruckingInSearchBox();
    }
    @Test(priority=40,description="T_041_click on Customer Name link",enabled=true)
    @Description("Test Description - click on Customer Name link")
    public void T_041_clickOnLink() throws InterruptedException{
        invoiceCustomerIssues.clickOnLink();
    }
    @Test(priority=41,description="T_042_click on Invoice to Customer Tab",enabled=true)
    @Description("Test Description - click on Invoice to Customer Tab")
    public void T_042_clickOnInvoiceToCustomerTab() throws InterruptedException{
        invoiceCustomerIssues.clickOnInvoiceToCustomerTab();
    }
    @Test(priority=42,description="T_043_click on Invoice To Customer Name",enabled=true)
    @Description("Test Description - click on Invoice To Customer Name")
    public void T_043_clickOnInvoiceToCustomerName() throws InterruptedException{
        invoiceCustomerIssues.clickOnInvoiceToCustomerName();
    }
    @Test(priority=43,description="T_044_verify Invoice To Customer pop up",enabled=true)
    @Description("Test Description - verify Invoice To Customer pop up")
    public void T_044_verifyInvoiceToCustomerPopUp() throws InterruptedException{
        invoiceCustomerIssues.verifyInvoiceToCustomerPopUp();
    }
    @Test(priority=44,description="T_045_verify text Effective Date",enabled=true)
    @Description("Test Description - verify text Effective Date")
    public void T_045_verifyTextEffectiveDate() throws InterruptedException{
        invoiceCustomerIssues.verifyTextEffectiveDate();
    }
    @Test(priority=45,description="T_046_verify Invoice To Customer with user",enabled=true)
    @Description("Test Description - verify Invoice To Customer with user")
    public void T_046_verifyInvoiceToCustomerUser() throws InterruptedException{
        invoiceCustomerIssues.verifyInvoiceToCustomerUser();
    }

    @Test(priority=46,description="T_047_verify void and cancle button",enabled=true)
    @Description("Test Description - verify void and cancle button")
    public void T_047_verifyVoid_CancleBtn() throws InterruptedException{
        invoiceCustomerIssues.verifyVoid_CancleBtn();
    }

    @Test(priority=47,description="T_048_click on void button",enabled=true)
    @Description("Test Description - click on void button")
    public void T_048_clickOnVoidBtn() throws InterruptedException{
        invoiceCustomerIssues.clickOnVoidBtn();
    }

    @Test(priority=48,description="T_049_click on Ok button",enabled=true)
    @Description("Test Description - click on Ok button")
    public void T_049_clickOnOkBtn() throws InterruptedException{
        invoiceCustomerIssues.clickOnOkBtn();
    }

    @Test(priority=49,description="T_050_ click on tab Complete RO",enabled=true)
    @Description("Test Description - click on tab Complete RO")
    public void T_050_clickOnCompleteROTab() throws InterruptedException {
        invoiceCustomerIssues.clickOnCompleteROTab();
    }

    @Test(priority=50,description="T_051_go to Complete RO",enabled=true)
    @Description("Test Description -go to Complete RO")
    public void T_051_gotoCompleteRoScreen() throws InterruptedException{
        invoiceCustomerIssues.gotoCompleteRoScreen();
    }

    @Test(priority=51,description="T_052_click on New Ro button",enabled=true)
    @Description("Test Description - click on New Ro button")
    public void T_052_clickOnNewRo() throws InterruptedException{
        invoiceCustomerIssues.clickOnNewRo();
    }

    @Test(priority=52,description="T_053_click on show Advanced Search",enabled=true)
    @Description("Test Description - click on show Advanced Search")
    public void T_053_clickOnSearchAdvancedSearch() throws InterruptedException{
        invoiceCustomerIssues.clickOnSearchAdvancedSearch();
    }

    @Test(priority=53,description="T_054_enter owner name",enabled=true)
    @Description("Test Description - enter owner name")
    public void T_054_enterOwnername() throws InterruptedException{
        invoiceCustomerIssues.enterOwnername();
    }

    @Test(priority=54,description="T_055_click on search button",enabled=true)
    @Description("Test Description - click on search button")
    public void T_055_clickOnSearchButton() throws InterruptedException{
        invoiceCustomerIssues.clickOnSearchButton();
    }

    @Test(priority=55,description="T_056_click on select button",enabled=true)
    @Description("Test Description - click on select button")
    public void T_056_clickOnSelectButton() throws InterruptedException{
        invoiceCustomerIssues.clickOnSelectButton();
    }

    @Test(priority=56,description="T_057_verify Unit Owner",enabled=true)
    @Description("Test Description - verify Unit Owner")
    public void T_057_verifyUnitOwner() throws InterruptedException{
        invoiceCustomerIssues.verifyUnitOwner();
    }

    @Test(priority=57,description="T_058_verify Invoice To tocheck Aspire unit is present",enabled=true,dependsOnMethods = {"T_038_verifyInvoiceTo905()"})
    @Description("Test Description - verify Invoice To tocheck Aspire unit is present")
    public void T_058_verifyInvoiceTo() throws InterruptedException {
        invoiceCustomerIssues.verifyInvoiceTo();
    }

    @Test(priority=58,description="T_059_Click on sign out and verify username",enabled=true)
    @Description("Test Description -Click on sign out and verify username")
    public void T_059_clickSignOut_verifyUsername() throws InterruptedException {
        invoiceCustomerIssues.clickOnSignOut();
        invoiceCustomerIssues.verifyUsername();
    }














}
