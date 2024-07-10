package actions;

import constants.SheetConstants;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import tests.TestDriverActions;

import java.awt.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URI;
import java.util.Properties;

public class LoginActions extends TestDriverActions {

    public static String environmentName = System.getProperty("env", "QA");

    public String getAppUrl() throws IOException {

        String appUrl = null;

        appUrl = DataActions.getReuseActions().getCellData(SheetConstants.loginSheetPath, SheetConstants.sheetNameForFrameworkConfig, SheetConstants.columnForTestEnv, SheetConstants.envRowNumber);

    /*    if (System.getProperty("env").equalsIgnoreCase("TEST")) {

            appUrl = DataActions.getReuseActions().getCellData(SheetConstants.loginSheetPath, SheetConstants.sheetNameForCredentials, SheetConstants.columnForTestEnv, SheetConstants.envRowNumber);
        } else if (System.getProperty("env").equalsIgnoreCase("QA")) {
            //appUrl = DataActions.getReuseActions().getCellData(SheetConstants.loginSheetPath, SheetConstants.sheetNameForCredentials, SheetConstants.columnForEmail, SheetConstants.role_admin_credentials_rowNumber);


        } else if (System.getProperty("env").equalsIgnoreCase("FXG")) {
            //appUrl = DataActions.getReuseActions().getCellData(SheetConstants.loginSheetPath, SheetConstants.sheetNameForCredentials, SheetConstants.columnForEmail, SheetConstants.role_admin_credentials_rowNumber);

        }*/


        return appUrl;
}

