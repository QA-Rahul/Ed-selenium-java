 package pages.parts;

import actions.LoginActions;
import actions.ReusableActions;
import actions.WaitActions;
import actions.WebElementActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import tests.TestDriverActions;
import utils.TestListener;
import utils.WaitMethods;

import java.io.FileNotFoundException;
import java.util.List;

public class ReceivePart extends TestDriverActions {

        @FindBy(xpath = "//label[text()='Warehouse:']/following::select")
         public WebElement dropdown;

        @FindBy(xpath = "//label[text()='From Date:']/following::input[1]")
        WebElement txt_adddate;

       @FindBy(xpath = "//label[text()='From Date:']/following::a[2]/span")
        WebElement btn_refresh;

        @FindBy(xpath ="(//a[contains(@id,'cil4')]/span)[1]" )
        public WebElement label_PONumber;

        @FindBy(xpath = "//span[contains(.,'Link/Delink Lab')]")
        public  WebElement label_label_LinkDeLinkLabor;

        @FindBy(xpath = "(//span[text()='Cancel'])[1]")
        public WebElement label_Cancel;

        @FindBy(xpath = "//td[contains(@id,':pw2::tb')]//div[contains(.,'Purchase Order')]")
        public WebElement label_PurchesOrder;

        @FindBy(xpath = "//label[text ()='Location:']//preceding-sibling::span")
        public WebElement label_RequiredLocation;

        @FindBy(xpath = "//label[text ()='Location:']")
        public WebElement label_Location;

        @FindBy(xpath = "//label[text ()='Location:']//parent::td//following-sibling::td")
        public WebElement label_LocationValue;

        @FindBy(xpath = "//label[text ()='Vendor:']//preceding-sibling::span")
        public WebElement label_RequiredVendor;

        @FindBy(xpath = "//label[text ()='Location:']//parent::td//parent::tr//following-sibling::tr//td//label[text()='Vendor:']")
        public WebElement label_Vendor;

        @FindBy(xpath = "(//label[text()='Vendor:']//parent::td//following-sibling::td)[2]")
        public WebElement label_vendorvalue;

        @FindBy(xpath = "//label[text()='PO#:']")
        public WebElement label_PO;

        @FindBy(xpath = "//label[text()='PO#:']//parent::td//following-sibling::td")
        public WebElement label_PoValue;

        @FindBy(xpath = "//label[contains(.,'Reference:')]")
        public WebElement label_Refernce;

        @FindBy(xpath = "//label[contains(.,'Reference:')]//parent::td//parent::tr//following-sibling::tr//td//label[text()='PO Date:']")
        public WebElement label_PODate;

        @FindBy(xpath = "//label[contains(.,'Transport Priority:')]")
        public WebElement label_TranspotPriority;

        @FindBy(xpath = "//tr[contains(@id,'plam511')]/td/label")
        public WebElement label_Notes;

        @FindBy(xpath = "//img[contains(@id,'ciPOATT::icon')]")
        public WebElement label_Icon;

        @FindBy(xpath = "//a[contains(@id,'clPOATT')]")
        public WebElement label_ImgValue;

        @FindBy(xpath = "//label[text()='Ship From:']")
        public WebElement label_ShipFrom;

        @FindBy(xpath = "//label[text()='Ship To:']")
        public WebElement label_ShipTo;

        @FindBy(xpath = "//label[text()='Submitted Date:']")
        public WebElement label_SubmittedDate;

        @FindBy(xpath = "//label[text()='Receiving Info:']")
        public WebElement label_ReceivingInfo;

        @FindBy(xpath = "//label[text()='Receiving Info:']//parent::td//following-sibling::td")
        public WebElement label_ReceivingInfoValue;

        @FindBy(xpath = "//label[text()='Voided Date:']")
        WebElement label_voidedDate;

        @FindBy(xpath = "//label[text()='Closed Date:']")
        WebElement label_closedDate;

        @FindBy(xpath = "//span[text()='Parts PO']")
        WebElement label_partsPo;

        @FindBy(xpath = "//label[text()='Parts:']")
        WebElement label_parts;

        @FindBy(xpath = "//label[text()='Parts:']/following::td[4]/span")
        WebElement txt_partsPrice;

        @FindBy(xpath = "(//label[text()='Added Cost:'])[2]")
        WebElement label_addedCost;


