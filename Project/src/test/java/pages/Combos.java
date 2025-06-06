package pages;

import java.io.IOException;
import java.time.Duration;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.CakeLocators;
import uistore.CombosLocators;

import utils.Assertion;
import utils.Base;
import utils.ExcelReader;
import utils.LoggerHandler;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;

public class Combos {
    public static WebDriverHelper helper;
    public static ExtentReports extentReport;
    public static ExtentTest extentTest;
    public static Assertion obj;
    /*Author: D.B.S.Rohan
     * Method Name: Combos
     * Description: This is a constructor that initializes the driver, helper, test and assertion objects.
     * Parameters: ExtentTest test
     * Return Type: NA
    */
    public Combos(ExtentTest extentTest){
        helper=new WebDriverHelper(Base.driver);
        this.extentTest=extentTest;
    }
    /*Author: D.B.S.Rohan
     * Method Name: clickNoThanks
     * Description: This method is used to click nothanks
     * Parameters: NA
     * Return Type: void
    */

    public void clickNoThanks(){
        try{
            helper.waitForElementToBeVisible(CombosLocators.noThanks,10);
            helper.clickElement(CombosLocators.noThanks);
            LoggerHandler.info("clicked on pop up");
            extentTest.log(Status.INFO, "Clicked on pop-up");
            extentTest.log(Status.PASS, "Clicked on pop-up");
        }
        catch(Exception e){
            LoggerHandler.info("couldn't no thanks");
            extentTest.log(Status.INFO,"couldn't no thanks");
            extentTest.log(Status.FAIL,"couldn't no thanks");
            Reporter.attachScreenshot("clicked_on_nothanks", extentTest,"clicked_on_nothanks");
        }
    }
    /*Author: D.B.S.Rohan
     * Method Name: clickWhere
     * Description: This method is used to select the where to deliver
     * Parameters: NA
     * Return Type: void
    */
    public void clickWhere(){
        try {
            helper.popup();
            helper.waitForElementToBeVisible(CombosLocators.where,10);
            helper.clickElement(CombosLocators.where);
            LoggerHandler.info("click Deliver");
            extentTest.log(Status.INFO, "click Deliver");
            extentTest.log(Status.PASS, "click Deliver");
        }
        catch(Exception e){
            LoggerHandler.error("Not click Deliver");
            extentTest.log(Status.INFO, "Not click Deliver");
            extentTest.log(Status.FAIL, "Not click Deliver");
            Reporter.attachScreenshot("clicked_on_where_to_deliver", extentTest,"clicked_on_where_to_deliver");
        }
        
    }

