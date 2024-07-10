package tests.Ticket;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import tests.TestDriverActions;

@Listeners({utils.TestListener.class})
@Epic("Testing")
@Feature("FedEx Non-Repair Bill not AutoSearching Locations or Vendors")

public class FedExNonRepairBillnotAutoSearchingLocationsorVendors extends TestDriverActions {

    @Test(priority=0,description="T_001_Login to the page",enabled=true)
    @Description("Test Description : Login to the page")
    public void T_001_Logintothepage() throws InterruptedException {
      loginPage.loginWithValidCredentials(appProp54.getProperty("username"),appProp54.getProperty("password"));
    }

    @Test(priority=1,description="T_002_go to AP Invoices screen",enabled=true)
    @Description("Test Description : go to AP Invoices screen")
    public void T_002_gotoAPInvoicesScreen() throws InterruptedException {
        autosearchlocationvendor.gotoPartScreen();
    }

    @Test(priority=2,description="T_003_click on non repair bill button",enabled=true)
    @Description("Test Description :click on non repair bill button")
    public void T_003_clickNonRepairBill() throws InterruptedException{
        autosearchlocationvendor.verifyNonRepairBill();
        autosearchlocationvendor.clickOnNonRepairBill();
    }
    @Test(priority=3,description="T_004_verify AP Invoice Manager",enabled=true)
    @Description("Test Description :verify AP Invoice Manager")
    public void T_004_verifyAPInvoiceManager() throws InterruptedException {
        autosearchlocationvendor.verifyAPInvoiceManager();
    }

    @Test(priority=4,description="T_005_verify text vendor",enabled=true)
    @Description("Test Description : verify text vendor")
    public void T_005_verifytxt_vendor() throws InterruptedException {
        autosearchlocationvendor.verifytxt_vendor();
    }

    @Test(priority=5,description="T_006_verify textbox vendor",enabled=true)
    @Description("Test Description :")
    public void T_006_verifytextboxvendor() throws InterruptedException{
        autosearchlocationvendor.verifytxtbox_vendor();
    }

    @Test(priority=6,description="T_007_verify Search icon",enabled=true)
    @Description("Test Description :verify Search icon")
    public void T_007_verifySearchicon() throws InterruptedException{
       autosearchlocationvendor.verifySearchicon();
    }
    @Test(priority=7,description="T_008_verify text from Date",enabled=true)
    @Description("Test Description :verify text from Date")
    public void T_008_verifytxt_fromDate() throws InterruptedException{
        autosearchlocationvendor.verifytxt_fromDate();
    }

    @Test(priority=8,description="T_009_verify textbox from Date",enabled=true)
    @Description("Test Description : verify textbox from Date")
    public void T_009_verifytxtbox_fromDate() throws InterruptedException{
         autosearchlocationvendor.verifytxtbox_fromDate();
    }

    @Test(priority=9,description="T_010_verify non repair bill button",enabled=true)
    @Description("Test Description :verify non repair bill button")
    public void T_010_verifyNonRepairBill() throws InterruptedException{
         autosearchlocationvendor.verifyNonRepairBill();
    }
    @Test(priority=10,description="T_011_verify refresh button",enabled=true)
    @Description("Test Description :verify refresh button")
    public void T_011_verifybtnrefresh() throws InterruptedException{
         autosearchlocationvendor.verifybtnrefresh();
    }

    @Test(priority=11,description="T_012_click on search button",enabled=true)
    @Description("Test Description :click on search button")
    public void T_012_clickOnSearchbtn() throws InterruptedException{
       autosearchlocationvendor.clickOnSearchbtn();
    }
    @Test(priority=12,description="T_013_verify  Location",enabled=true)
    @Description("Test Description :verify  Location")
    public void T_013_verifytxt_Location() throws InterruptedException{
        autosearchlocationvendor.verifytxt_Location();
    }

    @Test(priority=13,description="T_014_verify textbox of location",enabled=true)
    @Description("Test Description :verify textbox of location")
    public void T_014_verifytxtbox_location() throws InterruptedException{
        autosearchlocationvendor.verifytxtbox_location();
    }
    @Test(priority=14,description="T_015_verify search icon of location",enabled=true)
    @Description("Test Description :verify search icon of location")
    public void T_015_verifyRadioBtn_all() throws InterruptedException{
        autosearchlocationvendor.verifylocations_searchicon();
    }

    @Test(priority=15,description="T_016_verify text vendor",enabled=true)
    @Description("Test Description :verify text vendor")
    public void T_016_verifytxt_vendor() throws InterruptedException{
        autosearchlocationvendor.verifytxt_vendor();
    }
    @Test(priority=16,description="T_017_verify textbox vendor",enabled=true)
    @Description("Test Description :verify textbox vendor")
    public void T_017_verifytxtbox_vendor() throws InterruptedException{
        autosearchlocationvendor.verifytxtbox_vendor();
    }

