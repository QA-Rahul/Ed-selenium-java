package tests.tech;

import io.qameta.allure.Description;
import org.testng.annotations.Test;
import tests.TestDriverActions;

import java.io.FileNotFoundException;

public class IssuePartToTech extends TestDriverActions {


    @Test(priority = 0 , description ="T_001_Login the page ",enabled=true)
    @Description("Test_description : Login the page")
    public void Test_001_Login_gotoTechRo() throws InterruptedException, FileNotFoundException {

        loginPage.loginWithValidCredentials(appProp14.getProperty("username"),appProp14.getProperty("password"));
        issueparttotech.gotoCounterSaleManagerScreen();
    }

    @Test(priority = 1 , description ="Test_002_Enter TechBadge and click on go",enabled=true)
    @Description("Test_description : Enter TechBadge and click on go")
    public void Test_002_Enter_TechBadge_ClickGo() throws InterruptedException, FileNotFoundException {
        issueparttotech.enterTechBadge();
        issueparttotech.clickOnGo();
    }

    @Test(priority = 2 , description ="Test_003_Verify Back to Scan Employee Badge",enabled=true)
    @Description("Test_description : Verify Back to Scan Employee Badge")
    public void Test_003_Verify_BacktoScanEmployeeBadge() throws InterruptedException, FileNotFoundException {
        issueparttotech.Verify_BacktoScanEmployeeBadge();
    }

    @Test(priority = 3 , description ="Test_004_Verify Employee:",enabled=true)
    @Description("Test_description : Verify Employee:")
    public void Test_004_Verify_Employee() throws InterruptedException, FileNotFoundException {
        issueparttotech.Verify_Employee();
    }

    @Test(priority = 4 , description ="Test_005_Verify Search Work In Progress:",enabled=true)
    @Description("Test_description : Verify Search Work In Progress:")
    public void Test_005_Verify_SearchWorkInProgress() throws InterruptedException, FileNotFoundException {
        issueparttotech.Verify_SearchWorkInProgress();
    }

    @Test(priority = 5 , description ="Test_006_Verify Location",enabled=true)
    @Description("Test_description : Verify Location")
    public void Test_006_Verify_Location() throws InterruptedException, FileNotFoundException {
        issueparttotech.Verify_Location();
    }

    @Test(priority = 6 , description ="Test_007_Verify Unit Number ",enabled=true)
    @Description("Test_description : Verify Unit Number")
    public void Test_007_Verify_UnitNumber() throws InterruptedException, FileNotFoundException {
        issueparttotech.Verify_UnitNumber();
    }

    @Test(priority = 7 , description =" Test_008_Verify Owner",enabled=true)
    @Description("Test_description : Verify Owner")
    public void Test_008_click_PlusButton() throws InterruptedException, FileNotFoundException {
        issueparttotech.Verify_Owner();
    }

    @Test(priority = 8 , description ="Test_009_Verify RO#",enabled=true)
    @Description("Test_description : Verify RO#")
    public void Test_009_Verify_RO() throws InterruptedException, FileNotFoundException {
        issueparttotech.Verify_RO();
    }

    @Test(priority = 9 , description ="Test_010_Verify Date",enabled=true)
    @Description("Test_description : Verify Date")
    public void Test_010_Verify_Date() throws InterruptedException, FileNotFoundException {
        issueparttotech.Verify_Date();
    }

    @Test(priority = 10 , description ="Test_011_Verify Description",enabled=true)
    @Description("Test_description : Verify Description")
    public void Test_011_Verify_Description() throws InterruptedException, FileNotFoundException {
        issueparttotech.Verify_Description();
    }

    @Test(priority = 11 , description ="Test_012_Verify VMRS",enabled=true)
    @Description("Test_description : Verify VMRS")
    public void Test_012_Verify_VMRS() throws InterruptedException, FileNotFoundException {
        issueparttotech.Verify_VMRS();
    }

    @Test(priority = 12 , description ="Test_013_Verify firstrow element",enabled=true)
    @Description("Test_description : Verify firstrow element")
    public void Test_013_Verify_firstrowElement() throws InterruptedException, FileNotFoundException {
        issueparttotech.Verify_firstrowElement();

    }

    @Test(priority = 13 , description ="Test_014_Click on select",enabled=true)
    @Description("Test_description : Click on select")
    public void Test_014_clickOnSelect() throws InterruptedException, FileNotFoundException {
        issueparttotech.clickOnSelect();
    }

    @Test(priority = 14 , description ="Test_015_Verify Employee Details",enabled=true)
    @Description("Test_description : Verify Employee Details")
    public void Test_015_verifyEmployeeDetails() throws InterruptedException, FileNotFoundException {
       issueparttotech.verifyEmployeeDetails();

    }

