package actions;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import tests.TestDriverActions;
import utils.TestListener;
import utils.WaitMethods;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;

public class ReusableActions extends TestDriverActions {

    private static ReusableActions reusableActions;

    private WebDriver driver;
    public ReusableActions(WebDriver driver){
        this.driver = driver;
        this.waitMethods = new WaitMethods(driver);
//        this.webElementActions = new WebElementActions(driver);
    }

    public static synchronized ReusableActions getActions(WebDriver driver) throws FileNotFoundException {
        if (reusableActions == null) {
            reusableActions = new ReusableActions(driver);
        }
        return reusableActions;
    }


    @FindBy(xpath = "//h1[text()='Working...Please Wait']")
    List<WebElement> loder;


    public void clickParentMenu(String menuText) throws InterruptedException {

        waitMethods.waitForElementToBeRefreshedAndClickable(driver.findElement(By.xpath("//table[@class='af_menuBar_items']//table//td//a[text()='"+menuText+"']")));
        WebElement element = driver.findElement(By.xpath("//table[@class='af_menuBar_items']//table//td//a[text()='"+menuText+"']"));
        waitMethods.waitForElementToBeRefreshedAndClickable(element);
        element.click();
        Thread.sleep(1000);
    }

    public void clickChildMenu(String childMenuText) throws InterruptedException {

        WebElement element = driver.findElement(By.xpath("//div[@class='AFPopupMenuContent']//td[text()='"+childMenuText+"']"));
        waitMethods.waitForElementToBeRefreshedAndClickable(element);
        element.click();
        Thread.sleep(5000);

    }




    public static String todaysdate()
    {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        System.setProperty("current.date.time",dateFormat.format(new Date()));
        return dateFormat.format(new Date());
    }



    public static void deleteDownloadedFile() throws InterruptedException {
        int i;
        File dir = new File(System.getProperty("user.dir") + "\\downloadFiles");
        File[] dirContents = dir.listFiles();
        if (dirContents.length > 0) {
            for (i = 0; i < dirContents.length; i++) {
                System.out.println("File name" + dirContents[i].getName());
                dirContents[i].delete();
            }
        }
    }

    public void readExcel() throws InterruptedException, IOException {

        Thread.sleep(10000);
        File dir = new File(System.getProperty("user.dir") + "\\downloadFiles");
        File[] dirContents = dir.listFiles();
        String fileName = dirContents[0].getName();
        String url = System.getProperty("user.dir") + "\\downloadFiles\\" + fileName;
        File file = new File(url);
        FileInputStream fis = new FileInputStream(file);
        Workbook workbook = new HSSFWorkbook(fis);
        Sheet sheet = workbook.getSheetAt(0);
        //Iterate through rows and columns to read data
        for (Row row : sheet) {
            for (Cell cell : row) {
                System.out.print(cell.toString() + "\t");

            }
            System.out.println();  //move to next row
        }
        fis.close();
        Thread.sleep(10000);
        ReusableActions.deleteDownloadedFile();

        TestListener.saveScreenshotPNG(driver);

    }


}
