   package pages.administration;

import actions.LoginActions;
import actions.ReusableActions;
import actions.WaitActions;
import actions.WebElementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import tests.TestDriverActions;
import utils.TestListener;
import utils.WaitMethods;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public class CreateVendorPage extends TestDriverActions {

    @FindBy(xpath = "//h1[text()='Vendors List']" )
    WebElement label_vendor_list_1;

    @FindBy(xpath="//label[contains(text(),'Search')]")
    WebElement label_search;

    @FindBy(xpath = "//label[contains(text(),'Search')]/following::input[1]" )
    WebElement txt_search_field;

    @FindBy(xpath = "//label[contains(text(),'Include Inactive')]" )
    WebElement label_include_Inactive;

    @FindBy(xpath = "//label[contains(text(),'Include Inactive')]/following::input[1]" )
    WebElement chckbox_include_Inactive;

    @FindBy(xpath = "//h2[contains(text(),'Vendors List')]" )
    WebElement label_vendor_list_2;

    @FindBy(xpath = "//h2[contains(text(),'Vendors List')]/following::span[1]" )
    WebElement btn_addVendor;

    @FindBy(xpath = "//span[contains(text(),'Name')]" )
    WebElement label_name;

    @FindBy(xpath = "//span[contains(text(),'Code')]" )
    WebElement label_code;

    @FindBy(xpath = "//span[contains(text(),'Phone')]" )
    WebElement label_phone;

    @FindBy(xpath = "//h2[contains(text(),'Vendors List')]/following::span[7]" )
    WebElement label_city;

    @FindBy(xpath = "//span[contains(text(),'Address')]" )
    WebElement label_Address;

    @FindBy(xpath = "//span[contains(text(),'Prov/State')]" )
    WebElement label_prov_state;

    @FindBy(xpath = "//span[contains(text(),'State/Province')]")
    WebElement State_Provience;

    @FindBy(xpath = "//span[contains(text(),'ZIP / Postal')]" )
    WebElement label_zip_postal;

    @FindBy(xpath = "//span[contains(text(),'ZIP/Postal Code')]" )
    WebElement label_zip_postal_code;

    @FindBy(xpath = "//span[contains(text(),'Country')]" )
    WebElement label_country;

    @FindBy(xpath = "//span[contains(text(),'Type')]" )
    WebElement label_type;

    @FindBy(xpath = "//span[contains(text(),'Active')]" )
    WebElement label_active;

    @FindBy(xpath = "//label[text()='Code:']/following::input[1]" )
    WebElement txt_code_field;

    @FindBy(xpath = "//label[text()='Name:']/following::input[1]" )
    WebElement txt_name_field;

    @FindBy(xpath = "//label[contains(text(),'Payment Term:')]/following::select[1]" )
    WebElement dropdown_payment_term;

    @FindBy(xpath = "((//span[text()='Cancel'])[1]//following::div//child::span)[1]" )
    WebElement btn_ok;

    @FindBy(xpath = "(//span[contains(@id,'si1')]/following::td)[4]")
    WebElement btn_signOut;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement inputbox_Username;

    @FindBy(xpath = "//h1[text()='Working...Please Wait']")
    public List<WebElement> loder;

    @FindBy(xpath = "//span[text()='External Ref']")
    WebElement label_ExternalRef;

    @FindBy(xpath = "//label[text()='Unmapped Only']")
    WebElement label_UnmappedOnly;

    @FindBy(xpath = "//label[text()='Unmapped Only']/following::input[1]")
    WebElement checkbox_UnmappedOnly;

    @FindBy(xpath = "//a[text()='Administration']")
    WebElement menu_Administration;

    @FindBy(xpath = "//td[text()='Vendors']")
    WebElement subMenu_Vendors;


     public WebDriver driver;

    public CreateVendorPage(WebDriver driver){
        this.driver = driver;
        this.waitMethods = new WaitMethods(driver);
       this.webElementActions = new WebElementActions(driver);


    }

    /**
     * go to Vendors screen
     * @throws InterruptedException
     */
     public  void gotoVendorsScreen() throws FileNotFoundException, InterruptedException {

//        ReusableActions.getActions(driver).clickParentMenu("Administration");
//        ReusableActions.getActions(driver).clickChildMenu("Vendors");

        waitMethods.waitForElementToBeRefreshedAndClickable(menu_Administration);
        WebElementActions.getActions(driver).clickElement(menu_Administration);

        waitMethods.waitForElementToBeRefreshedAndClickable(subMenu_Vendors);
        WebElementActions.getActions(driver).clickElement(subMenu_Vendors);


        TestListener.saveScreenshotPNG(driver);
    }

    /**
     * click on Add Vendors button
     */

     public void clickOnAddVendors() throws InterruptedException {

        waitMethods.waitForElementToBeRefreshedAndClickable(btn_addVendor);
        WebElementActions.getActions(driver).clickElement(btn_addVendor);

        waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }

    /**Enter code*/
     String vandorCode = String.valueOf(WebElementActions.getActions(driver).randomAlphaNumeric( 6));
    public void enterVendorCode() throws InterruptedException {
        Thread.sleep(2000);
        if (LoginActions.environmentName.contains("NA")) {
            Thread.sleep(3000);
            driver.switchTo().frame(2);
            waitMethods.waitForElementToBeRefreshedAndClickable(txt_code_field);
            String vandorCode = String.valueOf(WebElementActions.getActions(driver).randomAlphaNumeric(6));
            Thread.sleep(9000);
            WebElementActions.getActions(driver).inputText(txt_code_field, vandorCode);
            TestListener.saveScreenshotPNG(driver);
        }
         Thread.sleep(3000);

        waitMethods.waitForElementToBeRefreshedAndClickable(txt_code_field);
        WebElementActions.getActions(driver).inputText(txt_code_field,vandorCode);

        TestListener.saveScreenshotPNG(driver);
    }
    /**
     *  random vendor name
     */
     String vendorName = WebElementActions.getActions(driver).randomAlphaNumeric( 10);

    /**
     * Enter Name
     */
     public void enterVendorName() throws InterruptedException {

        waitMethods.waitForElementToBeRefreshedAndClickable(txt_name_field);
        WebElementActions.getActions(driver).inputText(txt_name_field, vendorName);

        TestListener.saveScreenshotPNG(driver);
    }


    /**
     * click on Ok button
     */
     public void selectPaymentTermsMenu() throws InterruptedException {
        Thread.sleep(8000);
        if(LoginActions.environmentName.contains("EC")){
            waitMethods.waitForElementToBeRefreshedAndClickable(dropdown_payment_term);
            WebElementActions.getActions(driver).elementSelectByVisibilityText(dropdown_payment_term,appProp3.getProperty("dropdown"));
        } else if(LoginActions.environmentName.contains("NA")){
            waitMethods.waitForElementToBeRefreshedAndClickable(dropdown_payment_term);
            WebElementActions.getActions(driver).elementSelectByVisibilityText(dropdown_payment_term,appProp34.getProperty("dropdown"));
        }else if(LoginActions.environmentName.contains("QA")){
            waitMethods.waitForElementToBeRefreshedAndClickable(dropdown_payment_term);
            WebElementActions.getActions(driver).elementSelectByVisibilityText(dropdown_payment_term,appProp.getProperty("dropdown"));
        }

        TestListener.saveScreenshotPNG(driver);

    }
    /**
     * Type Vendors name in search box
     */
     public void vendorNameInSearchBox() throws InterruptedException {
        Thread.sleep(3000);
        if(LoginActions.environmentName.contains("NA")) {
            driver.switchTo().defaultContent();
        }

        waitMethods.waitForElementToBeRefreshedAndClickable(txt_search_field);
         WebElementActions.getActions(driver).inputText(txt_search_field, vendorName);

         TestListener.saveScreenshotPNG(driver);
    }

    /**
     * click on Ok button
     */
     public void clickOnOKbutton() throws InterruptedException {

        waitMethods.waitForElementToBeRefreshedAndClickable(btn_ok);
        WebElementActions.getActions(driver).clickElement(btn_ok);

        waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }

    /**
     * check the elements of Vendors List
     */
     public void vendorsManagerHeader() throws InterruptedException {

        waitMethods.waitForElementToBeRefreshedAndIsVisible(label_vendor_list_1);
        Assert.assertTrue(label_vendor_list_1.isDisplayed());
        Assert.assertTrue(label_search.isDisplayed());
        Assert.assertTrue(txt_search_field.isDisplayed());
        Assert.assertTrue(label_include_Inactive.isDisplayed());
        Assert.assertTrue(chckbox_include_Inactive.isDisplayed());

        if(LoginActions.environmentName.contains("NA")) {
            waitMethods.waitForElementToBeRefreshedAndIsVisible(label_UnmappedOnly);
            Assert.assertTrue(label_UnmappedOnly.isDisplayed());
            Assert.assertTrue(checkbox_UnmappedOnly.isDisplayed());
        }
        TestListener.saveScreenshotPNG(driver);

    }

    /**
     *  Check that Vender List table element
     */
     public void vendorsListTable() throws InterruptedException {

        waitMethods.waitForElementToBeRefreshedAndIsVisible(label_vendor_list_2);
        Assert.assertTrue(label_vendor_list_2.isDisplayed());
        Assert.assertTrue(btn_addVendor.isDisplayed());
        Assert.assertTrue(label_name.isDisplayed());
        Assert.assertTrue(label_code.isDisplayed());
        Assert.assertTrue(label_phone.isDisplayed());
        Assert.assertTrue(label_city.isDisplayed());
        Assert.assertTrue(label_Address.isDisplayed());
        Assert.assertTrue(label_country.isDisplayed());
        Assert.assertTrue(label_active.isDisplayed());

        if(LoginActions.environmentName.contains("EC")) {
            waitMethods.waitForElementToBeRefreshedAndIsVisible(label_prov_state);
            Assert.assertTrue(label_prov_state.isDisplayed());
            Assert.assertTrue(label_type.isDisplayed());
            Assert.assertTrue(label_zip_postal.isDisplayed());
        }
        if(LoginActions.environmentName.contains("NA")) {
            waitMethods.waitForElementToBeRefreshedAndIsVisible(State_Provience);
            Assert.assertTrue(State_Provience.isDisplayed());
            Assert.assertTrue(label_zip_postal_code.isDisplayed());
            Assert.assertTrue(label_ExternalRef.isDisplayed());
        }
        TestListener.saveScreenshotPNG(driver);

    }

    /**
     *  click on SignOut button
     *  Check the username field
     */
     public void clickOnSignOut() throws InterruptedException {

        waitMethods.waitForElementToBeRefreshedAndClickable(btn_signOut);
        WebElementActions.getActions(driver).clickElement(btn_signOut);

        waitMethods.waitForElementToBeRefreshedAndIsVisible(inputbox_Username);
        Assert.assertTrue(inputbox_Username.isDisplayed());

        TestListener.saveScreenshotPNG(driver);
    }
}
