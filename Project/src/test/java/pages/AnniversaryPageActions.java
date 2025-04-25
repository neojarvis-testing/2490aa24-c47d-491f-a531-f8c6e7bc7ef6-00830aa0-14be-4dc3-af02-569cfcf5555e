package pages;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import uistore.AnniversaryPageLocators;
import utils.Assertion;
import utils.Base;
import utils.LoggerHandler;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;

public class AnniversaryPageActions {
    public ExtentReports extentReport;
    public ExtentTest extentTest;
    public WebDriverHelper helper;
    public Assertion assertion;

    /*
     * Method name: AnniversaryPageActions
     * Author Name: Lagisetty Srihith
     * Description: This is the constructor
     * Parameters: None
     * Return type: void
     */
    public AnniversaryPageActions(ExtentTest extentTest) {
        helper = new WebDriverHelper(Base.driver);
        this.extentTest = extentTest;
    }

    /*
     * Method name: clickOnWhereToDeliver
     * Author Name: Lagisetty Srihith
     * Description: This methods click on Where to Deliver
     * Parameters: None
     * Return type: void
     */
    public void clickOnWhereToDeliver() {
        try {
            helper.clickNoThanks();
            helper.waitForElementToBeVisible(AnniversaryPageLocators.whereToDeliver,10);
            helper.clickElement(AnniversaryPageLocators.whereToDeliver);
            LoggerHandler.info("Clicked where to deliver");
            extentTest.log(Status.PASS, "Clicked on where to deliver");
        } catch (Exception e) {
            LoggerHandler.info("Couldn't click where to deliver");
            extentTest.log(Status.FAIL, "Couldn't click on where to deliver");
            Screenshot.captureScreenShot("click_On_Where_To_Deliver");
            Reporter.attachScreenshot("click_On_Where_To_Deliver", extentTest, "Couldn't click On Where To Deliver");
        }
    }

    /*
     * Method name: inputCity
     * Author Name: Lagisetty Srihith
     * Description: This methods enters
     * Parameters: None
     * Return type: void
     */
    public void inputCity(String city) {
        try {
            helper.enterText(AnniversaryPageLocators.inputLocation, city);
            helper.waitForAction();
            helper.enterAction(AnniversaryPageLocators.inputLocation);
            helper.waitForAction();
            LoggerHandler.info("Entered city");
            extentTest.log(Status.INFO, "Entered city");
            extentTest.log(Status.PASS, "Entered city");
        } catch (Exception e) {
            LoggerHandler.info("Couldn't entered city");
            extentTest.log(Status.INFO, "Couldn't entered city");
            extentTest.log(Status.FAIL, "Couldn't entered city");
            Reporter.attachScreenshot("input_City", extentTest, "Couldn't give input");
        }
    }

    /*
     * Method name: clickOnContinueShopping
     * Author Name: Lagisetty Srihith
     * Description: This methods click on Continue Shopping
     * Parameters: None
     * Return type: void
     */
    public void clickOnContinueShopping() {
        try {
            helper.waitForElementToBeVisible(AnniversaryPageLocators.continueShopping, 10);
            helper.clickElement(AnniversaryPageLocators.continueShopping);
            helper.waitForAction();
            LoggerHandler.info("Clicked on Continue Shopping");
            extentTest.log(Status.INFO, "Clicked on Continue Shopping");
            extentTest.log(Status.PASS, "Clicked on Continue Shopping");
        } catch (Exception e) {
            LoggerHandler.info("Couldn't click on Continue Shopping");
            extentTest.log(Status.INFO, "Couldn't click on Continue Shopping");
            extentTest.log(Status.FAIL, "Couldn't click on Continue Shopping");
            Reporter.attachScreenshot("click_On_Continue_Shopping", extentTest, "Couldn't click On Continue Shopping");
        }
    }

    /*
     * Method name: hoverOnAnniversary
     * Author Name: Lagisetty Srihith
     * Description: This methods hovers on Anniversary
     * Parameters: None
     * Return type: void
     */
    public void hoverOnAnniversary() {
        try {
            helper.waitForElementToBeVisible(AnniversaryPageLocators.anniversary, 10);
            helper.hoverElement(AnniversaryPageLocators.anniversary);
            LoggerHandler.info("Hovered on anniversary");
            extentTest.log(Status.INFO, "Hovered on anniversary");
            extentTest.log(Status.PASS, "Hovered on anniversary");
        } catch (Exception e) {
            LoggerHandler.info("Couldn't hovered on anniversary");
            extentTest.log(Status.INFO, "Couldn't hovered on anniversary");
            extentTest.log(Status.FAIL, "Couldn't hovered on anniversary");
            Reporter.attachScreenshot("hover_On_Anniversary", extentTest, "Couldn't hover on Anniversary");
        }
    }

