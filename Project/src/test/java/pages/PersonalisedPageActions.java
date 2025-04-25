package pages;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.PersonalisedPageLocators;
import utils.Assertion;
import utils.Base;
import utils.LoggerHandler;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;

public class PersonalisedPageActions {
    public static ExtentReports extentReport;
    public static ExtentTest extentTest;
    public static WebDriverHelper helper;
    public static Assertion assertion;

    /*
     * Constructor Name: PersonalisedPageActions
     * Author Name: Suhana
     * Description: PersonalisedPageActions Constructor.
     */

    public PersonalisedPageActions(ExtentTest extentTest){
        helper=new WebDriverHelper(Base.driver);
        this.extentTest = extentTest;
    }

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
     * Method Name: clickOnWhereToDeliver
     * Author Name: Suhana
     * Description: This method clicks on Where to Deliver.
     * Return Type: void
     * Parameter List: NA
     */


    public void clickOnWhereToDeliver(){
        try {
            
            helper.waitForElementToBeVisible(PersonalisedPageLocators.whereToDeliver,10);
            helper.clickElement(PersonalisedPageLocators.whereToDeliver);
            LoggerHandler.info("Clicked on Where to deliver?");
            extentTest.log(Status.INFO, "Clicked on Where to deliver?");
            extentTest.log(Status.PASS, "Clicked on Where to deliver?");
        } catch (Exception e) {
            LoggerHandler.error("Could not click on Where to deliver?");
            extentTest.log(Status.INFO, "Could not click on Where to deliver?");
            extentTest.log(Status.FAIL, "Could not click on Where to deliver?");
            Screenshot.captureScreenShot("Clicked Where to Deliver");
            Reporter.attachScreenshot("FNP_Report", extentTest, "Clicked Where to Deliver");
        }
    }

    /*
     * Method Name: enterKeyword
     * Author Name: Suhana
     * Description: This method enters the location.
     * Return Type: void
     * Parameter List: NA
     */

    public void enterKeyword(String value){
        try {
            helper.enterText(PersonalisedPageLocators.enterBar, value); 
            helper.waitForAction();
            helper.enterAction(PersonalisedPageLocators.enterBar); 
            helper.waitForAction();          
            LoggerHandler.info("Enter Bangalore");
            extentTest.log(Status.INFO, "Enter Bangalore");
            extentTest.log(Status.PASS, "Enter Bangalore");
        } catch (Exception e) {
            LoggerHandler.error("Could not enter Bangalore");
            extentTest.log(Status.INFO, "Could not enter Bangalore");
            extentTest.log(Status.FAIL, "Could not enter Bangalore");
            Screenshot.captureScreenShot("Entered Location name");
            Reporter.attachScreenshot("FNP_Report", extentTest, "Entered Location name");
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
            helper.waitForElementToBeVisible(PersonalisedPageLocators.continueShopping, 10);
            helper.clickElement(PersonalisedPageLocators.continueShopping);
            helper.waitForAction();
            LoggerHandler.info("verify the pincode");
            extentTest.log(Status.INFO, "verify the pincode");
            extentTest.log(Status.PASS, "verify the pincode");
        } catch (Exception e) {
            LoggerHandler.error("Could not click Continue Shopping button");
            extentTest.log(Status.INFO, "Could not click Continue Shopping button");
            extentTest.log(Status.FAIL, "Could not click Continue Shopping button");
            Screenshot.captureScreenShot("Continue Shopping button");
            Reporter.attachScreenshot("FNP_Report", extentTest, "Continue Shopping button");
        }
    }

    /*
     * Method Name: hoverOnPersonalised
     * Author Name: Suhana
     * Description: This method hovers on Personlised.
     * Return Type: void
     * Parameter List: NA
     */

    public void hoverOnPersonalised(){
        try {
            helper.waitForElementToBeVisible(PersonalisedPageLocators.personalised, 10);
            helper.hoverElement(PersonalisedPageLocators.personalised);
            LoggerHandler.info("Hovered on Magical Mugs");
            extentTest.log(Status.INFO, "Hovered on Magical Mugs");
            extentTest.log(Status.PASS, "Hovered on Magical Mugs");
        } catch (Exception e) {
            LoggerHandler.error("Could not hover on Magical Mugs");
            extentTest.log(Status.INFO, "Could not hover on Magical Mugs");
            extentTest.log(Status.FAIL, "Could not hover on Magical Mugs");
            Screenshot.captureScreenShot("Hover on Magical Mugs");
            Reporter.attachScreenshot("FNP_Report", extentTest, "Hover on Magical Mugs");
        }
    }

    /*
     * Method Name: clickMugs
     * Author Name: Suhana
     * Description: This method clicks on Mugs.
     * Return Type: void
     * Parameter List: NA
     */

