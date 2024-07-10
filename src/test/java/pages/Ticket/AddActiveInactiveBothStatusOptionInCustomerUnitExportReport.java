 package pages.Ticket;

import actions.ReusableActions;
import actions.WaitActions;
import actions.WebElementActions;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.Assert;
import tests.TestDriverActions;
import utils.TestListener;
import utils.WaitMethods;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.List;



public class AddActiveInactiveBothStatusOptionInCustomerUnitExportReport extends TestDriverActions {

   @FindBy(xpath = "//span[text()='Fleet']")
   WebElement fleet;
   @FindBy(xpath = "//span[text()='Customer Units Export']")
   WebElement customerUnitsExport;
   @FindBy(xpath = "//label[text()='Customer Status:']")
   WebElement customerStatus;
   @FindBy(xpath = "//label[text()='Customer Status:']/following::label[1]")
   WebElement custom_active;
   @FindBy(xpath = "//label[text()='Customer Status:']/following::input[1]")
   WebElement custom_radio_active;
   @FindBy(xpath = "//label[text()='Customer Status:']/following::input[2]")
   WebElement custom_radio_Inactive;
   @FindBy(xpath = "//label[text()='Customer Status:']/following::label[2]")
   WebElement custom_Inactive;
   @FindBy(xpath = "//label[text()='Customer Status:']/following::label[3]")
   WebElement custom_both;
   @FindBy(xpath = "//label[text()='Customer Status:']/following::input[3]")
   WebElement custom_radio_both;
   @FindBy(xpath = "//span[text()='Run Report']")
   WebElement btn_runReport;
   @FindBy(xpath = "(//a[text()='Report History'])[1]")
   WebElement reportHistory_btn;
   @FindBy(xpath = "//div[@class='toast-item-text']")
   List<WebElement> queue;
   @FindBy(xpath = "//span[contains(text(),'Refresh')]")
   WebElement refresh_btn;
   @FindBy(xpath = "(//a[contains(text(),'View')])[4]")
   WebElement view;
   @FindBy(xpath = "//h1[text()='Working...Please Wait']")
   List<WebElement> loder;
   @FindBy(xpath = "//label[text()='Equipment Status:']/following::input[1]")
   WebElement equipment_radio_active;
   @FindBy(xpath = "//label[text()='Equipment Status:']/following::input[2]")
   WebElement equipment_inactive_radio;
   @FindBy(xpath ="//label[text()='Equipment Status:']/following::label[1]")
   WebElement equipment_active;
   @FindBy(xpath ="//label[text()='Equipment Status:']/following::label[2]")
   WebElement equipment_inactive;
   @FindBy(xpath ="//label[text()='Equipment Status:']/following::label[3]")
   WebElement equipment_both;
   @FindBy(xpath = "//label[text()='Equipment Status:']")
   WebElement equipmentStatus;
   @FindBy(xpath = "//label[text()='Equipment Status:']/following::input[3]")
   WebElement equipment_radio_both;
   @FindBy(xpath = "(//a[contains(@id,'sdi2::disAcrBlw')])[1]")
   WebElement report;
   @FindBy(xpath = "//label[text()='Billing Type:']/following::select[1]")
   WebElement bilingType;
   @FindBy(xpath = "//label[text()='Equipment Type:']/following::select[1]")
   WebElement equipmentType;
   @FindBy(xpath = "//label[text()='Sub Type:']/following::select[1]")
   WebElement subType;
   @FindBy(xpath = "//label[text()='Equipment Class:']/following::select[1]")
   WebElement equipmentClass;
   @FindBy(xpath = "//label[text()='Equipment Program:']/following::select[1]")
   WebElement equipmentProgram;
   @FindBy(xpath = "//label[text()='PM Schedule Group:']/following::select[1]")
   WebElement pmScheduleGroup;
   @FindBy(xpath = "//label[text()='Warranty Group:']/following::select[1]")
   WebElement warrentyGroup;

