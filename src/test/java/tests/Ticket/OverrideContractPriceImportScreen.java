package tests.Ticket;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import tests.TestDriverActions;

import java.awt.*;
import java.io.FileNotFoundException;
import java.io.IOException;

@Listeners({utils.TestListener.class})
@Epic("Testing")
@Feature("OverrideContractPriceImportScreen")

public class OverrideContractPriceImportScreen extends TestDriverActions {

    @Test(priority=0,description="T_001_Login the page and go to Part Master Screen",enabled=true)
    @Description("Test Description = Login the page and go to Part Master Screen")
    public void T_001_gotoPartMasterScreen() throws FileNotFoundException, InterruptedException {
        loginPage.loginWithValidCredentials(appProp50.getProperty("username"),appProp50.getProperty("password"));
        overRideContractPrice.gotoPartMaster();
    }

    @Test(priority=1,description="T_002_Click on Import Parts Contract Price Overrides",enabled=true)
    @Description("Test Description = Click on Import Parts Contract Price Overrides")
    public void T_002_ClickonImportPartsContractPriceOverrides() throws InterruptedException {
        overRideContractPrice.clickOnImportPartsContractPriceOverride();
    }

    @Test(priority=2,description="T_003_Verify Import Parts title with some tab like download,import and refresh",enabled=true)
    @Description("Test Description = Verify Import Parts title with some tab like download,import and refresh")
    public void T_003_verifyImportTitle_TabDownloadRefresh() throws InterruptedException {
       overRideContractPrice.verifyImportPartsTitle();
       overRideContractPrice.verifytab_downloadTemplate();
       overRideContractPrice.verify_label_dateFormat();
       overRideContractPrice.verify_select_dateFormat();
       overRideContractPrice.verify_label_Filetobeuploaded();
       overRideContractPrice.verify_textbox_fileuploaded();
       overRideContractPrice. verify_tab_import();
       overRideContractPrice.verify_tab_refresh();

    }

    @Test(priority=3,description="T_004_Verify columns with name",enabled=true)
    @Description("Test Description =Verify columns with name")
    public void T_004_verifyColumnsWithName() throws InterruptedException {
       overRideContractPrice.verify_colName_ImportDate();
       overRideContractPrice.verify_colName_FileName();
       overRideContractPrice.verify_colName_status();
       overRideContractPrice.verify_colName_RecordImported();
       overRideContractPrice.verify_colName_DataErrors();
       overRideContractPrice.verify_colName_FileErrors();
    }


    @Test(priority=4,description="T_005_Click on Choose file to upload file",enabled=true)
    @Description("Test Description = Click on Choose file to upload file")
    public void T_005_clickonChooseFile() throws InterruptedException, AWTException {
         overRideContractPrice.clickOnChooseFile();
    }

    @Test(priority=5,description="T_006_Select the date formate by clicking on dropdown",enabled=true)
    @Description("Test Description =Select the date formate by clicking on dropdown")
    public void T_006_clickOnDateFormat() throws InterruptedException {
        overRideContractPrice.clickOnDateFormat();
    }

    @Test(priority=6,description="T_007_Import the uploaded file by clicking on import button",enabled=true)
    @Description("Test Description = Import the uploaded file by clicking on import button ")
    public void T_007_clickOnImportTab() throws InterruptedException {
       overRideContractPrice.clickOnImportTab();
    }

    @Test(priority=7,description="T_008_verify the message while importing",enabled=true)
    @Description("Test Description = verify the message while importing")
    public void T_008_verifyMessagewhileImporting() throws InterruptedException {
        overRideContractPrice.verifyMessageTitle();
        overRideContractPrice.verifyMessage();
        overRideContractPrice.verifyOk();
    }

    @Test(priority=8,description="T_009_Click on Ok button",enabled=true)
    @Description("Test Description =Click on Ok button")
    public void T_009_clickOnOK() throws InterruptedException {
        overRideContractPrice.clickOnOK();
    }

    @Test(priority=9,description="T_010_To download the file click on Download Template",enabled=true)
    @Description("Test Description = To download the file click on Download Template")
    public void T_010_clickOnDownloadTemplate() throws InterruptedException {
         overRideContractPrice.clickOnDownloadTemplate();
    }
    @Test(priority=10,description="T_011_Verify template data",enabled=true)
    @Description("Test Description = Verify template data")
    public void T_011_verifyTemplateData() throws IOException, InterruptedException {
         overRideContractPrice.verifyTemplateData();
    }

