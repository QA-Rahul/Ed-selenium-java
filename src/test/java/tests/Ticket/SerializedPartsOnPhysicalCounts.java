package tests.Ticket;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import tests.TestDriverActions;

@Listeners({utils.TestListener.class})
@Epic("Testing")
@Feature("Serialized Parts On Physical Counts")
public class SerializedPartsOnPhysicalCounts extends TestDriverActions {

    @Test(priority=0,description="T_001_Login the page",enabled=true)
    @Description("Test Description :Login the page")
    public void T_001_loginThePage() throws InterruptedException {
        loginPage.loginWithValidCredentials(appProp57.getProperty("username"),appProp57.getProperty("password"));
    }
    @Test(priority=1,description="T_002_go to part master screen",enabled=true)
    @Description("Test Description :go to part master screen")
    public void T_002_gotoPartsMaster() throws InterruptedException {
        serializepart.gotoPartsMaster();
    }
    @Test(priority=2,description="T_003_verify title Part Master",enabled=true)
    @Description("Test Description :verify title Part Master")
    public void T_003_verifytitlePartMaster() throws InterruptedException {
        serializepart.verifytitlePartMaster();
    }
    @Test(priority=3,description="T_004_verify Part List",enabled=true)
    @Description("Test Description :verify Part List")
    public void T_004_verifyPartList() throws InterruptedException {
        serializepart.verifyPartList();
    }
    @Test(priority=4,description="T_005_verify new part button",enabled=true)
    @Description("Test Description :verify new part button")
    public void T_005_verifyNewPartbtn() throws InterruptedException {
        serializepart.verifyNewPartbtn();
    }
    @Test(priority=5,description="T_006_verify text search",enabled=true)
    @Description("Test Description :verify text search")
    public void T_006_verifySearch() throws InterruptedException {
        serializepart.verifySearch();
    }
    @Test(priority=6,description="T_007_verify textbox search",enabled=true)
    @Description("Test Description : verify textbox search")
    public void T_007_verifyTextboxSearch() throws InterruptedException {
        serializepart.verifyTextboxSearch();
    }
    @Test(priority=7,description="T_008_click on new part",enabled=true)
    @Description("Test Description :click on new part")
    public void T_008_clickOnNewPart() throws InterruptedException {
        serializepart.clickOnNewPart();
    }
    @Test(priority=8,description="T_009_Verify element of New Part Page",enabled=true)
    @Description("Test Description :Verify element of New Part Page")
    public void T_009_verifyNewPart() throws InterruptedException {
        serializepart.verifyNewPart();
    }
    @Test(priority=9,description="T_010_Verify element of New Part Page",enabled=true)
    @Description("Test Description :Verify element of New Part Page")
    public void T_010_verifyNewPart() throws InterruptedException {
        serializepart.verifyNewPart();
    }
    @Test(priority=10,description="T_011_enter Part Number",enabled=true)
    @Description("Test Description :enter Part Number")
    public void T_011_enterPartNumber() throws InterruptedException {
        serializepart.enterPartNumber();
    }
    @Test(priority=11,description="T_012_enter description",enabled=true)
    @Description("Test Description : enter description")
    public void T_012_enterDescription() throws InterruptedException {
        serializepart.enterDescription();
    }
    @Test(priority=12,description="T_013_enter cost",enabled=true)
    @Description("Test Description :enter cost")
    public void T_013_enterCost() throws InterruptedException {
        serializepart.enterCost();
    }
    @Test(priority=13,description="T_014_enter product group",enabled=true)
    @Description("Test Description :enter product group")
    public void T_014_enterProductGroup() throws InterruptedException {
        serializepart.enterProductGroup();
    }
    @Test(priority=14,description="T_015_click on create part",enabled=true)
    @Description("Test Description :click on create part")
    public void T_015_clickOnCreatePart() throws InterruptedException {
        serializepart.clickOnCreatePart();
    }
    @Test(priority=15,description="T_016_enter part number in search field",enabled=true)
    @Description("Test Description : enter part number in search field")
    public void T_016_enterPartNumberInSearchField() throws InterruptedException {
        serializepart.enterPartNumberInSearchField();
    }
    @Test(priority=16,description="T_017_click on part number Hyperlink",enabled=true)
    @Description("Test Description :click on part number Hyperlink")
    public void T_017_clickOnPartNumberHyperlink() throws InterruptedException {
        serializepart.clickOnPartNumberHyperlink();
    }
    @Test(priority=17,description="T_018_verify part name",enabled=true)
    @Description("Test Description :verify part name")
    public void T_018_verifypart_name() throws InterruptedException {
        serializepart.verifypart_name();
    }
    @Test(priority=18,description="T_019_verify part",enabled=true)
    @Description("Test Description : verify part")
    public void T_019_verifyPart() throws InterruptedException {
        serializepart.verifyPart();
    }
    @Test(priority=19,description="T_020_verify description",enabled=true)
    @Description("Test Description : verify description")
    public void T_020_verifylabel_Description() throws InterruptedException {
        serializepart.verifylabel_Description();
    }
    @Test(priority=20,description="T_021_verify product group",enabled=true)
    @Description("Test Description : verify product group")
    public void T_021_verifyProductGroup() throws InterruptedException {
        serializepart.verifyProductGroup();
    }
    @Test(priority=21,description="T_022_verify onHands",enabled=true)
    @Description("Test Description : verify onHands")
    public void T_022_verifylabel_onHands() throws InterruptedException {
        serializepart.verifylabel_onHands();
    }
    @Test(priority=22,description="T_023_verify value of onHands",enabled=true)
    @Description("Test Description : verify value of onHands")
    public void T_023_verifyvalue_onHands() throws InterruptedException {
        serializepart.verifyvalue_onHands();
    }
    @Test(priority=23,description="T_024_verify tab_Update",enabled=true)
    @Description("Test Description : verify tab_Update")
    public void T_024_verify_Update() throws InterruptedException {
        serializepart.verify_Update();
    }
    @Test(priority=24,description="T_025_verify tab_cancle",enabled=true)
    @Description("Test Description : verify tab_cancle")
    public void T_025_verifytab_cancle() throws InterruptedException {
        serializepart.verifytab_cancle();
    }
    @Test(priority=25,description="T_026_verify tab_saveExit",enabled=true)
    @Description("Test Description :verify tab_saveExit")
    public void T_026_verifytab_saveExit() throws InterruptedException {
        serializepart.verifytab_saveExit();
    }
    @Test(priority=26,description="T_027_ verify tab_moreInfo",enabled=true)
    @Description("Test Description : verify tab_moreInfo")
    public void T_027_verifytab_moreInfo() throws InterruptedException {
        serializepart.verifytab_moreInfo();
    }
    @Test(priority=27,description="T_028_click on update tab",enabled=true)
    @Description("Test Description :click on update tab")
    public void T_028_clickOnUpdateTab() throws InterruptedException {
        serializepart.clickOnUpdateTab();
    }
    @Test(priority=28,description="T_029_verify name of part",enabled=true)
    @Description("Test Description :verify name of part")
    public void T_029_verifyname_upDateOnhand() throws InterruptedException {
        serializepart.verifyname_upDateOnhand();
    }
    @Test(priority=29,description="T_030_verify onHand",enabled=true)
    @Description("Test Description :verify onHand")
    public void T_030_verifylabel_onHand() throws InterruptedException {
        serializepart.verifylabel_onHand();
    }
    @Test(priority=30,description="T_031_verify textbox onhand",enabled=true)
    @Description("Test Description :verify textbox onhand")
    public void T_031_verifytxtbox_onhand() throws InterruptedException {
        serializepart.verifytxtbox_onhand();
    }
    @Test(priority=31,description="T_032_verify cancle button",enabled=true)
    @Description("Test Description :verify cancle button")
    public void T_032_verifycancle_btn() throws InterruptedException {
        serializepart.verifycancle_btn();
    }
    @Test(priority=32,description="T_033_verify update button",enabled=true)
    @Description("Test Description :verify update button")
    public void T_033_verifyupdate_btn() throws InterruptedException {
        serializepart.verifyupdate_btn();
    }
    @Test(priority=33,description="T_034_enter value in onhand field",enabled=true)
    @Description("Test Description :enter value in onhand field")
    public void T_034_enterOnhandValue() throws InterruptedException {
        serializepart.enterOnhandValue();
    }
    @Test(priority=34,description="T_035_click on update",enabled=true)
    @Description("Test Description : click on update")
    public void T_035_clickOnUpdate() throws InterruptedException {
        serializepart.clickOnUpdate();
    }
    @Test(priority=35,description="T_036_click on save and exit button",enabled=true)
    @Description("Test Description :click on save and exit button")
    public void T_036_clickSaveExitbtn() throws InterruptedException {
        serializepart.clickSaveExitbtn();
    }
    @Test(priority=36,description="T_037_click on part number Hyperlink",enabled=true)
    @Description("Test Description :click on part number Hyperlink")
    public void T_037_clickOnPartNumberHyperlink() throws InterruptedException {
        serializepart.clickOnPartNumberHyperlink();
    }
    @Test(priority=37,description="T_038_verify textbox onhand",enabled=false)
    @Description("Test Description :verify textbox onhand")
    public void T_038_verifytxtbox_onhand() throws InterruptedException {
        serializepart.verifytxtbox_onhand();
    }
    @Test(priority=38,description="T_039_click on more info ",enabled=true)
    @Description("Test Description :click on more info ")
    public void T_39_clickOnMoreinfo() throws InterruptedException {
        serializepart.clickOnMoreinfo();
    }
    @Test(priority=39,description="T_040_verify name Of Part",enabled=true)
    @Description("Test Description :verify name Of Part")
    public void T_040_verifyNameOfPart() throws InterruptedException {
        serializepart.verifyNameOfPart();
    }
    @Test(priority=40,description="T_041_verify title Part Number",enabled=true)
    @Description("Test Description :verify title Part Number")
    public void T_041_verifyTitle_PartNumber() throws InterruptedException {
        serializepart.verifyTitle_PartNumber();
    }
    @Test(priority=41,description="T_042_verify subtitle Part Settings",enabled=true)
    @Description("Test Description :verify subtitle Part Settings")
    public void T_042_verifySubtitle_PartSettings() throws InterruptedException {
        serializepart.verifySubtitle_PartSettings();
    }
    @Test(priority=42,description="T_043_verify tab Initialize Serial Number",enabled=true)
    @Description("Test Description :verify tab Initialize Serial Number")
    public void T_043_verifytab_InitializeSerialNumber() throws InterruptedException {
        serializepart.verifytab_InitializeSerialNumber();
    }
    @Test(priority=43,description="T_044_verify btn Cancle",enabled=true)
    @Description("Test Description :verify btn Cancle")
    public void T_044_verifybtnCancle() throws InterruptedException {
        serializepart.verifybtnCancle();
    }
    @Test(priority=44,description="T_045_verify btn Ok",enabled=true)
    @Description("Test Description :verify btn Ok")
    public void T_045_verifybtnOk() throws InterruptedException {
        serializepart.verifybtnOk();
    }
    @Test(priority=45,description="T_046_click on tab Initialize Serial Number",enabled=true)
    @Description("Test Description :click on tab Initialize Serial Number")
    public void T_046_clickOnInitializeSerialNumber() throws InterruptedException {
        serializepart.clickOnInitializeSerialNumber();
    }
    @Test(priority=46,description="T_047_verify title Initialize Serial Number with Part",enabled=true)
    @Description("Test Description :verify title Initialize Serial Number with Part")
    public void T_047_verifytitle_InitializeSerialNumberwithPart() throws InterruptedException {
        serializepart.verifytitle_InitializeSerialNumberwithPart();
    }
    @Test(priority=47,description="T_048_verify title warehouse Stock",enabled=true)
    @Description("Test Description :verify title warehouse Stock")
    public void T_048_verifytitle_warehouseStock() throws InterruptedException {
        serializepart.verifytitle_warehouseStock();
    }
    @Test(priority=48,description="T_049_verify label warehouse",enabled=true)
    @Description("Test Description :verify label warehouse")
    public void T_049_verifylabel_warehouse() throws InterruptedException {
        serializepart.verifylabel_warehouse();
    }
    @Test(priority=49,description="T_050_verify label On Hand Qty",enabled=true)
    @Description("Test Description :verify label On Hand Qty")
    public void T_050_verifylabel_OnHandqty() throws InterruptedException {
        serializepart.verifylabel_OnHandqty();
    }
    @Test(priority=50,description="T_051_verify title serial Numbers",enabled=true)
    @Description("Test Description :verify title serial Numbers")
    public void T_051_verifytitle_serialNumbers() throws InterruptedException {
        serializepart.verifytitle_serialNumbers();
    }
    @Test(priority=51,description="T_052_verify button add",enabled=true)
    @Description("Test Description :verify button add")
    public void T_052_verifybtn_add() throws InterruptedException {
        serializepart.verifybtn_add();
    }
    @Test(priority=52,description="T_053_verify trash button",enabled=true)
    @Description("Test Description :verify trash button")
    public void T_053_verifytrash_btn() throws InterruptedException {
        serializepart.verifytrash_btn();
    }
    @Test(priority=53,description="T_054_verify label serial Number",enabled=true)
    @Description("Test Description :verify label serial Number")
    public void T_054_verifylabel_serialNumber() throws InterruptedException {
        serializepart.verifylabel_serialNumber();
    }
    @Test(priority=54,description="T_055_verify label unit Cost",enabled=true)
    @Description("Test Description :verify label unit Cost")
    public void T_047_verifylabel_unitCost() throws InterruptedException {
        serializepart.verifylabel_unitCost();
    }
    @Test(priority=55,description="T_056_verify button initialize",enabled=true)
    @Description("Test Description :")
    public void T_056_verifybtn_initialize() throws InterruptedException {
        serializepart.verifybtn_initialize();
    }
    @Test(priority=56,description="T_057_click on Add button",enabled=true)
    @Description("Test Description :click on Add button")
    public void T_057_clickOnAddBtn() throws InterruptedException {
        serializepart.clickOnAddBtn();
    }
    @Test(priority=57,description="T_058_verify title Add Serial Number for Part",enabled=true)
    @Description("Test Description :verify title Add Serial Number for Part")
    public void T_058_verifytitle_AddSerialNumberforPart() throws InterruptedException {
        serializepart.verifytitle_AddSerialNumberforPart();
    }
    @Test(priority=58,description="T_059_verify label_SerialNumber",enabled=true)
    @Description("Test Description :verify label_SerialNumber")
    public void T_059_verifylabel_SerialNumber() throws InterruptedException {
        serializepart.verifylabel_SerialNumber();
    }
    @Test(priority=59,description="T_060_verify textbox serial Number",enabled=true)
    @Description("Test Description :verify textbox serial Number")
    public void T_060_verifytxtbox_serialNumber() throws InterruptedException {
        serializepart.verifytxtbox_serialNumber();
    }
    @Test(priority=60,description="T_061_verify text Unit Cost",enabled=true)
    @Description("Test Description :verify text Unit Cost")
    public void T_061_verifytxt_UnitCost() throws InterruptedException {
        serializepart.verifytxt_UnitCost();
    }
    @Test(priority=61,description="T_062_verify textbox Unit Cost",enabled=true)
    @Description("Test Description :verify textbox Unit Cost")
    public void T_062_verifytxtbox_UnitCost() throws InterruptedException {
        serializepart.verifytxtbox_UnitCost();
    }
    @Test(priority=62,description="T_063_enter serial number",enabled=true)
    @Description("Test Description :enter serial number")
    public void T_063_enterSerialNumber() throws InterruptedException {
        serializepart.enterSerialNumber();
    }
    @Test(priority=63,description="T_064_enter unit cost",enabled=true)
    @Description("Test Description :enter unit cost")
    public void T_064_enterUnitCost() throws InterruptedException {
        serializepart.enterUnitCost();
    }
    @Test(priority=64,description="T_065_click on Ok button",enabled=true)
    @Description("Test Description :click on Ok button")
    public void T_065_clickOK() throws InterruptedException {
        serializepart.clickOK();
    }
    @Test(priority=65,description="T_066_enter Serial Number matching upto onhand number",enabled=true)
    @Description("Test Description :enter Serial Number matching upto onhand number")
    public void T_066_enterSerialNumberUpto5() throws InterruptedException {
        serializepart.clickOnAddBtn();
        serializepart.enterSerialNumber();
        serializepart.enterUnitCost();
        serializepart.clickOK();
        serializepart.clickOnAddBtn();
        serializepart.enterSerialNumber();
        serializepart.enterUnitCost();
        serializepart.clickOK();
        serializepart.clickOnAddBtn();
        serializepart.enterSerialNumber();
        serializepart.enterUnitCost();
        serializepart.clickOK();
        serializepart.clickOnAddBtn();
        serializepart.enterSerialNumber();
        serializepart.enterUnitCost();
        serializepart.clickOK();
    }
    @Test(priority=66,description="T_067_click on initialize",enabled=true)
    @Description("Test Description :click on initialize")
    public void T_067_clickOnInitialize() throws InterruptedException {
        serializepart.clickOnInitialize();
    }
    @Test(priority=67,description="T_068_click on Ok button",enabled=true)
    @Description("Test Description :click on Ok button")
    public void T_068_clickOnOkButton() throws InterruptedException {
        serializepart.clickOnOkButton();
    }
    @Test(priority=68,description="T_069_click on save and exit button",enabled=true)
    @Description("Test Description :click on save and exit button")
    public void T_069_clickSaveExitbtn() throws InterruptedException {
        serializepart.clickSaveExitbtn();
    }
    @Test(priority=69,description="T_070_go to Physical Count Screen",enabled=false)
    @Description("Test Description :go to Physical Count Screen")
    public void T_070_gotoPhysicalCountScreen() throws InterruptedException {
        serializepart.gotoPhysicalCountScreen();
    }
    @Test(priority=70,description="T_071_verify Inventory Count",enabled=false)
    @Description("Test Description : verify Inventory Count")
    public void T_071_verifyInventoryCount() throws InterruptedException {
        serializepart.verifyInventoryCount();
    }
    @Test(priority=71,description="T_072_verify subtitle OpenCount",enabled=false)
    @Description("Test Description :verify subtitle OpenCount")
    public void T_072_verifysubtitle_OpenCount() throws InterruptedException {
        serializepart.verifysubtitle_OpenCount();
    }
    @Test(priority=72,description="T_073_verify btn_addNewCount",enabled=false)
    @Description("Test Description :verify btn_addNewCount")
    public void T_073_verifybtn_addNewCount() throws InterruptedException {
        serializepart.verifybtn_addNewCount();
    }
    @Test(priority=73,description="T_074_click on add new count button",enabled=false)
    @Description("Test Description :click on add new count button")
    public void T_074_clickOnAddNewCount() throws InterruptedException {
        serializepart.clickOnAddNewCount();
    }
    @Test(priority=74,description="T_075_verify title select warehouse",enabled=false)
    @Description("Test Description :verify title select warehouse")
    public void T_075_verifytitle_selectWarehouse() throws InterruptedException {
        serializepart.verifytitle_selectWarehouse();
    }
    @Test(priority=75,description="T_076_verify warehouse with dropdown",enabled=false)
    @Description("Test Description :verify warehouse with dropdown")
    public void T_076_verifyWarehouse() throws InterruptedException {
        serializepart.verifyWarehouse();
    }
    @Test(priority=76,description="T_077_verify count type",enabled=false)
    @Description("Test Description :verify count type")
    public void T_077_verifyCountType() throws InterruptedException {
        serializepart.verifyCountType();
    }
    @Test(priority=77,description="T_078_verify radio button of standard",enabled=false)
    @Description("Test Description :verify radio button of standard")
    public void T_078_verifyRadioStandard() throws InterruptedException {
        serializepart.verifyRadioStandard();
    }
    @Test(priority=78,description="T_079_verify radio button of serialized",enabled=false)
    @Description("Test Description :verify radio button of serialized")
    public void T_079_verifySerialized() throws InterruptedException {
        serializepart.verifySerialized();
    }@Test(priority=79,description="T_080_verify radio button of tires",enabled=false)
    @Description("Test Description :verify radio button of tires")
    public void T_080_verifyTires() throws InterruptedException {
        serializepart.verifyTires();
    }
    @Test(priority=80,description="T_081_verify cancle and ok",enabled=false)
    @Description("Test Description :verify cancle and ok")
    public void T_081_verifyCancle_Ok()  throws InterruptedException {
        serializepart. verifyCancle_Ok();
    }
    @Test(priority=81,description="T_082_click on ok button",enabled=false)
    @Description("Test Description :click on ok button")
    public void T_082_clickOnOK() throws InterruptedException {
        serializepart.clickOnOK();
    }
    @Test(priority=82,description="T_083_verify count number",enabled=false)
    @Description("Test Description :verify count number")
    public void T_083_verifyCountNumber() throws InterruptedException {
        serializepart.verifyCountNumber();
    }
    @Test(priority=83,description="T_084_verify type",enabled=false)
    @Description("Test Description :verify type")
    public void T_084_verifyType() throws InterruptedException {
        serializepart.verifyType();
    }@Test(priority=84,description="T_085_verify count location",enabled=false)
    @Description("Test Description :verify count location")
    public void T_085_verifyCountLocation() throws InterruptedException {
        serializepart.verifyCountLocation();
    }
    @Test(priority=85,description="T_086_verify part",enabled=false)
    @Description("Test Description :verify part")
    public void T_086_verifyPartsection() throws InterruptedException {
        serializepart.verifyPartsection();
    }
    @Test(priority=86,description="T_087_ verify quantity",enabled=false)
    @Description("Test Description : verify quantity")
    public void T_087_verifyQuantity() throws InterruptedException {
        serializepart.verifyQuantity();
    }
    @Test(priority=87,description="T_088_enter part in part field",enabled=false)
    @Description("Test Description :enter part in part field")
    public void T_088_enterPartinField() throws InterruptedException {
        serializepart.enterPartinField();
    }
    @Test(priority=88,description="T_089_enter part in part field",enabled=false)
    @Description("Test Description :enter part in part field")
    public void T_089_changeCount() throws InterruptedException {
        serializepart.changeCount();
    }

