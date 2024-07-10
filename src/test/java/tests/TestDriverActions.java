package tests;

import actions.*;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.Reports.ReportsPage;
import pages.Ticket.*;
import pages.estimating.ApproveanEstimateDMSPage;
import pages.estimating.PerformTheWorkOnAnEstimateTech;
import pages.fleet.CreateUnitPage;
import pages.nonRepair.ApproveNonRepairBill_DMS;
import pages.service.ECServiceManager_ChangeCustomerPOafterInvoicing;
//import tests.Ticket.AddActiveInactiveBothStatusOptionInCustomerUnitExportReport;
//import tests.Ticket.EstimateFormatTaxIssue;
import utils.WaitMethods;
import constants.SheetConstants;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.*;
import pages.Estimate.SubmitAnEstimateServiceManager;
import pages.LoginPage;
//import pages.ReportsPage;
import pages.administration.CreateCustomerPage;
import pages.administration.CreateVendorPage;

import pages.parts.*;
import pages.service.*;
import pages.techRo.*;
import pages.tech.IssuePartToTech;

import pages.tech.EC_Tech_WoLabor;
import pages.tech.EC_Tech_WoParts;
import pages.tech.PauseLabor;
import pages.fleet.CreateRedTagDMS;
import pages.fleet.SetUpWorkRequired;
import pages.cGVUnitFunctionality.InquireFXG_UnitHistory;

//import pages.pmWorkFlow.WorkOrderWorkflowPage;
import pages.pmWorkFlow.cGVTechPerformPM;




