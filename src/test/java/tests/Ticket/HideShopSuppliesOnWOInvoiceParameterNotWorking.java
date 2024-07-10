package tests.Ticket;

//#34633 Hide Shop Supplies on WO Invoice Parameter not working - ABCO --[E3-I1643]

import io.qameta.allure.Description;
import org.testng.annotations.Test;
import tests.TestDriverActions;

import java.io.FileNotFoundException;
import java.io.IOException;

public class HideShopSuppliesOnWOInvoiceParameterNotWorking extends TestDriverActions {
    @Test(priority = 0, description = "T_001_Login the page and go to CompleteRo", enabled = true)
    @Description("Test Description : Login the page and go to complete Ro Screen")
    public void T_001_goToReport() throws FileNotFoundException, InterruptedException {
        loginPage.loginWithValidCredentials(appProp61.getProperty("username"), appProp61.getProperty("password"));
        hideshopsupplies.gotoCompleteRo();
    }
    @Test(priority = 1, description = "T_002_click On Invoice ", enabled = true)
    @Description("Test Description : click On Invoice ")
    public void T_002_clickOnInvoice() throws FileNotFoundException, InterruptedException {
        hideshopsupplies.clickOnInvoice();
        hideshopsupplies.enterRoInvoiceNumber();
        hideshopsupplies.clickOnRefresh();

      }
    @Test(priority = 2, description = "T_003_verify InvoiceRO ", enabled = true)
    @Description("Test Description : verifyInvoiceRO ")
    public void T_003_verifyInvoiceRO() throws IOException, InterruptedException {
        hideshopsupplies.verifyInvoiceRO();
        hideshopsupplies.clickOnInvoiceRO();
        hideshopsupplies.clickOnCustomerInvoice();
        hideshopsupplies.VerifyTaxesonPDF();

    }
    @Test(priority = 3, description = "T_004click On Back To CompleteRO  ", enabled = true)
    @Description("Test Description : click On Back To CompleteRO ")
    public void T_004_clickOnBackToCompleteRO () throws IOException, InterruptedException {
        hideshopsupplies.clickOnBackToCompleteRO();
        hideshopsupplies.gotoSecuritySetup();
        hideshopsupplies.clickOnGlobalSystemParameter ();

    }
    @Test(priority = 4, description = "T_005 enter the Show shop Supplies  ", enabled = true)
    @Description("Test Description : enter the Show shop Supplies ")
    public void T_005_entertheShowshopSupplies () throws IOException, InterruptedException {
        hideshopsupplies.entertheShowshopSupplies();
        hideshopsupplies.verifytital ();
        hideshopsupplies.verifyActive ();
        hideshopsupplies.clickOn905TruckandTrailerRepair ();

    }
    @Test(priority = 5, description = "T_006 Required SystemValue  ", enabled = true)
    @Description("Test Description : Required SystemValue ")
    public void T_006_RequiredSystemValue () throws IOException, InterruptedException {
        hideshopsupplies.RequiredSystemValue();
        hideshopsupplies.enterSystemValue();
        hideshopsupplies.clickOnSaveExit();
        hideshopsupplies.clickOnsignOut();

    }
    @Test(priority = 6, description = "T_001_Login the page and go to Report Screen", enabled = true)
    @Description("Test Description : Login the page and go to complete Ro Screen")
    public void T_001_CompleteRO() throws IOException, InterruptedException {
        loginPage.loginWithValidCredentials(appProp61.getProperty("username"), appProp61.getProperty("password"));
        hideshopsupplies.gotoCompleteRo();
        hideshopsupplies.clickOnInvoice();
        hideshopsupplies.enterRoInvoiceNumber();
        hideshopsupplies.clickOnRefresh();
        hideshopsupplies.verifyInvoiceRO();
        hideshopsupplies.clickOnInvoiceRO();
        hideshopsupplies.clickOnCustomerInvoice();
        hideshopsupplies.VerifyTaxesonPDF();
        hideshopsupplies.verifyDeleteCustomerInvoice ();
        hideshopsupplies.clickOnsignOut();
        hideshopsupplies.clickOnUserName ();



    }












    }