        @FindBy(xpath = "(//label[text()='Added Cost:'])[2]/following::span[2]")
        WebElement txt_addedCost;

        @FindBy(xpath = "(//label[text()='Sub Total:'])[2]")
        WebElement label_subTotal;

        @FindBy(xpath = "(//label[text()='Sub Total:'])[2]/following::td[4]/span")
        WebElement txt_subTotal;

        @FindBy(xpath = "(//label[text()='Taxes:'])[2]")
        WebElement label_taxes;

        @FindBy(xpath = "(//label[text()='Taxes:'])[2]/following::span[2]")
        WebElement txt_taxesPrice;

        @FindBy(xpath = "//label[text()='Total:']")
        WebElement label_total;

        @FindBy(xpath = "//label[text()='Total:']/following::td[4]/span")
        WebElement txt_totalPrice;

        @FindBy(xpath = "//span[text()='Part #']")
        WebElement label_partsHash;

        @FindBy(xpath = "//span[text()='Vendor Part #']")
        WebElement label_vendorPart;

        @FindBy(xpath = "//span[text()='Description']")
        WebElement label_description;

        @FindBy(xpath = "//span[text()='Order Quantity']")
        WebElement label_orderQuantity;

        @FindBy(xpath = "//span[text()='UOM']")
        WebElement label_UOM;

        @FindBy(xpath = "//span[text()='Stock UOM']")
        WebElement label_StockUOM;

        @FindBy(xpath = "//span[text()='Conv']")
        WebElement label_conv;

        @FindBy(xpath = "//span[text()='Unit Cost']")
        WebElement label_UnitCost;

        @FindBy(xpath = "//span[text()='Core']")
        WebElement label_core;

        @FindBy(xpath = "//span[text()='Extended Cost']")
        WebElement label_extendedCost;

        @FindBy(xpath = "//span[contains(.,'Link/Delink Lab')]")
        public WebElement label_LinkDeLink;

        @FindBy(xpath = "(//span[text()='Cancel'])[1]")
        public WebElement txt_Cancel;

        @FindBy(xpath = "//div[contains(@id,'t1_itms:0:cb120')]/a/span")
        public WebElement btn_Cancel;

        @FindBy(xpath = "(//span[text()='Link'])[1]")
        public  WebElement label_Link;

        @FindBy(xpath = "//div[text()='Link Part to RO Activity or Counter Sale']")
        public  WebElement label_LinkPartToRO;

        @FindBy(xpath = "//label[text()='Part #:']")
        WebElement label_part2;

        @FindBy(xpath = "//label[text()='Part #:']/following::td[1]")
        WebElement txt_FullPartNumber;

        @FindBy(xpath = "//label[text()='Part #:']/following::input[1]")
        WebElement radio_repairOrderAct;

        @FindBy(xpath = "//label[text()='Repair Order Activity']")
        WebElement label_repairOrderAct;

        @FindBy(xpath = "//label[contains(.,'Counter Sale')]//preceding-sibling::input")
        public WebElement radio_Countersale;

        @FindBy(xpath = "//label[contains(.,'Counter Sale')]")
        public  WebElement label_CounterSale;

        @FindBy(xpath = "(//label[text()='Search:'])[2]")
        public WebElement label_Search;

        @FindBy(xpath = "//span[text()='RO Number']")
        public WebElement label_RoNumber;

        @FindBy(xpath = "//span[text()='RO Date']")
        public  WebElement label_RoDate;

        @FindBy(xpath = "//span[text()='Unit #']")
        public  WebElement label_Unit;

        @FindBy(xpath = "//span[text()='Unit #']/following::span[1]")
        public  WebElement label_description1;

        @FindBy(xpath = "//span[text()='Customer Name']")
        public  WebElement label_customername;

        @FindBy(xpath = "//span[text()='#']")
        public WebElement label_hash;

        @FindBy(xpath = "//span[text()='VMRS']")
        public WebElement label_VMRS;

        @FindBy(xpath = "//span[text()='VMRS']/following::span[1]")
        public WebElement label_description3;

        @FindBy(xpath = "//span[text()='VMRS']/following::th[2]/div")
        public  WebElement label_selectColumn1;

        @FindBy(xpath = "//span[text()='VMRS']/following::a[3]/span")
        public  WebElement label_select1;

