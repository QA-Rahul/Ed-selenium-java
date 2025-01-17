  package tests.techRo;

import actions.LoginActions;
import constants.SheetConstants;
import io.qameta.allure.Description;
import org.testng.annotations.Test;
import tests.TestDriverActions;

import java.io.IOException;

public class ServiceManagerInvoice extends TestDriverActions {


    @Test(priority = 0, description = "Test_001_Login the page and Go to CompleteRo Screen")
    @Description("Test Description: Login the page and Go to CompleteRo Screen")
    public void Test_001_gotoCompleteRo() throws InterruptedException, IOException {
        if(LoginActions.environmentName.contains("EC")) {
            loginPage.loginWithValidCredentials(appProp16.getProperty("username"),appProp16.getProperty("password"));
        }else if(LoginActions.environmentName.contains("EU")){
            loginPage.loginWithValidCredentials(appProp23.getProperty("username"),appProp23.getProperty("password"));
        }else if(LoginActions.environmentName.contains("NA")){
            loginPage.loginWithValidCredentials(appProp42.getProperty("username"),appProp42.getProperty("password"));
        }else if(LoginActions.environmentName.contains("QA")){
            loginPage.loginWithValidCredentials(appProp.getProperty("username"),appProp.getProperty("password"));
        }

        completeropage.goToCompleteROScreen();

    }

    @Test(priority = 1, description = "Test_002_Enter the Ro Number in search box ")
    @Description("Test Description: Enter the Ro Number in search box ")
    public void Test_002_verifyElement() throws InterruptedException, IOException {
        completeropage.enterDataInSearchTextArea ();

    }
    @Test(priority = 2, description = "Test_003_Click On Reference Number and verify RODate ")
    @Description("Test Description:Click On Reference Number and verify RODate")
    public void Test_003_inputRoNumber() throws InterruptedException, IOException {
           completeropage.clickOnRoNumber () ;
           completeropage.verifyRODate1();

    }
    @Test(priority = 3, description = "Test_004_Enter Duplicate Internal PO Number and verify element ")
    @Description("Test Description:  Enter Duplicate Internal PO Number and verify element ")
    public void Test_004_clickReferenceNumber() throws InterruptedException, IOException {

        completeropage.enterDuplicateInternalPONumber();
 //       completeropage.verifyWarningPopUpElement();
 //       completeropage.clickOKButton();
    }
    @Test(priority = 4, description = "Test_005_Enter Internal PO Number and click on Invoice ")
    @Description("Test Description: Enter Internal PO Number and click on Invoice  ")
    public void Test_005_enterInternalPoNumber() throws InterruptedException, IOException {
        completeropage.enterInternalPONumber();

 //       completeropage.changeInvoiceDate();
        completeropage. clickInvoiceButton ();
 //       completeropage.clickOnclose();
//        completeropage.clickOncancle();
 //       completeropage.clickOk();
        completeropage. clickSignOut ();
        completeropage.ClickUserNameTextArea ();

    }

}