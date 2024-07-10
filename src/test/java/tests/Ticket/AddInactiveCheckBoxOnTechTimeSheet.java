package tests.Ticket;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import tests.TestDriverActions;

@Listeners({utils.TestListener.class})
@Epic("Testing")
@Feature("Add Inactive CheckBox On Tech TimeSheet")
public class AddInactiveCheckBoxOnTechTimeSheet extends TestDriverActions {

    @Test(priority=0,description="T_001_go to completeRoScreen",enabled=true)
    @Description("Test Description :go to completeRoScreen")
    public void T_001_gotoCompleteRoScreen() throws InterruptedException {
        loginPage.loginWithValidCredentials(appProp55.getProperty("username"),appProp55.getProperty("password"));
        addInactiveChecknoxTimesheet.gotoCompleteRoScreen();
    }

    @Test(priority=1,description="T_002_ title Complete To",enabled=true)
    @Description("Test Description :verify title Complete To")
    public void T_002_verifyCompleteRo() throws InterruptedException{
        addInactiveChecknoxTimesheet.verifyCompleteRo();
    }
    @Test(priority=2,description="T_003_verify subtitle ThingsToDo",enabled=true)
    @Description("Test Description :verify subtitle ThingsToDo")
    public void T_003_verifyThingsToDo() throws InterruptedException{
        addInactiveChecknoxTimesheet.verifyThingsToDo();
    }@Test(priority=3,description="T_004_verify link Manage Invoices",enabled=true)
    @Description("Test Description : verify link Manage Invoices")
    public void T_004_verifylink_ManageInvoices() throws InterruptedException{
        addInactiveChecknoxTimesheet.verifylink_ManageInvoices();
    }@Test(priority=4,description="T_005_verify link timesheet",enabled=true)
    @Description("Test Description :verify link timesheet")
    public void T_005_verifylink_timesheet() throws InterruptedException{
        addInactiveChecknoxTimesheet.verifylink_timesheet();
    }@Test(priority=5,description="T_006_verify link UpdateCustomerPONumber",enabled=true)
    @Description("Test Description :verify link UpdateCustomerPONumber")
    public void T_006_verifylink_UpdateCustomerPONumber() throws InterruptedException{
        addInactiveChecknoxTimesheet.verifylink_UpdateCustomerPONumber();
    }
    @Test(priority=6,description="T_007_verify link BulkROClosing",enabled=true)
    @Description("Test Description :verify link BulkROClosing")
    public void T_007_verifylink_BulkROClosing() throws InterruptedException{
        addInactiveChecknoxTimesheet.verifylink_BulkROClosing();
    }
    @Test(priority=7,description="T_008_verify link BulkROInvoicing",enabled=true)
    @Description("Test Description :verify link BulkROInvoicing")
    public void T_008_verifylink_BulkROInvoicing() throws InterruptedException{
        addInactiveChecknoxTimesheet.verifylink_BulkROInvoicing();
    }
    @Test(priority=8,description="T_009_verify link GenerateConsolidateInvoice",enabled=true)
    @Description("Test Description :verify link GenerateConsolidateInvoice")
    public void T_009_verifylink_GenerateConsolidateInvoice() throws InterruptedException{
        addInactiveChecknoxTimesheet.verifylink_GenerateConsolidateInvoice();
    }
    @Test(priority=9,description="T_010_verify link ProcessPoInvoice",enabled=true)
    @Description("Test Description :verify link ProcessPoInvoice")
    public void T_010_verifylink_ProcessPoInvoice() throws InterruptedException{
        addInactiveChecknoxTimesheet.verifylink_ProcessPoInvoice();
    }
    @Test(priority=10,description="T_011_verify link CircleCheckInspections",enabled=true)
    @Description("Test Description :verify link CircleCheckInspections")
    public void T_011_verifylink_CircleCheckInspections() throws InterruptedException{
        addInactiveChecknoxTimesheet.verifylink_CircleCheckInspections();
    }
    @Test(priority=11,description="T_012_click on TimeSheet link",enabled=true)
    @Description("Test Description :click on TimeSheet link")
    public void T_012_clickOnTimesheet() throws InterruptedException{
        addInactiveChecknoxTimesheet.clickOnTimesheet();
    }
    @Test(priority=12,description="T_013_verify subtitleTechnicianScannedTime",enabled=true)
    @Description("Test Description : verify subtitleTechnicianScannedTime")
    public void T_013_verifysubtitle_TechnicianScannedTime() throws InterruptedException{
        addInactiveChecknoxTimesheet.verifysubtitle_TechnicianScannedTime();
    }
    @Test(priority=13,description="T_014_verify label Technician",enabled=true)
    @Description("Test Description :verify label Technician")
    public void T_014_verifylabel_Technician() throws InterruptedException{
        addInactiveChecknoxTimesheet.verifylabel_Technician();
    }
    @Test(priority=14,description="T_015_verify textbox Technician",enabled=true)
    @Description("Test Description :verify textbox Technician")
    public void T_015_verifytxtbox_label_Technician() throws InterruptedException{
        addInactiveChecknoxTimesheet.verifytxtbox_label_Technician();
    }
    @Test(priority=15,description="T_016_verify searchIcon_technician",enabled=true)
    @Description("Test Description :verify searchIcon_technician")
    public void T_016_verifysearchIcon_technician() throws InterruptedException{
        addInactiveChecknoxTimesheet.verifysearchIcon_technician();
    }
    @Test(priority=16,description="T_017_verify text location",enabled=true)
    @Description("Test Description : verify text location")
    public void T_017_verifytxt_location() throws InterruptedException{
        addInactiveChecknoxTimesheet.verifytxt_location();
    }
    @Test(priority=17,description="T_018_verify textbox location",enabled=true)
    @Description("Test Description :verify textbox location")
    public void T_018_verifytxtbox_location() throws InterruptedException{
        addInactiveChecknoxTimesheet.verifytxtbox_location();
    }
    @Test(priority=18,description="T_019_verify search icon location",enabled=true)
    @Description("Test Description :verify search icon location")
    public void T_019_verifysearchIcon_location() throws InterruptedException{
        addInactiveChecknoxTimesheet.verifysearchIcon_location();
    }
    @Test(priority=19,description="T_020_verify text fromDate",enabled=true)
    @Description("Test Description :verify text fromDate")
    public void T_020_verifytextfromDate() throws InterruptedException{
        addInactiveChecknoxTimesheet.verifytextfromDate();
    }

