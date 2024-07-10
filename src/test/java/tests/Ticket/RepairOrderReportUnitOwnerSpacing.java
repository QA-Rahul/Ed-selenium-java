package tests.Ticket;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import tests.TestDriverActions;

import java.io.IOException;

@Listeners({utils.TestListener.class})
@Epic("Testing")
@Feature("Repair Order Report Unit Owner Spacing")

public class RepairOrderReportUnitOwnerSpacing extends TestDriverActions {

    @Test(priority=0,description="T_001_go to Service Board Screen",enabled=true)
    @Description("Test Description - go to Service Board Screen")
    public void T_001_gotoServiceBoard() throws InterruptedException {
        loginPage.loginWithValidCredentials(appProp82.getProperty("username"),appProp82.getProperty("password"));
        repairOrderReport.gotoServiceBoard();
    }

    @Test(priority=1,description="T_002_verify title CompleteRO",enabled=true)
    @Description("Test Description - verify title CompleteRO")
    public void T_002_verifyTitleCompleteRO() throws InterruptedException {
        repairOrderReport.verifyTitleCompleteRO();
    }

    @Test(priority=2,description="T_003_verify Location of complete Ro",enabled=true)
    @Description("Test Description - verify Location of complete Ro")
    public void T_003_verifyLocationCompleteRo() throws InterruptedException{
        repairOrderReport.verifyLocationCompleteRo();
    }
    @Test(priority=3,description="T_004_verify Ready To Submit",enabled=true)
    @Description("Test Description - verify Ready To Submit")
    public void T_004_verifyReadyToSubmit() throws InterruptedException{
        repairOrderReport.verifyReadyToSubmit();
    }

    @Test(priority=4,description="T_005_verify tab Non Repair Bill and New RO",enabled=true)
    @Description("Test Description - verify tab Non Repair Bill and New RO")
    public void T_005_verifyNonRepairBill_NewRO() throws InterruptedException{
        repairOrderReport.verifyNonRepairBill_NewRO();
    }

    @Test(priority=5,description="T_006_click on New RO tab",enabled=true)
    @Description("Test Description - click on New RO tab")
    public void T_006_clickOnNewRO() throws InterruptedException{
        repairOrderReport.clickOnNewRO();
    }

    @Test(priority=6,description="T_007_verify title New Repair Order",enabled=true)
    @Description("Test Description - verify title New Repair Order")
    public void T_007_verifyTitleNewRepairOrder() throws InterruptedException{
        repairOrderReport.verifyTitleNewRepairOrder();
    }
    @Test(priority=7,description="T_008_verify Location New Repair Order",enabled=true)
    @Description("Test Description - verify Location New Repair Order")
    public void T_008_verifyLocationNewRepairOrder() throws InterruptedException{
        repairOrderReport.verifyLocationNewRepairOrder();
    }

    @Test(priority=8,description="T_009_verify Search Unit",enabled=true)
    @Description("Test Description - verify Search Unit")
    public void T_009_verifySearchUnit() throws InterruptedException{
        repairOrderReport.verifySearchUnit();
    }

    @Test(priority=9,description="T_010_verify tab New Unit and show advanced search",enabled=true)
    @Description("Test Description - verify tab New Unit and show advanced search")
    public void T_010_verifyNewUnitShowAdvancedSearch() throws InterruptedException{
        repairOrderReport.verifyNewUnitShowAdvancedSearch();
    }

    @Test(priority=10,description="T_011_Enter Unit Owner Name",enabled=true)
    @Description("Test Description - Enter Unit Owner Name")
    public void T_011_enterUnitOwnerName() throws InterruptedException{
        repairOrderReport.enterUnitOwnerName();
    }
    @Test(priority=11,description="T_012_click on Select tab",enabled=true)
    @Description("Test Description - click on Select tab")
    public void T_012_clickOnSelectTab() throws InterruptedException{
        repairOrderReport.clickOnSelectTab();
    }
     @Test(priority=12,description="T_013_verify title Repair Order",enabled=true)
    @Description("Test Description - verify title Repair Order")
    public void T_013_verifyTitleRepairOrder() throws InterruptedException{
        repairOrderReport.verifyTitleRepairOrder();
    }

