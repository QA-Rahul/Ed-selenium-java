package tests.Ticket;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import tests.TestDriverActions;

@Listeners({utils.TestListener.class})
@Epic("Testing")
@Feature("Rented To Field Added to Complete RO and Unit Master")
public class RentedToFieldAddedtoCompleteROandUnitMaster extends TestDriverActions {

   @Test(priority=0,description="T_001_Login the page",enabled=true)
   @Description("Test Description: Login the page")
   public void T_001_loginthePage() throws InterruptedException {
       loginPage.loginWithValidCredentials(appProp47.getProperty("username"),appProp47.getProperty("password"));
   }

    @Test(priority=1,description="T_002_go to complete ro screen",enabled=true)
    @Description("Test Description: go to complete ro screen")
    public void T_002_gotoCompleteRo() throws InterruptedException {
        rentedtofield.gotoCompleteRoScreen();
    }
    @Test(priority=2,description="T_003_click on reference number",enabled=true)
    @Description("Test Description:click on reference number")
    public void T_003_clickOnReferenceNumber() throws InterruptedException {
        rentedtofield.clickOnReferenceNumber();
    }
    @Test(priority=3,description="T_004_verify title Repair Order",enabled=true)
    @Description("Test Description: verify title Repair Order")
    public void T_004_verifyTitleRepairOrder() throws InterruptedException {
        rentedtofield.verifyTitleRepairOrder();
    }
    @Test(priority=4,description="T_005_verify rented To field is present",enabled=true)
    @Description("Test Description: verify rented To field is present")
    public void T_005_VerifyRentedField() throws InterruptedException {
         rentedtofield.verifyRentedTo();
    }

    @Test(priority=5,description="T_006_go to unit master",enabled=true)
    @Description("Test Description:go to unit master")
    public void T_006_gotoUnitMaster() throws InterruptedException {
       rentedtofield.gotoUnitMaster();
    }

    @Test(priority=6,description="T_007_verify title unit master",enabled=true)
    @Description("Test Description:verify title unit master")
    public void T_007_verifyUnitMaster() throws InterruptedException {
         rentedtofield.verifyUnitMaster();
    }
    @Test(priority=7,description="T_008_verify Unit Owner",enabled=true)
    @Description("Test Description:verify Unit Owner")
    public void T_008_verifyUnitOwner() throws InterruptedException {
       rentedtofield.verifyUnitOwner();
    }

    @Test(priority=8,description="T_009_verify unit",enabled=true)
    @Description("Test Description:verify unit")
    public void T_009_verifyUnit() throws InterruptedException {
         rentedtofield.verifyUnit();
    }

    @Test(priority=9,description="T_010_verify VIN",enabled=true)
    @Description("Test Description:verify VIN")
    public void T_010_verifyVIN() throws InterruptedException {
         rentedtofield.verifyVIN();
    }

    @Test(priority=10,description="T_011_verify Serial Number",enabled=true)
    @Description("Test Description:verify Serial Number")
    public void T_011_verifySerialNumber() throws InterruptedException {
         rentedtofield.verifySerialNumber();
    }

    @Test(priority=11,description="T_012_verify License Plate",enabled=true)
    @Description("Test Description: verify License Plate")
    public void T_012_verifyLicensePlate() throws InterruptedException {
         rentedtofield.verifyLicensePlate();
    }

    @Test(priority=12,description="T_013_verify Type",enabled=true)
    @Description("Test Description: verify Type")
    public void T_013_verifyType() throws InterruptedException {
         rentedtofield.verifyType();
    }
    @Test(priority=13,description="T_014_verify Group",enabled=true)
    @Description("Test Description:verify Group")
    public void T_014_verifyGroup() throws InterruptedException {
         rentedtofield.verifyGroup();
    }

    @Test(priority=14,description="T_015_verify Domicile Location",enabled=true)
    @Description("Test Description:verify Domicile Location")
    public void T_015_verifyDomicileLocation() throws InterruptedException {
          rentedtofield.verifyDomicileLocation();
    }

    @Test(priority=15,description="T_016_verify Current Location",enabled=true)
    @Description("Test Description:verify Current Location")
    public void T_016_verifyCurrentLocation() throws InterruptedException {
          rentedtofield.verifyCurrentLocation();
    }

    @Test(priority=16,description="T_017_click on unit",enabled=true)
    @Description("Test Description:click on unit")
    public void T_017_clickOnUnit() throws InterruptedException {
        rentedtofield.clickOnUnit();
    }