    @Test(priority=89,description="T_090_click on count",enabled=false)
    @Description("Test Description :click on count")
    public void T_090_clickOnCount() throws InterruptedException {
        serializepart.clickOnCount();
    }

    @Test(priority=90,description="T_091_verify name of warehouse",enabled=false)
    @Description("Test Description :verify name of warehouse")
    public void T_091_verifyWarehouseName() throws InterruptedException {
        serializepart.verifyWarehouseName();
    }

    @Test(priority=91,description="T_092_verify part name in the table",enabled=false)
    @Description("Test Description :verify part name in the table")
    public void T_092_verifypartEntry() throws InterruptedException {
        serializepart.verifypartEntry();
    }

    @Test(priority=92,description="T_093_verify buttons present at the end of the page",enabled=false)
    @Description("Test Description :verify buttons present at the end of the page")
    public void T_093_verifybuttons() throws InterruptedException {
        serializepart.verifybuttons();
    }
    @Test(priority=93,description="T_094_click on post button",enabled=false)
    @Description("Test Description :click on post button")
    public void T_094_ClickOnpost() throws InterruptedException {
        serializepart.ClickOnpost();
    }

    @Test(priority=94,description="T_095_verify post count",enabled=false)
    @Description("Test Description :verify post count")
    public void T_095_verifyPostCount() throws InterruptedException {
        serializepart.verifyPostCount();
    }

