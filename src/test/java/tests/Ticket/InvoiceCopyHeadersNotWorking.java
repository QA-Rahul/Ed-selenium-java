package tests.Ticket;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import tests.TestDriverActions;

import java.io.FileNotFoundException;
import java.io.IOException;

@Listeners({utils.TestListener.class})
@Epic("Testing")
@Feature("Invoice Copy Headers Not Working")

public class InvoiceCopyHeadersNotWorking extends TestDriverActions {

    @Test(priority=0,description="T_001_go to corporate setup manager",enabled=true)
    @Description("Test Description - go to corporate setup manager")
    public void T_001_gotoCorporateSetupManager() throws InterruptedException {
       loginPage.loginWithValidCredentials(appProp66.getProperty("username"),appProp66.getProperty("password"));
        invoiceCopyHeaders.gotoCorporateSetupManager();
    }

    @Test(priority=1,description="T_002_verify text corporate Setup Manager",enabled=true)
    @Description("Test Description - verify text corporate Setup Manager")
    public void T_002_verifycorporateSetupManager() throws InterruptedException {
        invoiceCopyHeaders.verifycorporateSetupManager();
    }

    @Test(priority=2,description="T_003_verify title Corporate Profile",enabled=true)
    @Description("Test Description - verify title Corporate Profile")
    public void T_003_verifytitle_CorporateProfile() throws InterruptedException{
        invoiceCopyHeaders.verifytitle_CorporateProfile();
    }

    @Test(priority=3,description="T_004_verify title Things To Do",enabled=true)
    @Description("Test Description - verify title Things To Do")
    public void T_004_verifytitle_ThingsToDo() throws InterruptedException{
        invoiceCopyHeaders.verifytitle_ThingsToDo();
    }

    @Test(priority=4,description="T_005_verify tab_InvoiceSetup",enabled=true)
    @Description("Test Description - verify tab_InvoiceSetup")
    public void T_005_verifytab_InvoiceSetup() throws InterruptedException{
        invoiceCopyHeaders.verifytab_InvoiceSetup();
    }

    @Test(priority=5,description="T_006_click on tab Invoice Set up",enabled=true)
    @Description("Test Description - click on tab Invoice Set up")
    public void T_006_clickOnTabInvoiceSetUp()  throws InterruptedException{
        invoiceCopyHeaders.clickOnTabInvoiceSetUp();
    }

    @Test(priority=6,description="T_007_verify tab format,logo and copies",enabled=true)
    @Description("Test Description -verify tab format,logo and copies")
    public void T_007_verifyTabFormatLogoCopies() throws InterruptedException{
        invoiceCopyHeaders.verifyTabFormatLogoCopies();
    }

    @Test(priority=7,description="T_008_verify title invoice formats",enabled=true)
    @Description("Test Description -verify title invoice formats")
    public void T_008_verifyINVOICEformats() throws InterruptedException{
        invoiceCopyHeaders.verifyINVOICEformats();
    }
      @Test(priority=8,description="T_009_click on tab copies",enabled=true)
    @Description("Test Description - click on tab copies")
    public void T_009_clickOnTabCopies() throws InterruptedException{
        invoiceCopyHeaders.clickOnTabCopies();
    }

