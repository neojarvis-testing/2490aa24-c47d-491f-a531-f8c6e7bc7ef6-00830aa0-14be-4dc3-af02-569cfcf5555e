package actions;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.BirthDayCakeLocator;
import utils.Base;
import utils.LoggerHandler;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;

public class BirthdayCakeAction {
    WebDriverHelper helper;
    ExtentTest extentTest;
    ExtentReports extentReport;

    /*
     * Constructor Name: BirthdayCakesActions
     * Author Name: Deeksha
     * Description: BirthdayCakesActions Constructor
     */
    public BirthdayCakeAction(ExtentTest extentTest) {
        helper = new WebDriverHelper(Base.driver);
        this.extentTest = extentTest;
    }

    /*
     * Method Name: selectLocation
     * Author Name: Deeksha
     * Description: This method is used to select location.
     * Return Type: void
     * Parameter List: NA
     */
    public void selectLocation() {
        try {
            helper.popup();
            helper.waitForElementToBeVisible(BirthDayCakeLocator.location, 10);
            helper.clickElement(BirthDayCakeLocator.location);
            LoggerHandler.info("clicked on where to deliver");
            extentTest.log(Status.INFO, "clicked on where to deiver");
            extentTest.log(Status.PASS, "clicked on where to deiver");
            Screenshot.captureScreenShot("where to deiver");
            Reporter.attachScreenshot("FNP_Report", extentTest, "Location");
        } catch (Exception e) {
            LoggerHandler.error("Failed to click on deliver");
            extentTest.log(Status.INFO, "failed to click on deliver");
            extentTest.log(Status.FAIL, "failed to click on deliver");
            Screenshot.captureScreenShot("Failed where to deiver");
            Reporter.attachScreenshot("FNP_Report", extentTest, "failed Location");
        }
    }

    /*
     * Method Name: searchLocation
     * Author Name: Deeksha
     * Description: This method used to search the location and enter.
     * Return Type: void
     * Parameter List: NA
     */
    public void searchLocation(String value) {
        try {
            helper.waitForAction();
            helper.enterText(BirthDayCakeLocator.searchLocation, value);
            helper.waitForAction();
            helper.enterAction(BirthDayCakeLocator.searchLocation);
            helper.waitForAction();
            LoggerHandler.info("clicked on Enter");
            extentTest.log(Status.INFO, "clicked on Enter");
            extentTest.log(Status.PASS, "clicked on Enter");
            Screenshot.captureScreenShot("where to deiver");
            Reporter.attachScreenshot("FNP_Report", extentTest, "Location");
        } catch (Exception e) {
            LoggerHandler.error("Failed to click Enter");
            extentTest.log(Status.INFO, "failed to click Enter");
            extentTest.log(Status.FAIL, "failed to click Enter");
            Reporter.attachScreenshot("failed to click Search", extentTest, "Search");
        }
    }

    /*
     * Method Name: continueShopping
     * Author Name: Deeksha
     * Description: This method used to click on continue button in address field.
     * Return Type: void
     * Parameter List: NA
     */
    public void continueShopping() {
        try {
            helper.waitForElementToBeVisible(BirthDayCakeLocator.continueshopping, 10);
            helper.clickElement(BirthDayCakeLocator.continueshopping);
            helper.waitForAction();
            LoggerHandler.info("clicked on Continue Shopping");
            extentTest.log(Status.INFO, "clicked on Continue Shopping");
            extentTest.log(Status.PASS, "clicked on Continue Shopping");
        } catch (Exception e) {
            LoggerHandler.error("Failed to click on Continue Shopping");
            extentTest.log(Status.INFO, "failed to click on Continue Shopping");
            extentTest.log(Status.FAIL, "failed to click on Continue Shopping");
            Reporter.attachScreenshot("failed Continue button", extentTest, "failed Continue button");
        }
    }

    /*
     * Method Name: hoverOnCakes
     * Author Name: Deeksha
     * Description: This method used to hover on menubar and click on product
     * Return Type: void
     * Parameter List: NA
     */
    public void hoverOnCakes() {
        try {
            helper.waitForElementToBeVisible(BirthDayCakeLocator.hovercakes, 10);
            helper.hoverElement(BirthDayCakeLocator.hovercakes);
            LoggerHandler.info("clicked on cakes");
            extentTest.log(Status.INFO, "clicked on cakes");
            extentTest.log(Status.PASS, "clicked on cakes");
        } catch (Exception e) {
            LoggerHandler.error("Failed to click on Cakes");
            extentTest.log(Status.INFO, "failed to click on Cakes");
            extentTest.log(Status.FAIL, "failed to click on Cakes");
            Reporter.attachScreenshot("cakes failed", extentTest, "cakes failed");
        }

    }

