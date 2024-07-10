 package pages.parts;

import actions.LoginActions;
import actions.ReusableActions;
import actions.WaitActions;
import actions.WebElementActions;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import tests.TestDriverActions;
import utils.TestListener;
import utils.WaitMethods;

import java.io.FileNotFoundException;
import java.util.List;

public class AddaFabricatedPartToaClosedWorkorder extends TestDriverActions {


    @FindBy(xpath = "//a[contains(.,'New RO')]")
    WebElement NewRo;

    @FindBy(xpath = "//label[text()='Search Unit:']/parent::span/child::input")
    WebElement SerachUnit;

    @FindBy(xpath = "//a[contains(.,'Select')]")
    WebElement Select;

    @FindBy(xpath = "(//span[contains(.,'Add Lab')])[1]")
    public  WebElement label_AddLabor;

    @FindBy(xpath = "(//a[text()='VMRS'])[1]")
    public  WebElement label_VMRS;

    @FindBy(xpath = "//img[@title='Accessories Group']")
    public WebElement label_AccessoriesGroup;

    @FindBy(xpath = "(//td[contains(.,'Search:')]/following-sibling::td/child::input)[1]")
    WebElement SearchTextArea1;

    @FindBy(xpath = "//a[contains(@id,':cilvmrsys')]/img")
    WebElement Clutch;

    @FindBy(xpath = "(//img[contains(@id,':ciAddVmrs::icon')])[1]")
    public WebElement label_Add;

    @FindBy(xpath = "//span[text()='Add']")
    public WebElement label_AddButton;

    @FindBy(xpath = "//div[contains(@id,':0:pgltWAIDX')]//div")
   WebElement SrNo;

    @FindBy(xpath = "//span[contains(text(),'Accessories Group')]/parent::a/following::a[4]/child::img")
    public List <WebElement> img_CrossIcon1;

    @FindBy(xpath = "//span[contains(text(),'Add Lab')]/following::img[1]")
    public WebElement label_Delete3;


    @FindBy(xpath = "(//div[contains(@id,':tParts::db')]//table//div//a/child::span[contains(@id,'::text')])[1]")
    public WebElement label_PartsSrNo;

    @FindBy(xpath = "//span[text()='Add Parts']")
    public WebElement label_AddPart;

    @FindBy(xpath = "//img[contains(@id,':tWa:0:vmrImage')]")
    public WebElement label_Img;

    @FindBy(xpath = "//input[contains(@id,':itSearchPartSelect::content')]")
    public WebElement txt_PartTextArea;

    @FindBy(xpath = "//table[contains(@id,':0:itSearchPartSelect')]")
    public WebElement label_PartNumber;

    @FindBy(xpath = "//span[text()='Issue Part']")
    public WebElement btn_IssuePartBtn;


    @FindBy(xpath = "//div[contains(@id,':ocb1:ctbClose')]//child::a/span[text()='Close']")
    public WebElement btn_Close;

    @FindBy(linkText = "Close RO")
    WebElement closeRO;

    @FindBy(xpath = "//label[contains(.,'Invoiced')]/preceding-sibling::input")
    WebElement Invoiced;

    @FindBy(xpath = "//input[contains(@id,':itSearch::content')]")
    WebElement SearchTextArea;

    @FindBy(xpath = "//a[contains(.,'Refresh')]")
    WebElement Refresh;


    @FindBy(xpath = "(//a[contains(text(),'O0')])[1]")
    WebElement label_ReferenceNumber;

    @FindBy(xpath = "//a[contains(.,'Delete Customer Invoice')]")
    WebElement invoiceDelete;

    @FindBy(xpath = "//span[contains(text(),'This transaction has been journalized in GL000119.')]")
    WebElement ThisTransation;

    @FindBy(xpath = "(//a[contains(.,'Close')])[2]")
    WebElement Close;

    @FindBy(xpath = "//a[contains(.,'Back to Complete RO')]/child::span")
    WebElement BacktocompleteRO;

