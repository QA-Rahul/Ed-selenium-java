 package pages.fleet;

import actions.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import tests.TestDriverActions;
import utils.TestListener;
import utils.WaitMethods;

import java.io.FileNotFoundException;
import java.util.List;

public class CreateUnitPage extends TestDriverActions {

    @FindBy(xpath="//div[contains(text(),'New Unit')]")
    public WebElement label_New_Unit ;
    @FindBy(xpath = "//span[text()='New Unit']")
    public WebElement btn_new_unit;
    @FindBy(xpath = "//input[contains(@id,'sfCusQ:sqCus:dc_it1::content')]")
    WebElement txt_search;
    @FindBy(xpath = "(//label[contains(text(),'Unit #:')]//following::div//input)[1]")
    public WebElement txt_unit;
    @FindBy(xpath = "//div[contains(@id,'cbSelectCus')]")
    public WebElement select_owner;
    @FindBy(xpath = "(//label[contains(text(),'Description')]//following::div//input)[1]")
    public WebElement txt_description;
    @FindBy(xpath = "(//label[contains(text(),'VIN')]//following::div//input)[1]")
    public WebElement txt_VIN;
    @FindBy(xpath = "//input[contains(@id,'it3::content')]")
    public WebElement label_YearTextArea;
    @FindBy(xpath = "(//a[contains(@id,'cilH')]/img)[1]")
    public WebElement label_SearchImgOne;
    @FindBy(xpath = "(//span[text()='Select'])[1]")
    public WebElement btn_SelectButton;
    @FindBy(xpath="//label[contains(text(),'Owner:')]/preceding-sibling::span")
    public WebElement label_owner_asterisk;
    @FindBy(xpath = "(//label[contains(text(),'Owner')])[1]")
    public WebElement label_owner;
    @FindBy(xpath = "(//label[contains(text(),'Owner')])[1]/following::input[1]")
    public WebElement txt_Ownere_field;
    @FindBy(xpath="//label[contains(text(),'Owner:')]/following::img[1]")
    public WebElement search_icon;
    @FindBy(xpath="//label[contains(text(),'Unit #:')]/preceding-sibling::span")
    public WebElement label_unit_asterisk;
    // @FindBy(xpath = "//label[contains(text(),'Unit #:')]")
    @FindBy(xpath="//label[text()='Unit #:']")
    public WebElement label_unit;
    @FindBy(xpath = "//label[contains(text(),'Unit #:')]/following::input[1]")
    public WebElement txt_unit_field;
    @FindBy(xpath="//label[contains(text(),'Description:')]/preceding-sibling::span")
    public WebElement label_description_asterisk;
    @FindBy(xpath = "//label[contains(text(),'Description')]")
    public WebElement label_description;
    @FindBy(xpath="//label[contains(text(),'Description:')]/following::input[1]")
    public WebElement txt_description_field;
    @FindBy(xpath = "(//label[contains(text(),'License ')])[1]")
    public WebElement label_licence;
    @FindBy(xpath="//label[contains(text(),'License #:')]/following::input[1]")
    public WebElement txt_licence_field;
    @FindBy(xpath = "//label[contains(text(),'License Expiry')]")
    public WebElement label_LicenceExpiry;
    @FindBy(xpath="//label[contains(text(),'License Expiry:')]/following::input[1]")
    public WebElement txt_licenceExpiry_field;
    @FindBy(xpath="//label[contains(text(),'License Expiry:')]/following::a[1]")
    public WebElement label_date_picker;
    @FindBy(xpath = "//span[contains(text(),'DOT Requirements')]")
    public WebElement label_dot_requirement;
    @FindBy(xpath = "//label[contains(text(),'VIN ')]")
    public WebElement label_VIN;
    @FindBy(xpath="//label[contains(text(),'VIN #:')]/following::input[1]")
    public WebElement txt_VIN_field;
    @FindBy(xpath = "//label[contains(text(),'Serial Number')]")
    public WebElement label_serialNumber;
    @FindBy(xpath="//label[contains(text(),'Serial Number:')]/following::input[1]")
    public WebElement txt_serialNumber_field;
    @FindBy(xpath = "//label[contains(text(),'Year')]")
    public WebElement label_year;
    @FindBy(xpath="//label[contains(text(),'Year:')]/following::input[1]")
    public WebElement txt_label_year;
    @FindBy(xpath = "//label[contains(text(),'Tire Size')]")
    public WebElement label_tireSize;
    @FindBy(xpath="//label[contains(text(),'Tire Size:')]/following::input[1]")
    public WebElement txt_tireSize_field;
    @FindBy(xpath = "//label[contains(text(),'Company Owned')]")
    public WebElement label_companyOwned;
    @FindBy(xpath = "//label[contains(text(),'Company Owned:')]/following::input[1]")
    public WebElement radiobtn_yes;
    @FindBy(xpath="//label[contains(text(),'Yes')]")
    public WebElement txt_radiobtn_Yes;
    @FindBy(xpath = "//label[contains(text(),'Company Owned:')]/following::input[2]")
    public WebElement radiobtn_no;
    @FindBy(xpath="//label[contains(text(),'No')]")
    public WebElement txt_radiobtn_No;
    @FindBy(xpath="//span[contains(text(),'Initial Service')]")
    public WebElement label_initial_service;
    @FindBy(xpath = "//span[contains(text(),'Initial Service')]/following::label[contains(text(),'In Service Date:')][1]")
    public WebElement label_serviceDate;
    @FindBy(xpath="//span[contains(text(),'Initial Service')]/following::input[1]")
    public WebElement txt_servicedate_field;
    @FindBy(xpath="//label[contains(text(),'In Service Date:')]/following::a[1]")
    public WebElement label_servicedate_datePicker;
    @FindBy(xpath = "(//label[contains(text(),'Initial Reading')])[1]")
    public WebElement label_initialReading;
    @FindBy(xpath="//label[contains(text(),'Initial Reading:')]/following::input[1]")
    public WebElement txt_initialReading_field;
    @FindBy(xpath = "(//label[contains(text(),'Reading Type')])[1]")
    public WebElement label_readingType;
    @FindBy(xpath="//span[contains(text(),'Initial Service')]/following::select[1]")
    public WebElement txt_readingType_field;
    @FindBy(xpath = "(//label[contains(text(),'UOM')])[1]")
    public WebElement label_UOM;
    @FindBy(xpath="//span[contains(text(),'Initial Service')]/following::select[2]")
    public WebElement txt_UOM_field;
    @FindBy(xpath="//span[contains(text(),'Make and Models')]")
    public WebElement label_makeandModels;
    @FindBy(xpath = "(//label[contains(text(),'Truck')])[1]")
    public WebElement label_truck;
    @FindBy(xpath = "//label[contains(text(),'Truck/Trailer:')]/following::input[1]")
    public WebElement txt_truck_field;
    @FindBy(xpath="//label[contains(text(),'Truck/Trailer:')]/following::img[1]")
    public WebElement label_truck_serach_icon;
    @FindBy(xpath = "(//label[contains(text(),'Engine')])[1]")
    public WebElement label_engine;
    @FindBy(xpath = "(//label[contains(text(),'Transmission')])[1]")
    public WebElement label_transmission;
    @FindBy(xpath = "(//label[contains(text(),'Rear ')])[1]")
    public WebElement label_rearAxle;
    @FindBy(xpath = "(//label[contains(text(),'Body')])[1]")
    public WebElement label_body;
    @FindBy(xpath="//span[contains(text(),'Groups')]")
    public WebElement label_Group;

