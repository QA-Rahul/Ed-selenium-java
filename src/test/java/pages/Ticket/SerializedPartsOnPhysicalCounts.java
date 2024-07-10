package pages.Ticket;

import actions.WebElementActions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import tests.TestDriverActions;
import utils.TestListener;
import utils.WaitMethods;

import java.util.List;

public class SerializedPartsOnPhysicalCounts extends TestDriverActions {

    @FindBy(xpath = "//a[text()='Parts']")
    WebElement Parts;
    @FindBy(xpath = "//td[text()='Part Master']")
    WebElement PartMaster;
    @FindBy(xpath = "//span[text()='New Part']")
    WebElement btn_newPart;
    @FindBy(xpath="//span[text()='Part Master']")
    WebElement title_PartMaster;
    @FindBy(xpath="//h1[text()='Parts List']")
    WebElement subtitle_PartList;
    @FindBy(xpath="//label[text()='Search:']")
    WebElement txt_search;
    @FindBy(xpath="//label[text()='Search:']/following::input[1]")
    WebElement txtbox_search;
    @FindBy(xpath = "//div[text()='New Part']")
    WebElement label_NewPart;

    @FindBy(xpath = "//div[text()='New Part']/following::span[2]")
    WebElement asterick_Part;

    @FindBy(xpath = "//div[text()='New Part']/following::label[1]")
    WebElement label_Part1;

    @FindBy(xpath = "//div[text()='New Part']/following::input[1]")
    WebElement txt_part1;

    @FindBy(xpath = "(//label[text()='Part #:']/following::span)[4]")
    WebElement asterisk_description;

    @FindBy(xpath = "(//label[text()='Description:'])[1]")
    WebElement label_description;

    @FindBy(xpath = "(//label[text()='Description:']/following::input)[1]")
    WebElement txt_description;

    @FindBy(xpath = "//div[text()='New Part']/following::span[9]")
    WebElement asterisk_stockingUOM;

    @FindBy(xpath = "(//label[text()='Stocking UOM:'])[1]")
    WebElement label_stockingUOM;

    @FindBy(xpath = "(//label[text()='Stocking UOM:'])[1]/following::select[1]")
    WebElement dropdwn_stockingUOM;

    @FindBy(xpath = "(//label[text()='Stocking UOM:'])[1]/following::input[1]")
    WebElement checkbox_stockingUOM;

    @FindBy(xpath = "//label[text()='Stock Part']")
    WebElement label_stockPart;

    @FindBy(xpath = "//label[text()='Stock Part']/following::span[2]")
    WebElement asterisk_product;

    @FindBy(xpath = "(//label[text()='Product Group:'])[1]")
    WebElement label_productGroup;

    @FindBy(xpath = "(//label[text()='Product Group:'])[1]/following::select[1]")
    WebElement dropdwn_productGroup;

    @FindBy(xpath = "(//label[text()='Product Group:'])[1]/following::span[3]")
    WebElement asterisk_cost;

    @FindBy(xpath = "(//label[text()='Cost:'])[1]")
    WebElement label_cost;

    @FindBy(xpath = "(//label[text()='Cost:'])[1]/following::input[1]")
    WebElement txt_cost;

    @FindBy(xpath = "(//span[text()='Cancel'])[1]")
    WebElement btn_cancle;

    @FindBy(xpath = "//span[contains(text(),'Create Part')]")
    List<WebElement> btn_createpart;
    @FindBy(xpath = "//span[text()='Refresh']")
    WebElement btn_refresh;
    @FindBy(xpath = "//span[text()='Active']/following::td[1]/span/a")
    WebElement hyperlink_partNumber;

