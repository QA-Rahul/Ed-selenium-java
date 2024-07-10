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

public class MakeAndModelsBeComingInActiveLOTSVENTURES extends TestDriverActions {

    @FindBy(xpath = "//a[text()='Administration']")
    WebElement menu_Administration;
    @FindBy(xpath = "//td[text()='Standard Codes']")
    WebElement subMenu_StandardCodes;
    @FindBy(xpath = "//span[text()='Standard Codes']")
    WebElement title_StandardCodes;
    @FindBy(xpath = "//h1[text()='Things To Do']")
    WebElement txt_ThingsToDo;
    @FindBy(xpath ="//h1[text()='Repair Order Types']")
    WebElement title_RepairOrderTypes;
    @FindBy(xpath = "//div[contains(@id,'ctb2')]/descendant::span")
    WebElement btn_add;
    @FindBy(xpath = "//a[contains(@id,'pt1:cl2')]")
    WebElement link_ManageEquipmentCodes;
    @FindBy(xpath = "//div[contains(@id,'sdi1::ti::_afrTabCnt')]/descendant::a")
    WebElement tab_class;
    @FindBy(xpath = "//div[contains(@id,'sdi2::ti::_afrTabCnt')]/descendant::a")
    WebElement tab_type;
    @FindBy(xpath = "//div[contains(@id,'sdi12::ti::_afrTabCnt')]/descendant::a")
    WebElement tab_SubType;
    @FindBy(xpath = "//div[contains(@id,'sdi3::ti::_afrTabCnt')]/descendant::a")
    WebElement tab_MakesAndModel;
    @FindBy(xpath = "//div[contains(@id,'sdi4::ti::_afrTabCnt')]/descendant::a")
    WebElement tab_FeaturesAndValues;
    @FindBy(xpath = "//div[contains(@id,'sdi5::ti::_afrTabCnt')]/descendant::a")
    WebElement tab_BilingType;
    @FindBy(xpath = "//div[contains(@id,'sdi6::ti::_afrTabCnt')]/descendant::a")
    WebElement tab_PermitType;
    @FindBy(xpath = "//div[contains(@id,'sdi7::ti::_afrTabCnt')]/descendant::a")
    WebElement tab_UnavailableStatus;
    @FindBy(xpath = "//div[contains(@id,'sdi8::ti::_afrTabCnt')]/descendant::a")
    WebElement tab_FuelType;
    @FindBy(xpath = "//div[contains(@id,'sdi9::ti::_afrTabCnt')]/descendant::a")
    WebElement tab_ReadingType;
    @FindBy(xpath = "//div[contains(@id,'sdi10::ti::_afrTabCnt')]/descendant::a")
    WebElement tab_MaintainceGroups;
    @FindBy(xpath = "//div[contains(@id,'sdi11::ti::_afrTabCnt')]/descendant::a")
    WebElement tab_SRTGroups;
    @FindBy(xpath = "//div[contains(@id,'sdi14::ti::_afrTabCnt')]/descendant::a")
    WebElement tab_ComponentGroup;
    @FindBy(xpath = "//h1[text()='Class']")
    WebElement title_class;
    @FindBy(xpath = "//div[contains(@id,'ctb4')]/descendant::span")
    WebElement AddBtn;
    @FindBy(xpath = "//th[contains(@id,'t1:c2')]/descendant::span")
    WebElement col_code;
    @FindBy(xpath = "//th[contains(@id,'t1:c3')]/descendant::span")
    WebElement col_description;
    @FindBy(xpath ="//th[contains(@id,'t1:c4')]/descendant::span")
    WebElement col_Active;
    @FindBy(xpath = "//label[contains(@id,'sor3_afrlblBy')]")
    WebElement txt_MakeType;
    @FindBy(xpath = "//input[contains(@id,'sor3:_0')]")
    WebElement radio_Truck;
    @FindBy(xpath = "//label[text()='Truck']")
    WebElement txt_truck;
    @FindBy(xpath = "//input[contains(@id,'sor3:_1')]")
    WebElement radio_Trailer;
    @FindBy(xpath = "//label[text()='Trailer']")
    WebElement txt_Trailer;
    @FindBy(xpath = "//input[contains(@id,'sor3:_2')]")
    WebElement radio_Engine;
    @FindBy(xpath = "//label[text()='Engine']")
    WebElement txt_Engine;
    @FindBy(xpath = "//input[contains(@id,'sor3:_3')]")
    WebElement radio_Transmission;
    @FindBy(xpath = "//label[text()='Transmission']")
    WebElement txt_Transmission;
    @FindBy(xpath = "//input[contains(@id,'sor3:_4')]")
    WebElement radio_RearAxle;
    @FindBy(xpath = "//label[text()='Rear Axle']")
    WebElement txt_RearAxle;
    @FindBy(xpath = "//input[contains(@id,'sor3:_5')]")
    WebElement radio_Body;
    @FindBy(xpath = "//label[text()='Body']")
    WebElement txt_body;
    @FindBy(xpath = "//h1[text()='Makes']")
    WebElement txt_makes;
    @FindBy(xpath = "//th[contains(@id,'t21:c40')]/descendant::span")
    WebElement col_Name;
    @FindBy(xpath = "//th[contains(@id,'t21:c42')]/descendant::span")
    WebElement column_Active;
    @FindBy(xpath = "//td[contains(@id,'t21:1:c40')]")
    WebElement nameOf_Makes;
    @FindBy(xpath = "//td[contains(@id,'t21:1:c42')]")
    WebElement checkbox_SecondRow;
    @FindBy(xpath = "//td[contains(@id,'t21:3:c40')]")
    WebElement fourthRow_Makes;
    @FindBy(xpath = "//h1[text()='Feature Codes']")
    WebElement title_FeatureCodes;
    @FindBy(xpath = "//th[contains(@id,'t15:c34')]/descendant::span")
    WebElement col_Code;
    @FindBy(xpath = "//th[contains(@id,'t15:c32')]/descendant::span")
    WebElement col_Description;
    @FindBy(xpath = "//th[contains(@id,'t15:c33')]/descendant::span")
    WebElement col_active;
    @FindBy(xpath = "//td[contains(@id,'t15:3:c34')]")
    WebElement FeaturesAndValues_4Row;
    @FindBy(xpath = "//h1[contains(text(),'Feature Values:')]")
    WebElement title_FeatureValues;
    @FindBy(xpath = "//th[contains(@id,'t17:c37')]/descendant::span")
    WebElement FeatureValues_colValue;
    @FindBy(xpath = "//th[contains(@id,'t17:c36')]/descendant::span")
    WebElement FeaturesValues_colActive;
    @FindBy(xpath = "//td[contains(@id,'t17:2:c37')]")
    WebElement FeatureValue_column;
    @FindBy(xpath = "//td[contains(@id,'t17:2:c36')]")
    WebElement FeatureValue_ActiveColumn;
    @FindBy(xpath = "//h1[text()='Maintenance Groups']")
    WebElement title_MaintainceGroups;
    @FindBy(xpath = "//th[contains(@id,'t10:c18')]/descendant::span")
    WebElement maintaince_Code;
    @FindBy(xpath = "//th[contains(@id,'t10:c19')]/descendant::span")
    WebElement maintaince_Description;
    @FindBy(xpath = "//th[contains(@id,'t10:c20')]/descendant::span")
    WebElement maintaince_active;
    @FindBy(xpath = "//td[contains(@id,'t10:2:c18')]")
    WebElement maintaince_thirdRow;
    @FindBy(xpath = "//a[contains(@id,'pt1:cl3')]")
    WebElement link_managePartCodes;
    @FindBy(xpath = "//h1[text()='Product Groups']")
    WebElement txt_ProductGroups;
    @FindBy(xpath = "//th[contains(@id,'t1:c2')]/descendant::span")
    WebElement Product_Code;
    @FindBy(xpath = "//th[contains(@id,'t1:c3')]/descendant::span")
    WebElement Product_Description;
    @FindBy(xpath = "//th[contains(@id,'t1:c44')]/descendant::span")
    WebElement Product_Category;
    @FindBy(xpath = "(//th[contains(@id,'t1:c4')]/descendant::span)[2]")
    WebElement Product_Active;
    @FindBy(xpath = "//td[contains(@id,'t1:0:c2')]")
    WebElement Product_RowOne;
    @FindBy(xpath = "//td[contains(@id,'t1:0:c4')]/descendant::input")
    WebElement Product_Active_checkbox;
    @FindBy(xpath = "//span[text()='Sign Out']")
    WebElement btn_signOut;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement inputbox_Username;
    @FindBy(xpath = "//h1[text()='Working...Please Wait']")
    List<WebElement> loder;