    @FindBy(xpath = "(//a[contains(text(),'O0')])[2]")
    WebElement label_ReferenceNumber1;


    @FindBy(xpath = "//textarea[contains(@id,':itINotes::content')]")
    WebElement DeleteCustomerivoice;

    @FindBy(xpath = "(//a[contains(.,'Delete Customer Invoice')])[2]")
    WebElement DeleteCustomerinvoiceButton;


    @FindBy(xpath = "(//label[text()='RO#:']/parent::span/following::div)[1]")
     WebElement FabricatedParts;

    @FindBy(xpath = "(//span[contains(text(),'Total Cost')])[2]")
    WebElement TotalCost;

    @FindBy(xpath = "(//span[text()='Total Charge'])[2]")
    WebElement TotalCharges;

    @FindBy(xpath = "//a[contains(@id,'0:clPartsStockOnHand')]")
    public WebElement label_PartName;

    @FindBy(xpath = "//label[text()='Part #:']")
    public WebElement label_Part;

    @FindBy(xpath = "(//label[text()='Part #:']/parent::span/following::div)[1]")
    public WebElement label_PartTextArea;

    @FindBy(xpath = "//label[text()='Part Description:']")
    public WebElement label_PartDescription;

    @FindBy(xpath = "(//label[text()='Part Description:']/following::div)[1]")
    public WebElement label_PartDescriptionTextArea;

    @FindBy(xpath = "//label[text()='Charge Quantity (EA):']")
    public WebElement label_ChargeQuantity;

    @FindBy(xpath = "//label[text()='Charge Quantity (EA):']/parent::span/parent::div/following-sibling::div/child::table//div//input")
    public WebElement label_ChargeQuantityTextArea;

   @FindBy(xpath = "//label[text()='Unit Cost:']")
    WebElement label_unitCost;

   @FindBy(xpath = "(//label[text()='Unit Cost:']/parent::span/following::div)[1]")
    WebElement UnitCost;

    @FindBy(xpath = "(//div[contains(@id,'pslStockOnHand::b')]//a//span)[1]")
    public WebElement label_CancelButton;

    @FindBy(xpath = "//span[contains(text(),'Save / Exit')]")
    public WebElement label_OkButton;

    @FindBy(xpath = "//a[contains(.,'New Part')]")
    WebElement NewPart;

    @FindBy(xpath = "//td[contains(@id,':pwPQ::tb')]/child::div")
    WebElement NewPart1;

    @FindBy(xpath = "(//label[text()='Part #:']/preceding-sibling::span)[2]")
    WebElement RequiredPart;

    @FindBy(xpath = "(//label[text()='Part #:']/parent::span)[2]")
    WebElement PartTextArea;


    @FindBy(xpath = "//label[text()='Part #:']")
    WebElement PartHash;

    @FindBy(xpath = "//label[text()='Description:']/preceding-sibling::span")
    WebElement DescriptionRequired;

    @FindBy(xpath = "//label[text()='Description:']")
    WebElement Description;

    @FindBy(xpath = "(//label[text()='Description:']/parent::span)[2]")
    WebElement DescriptionTextArea;

    @FindBy(xpath = "(//label[text()='Stocking UOM:'])[1]")
    WebElement StockingUOM;

    @FindBy(xpath = "(//label[text()='Stocking UOM:']/parent::span)[2]")
    WebElement StockingUOMTextArea;

    @FindBy(xpath = "//label[text()='Stocking UOM:']/preceding-sibling::span")
    WebElement StockingUOMRequired;

    @FindBy(xpath = "//label[contains(.,'Stock Part')]")
    WebElement StockPart;

    @FindBy(xpath = "//label[text()='Product Group:']/preceding-sibling::span")
    WebElement ProductGroupRequired;

    @FindBy(xpath ="//label[text()='Product Group:']")
    WebElement ProductGroup;

    @FindBy(xpath = "(//label[text()='Product Group:']/parent::span)[2]")
    WebElement  ProductGroupTextArea;