   //@FindBy(xpath = "//a[text()='Sign Out']")
   @FindBy(xpath = "(//span[contains(@id,'si1')]/following::td)[4]")
   WebElement btn_signOut;

   @FindBy(xpath = "//input[@name='username']")
   public WebElement inputbox_Username;

   public AddActiveInactiveBothStatusOptionInCustomerUnitExportReport(WebDriver driver){
       this.driver = driver;
       this.waitMethods = new WaitMethods(driver);
   }

   /*
         go to report screen
    */
   public void gotoReports() throws FileNotFoundException, InterruptedException {
       ReusableActions.getActions(driver).clickParentMenu("Reports");
   }

   /**
    * click on fleet
    */
      public void clickonFleet() throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndClickable(fleet);
          WebElementActions.getActions(driver).clickElement(fleet);

          waitMethods.loadingWait(loder);
          TestListener.saveScreenshotPNG(driver);
    }
    /**
     * click on customer units export
     */
      public void customerUnitsExport() throws InterruptedException {
 //       Thread.sleep(3000);
          waitMethods.waitForElementToBeRefreshedAndClickable(customerUnitsExport);
          WebElementActions.getActions(driver).clickElement(customerUnitsExport);

          waitMethods.loadingWait(loder);
          TestListener.saveScreenshotPNG(driver);
    }
    /**
     * verify customer status
     */
      public void verifyCustomerStatus() throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndIsVisible(customerStatus);
        Assert.assertTrue(customerStatus.isDisplayed());
        Assert.assertTrue(custom_active.isDisplayed());
        Assert.assertTrue(custom_radio_active.isDisplayed());
        Assert.assertTrue(custom_radio_Inactive.isDisplayed());
        Assert.assertTrue(custom_Inactive.isDisplayed());
        Assert.assertTrue(custom_both.isDisplayed());
        Assert.assertTrue(custom_radio_both.isDisplayed());
    }
    /**
     * verify Equipment status
     */
      public void verifyEquipmentStatus() throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndIsVisible(equipmentStatus);
        Assert.assertTrue(equipmentStatus.isDisplayed());
        Assert.assertTrue(equipment_radio_active.isDisplayed());
        Assert.assertTrue(equipment_active.isDisplayed());
        Assert.assertTrue(equipment_inactive_radio.isDisplayed());
        Assert.assertTrue(equipment_inactive.isDisplayed());
        Assert.assertTrue(equipment_radio_both.isDisplayed());
        Assert.assertTrue(equipment_both.isDisplayed());
    }
    /**
     * Select Biling Type
     */
      public void selectBilingType() throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndClickable(bilingType);
          WebElementActions.getActions(driver).elementSelectByVisibilityText(bilingType,"1 tractor");

          waitMethods.loadingWait(loder);
          TestListener.saveScreenshotPNG(driver);
    }
    /**
     * Select Equipment Type
     */
      public void selectEquipmentType() throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndClickable(equipmentType);
          WebElementActions.getActions(driver).elementSelectByVisibilityText(equipmentType,"30FT");

          waitMethods.loadingWait(loder);
          TestListener.saveScreenshotPNG(driver);
    }
    /**
     * Select subType
     */
      public void selectsubType() throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndClickable(subType);
          WebElementActions.getActions(driver).elementSelectByVisibilityText(subType,"MCLASS");

          waitMethods.loadingWait(loder);
          TestListener.saveScreenshotPNG(driver);
    }
    /**
     * Select equipment Class
     */
      public void selectEquipmentClass() throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndClickable(equipmentClass);
          WebElementActions.getActions(driver).elementSelectByVisibilityText(equipmentClass,"HEAVYEQP - HEAVY EQP");

          waitMethods.loadingWait(loder);
          TestListener.saveScreenshotPNG(driver);
    }
    /**
     * Select equipment Program
     */
      public void selectEquipmentProgram() throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndClickable(equipmentProgram);
          WebElementActions.getActions(driver).elementSelectByVisibilityText(equipmentProgram,"BOATS - Boats");

          waitMethods.loadingWait(loder);
          TestListener.saveScreenshotPNG(driver);
    }
    /**
     * Select pmSchedule Group
     */
      public void selectPmScheduleGroup() throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndClickable(pmScheduleGroup);
          WebElementActions.getActions(driver).elementSelectByVisibilityText(pmScheduleGroup,"4569 - 4569");

          waitMethods.loadingWait(loder);
          TestListener.saveScreenshotPNG(driver);
    }
    /**
     * Select warrenty Group
     */
      public void selectWarrentyGroup() throws InterruptedException {
          waitMethods.waitForElementToBeRefreshedAndClickable(warrentyGroup);
          WebElementActions.getActions(driver).elementSelectByVisibilityText(warrentyGroup,"2020 - 2020 Warranty Test");

          waitMethods.loadingWait(loder);
          TestListener.saveScreenshotPNG(driver);
    }

    /**
     * click customer status active button
     */
      public void clickOnActive() throws InterruptedException {
  //      Thread.sleep(5000);
          waitMethods.waitForElementToBeRefreshedAndClickable(custom_radio_active);
          WebElementActions.getActions(driver).clickElement(custom_radio_active);

          waitMethods.loadingWait(loder);
          TestListener.saveScreenshotPNG(driver);
    }
    /**
     * click customer status Inactive button
     */
      public void clickOnInactive() throws InterruptedException {
  //      Thread.sleep(8000);
          waitMethods.waitForElementToBeRefreshedAndClickable(custom_radio_Inactive);
          WebElementActions.getActions(driver).clickElement(custom_radio_Inactive);

          waitMethods.loadingWait(loder);
          TestListener.saveScreenshotPNG(driver);
    }
    /**
     * click customer status both button
     */
      public void clickOnBoth() throws InterruptedException {
 //       Thread.sleep(8000);
          waitMethods.waitForElementToBeRefreshedAndClickable(custom_radio_both);
          WebElementActions.getActions(driver).clickElement(custom_radio_both);

          waitMethods.loadingWait(loder);
          TestListener.saveScreenshotPNG(driver);
    }
    /**
     * click on  Estimate status active radio button
     */
      public void clickEstimateStatusActiveRadioButton() throws InterruptedException {
  //      Thread.sleep(5000);
          waitMethods.waitForElementToBeRefreshedAndClickable(equipment_radio_active);
          WebElementActions.getActions(driver).clickElement(equipment_radio_active);

          waitMethods.loadingWait(loder);
          TestListener.saveScreenshotPNG(driver);
    }
    /**
     * click on Estimate status Inactive radio button
     */
      public void clickEstimateStatusInactiveRadio() throws InterruptedException {
 //       Thread.sleep(5000);
          waitMethods.waitForElementToBeRefreshedAndClickable(equipment_inactive_radio);
          WebElementActions.getActions(driver).clickElement(equipment_inactive_radio);

          waitMethods.loadingWait(loder);
          TestListener.saveScreenshotPNG(driver);
    }
    /**
     * click on click on Estimate status both radio button
     */
      public void clickEstimateStatusRadioBoth() throws InterruptedException {
 //       Thread.sleep(5000);
          waitMethods.waitForElementToBeRefreshedAndClickable(equipment_radio_both);
          WebElementActions.getActions(driver).clickElement(equipment_radio_both);

          waitMethods.loadingWait(loder);
          TestListener.saveScreenshotPNG(driver);
    }

    /**
     * click on Run Report
     */
      public void clickOnRunReport() throws InterruptedException {
 //       Thread.sleep(8000);
          waitMethods.waitForElementToBeRefreshedAndClickable(btn_runReport);
        WebElementActions.getActions(driver).clickElement(btn_runReport);

//        Thread.sleep(10000);
//        ReusableActions.deleteDownloadedFile();

          waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);

        int count = 0;
        while (count < 20) {
            //                  System.out.println("Size of queue is :"+queue.size());
            Thread.sleep(1000);
            count++;
            if (queue.size() > 0) {

                waitMethods.waitForElementToBeRefreshedAndClickable(reportHistory_btn);
                WebElementActions.getActions(driver).clickElement(reportHistory_btn);

                for (int i = 0; i < 27; i++) {
                    //                    System.out.println("Iteration :"+i);

                    try {
                        // Use FluentWait to define custom conditions and polling intervals
                        new FluentWait<>(driver)
                                .withTimeout(Duration.ofSeconds(120))
                                .pollingEvery(Duration.ofSeconds(30))
                                .ignoring(Exception.class)
                                .until(drv -> refresh_btn.isEnabled());
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                    if (refresh_btn.isEnabled()) {
                        //           System.out.println("Button is ENABLED in iteration " + i);
                        waitMethods.waitForElementToBeRefreshedAndClickable(refresh_btn);
                        WebElementActions.getActions(driver).clickElement(refresh_btn);
                    } else {
                        System.out.println("Button is DISABLED in iteration " + i);
                    }

                }

                waitMethods.waitForElementToBeRefreshedAndClickable(view);
                WebElementActions.getActions(driver).clickElement(view);

                TestListener.saveScreenshotPNG(driver);

                break;

            }
            Thread.sleep(5000);
     //       if (view.isEnabled()) {
                waitMethods.waitForElementToBeRefreshedAndClickable(report);
                WebElementActions.getActions(driver).clickElement(report);

                waitMethods.loadingWait(loder);
                TestListener.saveScreenshotPNG(driver);
          //  }
        }
    }
    /**
     * click on report
     */
        public void clickOnReport() throws InterruptedException {
            waitMethods.waitForElementToBeRefreshedAndClickable(report);
            WebElementActions.getActions(driver).clickElement(report);

            waitMethods.loadingWait(loder);
            TestListener.saveScreenshotPNG(driver);
      }
    /**
     * excel read
     */
      public void readExcel() throws InterruptedException, IOException {
//        Thread.sleep(5000);
//        ReusableActions.deleteDownloadedFile();

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
         //                  System.out.print(cell.toString() + "\t");
     //           if (row != null) {
//                    System.out.println(sheet.getRow(3).getCell(1).getStringCellValue() + ", ");
//                    System.out.println(sheet.getRow(15).getCell(1).getStringCellValue() + ", ");
                String thirdRow = sheet.getRow(3).getCell(1).getStringCellValue() + ", ";
                System.out.println(thirdRow);
                String sixtheenRow = sheet.getRow(15).getCell(1).getStringCellValue() + ", ";
                System.out.println(sixtheenRow);
                     break;
                }
                break;
            }
            System.out.println(); //move to next row
     //       break;
     //   }
        fis.close();
       Thread.sleep(10000);
        ReusableActions.deleteDownloadedFile();

        TestListener.saveScreenshotPNG(driver);


    }
    /**
     * check the value
     */
        public void verifyStatus(){

          if(custom_radio_active.getText().equals("thirdRow"))
          {
              Assert.assertTrue(custom_radio_active.isDisplayed());
          }
          else if(custom_radio_Inactive.getText().equals("sixtheenRow"))
          {
              Assert.assertTrue(custom_radio_Inactive.isDisplayed());
          }
          else if(custom_both.getText().equals("thirdRow"))
          {
              Assert.assertTrue(custom_both.isDisplayed());
          }
          else if(equipment_active.getText().equals("sixtheenRow"))
          {
              Assert.assertTrue(equipment_active.isDisplayed());
          }
          else if(equipment_inactive.getText().equals("thirdRow"))
          {
              Assert.assertTrue(equipment_inactive.isDisplayed());
          }
          else if(equipment_both.getText().equals("sixtheenRow"))
          {
              Assert.assertTrue(equipment_both.isDisplayed());
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
