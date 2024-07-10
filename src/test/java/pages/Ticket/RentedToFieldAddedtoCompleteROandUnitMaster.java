package pages.Ticket;

import actions.WebElementActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import tests.TestDriverActions;
import utils.WaitMethods;

import java.util.List;

public class RentedToFieldAddedtoCompleteROandUnitMaster extends TestDriverActions {

    @FindBy(xpath="//a[text()='Service']")
    WebElement menu_service;
    @FindBy(xpath="//td[text()='Complete RO']")
    WebElement subMenu_CompleteRo;
    @FindBy(xpath="//a[contains(@id,'cl2')]")
    List<WebElement> link_referenceNo;
    @FindBy(xpath="//h1[text()='Repair Order']")
    WebElement title_repairOrder;
    @FindBy(xpath="//label[text()='Rented To:']")
    WebElement label_rentedTo;
    @FindBy(xpath="//label[text()='Rented To:']/following::tr[1]")
    WebElement rentedTo_field;
    @FindBy(xpath="//a[text()='Fleet']")
    WebElement menu_fleet;
    @FindBy(xpath="//td[text()='Unit Master']")
    WebElement subUnit_unitMaster;
    @FindBy(xpath="//span[text()='Unit Master']")
    WebElement title_UnitMaster;
    @FindBy(xpath="(//span[text()='Unit Owner'])[1]")
    WebElement label_UnitOwner;
    @FindBy(xpath="(//span[text()='Unit #'])[1]")
    WebElement label_Unit;
    @FindBy(xpath="(//span[text()='VIN / Description'])[1]")
    WebElement label_VIN;
    @FindBy(xpath="(//span[text()='Serial Number'])[1]")
    WebElement label_SerialNumber;
    @FindBy(xpath="(//span[text()='License Plate'])[1]")
    WebElement label_LicensePlate;
    @FindBy(xpath="(//span[text()='Type'])[1]")
    WebElement label_Type;
    @FindBy(xpath="(//span[text()='Group'])[1]")
    WebElement label_Group;
    @FindBy(xpath="(//span[text()='Domicile Location'])[1]")
    WebElement label_DomicileLocation;
    @FindBy(xpath="(//span[text()='Current Location'])[1]")
    WebElement label_CurrentLocation;
    @FindBy(xpath="//a[contains(@id,'clEquN')]")
    WebElement list_unit;
    @FindBy(xpath = "(//div[contains(@id,'psl2::c')])[2]")
    WebElement unit_name;

    @FindBy(xpath = "//label[text()='Unit Owner:']")
    WebElement UnitOwner;
    @FindBy(xpath = "//label[text()='Unit Owner:']/following::span[1]")
    WebElement name_UnitOwner;
    @FindBy(xpath = "//label[text()='Unit #:']")
    WebElement unit_number;
    @FindBy(xpath = "//label[text()='Unit #:']/following::input[1]")
    WebElement txtbox_Unit;
    @FindBy(xpath = "//label[text()='Description:']")
    WebElement description;
    @FindBy(xpath = "//label[text()='Description:']/following::input[1]")
    WebElement txtbox_description;
    @FindBy(xpath = "//div[contains(@id,'cbCancel')]")
    WebElement canclebtn;
    @FindBy(xpath = "//div[contains(@id,'ctbSaveExit')]")
    WebElement saveExit_btn;
    @FindBy(xpath = "//div[contains(@id,'ctbMoreInfo')]")
    WebElement moreInfo_btn;
    @FindBy(xpath = "(//div[contains(@id,'pwUnitD::_ttxt')])[2]")
    WebElement nameOfUnit;
    @FindBy(xpath = "//span[contains(@id,'rUnitD:1:ol28')]")
    WebElement unitMaster_RentedTo;
    @FindBy(xpath = "//span[contains(@id,'rUnitD:1:ol28')]/following::tr[1]")
    WebElement unitMaster_BasCompany;
    @FindBy(xpath = "//div[contains(@id,'cbOK')]")
    WebElement btnSaveExit;
    @FindBy(xpath = "//span[text()='Sign Out']")
    WebElement btn_SignOut;
    @FindBy(xpath = "//input[@name='username']")
    WebElement txtbox_username;




