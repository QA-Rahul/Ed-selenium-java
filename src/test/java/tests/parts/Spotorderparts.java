package tests.parts;


import actions.LoginActions;
import constants.SheetConstants;
import io.qameta.allure.Description;
import org.testng.annotations.Test;
import tests.TestDriverActions;

import java.io.FileNotFoundException;
import java.io.IOException;

import static org.apache.log4j.spi.LocationInfo.NA;
import static org.apache.poi.util.LocaleID.EU;
import static org.apache.xalan.xsltc.runtime.CallFunction.className;


public class Spotorderparts extends TestDriverActions {

    @Test(priority = 0, description = "T_001_Login to the page and go to Order Part screen ",enabled=true)
    @Description("Test Description= Login to the page and go to Order Part screen  ")
    public void Test_001_gotoOrderPartsScreen () throws IOException, InterruptedException {
        if(LoginActions.environmentName.contains("EC")) {
            loginPage.loginWithValidCredentials(appProp7.getProperty("username"), appProp7.getProperty("password"));
        }else if(LoginActions.environmentName.contains("EU")){
            loginPage.loginWithValidCredentials(appProp20.getProperty("username"), appProp20.getProperty("password"));
        } else if(LoginActions.environmentName.contains("NA")){
            loginPage.loginWithValidCredentials(appProp35.getProperty("username"), appProp35.getProperty("password"));
        } else if(LoginActions.environmentName.contains("QA")){
            loginPage.loginWithValidCredentials(appProp.getProperty("username"), appProp.getProperty("password"));
        }
         spotorderparts.gotoOrderPartsScreen ();

    }

    @Test(priority = 1, description = "T_002_click On The Spot order Tab ",enabled=true)
    @Description("Test Description= click On The Spot order Tab ")
    public void Test_002_clickOnSpotOrder() throws InterruptedException {
        spotorderparts.clickOnSpotOrder();
    }
    @Test(priority= 2,description="T_003_verify search text box",enabled=true)
    @Description("Test Description = verify search text box")
    public void T_003_verifySearchTextArea() throws InterruptedException{
        spotorderparts.verifySearchTextArea();
    }
    @Test(priority= 3,description="T_004_verify new part",enabled=true)
    @Description("Test Description = verify new part")
    public void T_004_verifyNewPart()  throws InterruptedException{
        spotorderparts.verifyNewPart();
    }
    @Test(priority= 4,description="T_005_verify order part",enabled=true)
    @Description("Test Description = verify order part")
    public void T_005_verifyOrderPart() throws InterruptedException{
        spotorderparts.verifyOrderPart();
    }
    @Test(priority= 5,description="T_006_verify Order List",enabled=true)
    @Description("Test Description = verify Order List")
    public void T_006_verifyOrderList() throws InterruptedException{
        spotorderparts.verifyOrderList();
    }
    @Test(priority= 6,description="T_007_verify Warehouse",enabled=true)
    @Description("Test Description = verify Warehouse")
    public void T_007_verifyWarehouse() throws InterruptedException{
        spotorderparts.verifyWarehouse();
    }
    @Test(priority= 7,description="T_008_verify Total Text",enabled=true)
    @Description("Test Description = verify Total Text")
    public void T_008_verifyTotalText() throws InterruptedException{
        spotorderparts.verifyTotalText ();
    }
    @Test(priority= 8,description="T_009_verify Refresh Text",enabled=true)
    @Description("Test Description = verify Refresh Text")
    public void T_009_verifyRefreshText() throws InterruptedException{
        spotorderparts.verifyRefreshText();
    }
    @Test(priority= 9,description="T_010_verify Text Part",enabled=true)
    @Description("Test Description = verify Text Part")
    public void T_010_verifyTextPart() throws InterruptedException{
        spotorderparts.verifyTextPart ();
    }
    @Test(priority= 10,description="T_011_verify Text UOM",enabled=true)
    @Description("Test Description = verify Text UOM")
    public void T_011_verifyTextUOM() throws InterruptedException{
        spotorderparts.verifyTextUOM();
    }
    @Test(priority= 11,description="T_012_verify Quantity",enabled=true)
    @Description("Test Description = verify Quantity")
    public void T_012_verifyQuantity() throws InterruptedException{
        spotorderparts.verifyQuantity();
    }
    @Test(priority= 12,description="T_013_verify Extended",enabled=true)
    @Description("Test Description = verify Extended")
    public void T_013_verifyExtended() throws InterruptedException{
        spotorderparts.verifyExtended();
    }
    @Test(priority= 13,description="T_014_verify Please Add Part",enabled=true)
    @Description("Test Description = verify Please Add Part")
    public void T_014_verifyPleaseAddPart() throws InterruptedException{
        spotorderparts.verifyPleaseAddPart();
    }

