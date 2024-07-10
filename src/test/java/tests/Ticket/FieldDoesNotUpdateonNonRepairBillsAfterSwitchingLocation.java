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
@Feature("Field Does Not Update on Non Repair Bills After Switching Location")
public class FieldDoesNotUpdateonNonRepairBillsAfterSwitchingLocation extends TestDriverActions {

   @Test(priority=0,description="T_001_Login the page",enabled=true)
   @Description("Test Description :Login the page")
    public void T_001_loginThePage() throws FileNotFoundException, InterruptedException {
        loginPage.loginWithValidCredentials(appProp56.getProperty("username"),appProp56.getProperty("password"));
   }

    @Test(priority=1,description="T_002_Go to complete Ro Screen",enabled=true)
    @Description("Test Description : Go to complete Ro Screen")
    public void T_002_gotoCompleteRo() throws FileNotFoundException, InterruptedException {
     fielddoesnotupdate.gotoCompleteRo();
    }

    @Test(priority=2,description="T_003_verify Complete Ro",enabled=true)
    @Description("Test Description :verify Complete Ro")
    public void T_003_verifyCompleteRo()throws InterruptedException{
       fielddoesnotupdate.verifyCompleteRo();
    }

    @Test(priority=3,description="T_004_verify text Location",enabled=true)
    @Description("Test Description :verify text Location")
    public void T_004_verifytextLocation() throws InterruptedException{
       fielddoesnotupdate.verifytextLocation();
    }

    @Test(priority=4,description="T_005_verify textbox Location",enabled=true)
    @Description("Test Description :verify textbox Location")
    public void T_005_verifytxtbox_Location() throws InterruptedException{
         fielddoesnotupdate.verifytxtbox_Location();
    }

    @Test(priority=5,description="T_006_verify search icon of location",enabled=true)
    @Description("Test Description :verify search icon of location")
    public void T_006_verifysearchIcon_location() throws InterruptedException{
          fielddoesnotupdate.verifysearchIcon_location();
    }

    @Test(priority=6,description="T_007_verify Ready To Submit",enabled=true)
    @Description("Test Description :verify Ready To Submit")
    public void T_007_verifysubtitle_ReadyToSubmit() throws InterruptedException{
        fielddoesnotupdate.verifysubtitle_ReadyToSubmit();
    }

    @Test(priority=7,description="T_008_verify button non Repair Bill",enabled=true)
    @Description("Test Description :verify button non Repair Bill")
    public void T_008_btn_nonRepairBill() throws InterruptedException{
         fielddoesnotupdate.btn_nonRepairBill();
    }

    @Test(priority=8,description="T_009_verify button newRo",enabled=true)
    @Description("Test Description :verify button newRo")
    public void T_009_verifybtn_newRo() throws InterruptedException{
         fielddoesnotupdate.verifybtn_newRo();
    }
    @Test(priority=9,description="T_010_enter location",enabled=true)
    @Description("Test Description :enter location")
    public void T_010_enterLocation() throws InterruptedException{
        fielddoesnotupdate.enterLocation();
    }

    @Test(priority=10,description="T_011_click on non repair bill button",enabled=true)
    @Description("Test Description :click on non repair bill button")
    public void T_011_clickOnNonRepairBill() throws InterruptedException{
         fielddoesnotupdate.clickOnNonRepairBill();
    }

    @Test(priority=11,description="T_012_verify location",enabled=true)
    @Description("Test Description :verify location")
    public void T_012_verifylabel_location() throws InterruptedException{
        fielddoesnotupdate.verifylabel_location();
    }

    @Test(priority=12,description="T_013_verify name of lacation",enabled=true)
    @Description("Test Description :verify name of lacation")
    public void T_013_verifylacation_name() throws InterruptedException{
        fielddoesnotupdate.verifylacation_name();
    }

    @Test(priority=13,description="T_014_verify invoice Date",enabled=true)
    @Description("Test Description :verify invoice Date")
    public void T_014_verifytxt_invoiceDate() throws InterruptedException{
        fielddoesnotupdate.verifytxt_invoiceDate();
    }
    @Test(priority=14,description="T_015_verify textbox invoice date",enabled=true)
    @Description("Test Description :verify textbox invoice date")
    public void T_015_verifytxtbox_invoicedate() throws InterruptedException{
        fielddoesnotupdate.verifytxtbox_invoicedate();
    }

    @Test(priority=15,description="T_016_verify calender icon invoicedate",enabled=true)
    @Description("Test Description :verify calender icon invoicedate")
    public void T_016_verifycalendericon_invoicedate() throws InterruptedException{
        fielddoesnotupdate.verifycalendericon_invoicedate();
    }

