 package tests.Ticket;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import tests.TestDriverActions;

@Listeners({utils.TestListener.class})
@Epic("Testing")
@Feature("Issue Parts to RO Exception Error_1720")

public class IssuePartstoROExceptionErrorFrom extends TestDriverActions {

    @Test(priority=0,description="T_001_Login the page",enabled=true)
    @Description("Test Description :- Login the page")
    public void T_001_loginThePage() throws InterruptedException {
        loginPage.loginWithValidCredentials(appProp63.getProperty("username"),appProp63.getProperty("password"));

    }

    @Test(priority=1,description="T_002_go to Issue Tech Part Screen",enabled=true)
    @Description("Test Description :- go to Issue Tech Part Screen")
    public void T_002_gotoIssueTechPartScreen() throws InterruptedException {
        issuePartstoROExceptionErrorFrom.gotoIssueTechPartScreen();
    }

    @Test(priority=2,description="T_003_verify Scan Employee Badge",enabled=true)
    @Description("Test Description :- verify Scan Employee Badge ")
    public void T_003_verifyScanEmployeeBadge() throws InterruptedException{
        issuePartstoROExceptionErrorFrom.verifyScanEmployeeBadge();
    }

    @Test(priority=3,description="T_004_verify Repair Location",enabled=true)
    @Description("Test Description :- verify Repair Location")
    public void T_004_enterNameOfBadge() throws InterruptedException{
        issuePartstoROExceptionErrorFrom.enterNameOfBadge();
    }

    @Test(priority=4,description="T_005_click on Go button",enabled=true)
    @Description("Test Description :- click on Go button")
    public void T_005_clickOnGoBtn() throws InterruptedException{
        issuePartstoROExceptionErrorFrom.clickOnGoBtn();
    }

    @Test(priority=5,description="T_006_verify employee",enabled=true)
    @Description("Test Description :- verify employee")
    public void T_006_verifyEmployee() throws InterruptedException{
        issuePartstoROExceptionErrorFrom.verifyEmployee();
    }

    @Test(priority=6,description="T_007_verify Work In progress",enabled=true)
    @Description("Test Description :- verify Work In progress")
    public void T_007_verifyWorkInProgress() throws InterruptedException{
        issuePartstoROExceptionErrorFrom.verifyWorkInProgress();
    }

    @Test(priority=7,description="T_008_verify Repair Location",enabled=true)
    @Description("Test Description :- verify Repair Location")
    public void T_008_verifyRepairLocation() throws InterruptedException{
        issuePartstoROExceptionErrorFrom.verifyRepairLocation();
    }

    @Test(priority=8,description="T_009_ verify Search Work In Progress",enabled=true)
    @Description("Test Description :-  verify Search Work In Progress")
    public void T_009_verifySearchWorkInProgress() throws InterruptedException{
        issuePartstoROExceptionErrorFrom.verifySearchWorkInProgress();
    }

    @Test(priority=9,description="T_010_verify select button",enabled=true)
    @Description("Test Description :- verify select button")
    public void T_010_verifySelectBtn() throws InterruptedException{
        issuePartstoROExceptionErrorFrom.verifySelectBtn();
    }

    @Test(priority=10,description="T_011_ Click on select btn",enabled=true)
    @Description("Test Description :-  Click on select btn")
    public void T_011_clickOnSelectBtn() throws InterruptedException{
        issuePartstoROExceptionErrorFrom.clickOnSelectBtn();
    }

    @Test(priority=11,description="T_012_verify title Issue Part",enabled=true)
    @Description("Test Description :- verify title Issue Part")
    public void T_012_verifyIssuePart() throws InterruptedException{
        issuePartstoROExceptionErrorFrom.verifyIssuePart();
    }

    @Test(priority=12,description="T_013_verify select button",enabled=true)
    @Description("Test Description :- verify select button")
    public void T_013_verifySelectBtn() throws InterruptedException{
        issuePartstoROExceptionErrorFrom.verifySelectBtn();
    }

    @Test(priority=13,description="T_014_verify location",enabled=true)
    @Description("Test Description :- verify location")
    public void T_014_verifyLocation() throws InterruptedException{
        issuePartstoROExceptionErrorFrom.verifyLocation();
    }