    @Test(priority=11,description="T_012_verify that file successfully import",enabled=true)
    @Description("Test Description = verify that file successfully import")
    public void T_012_verifyFileSuccessfullyImport() throws InterruptedException {
         overRideContractPrice.verifyFileImportedSuccessfully();

    }
    @Test(priority=12,description="T_013_Upload template with invalid data and verify error",enabled=true)
    @Description("Test Description = Upload template with invalid data and verify error")
    public void T_013_UploadtemplatewithInvalidData_VerifyError() throws IOException, InterruptedException, AWTException {

        overRideContractPrice.clickOnChooseFile_Invalid();
        overRideContractPrice.clickOnDateFormat();
        overRideContractPrice.clickOnImportTab();
        overRideContractPrice.verifyMessageTitle();
        overRideContractPrice.verifyMessage();
        overRideContractPrice.verifyOk();
        overRideContractPrice.clickOnOK();
        overRideContractPrice.clickOnDownloadTemplate();
        overRideContractPrice.verifyTemplateData();
        overRideContractPrice.verifyInvalidFileImportedSuccessfully();

    }
   @Test(priority=13,description="T_014_Go to Part list",enabled=true)
    @Description("Test Description =Go to Part list")
    public void T_014_gotoPartList() throws InterruptedException {
        overRideContractPrice.gotoPartList();
    }
    @Test(priority=14,description="T_015_click on Part Number",enabled=true)
    @Description("Test Description = click on Part Number")
    public void T_015_clickPartNumber() throws InterruptedException {
        overRideContractPrice.clickPartNumber();
    }
    @Test(priority=15,description="T_016_Select Product Group",enabled=true)
    @Description("Test Description =Select Product Group")
    public void T_016_selectProductGroup() throws InterruptedException {
        overRideContractPrice.selectGroupProduct();
    }
    @Test(priority=16,description="T_017_click On More Info",enabled=true)
    @Description("Test Description =click On More Info")
    public void T_017_clickMoreInfo() throws InterruptedException {
      overRideContractPrice.clickMoreInfo();
    }
    @Test(priority=17,description="T_018_click on cost and pricing",enabled=true)
    @Description("Test Description =click on cost and pricing")
    public void T_018_clickOnCostPricing() throws InterruptedException {
        overRideContractPrice.clickOnCostPricing();
    }
    @Test(priority=18,description="T_019_click on overRide Contract Pricing",enabled=true)
    @Description("Test Description =click on overRide Contract Pricing")
    public void T_019_clickOverRideContractPricing() throws InterruptedException {
        overRideContractPrice.clickOverRideContractPricing();
    }
    @Test(priority=19,description="T_020_click on AddContract",enabled=true)
    @Description("Test Description = click on AddContract")
    public void T_020_clickonAddContract() throws InterruptedException {
         overRideContractPrice.clickOnAddContract();
    }
    @Test(priority=20,description="T_021_verify  overRide Contract Pricing",enabled=true)
    @Description("Test Description =verify  overRide Contract Pricing")
    public void T_021_verifyOverRideContractPricing() throws InterruptedException {
         overRideContractPrice.verifyOverRideContractPricing();
         overRideContractPrice.verifyContract();
         overRideContractPrice.verifySelectContract();
         overRideContractPrice.verifyCurrency();
         overRideContractPrice.verifyEffectiveDate();
         overRideContractPrice.verifytxtbox_effectiveDate();
         overRideContractPrice.verifyselect_currency();
         overRideContractPrice.verifybasis();
         overRideContractPrice.verifyradio_Percentage();
         overRideContractPrice.verifypercent();
         overRideContractPrice.verifyprice_radio();
         overRideContractPrice.verifyprice();
         overRideContractPrice.verifycore();
         overRideContractPrice.verifycheckbox_active();
         overRideContractPrice.verifyactive();

    }
    @Test(priority=21,description="T_022_select contract",enabled=true)
    @Description("Test Description = select contract")
    public void T_022_selectContract() throws InterruptedException {
         overRideContractPrice.selectContract();
    }
    @Test(priority=22,description="T_023_enter percent",enabled=true)
    @Description("Test Description = enter percent")
    public void T_023_enterPercent() throws InterruptedException {
           overRideContractPrice.enterPercent();
    }
    @Test(priority=23,description="T_024_enter core",enabled=true)
    @Description("Test Description = enter core")
    public void T_024_enterCore() throws InterruptedException {
        overRideContractPrice.enterCore();
    }
    @Test(priority=24,description="T_025_click on OK",enabled=true)
    @Description("Test Description =click on OK")
    public void T_025_clickOK() throws InterruptedException {
         overRideContractPrice.clickOK();
    }
    @Test(priority=25,description="T_026_verify columns in override Contract Pricing",enabled=true)
    @Description("Test Description =verify columns in override Contract Pricing")
    public void T_026_verifyColumnsinOverrideContractPricing() throws InterruptedException {
         overRideContractPrice.verifyContractColumn();
         overRideContractPrice.verifyEffective();
         overRideContractPrice.verifyBasis();
//         overRideContractPrice.verifyPercent();
         overRideContractPrice.verifyPrice();
 //        overRideContractPrice.verifyCore();
         overRideContractPrice.verifyCorePrice();
         overRideContractPrice.verifyActive();

    }
    @Test(priority=26,description="T_027_Verify new entry added by import",enabled=false)
    @Description("Test Description =Verify new entry added by import")
    public void T_027_verifyNewEntryAddedbyImport() throws InterruptedException {
        overRideContractPrice.verifyNewEntry();
        overRideContractPrice.verifyImportDate();
        overRideContractPrice.verifyrecords_Imported();
        overRideContractPrice.verifydata_error();
    }
    @Test(priority=27,description="T_028_click on OK",enabled=true)
    @Description("Test Description =click on OK")
    public void T_028_clickOK() throws InterruptedException {
         overRideContractPrice.clickok();
    }

    @Test(priority=28,description="T_029_click on save and exit",enabled=true)
    @Description("Test Description =click on save and exit")
    public void T_029_clickonSaveandExit() throws InterruptedException {
        overRideContractPrice.clicksaveExit();
    }
   @Test(priority=30,description="T_030_Click on sign out and verify username",enabled=true)
    @Description("Test Description =Click on sign out and verify username")
    public void T_030_() throws InterruptedException {
        overRideContractPrice.clickOnSignOutAndVerifyName();
    }

}