    @Test(priority=16,description="T_017_verify text customer",enabled=true)
    @Description("Test Description :verify text customer")
    public void T_017_verifytxt_customer() throws InterruptedException{
        fielddoesnotupdate.verifytxt_customer();
    }
    @Test(priority=17,description="T_018_verify textbox customer",enabled=true)
    @Description("Test Description :verify textbox customer")
    public void T_018_verifytxtbox_customer() throws InterruptedException{
        fielddoesnotupdate.verifytxtbox_customer();
    }

    @Test(priority=18,description="T_019_verify search icon of customer",enabled=true)
    @Description("Test Description :verify search icon of customer")
    public void T_019_verifysearchIcon_customer() throws InterruptedException{
        fielddoesnotupdate.verifysearchIcon_customer();
    }

    @Test(priority=19,description="T_020_verify text subTotal",enabled=true)
    @Description("Test Description :verify text subTotal")
    public void T_020_verifytxt_subTotal() throws InterruptedException{
        fielddoesnotupdate.verifytxt_subTotal();
    }
    @Test(priority=20,description="T_021_verify value of subTotal",enabled=true)
    @Description("Test Description :verify value of subTotal")
    public void T_021_verifyvalue_subTotal() throws InterruptedException{
        fielddoesnotupdate.verifyvalue_subTotal();
    }

    @Test(priority=21,description="T_022_verify text taxes",enabled=true)
    @Description("Test Description :verify text taxes")
    public void T_022_verifytxt_taxes() throws InterruptedException{
        fielddoesnotupdate.verifytxt_taxes();
    }

    @Test(priority=22,description="T_023_verify value of taxes",enabled=true)
    @Description("Test Description :verify value of taxes")
    public void T_023_verifyvalue_taxes() throws InterruptedException{
        fielddoesnotupdate.verifyvalue_taxes();
    }
    @Test(priority=23,description="T_024_verify text total",enabled=true)
    @Description("Test Description :verify text total")
    public void T_024_verifytxt_total() throws InterruptedException{
        fielddoesnotupdate.verifytxt_total();
    }

    @Test(priority=24,description="T_025_verify value of total",enabled=true)
    @Description("Test Description :verify value of total")
    public void T_025_verifyvalue_total() throws InterruptedException{
        fielddoesnotupdate.verifyvalue_total();
    }

    @Test(priority=25,description="T_026_verify text seq",enabled=true)
    @Description("Test Description :verify text seq")
    public void T_026_verifytxt_seq() throws InterruptedException{
        fielddoesnotupdate.verifytxt_seq();
    }
    @Test(priority=26,description="T_027_verify  text account",enabled=true)
    @Description("Test Description :verify  text account")
    public void T_027_verifytxt_account() throws InterruptedException{
        fielddoesnotupdate.verifytxt_account();
    }

    @Test(priority=27,description="T_028_verify text description notes",enabled=true)
    @Description("Test Description :verify text description notes")
    public void T_028_verifytxt_description_notes() throws InterruptedException{
        fielddoesnotupdate.verifytxt_description_notes();
    }

    @Test(priority=28,description="T_029_verify text quantity",enabled=true)
    @Description("Test Description :verify text quantity")
    public void T_029_verifytxt_quantity() throws InterruptedException{
        fielddoesnotupdate.verifytxt_quantity();
    }
    @Test(priority=29,description="T_030_ verify text unitCharge",enabled=true)
    @Description("Test Description : verify text unitCharge")
    public void T_030_verifytxt_unitCharge() throws InterruptedException{
        fielddoesnotupdate.verifytxt_unitCharge();
    }

    @Test(priority=30,description="T_031_ verify text amount",enabled=true)
    @Description("Test Description : verify text amount")
    public void T_031_verifytxt_amount() throws InterruptedException{
        fielddoesnotupdate.verifytxt_amount();
    }

    @Test(priority=31,description="T_032_verify text taxOvr",enabled=true)
    @Description("Test Description :verify text taxOvr")
    public void T_032_verifytxt_taxOvr() throws InterruptedException{
        fielddoesnotupdate.verifytxt_taxOvr();
    }
    @Test(priority=32,description="T_033_verify title revenueAccounts",enabled=true)
    @Description("Test Description : verify title revenueAccounts")
    public void T_033_verifytitle_revenueAccounts() throws InterruptedException{
        fielddoesnotupdate.verifytitle_revenueAccounts();
    }

