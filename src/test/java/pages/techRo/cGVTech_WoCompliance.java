package pages.techRo;

import actions.WaitActions;
import actions.WebElementActions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import tests.TestDriverActions;
import utils.TestListener;

import java.util.List;

public class cGVTech_WoCompliance extends TestDriverActions {
    @FindBy(xpath = "//span[text()='Scan Employee Badge']/following::input[1]")
    WebElement txt_scanEmployeeBadge;

    @FindBy(xpath = "//span[text()='Go']")
    public WebElement btn_GO;


    @FindBy(xpath = "//label[text()='Select assigned work.']")
    public List<WebElement> txt_SelectAssignedWork;

    @FindBy(xpath = "(//div[contains(@id,'ctbSelectAssignedWork')]//child::a/child::span[text()='Select'])[1]")
    public WebElement btn_SelectButton;

    @FindBy(xpath = "(//a[text()='Clean ABS Connections'])[1]")
    public WebElement text_Hyperlink;

    @FindBy(xpath = "//a[contains(@id,':0:clPopupWoact')]//span")
    public WebElement text_Hyperlink1;

    @FindBy(xpath = "//td[@style='user-select: none;']")
    public WebElement label_VMRS;

    @FindBy(xpath = "//td[text ()='Others']")
    public WebElement label_Other;

    @FindBy(xpath = " //img[contains(@id,'ctbAtt::icon')]/parent::a")
    public WebElement icon_AttachmentIcon;


    @FindBy(xpath = "//label[text()='Description:']/preceding-sibling::span")
    public WebElement txt_DescriptionRequired;


    @FindBy(xpath = "//label[contains(.,'Description:')]")
    public WebElement label_Description;


    @FindBy(xpath = "//label[text()='VMRS:']/preceding-sibling::span")
    public WebElement txt_RequiredVMRS;

    @FindBy(xpath = "//label[contains(., 'VMRS:')]")
    public WebElement label_TextVMRS;


    @FindBy(xpath = "//span[contains(@id,':1:itWoactDescription')]//parent::div ")
    public WebElement input_TextValue;


    @FindBy(xpath = "//label[contains (., 'Actual Hours')]")
    public WebElement label_ActualHours;


    @FindBy(xpath = "//label[contains (., 'Complaint:')]")
    public WebElement label_Complaint;


    @FindBy(xpath = "//label[text() ='Cause/Reason:']/preceding-sibling::span")
    public WebElement txt_RequiredCauseReason;


    @FindBy(xpath = "//label[contains(.,'Cause/Reason:')]")
    public WebElement label_CauseReason;



    @FindBy(xpath = "//label[text()='Correction/Task:']/preceding-sibling::span")
    public WebElement txt_RequiredCorrectionTask;

    @FindBy(xpath = "//label[contains(.,'Correction/Task:')]")
    public WebElement label_CorrectionTask;

    @FindBy(xpath = "//a[contains(@id,'clWT')]")
    public WebElement label_Clean;

    @FindBy(xpath = " //textarea[contains(@id,'itWoactNotes::content')]")
    public WebElement txt_ComplaintsTextArea;


    @FindBy(xpath = "//label[text()='Correction/Task:']/parent::span/parent::div/following-sibling::div[2]/child::span/child::span")
    public WebElement txt_RequiredCorrectionTaskAnswer;

    @FindBy(xpath = "//textarea[contains(@id,'itPopupWoactCorrection::content')]")
    public WebElement txt_CorrectionTextArea;


    @FindBy(xpath = "//textarea[contains(@id,':itPopupWoactCause::content')]")
    public WebElement txt_CauseReasonTextArea;


    @FindBy(xpath = "(//span[text()='Cancel'])[1]")
    public WebElement label_Cancel;


    @FindBy(xpath = "//div[contains(@id,':ctbOk')]//a//span[text()='OK']")
    public WebElement label_OK;

    @FindBy(xpath = "//h1[text()='Labor - Charlton Repair, Inc.']")
    public List <WebElement> CharltonRepairInc;


    @FindBy(xpath = "//div[@id='d1_msgDlg_cancel']/child::a/child::span[text()='OK']")
    public WebElement text_Required3csOKButton;



    @FindBy(xpath = "//div[contains(@id,'ctbLabourGuideIC')]//a")
    public WebElement txt_MoreWork;

    @FindBy(xpath = "//img[contains(@id,'cilSerproIC::icon')]")
    public WebElement txt_ABSLink;