    @Test(priority = 14, description = "T_015  input Partial Part Number ",enabled=true)
    @Description("Test Description:verify input Partial Part Number ")
    public void T_015_inputPartialPartNumber() throws  InterruptedException {
        spotorderparts.inputPartialPartNumber();
    }

    @Test(priority=15 ,description="T_016_verify Full Part Number",enabled=true)
    @Description("Test Description = verify Full Part Number")
    public void T_015_verifyFullPartNumber() throws InterruptedException{
        spotorderparts.verifyFullPartNumber();
    }
    @Test(priority= 16 ,description="T_017_verify Order Part Description",enabled=true)
    @Description("Test Description = verify Order Part Description")
    public void T_017_verifyOrderPArtDescription() throws InterruptedException{
        spotorderparts.verifyOrderPArtDescription();
    }
    @Test(priority= 17 ,description="T_018_verifyPartText",enabled=true)
    @Description("Test Description = verify Part Text")
    public void T_018_verifyPartText() throws InterruptedException{
        spotorderparts.verifyPartText();
    }
    @Test(priority= 18 ,description="T_019_verify Price",enabled=true)
    @Description("Test Description = verify Price")
    public void T_019_verifyPrice() throws InterruptedException{
        spotorderparts.verifyPrice();
    }
    @Test(priority= 19 ,description="T_020_verify In Stock",enabled=true)
    @Description("Test Description = verify In Stock")
    public void T_020_verifyInStock() throws InterruptedException{
        spotorderparts.verifyInStock();
    }
    @Test(priority= 20,description="T_021_verify Notes",enabled=true)
    @Description("Test Description = verify Notes")
    public void T_021_verifyNotes() throws InterruptedException{
        spotorderparts.verifyNotes();
    }
    @Test(priority= 21,description="T_022_verifyValue",enabled=true)
    @Description("Test Description = verify Value")
    public void T_022_verifyValue() throws InterruptedException{
        spotorderparts.verifyValue ();
    }


    @Test(priority = 22, description = "T_023_click On Add Button ",enabled=true)
    @Description("Test Description:  click On Add Button ")
    public void T_023_clickOnAddButton() throws InterruptedException {
        spotorderparts.clickOnAddButton();

    }
    @Test(priority= 23,description="T_024_verify Order part Description",enabled=true)
    @Description("Test Description = verify Order part Description")
    public void T_024_verifyOrderpartDescription() throws InterruptedException{
        spotorderparts.verifyOrderpartDescription();
    }
    @Test(priority= 24 ,description="T_025_verify FuLL Part Number",enabled=true)
    @Description("Test Description = verify FuLL Part Number")
    public void T_025_verifyFuLLPartNumber() throws InterruptedException{
        spotorderparts.verifyFuLLPartNumber();
    }
    @Test(priority= 25,description="T_026_verify Qauntity Value",enabled=true)
    @Description("Test Description = verify Qauntity Value")
    public void T_026_verifyQauntityValue() throws InterruptedException{
        spotorderparts.verifyQauntityValue();
    }
    @Test(priority= 26 ,description="T_027_verify order price",enabled=true)
    @Description("Test Description = verify order price")
    public void T_027_verifyorderprice() throws InterruptedException{
        spotorderparts.verifyorderprice();
    }
    @Test(priority= 27,description="T_028_verify Total Order",enabled=true)
    @Description("Test Description = verify Total Order")
    public void T_028_verifyTotalOrder() throws InterruptedException{
        spotorderparts.verifyTotalOrder();
    }
    @Test(priority= 28 ,description="T_029_input Part Name WrenchWheel brace",enabled=true)
    @Description("Test Description = input Part Name WrenchWheel brace")
    public void T_029_inputPartNameWrenchWheelbrace() throws InterruptedException{
        spotorderparts.inputPartNameWrenchWheelbrace();
    }
    @Test(priority= 30,description="T_031_select Part Description Dropdown",enabled=true)
    @Description("Test Description = select Part Description Dropdown")
    public void T_031_selectPartDescriptionDropdown() throws InterruptedException{
        spotorderparts.selectPartDescriptionDropdown();
    }
    @Test(priority= 31 ,description="T_032_click On Add",enabled=true)
    @Description("Test Description = click On Add")
    public void T_032_clickOnAdd() throws InterruptedException{
        spotorderparts.clickOnAdd();
    }