    @Test(priority=33,description="T_034_verify text search",enabled=true)
    @Description("Test Description :verify text search")
    public void T_034_verifytxt_search() throws InterruptedException{
        fielddoesnotupdate.verifytxt_search();
    }

    @Test(priority=34,description="T_035_verify textbox search",enabled=true)
    @Description("Test Description : verify textbox search")
    public void T_035_verifytxtbox_search() throws InterruptedException{
        fielddoesnotupdate.verifytxtbox_search();
    }
    @Test(priority=35,description="T_036_verify button add",enabled=true)
    @Description("Test Description : verify button add")
    public void T_036_verifybtn_add() throws InterruptedException{
         fielddoesnotupdate.verifybtn_add();
    }

    @Test(priority=36,description="T_037_verify button cancle",enabled=true)
    @Description("Test Description :verify button cancle")
    public void T_037_verifybtn_cancle() throws InterruptedException{
        fielddoesnotupdate.verifybtn_cancle();
    }

    @Test(priority=37,description="T_038_verify button ok",enabled=true)
    @Description("Test Description :verify button ok")
    public void T_038_verifybtn_ok() throws InterruptedException{
        fielddoesnotupdate.verifybtn_ok();
    }
    @Test(priority=38,description="T_039_verify button invoice",enabled=true)
    @Description("Test Description :")
    public void T_039_verifybtn_invoice() throws InterruptedException{
        fielddoesnotupdate.verifybtn_invoice();
    }

    @Test(priority=39,description="T_040_click on search icon of customer",enabled=true)
    @Description("Test Description :click on search icon of customer")
    public void T_040_clickSearchIconCustomer() throws InterruptedException{
        fielddoesnotupdate.clickSearchIconCustomer();
    }

    @Test(priority=40,description="T_041_verify seach and select customer name",enabled=true)
    @Description("Test Description :verify seach and select customer name")
    public void T_041_verifySearchSelect() throws InterruptedException{
        fielddoesnotupdate.verifySearchSelect();
    }
    @Test(priority=41,description="T_042_verify title search",enabled=true)
    @Description("Test Description :verify title search")
    public void T_042_verifytitle_search() throws InterruptedException{
        fielddoesnotupdate.verifytitle_search();
    }

    @Test(priority=42,description="T_043_verify text code",enabled=true)
    @Description("Test Description :verify text code")
    public void T_043_verifytxt_code() throws InterruptedException{
        fielddoesnotupdate.verifytxt_code();
    }

    @Test(priority=43,description="T_044_verify textbox code",enabled=true)
    @Description("Test Description :verify textbox code")
    public void T_044_verifytxtbox_code() throws InterruptedException{
        fielddoesnotupdate.verifytxtbox_code();
    }
    @Test(priority=44,description="T_045_verify text name",enabled=true)
    @Description("Test Description : verify text name")
    public void T_045_verifytxt_name() throws InterruptedException{
        fielddoesnotupdate.verifytxt_name();
    }

    @Test(priority=45,description="T_046_verify textbox name",enabled=true)
    @Description("Test Description :verify textbox name")
    public void T_046_verifytxtbox_name()  throws InterruptedException{
        fielddoesnotupdate.verifytxtbox_name();
    }

    @Test(priority=46,description="T_047_verify button search",enabled=true)
    @Description("Test Description :verify button search")
    public void T_047_verifybtn_search() throws InterruptedException{
        fielddoesnotupdate.verifybtn_search();
    }
    @Test(priority=47,description="T_048_verify button reset",enabled=true)
    @Description("Test Description :verify button reset")
    public void T_048_verifybtn_reset() throws InterruptedException{
        fielddoesnotupdate.verifybtn_reset();
    }

    @Test(priority=48,description="T_049_verify ok button",enabled=true)
    @Description("Test Description :verify ok button")
    public void T_049_verifyok_btn() throws InterruptedException{
        fielddoesnotupdate.verifyok_btn();
    }

    @Test(priority=49,description="T_049_verify cancle button",enabled=true)
    @Description("Test Description :verify cancle button")
    public void T_049_verifycancle_btn() throws InterruptedException{
        fielddoesnotupdate.verifycancle_btn();
    }@Test(priority=50,description="T_051_Search and select customer FedEx Ground",enabled=true)
    @Description("Test Description :Search and select customer FedEx Ground")
    public void T_051_enterCustomer() throws InterruptedException{
        fielddoesnotupdate.enterCustomer();
    }

    @Test(priority=51,description="T_052_click on search button",enabled=true)
    @Description("Test Description :click on search button")
    public void T_052_clickSearchbtn() throws InterruptedException{
        fielddoesnotupdate.clickSearchbtn();
    }

