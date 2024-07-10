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
@Feature("SafetyCertificatesReportCharacterLimit")

public class SafetyCertificatesReportCharacterLimit extends TestDriverActions {

    @Test(priority=0,description="T_001_Login the page and goi to reports",enabled=true)
    @Description("Test Description - Login the page and goi to reports")
    public void T_001_gotoReports() throws FileNotFoundException, InterruptedException {
        loginPage.loginWithValidCredentials(appProp52.getProperty("username"),appProp52.getProperty("password"));
        safetycertificate.gotoReport();
    }

    @Test(priority=1,description="T_002_click on fleet present in report category",enabled=true)
    @Description("Test Description - click on fleet present in report category")
    public void T_002_clickOnFleet() throws InterruptedException {
           safetycertificate.clickOnFleet();
    }
    @Test(priority=2 ,description="T_003_click on safety certificate",enabled=true)
    @Description("Test Description -click on safety certificate")
    public void T_003_clickOnSafetyCertificate() throws InterruptedException {
          safetycertificate.clickOnSafetyCertificate();
    }
    @Test(priority=3,description="T_004_Enter from date",enabled=true)
    @Description("Test Description - Enter from date")
    public void T_004_enterFromDate() throws InterruptedException {
          safetycertificate.enterFromDate();
    }
    @Test(priority=4,description="T_005_Enter to date",enabled=true)
    @Description("Test Description - Enter to date")
    public void T_005_enterTodate() throws InterruptedException {
          safetycertificate.enterToDate();
    }
    @Test(priority=5,description="T_006_Click on Run Report",enabled=true)
    @Description("Test Description - Click on Run Report")
    public void T_006_clickRunReport() throws InterruptedException {
          safetycertificate.clickReportRun();
    }
    @Test(priority=6,description="T_007_Display whole unit# on the safety certificates report ",enabled=true)
    @Description("Test Description -Display whole unit# on the safety certificates report")
    public void T_007_verifyUnitonSafetyCertificate() throws IOException, InterruptedException {
          safetycertificate.verifyUnitCharacter();
    }
    @Test(priority=7,description="T_008_Click on sign out and verify username",enabled=true)
    @Description("Test Description -Click on sign out and verify username")
    public void T_008() throws InterruptedException {
           safetycertificate.clickOnSignOutAndVerifyName();
    }

}