    @Test(priority=13,description="T_014_verify Location of Repair Order",enabled=true)
    @Description("Test Description - verify Location of Repair Order")
    public void T_014_verifyLocationRepairOrder() throws InterruptedException{
        repairOrderReport.verifyLocationRepairOrder();
    }
    @Test(priority=14,description="T_015_verify Unit Owner",enabled=true)
    @Description("Test Description - verify Unit Owner")
    public void T_015_verifyUnitOwner() throws InterruptedException{
        repairOrderReport.verifyUnitOwner();
    }

   @Test(priority=15,description="T_016_verify tabs of labour",enabled=true)
    @Description("Test Description - verify tabs of labour")
    public void T_016_verifyTabsOfLabour() throws InterruptedException{
        repairOrderReport.verifyTabsOfLabour();
    }
    @Test(priority=16,description="T_017_verify tabs of parts",enabled=true)
    @Description("Test Description - verify tabs of parts")
    public void T_017_verifyTabsOfParts() throws InterruptedException{
        repairOrderReport.verifyTabsOfParts();
    }

    @Test(priority=17,description="T_018_ verify print tabs",enabled=true)
    @Description("Test Description -  verify print tabs")
    public void T_018_verifyPrintTab() throws InterruptedException{
        repairOrderReport.verifyPrintTab();
    }
    @Test(priority=18,description="T_019_click on Repair Order tab",enabled=true)
    @Description("Test Description - click on Repair Order tab")
    public void T_019_clickOnRepairOrderTab() throws InterruptedException{
        repairOrderReport.clickOnRepairOrderTab();
    }

    @Test(priority=19,description="T_020_Verify PDF data",enabled=true)
    @Description("Test Description - Verify PDF data")
    public void T_020_verifyPDF() throws InterruptedException, IOException {
        repairOrderReport.verifyPDF();
    }
    @Test(priority=20,description="T_021_click on arrow Back To Complete Ro",enabled=true)
    @Description("Test Description - click on arrow Back To Complete Ro")
    public void T_021_clickOnBackToCompleteRo() throws InterruptedException{
        repairOrderReport.clickOnBackToCompleteRo();
    }

    @Test(priority=21,description="T_022_click on New RO tab",enabled=true)
    @Description("Test Description - click on New RO tab")
    public void T_022_clickOnNewRO() throws InterruptedException{
        repairOrderReport.clickOnNewRO();
    }
    @Test(priority=22,description="T_023_Enter Unit Owner Name",enabled=true)
    @Description("Test Description - Enter Unit Owner Name")
    public void T_023_enterUnitOwner() throws InterruptedException{
        repairOrderReport.enterUnitOwner();
    }

    @Test(priority=23,description="T_024_click on Select tab",enabled=true)
    @Description("Test Description - click on Select tab")
    public void T_024_clickOnSelectTab() throws InterruptedException{
        repairOrderReport.clickOnSelectTab();
    }

    @Test(priority=24,description="T_025_click on Repair Order tab",enabled=true)
    @Description("Test Description - click on Repair Order tab")
    public void T_025_clickOnRepairOrderTab() throws InterruptedException{
        repairOrderReport.clickOnRepairOrderTab();
    }

    @Test(priority=25,description="T_026_Verify PDF data",enabled=true)
    @Description("Test Description - Verify PDF data")
    public void T_026_verifyPDF() throws InterruptedException, IOException {
        repairOrderReport.verifyPDF();
    }

 /*   @Test(priority=26,description="T_027_",enabled=true)
    @Description("Test Description - ")
    public void T_027_() throws InterruptedException {
        repairOrderReport.
    }


*/



}
