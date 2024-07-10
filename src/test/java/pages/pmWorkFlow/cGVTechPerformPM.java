package pages.pmWorkFlow;

import actions.WaitActions;
import actions.WebElementActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import tests.TestDriverActions;
import utils.TestListener;
import utils.WaitMethods;

import java.util.List;

public class cGVTechPerformPM extends TestDriverActions {


    @FindBy(xpath = "//span[text()='Scan Employee Badge']/following::input[1]")
    WebElement txt_scanEmployeeBadge;

    @FindBy(xpath = "//span[text()='Go']")
    public WebElement btn_GO;

    @FindBy(xpath = "//a[contains(.,'ASAP SHOP')]")
    public List<WebElement> txt_AsapShop;

    @FindBy(xpath = "(//span[text()='Select'])[1]")
    public WebElement btn_Select;


    @FindBy(xpath = "//span[contains(.,'Technician Portal')]")
    public WebElement label_TechnicianPortal;


    @FindBy(xpath = "//td[contains(.,'ASAP SHOP')]")
    public List<WebElement> label_LabourAsapShop;


    @FindBy(xpath = "//img[contains(@id,':0:ciAddVmrs::icon')]")
    public WebElement img_Add;


    @FindBy(xpath = "//img[contains(@id,':1:ciWorkRequired::icon')]")
    public WebElement img_AccessoriesGroup;


    @FindBy(xpath = "//label[text()='Select assigned work.']")
    public List<WebElement> txt_SelectAssignedWork;

    @FindBy(linkText = "More Work ...")
    public WebElement label_MoreWork;


    @FindBy(xpath = "//img[contains(@id,':cilvmrsys::icon')]")
    public WebElement label_AccseriesGroup;


    @FindBy(xpath = "//span[text()='More Units']")
    public WebElement btn_MoreUnits;


    @FindBy(xpath = "//input[contains(@id,':sqSu:dc_it1::content')]")
    public WebElement label_SearchTextArea;
    @FindBy(linkText = "More Work ...")
    public WebElement txt_MoreLinkText;
    @FindBy(xpath = "//input[contains(@id,'it1::content')]")
    public WebElement input_SearchTextArea;
    @FindBy(xpath = "//div[contains(@id,':phSerproIC::content')]//child::td//a/child::img")
    public WebElement img_PMInspection;
    @FindBy(xpath = "  //img[contains(@id,':0:ciAddSerproactIC::icon')]")
    public WebElement txt_PMInspection;
    @FindBy(xpath = "//img[contains(@id,':0:ciAddVmrs::icon')]")
    public WebElement img_ADD;
    @FindBy(xpath = "//span[text()='Add']")
    public WebElement btn_Add;
    @FindBy(xpath = "(//img[contains(@id,':ciWorkRequiredIC::icon')])[1]")
    public WebElement img_Images;

    @FindBy(xpath = "(//a[contains(.,'PM inspection.')])[1]")
    public WebElement txt_Hyperlink;
    @FindBy(xpath = "(//span[text()='Completed'])[1]")
    public List<WebElement> txt_Completed;
    @FindBy(xpath = "//span[text()='Close']")
    public WebElement btn_Close;
    @FindBy(xpath = "//span[text()='Area 100 Walkaround Exterior Inspection']")
    public WebElement box_WalkAroundExteriorInspectionBox;
    @FindBy(xpath = "(//label[contains(.,'Pass')]//..//input)[1]")
    public WebElement txt_CheckingAndInspectionMounting;
    @FindBy(xpath = "//input[contains(@id,':itValueText::content')]")
    public WebElement txt_ListTHeGPS;
    @FindBy(xpath = "(//span[contains(.,'List GPS')]//parent::td//following::table//span/input)[1]")
    public WebElement txt_TransmitTosDate;
    @FindBy(xpath = "//label[contains(.,'Pass')]//..//input[contains(@id,':3:sorValueCheck:')]")
    public WebElement txt_ConfirmTrailer;
    @FindBy(xpath = "//label[contains(.,'Pass')]//..//input[contains(@id,':4:sorValueCheck:')]")
    public WebElement txt_ConfirmTrailerLicensePlate;
    @FindBy(xpath = "//label[contains(.,'Pass')]//..//input[contains(@id,':5:sorValueCheck:')]")
    public WebElement txt_ConfirmTrailerValid;
    @FindBy(xpath = "//label[contains(.,'Pass')]//..//input[contains(@id,':6:sorValueCheck:')]")
    public WebElement txt_ScanBarCode;
    @FindBy(xpath = "//label[contains(.,'Pass')]//..//input[contains(@id,':7:sorValueCheck:')]")
    public WebElement txt_CheckAllFedEx;
    @FindBy(xpath = "//span[text()='Save and Exit']")
    public WebElement btn_SaveAndExit;
    @FindBy(xpath = "//span[text()='Work In Progress']/parent::div/following-sibling::div/span")
    public WebElement txt_NumberOfQuestionsAnswerResult;
    @FindBy(xpath = "//span[contains(.,'Show Error Only')]")
    public WebElement txt_ShowErrorOnly;
    @FindBy(xpath = "//label[contains(.,'Pass')]//..//input[contains(@id,':8:sorValueCheck:')]")
    public WebElement txt_CheckAllLights;
    @FindBy(xpath = "//label[contains(.,'Pass')]//..//input[contains(@id,':9:sorValueCheck:')]")
    public WebElement txt_InspectGland;
    @FindBy(xpath = "//label[contains(.,'Pass')]//..//input[contains(@id,':10:sorValueCheck:')]")
    public WebElement txt_CheckingBreakingSystem;
    @FindBy(xpath = "//label[contains(.,'Pass')]//..//input[contains(@id,':11:sorValueCheck:')]")
    public WebElement txt_CheckABSFunction;
    @FindBy(xpath = "//textarea[contains(@id,':tequins:11:it3::content')]")
    public WebElement input_CheckABSFunctionTextArea;
    @FindBy(xpath = "//label[contains(.,'Pass')]//..//input[contains(@id,':12:sorValueCheck:')]")
    public WebElement txt_InspectFront;
    @FindBy(xpath = "//label[contains(.,'Pass')]//..//input[contains(@id,':13:sorValueCheck:')]")
    public WebElement txt_InspectBack;
    @FindBy(xpath = "//label[contains(.,'Pass')]//..//input[contains(@id,':14:sorValueCheck:')]")
    public WebElement txt_CheckBodyForDamage;
    @FindBy(xpath = "//label[contains(.,'Pass')]//..//input[contains(@id,':15:sorValueCheck:')]")
    public WebElement txt_InspectMudFlag;
    @FindBy(xpath = "//label[contains(.,'Pass')]//..//input[contains(@id,':16:sorValueCheck:')]")
    public WebElement txt_InspectCondition;
    @FindBy(xpath = "//label[contains(.,'Pass')]//..//input[contains(@id,':17:sorValueCheck:')]")
    public WebElement txt_InspectDrop;
    @FindBy(xpath = "//label[contains(.,'Pass')]//..//input[contains(@id,':18:sorValueCheck:')]")
    public WebElement txt_InspectSafety;
    @FindBy(xpath = "//label[contains(.,'Pass')]//..//input[contains(@id,':19:sorValueCheck:')]")
    public WebElement txt_CheckAndOperate;
    @FindBy(xpath = "//label[contains(.,'Pass')]//..//input[contains(@id,':20:sorValueCheck:')]")
    public WebElement txt_InspectCracks;
    @FindBy(xpath = "//label[contains(.,'Pass')]//..//input[contains(@id,':21:sorValueCheck:')]")
    public WebElement txt_CheckAndLubricate;
    @FindBy(xpath = "//span[text()='Done / Validate']")
    public WebElement btn_DoneValidate;
    @FindBy(xpath = "//span[contains(.,'Inspect Rear Impact Guard in accordance')]")
    public WebElement box_InspectRearImpactGuard;
    @FindBy(xpath = "(//label[contains(.,'Pass')]//..//input)[1]")
    public WebElement txt_MissingGuard;
    @FindBy(xpath = "//label[contains(.,'Pass')]//..//input[contains(@id,':1:sorValueCheck:')]")
    public WebElement txt_GuardNotSecurely;
    @FindBy(xpath = "//label[contains(.,'Pass')]//..//input[contains(@id,':2:sorValueCheck:')]")
    public WebElement txt_GuardHorizontalMemberNotExtend;
    @FindBy(xpath = "//label[contains(.,'Pass')]//..//input[contains(@id,':3:sorValueCheck:')]")
    public WebElement txt_GuardHorizontalMemberMore;
    @FindBy(xpath = "//label[contains(.,'Pass')]//..//input[contains(@id,':4:sorValueCheck:')]")
    public WebElement txt_GuardHorizontalMemberMoreThan;
    @FindBy(xpath = "//label[contains(.,'Pass')]//..//input[contains(@id,':5:sorValueCheck:')]")
    public WebElement txt_GuardHorizontalMember;
    @FindBy(xpath = "//label[contains(.,'Pass')]//..//input[contains(@id,':6:sorValueCheck:')]")
    public WebElement txt_InspectRearImpactGuard;
    @FindBy(xpath = "//span[text()='Done / Validate']")
    public WebElement btn_DoneValidateButton;
    @FindBy(xpath = "//span[contains(.,'Under Vehicle Inspection')]")
    public WebElement box_UnderVehicle;
    @FindBy(xpath = "(//label[contains(.,'Pass')]//..//input)[1]")
    public WebElement txt_InspectKingPin;
    @FindBy(xpath = "//label[contains(.,'Pass')]//..//input[contains(@id,':1:sorValueCheck:')]")
    public WebElement txt_InspectLandingGear;
    @FindBy(xpath = "//label[contains(.,'Pass')]//..//input[contains(@id,':2:sorValueCheck:')]")
    public WebElement txt_OperateLAndLandingGear;
    @FindBy(xpath = "//label[contains(.,'Pass')]//..//input[contains(@id,':3:sorValueCheck:')]")
    public WebElement txt_InspectCrossMember;
    @FindBy(xpath = "//label[contains(.,'Pass')]//..//input[contains(@id,':4:sorValueCheck:')]")
    public WebElement txt_InspectFrameCracks;
    @FindBy(xpath = "//span[text()='Done / Validate']")
    public WebElement btn_UnderTheVehicleButton;
    @FindBy(xpath = "//span[contains(.,'Foundation Brake Inspection ')]")
    public WebElement box_FoundationBrakeInspection;