    @Test(priority=52,description="T_053_click on name Of customer",enabled=true)
    @Description("Test Description :click on name Of customer")
    public void T_053_clickOnNameOfCustomer() throws InterruptedException{
        fielddoesnotupdate.clickOnNameOfCustomer();
    }

    @Test(priority=53,description="T_054_click on ok button",enabled=true)
    @Description("Test Description :click on ok button")
    public void T_054_clickOnOkbtn() throws InterruptedException{
        fielddoesnotupdate.clickOnOkbtn();
    }
    @Test(priority=54,description="T_055_verify billTo",enabled=true)
    @Description("Test Description :verify billTo")
    public void T_055_verifyBillTo() throws InterruptedException{
        fielddoesnotupdate.verifyBillTo();
    }

    @Test(priority=55,description="T_056_verify dropdown of bill to",enabled=true)
    @Description("Test Description : verify dropdown of bill to")
    public void T_056_verifyDropdownBillTo() throws InterruptedException{
        fielddoesnotupdate.verifyDropdownBillTo();
    }

    @Test(priority=56,description="T_057_select the location of bill to dropdown",enabled=true)
    @Description("Test Description :select the location of bill to dropdown")
    public void T_057_selectLocationofBillTo() throws InterruptedException{
        fielddoesnotupdate.selectLocationofBillTo();
    }

    @Test(priority=57,description="T_058_verify dropdown of bill to after selecting bill to",enabled=true)
    @Description("Test Description :verify dropdown of bill to after selecting bill to")
    public void T_058_verifyBillTo() throws InterruptedException{
        fielddoesnotupdate.verifyBillTo();
    }

    @Test(priority=58,description="T_059_verify value of total after selecting bill to",enabled=true)
    @Description("Test Description :verify value of total after selecting bill to")
    public void T_059_verifyvalue_total() throws InterruptedException{
        fielddoesnotupdate.verifyvalue_total();
    }@Test(priority=59,description="T_060_verify first entry of table ",enabled=true)
    @Description("Test Description :verify first entry of table ")
    public void T_060_verifyfirstEntry_table() throws InterruptedException{
        fielddoesnotupdate.verifyfirstEntry_table();
    }

    @Test(priority=60,description="T_061_click on add button",enabled=true)
    @Description("Test Description :click on add button")
    public void T_061_clickOnAddBtn() throws InterruptedException{
        fielddoesnotupdate.clickOnAddBtn();
    }

    @Test(priority=61,description="T_062_select fedex category from first entry",enabled=true)
    @Description("Test Description :select fedex category from first entry")
    public void T_062_selectFedexCategory() throws InterruptedException{
        fielddoesnotupdate.selectFedexCategory();
    }

    @Test(priority=62,description="T_063_select fedex category from second entry",enabled=true)
    @Description("Test Description :select fedex category from second entry")
    public void T_063_selectSecondFedexcategory() throws InterruptedException{
        fielddoesnotupdate.selectSecondFedexcategory();
    }
    @Test(priority=63,description="T_064_verify value of total after adding revenue account",enabled=true)
    @Description("Test Description :verify value of total after adding revenue account")
    public void T_064_verifyvalue_total() throws InterruptedException{
        fielddoesnotupdate.verifyvalue_total();
    }
    @Test(priority=64,description="T_065_click on submit",enabled=true)
    @Description("Test Description :click on submit")
    public void T_065_clickOnSubmit() throws InterruptedException{
        fielddoesnotupdate.clickOnSubmit();
    }

    @Test(priority=65,description="T_066_Sign out the page and verify username",enabled=true)
    @Description("Test Description :Sign out the page and verify username")
    public void T_066_clickOnSignOut() throws InterruptedException{
        fielddoesnotupdate.clickOnSignOut();
    }

/*    @Test(priority=0,description="T_035_",enabled=true)
    @Description("Test Description :")
    public void T_002_() throws InterruptedException{
        fielddoesnotupdate.
    }

    @Test(priority=0,description="T_035_",enabled=true)
    @Description("Test Description :")
    public void T_002_() throws InterruptedException{
        fielddoesnotupdate.
    }

    @Test(priority=0,description="T_035_",enabled=true)
    @Description("Test Description :")
    public void T_002_() throws InterruptedException{
        fielddoesnotupdate.
    }

    @Test(priority=0,description="T_035_",enabled=true)
    @Description("Test Description :")
    public void T_002_() throws InterruptedException{
        fielddoesnotupdate.
    }

    */









}