    public RentedToFieldAddedtoCompleteROandUnitMaster(WebDriver driver){
        this.driver = driver;
        this.waitMethods = new WaitMethods(driver);
    }


   /*
     go to complete ro screen
    */
    public void gotoCompleteRoScreen() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(menu_service);
        WebElementActions.getActions(driver).clickElement(menu_service);

        waitMethods.waitForElementToBeRefreshedAndClickable(subMenu_CompleteRo);
        WebElementActions.getActions(driver).clickElement(subMenu_CompleteRo);
    }
    /*
      click on reference number
     */
     public void clickOnReferenceNumber() throws InterruptedException {
         Thread.sleep(8000);
         for(int i=0;i<link_referenceNo.size();i++)
         {
             if(link_referenceNo.get(i).getText().contains("WO002352"))
             {
                 link_referenceNo.get(i).click();
                 break;
             }
         }
//         waitMethods.waitForElementToBeRefreshedAndClickable(link_referenceNo);
//         WebElementActions.getActions(driver).clickElement(link_referenceNo);
     }
     /*
        verify title Repair Order
      */
      public void verifyTitleRepairOrder() throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndIsVisible(title_repairOrder);
          Assert.assertTrue(title_repairOrder.isDisplayed());
      }
      /*
        verify rented To field is present
       */
       public void verifyRentedTo() throws InterruptedException {
           waitMethods.waitForElementToBeRefreshedAndIsVisible(label_rentedTo);
           Assert.assertTrue(label_rentedTo.isDisplayed());
           Assert.assertTrue(rentedTo_field.isDisplayed());

           String rented = label_rentedTo.getText();
           String valueRented = rentedTo_field.getText();

           System.out.println("Rented to field is :"+rented +":"+ valueRented);

       }
       /*
          go to unit master
        */
       public void gotoUnitMaster() throws InterruptedException {
           waitMethods.waitForElementToBeRefreshedAndClickable(menu_fleet);
           WebElementActions.getActions(driver).clickElement(menu_fleet);

           waitMethods.waitForElementToBeRefreshedAndClickable(subUnit_unitMaster);
           WebElementActions.getActions(driver).clickElement(subUnit_unitMaster);
       }
       /*
          verify title unit master
        */
       public void verifyUnitMaster() throws InterruptedException {
           waitMethods.waitForElementToBeRefreshedAndIsVisible(title_UnitMaster);
           Assert.assertTrue(title_UnitMaster.isDisplayed());
       }
    /*
       verify Unit Owner
     */
    public void verifyUnitOwner() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(label_UnitOwner);
        Assert.assertTrue(label_UnitOwner.isDisplayed());
    }
    /*
          verify unit
     */
    public void verifyUnit() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(label_Unit);
        Assert.assertTrue(label_Unit.isDisplayed());
    }
    /*
          verify VIN
     */
    public void verifyVIN() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(label_VIN);
        Assert.assertTrue(label_VIN.isDisplayed());
    }
    /*
          verify Serial Number
     */
    public void verifySerialNumber() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(label_SerialNumber);
        Assert.assertTrue(label_SerialNumber.isDisplayed());
    }
    /*
          verify License Plate
     */
    public void verifyLicensePlate() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(label_LicensePlate);
        Assert.assertTrue(label_LicensePlate.isDisplayed());
    }
    /*
          verify Type
     */
    public void verifyType() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(label_Type);
        Assert.assertTrue(label_Type.isDisplayed());
    }
    /*
          verify Group
     */
    public void verifyGroup() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(label_Group);
        Assert.assertTrue(label_Group.isDisplayed());
    }
    /*
          verify Domicile Location
     */
    public void verifyDomicileLocation() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(label_DomicileLocation);
        Assert.assertTrue(label_DomicileLocation.isDisplayed());
    }
    /*
          verify Current Location
     */
    public void verifyCurrentLocation() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(label_CurrentLocation);
        Assert.assertTrue(label_CurrentLocation.isDisplayed());
    }
    /*
    click on unit
     */
    public void clickOnUnit() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(list_unit);
        WebElementActions.getActions(driver).clickElement(list_unit);
    }
    /*
       verify unit name
     */
    public void verifyunit_name() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(unit_name);
        Assert.assertTrue(unit_name.isDisplayed());
    }
    /*
       verify Unit Owner
     */
    public void verifyUnitOwner2() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(UnitOwner);
        Assert.assertTrue(UnitOwner.isDisplayed());
    }
    /*
       verify name Unit Owner
     */
    public void verifyNameUnitOwner() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(name_UnitOwner);
        Assert.assertTrue(name_UnitOwner.isDisplayed());
    }
    /*
       verify unit number
     */
    public void verifyunit_number() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(unit_number);
        Assert.assertTrue(unit_number.isDisplayed());
    }
    /*
       verify unit
     */
    public void verifytxtbox_Unit() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(txtbox_Unit);
        Assert.assertTrue(txtbox_Unit.isDisplayed());
    }
    /*
       verify description
     */
    public void verifydescription() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(description);
        Assert.assertTrue(description.isDisplayed());
    }
    /*
       verify textarea of description
     */
    public void verifytxtbox_description() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(txtbox_description);
        Assert.assertTrue(txtbox_description.isDisplayed());
    }
    /*
       verify cancle button
     */
    public void verifycanclebtn() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(canclebtn);
        Assert.assertTrue(canclebtn.isDisplayed());
    }
    /*
       verify save exit button
     */
    public void verifysaveExit_btn() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(saveExit_btn);
        Assert.assertTrue(saveExit_btn.isDisplayed());
    }
    /*
       verify more info button
     */
    public void verifymoreInfo_btn() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(moreInfo_btn);
        Assert.assertTrue(moreInfo_btn.isDisplayed());
    }
    /*
       click on moreInfo
     */
    public void clickonmoreInfo() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(moreInfo_btn);
        WebElementActions.getActions(driver).clickElement(moreInfo_btn);
    }
    /*
       verify name of unit
     */
    public void verifyNameofUnit() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(nameOfUnit);
        Assert.assertTrue(nameOfUnit.isDisplayed());
    }
    /*
       verify rented to field in unit master
     */
    public void verifyRentedToUnitMaster() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(unitMaster_RentedTo);
        Assert.assertTrue(unitMaster_RentedTo.isDisplayed());
        Assert.assertTrue(unitMaster_BasCompany.isDisplayed());

        System.out.println("Rented to in Unit Master :"+unitMaster_RentedTo +" "+unitMaster_BasCompany);
    }
    /*
       verify save exit
     */
    public void verifySaveExit() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(btnSaveExit);
        Assert.assertTrue(btnSaveExit.isDisplayed());
    }
    /*
      click on moreInfo
    */
    public void clickSaveExit() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(btnSaveExit);
        WebElementActions.getActions(driver).clickElement(btnSaveExit);
    }
    /*
         Click on save and exit to save unit
     */
    public void clickSaveExitButton() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(saveExit_btn);
        WebElementActions.getActions(driver).clickElement(saveExit_btn);
    }
    /*
      click on sign out
    */
    public void clickonSignOut() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(btn_SignOut);
        WebElementActions.getActions(driver).clickElement(btn_SignOut);
    }
    /*
      verify username
    */
    public void verifyUsername() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(txtbox_username);
        Assert.assertTrue(txtbox_username.isDisplayed());
    }






















}
