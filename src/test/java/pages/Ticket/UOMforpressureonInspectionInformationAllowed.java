package pages.Ticket;

import actions.ReusableActions;
import actions.WaitActions;
//import actions.WebElementActions;
import actions.WebElementActions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import tests.TestDriverActions;
import utils.TestListener;

import java.io.FileNotFoundException;
import java.util.List;

public class UOMforpressureonInspectionInformationAllowed extends TestDriverActions {
    @FindBy(xpath = "//span[contains(.,'Unit Inspection Information')]")
    WebElement label_UnitInspectionInformation;

    @FindBy(xpath = "//span[text()='Seq#']")
    WebElement seq;

    @FindBy(xpath = "//span[text()='Label / Abbreviation']")
    WebElement LabelAbbreviation;

     @FindBy(xpath = "//span[text()='Type']")
     WebElement Type;

     @FindBy(xpath = "//span[text()='Length']")
     WebElement length;

     @FindBy(xpath = "//span[text()='Decimal Places']")
     WebElement DecimalPlaces;

     @FindBy(xpath = "(//span[text()='UOM'])[1]")
     WebElement UOM;

    @FindBy(xpath = "//a[contains(.,'Add Unit Inspection Information')]/child::span")
    WebElement AddUnitInspectionInformation;

    @FindBy(xpath = "(//input[contains(@id,':it1::content')])[2]")
    WebElement label_LabelTextArea;

    @FindBy(xpath = "//select[contains(@id,':soctyp::content')]")
    WebElement TypeTextArea;

    @FindBy(xpath = "//select[contains(@id,':soc2::content')]")
    WebElement UOMTextaraea;

    @FindBy(xpath ="(//label[text()='Length']/parent::td/following::td/child::input)[1]" )
    WebElement lengthTestarea;

    @FindBy(xpath = "(//label[text()='Length']/parent::td/following::td/child::input)[2]")
    WebElement decimalTextarea;


    @FindBy(xpath = "(//span[text()='Cancel'])[1]")
    WebElement Cancel;

    @FindBy(xpath = "//span[contains(text(),'UOM')]/parent::td")
    WebElement label_Type;

    @FindBy(xpath = "//span[contains(text(),'PSI')]")
    WebElement UOM_PSI;

   @FindBy(xpath = "(//span[contains(text(),'UOM')]/parent::td)[2]")
   WebElement label_UOM;

    @FindBy(xpath = "//span[contains(text(),'Kilopascal')]")
    WebElement KPA;

    @FindBy(xpath = "(//span[contains(text(),'UOM')]/parent::td)[3]")
    WebElement label_UOM1;

    @FindBy(xpath = "//span[contains(text(),'Bar')]")
    WebElement Bar;

    @FindBy(xpath = "//a[contains(.,'Close')]")
    WebElement btn_Close;

    @FindBy(xpath = "//a[contains(@id,':0:clEqYMM')]/span")
    WebElement label_UnitNumber;

    @FindBy(xpath = "//a[contains(.,'More Info')]")
    WebElement btn_MoreInfo;

    @FindBy(xpath = "//label[text()='UOM:']")
    WebElement label_additionalspecsUOM;

    @FindBy(xpath = "//select[contains(@id,':soc5::content')]")
    WebElement UOM3;

    @FindBy(xpath = "//label[text()='UOM:']")
    WebElement UOM2;

    @FindBy(xpath = "(//a[contains(.,'Save / Exit')])[2]")
    WebElement btn_SaveExit;

    @FindBy(xpath = "(//a[contains(.,'Save / Exit')])[1]")
    WebElement SaveExit;

    @FindBy(xpath = "//a[contains(text(),'Sign Out')]")
    public WebElement sign_out;

    @FindBy(name = "username")
    public WebElement inputbox_Username;

    @FindBy(xpath = "//h1[text()='Working...Please Wait']")
    List<WebElement> loder;


    /** go to PM Inspection Manager*/
   public void clickOnPMInspectionManager () throws FileNotFoundException, InterruptedException {
       ReusableActions.getActions(driver).clickParentMenu("Fleet");
       ReusableActions.getActions(driver).clickChildMenu("PM Inspection Manager");

       TestListener.saveScreenshotPNG(driver);

   }
   /**click on Unit Inspection Information */
     public void clickOnUnitInspectionInformation  () throws InterruptedException {
         waitMethods.waitForElementToBeRefreshedAndClickable(label_UnitInspectionInformation);
       WebElementActions.getActions(driver).clickElement(label_UnitInspectionInformation);
         waitMethods.loadingWait(loder);

       TestListener.saveScreenshotPNG(driver);

   }
   /**verify seq# ,label,Type,length,Decimal,UOM */
     public void  verifyData () throws InterruptedException {

         waitMethods.waitForElementToBeRefreshedAndIsVisible(seq);
       Assert.assertTrue(seq.isDisplayed());

         waitMethods.waitForElementToBeRefreshedAndIsVisible(LabelAbbreviation);
       Assert.assertTrue(LabelAbbreviation.isDisplayed());

         waitMethods.waitForElementToBeRefreshedAndIsVisible(Type);
       Assert.assertTrue(Type.isDisplayed());

         waitMethods.waitForElementToBeRefreshedAndIsVisible(length);
       Assert.assertTrue(length.isDisplayed());

         waitMethods.waitForElementToBeRefreshedAndIsVisible(DecimalPlaces);
       Assert.assertTrue(DecimalPlaces.isDisplayed());

         waitMethods.waitForElementToBeRefreshedAndIsVisible(UOM);
       Assert.assertTrue(UOM.isDisplayed());
         waitMethods.loadingWait(loder);

       TestListener.saveScreenshotPNG(driver);

   }