    @FindBy(xpath = "//span[text()='Clean ABS Connections']")
    public WebElement  txt_cleanAbsConnection;

    @FindBy(xpath = "(//img[contains(@id,'ciAddSerproactIC::icon')])[4]")
    public WebElement icon_Plus;

    @FindBy(xpath = "//span[text()='Add']")
    public WebElement btn_Add;

    @FindBy(xpath = "//div[contains(@id,':tic:4:psl7::l')]/child::div//div/child::a//img")
    public WebElement txt_CleanABSConnectionAdd;


    @FindBy(xpath = "(//a[text()='Clean ABS Connections'])[1]")
    public List<WebElement> txt_NotCleanABSConnection;

    @FindBy(xpath = "(//a[contains(@id,':0:clPopupWoaS')])[1]")
    public WebElement txt_Hyperlinlk2;



    @FindBy(xpath = "(//a[text()='Summary'])[1]")
    public WebElement btn_SummaryTab;


    @FindBy(xpath = "//span[text()= 'Unit Ready']")
    public WebElement bth_UnitReadyButton;


    @FindBy(xpath = "//td[contains(@id,':ptTRO:pw1::tb')]")
    public WebElement txt_PleaseSelectTheFollowingJobSandEnterThe3Cs;


    @FindBy(xpath = "(//span[text()='OK'])[1]")
    public WebElement btn_UnitReadyOKButton;


    @FindBy(xpath = " //textarea[contains(@id,'itWoactNotes::content')]")
    public WebElement txt_ComplaintsTextAreaSummaryTab;

    @FindBy(xpath = "//textarea[contains(@id,'itPopupWoactCorrection::content')]")
    public WebElement txt_CorrectionTaskSummaryTab;

    @FindBy(xpath = "//textarea[contains(@id,':itPopupWoactCause::content')]")
    public WebElement txt_CauseReasonSummaryTab;

    @FindBy(xpath = "//textarea[contains(@id,'itWoactNotes::content')]")
    public WebElement txt_ComplaintsSummaryTab;

    @FindBy(xpath = "//div[contains(@id,':ctbOk')]//a//span[text()='OK']")
    public WebElement btn_OKSummaryTab;



    @FindBy(xpath = "//span[text()='Assigned Work']")
    public WebElement Btn_AssignWork;


    @FindBy(xpath = "//a[text()='Sign Out']")
    public WebElement Btn_SignOUt;


    @FindBy(xpath = "//h1[text()='Working...Please Wait']")
    List<WebElement> loder;



    /** Enter the Tech Badge data */
      public void enterTechBadge() throws InterruptedException {

//        WaitActions.getWaits().waitForElementTobeClickable(txt_scanEmployeeBadge);
          waitMethods.waitForElementToBeRefreshedAndClickable(txt_scanEmployeeBadge);
        WebElementActions.getActions(driver).inputText(txt_scanEmployeeBadge, prop.getProperty("TechBadge"));
        TestListener.saveScreenshotPNG(driver);


    }

    /** Click on Go */
  /*    public void clickOnGo() throws InterruptedException {

      //  WaitActions.getWaits().waitForElementTobeClickable(btn_GO);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_GO);
        WebElementActions.getActions().clickElement(btn_GO);
        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);

    }

    /**verify SelectWork Title*/
      public void verifySelectWork () throws InterruptedException {

          waitMethods.loadingWait(loder);
         Thread.sleep(5000);
        if (txt_SelectAssignedWork.size()>0){
            waitMethods.waitForElementToBeRefreshedAndClickable(btn_SelectButton);
            WebElementActions.getActions(driver).clickElement(btn_SelectButton);

        }else{

        }

    }


