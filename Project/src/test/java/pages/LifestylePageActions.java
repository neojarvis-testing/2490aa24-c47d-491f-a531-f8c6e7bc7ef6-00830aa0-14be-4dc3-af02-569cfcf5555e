package pages;

import java.time.Duration;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.LifestylePageLocators;
import utils.Assertion;
import utils.Base;
import utils.ExcelReader;
import utils.LoggerHandler;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;

public class LifestylePageActions {
    ExtentReports extentReport;
    ExtentTest extentTest;
    WebDriverHelper helper;
    Assertion assertion;

    /*
     * Constructor Name: LifestylePageActions
     * Author Name: Suhana
     * Description: LifestylePageActions Constructor.
     */

    public LifestylePageActions(ExtentTest extentTest){
        helper = new WebDriverHelper(Base.driver);
        this.extentTest=extentTest;
    }

    /*
     * Method Name: closePopUp
     * Author Name: Suhana
     * Description: This method clicks on the Pop up.
     * Return Type: void
     * Parameter List: NA
     */

     public void closePopUp(){
        try {
            helper.popup();
            LoggerHandler.info("Clicked on No Thanks");
            extentTest.log(Status.INFO, "Clicked on No Thanks");
            extentTest.log(Status.PASS, "Clicked on No Thanks");
        } catch (Exception e) {
            LoggerHandler.error("Could not click on No Thanks");
            extentTest.log(Status.INFO, "Could not click on No Thanks");
            extentTest.log(Status.FAIL, "Could not click on No Thanks");
            Screenshot.captureScreenShot("popUp");
            Reporter.attachScreenshot("FNP_Report", extentTest, "popUp");
        }
    }

    /*
     * Method Name: clickOnDeliver
     * Author Name: Suhana
     * Description: This method clicks on Where to Deliver.
     * Return Type: void
     * Parameter List: NA
     */


    public void clickOnDeliver(){
        try {
            helper.clickElement(LifestylePageLocators.location);
            LoggerHandler.info("Clicked on Location");
            extentTest.log(Status.INFO, "Clicked on Location");
            extentTest.log(Status.PASS, "Clicked on Location");
        } catch (Exception e) {
            Screenshot.captureScreenShot("Clicked Location");
            Reporter.attachScreenshot("FNP_Report", extentTest, "Clicked Location");
            LoggerHandler.error("Could not click on location");
            extentTest.log(Status.INFO, "Could not click on location");
            extentTest.log(Status.FAIL, "Could not click on location");
        }
    }

    /*
     * Method Name: enterLocation
     * Author Name: Suhana
     * Description: This method clicks on Location search bar.
     * Return Type: void
     * Parameter List: NA
     */

    public void enterLocation(String value){
        try {
            helper.enterText(LifestylePageLocators.searchBar, value);
            helper.waitForAction();
            helper.enterAction(LifestylePageLocators.searchBar);
            helper.waitForAction();
            LoggerHandler.info("verify the pincode");
            extentTest.log(Status.INFO, "verify the pincode");
            extentTest.log(Status.PASS, "verify the pincode");
        } catch (Exception e) {
            LoggerHandler.error("Could not verify the pincode");
            extentTest.log(Status.INFO, "Could not verify the pincode");
            extentTest.log(Status.FAIL, "Could not verify the pincode");
            Screenshot.captureScreenShot("Enter Location");
            Reporter.attachScreenshot("FNP_Report", extentTest, "Entered Location");
        }
        
    }

    /*
     * Method Name: clickOnContinueShopping
     * Author Name: Suhana
     * Description: This method clicks on Continue Shopping button.
     * Return Type: void
     * Parameter List: NA
     */

    public void clickOnContinueShopping(){
        try {
            helper.waitForElementToBeVisible(LifestylePageLocators.continueShopping,10);
            helper.clickElement(LifestylePageLocators.continueShopping);
            helper.waitForAction();
            LoggerHandler.info("Clicked on Continue Shopping Button");
            extentTest.log(Status.INFO, "Clicked on Continue Shopping Button");
            extentTest.log(Status.PASS, "Clicked on Continue Shopping Button");
        } catch (Exception e) {
            LoggerHandler.error("Could not click Continue Shopping Button");
            extentTest.log(Status.INFO, "Could not click Continue Shopping Button");
            extentTest.log(Status.FAIL, "Could not click Continue Shopping Button");
            Screenshot.captureScreenShot("Continue Shopping");
            Reporter.attachScreenshot("FNP_Report", extentTest, "Continue Shopping");
        }
    }

    /*
     * Method Name: hoverOnLifestyle
     * Author Name: Suhana
     * Description: This method hovers on Lifestyle.
     * Return Type: void
     * Parameter List: NA
     */

    public void hoverOnLifestyle(){
        try {
            helper.waitForElementToBeVisible(LifestylePageLocators.lifestyle, 10);
            helper.hoverElement(LifestylePageLocators.lifestyle);
            LoggerHandler.info("Hovered on Lifestyle");
            extentTest.log(Status.INFO, "Hovered on Lifestyle");
            extentTest.log(Status.PASS, "Hovered on Lifestyle");
        } catch (Exception e) {
            LoggerHandler.error("Could not hover on Lifestyle");
            extentTest.log(Status.INFO, "Could not hover on Lifestyle");
            extentTest.log(Status.FAIL, "Could not hover on Lifestyle");
            Screenshot.captureScreenShot("Hover Lifestyle");
            Reporter.attachScreenshot("FNP_Report", extentTest, "Hover Lifestyle");
        }
    }