    @FindBy(xpath = "//label[contains(.,'Pass')]//..//input[contains(@id,':0:sorValueCheck:')]")
    public WebElement txt_CheckAndLubricateSlack;

    @FindBy(xpath = "//label[contains(.,'Pass')]//..//input[contains(@id,':1:sorValueCheck:')]")
    public WebElement txt_CheckANdLubricateInboard;

    @FindBy(xpath = "//label[contains(.,'Pass')]//..//input[contains(@id,':2:sorValueCheck:')]")
    public WebElement txt_CheckAndLubricateSlackAdjuster;

    @FindBy(xpath = "//label[contains(.,'Pass')]//..//input[contains(@id,':3:sorValueCheck:')]")
    public WebElement txt_InspectConditionBrake;

    @FindBy(xpath = "//label[contains(.,'Pass')]//..//input[contains(@id,':4:sorValueCheck:')]")
    public WebElement txt_InspectBrakeChamber;

    @FindBy(xpath = "//label[contains(.,'Pass')]//..//input[contains(@id,':5:sorValueCheck:')]")
    public WebElement txt_InspectConditionOfBrakeLining;

    @FindBy(xpath = "//label[contains(.,'Pass')]//..//input[contains(@id,':6:sorValueCheck:')]")
    public WebElement txt_CheckBrakeLiningToDrum;

    @FindBy(xpath = "//label[contains(.,'Pass')]//..//input[contains(@id,':7:sorValueCheck:')]")
    public WebElement txt_ChargeAirSystem;

    @FindBy(xpath = "//label[contains(.,'Pass')]//..//input[contains(@id,':8:sorValueCheck:')]")
    public WebElement txt_ReleaseParkingBreak;

    @FindBy(xpath = "//input[contains(@id,':9:itValueNumeric::content')]")
    public WebElement txt_RecordLf;

    @FindBy(xpath = "//input[contains(@id,':10:itValueNumeric::content')]")
    public WebElement txt_RecordRf;

    @FindBy(xpath = "//input[contains(@id,':11:itValueNumeric::content')]")
    public WebElement txt_RecordLr;

    @FindBy(xpath = "//input[contains(@id,':12:itValueNumeric::content')]")
    public WebElement txt_RecordRr;

    @FindBy(xpath = "//label[contains(.,'Pass')]//..//input[contains(@id,':13:sorValueCheck:')]")
    public WebElement txt_ApplyService;

    @FindBy(xpath = "//input[contains(@id,':14:itValueNumeric::content')]")
    public WebElement txt_RecordLfPushRod;

    @FindBy(xpath = "//input[contains(@id,':15:itValueNumeric::content')]")
    public WebElement txt_RecordRfPushRod;

    @FindBy(xpath = "//input[contains(@id,':16:itValueNumeric::content')]")
    public WebElement txt_LfPushRodTravel;

    @FindBy(xpath = "//input[contains(@id,':17:itValueNumeric::content')]")
    public WebElement txt_RfPushRodTravel;

    @FindBy(xpath = "//label[contains(.,'Pass')]//..//input[contains(@id,':18:sorValueCheck:')]")
    public WebElement txt_AdjustManualSlack;

    @FindBy(xpath = "//span[text()='Done / Validate']")
    public WebElement btn_DoneValidateLabel;

    @FindBy(xpath = "//span[contains(.,' Suspension System')]")
    public WebElement box_SuspensionSystem;

    @FindBy(xpath = "//label[contains(.,'Pass')]//..//input[contains(@id,':0:sorValueCheck:')]")
    public WebElement txt_InspectTheTandem;

    @FindBy(xpath = "//label[contains(.,'Pass')]//..//input[contains(@id,':1:sorValueCheck:')]")
    public WebElement txt_CheckWheelBearing;

    @FindBy(xpath = "//label[contains(.,'Pass')]//..//input[contains(@id,':2:sorValueCheck:')]")
    public WebElement txt_CheckUBolt;

    @FindBy(xpath = "//label[contains(.,'Pass')]//..//input[contains(@id,':3:sorValueCheck:')]")
    public WebElement txt_InspectTorqueRod;

    @FindBy(xpath = "//label[contains(.,'Pass')]//..//input[contains(@id,':4:sorValueCheck:')]")
    public WebElement txt_InspectAirSpring;

    @FindBy(xpath = "//label[contains(.,'Pass')]//..//input[contains(@id,':5:sorValueCheck:')]")
    public WebElement txt_CheckRideHeight;

    @FindBy(xpath = "//label[contains(.,'Pass')]//..//input[contains(@id,':6:sorValueCheck:')]")
    public WebElement txt_InspectAirRide;

    @FindBy(xpath = "//label[contains(.,'Pass')]//..//input[contains(@id,':7:sorValueCheck:')]")
    public WebElement txt_CheckSuspensionDumpValue;

    @FindBy(xpath = "//span[text()='Done / Validate']")
    public WebElement btn_Validate;

    @FindBy(xpath = "//span[contains(.,'Wheel & Tire')]")
    public WebElement box_WheelTire;

    @FindBy(xpath = "//label[contains(.,'Pass')]//..//input[contains(@id,':0:sorValueCheck:')]")
    public WebElement txt_InspectWheels;

    @FindBy(xpath = "//label[contains(.,'Pass')]//..//input[contains(@id,':1:sorValueCheck:')]")
    public WebElement txt_CheckForMissing;

    @FindBy(xpath = "//span[contains(@id,':2:itValueNumeri')]/child::input")
    public WebElement txt_DualMetingLf;

    @FindBy(xpath = "//span[contains(@id,':3:itValueNumeric')]/child::input")
    public WebElement txt_DualMetingRf;

    @FindBy(xpath = "//span[contains(@id,':4:itValueNumeric')]/child::input")
    public WebElement txt_DualMetingLr;
    @FindBy(xpath = "//span[contains(@id,':5:itValueNumeric')]/child::input")
    public WebElement txt_DualMetingRr;

    @FindBy(xpath = "//label[contains(.,'Pass')]//..//input[contains(@id,':6:sorValueCheck:')]")
    public WebElement txt_TiresForDamage;

    @FindBy(xpath = "//label[contains(.,'Pass')]//..//input[contains(@id,':7:sorValueCheck:')]")
    public WebElement txt_PSIInflation;

    @FindBy(xpath = "//label[contains(.,'Pass')]//..//input[contains(@id,':8:sorValueCheck:')]")
    public WebElement txt_ValveStem;

    @FindBy(xpath = "//input[contains(@id,':9:itValueNumeric::content')]")
    public WebElement txt_TreadDepth;

    @FindBy(xpath = "//input[contains(@id,':10:itValueNumeric::content')]")
    public WebElement txt_TreadPressure;

    @FindBy(xpath = "//input[contains(@id,':11:itValueNumeric::content')]")
    public WebElement txt_RecordLfiTreadDepth;

    @FindBy(xpath = "//input[contains(@id,':12:itValueNumeric::content')]")
    public WebElement txt_RecordLfiTirePressure;

    @FindBy(xpath = "//input[contains(@id,':13:itValueNumeric::content')]")
    public WebElement txt_RecordLroTreadDepth;

    @FindBy(xpath = "//input[contains(@id,':14:itValueNumeric::content')]")
    public WebElement txt_RecordLroTirePressure;

    @FindBy(xpath = "//input[contains(@id,':15:itValueNumeric::content')]")
    public WebElement txt_RecordLriTreadDepth;

    @FindBy(xpath = "//input[contains(@id,':16:itValueNumeric::content')]")
    public WebElement txt_RecordLriTirePressure;

    @FindBy(xpath = "//input[contains(@id,':17:itValueNumeric::content')]")
    public WebElement txt_RROTreadDepth;