    /**verify Hyperlink */
      public void verifyHyperlink () throws InterruptedException {
          waitMethods.loadingWait(loder);
        Thread.sleep(2000);
        System.out.println(txt_NotCleanABSConnection.size());
        if(txt_NotCleanABSConnection.size()==0){
            WebElementActions.getActions(driver).clickElement(txt_MoreWork);
            WebElementActions.getActions(driver).clickElement(txt_ABSLink);
           // WaitActions.getWaits().WaitUntilWebElementIsVisible(txt_cleanAbsConnection);
            waitMethods.waitForElementToBeRefreshedAndClickable(txt_cleanAbsConnection);
            WebElementActions.getActions(driver).clickElement(txt_cleanAbsConnection);
            WebElementActions.getActions(driver).clickElement(icon_Plus);
          //  WaitActions.getWaits().WaitUntilWebElementIsVisible(btn_Add);
            waitMethods.waitForElementToBeRefreshedAndClickable(btn_Add);
            WebElementActions.getActions(driver).clickElement(btn_Add);
         //   WaitActions.getWaits().WaitUntilWebElementIsVisible(txt_CleanABSConnectionAdd);
            waitMethods.waitForElementToBeRefreshedAndClickable(txt_CleanABSConnectionAdd);
            WebElementActions.getActions(driver).clickElement(txt_CleanABSConnectionAdd);



        }else {

        }
    }

    /**click on the Hyperlink*/
      public void clickOnHyperLink() throws InterruptedException {

      //  WaitActions.getWaits().waitForElementTobeClickable(text_Hyperlink);
          waitMethods.waitForElementToBeRefreshedAndClickable(text_Hyperlink1);
        WebElementActions.getActions(driver).clickElement(text_Hyperlink1);
          waitMethods.loadingWait(loder);



    }
    /** verify the Text VMRS */
      public void verifyTextVMRS () throws InterruptedException {

       // WaitActions.getWaits().WaitUntilWebElementIsVisible(label_VMRS);
          waitMethods.waitForElementToBeRefreshedAndIsVisible(label_VMRS);
        Assert.assertTrue(label_VMRS.isDisplayed());

    }
    /**verify Text Other*/
      public void verifyTextOther () throws InterruptedException {

     //   WaitActions.getWaits().waitForElementTobeClickable(label_Other);
          waitMethods.waitForElementToBeRefreshedAndClickable(label_Other);
        WebElementActions.getActions(driver).clickElement(label_Other);
        Assert.assertTrue(label_Other.isDisplayed());
    }