    @Test(priority=9,description="T_010_verify sequence column",enabled=true)
    @Description("Test Description - verify sequence column")
    public void T_010_verifySequenceColumn() throws InterruptedException{
        invoiceCopyHeaders.verifySequenceColumn();
    }
    @Test(priority=10,description="T_011_verify heading column",enabled=true)
    @Description("Test Description - verify heading column")
    public void T_011_verifyHeadingColumn() throws InterruptedException{
        invoiceCopyHeaders.verifyHeadingColumn();
    }
    @Test(priority=11,description="T_012_verify invoice type column",enabled=true)
    @Description("Test Description - verify invoice type column")
    public void T_012_verifyInvoiceTypeColumn() throws InterruptedException{
        invoiceCopyHeaders.verifyInvoiceTypeColumn();
    }
    @Test(priority=12,description="T_013_verify main copy",enabled=true)
    @Description("Test Description - verify main copy")
    public void T_013_verifyMainCopy() throws InterruptedException{
        invoiceCopyHeaders.verifyMainCopy();
    }
    @Test(priority=13,description="T_014_verify Customer copy",enabled=true)
    @Description("Test Description - verify Customer copy")
    public void T_014_verifyCustomerCopy() throws InterruptedException{
        invoiceCopyHeaders.verifyCustomerCopy();
    }
    @Test(priority=14,description="T_015_go to completeRo screen",enabled=true)
    @Description("Test Description - go to completeRo screen")
    public void T_015_gotoCompleteRo() throws InterruptedException, FileNotFoundException {
        invoiceCopyHeaders.gotoCompleteRo();
    }
    @Test(priority=15,description="T_016_ verify title complete ro",enabled=true)
    @Description("Test Description - verify title complete ro")
    public void T_016_verifyTitleCompleteRo() throws InterruptedException{
        invoiceCopyHeaders.verifyTitleCompleteRo();
    }
    @Test(priority=16,description="T_017_verify location",enabled=true)
    @Description("Test Description - verify location")
    public void T_017_verifyLocation() throws InterruptedException{
        invoiceCopyHeaders.verifyLocation();
    }
    @Test(priority=17,description="T_018_verify text status",enabled=true)
    @Description("Test Description -verify text status")
    public void T_018_verifyTextStatus() throws InterruptedException{
        invoiceCopyHeaders.verifyTextStatus();
    }
    @Test(priority=18,description="T_019_verify radio button Ready To Submit",enabled=true)
    @Description("Test Description -verify radio button Ready To Submit")
    public void T_019_verifyRadioBtnReadyToSubmit() throws InterruptedException{
        invoiceCopyHeaders.verifyRadioBtnReadyToSubmit();
    }
    @Test(priority=19,description="T_020_verify radio button submitted",enabled=true)
    @Description("Test Description -verify radio button submitted")
    public void T_020_verifyradiobtnSubmitted() throws InterruptedException{
        invoiceCopyHeaders.verifyradiobtnSubmitted();
    }
    @Test(priority=20,description="T_021_verify radio button invoiced",enabled=true)
    @Description("Test Description -verify radio button invoiced")
    public void T_021_verifyRadiobtnInvoiced() throws InterruptedException{
        invoiceCopyHeaders.verifyRadiobtnInvoiced();
    }
    @Test(priority=21,description="T_022_verify radio button closed",enabled=true)
    @Description("Test Description -verify radio button closed")
    public void T_022_verifyRadiobtnClosed() throws InterruptedException{
        invoiceCopyHeaders.verifyRadiobtnClosed();
    }
    @Test(priority=22,description="T_023_verify radio button closed",enabled=true)
    @Description("Test Description -verify radio button closed")
    public void T_023_verifyRadiobtnRejected() throws InterruptedException{
        invoiceCopyHeaders.verifyRadiobtnRejected();
    }
    @Test(priority=23,description="T_024_click on radio button invoiced",enabled=true)
    @Description("Test Description -click on radio button invoiced")
    public void T_024_clickOnInvoiced() throws InterruptedException{
        invoiceCopyHeaders.clickOnInvoiced();
    }
    @Test(priority=24,description="T_025_verify from date field",enabled=true)
    @Description("Test Description -verify from date field")
    public void T_025_verifyFromDateField() throws InterruptedException{
        invoiceCopyHeaders.verifyFromDateField();
    }
    @Test(priority=25,description="T_026_verify to date field",enabled=true)
    @Description("Test Description - verify to date field")
    public void T_026_verifyToDateField() throws InterruptedException{
        invoiceCopyHeaders.verifyToDateField();
    }
    @Test(priority=26,description="T_027_verify refresh button",enabled=true)
    @Description("Test Description - verify refresh button")
    public void T_027_verifyRefreshButton() throws InterruptedException{
        invoiceCopyHeaders.verifyRefreshButton();
    }