    @Test(priority=20,description="T_021_verify textbox fromDate",enabled=true)
    @Description("Test Description :verify textbox fromDate")
    public void T_021_verifytextboxfromDate() throws InterruptedException{
        addInactiveChecknoxTimesheet.verifytextboxfromDate();
    }

    @Test(priority=21,description="T_022_verify text ToDate",enabled=true)
    @Description("Test Description :verify text ToDate")
    public void T_022_verifytextToDate() throws InterruptedException{
        addInactiveChecknoxTimesheet.verifytextToDate();
    }

    @Test(priority=22,description="T_023_verify textbox ToDate",enabled=true)
    @Description("Test Description :verify textbox ToDate")
    public void T_023_verifytxtbox_ToDate() throws InterruptedException{
        addInactiveChecknoxTimesheet.verifytxtbox_ToDate();
    }
    @Test(priority=23,description="T_024_click on search icon of Technician",enabled=true)
    @Description("Test Description :click on search icon of Technician")
    public void T_024_clickOnSearchIconTechnician() throws InterruptedException{
        addInactiveChecknoxTimesheet.clickOnSearchIconTechnician();
    }
    @Test(priority=24,description="T_025_verify text SearchandSelectTechnician",enabled=true)
    @Description("Test Description : verify text SearchandSelectTechnician")
    public void T_025_verifytxt_SearchandSelectTechnician() throws InterruptedException{
        addInactiveChecknoxTimesheet.verifytxt_SearchandSelectTechnician();
    }

    @Test(priority=25,description="T_026_verify text match",enabled=true)
    @Description("Test Description :verify text match")
    public void T_026_verifytextmatch() throws InterruptedException{
        addInactiveChecknoxTimesheet.verifytextmatch();
    }

    @Test(priority=26,description="T_027_verify radio button all",enabled=true)
    @Description("Test Description :verify radio button all")
    public void T_027_verifyRadioButtonAll() throws InterruptedException{
        addInactiveChecknoxTimesheet.verifyRadioButtonAll();
    }
    @Test(priority=27,description="T_028_verify text all",enabled=true)
    @Description("Test Description :verify text all")
    public void T_028_verifytextAll() throws InterruptedException{
        addInactiveChecknoxTimesheet.verifytextAll();
    }

    @Test(priority=28,description="T_029_verify radio button any",enabled=true)
    @Description("Test Description :verify radio button any")
    public void T_029_verifyRadioButtonAny() throws InterruptedException{
        addInactiveChecknoxTimesheet.verifyRadioButtonAny();
    }
    @Test(priority=29,description="T_030_verify text any",enabled=true)
    @Description("Test Description :verify text any")
    public void T_029_verifytextAny() throws InterruptedException{
        addInactiveChecknoxTimesheet.verifytextAny();
    }

