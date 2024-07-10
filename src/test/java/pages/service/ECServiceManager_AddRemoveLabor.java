 package pages.service;

import actions.ReusableActions;
import actions.WaitActions;
import actions.WebElementActions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import tests.TestDriverActions;
import utils.TestListener;

import java.io.FileNotFoundException;
import java.util.List;

public class ECServiceManager_AddRemoveLabor extends TestDriverActions {

    @FindBy(xpath = "//span[text()='Total Charge']/following::a[3]")
    WebElement hyperlink_referenceNum;

    @FindBy(xpath = "//span[text()='Add Labour']")
    WebElement btn_AddLabour;

    @FindBy(xpath = "(//a[text()='VMRS'])[1]")
    WebElement tab_VMRS;

    @FindBy(xpath = "//h1[text()='Click icon to drill down']/following::a[5]")
    WebElement automatic_manual_Chassis;

    @FindBy(xpath = "//label[text()='Search:']/following::a[3]/img")
    WebElement plus_icon;

    @FindBy(xpath = "//span[text()='Add']")
    WebElement add_btn;

    @FindBy(xpath = "(//span[text()='Total Charge'])[1]/following::tr[1]/td[13]")
    WebElement row_one;

    @FindBy(xpath = "(//span[text()='Total Charge'])[1]/following::a[7]")
    WebElement cross_icon;

    @FindBy(xpath = "//span[text()='Show Labour Details']/following::a[2]/img")
    WebElement delete_icon;

    @FindBy(xpath = "//h1[text()='Click icon to drill down']/following::a[1]")
    WebElement aerodynamic_img;

    @FindBy(xpath = "(//span[text()='Description'])[2]/following::a[1]")
    WebElement IconPlus;

    @FindBy(xpath = "//label[text()='Complaint:']/following::textarea[1]")
    WebElement txt_complaint;

    @FindBy(xpath = "//label[text()='Cause/Reason:']/following::textarea[1]")
    WebElement txt_cause;

    @FindBy(xpath = "//label[text()='Correction/Task:']/following::textarea[1]")
    WebElement txt_task;

    @FindBy(xpath = "//a[text()='Sign Out']")
    WebElement btn_signOut;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement inputbox_Username;

    @FindBy(xpath = "//span[text()='Yes, delete labour and parts']")
    List<WebElement> Yes_delete_labour_and_parts ;

    @FindBy(xpath = "//h1[text()='Working...Please Wait']")
    List<WebElement> loder;