        @FindBy(xpath = "//label[contains(.,'Counter Sale')]//preceding-sibling::input")
        public WebElement radio_CounterSale;

        @FindBy(xpath = "//span[text()='Open Counter Sale #']")
        public WebElement label_openCounterSale;

        @FindBy(xpath = "(//span[text()='Date'])[2]")
        public WebElement label_Date2;
        @FindBy(xpath = "//span[text()='Customer']")
        public  WebElement label_customer;

        @FindBy(xpath = "//span[text()='Open Counter Sale #']/following::th[3]/div")
        public  WebElement label_select2;

        @FindBy(xpath = "//label[text()='Counter Sale']/following::span[text()='Cancel'][1]")
        public WebElement btn_cancleLinkPartRoSale;

        @FindBy(xpath = "//span[contains(.,'Receive Parts')]")
        public WebElement label_ReceiveParts;

        @FindBy(xpath = "//span[text()='Change Preferred Vendor']")
        public WebElement Btn_ChangePreferredVendor;

        @FindBy(xpath = "//span[text()='Select All']")
        public WebElement btn_SelectAll;

        @FindBy(xpath = "//span[contains(.,'Change Selected')]")
        public WebElement btn_ChangeSelected;

        @FindBy(xpath = "(//span[text()='Receive Parts'])[2]")
        public WebElement btn_ReceivePartsButton;

        @FindBy(xpath = "(//label[text()='Invoice Number:']/following::input)[1]")
        public  WebElement txt_invoiceNumber;

        @FindBy(xpath = "//input[contains(@id,':id1::content')]")
        public WebElement label_InvoiceDateTextArea;

        @FindBy(xpath = "//input[contains(@id,':id2::content')]")
        public WebElement label_DueDateTextArea;



        @FindBy(xpath = "//label[text()='Invoice Number:']/following::a[7]/span")
        public WebElement btn_receiveParts2;

        @FindBy(xpath = "//div[contains(@id,':0:cbClose')]//a//span[text()='Cancel']")
        public WebElement btn_CancelButton;

//        @FindBy(xpath = "//span[text()='Sign Out']")
         @FindBy(xpath = "(//span[contains(@id,'si1')]/following::td)[4]")
        public  WebElement btn_signOut;

        @FindBy(xpath = "//input[@name='username']")
        public WebElement inputbox_Username;

        @FindBy(xpath = "//h1[text()='Working...Please Wait']")
        List<WebElement> loder;

    @FindBy(xpath = "//a[text()='Parts']")
    WebElement Parts;

    @FindBy(xpath = "//td[text()='Receive Parts']")
    WebElement ReceiveParts;

       public ReceivePart(WebDriver driver){
           this.driver = driver;
           this.waitMethods = new WaitMethods(driver);

       }


        /**goto Receive Parts*/

         public  void gotoReceiveParts() throws FileNotFoundException, InterruptedException {
//            ReusableActions.getActions().clickParentMenu("Parts");
//            ReusableActions.getActions().clickChildMenu("Receive Parts");

             waitMethods.waitForElementToBeRefreshedAndClickable(Parts);
             WebElementActions.getActions(driver).clickElement(Parts);

             waitMethods.waitForElementToBeRefreshedAndClickable(ReceiveParts);
             WebElementActions.getActions(driver).clickElement(ReceiveParts);

             waitMethods.loadingWait(loder);
            TestListener.saveScreenshotPNG(driver);

        }
        /**click On PO Number */
         public void clickOnPONumber () throws InterruptedException {

             waitMethods.waitForElementToBeRefreshedAndClickable(label_PONumber);
            WebElementActions.getActions(driver).clickElement(label_PONumber);
      //      Thread.sleep(5000);
             waitMethods.loadingWait(loder);

        }
        /**verify Link/DeLink Labor */
         public void  verifyLinkDelinkLabor() throws InterruptedException {

             waitMethods.waitForElementToBeRefreshedAndIsVisible(label_label_LinkDeLinkLabor);
            Assert.assertTrue(label_label_LinkDeLinkLabor.isDisplayed());
        }
        /**verify Purches Order*/
         public void verifyPurchesOrder () throws InterruptedException {
             waitMethods.waitForElementToBeRefreshedAndIsVisible(label_PurchesOrder);
            Assert.assertTrue(label_PurchesOrder.isDisplayed());

        }
        /**verify Required Location */
        public void verifyReuiredLocation () throws InterruptedException {
            waitMethods.waitForElementToBeRefreshedAndIsVisible(label_RequiredLocation);
            Assert.assertTrue(label_RequiredLocation.isDisplayed());
        }
        /**verify Location */
         public void verifyLocation () throws InterruptedException {
             waitMethods.waitForElementToBeRefreshedAndIsVisible(label_Location);
            Assert.assertTrue(label_Location.isDisplayed());

        }
        /**verify Location Value */
         public void verifyLocationValue () throws InterruptedException {
             waitMethods.waitForElementToBeRefreshedAndIsVisible(label_LocationValue);
            Assert.assertTrue(label_LocationValue.isDisplayed());

        }
        /**verify Required Vendor */
         public void verifyRequiredVendor () throws InterruptedException {
             waitMethods.waitForElementToBeRefreshedAndIsVisible(label_RequiredVendor);
            Assert.assertTrue(label_RequiredVendor.isDisplayed());
        }
        /**verify Vendor */
         public void verifyVendor () throws InterruptedException {

             waitMethods.waitForElementToBeRefreshedAndIsVisible(label_Vendor);
            Assert.assertTrue(label_Vendor.isDisplayed());
        }