    @FindBy(xpath="//span[contains(text(),'Cancel')]")
    public WebElement btn_cancle;
    @FindBy(xpath = "//span[text()='Save / Exit']")
    public WebElement btn_saveAndExit;
    @FindBy(xpath = "//span[text()='Save / Exit']")
    public List<WebElement> btn_checkIn;

    @FindBy(xpath ="//span[text()='Current Location']/following::a[1]")
    WebElement hyperlink_unit_number;

    @FindBy(xpath = "//div[contains(@id,'sSEquQ:r2:0:psl2::c')]" )
    WebElement unit_value;

    @FindBy(xpath = "//span[text()='Save / Exit']")
    WebElement saveandExit_btn;
    @FindBy(xpath = "(//span[contains(@id,'si1')]/following::td)[4]")
    public WebElement sign_out;

    @FindBy(name = "username")
    public WebElement inputbox_Username;

    int no_of_unit_before_added;

    @FindBy(xpath = "//h1[text()='Working...Please Wait']")
    List<WebElement> loder;

    @FindBy(xpath = "//a[text()='Fleet']")
    WebElement menu_Fleet;
    @FindBy(xpath = "//td[text()='Unit Master']")
    WebElement subMenu_UnitMaster;

    @FindBy(xpath="//input[contains(@id,'sfCusQ:sqCus:dc_it1::content')]")
    WebElement check_ownerAttribute;

