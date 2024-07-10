package utils;

//import actions.WebElementActions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import tests.TestDriverActions;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;

public class WaitMethods extends TestDriverActions {

    public WebDriver driver;

    protected JavascriptExecutor js;


    public WaitMethods(WebDriver driver){
        this.driver = driver;
        this.js = (JavascriptExecutor) driver;
//        this.webElementActions = new WebElementActions(driver);
//        PageFactory.initElements(driver,this);

    }


    /**
     * wait for element to be refresh and clickable
     * @param element
     */
    //   public static void waitForElementToBeRefreshedAndClickable(WebElement element) throws InterruptedException {
    public void waitForElementToBeRefreshedAndClickable(WebElement element) throws InterruptedException {
        try {
            Thread.sleep(3000);
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(80));  //80
            wait.until(ExpectedConditions.refreshed(ExpectedConditions.elementToBeClickable(element)));
            Thread.sleep(3000);
        }
        catch(Throwable e)
        {
            e.printStackTrace();
        }

    }

    /**
     * wait for element to be refresh and visible
     * @param element
     */

//    public static void waitForElementToBeRefreshedAndIsVisible(WebElement element) throws InterruptedException {
    public void waitForElementToBeRefreshedAndIsVisible(WebElement element) throws InterruptedException {
        try {
            Thread.sleep(3000);
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(80));
            wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(element)));
            Thread.sleep(3000);
        }
        catch(Throwable e)
        {
            e.printStackTrace();
        }

    }

    /**
     * Wait for loader with list web element
     *
     * @param element
     */
    public void loadingWait(List<WebElement> element) throws InterruptedException {
        int visibleCount = 0;
        while (element.size() == 0 && visibleCount < 2) {
            Thread.sleep(1000);
            visibleCount++;
        }
        if (element.size() > 0) {
            System.out.println("Loader is found by xpath : " + element);
            int invisibleCount = 0;
            while (element.size() != 0 && invisibleCount < 60) {   //60
                System.out.println("Entered in while loop");
                Thread.sleep(1000);
                invisibleCount++;
            }
        } else {
            System.out.println("Loader is not visible");
        }
    }

    public static String returnCurrentTime()
    {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd HH:mm:ss");
        System.setProperty("current.date.time",dateFormat.format(new Date()));
        return dateFormat.format(new Date());
    }

    public String getRandom(int len) {
        StringBuilder sb = new StringBuilder();
        String character = "1234567890";
        for (int i = 0; i < len; i++) {
            int index = (int) (Math.random() * character.length());
            sb.append(character.charAt(index));
        }
        return sb.toString();
    }

    /**
     * Scroll to the top of the page
     */
    public void scrollToTop() {
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(document.body.scrollHeight, 0)");
    }

    /**
     * Scroll to the end of the page
     */
    public void scrollToEnd() {
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0,document.body.scrollHeight)");
    }

    public void clickUsingJS(WebElement element) throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(element);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", element);

    }

    /**
     * Scroll till the top of the element
     * @param element
     **/
    public void scrollElementTillView(WebElement element) throws InterruptedException {
        PageFactory.initElements(driver, this);
        waitForElementToBeRefreshedAndIsVisible(element);
        js.executeScript("arguments[0].scrollIntoView();", element);
    }




}