    @Test(priority=17,description="T_018_verify Search icon of vendor",enabled=true)
    @Description("Test Description :verify Search icon of vendor")
    public void T_018_verifySearchicon() throws InterruptedException{
        autosearchlocationvendor.verifySearchicon();
    }
    @Test(priority=18,description="T_019_verify invoice",enabled=true)
    @Description("Test Description :verify invoice")
    public void T_019_verifytxt_invoice() throws InterruptedException{
        autosearchlocationvendor.verifytxt_invoice();
    }

    @Test(priority=19,description="T_020_verify textbox invoice",enabled=true)
    @Description("Test Description :verify textbox invoice")
    public void T_020_verifytxtbox_invoice() throws InterruptedException{
        autosearchlocationvendor.verifytxtbox_invoice();
    }
    @Test(priority=20,description="T_021_ verify invoice date",enabled=true)
    @Description("Test Description : verify invoice date")
    public void T_021_verifytxt_invoiceDate() throws InterruptedException{
        autosearchlocationvendor.verifytxt_invoiceDate();
    }

    @Test(priority=21,description="T_022_verify textbox invoice date",enabled=true)
    @Description("Test Description :verify textbox invoice date")
    public void T_022_verifytxtbox_invoiceDate() throws InterruptedException{
        autosearchlocationvendor.verifytxtbox_invoiceDate();
    }
    @Test(priority=22,description="T_023_ verify calender icon of invoice",enabled=true)
    @Description("Test Description : verify calender icon of invoice")
    public void T_023_verifyinvoice_calendericon() throws InterruptedException{
        autosearchlocationvendor.verifyinvoice_calendericon();
    }

    @Test(priority=23,description="T_024_verify label due date",enabled=true)
    @Description("Test Description :verify label due date")
    public void T_024_VerifyDueDate() throws InterruptedException{
        autosearchlocationvendor.VerifyDueDate();
    }
    @Test(priority=24,description="T_025_verify textbox Due date",enabled=true)
    @Description("Test Description :verify textbox Due date")
    public void T_025_verifyLabelCity() throws InterruptedException{
        autosearchlocationvendor.verifytxtbox_dueDate();
    }

    @Test(priority=25,description="T_026_verify serach icon of due date",enabled=true)
    @Description("Test Description :verify serach icon of due date")
    public void T_026_verifydueDate_searchicon() throws InterruptedException{
        autosearchlocationvendor.verifydueDate_searchicon();
    }
    @Test(priority=26,description="T_027_verify description",enabled=true)
    @Description("Test Description :verify description")
    public void T_027_verifytextDescription() throws InterruptedException{
        autosearchlocationvendor.verifytextDescription();
    }

    @Test(priority=27,description="T_028_verify  notes",enabled=true)
    @Description("Test Description :verify  notes")
    public void T_028_verifyLabelNotes() throws InterruptedException{
        autosearchlocationvendor.verifyLabelNotes();
    }
    @Test(priority=28,description="T_029_verify textbox notes",enabled=true)
    @Description("Test Description :verify textbox notes")
    public void T_029_verifyTextboxNotes() throws InterruptedException{
        autosearchlocationvendor.verifyTextboxNotes();
    }
    @Test(priority=29,description="T_030_verify subTotal",enabled=true)
    @Description("Test Description :verify subTotal")
    public void T_030_verifysubTotal() throws InterruptedException{
        autosearchlocationvendor.verifysubTotal();
    }
    @Test(priority=30,description="T_031_verify taxes",enabled=true)
    @Description("Test Description :verify taxes")
    public void T_031_verifyTaxes() throws InterruptedException{
        autosearchlocationvendor.verifyTaxes();
    }
    @Test(priority=31,description="T_032_verify total",enabled=true)
    @Description("Test Description :verify total")
    public void T_032_verifyTotal() throws InterruptedException{
        autosearchlocationvendor.verifyTotal();
    }
    @Test(priority=32,description="T_033_verify cancle button",enabled=true)
    @Description("Test Description :verify cancle button")
    public void T_033_verifyCancleButton() throws InterruptedException{
         autosearchlocationvendor.verifyCancleButton();
    }
    @Test(priority=33,description="T_034_verify button ok",enabled=true)
    @Description("Test Description :verify button ok")
    public void T_034_verifyBtnOk() throws InterruptedException{
        autosearchlocationvendor.verifyBtnOk();
    }
    @Test(priority=34,description="T_035_ verify button submit",enabled=true)
    @Description("Test Description : verify button submit")
    public void T_035_verifySubmit() throws InterruptedException{
        autosearchlocationvendor.verifySubmit();
    }


