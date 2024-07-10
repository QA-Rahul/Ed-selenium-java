package pages.Ticket;

import actions.ReusableActions;
import actions.WaitActions;
import actions.WebElementActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import tests.TestDriverActions;
import utils.TestListener;
import utils.WaitMethods;

import java.io.FileNotFoundException;
import java.util.List;

public class TheServiceBoardRefreshesAndLosesTheUsersPosition extends TestDriverActions {

    @FindBy(xpath = "//a[text()='Service']")
    WebElement menu_Service;
    @FindBy(xpath = "//td[text()='Service Board']")
    WebElement subMenu_ServiceBoard;
    @FindBy(xpath = "//a[contains(@id,':4:clEquN')]/span")
    WebElement UnitNumber;

    @FindBy(xpath = "//a[contains(@id,':4:clWRQ01')]/span")
    WebElement DVIR;

   @FindBy(xpath = "//h1[contains(text(),'Work Required')]")
    WebElement WorkRequired;

   @FindBy(xpath = "//a[contains(., 'More Work ...')]")
    WebElement MoreWork;

   @FindBy(xpath = "//span[contains(text(),'Air Disc Brakes')]")
   WebElement AirDiscBreak;
   @FindBy(xpath = "//span[text()='Close']")
   WebElement  Close;

   @FindBy(xpath = "//h1[contains(.,'Arrivals')]")
   WebElement Arrials;
   @FindBy(xpath = "(//a[text()='VMRS'])[1]")
    WebElement label_VMRS;

    @FindBy(xpath = "//img[@title='Accessories Group']")
    WebElement label_AccessoriesGroup;

    @FindBy(xpath = "(//img[contains(@id,':ciAddVmrs::icon')])[1]")
   WebElement label_Add;

    @FindBy(xpath = "//span[text()='Add']")
    WebElement label_AddButton;

    @FindBy(xpath = "//a[@title='Aerodynamic Devices']/img")
    WebElement AerodynamicDevices;


    @FindBy(xpath = "//a[@title='Automatic/Manual Chassis Lubricator']/img")
    WebElement AutomaticAndManualChassis;

    @FindBy(xpath = "//a[contains(@id,':1:citWRD1')]")
    WebElement img_CloseOne;


    @FindBy(xpath = "//a[contains(@id,':2:citWRD1')]")
    WebElement img_CloseTwo;

    @FindBy(xpath = "//a[contains(@id,':3:citWRD1')]")
    WebElement img_CloseThree;

    @FindBy(xpath = "//img[contains(@id,':trashButtonVmrserreq:dc_cil1::icon')]")
    WebElement img_Trash;


    @FindBy(xpath = "//a[contains(.,'Sign Out')]")
    WebElement btn_signOut;


    @FindBy(xpath = "//input[@name='username']")
    public WebElement inputbox_Username;

    @FindBy(xpath = "//h1[contains(.,'Working...Please Wait')]")
    List<WebElement> loder;


    public TheServiceBoardRefreshesAndLosesTheUsersPosition(WebDriver driver){
        this.driver = driver;
        this.waitMethods = new WaitMethods(driver);
    }

    /*go to service Board **/
    public void gotoserviceBoard () throws FileNotFoundException, InterruptedException {
//        ReusableActions.getActions().clickParentMenu("Service");
//        ReusableActions.getActions().clickChildMenu("Service Board");

        waitMethods.waitForElementToBeRefreshedAndClickable(menu_Service);
        WebElementActions.getActions(driver).clickElement(menu_Service);

        waitMethods.waitForElementToBeRefreshedAndClickable(subMenu_ServiceBoard);
        WebElementActions.getActions(driver).clickElement(subMenu_ServiceBoard);

        TestListener.saveScreenshotPNG(driver);

    }
     /*verify Unit Number and Wrok Required **/
      public void verifyUnitNumber () throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndIsVisible(UnitNumber);
          Assert.assertTrue(UnitNumber.isDisplayed());