    @Test(priority=95,description="T_096_click post button",enabled=false)
    @Description("Test Description :click post button")
    public void T_096_clickPostButton() throws InterruptedException {
        serializepart.clickPostButton();
    }

    @Test(priority=96,description="T_097_go to counter sale screen",enabled=true)
    @Description("Test Description :go to counter sale screen")
    public void T_097_gotoCounterSaleScreen() throws InterruptedException {
        serializepart.gotoCounterSaleScreen();
    }

    @Test(priority=97,description="T_098_verify title Counter sale",enabled=true)
    @Description("Test Description :verify title Counter sale")
    public void T_098_verifyCounterSale() throws InterruptedException {
        serializepart.verifyCounterSale();
    }

    @Test(priority=98,description="T_099_verify subtitle to Be Invoiced",enabled=true)
    @Description("Test Description :verify subtitle to Be Invoiced")
    public void T_099_verifysubtitle_toBeInvoiced() throws InterruptedException {
        serializepart.verifysubtitle_toBeInvoiced();
    }

    @Test(priority=99,description="T_100_verify text location",enabled=true)
    @Description("Test Description :verify text location")
    public void T_100_verifytxt_location() throws InterruptedException {
        serializepart.verifytxt_location();
    }

    @Test(priority=100,description="T_101_verify sale list table column name",enabled=true)
    @Description("Test Description :verify sale list table column name")
    public void T_101_verifySaleListTableColumn() throws InterruptedException {
        serializepart.verifySaleListTableColumn();
    }

