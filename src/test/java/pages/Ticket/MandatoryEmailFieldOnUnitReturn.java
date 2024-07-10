package pages.Ticket;

import actions.WebElementActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import tests.TestDriverActions;
import utils.TestListener;
import utils.WaitMethods;

import java.util.List;

public class MandatoryEmailFieldOnUnitReturn extends TestDriverActions {

    @FindBy(xpath = "//a[text()='Fleet']")
    WebElement menu_Fleet;

    @FindBy(xpath = "//td[text()='Rental Manager']")
    WebElement Rental_Manager;
    @FindBy(xpath = "//span[text()='Rental Manager']")
    WebElement txt_rentalManager;
    @FindBy(xpath = "(//a[contains(@id,'sdiRES1::disAcr')])[1]")
    WebElement txt_Reservations;
    @FindBy(xpath = "(//a[text()='Reservation Calendar'])[1]")
    WebElement txt_ReservationCalendar;
    @FindBy(xpath = "//span[contains(@id,'ol1')]")
    WebElement txt_location;
    @FindBy(xpath = "//span[contains(@id,'ol1')]/following::input[1]")
    WebElement txtbox_location;
    @FindBy(xpath = "//span[contains(@id,'cil1')]")
    WebElement btn_AddReservation;
    @FindBy(xpath = "//div[contains(@id,'cb3')]")
    WebElement tab_CreateRentalAgreement;
    @FindBy(xpath = "//h1[text()='Things To Do']")
    WebElement txt_ThingsToDo;
    @FindBy(xpath = "//span[text()='View Reservations']")
    WebElement link_ViewReservations;
    @FindBy(xpath = "//span[text()='View Agreements']")
    WebElement link_ViewAgreements;
    @FindBy(xpath = "//span[text()='Return Unit']")
    WebElement link_ReturnUnit;
    @FindBy(xpath = "//span[text()='View To Be Invoiced']")
    WebElement link_ViewToBeInvoiced;
    @FindBy(xpath = "//span[text()='View History']")
    WebElement link_ViewHistory;
    @FindBy(xpath = "//span[contains(@id,'sRAQ:ol4')]")
    WebElement ReturnLocation;
    @FindBy(xpath = "//span[contains(@id,'sRAQ:ol4')]/following::input[1]")
    WebElement txtbox_ReturnLocation;
    @FindBy(xpath = "//span[text()='Agreement#']")
    WebElement col_agreement;
    @FindBy(xpath = "//span[text()='Out at Location']")
    WebElement col_OutatLocation;
    @FindBy(xpath = "//span[text()='Date Out']")
    WebElement col_dateOut;
    @FindBy(xpath = "//span[text()='Invoice To']")
    WebElement col_InvoiceTo;
    @FindBy(xpath = "//span[text()='Unit #']")
    WebElement col_unit;
    @FindBy(xpath = "//th[contains(@id,'sRAQ:tra:ctraRT')]")
    WebElement col_return;
    @FindBy(xpath = "//div[contains(@id,'cbRTU')]")
    List<WebElement> btn_return;
    @FindBy(xpath = "//div[contains(@id,'sRAQ:pwRTU::_ttxt')]")
    WebElement title_returnUnit;
    @FindBy(xpath = "//label[text()='Agreement#:']")
    WebElement txt_Agreement;
    @FindBy(xpath = "//label[text()='Agreement#:']/following::div[1]")
    WebElement agreement_name;
    @FindBy(xpath = "//label[text()='Unit #:']")
    WebElement unit;
    @FindBy(xpath = "//label[text()='Unit #:']/following::div[1]")
    WebElement unit_name;
    @FindBy(xpath = "//span[contains(@id,'sRRU:ol11')]")
    WebElement invoiceTo;
    @FindBy(xpath = "//span[contains(@id,'sRRU:ol11')]/following::div[1]")
    WebElement invoiceTo_name;
    @FindBy(xpath = "//span[contains(@id,'sRRU:ol5')]")
    WebElement returnDate;
    @FindBy(xpath = "//span[contains(@id,'sRRU:ol5')]/following::input[1]")
    WebElement txtbox_returnDate;
    @FindBy(xpath = "//span[contains(@id,'sRRU:ol3')]")
    WebElement txt_ReturnLocation;
    @FindBy(xpath = "//span[contains(@id,'sRRU:ol3')]/following::input[1]")
    WebElement textbox_ReturnLocation;
    @FindBy(xpath = "//td[contains(@id,'sRRU:ph1::_afrTtxt')]")
    WebElement title_returnReading;
    @FindBy(xpath = "//th[contains(@id,'sRRU:teqr:cteqrTY')]")
    WebElement txt_ReadingType;
    @FindBy(xpath = "//th[contains(@id,'sRRU:teqr:c5')]")
    WebElement txt_ReadingOut;
    @FindBy(xpath = "//th[contains(@id,'sRRU:teqr:c3')]")
    WebElement txt_UOM;
    @FindBy(xpath = "//th[contains(@id,'sRRU:teqr:c4')]")
    WebElement txt_ReturnReading;
    @FindBy(xpath = "//h1[text()='Work Required']")
    WebElement subtitle_workRequired;
    @FindBy(xpath = "//div[contains(@id,'ctbLabourGuide')]")
    WebElement tab_AddReturnWork;
    @FindBy(xpath = "//span[contains(@id,'sRRU:ol2')]")
    WebElement txt_ReturnsNote;
    @FindBy(xpath = "//textarea[contains(@id,'sRRU:itRUN::content')]")
    WebElement textbox_ReturnsNote;
    @FindBy(xpath = "//span[contains(@id,'sRRU:ol13')]")
    WebElement txt_email;
    @FindBy(xpath = "//input[contains(@id,'sRRU:itEmail::content')]")
    WebElement txtbox_email;
    @FindBy(xpath = "//div[contains(@id,'sRRU:ctbCancel')]")
    WebElement btn_cancle;
    @FindBy(xpath = "//div[contains(@id,'sRRU:cbRTU')]")
    WebElement btn_ReturnUnitExit;
    @FindBy(xpath = "//div[contains(@id,'sRRU:cbRTINV')]")
    WebElement btn_ReturnUnit_Invoice;
    @FindBy(xpath = "//h1[text()='Working...Please Wait']")
    List<WebElement> loder;
    @FindBy(xpath = "(//span[contains(@id,'si1')]/following::td)[4]")
    WebElement btn_signOut;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement inputbox_Username;

