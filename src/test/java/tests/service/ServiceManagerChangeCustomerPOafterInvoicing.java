 package tests.service;

import actions.LoginActions;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import tests.TestDriverActions;

import java.io.FileNotFoundException;
@Listeners({utils.TestListener.class})
@Epic("Regression Test")
@Feature("UpdatePoNumber Test")


public class ServiceManagerChangeCustomerPOafterInvoicing extends TestDriverActions {

    @Test(priority=0, description="T_001 Login the page and go to the CompleteRo",enabled = true)
    @Description("Test Description -Login the page and go to the CompleteRo")
    public void gotoCompleteRo() throws FileNotFoundException, InterruptedException {
        if(LoginActions.environmentName.contains("EC")){
            loginPage.loginWithValidCredentials(appProp5.getProperty("username"),appProp5.getProperty("password"));
        }else if(LoginActions.environmentName.contains("EU")){
            loginPage.loginWithValidCredentials(appProp22.getProperty("username"),appProp22.getProperty("password"));
        }else if(LoginActions.environmentName.contains("NA")) {
            loginPage.loginWithValidCredentials(appProp.getProperty("username"),appProp.getProperty("password"));
        } else if(LoginActions.environmentName.contains("QA")){
            loginPage.loginWithValidCredentials(appProp.getProperty("username"),appProp.getProperty("password"));
        }

        update.gotoCompleteRo();
        update.clickOnUpdateCustomerPoNumber();
    }

    @Test(priority=1, description="T_002 Check that verify the element click on Save/Exit button and signout",enabled = true)
    @Description("Test Description -Check that verify the element click on Save/Exit button and signout")
    public void verification_ofElement_SignOut() throws InterruptedException {
        update.verifyElement();
        update.clickOnSaveExit();
        update.clickOnSignOut();
    }

}