    @Test(priority = 15 , description ="Test_016_Verify Element",enabled=true)
    @Description("Test_description : Verify Element")
    public void Test_016_verifyElement() throws InterruptedException {
        issueparttotech.verifyElement();

    }

    @Test(priority = 16 , description ="Test_017_verify ",enabled=true)
    @Description("Test_description : verify")
    public void Test_017_verify() throws InterruptedException {
          issueparttotech.verify();
    }

    @Test(priority = 17 , description ="Test_018_Enter Part Number",enabled=true)
    @Description("Test_description : Enter Part Number")
    public void Test_018_enterPartNumber() throws InterruptedException {
           issueparttotech.enterPartNumber();

    }

    @Test(priority = 18 , description ="Test_019_Click on Issue Part",enabled=true)
    @Description("Test_description : Click on Issue Part")
    public void Test_019_clickOnIssuePart() throws InterruptedException {
           issueparttotech.clickOnIssuePart();

    }

    @Test(priority = 19 , description ="Test_020_Verify Part Name",enabled=true)
    @Description("Test_description : Verify Part Name")
    public void Test_020_VerifyPartName() throws InterruptedException, FileNotFoundException {
          issueparttotech.VerifyPartName();
    }

    @Test(priority = 20 , description ="Test_021_Click on Scan Badge",enabled=true)
    @Description("Test_description : Click on Scan Badge")
    public void Test_021_clickOnScanBadge() throws InterruptedException {
          issueparttotech.clickOnScanBadge();
    }

    @Test(priority = 21 , description ="Test_022_Click on Sign out",enabled=true)
    @Description("Test_description : Click on Sign out")
    public void Test_022_clickOnSignOut() throws InterruptedException {
           issueparttotech.clickOnSignOut();
    }

    @Test(priority = 22 , description ="Test_023_Login with tech credentials",enabled=true)
    @Description("Test_description : Login with tech credentials")
    public void Test_023_loginAgain() throws InterruptedException {
        loginPage.loginWithValidCredentials(appProp14.getProperty("TechUserName"),appProp14.getProperty("TechPassword"));
    }

    @Test(priority = 23 , description ="Test_024_Enter TechBadge and click on go",enabled=true)
    @Description("Test_description : Enter TechBadge and click on go")
    public void Test_024_Enter_TechBadge_ClickGo() throws InterruptedException, FileNotFoundException {
        issueparttotech.enterTechBadge();
        issueparttotech.clickOnGo();
    }
    @Test(priority = 24 , description ="Test_025_Click on Owner Name",enabled=true)
    @Description("Test_description : Click on Owner Name")
    public void Test_025_clickOwnerName() throws InterruptedException {
          issueparttotech.clickOwnerName();
    }

    @Test(priority = 25 , description ="Test_026_Click on Select button",enabled=true)
    @Description("Test_description : Click on Select button")
    public void Test_026_clickOnSelect() throws InterruptedException, FileNotFoundException {
        issueparttotech.clickOnSelectButton();
    }

    @Test(priority = 26 , description ="Test_027_Click on MoreUnit",enabled=true)
    @Description("Test_description : Click on MoreUnit")
    public void Test_027_clickOnMoreUnit() throws InterruptedException {
          issueparttotech.clickOnMoreUnit();
    }

    @Test(priority = 27 , description ="Test_028_Enter unit number",enabled=true)
    @Description("Test_description : Enter unit number")
    public void Test_028_EnterUnitNumber() throws InterruptedException, FileNotFoundException {
           issueparttotech.EnterUnitNumber();
    }

    @Test(priority = 28 , description ="Test_029_Click on select button",enabled=true)
    @Description("Test_description : Click on select button")
    public void Test_029_clickOnSelect1() throws InterruptedException, FileNotFoundException {
        issueparttotech.clickOnSelect1();
    }

    @Test(priority = 29 , description ="Test_030_Click on Part",enabled=true)
    @Description("Test_description : Click on Part")
    public void Test_030_clickOnPart() throws InterruptedException, FileNotFoundException {
        issueparttotech.clickOnPart();
    }

    @Test(priority = 30 , description ="Test_031_Click on Sign out",enabled=true)
    @Description("Test_description : Click on Sign out")
    public void Test_031_clickOnSignOut() throws InterruptedException {
        issueparttotech.clickOnSignOut();
    }

    @Test(priority = 31 , description ="Test_032_Verify username",enabled=true)
    @Description("Test_description : Verify username")
    public void Test_032_verifyUsername() throws InterruptedException {
        issueparttotech.verifyUserName();
    }


}
