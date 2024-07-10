package tests.Ticket;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;

import io.qameta.allure.Feature;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import tests.TestDriverActions;

@Listeners({utils.TestListener.class})
@Epic("Testing")
@Feature("Sales Tax Liability Cash Basis Calculation Issue BROTHERTON")


public class SalesTaxLiabilityCashBasisCalculationIssueBROTHERTON extends TestDriverActions {

    @Test(priority=0,description="T_001_go to Report screen",enabled=true)
    @Description("Test Description - go to Report screen")
    public void T_001_gotoReportScreen() throws InterruptedException {
         loginPage.loginWithValidCredentials(appProp69.getProperty("username"),appProp69.getProperty("password"));
         salesTaxLiabilityCash.gotoReportScreen();
    }

    @Test(priority=1,description="T_002_verify title Reports",enabled=true)
    @Description("Test Description - verify title Reports")
    public void T_002_verifyTitleReports() throws InterruptedException {
        salesTaxLiabilityCash.verifyTitleReports();
    }
    @Test(priority=2,description="T_003_verify Report Categories",enabled=true)
    @Description("Test Description - verify Report Categories")
    public void T_003_verifyReportCategories() throws InterruptedException {
        salesTaxLiabilityCash.verifyReportCategories();
    }

    @Test(priority=3,description="T_004_verify Available Reports For AR",enabled=true)
    @Description("Test Description - verify Available Reports For AR")
    public void T_004_verifyAvailableReportsForAR() throws InterruptedException {
        salesTaxLiabilityCash.verifyAvailableReportsForAP();
    }

    @Test(priority=4,description="T_005_ verify Report Parameters",enabled=true)
    @Description("Test Description -  verify Report Parameters")
    public void T_005_verifyReportParameters() throws InterruptedException {
        salesTaxLiabilityCash.verifyReportParameters();
    }

    @Test(priority=5,description="T_006_verify category AR",enabled=true)
    @Description("Test Description - verify category AR")
    public void T_006_verifycategory_AR() throws InterruptedException {
        salesTaxLiabilityCash.verifycategory_AR();
    }

     @Test(priority=6,description="T_007_click on category AR",enabled=true)
    @Description("Test Description - click on category AR")
    public void T_007_clickOnAR() throws InterruptedException {
         salesTaxLiabilityCash.clickOnAR();
    }

    @Test(priority=7,description="T_008_click on available reports of AR",enabled=true)
    @Description("Test Description - click on available reports of AR")
    public void clickOnSalesTaxLiabilityAccrualBasis() throws InterruptedException {
        salesTaxLiabilityCash.clickOnSalesTaxLiabilityAccrualBasis();
    }

    @Test(priority=8,description="T_009_verify FromDate and ToDate",enabled=true)
    @Description("Test Description - verify FromDate and ToDate")
    public void T_009_verifyFromdateToDate() throws InterruptedException {
        salesTaxLiabilityCash.verifyFromdateToDate();
    }

    @Test(priority=9,description="T_010_enter From Date",enabled=true)
    @Description("Test Description - enter From Date")
    public void enterFromDate() throws InterruptedException {
        salesTaxLiabilityCash.enterFromDate();
    }

    @Test(priority=10,description="T_011_enter To Date",enabled=false)
    @Description("Test Description - enter To Date")
    public void T_011_enterToDate() throws InterruptedException {
        salesTaxLiabilityCash.enterToDate();
    }

    @Test(priority=11,description="T_012_click on Run Report",enabled=true)
    @Description("Test Description - click on Run Report")
    public void T_012_clickOnRunReport() throws InterruptedException {
        salesTaxLiabilityCash.clickOnRunReport();
    }
/*    @Test(priority=12,description="T_013_",enabled=true)
    @Description("Test Description - ")
    public void T_013_(){
        salesTaxLiabilityCash.
    }

    @Test(priority=0,description="",enabled=true)
    @Description("Test Description - ")
    public void a(){
        salesTaxLiabilityCash.
    }


          */




}