    @Test(priority = 32, description = "T_033_verify Search Part Description ",enabled=true)
    @Description("Test Description:  verify Search Part Description  ")
    public void T_033_verifySearchPartDescription() throws FileNotFoundException, InterruptedException {
        spotorderparts.verifySearchPartDescription();

    }
    @Test(priority= 33,description="T_034_verify Search Part Description Number",enabled=true)
    @Description("Test Description = verify Search Part Description Number")
    public void T_034_verifySearchPartDescriptionNumber() throws InterruptedException{
        spotorderparts.verifySearchPartDescriptionNumber();
    }
    @Test(priority= 34 ,description="T_035_verify price Order",enabled=true)
    @Description("Test Description = verify price Order")
    public void T_035_verifypriceOrder() throws InterruptedException{
        spotorderparts.verifypriceOrder();
    }
    @Test(priority= 35,description="T_036_verify Part Price",enabled=true)
    @Description("Test Description = verify Part Price")
    public void T_036_verifyPartPrice() throws InterruptedException{
        spotorderparts.verifyPartPrice();
    }
    @Test(priority= 36 ,description="T_037_verify Total Order Price",enabled=true)
    @Description("Test Description = verify Total Order Price")
    public void T_037_verifyTotalOrderPrice() throws InterruptedException{
        spotorderparts.verifyTotalOrderPrice();
    }
    @Test(priority= 37,description="T_038_verify Part Price Two",enabled=true)
    @Description("Test Description = verify Part Price Two")
    public void T_038_verifyPartPriceTwo() throws InterruptedException{
        spotorderparts.verifyPartPriceTwo();
    }
    @Test(priority= 38 ,description="T_039_verify price Order",enabled=true)
    @Description("Test Description = verify price Order")
    public void T_039_verifypriceOrder() throws InterruptedException{
        spotorderparts.verifypriceOrder();
    }
    @Test(priority= 39,description="T_040_Select Exact Part",enabled=true)
    @Description("Test Description = Select Exact Part")
    public void T_040_SelectExactPart() throws InterruptedException{
        spotorderparts.SelectExactPart();
    }
    @Test(priority= 40 ,description="T_041_Input Full Part Number",enabled=true)
    @Description("Test Description = Input Full Part Number")
    public void T_041_InputFullPartNumber() throws InterruptedException{
        spotorderparts.InputFullPartNumber();
    }
    @Test(priority= 41,description="T_042_verify Value Two",enabled=true)
    @Description("Test Description = verify Value Two")
    public void T_042_verifyValueTwo() throws InterruptedException{
        spotorderparts. verifyValueTwo();
    }
    @Test(priority= 42 ,description="T_043_input Quantity Value",enabled=true)
    @Description("Test Description = input Quantity Value")
    public void T_043_inputQuantityValue() throws InterruptedException{
        spotorderparts.inputQuantityValue();
    } @Test(priority= 43,description="T_044_click On Incerement",enabled=true)
    @Description("Test Description = click On Incerement")
    public void T_044_clickOnIncerement() throws InterruptedException{
        spotorderparts.clickOnIncerement();
    }
    @Test(priority= 44 ,description="T_045_click On Decrement",enabled=true)
    @Description("Test Description = click On Decrement")
    public void T_045_clickOnDecrement() throws InterruptedException{
        spotorderparts.clickOnDecrement();
    } @Test(priority= 45,description="T_046_click On Add button",enabled=true)
    @Description("Test Description = click On Add button")
    public void T_046_clickOnAddbutton() throws InterruptedException{
        spotorderparts. clickOnAddbutton();
    }
    @Test(priority= 46 ,description="T_047_verify On Value Three",enabled=true)
    @Description("Test Description = verify On Value Three")
    public void T_047_verifyOnValueThree() throws InterruptedException{
        spotorderparts.verifyOnValueThree ();
    }
    @Test(priority= 47 ,description="T_048_verify Calculated Order Total",enabled=true)
    @Description("Test Description = verify Calculated Order Total")
    public void T_048_verifyCalculatedOrderTotal() throws InterruptedException{
        spotorderparts.verifyCalculatedOrderTotal ();
    }
    @Test(priority= 48 ,description="T_049_click On label Part Quantity",enabled=true)
    @Description("Test Description = click On label Part Quantity")
    public void T_049_clickOnlabelPartQuantity() throws InterruptedException{
        spotorderparts.clickOnlabelPartQuantity();
    }
    @Test(priority = 49, description = "T_050 input Core Parent Part and sign out ",enabled=true)
    @Description("Test Description: input Core Parent Part and sign out ")
    public void T_050_inputCoreParentPart() throws FileNotFoundException, InterruptedException {
        spotorderparts.inputCoreParentPart();
    }

