package pages;
import java.io.IOException;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import uistore.PlantLocators;
import uistore.PenLocators;
import utils.Assertion;
import utils.Base;
import utils.ExcelReader;
import utils.LoggerHandler;
import utils.Reporter;
import utils.WebDriverHelper;

public class Plants {
    public static WebDriverHelper helper;
    public static ExtentReports extentReport;
    public static ExtentTest extentTest;
    public static Assertion obj;
    public Plants(ExtentTest extentTest){
        helper=new WebDriverHelper(Base.driver);
        this.extentTest=extentTest;

    }
        /*
    * Method Name: clickDeliver
    * Author Name: prakash
    * Description: This method click on the where to deliver
    * Return Type: void
    * Parameter List: NA
    */
    public void clickDeliver(){
        try{
            helper.popup();
            helper.waitForElementToBeVisible(PlantLocators.deliver,10);
            helper.clickElement(PlantLocators.deliver);
            LoggerHandler.info("click Deliver");
            extentTest.info("click Deliver");
            extentTest.log(Status.PASS,"click Deliver");
            Reporter.attachScreenshot("where to deliver", extentTest, "where to deliver");
        }catch(Exception e){
            LoggerHandler.error("Not click Deliver");
            extentTest.log(Status.FAIL,"Not click Deliver");
            Reporter.attachScreenshot("where to deliver", extentTest, "where to deliver");
        }
    }
            /*
    * Method Name: clickArea
    * Author Name: prakash
    * Description: This method click on the click area
    * Return Type: void
    * Parameter List: NA
    */
    public void clickArea(){
        try{
            helper.waitForElementToBeVisible(PlantLocators.area,10);
            helper.clickElement(PlantLocators.area);
            LoggerHandler.info("click Location");
            extentTest.info("click Location");
            extentTest.log(Status.PASS,"click location");
        }catch(Exception e){
            LoggerHandler.error("Not click Location");
            extentTest.log(Status.FAIL,"Not click Location");
            Reporter.attachScreenshot("Location", extentTest, "Location");
        }
    }
    /*
    * Method Name: enterArea
    * Author Name: prakash
    * Description: This method click on the enter location
    * Return Type: void
    * Parameter List: NA
    */
    public void enterArea(String area){
        try{
            helper.waitForElementToBeVisible(PlantLocators.area,10);
            helper.enterText(PlantLocators.area,area);
            LoggerHandler.info("Entered Bangalore");
            extentTest.info("Entered Bangalore");
            extentTest.log(Status.PASS,"Entered Bangalore");
            Reporter.attachScreenshot("enter location", extentTest, "enter location");
            Thread.sleep(2000);
            helper.enterAction(PlantLocators.area);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            LoggerHandler.error("failed");
            extentTest.log(Status.FAIL,"failed");
            e.printStackTrace();
        }
        }catch(Exception e){
            LoggerHandler.error("Not entered location");
            extentTest.log(Status.FAIL,"Not entered location");
            Reporter.attachScreenshot("enter location", extentTest, "enter location");
            
        }
    }

    /*
    * Method Name: clickContinueShopping
    * Author Name: prakash
    * Description: This method click on the continue shopping
    * Return Type: void
    * Parameter List: NA
    */
    public void clickContinueShopping(){
        try{
            helper.waitForElementToBeVisible(PlantLocators.continueshopping,10);
            helper.clickElement(PlantLocators.continueshopping);
            LoggerHandler.info("Click continue shopping");
            extentTest.info("Click continue shopping");
            extentTest.log(Status.PASS,"Click continue shopping");
            Thread.sleep(3000);
        }catch(Exception e){
            LoggerHandler.error("Not click continue shopping");
            extentTest.log(Status.FAIL,"Not click continue shopping");
            Reporter.attachScreenshot("continue shopping", extentTest, "continue shopping");
        }
    }
    /*
    * Method Name: clickPlant
    * Author Name: prakash
    * Description: This method is for click the plants
    * Return Type: void
    * Parameter List: NA
    */
    public void clickPlant(){
        try{
            Thread.sleep(2000);
            helper.waitForElementToBeVisible(PlantLocators.plant,10);
            helper.clickElement(PlantLocators.plant);
            LoggerHandler.info("Click plants");
            extentTest.info("Click plants");
            extentTest.log(Status.PASS,"Click plants");
        }catch(Exception e){
            LoggerHandler.error("Not click Plants");
            extentTest.log(Status.FAIL,"Not click Plants");
            Reporter.attachScreenshot("plants", extentTest, "plants");
        }
    }
    /*
    * Method Name: clickBamboo
    * Author Name: prakash
    * Description: This method is for click Bamboo
    * Return Type: void
    * Parameter List: NA
    */
    public void clickBamboo(){
        try{
            helper.waitForElementToBeVisible(PlantLocators.luckybamboo,10);
            helper.clickElement(PlantLocators.luckybamboo);
            helper.home();
            LoggerHandler.info("Click LuckyBamboo");
            extentTest.info("Click LuckyBamboo");
            extentTest.log(Status.PASS,"Click LuckyBamboo");
            Reporter.attachScreenshot("Lucky bamboo", extentTest, "Lucky bamboo");
        }catch(Exception e){
            LoggerHandler.error("Not click LuckyBamboo");
            extentTest.log(Status.FAIL,"Not click LuckyBamboo");
            Reporter.attachScreenshot("Lucky bamboo", extentTest, "Lucky bamboo");
        }
    }
    /*
    * Method Name: clickJadePlant
    * Author Name: prakash
    * Description: This method is for click jade plant
    * Return Type: void
    * Parameter List: NA
    */
    public void clickJadePlant(){
        try{
            Base.driver.navigate().back();
            helper.waitForElementToBeVisible(PlantLocators.jade_plants,10);
            helper.home();
            helper.clickElement(PlantLocators.jade_plants);
            LoggerHandler.info("Click Jade plants");
            extentTest.info("Click Jade plants");
            extentTest.log(Status.PASS,"Click Jade plants");
        }catch(Exception e){
            LoggerHandler.error("Not click Jade plants");
            extentTest.log(Status.FAIL,"Not click Jade plants");
            Reporter.attachScreenshot("Jade plants", extentTest, "Jade plants");
        }
    }
        /*
    * Method Name: clickMoneyPlant
    * Author Name: prakash
    * Description: This method is for click money plant
    * Return Type: void
    * Parameter List: NA
    */
    public void clickMoneyPlant(){
        try{
            Base.driver.navigate().back();
            helper.waitForElementToBeVisible(PlantLocators.money_plants,10);
            helper.clickElement(PlantLocators.money_plants);
            helper.home();
            LoggerHandler.info("Click Money plants");
            extentTest.info("Click Money plants");
            extentTest.log(Status.PASS,"Click Money plants");
        }catch(Exception e){
            LoggerHandler.error("Not click Money plants");
            extentTest.log(Status.FAIL,"Not click Money plants");
            Reporter.attachScreenshot("Money plant", extentTest, "Money plant");
        }
    }
            /*
    * Method Name: clickCart
    * Author Name: prakash
    * Description: This method si to click cart
    * Return Type: void
    * Parameter List: NA
    */
    public void clickCart(){
        try{
            Base.driver.navigate().back();
            helper.waitForElementToBeVisible(PlantLocators.cart,10);
            helper.clickElement(PlantLocators.cart);
            LoggerHandler.info("Click Cart");
            extentTest.info("Click Cart");
            extentTest.log(Status.PASS,"Click Cart");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                LoggerHandler.error("failed");
                extentTest.log(Status.FAIL,"failed");            }
            
        }catch(Exception e){
            LoggerHandler.error("Not click Cart");
            extentTest.log(Status.FAIL,"Not click Cart");
            Reporter.attachScreenshot("cart", extentTest, "cart");
        }
    }   
}