    @Test(priority=101,description="T_102_click on new sale number",enabled=true)
    @Description("Test Description :click on new sale number")
    public void T_102_clickOnnewSaleNumber() throws InterruptedException {
        serializepart.clickOnnewSaleNumber();
    }

    @Test(priority=102,description="T_103_verify counter sale",enabled=true)
    @Description("Test Description :verify counter sale")
    public void T_103_verifyCounterSalePage() throws InterruptedException {
        serializepart.verifyCounterSalePage();
    }

    @Test(priority=103,description="T_104_verify part in sale item",enabled=true)
    @Description("Test Description :verify part in sale item")
    public void T_104_verifypartInSale() throws InterruptedException {
        serializepart.verifypartInSale();
    }
    @Test(priority=104,description="T_105_verify buttons present on counter sale page ",enabled=true)
    @Description("Test Description :verify buttons present on counter sale page ")
    public void T_105_clickAddPart() throws InterruptedException {
        serializepart.verifyButtons();
    }
    @Test(priority=105,description="T_106_enter Part",enabled=true)
    @Description("Test Description :enter Part")
    public void T_106_enterPart() throws InterruptedException {
        serializepart.enterPart();
    }
    @Test(priority=106,description="T_107_verify the select serial number",enabled=true)
    @Description("Test Description :verify the select serial number")
    public void T_107_verifySelectSerialnumber() throws InterruptedException {
        serializepart.verifySelectSerialnumber();
    }