    @FindBy(xpath="//div[contains(@id,'psl2::c')]")
    WebElement part_name;
    @FindBy(xpath="//span[contains(@id,'ol1')]")
    WebElement label_part;
    @FindBy(xpath="//span[contains(@id,'ol2')]")
    WebElement label_Description;
    @FindBy(xpath="//span[contains(@id,'ol4')]")
    WebElement label_product_Group;
    @FindBy(xpath="//span[contains(@id,'ol6')]")
    WebElement label_onHands;
    @FindBy(xpath="(//span[contains(@id,'it5')])[1]")
    WebElement value_onHands;
    @FindBy(xpath="(//div[contains(@id,'cb2')])[2]")
    WebElement tab_Update;
    @FindBy(xpath="//div[contains(@id,'cbCancel')]")
    WebElement tab_cancle;
    @FindBy(xpath="//div[contains(@id,'ctbSaveExit')]")
    WebElement tab_saveExit;
    @FindBy(xpath="//div[contains(@id,'ctbMoreInfo')]")
    WebElement tab_moreInfo;
    @FindBy(xpath="(//td[contains(@id,'pw2::tb')])[2]")
    WebElement name_upDateOnhand;
    @FindBy(xpath="(//label[text()='Onhands:'])[2]")
    WebElement label_onHand;
    @FindBy(xpath="(//label[text()='Onhands:'])[2]/following::input[1]")
    WebElement txtbox_onhand;
    @FindBy(xpath="//div[contains(@id,'cb4')]")
    WebElement cancle_btn;
    @FindBy(xpath="//div[contains(@id,'cb5')]")
    WebElement update_btn;
    @FindBy(xpath="//div[contains(@id,'pw3::_ttxt')]")
    WebElement nameOfPart;
    @FindBy(xpath="//h1[text()='Part Number - Description']")
    WebElement title_PartNumber;
    @FindBy(xpath="//h2[text()='Part Settings']")
    WebElement subtitle_PartSettings;
    @FindBy(xpath="//div[contains(@id,'cb14')]")
    WebElement tab_InitializeSerialNumber;
    @FindBy(xpath="(//div[contains(@id,'cbCancel')])[2]")
    WebElement btnCancle;
    @FindBy(xpath="//div[contains(@id,'cbOK')]")
    WebElement btnOk;
    @FindBy(xpath="//div[contains(@id,'pwSer::_ttxt')]")
    WebElement title_InitializeSerialNumberwithPart;
    @FindBy(xpath="//h1[text()='Warehouse Stock']")
    WebElement title_warehouseStock;
    @FindBy(xpath="//span[text()='Warehouse']")
    WebElement label_warehouse;
    @FindBy(xpath="//span[text()='On Hand Qty']")
    WebElement label_OnHandqty;
    @FindBy(xpath="//h1[text()='Serial Numbers']")
    WebElement title_serialNumbers;
    @FindBy(xpath="//div[contains(@id,'cb25')]")
    WebElement btn_add;
    @FindBy(xpath="//a[contains(@id,'trashButtonItemasserd')]")
    WebElement trash_btn;
    @FindBy(xpath="//th[contains(@id,'t2:c8')]")
    WebElement label_serialNumber;
    @FindBy(xpath="//th[contains(@id,'t2:c9')]")
    WebElement label_unitCost;
    @FindBy(xpath="//span[text()='Initialize']")
    WebElement btn_initialize;
    @FindBy(xpath="//div[contains(@id,'pw::_ttxt')]")
    WebElement title_AddSerialNumberforPart;
    @FindBy(xpath="//label[text()='Serial Number:']")
    WebElement label_SerialNumber;
    @FindBy(xpath="//label[text()='Serial Number:']/following::input[1]")
    WebElement txtbox_serialNumber;
    @FindBy(xpath="//label[text()='Unit Cost:']")
    WebElement txt_UnitCost;
    @FindBy(xpath="//label[text()='Unit Cost:']/following::input[1]")
    WebElement txtbox_UnitCost;
    @FindBy(xpath="(//span[text()='OK'])[2]")
    WebElement ok_btn;
    @FindBy(xpath="//td[text()='Physical Count']")
    WebElement PhysicalCount;
    @FindBy(xpath="//span[text()='Inventory Manager']")
    WebElement title_InventoryCount;
    @FindBy(xpath="//h1[text()='Open Counts']")
    WebElement subtitle_OpenCount;
    @FindBy(xpath="//div[contains(@id,'ctb1')]")
    WebElement btn_addNewCount;
    @FindBy(xpath="//div[contains(@id,'pw1::_ttxt')]")
    WebElement title_selectWarehouse;
    @FindBy(xpath="(//label[text()='Warehouse:'])[2]")
    WebElement label_warehouseofSelect;
    @FindBy(xpath="(//label[text()='Warehouse:'])[2]/following::select")
    WebElement select_Warehouse;
    @FindBy(xpath="//label[contains(@id,'pte1:sorCT_afrlblBy')]")
    WebElement txt_countType;
    @FindBy(xpath="//input[contains(@id,'sorCT:_0')]")
    WebElement radiobtn_standard;
    @FindBy(xpath="//input[contains(@id,'sorCT:_0')]/following::label[1]")
    WebElement txt_standard;
    @FindBy(xpath="//input[contains(@id,'sorCT:_1')]")
    WebElement radiobtn_serialized;
    @FindBy(xpath="//input[contains(@id,'sorCT:_1')]/following::label[1]")
    WebElement txt_serialized;
    @FindBy(xpath="//input[contains(@id,'sorCT:_2')]")
    WebElement radiobtn_tires;
    @FindBy(xpath="//input[contains(@id,'sorCT:_2')]/following::label[1]")
    WebElement txt_tires;
    @FindBy(xpath="//div[contains(@id,'cb78')]")
    WebElement cancleBtn;
    @FindBy(xpath="//div[contains(@id,'cb2')]")
    WebElement OKbtn;
    @FindBy(xpath="//div[contains(@id,'pw2::_ttxt')]")
    WebElement Count_number;
    @FindBy(xpath="//span[contains(@id,'ol3')]")
    WebElement txt_type;
    @FindBy(xpath="//span[contains(@id,'ol3')]/following::div[1]")
    WebElement value_type;
    @FindBy(xpath="//span[contains(@id,'ol2')]")
    WebElement txt_countLocation;
    @FindBy(xpath="//span[contains(@id,'ol2')]/following::div[1]")
    WebElement value_countLocation;
    @FindBy(xpath="//label[text()='Part#:']")
    WebElement txt_part;
    @FindBy(xpath="//input[contains(@id,'itSearchPartSelect::content')]")
    WebElement txtbox_part;
    @FindBy(xpath="//a[contains(@id,'cilF')]")
    WebElement part_searchicon;
    @FindBy(xpath="//label[text()='Quantity:']")
    WebElement txt_quantity;
    @FindBy(xpath="//label[text()='Quantity:']/following::input[1]")
    WebElement input_quantity;
    @FindBy(xpath="//div[contains(@id,'cbCount')]")
    WebElement btn_count;
    @FindBy(xpath =  "//li[contains(@class,'AFAutoSuggestItem')]")
    WebElement tooltip_part;
    @FindBy(xpath="(//label[text()='Warehouse:'])[2]/following::span[1]")
    WebElement warehouseName;
    @FindBy(xpath="//th[contains(@id,'t4:c1')]")
    WebElement col_part;
    @FindBy(xpath="//th[contains(@id,'t4:cDes')]")
    WebElement col_description;
    @FindBy(xpath="//th[contains(@id,'t4:c3')]")
    WebElement col_room;
    @FindBy(xpath="//th[contains(@id,'t4:c8')]")
    WebElement col_OnHand;
    @FindBy(xpath="//th[contains(@id,'t4:c7')]")
    WebElement col_count;
    @FindBy(xpath="//td[contains(@id,'t4:0:c8')]")
    WebElement count_10;
    @FindBy(xpath="//div[contains(@id,'cb22')]")
    WebElement btn_void;
    @FindBy(xpath="//div[contains(@id,'cb47')]")
    WebElement btn_ResortList;
    @FindBy(xpath="//div[contains(@id,'cb17')]")
    WebElement btn_PrintCountSheet;
    @FindBy(xpath="//div[contains(@id,'cb28')]")
    WebElement btn_saveExit;
    @FindBy(xpath="//div[contains(@id,'cb7')]")
    WebElement btn_post;
    @FindBy(xpath="//div[text()='Post Count']")
    WebElement label_postCount;
    @FindBy(xpath="//label[text()='Effective Date:']")
    WebElement txt_effectiveDate;
    @FindBy(xpath="//label[text()='Effective Date:']/following::input[1]")
    WebElement txtbox_effectiveDate;
    @FindBy(xpath="//label[text()='Notes:']")
    WebElement txt_note;
    @FindBy(xpath="//div[contains(@id,'cb9')]")
    WebElement BtnCancle;
    @FindBy(xpath="//div[contains(@id,'cb10')]")
    WebElement BtnPost;
    @FindBy(xpath="//td[text()='Counter Sale Manager']")
    WebElement subMenu_CounterSaleManager;
    @FindBy(xpath="//span[text()='Counter Sale Manager']")
    WebElement title_counterSaleManager;
    @FindBy(xpath="//h1[text()='To Be Invoiced']")
    WebElement subtitle_toBeInvoiced;
    @FindBy(xpath="//label[text()='Location:']")
    WebElement txt_location;
    @FindBy(xpath="//label[text()='Location:']/following::input[1]")
    WebElement txtbox_location;
    @FindBy(xpath="//div[contains(@id,'ctb1')]")
    WebElement btn_addNewCounterSale;
    @FindBy(xpath="//h1[text()='Sales List']")
    WebElement txt_salesList;
    @FindBy(xpath="//div[contains(@id,'ctbRfr')]")
    WebElement Btn_Refresh;
    @FindBy(xpath="//th[contains(@id,'c8')]")
    WebElement col_sale;
    @FindBy(xpath="//th[contains(@id,'c11')]")
    WebElement col_saleDate;
    @FindBy(xpath="//th[contains(@id,'t1:c3')]")
    WebElement col_customer;
    @FindBy(xpath="//th[contains(@id,'t1:c7')]")
    WebElement col_shipTo;
    @FindBy(xpath="//th[contains(@id,'t1:c9')]")
    WebElement customerPO;
    @FindBy(xpath="//td[contains(@id,'c8')]/span/a")
    List<WebElement> sale_number;
    @FindBy(xpath="//div[contains(@id,'cb4')]")
    WebElement void_btn;
    @FindBy(xpath="//div[contains(@id,'cb1')]")
    WebElement saveExit_btn;
    @FindBy(xpath="//div[contains(@id,'cbPKL')]")
    WebElement btn_PickList;
    @FindBy(xpath="//div[contains(@id,'cb8')]")
    WebElement btn_Estimate;
    @FindBy(xpath="//div[contains(@id,'cbCopy')]")
    WebElement btn_copy;
    @FindBy(xpath="//div[contains(@id,'cb2')]")
    WebElement btn_invoice;
    @FindBy(xpath="//div[contains(@id,'pw3::_ttxt')]")
    WebElement title_CounterSale;
    @FindBy(xpath="//h1[text()='Sale Items']")
    WebElement label_saleItem;
    @FindBy(xpath="//span[contains(@id,'issDet:0:ol3')]")
    WebElement partCounter;
    @FindBy(xpath="//input[contains(@id,'itSearchPartSelect::content')]")
    WebElement textbox_PartCounter;
    @FindBy(xpath="(//a[contains(@id,'cilF')])[2]")
    WebElement magnificientSearch_part;
    @FindBy(xpath="//label[text()='Quantity:']")
    WebElement text_QuantityCounter;
    @FindBy(xpath="//div[contains(@id,'insIQty')]")
    WebElement textbox_QuantityCounter;
    @FindBy(xpath="//div[contains(@id,'cbIssuePart')]")
    WebElement btn_AddCounter;
    @FindBy(xpath="(//div[contains(@id,'ctb1')])[2]")
    WebElement btn_newPartCounter;
    @FindBy(xpath="//div[contains(@id,'pwSN::_ttxt')]")
    WebElement title_selectSerialnumber;
    @FindBy(xpath="(//label[text()='Warehouse:'])[2]")
    WebElement txt_warehouse;
    @FindBy(xpath="(//label[text()='Warehouse:'])[2]/following::a[1]")
    WebElement warehouse_name;
    @FindBy(xpath="(//span[contains(@id,'ol4')])[2]")
    WebElement Part;
    @FindBy(xpath="(//span[contains(@id,'ol4')])[2]/following::div[1]")
    WebElement Partname;
    @FindBy(xpath="//span[contains(@id,'ol2')]")
    WebElement Description;
    @FindBy(xpath="//span[contains(@id,'ol2')]/following::div[1]")
    WebElement DescriptionName;
    @FindBy(xpath="//label[text()='On Hand:']")
    WebElement OnHand;
    @FindBy(xpath="//label[text()='On Hand:']/following::div[1]")
    WebElement onHand_value;
    @FindBy(xpath="//th[contains(@id,'tIssSN:ctiSN')]/div[2]/span")
    WebElement serialNumber;
    @FindBy(xpath="//th[contains(@id,'tIssSN:c10')]/div[2]/span")
    WebElement Receivedate;
    @FindBy(xpath="//th[contains(@id,'tIssSN:ctiSB')]/div/span")
    WebElement select;
    @FindBy(xpath="//input[contains(@id,'sbcSL::content')]")
    List<WebElement> checkbox;
    @FindBy(xpath="//div[contains(@id,'cbCancel')]")
    WebElement CancleBtn;
    @FindBy(xpath="//div[contains(@id,'cbOKIssue')]")
    WebElement IssueSelected;