    @Test(priority=27,description="T_028_enter from date",enabled=true)
    @Description("Test Description - enter from date")
    public void T_028_enterFromDate() throws InterruptedException{
        invoiceCopyHeaders.enterFromDate();
    }
    @Test(priority=28,description="T_029_enter To date",enabled=false)
    @Description("Test Description - enter To date")
    public void T_029_enterToDate() throws InterruptedException{
        invoiceCopyHeaders.enterToDate();
    }
    @Test(priority=29,description="T_030_click on Refresh button",enabled=true)
    @Description("Test Description - click on Refresh button")
    public void T_030_clickOnRefreshbtn() throws InterruptedException{
        invoiceCopyHeaders.clickOnRefreshbtn();
    }
    @Test(priority=30,description="T_031_verify text invoiced",enabled=true)
    @Description("Test Description - verify text invoiced")
    public void T_031_verifyInvoiced() throws InterruptedException{
        invoiceCopyHeaders.verifyInvoiced();
    }
    @Test(priority=31,description="T_032_verify columns of invoice table",enabled=true)
    @Description("Test Description - verify columns of invoice table")
    public void T_009_verifyColumnsofInvoice() throws InterruptedException{
        invoiceCopyHeaders.verifyColumnsofInvoice();
    }
    @Test(priority=32,description="T_033_click on reference number",enabled=true)
    @Description("Test Description - click on reference number")
    public void T_033_clickOnReferenceNumber() throws InterruptedException{
        invoiceCopyHeaders.clickOnReferenceNumber();
    }
    @Test(priority=33,description="T_034_verify title Repair order",enabled=true)
    @Description("Test Description -verify title Repair order")
    public void T_034_verifyTitleRepairOrder() throws InterruptedException{
        invoiceCopyHeaders.verifyTitleRepairOrder();
    }
     @Test(priority=34,description="T_035_verify Location",enabled=true)
    @Description("Test Description -verify Location")
    public void T_035_verifyLocationName() throws InterruptedException{
        invoiceCopyHeaders.verifyLocationName();
    }
    @Test(priority=35,description="T_036_verify delete customer invoice",enabled=true)
    @Description("Test Description - verify delete customer invoice")
    public void T_036_verifyDeleteCustomerInvoice() throws InterruptedException{
        invoiceCopyHeaders.verifyDeleteCustomerInvoice();
    }
     @Test(priority=36,description="T_037_verify customer invoice tab",enabled=true)
    @Description("Test Description -verify customer invoice tab")
    public void T_037_verifyCustomerInvoiceTab() throws InterruptedException{
        invoiceCopyHeaders.verifyCustomerInvoiceTab();
    }
    @Test(priority=37,description="T_038_click on Customer Invoice tab",enabled=true)
    @Description("Test Description -click on Customer Invoice tab")
    public void T_038_clickOnCustomerInvoiceTab() throws InterruptedException, IOException {
        invoiceCopyHeaders.clickOnCustomerInvoiceTab();
    }
 /*   @Test(priority=0,description="T_009_",enabled=true)
    @Description("Test Description -")
    public void T_009_() throws InterruptedException{
        invoiceCopyHeaders.
    }
    @Test(priority=0,description="T_009_",enabled=true)
    @Description("Test Description -")
    public void T_009_() throws InterruptedException{
        invoiceCopyHeaders.
    }
    @Test(priority=0,description="T_009_",enabled=true)
    @Description("Test Description -")
    public void T_009_() throws InterruptedException{
        invoiceCopyHeaders.
    }
    @Test(priority=0,description="T_009_",enabled=true)
    @Description("Test Description -")
    public void T_009_() throws InterruptedException{
        invoiceCopyHeaders.
    }
    */


}