    @Test(priority= 50 ,description="T_051_verify Add Button",enabled=true)
    @Description("Test Description = verify Add Button")
    public void T_051_verifyAddButton() throws InterruptedException{
        spotorderparts.verifyAddButton();
    }
    @Test(priority= 51 ,description="T_052_verify Core Parent part",enabled=true)
    @Description("Test Description = verify Core Parent part")
    public void T_052_verifyCoreParentpart() throws InterruptedException{
        spotorderparts.verifyCoreParentpart();
    }
    @Test(priority= 52 ,description="T_053_verify Child Part",enabled=true)
    @Description("Test Description = verify Child Part")
    public void T_053_verifyChildPart() throws InterruptedException{
        spotorderparts.verifyChildPart();
    }
    @Test(priority= 53 ,description="T_054_verify Store Text Order Total",enabled=true)
    @Description("Test Description = verify Store Text Order Total")
    public void T_054_verifyStoreTextOrderTotal() throws InterruptedException{
        spotorderparts.verifyStoreTextOrderTotal();
    }
    @Test(priority= 54 ,description="T_055_click On Issue PO",enabled=true)
    @Description("Test Description = click On Issue PO")
    public void T_055_clickOnIssuePO() throws InterruptedException{
        spotorderparts.clickOnIssuePO();
    }
    @Test(priority= 55 ,description="T_056_verify On Issue PO",enabled=true)
    @Description("Test Description = verify On Issue PO")
    public void T_056_verifyOnIssuePO() throws InterruptedException{
        spotorderparts.verifyOnIssuePO();
    }
    @Test(priority= 56 ,description="T_057_verify Vendor Name",enabled=true)
    @Description("Test Description = verify Vendor Name")
    public void T_057_verifyVendorName() throws InterruptedException{
        spotorderparts.verifyVendorName();
    }
    @Test(priority= 57 ,description="T_058_verify Amount",enabled=true)
    @Description("Test Description = verify Amount")
    public void T_058_verifyAmout() throws InterruptedException{
        spotorderparts.verifyAmout();
    }
    @Test(priority= 58 ,description="T_059_verify Cancel Element",enabled=true)
    @Description("Test Description = verify Cancel Element")
    public void T_059_verifyCancelElement() throws InterruptedException{
        spotorderparts.verifyCancelElement();
    }
    @Test(priority= 59 ,description="T_060_verify Part Vendor Name",enabled=true)
    @Description("Test Description = verify Part Vendor Name")
    public void T_060_verifyPartVendorName() throws InterruptedException{
        spotorderparts.verifyPartVendorName();
    }
    @Test(priority= 60 ,description="T_061_verify Order Total",enabled=true)
    @Description("Test Description = verify Order Total")
    public void T_061_verifyOrderTotal() throws InterruptedException{
        spotorderparts.verifyOrderTotal();
    }
    @Test(priority= 61 ,description="T_062_click On Issue PO Button",enabled=true)
    @Description("Test Description = click On Issue PO Button")
    public void T_062_clickOnIssuePOButton() throws InterruptedException{
        spotorderparts.clickOnIssuePOButton();
    }
    @Test(priority= 62 ,description="T_063_verify Purches Order",enabled=true)
    @Description("Test Description = verify Purches Order")
    public void T_063_verifyPurchesOrder() throws InterruptedException{
        spotorderparts.verifyPurchesOrder();
    }
    @Test(priority= 63 ,description="T_064_Required Location",enabled=true)
    @Description("Test Description = Required Location")
    public void T_064_RequiredLocation() throws InterruptedException{
        spotorderparts.RequiredLocation();
    }
    @Test(priority= 64 ,description="T_065_verify Required Vendor",enabled=true)
    @Description("Test Description = verify Required Vendor")
    public void T_065_verifyRequiredVendor() throws InterruptedException{
        spotorderparts.verifyRequiredVendor();
    }