   /**click on Add UnitInspection Information */
     public void clickOnAddUnitInspectionInformation () throws InterruptedException {
         waitMethods.waitForElementToBeRefreshedAndClickable(AddUnitInspectionInformation);
       WebElementActions.getActions(driver).clickElement(AddUnitInspectionInformation);

       TestListener.saveScreenshotPNG(driver);

   }
   /**enter Label TextArea Name*/
     public void enterLabel () throws InterruptedException {
         waitMethods.waitForElementToBeRefreshedAndClickable(label_LabelTextArea);
       WebElementActions.getActions(driver).inputText(label_LabelTextArea,appProp.getProperty("lABELONE"));


       TestListener.saveScreenshotPNG(driver);

   }
   /**select Dropdown TYPE */
     public void selectdropdownUOM () throws InterruptedException {
       Select objselect=new Select(TypeTextArea);
       objselect.selectByVisibleText("UOM");

       Assert.assertTrue(UOM.isDisplayed());
       TestListener.saveScreenshotPNG(driver);

   }
    /**click length and Decimal */
      public void clicklengthandDecimal () throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndClickable(lengthTestarea);
        WebElementActions.getActions(driver).inputText(lengthTestarea,appProp.getProperty("one"));


          waitMethods.waitForElementToBeRefreshedAndClickable(decimalTextarea);
        WebElementActions.getActions(driver).inputText(decimalTextarea,appProp.getProperty("one"));