    @FindBy(xpath="//span[text()='View Serial Numbers On Hand']")
    WebElement tab_ViewSerialNumbersOnHand;
    @FindBy(xpath="//div[contains(@id,'t1::db')]")
    WebElement noDataToDisplay;
    @FindBy(xpath="//div[contains(@id,'pwSerOh::_ttxt')]")
    WebElement title_ViewSerialNumbersOnHandForPart;
    @FindBy(xpath="//label[text()='Warehouse:']")
    WebElement Warehouse;
    @FindBy(xpath="//input[contains(@id,'itSearchWarehouseSelect::content')]")
    WebElement Warehouse_Name;
    @FindBy(xpath = "(//span[contains(@id,'si1')]/following::td)[4]")
    WebElement btn_signOut;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement inputbox_Username;

    @FindBy(xpath = "//h1[text()='Working...Please Wait']")
    List<WebElement> loder;


    public SerializedPartsOnPhysicalCounts(WebDriver driver){
        this.driver = driver;
        this.waitMethods = new WaitMethods(driver);
    }

    /*
         go to part master screen
     */
    public void gotoPartsMaster() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(Parts);
        WebElementActions.getActions(driver).clickElement(Parts);

        waitMethods.waitForElementToBeRefreshedAndClickable(PartMaster);
        WebElementActions.getActions(driver).clickElement(PartMaster);

    }
    /*
        verify title Part Master
     */
    public void verifytitlePartMaster() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(title_PartMaster);
        Assert.assertTrue(title_PartMaster.isDisplayed());
    }
    /*
        verify Part List
     */
    public void verifyPartList() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(subtitle_PartList);
        Assert.assertTrue(subtitle_PartList.isDisplayed());
    }
    /*
        verify new part button
     */
    public void verifyNewPartbtn() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(btn_newPart);
        Assert.assertTrue(btn_newPart.isDisplayed());
    }
    /*
        verify text search
     */
    public void verifySearch() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_search);
        Assert.assertTrue(txt_search.isDisplayed());
    }
    /*
         verify textbox search
     */
    public void verifyTextboxSearch() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(txtbox_search);
        Assert.assertTrue(txtbox_search.isDisplayed());
    }
    /*
         click on new part
     */
    public void clickOnNewPart() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(btn_newPart);
        WebElementActions.getActions(driver).clickElement(btn_newPart);

    }
    /**
     * Verify element of New Part Page
     */
    public void verifyNewPart() throws InterruptedException {

        waitMethods.waitForElementToBeRefreshedAndIsVisible(label_NewPart);
        Assert.assertTrue(label_NewPart.isDisplayed());
        Assert.assertTrue(asterick_Part.isDisplayed());
        Assert.assertTrue(label_Part1.isDisplayed());
        Assert.assertTrue(txt_part1.isDisplayed());
        Assert.assertTrue(asterisk_description.isDisplayed());
        Assert.assertTrue(label_description.isDisplayed());
        Assert.assertTrue(txt_description.isDisplayed());
        Assert.assertTrue(asterisk_stockingUOM.isDisplayed());
        Assert.assertTrue(label_stockingUOM.isDisplayed());
        Assert.assertTrue(dropdwn_stockingUOM.isDisplayed());
        Assert.assertTrue(checkbox_stockingUOM.isDisplayed());
        Assert.assertTrue(label_stockPart.isDisplayed());
        Assert.assertTrue(asterisk_product.isDisplayed());
        Assert.assertTrue(label_productGroup.isDisplayed());
        Assert.assertTrue(dropdwn_productGroup.isDisplayed());
        Assert.assertTrue(asterisk_cost.isDisplayed());
        Assert.assertTrue(label_cost.isDisplayed());
        Assert.assertTrue(txt_cost.isDisplayed());
        Assert.assertTrue(btn_cancle.isDisplayed());
        Assert.assertTrue(btn_createpart.get(0).isDisplayed());


        TestListener.saveScreenshotPNG(driver);
    }
    /**
     *  random Part Number
     */
    String partNumber = WebElementActions.getActions(driver).randomAlphaNumeric(10);

    /**
     * Enter part
     */

    public void enterPartNumber() throws InterruptedException {

        waitMethods.waitForElementToBeRefreshedAndClickable(txt_part1);
        WebElementActions.getActions(driver).inputText(txt_part1, partNumber);

        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * enter description
     */
    public void enterDescription() throws InterruptedException {

        waitMethods.waitForElementToBeRefreshedAndClickable(txt_description);
        WebElementActions.getActions(driver).inputText(txt_description, appProp57.getProperty("Partdescription"));

        TestListener.saveScreenshotPNG(driver);

    }
    /**
     * enter cost
     */
    public void enterCost() throws InterruptedException {

        waitMethods.waitForElementToBeRefreshedAndClickable(txt_cost);
        WebElementActions.getActions(driver).inputText(txt_cost, appProp57.getProperty("cost"));


        TestListener.saveScreenshotPNG(driver);
    }
    /**enter product group*/
    public void enterProductGroup() throws InterruptedException {
//
        waitMethods.waitForElementToBeRefreshedAndClickable(dropdwn_productGroup);
        WebElementActions.getActions(driver).elementSelectByVisibilityText(dropdwn_productGroup, appProp57.getProperty("productGroup"));

        waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);


    }
    /**
     * click on create part
     */
    public void clickOnCreatePart() throws InterruptedException {

        Thread.sleep(3000);
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,300)","");
        waitMethods.waitForElementToBeRefreshedAndClickable(btn_createpart.get(0));