        /**verify Vendor Value*/
         public void verifyVendorValue () throws InterruptedException {
             waitMethods.waitForElementToBeRefreshedAndIsVisible(label_vendorvalue);
            Assert.assertTrue(label_vendorvalue.isDisplayed());

        }
        /**verify PO */
         public void verifyPO () throws InterruptedException {
             waitMethods.waitForElementToBeRefreshedAndIsVisible(label_PO);
            Assert.assertTrue(label_PO.isDisplayed());
        }
        /**verify PO Value */
         public void verifyPOValue () throws InterruptedException {
             waitMethods.waitForElementToBeRefreshedAndIsVisible(label_PoValue);
            Assert.assertTrue(label_PoValue.isDisplayed());
        }
        /**verify Referance */
         public void verifyRefernce () throws InterruptedException {
             waitMethods.waitForElementToBeRefreshedAndIsVisible(label_Refernce);
            Assert.assertTrue(label_Refernce.isDisplayed());
        }
        /**verify PO Date Text */
         public void verifyPODateText () throws InterruptedException {
             waitMethods.waitForElementToBeRefreshedAndIsVisible(label_PODate);
            Assert.assertTrue(label_PODate.isDisplayed());
        }
        /**verify Transport Priority */
         public void verifyTranspotPriority () throws InterruptedException {
             waitMethods.waitForElementToBeRefreshedAndIsVisible(label_TranspotPriority);
            Assert.assertTrue(label_TranspotPriority.isDisplayed());
        }
        public void verifyNotes () throws InterruptedException {
            waitMethods.waitForElementToBeRefreshedAndIsVisible(label_Notes);
            Assert.assertTrue(label_Notes.isDisplayed());
        }
        /**verify Icon */
         public void  verifyIcon () throws InterruptedException {

             waitMethods.waitForElementToBeRefreshedAndIsVisible(label_Icon);
            Assert.assertTrue(label_Icon.isDisplayed());
        }
        /**verify IMG Value */
         public void verifyImgValue () throws InterruptedException {
             waitMethods.waitForElementToBeRefreshedAndIsVisible(label_ImgValue);
            Assert.assertTrue(label_ImgValue.isDisplayed());
        }
        /**verify Ship From*/
         public void verifyShipFrom () throws InterruptedException {
             waitMethods.waitForElementToBeRefreshedAndIsVisible(label_ShipFrom);
            Assert.assertTrue(label_ShipFrom.isDisplayed());
        }
        /**verify Ship To*/
         public void verifyShipTo () throws InterruptedException {

             waitMethods.waitForElementToBeRefreshedAndIsVisible(label_ShipTo);
            Assert.assertTrue(label_ShipTo.isDisplayed());
        }
        /**verify Submitted Date*/
         public void verifySubmittedDate () throws InterruptedException {

             waitMethods.waitForElementToBeRefreshedAndIsVisible(label_SubmittedDate);
            Assert.assertTrue(label_SubmittedDate.isDisplayed());
        }
        /**verify Receiving Info*/
         public  void  verifyReceivingInfo () throws InterruptedException {

             waitMethods.waitForElementToBeRefreshedAndIsVisible(label_ReceivingInfo);
            Assert.assertTrue(label_ReceivingInfo.isDisplayed());
        }
        /**verify Receiving Info value */


