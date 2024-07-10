package actions;


import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import tests.TestDriverActions;
import utils.WaitMethods;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Random;
import java.util.Set;


//import static tests.TestDriverActions.driver;




public class WebElementActions extends TestDriverActions {

    private static WebElementActions instanceElement;
    protected JavascriptExecutor js;
    String parentWindowHandle;
    String title;

    public WebDriver driver;
    public WaitMethods waitMethods;
    public WebElementActions(WebDriver driver){
        this.driver = driver;
        waitMethods = new WaitMethods(driver);
        this.js = (JavascriptExecutor) driver;
    }



    public static synchronized WebElementActions getActions(WebDriver driver) {
        if (instanceElement == null) {
            instanceElement = new WebElementActions(driver);
        }
        return instanceElement;
    }

    /**
     * Use this method to input text into text box, rich text box etc.
     *
     * @param element
     * @param text
     */
     public void inputText(WebElement element, String text) throws InterruptedException {
//        WaitActions.getWaits().WaitUntilWebElementIsVisible(element);
        Thread.sleep(2000);
        waitMethods.waitForElementToBeRefreshedAndIsVisible(element);
        Thread.sleep(2000);
        element.clear();
        Thread.sleep(2000);
        element.sendKeys(text);
    }



    /**
     * Use this method to click on any clickable element. i.e. button
     *
     * @param element
     */
     public void clickElement(WebElement element) throws InterruptedException {
        //WaitActions.getWaits().WaitUntilWebElementIsVisible(element);
        //       WaitActions.getWaits().waitForElementTobeClickable(element);
        waitMethods.waitForElementToBeRefreshedAndClickable(element);
        Thread.sleep(2000);
        element.click();
    }

    /**
     * Click on element using action class
     *
     * @param element
     */
     public void clickUsingActions(WebElement element) {
        Actions act = new Actions(driver);
        act.moveToElement(element).click().build().perform();
    }

    /**
     * move to horizontally using action class
     */
     public void moveOnTargetElement(WebElement element) throws InterruptedException {
        Thread.sleep(3000);
        Actions act = new Actions(driver);
        act.moveToElement(element).perform();
    }
    /**
     * Switch to child window from the parent
     */
/*    public void switchToChildWindow() {
        parentWindowHandle = driver.getWindowHandle();
        Set<String> allWindowHandles = driver.getWindowHandles();
        for (String i : allWindowHandles) {
            title = driver.switchTo().window(i).getTitle();
            System.out.println(title);
        }
    }  */

     public void switchToChildWindow() {
        parentWindowHandle = driver.getWindowHandle();
        Set<String> allWindowHandles = driver.getWindowHandles();
        for (String i : allWindowHandles) {
            driver.switchTo().window(i);
        }
    }

     public void switchBackToParentWindow() throws InterruptedException {
        driver.close();
        driver.switchTo().window(parentWindowHandle);
    }

     public void uploadFile(WebElement element, String path) throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(element);
        System.out.println("Path of file :"+System.getProperty("user.dir") + path);
        element.sendKeys(System.getProperty("user.dir") + path);
    }

     public void uploadFileUsingRobot(WebElement element,String path) throws AWTException {
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();",element);

        Robot rb = new Robot();
        rb.delay(2000);

        //put path to file in a clipboard
        StringSelection ss = new StringSelection(path);
        //        StringSelection ss = new StringSelection(System.getProperty("user.dir")+"\\ImportPriceOverrideTemplate-final.xlsx");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss,null);

        rb.keyPress(KeyEvent.VK_CONTROL);
        rb.keyPress(KeyEvent.VK_V);
        rb.delay(2000);

        rb.keyRelease(KeyEvent.VK_CONTROL);
        rb.keyRelease(KeyEvent.VK_V);
        rb.delay(2000);

        //Enter
        rb.keyPress(KeyEvent.VK_ENTER);
        rb.keyRelease(KeyEvent.VK_ENTER);

    }

     public void switchToIFrame() {
        driver.switchTo().frame(0);
    }

     public void switchBackToDefault() {
        driver.switchTo().defaultContent();
    }




    /**
     * Click on dropdown
     *
     * @return
     */
    public Select selectDropdown(WebElement element) {

        return new Select(element);
    }

    /**
     * select element from menu by using SelectByVisibilitytext
     */

     public void elementSelectByVisibilityText(WebElement element,String value) throws InterruptedException {
        Thread.sleep(5000);
        Select sec = new Select(element);
        sec.selectByVisibleText(value);
    }

    public void deselectElements(WebElement element,String value)
    {
        Select sec = new Select(element);
        sec.deselectByVisibleText(value);
    }
    public void closeAllWindow(List<String> hList,String parentWindowId)
    {

        for(String e : hList)
        {
            if(!e.equals(parentWindowId))
            {
                driver.switchTo().window(e).close();
            }
        }
    }

 /*   public static String readDataFromJsonFile(String fileName, String data) {
        JSONParser parser = new JSONParser();
        Object obj = null;
        try {
            obj = parser.parse(new FileReader(fileName));
        } catch (IOException e) {
            e.printStackTrace();
        } catch (org.json.simple.parser.ParseException e) {
            e.printStackTrace();
        }
        JSONObject jsonObject = (JSONObject) obj;
        return (String) jsonObject.get(data);
    }   */


    /**
     * Generate random Number
     * @param low
     * @param high
     * @return
     */
     public int randomNumber(int low, int high){
        Random r = new Random();
        int result = r.nextInt((high - low) + 1) + low;
        return result;
    }

    /**
     * Generate random alphanumeric string
     *
     */

    public String randomAlphaNumeric(int n){
        Random r1 = new Random();
        String alphaNum = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                + "0123456789"
                + "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder sb = new StringBuilder(n);
        for(int i=0;i<n;i++)
        {
            int index = (int)(alphaNum.length()*Math.random());
            sb.append(alphaNum.charAt(index));
            //   sb.append(alphaNum.length()*Math.random());
        }
        return sb.toString();

    }




}