    public MakeAndModelsBeComingInActiveLOTSVENTURES(WebDriver driver){
        this.driver = driver;
        this.waitMethods = new WaitMethods(driver);
    }

    /*
       go to Standard Codes Screen
     */
    public void gotoStandardCodesScreen() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(menu_Administration);
        WebElementActions.getActions(driver).clickElement(menu_Administration);

        waitMethods.waitForElementToBeRefreshedAndClickable(subMenu_StandardCodes);
        WebElementActions.getActions(driver).clickElement(subMenu_StandardCodes);

        waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /*
        verify title Standard Codes
     */
     public void verifyTitleStandardCodes() throws InterruptedException {
         waitMethods.waitForElementToBeRefreshedAndIsVisible(title_StandardCodes);
         Assert.assertTrue(title_StandardCodes.isDisplayed());
     }
    /*
      verify text Things To Do
   */
    public void verifytextThingsToDo() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_ThingsToDo);
        Assert.assertTrue(txt_ThingsToDo.isDisplayed());
    }
    /*
       verify title Repair Order Types
    */
    public void verifyTitleRepairOrderTypes() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(title_RepairOrderTypes);
        Assert.assertTrue(title_RepairOrderTypes.isDisplayed());
    }
    /*
        verify add button
     */
    public void verifyAddButton() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(btn_add);
        Assert.assertTrue(btn_add.isDisplayed());
    }
    /*
       verify link Manage Equipment Codes
    */
    public void verifyLinkManageEquipmentCodes() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(link_ManageEquipmentCodes);
        Assert.assertTrue(link_ManageEquipmentCodes.isDisplayed());
    }
    /*
       click on link Manage Equipment Codes
    */
    public void clickOnLinkManagementEquipmentCodes() throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndClickable(link_ManageEquipmentCodes);
        WebElementActions.getActions(driver).clickElement(link_ManageEquipmentCodes);
    }
    /*
        verify various tab in Standard Code
     */
     public void verifyVariousTab() throws InterruptedException{
         waitMethods.waitForElementToBeRefreshedAndIsVisible(tab_class);
         Assert.assertTrue(tab_class.isDisplayed());
         Assert.assertTrue(tab_type.isDisplayed());
         Assert.assertTrue(tab_SubType.isDisplayed());
         Assert.assertTrue(tab_MakesAndModel.isDisplayed());
         Assert.assertTrue(tab_FeaturesAndValues.isDisplayed());
         Assert.assertTrue(tab_BilingType.isDisplayed());
         Assert.assertTrue(tab_PermitType.isDisplayed());
         Assert.assertTrue(tab_UnavailableStatus.isDisplayed());
         Assert.assertTrue(tab_FuelType.isDisplayed());
         Assert.assertTrue(tab_ReadingType.isDisplayed());
         Assert.assertTrue(tab_MaintainceGroups.isDisplayed());
         Assert.assertTrue(tab_SRTGroups.isDisplayed());
         Assert.assertTrue(tab_ComponentGroup.isDisplayed());

    }
    /*
       verify title class
    */
     public void verifyTitleClass() throws InterruptedException{
         waitMethods.waitForElementToBeRefreshedAndIsVisible(title_class);
         Assert.assertTrue(title_class.isDisplayed());
    }
    /*
       verify add button
    */
     public void verifyAddBtn() throws InterruptedException{
         waitMethods.waitForElementToBeRefreshedAndIsVisible(AddBtn);
         Assert.assertTrue(AddBtn.isDisplayed());
    }
    /*
        verify class column
    */
     public void verifyClassColumn() throws InterruptedException{
         waitMethods.waitForElementToBeRefreshedAndIsVisible(col_code);
         Assert.assertTrue(col_code.isDisplayed());
         Assert.assertTrue(col_description.isDisplayed());
         Assert.assertTrue(col_Active.isDisplayed());
    }
    /*
       click on make and model
    */
     public void clickOnMakeandModel() throws InterruptedException{
         waitMethods.waitForElementToBeRefreshedAndClickable(tab_MakesAndModel);
         WebElementActions.getActions(driver).clickElement(tab_MakesAndModel);
    }
    /*
       verify radio button with names
    */
     public void verifyRadioButtonName() throws InterruptedException{
         waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_MakeType);
         Assert.assertTrue(txt_MakeType.isDisplayed());
         Assert.assertTrue(radio_Truck.isDisplayed());
         Assert.assertTrue(txt_truck.isDisplayed());
         Assert.assertTrue(radio_Trailer.isDisplayed());
         Assert.assertTrue(txt_Trailer.isDisplayed());
         Assert.assertTrue(radio_Engine.isDisplayed());
         Assert.assertTrue(txt_Engine.isDisplayed());
         Assert.assertTrue(radio_Transmission.isDisplayed());
         Assert.assertTrue(txt_Transmission.isDisplayed());
         Assert.assertTrue(radio_RearAxle.isDisplayed());
         Assert.assertTrue(txt_RearAxle.isDisplayed());
         Assert.assertTrue(radio_Body.isDisplayed());
         Assert.assertTrue(txt_body.isDisplayed());

     }
    /*
       verify title Makes
    */
     public void verifyTitleMakes() throws InterruptedException{
         waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_makes);
         Assert.assertTrue(txt_makes.isDisplayed());
    }
     /*
       verify column of makes table
    */
     public void verifyColumnOftable() throws InterruptedException{
         waitMethods.waitForElementToBeRefreshedAndIsVisible(col_Name);
         Assert.assertTrue(col_Name.isDisplayed());
         Assert.assertTrue(column_Active.isDisplayed());
    }
     /*
       verify name of makes and checkbox of second row
    */
     public void verifySecondRow() throws InterruptedException{
         waitMethods.waitForElementToBeRefreshedAndIsVisible(nameOf_Makes);
         Assert.assertTrue(nameOf_Makes.isDisplayed());
         Assert.assertTrue(checkbox_SecondRow.isDisplayed());
    }
     /*
        click on name of Makes
    */
     public void clickOfNameMakes() throws InterruptedException{
         waitMethods.waitForElementToBeRefreshedAndClickable(nameOf_Makes);
         WebElementActions.getActions(driver).clickElement(nameOf_Makes);
    }
     /*
       click on check box of second row name
    */
     public void clickOnCheckBoxSecondRow() throws InterruptedException{
         waitMethods.waitForElementToBeRefreshedAndClickable(checkbox_SecondRow);
         WebElementActions.getActions(driver).clickElement(checkbox_SecondRow);
    }
    /*
       click on fourth row
    */
     public void clickOnFourthRow() throws InterruptedException{
         waitMethods.waitForElementToBeRefreshedAndClickable(fourthRow_Makes);
         WebElementActions.getActions(driver).clickElement(fourthRow_Makes);
    }
    /*
       click on Features and Values tab
    */
     public void clickOnFeaturesAndValueTab() throws InterruptedException{
         waitMethods.waitForElementToBeRefreshedAndClickable(tab_FeaturesAndValues);
         WebElementActions.getActions(driver).clickElement(tab_FeaturesAndValues);
    }
    /*
       verify title Features Codes
    */
     public void verifyTitleFeaturesCodes() throws InterruptedException{
         waitMethods.waitForElementToBeRefreshedAndIsVisible(title_FeatureCodes);
         Assert.assertTrue(title_FeatureCodes.isDisplayed());
    }
    /*
       verify Feature Code Table column
    */
     public void verifyFeatureCodeTableCol() throws InterruptedException{
         waitMethods.waitForElementToBeRefreshedAndIsVisible(col_Code);
         Assert.assertTrue(col_Code.isDisplayed());
         Assert.assertTrue(col_Description.isDisplayed());
         Assert.assertTrue(col_active.isDisplayed());
    }
    /*
       click on Features and values of fourth row
    */
     public void clickOnFourthRowOfFeatures() throws InterruptedException{
         waitMethods.waitForElementToBeRefreshedAndClickable(FeaturesAndValues_4Row);
         WebElementActions.getActions(driver).clickElement(FeaturesAndValues_4Row);
    }
    /*
       verify title Features Values
    */
     public void verifyTitleFeaturesValues() throws InterruptedException{
         waitMethods.waitForElementToBeRefreshedAndIsVisible(title_FeatureValues);
         Assert.assertTrue(title_FeatureValues.isDisplayed());
    }
    /*
       verify Features Values table column
    */
     public void verifyFeaturesValueTableCol() throws InterruptedException{
         waitMethods.waitForElementToBeRefreshedAndIsVisible(FeatureValues_colValue);
         Assert.assertTrue(FeatureValues_colValue.isDisplayed());
         Assert.assertTrue(FeaturesValues_colActive.isDisplayed());

    }
    /*
       click on Value Column
    */
     public void clickOnValueColumn() throws InterruptedException{
         waitMethods.waitForElementToBeRefreshedAndClickable(FeatureValue_column);
         WebElementActions.getActions(driver).clickElement(FeatureValue_column);
    }
     /*
       click on Active Column of Features Value
    */
     public void clickOnActiveColumn() throws InterruptedException{
         waitMethods.waitForElementToBeRefreshedAndClickable(FeatureValue_ActiveColumn);
         WebElementActions.getActions(driver).clickElement(FeatureValue_ActiveColumn);
    }
    /*
       click on tab Maintaince Groups
    */
     public void clickOnTabMaintainceGroups() throws InterruptedException{
         waitMethods.waitForElementToBeRefreshedAndClickable(tab_MaintainceGroups);
         WebElementActions.getActions(driver).clickElement(tab_MaintainceGroups);
    }
    /*
       verify title Maintaince Groups
    */
     public void verifyTitleMaintaince() throws InterruptedException{
         waitMethods.waitForElementToBeRefreshedAndIsVisible(title_MaintainceGroups);
         Assert.assertTrue(title_MaintainceGroups.isDisplayed());
    }
    /*
       verify Maintaince Table column
    */
     public void verifyMaintainceTableColumn() throws InterruptedException{
         waitMethods.waitForElementToBeRefreshedAndIsVisible(maintaince_Code);
         Assert.assertTrue(maintaince_Code.isDisplayed());
         Assert.assertTrue(maintaince_Description.isDisplayed());
         Assert.assertTrue(maintaince_active.isDisplayed());
    }
    /*
       click on third row of maintaince
    */
     public void clickOnThirdRowOfMaintaince() throws InterruptedException{
         waitMethods.waitForElementToBeRefreshedAndClickable(maintaince_thirdRow);
         WebElementActions.getActions(driver).clickElement(maintaince_thirdRow);
    }
    /*
       click on link manage part codes
    */
     public void clickOnLinkManagePartCodes() throws InterruptedException{
         waitMethods.waitForElementToBeRefreshedAndClickable(link_managePartCodes);
         WebElementActions.getActions(driver).clickElement(link_managePartCodes);
    }
    /*
       verify title Product Groups
    */
     public void verifyTitleProductGroups() throws InterruptedException{
         waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_ProductGroups);
         Assert.assertTrue(txt_ProductGroups.isDisplayed());
    }
    /*
       verify Product Code table column
    */
     public void verifyProductCodeColumn() throws InterruptedException{
         waitMethods.waitForElementToBeRefreshedAndIsVisible(Product_Code);
         Assert.assertTrue(Product_Code.isDisplayed());
         Assert.assertTrue(Product_Description.isDisplayed());
         Assert.assertTrue(Product_Category.isDisplayed());
         Assert.assertTrue(Product_Active.isDisplayed());
    }
    /*
       verify first row of Product table
    */
     public void verifyFirstRow() throws InterruptedException{
         waitMethods.waitForElementToBeRefreshedAndIsVisible(Product_RowOne);
         Assert.assertTrue(Product_RowOne.isDisplayed());
    }
     /*
       verify active checkbox present on first row
    */
     public void verifyFirstCheckbox() throws InterruptedException{
         waitMethods.waitForElementToBeRefreshedAndIsVisible(Product_Active_checkbox);
         Assert.assertTrue(Product_Active_checkbox.isDisplayed());
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
