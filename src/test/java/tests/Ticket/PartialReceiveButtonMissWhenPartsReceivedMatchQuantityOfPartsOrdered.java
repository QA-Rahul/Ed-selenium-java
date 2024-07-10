package tests.Ticket;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import tests.TestDriverActions;

import java.io.FileNotFoundException;

@Listeners({utils.TestListener.class})
@Epic("Testing")
@Feature("Partial Receiving button missing when parts received matches quantity of parts ordered - QUALITYRS")

public class PartialReceiveButtonMissWhenPartsReceivedMatchQuantityOfPartsOrdered extends TestDriverActions {

    @Test(priority=0,description="T_001_goto order parts Screen",enabled=true)
    @Description("Test Description - goto order parts Screen")
    public void T_001_gotoOrderPartsScreen() throws InterruptedException, FileNotFoundException {
        loginPage.loginWithValidCredentials(appProp83.getProperty("username"),appProp83.getProperty("password"));
        partialReceivedButton.gotoOrderPartsScreen();
    }

    @Test(priority=1,description="T_002_verify title Order Parts",enabled=true)
    @Description("Test Description - verify title Order Parts")
    public void T_002_verifyTitleOrderParts() throws InterruptedException {
        partialReceivedButton.verifyTitleOrderParts();
    }

    @Test(priority=2,description="T_003_verify title Search Catalog",enabled=true)
    @Description("Test Description - verify title Search Catalog")
    public void T_003_verifySearchCatalog() throws InterruptedException{
        partialReceivedButton.verifySearchCatalog();
    }

    @Test(priority=3,description="T_004_verify select Increament box and add button",enabled=true)
    @Description("Test Description - verify select Increament box and add button")
    public void T_004_verifyIncreament_AddBtn() throws InterruptedException{
        partialReceivedButton.verifyIncreament_AddBtn();
    }

    @Test(priority=4,description="T_005_verify Order List",enabled=true)
    @Description("Test Description - verify Order List")
    public void T_005_verifyOrderList() throws InterruptedException{
        partialReceivedButton.verifyOrderList();
    }

    @Test(priority=5,description="T_006_verify WareHouse",enabled=true)
    @Description("Test Description - verify WareHouse")
    public void T_006_verifyWarehouse() throws InterruptedException{
        partialReceivedButton.verifyWarehouse();
    }
    @Test(priority=6,description="T_007_verify tab IssuePO and Refresh",enabled=true)
    @Description("Test Description - verify tab IssuePO and Refresh")
    public void T_007_verifyIssuePO_Refresh() throws InterruptedException{
        partialReceivedButton.verifyIssuePO_Refresh();
    }
    @Test(priority=7,description="T_008_enter first part",enabled=true)
    @Description("Test Description - enter first part")
    public void T_008_enterFirstPart() throws InterruptedException{
        partialReceivedButton.enterFirstPart();
    }