    /*
     * Method Name: birthdayCakes
     * Author Name: Deeksha
     * Description: This method used to select the product .
     * Return Type: void
     * Parameter List: NA
     */
    public void birthdayCakes() {
        try {
            helper.waitForElementToBeVisible(BirthDayCakeLocator.birthdayCakes, 10);
            helper.hoverElement(BirthDayCakeLocator.birthdayCakes);
            helper.clickElement(BirthDayCakeLocator.birthdayCakes);
            LoggerHandler.info("clicked on Birthday Cakes");
            extentTest.log(Status.INFO, "clicked on Birthday Cakes");
            extentTest.log(Status.PASS, "clicked on Birthday Cakes");
        } catch (Exception e) {
            LoggerHandler.error("Failed to click on Birthday Cakes");
            extentTest.log(Status.INFO, "failed to click on Birthday Cakes");
            extentTest.log(Status.FAIL, "failed to click on Birthday Cakes");
            Reporter.attachScreenshot("failed Birthday cakes", extentTest, "failed Birthday cakes");
        }
    }

    /*
     * Method Name: sameDayDelivery
     * Author Name: Deeksha
     * Description: This method used to check the element is visible and clickable.
     * Return Type: void
     * Parameter List: NA
     */
    public void sameDayDelivery() {
        try {
            helper.waitForElementToBeVisible(BirthDayCakeLocator.sameday, 10);
            helper.clickElement(BirthDayCakeLocator.sameday);
            LoggerHandler.info("clicked on Same Day Delivery");
            extentTest.log(Status.INFO, "clicked on Same Day Delivery");
            extentTest.log(Status.PASS, "clicked on Same Day Delivery");
        } catch (Exception e) {
            LoggerHandler.error("Failed to click on Same Day Delivery");
            extentTest.log(Status.INFO, "failed to click on Same Day Delivery");
            extentTest.log(Status.FAIL, "failed to click on Same Day Delivery");
            Reporter.attachScreenshot("failed same say delivery", extentTest, "failed same day delivary");
        }
    }

    /*
     * Method Name: firstProduct
     * Author Name: Deeksha
     * Description: This method used to click on the given product.
     * Return Type: void
     * Parameter List: NA
     */
    public void firstProduct() {
        try {
            helper.waitForElementToBeVisible(BirthDayCakeLocator.product, 10);
            helper.clickElement(BirthDayCakeLocator.product);
            LoggerHandler.info("click on the first product");
            extentTest.log(Status.INFO, "click on the first product");
            extentTest.log(Status.PASS, "click on the first product");
        } catch (Exception e) {
            LoggerHandler.error("Failed to click on first product");
            extentTest.log(Status.INFO, "failed to click on first product");
            extentTest.log(Status.FAIL, "failed to click on first product");
            Reporter.attachScreenshot("failed first product", extentTest, "failed first product");
        }
    }

    /*
     * Method Name: verifyCakeText
     * Author Name: Deeksha
     * Description: This method verifies the text
     * Return Type: void
     * Parameter List: NA
     */
    public void verifyCakeText() {
        try {
            helper.waitForAction();
            LoggerHandler.info("verified relevant text");
            extentTest.log(Status.INFO, "verified relevant text");
            extentTest.log(Status.PASS, "verified relevant text");
        } catch (Exception e) {
            LoggerHandler.error("Failed to verify");
            extentTest.log(Status.INFO, "Failed to verify");
            extentTest.log(Status.FAIL, "Failed to verify");
            Reporter.attachScreenshot("Failed relevant text", extentTest, "Failed relevant text");
        }

    }

    /*
     * Method Name: productAddToCart
     * Author Name: Deeksha
     * Description: This method used to add product in cart.
     * Return Type: void
     * Parameter List: NA
     */
    public void productAddToCart() {
        try {
            helper.switchWindow();
            helper.waitForElementToBeVisible(BirthDayCakeLocator.addcart, 10);
            helper.clickElement(BirthDayCakeLocator.addcart);
            LoggerHandler.info("clicked on Add to Cart");
            extentTest.log(Status.INFO, "clicked on Add to Cart");
            extentTest.log(Status.PASS, "clicked on Add to Cart");
        } catch (Exception e) {
            LoggerHandler.error("Failed to click on Add to Cart");
            extentTest.log(Status.INFO, "failed to click on Add to Cart");
            extentTest.log(Status.FAIL, "failed to click on Add to Cart");
            Reporter.attachScreenshot("Failed Offers_screenshot", extentTest, "Offers_screenshot");
        }
    }
}