        public void verifyReceivingInfoValue () throws InterruptedException {

            waitMethods.waitForElementToBeRefreshedAndIsVisible(label_ReceivingInfoValue);
            Assert.assertTrue(label_ReceivingInfoValue.isDisplayed());
        }
        /**verify void Date */
         public void verifyvoidedDate () throws InterruptedException {
             waitMethods.waitForElementToBeRefreshedAndIsVisible(label_voidedDate);
            Assert.assertTrue(label_voidedDate.isDisplayed());
        }
        /**verify Closed Date */
         public void verifyClosedDate () throws InterruptedException {
             waitMethods.waitForElementToBeRefreshedAndIsVisible(label_closedDate);
            Assert.assertTrue(label_closedDate.isDisplayed());

        }
        /**verify Parts PO */
         public void verifyPartsPO () throws InterruptedException {
             waitMethods.waitForElementToBeRefreshedAndIsVisible(label_partsPo);
            Assert.assertTrue(label_partsPo.isDisplayed());
        }
        /**verify Parts */
         public void verifyParts () throws InterruptedException {
             waitMethods.waitForElementToBeRefreshedAndIsVisible(label_parts);
            Assert.assertTrue(label_parts.isDisplayed());
        }
        /**verify Parts price */
         public void verifyPartsPrice () throws InterruptedException {
             waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_partsPrice);
            Assert.assertTrue(txt_partsPrice.isDisplayed());
        }
        /**verify Added Cost */
         public void verifyAddedCost () throws InterruptedException {

             waitMethods.waitForElementToBeRefreshedAndIsVisible(label_addedCost);
            Assert.assertTrue(label_addedCost.isDisplayed());
        }
        /**verify AddedCost*/
         public void verifyAddedCostValue () throws InterruptedException {

             waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_addedCost);
            Assert.assertTrue(txt_addedCost.isDisplayed());

        }
        /**verify SUb Total*/
         public void verifySubTotal () throws InterruptedException {

             waitMethods.waitForElementToBeRefreshedAndIsVisible(label_subTotal);
            Assert.assertTrue(label_subTotal.isDisplayed());

             waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_subTotal);
            Assert.assertTrue(txt_subTotal.isDisplayed());

        }
        /**verify Taxes and Taxes Price */
         public void verifyTaxes () throws InterruptedException {
             waitMethods.waitForElementToBeRefreshedAndIsVisible(label_taxes);
            Assert.assertTrue(label_taxes.isDisplayed());

             waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_taxesPrice);
            Assert.assertTrue(txt_taxesPrice.isDisplayed());

        }
        /**verify Total and Total Price */
         public void verifyTotal () throws InterruptedException {

             waitMethods.waitForElementToBeRefreshedAndIsVisible(label_total);
            Assert.assertTrue(label_total.isDisplayed());

             waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_totalPrice);
            Assert.assertTrue(txt_totalPrice.isDisplayed());

        }
        /**verify Part Hash */
         public void verifyPartsHash () throws InterruptedException {

             waitMethods.waitForElementToBeRefreshedAndIsVisible(label_partsHash);
            Assert.assertTrue(label_partsHash.isDisplayed());

        }
        /**verify Vendor Part*/
         public void verifyVendorPart () throws InterruptedException {

             waitMethods.waitForElementToBeRefreshedAndIsVisible(label_vendorPart);
            Assert.assertTrue(label_vendorPart.isDisplayed());
        }
        /**verify Description */
         public void  verifyDescription () throws InterruptedException {

             waitMethods.waitForElementToBeRefreshedAndIsVisible(label_description);
            Assert.assertTrue(label_description.isDisplayed());
        }
        /**verify Order Quantity */
        public void verifyOrderQuantity () throws InterruptedException {
            waitMethods.waitForElementToBeRefreshedAndIsVisible(label_orderQuantity);
            Assert.assertTrue(label_orderQuantity.isDisplayed());
        }
        /**verify UOM */
         public void verifyUOM () throws InterruptedException {

             waitMethods.waitForElementToBeRefreshedAndIsVisible(label_UOM);
            Assert.assertTrue(label_UOM.isDisplayed());
        }
        /**verify Stock UOM */
         public void verifyStockUOM () throws InterruptedException {

             waitMethods.waitForElementToBeRefreshedAndIsVisible(label_StockUOM);
            Assert.assertTrue(label_StockUOM.isDisplayed());
        }
        /**verify Conv*/
         public void verifyConv() throws InterruptedException {
             waitMethods.waitForElementToBeRefreshedAndIsVisible(label_conv);
            Assert.assertTrue(label_conv.isDisplayed());
        }
        /**verify Unit Cost */
         public void verifyUnitCost () throws InterruptedException {
             waitMethods.waitForElementToBeRefreshedAndIsVisible(label_UnitCost);
            Assert.assertTrue(label_UnitCost.isDisplayed());
        }
        /**verify Core  */
         public void verifyCore () throws InterruptedException {
             waitMethods.waitForElementToBeRefreshedAndIsVisible(label_core);
            Assert.assertTrue(label_core.isDisplayed());
        }
        /** verify Extended Cost */
         public void  verifyExtendedCost () throws InterruptedException {
             waitMethods.waitForElementToBeRefreshedAndIsVisible(label_extendedCost);
            Assert.assertTrue(label_extendedCost.isDisplayed());
        }
        /**verify Link/DELink */
         public void verifyLinkDeLink () throws InterruptedException {
             waitMethods.waitForElementToBeRefreshedAndIsVisible(label_LinkDeLink);
            Assert.assertTrue(label_LinkDeLink.isDisplayed());
        }
        /**verify Cancel */
         public void verifyCancel () throws InterruptedException {

             waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_Cancel);
            Assert.assertTrue(txt_Cancel.isDisplayed());
        }
        /**verify Cancel Button */
         public void verifyButtonCancel () throws InterruptedException {

             waitMethods.waitForElementToBeRefreshedAndIsVisible(btn_Cancel);
            Assert.assertTrue(btn_Cancel.isDisplayed());
        }
        /**verify Link */
         public void verifyLink() throws InterruptedException {

             waitMethods.waitForElementToBeRefreshedAndIsVisible(label_Link);
            Assert.assertTrue(label_Link.isDisplayed());
             waitMethods.loadingWait(loder);
        }
        /**click On Link Button */
         public void clickOnLinkButton () throws InterruptedException {

             waitMethods.waitForElementToBeRefreshedAndClickable(label_Link);
            WebElementActions.getActions(driver).clickElement(label_Link);
        }
        /**verify Link Part To RO */
         public void verifyLinkPartToRO () throws InterruptedException {
             waitMethods.waitForElementToBeRefreshedAndIsVisible(label_LinkPartToRO);
            Assert.assertTrue(label_LinkPartToRO.isDisplayed());

        }
        /**verify Part 2*/
         public void verifyPartTwo() throws InterruptedException {
             waitMethods.waitForElementToBeRefreshedAndIsVisible(label_part2);
            Assert.assertTrue(label_part2.isDisplayed());
        }
        /**verify Full Part Number */
         public void verifyFullPartNumber () throws InterruptedException {
             waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_FullPartNumber);
            Assert.assertTrue(txt_FullPartNumber.isDisplayed());
        }
        /**verify  Radio Repair Order Act  */
         public void verifyRepairOrderAct () throws InterruptedException {
             waitMethods.waitForElementToBeRefreshedAndIsVisible(radio_repairOrderAct);
            Assert.assertTrue(radio_repairOrderAct.isDisplayed());

             waitMethods.waitForElementToBeRefreshedAndIsVisible(label_repairOrderAct);
            Assert.assertTrue(label_repairOrderAct.isDisplayed());

        }
        /**verify Counter Sale */
         public void verifyCountersale () throws InterruptedException {

             waitMethods.waitForElementToBeRefreshedAndIsVisible(radio_Countersale);
            Assert.assertTrue(radio_Countersale.isDisplayed());

             waitMethods.waitForElementToBeRefreshedAndIsVisible(label_CounterSale);
            Assert.assertTrue(label_CounterSale.isDisplayed());

        }
        /**verify Search */
        public void verifySearch () throws InterruptedException {

            waitMethods.waitForElementToBeRefreshedAndIsVisible(label_Search);
            Assert.assertTrue(label_Search.isDisplayed());
        }
        /**verify RO Number */
         public void verifyRoNumber () throws InterruptedException {
             waitMethods.waitForElementToBeRefreshedAndIsVisible(label_RoNumber);
            Assert.assertTrue(label_RoNumber.isDisplayed());
        }
        /**verify RO Date */
         public void verifyRoDate () throws InterruptedException {

             waitMethods.waitForElementToBeRefreshedAndIsVisible(label_RoDate);
            Assert.assertTrue(label_RoDate.isDisplayed());
        }
        /**verify Unit */
         public void  verifyUnit () throws InterruptedException {
             waitMethods.waitForElementToBeRefreshedAndIsVisible(label_Unit);
            Assert.assertTrue(label_Unit.isDisplayed());
        }
        /** verify Description  */
         public void verifyDescriptionone () throws InterruptedException {

             waitMethods.waitForElementToBeRefreshedAndIsVisible(label_description1);
            Assert.assertTrue(label_description1.isDisplayed());
        }
        /**verify Customer Name */
         public void verifyCustomerName () throws InterruptedException {

             waitMethods.waitForElementToBeRefreshedAndIsVisible(label_customername);
            Assert.assertTrue(label_customername.isDisplayed());
        }
        /**verify Hash */
         public void verifyHash () throws InterruptedException {

             waitMethods.waitForElementToBeRefreshedAndIsVisible(label_hash);
            Assert.assertTrue(label_hash.isDisplayed());
        }
        /**verify VMRS */
         public void verifyVMRS () throws InterruptedException {

             waitMethods.waitForElementToBeRefreshedAndIsVisible(label_VMRS);
            Assert.assertTrue(label_VMRS.isDisplayed());
        }
        /** verify Description  */
         public void verifyDescriptionThree () throws InterruptedException {

             waitMethods.waitForElementToBeRefreshedAndIsVisible(label_description3);
            Assert.assertTrue(label_description3.isDisplayed());
        }
        /**verify Select Colum*/
        public void verifySelectColumnOne () throws InterruptedException {
            waitMethods.waitForElementToBeRefreshedAndIsVisible(label_selectColumn1);
            Assert.assertTrue(label_selectColumn1.isDisplayed());
        }
        /**verify Select */
         public void verifySelectOne () throws InterruptedException {
             waitMethods.waitForElementToBeRefreshedAndIsVisible(label_select1);
            Assert.assertTrue(label_select1.isDisplayed());
        }
        /**Click On Counter Sale Radio */
         public void clickOnCounterSaleRadio () throws InterruptedException {
             waitMethods.waitForElementToBeRefreshedAndClickable(radio_CounterSale);
            WebElementActions.getActions(driver).clickElement(radio_CounterSale);
        }
        /**verify Counter sale */
         public void verifyOpenCounterSale () throws InterruptedException {

             waitMethods.waitForElementToBeRefreshedAndClickable(label_openCounterSale);
            Assert.assertTrue(label_openCounterSale.isDisplayed());
        }
        /**verify Date*/
         public void verifyDateTwo () throws InterruptedException {

             waitMethods.waitForElementToBeRefreshedAndClickable(label_Date2);
            Assert.assertTrue(label_Date2.isDisplayed());
        }
        /**verify Customer */
         public void verifyCustomer () throws InterruptedException {

             waitMethods.waitForElementToBeRefreshedAndClickable(label_customer);
            Assert.assertTrue(label_customer.isDisplayed());
            TestListener.saveScreenshotPNG(driver);
        }
        /**verify Select */
         public void verifySelectTwo () throws InterruptedException {

             waitMethods.waitForElementToBeRefreshedAndClickable(label_select2);
            WebElementActions.getActions(driver).clickElement(label_select2);
             waitMethods.loadingWait(loder);
            TestListener.saveScreenshotPNG(driver);
        }
        /**click On Cancel Button */
         public void clickOnCancelButton () throws InterruptedException {

             waitMethods.waitForElementToBeRefreshedAndClickable(btn_cancleLinkPartRoSale);
            WebElementActions.getActions(driver).clickElement(btn_cancleLinkPartRoSale);
             waitMethods.loadingWait(loder);
            TestListener.saveScreenshotPNG(driver);

        }
        /**click On Receive Parts */
         public void clickOnReceiveParts () throws InterruptedException {
             waitMethods.waitForElementToBeRefreshedAndClickable(label_ReceiveParts);
            WebElementActions.getActions(driver).clickElement(label_ReceiveParts);
             waitMethods.loadingWait(loder);
            TestListener.saveScreenshotPNG(driver);
        }
        /**Click On Change Preferred Vendor */
         public void clickOnChangePreferredVendor () throws InterruptedException {

             waitMethods.waitForElementToBeRefreshedAndClickable(Btn_ChangePreferredVendor);
            WebElementActions.getActions(driver).clickElement(Btn_ChangePreferredVendor);
             waitMethods.loadingWait(loder);
            TestListener.saveScreenshotPNG(driver);
        }
        /**click On Select All*/
         public void clickOnSelectAll () throws InterruptedException {

             waitMethods.waitForElementToBeRefreshedAndClickable(btn_SelectAll);
            WebElementActions.getActions(driver).clickElement(btn_SelectAll);
             waitMethods.loadingWait(loder);
            TestListener.saveScreenshotPNG(driver);
        }
        /**click On Change Select */
         public void clickOnChangeSelected () throws InterruptedException {

             waitMethods.waitForElementToBeRefreshedAndClickable(btn_ChangeSelected);
            WebElementActions.getActions(driver).clickElement(btn_ChangeSelected);
             waitMethods.loadingWait(loder);
            TestListener.saveScreenshotPNG(driver);
        }
        /**click On Receive Part Button */
         public void clickOnReceivePartsButton () throws InterruptedException {

             waitMethods.waitForElementToBeRefreshedAndClickable(btn_ReceivePartsButton);
            WebElementActions.getActions(driver).clickElement(btn_ReceivePartsButton);
             waitMethods.loadingWait(loder);
            TestListener.saveScreenshotPNG(driver);
        }
        /**click On Invoice Number */
         public void clickOnInvoiceNumber () throws InterruptedException {

             waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_invoiceNumber);
            String invoiceNum = String.valueOf(WebElementActions.getActions(driver).randomNumber(1000,10000000));
            WebElementActions.getActions(driver).inputText(txt_invoiceNumber,invoiceNum);
            if(LoginActions.environmentName.contains("EC")) {
                waitMethods.waitForElementToBeRefreshedAndIsVisible(label_InvoiceDateTextArea);
                WebElementActions.getActions(driver).inputText(label_InvoiceDateTextArea, appProp9.getProperty("InvoiceDate"));

                waitMethods.waitForElementToBeRefreshedAndIsVisible(label_DueDateTextArea);
                WebElementActions.getActions(driver).inputText(label_DueDateTextArea, appProp9.getProperty("DueDate"));
            }
             waitMethods.loadingWait(loder);
            TestListener.saveScreenshotPNG(driver);

        }
        /** click On Receive  Parts */
         public void clickOnReceivePartsTwo () throws InterruptedException {

             waitMethods.waitForElementToBeRefreshedAndClickable(btn_receiveParts2);
            WebElementActions.getActions(driver).clickElement(btn_receiveParts2);
             waitMethods.loadingWait(loder);
            TestListener.saveScreenshotPNG(driver);

        }
        /**click On Cancel Button */
         public void clickCancelButton () throws InterruptedException {
             waitMethods.waitForElementToBeRefreshedAndClickable(btn_CancelButton);
            WebElementActions.getActions(driver).clickElement(btn_CancelButton);
             waitMethods.loadingWait(loder);
            TestListener.saveScreenshotPNG(driver);
        }
        /**click On SignOut */
         public  void clickOnsignOut () throws InterruptedException {

             waitMethods.waitForElementToBeRefreshedAndClickable(btn_signOut);
            WebElementActions.getActions(driver).clickElement(btn_signOut);
             waitMethods.loadingWait(loder);
            TestListener.saveScreenshotPNG(driver);
        }
        /**click On UserName */
         public void clickOnUserName () throws InterruptedException {

             waitMethods.waitForElementToBeRefreshedAndClickable(inputbox_Username);
            WebElementActions.getActions(driver).clickElement(inputbox_Username);
        }


}