    /**verify the Attachment  icon */
      public void verifyAttachmentIcon () throws InterruptedException {

     //   WaitActions.getWaits().WaitUntilWebElementIsVisible(icon_AttachmentIcon);
          waitMethods.waitForElementToBeRefreshedAndIsVisible(icon_AttachmentIcon);
        Assert.assertTrue(icon_AttachmentIcon.isDisplayed());

    }
    /** verify the Text Required Description  */
      public void verifyTextDescriptionRequired () throws InterruptedException {

       // WaitActions.getWaits().WaitUntilWebElementIsVisible(txt_DescriptionRequired);
          waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_DescriptionRequired);
        Assert.assertTrue(txt_RequiredCorrectionTaskAnswer.isDisplayed());


    }
    /** verify the Text Description */
      public void verifyTextDescription () throws InterruptedException {


          waitMethods.waitForElementToBeRefreshedAndIsVisible(label_Description);
        Assert.assertTrue(label_Description.isDisplayed());

    }


    /** verify Text Required VMRS */
      public void verifyTextRequiredVMRS () throws InterruptedException {


          waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_RequiredVMRS);
        Assert.assertTrue(txt_RequiredVMRS.isDisplayed());

    }

    /** verify the Text VMRS label*/
      public void verifyTextVMRSLabel () throws InterruptedException {
      //  WaitActions.getWaits().WaitUntilWebElementIsVisible(label_TextVMRS);
          waitMethods.waitForElementToBeRefreshedAndIsVisible(label_TextVMRS);
        Assert.assertTrue(label_TextVMRS.isDisplayed());

    }
    /** verify the Text SRI Notes input value */
      public void verifyNoteValue () throws InterruptedException {
      //  WaitActions.getWaits().WaitUntilWebElementIsVisible(input_TextValue);
          waitMethods.waitForElementToBeRefreshedAndIsVisible(input_TextValue);
        Assert.assertTrue(input_TextValue.isDisplayed());
    }

    /** verify Text Actual Hours */
      public void verifyTextActualHours() throws InterruptedException {

      //  WaitActions.getWaits().WaitUntilWebElementIsVisible(label_ActualHours);
          waitMethods.waitForElementToBeRefreshedAndIsVisible(label_ActualHours);
        Assert.assertTrue(label_ActualHours.isDisplayed());
    }

    /** verify the Text Complaint */
      public void verifyTextComplaint () throws InterruptedException {
     //   WaitActions.getWaits().WaitUntilWebElementIsVisible(label_Complaint);
          waitMethods.waitForElementToBeRefreshedAndIsVisible(label_Complaint);
        Assert.assertTrue(label_Complaint.isDisplayed());
    }

    /**verify the Complaint Text Area */
      public void verifyComplaintTextArea () throws InterruptedException {
       // WaitActions.getWaits().WaitUntilWebElementIsVisible(txt_CorrectionTextArea);
          waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_CorrectionTextArea);
        Assert.assertTrue(txt_CorrectionTextArea.isDisplayed());
    }

    /** verify Text Required Cause Reason */
      public void verifyTextRequiredCauseReason() throws InterruptedException {
      //  WaitActions.getWaits().WaitUntilWebElementIsVisible(txt_RequiredCauseReason);
          waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_RequiredCauseReason);
        Assert.assertTrue(txt_RequiredCauseReason.isDisplayed());

    }
    /** verify Text Cause Reason*/
      public void verifyTextCauseReason() throws InterruptedException {
      //  WaitActions.getWaits().WaitUntilWebElementIsVisible(label_CauseReason);
          waitMethods.waitForElementToBeRefreshedAndIsVisible(label_CauseReason);
        Assert.assertTrue(label_CauseReason.isDisplayed());

    }
    /** verify Required Correction Task */
      public void verifyRequiredCorrectionTask  () throws InterruptedException {
     //   WaitActions.getWaits().WaitUntilWebElementIsVisible(txt_RequiredCorrectionTask);
          waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_RequiredCorrectionTask);
        Assert.assertTrue(txt_RequiredCorrectionTask.isDisplayed());

    }


    /** verify Text Correction Task */
      public void verifyTextCorrectionTask () throws InterruptedException {

       // WaitActions.getWaits().WaitUntilWebElementIsVisible(label_CorrectionTask);
          waitMethods.waitForElementToBeRefreshedAndIsVisible(label_CorrectionTask);
        Assert.assertTrue(label_CorrectionTask.isDisplayed());

    }

    /** verify Text Clean */
      public void verifyTextClean () throws InterruptedException {

      //  WaitActions.getWaits().WaitUntilWebElementIsVisible(label_Clean);
          waitMethods.waitForElementToBeRefreshedAndIsVisible(label_Clean);
        Assert.assertTrue(label_Clean.isDisplayed());

    }

    /** verify Required Correction Task Answer */
      public void verifyRequiredCorrectionTaskAnswer () throws InterruptedException {

     //   WaitActions.getWaits().WaitUntilWebElementIsVisible(txt_RequiredCorrectionTaskAnswer);
          waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_RequiredCorrectionTaskAnswer);
        Assert.assertTrue(txt_RequiredCorrectionTaskAnswer.isDisplayed());

    }

    /** verify cancel button */
      public void verifyCancelButton () throws InterruptedException {
      //  WaitActions.getWaits().WaitUntilWebElementIsVisible(label_Cancel);
          waitMethods.waitForElementToBeRefreshedAndIsVisible(label_Cancel);
        Assert.assertTrue(label_Cancel.isDisplayed());


    }
    /** verify OK Button */
      public void verifyOKButton() throws InterruptedException {
      //  WaitActions.getWaits().WaitUntilWebElementIsVisible(label_OK);
          waitMethods.waitForElementToBeRefreshedAndIsVisible(label_OK);
        Assert.assertTrue(label_OK.isDisplayed());

    }


    /** Click On button */
      public void clickOnOkButton() throws InterruptedException {
      //  WaitActions.getWaits().waitForElementTobeClickable(label_OK);
          waitMethods.waitForElementToBeRefreshedAndClickable(label_OK);
        WebElementActions.getActions(driver).clickElement(label_OK);
          waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);

    }

    /**click On Alert Ok Button */
      public void clickOnAlertButton () throws InterruptedException {
     //   WaitActions.getWaits().waitForElementTobeClickable(text_Required3csOKButton);
          waitMethods.waitForElementToBeRefreshedAndClickable(text_Required3csOKButton);
        WebElementActions.getActions(driver).clickElement(text_Required3csOKButton);
        WebElementActions.getActions(driver).clickElement(label_OK);

    }


    /**verify  wait for Element present 3cs text for Alert is visible or not*/
      public void verifyCharltonRepairInc () throws InterruptedException {
        if (CharltonRepairInc.size()>0) {
            WebElementActions.getActions(driver).clickElement(text_Hyperlink);
            WebElementActions.getActions(driver).clickElement(label_OK);
            String Alert = new String ("3Cs is required for work order activity.");

          //  WaitActions.getWaits().waitForElementTobeClickable(text_Required3csOKButton);
            waitMethods.waitForElementToBeRefreshedAndClickable(text_Required3csOKButton);
            WebElementActions.getActions(driver).clickElement(text_Required3csOKButton);
            TestListener.saveScreenshotPNG(driver);


        }else {
            WebElementActions.getActions(driver).clickElement(label_OK);
            String Alert = new String("3Cs is required for work order activity.");
          //  WaitActions.getWaits().waitForElementTobeClickable(text_Required3csOKButton);
            waitMethods.waitForElementToBeRefreshedAndClickable(text_Required3csOKButton);
            WebElementActions.getActions(driver).clickElement(text_Required3csOKButton);
            TestListener.saveScreenshotPNG(driver);


        }

    }

    /** Enter the Text Column Complaint Text  Area  */
    public void enterTheComplaintsText () throws InterruptedException {

     //   WaitActions.getWaits().waitForElementTobeClickable(txt_ComplaintsTextArea);
        waitMethods.waitForElementToBeRefreshedAndClickable(txt_ComplaintsTextArea) ;
        WebElementActions.getActions(driver).inputText(txt_ComplaintsTextArea,prop.getProperty("ComplaintsText"));

    }
    /**Enter the Text Column Cause of Text Area */
      public void enterTheCauseReasonOfTextArea () throws InterruptedException {

     //   WaitActions.getWaits().waitForElementTobeClickable(txt_CauseReasonTextArea);
          waitMethods.waitForElementToBeRefreshedAndClickable(txt_CauseReasonTextArea);
        WebElementActions.getActions(driver).inputText(txt_CauseReasonTextArea,prop.getProperty("CauseOfTextAreaText"));


    }
    /**Enter the Text Column Correction Task Area*/
      public void enterTheCorrectionTaskArea  () throws InterruptedException {

      //  WaitActions.getWaits().waitForElementTobeClickable(txt_CorrectionTextArea);
          waitMethods.waitForElementToBeRefreshedAndClickable(txt_CorrectionTextArea);
        WebElementActions.getActions(driver).inputText(txt_CorrectionTextArea,prop.getProperty("CorrectionTaskArea"));


    }

    /**Click on OK Button */
      public void clickOKButton () throws InterruptedException {
     //   WaitActions.getWaits().waitForElementTobeClickable(label_OK);
          waitMethods.waitForElementToBeRefreshedAndClickable(label_OK);
        WebElementActions.getActions(driver).clickElement(label_OK);
          waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);

    }

    /**click on Summary Tab */

      public void clickOnSummaryTabButton () throws InterruptedException {

    //    WaitActions.getWaits().waitForElementTobeClickable(btn_SummaryTab);
          waitMethods.waitForElementToBeRefreshedAndClickable(btn_SummaryTab);
        WebElementActions.getActions(driver).clickElement(btn_SummaryTab);
          waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);


    }

    /** click on Unit Ready Button */
      public void clickOnUnitReadyButton () throws InterruptedException {

      //  WaitActions.getWaits().waitForElementTobeClickable(bth_UnitReadyButton);
          waitMethods.waitForElementToBeRefreshedAndClickable(bth_UnitReadyButton);
        WebElementActions.getActions(driver).clickElement(bth_UnitReadyButton);
        TestListener.saveScreenshotPNG(driver);


    }


    /**verify The text please Select Following jobs 3cs*/
      public void verifyTheTextPleaseSelectFollowingJob3cs () throws InterruptedException {

     //   WaitActions.getWaits().WaitUntilWebElementIsVisible(txt_PleaseSelectTheFollowingJobSandEnterThe3Cs);
          waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_PleaseSelectTheFollowingJobSandEnterThe3Cs);
        Assert.assertTrue(txt_PleaseSelectTheFollowingJobSandEnterThe3Cs.isDisplayed());
          waitMethods.loadingWait(loder);

    }

    /**click On Ready OK Button */
      public void clickOnUnitReadyOKButton () throws InterruptedException {

     //   WaitActions.getWaits().waitForElementTobeClickable(btn_UnitReadyOKButton);
          waitMethods.waitForElementToBeRefreshedAndClickable(btn_UnitReadyOKButton);
        WebElementActions.getActions(driver).clickElement(btn_UnitReadyOKButton);
          waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);


    }

    /**Click on VMRS CleanABSConnection  */
      public void clickOnCleanABSConnection () throws InterruptedException {
     //   WaitActions.getWaits().waitForElementTobeClickable(txt_cleanABSConnection);
          waitMethods.waitForElementToBeRefreshedAndClickable(txt_Hyperlinlk2);
        WebElementActions.getActions(driver).clickElement(txt_Hyperlinlk2);

    }
    /**type Correction textarea */
      public void CorrectionTextarea () throws InterruptedException {
      //  WaitActions.getWaits().waitForElementTobeClickable(txt_CorrectionTaskSummaryTab);
          waitMethods.waitForElementToBeRefreshedAndClickable(txt_CorrectionTaskSummaryTab);
        WebElementActions.getActions(driver).inputText(txt_CorrectionTaskSummaryTab,prop.getProperty("CorrectionTaskSummaryTab"));


    }
    /**type Cause textarea */
      public void CauseTextarea () throws InterruptedException {
     //   WaitActions.getWaits().waitForElementTobeClickable(txt_CauseReasonSummaryTab);
          waitMethods.waitForElementToBeRefreshedAndClickable(txt_CauseReasonSummaryTab);
        WebElementActions.getActions(driver).inputText(txt_CauseReasonSummaryTab,prop.getProperty("CauseReasonSummaryTab"));


    }

    /**type Complaints textarea*/
      public void  ComplaintsTextarea  () throws InterruptedException {
      //  Waitxt_ComplaintsSummaryTabtActions.getWaits().waitForElementTobeClickable(txt_ComplaintsSummaryTab);
          waitMethods.waitForElementToBeRefreshedAndClickable(txt_ComplaintsSummaryTab);
        WebElementActions.getActions(driver).inputText(txt_ComplaintsSummaryTab,prop.getProperty("ComplaintsSummaryTab")) ;

    }



    /**clean  Column Text  Complaint Task Area */
      public void cleanComplaintTextArea () throws InterruptedException {

     //   WaitActions.getWaits().waitForElementTobeClickable(txt_ComplaintsTextArea);
          waitMethods.waitForElementToBeRefreshedAndClickable(txt_ComplaintsTextArea);
        txt_ComplaintsTextArea.clear();

    }


    /**clean Column Text Cause of Text Area */
      public void cleanCauseReasonOfTextArea () throws InterruptedException {

      //  WaitActions.getWaits().waitForElementTobeClickable(txt_CauseReasonTextArea);
          waitMethods.waitForElementToBeRefreshedAndClickable(txt_CauseReasonTextArea);
        txt_CauseReasonTextArea.clear();
    }


    /** clean Column Text Correction Task Area */
      public void cleanCorrectionTaskArea () throws InterruptedException {

     //   WaitActions.getWaits().waitForElementTobeClickable(txt_CorrectionTextArea);
          waitMethods.waitForElementToBeRefreshedAndClickable(txt_CorrectionTextArea);
        txt_CorrectionTextArea.clear();


    }

    /**click On Ok Button Summary Tab */
      public void clickOnOkButtonSummaryTab () throws InterruptedException {
     //   WaitActions.getWaits().waitForElementTobeClickable(btn_OKSummaryTab);
          waitMethods.waitForElementToBeRefreshedAndClickable(btn_OKSummaryTab);
        WebElementActions.getActions(driver).clickElement(btn_OKSummaryTab);
        TestListener.saveScreenshotPNG(driver);


    }


    /**click on Assign Work  button Top Text*/
      public void clickAssignWorkButtonTopText  () throws InterruptedException {

     //   WaitActions.getWaits().waitForElementTobeClickable(Btn_AssignWork);
          waitMethods.waitForElementToBeRefreshedAndClickable(Btn_AssignWork);
        WebElementActions.getActions(driver).clickElement(Btn_AssignWork);
        TestListener.saveScreenshotPNG(driver);

    }


    /** click on SignOut */
      public void clickOnSignOut () throws InterruptedException {
     //   WaitActions.getWaits().waitForElementTobeClickable(Btn_SignOUt);
        waitMethods.waitForElementToBeRefreshedAndClickable(Btn_SignOUt);
        WebElementActions.getActions(driver).clickElement(Btn_SignOUt);
        TestListener.saveScreenshotPNG(driver);


    }


}


