package tests.Ticket;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import tests.TestDriverActions;

@Listeners({utils.TestListener.class})
@Epic("Testing")
@Feature("Sales Tax Liabiltiy Accrual Basis Disrepancy")

public class SalesTaxLiabiltiyAccrualBasisDisrepancy extends TestDriverActions {

    @Test(priority=0,description="T_001_Login the page",enabled=true)
    @Description("Test Description :- Login the page")
    public void T_001_gotoReportsScreen() throws InterruptedException {
        loginPage.loginWithValidCredentials(appProp.getProperty("appProp59"),appProp.getProperty("appProp59"));
        SalesTaxLiability.gotoReportsScreen();
    }

    @Test(priority=1,description="T_002_verify title Reports",enabled=true)
    @Description("Test Description :-verify title Reports")
    public void T_002_verifyTitleReports() throws InterruptedException {
         SalesTaxLiability.verifyTitleReports();
    }

    @Test(priority=2,description="T_003_verify Report Categories",enabled=true)
    @Description("Test Description :- verify Report Categories")
    public void T_003_verifyReportCategories() throws InterruptedException {
         SalesTaxLiability.verifyReportCategories();
    }

    @Test(priority=3,description="T_004_verify Available Reports For AP",enabled=true)
    @Description("Test Description :-verify Available Reports For AP")
    public void T_004_verifyAvailableReportsForAP() throws InterruptedException {
        SalesTaxLiability.verifyAvailableReportsForAP();
    }

    @Test(priority=4,description="T_005_verify Report Parameters",enabled=true)
    @Description("Test Description :-verify Report Parameters")
    public void T_005_verifyReportParameters() throws InterruptedException {
         SalesTaxLiability.verifyReportParameters();
    }

    @Test(priority=5,description="T_006_verify category AR",enabled=true)
    @Description("Test Description :-verify category AR")
    public void T_006_() throws InterruptedException {
          SalesTaxLiability.verifycategory_AR();
    }

    @Test(priority=6,description="T_007_click on category AR",enabled=true)
    @Description("Test Description :-click on category AR")
    public void T_007_clickOnAR() throws InterruptedException {
          SalesTaxLiability.clickOnAR();
    }

 /*   @Test(priority=0,description="",enabled=true)
    @Description("Test Description :-")
    public void a() throws InterruptedException {

    }

    @Test(priority=0,description="",enabled=true)
    @Description("Test Description :-")
    public void a() throws InterruptedException {

    }   */

}