    /**
     * new metnod Akash
     */
    public String getAppUrl1(@org.jetbrains.annotations.NotNull String className) throws IOException {     //Method to get Url from commomd line
        String appUrl = null;


        String configFileName = System.getProperty("user.dir")+"/src/test/java/utils"+"/"+className.toLowerCase()+"/"+className.toLowerCase()+"%s.properties";
        configFileName= String.format(configFileName,LoginActions.environmentName);
        System.out.println(" configFileName :: " + configFileName);

        if(configFileName.contains("createcustomerEC.properties")){
            appProp = new Properties();
            appProp.load(new FileInputStream(new File(configFileName)));

            appUrl = appProp.getProperty("url");
            return appUrl;
        } else if (configFileName.contains("createunitEC.properties")) {
            appProp2 = new Properties();
            appProp2.load(new FileInputStream(new File(configFileName)));

            appUrl = appProp2.getProperty("url");
            return appUrl;
        } else if(configFileName.contains("createvendorEC.properties")){
            appProp3 = new Properties();
            appProp3.load(new FileInputStream(new File(configFileName)));

            appUrl = appProp3.getProperty("url");
            return appUrl;

        } else if(configFileName.contains("createpartEC.properties")){
            appProp4 = new Properties();
            appProp4.load(new FileInputStream(new File(configFileName)));

            appUrl = appProp4.getProperty("url");
            return appUrl;
        }
        else if(configFileName.contains("servicemanagerchangecustomerpoafterinvoicingEC.properties")) {
            appProp5 = new Properties();
            appProp5.load(new FileInputStream(new File(configFileName)));

            appUrl = appProp5.getProperty("url");
            return appUrl;
        } else if(configFileName.contains("journalizecountersaleEC.properties")){
            appProp6 = new Properties();
            appProp6.load(new FileInputStream(new File(configFileName)));

            appUrl = appProp6.getProperty("url");
            return appUrl;
        } else if(configFileName.contains("spotorderpartsEC.properties")){
            appProp7 = new Properties();
            appProp7.load(new FileInputStream(new File(configFileName)));

            appUrl = appProp7.getProperty("url");
            return appUrl;
        } else if(configFileName.contains("submitanestimateservicemanagerEC.properties")){
            appProp8 = new Properties();
            appProp8.load(new FileInputStream(new File(configFileName)));

            appUrl = appProp8.getProperty("url");
            return appUrl;
        } else if(configFileName.contains("receivepartsEC.properties")){
            appProp9 = new Properties();
            appProp9.load(new FileInputStream(new File(configFileName)));

            appUrl = appProp9.getProperty("url");
            return appUrl;
        } else if(configFileName.contains("countersaleEC.properties")){
            appProp10 = new Properties();
            appProp10.load(new FileInputStream(new File(configFileName)));

            appUrl = appProp10.getProperty("url");
            return appUrl;
        } else if(configFileName.contains("servicemanagerwolaborEC.properties")){
            appProp11 = new Properties();
            appProp11.load(new FileInputStream(new File(configFileName)));

            appUrl = appProp11.getProperty("url");
            return appUrl;
        }
        else if(configFileName.contains("servicemanagerjournalizeEC.properties")){
            appProp12 = new Properties();
            appProp12.load(new FileInputStream(new File(configFileName)));

            appUrl = appProp12.getProperty("url");
            return appUrl;
        }
        else if(configFileName.contains("servicemanagerpartsrelatedtasksEC.properties")){
            appProp13 = new Properties();
            appProp13.load(new FileInputStream(new File(configFileName)));

            appUrl = appProp13.getProperty("url");
            return appUrl;
        }
        else if(configFileName.contains("issueparttotechEC.properties")){
            appProp14 = new Properties();
            appProp14.load(new FileInputStream(new File(configFileName)));

            appUrl = appProp14.getProperty("url");
            return appUrl;
        }
        else if(configFileName.contains("techwolaborEC.properties")){
            appProp15 = new Properties();
            appProp15.load(new FileInputStream(new File(configFileName)));

            appUrl = appProp15.getProperty("url");
            return appUrl;
        }
        else if(configFileName.contains("servicemanagerinvoiceEC.properties")){
            appProp16 = new Properties();
            appProp16.load(new FileInputStream(new File(configFileName)));

            appUrl = appProp16.getProperty("url");
            return appUrl;
        }
        else if(configFileName.contains("AddafabricatedparttoaclosedworkorderEC.properties")){
            appProp17 = new Properties();
            appProp17.load(new FileInputStream(new File(configFileName)));

            appUrl = appProp17.getProperty("url");
            return appUrl;
        }
        else if(configFileName.contains("createpartEU.properties")){
            appProp18 = new Properties();
            appProp18.load(new FileInputStream(new File(configFileName)));

            appUrl = appProp18.getProperty("url");
            return appUrl;
        }
        else if(configFileName.contains("createunitEU.properties")){
            appProp19 = new Properties();
            appProp19.load(new FileInputStream(new File(configFileName)));

            appUrl = appProp19.getProperty("url");
            return appUrl;
        }
        else if(configFileName.contains("spotorderpartsEU.properties")){
            appProp20 = new Properties();
            appProp20.load(new FileInputStream(new File(configFileName)));

            appUrl = appProp20.getProperty("url");
            return appUrl;
        }
        else if(configFileName.contains("submitanestimateservicemanagerEU.properties")){
            appProp21 = new Properties();
            appProp21.load(new FileInputStream(new File(configFileName)));

            appUrl = appProp21.getProperty("url");
            return appUrl;
        }
        else if(configFileName.contains("servicemanagerchangecustomerpoafterinvoicingEU.properties")){
            appProp22 = new Properties();
            appProp22.load(new FileInputStream(new File(configFileName)));

            appUrl= appProp22.getProperty("url");
            return appUrl;
        }
        else if(configFileName.contains("servicemanagerinvoiceEU.properties")){
            appProp23 = new Properties();
            appProp23.load(new FileInputStream(new File(configFileName)));

            appUrl = appProp23.getProperty("url");
            return appUrl;
        }
        else if(configFileName.contains("servicemanagerjournalizeEU.properties")){
            appProp24 = new Properties();
            appProp24.load(new FileInputStream(new File(configFileName)));

            appUrl = appProp24.getProperty("url");
            return appUrl;
        }
        else if(configFileName.contains("servicemanagerpartsrelatedtasksEU.properties")){
            appProp25 = new Properties();
            appProp25.load(new FileInputStream(new File(configFileName)));

            appUrl = appProp25.getProperty("url");
            return appUrl;
        }
        else if(configFileName.contains("servicemanagerwolaborEU.properties")){
            appProp26 = new Properties();
            appProp26.load(new FileInputStream(new File(configFileName)));

            appUrl = appProp26.getProperty("url");
            return appUrl;
        }
        else if(configFileName.contains("receivepartsEU.properties")){
            appProp27 = new Properties();
            appProp27.load(new FileInputStream(new File(configFileName)));

           appUrl = appProp27.getProperty("url");
           return appUrl;
        }
        else if(configFileName.contains("techwolaborEU.properties")){
            appProp28 = new Properties();
            appProp28.load(new FileInputStream(new File(configFileName)));

            appUrl = appProp28.getProperty("url");
            return appUrl;
        }
        else if(configFileName.contains("techwopartsEU.properties")){
            appProp29 = new Properties();
            appProp29.load(new FileInputStream(new File(configFileName)));

            appUrl = appProp29.getProperty("url");
            return appUrl;
        }
        else if(configFileName.contains("AddafabricatedparttoaclosedworkorderEU.properties")){
            appProp30 = new Properties();
            appProp30.load(new FileInputStream(new File(configFileName)));

            appUrl = appProp3.getProperty("url");
            return appUrl;
        }
        else if(configFileName.contains("createcustomerNA.properties")){
            appProp31 = new Properties();
            appProp31.load(new FileInputStream(new File(configFileName)));

            appUrl = appProp31.getProperty("url");
            return appUrl;
        }
        else if(configFileName.contains("createunitNA.properties")){
            appProp32 = new Properties();
            appProp32.load(new FileInputStream(new File(configFileName)));

            appUrl = appProp32.getProperty("url");
            return appUrl;
        }
        else if(configFileName.contains("createpartNA.properties")){
            appProp33 = new Properties();
            appProp33.load(new FileInputStream(new File(configFileName)));

            appUrl = appProp33.getProperty("url");
            return appUrl;
        }
        else if(configFileName.contains("createvendorNA.properties")){
            appProp34 = new Properties();
            appProp34.load(new FileInputStream(new File(configFileName)));

           appUrl = appProp34.getProperty("url");
           return appUrl;
        }
        else if(configFileName.contains("spotorderpartsNA.properties")){
            appProp35 = new Properties();
            appProp35.load(new FileInputStream(new File(configFileName)));

            appUrl = appProp35.getProperty("url");
            return appUrl;
        }
        else if(configFileName.contains("submitanestimateservicemanagerNA.properties")){
            appProp36 = new Properties();
            appProp36.load(new FileInputStream(new File(configFileName)));

            appUrl = appProp36.getProperty("url");
            return appUrl;
        }
        else if(configFileName.contains("countersaleNA.properties")){
            appProp37 = new Properties();
            appProp37.load(new FileInputStream(new File(configFileName)));

            appUrl = appProp37.getProperty("url");
            return appUrl;
        }
        else if(configFileName.contains("pauselaborNA.properties")){
            appProp38 = new Properties();
            appProp38.load(new FileInputStream(new File(configFileName)));

            appUrl = appProp38.getProperty("url");
            return appUrl;
        }
        else if(configFileName.contains("receivepartsNA.properties")){
            appProp39 = new Properties();
            appProp39.load(new FileInputStream(new File(configFileName)));

            appUrl = appProp39.getProperty("url");
            return appUrl;
        }
        else if(configFileName.contains("journalizepartsinvoiceNA.properties")){
            appProp40 = new Properties();
            appProp40.load(new FileInputStream(new File(configFileName)));

           appUrl = appProp40.getProperty("url");
           return appUrl;
        }
        else if(configFileName.contains("servicemanagerpartsrelatedtasksNA.properties")){
            appProp41 = new Properties();
            appProp41.load(new FileInputStream(new File(configFileName)));

            appUrl = appProp41.getProperty("url");
            return appUrl;
        }
        else if(configFileName.contains("servicemanagerinvoiceNA.properties")){
            appProp42 = new Properties();
            appProp42.load(new FileInputStream(new File(configFileName)));

            appUrl = appProp42.getProperty("url");
            return appUrl;
        }
        else if(configFileName.contains("servicemanagerwolaborNA.properties")){
            appProp43 = new Properties();
            appProp43.load(new FileInputStream(new File(configFileName)));

            appUrl = appProp43.getProperty("url");
            return appUrl;

        }
        else if(configFileName.contains("techwolaborNA.properties")){
            appProp44 = new Properties();
            appProp44.load(new FileInputStream(new File(configFileName)));

            appUrl = appProp44.getProperty("url");
            return appUrl;
        }
        else if(configFileName.contains("techwopartsNA.properties")){
            appProp45 = new Properties();
            appProp45.load(new FileInputStream(new File(configFileName)));

            appUrl = appProp45.getProperty("url");
            return appUrl;
        }
        else if(configFileName.contains("defectmanagerinspectedbycolumnblankQA.properties")){
            appProp46 = new Properties();
            appProp46.load(new FileInputStream(new File(configFileName)));

            appUrl = appProp46.getProperty("url");
            return appUrl;
        }
        else if(configFileName.contains("rentedtofieldaddedtocompleteroandunitmasterQA.properties")){
            appProp47 = new Properties();
            appProp47.load(new FileInputStream(new File(configFileName)));

            appUrl = appProp47.getProperty("url");
            return appUrl;
        }
        else if(configFileName.contains("balancesheetandincomestatementnotpopulatingdataQA.properties")){
            appProp48 = new Properties();
            appProp48.load(new FileInputStream(new File(configFileName)));

            appUrl = appProp48.getProperty("url");
            return appUrl;
        }
        else if(configFileName.contains("customerproofnotesissueQA.properties")){
            appProp49 = new Properties();
            appProp49.load(new FileInputStream(new File(configFileName)));

            appUrl = appProp49.getProperty("url");
            return appUrl;
        }
        else if(configFileName.contains("overridecontractpriceimportscreenQA.properties")) {
          appProp50 = new Properties();
          appProp50.load(new FileInputStream(new File(configFileName)));

          appUrl = appProp50.getProperty("url");
          return appUrl;
        }
        else if(configFileName.contains("overridetaxescauseothertaxdisappearEU.properties")){
            appProp51 = new Properties();
            appProp51.load(new FileInputStream(new File(configFileName)));

            appUrl = appProp51.getProperty("url");
            return appUrl;
        }
        else if(configFileName.contains("safetycertificatesreportcharacterlimitQA.properties")){
            appProp52 = new Properties();
            appProp52.load(new FileInputStream(new File(configFileName)));

            appUrl = appProp52.getProperty("url");
            return appUrl;
        }
        else if(configFileName.contains("splitrolocationQA.properties")){
            appProp53 = new Properties();
            appProp53.load(new FileInputStream(new File(configFileName)));

            appUrl = appProp53.getProperty("url");
            return appUrl;
        }
        else if(configFileName.contains("fedexnonrepairbillnotautosearchinglocationsorvendorsfedex.properties")){
            appProp54 = new Properties();
            appProp54.load(new FileInputStream(new File(configFileName)));

            appUrl = appProp54.getProperty("url");
            return appUrl;
        }
        else if(configFileName.contains("addinactivecheckboxontechtimesheetQA.properties")){
            appProp55 = new Properties();
            appProp55.load(new FileInputStream(new File(configFileName)));

            appUrl = appProp55.getProperty("url");
            return appUrl;
        }
        else if(configFileName.contains("fielddoesnotupdateonnonrepairbillsafterswitchinglocationQA.properties")){
             appProp56 = new Properties();
             appProp56.load(new FileInputStream(new File(configFileName)));

             appUrl = appProp56.getProperty("url");
             return appUrl;
        }
        else if(configFileName.contains("serializedpartsonphysicalcountsQA.properties")){
            appProp57 = new Properties();
            appProp57.load(new FileInputStream(new File(configFileName)));

            appUrl = appProp57.getProperty("url");
            return appUrl;
        }
        else if(configFileName.contains("mandatoryemailfieldonunitreturnQA.properties")){
            appProp58 = new Properties();
            appProp58.load(new FileInputStream(new File(configFileName)));

            appUrl = appProp58.getProperty("url");
            return appUrl;
        }
        else if(configFileName.contains("salestaxliabiltiyaccrualbasisdisrepancyQA.properties")){
            appProp59 = new Properties();
            appProp59.load(new FileInputStream(new File(configFileName)));

            appUrl = appProp59.getProperty("url");
            return appUrl;
        }
        else if(configFileName.contains("issuepartstoroexceptionerrorQA.properties")){
            appProp60 = new Properties();
            appProp60.load(new FileInputStream(new File(configFileName)));

            appUrl = appProp60.getProperty("url");
            return appUrl;
        }
        else if(configFileName.contains("hideshopsuppliesonwoinvoiceparameternotworkingQA.properties")){
            appProp61 = new Properties();
            appProp61.load(new FileInputStream(new File(configFileName)));

            appUrl = appProp61.getProperty("url");
            return appUrl;
        }
        else if(configFileName.contains("addinvoicetobycustomerbenleaQA.properties")){
            appProp62 = new Properties();
            appProp62.load(new FileInputStream(new File(configFileName)));

            appUrl = appProp62.getProperty("url");
            return appUrl;
        }
        else if(configFileName.contains("issuepartstoroexceptionerrorfromQA.properties")){
            appProp63 = new Properties();
            appProp63.load(new FileInputStream(new File(configFileName)));

            appUrl = appProp63.getProperty("url");
            return appUrl;
        }
        else if(configFileName.contains("accountingperioderrorameritQA.properties")){
            appProp64 = new Properties();
            appProp64.load(new FileInputStream(new File(configFileName)));

            appUrl = appProp64.getProperty("url");
            return appUrl;
        }
        else if(configFileName.contains("addsearchfieldtothetelematicsmanagerimportreadingstabQA.properties")){
            appProp65 = new Properties();
            appProp65.load(new FileInputStream(new File(configFileName)));

            appUrl = appProp65.getProperty("url");
            return appUrl;
        }
        else if(configFileName.contains("invoicecopyheadersnotworkingQA.properties")){
            appProp66 = new Properties();
            appProp66.load(new FileInputStream(new File(configFileName)));

            appUrl = appProp66.getProperty("url");
            return appUrl;
        }
        else if(configFileName.contains("makeandmodelsbecominginactivelotsventuresQA.properties")){
            appProp67 = new Properties();
            appProp67.load(new FileInputStream(new File(configFileName)));

            appUrl = appProp67.getProperty("url");
            return appUrl;
        }
        else if(configFileName.contains("invoicetocustomerissuesbenleaQA.properties")){
            appProp68 = new Properties();
            appProp68.load(new FileInputStream(new File(configFileName)));

            appUrl = appProp68.getProperty("url");
            return appUrl;
        }
        else if(configFileName.contains("salestaxliabilitycashbasiscalculationissuebrothertonQA.properties")){
            appProp69 = new Properties();
            appProp69.load(new FileInputStream(new File(configFileName)));

            appUrl = appProp69.getProperty("url");
            return appUrl;
        }
        else if(configFileName.contains("partchargenotopeningconsistentlyQA.properties")){
            appProp70 = new Properties();
            appProp70.load(new FileInputStream(new File(configFileName)));

            appUrl = appProp70.getProperty("url");
            return appUrl;
        }
        else if(configFileName.contains("apmanageroutstandinginvoicetotalQA.properties")){
            appProp71 = new Properties();
            appProp71.load(new FileInputStream(new File(configFileName)));

            appUrl = appProp71.getProperty("url");
            return appUrl;
        }
        else if(configFileName.contains("contactemailfielddatarequestQA.properties")){
            appProp72 = new Properties();
            appProp72.load(new FileInputStream(new File(configFileName)));

            appUrl = appProp72.getProperty("url");
            return appUrl;
        }
        else if(configFileName.contains("customerproofpartorderQA.properties")){
            appProp73 = new Properties();
            appProp73.load(new FileInputStream(new File(configFileName)));

            appUrl = appProp73.getProperty("url");
            return appUrl;
        }
        else if(configFileName.contains("estimateformatmissinglabornotesdescriptionQA.properties")){
            appProp74 = new Properties();
            appProp74.load(new FileInputStream(new File(configFileName)));

            appUrl = appProp74.getProperty("url");
            return appUrl;
        }
        else if(configFileName.contains("estimateformattaxissueQA.properties")){
            appProp75 = new Properties();
            appProp75.load(new FileInputStream(new File(configFileName)));

            appUrl = appProp75.getProperty("url");
            return appUrl;
        }
        else if(configFileName.contains("nonstockpartswithonhandsreportcorrectionsQA.properties")){
            appProp76 = new Properties();
            appProp76.load(new FileInputStream(new File(configFileName)));

            appUrl = appProp76.getProperty("url");
            return appUrl;
        }
        else if(configFileName.contains("organizefavoritesarrowsnotworkingQA.properties")){
            appProp77 = new Properties();
            appProp77.load(new FileInputStream(new File(configFileName)));

            appUrl = appProp77.getProperty("url");
            return appUrl;
        }
        else if(configFileName.contains("suggestedorderreporttrucatepartnumberQA.properties")){
            appProp78 = new Properties();
            appProp78.load(new FileInputStream(new File(configFileName)));

            appUrl = appProp78.getProperty("url");
            return appUrl;
        }
        else if(configFileName.contains("techniciantimeentriestobeloggedQA.properties")){
            appProp79 = new Properties();
            appProp79.load(new FileInputStream(new File(configFileName)));

            appUrl = appProp79.getProperty("url");
            return appUrl;
        }
        else if(configFileName.contains("twelvemonthactualcountonrestockeorderreportinexcelformatQA.properties")){
            appProp80 = new Properties();
            appProp80.load(new FileInputStream(new File(configFileName)));

            appUrl = appProp80.getProperty("url");
            return appUrl;
        }
        else if(configFileName.contains("unabletoremovecorelink_convoyQA.properties")){
            appProp81 = new Properties();
            appProp81.load(new FileInputStream(new File(configFileName)));

            appUrl = appProp81.getProperty("url");
            return appUrl;
        }
        else if(configFileName.contains("repairorderreportunitownerspacingQA.properties")){
            appProp82 = new Properties();
            appProp82.load(new FileInputStream(new File(configFileName)));

            appUrl = appProp82.getProperty("url");
            return appUrl;
        }
        else if(configFileName.contains("partialreceivebuttonmisswhenpartsreceivedmatchquantityofpartsorderedQA.properties")){
            appProp83 = new Properties();
            appProp83.load(new FileInputStream(new File(configFileName)));

            appUrl = appProp83.getProperty("url");
            return appUrl;
        }
        else if(configFileName.contains("labelexceptionerrorQA.properties")){
            appProp84 = new Properties();
            appProp84.load(new FileInputStream(new File(configFileName)));

            appUrl = appProp84.getProperty("url");
            return appUrl;
        }
        else if(configFileName.contains("theserviceboardrefreshesandlosestheuserspositionQA.properties")){
            appProp85 = new Properties();
            appProp85.load(new FileInputStream(new File(configFileName)));

            appUrl = appProp85.getProperty("url");
            return appUrl;
        }
        else if(configFileName.contains("addactiveinactivebothstatusoptionincustomerunitexportreportEC.properties")){
            appProp86 = new Properties();
            appProp86.load(new FileInputStream(new File(configFileName)));

            appUrl = appProp86.getProperty("url");
            return appUrl;
        }
        else if(configFileName.contains("slownessforsqlstatementonQA.properties")){
            appProp87 = new Properties();
            appProp87.load(new FileInputStream(new File(configFileName)));

            appUrl = appProp87.getProperty("url");
            return appUrl;
        }




        //        appUrl=appProp.getProperty("url");
        return  null;
    }