    @Test(priority=14,description="T_015_verify Unit Owner",enabled=true)
    @Description("Test Description :- verify Unit Owner")
    public void T_015_verifyUnitOwner() throws InterruptedException{
        issuePartstoROExceptionErrorFrom.verifyUnitOwner();
    }

    @Test(priority=15,description="T_016_verify Unit",enabled=true)
    @Description("Test Description :- verify Unit")
    public void T_016_verifyUnit() throws InterruptedException{
        issuePartstoROExceptionErrorFrom.verifyUnit();
    }

    @Test(priority=16,description="T_017_verify RO",enabled=true)
    @Description("Test Description :- verify RO")
    public void T_017_verifyRO() throws InterruptedException{
        issuePartstoROExceptionErrorFrom.verifyRO();
    }

    @Test(priority=17,description="T_018_verify Repair Aerodynamic Devices",enabled=true)
    @Description("Test Description :- verify Repair Aerodynamic Devices")
    public void T_018_verifyRepairAerodynamicDevices() throws InterruptedException{
        issuePartstoROExceptionErrorFrom.verifyRepairAerodynamicDevices();
    }

    @Test(priority=18,description="T_019_click on close button",enabled=true)
    @Description("Test Description :- click on close button")
    public void T_019_clickOnCloseBtn() throws InterruptedException{
        issuePartstoROExceptionErrorFrom.clickOnCloseBtn();
    }

    @Test(priority=19,description="T_020_go to Tech RO Screen",enabled=true)
    @Description("Test Description -go to Tech RO Screen")
    public void T_020_gotoIssueTech() throws InterruptedException {
        issuePartstoROExceptionErrorFrom.gotoTechROScreen();
    }

    @Test(priority=20,description="T_021_verify Scan Employee Badge",enabled=true)
    @Description("Test Description -verify Scan Employee Badge")
    public void T_021_verifyScanEmployeeBadge() throws InterruptedException{
        issuePartstoROExceptionErrorFrom.verifyScanEmployeeBadge();
    }

    @Test(priority=21,description="T_022_verify Repair Location",enabled=true)
    @Description("Test Description -verify Repair Location")
    public void T_022_enterNameOfBadge() throws InterruptedException{
        issuePartstoROExceptionErrorFrom.enterNameOfBadge();
    }
    @Test(priority=22,description="T_023_click on Go button",enabled=true)
    @Description("Test Description -click on Go button")
    public void T_023_clickOnGoBtn() throws InterruptedException{
        issuePartstoROExceptionErrorFrom.clickOnGoBtn();
    }

    @Test(priority=23,description="T_024_verify unit owner name of tech",enabled=true)
    @Description("Test Description -verify unit owner name of tech")
    public void T_024_verifyUnitOwnerNameOfTech() throws InterruptedException{
        issuePartstoROExceptionErrorFrom.verifyUnitOwnerNameOfTech();
    }
    @Test(priority=24,description="T_025_verify tech boy with shift name",enabled=true)
    @Description("Test Description -verify tech boy with shift name")
    public void T_025_verifyTechBoy() throws InterruptedException{
        issuePartstoROExceptionErrorFrom.verifyTechBoy();
    }

    @Test(priority=25,description="T_026_verify shit buttons",enabled=true)
    @Description("Test Description -verify shit buttons")
    public void T_026_verifyShiftButtons() throws InterruptedException{
        issuePartstoROExceptionErrorFrom.verifyShiftButtons();
    }
    @Test(priority=26,description="T_027_click on Issue Parts to Ro tab",enabled=true)
    @Description("Test Description -click on Issue Parts to Ro tab")
    public void T_027_clickOnIssuePartsToRotab() throws InterruptedException{
        issuePartstoROExceptionErrorFrom.clickOnIssuePartsToRotab();
    }
    @Test(priority=27,description="T_028_verify employee",enabled=true)
    @Description("Test Description -verify employee")
    public void T_028_verifyEmployee() throws InterruptedException{
        issuePartstoROExceptionErrorFrom.verifyEmployee();
    }
    @Test(priority=28,description="T_029_click on sign out button",enabled=true)
    @Description("Test Description :- click on sign out button")
    public void T_029_clickOnSignOut() throws InterruptedException{
        issuePartsToROExceptionError.clickOnSignOut();
    }





}
