package pages;

import java.io.IOException;
import java.time.Duration;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.model.Author;

import uistore.CakeLocators;

import utils.Assertion;
import utils.Base;
import utils.ExcelReader;
import utils.LoggerHandler;
import utils.Reporter;
import utils.WebDriverHelper;

public class Cake {
    public static WebDriverHelper helper;
    public static ExtentReports extentReport;
    public static ExtentTest extentTest;
    public static Assertion obj;
        /*
    * Method Name: Cake
    * Author Name: rohan
    * Description: This is a constructor that initializes the driver, helper, test and assertion objects
    * Return Type: void
    * Parameter List: NA
    */
    public Cake(ExtentTest extentTest){
        helper=new WebDriverHelper(Base.driver);
        this.extentTest=extentTest;
    }
        /*
    * Method Name: clickNoThanks
    * Author Name: rohan
    * Description: This method click on the no thanks
    * Return Type: void
    * Parameter List: NA
    */
    public void clickNoThanks(){
        try {
            helper.waitForElementToBeVisible(CakeLocators.noThanks,10);
            helper.clickElement(CakeLocators.noThanks);           
            LoggerHandler.info("clicked on pop up");
            extentTest.log(Status.INFO, "Clicked on pop-up");
            extentTest.log(Status.PASS, "Clicked on pop-up");
        } catch (Exception e) {
            LoggerHandler.error("Failed to click on pop-up");
            extentTest.log(Status.INFO, "Clicked on pop-up");
            extentTest.log(Status.FAIL, "failed to click on pop-up");
            Reporter.attachScreenshot("failednothanks", extentTest, "nothanks");
        }

    }
    /*
    * Method Name: clickDeliver
    * Author Name: rohan
    * Description: This method click on the where to deliver
    * Return Type: void
    * Parameter List: NA
    */
    public void clickDeliver() {
        try {
            helper.popup();
            helper.waitForElementToBeVisible(CakeLocators.deliver, 10);
            helper.clickElement(CakeLocators.deliver);
            LoggerHandler.info("click Deliver");
            extentTest.log(Status.INFO, "Clicked on pop-up");
            extentTest.log(Status.PASS, "click Deliver");
        } catch (Exception e) {
            LoggerHandler.error("Not click Deliver");
            extentTest.log(Status.INFO, "Clicked on pop-up");
            extentTest.log(Status.FAIL,"Not click Deliver");
            Reporter.attachScreenshot("faileddeliver", extentTest, "where to deliver");

        }
    }
            /*
    * Method Name: clickArea
    * Author Name: rohan
    * Description: This method click on the location area
    * Return Type: void
    * Parameter List: NA
    */
    public void clickArea() {
        try {
            helper.waitForElementToBeVisible(CakeLocators.area,10);
            helper.clickElement(CakeLocators.area);
            LoggerHandler.info("click Location");
            extentTest.log(Status.INFO, "click location");
            extentTest.log(Status.PASS, "click location");
        } catch (Exception e) {
            LoggerHandler.error("Not click Location");
            extentTest.log(Status.INFO,"Not click Location");
            extentTest.log(Status.FAIL,"Not click Location");
            Reporter.attachScreenshot("failedlocation", extentTest, "location");
            extentTest.log(Status.INFO, "Not click Location");
            extentTest.log(Status.FAIL, "Not click Location");
        }
    }
        /*
    * Method Name: enterArea
    * Author Name: rohan
    * Description: This method click on the enter location
    * Return Type: void
    * Parameter List: NA
    */
    public void enterArea(String city) {
        try{
            //String area_name=ExcelReader.readdata(System.getProperty("user.dir") + "/testdata/fnp.xlsx", "Sheet1", 0, 0);
            helper.enterText(CakeLocators.area,city);
            LoggerHandler.info("Entered Delhi");
            extentTest.log(Status.INFO, "Clicked on pop-up");
            extentTest.log(Status.PASS,"Entered Delhi");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    LoggerHandler.error("failed");
                    extentTest.log(Status.FAIL,"failed");
                }
            helper.enterAction(CakeLocators.area);
            Thread.sleep(2000);
            // Base.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
            // Base.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));        
        }catch(Exception e){
            LoggerHandler.error("Not entered location");
            extentTest.log(Status.INFO,"Not entered location");
            extentTest.log(Status.FAIL,"Not entered location");
            Reporter.attachScreenshot("failedarea", extentTest, "area");

        }
    }
        /*
    * Method Name: clickContinueShopping
    * Author Name: rohan
    * Description: This method click on the continue shopping
    * Return Type: void
    * Parameter List: NA
    */
    public void clickContinueShopping() {
        try {
            helper.waitForElementToBeVisible(CakeLocators.continueshopping, 10);
            helper.clickElement(CakeLocators.continueshopping);
            Thread.sleep(2000);
            LoggerHandler.info("Click continue shopping");
            extentTest.log(Status.INFO, "Click continue shopping");
            extentTest.log(Status.PASS, "Click continue shopping");
        } catch (Exception e) {
            LoggerHandler.error("Not click continue shopping");
            extentTest.log(Status.FAIL,"Not click continue shopping");
            Reporter.attachScreenshot("failedcontinueshopping", extentTest, "continueshopping");

        }
    }
        /*
    * Method Name: clickSearch
    * Author Name: rohan
    * Description: This method click on the search
    * Return Type: void
    * Parameter List: NA
    */
    public void clickSearch() {
        try {
            helper.waitForElementToBeVisible(CakeLocators.search, 10);
            helper.clickElement(CakeLocators.search);
            LoggerHandler.info("Click search");
            extentTest.log(Status.INFO, "Click csearch");
            extentTest.log(Status.PASS, "Click csearch");
        } catch (Exception e) {
            LoggerHandler.error("Not click search");
            extentTest.log(Status.INFO, "Click csearch");
            extentTest.log(Status.FAIL,"Not click search");
            Reporter.attachScreenshot("failedsearch", extentTest, "search");
        }
    }
            /*
    * Method Name: typeSearch
    * Author Name: rohan
    * Description: This method enter the search
    * Return Type: void
    * Parameter List: NA
    */
    public void typeSearch(String name) {
        try{
            //String name=ExcelReader.readdata(System.getProperty("user.dir") + "/testdata/fnp.xlsx", "Sheet1", 3, 1);
            helper.enterText(CakeLocators.search,name);

            helper.enterAction(CakeLocators.search);
            LoggerHandler.info("Entered Cake");
            extentTest.log(Status.INFO, "Entered Cake");
            extentTest.log(Status.PASS, "Entered Cake");
        } catch (Exception e) {
            LoggerHandler.error("Not Entered Delhi");
            extentTest.log(Status.INFO,"Not Entered Cake");
            extentTest.log(Status.FAIL,"Not Entered Cake");
            Reporter.attachScreenshot("failedcake", extentTest, "cake");

        }
    }
        /*
    * Method Name: clickFlavour
    * Author Name: rohan
    * Description: This method click on the flavour
    * Return Type: void
    * Parameter List: NA
    */
    public void clickFlavour() {
        try {
            helper.waitForElementToBeVisible(CakeLocators.flavour, 10);
            helper.clickElement(CakeLocators.flavour);
            LoggerHandler.info("click flavour");
            extentTest.log(Status.INFO, "click flavour");
            extentTest.log(Status.PASS, "click flavour");
        } catch (Exception e) {
            LoggerHandler.error("Not clicked flavour");
            extentTest.log(Status.FAIL,"Not clicked flavour");
            extentTest.log(Status.FAIL,"Not clicked flavour");
            Reporter.attachScreenshot("failedflavour", extentTest, "flavour");

        }
    }
            /*
    * Method Name: clickChocolates
    * Author Name: rohan
    * Description: This method click on the chocolates
    * Return Type: void
    * Parameter List: NA
    */
    public void clickChocolates() {
        try {
            helper.waitForElementToBeVisible(CakeLocators.chocolate, 10);
            helper.clickElement(CakeLocators.chocolate);
            LoggerHandler.info("click chocolate");
            extentTest.log(Status.INFO, "click chocolate");
            extentTest.log(Status.PASS, "click chocolate");
        } catch (Exception e) {
            LoggerHandler.error("Not clicked chocolate");
            extentTest.log(Status.INFO,"Not clicked chocolate");
            extentTest.log(Status.FAIL,"Not clicked chocolate");
            Reporter.attachScreenshot("failedchocolates", extentTest, "nothanks");
        }
    }
        /*
    * Method Name: clickFirstProduct
    * Author Name: rohan
    * Description: This method click on the first product
    * Return Type: void
    * Parameter List: NA
    */
    public void clickFirstProduct() {
        try {
            helper.waitForElementToBeVisible(CakeLocators.first_product, 10);
            helper.clickElement(CakeLocators.first_product);
            LoggerHandler.info("click on first product");
            extentTest.log(Status.INFO, "click on first product");
            extentTest.log(Status.PASS, "click on first product");
        } catch (Exception e) {
            LoggerHandler.error("Not click on first product");
            extentTest.log(Status.INFO,"Not click on first product");
            extentTest.log(Status.FAIL,"Not click on first product");
            Reporter.attachScreenshot("failedcake", extentTest, "cake");
        }
    }
            /*
    * Method Name: clickBuyNow
    * Author Name: rohan
    * Description: This method click on the buy now
    * Return Type: void
    * Parameter List: NA
    */
    public void clickBuyNow() {
        try {
            helper.switchWindow();
            helper.waitForElementToBeVisible(CakeLocators.buynow, 10);
            helper.clickElement(CakeLocators.buynow);
            LoggerHandler.info("click on buynow");
            extentTest.log(Status.INFO, "click on buynow");
            extentTest.log(Status.PASS, "click on buynow");
        } catch (Exception e) {
            LoggerHandler.error("Not click on buy now");
            extentTest.log(Status.INFO,"Not click on buy now");
            extentTest.log(Status.FAIL,"Not click on buy now");
            Reporter.attachScreenshot("failedbuynow", extentTest, "buynow");

        }
    }

}

