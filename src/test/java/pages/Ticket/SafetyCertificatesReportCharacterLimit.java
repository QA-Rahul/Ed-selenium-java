package pages.Ticket;

import actions.ReusableActions;
import actions.WaitActions;
//import actions.WebElementActions;
import actions.WebElementActions;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import tests.TestDriverActions;
import utils.TestListener;
import utils.WaitMethods;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public class SafetyCertificatesReportCharacterLimit extends TestDriverActions {

    @FindBy(xpath ="//span[text()='Fleet']")
    WebElement reportCategory_fleet;
    @FindBy(xpath ="//span[text()='Safety Certificates']")
    WebElement availableReport_safetyCertificates;
    @FindBy(xpath= "//label[text()='From Expiry Date:']/following::input[1]")
    WebElement fromDate_txtbox;
    @FindBy(xpath = "//label[text()='To Expiry Date:']/following::input[1]")
    WebElement toDate_txtbox;

    @FindBy(xpath = "//span[text()='Run Report']")
    WebElement Report_run;

    @FindBy(xpath = "//a[text()='Sign Out']")
    WebElement btn_signOut;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement inputbox_Username;

    public SafetyCertificatesReportCharacterLimit(WebDriver driver){
        this.driver = driver;
        this.waitMethods = new WaitMethods(driver);
    }

    @FindBy(xpath = "//h1[contains(.,'Working...Please Wait')]")
    List<WebElement> loder;

    public void gotoReport() throws FileNotFoundException, InterruptedException {
        ReusableActions.getActions(driver).clickParentMenu("Reports");
    }
    /**
     * click on fleet
     */
      public void clickOnFleet() throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndClickable(reportCategory_fleet);
        WebElementActions.getActions(driver).clickElement(reportCategory_fleet);

          waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * click on Safety certificate
     */
      public void clickOnSafetyCertificate() throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndClickable(availableReport_safetyCertificates);
        WebElementActions.getActions(driver).clickElement(availableReport_safetyCertificates);

          waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     *  Enter From date
     */
      public void enterFromDate() throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndClickable(fromDate_txtbox);
        WebElementActions.getActions(driver).inputText(fromDate_txtbox,appProp52.getProperty("fromDate"));

        waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     *  Enter To date
     */
     public void enterToDate() throws InterruptedException {
         waitMethods.waitForElementToBeRefreshedAndClickable(toDate_txtbox);
        WebElementActions.getActions(driver).inputText(toDate_txtbox,appProp52.getProperty("toDate"));

         waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * click on Run Report
     */
      public void clickReportRun() throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndClickable(Report_run);
        WebElementActions.getActions(driver).clickElement(Report_run);

          waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * Verify character is more than 6
     */
      public void verifyUnitCharacter() throws InterruptedException, IOException, IOException {
//        Thread.sleep(5000);
//        ReusableActions.deleteDownloadedFile();

        Thread.sleep(10000);
        File dir = new File(System.getProperty("user.dir") + "\\downloadFiles");
        File[] dirContents = dir.listFiles();
        String fileName = dirContents[0].getName();
        String url = System.getProperty("user.dir") + "\\downloadFiles\\" + fileName;
        if (url.contains(".pdf")) {
            File file = new File(url);
            FileInputStream fis = new FileInputStream(file);
            PDDocument document = null;
            document = PDDocument.load(fis);
            PDFTextStripper pdfStripper = new PDFTextStripper();
            String pdfFullText = pdfStripper.getText(document);
            //        System.out.println(pdfFullText);

             Thread.sleep(8000);
            if(pdfFullText.contains("6874TOUILLE")){
                System.out.println("Display whole unit# on the safety certificates report");
            }
            fis.close();

            Thread.sleep(10000);
            ReusableActions.deleteDownloadedFile();

        }
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
