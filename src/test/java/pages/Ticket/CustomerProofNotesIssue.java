package pages.Ticket;

import actions.ReusableActions;
import actions.WaitActions;
//import actions.WebElementActions;
import actions.WebElementActions;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.Keys;
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

public class CustomerProofNotesIssue extends TestDriverActions {


    @FindBy(xpath = "//span[text()='New RO']")
    WebElement Button_NewRo;

    @FindBy(xpath = "//h1[text()='New Repair Order']")
    WebElement title_NewRepairOrder;
    @FindBy(xpath = "(//label[text()='Location:'])[1]")
    WebElement Location;
    @FindBy(xpath = "(//label[text()='Location:'])[1]/following::input[1]")
    WebElement txtbox_Location;
    @FindBy(xpath = "//div[contains(@id,'cbSelectUnitLocal')]")
    WebElement button_Select;
    @FindBy(xpath = "//div[contains(@id,'cbCancel')]")
    List<WebElement> btn_close;
    @FindBy(xpath = "(//label[text()='Location:'])[1]/following::a[1]")
    WebElement location_name;
    @FindBy(xpath = "(//label[text()='Owner:'])[1]")
    WebElement owner;
    @FindBy(xpath = "(//label[text()='Owner:'])[1]/following::span[1]")
    WebElement owner_name;
    @FindBy(xpath = "//label[text()='Notes:']")
    WebElement label_note;
    @FindBy(xpath = "//label[text()='Notes:']/following::a[1]")
    WebElement note_link;
    @FindBy(xpath = "//span[text()='Re-Sequence']/following::span[2]")
    WebElement button_AddLabour;
    @FindBy(xpath = "(//a[text()='VMRS'])[1]")
    WebElement button_VMRS;
    @FindBy(xpath = "//input[contains(@id,'searchVmrs:dc_it1::content')]")
    WebElement searchArea;
    @FindBy(xpath = "//a[contains(@id,'cilvmrsys')]/img")
    WebElement firstlabour_img;
    @FindBy(xpath = "(//a[contains(@id,'ciAddVmrs')]/img)[1]")
    WebElement button_plus;
    @FindBy(xpath = "//span[text()='Add']")
    WebElement button_ok;
    @FindBy(xpath = "//label[text()='Notes:']/following::a[1]")
    WebElement notelink;
    @FindBy(xpath = "//div[text()='Notes']")
    WebElement notes;
    @FindBy(xpath = "//textarea[contains(@id,'s1WN:it1::content')]")
    WebElement notes_textArea;
    @FindBy(xpath = "//div[contains(@id,'cbCancel')]")
    WebElement button_cancle;
    @FindBy(xpath = "//div[contains(@id,'s1WN:cbOk')]")
    WebElement button_saveExit;
    @FindBy(xpath = "//span[text()='Customer Proof']")
    WebElement tab_CustomerProof;
    @FindBy(xpath = "//h1[text()='Working...Please Wait']")
    List<WebElement> loder;
    @FindBy(xpath = "//input[contains(@id,'reg0:0:rWO:1:itITRO::content')]")
    WebElement odometer_label;
    @FindBy(xpath = "//span[text()='Sign Out']")
    WebElement btn_signOut;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement inputbox_Username;

    @FindBy(xpath = "//a[text()='Service']")
    WebElement menu_Service;
    @FindBy(xpath = "//td[text()='Complete RO']")
    WebElement subMenu_CompleteRo;


    public CustomerProofNotesIssue(WebDriver driver){
        this.driver = driver;
        this.waitMethods = new WaitMethods(driver);
    }


    /**
     * Go to Complete Ro Screen
     *
     * @throws FileNotFoundException
     * @throws InterruptedException
     */
    public void gotoCompleteRoScreen() throws FileNotFoundException, InterruptedException {
//        ReusableActions.getActions(driver).clickParentMenu("Service");
//        ReusableActions.getActions(driver).clickChildMenu("Complete RO");

        waitMethods.waitForElementToBeRefreshedAndClickable(menu_Service);
        WebElementActions.getActions(driver).clickElement(menu_Service);

        waitMethods.waitForElementToBeRefreshedAndClickable(subMenu_CompleteRo);
        WebElementActions.getActions(driver).clickElement(subMenu_CompleteRo);

        TestListener.saveScreenshotPNG(driver);
    }

    /**
     * click on New Ro Buttton
     *
     * @throws InterruptedException
     */
      public void clickOnNewRo() throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndClickable(Button_NewRo);
        WebElementActions.getActions(driver).clickElement(Button_NewRo);

          waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }

    /**
     * Verify Repair Order title and location
     */
      public void verifyRepairOrderLocation() throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndIsVisible(title_NewRepairOrder);
        Assert.assertTrue(title_NewRepairOrder.isDisplayed());
        Assert.assertTrue(Location.isDisplayed());
        Assert.assertTrue(txtbox_Location.isDisplayed());
    }

    /**
     * click on select button of first unit
     *
     * @throws InterruptedException
     */
      public void clickOnSelectButton() throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndClickable(button_Select);
          WebElementActions.getActions(driver).clickElement(button_Select);

        Thread.sleep(8000);
        if(btn_close.size() > 0) {
            waitMethods.waitForElementToBeRefreshedAndClickable(btn_close.get(0));
            WebElementActions.getActions(driver).clickElement(btn_close.get(0));
        }

          waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }

    /**
     * verify element of repair order
     */
      public void verifyRepairOrder() throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndIsVisible(Location);
        Assert.assertTrue(Location.isDisplayed());
        Assert.assertTrue(location_name.isDisplayed());
        Assert.assertTrue(owner.isDisplayed());
        Assert.assertTrue(owner_name.isDisplayed());
        Assert.assertTrue(label_note.isDisplayed());
        Assert.assertTrue(note_link.isDisplayed());
    }

    /**
     * click on Add Labour
     */
      public void clickOnAddLabour() throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndClickable(button_AddLabour);
        WebElementActions.getActions(driver).clickElement(button_AddLabour);

          waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }

    /**
     * click on VMRS
     */
      public void clickOnVMRS() throws InterruptedException {
 //       Thread.sleep(10000);
          waitMethods.waitForElementToBeRefreshedAndClickable(button_VMRS);
        WebElementActions.getActions(driver).clickElement(button_VMRS);

          waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }

    /**
     * Search first labour
     */
      public void searchLabour() throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndClickable(searchArea);
        WebElementActions.getActions(driver).inputText(searchArea, appProp49.getProperty("FirstLabour"));

          waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }

    /**
     * click on First Labour image
     */
      public void clickonFirstlabourimg() throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndClickable(firstlabour_img);
        WebElementActions.getActions(driver).clickElement(firstlabour_img);

          waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }

    /**
     * click on plus button
     */
      public void clickonPlusIcon() throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndClickable(button_plus);
        WebElementActions.getActions(driver).clickElement(button_plus);

          waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }

    /**
     * click on Add button
     */
     public void clickOnAdd() throws InterruptedException {
         waitMethods.waitForElementToBeRefreshedAndClickable(button_ok);
        WebElementActions.getActions(driver).clickElement(button_ok);

         waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }

    /**
     * click on notes link
     */
      public void clickOnNotes() throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndClickable(notelink);
        WebElementActions.getActions(driver).clickElement(notelink);

          waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }

    /**
     * verify notes element
     */
      public void verifyNotesElement() throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndIsVisible(notes);
        Assert.assertTrue(notes.isDisplayed());
        Assert.assertTrue(notes_textArea.isDisplayed());
        Assert.assertTrue(button_cancle.isDisplayed());
        Assert.assertTrue(button_saveExit.isDisplayed());
    }

    String notedata = "  Engine Issues:\n" +
            "        Check for oil leaks.\n" +
            "        Inspect the coolant system for leaks and proper fluid level.\n" +
            "        Replace air filter if dirty.\n" +
            "        Check spark plugs and ignition system.\n" +
            "\n" +
            "    Brake System:\n" +
            "        Inspect brake pads and replace if worn.\n" +
            "        Check brake rotors for wear and warping.\n" +
            "        Inspect brake fluid level and quality.\n" +
            "\n" +
            "    Suspension and Steering:\n" +
            "        Check tire condition and pressure.\n" +
            "        Inspect and replace worn-out suspension components (e.g., shocks, struts, bushings).\n" +
            "        Check wheel alignment.\n" +
            "        Inspect power steering fluid level.\n" +
            "\n" +
            "    Transmission:\n" +
            "        Check transmission fluid level and condition.\n" +
            "        Inspect drive belts for wear.\n" +
            "\n" +
            "    Electrical System:\n" +
            "        Test the battery and replace if necessary.\n" +
            "        Check the alternator and starter.\n" +
            "        Inspect and replace faulty fuses or bulbs";

    /**
     * enter long note in note textarea
     */
      public void addNotesInTextarea() throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndClickable(notes_textArea);
        WebElementActions.getActions(driver).inputText(notes_textArea, notedata);

          waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }

    /**
     * click on save and exit button
     *
     * @throws InterruptedException
     */
      public void clickon_Save_Exit() throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndClickable(button_saveExit);
        WebElementActions.getActions(driver).clickElement(button_saveExit);

        Thread.sleep(5000);
        odometer_label.sendKeys(Keys.TAB);

          waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }

    public void clickonCustomerProof() throws InterruptedException, FileNotFoundException {


        waitMethods.waitForElementToBeRefreshedAndClickable(tab_CustomerProof);
        WebElementActions.getActions(driver).clickElement(tab_CustomerProof);


        waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }

    public void VerifyRepairOrderCustomerProof() throws InterruptedException, IOException {
        Thread.sleep(5000);
        ReusableActions.getActions(driver).deleteDownloadedFile();
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

            if(pdfFullText.contains("Engine Issues:"))
            {
                System.out.println("Customer Proof Notes is present");

            }

            fis.close();

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