    public WebDriver driver;

    public CreateUnitPage(WebDriver driver){
        this.driver = driver;
        this.waitMethods = new WaitMethods(driver);
        this.loginActions = new LoginActions();

    }


    /**
     * go to Unit master screen
     * @throws InterruptedException
     */
     public void gotoUnitMasterScreen() throws InterruptedException, FileNotFoundException {
//        ReusableActions.getActions(driver).clickParentMenu("Fleet");
//        ReusableActions.getActions(driver).clickChildMenu("Unit Master");

         waitMethods.waitForElementToBeRefreshedAndClickable(menu_Fleet);
         WebElementActions.getActions(driver).clickElement(menu_Fleet);

         waitMethods.waitForElementToBeRefreshedAndClickable(subMenu_UnitMaster);
         WebElementActions.getActions(driver).clickElement(subMenu_UnitMaster);

         TestListener.saveScreenshotPNG(driver);
    }

    /**
     * Click on new Unit button
     */
     public void clickNewUnit() throws InterruptedException {

         waitMethods.waitForElementToBeRefreshedAndClickable(btn_new_unit);
         WebElementActions.getActions(driver).clickElement(btn_new_unit);

         waitMethods.loadingWait(loder);

        TestListener.saveScreenshotPNG(driver);
    }

    /**
     * Search by owner
     */
     public void searchOwner() throws InterruptedException {
      //  if (LoginActions.environmentName.contains("QA") || LoginActions.environmentName.contains("EU")) {
 /*        Thread.sleep(5000);
         String ownerName = check_ownerAttribute.getAttribute("type");
         System.out.println("Owner attribute value show :"+ownerName);
         Thread.sleep(2000);
         System.out.println(appProp2.getProperty("Owner"));  */
         if (LoginActions.environmentName.contains("QA")) {
             waitMethods.waitForElementToBeRefreshedAndClickable(txt_search);
             WebElementActions.getActions(driver).inputText(txt_search, appProp.getProperty("Owner"));
             Assert.assertTrue(txt_search.isDisplayed());
         }
         else if(LoginActions.environmentName.contains("EC")){
             waitMethods.waitForElementToBeRefreshedAndClickable(txt_search);
             WebElementActions.getActions(driver).inputText(txt_search, appProp2.getProperty("Owner"));
             Assert.assertTrue(txt_search.isDisplayed());
         }
         else if(LoginActions.environmentName.contains("EU")){
             waitMethods.waitForElementToBeRefreshedAndClickable(txt_search);
             WebElementActions.getActions(driver).inputText(txt_search, appProp19.getProperty("Owner"));
             Assert.assertTrue(txt_search.isDisplayed());
         }
         else if(LoginActions.environmentName.contains("NA")){
             waitMethods.waitForElementToBeRefreshedAndClickable(txt_search);
             WebElementActions.getActions(driver).inputText(txt_search, appProp32.getProperty("Owner"));
             Assert.assertTrue(txt_search.isDisplayed());
         }
         waitMethods.loadingWait(loder);

            TestListener.saveScreenshotPNG(driver);
        }
//    }
    /**
     * click on select button
     */
    public void clickOnSelect() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(select_owner);
        WebElementActions.getActions(driver).clickElement(select_owner);

        waitMethods.loadingWait(loder);

        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * Verify all fields are display
     */
    public void newUnitmandotaryFieldsDisplay() throws InterruptedException {

         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_New_Unit);
        Assert.assertTrue(label_New_Unit.isDisplayed());
        Assert.assertTrue(label_owner_asterisk.isDisplayed());
        Assert.assertTrue(label_owner.isDisplayed());
        Assert.assertTrue(txt_Ownere_field.isDisplayed());
        waitMethods.waitForElementToBeRefreshedAndIsVisible(search_icon);
        Assert.assertTrue(search_icon.isDisplayed());
        Assert.assertTrue(label_unit_asterisk.isDisplayed());
        Assert.assertTrue(label_unit.isDisplayed());
        Assert.assertTrue(txt_unit_field.isDisplayed());
        Assert.assertTrue(label_description_asterisk.isDisplayed());
        Assert.assertTrue(label_description.isDisplayed());
        Assert.assertTrue(txt_description_field.isDisplayed());
        Assert.assertTrue(label_licence.isDisplayed());
        Assert.assertTrue(txt_licence_field.isDisplayed());
        Assert.assertTrue(label_LicenceExpiry.isDisplayed());
        Assert.assertTrue(txt_licenceExpiry_field.isDisplayed());
        Assert.assertTrue(label_date_picker.isDisplayed());