    @FindBy(xpath = "//input[contains(@id,':18:itValueNumeric::content')]")
    public WebElement txt_RROTirePressure;

    @FindBy(xpath = "//input[contains(@id,':19:itValueNumeric::content')]")
    public WebElement Txt_RRITreadDepth;

    @FindBy(xpath = "//input[contains(@id,':20:itValueNumeric::content')]")
    public WebElement txt_RRITirePressure;

    @FindBy(xpath = "//input[contains(@id,':21:itValueNumeric::content')]")
    public WebElement txt_RFOTreadDepth;

    @FindBy(xpath = "//input[contains(@id,':22:itValueNumeric::content')]")
    public WebElement txt_RFOTirePressure;

    @FindBy(xpath = "//input[contains(@id,':23:itValueNumeric::content')]")
    public WebElement txt_RFITreadDepth;

    @FindBy(xpath = "//input[contains(@id,':24:itValueNumeric::content')]")
    public WebElement txt_RFITirePressure;

    @FindBy(xpath = "//span[text()='Done / Validate']")
    public WebElement txt_ValidateButtonWheelAndTire;

    @FindBy(xpath = "//span[contains(.,'Roll Up Door')]  ")
    public WebElement box_RollUpDoor;

    @FindBy(xpath = "//label[contains(.,'Pass')]//..//input[contains(@id,':0:sorValueCheck:')]")
    public WebElement txt_CheckCondition;

    @FindBy(xpath = "//label[contains(.,'Pass')]//..//input[contains(@id,':1:sorValueCheck:')]")
    public WebElement txt_lubricateDoor;

    @FindBy(xpath = "//label[contains(.,'Pass')]//..//input[contains(@id,':2:sorValueCheck:')]")
    public WebElement txt_InspectRoller;

    @FindBy(xpath = "//label[contains(.,'Pass')]//..//input[contains(@id,':3:sorValueCheck:')]")
    public WebElement txt_InspectDoorPull;

    @FindBy(xpath = "//label[contains(.,'Pass')]//..//input[contains(@id,':4:sorValueCheck:')]")
    public WebElement txt_checkAndVerify;

    @FindBy(xpath = "//label[contains(.,'Pass')]//..//input[contains(@id,':5:sorValueCheck:')]")
    public WebElement txt_InspectCables;

    @FindBy(xpath = "//label[contains(.,'Pass')]//..//input[contains(@id,':6:sorValueCheck:')]")
    public WebElement txt_InspectOperator;

    @FindBy(xpath = "//label[contains(.,'Pass')]//..//input[contains(@id,':7:sorValueCheck:')]")
    public WebElement txt_InspectLubricate;
    @FindBy(xpath = "//label[contains(.,'Pass')]//..//input[contains(@id,':8:sorValueCheck:')]")
    public WebElement txt_InspectTrack;

    @FindBy(xpath = "//label[contains(.,'Pass')]//..//input[contains(@id,':9:sorValueCheck:')]")
    public WebElement txt_InspectSill;

    @FindBy(xpath = "//span[text()='Done / Validate']")
    public WebElement btn_RollUpDoorButton;

    @FindBy(xpath = "//span[contains(.,'Swing Door')]")
    public WebElement box_SwingDoor;

    @FindBy(xpath = "//label[contains(.,'Pass')]//..//input[contains(@id,':0:sorValueCheck:')]")
    public WebElement txt_ConditionDoor;

    @FindBy(xpath = "//label[contains(.,'Pass')]//..//input[contains(@id,':1:sorValueCheck:')]")
    public WebElement txt_OperateAndLubricate;

    @FindBy(xpath = "//label[contains(.,'Pass')]//..//input[contains(@id,':2:sorValueCheck:')]")
    public WebElement txt_CheckAndVerifyProper;

    @FindBy(xpath = "//label[contains(.,'Pass')]//..//input[contains(@id,':3:sorValueCheck:')]")
    public WebElement txt_InspectAllDoor;

    @FindBy(xpath = "//span[text()='Done / Validate']")
    public WebElement btn_SwingDoorButton;


    @FindBy(xpath = "//span[contains(.,'Interior')]")
    public WebElement box_InteriorBox;

    @FindBy(xpath = "//label[contains(.,'Pass')]//..//input[contains(@id,':0:sorValueCheck:')]")
    public WebElement txt_CargoNetTrack;

    @FindBy(xpath = "//label[contains(.,'Pass')]//..//input[contains(@id,':1:sorValueCheck:')]")
    public WebElement txt_InspectInteriorWall;

    @FindBy(xpath = "//label[contains(.,'Pass')]//..//input[contains(@id,':2:sorValueCheck:')]")
    public WebElement txt_CheckFloor;

    @FindBy(xpath = "//label[contains(.,'Pass')]//..//input[contains(@id,':3:sorValueCheck:')]")
    public WebElement txt_InspectConditionOfConvey;

    @FindBy(xpath = "//label[contains(.,'Pass')]//..//input[contains(@id,':4:sorValueCheck:')]")
    public WebElement txt_InspectLoadDecks;

    @FindBy(xpath = "//label[contains(.,'Pass')]//..//input[contains(@id,':5:sorValueCheck:')]")
    public WebElement txt_InspectRoofBlows;

    @FindBy(xpath = "//label[contains(.,'Pass')]//..//input[contains(@id,':6:sorValueCheck:')]")
    public WebElement txt_ConductLightCheck;

    @FindBy(xpath = "//span[text()='Done / Validate']")
    public WebElement btn_InteriorButton;

    @FindBy(xpath = "//span[text()='Defect Summary']")
    public WebElement btn_DefectSummary;

    @FindBy(xpath = "//label[text()='Inspection Notes:']")
    public WebElement txt_InspectionNotes;

    @FindBy(xpath = "//th[contains(@id,':cDesc')]//div/child::span")
    public WebElement txt_Description;

    @FindBy(xpath = "//span[text()='Notes']")
    public WebElement txt_Notes;
    @FindBy(xpath = " //span[text()='Sign']")
    public WebElement btn_SignButton;

    @FindBy(xpath = "//div[contains(@id,':rEquIns:3:cb6')]//a//span")
    public WebElement btn_CancelButton;

    @FindBy(xpath = "(//span[text()='Clear'])[1]")
    public WebElement txt_Clear;

    @FindBy(xpath = "(//span[text()='Continue'])[1]")
    public WebElement txt_Continue;
    @FindBy(xpath = "//div[contains(@id,':j_idt')]/child::canvas")
    public WebElement label_Signature ;

    @FindBy(xpath = "(//a[contains(.,'Su')])[1]")
    public WebElement btn_Summary;

    @FindBy(xpath = " //span[text()='Unit Ready']")
    public WebElement txt_UnitReady;

    @FindBy(xpath = "//div[contains(@id,':cbErrOK')]//span")
    public  WebElement btn_UnitReadyOkButton;

    @FindBy(xpath = "//h1[text()='Signature']/parent::td//following::div[2]//a//span")
    public WebElement btn_SignIn;
    @FindBy(xpath = "//td[contains(@id,':pwWOSIG::contentContainer')]//div[3]//div//canvas")
    public WebElement label_canvas;
    @FindBy(xpath = "//div[contains(@id,':s9:cb')]//span[text()='OK']")
    public WebElement btn_Ok;
    @FindBy(xpath = "(//a[contains(.,'Lab')])[1]")
    public WebElement label_labor;
    @FindBy(xpath = "(//div[contains(@id,':tWoAct::db')]//table//td[9]//table//a//img)[1]")
    public WebElement img_cancel;
    @FindBy(xpath = "(//span[text()='Cancel']/parent::a/parent::div/following::div/child::a/span)[1]")
    public WebElement btn_SaveExitDeleteButton;
    @FindBy(xpath = "(//div[contains(@id,':0:cbSelectWoact')]//a//span)[1]")
    public WebElement btn_SelectButton;
    @FindBy(xpath = "//span[text()='Assigned Work']")
    public WebElement btn_AssignWork;

    @FindBy(xpath = "//a[text()='Sign Out']")
    public WebElement Label_SignOut;

    @FindBy(xpath = "//h1[text()='Working...Please Wait']")
    List<WebElement> loder;



    public cGVTechPerformPM(WebDriver driver){
        this.driver = driver;
        this.waitMethods = new WaitMethods(driver);
    }


    /*** Enter the Tech Badge data*/
    public void enterTechBadge() throws InterruptedException {
        waitMethods.loadingWait(loder);
        Thread.sleep(3000);
        waitMethods.waitForElementToBeRefreshedAndClickable(txt_scanEmployeeBadge);
        WebElementActions.getActions(driver).inputText(txt_scanEmployeeBadge, appProp.getProperty("Tech"));
        TestListener.saveScreenshotPNG(driver);
    }

    /*** Click on Go*/