    @FindBy(xpath = "//label[text()='Cost:']/preceding-sibling::span")
    WebElement CostRequired;

    @FindBy(xpath = "//label[text()='Cost:']")
    WebElement cost;

    @FindBy(xpath = "(//label[text()='Cost:']/parent::span)[2]")
    WebElement CostTextArea;

    @FindBy(xpath = "//label[text()='Costing Method:']/preceding-sibling::span")
    WebElement CostingMethodRequired;

    @FindBy(xpath = "//label[text()='Costing Method:']")
    WebElement CostingMethod;

    @FindBy(xpath = "(//label[text()='Costing Method:']/parent::span)[2]")
    WebElement CostingMethodTextArea;

    @FindBy(xpath = "(//label[text()='GL Account Group:'])[1]")
    WebElement GLAccoutGroup;

    @FindBy(xpath = "(//label[text()='GL Account Group:']/parent::span)[2]")
    WebElement GLAccoutGroupTextArea;

    @FindBy(xpath = "(//label[text()='Vendor:'])[1]")
   WebElement vendor;

    @FindBy(xpath = "(//label[text()='Vendor:']/parent::span)[2]")
    WebElement VendorTextArea;

    @FindBy(xpath = "//span[text()='Create Part']/parent::a/parent::div/parent::td/preceding-sibling::td/child::div/a/span")
    WebElement CancelButton;

    @FindBy(xpath = "//div[contains(@id,':1:cb5')]/child::a/span")
    WebElement OKButton;

    @FindBy(xpath = "(//div[contains(@id,':tWAP::db')]//table//td//div//a[contains(@id,':clPartsStockOnHand')])[1]")
    public WebElement  txt_PartNumber;

    @FindBy(xpath = "//a[contains(@id,':0:clctwptc')]/span")
    WebElement StoreTotalCharge;

    @FindBy(xpath = "(//label[text()='Part #:'])[2]")
    WebElement Parts;

    @FindBy(xpath = "//label[text()='Total Cost:']")
    WebElement TotalCost1;

    @FindBy(xpath = "//label[text()='Total Charge:']")
    WebElement TotalCharge;

    @FindBy(xpath = "//label[text()='Part #:']/parent::span/following::div[1]")
    WebElement PartNumber;

    @FindBy(xpath = "//label[text()='Part Description:']")
    WebElement PartDescription;

    @FindBy(xpath = "//label[text()='Total Cost:']/parent::span/following::div[4]/child::span/label")
    WebElement Quantity;

    @FindBy(xpath = "//label[text()='Unit Cost:']")
     WebElement UnitCost2;

    //@FindBy(xpath = "(//span[text()='Cancel'])[2]")
    @FindBy(xpath = "//div[contains(@id,':pslStockOnHand::b')]/div/div/table/tbody/tr/td/div/a/span")
    WebElement Button1;

    @FindBy(xpath = "//a[contains(@id,'cRTWAP1')]/child::img")
    WebElement trash1;

    @FindBy(xpath = "//img[contains(@id,':cilWAP::icon')]")
    WebElement Delete1;

    @FindBy(xpath = "//a[text()='Sign Out']")
    public WebElement label_SignOut;

    @FindBy(xpath = "//input[contains(@id,'username::content')]")
    public WebElement label_UserName;

    @FindBy(xpath = "//h1[text()='Working...Please Wait']")
    List<WebElement> loder;

    @FindBy(xpath = "//a[text()='Service']")
    WebElement menu_Service;

    @FindBy(xpath = "//td[text()='Complete RO']")
    WebElement subMenu_CompleteRo;

    public WebDriver driver;

    public AddaFabricatedPartToaClosedWorkorder(WebDriver driver){
        this.driver = driver;
        this.waitMethods = new WaitMethods(driver);

    }