        TestListener.saveScreenshotPNG(driver);

    }

    public void dotRequirementDisplay() throws InterruptedException {

        waitMethods.waitForElementToBeRefreshedAndIsVisible(label_dot_requirement);
        Assert.assertTrue(label_dot_requirement.isDisplayed());
        Assert.assertTrue(label_VIN.isDisplayed());
        Assert.assertTrue(txt_VIN_field.isDisplayed());
        Assert.assertTrue(label_serialNumber.isDisplayed());
        Assert.assertTrue(txt_serialNumber_field.isDisplayed());
        Assert.assertTrue(label_year.isDisplayed());
        Assert.assertTrue(txt_label_year.isDisplayed());
        Assert.assertTrue(label_tireSize.isDisplayed());
        Assert.assertTrue(txt_tireSize_field.isDisplayed());
        Assert.assertTrue(label_companyOwned.isDisplayed());
        Assert.assertTrue(radiobtn_yes.isDisplayed());
        Assert.assertTrue(txt_radiobtn_Yes.isDisplayed());
        Assert.assertTrue(radiobtn_no.isDisplayed());
        Assert.assertTrue(txt_radiobtn_No.isDisplayed());
        TestListener.saveScreenshotPNG(driver);

    }

    public void initialServiceDisplay() throws InterruptedException {

        waitMethods.waitForElementToBeRefreshedAndIsVisible(label_initial_service);
        Assert.assertTrue(label_initial_service.isDisplayed());
        Assert.assertTrue(label_serviceDate.isDisplayed());
        Assert.assertTrue(txt_servicedate_field.isDisplayed());
        Assert.assertTrue(label_servicedate_datePicker.isDisplayed());
        Assert.assertTrue(label_initialReading.isDisplayed());
        Assert.assertTrue(txt_initialReading_field.isDisplayed());
        Assert.assertTrue(label_readingType.isDisplayed());
        Assert.assertTrue(txt_readingType_field.isDisplayed());
        Assert.assertTrue(label_UOM.isDisplayed());
        Assert.assertTrue(txt_UOM_field.isDisplayed());
        TestListener.saveScreenshotPNG(driver);

    }

    public void makeAndModelDisplay() throws InterruptedException {

        waitMethods.waitForElementToBeRefreshedAndIsVisible(label_makeandModels);
        Assert.assertTrue(label_makeandModels.isDisplayed());
        Assert.assertTrue(label_truck.isDisplayed());
        Assert.assertTrue(txt_truck_field.isDisplayed());
        Assert.assertTrue(label_truck_serach_icon.isDisplayed());
        Assert.assertTrue(label_engine.isDisplayed());
        Assert.assertTrue(label_transmission.isDisplayed());
        Assert.assertTrue(label_rearAxle.isDisplayed());
        Assert.assertTrue(label_body.isDisplayed());
        TestListener.saveScreenshotPNG(driver);
    }

    public void groupDisplay() throws InterruptedException {

        waitMethods.waitForElementToBeRefreshedAndIsVisible(label_Group);
        Assert.assertTrue(label_Group.isDisplayed());
        Assert.assertTrue(btn_cancle.isDisplayed());
        Assert.assertTrue(btn_saveAndExit.isDisplayed());
        TestListener.saveScreenshotPNG(driver);
    }

    /**
     * Enter random 9 digit Unit
     */
     public void enterUnit() throws FileNotFoundException, InterruptedException {

         waitMethods.waitForElementToBeRefreshedAndClickable(txt_unit);
         WebElementActions.getActions(driver).inputText(txt_unit,waitMethods.returnCurrentTime());
         WebElementActions.getActions(driver).inputText(txt_unit, waitMethods.getRandom(9));
        TestListener.saveScreenshotPNG(driver);

    }

    /**
     * Enter Description
     */
     public void enterDescription() throws InterruptedException {
//        if (LoginActions.environmentName.contains("QA") || LoginActions.environmentName.contains("EU")) {
         if (LoginActions.environmentName.contains("QA")) {
             waitMethods.waitForElementToBeRefreshedAndClickable(txt_description);
             WebElementActions.getActions(driver).inputText(txt_description, appProp.getProperty("description"));
         }
         else if(LoginActions.environmentName.contains("EC")){
             waitMethods.waitForElementToBeRefreshedAndClickable(txt_description);
             WebElementActions.getActions(driver).inputText(txt_description, appProp2.getProperty("description"));
         }
         else if(LoginActions.environmentName.contains("EU")){
             waitMethods.waitForElementToBeRefreshedAndClickable(txt_description);
             WebElementActions.getActions(driver).inputText(txt_description, appProp19.getProperty("description"));
         }
         else if(LoginActions.environmentName.contains("NA")) {
             waitMethods.waitForElementToBeRefreshedAndClickable(txt_description);
             WebElementActions.getActions(driver).inputText(txt_description, appProp32.getProperty("description"));
         }

         waitMethods.loadingWait(loder);
         TestListener.saveScreenshotPNG(driver);
        }
