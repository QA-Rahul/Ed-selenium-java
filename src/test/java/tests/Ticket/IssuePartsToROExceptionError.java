package tests.Ticket;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import tests.TestDriverActions;

@Listeners({utils.TestListener.class})
@Epic("Testing")
@Feature("Issue Parts To RO Exception Error")

public class IssuePartsToROExceptionError extends TestDriverActions {

    @Test(priority=0,description="T_001_Login the page",enabled=true)
    @Description("Test Description :- Login the page")
    public void T_001_loginThePage() throws InterruptedException {
        loginPage.loginWithValidCredentials(appProp60.getProperty("username"),appProp60.getProperty("password"));

    }

    @Test(priority=1,description="T_002_go to Issue Tech Part Screen",enabled=true)
    @Description("Test Description :- go to Issue Tech Part Screen")
    public void T_002_gotoIssueTechPartScreen() throws InterruptedException {
        issuePartsToROExceptionError.gotoIssueTechPartScreen();
    }

    @Test(priority=2,description="T_003_verify Scan Employee Badge",enabled=true)
    @Description("Test Description :- verify Scan Employee Badge ")
    public void T_003_verifyScanEmployeeBadge() throws InterruptedException{
        issuePartsToROExceptionError.verifyScanEmployeeBadge();
    }

    @Test(priority=3,description="T_004_verify Repair Location",enabled=true)
    @Description("Test Description :- verify Repair Location")
    public void T_004_enterNameOfBadge() throws InterruptedException{
        issuePartsToROExceptionError.enterNameOfBadge();
    }

    @Test(priority=4,description="T_005_click on Go button",enabled=true)
    @Description("Test Description :- click on Go button")
    public void T_005_clickOnGoBtn() throws InterruptedException{
        issuePartsToROExceptionError.clickOnGoBtn();
    }

    @Test(priority=5,description="T_006_verify employee",enabled=true)
    @Description("Test Description :- verify employee")
    public void T_006_verifyEmployee() throws InterruptedException{
        issuePartsToROExceptionError.verifyEmployee();
    }

    @Test(priority=6,description="T_007_verify Work In progress",enabled=true)
    @Description("Test Description :- verify Work In progress")
    public void T_007_verifyWorkInProgress() throws InterruptedException{
        issuePartsToROExceptionError.verifyWorkInProgress();
    }

    @Test(priority=7,description="T_008_verify Repair Location",enabled=true)
    @Description("Test Description :- verify Repair Location")
    public void T_008_verifyRepairLocation() throws InterruptedException{
        issuePartsToROExceptionError.verifyRepairLocation();
    }

    @Test(priority=8,description="T_009_ verify Search Work In Progress",enabled=true)
    @Description("Test Description :-  verify Search Work In Progress")
    public void T_009_verifySearchWorkInProgress() throws InterruptedException{
        issuePartsToROExceptionError.verifySearchWorkInProgress();
    }

    @Test(priority=9,description="T_010_verify select button",enabled=true)
    @Description("Test Description :- verify select button")
    public void T_010_verifySelectBtn() throws InterruptedException{
        issuePartsToROExceptionError.verifySelectBtn();
    }

    @Test(priority=10,description="T_011_ Click on select btn",enabled=true)
    @Description("Test Description :-  Click on select btn")
    public void T_011_clickOnSelectBtn() throws InterruptedException{
        issuePartsToROExceptionError.clickOnSelectBtn();
    }

    @Test(priority=11,description="T_012_verify title Issue Part",enabled=true)
    @Description("Test Description :- verify title Issue Part")
    public void T_012_verifyIssuePart() throws InterruptedException{
        issuePartsToROExceptionError.verifyIssuePart();
    }

    @Test(priority=12,description="T_013_verify select button",enabled=true)
    @Description("Test Description :- verify select button")
    public void T_013_verifySelectBtn() throws InterruptedException{
        issuePartsToROExceptionError.verifySelectBtn();
    }

    @Test(priority=13,description="T_014_verify location",enabled=true)
    @Description("Test Description :- verify location")
    public void T_014_verifyLocation() throws InterruptedException{
        issuePartsToROExceptionError.verifyLocation();
    }

    @Test(priority=14,description="T_015_verify Unit Owner",enabled=true)
    @Description("Test Description :- verify Unit Owner")
    public void T_015_verifyUnitOwner() throws InterruptedException{
        issuePartsToROExceptionError.verifyUnitOwner();
    }

    @Test(priority=15,description="T_016_verify Unit",enabled=true)
    @Description("Test Description :- verify Unit")
    public void T_016_verifyUnit() throws InterruptedException{
        issuePartsToROExceptionError.verifyUnit();
    }

    @Test(priority=16,description="T_017_verify RO",enabled=true)
    @Description("Test Description :- verify RO")
    public void T_017_verifyRO() throws InterruptedException{
        issuePartsToROExceptionError.verifyRO();
    }

    @Test(priority=17,description="T_018_verify Repair Aerodynamic Devices",enabled=true)
    @Description("Test Description :- verify Repair Aerodynamic Devices")
    public void T_018_verifyRepairAerodynamicDevices() throws InterruptedException{
        issuePartsToROExceptionError.verifyRepairAerodynamicDevices();
    }

    @Test(priority=18,description="T_019_click on close button",enabled=true)
    @Description("Test Description :- click on close button")
    public void T_019_clickOnCloseBtn() throws InterruptedException{
        issuePartsToROExceptionError.clickOnCloseBtn();
    }

    @Test(priority=19,description="T_020_go to Report setup screen",enabled=true)
    @Description("Test Description :- go to Report setup screen")
    public void T_020_gotoReportSetupScreen() throws InterruptedException{
        issuePartsToROExceptionError.gotoReportSetupScreen();
    }

    @Test(priority=20,description="T_021_verify tab categories",enabled=true)
    @Description("Test Description :- verify tab categories")
    public void T_021_verifyCategories() throws InterruptedException{
        issuePartsToROExceptionError.verifyCategories();
    }
    @Test(priority=21,description="T_022_ verify search",enabled=true)
    @Description("Test Description :-  verify search")
    public void T_022_verifySearch() throws InterruptedException{
        issuePartsToROExceptionError.verifySearch();
    }

    @Test(priority=22,description="T_023_verify Report 12 Month Costs",enabled=true)
    @Description("Test Description :- verify Report 12 Month Costs")
    public void T_023_verifyReport12MonthCosts() throws InterruptedException{
        issuePartsToROExceptionError.verifyReport12MonthCosts();
    }

    @Test(priority=23,description="T_024_click on sign out button",enabled=true)
    @Description("Test Description :- click on sign out button")
    public void T_024_clickOnSignOut() throws InterruptedException{
        issuePartsToROExceptionError.clickOnSignOut();
    }







}