    /**
     * go to CompleteRo
     * @throws FileNotFoundException
     * @throws InterruptedException
     */
     public void gotoCompleteRo() throws FileNotFoundException, InterruptedException {
        ReusableActions.getActions(driver).clickParentMenu("Service");
        ReusableActions.getActions(driver).clickChildMenu("Complete RO");

        action.loadingWait(loder);

        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * Click on Reference Number(O104914)
     */
       public void clickOnReferenceNumber() throws InterruptedException {
 //         Thread.sleep(3000);
 //         WaitActions.getWaits().waitForElementTobeClickable(hyperlink_referenceNum);
          action.waitForElementToBeRefreshedAndClickable(hyperlink_referenceNum);
          WebElementActions.getActions(driver).clickElement(hyperlink_referenceNum);
  //        Thread.sleep(2000);
          action.loadingWait(loder);
          TestListener.saveScreenshotPNG(driver);
      }
      /**
      * click on Add Labour
      */
       public void clickOnAddLabour() throws InterruptedException {
//         WaitActions.getWaits().waitForElementTobeClickable(btn_AddLabour);
          action.waitForElementToBeRefreshedAndClickable(btn_AddLabour);
         WebElementActions.getActions(driver).clickElement(btn_AddLabour);
 //        Thread.sleep(2000);
          action.loadingWait(loder);
           TestListener.saveScreenshotPNG(driver);
       }
       /**
       * Click on VMRS tab.
       */
        public void clickOnVMRStab() throws InterruptedException {
  //         Thread.sleep(2000);
 //       WaitActions.getWaits().waitForElementTobeClickable(tab_VMRS);
           action.waitForElementToBeRefreshedAndClickable(tab_VMRS);
        WebElementActions.getActions(driver).clickElement(tab_VMRS);
 //       Thread.sleep(2000);
           action.loadingWait(loder);
            TestListener.saveScreenshotPNG(driver);
        }
       /**
       * click on image of "Automatic/Manual Chassis Lubricator"
       */
        public void clickOnAutomatic_ManualChassisLubricator() throws InterruptedException {
//        WaitActions.getWaits().waitForElementTobeClickable(automatic_manual_Chassis);
           action.waitForElementToBeRefreshedAndClickable(automatic_manual_Chassis);
        WebElementActions.getActions(driver).clickElement(automatic_manual_Chassis);
 //       Thread.sleep(3000);
           action.loadingWait(loder);
             TestListener.saveScreenshotPNG(driver);
         }
       /**
        *Click on "+" icon(In green colour)
       */
        public void clickOnPlusIcon() throws InterruptedException {
//           WaitActions.getWaits().waitForElementTobeClickable(plus_icon);
           action.waitForElementToBeRefreshedAndClickable(plus_icon);
           WebElementActions.getActions(driver).clickElement(plus_icon);
 //          Thread.sleep(3000);
           action.loadingWait(loder);
           TestListener.saveScreenshotPNG(driver);
       }
       /**
        *click on Add button
        **/
       public void clickOnAddbutton() throws InterruptedException {
//        WaitActions.getWaits().waitForElementTobeClickable(add_btn);
          action.waitForElementToBeRefreshedAndClickable(add_btn);
        WebElementActions.getActions(driver).clickElement(add_btn);
 //       Thread.sleep(2000);
          action.loadingWait(loder);
           TestListener.saveScreenshotPNG(driver);
       }
      /**
      * click on Cross icon
      */
       public void clickOnCrossIcon() throws InterruptedException {
          Thread.sleep(5000);
//          WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(row_one);
          WebElementActions.getActions(driver).moveOnTargetElement(row_one);

 //         WaitActions.getWaits().waitForElementTobeClickable(cross_icon);
          action.waitForElementToBeRefreshedAndClickable(cross_icon);
          Thread.sleep(2000);
          WebElementActions.getActions(driver).clickElement(cross_icon);

          action.loadingWait(loder);
          TestListener.saveScreenshotPNG(driver);
      }
    /**
     * Click on delete icon(Trash icon)
     */
     public void clickOnDeleteIcon() throws InterruptedException {

//        WaitActions.getWaits().waitForElementTobeClickable(delete_icon);
        action.waitForElementToBeRefreshedAndClickable(delete_icon);
        WebElementActions.getActions(driver).clickElement(delete_icon);


//        WaitActions.getWaits().loadingWait(loder);

        if( Yes_delete_labour_and_parts.size()>0)
        {
            WebElementActions.getActions(driver).clickElement(Yes_delete_labour_and_parts.get(0));
        }

        action.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     *click on img
     **/
     public void clickOnImg() throws InterruptedException {
//        Thread.sleep(3000);
//        WaitActions.getWaits().waitForElementTobeClickable(aerodynamic_img);
        action.waitForElementToBeRefreshedAndClickable(aerodynamic_img);
        WebElementActions.getActions(driver).clickElement(aerodynamic_img);
 //       Thread.sleep(2000);
        action.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     *Click on "+" icon(In green colour)
     */
     public void clickOnPlusbtn() throws InterruptedException {
        Thread.sleep(2000);
//        WaitActions.getWaits().waitForElementTobeClickable(plus_icon);
        action.waitForElementToBeRefreshedAndClickable(plus_icon);
        WebElementActions.getActions(driver).clickElement(plus_icon);
//        Thread.sleep(3000);
        action.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }

    /**
     *type Third complaint(complaint)
     **/
     public void enterThirdComplaint() throws InterruptedException {
 //       Thread.sleep(3000);
 //       WaitActions.getWaits().waitForElementTobeClickable(txt_complaint);
        action.waitForElementToBeRefreshedAndClickable(txt_complaint);
        WebElementActions.getActions(driver).inputText(txt_complaint,"complaint");
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     *type Third cause( cause)
     **/
     public void enterThirdCause() throws InterruptedException {
//        WaitActions.getWaits().waitForElementTobeClickable(txt_cause);
        action.waitForElementToBeRefreshedAndClickable(txt_cause);
        WebElementActions.getActions(driver).inputText(txt_cause,"cause");
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     *type Third correction(correction)
     **/
     public void enterThirdCorrection() throws InterruptedException {
//        WaitActions.getWaits().waitForElementTobeClickable(txt_task);
        action.waitForElementToBeRefreshedAndClickable(txt_task);
        WebElementActions.getActions(driver).inputText(txt_task,"task");
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * click on sign out button
     * verify username
     */
     public void clickOnSignOut() throws InterruptedException {
//        WaitActions.getWaits().waitForElementTobeClickable(btn_signOut);
        action.waitForElementToBeRefreshedAndClickable(btn_signOut);
        Thread.sleep(3000);
        WebElementActions.getActions(driver).clickElement(btn_signOut);

//        WaitActions.getWaits().WaitUntilWebElementIsVisible(inputbox_Username);
        action.waitForElementToBeRefreshedAndIsVisible(inputbox_Username);
        Assert.assertTrue(inputbox_Username.isDisplayed());

        TestListener.saveScreenshotPNG(driver);
    }


}