    /*
     * Method name: clickOnFlowersAndRoses
     * Author Name: Lagisetty Srihith
     * Description: This methods click Flowers
     * Parameters: None
     * Return type: void
     */
    public void clickOnFlowersAndRoses() {
        try {
            helper.clickElement(AnniversaryPageLocators.flowers);
            LoggerHandler.info("Clicked on flowers");
            extentTest.log(Status.INFO, "Clicked on flowers");
            extentTest.log(Status.PASS, "Clicked on flowers");
            helper.clickElement(AnniversaryPageLocators.roses);
            LoggerHandler.info("Clicked on roses");
            extentTest.log(Status.INFO, "Clicked on roses");
            extentTest.log(Status.PASS, "Clicked on roses");
        } catch (Exception e) {
            LoggerHandler.info("Couldn't click on flowers");
            extentTest.log(Status.INFO, "Couldn't click on flowers");
            extentTest.log(Status.FAIL, "Couldn't click on flowers");
            LoggerHandler.info("Couldn't click on roses");
            extentTest.log(Status.INFO, "Couldn't click on roses");
            extentTest.log(Status.FAIL, "Couldn't click on roses");
            Reporter.attachScreenshot("click_On_Flowers_And_Roses", extentTest, "Couldn't click on Flowers and Roses");
        }
    }


    /*
     * Method name: clickOnFirstProduct
     * Author Name: Lagisetty Srihith
     * Description: This methods click on the first product in the list
     * Parameters: None
     * Return type: void
     */
    public void clickOnFirstProduct() {
        try {
            helper.waitForElementToBeVisible(AnniversaryPageLocators.firstProd,10);
            helper.clickElement(AnniversaryPageLocators.firstProd);
            LoggerHandler.info("click on the first product");
            extentTest.log(Status.INFO, "click on the first product");
            extentTest.log(Status.PASS, "click on the first product");
            helper.switchWindow();
            LoggerHandler.info("Window switched");
            extentTest.log(Status.INFO, "Window switched");
            extentTest.log(Status.PASS, "Window switched");
        } catch (Exception e) {
            LoggerHandler.info("Couldn't click on the first product");
            extentTest.log(Status.INFO, "Couldn't click on the first product");
            extentTest.log(Status.FAIL, "Couldn't click on the first product");
            LoggerHandler.info("Couldn't switch window");
            extentTest.log(Status.INFO, "Couldn't switch window");
            extentTest.log(Status.FAIL, "Couldn't switch window");
            Reporter.attachScreenshot("click_On_Where_To_Deliver", extentTest, "click On Where To Deliver");
        }
    }

    /*
     * Method name: clickOnBuyNow
     * Author Name: Lagisetty Srihith
     * Description: This methods click on Buy Now
     * Parameters: None
     * Return type: void
     */
    public void clickOnBuyNow() {
        try {
            helper.waitForElementToBeVisible(AnniversaryPageLocators.buyNow,10);
            helper.clickElement(AnniversaryPageLocators.buyNow);
            LoggerHandler.info("Clicked on Buy Now");
            extentTest.log(Status.INFO, "Clicked on Buy Now");
            extentTest.log(Status.PASS, "Clicked on Buy Now");
        } catch (Exception e) {
            LoggerHandler.info("Couldn't click on Buy Now");
            extentTest.log(Status.INFO, "Couldn't click on Buy Now");
            extentTest.log(Status.FAIL, "Couldn't click on Buy Now");
            Reporter.attachScreenshot("click_On_Buy_Now", extentTest, "Couldn't click On Buy Now");
        }
    }

    /*
     * Method name: verifyHome
     * Author Name: Lagisetty Srihith
     * Description: This methods verifies on string Home
     * Parameters: None
     * Return type: void
     */
    public void verifyHome(String text) {
        try {
            assertion.verifyText(AnniversaryPageLocators.home, text);
            Screenshot.captureScreenShot("first product");
            Reporter.attachScreenshot("first_product", extentTest, "This is the first product");
            LoggerHandler.info("Assertion done");
            extentTest.log(Status.INFO, "Assertion done");
            extentTest.log(Status.PASS, "Assertion done");
        } catch (Exception e) {
            LoggerHandler.info("Assertion failed");
            extentTest.log(Status.INFO, "Assertion failed");
            extentTest.log(Status.FAIL, "Assertion failed");
            Reporter.attachScreenshot("verify_Home", extentTest, "Couldn't verify Home");
        }
    }
}