    public void clickMugs(){
        try {
            helper.clickElement(PersonalisedPageLocators.mugs);
            helper.clickElement(PersonalisedPageLocators.magicalMugs);
            LoggerHandler.info("Clicked on Mugs");
            extentTest.log(Status.INFO, "Clicked on Mugs");
            extentTest.log(Status.PASS, "Clicked on Mugs");
        } catch (Exception e) {
            LoggerHandler.error("Could not click Mugs");
            extentTest.log(Status.INFO, "Could not click Mugs");
            extentTest.log(Status.FAIL, "Could not click Mugs");
            Screenshot.captureScreenShot("Clicked Mugs");
            Reporter.attachScreenshot("FNP_Report", extentTest, "Clicked Mugs");
        }
    }

    /*
     * Method Name: clickmagicalMugs
     * Author Name: Suhana
     * Description: This method clicks on Magical Mugs.
     * Return Type: void
     * Parameter List: NA
     */

    public void clickmagicalMugs(){
        try {
            helper.waitForElementToBeVisible(PersonalisedPageLocators.magicalMugs, 10);
            helper.clickElement(PersonalisedPageLocators.magicalMugs);
            LoggerHandler.info("Clicked on Magical Mugs");
            extentTest.log(Status.INFO, "Clicked on Magical Mugs");
            extentTest.log(Status.PASS, "Clicked on Magical Mugs");
        } catch (Exception e) {
            LoggerHandler.error("Could not click Magical Mugs");
            extentTest.log(Status.INFO, "Could not click Magical Mugs");
            extentTest.log(Status.FAIL, "Could not click Magical Mugs");
            Screenshot.captureScreenShot("Clicked Magical Mugs failed");    
            Reporter.attachScreenshot("FNP_Report", extentTest, "Clicked Magical Mugs");
        }
    }

    /*
     * Method Name: clickOnFirstProduct
     * Author Name: Suhana
     * Description: This method clicks on the first product.
     * Return Type: void
     * Parameter List: NA
     */

    public void clickOnFirstProduct(){
        try {
            helper.waitForElementToBeVisible(PersonalisedPageLocators.firstProduct, 10);
            helper.clickElement(PersonalisedPageLocators.firstProduct);
            LoggerHandler.info("Clicked on First Product");
            extentTest.log(Status.INFO, "Clicked on First Product");
            extentTest.log(Status.PASS, "Clicked on First Product");
        } catch (Exception e) {
            LoggerHandler.error("Could not click First Product");
            extentTest.log(Status.INFO, "Could not click First Product");
            extentTest.log(Status.FAIL, "Could not click First Product");
            Screenshot.captureScreenShot("Clicked first mug failed");    
            Reporter.attachScreenshot("FNP_Report", extentTest, "Clicked first mug");
        }
    }

    /*
     * Method Name: tabSwitch
     * Author Name: Suhana
     * Description: This method switches to a new tab.
     * Return Type: void
     * Parameter List: NA
     */

    public void tabSwitch(){
        try {
            helper.switchWindow();
            LoggerHandler.info("Verified new page text");
            extentTest.log(Status.INFO, "Verified new page text");
            extentTest.log(Status.PASS, "Verified new page text");
        } catch (Exception e) {
            LoggerHandler.error("Could not verify the new page text");
            extentTest.log(Status.INFO, "Could not verify the new page text");
            extentTest.log(Status.FAIL, "Could not verify the new page text");
            Screenshot.captureScreenShot("new page text");
            Reporter.attachScreenshot("FNP_Report", extentTest, "new page text");
        }
    }

    /*
     * Method Name: clickOnCart
     * Author Name: Suhana
     * Description: This method clicks on Add to Cart button.
     * Return Type: void
     * Parameter List: NA
     */

    public void clickOnCart(){
        try {
            
            helper.waitForElementToBeVisible(PersonalisedPageLocators.addToCart, 10);
            helper.clickElement(PersonalisedPageLocators.addToCart);
            LoggerHandler.info("Clicked on Add To Cart");
            extentTest.log(Status.INFO, "Clicked on Add To Cart");
            extentTest.log(Status.PASS, "Clicked on Add To Cart");
        } catch (Exception e) {
            LoggerHandler.error("Could not click Add To Cart");
            extentTest.log(Status.INFO, "Could not click Add To Cart");
            extentTest.log(Status.FAIL, "Could not click Add To Cart");
            Screenshot.captureScreenShot("cart");
            Reporter.attachScreenshot("FNP_Report", extentTest, "cart");
        }
    }

    /*
     * Method Name: availableScreenshot
     * Author Name: Suhana
     * Description: This method captures screenshot and attaches it to the report.
     * Return Type: void
     * Parameter List: NA
     */

    public void availableScreenshot(){
        try {
            Screenshot.captureScreenShot("Available");
            Reporter.attachScreenshot("FNP_Report", extentTest, "Available");
            LoggerHandler.info("Capture Screenshot");
            extentTest.log(Status.INFO, "Capture Screenshot");
            extentTest.log(Status.PASS, "Capture Screenshot");
        } catch (Exception e) {
            LoggerHandler.error("Could not capture Screenshot");
            extentTest.log(Status.INFO, "Could not capture Screenshot");
            extentTest.log(Status.FAIL, "Could not capture Screenshot");
            Screenshot.captureScreenShot("Screenshot");
            Reporter.attachScreenshot("FNP_Report", extentTest, "Screenshot");
        }
    }
}