        /*Author: D.B.S.Rohan
     * Method Name: enteringLocation
     * Description: This method is used to select the where to deliver
     * Parameters: NA
     * Return Type: void
    */
    public void enteringLocation(String area_name) {
        try{
            Thread.sleep(2000);
            helper.clickElement(CombosLocators.location);
            helper.waitForElementToBeVisible(CombosLocators.location,10);
            //String bangalore=ExcelReader.readdata(System.getProperty("user.dir") + "/testdata/fnp.xlsx", "Sheet1", 2, 1);
            helper.enterText(CombosLocators.location,"Bangalore");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                LoggerHandler.error("failed");
                extentTest.log(Status.INFO,"failed");
                extentTest.log(Status.FAIL,"failed");
            }
            //String area_name = ExcelReader.readdata(System.getProperty("user.dir")+"/testdata/fnp.xlsx","Sheet1",2,1);
            helper.enterText(CombosLocators.location, area_name);
            Thread.sleep(2000);
            helper.enterAction(CombosLocators.location);
            Thread.sleep(2000);
            Base.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
            Base.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        }
        catch(Exception e){
            LoggerHandler.info("couldn't hovered over combos");
            extentTest.log(Status.INFO,"couldn't hovered over combos");
            extentTest.log(Status.FAIL,"couldn't hovered over combos");
            Reporter.attachScreenshot("hovered_on_combos", extentTest,"hovered_on_combos");
        }
 
    }
    /*Author: D.B.S.Rohan
     * Method Name: continueShopping
     * Description: This method is used to select the continue
     * Parameters: NA
     * Return Type: void
    */
    public void continueShopping(){
        try{
            helper.waitForElementToBeVisible(CombosLocators.continueShop,10);
            helper.hoverElement(CombosLocators.continueShop);
            helper.clickElement(CombosLocators.continueShop);
            Thread.sleep(2000);
            LoggerHandler.info("clicked on continue shopping");
            extentTest.log(Status.INFO,"clicked on continue shopping");
            extentTest.log(Status.PASS,"clicked on continue shopping");
        }
        catch(Exception e){
            LoggerHandler.info("couldn't clicked on continue shopping");
            extentTest.log(Status.INFO,"couldn't clicked on continue shopping");
            extentTest.log(Status.FAIL,"couldn't clicked on continue shopping");
            Reporter.attachScreenshot("clicked_on_continue_shopping", extentTest,"clicked_on_continue_shopping");
        }
    }
    /*Author: D.B.S.Rohan
     * Method Name: hoverCombos
     * Description: This method is used to hover on the combos
     * Parameters: NA
     * Return Type: void
    */
    public void hoverCombos(){
        try{
            helper.waitForElementToBeVisible(CombosLocators.combos,10);
            helper.hoverElement(CombosLocators.combos);
            LoggerHandler.info("hovered over combos");
            extentTest.log(Status.INFO,"hovered over combos");
            extentTest.log(Status.PASS,"hovered over combos");
        }
        catch(Exception e){
            LoggerHandler.info("couldn't hovered over combos");
            extentTest.log(Status.INFO,"couldn't hovered over combos");
            extentTest.log(Status.FAIL,"couldn't hovered over combos");
            Reporter.attachScreenshot("hovered_on_combos", extentTest,"hovered_on_combos");
        }
    }
    /*Author: D.B.S.Rohan
     * Method Name: clickHampers
     * Description: This method is used to click on hampers
     * Parameters: NA
     * Return Type: void
    */
    public void clickHampers(){
        try{
            helper.waitForElementToBeVisible(CombosLocators.healthyhampers,10);
            helper.clickElement(CombosLocators.healthyhampers);
            LoggerHandler.info("clicked helathy hampers");
            extentTest.log(Status.INFO,"clicked helathy hampers");
            extentTest.log(Status.PASS,"clicked helathy hampers");
        }
        catch(Exception e){
            LoggerHandler.info("couldn't clicked helathy hampers");
            extentTest.log(Status.INFO,"couldn't clicked helathy hampers");
            extentTest.log(Status.FAIL,"couldn't clicked helathy hampers");
            Reporter.attachScreenshot("clicked_on_hampers", extentTest,"clicked_on_hampers");
        }
    }
    /*Author: D.B.S.Rohan
     * Method Name: clickAvailability
     * Description: This method is used to click on availability
     * Parameters: NA
     * Return Type: void
    */
    public void clickAvailability(){
        try{
            helper.waitForElementToBeVisible(CombosLocators.availability,10);
            Thread.sleep(1000);
            helper.clickElement(CombosLocators.availability);
            LoggerHandler.info("clicked availability");
            extentTest.log(Status.INFO,"clicked availability");
            extentTest.log(Status.PASS,"clicked availability");
        }
        catch(Exception e){
            LoggerHandler.info("couldn't clicked helathy hampers");
            extentTest.log(Status.INFO,"couldn't clicked helathy hampers");
            extentTest.log(Status.FAIL,"couldn't clicked helathy hampers");
            Reporter.attachScreenshot("clicked_on_availability", extentTest,"clicked_on_availability");
        }
    }
    /*Author: D.B.S.Rohan
     * Method Name: clickTrue
     * Description: This method is used to click on true filter
     * Parameters: NA
     * Return Type: void
    */
    public void clickTrue(){
        try{
            helper.waitForElementToBeVisible(CombosLocators.trues,10);
            helper.clickElement(CombosLocators.trues);
            LoggerHandler.info("clicked true");
            extentTest.log(Status.INFO,"clicked true");
            extentTest.log(Status.PASS,"clicked true");
        }
        catch(Exception e){
            LoggerHandler.info("couldn't clicked true");
            extentTest.log(Status.INFO,"couldn't clicked true");
            extentTest.log(Status.FAIL,"couldn't clicked true");
            Reporter.attachScreenshot("clicked_on_true", extentTest,"clicked_on_true");
        }
    }
    /*Author: D.B.S.Rohan
     * Method Name: clickProduct
     * Description: This method is used to click on the first product
     * Parameters: NA
     * Return Type: void
    */
    public void clickProduct(){
        try{
            helper.waitForElementToBeVisible(CombosLocators.firstProduct,10);
            helper.hoverElement(CombosLocators.firstProduct);
            helper.clickElement(CombosLocators.firstProduct);
            LoggerHandler.info("clicked firstProduct");
            extentTest.log(Status.INFO,"clicked firstProduct");
            extentTest.log(Status.PASS,"clicked firstProduct");
        }
        catch(Exception e){
            LoggerHandler.info("couldn't clicked firstProduct");
            extentTest.log(Status.INFO,"couldn't clicked firstProduct");
            extentTest.log(Status.FAIL,"couldn't clicked firstProduct");
            Reporter.attachScreenshot("clicked_on_first_product", extentTest,"clicked_on_first_product");
        }
    }
    /*Author: D.B.S.Rohan
     * Method Name: addToCart
     * Description: This method is used to add the product to the cart
     * Parameters: NA
     * Return Type: void
    */
    public void addToCart(){
        try{
            helper.switchWindow();
            helper.waitForElementToBeVisible(CombosLocators.add,10);
            helper.clickElement(CombosLocators.add);
            LoggerHandler.info("added product");
            extentTest.log(Status.INFO,"added product");
            extentTest.log(Status.PASS,"added product");

    }
    catch(Exception e){
        LoggerHandler.info("couldn't added product");
        extentTest.log(Status.INFO,"couldn't added product");
        extentTest.log(Status.FAIL,"couldn't added product");
        Reporter.attachScreenshot("clicked_on_add_product", extentTest,"clicked_on_add_product");
    }
    }

}