//    }

    /**
     * Enter random 9 digit VIN
     */
     public void enterVIN() throws FileNotFoundException, InterruptedException {

         waitMethods.waitForElementToBeRefreshedAndClickable(txt_VIN);
         WebElementActions.getActions(driver).inputText(txt_VIN, waitMethods.getRandom(9));
        TestListener.saveScreenshotPNG(driver);
    }

    /**type Year*/
     public void typeYear () throws InterruptedException {
 //        Thread.sleep(3000);
        if (LoginActions.environmentName.contains("EU")) {
            waitMethods.waitForElementToBeRefreshedAndClickable(label_YearTextArea);
            WebElementActions.getActions(driver).inputText(label_YearTextArea, appProp19.getProperty("year"));
         }else if(LoginActions.environmentName.contains("NA")) {
            waitMethods.waitForElementToBeRefreshedAndClickable(label_YearTextArea);
            WebElementActions.getActions(driver).inputText(label_YearTextArea, appProp32.getProperty("year"));
        }

    }
    /**Click On SearchImage */
     public void clickOnSearchImage () throws InterruptedException {
        if (LoginActions.environmentName.contains("EU") || LoginActions.environmentName.contains("NA")) {
            waitMethods.waitForElementToBeRefreshedAndClickable(label_SearchImgOne);
            WebElementActions.getActions(driver).clickElement(label_SearchImgOne);
        }
    }
    /**click OnSelect Button */
     public void clickOnSelectButton () throws InterruptedException {
        if (LoginActions.environmentName.contains("EU") || LoginActions.environmentName.contains("NA")) {
            waitMethods.waitForElementToBeRefreshedAndClickable(btn_SelectButton);
            WebElementActions.getActions(driver).clickElement(btn_SelectButton);
        }
    }

    /**
     * click on save and exit button
     */
     public void clickOnSaveAndExit() throws InterruptedException {

         waitMethods.waitForElementToBeRefreshedAndClickable(btn_saveAndExit);
         WebElementActions.getActions(driver).clickElement(btn_saveAndExit);

         waitMethods.loadingWait(loder);

        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * click on unit number hyperlink
     */
     public void clickOnUnitNumberhyperlink() throws InterruptedException {

         waitMethods.waitForElementToBeRefreshedAndClickable(hyperlink_unit_number);
         WebElementActions.getActions(driver).clickElement(hyperlink_unit_number);
         waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }

    /**
     * Verify unit created
     * click on save and exit button
     */
     public void verify_unit_created() throws InterruptedException {

         waitMethods.waitForElementToBeRefreshedAndIsVisible(unit_value);
         Assert.assertTrue(unit_value.isDisplayed());

        waitMethods.waitForElementToBeRefreshedAndClickable(saveandExit_btn);
         WebElementActions.getActions(driver).clickElement(saveandExit_btn);
        TestListener.saveScreenshotPNG(driver);

    }

    /**
     * click on signOut button
     * verify username
     */

     public void clickOnSignOut() throws InterruptedException {

         waitMethods.waitForElementToBeRefreshedAndClickable(sign_out);
         WebElementActions.getActions(driver).clickElement(sign_out);


         waitMethods.waitForElementToBeRefreshedAndIsVisible(inputbox_Username);
        Assert.assertTrue(inputbox_Username.isDisplayed());
        TestListener.saveScreenshotPNG(driver);
    }
}