          waitMethods.waitForElementToBeRefreshedAndIsVisible(DVIR);
          Assert.assertTrue(DVIR.isDisplayed());

      }
      /*click on Work Required**/
    public void clickOnDIVR () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(DVIR);
        WebElementActions.getActions(driver).clickElement(DVIR);

    }
    /*verify Work Required **/
    public void verifyOnWorkRequired() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(WorkRequired);
        Assert.assertTrue(WorkRequired.isDisplayed());

        waitMethods.waitForElementToBeRefreshedAndIsVisible(MoreWork);
        Assert.assertTrue(MoreWork.isDisplayed());

        waitMethods.waitForElementToBeRefreshedAndIsVisible(AirDiscBreak);
        Assert.assertTrue(AirDiscBreak.isDisplayed());
    }
     /*click On Clse Button**/
    public void clickOnClose () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(Close);
        WebElementActions.getActions(driver).clickElement(Close);
        waitMethods.loadingWait(loder);

    }
    /*varify Arrials**/
    public void varifyOnArrials () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(Arrials);
        Assert.assertTrue(Arrials.isDisplayed());

    }
    /*click On More Work **/
    public void clickOnMoreWork () throws InterruptedException {

        waitMethods.waitForElementToBeRefreshedAndClickable(MoreWork);
        WebElementActions.getActions(driver).clickElement(MoreWork);
    }
    /*click On VMRS **/
    public void clickOnVMRS () throws InterruptedException {

        waitMethods.waitForElementToBeRefreshedAndClickable(label_VMRS);
        WebElementActions.getActions(driver).clickElement(label_VMRS);
        waitMethods.loadingWait(loder);
    }
    /*click On Acessories Group **/
    public void  clickOnAcessoriesGroup () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(label_AccessoriesGroup);
        WebElementActions.getActions(driver).clickElement(label_AccessoriesGroup);

    }
    /*click on Plus Icon**/
    public void  clickOnPlusIcon () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(label_Add);
        WebElementActions.getActions(driver).clickElement(label_Add);
        waitMethods.loadingWait(loder);

    }
    /*click On Add button **/
    public void clickOnAddbutton () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(label_AddButton);
        WebElementActions.getActions(driver).clickElement(label_AddButton);
        waitMethods.loadingWait(loder);

    }
    /*click On Arodyanamic Device**/
    public void clickOnArodyanamicDevice () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(AerodynamicDevices);
        WebElementActions.getActions(driver).clickElement(AerodynamicDevices);
        waitMethods.loadingWait(loder);


    }
   /*click Automatic and Manual Chassis**/
    public void clickOnAutomaticAndManualChassis () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(AutomaticAndManualChassis);
        WebElementActions.getActions(driver).clickElement(AutomaticAndManualChassis);

    }
   /*click On Close_One **/
    public  void  clickOnCloseOne() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(img_CloseOne);
        WebElementActions.getActions(driver).clickElement(img_CloseOne);

    }
    /*click On close_Two**/
    public void clickOnCloseTwo () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(img_CloseTwo);
        WebElementActions.getActions(driver).clickElement(img_CloseTwo);

    }
    /*click On close_Three**/
    public void clickOnCloseThree () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(img_CloseThree);
        WebElementActions.getActions(driver).clickElement(img_CloseThree);
      //  Thread.sleep(3000);
        waitMethods.loadingWait(loder);

    }
  /*click On Delete **/
    public void clickOnDelete () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(img_Trash);
        WebElementActions.getActions(driver).clickElement(img_Trash);

    }
   /**click On Close*/
   public void clickOnClick2 () throws InterruptedException {
       waitMethods.waitForElementToBeRefreshedAndClickable(Close);
       WebElementActions.getActions(driver).clickElement(Close);
      // Close.sendKeys(Keys.ENTER);
       waitMethods.loadingWait(loder);

   }
    public void clickOnSignOut() throws InterruptedException {

        waitMethods.waitForElementToBeRefreshedAndIsVisible(btn_signOut);
        WebElementActions.getActions(driver).clickElement(btn_signOut);
        TestListener.saveScreenshotPNG(driver);

    }

    /**click on UserName*/
    public void clickOnUsername() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(inputbox_Username);
        WebElementActions.getActions(driver).clickElement(inputbox_Username);

    }



}
