package tests.Ticket;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import tests.TestDriverActions;

@Listeners({utils.TestListener.class})
@Epic("Testings")
@Feature("Add Invoice To By Customer BENLEA")

public class AddInvoiceToByCustomerBENLEA extends TestDriverActions {

    @Test(priority=0,description="T_001_go to Customer screen",enabled=true)
    @Description("Test Description = go to Customer screen")
    public void T_001_gotoCustomerScreen() throws InterruptedException{
        loginPage.loginWithValidCredentials(appProp62.getProperty("username"),appProp62.getProperty("password"));
        addInvoicetobycustomer.gotoCustomerScreen();
    }
    @Test(priority=1,description="T_002_verify title Customer Manager",enabled=true)
    @Description("Test Description = verify title Customer Manager")
    public void T_002_verifytitle_CustomerManager() throws InterruptedException{
        addInvoicetobycustomer.verifytitle_CustomerManager();
    }
    @Test(priority=2,description="T_003_verify Customer List",enabled=true)
    @Description("Test Description = verify Customer List")
    public void T_003_verifyCustomerList() throws InterruptedException{
        addInvoicetobycustomer.verifyCustomerList();
    }

    @Test(priority=3,description="T_004_verify table of Customer List with customer name",enabled=true)
    @Description("Test Description = verify table of Customer List with customer name")
    public void T_004_verifyTableOfCustomerList() throws InterruptedException{
        addInvoicetobycustomer.verifyTableOfCustomerList();
    }

     @Test(priority=4,description="T_005_click on customer name",enabled=true)
    @Description("Test Description = click on customer name")
    public void T_005_clickOnCustomerName() throws InterruptedException{
        addInvoicetobycustomer.clickOnCustomerName();
    }

    @Test(priority=5,description="T_006_verify customer",enabled=true)
    @Description("Test Description = verify customer")
    public void T_006_verifyCustomer() throws InterruptedException{
        addInvoicetobycustomer.verifyCustomer();
    }

    @Test(priority=6,description="T_007_click on Invoice To Customer",enabled=true)
    @Description("Test Description = click on Invoice To Customer")
    public void T_007_clickOnInvoiceToCustomer() throws InterruptedException{
        addInvoicetobycustomer.clickOnInvoiceToCustomer();
    }

    @Test(priority=7,description="T_008_ verify check box of Include Voided",enabled=true)
    @Description("Test Description = verify check box of Include Voided")
    public void T_008_verifyIncludeVoided() throws InterruptedException{
        addInvoicetobycustomer.verifyIncludeVoided();
    }

    @Test(priority=8,description="T_009_verify Add button",enabled=true)
    @Description("Test Description = verify Add button")
    public void T_009_verifyAddButton() throws InterruptedException{
        addInvoicetobycustomer.verifyAddButton();
    }

    @Test(priority=9,description="T_010_ verify columns name of Invoice To Customer table",enabled=true)
    @Description("Test Description =  verify columns name of Invoice To Customer table")
    public void T_010_verifyColumns() throws InterruptedException{
        addInvoicetobycustomer.verifyColumns();
    }
    @Test(priority=10,description="T_011_click on Add button",enabled=true)
    @Description("Test Description = click on Add button")
    public void T_011_clickOnAddBtn() throws InterruptedException{
        addInvoicetobycustomer.clickOnAddBtn();
    }

    @Test(priority=11,description="T_012_verify Invoice to customer pop up",enabled=true)
    @Description("Test Description = verify Invoice to customer pop up")
    public void T_012_verifyInvoicetocustomerpopup() throws InterruptedException{
        addInvoicetobycustomer.verifyInvoicetocustomerpopup();
    }

    @Test(priority=12,description="T_013_verify Effective Date",enabled=true)
    @Description("Test Description = verify Effective Date")
    public void T_013_verifyEffectiveDate() throws InterruptedException{
        addInvoicetobycustomer.verifyEffectiveDate();
    }

    @Test(priority=13,description="T_014_verify Invoice To Customer",enabled=true)
    @Description("Test Description = verify Invoice To Customer")
    public void T_014_verifyInvoiceToCustomer() throws InterruptedException{
        addInvoicetobycustomer.verifyInvoiceToCustomer();
    }

    @Test(priority=14,description="T_015_verify Cancle and Save Exit button",enabled=true)
    @Description("Test Description = verify Cancle and Save Exit button")
    public void T_015_verifyancle_SaveExit() throws InterruptedException{
        addInvoicetobycustomer.verifyancle_SaveExit();
    }

    @Test(priority=15,description="T_016_click on search icon",enabled=true)
    @Description("Test Description = click on search icon")
    public void T_016_clickOnSearchIcon() throws InterruptedException{
        addInvoicetobycustomer.clickOnSearchIcon();
    }
    @Test(priority=16,description="T_017_verify search and select customer",enabled=true)
    @Description("Test Description = verify search and select customer")
    public void T_017_verifysearchandselectcustomer() throws InterruptedException{
        addInvoicetobycustomer.verifysearchandselectcustomer() ;
    }

    @Test(priority=17,description="T_018_verify tabs in search and select customer",enabled=true)
    @Description("Test Description = verify tabs in search and select customer")
    public void T_018_verifytabsinsearchandselectcustomer() throws InterruptedException{
        addInvoicetobycustomer.verifytabsinsearchandselectcustomer() ;
    }
     @Test(priority=18,description="T_019_click on select tab",enabled=true)
    @Description("Test Description = click on select tab")
    public void T_019_clickOnSelectTab() throws InterruptedException{
        addInvoicetobycustomer.clickOnSelectTab() ;
    }

