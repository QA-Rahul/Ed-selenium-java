package tests.Ticket;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import tests.TestDriverActions;

@Listeners({utils.TestListener.class})
@Epic("Testing")
@Feature("Mandatory Email Field On Unit Return")

public class MandatoryEmailFieldOnUnitReturn extends TestDriverActions {

    @Test(priority=0,description="T_001_Login the page",enabled=true)
    @Description("Test Description:- Login the page ")
    public void T_001_loginThePage() throws InterruptedException {
        loginPage.loginWithValidCredentials(appProp58.getProperty("username"),appProp58.getProperty("password"));
    }
    @Test(priority=1,description="T_002_go to Rental Manager Screen",enabled=true)
    @Description("Test Description:- go to Rental Manager Screen")
    public void T_002_gotoRentalManagerScreen() throws InterruptedException {
        mandatoryemail.gotoRentalManagerScreen();
    }
    @Test(priority=2,description="T_003_verify rental Manager",enabled=true)
    @Description("Test Description:- verify rental Manager")
    public void T_003_verifyRentalManager() throws InterruptedException {
        mandatoryemail.verifyRentalManager();
    }
    @Test(priority=3,description="T_004_verify Reservations",enabled=true)
    @Description("Test Description:- verify Reservations")
    public void T_004_verifytxt_Reservations() throws InterruptedException {
        mandatoryemail.verifytxt_Reservations();
    }
    @Test(priority=4,description="T_005_verify Reservation Calendar",enabled=true)
    @Description("Test Description:- verify Reservation Calendar ")
    public void T_005_verifytxt_ReservationCalendar() throws InterruptedException {
        mandatoryemail.verifytxt_ReservationCalendar();
    }
    @Test(priority=5,description="T_006_verify location",enabled=true)
    @Description("Test Description:- verify location")
    public void T_006_verifytxt_location() throws InterruptedException {
        mandatoryemail.verifytxt_location();
    }
    @Test(priority=6,description="T_007_verify textbox location",enabled=true)
    @Description("Test Description:- verify textbox location ")
    public void T_007_verifytxtbox_location() throws InterruptedException {
        mandatoryemail.verifytxtbox_location();
    }
    @Test(priority=7,description="T_008_verify button Add Reservation",enabled=true)
    @Description("Test Description:- verify button Add Reservation")
    public void T_008_verifybtn_AddReservation() throws InterruptedException {
        mandatoryemail.verifybtn_AddReservation();
    }
    @Test(priority=8,description="T_009_verify tab Create Rental Agreement",enabled=true)
    @Description("Test Description:- verify tab Create Rental Agreement")
    public void T_009_verifytab_CreateRentalAgreement() throws InterruptedException {
        mandatoryemail.verifytab_CreateRentalAgreement();
    }
    @Test(priority=9,description="T_010_verify Things To Do",enabled=true)
    @Description("Test Description:- verify Things To Do ")
    public void T_010_verifytxt_ThingsToDo() throws InterruptedException {
        mandatoryemail.verifytxt_ThingsToDo();
    }
    @Test(priority=10,description="T_011_verify View Reservations",enabled=true)
    @Description("Test Description:- verify View Reservations ")
    public void T_011_verifylink_ViewReservations() throws InterruptedException {
        mandatoryemail.verifylink_ViewReservations();
    }
    @Test(priority=11,description="T_012_verify View Agreements",enabled=true)
    @Description("Test Description:- verify View Agreements ")
    public void T_012_verifylink_ViewAgreements() throws InterruptedException {
        mandatoryemail.verifylink_ViewAgreements();
    }
    @Test(priority=12,description="T_013_verify Return Unit",enabled=true)
    @Description("Test Description:- verify Return Unit ")
    public void T_013_verifylink_ReturnUnit() throws InterruptedException {
        mandatoryemail.verifylink_ReturnUnit();
    }
    @Test(priority=13,description="T_014_verify View To Be Invoiced",enabled=true)
    @Description("Test Description:- verify View To Be Invoiced ")
    public void T_014_verifylink_ViewToBeInvoiced() throws InterruptedException {
        mandatoryemail.verifylink_ViewToBeInvoiced();
    }
    @Test(priority=14,description="T_015_verify View History",enabled=true)
    @Description("Test Description:- verify View History ")
    public void T_015_verifylink_ViewHistory() throws InterruptedException {
        mandatoryemail.verifylink_ViewHistory();
    }
    @Test(priority=15,description="T_016_click on Return Unit",enabled=true)
    @Description("Test Description:- click on Return Unit ")
    public void T_016_clickOnReturnUnit() throws InterruptedException {
        mandatoryemail.clickOnReturnUnit();
    }
    @Test(priority=16,description="T_017_verify Return Location",enabled=true)
    @Description("Test Description:- verify Return Location ")
    public void T_017_verify_ReturnLocation() throws InterruptedException {
        mandatoryemail.verify_ReturnLocation();
    }
    @Test(priority=17,description="T_018_verify textbox ReturnLocation",enabled=true)
    @Description("Test Description:- verify textbox ReturnLocation ")
    public void T_018_verifytxtbox_ReturnLocation() throws InterruptedException {
        mandatoryemail.verifytxtbox_ReturnLocation();
    }
    @Test(priority=18,description="T_019_verify agreement",enabled=true)
    @Description("Test Description:- verify agreement ")
    public void T_019_verify_txt_agreement() throws InterruptedException {
        mandatoryemail.verify_txt_agreement();
    }
    @Test(priority=19,description="T_020_verify Out at Location",enabled=true)
    @Description("Test Description:- verify Out at Location ")
    public void T_019_verify_txt_OutatLocation() throws InterruptedException {
        mandatoryemail.verify_txt_OutatLocation();
    }
    @Test(priority=20,description="T_021_verify date Out",enabled=true)
    @Description("Test Description:- verify date Out ")
    public void T_020_verifydateOut() throws InterruptedException {
        mandatoryemail.verifydateOut();
    }
    @Test(priority=21,description="T_022_verify Invoice To",enabled=true)
    @Description("Test Description:- verify Invoice To ")
    public void T_022_verifycol_InvoiceTo() throws InterruptedException {
        mandatoryemail.verifycol_InvoiceTo();
    } @Test(priority=22,description="T_023_verify unit",enabled=true)
    @Description("Test Description:- verify unit ")
    public void T_023_verifycol_unit() throws InterruptedException {
        mandatoryemail.verifycol_unit();
    } @Test(priority=23,description="T_024_verify return",enabled=true)
    @Description("Test Description:- verify return ")
    public void T_024_verifycol_return() throws InterruptedException {
        mandatoryemail.verifycol_return();
    }
    @Test(priority=24,description="T_025_click on return",enabled=true)
    @Description("Test Description:- click on return ")
    public void T_025_clickOnReturn() throws InterruptedException {
        mandatoryemail.clickOnReturn();
    }
    @Test(priority=25,description="T_026_verify title Return Unit",enabled=true)
    @Description("Test Description:- verify title Return Unit ")
    public void T_026_verifyTitleReturnUnit() throws InterruptedException {
        mandatoryemail.verifyTitleReturnUnit();
    }
    @Test(priority=26,description="T_027_verify agreement ",enabled=true)
    @Description("Test Description:- verify agreement ")
    public void T_027_verifyAgreement() throws InterruptedException {
        mandatoryemail.verifyAgreement();
    }
    @Test(priority=27,description="T_028_verify Unit",enabled=true)
    @Description("Test Description:-  verify Unit ")
    public void T_028_verifyUnit() throws InterruptedException{
        mandatoryemail.verifyUnit();
    }
    @Test(priority=28,description="T_029_verify Invoice To",enabled=true)
    @Description("Test Description:-  verify Invoice To ")
    public void T_029_verifyInvoiceTo() throws InterruptedException{
        mandatoryemail.verifyInvoiceTo();
    }
     @Test(priority=29,description="T_030_verify return date",enabled=true)
    @Description("Test Description:- verify return date")
    public void T_030_verifyReturnDate() throws InterruptedException{
        mandatoryemail.verifyReturnDate();
    }
    @Test(priority=30,description="T_031_verify Return Location",enabled=true)
    @Description("Test Description:- verify Return Location ")
    public void T_031_verifyReturnLocation() throws InterruptedException{
        mandatoryemail.verifyReturnLocation();
    }
     @Test(priority=31,description="T_032_verify Return Reading",enabled=true)
    @Description("Test Description:- verify Return Reading")
    public void T_032_verifyReturnReading() throws InterruptedException{
        mandatoryemail.verifyReturnReading();
    }
    @Test(priority=32,description="T_033_verify Reading Type",enabled=true)
    @Description("Test Description:- verify Reading Type ")
    public void T_033_verifyReadingType() throws InterruptedException{
        mandatoryemail.verifyReadingType();
    }
     @Test(priority=33,description="T_034_verify Reading out",enabled=true)
    @Description("Test Description:- verify Reading out")
    public void T_034_verifyReadingOut() throws InterruptedException{
        mandatoryemail.verifyReadingOut();
    }
    @Test(priority=34,description="T_035_verify UOM",enabled=true)
    @Description("Test Description:-verify UOM ")
    public void T_035_verifyUOM() throws InterruptedException{
        mandatoryemail.verifyUOM();
    }
     @Test(priority=35,description="T_036_verify Return Reading",enabled=true)
    @Description("Test Description:-verify Return Reading ")
    public void T_036_verifyTextReturnReading() throws InterruptedException{
        mandatoryemail.verifyTextReturnReading();
    }
    @Test(priority=36,description="T_037_verify Required work",enabled=true)
    @Description("Test Description:-verify Required work ")
    public void T_037_verifyRequiredWork() throws InterruptedException{
        mandatoryemail.verifyRequiredWork();
    }
    @Test(priority=37,description="T_038_verify add return work",enabled=true)
    @Description("Test Description:-verify add return work ")
    public void T_038_verifyAddReturnWork() throws InterruptedException{
        mandatoryemail.verifyAddReturnWork();
    }
    @Test(priority=38,description="T_039_verify Returns Note",enabled=true)
    @Description("Test Description:-verify Returns Note ")
    public void T_039_verifyReturnsNote() throws InterruptedException{
        mandatoryemail.verifyReturnsNote();
    }
    @Test(priority=39,description="T_040_verify textbox returns note",enabled=true)
    @Description("Test Description:-verify textbox returns note ")
    public void T_040_verifyTextboxReturnsNote() throws InterruptedException{
        mandatoryemail.verifyTextboxReturnsNote();
    }
    @Test(priority=40,description="T_041_verify email",enabled=true)
    @Description("Test Description:-verify email ")
    public void T_041_verifyEmail() throws InterruptedException{
        mandatoryemail.verifyEmail();
    }
    @Test(priority=41,description="T_042_verify textbox email",enabled=true)
    @Description("Test Description:-verify textbox email ")
    public void T_042_verifytextbox_email() throws InterruptedException{
        mandatoryemail.verifytextbox_email();
    }
    @Test(priority=42,description="T_043_verify cancle button",enabled=true)
    @Description("Test Description:-verify cancle button ")
    public void T_043_verifyCancle() throws InterruptedException{
        mandatoryemail.verifyCancle();
    }
    @Test(priority=43,description="T_044_verify button Return Unit Exit",enabled=true)
    @Description("Test Description:-verify button Return Unit Exit ")
    public void T_044_verifyReturnUnitExitbtn() throws InterruptedException{
        mandatoryemail.verifyReturnUnitExitbtn();
    }
    @Test(priority=44,description="T_045_verify return unit and invoice button",enabled=true)
    @Description("Test Description:-verify return unit and invoice button ")
    public void T_045_verifybtn_ReturnUnit_Invoicebtn() throws InterruptedException{
        mandatoryemail.verifybtn_ReturnUnit_Invoicebtn();
    }
     @Test(priority=45,description="T_046_click on Return Unit and Exit",enabled=true)
    @Description("Test Description:-click on Return Unit and Exit ")
    public void T_046_clickReturnUnitExit() throws InterruptedException{
        mandatoryemail.clickReturnUnitExit();
    }
    @Test(priority=46,description="T_47_Click on sign out and verify username",enabled=true)
    @Description("Test Description :Click on sign out and verify username")
    public void T_47_clickOnSignOutAndVerifyName() throws InterruptedException {
        serializepart.clickOnSignOutAndVerifyName();
    }

 /*   @Test(priority=39,description="T_040_verify textbox returns note",enabled=true)
    @Description("Test Description:-verify textbox returns note ")
    public void T_040_verifyTextboxReturnsNote() throws InterruptedException{
        mandatoryemail.verifyTextboxReturnsNote();
    } @Test(priority=39,description="T_040_verify textbox returns note",enabled=true)
    @Description("Test Description:-verify textbox returns note ")
    public void T_040_verifyTextboxReturnsNote() throws InterruptedException{
        mandatoryemail.verifyTextboxReturnsNote();
    }




     */
}