    public void clickOnGo() throws InterruptedException {

        waitMethods.waitForElementToBeRefreshedAndClickable(btn_GO);
        WebElementActions.getActions(driver).clickElement(btn_GO);
        waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);

    }


    /** verify Select Work*/
    public void verifySelectWork() throws InterruptedException {
        waitMethods.loadingWait(loder);
        Thread.sleep(7000);
        if (txt_SelectAssignedWork.size()>0) {
            waitMethods.waitForElementToBeRefreshedAndClickable(btn_MoreUnits);
            WebElementActions.getActions(driver).clickElement(btn_MoreUnits);
            waitMethods.waitForElementToBeRefreshedAndIsVisible(label_SearchTextArea);
            WebElementActions.getActions(driver).inputText(label_SearchTextArea,appProp.getProperty("UnitNumber"));
            waitMethods.waitForElementToBeRefreshedAndIsVisible(btn_Select);
            WebElementActions.getActions(driver).clickElement(btn_Select);
            waitMethods.loadingWait(loder);


        } else {

        }

    }

    /**verify Technician Portal */
    public void verifyTechnicianPortal () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(label_TechnicianPortal);
        Assert.assertTrue(label_TechnicianPortal.isDisplayed());
        waitMethods.loadingWait(loder);
    }

    /**click On More links */
    public void clickOnMoreLinks() throws InterruptedException {

        waitMethods.waitForElementToBeRefreshedAndClickable(txt_MoreLinkText);
        WebElementActions.getActions(driver).clickElement(txt_MoreLinkText);

        waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);

    }
    /**click on search Text Area */
    public void clickOnSearchTextArea() throws InterruptedException {

        waitMethods.waitForElementToBeRefreshedAndIsVisible(input_SearchTextArea);
        Thread.sleep(2000);
        WebElementActions.getActions(driver).inputText(input_SearchTextArea,appProp.getProperty("Enter"));

        waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);

    }
    /**click On image */
    public void clickOnInspectionImage() throws InterruptedException {

        waitMethods.waitForElementToBeRefreshedAndClickable(img_PMInspection);
        Thread.sleep(3000);
        WebElementActions.getActions(driver).clickElement(img_PMInspection);
        waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);



    }
    /**click On Add Icon */
    public void clickOnAddIcon() throws InterruptedException {

        waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_PMInspection);
        WebElementActions.getActions(driver).clickElement(txt_PMInspection);
        waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);




    }
    /**click on Add Button */
    public void clickOnAddButton() throws InterruptedException {

        waitMethods.waitForElementToBeRefreshedAndIsVisible(btn_Add);
        Thread.sleep(3000);
        WebElementActions.getActions(driver).clickElement(btn_Add);
 //       Thread.sleep(5000);
        waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);


    }
    /**click on image */
    public void clickOnImage() throws InterruptedException {

        waitMethods.waitForElementToBeRefreshedAndClickable(img_Images);
        Thread.sleep(3000);
        WebElementActions.getActions(driver).clickElement(img_Images);
 //       Thread.sleep(7000);
        waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }


    /**click on Hyperlink  */
    public void clickOnHyperLink() throws InterruptedException {

        waitMethods.waitForElementToBeRefreshedAndClickable(txt_Hyperlink);
        WebElementActions.getActions(driver).clickElement(txt_Hyperlink);
        waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);

    }
    /**verify data and click On  Walkaround Exterior Inspection*/
    public void verifyData () throws InterruptedException {

        System.out.println(txt_Completed.size());
        Thread.sleep(5000);
        if(txt_Completed.size()>0){
            waitMethods.waitForElementToBeRefreshedAndClickable(btn_Close);
            WebElementActions.getActions(driver).clickElement(btn_Close);
            waitMethods.loadingWait(loder);
            waitMethods.waitForElementToBeRefreshedAndClickable(img_cancel);
            WebElementActions.getActions(driver).clickElement(img_cancel);
            waitMethods.waitForElementToBeRefreshedAndClickable(btn_SaveExitDeleteButton);
            WebElementActions.getActions(driver).clickElement(btn_SaveExitDeleteButton);
            waitMethods.waitForElementToBeRefreshedAndClickable(btn_SelectButton);
            WebElementActions.getActions(driver).clickElement(btn_SelectButton);
            waitMethods.loadingWait(loder);
            waitMethods.waitForElementToBeRefreshedAndClickable(txt_Hyperlink);
            WebElementActions.getActions(driver).clickElement(txt_Hyperlink);
            waitMethods.loadingWait(loder);
            TestListener.saveScreenshotPNG(driver);

        }else {

            waitMethods.waitForElementToBeRefreshedAndClickable(box_WalkAroundExteriorInspectionBox);
            WebElementActions.getActions(driver).clickElement(box_WalkAroundExteriorInspectionBox);
            waitMethods.loadingWait(loder);
            TestListener.saveScreenshotPNG(driver);

        }
    }


    /**select checking And Inspection Mounting Text Boolean pass */
    public void selectCheckingAndInspectionMounting() throws InterruptedException {

        waitMethods.waitForElementToBeRefreshedAndClickable(txt_CheckingAndInspectionMounting);
        WebElementActions.getActions(driver).clickElement(txt_CheckingAndInspectionMounting);
        waitMethods.loadingWait(loder);

    }
    /**enter GPS series Number Textarea value  */
    public void EnterGPSSeriesNumber() throws InterruptedException {

        waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_ListTHeGPS);
        WebElementActions.getActions(driver).inputText(txt_ListTHeGPS, appProp.getProperty("GPSSeriesNumber"));
        waitMethods.loadingWait(loder);

    }
    /**enter  The GPS Transmit Date TextArea  value */
    public void clickEnterTheGPSTransmitDate() throws InterruptedException {

        waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_TransmitTosDate);
        WebElementActions.getActions(driver).inputText(txt_TransmitTosDate,appProp.getProperty("GPSTransmitDate"));

    }
    /**select Enter Confirm Trailer Text Boolean pass */
    public void selectEnterConfirmTrailer() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_ConfirmTrailer);
        WebElementActions.getActions(driver).clickElement(txt_ConfirmTrailer);

    }
    /**select confirm Trailer License Plate Text Boolean pass */
    public void selectConfirmTrailerLicensePlate() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_ConfirmTrailerLicensePlate);
        WebElementActions.getActions(driver).clickElement(txt_ConfirmTrailerLicensePlate);
    }
    /**select confirm Trailer valid  Text Boolean pass */
    public void selectConfirmTrailerValid() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_ConfirmTrailerValid);
        WebElementActions.getActions(driver).clickElement(txt_ConfirmTrailerValid);

    }
    /** select scan Barcode Text Boolean pass */
    public void selectScanBarCode() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_ScanBarCode);
        WebElementActions.getActions(driver).clickElement(txt_ScanBarCode);

    }
    /**select check All FedEx Text Boolean pass */
    public void selectCheckAllFedEx() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_CheckAllFedEx);
        WebElementActions.getActions(driver).clickElement(txt_CheckAllFedEx);
        waitMethods.loadingWait(loder);

    }

    /**click on Done validate Button*/
    public void clickOnDoneValidate () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(btn_DoneValidate);
        WebElementActions.getActions(driver).clickElement(btn_DoneValidate);
        waitMethods.loadingWait(loder);



    }
    /**click on save And Exit Button  */
    public void clickOnSaveAndExit () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(btn_SaveAndExit);
        WebElementActions.getActions(driver).clickElement(btn_SaveAndExit);
        waitMethods.loadingWait(loder);

    }
    /**verify number of Questions Answered sub Text */
    public void verifyNumberOfQuestionsAnsweredSub () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_NumberOfQuestionsAnswerResult);
        Assert.assertTrue(txt_NumberOfQuestionsAnswerResult.isDisplayed());

    }
    /**click walk Around Exterior Inspection Box */
    public void clickWalkaroundExteriorInspectionBox() throws InterruptedException {

        waitMethods.waitForElementToBeRefreshedAndIsVisible(box_WalkAroundExteriorInspectionBox);
        WebElementActions.getActions(driver).clickElement(box_WalkAroundExteriorInspectionBox);
        waitMethods.loadingWait(loder);


    }
    /** click on Show Error Only Button  */
    public void clickOnShowErrorOnly () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_ShowErrorOnly);
        WebElementActions.getActions(driver).clickElement(txt_ShowErrorOnly);

        waitMethods.loadingWait(loder);


    }
    /**select check All Lights Text boolean pass*/
    public void selectCheckAllLights () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_CheckAllLights);
        WebElementActions.getActions(driver).clickElement(txt_CheckAllLights);

    }
    /**select Inspect Gland Text Boolean pass */
    public void  selectInspectGland () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_InspectGland);
        WebElementActions.getActions(driver).clickElement(txt_InspectGland);

    }
    /**select checking  Breaking System Text Boolean pass */
    public void selectCheckingBreakingSystem () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_CheckingBreakingSystem);
        WebElementActions.getActions(driver).clickElement(txt_CheckingBreakingSystem);

    }
    /**select check ABS Function Text Boolean pass  */
    public void selectCheckABSFunction () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_CheckABSFunction);
        WebElementActions.getActions(driver).clickElement(txt_CheckABSFunction);

    }
    /**enter Check ABS Function Textarea value */
    public void enterCheckABSFunctionTextArea () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(input_CheckABSFunctionTextArea);
        WebElementActions.getActions(driver).inputText(input_CheckABSFunctionTextArea,appProp.getProperty("CheckABSFunctionTextArea"));
        TestListener.saveScreenshotPNG(driver);

    }

    /**select Inspect Front Text boolean pass  */
    public void selectInspectFront () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(txt_InspectFront);
        WebElementActions.getActions(driver).clickElement(txt_InspectFront);
        TestListener.saveScreenshotPNG(driver);
    }
    /**select Inspect Back Text Boolean pass*/
    public void selectInspectBack () throws InterruptedException {

        waitMethods.waitForElementToBeRefreshedAndClickable(txt_InspectBack);
        WebElementActions.getActions(driver).clickElement(txt_InspectBack);
        waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**select CheckBody For Damage Text Boolean pass  */
    public void selectCheckBodyForDamage () throws InterruptedException {

        waitMethods.waitForElementToBeRefreshedAndClickable(txt_CheckBodyForDamage);
        WebElementActions.getActions(driver).clickElement(txt_CheckBodyForDamage);
        waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);


    }

    /**click on Done validate Button*/
    public void clickOnDoneValidate2 () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(btn_DoneValidate);
        WebElementActions.getActions(driver).clickElement(btn_DoneValidate);

        waitMethods.loadingWait(loder);
    }

    /**select Inspect MudFlag Text Boolean pass */
    public  void selectInspectMudFlag () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(txt_InspectMudFlag);
        WebElementActions.getActions(driver).clickElement(txt_InspectMudFlag);
        waitMethods.loadingWait(loder);

    }
    /**select Inspect condition Text Boolean pass */
    public void selectInspectCondition () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(txt_InspectCondition);
        WebElementActions.getActions(driver).clickElement(txt_InspectCondition);
        waitMethods.loadingWait(loder);


    }
    /**select Inspect Drop Text Boolean pass  */
    public void selectInspectDrop () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(txt_InspectDrop);
        WebElementActions.getActions(driver).clickElement(txt_InspectDrop);

    }
    /**select Inspect Safety  Text Boolean pass */
    public void selectInspectSafety () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(txt_InspectSafety);
        WebElementActions.getActions(driver).clickElement(txt_InspectSafety);

    }
    /**select Check And Operate Text Boolean pass  */
    public void selectCheckAndOperate () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(txt_CheckAndOperate);
        WebElementActions.getActions(driver).clickElement(txt_CheckAndOperate);

    }


    /**select Inspect cracks Text Boolean pass */
    public void selectInspectCracks () throws InterruptedException {

        waitMethods.waitForElementToBeRefreshedAndClickable(txt_InspectCracks);
        WebElementActions.getActions(driver).clickElement(txt_InspectCracks);

    }
    /**select check And Lubricate Text Boolean pass  */
    public void selectCheckAndLubricate () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(txt_CheckAndLubricate);
        WebElementActions.getActions(driver).clickElement(txt_CheckAndLubricate);
    }
    /** click On Done validate Button  Text Boolean Pass */
    public void clickOnDoneValidateButton () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(btn_DoneValidate);
        WebElementActions.getActions(driver).clickElement(btn_DoneValidate);
        TestListener.saveScreenshotPNG(driver);

    }

    /**click On Inspect Rear Impact Guard  Text Boolean pass */
   public void clickOnInspectRearImpactGuard () throws InterruptedException {

        waitMethods.waitForElementToBeRefreshedAndClickable(box_InspectRearImpactGuard);
        WebElementActions.getActions(driver).clickElement(box_InspectRearImpactGuard);
        waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);


    }
    /**select Missing Guard Text Boolean pass */
    public void selectMissingGuard () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(txt_MissingGuard);
        WebElementActions.getActions(driver).clickElement(txt_MissingGuard);

    }
    /**select Guard Not Securely Text Boolean pass  */
    public void selectGuardNotSecurely () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(txt_GuardNotSecurely);
        WebElementActions.getActions(driver).clickElement(txt_GuardNotSecurely);


    }
    /**select Guard Horizontal member Text Boolean pass */
    public void selectGuardHorizontalMemberNotExtend () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(txt_GuardHorizontalMemberNotExtend);
        WebElementActions.getActions(driver).clickElement(txt_GuardHorizontalMemberNotExtend);


    }
    /**select Guard Horizontal member more Text Boolean pass */
    public void selectGuardHorizontalMemberMore () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(txt_GuardHorizontalMemberMore);
        WebElementActions.getActions(driver).clickElement(txt_GuardHorizontalMemberMore);


    }
    /**Select Guard Horizontal Member More Than  Text Boolean pass*/
    public void selectGuardHorizontalMemberMoreThan () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(txt_GuardHorizontalMemberMoreThan);
        WebElementActions.getActions(driver).clickElement(txt_GuardHorizontalMemberMoreThan);


    }
    /**select Guard Horizontal Member Text  Boolean pass */
    public void selectGuardHorizontalMember () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(txt_GuardHorizontalMember);
        WebElementActions.getActions(driver).clickElement(txt_GuardHorizontalMember);


    }
    /**select Inspect Rear Imapct Guard Text Boolean pass*/
    public void selectInspectRearImpactGuard () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(txt_InspectRearImpactGuard);
        WebElementActions.getActions(driver).clickElement(txt_InspectRearImpactGuard);

    }
    /**click Done Validate Button */
    public void clickDoneValidateButton () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(btn_DoneValidateButton);
        WebElementActions.getActions(driver).clickElement(btn_DoneValidateButton);
        TestListener.saveScreenshotPNG(driver);

    }
    /** click Under Vehicle Box */
    public void clickUnderVehicle () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(box_UnderVehicle);
        WebElementActions.getActions(driver).clickElement(box_UnderVehicle);
        TestListener.saveScreenshotPNG(driver);
    }
    /** select Inspecting pin Text Boolean pass  */
    public void selectInspectKingPin () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(txt_InspectKingPin);
        WebElementActions.getActions(driver).clickElement(txt_InspectKingPin);


    }
    /** select Inspect Landing Gear Text Boolean pass  */
    public void selectInspectLandingGear () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(txt_InspectLandingGear);
        WebElementActions.getActions(driver).clickElement(txt_InspectLandingGear);


    }
    /** select Operate ANd Landing Gear Text Boolean pass  */
    public void selectOperateLAndLandingGear () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(txt_OperateLAndLandingGear);
        WebElementActions.getActions(driver).clickElement(txt_OperateLAndLandingGear);

    }
    /**select Inspect Cross Member  Text Boolean pass */
    public void selectInspectCrossMember () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(txt_InspectCrossMember);
        WebElementActions.getActions(driver).clickElement(txt_InspectCrossMember);


    }
    /**select Inspect Frame Cracks Text Boolean pass */
    public void selectInspectFrameCracks () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(txt_InspectFrameCracks);
        WebElementActions.getActions(driver).clickElement(txt_InspectFrameCracks);


    }
    /**click Inspect Rear Impact Guard Button */
    public void clickInspectRearImpactGuardButton () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(btn_UnderTheVehicleButton);
        WebElementActions.getActions(driver).clickElement(btn_UnderTheVehicleButton);


    }
    /**click Foundation Brake Inspection Text Boolean pass */
    public void clickFoundationBrakeInspection () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(box_FoundationBrakeInspection);
        WebElementActions.getActions(driver).clickElement(box_FoundationBrakeInspection);
        TestListener.saveScreenshotPNG(driver);

    }
    /**select Check and Lubricate Slack Text Boolean passs*/
    public void  selectCheckAndLubricateSlack () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(txt_CheckAndLubricateSlack);
        WebElementActions.getActions(driver).clickElement(txt_CheckAndLubricateSlack);

    }
    /**select Check And Lubricate Inboard Text Boolean pass */
    public void selectCheckANdLubricateInboard () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(txt_CheckANdLubricateInboard);
        WebElementActions.getActions(driver).clickElement(txt_CheckANdLubricateInboard);
    }
    /**select check And Lubricate Slacks Adjuster Text Boolean pass */
    public void selectCheckAndLubricateSlackAdjuster () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(txt_CheckAndLubricateSlackAdjuster);
        WebElementActions.getActions(driver).clickElement(txt_CheckAndLubricateSlackAdjuster);


    }
    /**select Inspect Condition Text Boolean Pass  */
    public void selectInspectConditionBrake () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(txt_InspectConditionBrake);
        WebElementActions.getActions(driver).clickElement(txt_InspectConditionBrake);


    }
    /**select Inspect Brake Chamber Text Boolean pass */
    public void selectInspectBrakeChamber () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(txt_InspectBrakeChamber);
        WebElementActions.getActions(driver).clickElement(txt_InspectBrakeChamber);


    }
    /**select Inspect condition Of Break Lining Text Boolean pass */
    public  void  selectInspectConditionOfBrakeLining () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(txt_InspectConditionOfBrakeLining);
        WebElementActions.getActions(driver).clickElement(txt_InspectConditionOfBrakeLining);
        waitMethods.loadingWait(loder);
    }
    /**select Check Brake Lining To Drum Text Boolean pass */
    public void selectCheckBrakeLiningToDrum () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(txt_CheckBrakeLiningToDrum);
        WebElementActions.getActions(driver).clickElement(txt_CheckBrakeLiningToDrum);
        waitMethods.loadingWait(loder);

    }
    /** select charge Air System Text Boolean pass */
    public void selectChargeAirSystem () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(txt_ChargeAirSystem);
        WebElementActions.getActions(driver).clickElement(txt_ChargeAirSystem);
        waitMethods.loadingWait(loder);
    }
    /** select Release parking Break*/
    public void selectReleaseParkingBreak () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(txt_ReleaseParkingBreak);
        WebElementActions.getActions(driver).clickElement(txt_ReleaseParkingBreak);
        waitMethods.loadingWait(loder);
    }



    /** click On Done Validate Label*/
    public void clickOnDoneValidateLabel () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(btn_DoneValidateLabel);
        WebElementActions.getActions(driver).clickElement(btn_DoneValidateLabel);
        waitMethods.loadingWait(loder);
    }

    /**enter Record Lf*/
    public void enterRecordLf () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(txt_RecordLf);
        WebElementActions.getActions(driver).inputText(txt_RecordLf, appProp.getProperty("column"));
        waitMethods.loadingWait(loder);
    }
    /** enter Record Rf*/
    public void enterRecordRf () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(txt_RecordRf);
        WebElementActions.getActions(driver).inputText(txt_RecordRf, appProp.getProperty("column"));
        waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**enter Record Lr*/
    public void enterRecordLr () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(txt_RecordLr);
        WebElementActions.getActions(driver).inputText(txt_RecordLr, appProp.getProperty("column"));
        TestListener.saveScreenshotPNG(driver);
    }
    /**enter the RecordRr*/
    public void enterRecordRr () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(txt_RecordRr);
        WebElementActions.getActions(driver).inputText(txt_RecordRr,appProp.getProperty("column"));
        TestListener.saveScreenshotPNG(driver);
    }
    /**select Apply Service*/
    public void selectApplyService () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(txt_ApplyService);
        WebElementActions.getActions(driver).clickElement(txt_ApplyService);
        waitMethods.loadingWait(loder);

    }
    /**enter Record Lf PushRod */
    public void enterRecordLfPushRod () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(txt_RecordLfPushRod);
        WebElementActions.getActions(driver).inputText(txt_RecordLfPushRod,appProp.getProperty("value"));
        waitMethods.loadingWait(loder);

    }
    /**enter Record Rf Push Rod */
    public void enterRecordRfPushRod () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(txt_RecordRfPushRod);
        WebElementActions.getActions(driver).inputText(txt_RecordRfPushRod,appProp.getProperty("value"));
        waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);

    }
    /** enter Lf Push Rod Travel */
   public void enterLfPushRodTravel () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(txt_LfPushRodTravel);
        WebElementActions.getActions(driver).inputText(txt_LfPushRodTravel,appProp.getProperty("value"));
        waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);

    }
    /**enter Rf Push Rod Travel */
    public void enterRfPushRodTravel () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(txt_RfPushRodTravel);
        WebElementActions.getActions(driver).inputText(txt_RfPushRodTravel,appProp.getProperty("value"));
        TestListener.saveScreenshotPNG(driver);

    }
    /**select Adjust Manual Slack */
    public void selectAdjustManualSlack () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(txt_AdjustManualSlack);
        WebElementActions.getActions(driver).clickElement(txt_AdjustManualSlack);
        waitMethods.loadingWait(loder);


    }
    /**click Done Validate label*/
    public void clickDoneValidateLabel () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(btn_DoneValidateLabel);
        WebElementActions.getActions(driver).clickElement(btn_DoneValidateLabel);
        waitMethods.loadingWait(loder);

    }
    /**click On Box Suspension System*/
    public void clickOnBoxSuspensionSystem () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(box_SuspensionSystem);
        WebElementActions.getActions(driver).clickElement(box_SuspensionSystem);
        waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);

    }
    /**select Inspect  The Tandem Boolean */
    public void selectInspectTheTandem () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(txt_InspectTheTandem);
        WebElementActions.getActions(driver).clickElement(txt_InspectTheTandem);
        waitMethods.loadingWait(loder);

    }
    /** select Checking Wheel Bearing Boolean*/
    public void selectCheckWheelBearing () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(txt_CheckWheelBearing);
        WebElementActions.getActions(driver).clickElement(txt_CheckWheelBearing);
        waitMethods.loadingWait(loder);

    }
    /** select Check u  bolt Text Boolean*/
    public void selectCheckUBolt () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(txt_CheckUBolt);
        WebElementActions.getActions(driver).clickElement(txt_CheckUBolt);
    }
    /** select Inspect Torque Rod Text Boolean */
    public void selectInspectTorqueRod () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(txt_InspectTorqueRod);
        WebElementActions.getActions(driver).clickElement(txt_InspectTorqueRod);
        waitMethods.loadingWait(loder);

    }
    /** select Inspect Air Spring TExt Boolean */
    public void selectInspectAirSpring () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(txt_InspectAirSpring);
        WebElementActions.getActions(driver).clickElement(txt_InspectAirSpring);
        waitMethods.loadingWait(loder);
    }
    /**select Check Ride Height Text Boolean */
    public void selectCheckRideHeight () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(txt_CheckRideHeight);
        WebElementActions.getActions(driver).clickElement(txt_CheckRideHeight);
        waitMethods.loadingWait(loder);

    }
    /**select Inspect Air Ride TExt Boolean*/
    public void selectInspectAirRide () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(txt_InspectAirRide);
        WebElementActions.getActions(driver).clickElement(txt_InspectAirRide);
        waitMethods.loadingWait(loder);

    }
    /** select Check Suspension Dump value Text Boolean */
    public void selectCheckSuspensionDumpValue () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(txt_CheckSuspensionDumpValue);
        WebElementActions.getActions(driver).clickElement(txt_CheckSuspensionDumpValue);

    }
    /** click On Validate Button */
    public  void clickValidate () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(btn_Validate);
        WebElementActions.getActions(driver).clickElement(btn_Validate);
        waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**click On Wheel Tire  Text Box */
    public void clickWheelTire () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(box_WheelTire);
        WebElementActions.getActions(driver).clickElement(box_WheelTire);
        waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);

    }
    /** select Inspect Wheel Text Box */
    public void selectInspectWheels () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(txt_InspectWheels);
        WebElementActions.getActions(driver).clickElement(txt_InspectWheels);

    }
    /** select Check For Missing Text Box */
    public void selectCheckForMissing () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(txt_CheckForMissing);
        WebElementActions.getActions(driver).clickElement(txt_CheckForMissing);
        Thread.sleep(3000);
        waitMethods.loadingWait(loder);

    }
    /**enter Dual Meting  Lf TextArea value */
    public void enterDualMetingLf () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(txt_DualMetingLf);
        Thread.sleep(3000);
        WebElementActions.getActions(driver).inputText(txt_DualMetingLf,appProp.getProperty("RecordOffset"));

    }
    /**enter Dual Meting Rf TextArea Value */
    public void enterDualMetingRf () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(txt_DualMetingRf);
        Thread.sleep(3000);
        WebElementActions.getActions(driver).inputText(txt_DualMetingRf,appProp.getProperty("RecordOffset"));
        TestListener.saveScreenshotPNG(driver);

    }
    /** enter Dual Meting Lr TextArea Value */
    public void enterDualMetingLr () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(txt_DualMetingLr);
        Thread.sleep(3000);
        WebElementActions.getActions(driver).inputText(txt_DualMetingLr,appProp.getProperty("RecordOffset"));
        TestListener.saveScreenshotPNG(driver);

    }
    /** enter Dual Meting Rr TextArea Value */
    public void enterDualMetingRr () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(txt_DualMetingRr);
        Thread.sleep(3000);
        WebElementActions.getActions(driver).inputText(txt_DualMetingRr,appProp.getProperty("RecordOffset"));
        TestListener.saveScreenshotPNG(driver);

    }
    /**select for Tire Damage Text Boolean Pass */
    public void selectForTireDamage () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(txt_TiresForDamage);
        WebElementActions.getActions(driver).clickElement(txt_TiresForDamage);
        waitMethods.loadingWait(loder);
    }
    /**select PSI Inflation System  Text Boolean Pass */
    public void selectPSIInflationSystem () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(txt_PSIInflation);
        WebElementActions.getActions(driver).clickElement(txt_PSIInflation);
        waitMethods.loadingWait(loder);
    }
    /**click On Validate Button */
    public void clickOnValidateButton () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(txt_ValidateButtonWheelAndTire);
        WebElementActions.getActions(driver).clickElement(txt_ValidateButtonWheelAndTire);
        waitMethods.loadingWait(loder);

    }
    /**select valve Stem flow Text Boolean Pass */
    public void selectValveStemFlow() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(txt_ValveStem);
        WebElementActions.getActions(driver).clickElement(txt_ValveStem) ;
        waitMethods.loadingWait(loder);
    }
    /** enter Record LFO Tread Depth Texteara */
    public void enterRecordLFOTreadDepth () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(txt_TreadDepth);
        WebElementActions.getActions(driver).inputText(txt_TreadDepth,appProp.getProperty("TreadDepth"));
        TestListener.saveScreenshotPNG(driver);


    }
    /**enter Recore LFO Tire Pressure Textarea */
    public void enterRecordLFOTirePressure () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(txt_TreadPressure);
        WebElementActions.getActions(driver).inputText(txt_TreadPressure,appProp.getProperty("TirePressure")) ;
        TestListener.saveScreenshotPNG(driver);

    }
    /**enter Record LFI TRead Depth Textarea  value */
    public void enterRecordLfiTreadDepth () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(txt_RecordLfiTreadDepth);
        WebElementActions.getActions(driver).inputText(txt_RecordLfiTreadDepth,appProp.getProperty("TreadDepth"));
        TestListener.saveScreenshotPNG(driver);

    }
    /** enter Record LFI Pressure Textarea Value */
    public void enterRecordLfiTirePressure  () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(txt_RecordLfiTirePressure);
        WebElementActions.getActions(driver).inputText(txt_RecordLfiTirePressure,appProp.getProperty("TirePressure"));
        TestListener.saveScreenshotPNG(driver);
    }
    /** enter Record LRO Tread Depth TextArea Value  */
    public  void enterRecordLroTreadDepth () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(txt_RecordLroTreadDepth);
        WebElementActions.getActions(driver).inputText(txt_RecordLroTreadDepth,appProp.getProperty("TreadDepth"));
        TestListener.saveScreenshotPNG(driver);
    }
    /** enter Record  Lor Tire Pressure Textarea Value */
    public void enterRecordLroTirePressure() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(txt_RecordLroTirePressure);
        WebElementActions.getActions(driver).inputText(txt_RecordLroTirePressure,appProp.getProperty("TirePressure"));
        TestListener.saveScreenshotPNG(driver);
    }
    /** enter Record LRI Tread Depth TextArea Value */
    public void enterRecordLriTreadDepth() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(txt_RecordLriTreadDepth);
        WebElementActions.getActions(driver).inputText(txt_RecordLriTreadDepth,appProp.getProperty("TreadDepth"));
        TestListener.saveScreenshotPNG(driver);
    }

    /** scroll End To Bar */
    public void scrollEndTo () {
  //      WebElementActions.getActions(driver).moveOnTargetElement(txt_ScrollSlider);

    }

    /**enter Record LRI Tire Pressure Textarea value */
    public void enterRecordLriTirePressure () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(txt_RecordLriTirePressure);
        WebElementActions.getActions(driver).inputText(txt_RecordLriTirePressure,appProp.getProperty("TirePressure")) ;
        TestListener.saveScreenshotPNG(driver);
    }
    /** enter RRP Tread Depth Textarea Value */
    public void enterRROTreadDepth() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(txt_RROTreadDepth);
        WebElementActions.getActions(driver).inputText(txt_RROTreadDepth,appProp.getProperty("TreadDepth"));
        waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**enter RRO Tire Pressure Textarea Value */
    public void enterRROTirePressure () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(txt_RROTirePressure);
        WebElementActions.getActions(driver).inputText(txt_RROTirePressure,appProp.getProperty("TirePressure")) ;
        TestListener.saveScreenshotPNG(driver);
    }
    /** enter  RRI Tread Depth Textarea value*/
    public void enterRRITreadDepth () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(Txt_RRITreadDepth);
        WebElementActions.getActions(driver).inputText(Txt_RRITreadDepth,appProp.getProperty("TreadDepth"));
        TestListener.saveScreenshotPNG(driver);
    }
    /**enter RRI Tire Pressure Textarea value */
    public void enterRRITirePressure () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(txt_RRITirePressure);
        WebElementActions.getActions(driver).inputText(txt_RRITirePressure,appProp.getProperty("TirePressure")) ;
        TestListener.saveScreenshotPNG(driver);
    }
    /** enter RFO Tread Depth Textarea Value */
    public void enterRFOTreadDepth () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(txt_RFOTreadDepth);
        WebElementActions.getActions(driver).inputText(txt_RFOTreadDepth,appProp.getProperty("TreadDepth"));
        TestListener.saveScreenshotPNG(driver);
    }
    /** enter RFO Tire Pressure */
    public void enterRFOTirePressure() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(txt_RFOTirePressure);
        WebElementActions.getActions(driver).inputText(txt_RFOTirePressure,appProp.getProperty("TirePressure")) ;
        TestListener.saveScreenshotPNG(driver);
    }
    /** enter RFI Tread Depth */
    public void enterRFITreadDepth () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(txt_RFITreadDepth);
        WebElementActions.getActions(driver).inputText(txt_RFITreadDepth,appProp.getProperty("TreadDepth"));
        TestListener.saveScreenshotPNG(driver);
    }
    /** enter RFI Tire Pressure */
    public void enterRFITirePressure() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(txt_RFITirePressure);
        WebElementActions.getActions(driver).inputText(txt_RFITirePressure,appProp.getProperty("TirePressure")) ;
        TestListener.saveScreenshotPNG(driver);
    }


    /**click On Roll Up Door Box */
    public void clickOnRollUpDoorBox () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(box_RollUpDoor);
        WebElementActions.getActions(driver).clickElement(box_RollUpDoor);
        waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);

    }
    /**select Check Condition Boolean pass  */
    public void selectCheckCondition () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(txt_CheckCondition);
        WebElementActions.getActions(driver).clickElement(txt_CheckCondition);
    }
    /**select Lubricate Door Boolean Pass */
    public void selectLubricateDoor () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(txt_lubricateDoor);
        WebElementActions.getActions(driver).clickElement(txt_lubricateDoor);
        waitMethods.loadingWait(loder);
    }
    /** select Inspect Roller  Boolean pass */
    public void selectInspectRoller () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(txt_InspectRoller);
        WebElementActions.getActions(driver).clickElement(txt_InspectRoller);
    }
    /** select Inspect Door pull Boolean pass */
    public void selectInspectDoorPull () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(txt_InspectDoorPull);
        WebElementActions.getActions(driver).clickElement(txt_InspectDoorPull);
    }
    /**select check and  verify Boolean pass */
    public void selectCheckAndVerify () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(txt_checkAndVerify);
        WebElementActions.getActions(driver).clickElement(txt_checkAndVerify);
    }
    /** select  Inspect Cables Boolean Pass */
    public void selectInspectCables () throws InterruptedException {

        waitMethods.waitForElementToBeRefreshedAndClickable(txt_InspectCables);
        WebElementActions.getActions(driver).clickElement(txt_InspectCables);
    }
    /** select Inspect Operator Boolean pass */
    public void selectInspectOperator () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(txt_InspectOperator);
        WebElementActions.getActions(driver).clickElement(txt_InspectOperator);
    }
    /** select Inspect Lubricate Boolean pass */
    public void selectInspectLubricate () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(txt_InspectLubricate);
        WebElementActions.getActions(driver).clickElement(txt_InspectLubricate);
        waitMethods.loadingWait(loder);
    }

    /** select Inspect Track Text Boolean pass */
    public void selectInspectTrack () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(txt_InspectTrack);
        WebElementActions.getActions(driver).clickElement(txt_InspectTrack);
        waitMethods.loadingWait(loder);
    }
    /** select Inspect Still Text Boolean pass */
    public void selectInspectSill () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(txt_InspectSill);
        WebElementActions.getActions(driver).clickElement(txt_InspectSill);
        waitMethods.loadingWait(loder);
    }
    /** click On  Roll Up Door Validate Button */

    public void clickRollUpDoorButton () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(btn_RollUpDoorButton);
        WebElementActions.getActions(driver).clickElement(btn_RollUpDoorButton);
        waitMethods.loadingWait(loder);


    }
    /** click on swing  Door Box  */
    public void clickSwingDoor () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(box_SwingDoor);
        WebElementActions.getActions(driver).clickElement(box_SwingDoor);
        TestListener.saveScreenshotPNG(driver);
    }
    /** select condition Door Text Boolean pass */
    public void selectConditionDoor () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(txt_ConditionDoor);
        WebElementActions.getActions(driver).clickElement(txt_ConditionDoor);
    }
    /** select Operate And Lubricate Text Boolean pass */
    public void selectOperateAndLubricate () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(txt_OperateAndLubricate);
        WebElementActions.getActions(driver).clickElement(txt_OperateAndLubricate);
    }
    /** select Check And verify Proper Text Boolean pass */
    public void selectCheckAndVerifyProper () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(txt_CheckAndVerifyProper);
        WebElementActions.getActions(driver).clickElement(txt_CheckAndVerifyProper);
    }
    /** select Inspect All Door Text Boolean pass */
    public void selectInspectAllDoor () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(txt_InspectAllDoor);
        WebElementActions.getActions(driver).clickElement(txt_InspectAllDoor);
    }
    /**click on Swing  Door validate Button */
    public void  clickOnSwingDoorButton () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(btn_SwingDoorButton);
        WebElementActions.getActions(driver).clickElement(btn_SwingDoorButton);
        TestListener.saveScreenshotPNG(driver);
    }
    /** click On Interior Box */
   public void clickOnInteriorBox () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(box_InteriorBox);
        WebElementActions.getActions(driver).clickElement(box_InteriorBox);

    }
    /**select Cargo Net Track Text Boolean pass */
    public void selectCargoNetTrack () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(txt_CargoNetTrack);
        WebElementActions.getActions(driver).clickElement(txt_CargoNetTrack);
        waitMethods.loadingWait(loder);

    }
    /**select Inspect Interior Wall Text Boolean pass */
    public void selectInspectInteriorWall () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(txt_InspectInteriorWall);
        WebElementActions.getActions(driver).clickElement(txt_InspectInteriorWall);
        waitMethods.loadingWait(loder);

    }
    /**select check Floor Text Boolean pass */
    public void selectCheckFloor () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(txt_CheckFloor);
        WebElementActions.getActions(driver).clickElement(txt_CheckFloor);
        waitMethods.loadingWait(loder);
    }
    /**select Inspect Condition Of convey Text Boolean pass */
    public  void selectInspectConditionOfConvey() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(txt_InspectConditionOfConvey);
        WebElementActions.getActions(driver).clickElement(txt_InspectConditionOfConvey);
        waitMethods.loadingWait(loder);
    }
    /** select inspect Load Decks Text Boolean pass */
    public void selectInspectLoadDecks () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(txt_InspectLoadDecks);
        WebElementActions.getActions(driver).clickElement(txt_InspectLoadDecks);
        waitMethods.loadingWait(loder);
    }
    /** select Inspect Roof Blows Text Boolean pass */
    public void selectInspectRoofBlows  () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(txt_InspectRoofBlows);
        WebElementActions.getActions(driver).clickElement(txt_InspectRoofBlows);
    }
    /**select Conduct Light check Text Boolean pass */
    public void selectConductLightCheck () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(txt_ConductLightCheck);
        WebElementActions.getActions(driver).clickElement(txt_ConductLightCheck);

    }
    /**click Interior validate button */
    public void clickInteriorButton () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(btn_InteriorButton);
        WebElementActions.getActions(driver).clickElement(btn_InteriorButton);
        waitMethods.loadingWait(loder);

    }
    /**click On Defect Summary Button */
    public void clickOnDefectSummary () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(btn_DefectSummary);
        WebElementActions.getActions(driver).clickElement(btn_DefectSummary);
        waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }


    /** verify Inspection Notes */
    public void verifyInspectionNotes () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_InspectionNotes);
        Assert.assertTrue(txt_InspectionNotes.isDisplayed());

    }

    /**verify Text Description */
    public void  verifyTextDescription () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_Description);
        Assert.assertTrue(txt_Description.isDisplayed());

    }
    /** verify Text Notes */
    public void  verifyNotes () throws InterruptedException {

        waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_Notes);
        Assert.assertTrue(txt_Notes.isDisplayed());

    }

    /**click on SignIn */
    public void clickOnSignIn () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(btn_SignButton);
        WebElementActions.getActions(driver).clickElement(btn_SignButton);
        waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);

    }
    /**verify Cancel Button */
    public void verifyCancelButton () throws InterruptedException {

        waitMethods.waitForElementToBeRefreshedAndIsVisible(btn_CancelButton);
        Assert.assertTrue(btn_CancelButton.isDisplayed());
        waitMethods.loadingWait(loder);

    }
    /** verify Clear Button  */
    public void  verifyClearButton () throws InterruptedException {

        waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_Clear);
        Assert.assertTrue(txt_Clear.isDisplayed());
        waitMethods.loadingWait(loder);

    }
    /**verify Continue Button */
    public void verifyContinueButton () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_Continue);
        Assert.assertTrue(txt_Continue.isDisplayed());
        waitMethods.loadingWait(loder);
    }
    /**handle canvas */
    public void handleCanvas () {

        int canvas_Width = label_Signature.getSize().getWidth();
        int canvas_Height = label_Signature.getSize().getHeight();
        int canvas_Center_X = canvas_Width/2;
        int canvas_Center_Y = canvas_Height/2;
        int y_Offset = (canvas_Center_Y/5)*4;
        System.out.println(canvas_Center_X);
        System.out.println(canvas_Center_Y);
        System.out.println(y_Offset);
        Actions action = new Actions(driver);
        action.dragAndDropBy(label_Signature, 617,276).build().perform();
        action.dragAndDropBy(label_Signature, -517,200).build().perform();
        action.moveToElement(label_Signature,-517,200).build().perform();
        action.moveToElement(label_Signature).click();
        TestListener.saveScreenshotPNG(driver);

    }


    /**click On Continue Button */
    public void clickToContinue () throws InterruptedException {

        waitMethods.waitForElementToBeRefreshedAndClickable(txt_Continue);
        WebElementActions.getActions(driver).clickElement(txt_Continue);
        Thread.sleep(3000);
        waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);

    }
    /** click On Summary Tab */
    public void ClickSummaryTab () throws InterruptedException {

        waitMethods.waitForElementToBeRefreshedAndClickable(btn_Summary);
        WebElementActions.getActions(driver).clickElement(btn_Summary);
        waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);

    }
    /**click On Unit Ready */
    public void  clickOnUnitReady () throws InterruptedException {

        waitMethods.waitForElementToBeRefreshedAndClickable(txt_UnitReady);
        WebElementActions.getActions(driver).clickElement(txt_UnitReady);
        waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);

    }
    /** click On Unit Ready Ok Button */
    public void clickOnUnitReadyOk () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(btn_UnitReadyOkButton);
        WebElementActions.getActions(driver).clickElement(btn_UnitReadyOkButton);
        waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);

    }


    /** click on SignIn  */
    public void clickOnSinIn () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(btn_SignIn);
        WebElementActions.getActions(driver).clickElement(btn_SignIn);
        Thread.sleep(3000);
        waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);


    }
    /** handel Canvas */
    public void labelCanvas () {
        int canvas_Width = label_canvas.getSize().getWidth();
        int canvas_Height = label_canvas.getSize().getHeight();
        int canvas_Center_X = canvas_Width/2;
        int canvas_Center_Y = canvas_Height/2;
        int y_Offset = (canvas_Center_Y/5)*4;
        System.out.println(canvas_Center_X);
        System.out.println(canvas_Center_Y);
        System.out.println(y_Offset);
        Actions action = new Actions(driver);
        action.dragAndDropBy(label_canvas, 547,260).build().perform();
        action.dragAndDropBy(label_canvas, -647,200).build().perform();
        action.moveToElement(label_canvas,-647,200).build().perform();
        action.moveToElement(label_canvas).click();
        TestListener.saveScreenshotPNG(driver);

    }
    /**click On Ok Button */
    public void clickOnOkButton () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(btn_Ok);
        WebElementActions.getActions(driver).clickElement(btn_Ok);
        waitMethods.loadingWait(loder);

    }
    /**click on labor */
    public void clickOnLabor () throws InterruptedException {

        waitMethods.waitForElementToBeRefreshedAndClickable(label_labor);
        WebElementActions.getActions(driver).clickElement(label_labor);
        Thread.sleep(5000);
        waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);

    }

    /** click On Hyperlink */
    public void cancelHyperLink () throws InterruptedException {

        waitMethods.waitForElementToBeRefreshedAndClickable(img_cancel);
        WebElementActions.getActions(driver).clickElement(img_cancel);
        waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);

    }
    /** click Save And Exit Button */
    public void  clickSaveAndExitButton () throws InterruptedException {

        waitMethods.waitForElementToBeRefreshedAndClickable(btn_SaveExitDeleteButton);
        WebElementActions.getActions(driver).clickElement(btn_SaveExitDeleteButton);
        waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**Select Hyperlink  */
    public void selectHyperLink () throws InterruptedException {

        waitMethods.waitForElementToBeRefreshedAndClickable(btn_SelectButton);
        WebElementActions.getActions(driver).clickElement(btn_SelectButton);
        Thread.sleep(5000);
        waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /** click On Assign  Work  label */
    public void clickOnAssignWork () throws InterruptedException {

        waitMethods.waitForElementToBeRefreshedAndClickable(btn_AssignWork);
        WebElementActions.getActions(driver).clickElement(btn_AssignWork);
        waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);

    }
    /**click On Sign Out */
    public void clickOnSignOut () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(Label_SignOut);
        WebElementActions.getActions(driver).clickElement(Label_SignOut);
        TestListener.saveScreenshotPNG(driver);

    }

}



