    @Test(priority=35,description="T_036_enter location",enabled=true)
    @Description("Test Description :enter location")
    public void T_036_enterLocation() throws InterruptedException{
         autosearchlocationvendor.enterLocation();
    }

    @Test(priority=36,description="T_037_click on search icon of location",enabled=true)
    @Description("Test Description :click on search icon of location")
    public void T_037_clickSearchIconofLocation() throws InterruptedException{
        autosearchlocationvendor.clickSearchIconofLocation();
    }

    @Test(priority=37,description="T_038_verify title Search and select Location",enabled=true)
    @Description("Test Description : verify title Search and select Location")
    public void T_038_verifytxt_SearchandSelectLocation() throws InterruptedException{
        autosearchlocationvendor.verifytxt_SearchandSelectLocation();
    }
    @Test(priority=38,description="T_039_verify search subtitle",enabled=true)
    @Description("Test Description :verify search subtitle")
    public void T_039_verifytitle_search() throws InterruptedException{
        autosearchlocationvendor.verifytitle_search();
    }

    @Test(priority=39,description="T_040_verify text name",enabled=true)
    @Description("Test Description :verify text name")
    public void T_040_verifytxt_name() throws InterruptedException{
        autosearchlocationvendor.verifytxt_name();
    }
    @Test(priority=40,description="T_041_verify textbox name",enabled=true)
    @Description("Test Description :verify textbox name")
    public void T_041_verifytxtbox_name() throws InterruptedException{
        autosearchlocationvendor.verifytxtbox_name();
    }

    @Test(priority=41,description="T_042_verify code",enabled=true)
    @Description("Test Description :verify code")
    public void T_042_verifyCode() throws InterruptedException{
        autosearchlocationvendor.verifyCode();
    }
    @Test(priority=42,description="T_043_verify textbox code",enabled=true)
    @Description("Test Description :verify textbox code")
    public void T_043_verifytxtbox_code() throws InterruptedException{
        autosearchlocationvendor.verifytxtbox_code();
    }

    @Test(priority=43,description="T_044_verify text address",enabled=true)
    @Description("Test Description :verify text address")
    public void T_044_verifytxt_address() throws InterruptedException{
        autosearchlocationvendor.verifytxt_address();
    }
    @Test(priority=44,description="T_045_verify textbox address",enabled=true)
    @Description("Test Description :verify textbox address")
    public void T_045_verifytxtbox_address() throws InterruptedException{
        autosearchlocationvendor.verifytxtbox_address();
    }

    @Test(priority=45,description="T_046_verify text city",enabled=true)
    @Description("Test Description :verify text city")
    public void T_046_verifytxt_city() throws InterruptedException{
        autosearchlocationvendor.verifytxt_city();
    }
    @Test(priority=46,description="T_047_verify textbox city",enabled=true)
    @Description("Test Description :verify textbox city")
    public void T_047_verifytxtbox_city() throws InterruptedException{
        autosearchlocationvendor.verifytxtbox_city();
    }

    @Test(priority=47,description="T_048_verify text Provience",enabled=true)
    @Description("Test Description :verify text Provience")
    public void T_048_verifytxt_Provience() throws InterruptedException{
        autosearchlocationvendor.verifytxt_Provience();
    }
    @Test(priority=48,description="T_049_verify textbox provience",enabled=true)
    @Description("Test Description :verify textbox provience")
    public void T_049_verifytxtbox_provience() throws InterruptedException{
        autosearchlocationvendor.verifytxtbox_provience();
    }

    @Test(priority=49,description="T_050_verify text phone",enabled=true)
    @Description("Test Description :verify text phone")
    public void T_050_verifytxt_phone() throws InterruptedException{
        autosearchlocationvendor.verifytxt_phone();
    }
    @Test(priority=50,description="T_051_verify button search",enabled=true)
    @Description("Test Description :verify button search")
    public void T_051_verifybtn_search() throws InterruptedException{
        autosearchlocationvendor.verifybtn_search();
    }

    @Test(priority=51,description="T_052_verify button reset",enabled=true)
    @Description("Test Description :verify button reset")
    public void T_052_verifybtn_reset() throws InterruptedException{
        autosearchlocationvendor.verifybtn_reset();
    }
    @Test(priority=52,description="T_053_verify button add fields",enabled=true)
    @Description("Test Description :verify button add fields")
    public void T_053_verifybtn_addFields() throws InterruptedException{
        autosearchlocationvendor.verifybtn_addFields();
    }