//        Thread.sleep(3000);
        WebElementActions.getActions(driver).clickElement(btn_createpart.get(0));

        waitMethods.loadingWait(loder);

        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * enter part number in search field
     */
    public void enterPartNumberInSearchField() throws InterruptedException {

        waitMethods.waitForElementToBeRefreshedAndClickable(txtbox_search);
        WebElementActions.getActions(driver).inputText(txtbox_search,partNumber);

        waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }

    /**
     * click on part number Hyperlink
     */
    public void clickOnPartNumberHyperlink() throws InterruptedException {
          Thread.sleep(3000);
        waitMethods.waitForElementToBeRefreshedAndClickable(hyperlink_partNumber);
        WebElementActions.getActions(driver).clickElement(hyperlink_partNumber);

        waitMethods.loadingWait(loder);

        TestListener.saveScreenshotPNG(driver);
    }

    /*
        verify part name
     */
    public void verifypart_name() throws InterruptedException{
          waitMethods.waitForElementToBeRefreshedAndIsVisible(part_name);
        Assert.assertTrue(part_name.isDisplayed());
    }
    /*
        verify part
     */
    public void verifyPart() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(label_part);
        Assert.assertTrue(label_part.isDisplayed());
    }
    /*
         verify description
     */
    public void verifylabel_Description() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(label_Description);
        Assert.assertTrue(label_Description.isDisplayed());
    }
    /*
         verify product group
     */
    public void verifyProductGroup() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(label_product_Group);
        Assert.assertTrue(label_product_Group.isDisplayed());
    }
    /*
         verify onHands
     */
    public void verifylabel_onHands() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(label_onHands);
        Assert.assertTrue(label_onHands.isDisplayed());
    }
    /*
        verify value of onHands
     */
    public void verifyvalue_onHands() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(value_onHands);
        Assert.assertTrue(value_onHands.isDisplayed());
    }
    /*
         verify tab_Update
     */
    public void verify_Update() throws InterruptedException{
           waitMethods.waitForElementToBeRefreshedAndIsVisible(tab_Update);
        Assert.assertTrue(tab_Update.isDisplayed());
    }
    /*
         verify tab_cancle
     */
    public void verifytab_cancle() throws InterruptedException{
           waitMethods.waitForElementToBeRefreshedAndIsVisible(tab_cancle);
        Assert.assertTrue(tab_cancle.isDisplayed());
    }
    /*
         verify tab_saveExit
     */
    public void verifytab_saveExit() throws InterruptedException{
         waitMethods.waitForElementToBeRefreshedAndIsVisible(tab_saveExit);
        Assert.assertTrue(tab_saveExit.isDisplayed());
    }
    /*
        verify tab_moreInfo
     */
    public void verifytab_moreInfo() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(tab_moreInfo);
        Assert.assertTrue(tab_moreInfo.isDisplayed());
    }
    /*
         click on update tab
     */
    public void clickOnUpdateTab() throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndClickable(tab_Update);
        WebElementActions.getActions(driver).clickElement(tab_Update);

        waitMethods.loadingWait(loder);

        TestListener.saveScreenshotPNG(driver);
    }
    /*
           verify name of part
     */
    public void verifyname_upDateOnhand() throws InterruptedException{
          waitMethods.waitForElementToBeRefreshedAndIsVisible(name_upDateOnhand);
        Assert.assertTrue(name_upDateOnhand.isDisplayed());
    }
    /*
        verify onHand
     */
    public void verifylabel_onHand() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(label_onHand);
        Assert.assertTrue(label_onHand.isDisplayed());
    }
    /*
         verify textbox onhand
     */
    public void verifytxtbox_onhand() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(txtbox_onhand);
        Assert.assertTrue(txtbox_onhand.isDisplayed());
    }
    /*
        verify cancle button
     */
    public void verifycancle_btn() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(cancle_btn);
        Assert.assertTrue(cancle_btn.isDisplayed());
    }
    /*
         verify update button
     */
    public void verifyupdate_btn() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(update_btn);
        Assert.assertTrue(update_btn.isDisplayed());
    }
    /*
         enter value in onhand field
     */
    public void enterOnhandValue() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(txtbox_onhand);
        WebElementActions.getActions(driver).inputText(txtbox_onhand, appProp57.getProperty("onhand"));

    }
    /*
         click on update
     */
    public void clickOnUpdate() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(update_btn);
        WebElementActions.getActions(driver).clickElement(update_btn);

        waitMethods.loadingWait(loder);

        TestListener.saveScreenshotPNG(driver);
    }
    /*
         click on save and exit button
     */
    public void clickSaveExitbtn() throws InterruptedException {
         waitMethods.waitForElementToBeRefreshedAndClickable(tab_saveExit);
        WebElementActions.getActions(driver).clickElement(tab_saveExit);

        waitMethods.loadingWait(loder);

        TestListener.saveScreenshotPNG(driver);
    }
    /*
         click on more info
     */
    public void clickOnMoreinfo() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(tab_moreInfo);
        WebElementActions.getActions(driver).clickElement(tab_moreInfo);

        waitMethods.loadingWait(loder);

        TestListener.saveScreenshotPNG(driver);
    }
    /*
         verify name Of Part
     */
    public void verifyNameOfPart() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(nameOfPart);
        Assert.assertTrue(nameOfPart.isDisplayed());
    }
    /*
       verify title Part Number
     */
    public void verifyTitle_PartNumber() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(title_PartNumber);
        Assert.assertTrue(title_PartNumber.isDisplayed());
    }

    /*
        verify subtitle Part Settings
     */
    public void verifySubtitle_PartSettings() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(subtitle_PartSettings);
        Assert.assertTrue(subtitle_PartSettings.isDisplayed());
    }
    /*
          verify tab Initialize Serial Number
     */
    public void verifytab_InitializeSerialNumber() throws InterruptedException{
         waitMethods.waitForElementToBeRefreshedAndIsVisible(tab_InitializeSerialNumber);
        Assert.assertTrue(tab_InitializeSerialNumber.isDisplayed());
    }
    /*
       verify btn Cancle
     */
   public void verifybtnCancle() throws InterruptedException{
          waitMethods.waitForElementToBeRefreshedAndIsVisible(btnCancle);
        Assert.assertTrue(btnCancle.isDisplayed());
    }
    /*
        verify btn Ok
     */
    public void verifybtnOk() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(btnOk);
        Assert.assertTrue(btnOk.isDisplayed());
    }
    /*
         click on tab Initialize Serial Number
     */
    public void clickOnInitializeSerialNumber() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndClickable(tab_InitializeSerialNumber);
        WebElementActions.getActions(driver).clickElement(tab_InitializeSerialNumber);

        waitMethods.loadingWait(loder);

        TestListener.saveScreenshotPNG(driver);
    }
    /*
        verify title Initialize Serial Number with Part
     */
    public void verifytitle_InitializeSerialNumberwithPart() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(title_InitializeSerialNumberwithPart);
        Assert.assertTrue(title_InitializeSerialNumberwithPart.isDisplayed());
    }
    /*
         verify title warehouse Stock
     */
    public void verifytitle_warehouseStock() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(title_warehouseStock);
        Assert.assertTrue(title_warehouseStock.isDisplayed());
    }
    /*
        verify label warehouse
     */
    public void verifylabel_warehouse() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(label_warehouse);
        Assert.assertTrue(label_warehouse.isDisplayed());
    }
    /*
        verify label On Hand Qty
     */
    public void verifylabel_OnHandqty() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(label_OnHandqty);
        Assert.assertTrue(label_OnHandqty.isDisplayed());
    }
    /*
         verify title serial Numbers
     */
    public void verifytitle_serialNumbers() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(title_serialNumbers);
        Assert.assertTrue(title_serialNumbers.isDisplayed());
    }
    /*
        verify button add
     */
    public void verifybtn_add() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(btn_add);
        Assert.assertTrue(btn_add.isDisplayed());
    }
    /*
        verify trash button
     */
    public void verifytrash_btn() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(trash_btn);
        Assert.assertTrue(trash_btn.isDisplayed());
    }
    /*
        verify label serial Number
     */
    public void verifylabel_serialNumber() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(label_serialNumber);
        Assert.assertTrue(label_serialNumber.isDisplayed());
    }
    /*
          verify label unit Cost
     */
    public void verifylabel_unitCost() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(label_unitCost);
        Assert.assertTrue(label_unitCost.isDisplayed());
    }
    /*
         verify button initialize
     */
    public void verifybtn_initialize() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(btn_initialize);
        Assert.assertTrue(btn_initialize.isDisplayed());
    }
    /*
        click on Add button
     */
    public void clickOnAddBtn() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndClickable(btn_add);
        WebElementActions.getActions(driver).clickElement(btn_add);

        waitMethods.loadingWait(loder);

        TestListener.saveScreenshotPNG(driver);
    }
    /*
          verify title Add Serial Number for Part
     */
    public void verifytitle_AddSerialNumberforPart() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(title_AddSerialNumberforPart);
        Assert.assertTrue(title_AddSerialNumberforPart.isDisplayed());
    }
    /*
         verify label_SerialNumber
     */
    public void verifylabel_SerialNumber() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(label_SerialNumber);
        Assert.assertTrue(label_SerialNumber.isDisplayed());
    }
    /*
          verify textbox serial Number
     */
    public void verifytxtbox_serialNumber() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(txtbox_serialNumber);
        Assert.assertTrue(txtbox_serialNumber.isDisplayed());
    }
    /*
        verify text Unit Cost
     */
    public void verifytxt_UnitCost() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_UnitCost);
        Assert.assertTrue(txt_UnitCost.isDisplayed());
    }
    /*
          verify textbox Unit Cost
     */
    public void verifytxtbox_UnitCost() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(txtbox_UnitCost);
        Assert.assertTrue(txtbox_UnitCost.isDisplayed());
    }
    /*
         enter serial number
     */
    public void enterSerialNumber() throws InterruptedException{

        String serialNumber = String.valueOf(WebElementActions.getActions(driver).randomNumber(100,1000));

        waitMethods.waitForElementToBeRefreshedAndClickable(txtbox_serialNumber);
        WebElementActions.getActions(driver).inputText(txtbox_serialNumber, serialNumber);

    }
    /*
         enter unit cost
     */
    public void enterUnitCost() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndClickable(txtbox_UnitCost);
        WebElementActions.getActions(driver).inputText(txtbox_UnitCost, "100");
    }
    /*
          click on Ok button
     */
    public void clickOK() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndClickable(ok_btn);
        WebElementActions.getActions(driver).clickElement(ok_btn);

        waitMethods.loadingWait(loder);

        TestListener.saveScreenshotPNG(driver);
    }
    /*
        click on initialize
     */
    public void clickOnInitialize() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndClickable(btn_initialize);
        WebElementActions.getActions(driver).clickElement(btn_initialize);

        waitMethods.loadingWait(loder);

        TestListener.saveScreenshotPNG(driver);
    }
    /*
          click on Ok button
     */
    public void clickOnOkButton() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndClickable(btnOk);
        WebElementActions.getActions(driver).clickElement(btnOk);

        waitMethods.loadingWait(loder);

        TestListener.saveScreenshotPNG(driver);
    }
    /*
          go to Physical Count Screen
     */
    public void gotoPhysicalCountScreen() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndClickable(Parts);
        WebElementActions.getActions(driver).clickElement(Parts);

        waitMethods.waitForElementToBeRefreshedAndClickable(PhysicalCount);
        WebElementActions.getActions(driver).clickElement(PhysicalCount);
    }
    /*
         verify Inventory Count
     */
    public void verifyInventoryCount() throws InterruptedException{
         waitMethods.waitForElementToBeRefreshedAndIsVisible(title_InventoryCount);
        Assert.assertTrue(title_InventoryCount.isDisplayed());
    }
    /*
        verify subtitle OpenCount
     */
    public void verifysubtitle_OpenCount() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(subtitle_OpenCount);
        Assert.assertTrue(subtitle_OpenCount.isDisplayed());
    }
    /*
       verify btn_addNewCount
     */
    public void verifybtn_addNewCount() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(btn_addNewCount);
        Assert.assertTrue(btn_addNewCount.isDisplayed());
    }
    /*
        click on add new count button
     */
    public void clickOnAddNewCount() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndClickable(btn_addNewCount);
        WebElementActions.getActions(driver).clickElement(btn_addNewCount);

        waitMethods.loadingWait(loder);

        TestListener.saveScreenshotPNG(driver);
    }
    /*
         verify title select warehouse
     */
    public void verifytitle_selectWarehouse() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(title_selectWarehouse);
        Assert.assertTrue(title_selectWarehouse.isDisplayed());
    }
   /*
       verify warehouse with dropdown
    */
    public void verifyWarehouse() throws InterruptedException{
         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_warehouseofSelect);
        Assert.assertTrue(label_warehouseofSelect.isDisplayed());
        Assert.assertTrue(select_Warehouse.isDisplayed());
    }
    /*
         verify count type
     */
    public void verifyCountType() throws InterruptedException{
       waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_countType);
        Assert.assertTrue(txt_countType.isDisplayed());
    }
    /*
        verify radio button of standard
     */
    public void verifyRadioStandard() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(radiobtn_standard);
        Assert.assertTrue(radiobtn_standard.isDisplayed());
        Assert.assertTrue(txt_standard.isDisplayed());

    }
    /*
        verify radio button of serialized
     */
    public void verifySerialized() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(radiobtn_serialized);
        Assert.assertTrue(radiobtn_serialized.isDisplayed());
        Assert.assertTrue(txt_serialized.isDisplayed());
    }
    /*
        verify radio button of tires
     */
    public void verifyTires() throws InterruptedException{
         waitMethods.waitForElementToBeRefreshedAndIsVisible(radiobtn_tires);
        Assert.assertTrue(radiobtn_tires.isDisplayed());
        Assert.assertTrue(txt_tires.isDisplayed());
    }
    /*
         verify cancle and ok
     */
    public void verifyCancle_Ok() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(cancleBtn);
        Assert.assertTrue(cancleBtn.isDisplayed());
        Assert.assertTrue(OKbtn.isDisplayed());
    }
    /*
         click on ok button
     */
    public void clickOnOK() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndClickable(OKbtn);
        WebElementActions.getActions(driver).clickElement(OKbtn);

        waitMethods.loadingWait(loder);

        TestListener.saveScreenshotPNG(driver);
    }
    /*
         verify count number
     */
    public void verifyCountNumber() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(Count_number);
        Assert.assertTrue(Count_number.isDisplayed());
    }

    /*
        verify type
     */
    public void verifyType() throws InterruptedException{
       waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_type);
        Assert.assertTrue(txt_type.isDisplayed());
        Assert.assertTrue(value_type.isDisplayed());
    }
    /*
         verify count location
     */
    public void verifyCountLocation() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_countLocation);
        Assert.assertTrue(txt_countLocation.isDisplayed());
        Assert.assertTrue(value_countLocation.isDisplayed());
    }
    /*
        verify part
     */
    public void verifyPartsection() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_part);
        Assert.assertTrue(txt_part.isDisplayed());
        Assert.assertTrue(txtbox_part.isDisplayed());
        Assert.assertTrue(part_searchicon.isDisplayed());
    }
    /*
         verify quantity
     */
    public void verifyQuantity() throws InterruptedException{
          waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_quantity);
        Assert.assertTrue(txt_quantity.isDisplayed());
        Assert.assertTrue(input_quantity.isDisplayed());
        Assert.assertTrue(btn_count.isDisplayed());
    }
    /*
          enter part in part field
     */
    public void enterPartinField() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndClickable(txtbox_part);
        WebElementActions.getActions(driver).inputText(txtbox_part,partNumber);
        Thread.sleep(2000);
        WebElementActions.getActions(driver).clickElement(tooltip_part);
    }
    /*
         change count to 10
     */
    public void changeCount() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndClickable(input_quantity);
        WebElementActions.getActions(driver).inputText(input_quantity,"10");
    }
    /*
         click on count
     */
    public void clickOnCount() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndClickable(btn_count);
        WebElementActions.getActions(driver).clickElement(btn_count);

        waitMethods.loadingWait(loder);

        TestListener.saveScreenshotPNG(driver);
    }
    /*
         verify name of warehouse
     */
    public void verifyWarehouseName() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(label_warehouseofSelect);
        Assert.assertTrue(label_warehouseofSelect.isDisplayed());
        Assert.assertTrue(warehouseName.isDisplayed());
    }
    /*
       verify part name in the table
     */
    public void verifypartEntry() throws InterruptedException{
         waitMethods.waitForElementToBeRefreshedAndIsVisible(col_part);
         Assert.assertTrue(col_part.isDisplayed());
         Assert.assertTrue(col_description.isDisplayed());
         Assert.assertTrue(col_room.isDisplayed());
         Assert.assertTrue(col_OnHand.isDisplayed());
         Assert.assertTrue(col_count.isDisplayed());
         Assert.assertTrue(count_10.isDisplayed());

    }
    /*
        verify buttons present at the end of the page
     */
    public void verifybuttons() throws InterruptedException{
         waitMethods.waitForElementToBeRefreshedAndIsVisible(btn_void);
         Assert.assertTrue(btn_void.isDisplayed());
        Assert.assertTrue(btn_ResortList.isDisplayed());
        Assert.assertTrue(btn_PrintCountSheet.isDisplayed());
        Assert.assertTrue(btn_saveExit.isDisplayed());
        Assert.assertTrue(btn_post.isDisplayed());
    }
    /*
        click on post button
     */
    public void ClickOnpost() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndClickable(btn_post);
        WebElementActions.getActions(driver).clickElement(btn_post);

        waitMethods.loadingWait(loder);

        TestListener.saveScreenshotPNG(driver);
    }
    /*
         verify post count
     */
    public void verifyPostCount() throws InterruptedException{
         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_postCount);
         Assert.assertTrue(label_postCount.isDisplayed());
         Assert.assertTrue(txt_effectiveDate.isDisplayed());
         Assert.assertTrue(txtbox_effectiveDate.isDisplayed());
         Assert.assertTrue(txt_note.isDisplayed());
         Assert.assertTrue(BtnCancle.isDisplayed());
         Assert.assertTrue(BtnPost.isDisplayed());
    }
    /*
        click post button
     */
    public void clickPostButton() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndClickable(BtnPost);
        WebElementActions.getActions(driver).clickElement(BtnPost);

        waitMethods.loadingWait(loder);

        TestListener.saveScreenshotPNG(driver);
    }
    /*
          go to counter sale screen
     */
    public void gotoCounterSaleScreen() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndClickable(Parts);
        WebElementActions.getActions(driver).clickElement(Parts);

        waitMethods.waitForElementToBeRefreshedAndClickable(subMenu_CounterSaleManager);
        WebElementActions.getActions(driver).clickElement(subMenu_CounterSaleManager);

        waitMethods.loadingWait(loder);

        TestListener.saveScreenshotPNG(driver);
    }
    /*
        verify title Counter sale
     */
    public void verifyCounterSale() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(title_counterSaleManager);
        Assert.assertTrue(title_counterSaleManager.isDisplayed());
    }
    /*
        verify subtitle to Be Invoiced
     */
    public void verifysubtitle_toBeInvoiced() throws InterruptedException{
         waitMethods.waitForElementToBeRefreshedAndIsVisible(subtitle_toBeInvoiced);
        Assert.assertTrue(subtitle_toBeInvoiced.isDisplayed());
    }
    /*
         verify text location
     */
    public void verifytxt_location() throws InterruptedException{
          waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_location);
          Assert.assertTrue(txt_location.isDisplayed());
          Assert.assertTrue(txtbox_location.isDisplayed());
          Assert.assertTrue(btn_addNewCounterSale.isDisplayed());
          Assert.assertTrue(txt_salesList.isDisplayed());
          Assert.assertTrue(Btn_Refresh.isDisplayed());
    }
    /*
        verify sale list table column name
     */
    public void verifySaleListTableColumn() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(col_sale);
        Assert.assertTrue(col_sale.isDisplayed());
        Assert.assertTrue(col_saleDate.isDisplayed());
        Assert.assertTrue(col_customer.isDisplayed());
        Assert.assertTrue(col_shipTo.isDisplayed());
        Assert.assertTrue(customerPO.isDisplayed());
        Assert.assertTrue(sale_number.get(0).isDisplayed());

    }
    /*
        click on new sale number
     */
    public void clickOnnewSaleNumber() throws InterruptedException{
        Thread.sleep(3000);
        waitMethods.waitForElementToBeRefreshedAndClickable(sale_number.get(0));
        WebElementActions.getActions(driver).clickElement(sale_number.get(0));

        waitMethods.loadingWait(loder);

        TestListener.saveScreenshotPNG(driver);
    }
    /*
       verify counter sale
     */
    public void verifyCounterSalePage() throws InterruptedException{
          waitMethods.waitForElementToBeRefreshedAndIsVisible(title_CounterSale);
          Assert.assertTrue(title_CounterSale.isDisplayed());
          Assert.assertTrue(label_saleItem.isDisplayed());
    }

    /*
         verify part in sale item
     */
    public void verifypartInSale() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(partCounter);
        Assert.assertTrue(partCounter.isDisplayed());
        Assert.assertTrue(textbox_PartCounter.isDisplayed());
        Assert.assertTrue(magnificientSearch_part.isDisplayed());
        Assert.assertTrue(text_QuantityCounter.isDisplayed());
        Assert.assertTrue(textbox_QuantityCounter.isDisplayed());
        Assert.assertTrue(btn_AddCounter.isDisplayed());
        Assert.assertTrue(btn_newPartCounter.isDisplayed());
    }
    /*
        verify buttons present on counter sale page
     */
    public void verifyButtons() throws InterruptedException{
         waitMethods.waitForElementToBeRefreshedAndIsVisible(void_btn);
         Assert.assertTrue(void_btn.isDisplayed());
         Assert.assertTrue(saveExit_btn.isDisplayed());
         Assert.assertTrue(btn_PickList.isDisplayed());
         Assert.assertTrue(btn_Estimate.isDisplayed());
         Assert.assertTrue(btn_copy.isDisplayed());
         Assert.assertTrue(btn_invoice.isDisplayed());
    }
    /*
        enter Part
     */
    public void enterPart() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndClickable(textbox_PartCounter);
        WebElementActions.getActions(driver).inputText(textbox_PartCounter,partNumber);
        Thread.sleep(2000);
        WebElementActions.getActions(driver).clickElement(tooltip_part);

        waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }

    /*
        verify the select serial number
     */
      public void verifySelectSerialnumber() throws InterruptedException{
          waitMethods.waitForElementToBeRefreshedAndIsVisible(title_selectSerialnumber);
          Assert.assertTrue(title_selectSerialnumber.isDisplayed());
          Assert.assertTrue(txt_warehouse.isDisplayed());
          Assert.assertTrue(warehouse_name.isDisplayed());
          Assert.assertTrue(Part.isDisplayed());
          Assert.assertTrue(Partname.isDisplayed());
          Assert.assertTrue(Description.isDisplayed());
          Assert.assertTrue(DescriptionName.isDisplayed());
          Assert.assertTrue(OnHand.isDisplayed());
          Assert.assertTrue(onHand_value.isDisplayed());

    }
    /*
          verify serial number with checkbox
     */
    public void verifySerialNumber_Checkbox() throws InterruptedException{
         waitMethods.waitForElementToBeRefreshedAndIsVisible(serialNumber);
         Assert.assertTrue(serialNumber.isDisplayed());
         Assert.assertTrue(Receivedate.isDisplayed());
         Assert.assertTrue(select.isDisplayed());

         Assert.assertTrue(CancleBtn.isDisplayed());
         Assert.assertTrue(IssueSelected.isDisplayed());

    }
    /*
        click on checkbox of serial number
     */
    public void clickOnCheckBox() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(checkbox.get(0));
        Assert.assertTrue(checkbox.get(0).isDisplayed());

        Thread.sleep(8000);
        for(int i=0;i<checkbox.size();i++)
        {
            WebElementActions.getActions(driver).clickElement(checkbox.get(i));
        }
    }
    /*
         click on Issue Selected
     */
    public void clickIssueSelected() throws InterruptedException{
         waitMethods.waitForElementToBeRefreshedAndClickable(IssueSelected);
        WebElementActions.getActions(driver).clickElement(IssueSelected);

        waitMethods.loadingWait(loder);

        TestListener.saveScreenshotPNG(driver);
    }
    /*
        click on save and exit
     */
    public void clickSaveExit() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndClickable(saveExit_btn);
        WebElementActions.getActions(driver).clickElement(saveExit_btn);

        waitMethods.loadingWait(loder);

        TestListener.saveScreenshotPNG(driver);
    }
    /*
        click on View SerialNumber On Hand button
     */
    public void clickOnViewSerialNumberOnHand() throws InterruptedException{
          waitMethods.waitForElementToBeRefreshedAndClickable(tab_ViewSerialNumbersOnHand);
        WebElementActions.getActions(driver).clickElement(tab_ViewSerialNumbersOnHand);

        waitMethods.loadingWait(loder);

        TestListener.saveScreenshotPNG(driver);
    }
    /*
          verify View Serial Numbers On Hand For Part
     */
    public void verifyViewSerialNumbersOnHandForPart() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(title_ViewSerialNumbersOnHandForPart);
        Assert.assertTrue(title_ViewSerialNumbersOnHandForPart.isDisplayed());
    }
    /*
          verify warehouse name
     */
    public void verify_Warehouse() throws InterruptedException{
         waitMethods.waitForElementToBeRefreshedAndIsVisible(Warehouse);
         Assert.assertTrue(Warehouse.isDisplayed());
        Assert.assertTrue(Warehouse_Name.isDisplayed());
    }
    /*
        verify no data display
     */
    public void verifyNoDataToDisplay() throws InterruptedException{
          waitMethods.waitForElementToBeRefreshedAndIsVisible(noDataToDisplay);
          Assert.assertTrue(noDataToDisplay.isDisplayed());
    }
    /*
        click on close button
     */public void clickOnClosebtn() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndClickable(void_btn);
        WebElementActions.getActions(driver).clickElement(void_btn);

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












}