import utils.TestListener;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class TestDriverActions {

    public WebDriver driver;

    public WebDriverWait wait;
     public LoginActions loginActions;
    public WaitActions action;
    public CreateVendorPage vendorsPage;
    public CreateCustomerPage customerPage;
    public LoginPage loginPage;
    public WaitMethods waitMethods;
    public WebElementActions webElementActions;
    public TestListener testListener;
    public CreatePart relatedItem;
    public CreateUnitPage createUnitPage;
    public ECServiceManager_ChangeCustomerPOafterInvoicing update;
    public JournalizeCounterSale journalizecountersale;
    public Spotorderpart spotorderparts;
    public SubmitAnEstimateServiceManager  submitanestimateservicemanager;
    public ReceivePart  receivepart;
    public CounterSale counter;
    public ServiceManagerWoLabor servicelabor;
    public ECServiceManager_Journalize journalizepage ;
    public ServiceManagerPartsRelatedTasks servicemanagerpartsrelatedtasks;
    public IssuePartToTech issueparttotech;
    public EC_Tech_WoLabor labor;
    public ECService_Manager_Invoice completeropage;
    public AddaFabricatedPartToaClosedWorkorder addafabricatedparttoaclosedworkorder;
    public EC_Tech_WoParts part;
    public PauseLabor pauselabor;
    public JournalizePartsInvoice journalize;
    public CreateRoPage createRoPage;
    public ECServiceManager_AddRemoveLabor addRemove;
    public InquireFXG_UnitHistory unit;
    public AddActiveInactiveBothStatusOptionInCustomerUnitExportReport addActiveInactive;
    public SetUpWorkRequired setUp;
    public CreateRedTagDMS redtag;
    public ApproveanEstimateDMSPage approveanestimatedmspage;
    public PerformTheWorkOnAnEstimateTech performtheworkonanestimatepage;
    public InquireFXG_UnitHistory unithistorypage;
    public ApproveNonRepairBill_DMS approveNonRepairBill ;
    public cGVTechPerformPM pmworkorderworkflowpage;
    public CreateNonRepairBill_ServiceManager nonrepairbills;
    public cGVTech_WoCompliance wocompliance;
    public SplitRoLocation splitRoLocation;
    public ReportsPage reportsPage;
    public UOMforpressureonInspectionInformationAllowed unitinspectioninformation;
    public CustomerProofNotesIssue customerProofNotesIssue;
    public NonIcCompletedAndWorkFine nonIcCompletedAndWorkFine;
    public TransitonedPaccar location;
    public OverRideTaxesCauseOtherTaxDisappear overRideTaxes ;
    public OverrideContractPriceImportScreen overRideContractPrice;
    public BalanceSheetAndIncomeStatementNotPopulatingData balancesheet;
    public SafetyCertificatesReportCharacterLimit safetycertificate;
    public DefectManagerInspectedbyColumnBlank defectmanager;
    public RentedToFieldAddedtoCompleteROandUnitMaster rentedtofield;
    public FedExNonRepairBillnotAutoSearchingLocationsorVendors autosearchlocationvendor;
    public AddInactiveCheckBoxOnTechTimeSheet addInactiveChecknoxTimesheet;
    public FieldDoesNotUpdateonNonRepairBillsAfterSwitchingLocation fielddoesnotupdate;
    public SerializedPartsOnPhysicalCounts serializepart;
    public MandatoryEmailFieldOnUnitReturn mandatoryemail;
    public SalesTaxLiabiltiyAccrualBasisDisrepancy SalesTaxLiability ;
    public IssuePartsToROExceptionError issuePartsToROExceptionError;
    public HideShopSuppliesOnWOInvoiceParameterNotWorking hideshopsupplies ;
    public AddInvoiceToByCustomerBENLEA addInvoicetobycustomer;
    public IssuePartstoROExceptionErrorFrom issuePartstoROExceptionErrorFrom;
    public AccountingPeriodErrorAMERIT accountingperioderroramerit ;
    public AddSearchFieldToTheTelematicsManagerImportReadingsTab addSearchFieldToTelematicManager;
    public InvoiceCopyHeadersNotWorking invoiceCopyHeaders;
    public MakeAndModelsBeComingInActiveLOTSVENTURES makAndModels ;
    public InvoicetoCustomerIssuesBENLEA invoiceCustomerIssues ;
    public SalesTaxLiabilityCashBasisCalculationIssueBROTHERTON salesTaxLiabilityCash ;
    public PartChargeNotOpeningConsistently partChargeNotOpening;
    public APManagerOutstandingInvoiceTotal  smithys;
    public ContactEmailFieldDataRequest datarequest;
    public  CustomerProofPartOrder  unitedtruck;
    public EstimateFormatMissingLaborNotesDescription estimateformatmissinglabor;
    public EstimateFormatTaxIssue estimateformattaxissue;
    public NonStockPartswithOnhandsReportCorrections nonstockparts;
    public OrganizeFavoritesArrowsNotWorking americanbody;
    public SugestedOrderReporttrucatePartNumber reportrestockorreorder;
    public TechnicianTimeEntriestobelogged nonrepairbilllineitems;
    public TwelveMonthActualCountonRESTOCKREORDERREPORTinExcelformat Superstition;
    public UnableToRemoveCoreLink_CONVOY unabletoremovecorelink;
    public RepairOrderReportUnitOwnerSpacing repairOrderReport ;
    public PartialReceiveButtonMissWhenPartsReceivedMatchQuantityOfPartsOrdered partialReceivedButton;
    public LabelExceptionError caledon;
    public TheServiceBoardRefreshesAndLosesTheUsersPosition workrequiredpopup;

    public SlownessForSQLStatementOn slownessForSQL;







    String folderPath, cmd,filePath;

    static {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy-hh-mm-ss");
        System.setProperty("current.date.time", dateFormat.format(new Date()));
    }

  /*  @BeforeSuite
    public void logSuite() {
        System.getProperty(("user.dir") + "\\log4j.xml");
        //DOMConfigurator.configure("log4j.xml");
    } */
    public String allurePathWin = System.getProperty("user.dir") + "\\allure-2.13.6\\bin\\allure.bat";

    public static Properties prop,configProp,appProp,appProp2,appProp3,appProp4,appProp5,
            appProp6,appProp7,appProp8,appProp9,appProp10,appProp11,appProp12,appProp13,appProp14,
            appProp15,appProp16,appProp17,appProp18,appProp19,appProp20,appProp21,appProp22,appProp23,
            appProp24,appProp25,appProp26,appProp27,appProp28,appProp29,appProp30,appProp31,appProp32,
            appProp33,appProp34,appProp35,appProp36,appProp37,appProp38,appProp39,appProp40,appProp41,
            appProp42,appProp43,appProp44,appProp45,appProp46,appProp47,appProp48,appProp49,appProp50,
            appProp51,appProp52,appProp53,appProp54,appProp55,appProp56,appProp57,appProp58,appProp59,
            appProp60,appProp61,appProp62,appProp63,appProp64,appProp65,appProp66,appProp67,appProp68,
            appProp69,appProp70,appProp71,appProp72,appProp73,appProp74,appProp75,appProp76,appProp77,
            appProp78,appProp79,appProp80,appProp81,appProp82,appProp83,appProp84,appProp85,appProp86,
             appProp87;


    public void property() throws IOException, InterruptedException {


        if (this.getClass().getCanonicalName().contains("LoginTest")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/login.properties";
        }
        else if (this.getClass().getCanonicalName().contains("CreateUnit")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/createunitQA.properties";
        }
        else if (this.getClass().getCanonicalName().contains("CounterSale")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/countersaleQA.properties";
        }
        else if (this.getClass().getCanonicalName().contains("CreateCustomer")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/createcustomerQA.properties";
        }
        else if (this.getClass().getCanonicalName().contains("CreateVendor")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/createvendorQA.properties";
        }
        else if (this.getClass().getCanonicalName().contains("CreateRoTest")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/config.properties";
        }
        else if (this.getClass().getCanonicalName().contains("SubmitAnEstimateServiceManager")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/submitanestimateservicemanagerQA.properties";
        }
        else if (this.getClass().getCanonicalName().contains("SetUpWorkRequiredTest")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/setupworkrequired.properties";
        }
        else if (this.getClass().getCanonicalName().contains("ServiceManagerChangeCustomerPOafterInvoicing")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/servicemanagerchangecustomerpoafterinvoicingQA.properties";
        }
        else if (this.getClass().getCanonicalName().contains("InquireFXG_UnitHistoryTest")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/unitfunctionality.properties";
        }
        else if (this.getClass().getCanonicalName().contains("JournalizePartsInvoice")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/journalizepartsinvoiceQA.properties";
        }
        else if (this.getClass().getCanonicalName().contains("TechWoLabor")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/techwolaborQA.properties";
        }
        else if (this.getClass().getCanonicalName().contains("TechWoParts")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/techwopartsQA.properties";
        }
        else if (this.getClass().getCanonicalName().contains("ECServiceManager_AddRemoveLaborTest")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/addremove.properties";
        }
        else if (this.getClass().getCanonicalName().contains("ServiceManagerWoLabor")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/servicemanagerwolaborQA.properties";
        }
        else if (this.getClass().getCanonicalName().contains("CreateNonRepairBill_ServiceManagerTest")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/NonRepairBills.properties";
        }
        else if (this.getClass().getCanonicalName().contains("ServiceManagerInvoice")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/servicemanagerinvoiceQA.properties";
        }
        else if (this.getClass().getCanonicalName().contains("ApproveNonRepairBillTest")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/approvenonrepair.properties";
        }
        else if (this.getClass().getCanonicalName().contains("cGVTech_WoComplianceTest")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/wocompliance.properties";
        }
        else if (this.getClass().getCanonicalName().contains("ServiceManagerJournalize")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/servicemanagerjournalizeQA.properties";
        }
        else if (this.getClass().getCanonicalName().contains("CreateRedTagDMSTest")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/redtag.properties";
        }
        else if (this.getClass().getCanonicalName().contains("InquireFXG_UnitHistoryTest")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/unithistory.properties";
        }
        else if (this.getClass().getCanonicalName().contains("ApproveNonRepairBill_DMSTest")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/approveanestimatedms.properties";
        }
        else if (this.getClass().getCanonicalName().contains("cGVTechPerformPM")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/cgvtechperformpmQA.properties";
        }
        else if (this.getClass().getCanonicalName().contains("PerformTheWorkOnAnEstimateTechTest")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/performtheworkonanestimate.properties";
        }
        else if (this.getClass().getCanonicalName().contains("Spotorderparts")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/spotorderpartsQA.properties";
        }
        else if (this.getClass().getCanonicalName().contains("CreatePart")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/createpartQA.properties";
        }
        else if (this.getClass().getCanonicalName().contains("ReceiveParts")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/receivepartsQA.properties";
        }
        else if (this.getClass().getCanonicalName().contains("ServiceManagerPartsRelatedTasks")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/servicemanagerpartsrelatedtasksQA.properties";
        }
        else if (this.getClass().getCanonicalName().contains("IssuePartToTech")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/issueparttotechEC.properties";
        }
        else if (this.getClass().getCanonicalName().contains("PauseLabor")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/pauselaborNA.properties";
        }
        else if (this.getClass().getCanonicalName().contains("SplitRoLocation")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/splitrolocationQA.properties";
        }
        else if (this.getClass().getCanonicalName().contains("AddaFabricatedPartToaClosedWorkorder")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/AddafabricatedparttoaclosedworkorderQA.properties";
        }
        else if (this.getClass().getCanonicalName().contains("CustomerProofNotesIssue")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/customerproofnotesissueQA.properties";
        }
        else if(this.getClass().getCanonicalName().contains("Reports")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/reports.properties";
        }
        else if(this.getClass().getCanonicalName().contains("UOMforpressureonInspectionInformationAllowed")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/uomforpressureoninspectioninformationallowedQA.properties";
        }
        else if(this.getClass().getCanonicalName().contains("TransitonedPaccar")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/transitonedpaccarQA.properties";
        }
        else if(this.getClass().getCanonicalName().contains("NonIcCompletedAndWorkFine")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/noniccompletedandworkfineQA.properties";
        }
        else if(this.getClass().getCanonicalName().contains("OverRideTaxesCauseOtherTaxDisappear")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/overridetaxescauseothertaxdisappearEU.properties";
        }
        else if(this.getClass().getCanonicalName().contains("OverrideContractPriceImportScreen")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/overridecontractpriceimportscreenQA.properties";
        }
        else if(this.getClass().getCanonicalName().contains("BalanceSheetAndIncomeStatementNotPopulatingData")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/balancesheetandincomestatementnotpopulatingdataQA.properties";
        }
        else if(this.getClass().getCanonicalName().contains("SafetyCertificatesReportCharacterLimit")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/safetycertificatesreportcharacterlimitQA.properties";
        }
        else if(this.getClass().getCanonicalName().contains("AddActiveInactiveBothStatusOptionInCustomerUnitExportReport")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/addactiveinactivebothstatusoptionincustomerunitexportreportEC.properties";
        }
        else if (this.getClass().getCanonicalName().contains("DefectManagerInspectedbyColumnBlank")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/defectmanagerinspectedbycolumnblankQA.properties";
        }
        else if (this.getClass().getCanonicalName().contains("FedExNonRepairBillnotAutoSearchingLocationsorVendors")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/fedexnonrepairbillnotautosearchinglocationsorvendors.properties";
        }
        else if (this.getClass().getCanonicalName().contains("AddInactiveCheckBoxOnTechTimeSheet")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/addinactivecheckboxontechtimesheetQA.properties";
        }
        else if (this.getClass().getCanonicalName().contains("FieldDoesNotUpdateonNonRepairBillsAfterSwitchingLocation")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/fielddoesnotupdateonnonrepairbillsafterswitchinglocationQA.properties";
        }
        else if (this.getClass().getCanonicalName().contains("SerializedPartsOnPhysicalCounts")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/serializedpartsonphysicalcountsQA.properties";
        }
        else if (this.getClass().getCanonicalName().contains("MandatoryEmailFieldOnUnitReturn")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/mandatoryemailfieldonunitreturnQA.properties";
        }
        else if (this.getClass().getCanonicalName().contains("SalesTaxLiabiltiyAccrualBasisDisrepancy")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/salestaxliabiltiyaccrualbasisdisrepancyQA.properties";
        }
        else if (this.getClass().getCanonicalName().contains("IssuePartsToROExceptionError")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/issuepartstoroexceptionerrorQA.properties";
        }
        else if (this.getClass().getCanonicalName().contains("HideShopSuppliesOnWOInvoiceParameterNotWorking")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/hideshopsuppliesonwoinvoiceparameternotworkingQA.properties";
        }
        else if (this.getClass().getCanonicalName().contains("AddInvoiceToByCustomerBENLEA")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/addinvoicetobycustomerbenleaQA.properties";
        }
        else if (this.getClass().getCanonicalName().contains("IssuePartstoROExceptionErrorFrom")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/issuepartstoroexceptionerrorfromQA.properties";
        }
        else if (this.getClass().getCanonicalName().contains("AccountingPeriodErrorAMERIT")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/accountingperioderrorameritQA.properties";
        }
        else if (this.getClass().getCanonicalName().contains("AddSearchFieldToTheTelematicsManagerImportReadingsTab")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/addsearchfieldtothetelematicsmanagerimportreadingstabQA.properties";
        }
        else if(this.getClass().getCanonicalName().contains("InvoiceCopyHeadersNotWorking")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/invoicecopyheadersnotworkingQA.properties";
        }
        else if (this.getClass().getCanonicalName().contains("MakeAndModelsBeComingInActiveLOTSVENTURES")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/makeandmodelsbecominginactivelotsventuresQA.properties";
        }
        else if (this.getClass().getCanonicalName().contains("InvoicetoCustomerIssuesBENLEA")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/invoicetocustomerissuesbenleaQA.properties";
        }
        else if (this.getClass().getCanonicalName().contains("SalesTaxLiabilityCashBasisCalculationIssueBROTHERTON")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/salestaxliabilitycashbasiscalculationissuebrothertonQA.properties";
        }
        else if(this.getClass().getCanonicalName().contains("PartChargeNotOpeningConsistently")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/partchargenotopeningconsistentlyQA.properties";
        }
        else if (this.getClass().getCanonicalName().contains("APManagerOutstandingInvoiceTotal")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/apmanageroutstandinginvoicetotalQA.properties";
        }
        else if(this.getClass().getCanonicalName().contains("ContactEmailFieldDataRequest")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/contactemailfielddatarequestQA.properties";
        }
        else if (this.getClass().getCanonicalName().contains("CustomerProofPartOrder")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/customerproofpartorderQA.properties";
        }
        else if(this.getClass().getCanonicalName().contains("EstimateFormatMissingLaborNotesDescription")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/estimateformatmissinglabornotesdescriptionQA.properties";
        }
        else if (this.getClass().getCanonicalName().contains("NonStockPartswithOnhandsReportCorrections")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/nonstockpartswithonhandsreportcorrectionsQA.properties";
        }
        else if(this.getClass().getCanonicalName().contains("OrganizeFavoritesArrowsNotWorking")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/organizefavoritesarrowsnotworkingQA.properties";
        }
        else if(this.getClass().getCanonicalName().contains("SugestedOrderReporttrucatePartNumber")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/suggestedorderreporttrucatepartnumberQA.properties";
        }
        else if(this.getClass().getCanonicalName().contains("TechnicianTimeEntriestobelogged")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/techniciantimeentriestobeloggedQA.properties";
        }
        else if (this.getClass().getCanonicalName().contains("TwelveMonthActualCountonRESTOCKREORDERREPORTinExcelformat")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/twelvemonthactualcountonrestockeorderreportinexcelformatQA.properties";
        }
        else if (this.getClass().getCanonicalName().contains("UnableToRemoveCoreLink_CONVOY")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/unabletoremovecorelink_convoyQA.properties";
        }
        else if (this.getClass().getCanonicalName().contains("EstimateFormatTaxIssue")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/estimateformattaxissueQA.properties";
        }
        else if (this.getClass().getCanonicalName().contains("RepairOrderReportUnitOwnerSpacing")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/repairorderreportunitownerspacingQA.properties";
        }
        else if(this.getClass().getCanonicalName().contains("PartialReceiveButtonMissWhenPartsReceivedMatchQuantityOfPartsOrdered")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/partialreceivebuttonmisswhenpartsreceivedmatchquantityofpartsorderedQA.properties";
        }
        else if (this.getClass().getCanonicalName().contains("LabelExceptionError")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/labelexceptionerrorQA.properties";
        }
        else if (this.getClass().getCanonicalName().contains("TheServiceBoardRefreshesAndLosesTheUsersPosition")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/theserviceboardrefreshesandlosestheuserspositionQA.properties";
        }
        else if (this.getClass().getCanonicalName().contains("SlownessForSQLStatementOn")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/slownessforsqlstatementonQA.properties";
        }



    }

    /**
     * Initialization of Framework
     */

    @BeforeClass(alwaysRun = true)
    public void initialization() throws IOException, InterruptedException {

  //      property();

//        dataActions = new DataActions(driver);

        String browserName = DataActions.getReuseActions().getCellData(SheetConstants.loginSheetPath, SheetConstants.sheetNameForFrameworkConfig, SheetConstants.columnForBrowser, SheetConstants.browserRowNumber);

//        System.getProperty(("user.dir") +"\\log4j.xml");
//        DOMConfigurator.configure("D:\\intellij\\latest_OfficeWork\\WorkingProject\\Emdecs_Test_Automation\\log4j.xml");

        if (browserName.equalsIgnoreCase(browserName)) {
            WebDriverManager.chromedriver().setup();
            ChromeOptions options = new ChromeOptions();
            HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
            chromePrefs.put("plugins.plugins_disabled", new String[] { "Chrome PDF Viewer" });
            chromePrefs.put("plugins.always_open_pdf_externally", true);
            chromePrefs.put("download.prompt_for_download", false);
            chromePrefs.put("download.default_directory", System.getProperty("user.dir")+"\\downloadFiles");
            options.addArguments("--remote-allow-origins=*");
            options.addArguments("--start-maximized");
//options.addArguments("--headless=new");
            options.addArguments("--window-size=1366,768");
            options.addArguments("--no-sandbox");
            options.addArguments("--disable-popup-blocking");
            options.addArguments("--disable-dev-shm-usage");
            options.addArguments("--disable-gpu");
            options.addArguments("--dns-prefetch-disable");
            options.addArguments("--always-authorize-plugins");
            options.addArguments("enable-automation");
            options.addArguments("--disable-browser-side-navigation");
            options.addArguments("--ignore-certificate-errors");
            options.addArguments("--disable-extensions");
            options.addArguments("--allow-running-insecure-content");
            options.setExperimentalOption("prefs", chromePrefs);
            options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
            driver = new ChromeDriver(options);
            //  driver.manage().window().setSize(new Dimension(1920, 1080));
            driver.manage().window().maximize();


        } else if (browserName.equalsIgnoreCase("Firefox")) {

            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }


         loginActions = new LoginActions();
         if(loginActions.environmentName.contains("QA")||loginActions.environmentName.contains("EU")||loginActions.environmentName.contains("EC")||loginActions.environmentName.contains("NA")
            || loginActions.environmentName.contains("fedex")) {

             driver.get(loginActions.getAppUrl1(getMyClassName()));    //new method Akash kadam
         }
         else{
              driver.get(loginActions.getAppUrl());      //old method
         }


  //      loginPage.selectCountryFromDropDown();

        webElementActions = new WebElementActions(driver);

         action = new WaitActions(driver);

          waitMethods = new WaitMethods(driver);



 //       reusableActions = new ReusableActions(driver);

        testListener = new TestListener();

        loginPage = PageFactory.initElements(driver, LoginPage.class);
        vendorsPage = PageFactory.initElements(driver, CreateVendorPage.class);
        customerPage = PageFactory.initElements(driver, CreateCustomerPage.class);
        createUnitPage = PageFactory.initElements(driver, CreateUnitPage.class);
        relatedItem = PageFactory.initElements(driver, CreatePart.class);
        update = PageFactory.initElements(driver, ECServiceManager_ChangeCustomerPOafterInvoicing.class);
        journalizecountersale = PageFactory.initElements(driver, JournalizeCounterSale.class);
        spotorderparts = PageFactory.initElements(driver,Spotorderpart.class);
        submitanestimateservicemanager=PageFactory.initElements(driver, SubmitAnEstimateServiceManager.class);
        receivepart= PageFactory.initElements(driver, ReceivePart.class);
        counter = PageFactory.initElements(driver, CounterSale.class);
        servicelabor = PageFactory.initElements(driver, ServiceManagerWoLabor.class);
        journalizepage = PageFactory.initElements(driver, ECServiceManager_Journalize.class);
        servicemanagerpartsrelatedtasks= PageFactory.initElements(driver, ServiceManagerPartsRelatedTasks.class);
        issueparttotech = PageFactory.initElements(driver, IssuePartToTech.class);
        labor = PageFactory.initElements(driver, EC_Tech_WoLabor.class);
        completeropage = PageFactory.initElements(driver, ECService_Manager_Invoice.class);
        addafabricatedparttoaclosedworkorder = PageFactory.initElements(driver, AddaFabricatedPartToaClosedWorkorder.class);
        part = PageFactory.initElements(driver, EC_Tech_WoParts.class);
        pauselabor = PageFactory.initElements(driver,PauseLabor.class);
        journalize = PageFactory.initElements(driver, JournalizePartsInvoice.class);
        createRoPage = PageFactory.initElements(driver, CreateRoPage.class);
        addRemove = PageFactory.initElements(driver, ECServiceManager_AddRemoveLabor.class);
        unit = PageFactory.initElements(driver, InquireFXG_UnitHistory.class);
        addActiveInactive = PageFactory.initElements(driver,AddActiveInactiveBothStatusOptionInCustomerUnitExportReport.class);
        setUp = PageFactory.initElements(driver,SetUpWorkRequired.class);
        redtag = PageFactory.initElements(driver,CreateRedTagDMS.class);
        approveanestimatedmspage = PageFactory.initElements(driver, ApproveanEstimateDMSPage.class);
        performtheworkonanestimatepage = PageFactory.initElements(driver, PerformTheWorkOnAnEstimateTech.class);
        unithistorypage = PageFactory.initElements(driver, InquireFXG_UnitHistory.class);
        nonrepairbills = PageFactory.initElements(driver, CreateNonRepairBill_ServiceManager.class);
        wocompliance = PageFactory.initElements(driver, cGVTech_WoCompliance.class);
       approveNonRepairBill = PageFactory.initElements(driver, ApproveNonRepairBill_DMS.class);
       pmworkorderworkflowpage = PageFactory.initElements(driver, cGVTechPerformPM.class);
        splitRoLocation = PageFactory.initElements(driver,SplitRoLocation.class);
        customerProofNotesIssue = PageFactory.initElements(driver, CustomerProofNotesIssue.class);
        reportsPage = PageFactory.initElements(driver,ReportsPage.class);
        unitinspectioninformation = PageFactory.initElements(driver, UOMforpressureonInspectionInformationAllowed.class);
        nonIcCompletedAndWorkFine = PageFactory.initElements(driver,NonIcCompletedAndWorkFine.class);
        location = PageFactory.initElements(driver,TransitonedPaccar.class);
        overRideTaxes = PageFactory.initElements(driver,OverRideTaxesCauseOtherTaxDisappear.class);
        overRideContractPrice = PageFactory.initElements(driver,OverrideContractPriceImportScreen.class);
        balancesheet = PageFactory.initElements(driver,BalanceSheetAndIncomeStatementNotPopulatingData.class);
        safetycertificate = PageFactory.initElements(driver,SafetyCertificatesReportCharacterLimit.class);
        defectmanager = PageFactory.initElements(driver,DefectManagerInspectedbyColumnBlank.class);
        rentedtofield = PageFactory.initElements(driver,RentedToFieldAddedtoCompleteROandUnitMaster.class);
        autosearchlocationvendor = PageFactory.initElements(driver,FedExNonRepairBillnotAutoSearchingLocationsorVendors.class);
        addInactiveChecknoxTimesheet = PageFactory.initElements(driver,AddInactiveCheckBoxOnTechTimeSheet.class);
        fielddoesnotupdate = PageFactory.initElements(driver,FieldDoesNotUpdateonNonRepairBillsAfterSwitchingLocation.class);
        serializepart = PageFactory.initElements(driver,SerializedPartsOnPhysicalCounts.class);
        mandatoryemail = PageFactory.initElements(driver,MandatoryEmailFieldOnUnitReturn.class);
        SalesTaxLiability = PageFactory.initElements(driver,SalesTaxLiabiltiyAccrualBasisDisrepancy.class);
        issuePartsToROExceptionError = PageFactory.initElements(driver,IssuePartsToROExceptionError.class);
        hideshopsupplies = PageFactory.initElements(driver, HideShopSuppliesOnWOInvoiceParameterNotWorking.class);
        addInvoicetobycustomer = PageFactory.initElements(driver,AddInvoiceToByCustomerBENLEA.class);
        issuePartstoROExceptionErrorFrom = PageFactory.initElements(driver, IssuePartstoROExceptionErrorFrom.class);
        accountingperioderroramerit = PageFactory.initElements(driver,AccountingPeriodErrorAMERIT.class);
        addSearchFieldToTelematicManager = PageFactory.initElements(driver,AddSearchFieldToTheTelematicsManagerImportReadingsTab.class);
        invoiceCopyHeaders = PageFactory.initElements(driver,InvoiceCopyHeadersNotWorking.class);
        makAndModels = PageFactory.initElements(driver,MakeAndModelsBeComingInActiveLOTSVENTURES.class);
        invoiceCustomerIssues = PageFactory.initElements(driver,InvoicetoCustomerIssuesBENLEA.class);
        salesTaxLiabilityCash = PageFactory.initElements(driver,SalesTaxLiabilityCashBasisCalculationIssueBROTHERTON.class);
        partChargeNotOpening = PageFactory.initElements(driver,PartChargeNotOpeningConsistently.class);
        smithys = PageFactory.initElements(driver,APManagerOutstandingInvoiceTotal.class);
        datarequest = PageFactory.initElements(driver, ContactEmailFieldDataRequest.class);
        unitedtruck = PageFactory.initElements(driver,CustomerProofPartOrder.class);
        estimateformatmissinglabor = PageFactory.initElements(driver,EstimateFormatMissingLaborNotesDescription.class);
        estimateformattaxissue = PageFactory.initElements(driver,EstimateFormatTaxIssue.class);
        nonstockparts = PageFactory.initElements(driver,NonStockPartswithOnhandsReportCorrections.class);
        americanbody = PageFactory.initElements(driver,OrganizeFavoritesArrowsNotWorking.class);
        reportrestockorreorder = PageFactory.initElements(driver,SugestedOrderReporttrucatePartNumber.class);
        nonrepairbilllineitems = PageFactory.initElements(driver,TechnicianTimeEntriestobelogged.class);
        Superstition = PageFactory.initElements(driver,TwelveMonthActualCountonRESTOCKREORDERREPORTinExcelformat.class);
        unabletoremovecorelink = PageFactory.initElements(driver,UnableToRemoveCoreLink_CONVOY.class);
        repairOrderReport = PageFactory.initElements(driver,RepairOrderReportUnitOwnerSpacing.class);
        partialReceivedButton = PageFactory.initElements(driver,PartialReceiveButtonMissWhenPartsReceivedMatchQuantityOfPartsOrdered.class);
        caledon = PageFactory.initElements(driver,LabelExceptionError.class);
        workrequiredpopup = PageFactory.initElements(driver,TheServiceBoardRefreshesAndLosesTheUsersPosition.class);
        slownessForSQL = PageFactory.initElements(driver, SlownessForSQLStatementOn.class);

        loginPage.selectCountryFromDropDown();

        property();

        configProp  = new Properties();
        FileInputStream fip = new FileInputStream(System.getProperty("user.dir") + "/src/test/java/utils/config.properties");
        try {
            configProp.load(fip);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * It generates test execution report in Html Format (Including Test steps, Screenshots and Pass/Fail Status)
     */
    public void generateHtmlReport() {
    }

    /**
     * Quit Browser after all execution completed
     */

    public void emptyResults() {
        try {
            for (File file : new java.io.File(System.getProperty("user.dir") + "/allure-results").listFiles())
                if (!file.isDirectory()) {
                    file.delete();
                }
        } catch (Exception E) {

        }
    }

    @AfterSuite(alwaysRun = true)
    public void generateAllure() throws Exception {
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy_MM_dd_HH.mm.ss");
        String currentDateTime = format.format(date);
        if (getClass().getCanonicalName().contains("CreateRoTest")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/CreateRoTestReports/" + "__" + currentDateTime;
        }
         else if (getClass().getCanonicalName().contains("CreateUnit")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/CreateUnitReports/" + "__" + currentDateTime;
        }
         else if (getClass().getCanonicalName().contains("CreateVendor")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/CreateVendorReports/" + "__" + currentDateTime;
        }
         else if (getClass().getCanonicalName().contains("CreateCustomer")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/CreateCustomerReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("CounterSale")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/CounterSaleReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("LoginTest")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/LoginTestReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("SubmitAnEstimate_ServiceManagerTest")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/SubmitAnEstimate_ServiceManagerTestReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("SetUpWorkRequiredTest")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/SetUpWorkRequiredTestReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("ServiceManagerChangeCustomerPOafterInvoicing")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/ServiceManagerChangeCustomerPOafterInvoicingReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("InquireFXG_UnitHistoryTest")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/InquireFXG_UnitHistoryTestReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("JournalizePartsInvoice")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/JournalizePartsInvoiceReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("TechWoLabor")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/TechWoLaborReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("TechWoParts")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/TechWoPartsReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("ECServiceManager_AddRemoveLaborTest")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/ECServiceManager_AddRemoveLaborTestReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("ServiceManagerWoLabor")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/ServiceManagerWoLaborReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("CreateNonRepairBill_ServiceManagerTest")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/CreateNonRepairBill_ServiceManagerTestReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("cGVTech_WoComplianceTest")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/cGVTech_WoComplianceTestReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("ServiceManagerInvoice")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/ServiceManagerInvoiceReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("ServiceManagerPartsRelatedTasks")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/ServiceManagerPartsRelatedTasksReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("ApproveNonRepairBillTest")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/ApproveNonRepairBillTestReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("UnitMasterTest")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/UnitMasterTestReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("ServiceManagerJournalize")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/ServiceManagerJournalizeReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("CreateRedTagDMSTest")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/CreateRedTagDMSTestReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("ReceiveParts")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/ReceivePartsReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("ApproveNonRepairBill_DMSTest")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/ApproveNonRepairBill_DMSTestReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("cGVTechPerformPM")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/cGVTechPerformPMReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("PerformTheWorkOnAnEstimateTechTest")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/PerformTheWorkOnAnEstimateTechTestReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("JournalizeCounterSale")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/JournalizeCounterSaleReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("ServiceManagerPartsRelatedTasks")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/ServiceManagerPartsRelatedTasksReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("SubmitAnEstimateServiceManager")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/SubmitAnEstimateServiceManagerReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("Spotorderparts")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/SpotorderpartsReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("ReceiveParts")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/ReceivePartsReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("CreatePart")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/CreatePartReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("IssuePartToTech")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/IssuePartToTechReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("PauseLabor")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/PauseLaborReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("SplitRoLocation")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/SplitRoLocation/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("AddaFabricatedPartToaClosedWorkorder")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/AddaFabricatedPartToaClosedWorkorder/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("CustomerProofNotesIssue")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/CustomerProofNotesIssue/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("Reports")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/ReportsReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("UomforpressureonInspectionInformationAllowed")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/UomforpressureonInspectionInformationAllowedReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("TransitonedPaccar")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/TransitonedPaccarReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("NonIcCompletedAndWorkFine")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/NonIcCompletedAndWorkFineReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("OverRideTaxesCauseOtherTaxDisappear")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/OverRideTaxesCauseOtherTaxDisappearReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("OverrideContractPriceImportScreen")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/OverrideContractPriceImportScreenReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("BalanceSheetAndIncomeStatementNotPopulatingData")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/BalanceSheetAndIncomeStatementNotPopulatingDataReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("SafetyCertificatesReportCharacterLimit")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/SafetyCertificatesReportCharacterLimitReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("AddActiveInactiveBothStatusOptionInCustomerUnitExportReport")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/AddActiveInactiveBothStatusOptionInCustomerUnitExportReportReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("DefectManagerInspectedbyColumnBlank")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/DefectManagerInspectedbyColumnBlank/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("RentedToFieldAddedtoCompleteROandUnitMaster")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/RentedToFieldAddedtoCompleteROandUnitMasterReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("FedExNonRepairBillnotAutoSearchingLocationsorVendors")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/FedExNonRepairBillnotAutoSearchingLocationsorVendorsReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("AddInactiveCheckBoxOnTechTimeSheet")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/AddInactiveCheckBoxOnTechTimeSheetReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("FieldDoesNotUpdateonNonRepairBillsAfterSwitchingLocation")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/FieldDoesNotUpdateonNonRepairBillsAfterSwitchingLocationReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("SerializedPartsOnPhysicalCounts")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/SerializedPartsOnPhysicalCountsReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("MandatoryEmailFieldOnUnitReturn")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/MandatoryEmailFieldOnUnitReturnReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("SalesTaxLiabiltiyAccrualBasisDisrepancy")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/SalesTaxLiabiltiyAccrualBasisDisrepancyReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("IssuePartsToROExceptionError")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/IssuePartsToROExceptionErrorReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("HideShopSuppliesOnWOInvoiceParameterNotWorking")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/HideShopSuppliesOnWOInvoiceParameterNotWorkingReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("AddInvoiceToByCustomerBENLEA")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/AddInvoiceToByCustomerBENLEAReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("IssuePartstoROExceptionErrorFrom")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/IssuePartstoROExceptionErrorFromReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("AccountingPeriodErrorAMERIT")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/AccountingPeriodErrorAMERITReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("AddSearchFieldToTheTelematicsManagerImportReadingsTab")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/AddSearchFieldToTheTelematicsManagerImportReadingsTabReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("InvoiceCopyHeadersNotWorking")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/InvoiceCopyHeadersNotWorkingReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("MakeAndModelsBeComingInActiveLOTSVENTURES")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/MakeAndModelsBeComingInActiveLOTSVENTURESReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("InvoicetoCustomerIssuesBENLEA")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/InvoicetoCustomerIssuesBENLEAReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("SalesTaxLiabilityCashBasisCalculationIssueBROTHERTON")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/SalesTaxLiabilityCashBasisCalculationIssueBROTHERTONReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("PartChargeNotOpeningConsistently")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/PartChargeNotOpeningConsistentlyReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("Apmanageroutstandinginvoicetotal")) {
            folderPath = System.getProperty("user.dir") +"/allure-results/Reports/ApmanageroutstandinginvoicetotalReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("ContactEmailFieldDataRequest")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/ContactEmailFieldDataRequestReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("CustomerProofPartOrder")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/CustomerProofPartOrderReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("EstimateFormatMissingLaborNotesDescription")) {
            folderPath = System.getProperty("user.dir") +"/allure-results/Reports/EstimateFormatMissingLaborNotesDescriptionReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("NonStockPartswithOnhandsReportCorrections")) {
            folderPath = System.getProperty("user.dir") +"/allure-results/Reports/NonStockPartswithOnhandsReportCorrectionsReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("OrganizeFavoritesArrowsNotWorking")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/OrganizeFavoritesArrowsNotWorkingReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("SugestedOrderReporttrucatePartNumber")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/SugestedOrderReporttrucatePartNumberReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("TechnicianTimeEntriestobelogged")) {
            folderPath = System.getProperty("user.dir") +"/allure-results/Reports/TechnicianTimeEntriestobeloggedReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("TwelveMonthActualCountonRESTOCKREORDERREPORTinExcelformat")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/TwelveMonthActualCountonRESTOCKREORDERREPORTinExcelformatReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("UnableToRemoveCoreLink_CONVOY")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/UnableToRemoveCoreLink_CONVOYReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("EstimateFormatTaxIssue")) {
            folderPath = System.getProperty("user.dir") +"/allure-results/Reports/EstimateFormatTaxIssueReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("RepairOrderReportUnitOwnerSpacing")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/RepairOrderReportUnitOwnerSpacingReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("PartialReceiveButtonMissWhenPartsReceivedMatchQuantityOfPartsOrdered")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/PartialReceiveButtonMissWhenPartsReceivedMatchQuantityOfPartsOrderedReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("LabelExceptionError")) {
            folderPath = System.getProperty("user.dir") +"/allure-results/Reports/LabelExceptionErrorReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("TheServiceBoardRefreshesAndLosesTheUsersPosition")) {
            folderPath = System.getProperty("user.dir") +"/allure-results/Reports/TheServiceBoardRefreshesAndLosesTheUsersPositionReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("SlownessForSQLStatementOn")) {
            folderPath = System.getProperty("user.dir") +"/allure-results/Reports/SlownessForSQLStatementOnReports/" + "__" + currentDateTime;
        }




        File theDir = new File(folderPath);

            // if the directory does not exist, create it

            if (!theDir.exists()) {
                System.out.println("creating directory: " + theDir.getName());
                boolean result = false;
                try {
                    theDir.mkdirs();
                    result = true;
                } catch (SecurityException se) {
                    // handle it
                    System.out.println(se.getMessage());
                }
                if (result) {
                    System.out.println("Folder created");
                }
            } else if (theDir.exists()) {
                System.out.println("Folder exist");
            }

      /*  if (getClass().getCanonicalName().contains("CreateRoTest")) {
            cmd = allurePathWin + " generate" + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\CreateRoTestReports\\" + theDir.getName();
        } */
            if (getClass().getCanonicalName().contains("CreateRoTest")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\CreateRoTestReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("CreateUnit")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\CreateUnitReports\\" + theDir.getName();
            }
             else if (getClass().getCanonicalName().contains("CreateVendor")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\CreateVendorReports\\" + theDir.getName();
            }
             else if (getClass().getCanonicalName().contains("CreateCustomer")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\CreateCustomerReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("CounterSale")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\CounterSaleReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("LoginTest")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\LoginTestReports\\" +theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("SubmitAnEstimate_ServiceManagerTest")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\SubmitAnEstimate_ServiceManagerTestReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("SetUpWorkRequiredTest")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\SetUpWorkRequiredTestReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("ServiceManagerChangeCustomerPOafterInvoicing")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\ServiceManagerChangeCustomerPOafterInvoicingReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("ReceiveParts")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\ReceivePartsReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("JournalizePartsInvoice")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\JournalizePartsInvoiceReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("TechWoLabor")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\TechWoLaborReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("TechWoParts")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\TechWoPartsReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("ECServiceManager_AddRemoveLaborTest")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\ECServiceManager_AddRemoveLaborTestReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("ServiceManagerWoLabor")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\ServiceManagerWoLaborReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("CreateNonRepairBill_ServiceManagerTest")) {
            cmd = allurePathWin + " generate" + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\CreateNonRepairBill_ServiceManagerTestReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("ServiceManagerInvoice")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\ServiceManagerInvoiceReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("ServiceManagerPartsRelatedTasks")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\ServiceManagerPartsRelatedTasksReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("ApproveNonRepairBillTest")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\ApproveNonRepairBillTestReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("UnitMasterTest")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\UnitMasterTestReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("cGVTech_WoComplianceTest")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\cGVTech_WoComplianceTestReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("ServiceManagerJournalize")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\ServiceManagerJournalizeReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("CreateRedTagDMSTest")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\CreateRedTagDMSTestReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("ReceiveParts")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\ReceivePartsReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("ApproveNonRepairBill_DMSTest")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\ApproveNonRepairBill_DMSTestReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("cGVTechPerformPM")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\cGVTechPerformPMReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("PerformTheWorkOnAnEstimateTechTest")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\PerformTheWorkOnAnEstimateTechTestReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("JournalizeCounterSale")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\JournalizeCounterSaleReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("ServiceManagerPartsRelatedTasks")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\ServiceManagerPartsRelatedTasksReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("SubmitAnEstimateServiceManager")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\SubmitAnEstimateServiceManagerReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("Spotorderparts")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\SpotorderpartsReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("CreatePart")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\CreatePartReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("IssuePartToTech")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\IssuePartToTechReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("PauseLabor")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\PauseLaborReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("SplitRoLocation")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\SplitRoLocation\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("AddaFabricatedPartToaClosedWorkorder")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\AddaFabricatedPartToaClosedWorkorder\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("CustomerProofNotesIssue")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\CustomerProofNotesIssue\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("Reports")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\ReportsReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("UomforpressureonInspectionInformationAllowed")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\UomforpressureonInspectionInformationAllowedReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("TransitonedPaccar")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\TransitonedPaccarReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("NonIcCompletedAndWorkFine")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\NonIcCompletedAndWorkFineReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("OverRideTaxesCauseOtherTaxDisappear")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\OverRideTaxesCauseOtherTaxDisappearReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("OverrideContractPriceImportScreen")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\OverrideContractPriceImportScreenReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("BalanceSheetAndIncomeStatementNotPopulatingData")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\BalanceSheetAndIncomeStatementNotPopulatingDataReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("SafetyCertificatesReportCharacterLimit")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\SafetyCertificatesReportCharacterLimitReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("AddActiveInactiveBothStatusOptionInCustomerUnitExportReport")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\AddActiveInactiveBothStatusOptionInCustomerUnitExportReportReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("DefectManagerInspectedbyColumnBlank")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\DefectManagerInspectedbyColumnBlankReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("RentedToFieldAddedtoCompleteROandUnitMaster")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\RentedToFieldAddedtoCompleteROandUnitMasterReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("FedExNonRepairBillnotAutoSearchingLocationsorVendors")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\FedExNonRepairBillnotAutoSearchingLocationsorVendorsReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("AddInactiveCheckBoxOnTechTimeSheet")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\AddInactiveCheckBoxOnTechTimeSheetReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("FieldDoesNotUpdateonNonRepairBillsAfterSwitchingLocation")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\FieldDoesNotUpdateonNonRepairBillsAfterSwitchingLocationReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("SerializedPartsOnPhysicalCounts")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\SerializedPartsOnPhysicalCountsReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("MandatoryEmailFieldOnUnitReturn")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\MandatoryEmailFieldOnUnitReturnReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("SalesTaxLiabiltiyAccrualBasisDisrepancy")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\SalesTaxLiabiltiyAccrualBasisDisrepancyReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("IssuePartsToROExceptionError")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\IssuePartsToROExceptionErrorReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("HideShopSuppliesOnWOInvoiceParameterNotWorking")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\HideShopSuppliesOnWOInvoiceParameterNotWorkingReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("AddInvoiceToByCustomerBENLEA")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\AddInvoiceToByCustomerBENLEAReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("IssuePartstoROExceptionErrorFrom")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\IssuePartstoROExceptionErrorFromReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("AccountingPeriodErrorAMERIT")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\AccountingPeriodErrorAMERITReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("AddSearchFieldToTheTelematicsManagerImportReadingsTab")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\AddSearchFieldToTheTelematicsManagerImportReadingsTabReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("InvoiceCopyHeadersNotWorking")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\InvoiceCopyHeadersNotWorkingReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("MakeAndModelsBeComingInActiveLOTSVENTURES")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\MakeAndModelsBeComingInActiveLOTSVENTURESReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("InvoicetoCustomerIssuesBENLEA")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\InvoicetoCustomerIssuesBENLEAReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("SalesTaxLiabilityCashBasisCalculationIssueBROTHERTON")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\SalesTaxLiabilityCashBasisCalculationIssueBROTHERTONReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("PartChargeNotOpeningConsistently")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\PartChargeNotOpeningConsistentlyReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("Apmanageroutstandinginvoicetotal")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\ApmanageroutstandinginvoicetotalReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("ContactEmailFieldDataRequest")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\ContactEmailFieldDataRequestReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("CustomerProofPartOrder")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\CustomerProofPartOrderReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("EstimateFormatMissingLaborNotesDescription")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\EstimateFormatMissingLaborNotesDescriptionReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("NonStockPartswithOnhandsReportCorrections")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\NonStockPartswithOnhandsReportCorrectionsReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("OrganizeFavoritesArrowsNotWorking")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\OrganizeFavoritesArrowsNotWorkingReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("SugestedOrderReporttrucatePartNumber")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\SugestedOrderReporttrucatePartNumberReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("TechnicianTimeEntriestobelogged")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\TechnicianTimeEntriestobeloggedReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("TwelveMonthActualCountonRESTOCKREORDERREPORTinExcelformat")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\TwelveMonthActualCountonRESTOCKREORDERREPORTinExcelformatReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("UnableToRemoveCoreLink_CONVOY")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\UnableToRemoveCoreLink_CONVOYReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("EstimateFormatTaxIssue")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\EstimateFormatTaxIssueReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("RepairOrderReportUnitOwnerSpacing")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\RepairOrderReportUnitOwnerSpacingReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("PartialReceiveButtonMissWhenPartsReceivedMatchQuantityOfPartsOrdered")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\PartialReceiveButtonMissWhenPartsReceivedMatchQuantityOfPartsOrderedReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("LabelExceptionError")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\LabelExceptionErrorReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("TheServiceBoardRefreshesAndLosesTheUsersPosition")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\TheServiceBoardRefreshesAndLosesTheUsersPositionReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("SlownessForSQLStatementOn")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\SlownessForSQLStatementOnReports\\" + theDir.getName();
            }



        System.out.println("Before Report Process");
                System.out.println("This is CMD : " + cmd);
                Process process = Runtime.getRuntime().exec(cmd);
                Thread.sleep(5000);
                System.out.println("Generating Report");
                process.waitFor(60, TimeUnit.SECONDS);
                System.out.println("After Report Process");
                Thread.sleep(5000);
//                System.out.println("End Time: " + WaitActions.getWaits().getDateTime());
                System.out.println("End Time: " + action.getDateTime());
                emptyResults();

            }

    /** new method Akash */
    public  String  getMyClassName() {

        return this.getClass().getSimpleName();  //To get  Current className
    }


           @AfterMethod(alwaysRun = true)
           public void afterMethodTakeScreenShot(ITestResult result) {
           TestListener.saveScreenshotPNG(driver);

           }


 /*   public static class Log {
        //Initialize Log4j instance
        private static Logger Log = Logger.getLogger(TestDriverActions.Log.class.getName());

        //Info Level Logs
        public static void info(String message) {
            Log.info(message);
        }

        //Error Level Logs
        public static void error(String message) {
            Log.error(message);
        }
    }     */



        /*   @AfterTest(alwaysRun = true)
            public void tearDown () {
                   driver.quit();
            }  */
        }