    /*
     * Method Name: clickOnJewellery
     * Author Name: Suhana
     * Description: This method clicks on Jewellery.
     * Return Type: void
     * Parameter List: NA
     */

    public void clickOnJewellery(){
        try {
            helper.clickElement(LifestylePageLocators.jewellery);
            helper.clickElement(LifestylePageLocators.rings);
            LoggerHandler.info("Clicked on Jewellery");
            extentTest.log(Status.INFO, "Clicked on Jewellery");
            extentTest.log(Status.PASS, "Clicked on Jewellery");
        } catch (Exception e) {
            LoggerHandler.error("Could not click Jewellery");
            extentTest.log(Status.INFO, "Could not click Jewellery");
            extentTest.log(Status.FAIL, "Could not click Jewellery");
            Screenshot.captureScreenShot("Clicked Jewellery");
            Reporter.attachScreenshot("FNP_Report", extentTest, "Clicked Jewellery");
        }
    }

    /*
     * Method Name: clickOnRings
     * Author Name: Suhana
     * Description: This method clicks on Rings.
     * Return Type: void
     * Parameter List: NA
     */

    public void clickOnRings(){
        try {
            helper.waitForElementToBeVisible(LifestylePageLocators.rings, 10);
            helper.clickElement(LifestylePageLocators.rings);
            LoggerHandler.info("Clicked on Rings");
            extentTest.log(Status.INFO, "Clicked on Rings");
            extentTest.log(Status.PASS, "Clicked on Rings");
        } catch (Exception e) {
            LoggerHandler.error("Could not click Rings");
            extentTest.log(Status.INFO, "Could not click Rings");
            extentTest.log(Status.FAIL, "Could not click Rings");
            Screenshot.captureScreenShot("Clicked Rings");
            Reporter.attachScreenshot("FNP_Report", extentTest, "Clicked Rings");
        }

    }

    /*
     * Method Name: clickOnfirstProduct
     * Author Name: Suhana
     * Description: This method clicks on the first product.
     * Return Type: void
     * Parameter List: NA
     */

    public void clickOnfirstProduct(){
        try {
            helper.waitForElementToBeVisible(LifestylePageLocators.firstProduct, 10);
            helper.clickElement(LifestylePageLocators.firstProduct);
            LoggerHandler.info("click on the first product");
            extentTest.log(Status.INFO, "click on the first product");
            extentTest.log(Status.PASS, "click on the first product");
        } catch (Exception e) {
            LoggerHandler.error("Could not click First Ring");
            extentTest.log(Status.INFO, "Could not click First Ring");
            extentTest.log(Status.FAIL, "Could not click First Ring");
            Screenshot.captureScreenShot("Clicked first ring");
            Reporter.attachScreenshot("FNP_Report", extentTest, "Clicked first ring");
        }
    }

    /*
     * Method Name: switchTab
     * Author Name: Suhana
     * Description: This method switches to a new tab.
     * Return Type: void
     * Parameter List: NA
     */

    public void switchTab(){
        try {
            helper.switchWindow();
            LoggerHandler.info("Verified the text");
            extentTest.log(Status.INFO, "Verified the text");
            extentTest.log(Status.PASS, "Verified the text");
        } catch (Exception e) {
            LoggerHandler.error("Could not verify the text");
            extentTest.log(Status.INFO, "Could not verify the text");
            extentTest.log(Status.FAIL, "Could not verify the text");
            Screenshot.captureScreenShot("Verified the text");
            Reporter.attachScreenshot("FNP_Report", extentTest, "Verified the text");
        }
    }

    /*
     * Method Name: clickOnAddToCart
     * Author Name: Suhana
     * Description: This method clicks on Add to Cart button.
     * Return Type: void
     * Parameter List: NA
     */

    public void clickOnAddToCart(){
        try {
            helper.waitForElementToBeVisible(LifestylePageLocators.addToCart, 10);
            helper.clickElement(LifestylePageLocators.addToCart);
            LoggerHandler.info("Clicked on Add To Cart Button");
            extentTest.log(Status.INFO, "Clicked on Add To Cart Button");
            extentTest.log(Status.PASS, "Clicked on Add To Cart Button");
        } catch (Exception e) {
            LoggerHandler.error("Could not click Add To Cart Button");
            extentTest.log(Status.INFO, "Could not click Add To Cart Button");
            extentTest.log(Status.FAIL, "Could not click Add To Cart Button");
            Screenshot.captureScreenShot("Reviews");
            Reporter.attachScreenshot("FNP_Report", extentTest, "Reviews");
        }
    }

    /*
     * Method Name: reviewsScreenshot
     * Author Name: Suhana
     * Description: This method captures screenshot and attaches it to the report.
     * Return Type: void
     * Parameter List: NA
     */

     public void reviewsScreenshot(){
        try {
            Screenshot.captureScreenShot("Reviews");
            Reporter.attachScreenshot("FNP_Report", extentTest, "Reviews");
            LoggerHandler.info("Capture Screenshot");
            extentTest.log(Status.INFO, "Capture Screenshot");
            extentTest.log(Status.PASS, "Capture Screenshot");
        } catch (Exception e) {
            LoggerHandler.error("Could not capture Screenshot");
            extentTest.log(Status.FAIL, "Could not capture Screenshot");
            Screenshot.captureScreenShot("Screenshot");
            Reporter.attachScreenshot("FNP_Report", extentTest, "Screenshot");
        }
    }
}
