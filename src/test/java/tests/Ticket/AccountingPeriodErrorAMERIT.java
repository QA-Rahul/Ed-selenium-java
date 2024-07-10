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
@Feature("Accounting Period Error AMERIT")

public class AccountingPeriodErrorAMERIT extends TestDriverActions {
    @Test(priority=0,description="T_001_Login the page and go to Finance",enabled=true)
    @Description("Test Description-Login the page and go to Finance")
    public void T_001_gotoScreen() throws InterruptedException, FileNotFoundException {
        loginPage.loginWithValidCredentials(appProp64.getProperty("username"),appProp64.getProperty("password"));
        accountingperioderroramerit.gotoFinanceScreen();

    }

    @Test(priority=1,description="T_002_verify title Financial Manager",enabled=true)
    @Description("Test Description-verify title Financial Manager")
    public void T_002_verifyTitleFinancialManager() throws InterruptedException, FileNotFoundException {
        accountingperioderroramerit.verifyTitleFinancialManager();

    }

    @Test(priority=2,description="T_003_verify Financial manager description",enabled=true)
    @Description("Test Description-verify Financial manager description")
    public void T_003_verifyFinancialManagerDescription() throws InterruptedException, FileNotFoundException {
        accountingperioderroramerit.verifyFinancialManagerDescription();

    }

    @Test(priority=3,description="T_004_verify Things To Do",enabled=true)
    @Description("Test Description-verify Things To Do")
    public void T_004_verifyThingsToDo() throws InterruptedException, FileNotFoundException {
        accountingperioderroramerit.verifyThingsToDo();

    }
    @Test(priority=4,description="T_005_click on accounting period link",enabled=true)
    @Description("Test Description- click on accounting period link")
    public void T_005_clickOnAccountingPeriod() throws InterruptedException, FileNotFoundException {
        accountingperioderroramerit.clickOnAccountingPeriod();

    }

    @Test(priority=5,description="T_006_verify title Accounting Years",enabled=true)
    @Description("Test Description-verify title Accounting Years")
    public void T_006_verifyTitle_AccountingYears() throws InterruptedException, FileNotFoundException {
        accountingperioderroramerit.verifyTitle_AccountingYears();

    }

    @Test(priority=6,description="T_007_verify Add Accounting Year",enabled=true)
    @Description("Test Description-verify Add Accounting Year")
    public void T_007_verifyAddAccountingYear() throws InterruptedException, FileNotFoundException {
        accountingperioderroramerit.verifyAddAccountingYear();

    }
    @Test(priority=7,description="T_008_verify Accounting Year",enabled=true)
    @Description("Test Description-verify Accounting Year")
    public void T_008_verifyAccountingYear() throws InterruptedException, FileNotFoundException {
        accountingperioderroramerit.verifyAccountingYear();

    }

    @Test(priority=8,description="T_009_verify button Add Accounting Period",enabled=true)
    @Description("Test Description-verify button Add Accounting Period")
    public void T_009_verifybtn_AddAccountingPeriod() throws InterruptedException, FileNotFoundException {
        accountingperioderroramerit.verifybtn_AddAccountingPeriod();

    }

    @Test(priority=9,description="T_010_verify Accounting year coulmn",enabled=true)
    @Description("Test Description-verify Accounting year coulmn")
    public void T_010_verifyAccountingYearCoulmn() throws InterruptedException, FileNotFoundException {
        accountingperioderroramerit.verifyAccountingYearCoulmn();

    }
    @Test(priority=10,description="T_011_verify start date , end date fields",enabled=true)
    @Description("Test Description- verify start date , end date fields")
    public void T_011_verifyStartDateEndDate() throws InterruptedException, FileNotFoundException {
        accountingperioderroramerit.verifyStartDateEndDate();

    }

    @Test(priority=11,description="T_012_click on Add Accounting Year btn",enabled=false)
    @Description("Test Description-click on Add Accounting Year btn")
    public void T_012_clickAddAccountingYear() throws InterruptedException, FileNotFoundException {
        accountingperioderroramerit.clickAddAccountingYear();

    }

    @Test(priority=12,description="T_013_verify title Add Accounting Year",enabled=false)
    @Description("Test Description-verify title Add Accounting Year")
    public void T_013_verifytitle_AddAccountingYear() throws InterruptedException, FileNotFoundException {
        accountingperioderroramerit.verifytitle_AddAccountingYear();

    }
     @Test(priority=13,description="T_014_verify text Accounting Year",enabled=false)
    @Description("Test Description-verify text Accounting Year")
    public void T_014_verifytxt_AccountingYear() throws InterruptedException, FileNotFoundException {
        accountingperioderroramerit.verifytxt_AccountingYear();

    }

    @Test(priority=14,description="T_015_verify cancle and AddCountingYear",enabled=false)
    @Description("Test Description-verify cancle and AddCountingYear")
    public void T_015_verifybtn_AddCountingYear() throws InterruptedException, FileNotFoundException {
        accountingperioderroramerit.verifybtn_AddCountingYear();

    }
    @Test(priority=15,description="T_016_verify cancle and AddCountingYear",enabled=false)
    @Description("Test Description-verify cancle and AddCountingYear")
    public void T_016_verifybtn_AddCountingYear() throws InterruptedException, FileNotFoundException {
        accountingperioderroramerit.verifybtn_AddCountingYear();

    }

    @Test(priority=16,description="T_017_enter year on Accounting Year",enabled=false)
    @Description("Test Description - enter year on Accounting Year")
    public void T_017_enterYear() throws InterruptedException, FileNotFoundException {
        accountingperioderroramerit.enterYear();

    }
    @Test(priority=17,description="T_018_click on button Add Counting Year",enabled=false)
    @Description("Test Description-click on button Add Counting Year")
    public void T_018_clickAddCountingYear() throws InterruptedException, FileNotFoundException {
        accountingperioderroramerit.clickAddCountingYear();

    }

    @Test(priority=18,description="T_019_Enter date in start date field",enabled=true)
    @Description("Test Description - Enter date in start date field")
    public void T_019_enterDateStartDate() throws InterruptedException, FileNotFoundException {
        accountingperioderroramerit.enterDateStartDate();

    }
    @Test(priority=19,description="T_020_enter date in end date field",enabled=true)
    @Description("Test Description - enter date in end date field")
    public void T_020_enterDateEndDate() throws InterruptedException, FileNotFoundException {
        accountingperioderroramerit.enterDateEndDate();

    }
    @Test(priority=20,description="T_021_click on sign out button",enabled=true)
    @Description("Test Description :- click on sign out button")
    public void T_021_clickOnSignOut() throws InterruptedException{
        issuePartsToROExceptionError.clickOnSignOut();
    }








}