    @Test(priority=30,description="T_031_verify text firstName",enabled=true)
    @Description("Test Description :verify text firstName")
    public void T_031_verifytextfirstName() throws InterruptedException{
        addInactiveChecknoxTimesheet.verifytextfirstName();
    }

    @Test(priority=31,description="T_032_verify text lastName",enabled=true)
    @Description("Test Description :verify text lastName")
    public void T_032_verifytxt_lastName() throws InterruptedException{
        addInactiveChecknoxTimesheet.verifytxt_lastName();
    }

    @Test(priority=32,description="T_033_verify textbox lastName",enabled=true)
    @Description("Test Description :verify textbox lastName")
    public void T_033_verifytxtbox_lastName() throws InterruptedException{
        addInactiveChecknoxTimesheet.verifytxtbox_lastName();
    }

    @Test(priority=33,description="T_034_verify text employeeNumber",enabled=true)
    @Description("Test Description :verify text employeeNumber")
    public void T_034_verifytxt_employeeNumber() throws InterruptedException{
        addInactiveChecknoxTimesheet.verifytxt_employeeNumber();
    }

    @Test(priority=34,description="T_035_verify textbox employeeNumber",enabled=true)
    @Description("Test Description :verify textbox employeeNumber")
    public void T_035_verifytxtbox_employeeNumber() throws InterruptedException{
        addInactiveChecknoxTimesheet.verifytxtbox_employeeNumber();
    }

    @Test(priority=35,description="T_036_verify button search",enabled=true)
    @Description("Test Description :verify button search")
    public void T_036_verifybtn_search() throws InterruptedException{
        addInactiveChecknoxTimesheet.verifybtn_search();
    }
    @Test(priority=36,description="T_037_verify button reset",enabled=true)
    @Description("Test Description :verify button reset")
    public void T_037_btn_reset() throws InterruptedException{
        addInactiveChecknoxTimesheet.btn_reset();
    }


    @Test(priority=37,description="T_038_verify button addFields",enabled=true)
    @Description("Test Description :verify button addFields")
    public void T_038_btn_addFields() throws InterruptedException{
        addInactiveChecknoxTimesheet.btn_addFields();
    }

    @Test(priority=38,description="T_039_verify button reorder",enabled=true)
    @Description("Test Description :verify button reorder")
    public void T_039_verifybtn_reorder() throws InterruptedException{
        addInactiveChecknoxTimesheet.verifybtn_reorder();
    }

    @Test(priority=39,description="T_040_verify checkbox Include Inactive",enabled=true)
    @Description("Test Description :verify checkbox Include Inactive")
    public void T_040_verifycheckbox_IncludeInactive() throws InterruptedException{
        addInactiveChecknoxTimesheet.verifycheckbox_IncludeInactive();
    }
    @Test(priority=40,description="T_041_click on checkbox Include Inactive to active the checkbox",enabled=true)
    @Description("Test Description :click on checkbox Include Inactive  to active the checkbox")
    public void T_041_clickOnCheckboxIncludeInactive() throws InterruptedException{
        addInactiveChecknoxTimesheet.clickOnCheckboxIncludeInactive();
    }
    @Test(priority=41,description="T_042_click on checkbox Include Inactive to exclude the checkbox",enabled=true)
    @Description("Test Description :click on checkbox Include Inactive to exclude the checkbox")
    public void T_042_clickOnCheckboxIncludeInactive() throws InterruptedException{
        addInactiveChecknoxTimesheet.clickOnCheckboxIncludeInactive();
    }


    @Test(priority=42,description="T_043_verify text IncludeInactive",enabled=true)
    @Description("Test Description : verify text IncludeInactive")
    public void T_043_verifytxt_IncludeInactive() throws InterruptedException{
        addInactiveChecknoxTimesheet.verifytxt_IncludeInactive();
    }

    @Test(priority=43,description="T_044_verify button cancle",enabled=true)
    @Description("Test Description :verify button cancle")
    public void T_044_verifybtn_cancle() throws InterruptedException{
        addInactiveChecknoxTimesheet.verifybtn_cancle();
    }

    @Test(priority=44,description="T_045_click on cancle button",enabled=true)
    @Description("Test Description :click on cancle button")
    public void T_045_clickOnCanclebutton() throws InterruptedException{
        addInactiveChecknoxTimesheet.clickOnCanclebutton();
    }

    @Test(priority=45,description="T_046_SignOut the page and verify username",enabled=true)
    @Description("Test Description :SignOut the page and verify username")
    public void T_046_signOutPage_and_verifyUsername() throws InterruptedException{
        addInactiveChecknoxTimesheet.clickOnSignOut();
        addInactiveChecknoxTimesheet.verifyUsername();
    }



























}
