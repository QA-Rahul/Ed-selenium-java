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
@Feature("BalanceSheetAndIncomeStatementNotPopulatingData")

public class BalanceSheetAndIncomeStatementNotPopulatingData extends TestDriverActions {

    @Test(priority=0,description="T_001_Login the page and go to Reports",enabled=true)
    @Description("Test Description - Login the page and go to Reports")
    public void T_001_gotoReports() throws InterruptedException, FileNotFoundException {
       loginPage.loginWithValidCredentials(appProp48.getProperty("username"),appProp48.getProperty("password"));
        balancesheet.gotoReports();
    }

    @Test(priority=1,description="T_002_Click on Finanace",enabled=true)
    @Description("Test Description -Click on Finanace")
    public void T_002_clickOnFinanace() throws InterruptedException {
         balancesheet.clickOnFinance();
    }
    @Test(priority=2,description="T_003_Click on Balance Sheet",enabled=true)
    @Description("Test Description -Click on Balance Sheet")
    public void T_003_clickOnBalanceSheet() throws InterruptedException {
           balancesheet.clickOnBalanceSheet();
    }
    @Test(priority=3,description="T_004_Select Balance Sheet from Report type",enabled=true)
    @Description("Test Description -Select Balance Sheet from Report type")
    public void T_004_selectBalancesheet_ReportType() throws InterruptedException {
           balancesheet.selectBalanceSheet();
    }
    @Test(priority=4,description="T_005_Select Balance Sheet from Report Specification ",enabled=true)
    @Description("Test Description -Select Balance Sheet from Report Specification")
    public void T_005_selectbalancesheet_reportSpecification() throws InterruptedException {
         balancesheet.selectReportSpecification();
    }
    @Test(priority=5,description="T_006_select accounting year",enabled=true)
    @Description("Test Description -select accounting year")
    public void T_006_selectAccountingYear() throws InterruptedException {
          balancesheet.selectAccountingYear();
    }  @Test(priority=6,description="T_007_select accounting period",enabled=true)
    @Description("Test Description -select accounting period")
    public void T_007_selectAccountingPeriod() throws InterruptedException, FileNotFoundException {
          balancesheet.selectAccountiongPeriod();
    }
    @Test(priority=7,description="T_008_clickOnRunReport()",enabled=true)
    @Description("Test Description -clickOnRunReport()")
    public void T_008_clickOnRunReport() throws InterruptedException, FileNotFoundException {
          balancesheet.clickOnRunReport();
    }
    @Test(priority=8,description="T_009_Verify PDF",enabled=true)
    @Description("Test Description -Verify PDF")
    public void T_009_verifyPDF() throws IOException, InterruptedException {
          balancesheet.verifyPDF();
    }
    @Test(priority=9,description="T_010_Click on sign out ",enabled=true)
    @Description("Test Description -Click on sign out ")
    public void T_010_clickOnSignOut() throws InterruptedException {
        balancesheet.clickOnSignOut();
    }
    @Test(priority=10,description="T_011_again login the page",enabled=true)
    @Description("Test Description -again login the page")
    public void T_011_clickOnIncomeStatement() throws InterruptedException, FileNotFoundException {
        loginPage.loginWithValidCredentials(appProp48.getProperty("username"),appProp48.getProperty("password"));
        balancesheet.gotoReports();
        balancesheet.clickOnFinance();

    }
    @Test(priority=11,description="T_012_click on Income Statement",enabled=true)
    @Description("Test Description -click on Income Statement")
    public void T_012_clickSignOut_verifyUsername() throws InterruptedException {
        balancesheet.clickOnIncomeStatement();
    }
    @Test(priority=12,description="T_013_Select Income statement from Report Type",enabled=true)
    @Description("Test Description - Select Income statement from Report Type")
    public void T_013_selectIncomeStatement() throws InterruptedException {
         balancesheet.selectIncomeStatement();
    }
    @Test(priority=13,description="T_014_Select Income statement from Report Specification",enabled=true)
    @Description("Test Description -Select Income statement from Report Specification")
    public void T_014_selectIncome_ReportSpecification() throws InterruptedException {
         balancesheet.selectIncome_ReportSpecification();
    }
    @Test(priority=14,description="T_015_select accounting year",enabled=true)
    @Description("Test Description -select accounting year")
    public void T_015_selectAccountingYear() throws InterruptedException {
          balancesheet.selectAccountingYear();
    }  @Test(priority=15,description="T_016_select accounting period",enabled=true)
    @Description("Test Description -select accounting period")
    public void T_016_selectAccountingPeriod() throws InterruptedException, FileNotFoundException {
           balancesheet.selectAccountiongPeriod();
    }  @Test(priority=16,description="T_017_click on Run Report",enabled=true)
    @Description("Test Description -click on Run Report")
    public void T_017_clickRunReport() throws InterruptedException, FileNotFoundException {
          balancesheet.clickOnRunReport();
    }
    @Test(priority=17,description="T_018_click on Report History",enabled=true)
    @Description("Test Description -click on Report History")
    public void T_018_clickReportHistory() throws InterruptedException, FileNotFoundException {
 //         balancesheet.clickOnReportHistory();
    }
    @Test(priority=18,description="T_019_click on view",enabled=true)
    @Description("Test Description -click on view")
    public void T_019_clickOnView() throws InterruptedException {
 //          balancesheet.clickOnView();
    }
    @Test(priority=19,description="T_020_Verify PDF",enabled=true)
    @Description("Test Description -Verify PDF")
    public void T_020_verifyPDF() throws IOException, InterruptedException {
          balancesheet.verifyPDF();
    }
    @Test(priority=20,description="T_021_Click on sign out and verify username",enabled=true)
    @Description("Test Description -Click on sign out and verify username")
    public void T_021_clickSignOut_verifyUsername() throws InterruptedException {
         balancesheet.clickOnSignOut();
         balancesheet.verifyUsername();
    }

}
