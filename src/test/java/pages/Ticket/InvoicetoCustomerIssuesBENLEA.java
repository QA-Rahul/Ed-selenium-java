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

public class InvoicetoCustomerIssuesBENLEA extends TestDriverActions {

    @FindBy(xpath = "//a[text()='Administration']")
    WebElement menu_Administration;
    @FindBy(xpath = "//td[text()='Customer']")
    WebElement subMenu_Customer;
    @FindBy(xpath = "//span[text()='Customer Manager']")
    WebElement txt_CustomerManager;
    @FindBy(xpath = "//h1[text()='Customers List']")
    WebElement title_CustomersList;
    @FindBy(xpath = "//label[text()='Search:']")
    WebElement txt_Search;
    @FindBy(xpath = "//label[text()='Search:']/following::input[1]")
    WebElement txtbox_search;
    @FindBy(xpath = "//label[contains(text(),'Include Inactive:')]" )
    WebElement label_Include_Inactive;
    @FindBy(xpath = "//label[contains(text(),'Include Inactive:')]/following::input[1]" )
    WebElement chkbox_Include_Inactive;
    @FindBy(xpath = "//h2[contains(text(),'Customers List')]" )
    WebElement label_Customer_list2;
    @FindBy(xpath = "//span[contains(text(),'Add Customer')]" )
    WebElement btn_Add_Customer;
    @FindBy(xpath = "//h1[text()='Customers List']" )
    WebElement label_customer_list_1;
    @FindBy(xpath = "//span[contains(text(),'Name')]" )
    WebElement label_name;
    @FindBy(xpath = "//span[text()='Code']" )
    WebElement label_code;
    @FindBy(xpath = "//span[text()='Phone']" )
    WebElement label_phone;
    @FindBy(xpath = "//span[text()='City']" )
    WebElement label_city;
    @FindBy(xpath = "//span[text()='Address']" )
    WebElement label_address;
    @FindBy(xpath = "//span[text()='Province']" )
    WebElement label_province;
    @FindBy(xpath = "//span[text()='Postal Code']" )
    WebElement label_postalcode;
    @FindBy(xpath = "//span[text()='Country']" )
    WebElement label_country;
    @FindBy(xpath = "//span[text()='Payment Term']" )
    WebElement label_payment_term;
    @FindBy(xpath = "//span[text()='Active']" )
    WebElement label_active;
    @FindBy(xpath = "(//td[contains(@id,'ct1name')]/descendant::a)[1]")
    WebElement link_CustomerName;
    @FindBy(xpath = "//td[contains(@id,'j_id119::tb')]/div")
    WebElement CustomerName;
    @FindBy(xpath = "//label[text()='Code:']")
    WebElement txt_code;
    @FindBy(xpath = "//label[text()='Code:']/following::input[1]")
    WebElement txtbox_code;
    @FindBy(xpath = "//label[text()='Name:']")
    WebElement txt_Name;
    @FindBy(xpath = "//label[text()='Name:']/following::input[1]")
    WebElement txtbox_Name;
    @FindBy(xpath = "(//a[contains(@id,'customer:sdi1::disAcr')])[1]")
    WebElement details;
    @FindBy(xpath = "(//a[contains(@id,'customer:sdi3::disAcr')])[1]")
    WebElement contacts;
    @FindBy(xpath = "(//div[contains(@id,'customer:sdi14::ti::_afrTabCnt')])[1]")
    WebElement Locations;
    @FindBy(xpath = "(//a[contains(@id,'customer:sdi4::disAcr')])[1]")
    WebElement Taxes;
    @FindBy(xpath = "(//a[contains(@id,'customer:sdi5::disAcr')])[1]")
    WebElement Types;
    @FindBy(xpath = "(//a[contains(@id,'customer:sdi2::disAcr')])[1]")
    WebElement Alerts;
    @FindBy(xpath = "(//a[contains(@id,'customer:sdi6::disAcr')])[1]")
    WebElement InvoiceFormats;
    @FindBy(xpath = "(//a[contains(@id,'customer:sdi12::disAcr')])[1]")
    WebElement InvoiceToCustomer;
    @FindBy(xpath = "(//a[contains(@id,'customer:sdi10::disAcr')])[1]")
    WebElement StandingPOs;
    @FindBy(xpath = "(//a[contains(@id,'customer:sdi7::disAcr')])[1]")
    WebElement Tenders;
    @FindBy(xpath = "(//a[contains(@id,'customer:sdi8::disAcr')])[1]")
    WebElement Billing_Cycle;
    @FindBy(xpath = "(//a[contains(@id,'customer:sdi9::disAcr')])[1]")
    WebElement Insurance;
    @FindBy(xpath = "(//a[contains(@id,'customer:sdi11::disAcr')])[1]")
    WebElement FuelSurchargeRates;
    @FindBy(xpath = "//label[contains(@id,'sbc8::Label0')]")
    WebElement txt_IncludeVoided;
    @FindBy(xpath = "//label[contains(@id,'sbc8::Label0')]/preceding::input[1]")
    WebElement checkbox_IncludeVoided;
    @FindBy(xpath = "//div[contains(@id,'cmdToolbarbutton25')]/descendant::span")
    WebElement btn_Add;
    @FindBy(xpath = "//th[contains(@id,'table1:column1')]/descendant::span")
    WebElement col_EffectiveDate;
    @FindBy(xpath = "//th[contains(@id,'table1:column2')]/descendant::span")
    WebElement col_InvoiceToCustomer;
    @FindBy(xpath = "//th[contains(@id,'table1:column3')]/descendant::span")
    WebElement col_Voided;
    @FindBy(xpath = "//td[contains(@id,'pw10::tb')]/div")
    WebElement title_InvoiceToCustomer;
    @FindBy(xpath = "//tr[contains(@id,'s46:id9')]/descendant::label")
    WebElement txt_EffectiveDate;
    @FindBy(xpath = "//input[contains(@id,'s46:id9::content')]")
    WebElement txtbox_EffectiveDate;
    @FindBy(xpath = "(//tr[contains(@id,'s46:plam43')]/descendant::label)[1]")
    WebElement txt_InvoiceTocustomer;
    @FindBy(xpath = "//input[contains(@id,'itSearchCustomerSelect::content')]")
    WebElement txtbox_InvoiceToCustomer;
    @FindBy(xpath = "//li[contains(@class,'AFAutoSuggestItem')]")
    WebElement list_Customer;
    @FindBy(xpath = "//a[contains(@id,'s46:r4:0:cilV')]")
    WebElement magnificienticon;
    @FindBy(xpath = "//div[contains(@id,'s46:cb11')]/descendant::span")
    WebElement btn_cancle;
    @FindBy(xpath = "//div[contains(@id,'s46:cb19')]/descendant::span")
    WebElement btn_SaveExit;
    @FindBy(xpath = "//div[contains(@id,'cb2')]/descendant::span")
    WebElement OkBtn;
    @FindBy(xpath = "//a[text()='Service']")
    WebElement menu_Service;
    @FindBy(xpath = "//td[text()='Complete RO']")
    WebElement subMenu_CompleteRo;
    @FindBy(xpath = "//span[text()='Complete RO']")
    WebElement title_CompleteRo;
    @FindBy(xpath = "//label[text()='Location:']")
    WebElement txt_Location;
    @FindBy(xpath = "//input[contains(@id,'itSearchFacilitySelect::content')]")
    WebElement txtbox_Location;
    @FindBy(xpath = "//h1[text()='Ready to Submit']")
    WebElement title_ReadyToSubmit;
    @FindBy(xpath = "//div[contains(@id,'sfRM:ctbNRB')]/descendant::span")
    WebElement btn_NonRepairBill;
    @FindBy(xpath = "//div[contains(@id,'sfRM:cbNWO')]/descendant::span")
    WebElement btn_NewRO;
    @FindBy(xpath = "//h1[text()='New Repair Order']")
    WebElement title_NewRepairOrder;
    @FindBy(xpath = "//span[contains(@id,'rWO:0:ol2')]/descendant::label")
    WebElement Location;
    @FindBy(xpath = "//input[contains(@id,'itSearchFacilitySelect::content')]")
    WebElement Location_txtbox;
    @FindBy(xpath = "//span[contains(@id,'sSEquQ:ol22')]/descendant::label")
    WebElement txt_searchUnit;
    @FindBy(xpath = "//input[contains(@id,'sSEquQ:sqSu:dc_it1::content')]")
    WebElement txtbox_searchUnit;
    @FindBy(xpath = "//div[contains(@id,'sSEquQ:cbNU')]/descendant::span")
    WebElement btn_NewUnit;
    @FindBy(xpath = "//div[contains(@id,'sSEquQ:ctbSAS')]/descendant::span")
    WebElement btn_showAdvancedSearch;
    @FindBy(xpath = "//h2[text()='Search and Select Unit']")
    WebElement txt_SearchAndSelectUnit;
    @FindBy(xpath = "//label[contains(@id,'sSEquQ:qryId1:conj_afrlblBy')]")
    WebElement txt_match;
    @FindBy(xpath = "(//tr[contains(@id,'sSEquQ:qryId1:crtn0')]/descendant::label)[1]")
    WebElement txt_Unit;
    @FindBy(xpath = "(//tr[contains(@id,'sSEquQ:qryId1:crtn0')]/descendant::input)[1]")
    WebElement txtbox_Unit;
    @FindBy(xpath = "(//tr[contains(@id,'sSEquQ:qryId1:crtn1')]/descendant::label)[1]")
    WebElement txt_OwnerName;
    @FindBy(xpath = "(//tr[contains(@id,'sSEquQ:qryId1:crtn1')]/descendant::input)[1]")
    WebElement txtbox_OwnerName;
    @FindBy(xpath = "(//tr[contains(@id,'sSEquQ:qryId1:crtn2')]/descendant::label)[1]")
    WebElement txt_SerialNumber;
    @FindBy(xpath = "(//tr[contains(@id,'sSEquQ:qryId1:crtn2')]/descendant::input)[1]")
    WebElement txtbox_SerialNumber;
    @FindBy(xpath = "(//tr[contains(@id,'sSEquQ:qryId1:crtn3')]/descendant::label)[1]")
    WebElement txt_description;
    @FindBy(xpath = "(//tr[contains(@id,'sSEquQ:qryId1:crtn3')]/descendant::input)[1]")
    WebElement txtbox_Description;
    @FindBy(xpath = "(//tr[contains(@id,'sSEquQ:qryId1:crtn4')]/descendant::label)[1]")
    WebElement txt_OwnerCode;
    @FindBy(xpath = "(//tr[contains(@id,'sSEquQ:qryId1:crtn4')]/descendant::input)[1]")
    WebElement txtbox_OwnerCode;
    @FindBy(xpath = "(//tr[contains(@id,'sSEquQ:qryId1:crtn5')]/descendant::label)[1]")
    WebElement txt_VIN;
    @FindBy(xpath = "(//tr[contains(@id,'sSEquQ:qryId1:crtn5')]/descendant::input)[1]")
    WebElement txtbox_VIN;
    @FindBy(xpath = "(//tr[contains(@id,'sSEquQ:qryId1:crtn6')]/descendant::label)[1]")
    WebElement txt_LisensePlate;
    @FindBy(xpath = "(//tr[contains(@id,'sSEquQ:qryId1:crtn6')]/descendant::input)[1]")
    WebElement txtbox_LisensePlate;
    @FindBy(xpath = "//div[contains(@id,'sSEquQ:qryId1:_search')]")
    WebElement btn_Search;
    @FindBy(xpath = "//div[contains(@id,'sSEquQ:qryId1:_reset')]")
    WebElement btn_reset;
    @FindBy(xpath = "(//div[contains(@id,'sSEquQ:qryId1:adFlds')])[1]")
    WebElement btn_AddFields;
    @FindBy(xpath = "//div[contains(@id,'sSEquQ:qryId1:reorder')]")
    WebElement btn_Reorder;
    @FindBy(xpath = "//td[contains(@id,'sSEquQ:tequ:11:cSLEqu')]/descendant::a")
    WebElement btn_select;
    @FindBy(xpath = "//h1[text()='Repair Order']")
    WebElement title_RepairOrder;
    @FindBy(xpath = "//span[contains(@id,'rWO:1:olFac')]/descendant::label")
    WebElement Location_CompleteRo;
    @FindBy(xpath = "//a[contains(@id,'rWO:1:clFac')]/descendant::span")
    WebElement LocationName_CompleteRo;
    @FindBy(xpath = "//span[contains(@id,'rWO:1:olOwn')]/descendant::label")
    WebElement txt_UnitOwner;
    @FindBy(xpath = "//span[contains(@id,'rWO:1:otOwn')]")
    WebElement UnitOwner_Name;
    @FindBy(xpath = "//span[contains(@id,'rWO:1:ol9')]/descendant::label")
    WebElement txt_InvoiceTo;
    @FindBy(xpath = "//a[contains(@id,'clSearchCustomerQuery')]/descendant::span")
    List<WebElement> InvoiceTo_Name;
    @FindBy(xpath = "(//a[text()='Customer'])[1]")
    WebElement tab_Customer;
    @FindBy(xpath = "//td[contains(@id,'table1:0:column2')]/descendant::a")
    WebElement InvoiceToCustomer_Name;
    @FindBy(xpath = "//td[contains(@id,'pw10::tb')]/descendant::div")
    WebElement txt_InvoiceToCustomer;
    @FindBy(xpath = "//label[text()='Effective Date:']")
    WebElement label_EffectiveDate;
    @FindBy(xpath = "//label[text()='Effective Date:']/following::td[1]")
    WebElement EffectiveDate;
    @FindBy(xpath = "//label[text()='Invoice To Customer:']")
    WebElement label_InvoiceToCustomer;
    @FindBy(xpath = "//label[text()='Invoice To Customer:']/following::td[1]")
    WebElement InvoiceToCustomer_UserName;
    @FindBy(xpath = "//div[contains(@id,'cb10')]/descendant::span")
    WebElement btn_void;
    @FindBy(xpath = "//div[contains(@id,'cb11')]/descendant::span")
    WebElement cancleBtn;
    @FindBy(xpath = "(//div[contains(@id,'konamaintab3::ti::_afrTabCnt')]/following::a)[1]")
    WebElement tab_CompleteRO;
    @FindBy(xpath = "//span[text()='Sign Out']")
    WebElement btn_signOut;
    @FindBy(xpath = "//input[@name='username']")
    public WebElement inputbox_Username;
/*    @FindBy(xpath = "")
    WebElement ;
    @FindBy(xpath = "")
    WebElement ;
    @FindBy(xpath = "")
    WebElement ;
    @FindBy(xpath = "")
    WebElement ;
    @FindBy(xpath = "")
    WebElement ;
    @FindBy(xpath = "")
    WebElement ;
    @FindBy(xpath = "")
    WebElement ;
    @FindBy(xpath = "")
    WebElement ;


    */