 /*   @FindBy(xpath = "")
    WebElement;
    @FindBy(xpath = "")
    WebElement;
    @FindBy(xpath = "")
    WebElement;
    @FindBy(xpath = "")
    WebElement;
    @FindBy(xpath = "")
    */

    public MandatoryEmailFieldOnUnitReturn(WebDriver driver){
        this.driver = driver;
        this.waitMethods = new WaitMethods(driver);
    }


    public void gotoRentalManagerScreen() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(menu_Fleet);
        WebElementActions.getActions(driver).clickElement(menu_Fleet);

        waitMethods.waitForElementToBeRefreshedAndClickable(Rental_Manager);
        WebElementActions.getActions(driver).clickElement(Rental_Manager);

        TestListener.saveScreenshotPNG(driver);

    }
    /*
       verify rental Manager
     */
    public void verifyRentalManager() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_rentalManager);
        Assert.assertTrue(txt_rentalManager.isDisplayed());
    }
    /*
       verify Reservations
     */
    public void verifytxt_Reservations() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_Reservations);
        Assert.assertTrue(txt_Reservations.isDisplayed());
    }
    /*
        verify Reservation Calendar
     */
    public void verifytxt_ReservationCalendar() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_ReservationCalendar);
        Assert.assertTrue(txt_ReservationCalendar.isDisplayed());
    }
    /*
        verify location
     */
    public void verifytxt_location() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_location);
        Assert.assertTrue(txt_location.isDisplayed());
    }
    /*
        verify textbox location
     */
    public void verifytxtbox_location() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(txtbox_location);
        Assert.assertTrue(txtbox_location.isDisplayed());
    }
    /*
        verify button Add Reservation
     */
    public void verifybtn_AddReservation() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(btn_AddReservation);
        Assert.assertTrue(btn_AddReservation.isDisplayed());
    }
    /*
         verify tab Create Rental Agreement
     */
    public void verifytab_CreateRentalAgreement() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(tab_CreateRentalAgreement);
        Assert.assertTrue(tab_CreateRentalAgreement.isDisplayed());
    }
    /*
         verify Things To Do
     */
    public void verifytxt_ThingsToDo() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_ThingsToDo);
        Assert.assertTrue(txt_ThingsToDo.isDisplayed());
    }
    /*
         verify View Reservations
     */
    public void verifylink_ViewReservations() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(link_ViewReservations);
        Assert.assertTrue(link_ViewReservations.isDisplayed());
    }
    /*
        verify View Agreements
     */
    public void verifylink_ViewAgreements() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(link_ViewAgreements);
        Assert.assertTrue(link_ViewAgreements.isDisplayed());
    }
    /*
        verify Return Unit
     */
    public void verifylink_ReturnUnit() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(link_ReturnUnit);
        Assert.assertTrue(link_ReturnUnit.isDisplayed());
    }
    /*
         verify View To Be Invoiced
     */
    public void verifylink_ViewToBeInvoiced() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(link_ViewToBeInvoiced);
        Assert.assertTrue(link_ViewToBeInvoiced.isDisplayed());
    }
    /*
         verify View History
     */
    public void verifylink_ViewHistory() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(link_ViewHistory);
        Assert.assertTrue(link_ViewHistory.isDisplayed());
    }
    /*
        click on Return Unit
     */
    public void clickOnReturnUnit() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(link_ReturnUnit);
        WebElementActions.getActions(driver).clickElement(link_ReturnUnit);
    }
    /*
        verify Return Location
     */
    public void verify_ReturnLocation() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(ReturnLocation);
        Assert.assertTrue(ReturnLocation.isDisplayed());
    }
    /*
        verify textbox ReturnLocation
     */
    public void verifytxtbox_ReturnLocation() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(txtbox_ReturnLocation);
        Assert.assertTrue(txtbox_ReturnLocation.isDisplayed());
    }
    /*
        verify agreement
     */
    public void verify_txt_agreement() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(col_agreement);
        Assert.assertTrue(col_agreement.isDisplayed());
    }
    /*
        verify Out at Location
     */
    public void verify_txt_OutatLocation() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(col_OutatLocation);
        Assert.assertTrue(col_OutatLocation.isDisplayed());
    }
    /*
         verify date Out
     */
    public void verifydateOut() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(col_dateOut);
        Assert.assertTrue(col_dateOut.isDisplayed());
    }
    /*
         verify Invoice To
     */
    public void verifycol_InvoiceTo() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(col_InvoiceTo);
        Assert.assertTrue(col_InvoiceTo.isDisplayed());
    }
    /*
        verify unit
     */
    public void verifycol_unit() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(col_unit);
        Assert.assertTrue(col_unit.isDisplayed());
    }
    /*
       verify return
     */
    public void verifycol_return() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(col_return);
        Assert.assertTrue(col_return.isDisplayed());
    }
    /*
       click on return
     */
    public void clickOnReturn() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(btn_return.get(2));
        WebElementActions.getActions(driver).clickElement(btn_return.get(2));
    }
    /*
        verify title Return Unit
     */
    public void verifyTitleReturnUnit() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(title_returnUnit);
        Assert.assertTrue(title_returnUnit.isDisplayed());
    }

    /*
         verify agreement
     */
    public void verifyAgreement() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_Agreement);
        Assert.assertTrue(txt_Agreement.isDisplayed());
        Assert.assertTrue(agreement_name.isDisplayed());

    }
    /*
         verify Unit
     */
     public void verifyUnit() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(unit);
         Assert.assertTrue(unit.isDisplayed());
         Assert.assertTrue(unit_name.isDisplayed());
    }
    /*
        verify Invoice To
     */
     public void verifyInvoiceTo() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(invoiceTo);
         Assert.assertTrue(invoiceTo.isDisplayed());
         Assert.assertTrue(invoiceTo_name.isDisplayed());
    }
    /*
        verify return date
     */
     public void verifyReturnDate() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(returnDate);
         Assert.assertTrue(returnDate.isDisplayed());
         Assert.assertTrue(txtbox_returnDate.isDisplayed());
    }
    /*
        verify Return Location
     */
     public void verifyReturnLocation() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_ReturnLocation);
         Assert.assertTrue(txt_ReturnLocation.isDisplayed());
         Assert.assertTrue(textbox_ReturnLocation.isDisplayed());
    }
    /*
         verify Return Reading
     */
     public void verifyReturnReading() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(title_returnReading);
        Assert.assertTrue(title_returnReading.isDisplayed());
    }
    /*
         verify Reading Type
     */
     public void verifyReadingType() throws InterruptedException {
         waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_ReadingType);
         Assert.assertTrue(txt_ReadingType.isDisplayed());
    }
    /*
         verify Reading out
     */
     public void verifyReadingOut() throws InterruptedException {
         waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_ReadingOut);
         Assert.assertTrue(txt_ReadingOut.isDisplayed());
    }
    /*
         verify UOM
     */
     public void verifyUOM() throws InterruptedException {
         waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_UOM);
         Assert.assertTrue(txt_UOM.isDisplayed());
    }
    /*
          verify Return Reading
     */
     public void verifyTextReturnReading() throws InterruptedException {
         waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_ReturnReading);
         Assert.assertTrue(txt_ReturnReading.isDisplayed());
    }
    /*
         verify Required work
     */
     public void verifyRequiredWork() throws InterruptedException {
         waitMethods.waitForElementToBeRefreshedAndIsVisible(subtitle_workRequired);
         Assert.assertTrue(subtitle_workRequired.isDisplayed());
    }
    /*
         verify add return work
     */
     public void verifyAddReturnWork() throws InterruptedException {
         waitMethods.waitForElementToBeRefreshedAndIsVisible(tab_AddReturnWork);
         Assert.assertTrue(tab_AddReturnWork.isDisplayed());
    }

    /*
         verify Returns Note
     */
     public void verifyReturnsNote() throws InterruptedException {
         waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_ReturnsNote);
         Assert.assertTrue(txt_ReturnsNote.isDisplayed());
    }
    /*
         verify textbox returns note
     */
     public void verifyTextboxReturnsNote() throws InterruptedException {
         waitMethods.waitForElementToBeRefreshedAndIsVisible(textbox_ReturnsNote);
         Assert.assertTrue(textbox_ReturnsNote.isDisplayed());
    }
    /*
          verify email
     */
     public void verifyEmail() throws InterruptedException {
         waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_email);
         Assert.assertTrue(txt_email.isDisplayed());
    }
    /*
         verify textbox email
     */
     public void verifytextbox_email() throws InterruptedException {
         waitMethods.waitForElementToBeRefreshedAndIsVisible(txtbox_email);
         Assert.assertTrue(txtbox_email.isDisplayed());
    }
    /*
         verify cancle button
     */
     public void verifyCancle() throws InterruptedException {
         waitMethods.waitForElementToBeRefreshedAndIsVisible(btn_cancle);
         Assert.assertTrue(btn_cancle.isDisplayed());
    }
    /*
          verify button Return Unit Exit
     */
     public void verifyReturnUnitExitbtn() throws InterruptedException {
         waitMethods.waitForElementToBeRefreshedAndIsVisible(btn_ReturnUnitExit);
         Assert.assertTrue(btn_ReturnUnitExit.isDisplayed());
    }

    /*
         verify return unit and invoice button
     */
     public void verifybtn_ReturnUnit_Invoicebtn() throws InterruptedException {
         waitMethods.waitForElementToBeRefreshedAndIsVisible(btn_ReturnUnit_Invoice);
         Assert.assertTrue(btn_ReturnUnit_Invoice.isDisplayed());
    }
    /*
        click on Return Unit and Exit
     */
     public void clickReturnUnitExit() throws InterruptedException {

         waitMethods.waitForElementToBeRefreshedAndClickable(btn_ReturnUnitExit);
         WebElementActions.getActions(driver).clickElement(btn_ReturnUnitExit);

         waitMethods.loadingWait(loder);
         TestListener.saveScreenshotPNG(driver);

     }
    /**
     * Click on sign out and verify username
     */
    public void clickOnSignOutAndVerifyName() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(btn_signOut);
        WebElementActions.getActions(driver).clickElement(btn_signOut);

        waitMethods.waitForElementToBeRefreshedAndIsVisible(inputbox_Username);
        Assert.assertTrue(inputbox_Username.isDisplayed());

        TestListener.saveScreenshotPNG(driver);
    }
    /*
    /*

     */
 /*    public void a() throws InterruptedException {

    }
    /*

     */
 /*    public void a() throws InterruptedException {

    }
    /*

     */
 /*    public void a() throws InterruptedException {

    }
    /*

     */
 /*    public void a() throws InterruptedException {

    }


    */









}
