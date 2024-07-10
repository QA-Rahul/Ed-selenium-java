package tests.Ticket;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import tests.TestDriverActions;

import java.io.FileNotFoundException;

@Listeners({utils.TestListener.class})
@Epic("Testing")
@Feature("AddSearchFieldToTheTelematicsManagerImportReadingsTab")

public class AddSearchFieldToTheTelematicsManagerImportReadingsTab extends TestDriverActions {

    @Test(priority=0,description="T_001_Login the page and go to telematics manager screen",enabled=true)
    @Description("Test Description - Login the page and go to telematics manager screen")
    public void T_001_gotoTelematicsManager() throws InterruptedException, FileNotFoundException {
        loginPage.loginWithValidCredentials(appProp65.getProperty("username"),appProp65.getProperty("password"));
        addSearchFieldToTelematicManager.gotoTelematicsManagerScreen();
    }

    @Test(priority=1,description="T_002_verify title telematics manager",enabled=true)
    @Description("Test Description - verify title telematics manager")
    public void T_002_verifytitle_TelematicsManager() throws InterruptedException {
        addSearchFieldToTelematicManager.verifytitle_TelematicsManager();
    }

    @Test(priority=2,description="T_003_verify description telematics Manager",enabled=true)
    @Description("Test Description - verify description telematics Manager")
    public void T_003_verifydescription_telematicsManager() throws InterruptedException {
        addSearchFieldToTelematicManager.verifydescription_telematicsManager();
    }

    @Test(priority=3,description="T_004_verify title Things To Do with links",enabled=true)
    @Description("Test Description - verify title Things To Do with links")
    public void T_004_title_ThingsToDo() throws InterruptedException {
        addSearchFieldToTelematicManager.title_ThingsToDo();
    }

    @Test(priority=4,description="T_005_click on link Import Readings",enabled=true)
    @Description("Test Description - click on link Import Readings")
    public void T_005_clickOnImportReadings() throws InterruptedException {
        addSearchFieldToTelematicManager.clickOnImportReadings();
    }
    @Test(priority=5,description="T_006_verify Import From Date field",enabled=true)
    @Description("Test Description - verify Import From Date field")
    public void T_006_verifyImportFromDate() throws InterruptedException{
        addSearchFieldToTelematicManager.verifyImportFromDate();
    }

    @Test(priority=6,description="T_007_verify Import End Date field",enabled=true)
    @Description("Test Description - verify Import End Date field")
    public void T_007_verifyImportEndDate() throws InterruptedException{
        addSearchFieldToTelematicManager.verifyImportEndDate();
    }

    @Test(priority=7,description="T_008_verify checkbox of show imported data with no error",enabled=true)
    @Description("Test Description - verify checkbox of show imported data with no error")
    public void T_008_verifycheckbox_ShowImportedDatawithnoError() throws InterruptedException{
        addSearchFieldToTelematicManager.verifycheckbox_ShowImportedDatawithnoError();
    }
    @Test(priority=8,description="T_009_verify search field",enabled=true)
    @Description("Test Description - verify search field")
    public void T_009_verifySearchField() throws InterruptedException{
        addSearchFieldToTelematicManager.verifySearchField();
    }
    @Test(priority=9,description="T_010_ verify refresh button",enabled=true)
    @Description("Test Description -  verify refresh button")
    public void T_010_verifyRefreshButton() throws InterruptedException{
        addSearchFieldToTelematicManager.verifyRefreshButton();
    }
    @Test(priority=10,description="T_011_verify column names present in Telematics manager table",enabled=true)
    @Description("Test Description - verify column names present in Telematics manager table")
    public void T_011_verifyColumnOfTelematicsManager() throws InterruptedException{
        addSearchFieldToTelematicManager.verifyColumnOfTelematicsManager();
    }
    @Test(priority=11,description="T_012_verify No Data To Display",enabled=true)
    @Description("Test Description - verify No Data To Display")
    public void T_012_verifyNoDataToDisplay() throws InterruptedException{
        addSearchFieldToTelematicManager.verifyNoDataToDisplay();
    }
    @Test(priority=12,description="T_013_enter import from date",enabled=true)
    @Description("Test Description - enter import from date")
    public void T_013_enterImportFromDate() throws InterruptedException{
        addSearchFieldToTelematicManager.enterImportFromDate();
    }
    @Test(priority=13,description="T_014_enter Import To date",enabled=true)
    @Description("Test Description - enter Import To date")
    public void T_014_enterImportToDate() throws InterruptedException{
        addSearchFieldToTelematicManager.enterImportToDate();
    }
    @Test(priority=14,description="T_015_enter unit number in search field",enabled=true)
    @Description("Test Description - enter unit number in search field")
    public void T_015_enterUnitNumber() throws InterruptedException{
        addSearchFieldToTelematicManager.enterUnitNumber();
    }
    @Test(priority=15,description="T_016_click on refresh button",enabled=true)
    @Description("Test Description - click on refresh button")
    public void T_016_clickOnRefreshButton() throws InterruptedException{
        addSearchFieldToTelematicManager.clickOnRefreshButton();
    }
    @Test(priority=16,description="T_017_verify link of Unit Number",enabled=true)
    @Description("Test Description - verify link of Unit Number")
    public void T_017_verifylinkOfUnitNumber() throws InterruptedException{
        addSearchFieldToTelematicManager.verifylinkOfUnitNumber();
    }
    @Test(priority=17,description="T_018_enter unit owner in search field",enabled=true)
    @Description("Test Description - enter unit owner in search field")
    public void T_018_enterUnitOwner() throws InterruptedException{
        addSearchFieldToTelematicManager.enterUnitOwner();
    }

    @Test(priority=18,description="T_019_click on refresh button",enabled=true)
    @Description("Test Description - click on refresh button")
    public void T_019_clickOnRefreshButton() throws InterruptedException{
        addSearchFieldToTelematicManager.clickOnRefreshButton();
    }
    @Test(priority=19,description="T_020_verify link Unit Owner",enabled=true)
    @Description("Test Description - verify link Unit Owner")
    public void T_020_verifylinkUnitOwner() throws InterruptedException{
        addSearchFieldToTelematicManager.verifylinkUnitOwner();
    }

     @Test(priority=20,description="T_021_Click on sign out and verify username",enabled=true)
    @Description("Test Description - Click on sign out and verify username")
    public void T_021_clickOnSignOutAndVerifyName() throws InterruptedException{
        addSearchFieldToTelematicManager.clickOnSignOutAndVerifyName();
    }






}