    @FindBy(xpath = "//h1[text()='Working...Please Wait']")
    List<WebElement> loder;

    public InvoicetoCustomerIssuesBENLEA(WebDriver driver){
        this.driver = driver;
        this.waitMethods = new WaitMethods(driver);
    }

    /*
        go to Customer Screen
     */
    public void gotoCustomerScreen() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(menu_Administration);
        WebElementActions.getActions(driver).clickElement(menu_Administration);

        waitMethods.waitForElementToBeRefreshedAndClickable(subMenu_Customer);
        WebElementActions.getActions(driver).clickElement(subMenu_Customer);
    }
    /**
     * verify all fields of Customer manager
     */
    public void customerManagerTitle() throws InterruptedException {

        waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_CustomerManager);
        Assert.assertTrue(txt_CustomerManager.isDisplayed());
        Assert.assertTrue(title_CustomersList.isDisplayed());
        Assert.assertTrue(txt_Search.isDisplayed());
        Assert.assertTrue(txtbox_search.isDisplayed());
        Assert.assertTrue(label_Include_Inactive.isDisplayed());
        Assert.assertTrue(chkbox_Include_Inactive.isDisplayed());
        TestListener.saveScreenshotPNG(driver);
    }

    /**
     * Verify all elements of customer list table
     */
    public void customerListTableTitle() throws InterruptedException {

        waitMethods.waitForElementToBeRefreshedAndIsVisible(label_Customer_list2);
        Assert.assertTrue(label_Customer_list2.isDisplayed());
        Assert.assertTrue(btn_Add_Customer.isDisplayed());
        Assert.assertTrue(label_customer_list_1.isDisplayed());
        Assert.assertTrue(label_name.isDisplayed());
        Assert.assertTrue(label_code.isDisplayed());
        Assert.assertTrue(label_phone.isDisplayed());
        Assert.assertTrue(label_city.isDisplayed());
        Assert.assertTrue(label_address.isDisplayed());
        Assert.assertTrue(label_province.isDisplayed());
        Assert.assertTrue(label_postalcode.isDisplayed());
        Assert.assertTrue(label_country.isDisplayed());
        Assert.assertTrue(label_payment_term.isDisplayed());
        Assert.assertTrue(label_active.isDisplayed());

        TestListener.saveScreenshotPNG(driver);
    }
    /*
        enter Aspire Trucking
     */
    public void enterAspireTruckingInSearchBox() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(txtbox_search);
        WebElementActions.getActions(driver).inputText(txtbox_search,appProp68.getProperty("unitName"));

        waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /*
        click on Customer Name link
     */
    public void clickOnLink() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(link_CustomerName);
        WebElementActions.getActions(driver).clickElement(link_CustomerName);

        waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);

        Thread.sleep(8000);
        driver.switchTo().frame(2);
    }
    /*
       verify code and name of customer name
     */
    public void verifyCodeAndName() throws InterruptedException {


        waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_code);
        Assert.assertTrue(txt_code.isDisplayed());
        Assert.assertTrue(txtbox_code.isDisplayed());
        Assert.assertTrue(txt_Name.isDisplayed());
        Assert.assertTrue(txtbox_Name.isDisplayed());
    }
    /*
       verify the tabs present
     */
    public void verifyTabs() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(details);
        Assert.assertTrue(details.isDisplayed());
        Assert.assertTrue(contacts.isDisplayed());
        Assert.assertTrue(Locations.isDisplayed());
        Assert.assertTrue(Taxes.isDisplayed());
        Assert.assertTrue(Types.isDisplayed());
        Assert.assertTrue(Alerts.isDisplayed());
        Assert.assertTrue(InvoiceFormats.isDisplayed());
        Assert.assertTrue(InvoiceToCustomer.isDisplayed());
        Assert.assertTrue(StandingPOs.isDisplayed());
        Assert.assertTrue(Tenders.isDisplayed());
        Assert.assertTrue(Billing_Cycle.isDisplayed());
        Assert.assertTrue(Insurance.isDisplayed());
        Assert.assertTrue(FuelSurchargeRates.isDisplayed());
    }
    /*
        click on Invoice to Customer Tab
     */
    public void clickOnInvoiceToCustomerTab() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(InvoiceToCustomer);
        WebElementActions.getActions(driver).clickElement(InvoiceToCustomer);

        waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /*
         verify column name of Invoice To Customer table
     */
    public void verifyInvoiceToCustomerColumn() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_IncludeVoided);
        Assert.assertTrue(txt_IncludeVoided.isDisplayed());
        Assert.assertTrue(checkbox_IncludeVoided.isDisplayed());
        Assert.assertTrue(btn_Add.isDisplayed());
        Assert.assertTrue(col_EffectiveDate.isDisplayed());
        Assert.assertTrue(col_InvoiceToCustomer.isDisplayed());
        Assert.assertTrue(col_Voided.isDisplayed());

    }
    /*
        click on Add button
     */
      public void clickOnAddBtn() throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndClickable(btn_Add);
          WebElementActions.getActions(driver).clickElement(btn_Add);

          waitMethods.loadingWait(loder);
          TestListener.saveScreenshotPNG(driver);
      }
      /*
         verify Pop up Invoice To Customer
       */
       public void verifyPopUpInvoiceToCustomer() throws InterruptedException {
           waitMethods.waitForElementToBeRefreshedAndIsVisible(title_InvoiceToCustomer);
           Assert.assertTrue(title_InvoiceToCustomer.isDisplayed());
           Assert.assertTrue(txt_EffectiveDate.isDisplayed());
           Assert.assertTrue(txtbox_EffectiveDate.isDisplayed());
           Assert.assertTrue(txt_InvoiceTocustomer.isDisplayed());
           Assert.assertTrue(txtbox_InvoiceToCustomer.isDisplayed());
           Assert.assertTrue(magnificienticon.isDisplayed());
           Assert.assertTrue(btn_cancle.isDisplayed());
           Assert.assertTrue(btn_SaveExit.isDisplayed());

       }
       /*
            Search Unit number
        */
        public void searchUnitNumber() throws InterruptedException {
            waitMethods.waitForElementToBeRefreshedAndClickable(txtbox_InvoiceToCustomer);
            WebElementActions.getActions(driver).inputText(txtbox_InvoiceToCustomer,appProp68.getProperty("customername"));

            waitMethods.waitForElementToBeRefreshedAndClickable(list_Customer);
            WebElementActions.getActions(driver).clickElement(list_Customer);

            waitMethods.loadingWait(loder);
            TestListener.saveScreenshotPNG(driver);
        }
        /*
           click on Save and exit
          */
         public void clickOnSaveExit() throws InterruptedException {
             waitMethods.waitForElementToBeRefreshedAndClickable(btn_SaveExit);
             WebElementActions.getActions(driver).clickElement(btn_SaveExit);

             waitMethods.loadingWait(loder);
             TestListener.saveScreenshotPNG(driver);
         }
         /*
           click on Ok button
        */
       public void clickOnOkBtn() throws InterruptedException {
           waitMethods.waitForElementToBeRefreshedAndClickable(OkBtn);
           WebElementActions.getActions(driver).clickElement(OkBtn);

           waitMethods.loadingWait(loder);
           TestListener.saveScreenshotPNG(driver);


       }
       /*
           go to Complete Ro Screen
        */
        public void gotoCompleteRoScreen() throws InterruptedException {
            Thread.sleep(5000);
            driver.switchTo().defaultContent();

            waitMethods.waitForElementToBeRefreshedAndClickable(menu_Service);
            WebElementActions.getActions(driver).clickElement(menu_Service);

            waitMethods.waitForElementToBeRefreshedAndClickable(subMenu_CompleteRo);
            WebElementActions.getActions(driver).clickElement(subMenu_CompleteRo);

            TestListener.saveScreenshotPNG(driver);

        }
       /*
            verify title complete Ro
        */
        public void verifyTitleCompleteRo() throws InterruptedException {
            waitMethods.waitForElementToBeRefreshedAndIsVisible(title_CompleteRo);
            Assert.assertTrue(title_CompleteRo.isDisplayed());
        }
        /*
            verify location
         */
        public void verifyLocation() throws InterruptedException {
            waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_Location);
            Assert.assertTrue(txt_Location.isDisplayed());
            Assert.assertTrue(txtbox_Location.isDisplayed());
        }
        /*
             verify title Ready To Submit
         */
         public void verifyTitleReadyToSubmit() throws InterruptedException {
             waitMethods.waitForElementToBeRefreshedAndIsVisible(title_ReadyToSubmit);
             Assert.assertTrue(title_ReadyToSubmit.isDisplayed());
         }
         /*
             verify tabs new repair bill and new Ro
          */
          public void verifyNewRepairBill() throws InterruptedException {
              waitMethods.waitForElementToBeRefreshedAndIsVisible(btn_NonRepairBill);
              Assert.assertTrue(btn_NonRepairBill.isDisplayed());
              Assert.assertTrue(btn_NewRO.isDisplayed());
          }
          /*
             click on New Ro button
           */
          public void clickOnNewRo() throws InterruptedException {
              waitMethods.waitForElementToBeRefreshedAndClickable(btn_NewRO);
              WebElementActions.getActions(driver).clickElement(btn_NewRO);

              waitMethods.loadingWait(loder);
              TestListener.saveScreenshotPNG(driver);
          }
          /*
              verify title New Repair Order
           */
           public void verifyTitleNewRepairOrder() throws InterruptedException {
               waitMethods.waitForElementToBeRefreshedAndIsVisible(title_NewRepairOrder);
               Assert.assertTrue(title_NewRepairOrder.isDisplayed());
           }
           /*
              verify Location of new repair order
            */
            public void verifyLocationOfNewRepairOrder() throws InterruptedException {
                waitMethods.waitForElementToBeRefreshedAndIsVisible(Location);
                Assert.assertTrue(Location.isDisplayed());
                Assert.assertTrue(Location_txtbox.isDisplayed());
                Assert.assertTrue(txt_searchUnit.isDisplayed());
                Assert.assertTrue(txtbox_searchUnit.isDisplayed());
                Assert.assertTrue(btn_NewUnit.isDisplayed());
                Assert.assertTrue(btn_showAdvancedSearch.isDisplayed());
            }
            /*
              click on show Advanced Search
           */
          public void clickOnSearchAdvancedSearch() throws InterruptedException {
              waitMethods.waitForElementToBeRefreshedAndClickable(btn_showAdvancedSearch);
              WebElementActions.getActions(driver).clickElement(btn_showAdvancedSearch);

              waitMethods.loadingWait(loder);
              TestListener.saveScreenshotPNG(driver);
          }
          /*
               verify search and select unit
          */
          public void verifySearchandSelectUnit() throws InterruptedException {
               waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_SearchAndSelectUnit);
               Assert.assertTrue(txt_SearchAndSelectUnit.isDisplayed());
               Assert.assertTrue(txt_match.isDisplayed());
          }
          /*
             verify unit
           */
          public void verifyUnit() throws InterruptedException {
              waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_Unit);
              Assert.assertTrue(txt_Unit.isDisplayed());
              Assert.assertTrue(txtbox_Unit.isDisplayed());
          }
          /*
              verify Owner Name
           */
          public void verifyOwnerName() throws InterruptedException {
              waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_OwnerName);
              Assert.assertTrue(txt_OwnerName.isDisplayed());
              Assert.assertTrue(txtbox_OwnerName.isDisplayed());
          }
          /*
              verify serial Number
           */
          public void verifySerialNumber() throws InterruptedException {
              waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_SerialNumber);
              Assert.assertTrue(txt_SerialNumber.isDisplayed());
              Assert.assertTrue(txtbox_SerialNumber.isDisplayed());
          }
          /*
             verify description
           */
          public void verifyDescription() throws InterruptedException {
              waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_description);
              Assert.assertTrue(txt_description.isDisplayed());
              Assert.assertTrue(txtbox_Description.isDisplayed());
          }
          /*
              verify Owner Code
           */
          public void verifyOwnerCode() throws InterruptedException {
              waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_OwnerCode);
              Assert.assertTrue(txt_OwnerCode.isDisplayed());
              Assert.assertTrue(txtbox_OwnerCode.isDisplayed());
          }
          /*
              verify VIN
           */
           public void verifyVIN() throws InterruptedException {
               waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_VIN);
               Assert.assertTrue(txt_VIN.isDisplayed());
               Assert.assertTrue(txtbox_VIN.isDisplayed());
           }
           /*
               verify Lisense Plate
           */
          public void verifyLisensePlate() throws InterruptedException {
               waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_LisensePlate);
               Assert.assertTrue(txt_LisensePlate.isDisplayed());
               Assert.assertTrue(txtbox_LisensePlate.isDisplayed());
            }
           /*
              verify tab search,reset,addfields,reorder
           */
           public void verifyTabSearch() throws InterruptedException {
               waitMethods.waitForElementToBeRefreshedAndIsVisible(btn_Search);
               Assert.assertTrue(btn_Search.isDisplayed());
               Assert.assertTrue(btn_reset.isDisplayed());
               Assert.assertTrue(btn_AddFields.isDisplayed());
               Assert.assertTrue(btn_Reorder.isDisplayed());
           }
        /*
             enter owner name
         */
         public void enterOwnername() throws InterruptedException {
             waitMethods.waitForElementToBeRefreshedAndClickable(txtbox_OwnerName);
             WebElementActions.getActions(driver).inputText(txtbox_OwnerName,appProp68.getProperty("unitName"));

             waitMethods.loadingWait(loder);
             TestListener.saveScreenshotPNG(driver);
         }
         /*
             click on search button
          */
         public void clickOnSearchButton() throws InterruptedException {
             waitMethods.waitForElementToBeRefreshedAndClickable(btn_Search);
             WebElementActions.getActions(driver).clickElement(btn_Search);

             waitMethods.loadingWait(loder);
             TestListener.saveScreenshotPNG(driver);
         }
        /*
            click on select button
         */
    public void clickOnSelectButton() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(btn_select);
        WebElementActions.getActions(driver).clickElement(btn_select);

        waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /*
        verify title Repair Order
     */
    public void verifyRepairOrder() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(title_RepairOrder);
        Assert.assertTrue(title_RepairOrder.isDisplayed());
    }
    /*
         verify Location present in complete Ro
     */
    public void verifyLocationCompleteRo() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(Location_CompleteRo);
        Assert.assertTrue(Location_CompleteRo.isDisplayed());
        Assert.assertTrue(LocationName_CompleteRo.isDisplayed());
    }
    /*
         verify Unit Owner
     */
    public void verifyUnitOwner() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_UnitOwner);
        Assert.assertTrue(txt_UnitOwner.isDisplayed());
        Assert.assertTrue(UnitOwner_Name.isDisplayed());
    }
    /*
        verify InvoiceTo to check 905 is present
     */
    public void verifyInvoiceTo905() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_InvoiceTo);
        Assert.assertTrue(txt_InvoiceTo.isDisplayed());
        Thread.sleep(8000);
        if(InvoiceTo_Name.size()>=0){
            Assert.assertTrue(InvoiceTo_Name.get(0).isDisplayed());
        }

        System.out.println("Name of Invoice To Customer :-" +InvoiceTo_Name.get(0).getText());
    }
    /*
        click on Customer tab
     */
     public void clickOnCustomerTab() throws InterruptedException {
         waitMethods.waitForElementToBeRefreshedAndClickable(tab_Customer);
         WebElementActions.getActions(driver).clickElement(tab_Customer);

         waitMethods.loadingWait(loder);
         TestListener.saveScreenshotPNG(driver);
    }
    /*
         click on Invoice To Customer name
     */
     public void clickOnInvoiceToCustomerName() throws InterruptedException {
         waitMethods.waitForElementToBeRefreshedAndClickable(InvoiceToCustomer_Name);
         WebElementActions.getActions(driver).clickElement(InvoiceToCustomer_Name);

         waitMethods.loadingWait(loder);
         TestListener.saveScreenshotPNG(driver);
    }
    /*
         verify Invoice To Customer pop up
     */
     public void verifyInvoiceToCustomerPopUp() throws InterruptedException {
         waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_InvoiceToCustomer);
         Assert.assertTrue(txt_InvoiceToCustomer.isDisplayed());

    }
    /*
         verify text Effective Date
     */
     public void verifyTextEffectiveDate() throws InterruptedException {
         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_EffectiveDate);
         Assert.assertTrue(label_EffectiveDate.isDisplayed());
         Assert.assertTrue(EffectiveDate.isDisplayed());
    }
    /*
         verify Invoice To Customer with user
     */
     public void verifyInvoiceToCustomerUser() throws InterruptedException {
         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_InvoiceToCustomer);
         Assert.assertTrue(label_InvoiceToCustomer.isDisplayed());
         Assert.assertTrue(InvoiceToCustomer_UserName.isDisplayed());
    }
    /*
         verify void and cancle button
     */
     public void verifyVoid_CancleBtn() throws InterruptedException {
         waitMethods.waitForElementToBeRefreshedAndIsVisible(btn_void);
         Assert.assertTrue(btn_void.isDisplayed());
         Assert.assertTrue(cancleBtn.isDisplayed());
    }
    /*
         click on void button
     */
     public void clickOnVoidBtn() throws InterruptedException {
         waitMethods.waitForElementToBeRefreshedAndClickable(btn_void);
         WebElementActions.getActions(driver).clickElement(btn_void);

         waitMethods.loadingWait(loder);
         TestListener.saveScreenshotPNG(driver);
    }
    /*
        click on tab Complete RO
     */
      public void clickOnCompleteROTab() throws InterruptedException {
         Thread.sleep(5000);
         driver.switchTo().defaultContent();

         waitMethods.waitForElementToBeRefreshedAndClickable(tab_CompleteRO);
         WebElementActions.getActions(driver).clickElement(tab_CompleteRO);

         waitMethods.loadingWait(loder);
         TestListener.saveScreenshotPNG(driver);
    }
    /*
        verify Invoice To tocheck Aspire unit is present
     */
    public void verifyInvoiceTo() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_InvoiceTo);
        Assert.assertTrue(txt_InvoiceTo.isDisplayed());
        Thread.sleep(8000);
        if(InvoiceTo_Name.size()<=0){
            Assert.assertTrue(InvoiceTo_Name.get(0).isDisplayed());
        }

        System.out.println("Name of Invoice To Customer :-" +InvoiceTo_Name.get(0).getText());
    }
    /**
     * Click on sign out
     */
    public void clickOnSignOut() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(btn_signOut);
        WebElementActions.getActions(driver).clickElement(btn_signOut);

    }
    /**
     * verify username
     */
    public void verifyUsername() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(inputbox_Username);
        Assert.assertTrue(inputbox_Username.isDisplayed());

        TestListener.saveScreenshotPNG(driver);
    }












}