    @Test(priority = 65, description = "T_066_verify PO ",enabled=true)
        @Description("Test Description: verify PO ")
        public void T_066_verifyPO () throws FileNotFoundException, InterruptedException {
            spotorderparts.verifyPO();
        }
    @Test(priority= 66 ,description="T_067_verify Referance",enabled=true)
    @Description("Test Description = verify Referance")
    public void T_067_verifyReferance() throws InterruptedException{
        spotorderparts.verifyReferance();
    }
    @Test(priority= 67 ,description="T_068_verify PO Date",enabled=true)
    @Description("Test Description = verify PO Date")
    public void T_068_verifyPODate() throws InterruptedException{
        spotorderparts.verifyPODate();
    }
    @Test(priority= 68 ,description="T_069_verify Transport Priority",enabled=true)
    @Description("Test Description = verify Transport Priority")
    public void T_069_verifyTransPOrtPriority() throws InterruptedException{
        spotorderparts.verifyTransPOrtPriority();
    }
    @Test(priority= 69 ,description="T_070_verify Notes Text Area",enabled=true)
    @Description("Test Description = verify Notes Text Area")
    public void T_070_verifyNotesTextArea() throws InterruptedException{
        spotorderparts.verifyNotesTextArea();
    }
    @Test(priority= 70 ,description="T_071_verify Ship Form",enabled=true)
    @Description("Test Description = verify Ship Form")
    public void T_071_verifyShipForm() throws InterruptedException{
        spotorderparts.verifyShipForm();
    }
    @Test(priority= 71 ,description="T_072verify Ship To",enabled=true)
    @Description("Test Description = verify Ship To")
    public void T_072_verifyShipTo() throws InterruptedException{
        spotorderparts.verifyShipTo();
    }
    @Test(priority= 72 ,description="T_073_verify Submitted Date",enabled=true)
    @Description("Test Description = verify Submitted Date")
    public void T_073_verifySubmittedDate() throws InterruptedException{
        spotorderparts.verifySubmittedDate();
    }
    @Test(priority= 73 ,description="T_074_verify Receiving Info",enabled=true)
    @Description("Test Description = verify Receiving Info")
    public void T_074_verifyReceivingInfo() throws InterruptedException{
        spotorderparts.verifyReceivingInfo();
    }
    @Test(priority= 74 ,description="T_075_verify Image Icon",enabled=true)
    @Description("Test Description = verify Image Icon")
    public void T_075_verifyImageIcon() throws InterruptedException{
        spotorderparts.verifyImageIcon();
    }
    @Test(priority= 75 ,description="T_076_verify Void Date",enabled=true)
    @Description("Test Description = verify Void Date")
    public void T_076_verifyVoidDate() throws InterruptedException{
        spotorderparts.verifyVoidDate();
    }
    @Test(priority= 76 ,description="T_077_verify Closed Date",enabled=true)
    @Description("Test Description = verify Closed Date")
    public void T_077_verifyClosedDate() throws InterruptedException{
        spotorderparts.verifyClosedDate();
    }
    @Test(priority= 77 ,description="T_078_verify Part",enabled=true)
    @Description("Test Description = verify Part")
    public void T_078_verifyPart() throws InterruptedException{
        spotorderparts.verifyPart();
    }
    @Test(priority= 78 ,description="T_079_verify Add Cost",enabled=true)
    @Description("Test Description = verify Add Cost")
    public void T_079_verifyAddCost() throws InterruptedException{
        spotorderparts.verifyAddCost();
    }
    @Test(priority= 79 ,description="T_080_verify Sub Total",enabled=true)
    @Description("Test Description = verify Sub Total")
    public void T_080_verifySubTotal() throws InterruptedException{
        spotorderparts.verifySubTotal();
    }
    @Test(priority= 80 ,description="T_081_verify Taxes",enabled=true)
    @Description("Test Description = verify Taxes")
    public void T_081_verifyTaxes() throws InterruptedException{
        spotorderparts.verifyTaxes();
    }
    @Test(priority= 81 ,description="T_082_verify Total",enabled=true)
    @Description("Test Description = verify Total")
    public void T_082_verifyTotal() throws InterruptedException{
        spotorderparts.verifyTotal();
    }
    @Test(priority = 82, description = "T_083_verify Required Part ",enabled=true)
    @Description("Test Description: verify Required Part ")
    public void T_083_verifyRequiredPart () throws InterruptedException {
        spotorderparts.verifyRequiredPart();
    }
    @Test(priority= 84 ,description="T_085_verify Search Icon",enabled=true)
    @Description("Test Description = verify Search Icon")
    public void T_085_verifySearchIcon() throws InterruptedException{
        spotorderparts.verifySearchIcon();
    }
    @Test(priority= 85 ,description="T_086_verify QTY",enabled=true)
    @Description("Test Description = verify QTY")
    public void T_086_verifyQTY() throws InterruptedException{
        spotorderparts.verifyQTY();
    }
    @Test(priority= 86 ,description="T_087_verify Add Part",enabled=true)
    @Description("Test Description = verify Add Part")
    public void T_087_verifyAddPart() throws InterruptedException{
        spotorderparts.verifyAddPart();
    }
    @Test(priority= 87 ,description="T_088_verify Part Hash",enabled=true)
    @Description("Test Description = verify Part Hash")
    public void T_088_verifyPartHash() throws InterruptedException{
        spotorderparts.verifyPartHash();
    }
    @Test(priority= 88 ,description="T_089_verify Vendor Part",enabled=true)
    @Description("Test Description = verify Vendor Part")
    public void T_089_verifyVendorPart() throws InterruptedException{
        spotorderparts.verifyVendorPart();
    }
    @Test(priority= 89 ,description="T_090_verify Description",enabled=true)
    @Description("Test Description = verify Description")
    public void T_090_verifyDescription() throws InterruptedException{
        spotorderparts.verifyDescription();
    }
    @Test(priority= 90 ,description="T_091_verify Order Quantity",enabled=true)
    @Description("Test Description =verify Order Quantity")
    public void T_091_verifyOrderQuantity() throws InterruptedException{
        spotorderparts.verifyOrderQuantity();
    }
    @Test(priority= 91 ,description="T_092_verify UOM",enabled=true)
    @Description("Test Description = verify UOM")
    public void T_092_verifyUOM() throws InterruptedException{
        spotorderparts.verifyUOM();
    }
    @Test(priority= 92 ,description="T_093_verify Conv",enabled=true)
    @Description("Test Description = verify Conv")
    public void T_093_verifyConv() throws InterruptedException{
        spotorderparts.verifyConv();
    }
    @Test(priority= 93,description="T_094_verify Unit Cost",enabled=true)
    @Description("Test Description = verify Unit Cost")
    public void T_094_verifyUnitCost() throws InterruptedException{
        spotorderparts.verifyUnitCost();
    }
    @Test(priority= 94 ,description="T_095_verify Core",enabled=true)
    @Description("Test Description = verify Core")
    public void T_095_verifyCore() throws InterruptedException{
        spotorderparts.verifyCore();
    } @Test(priority= 95 ,description="T_096_verify Extended Cost",enabled=true)
    @Description("Test Description = verify Extended Cost")
    public void T_096_verifyExtendedCost() throws InterruptedException{
        spotorderparts.verifyExtendedCost();
    }
    @Test(priority= 96 ,description="T_097_verify Cancel Icon",enabled=true)
    @Description("Test Description = verify Cancel Icon")
    public void T_097_verifyCancelIcon() throws InterruptedException{
        spotorderparts.verifyCancelIcon();
    }
    @Test(priority= 97,description="T_098_verify Link DeLink Labor",enabled=true)
    @Description("Test Description = verify Link DeLink Labor")
    public void T_098_verifyLinkDeLinkLabor() throws InterruptedException{
        spotorderparts.verifyLinkDeLinkLabor();
    }
    @Test(priority= 98 ,description="T_099_verify Order Part Description",enabled=true)
    @Description("Test Description = verify Order Part Description")
    public void T_099_verifyOrderPartDescription() throws InterruptedException{
        spotorderparts.verifyOrderPartDescription();
    }
    @Test(priority= 99 ,description="T_100_verify Input Value",enabled=true)
    @Description("Test Description = verify Input Value")
    public void T_100_verifyInputValue() throws InterruptedException{
        spotorderparts.verifyInputValue();
    }
    @Test(priority= 100,description="T_101_verify DeleteIcon",enabled=true)
    @Description("Test Description = verify DeleteIcon")
    public void T_101_verifyDeleteIcon() throws InterruptedException{
        spotorderparts.verifyDeleteIcon();
    }
    @Test(priority= 101,description="T_102_verify Link Button",enabled=true)
    @Description("Test Description = verify Link Button")
    public void T_102_verifyLinkButton() throws InterruptedException{
        spotorderparts.verifyLinkButton();
    } @Test(priority= 102,description="T_103_verify COpy PO",enabled=true)
    @Description("Test Description = verify COpy PO")
    public void T_103_verifyCOpyPO() throws InterruptedException{
        spotorderparts.verifyCOpyPO();
    }
    @Test(priority= 103,description="T_104_verify Void Button",enabled=true)
    @Description("Test Description = verify Void Button")
    public void T_104_verifyVoidButton() throws InterruptedException{
        spotorderparts.verifyVoidButton();
    }
    @Test(priority= 104,description="T_105_verify OK Button",enabled=true)
    @Description("Test Description = verify OK Button")
    public void T_105_verifyOKButton() throws InterruptedException{
        spotorderparts.verifyOKButton();
    }
    @Test(priority= 105,description="T_106_verify Submit Print PO",enabled=true)
    @Description("Test Description = verify Submit Print PO")
    public void T_106_verifySubmitPrintPO() throws InterruptedException{
        spotorderparts.verifySubmitPrintPO();
    }
    @Test(priority= 106,description="T_107_click On OK Button",enabled=true)
    @Description("Test Description = click On OK Button")
    public void T_107_clickOnOKButton() throws InterruptedException{
        spotorderparts.clickOnOKButton();
    }
    @Test(priority= 107,description="T_108_click On WIP POs",enabled=true)
    @Description("Test Description = click On WIP POs")
    public void T_108_clickOnWIPPOs() throws InterruptedException{
        spotorderparts.clickOnWIPPOs();
    }
    @Test(priority= 108,description="T_109_verify WIP POs",enabled=true)
    @Description("Test Description = verify WIP POs")
    public void T_109_verifyWIPPOs() throws InterruptedException{
        spotorderparts.verifyWIPPOs();
    }