    @Test(priority=8,description="T_009_Increase part by 4",enabled=true)
    @Description("Test Description - Increase part by 4")
    public void T_009_IncreasePartBy4() throws InterruptedException{
        partialReceivedButton.IncreasePartBy4();
    }
    @Test(priority=9,description="T_010_click on Add button",enabled=true)
    @Description("Test Description - click on Add button")
    public void T_010_clickOnAddButton() throws InterruptedException{
        partialReceivedButton.clickOnAddButton();
    }
    @Test(priority=10,description="T_011_click on Issue PO",enabled=true)
    @Description("Test Description - click on Issue PO")
    public void T_011_clickOnIssuePO() throws InterruptedException{
        partialReceivedButton.clickOnIssuePO();
    }
    @Test(priority=11,description="T_012_verify title IssuePO",enabled=true)
    @Description("Test Description - verify title IssuePO")
    public void T_012_verifyTitleIssuePO() throws InterruptedException{
        partialReceivedButton.verifyTitleIssuePO();
    }
    @Test(priority=12,description="T_013_verify column present in IssuePO table",enabled=true)
    @Description("Test Description - verify column present in IssuePO table")
    public void T_013_verifyColumnIssuePo() throws InterruptedException{
        partialReceivedButton.verifyColumnIssuePo();
    }
    @Test(priority=13,description="T_014_select vendor name",enabled=true)
    @Description("Test Description - select vendor name")
    public void T_014_selectVendorName() throws InterruptedException{
        partialReceivedButton.selectVendorName();
    }
    @Test(priority=14,description="T_015_click on Issue PO",enabled=true)
    @Description("Test Description - click on Issue PO")
    public void T_015_clickInIssuePOBtn() throws InterruptedException{
        partialReceivedButton.clickInIssuePOBtn();
    }
    @Test(priority=15,description="T_016_verify Quantity",enabled=true)
    @Description("Test Description - verify Quantity")
    public void T_016_verifyQuantity() throws InterruptedException{
        partialReceivedButton.verifyQuantity();
    }
    @Test(priority=16,description="T_017_Add Part in Purchase Order",enabled=true)
    @Description("Test Description - Add Part in Purchase Order")
    public void T_017_addPart() throws InterruptedException{
        partialReceivedButton.addPart();
    }
    @Test(priority=17,description="T_018_enter Quantity",enabled=true)
    @Description("Test Description - enter Quantity")
    public void T_018_enterQuantity() throws InterruptedException{
        partialReceivedButton.enterQuantity();
    }
    @Test(priority=18,description="T_019_click on Add Part",enabled=true)
    @Description("Test Description - click on Add Part")
    public void T_019_clickOnAddPart() throws InterruptedException{
        partialReceivedButton.clickOnAddPart();
    }
    @Test(priority=19,description="T_020_verify column of Purchase Order",enabled=true)
    @Description("Test Description - verify column of Purchase Order")
    public void T_020_verifyColumnPurchaseOrder() throws InterruptedException{
        partialReceivedButton.verifyColumnPurchaseOrder();
    }
    @Test(priority=20,description="T_021_verify copypo void ok save exit tabs",enabled=true)
    @Description("Test Description - verify copypo void ok save exit tabs")
    public void T_021_verifyCopyPOTabs() throws InterruptedException{
        partialReceivedButton.verifyCopyPOTabs();
    }
    @Test(priority=21,description="T_022_verify Order Quantity",enabled=true)
    @Description("Test Description - verify Order Quantity")
    public void T_022_verifyOrderQuantity() throws InterruptedException{
        partialReceivedButton.verifyOrderQuantity();
    }
    @Test(priority=22,description="T_023_click on Save and Exit",enabled=true)
    @Description("Test Description - click on Save and Exit")
    public void T_023_clickOnSaveExit() throws InterruptedException{
        partialReceivedButton.clickOnSaveExit();
    }
    @Test(priority=23,description="T_024_verify tab",enabled=true)
    @Description("Test Description - verify tab")
    public void T_024_verifyTabs() throws InterruptedException{
        partialReceivedButton.verifyTabs();
    }
    @Test(priority=24,description="T_025_click on WIPPos tab",enabled=true)
    @Description("Test Description - click on WIPPos tab")
    public void T_025_clickOnWIPPos() throws InterruptedException{
        partialReceivedButton.clickOnWIPPos();
    }
    @Test(priority=25,description="T_026_verify title WIPPos",enabled=true)
    @Description("Test Description - verify title WIPPos")
    public void T_026_verifyTitleWIPPos() throws InterruptedException{
        partialReceivedButton.verifyTitleWIPPos();
    }
    @Test(priority=26,description="T_027_verify Warehouse",enabled=true)
    @Description("Test Description - verify Warehouse")
    public void T_027_verifyWarehouseName() throws InterruptedException{
        partialReceivedButton.verifyWarehouseName();
    }
    @Test(priority=27,description="T_028_ verify Search box and refresh button",enabled=true)
    @Description("Test Description -  verify Search box and refresh button")
    public void T_028_verifySearchBoxAndRefreshbtn() throws InterruptedException{
        partialReceivedButton.verifySearchBoxAndRefreshbtn();
    }
    @Test(priority=28,description="T_029_verify WIPPos table column",enabled=true)
    @Description("Test Description - verify WIPPos table column")
    public void T_029_verifyWIPPosTable() throws InterruptedException{
        partialReceivedButton.verifyWIPPosTable();
    }
    @Test(priority=29,description="T_030_click On PONumber",enabled=true)
    @Description("Test Description - click On PONumber")
    public void T_030_clickOnPONumber() throws InterruptedException{
        partialReceivedButton.clickOnPONumber();
    }
    @Test(priority=30,description="T_031_verify Purchase Order tab",enabled=true)
    @Description("Test Description - verify Purchase Order tab")
    public void T_031_verifyPurchaseOrderTab() throws InterruptedException{
        partialReceivedButton.verifyPurchaseOrderTab();
    }
    @Test(priority=31,description="T_032_click on Receive Part",enabled=true)
    @Description("Test Description - click on Receive Part")
    public void T_032_clickOnReceivePart() throws InterruptedException{
        partialReceivedButton.clickOnReceivePart();
    }
    @Test(priority=32,description="T_033_click on cross icon",enabled=true)
    @Description("Test Description - click on cross icon")
    public void T_033_clickOnCrossIcon() throws InterruptedException{
        partialReceivedButton.clickOnCrossIcon();
    }

