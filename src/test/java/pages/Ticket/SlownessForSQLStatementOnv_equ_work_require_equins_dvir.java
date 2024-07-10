package pages.Ticket;

import actions.WebElementActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import tests.TestDriverActions;
import utils.TestListener;
import utils.WaitMethods;

public class SlownessForSQLStatementOnv_equ_work_require_equins_dvir extends TestDriverActions {

    @FindBy(xpath = "//a[text()='Perfit']")
    WebElement menu_Perfit;
    @FindBy(xpath = "//td[text()='Security Setup']")
    WebElement submenu_SecuritySetup;
    @FindBy(xpath = "(//a[text()='Maintain Software'])[1]")
    WebElement tab_MaintainSoftware;
    @FindBy(xpath = "(//a[text()='Maintain Modules'])[1]")
    WebElement tab_MaintainModules;
    @FindBy(xpath = "(//a[text()='Maintain Users'])[1]")
    WebElement tab_MaintainUsers;
    @FindBy(xpath = "(//a[text()='Maintain External Systems'])[1]")
    WebElement tab_MaintainExternalSystems;
    @FindBy(xpath = "(//a[text()='Global System Parameters'])[1]")
    WebElement tab_GlobalSystemParameters;
    @FindBy(xpath = "(//a[text()='Forms Functions Mapped to Kona Security Group'])[1]")
    WebElement tab_FormsFunctionsMapped;
    @FindBy(xpath = "//h1[text()='System Parameters']")
    WebElement title_SystemParameters;
    @FindBy(xpath = "//span[text()='Add System Parameter']")
    WebElement tab_AddSystemParameter;
    @FindBy(xpath = "//table[contains(@id,'sq2:dc_it1')]/descendant::label")
    WebElement txt_Search;
    @FindBy(xpath = "//input[contains(@id,'sq2:dc_it1::content')]")
    WebElement txtbox_search;
 /*   @FindBy(xpath = "")
    WebElement ;
    @FindBy(xpath = "")
    WebElement ;
    @FindBy(xpath = "")
    WebElement ;
    @FindBy(xpath = "")
    WebElement ;
    @FindBy(xpath = "")
    WebElement ;
    @FindBy(xpath = "")
    WebElement ;
    @FindBy(xpath = "")
    WebElement ;*/




    public SlownessForSQLStatementOnv_equ_work_require_equins_dvir(WebDriver driver){
        this.driver = driver;
        this.waitMethods = new WaitMethods(driver);
    }

    /*
        go to Security setup Screen
     */
    public void gotoSecuritySetupScreen() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(menu_Perfit);
        WebElementActions.getActions(driver).clickElement(menu_Perfit);

        waitMethods.waitForElementToBeRefreshedAndClickable(submenu_SecuritySetup);
        WebElementActions.getActions(driver).clickElement(submenu_SecuritySetup);

        TestListener.saveScreenshotPNG(driver);
    }
    /*
       verify sub tabs of security setup
     */
     public void verifySubTabsSecuritySetup() throws InterruptedException {
         waitMethods.waitForElementToBeRefreshedAndIsVisible(tab_MaintainSoftware);
         Assert.assertTrue(tab_MaintainSoftware.isDisplayed());
         Assert.assertTrue(tab_MaintainModules.isDisplayed());
         Assert.assertTrue(tab_MaintainUsers.isDisplayed());
         Assert.assertTrue(tab_MaintainExternalSystems.isDisplayed());
         Assert.assertTrue(tab_GlobalSystemParameters.isDisplayed());
         Assert.assertTrue(tab_FormsFunctionsMapped.isDisplayed());
     }
     /*
         click on tab Global System Parameters
      */
      public void clickOnGlobalSystemParameters() throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndClickable(tab_GlobalSystemParameters);
          WebElementActions.getActions(driver).clickElement(tab_GlobalSystemParameters);

          TestListener.saveScreenshotPNG(driver);
      }
      /*
          verify title System Parameters
       */
       public void verifyTitleSystemParameters() throws InterruptedException {
           waitMethods.waitForElementToBeRefreshedAndIsVisible(title_SystemParameters);
           Assert.assertTrue(title_SystemParameters.isDisplayed());
       }
       /*
            verify tab Add System Parameter
        */
       public void verifyTabAddSystemParameters() throws InterruptedException {
           waitMethods.waitForElementToBeRefreshedAndIsVisible(tab_AddSystemParameter);
           Assert.assertTrue(tab_AddSystemParameter.isDisplayed());
       }
       /*
             verify Search
        */
       public void verifySearch() throws InterruptedException {
           waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_Search);
           Assert.assertTrue(txt_Search.isDisplayed());
           Assert.assertTrue(txtbox_search.isDisplayed());
       }

}