    public String[] getUserCredentials() throws IOException {

        String userRole = System.getProperty("role");
        String[] credentials = new String[2];

        credentials[0] = DataActions.getReuseActions().getCellData(SheetConstants.loginSheetPath, SheetConstants.sheetNameForCredentials, SheetConstants.columnForTestEmail, SheetConstants.role_manager_credentials_rowNumber);
        credentials[1] = DataActions.getReuseActions().getCellData(SheetConstants.loginSheetPath, SheetConstants.sheetNameForCredentials, SheetConstants.columnForTestPassword, SheetConstants.role_manager_credentials_rowNumber);

/*
        if (System.getProperty("env").equalsIgnoreCase("TEST") && userRole.equalsIgnoreCase("ADMIN")) {
            credentials[0] = DataActions.getReuseActions().getCellData(SheetConstants.loginSheetPath, SheetConstants.sheetNameForCredentials, SheetConstants.columnForTestEmail, SheetConstants.role_admin_credentials_rowNumber);
            credentials[1] = DataActions.getReuseActions().getCellData(SheetConstants.loginSheetPath, SheetConstants.sheetNameForCredentials, SheetConstants.columnForTestPassword, SheetConstants.role_admin_credentials_rowNumber);

        } else if (System.getProperty("env").equalsIgnoreCase("TEST") && userRole.equalsIgnoreCase("MANAGER")) {
            credentials[0] = DataActions.getReuseActions().getCellData(SheetConstants.loginSheetPath, SheetConstants.sheetNameForCredentials, SheetConstants.columnForTestEmail, SheetConstants.role_manager_credentials_rowNumber);
            credentials[1] = DataActions.getReuseActions().getCellData(SheetConstants.loginSheetPath, SheetConstants.sheetNameForCredentials, SheetConstants.columnForTestEmail, SheetConstants.role_manager_credentials_rowNumber);

        } else if (System.getProperty("env").equalsIgnoreCase("TEST") && userRole.equalsIgnoreCase("PFUSER")) {
            credentials[0] = DataActions.getReuseActions().getCellData(SheetConstants.loginSheetPath, SheetConstants.sheetNameForCredentials, SheetConstants.columnForTestEmail, SheetConstants.role_admin_credentials_rowNumber);
            credentials[1] = DataActions.getReuseActions().getCellData(SheetConstants.loginSheetPath, SheetConstants.sheetNameForCredentials, SheetConstants.columnForTestEmail, SheetConstants.role_admin_credentials_rowNumber);


        }*/

        return credentials;

    }


}