    @Test(priority=19,description="T_020_click on save and exit",enabled=true)
    @Description("Test Description = click on save and exit")
    public void T_020_clickOnSaveExit() throws InterruptedException{
        addInvoicetobycustomer.clickOnSaveExit();
    }
     @Test(priority=20,description="T_021_click on Add button",enabled=true)
     @Description("Test Description = click on Add button")
    public void T_021_clickOnAddBtn() throws InterruptedException{
         addInvoicetobycustomer.clickOnAddBtn();
    }

    @Test(priority=21,description="T_022_enter invoice to customer",enabled=true)
    @Description("Test Description = enter invoice to customer")
    public void T_022_enterInvoiceToCustomer() throws InterruptedException{
        addInvoicetobycustomer.enterInvoiceToCustomer();
    }
     @Test(priority=22,description="T_023_click on cancle",enabled=true)
    @Description("Test Description = click on cancle")
    public void T_023_clickOnCancle() throws InterruptedException{
        addInvoicetobycustomer.clickOnCancle();
    }

    @Test(priority=23,description="T_024_click on link present in Invoice To Customer",enabled=true)
    @Description("Test Description = click on link present in Invoice To Customer")
    public void T_024_clickOnInvoiceToCustomerLink() throws InterruptedException{
        addInvoicetobycustomer.clickOnInvoiceToCustomerLink();
    }
     @Test(priority=24,description="T_025_verify Invoice to Customer",enabled=true)
    @Description("Test Description = verify Invoice to Customer")
    public void T_025_verifyInvoicetoCustomer() throws InterruptedException{
        addInvoicetobycustomer.verifyInvoicetoCustomer();
    }

    @Test(priority=25,description="T_026_click on void button",enabled=true)
    @Description("Test Description = click on void button")
    public void T_026_clickOnVoidBtn() throws InterruptedException{
        addInvoicetobycustomer.clickOnVoidBtn();
    }
     @Test(priority=26,description="T_027_click on checkbox",enabled=true)
    @Description("Test Description = ")
    public void T_027_clickOnCheckbox() throws InterruptedException{
        addInvoicetobycustomer.clickOnCheckbox();
    }

    @Test(priority=27,description="T_028_verify new entry added with right sign of checkbox",enabled=true)
    @Description("Test Description = verify new entry added with right sign of checkbox")
    public void T_028_verifyRightSignInCheckbox()  throws InterruptedException{
        addInvoicetobycustomer.verifyRightSignInCheckbox();
    }
    @Test(priority=28,description="T_029_verify cancle and ok button",enabled=true)
    @Description("Test Description = verify cancle and ok button")
    public void T_029_verifyCancle_OKbutton() throws InterruptedException{
        addInvoicetobycustomer.verifyCancle_OKbutton();
    }

    @Test(priority=29,description="T_030_click on OK button",enabled=true)
    @Description("Test Description = click on OK button")
    public void T_030_clickOnOKBtn() throws InterruptedException{
        addInvoicetobycustomer.clickOnOKBtn();
    }

    @Test(priority=30,description="T_031_go to complete Ro screen",enabled=true)
    @Description("Test Description = go to complete Ro screen")
    public void T_031_goToCompleteRoScreen() throws InterruptedException{
        addInvoicetobycustomer.goToCompleteRoScreen();
    }

    @Test(priority=31,description="T_032_verify title Complete Ro",enabled=true)
    @Description("Test Description = verify title Complete Ro")
    public void T_032_verifyTitleCompleteRo() throws InterruptedException{
        addInvoicetobycustomer.verifyTitleCompleteRo();
    }
    @Test(priority=32,description="T_033_verify element present in complete ro screen",enabled=true)
    @Description("Test Description = verify element present in complete ro screen")
    public void T_033_verifyElementofCompleteRo() throws InterruptedException{
        addInvoicetobycustomer.verifyElementofCompleteRo();
    }

    @Test(priority=33,description="T_034_click on Reference Number",enabled=true)
    @Description("Test Description = click on Reference Number")
    public void T_034_clickOnReferenceNumber() throws InterruptedException{
        addInvoicetobycustomer.clickOnReferenceNumber();
    }

    @Test(priority=34,description="T_035_verify repair order",enabled=true)
    @Description("Test Description = verify repair order")
    public void T_035_verifyRepairOrder() throws InterruptedException{
        addInvoicetobycustomer.verifyRepairOrder();
    }

    @Test(priority=35,description="T_036_verify Unit Owner",enabled=true)
    @Description("Test Description = verify Unit Owner")
    public void T_036_verifyUnitOwner() throws InterruptedException{
        addInvoicetobycustomer.verifyUnitOwner();
    }

    @Test(priority=36,description="T_037_verify Invoice To",enabled=true)
    @Description("Test Description = verify Invoice To")
    public void T_037_verifyInvoiceTo() throws InterruptedException{
        addInvoicetobycustomer.verifyInvoiceTo();
    }

    @Test(priority=37,description="T_038_click on sign out button and verify username",enabled=true)
    @Description("Test Description = click on sign out button and verify username")
    public void T_038_clickOnSignOut() throws InterruptedException{
        addInvoicetobycustomer.clickOnSignOut();
    }





}
