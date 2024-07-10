  package tests.parts;

import actions.LoginActions;
import constants.SheetConstants;
import io.qameta.allure.Description;
import org.testng.annotations.Test;
import tests.TestDriverActions;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ReceiveParts extends TestDriverActions{

        @Test(priority = 0, description = "T_001_Login to the page and go to Receive Part screen ",enabled=true)
        @Description("Test Description: Login to the page and go to Receive Part screen ")
        public void T_001_gotoReceiveParts() throws IOException, InterruptedException {
            if(LoginActions.environmentName.contains("EC")) {
                loginPage.loginWithValidCredentials(appProp9.getProperty("username"),appProp9.getProperty("password"));
            }else if(LoginActions.environmentName.contains("EU")) {
                loginPage.loginWithValidCredentials(appProp27.getProperty("username"),appProp27.getProperty("password"));
            }else if(LoginActions.environmentName.contains("NA")) {
                loginPage.loginWithValidCredentials(appProp39.getProperty("username"),appProp39.getProperty("password"));
            }else if(LoginActions.environmentName.contains("QA")) {
                loginPage.loginWithValidCredentials(appProp.getProperty("username"),appProp.getProperty("password"));
            }

            receivepart.gotoReceiveParts();

        }

        @Test(priority = 1, description = "T_002_click on PO number and verify Link/DeLink Labor",enabled=true)
        @Description("Test Description : Click on PO number and Verify Link/DeLink Labor")
        public void T_002_clickOnPoNumber() throws FileNotFoundException, InterruptedException {
            receivepart.clickOnPONumber();
            receivepart.verifyLinkDelinkLabor();
        }

        @Test(priority = 2, description = "T_003_verify Purches Order ",enabled=true)
        @Description("Test Description :  verify Purches Order ")
        public void T_003_verifyPurchesOrder() throws FileNotFoundException, InterruptedException {
            receivepart.verifyPurchesOrder();
        }

        @Test(priority = 3,description="T_004_verify Reuired Location",enabled=true)
        @Description("Test Description - verify Reuired Location")
         public void T_004_verifyReuiredLocation() throws InterruptedException {
            receivepart.verifyReuiredLocation();
         }
        @Test(priority = 4,description="T_005_verify Location",enabled=true)
        @Description("Test Description - verify Location")
        public void T_005_verifyLocation() throws InterruptedException{
            receivepart.verifyLocation();
       }
        @Test(priority = 5,description="T_006_verify Location Value",enabled=true)
        @Description("Test Description - verify Location Value")
        public void T_006_verifyLocationValue() throws InterruptedException{
           receivepart.verifyLocationValue();
        }
        @Test(priority = 6,description="T_007_verify Required Vendor",enabled=true)
        @Description("Test Description - verify Required Vendor")
         public void T_007_verifyRequiredVendor() throws InterruptedException{
            receivepart.verifyRequiredVendor();
         }
        @Test(priority = 7,description="T_008_verify Vendor",enabled=true)
        @Description("Test Description - verify Vendor")
        public void T_008_verifyVendor() throws InterruptedException{
            receivepart.verifyVendor();
        }
        @Test(priority = 8,description="T_009_verify Vendor Value",enabled=true)
        @Description("Test Description - verify Vendor Value")
         public void T_009_verifyVendorValue() throws InterruptedException{
           receivepart.verifyVendorValue();
         }
        @Test(priority = 9,description="T_010_verify PO",enabled=true)
        @Description("Test Description - verify PO")
         public void T_010_verifyPO() throws InterruptedException{
             receivepart.verifyPO();
         }
        @Test(priority = 10,description="T_011_verify PO Value",enabled=true)
        @Description("Test Description - verify PO Value")
        public void T_011_verifyPOValue() throws InterruptedException{
            receivepart.verifyPOValue();
        }
        @Test(priority = 11,description="T_012_verify Refernce",enabled=true)
        @Description("Test Description - verify Refernce")
        public void T_012_verifyRefernce() throws InterruptedException{
           receivepart.verifyRefernce();
        }
        @Test(priority = 12,description="T_013_verify PO Date Text",enabled=true)
        @Description("Test Description - verify PO Date Text")
        public void T_013_verifyPODateText() throws InterruptedException{
            receivepart.verifyPODateText();
        }
        @Test(priority = 13,description="T_014_verify Transpot Priority",enabled=true)
        @Description("Test Description - verify Transpot Priority")
        public void T_014_verifyTranspotPriority() throws InterruptedException{
            receivepart.verifyTranspotPriority();
        }



        @Test(priority = 14, description = "T_015_verify Notes ",enabled=true)
        @Description("Test Description :verify Notes ")
        public void T_015_verifyNotes() throws FileNotFoundException, InterruptedException {
            receivepart.verifyNotes();
        }

        @Test(priority = 15,description="T_016_verify Icon",enabled=true)
        @Description("Test Description - verify Icon")
        public void T_016_verifyIcon() throws InterruptedException{
            receivepart.verifyIcon();
        }
        @Test(priority = 16,description="T_017_verify Img Value",enabled=true)
        @Description("Test Description - verify Img Value")
        public void T_017_verifyImgValue() throws InterruptedException{
            receivepart.verifyImgValue();
        }
        @Test(priority = 17,description="T_018_verify Ship From",enabled=true)
        @Description("Test Description - verify Ship From")
        public void T_018_verifyShipFrom() throws InterruptedException{
            receivepart.verifyShipFrom();
        }
        @Test(priority = 18,description="T_019_verify Ship To",enabled=true)
        @Description("Test Description - verify Ship To")
        public void T_019_verifyShipTo() throws InterruptedException{
            receivepart.verifyShipTo();
        }
        @Test(priority = 19,description="T_020_verify Submitted Date",enabled=true)
        @Description("Test Description - verify Submitted Date")
        public void T_020_verifySubmittedDate() throws InterruptedException{
           receivepart.verifySubmittedDate();
        }
        @Test(priority = 20,description="T_021_verify Receiving Info",enabled=true)
        @Description("Test Description - verify Receiving Info")
        public void T_021_verifyReceivingInfo() throws InterruptedException{
           receivepart.verifyReceivingInfo();
        }
        @Test(priority = 21,description="T_022_verify Receiving Info Value",enabled=true)
        @Description("Test Description - verify Receiving Info Value")
        public void T_022_verifyReceivingInfoValue() throws InterruptedException{
           receivepart.verifyReceivingInfoValue();
        }
        @Test(priority = 22, description = "T_023_verify Voided Date",enabled=true)
        @Description("Test Description :verify Voided Date ")
        public void T_023_verifyvoidedDate() throws FileNotFoundException, InterruptedException {
            receivepart.verifyvoidedDate();
        }
        @Test(priority = 23,description="T_024_verify Closed Date",enabled=true)
        @Description("Test Description - verify Closed Date")
        public void T_024_verifyClosedDate() throws InterruptedException{
            receivepart.verifyClosedDate();
        }
        @Test(priority = 24,description="T_025_verify Parts PO",enabled=true)
        @Description("Test Description - verify Parts PO")
        public void T_025_verifyPartsPO() throws InterruptedException{
            receivepart.verifyPartsPO();
        }
        @Test(priority = 25,description="T_026_verify Parts",enabled=true)
        @Description("Test Description - verify Parts")
        public void T_026_verifyParts() throws InterruptedException{
            receivepart.verifyParts();
        }
        @Test(priority = 26,description="T_027_verify Parts Price",enabled=true)
        @Description("Test Description - verify Parts Price")
        public void T_027_verifyPartsPrice() throws InterruptedException{
            receivepart.verifyPartsPrice();
        }
        @Test(priority = 27,description="T_028_verify Added Cost",enabled=true)
        @Description("Test Description - verify Added Cost")
         public void T_028_verifyAddedCost() throws InterruptedException{
            receivepart.verifyAddedCost();
         }
        @Test(priority = 28,description="T_029_verify Added Cost Value",enabled=true)
        @Description("Test Description - verify Added Cost Value")
         public void T_029_verifyAddedCostValue() throws InterruptedException{
              receivepart.verifyAddedCostValue();
         }
        @Test(priority = 29,description="T_030_verify SubTotal",enabled=true)
        @Description("Test Description - verify SubTotal")
        public void T_030_verifySubTotal() throws InterruptedException{
             receivepart.verifySubTotal();
        }
        @Test(priority = 30,description="T_031_verify Taxes",enabled=true)
        @Description("Test Description - verify Taxes")
        public void T_031_verifyTaxes() throws InterruptedException{
            receivepart.verifyTaxes();
        }
        @Test(priority = 31,description="T_032_verify Total",enabled=true)
        @Description("Test Description - verify Total")
        public void T_032_verifyTotal() throws InterruptedException{
            receivepart.verifyTotal();
        }
        @Test(priority = 32,description="T_033_verify Parts Hash",enabled=true)
        @Description("Test Description - verify Parts Hash")
        public void T_033_verifyPartsHash() throws InterruptedException{
             receivepart.verifyPartsHash();
        }

        @Test(priority = 33, description = "T_034_verify Vendor Part",enabled=true)
        @Description("Test Description :verify Vendor Part  ")
        public void T_034_verifyVendorPart() throws FileNotFoundException, InterruptedException {
            receivepart.verifyVendorPart();
        }

        @Test(priority = 34,description="T_035_verify Description",enabled=true)
        @Description("Test Description - verify Description")
        public void T_035_verifyDescription() throws InterruptedException{
            receivepart.verifyDescription();
        }
        @Test(priority = 35,description="T_036_verify Order Quantity",enabled=true)
        @Description("Test Description - verify Order Quantity")
         public void T_036_verifyOrderQuantity() throws InterruptedException{
            receivepart.verifyOrderQuantity();
        }
        @Test(priority = 36,description="T_037_verify UOM",enabled=true)
        @Description("Test Description - verify UOM")
        public void T_037_verifyUOM() throws InterruptedException{
            receivepart.verifyUOM();
        }
        @Test(priority = 37,description="T_038_verify Stock UOM",enabled=true)
        @Description("Test Description - verify Stock UOM")
        public void T_038_verifyStockUOM() throws InterruptedException{
            receivepart.verifyStockUOM();
        }
       @Test(priority = 38,description="T_039_verify Conv",enabled=true)
       @Description("Test Description - verify Conv")
       public void T_039_verifyConv() throws InterruptedException{
           receivepart.verifyConv();
       }
       @Test(priority = 39,description="T_040_verify Unit Cost",enabled=true)
       @Description("Test Description - verify Unit Cost")
       public void T_040_verifyUnitCost() throws InterruptedException{
           receivepart.verifyUnitCost();
       }
       @Test(priority = 40,description="T_041_verify Core",enabled=true)
       @Description("Test Description - verify Core")
       public void T_041_verifyCore() throws InterruptedException{
           receivepart.verifyCore();
       }
       @Test(priority = 41,description="T_042_verify Extended Cost",enabled=true)
       @Description("Test Description - verify Extended Cost")
       public void T_042_verifyExtendedCost() throws InterruptedException{
           receivepart.verifyExtendedCost();
        }
       @Test(priority = 42,description="T_043_verify Link DeLink",enabled=true)
       @Description("Test Description - verify Link DeLink")
       public void T_043_verifyLinkDeLink() throws InterruptedException{
        receivepart.verifyLinkDeLink();
       }
       @Test(priority = 43,description="T_044_verify Cancel",enabled=true)
       @Description("Test Description - verify Cancel")
       public void T_044_verifyCancel() throws InterruptedException{
          receivepart.verifyCancel();
       }
       @Test(priority = 44,description="T_045_verify Button Cancel",enabled=true)
       @Description("Test Description - verify Button Cancel")
       public void T_045_verifyButtonCancel() throws InterruptedException{
           receivepart.verifyButtonCancel();
       }

        @Test(priority = 45, description = "T_046_verify Link",enabled=true)
        @Description("Test Description :verify Vendor Link   ")
        public void T_046_verifyLink() throws FileNotFoundException, InterruptedException {
            receivepart.verifyLink();
        }

        @Test(priority = 46,description="T_047_click On Link Button",enabled=true)
        @Description("Test Description - click On Link Button")
        public void T_047_clickOnLinkButton() throws InterruptedException{
            receivepart.clickOnLinkButton();
         }
        @Test(priority = 47,description="T_048_verify Link Part To RO",enabled=true)
        @Description("Test Description - verify Link Part To RO")
        public void T_048_verifyLinkPartToRO() throws InterruptedException{
            receivepart.verifyLinkPartToRO();
        }
        @Test(priority = 48,description="T_049_verify Part Two",enabled=true)
        @Description("Test Description - verify Part Two")
        public void T_049_verifyPartTwo() throws InterruptedException{
            receivepart.verifyPartTwo();
        }
        @Test(priority = 49,description="T_050_verify Full Part Number",enabled=true)
        @Description("Test Description - verify Full Part Number")
        public void T_050_verifyFullPartNumber() throws InterruptedException{
            receivepart.verifyFullPartNumber();
        }
        @Test(priority = 50,description="T_051_verify Repair Order Act",enabled=true)
        @Description("Test Description - verify Repair Order Act")
        public void T_051_verifyRepairOrderAct() throws InterruptedException{
            receivepart.verifyRepairOrderAct();
        }
        @Test(priority = 51,description="T_052_verify Counter sale",enabled=true)
        @Description("Test Description - verify Counter sale")
        public void T_052_verifyCountersale() throws InterruptedException{
            receivepart.verifyCountersale();
        }
        @Test(priority = 52,description="T_053_verify Search",enabled=true)
        @Description("Test Description - verify Search")
        public void T_053_verifySearch() throws InterruptedException{
            receivepart.verifySearch();
        }
        @Test(priority = 53,description="T_054_verify Ro Number",enabled=true)
        @Description("Test Description - verify Ro Number")
         public void T_054_verifyRoNumber() throws InterruptedException{
            receivepart.verifyRoNumber();
        }
        @Test(priority = 54,description="T_055_verify Ro Date",enabled=true)
        @Description("Test Description - verify Ro Date")
         public void T_055_verifyRoDate() throws InterruptedException{
            receivepart.verifyRoDate();
        }
        @Test(priority = 55,description="T_056_verify Unit",enabled=true)
        @Description("Test Description - verify Unit")
         public void T_056_verifyUnit() throws InterruptedException{
            receivepart.verifyUnit();
        }
        @Test(priority = 56,description="T_057_verify Description one",enabled=true)
        @Description("Test Description - verify Description one")
        public void T_057_verifyDescriptionone() throws InterruptedException{
            receivepart.verifyDescriptionone();
        }
        @Test(priority = 57,description="T_058_verify Customer Name",enabled=true)
        @Description("Test Description - verify Customer Name")
        public void T_058_verifyCustomerName() throws InterruptedException{
            receivepart.verifyCustomerName();
        }

        @Test(priority = 58, description = "T_059_verify Hash ",enabled=true)
        @Description("Test Description :verify Vendor Hash  ")
        public void T_059_verifyHash () throws FileNotFoundException, InterruptedException {
            receivepart.verifyHash();
        }

         @Test(priority = 59,description="T_060_verify VMRS",enabled=true)
         @Description("Test Description - verify VMRS")
         public void T_060_verifyVMRS() throws InterruptedException{
           receivepart.verifyVMRS();
         }
         @Test(priority = 60,description="T_061_verify Description Three",enabled=true)
         @Description("Test Description - verify Description Three")
         public void T_061_verifyDescriptionThree() throws InterruptedException{
             receivepart.verifyDescriptionThree();
         }
         @Test(priority = 61,description="T_062_verify Select Column One",enabled=true)
         @Description("Test Description - verify Select Column One")
         public void T_062_verifySelectColumnOne() throws InterruptedException{
             receivepart.verifySelectColumnOne();
         }
         @Test(priority = 62,description="T_063_verify Select One",enabled=true)
         @Description("Test Description - verify Select One")
          public void T_063_verifySelectOne() throws InterruptedException{
             receivepart.verifySelectOne();
         }
         @Test(priority = 63,description="T_064_click On Counter Sale Radio",enabled=true)
         @Description("Test Description - click On Counter Sale Radio")
          public void T_064_clickOnCounterSaleRadio() throws InterruptedException{
             receivepart.clickOnCounterSaleRadio();
         }
         @Test(priority = 64,description="T_065_verify Open Counter Sale",enabled=true)
         @Description("Test Description - verify Open Counter Sale")
          public void T_065_verifyOpenCounterSale() throws InterruptedException{
             receivepart.verifyOpenCounterSale();
        }
         @Test(priority = 65,description="T_066_verify Date Two",enabled=true)
         @Description("Test Description - verify Date Two")
         public void T_066_verifyDateTwo() throws InterruptedException{
             receivepart.verifyDateTwo();
         }
         @Test(priority = 66,description="T_067_verify Customer",enabled=true)
         @Description("Test Description - verify Customer")
          public void T_067_verifyCustomer() throws InterruptedException{
             receivepart.verifyCustomer();
        }
         @Test(priority = 67,description="T_068_verify Select Two",enabled=true)
         @Description("Test Description - verify Select Two")
         public void T_068_verifySelectTwo() throws InterruptedException{
             receivepart.verifySelectTwo();
         }


        @Test(priority = 68, description = "T_069: click On Cancel Button ",enabled=true)
        @Description("Test Description : click On Cancel Button ")
        public void T_069_clickOnCancelButton () throws FileNotFoundException, InterruptedException {
            receivepart.clickOnCancelButton();
        }

        @Test(priority = 69,description="T_070_click On Receive Parts",enabled=true)
        @Description("Test Description - click On Receive Parts")
        public void T_070_clickOnReceiveParts() throws InterruptedException{
            receivepart.clickOnReceiveParts();
         }
        @Test(priority = 70,description="T_071_click On Change Preferred Vendor",enabled=true)
        @Description("Test Description - click On Change Preferred Vendor")
        public void T_071_clickOnChangePreferredVendor() throws InterruptedException{
            receivepart.clickOnChangePreferredVendor ();
        }
        @Test(priority = 71,description="T_072_click On Select All",enabled=true)
        @Description("Test Description - click On Select All")
        public void T_072_clickOnSelectAll() throws InterruptedException{
           receivepart.clickOnSelectAll();
        }
        @Test(priority = 72,description="T_073_click On Change Selected",enabled=true)
        @Description("Test Description - click On Change Selected")
        public void T_073_clickOnChangeSelected() throws InterruptedException{
           receivepart.clickOnChangeSelected();
        }
        @Test(priority = 73,description="T_074_click On Receive Parts Button",enabled=true)
        @Description("Test Description - click On Receive Parts Button")
        public void T_074_clickOnReceivePartsButton() throws InterruptedException{
        receivepart.clickOnReceivePartsButton ();
        //        receivepart.clickOnInvoiceNumber ();
         }
        @Test(priority = 74,description="T_075_click On Receive Parts Two",enabled=true)
        @Description("Test Description - click On Receive Parts Two")
        public void T_075_clickOnReceivePartsTwo() throws InterruptedException{
            receivepart.clickOnReceivePartsTwo();
        }
        @Test(priority = 75,description="T_076_click Cancel Button",enabled=true)
        @Description("Test Description - click Cancel Button")
        public void T_076_clickCancelButton() throws InterruptedException{
            receivepart.clickCancelButton();
        }
        @Test(priority = 76,description="T_077_click On signOut",enabled=true)
        @Description("Test Description - click On signOut")
        public void T_077_clickOnsignOut() throws InterruptedException{
            receivepart.clickOnsignOut ();
        }
        @Test(priority = 77,description="T_078_click On UserName",enabled=true)
        @Description("Test Description - click On UserName")
        public void T_078_clickOnUserName() throws InterruptedException{
            receivepart.clickOnUserName();
        }


    }