    @Test(priority=107,description="T_108_verify serial number with checkbox",enabled=true)
    @Description("Test Description :verify serial number with checkbox")
    public void T_108_verifySerialNumber_Checkbox() throws InterruptedException {
        serializepart.verifySerialNumber_Checkbox();
    }

    @Test(priority=108,description="T_109_click on checkbox of serial number",enabled=true)
    @Description("Test Description :click on checkbox of serial number")
    public void T_109_clickOnCheckBox() throws InterruptedException {
        serializepart.clickOnCheckBox();
    }

    @Test(priority=109,description="T_110_click on Issue Selected",enabled=true)
    @Description("Test Description :click on Issue Selected")
    public void T_110_clickIssueSelected() throws InterruptedException {
        serializepart.clickIssueSelected();
    }

    @Test(priority=110,description="T_111_click on save and exit",enabled=true)
    @Description("Test Description :click on save and exit")
    public void T_111_clickSaveExit() throws InterruptedException {
        serializepart.clickSaveExit();
    }

    @Test(priority=111,description="T_112_go to part master screen",enabled=true)
    @Description("Test Description :go to part master screen")
    public void T_112_gotoPartsMaster() throws InterruptedException {
        serializepart.gotoPartsMaster();
    }

    @Test(priority=112,description="T_113_enter part number in search field",enabled=true)
    @Description("Test Description :enter part number in search field")
    public void T_113_enterPartNumberInSearchField() throws InterruptedException {
        serializepart.enterPartNumberInSearchField();
    }