    @Test(priority=17,description="T_018_verify unit name",enabled=true)
    @Description("Test Description:verify unit name")
    public void T_018_verifyunit_name() throws InterruptedException {
        rentedtofield.verifyunit_name();
    }

    @Test(priority=18,description="T_019_verify Unit Owner",enabled=true)
    @Description("Test Description:verify Unit Owner")
    public void T_019_verifyUnitOwner2() throws InterruptedException {
          rentedtofield.verifyUnitOwner2();
    }
    @Test(priority=19,description="T_020_verify name Unit Owner",enabled=true)
    @Description("Test Description:verify name Unit Owner")
    public void T_020_verifyNameUnitOwner() throws InterruptedException {
         rentedtofield.verifyNameUnitOwner();
    }

    @Test(priority=20,description="T_021_verify unit number",enabled=true)
    @Description("Test Description:verify unit number")
    public void T_021_verifyunit_number() throws InterruptedException {
         rentedtofield.verifyunit_number();
    }

    @Test(priority=21,description="T_022_verify unit",enabled=true)
    @Description("Test Description:verify unit")
    public void T_022_verifytxtbox_Unit() throws InterruptedException {
         rentedtofield.verifytxtbox_Unit();
    }

    @Test(priority=22,description=" T_023_verify description",enabled=true)
    @Description("Test Description:verify description")
    public void T_023_verifydescription() throws InterruptedException {
        rentedtofield.verifydescription();
    }

    @Test(priority=23,description="T_024_verify textarea of description",enabled=true)
    @Description("Test Description:verify textarea of description")
    public void T_024_verifytxtbox_description() throws InterruptedException {
         rentedtofield.verifytxtbox_description();
    }

    @Test(priority=24,description="T_025_verify cancle button",enabled=true)
    @Description("Test Description:verify cancle button")
    public void T_025_verifycanclebtn() throws InterruptedException {
         rentedtofield.verifycanclebtn();
    }
    @Test(priority=25,description="T_026_verify save exit button",enabled=true)
    @Description("Test Description:verify save exit button")
    public void T_026_verifysaveExit_btn() throws InterruptedException {
        rentedtofield.verifysaveExit_btn();
    }

    @Test(priority=26,description="T_027_verify more info button",enabled=true)
    @Description("Test Description:verify more info button")
    public void T_027_verifymoreInfo_btn() throws InterruptedException {
         rentedtofield.verifymoreInfo_btn();
    }

    @Test(priority=27,description="T_028_click on moreInfo",enabled=true)
    @Description("Test Description:click on moreInfo")
    public void T_028_clickonmoreInfo() throws InterruptedException {
         rentedtofield.clickonmoreInfo();
    }

    @Test(priority=28,description="T_029_verify name of unit",enabled=true)
    @Description("Test Description:verify name of unit")
    public void T_029_verifyNameofUnit() throws InterruptedException {
         rentedtofield.verifyNameofUnit();
    }

    @Test(priority=29,description="T_030_verify rented to field in unit master",enabled=true)
    @Description("Test Description:verify rented to field in unit master")
    public void T_030_verifyRentedToUnitMaster() throws InterruptedException {
        rentedtofield.verifyRentedToUnitMaster();
    }

    @Test(priority=30,description="T_031_verify save exit",enabled=true)
    @Description("Test Description:verify save exit")
    public void T_031_verifySaveExit() throws InterruptedException {
         rentedtofield.verifySaveExit();
    }
    @Test(priority=31,description="T_032_click save exit",enabled=true)
    @Description("Test Description:click save exit")
    public void T_032_clickSaveExit() throws InterruptedException {
        rentedtofield.clickSaveExit();
    }

    @Test(priority=32,description="T_033_Click on save and exit to save unit ",enabled=true)
    @Description("Test Description:Click on save and exit to save unit")
    public void T_033_clickSaveExitButton() throws InterruptedException {
        rentedtofield.clickSaveExitButton();
    }

    @Test(priority=33,description="T_033_ click on sign out",enabled=true)
    @Description("Test Description: click on sign out")
    public void T_033_clickonSignOut() throws InterruptedException {
         rentedtofield.clickonSignOut();
    }

    @Test(priority=33,description="T_034_verifyUsername()",enabled=true)
    @Description("Test Description:verifyUsername()")
    public void T_034_verifyUsername() throws InterruptedException {
         rentedtofield.verifyUsername();
    }










}