    @Test(priority=53,description="T_054_verify button reorder",enabled=true)
    @Description("Test Description :verify button reorder")
    public void T_054_verifybtn_reorder() throws InterruptedException{
        autosearchlocationvendor.verifybtn_reorder();
    }
    @Test(priority=54,description="T_055_verify button ok",enabled=true)
    @Description("Test Description :verify button ok")
    public void T_055_verifybtnOk() throws InterruptedException{
        autosearchlocationvendor.verifybtnOk();
    }

    @Test(priority=55,description="T_056_verify button cancle",enabled=true)
    @Description("Test Description :verify button cancle")
    public void T_056_verifybtnCancle() throws InterruptedException{
        autosearchlocationvendor.verifybtnCancle();
    }
    @Test(priority=56,description="T_057_verify textbox phone",enabled=true)
    @Description("Test Description :verify textbox phone")
    public void T_057_verifytxtbox_phone() throws InterruptedException{
        autosearchlocationvendor.verifytxtbox_phone();
    }


    @Test(priority=57,description="T_058_click on search button",enabled=true)
    @Description("Test Description :click on search button")
    public void T_058_clickOnSearch() throws InterruptedException{
          autosearchlocationvendor.clickOnSearch();
    }

    @Test(priority=58,description="T_059_ click on first row of Location name",enabled=true)
    @Description("Test Description : click on first row of Location name")
    public void T_059_clickOnFirstRow() throws InterruptedException{
        autosearchlocationvendor.clickOnFirstRow();
    }
    @Test(priority=59,description="T_060_ click on Ok button",enabled=true)
    @Description("Test Description : click on Ok button")
    public void T_060_clickOnSelect() throws InterruptedException{
        autosearchlocationvendor.clickOnOK();
    }
    @Test(priority=60,description="T_061_enter vendor name",enabled=true)
    @Description("Test Description :enter vendor name")
    public void T_061_enterVendor() throws InterruptedException{
        autosearchlocationvendor.enterVendor();
    }

    @Test(priority=61,description="T_062_click on search icon of vendor",enabled=true)
    @Description("Test Description :click on search icon of vendor")
    public void T_062_clickOnsearchIcon() throws InterruptedException{
        autosearchlocationvendor.clickOnsearchIcon();
    }
    @Test(priority=62,description="T_063_verify Title of search and select vendor",enabled=true)
    @Description("Test Description :verify Title of search and select vendor")
    public void T_063_verifylabel_SearchandSelectVendor() throws InterruptedException{
        autosearchlocationvendor.verifylabel_SearchandSelectVendor();
    }

    @Test(priority=63,description="T_064_verify search button of vendor",enabled=true)
    @Description("Test Description :verify search button of vendor")
    public void T_064_verifysearchbtn_vendor() throws InterruptedException{
        autosearchlocationvendor.verifysearchbtn_vendor();
    }

    @Test(priority=64,description="T_065_verify ok button of vendor",enabled=true)
    @Description("Test Description :verify ok button of vendor")
    public void T_065_verifybtnOk_Vendor() throws InterruptedException{
        autosearchlocationvendor.verifybtnOk_Vendor();
    }

    @Test(priority=65,description="T_066_verify cancle button of vendor",enabled=true)
    @Description("Test Description :verify cancle button of vendor")
    public void T_066_verifybtnCancle_Vendor() throws InterruptedException{
        autosearchlocationvendor.verifybtnCancle_Vendor();
    }
    @Test(priority=66,description="T_067_click on search icon of vendor",enabled=true)
    @Description("Test Description :click on search icon of vendor")
    public void T_067_clickOnsearchbtn_vendor() throws InterruptedException{
        autosearchlocationvendor.clickOnsearchbtn_vendor();
    }

    @Test(priority=67,description="T_068_click on search icon of vendor",enabled=true)
    @Description("Test Description :click on search icon of vendor")
    public void T_068_clickOnbtnOk_Vendor() throws InterruptedException{
         autosearchlocationvendor.clickOnbtnOk_Vendor();
    }

    @Test(priority=68,description="T_069_enter invoice number",enabled=true)
    @Description("Test Description :enter invoice number")
    public void T_069_enterInvoiceNumber() throws InterruptedException{
        autosearchlocationvendor.enterInvoiceNumber();
    }

    @Test(priority=69,description="T_070_click on OK",enabled=true)
    @Description("Test Description :click on OK")
    public void T_070_clickOnOKButton() throws InterruptedException{
        autosearchlocationvendor.clickOnOKButton();
    }

    @Test(priority=70,description="T_071_Sign out the page and verify username",enabled=true)
    @Description("Test Description :Sign out the page and verify username")
    public void T_071_signOut_and_verifyUsername() throws InterruptedException {
        autosearchlocationvendor.clickOnSignOut();
        autosearchlocationvendor.verifyUsername();
    }








}
