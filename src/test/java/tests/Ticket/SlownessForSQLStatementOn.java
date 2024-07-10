package tests.Ticket;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import tests.TestDriverActions;

@Listeners({utils.TestListener.class})
@Epic("Testing")
@Feature("Slowness For SQL Statement On v_equ_work_require_equins_dvir")

public class SlownessForSQLStatementOn extends TestDriverActions {

    @Test(priority=0,description="T_001_go to Security setup Screen",enabled=true)
    @Description("Test Description - go to Security setup Screen")
    public void T_001_gotoSecuritySetupScreen() throws InterruptedException {
       loginPage.loginWithValidCredentials(appProp87.getProperty("username"),appProp87.getProperty("password"));
        slownessForSQL.gotoSecuritySetupScreen();
    }

    @Test(priority=1,description="T_002_verify sub tabs of security setup",enabled=true)
    @Description("Test Description - verify sub tabs of security setup")
    public void T_002_verifySubTabsSecuritySetup() throws InterruptedException {
        slownessForSQL.verifySubTabsSecuritySetup();
    }

    @Test(priority=2,description="T_003_click on tab Global System Parameters",enabled=true)
    @Description("Test Description - click on tab Global System Parameters")
    public void T_003_clickOnGlobalSystemParameters() throws InterruptedException {
        slownessForSQL.clickOnGlobalSystemParameters();
    }

    @Test(priority=3,description="T_004_verify title System Parameters",enabled=true)
    @Description("Test Description - verify title System Parameters")
    public void T_004_verifyTitleSystemParameters() throws InterruptedException {
        slownessForSQL.verifyTitleSystemParameters();
    }

    @Test(priority=4,description="T_005_verify tab Add System Parameter",enabled=true)
    @Description("Test Description - verify tab Add System Parameter")
    public void T_005_verifyTabAddSystemParameters() throws InterruptedException {
        slownessForSQL.verifyTabAddSystemParameters();
    }
    @Test(priority=5,description="T_006_verify Search",enabled=true)
    @Description("Test Description - verify Search")
    public void T_006_verifySearch() throws InterruptedException {
        slownessForSQL.verifySearch();
    }

    @Test(priority=6,description="T_007_enter System Parameter name in search box",enabled=true)
    @Description("Test Description - enter System Parameter name in search box")
    public void T_007_enterSystemParameterName() throws InterruptedException{
        slownessForSQL.enterSystemParameterName();
    }
 /*   @Test(priority=7,description="T_008_",enabled=true)
    @Description("Test Description - ")
    public void T_008_() throws InterruptedException{
        slownessForSQL.
    }

    @Test(priority=8,description="T_009_",enabled=true)
    @Description("Test Description - ")
    public void T_009_() throws InterruptedException{
        slownessForSQL.
    }
    @Test(priority=0,description="",enabled=true)
    @Description("Test Description - ")
    public void T_005_() throws InterruptedException{
        slownessForSQL.
    }
    @Test(priority=0,description="",enabled=true)
    @Description("Test Description - ")
    public void T_004_() throws InterruptedException{
        slownessForSQL.
    }

    @Test(priority=0,description="",enabled=true)
    @Description("Test Description - ")
    public void T_005_() throws InterruptedException{
        slownessForSQL.
    }
    */




}



