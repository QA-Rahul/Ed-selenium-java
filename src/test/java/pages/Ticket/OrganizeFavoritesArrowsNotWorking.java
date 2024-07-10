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

public class OrganizeFavoritesArrowsNotWorking extends TestDriverActions {


    @FindBy(xpath = "//a[contains(text(),'Favorites')]/parent::td/following-sibling::td/child::div")
    WebElement Favorites;
    @FindBy(xpath = "//td[contains(text(),' on sign in')]")
    WebElement signIn;
    @FindBy(xpath = "(//td[contains(text(),'Favorites')])[2]")
    WebElement OrganizeFavorites;
    @FindBy(xpath = "(//a[contains(text(),'Sign In')])[1]")
    WebElement Signin;
    @FindBy(xpath = "(//a[contains(text(),'Favorites')])[2]")
    WebElement Favorite;
    @FindBy(xpath = "(//a[contains(text(),'Sign In')])[1]")
    WebElement SignIn;
    @FindBy(xpath = "//span[text()='Order']")
    WebElement Order;
    @FindBy(xpath = "//span[text()='Screens']")
    WebElement Screens;
    @FindBy(xpath = "//span[text()='Move']")
    WebElement Move;
    @FindBy(xpath = "//span[text()='Move']/parent::div/parent::th/following::div/following::tr/following::div/table/tbody/tr[2]/td[3]/child::span/a/img")
    WebElement UpArrow;
    @FindBy(xpath = "//span[text()='Move']/parent::div/parent::th/following::div/following::tr/following::div/table/tbody/tr[1]/td[4]/child::span/a/img")
    WebElement DownArrow;
    @FindBy(xpath = "//span[text()='Move']/parent::div/parent::th/following::div/following::tr/following::div/table/tbody/tr[2]/td[5]/child::span/a/img")
    WebElement closeone;
    @FindBy(xpath = "//span[text()='Move']/parent::div/parent::th/following::div/following::tr/following::div/table/tbody/tr[1]/td[5]/child::span/a/img")
    WebElement CloseTwo;
    @FindBy(xpath = "(//a[contains(.,'OK')])[1]")
    WebElement OKButton;
    @FindBy(xpath = "//h1[contains(.,'Working...Please Wait')]")
    List<WebElement> loder;
    @FindBy(xpath = "//a[contains(.,'Sign Out')]")
    WebElement btn_signOut;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement inputbox_Username;
    @FindBy(xpath = "//a[text()='Parts']")
    WebElement Parts;
    @FindBy(xpath = "//td[text()='Part Master']")
    WebElement PartMaster;
    @FindBy(xpath = "//a[text()='Perfit']")
    WebElement Perfit;
    @FindBy(xpath = "//td[text()='License Admin']")
    WebElement LicenseAdmin;


    public OrganizeFavoritesArrowsNotWorking(WebDriver driver){
        this.driver = driver;
        this.waitMethods = new WaitMethods(driver);
    }

    /**
     * go to Part Master
     */
    public void gotoPartMaster() throws FileNotFoundException, InterruptedException {

        waitMethods.waitForElementToBeRefreshedAndClickable(Parts);
        WebElementActions.getActions(driver).clickElement(Parts);

        waitMethods.waitForElementToBeRefreshedAndClickable(PartMaster);
        WebElementActions.getActions(driver).clickElement(PartMaster);

        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * click on Favorites
     */
    public void clickonFavorite() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(Favorites);
        WebElementActions.getActions(driver).clickElement(Favorites);

        waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }

    /**
     * click on Show License Admin on sign in
     */
    public void clickonSignIn() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(signIn);
        WebElementActions.getActions(driver).clickElement(signIn);

        waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }

    /**
     * go to Part Master
     */
    public void gotoLicenseAdmin() throws FileNotFoundException, InterruptedException {
//        ReusableActions.getActions().clickParentMenu("Perfit");
//        ReusableActions.getActions().clickChildMenu("License Admin");

        waitMethods.waitForElementToBeRefreshedAndClickable(Perfit);
        WebElementActions.getActions(driver).clickElement(Perfit);

        waitMethods.waitForElementToBeRefreshedAndClickable(LicenseAdmin);
        WebElementActions.getActions(driver).clickElement(LicenseAdmin);

        TestListener.saveScreenshotPNG(driver);
    }

    /**
     * click on Organize Favorites
     */
    public void clickonOranizeFaovrites() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(OrganizeFavorites);
        WebElementActions.getActions(driver).clickElement(OrganizeFavorites);

        waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }



      /*click on Sign in **/
      public void clickonSignIn2 () throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndClickable(Signin);
          WebElementActions.getActions(driver).clickElement(Signin);
          waitMethods.loadingWait(loder);

      }
    /**
     * verify Feavorite and sign in
     */
    public void verifyfeavorite() throws InterruptedException {

        waitMethods.waitForElementToBeRefreshedAndIsVisible(Favorite);
        Assert.assertTrue(Favorite.isDisplayed());

        waitMethods.waitForElementToBeRefreshedAndIsVisible(SignIn);
        Assert.assertTrue(SignIn.isDisplayed());
    }

    /**
     * verify Order ,seens ,Move
     */
    public void verifyOrder() throws InterruptedException {

        waitMethods.waitForElementToBeRefreshedAndIsVisible(Order);
        Assert.assertTrue(Order.isDisplayed());

        waitMethods.waitForElementToBeRefreshedAndIsVisible(Screens);
        Assert.assertTrue(Screens.isDisplayed());

        waitMethods.waitForElementToBeRefreshedAndIsVisible(Move);
        Assert.assertTrue(Move.isDisplayed());

    }

    /**
     * click on  up Arrow
     */
    public void clickonUpArrow() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(UpArrow);
        WebElementActions.getActions(driver).clickElement(UpArrow);

        waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);

    }

    /**
     * click on Down Arrow
     */
    public void clickOnDownArrow() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(DownArrow);
        WebElementActions.getActions(driver).clickElement(DownArrow);

        waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }

    /*click on Feavorite**/
    public void clickOnFeavorite () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(Favorite);
        WebElementActions.getActions(driver).clickElement(Favorite);
        waitMethods.loadingWait(loder);
    }

        /**click on Cancel Button */
        public void clickOnCacelButton () throws InterruptedException {
            waitMethods.waitForElementToBeRefreshedAndClickable(closeone);
            WebElementActions.getActions(driver).clickElement(closeone);

            waitMethods.waitForElementToBeRefreshedAndClickable(CloseTwo);
            WebElementActions.getActions(driver).clickElement(CloseTwo);

            waitMethods.loadingWait(loder);
            TestListener.saveScreenshotPNG(driver);
        }
        /**click on Ok Button */
        public void clickonOkButton () throws InterruptedException {
            waitMethods.waitForElementToBeRefreshedAndClickable(OKButton);
            WebElementActions.getActions(driver).clickElement(OKButton);

            waitMethods.loadingWait(loder);
            TestListener.saveScreenshotPNG(driver);

        }
        /**click on Sign out */
        public void clickonSignOut () throws InterruptedException {

            waitMethods.waitForElementToBeRefreshedAndClickable(btn_signOut);
            WebElementActions.getActions(driver).clickElement(btn_signOut);
        }
        /**click on UserName */
        public void clickonUsername  () throws InterruptedException {
            waitMethods.waitForElementToBeRefreshedAndClickable(inputbox_Username);
            WebElementActions.getActions(driver).clickElement(inputbox_Username);
        }

}