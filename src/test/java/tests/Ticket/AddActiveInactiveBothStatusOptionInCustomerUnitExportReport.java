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
@Feature("AddActiveInactiveBothStatusOptionInCustomerUnitExportReport")

public class AddActiveInactiveBothStatusOptionInCustomerUnitExportReport extends TestDriverActions {

    @Test(priority=0,description="T_001_Login the page and go to Report",enabled=true)
    @Description("Test Description-Login the page and go to Report")
    public void T_001_gotoReportScreen() throws InterruptedException, FileNotFoundException {
        loginPage.loginWithValidCredentials(appProp86.getProperty("username"),appProp86.getProperty("password"));
        addActiveInactive.gotoReports();
    }
    @Test(priority=1,description="T_002_Click on Fleet",enabled=true)
    @Description("Test Description-Click on Fleet")
    public void T_002_clickonFleet() throws InterruptedException {
        addActiveInactive.clickonFleet();
    }
    @Test(priority=2,description="T_003_click on customer unit export",enabled=true)
    @Description("Test Description-click on customer unit export")
    public void T_003_clickOnCustomerUnitExport() throws InterruptedException {
          addActiveInactive.customerUnitsExport();
    }
    @Test(priority=3,description="T_004_Verify Customer Status",enabled=true)
    @Description("Test Description-Verify Customer Status")
    public void T_004_verifyCustomerStatus() throws InterruptedException {
           addActiveInactive.verifyCustomerStatus();
    }
    @Test(priority=4,description="T_005_Verify Equipment Status",enabled=true)
    @Description("Test Description-Verify Equipment Status")
    public void T_005_verifyEquipmentStatus() throws InterruptedException {
          addActiveInactive.verifyEquipmentStatus();
    }
    @Test(priority=5,description="T_006_Select Biling Type",enabled=true)
    @Description("Test Description-Select Biling Type")
    public void T_006_selectBilingType() throws InterruptedException {
          addActiveInactive.selectBilingType();
    }
    @Test(priority=6,description="T_007_Select all the types",enabled=true)
    @Description("Test Description-Select all the types")
    public void T_007_selectAlltheTypes() throws InterruptedException {
           addActiveInactive.selectEquipmentType();
           addActiveInactive.selectsubType();
           addActiveInactive.selectEquipmentClass();
           addActiveInactive.selectEquipmentProgram();
           addActiveInactive.selectPmScheduleGroup();
           addActiveInactive.selectWarrentyGroup();
    }

    @Test(priority=7,description="T_008_click on active button",enabled=true)
    @Description("Test Description-click on active button")
    public void T_008_clickOn_activeButton_both() throws InterruptedException {
          addActiveInactive.clickOnBoth();
          addActiveInactive.clickEstimateStatusInactiveRadio();
    }

    @Test(priority=8,description="T_009_click on Run Report",enabled=true)
    @Description("Test Description-click on Run Report")
    public void T_009_clickOnRunReport() throws InterruptedException {
          addActiveInactive.clickOnRunReport();
    }
    @Test(priority=9,description="T_010_verify status",enabled=true)
    @Description("Test Description - verify status")
    public void T_010_verifystatus() throws IOException, InterruptedException {
         addActiveInactive.readExcel();
         addActiveInactive.verifyStatus();
    }

    @Test(priority=10,description="T_011_Click on two different radio button",enabled=true)
    @Description("Test Description-Click on two different radio button")
    public void T_011_clickonActive_InactiveButton() throws InterruptedException {
           addActiveInactive.clickOnInactive();
           addActiveInactive.clickEstimateStatusActiveRadioButton();
    }
    @Test(priority=11,description="T_012_click on Run Report",enabled=true)
    @Description("Test Description-click on Run Report")
    public void T_012_clickOnrunReport() throws InterruptedException {
        addActiveInactive.clickOnRunReport();
    }
    @Test(priority=12,description="T_013_verify status",enabled=true)
    @Description("Test Description - verify status")
    public void T_013_verifystatus() throws IOException, InterruptedException {
        addActiveInactive.readExcel();
        addActiveInactive.verifyStatus();
    }

    @Test(priority=13,description="T_014_Click on two different radio button",enabled=true)
    @Description("Test Description-Click on two different radio button")
    public void T_014_clickRadioButton() throws InterruptedException {
          addActiveInactive.clickOnActive();
          addActiveInactive.clickEstimateStatusRadioBoth();
    }
    @Test(priority=14,description="T_015_click on Run Report",enabled=true)
    @Description("Test Description-click on Run Report")
    public void T_015_clickRunButton() throws InterruptedException {
        addActiveInactive.clickOnRunReport();
    }
    @Test(priority=15,description="T_016_verify status",enabled=true)
    @Description("Test Description - verify status")
    public void T_016_verifystatus() throws IOException, InterruptedException {
        addActiveInactive.readExcel();
        addActiveInactive.verifyStatus();
    }
    @Test(priority=16,description="T_017_Click on sign out and verify username",enabled=true)
    @Description("Test Description-Click on sign out and verify username")
    public void T_017_clickOnSignOut() throws InterruptedException {
          addActiveInactive.clickOnSignOutAndVerifyName();
    }


}