    @Test(priority=33,description="T_034_enter Receive quantity",enabled=true)
    @Description("Test Description - enter Receive quantity")
    public void T_034_enterReceivingQuantity() throws InterruptedException{
        partialReceivedButton.enterReceivingQuantity();
    }

   @Test(priority=34,description="T_035_click Receive Part",enabled=true)
    @Description("Test Description - click Receive Part")
    public void T_035_clickReceivePart() throws InterruptedException{
        partialReceivedButton.clickReceivePart();
    }

    @Test(priority=35,description="T_036_verify title Invoice Optional",enabled=true)
    @Description("Test Description - verify title Invoice Optional")
    public void T_036_verifyTitleInvoiceOptional() throws InterruptedException{
        partialReceivedButton.verifyTitleInvoiceOptional();
    }
    @Test(priority=36,description="T_037_click on Receive Part button",enabled=true)
    @Description("Test Description - click on Receive Part button")
    public void T_037_clickReceivePartButton() throws InterruptedException{
         partialReceivedButton.clickReceivePartButton();
    }
    @Test(priority=37,description="T_038_verify link View Received",enabled=true)
    @Description("Test Description - verify link View Received")
    public void T_038_verifyLinkViewReceived() throws InterruptedException{
        partialReceivedButton.verifyLinkViewReceived();
    }
    @Test(priority=38,description="T_039_ click on link View Received",enabled=true)
    @Description("Test Description -  click on link View Received")
    public void T_039_clickonLinkViewReceived() throws InterruptedException{
         partialReceivedButton.clickonLinkViewReceived();
    }
    @Test(priority=39,description="T_040_verify title Receiving Info",enabled=true)
    @Description("Test Description - verify title Receiving Info")
    public void T_040_verifyReceivingInfo()  throws InterruptedException{
         partialReceivedButton.verifyReceivingInfo();
    }
     @Test(priority=40,description="T_041_verify column of Receiving Info table",enabled=true)
    @Description("Test Description - verify column of Receiving Info table")
    public void T_041_verifyColumnReceivingInfo() throws InterruptedException{
         partialReceivedButton.verifyColumnReceivingInfo();
    }
     @Test(priority=41,description="T_042_verify Part Code Name",enabled=true)
    @Description("Test Description - verify Part Code Name")
    public void T_042_verifyPartCodeName() throws InterruptedException{
         partialReceivedButton.verifyPartCodeName();
    }
    @Test(priority=42,description="T_043_verify Quantity Number",enabled=true)
    @Description("Test Description - verify Quantity Number")
    public void T_043_verifyQuantityNumber() throws InterruptedException{
        partialReceivedButton.verifyQuantityNumber();
    }
     @Test(priority=43,description="T_044_click on Ok button",enabled=true)
    @Description("Test Description - click on Ok button")
    public void T_044_clickOnOKButton() throws InterruptedException{
         partialReceivedButton.clickOnOKButton();
    }
    @Test(priority=44,description="T_045_verify Part name and link button",enabled=true)
    @Description("Test Description - verify Part name and link button")
    public void T_045_verifyPartName_LinkButton()  throws InterruptedException{
        partialReceivedButton.verifyPartName_LinkButton();
    }
     @Test(priority=45,description="T_046_click on close button",enabled=true)
    @Description("Test Description - click on close button")
    public void T_046_clickOnReceivePart() throws InterruptedException{
         partialReceivedButton.clickOnCloseButton();
    }
    @Test(priority=46,description="T_047_Click on sign out and verify username",enabled=true)
    @Description("Test Description - Click on sign out and verify username")
    public void T_047_clickOnSignOutAndVerifyName() throws InterruptedException{
        partialReceivedButton.clickOnSignOutAndVerifyName();
    }


}