    /**go to complete RO Screen*/
    public void goToCompleteROScreen() throws InterruptedException, FileNotFoundException {
//        ReusableActions.getActions(driver).clickParentMenu("Service");
//        ReusableActions.getActions(driver).clickChildMenu("Complete RO");

        waitMethods.waitForElementToBeRefreshedAndClickable(menu_Service);
        WebElementActions.getActions(driver).clickElement(menu_Service);

        waitMethods.waitForElementToBeRefreshedAndClickable(subMenu_CompleteRo);
        WebElementActions.getActions(driver).clickElement(subMenu_CompleteRo);


        waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);

    }
    /**click New RO*/
    public void clickoNewRo () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(NewRo);
        WebElementActions.getActions(driver).clickElement(NewRo);

    }

    /**type unit number */
    public void typeUnitNumber () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(SerachUnit);
        WebElementActions.getActions(driver).inputText(SerachUnit,appProp17.getProperty("SearchUnit"));
        waitMethods.loadingWait(loder);
    }

    /**
     * click on select button
     * @throws InterruptedException
     */
   public void clickonSelectButton () throws InterruptedException {
       waitMethods.waitForElementToBeRefreshedAndClickable(Select);
       WebElementActions.getActions(driver).clickElement(Select);

   }
    /**click on Add Labour */
    public void clickOnAddLabour() throws InterruptedException {

        waitMethods.waitForElementToBeRefreshedAndIsVisible(label_AddLabor);
        WebElementActions.getActions(driver).clickElement(label_AddLabor);

        waitMethods.waitForElementToBeRefreshedAndIsVisible(label_VMRS);
        WebElementActions.getActions(driver).clickElement(label_VMRS);
        if(LoginActions.environmentName.contains("EU")) {
            waitMethods.waitForElementToBeRefreshedAndIsVisible(label_AccessoriesGroup);
            WebElementActions.getActions(driver).clickElement(label_AccessoriesGroup);
        }
        if(LoginActions.environmentName.contains("EC")){
            waitMethods.waitForElementToBeRefreshedAndClickable(SearchTextArea1);
            WebElementActions.getActions(driver).inputText(SearchTextArea1,appProp17.getProperty("Clutch"));

            waitMethods.waitForElementToBeRefreshedAndIsVisible(Clutch);
            WebElementActions.getActions(driver).clickElement(Clutch);

        }

        waitMethods.waitForElementToBeRefreshedAndIsVisible(label_Add);
        WebElementActions.getActions(driver).clickElement(label_Add);
        waitMethods.loadingWait(loder);


        waitMethods.waitForElementToBeRefreshedAndIsVisible(label_AddButton);
        Thread.sleep(2000);
        WebElementActions.getActions(driver).clickElement(label_AddButton);
        Thread.sleep(3000);
        waitMethods.loadingWait(loder);

    }
    /**click on close Ro*/
    public void clickOnCloseRO () throws InterruptedException {

        waitMethods.waitForElementToBeRefreshedAndIsVisible(closeRO);
        WebElementActions.getActions(driver).clickElement(closeRO);

    }
    /**click on invoiced*/
    public void clickOnIvoiced () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(Invoiced);
        WebElementActions.getActions(driver).clickElement(Invoiced);
    }
    /**type Search TextArea */
    public void typeSearchTextArea () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndClickable(SearchTextArea);
        WebElementActions.getActions(driver).inputText(SearchTextArea,appProp17.getProperty("Referance"));

    }

    /**click on Refresh */
    public void clickonRefresh () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(Refresh);
        WebElementActions.getActions(driver).clickElement(Refresh);
        waitMethods.loadingWait(loder);
    }
    /**click Reference Number */
    public void clickonReferenceNumber () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(label_ReferenceNumber);
        WebElementActions.getActions(driver).clickElement(label_ReferenceNumber);
        waitMethods.loadingWait(loder);
    }
    /**click on Add Labour */
    public void clickOnAddLabour2() throws InterruptedException {

        waitMethods.waitForElementToBeRefreshedAndIsVisible(label_AddLabor);
        WebElementActions.getActions(driver).clickElement(label_AddLabor);

        waitMethods.waitForElementToBeRefreshedAndIsVisible(label_VMRS);
        WebElementActions.getActions(driver).clickElement(label_VMRS);
        waitMethods.loadingWait(loder);

         if(LoginActions.environmentName.contains("EU")) {
             waitMethods.waitForElementToBeRefreshedAndIsVisible(label_AccessoriesGroup);
             WebElementActions.getActions(driver).clickElement(label_AccessoriesGroup);
         }
        if(LoginActions.environmentName.contains("EC")){
            waitMethods.waitForElementToBeRefreshedAndClickable(SearchTextArea1);
            Thread.sleep(3000);
            WebElementActions.getActions(driver).inputText(SearchTextArea1,appProp17.getProperty("Clutch"));

            waitMethods.waitForElementToBeRefreshedAndIsVisible(Clutch);
            WebElementActions.getActions(driver).clickElement(Clutch);

        }

        waitMethods.waitForElementToBeRefreshedAndIsVisible(label_Add);
        WebElementActions.getActions(driver).clickElement(label_Add);
        waitMethods.loadingWait(loder);


        waitMethods.waitForElementToBeRefreshedAndIsVisible(label_AddButton);
        Thread.sleep(2000);
        WebElementActions.getActions(driver).clickElement(label_AddButton);
        Thread.sleep(3000);

        waitMethods.waitForElementToBeRefreshedAndIsVisible(SrNo);
        WebElementActions.getActions(driver).clickElement(SrNo);


        if (img_CrossIcon1.size()>1) {

            waitMethods.waitForElementToBeRefreshedAndClickable(img_CrossIcon1.get(1));
            Thread.sleep(2000);
            WebElementActions.getActions(driver).clickElement(img_CrossIcon1.get(1));

            waitMethods.waitForElementToBeRefreshedAndIsVisible(label_Delete3);
            WebElementActions.getActions(driver).clickElement(label_Delete3);
            waitMethods.loadingWait(loder);


            }

        }


    /**click On Add Parts*/
    public void clickOnAddParts () throws InterruptedException {

        waitMethods.waitForElementToBeRefreshedAndIsVisible(label_AddPart);
        WebElementActions.getActions(driver).clickElement(label_AddPart);

        waitMethods.waitForElementToBeRefreshedAndIsVisible(label_Img);
        WebElementActions.getActions(driver).clickElement(label_Img);

        waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_PartTextArea);
        WebElementActions.getActions(driver).inputText(txt_PartTextArea,appProp17.getProperty("PartValue"));
        Thread.sleep(5000);
        txt_PartTextArea.sendKeys(Keys.ENTER);
        waitMethods.loadingWait(loder);


        waitMethods.waitForElementToBeRefreshedAndClickable(btn_IssuePartBtn);
        WebElementActions.getActions(driver).clickElement(btn_IssuePartBtn);


        waitMethods.waitForElementToBeRefreshedAndIsVisible(btn_Close);
        WebElementActions.getActions(driver).clickElement(btn_Close);

        waitMethods.loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }

    /**verify Fabricated Parts */
    public void verifyPart () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(label_PartsSrNo);
        Assert.assertTrue(label_PartsSrNo.isDisplayed());
    }
    /**verify RO TotalCost*/
    public void verifyRoTotalcost () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(TotalCost);
        Assert.assertTrue(TotalCost.isDisplayed());

    }
    /**verify MainScreenTotalCharge */
    public void TotalCharge () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(TotalCharges);
        Assert.assertTrue(TotalCharges.isDisplayed());
    }
    /**click on Part Number */
    public void clickPartNumber1 () throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(label_PartsSrNo);
        WebElementActions.getActions(driver).clickElement(label_PartsSrNo);

    }
    /**verify partHash ,Part Description:,Fabricated Quantity:,Unit Cost:*/
    public void PartHash1() throws InterruptedException {
        waitMethods.waitForElementToBeRefreshedAndIsVisible(label_Part);
        Assert.assertTrue(label_Part.isDisplayed());

        waitMethods.waitForElementToBeRefreshedAndIsVisible(label_PartTextArea);
        Assert.assertTrue(label_PartTextArea.isDisplayed());

        waitMethods.waitForElementToBeRefreshedAndIsVisible(label_PartDescription);
        Assert.assertTrue(label_PartDescription.isDisplayed());

        waitMethods.waitForElementToBeRefreshedAndIsVisible(label_PartDescriptionTextArea);
        Assert.assertTrue(label_PartDescriptionTextArea.isDisplayed());

        waitMethods.waitForElementToBeRefreshedAndIsVisible(label_unitCost);
        Assert.assertTrue(label_unitCost.isDisplayed());

        waitMethods.waitForElementToBeRefreshedAndIsVisible(UnitCost);
        Assert.assertTrue(UnitCost.isDisplayed());

        waitMethods.waitForElementToBeRefreshedAndIsVisible(label_CancelButton);
        Assert.assertTrue(label_CancelButton.isDisplayed());

        waitMethods.waitForElementToBeRefreshedAndIsVisible(label_OkButton);
        Assert.assertTrue(label_OkButton.isDisplayed());
    }
   /**click on Cancel Button*/
   public void clickonCancelButton () throws InterruptedException {
       waitMethods.waitForElementToBeRefreshedAndIsVisible(label_CancelButton);
       WebElementActions.getActions(driver).clickElement(label_CancelButton);
       waitMethods.loadingWait(loder);
   }

    /**click On Add Parts*/
   public void clickonAddPart() throws InterruptedException {

       waitMethods.waitForElementToBeRefreshedAndIsVisible(label_AddPart);
       WebElementActions.getActions(driver).clickElement(label_AddPart);

   }
   /**click on New Part*/
   public void  clickonNewPart () throws InterruptedException {
       waitMethods.waitForElementToBeRefreshedAndIsVisible(NewPart);
       WebElementActions.getActions(driver).clickElement(NewPart);
   }
  /**verify New Part*/
  public void verifypartHash () throws InterruptedException {
      waitMethods.waitForElementToBeRefreshedAndIsVisible(NewPart1);
      Assert.assertTrue(NewPart1.isDisplayed());

      waitMethods.waitForElementToBeRefreshedAndIsVisible(RequiredPart);
      Assert.assertTrue(RequiredPart.isDisplayed());

      waitMethods.waitForElementToBeRefreshedAndIsVisible(PartHash);
      Assert.assertTrue(PartHash.isDisplayed());

      waitMethods.waitForElementToBeRefreshedAndIsVisible(PartTextArea);
      Assert.assertTrue(PartTextArea.isDisplayed());

  }
  /**verify  Description,TextArea*/
  public void verifypartDescription () throws InterruptedException {
      waitMethods.waitForElementToBeRefreshedAndIsVisible(DescriptionRequired);
      Assert.assertTrue(DescriptionRequired.isDisplayed());

      waitMethods.waitForElementToBeRefreshedAndIsVisible(Description);
      Assert.assertTrue(Description.isDisplayed());

      waitMethods.waitForElementToBeRefreshedAndIsVisible(DescriptionTextArea);
      Assert.assertTrue(DescriptionTextArea.isDisplayed());

  }
  /**verify RequiredStocking UOM:.Stocking UOM:,textarea*/
  public void verifyStockingUOM () throws InterruptedException {

      waitMethods.waitForElementToBeRefreshedAndIsVisible(StockingUOMRequired);
      Assert.assertTrue(StockingUOMRequired.isDisplayed());

      waitMethods.waitForElementToBeRefreshedAndIsVisible(StockingUOM);
      Assert.assertTrue(StockingUOM.isDisplayed());

      waitMethods.waitForElementToBeRefreshedAndIsVisible(StockingUOMTextArea);
      Assert.assertTrue(StockingUOMTextArea.isDisplayed());
  }
  /**verify Stock Part */
  public void verifyStockPart () throws InterruptedException {
      waitMethods.waitForElementToBeRefreshedAndIsVisible(StockPart);
      Assert.assertTrue(StockPart.isDisplayed());

  }
  /** verify ProductGroupRequired, ProductGroup,ProductGroupTextArea*/
  public void verifyProductGroupRequired () throws InterruptedException {
      waitMethods.waitForElementToBeRefreshedAndIsVisible(ProductGroupRequired);
      Assert.assertTrue(ProductGroupRequired.isDisplayed());

      waitMethods.waitForElementToBeRefreshedAndIsVisible(ProductGroup);
      Assert.assertTrue(ProductGroup.isDisplayed());

      waitMethods.waitForElementToBeRefreshedAndIsVisible(ProductGroupTextArea);
      Assert.assertTrue(ProductGroupTextArea.isDisplayed());
  }
  /**verify costRequired,cost,costTextArea*/
  public void verifyCostRequired () throws InterruptedException {
      waitMethods.waitForElementToBeRefreshedAndIsVisible(CostRequired);
      Assert.assertTrue(CostRequired.isDisplayed());

      waitMethods.waitForElementToBeRefreshedAndIsVisible(cost);
      Assert.assertTrue(cost.isDisplayed());

      waitMethods.waitForElementToBeRefreshedAndIsVisible(CostTextArea);
      Assert.assertTrue(CostTextArea.isDisplayed());

  }
 /**verify costingMethodRequired,costingMethod,CostingMethodTextArea*/
 public void verifyCostingMethod () throws InterruptedException {
     waitMethods.waitForElementToBeRefreshedAndIsVisible(CostingMethodRequired);
     Assert.assertTrue(CostingMethodRequired.isDisplayed());

     waitMethods.waitForElementToBeRefreshedAndIsVisible(CostingMethod);
     Assert.assertTrue(CostingMethod.isDisplayed());

     waitMethods.waitForElementToBeRefreshedAndIsVisible(CostingMethodTextArea);
     Assert.assertTrue(CostingMethodTextArea.isDisplayed());

 }
 /**verify GLAccoutGroup*/
  public void verifyGLAccoutGroup () throws InterruptedException {
      waitMethods.waitForElementToBeRefreshedAndIsVisible(GLAccoutGroup);
     Assert.assertTrue(GLAccoutGroup.isDisplayed());

      waitMethods.waitForElementToBeRefreshedAndIsVisible(GLAccoutGroupTextArea);
     Assert.assertTrue(GLAccoutGroupTextArea.isDisplayed());

 }
 /**verify vendor ,TexrArea */
 public void verifyVendor () throws InterruptedException {
     waitMethods.waitForElementToBeRefreshedAndIsVisible(vendor);
     Assert.assertTrue(vendor.isDisplayed());

     waitMethods.waitForElementToBeRefreshedAndIsVisible(VendorTextArea);
     Assert.assertTrue(VendorTextArea.isDisplayed());

 }
  /**veriy CancelButton ,OkButton*/
  public void verifyCancelButton () throws InterruptedException {
      waitMethods.waitForElementToBeRefreshedAndIsVisible(CancelButton);
      Assert.assertTrue(CancelButton.isDisplayed());

      waitMethods.waitForElementToBeRefreshedAndIsVisible(OKButton);
      Assert.assertTrue(OKButton.isDisplayed());
  }
  /**click on Cancel Button*/
  public void clickonCacelButton () throws InterruptedException {
      waitMethods.waitForElementToBeRefreshedAndIsVisible(CancelButton);
      WebElementActions.getActions(driver).clickElement(CancelButton);
  }
  /**click on PartTextArea*/
   public void clickonPartTextArea () throws InterruptedException {

       waitMethods.waitForElementToBeRefreshedAndIsVisible(txt_PartTextArea);
       WebElementActions.getActions(driver).inputText(txt_PartTextArea, appProp17.getProperty("PartValue"));
       Thread.sleep(5000);
       txt_PartTextArea.sendKeys(Keys.ENTER);
       waitMethods.loadingWait(loder);


     //  WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_PartNumber);
    //   WebElementActions.getActions().clickElement(label_PartNumber);
    //   WaitActions.getWaits().loadingWait(loder);

       waitMethods.waitForElementToBeRefreshedAndClickable(btn_IssuePartBtn);
       WebElementActions.getActions(driver).clickElement(btn_IssuePartBtn);
   }
   /**verify Text Part Number */
   public void verifyPartNumberText () throws InterruptedException {

       waitMethods.waitForElementToBeRefreshedAndIsVisible(label_PartName);
       Assert.assertTrue(label_PartName.isDisplayed());

       waitMethods.waitForElementToBeRefreshedAndIsVisible(StoreTotalCharge);
       Assert.assertTrue(StoreTotalCharge.isDisplayed());
   }
   /**click on Part Number*/
   public void clickonPartNumber () throws InterruptedException {

       waitMethods.waitForElementToBeRefreshedAndClickable(label_PartName);
       WebElementActions.getActions(driver).clickElement(label_PartName);

   }
    /**verify Fabricated Parts */
    public void verifyFabricatedParts2() throws InterruptedException {

        waitMethods.waitForElementToBeRefreshedAndIsVisible(Parts);
        Assert.assertTrue(Parts.isDisplayed());

        waitMethods.waitForElementToBeRefreshedAndIsVisible(TotalCost1);
        Assert.assertTrue(TotalCost1.isDisplayed());


        waitMethods.waitForElementToBeRefreshedAndIsVisible(TotalCharge);
        Assert.assertTrue(TotalCharge.isDisplayed());

    }
   /**verify Part#,PartNumber,Part Description*/
   public void  verifyPartNumber () throws InterruptedException {
       waitMethods.waitForElementToBeRefreshedAndIsVisible(Parts);
       Assert.assertTrue(Parts.isDisplayed());

       waitMethods.waitForElementToBeRefreshedAndIsVisible(PartNumber);
       Assert.assertTrue(PartNumber.isDisplayed());

       waitMethods.waitForElementToBeRefreshedAndIsVisible(PartDescription);
       Assert.assertTrue(PartDescription.isDisplayed());

   }
   /**verify Fabricated Quantity */
   public void verifyFabricatedQuantity () throws InterruptedException {

       waitMethods.waitForElementToBeRefreshedAndIsVisible(Quantity);
       Assert.assertTrue(Quantity.isDisplayed());

       waitMethods.waitForElementToBeRefreshedAndIsVisible(UnitCost2);
       Assert.assertTrue(UnitCost2.isDisplayed());


       waitMethods.waitForElementToBeRefreshedAndIsVisible(Button1);
       Assert.assertTrue(Button1.isDisplayed());
   }
   /**click on close Button */
   public void clickOnCloseButton () throws InterruptedException {
       waitMethods.waitForElementToBeRefreshedAndClickable(Button1);
       WebElementActions.getActions(driver).clickElement(Button1);


       waitMethods.waitForElementToBeRefreshedAndClickable(trash1);
       WebElementActions.getActions(driver).clickElement(trash1);


       waitMethods.waitForElementToBeRefreshedAndClickable(Delete1);
       WebElementActions.getActions(driver).clickElement(Delete1);


       waitMethods.waitForElementToBeRefreshedAndClickable(btn_Close);
       WebElementActions.getActions(driver).clickElement(btn_Close);
       waitMethods.loadingWait(loder);
   }

    /**click On Sign Out */

    public void clickOnSignOut () throws InterruptedException {

        waitMethods.waitForElementToBeRefreshedAndIsVisible(label_SignOut);
        WebElementActions.getActions(driver).clickElement(label_SignOut);
        TestListener.saveScreenshotPNG(driver);
    }
    /**click on UserName */
    public void clickOnUsername () throws InterruptedException{
        waitMethods.waitForElementToBeRefreshedAndIsVisible(label_UserName);
        WebElementActions.getActions(driver).clickElement(label_UserName);
        }

}

