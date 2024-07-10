  package tests.techRo;

import actions.LoginActions;
import io.qameta.allure.Description;
import org.testng.annotations.Test;
import tests.TestDriverActions;

import java.io.IOException;

public class ServiceManagerJournalize extends TestDriverActions {
    @Test(priority = 0, description = "Test_001_Login the page and Go to Financials ")
    @Description("Test Description: Login the page and Go to Financials ")
    public void Test_001_gotoFinancials ()  throws InterruptedException, IOException {
        if(LoginActions.environmentName.contains("EC")){
            loginPage.loginWithValidCredentials(appProp12.getProperty("username"),appProp12.getProperty("password"));
        } else if(LoginActions.environmentName.contains("EU")){
            loginPage.loginWithValidCredentials(appProp24.getProperty("username"),appProp24.getProperty("password"));
        }else if(LoginActions.environmentName.contains("QA")){
            loginPage.loginWithValidCredentials(appProp.getProperty("username"),appProp.getProperty("password"));
        }

        journalizepage.gotoFinancials();


    }
    @Test(priority = 1, description = "Test_001_Click OnGenerate Journals   ")
    @Description("Test Description: Click OnGenerate Journals")
    public void Test_002_clickOnGenerateJournals ()   throws InterruptedException, IOException {
        journalizepage.clickOnGenerateJournals();
        journalizepage.selectJournals();
        journalizepage. clickOnTableGenerateJournalsButton ();
//        journalizepage. verifyElementNotPresent ();

    }
    @Test(priority = 2, description = "Test_001_Click On Service Board   ")
    @Description("Test Description: Click On Service Board  ")
    public void Test_003_clickOnServiceBoard ()    throws InterruptedException, IOException {
        journalizepage.clickOnServiceBoard ();


    }
    @Test(priority = 3, description = "Test_001_Click Financial manager   ")
    @Description("Test Description: Click OnGenerate Journals")
    public void Test_004_clickOnFinancialManagerText ()    throws InterruptedException, IOException {
        journalizepage.clickOnFinancialManagerText();
 //       journalizepage. clickOnJournalSources ();
 //       journalizepage.verifyTodaysDate();
        journalizepage.clickOnSignOut ();

    }

}