    @Test(priority = 109, description = "T_110 verify Warehouse Text ",enabled=true)
    @Description("Test Description: verify Warehouse Text () ")
    public void T_110_verifyWarehouseText() throws FileNotFoundException, InterruptedException {
        spotorderparts.verifyWarehouseText ();
    }

    @Test(priority= 110,description="T_111_verify Search",enabled=true)
    @Description("Test Description = verify Search")
    public void T_111_verifySearch() throws InterruptedException{
        spotorderparts.verifySearch();
    }
    @Test(priority= 111,description="T_112_verify Refresh Button",enabled=true)
    @Description("Test Description = verify Refresh Button")
    public void T_112_verifyRefreshButton() throws InterruptedException{
        spotorderparts.verifyRefreshButton();
    }
    @Test(priority= 112,description="T_113_verify Order",enabled=true)
    @Description("Test Description = verify Order")
    public void T_113_verifyOrder() throws InterruptedException{
        spotorderparts.verifyOrder();
    } @Test(priority= 113,description="T_114_verify Date",enabled=true)
    @Description("Test Description = verify Date")
    public void T_114_verifyDate() throws InterruptedException{
        spotorderparts.verifyDate();
    } @Test(priority= 114,description="T_115_verify Vendor Text",enabled=true)
    @Description("Test Description = verify Vendor Text")
    public void T_115_verifyVendorText() throws InterruptedException{
        spotorderparts.verifyVendorText();
    }
    @Test(priority= 115,description="T_116_verify Text Warehouse",enabled=true)
    @Description("Test Description = verify Text Warehouse")
    public void T_115_verifyTextWarehouse() throws InterruptedException{
        spotorderparts.verifyTextWarehouse();
    }
    @Test(priority= 116,description="T_117_verify Text Referance",enabled=true)
    @Description("Test Description = verify Text Referance")
    public void T_117_verifyTextReferance() throws InterruptedException{
        spotorderparts.verifyTextReferance();
    }
    @Test(priority= 117,description="T_118_verify Text Status",enabled=true)
    @Description("Test Description = verify Text Status")
    public void T_118_verifyTextStatus() throws InterruptedException{
        spotorderparts.verifyTextStatus();
    }
    @Test(priority= 118,description="T_119_verify PO Numbewr",enabled=true)
    @Description("Test Description = verify PO Numbewr")
    public void T_119_verifyPONumbewr() throws InterruptedException{
        spotorderparts.verifyPONumbewr();
    }
    @Test(priority= 119,description="T_120_verify Text Vendor Name",enabled=true)
    @Description("Test Description = verify Text Vendor Name")
    public void T_120_verifyTextVendorName() throws InterruptedException{
        spotorderparts.verifyTextVendorName();
    } @Test(priority= 120,description="T_121_verify Open",enabled=true)
    @Description("Test Description = verify Open")
    public void T_121_verifyOpen() throws InterruptedException{
        spotorderparts.verifyOpen();
    } @Test(priority= 121,description="T_122_verify Order Summary",enabled=true)
    @Description("Test Description = verify Order Summary")
    public void T_122_verifyOrderSummary() throws InterruptedException{
        spotorderparts.verifyOrderSummary();
    }
    @Test(priority= 122,description="T_123_verify Vendor value",enabled=true)
    @Description("Test Description = verify Vendor value")
    public void T_123_verifyVendorvalue() throws InterruptedException{
        spotorderparts.verifyVendorvalue();
    }
    @Test(priority= 123,description="T_124_verify Address",enabled=true)
    @Description("Test Description = verify Address")
    public void T_124_verifyAddress() throws InterruptedException{
        spotorderparts.verifyAddress();
    }
    @Test(priority= 124,description="T_125_verify Po Date",enabled=true)
    @Description("Test Description = verify Po Date")
    public void T_125_verifyPoDate() throws InterruptedException{
        spotorderparts.verifyPoDate();
    }
    @Test(priority= 125,description="T_126_click On Po Number",enabled=true)
    @Description("Test Description = click On Po Number")
    public void T_126_clickOnPoNumber() throws InterruptedException{
        spotorderparts.clickOnPoNumber();
    }
    @Test(priority= 126,description="T_127_verify PO Number",enabled=true)
    @Description("Test Description = verify PO Number")
    public void T_127_verifyPONumber() throws InterruptedException{
        spotorderparts.verifyPONumber();
    } @Test(priority= 127,description="T_128_click On Sumbmit Print PO Button",enabled=true)
    @Description("Test Description = click On Sumbmit Print PO Button")
    public void T_128_clickOnSumbmitPrintPOButton() throws InterruptedException{
        spotorderparts.clickOnSumbmitPrintPOButton();
    } @Test(priority= 128,description="T_129_click On Sign Out",enabled=true)
    @Description("Test Description = click On Sign Out")
    public void T_129_clickOnSignOut() throws InterruptedException{
        spotorderparts.clickOnSignOut();
    }
    @Test(priority= 129,description="T_130_click On UserName TextArea",enabled=true)
    @Description("Test Description = clicOUserName TextArea")
    public void T_130_clickOnUserNameTextArea() throws InterruptedException{
        spotorderparts.clickOnUserNameTextArea();
    }

}