    @Test(priority=113,description="T_114_click on part number Hyperlink",enabled=true)
    @Description("Test Description :click on part number Hyperlink")
    public void T_114_clickOnPartNumberHyperlink() throws InterruptedException {
        serializepart.clickOnPartNumberHyperlink();
    }

    @Test(priority=114,description="T_115_click on more info",enabled=true)
    @Description("Test Description :click on more info")
    public void T_115_clickOnMoreinfo() throws InterruptedException {
        serializepart.clickOnMoreinfo();
    }

    @Test(priority=115,description="T_116_click on View SerialNumber On Hand button",enabled=true)
    @Description("Test Description :click on View SerialNumber On Hand button")
    public void T_116_clickOnViewSerialNumberOnHand() throws InterruptedException {
        serializepart.clickOnViewSerialNumberOnHand();
    }

    @Test(priority=116,description="T_117_verify View Serial Numbers On Hand For Part",enabled=true)
    @Description("Test Description :verify View Serial Numbers On Hand For Part")
    public void T_117_verifyViewSerialNumbersOnHandForPart() throws InterruptedException {
        serializepart.verifyViewSerialNumbersOnHandForPart();
    }
    @Test(priority=117,description="T_118_verify warehouse name",enabled=true)
    @Description("Test Description :verify warehouse name")
    public void T_118_verify_Warehouse() throws InterruptedException {
        serializepart.verify_Warehouse();
    }
    @Test(priority=118,description="T_119_verify no data display",enabled=true)
    @Description("Test Description :verify no data display")
    public void T_119_verifyNoDataToDisplay()  throws InterruptedException {
        serializepart.verifyNoDataToDisplay();
    }
    @Test(priority=119,description="T_120_click on close button",enabled=true)
    @Description("Test Description :click on close button")
    public void T_120_clickOnClosebtn() throws InterruptedException {
        serializepart.clickOnClosebtn();
    }
    @Test(priority=120,description="T_121_Click on Ok",enabled=true)
    @Description("Test Description :Click on Ok")
    public void T_121_clickOnOkButton() throws InterruptedException {
        serializepart.clickOnOkButton();
    }
    @Test(priority=121,description="T_122_click on save and exit button",enabled=true)
    @Description("Test Description :click on save and exit button")
    public void T_122_clickSaveExitbtn() throws InterruptedException {
        serializepart.clickSaveExitbtn();
    }
    @Test(priority=122,description="T_123_Click on sign out and verify username",enabled=true)
    @Description("Test Description :Click on sign out and verify username")
    public void T_123_clickOnSignOutAndVerifyName() throws InterruptedException {
        serializepart.clickOnSignOutAndVerifyName();
    }

}
