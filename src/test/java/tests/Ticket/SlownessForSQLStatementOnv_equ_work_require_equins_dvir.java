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

public class SlownessForSQLStatementOnv_equ_work_require_equins_dvir extends TestDriverActions {

    @Test(priority=0,description="T_001_go to Security setup Screen",enabled=true)
    @Description("Test Description - go to Security setup Screen")
    public void T_001_gotoSecuritySetupScreen() throws InterruptedException {
       loginPage.loginWithValidCredentials(appProp87.getProperty("username"),appProp87.getProperty("password"));
        slownessForSQL.gotoSecuritySetupScreen();
    }

 /*   @Test(priority=0,description="",enabled=true)
    @Description("Test Description - ")
    public void T_002_(){

    }

    @Test(priority=0,description="",enabled=true)
    @Description("Test Description - ")
    public void T_003_(){

    }

    @Test(priority=0,description="",enabled=true)
    @Description("Test Description - ")
    public void T_004_(){

    }

    @Test(priority=0,description="",enabled=true)
    @Description("Test Description - ")
    public void T_005_(){

    }   */




}