        TestListener.saveScreenshotPNG(driver);
    }

    /**select Dropdown UOM */
       public void selectdropdownBar () throws InterruptedException {
       Select objselect=new Select(UOMTextaraea);
       objselect.selectByVisibleText(" Bar [BAR]");

           waitMethods.waitForElementToBeRefreshedAndIsVisible(UOMTextaraea);
        Assert.assertTrue(UOMTextaraea.isDisplayed());
       TestListener.saveScreenshotPNG(driver);
   }

   /**click on Add Button */
     public void clickOnCancel() throws InterruptedException {

         waitMethods.waitForElementToBeRefreshedAndClickable(Cancel);
       WebElementActions.getActions(driver).clickElement(Cancel);
         waitMethods.loadingWait(loder);

       TestListener.saveScreenshotPNG(driver);
   }
   /**click On Add Unit Inspection Information */
     public void enterLabelTwo () throws InterruptedException {

         waitMethods.waitForElementToBeRefreshedAndClickable(label_LabelTextArea);
       WebElementActions.getActions(driver).inputText(label_LabelTextArea,appProp.getProperty("lABELTWO"));

       TestListener.saveScreenshotPNG(driver);

   }
    /**click length and Decimal */
      public void clicklengthandDecimalTwo () throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndClickable(lengthTestarea);
        WebElementActions.getActions(driver).inputText(lengthTestarea,appProp.getProperty("two"));

          waitMethods.waitForElementToBeRefreshedAndClickable(decimalTextarea);
        WebElementActions.getActions(driver).inputText(decimalTextarea,appProp.getProperty("two"));

        TestListener.saveScreenshotPNG(driver);
    }

    /**select dropdown Kilopascal [KPA]*/
       public void selectdropdownKilopascal () throws InterruptedException {
         Select objselect=new Select(UOMTextaraea);
         objselect.selectByVisibleText(" Kilopascal [KPA]");

           waitMethods.waitForElementToBeRefreshedAndIsVisible(UOMTextaraea);
         Assert.assertTrue(UOMTextaraea.isDisplayed());
         TestListener.saveScreenshotPNG(driver);

     }
     /**verify Type And UOM 2*/
       public void verifyTypeandUOM2() throws InterruptedException {
           waitMethods.waitForElementToBeRefreshedAndIsVisible(label_UOM);
         Assert.assertTrue(label_UOM.isDisplayed());

           waitMethods.waitForElementToBeRefreshedAndIsVisible(KPA);
         Assert.assertTrue(KPA.isDisplayed());

         TestListener.saveScreenshotPNG(driver);
     }
    /**click On Add Unit Inspection Information */
      public void enterLabelThree () throws InterruptedException {

          waitMethods.waitForElementToBeRefreshedAndClickable(label_LabelTextArea);
        WebElementActions.getActions(driver).inputText(label_LabelTextArea,appProp.getProperty("lABELTHREE"));

        TestListener.saveScreenshotPNG(driver);

    }
    /**click length and Decimal */
      public void clicklengthandDecimalThree () throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndClickable(lengthTestarea);
        WebElementActions.getActions(driver).inputText(lengthTestarea,appProp.getProperty("three"));

          waitMethods.waitForElementToBeRefreshedAndClickable(decimalTextarea);
        WebElementActions.getActions(driver).inputText(decimalTextarea,appProp.getProperty("three"));

        TestListener.saveScreenshotPNG(driver);
    }

    /**select Dropdown Bar [BAR] */
       public void selectdropdownPSI () throws InterruptedException {
         Select objselect=new Select(UOMTextaraea);
         objselect.selectByVisibleText(" PSI [PSI]");


           waitMethods.waitForElementToBeRefreshedAndIsVisible(UOMTextaraea);
         Assert.assertTrue(UOMTextaraea.isDisplayed());
         TestListener.saveScreenshotPNG(driver);

     }
     /**click on Close Button  */
       public void clickonClose () throws InterruptedException {
           waitMethods.waitForElementToBeRefreshedAndClickable(btn_Close);
         WebElementActions.getActions(driver).clickElement(btn_Close);
         Thread.sleep(3000);
           waitMethods.loadingWait(loder);

         TestListener.saveScreenshotPNG(driver);

    }
   /**go to Unit Master */
     public void gotoUnitMasterScreen() throws InterruptedException, FileNotFoundException {

       ReusableActions.getActions(driver).clickParentMenu("Fleet");
       ReusableActions.getActions(driver).clickChildMenu("Unit Master");

       TestListener.saveScreenshotPNG(driver);
   }
   /**click On Unit Number*/
     public void clickonUnitNumber () throws InterruptedException {
         waitMethods.waitForElementToBeRefreshedAndClickable(label_UnitNumber);
       WebElementActions.getActions(driver).clickElement(label_UnitNumber);
         waitMethods.loadingWait(loder);

       TestListener.saveScreenshotPNG(driver);
   }
   /**click on More info*/
     public void clickonMoreInfo () throws InterruptedException {
         waitMethods.waitForElementToBeRefreshedAndClickable(btn_MoreInfo);
       WebElementActions.getActions(driver).clickElement(btn_MoreInfo);

       TestListener.saveScreenshotPNG(driver);

   }
   /** verify UOM spec BAR*/
     public void  verifyOnspecs () throws InterruptedException {
         waitMethods.waitForElementToBeRefreshedAndIsVisible(label_additionalspecsUOM);
       Assert.assertTrue(label_additionalspecsUOM.isDisplayed());

         waitMethods.waitForElementToBeRefreshedAndClickable(UOM3);
       WebElementActions.getActions(driver).clickElement(UOM3);
       Select objselect = new Select(UOM3);
       objselect.selectByVisibleText("BAR");

         waitMethods.waitForElementToBeRefreshedAndClickable(UOM3);
       Assert.assertTrue(UOM3.isDisplayed());

       TestListener.saveScreenshotPNG(driver);
   }
   /**verify UOM spec KPA */
         public void verifyOnSpecsKPA () throws InterruptedException {
           Select objselect = new Select(UOM3);
           objselect.selectByVisibleText("KPA");

             waitMethods.waitForElementToBeRefreshedAndClickable(UOM3);
           Assert.assertTrue(UOM3.isDisplayed());

           TestListener.saveScreenshotPNG(driver);
       }
    /**verify UOM spec PSI*/
         public void verifyOnSpecsPSI () throws InterruptedException {
        Select objselect = new Select(UOM3);
        objselect.selectByVisibleText("PSI");

             waitMethods.waitForElementToBeRefreshedAndClickable(UOM3);
       Assert.assertTrue(UOM3.isDisplayed());

       TestListener.saveScreenshotPNG(driver);

   }
  /**click on Save/Exit */
    public void clickOnSaveExit () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(btn_SaveExit);
      WebElementActions.getActions(driver).clickElement(btn_SaveExit);


        waitMethods.waitForElementToBeRefreshedAndClickable(SaveExit);
      WebElementActions.getActions(driver).clickElement(SaveExit);

      TestListener.saveScreenshotPNG(driver);

  }
    /**
     * click on signOut button
     * click on  username
     */
      public void clickOnSignOut() throws InterruptedException {

          waitMethods.waitForElementToBeRefreshedAndClickable(sign_out);
        WebElementActions.getActions(driver).clickElement(sign_out);


        waitMethods.waitForElementToBeRefreshedAndIsVisible(inputbox_Username);
        WebElementActions.getActions(driver).clickElement(inputbox_Username);
        TestListener.saveScreenshotPNG(driver);
    }

}
