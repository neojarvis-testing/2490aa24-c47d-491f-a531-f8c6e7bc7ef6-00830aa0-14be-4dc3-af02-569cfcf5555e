package actions;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.FooterLinksVerificationLocator;
import utils.Assertion;
import utils.Base;
import utils.LoggerHandler;
import utils.Reporter;
import utils.WebDriverHelper;

public class FooterAction {

    WebDriverHelper helper;
    ExtentTest extentTest;
    ExtentReports extentReport;
    Assertion assertion;

    /*
     * Constructor Name: FooterAndVerificationActions
     * Author Name: Deeksha
     * Description: FooterAndVerificationActions Constructor
     */
    public FooterAction(ExtentTest extentTest) {
        helper = new WebDriverHelper(Base.driver);
        this.extentTest = extentTest;
    }

    /*
     * Method Name: scrollToFooter
     * Author Name: Deeksha
     * Description: This method used to scroll.
     * Return Type: void
     * Parameter List: NA
     */
    public void scrollToFooter() {
        try {
            helper.popup();
            helper.scroll(FooterLinksVerificationLocator.FNPBusiness);
            LoggerHandler.info("scrolled upto footer");
            extentTest.log(Status.INFO, "scrolled upto footer");
            extentTest.log(Status.PASS, "scrolled upto footer");
        } catch (Exception e) {
            LoggerHandler.error("Failed scrolling");
            extentTest.log(Status.INFO, "failed page scrolling");
            extentTest.log(Status.FAIL, "failed page scrolling");
            Reporter.attachScreenshot(" failed scrolled", extentTest, "failed scrolled");
        }
    }

    /*
     * Method Name: verifyDecorationLink
     * Author Name: Deeksha
     * Description: This method used to verify it correct link is opened.
     * Return Type: void
     * Parameter List: NA
     */
    public void verifyDecorationLink(String url) {
        try {
            helper.clickElement(FooterLinksVerificationLocator.FNPBusiness);
            Assertion.verifyUrl(url);
            LoggerHandler.info(" Page is verified");
            extentTest.log(Status.INFO, " Page is verified");
            extentTest.log(Status.PASS, " Page is verified");
            helper.back();
        } catch (Exception e) {
            LoggerHandler.error("Failed page verification");
            extentTest.log(Status.INFO, "failed page verification");
            extentTest.log(Status.FAIL, "failed page verification");
            Reporter.attachScreenshot("failed verification", extentTest, "failed verification");
        }
    }

    /*
     * Method Name: corporateServiceLink
     * Author Name: Deeksha
     * Description: This method used to verify correct link is opening or not.
     * Return Type: void
     * Parameter List: NA
     */
    public void corporateServiceLink(String url) {
        try {
            helper.scroll(FooterLinksVerificationLocator.corporateService);
            helper.waitForElementToBeVisible(FooterLinksVerificationLocator.corporateService, 10);
            helper.clickElement(FooterLinksVerificationLocator.corporateService);
            assertion.verifyUrl(url);
            LoggerHandler.info("Corporate Page is verified");
            extentTest.log(Status.INFO, "Corporate Page is verified");
            extentTest.log(Status.PASS, "Corporate Page is verified");
            helper.back();
        } catch (Exception e) {
            LoggerHandler.error("Failed page verification");
            extentTest.log(Status.INFO, "failed page verification");
            extentTest.log(Status.FAIL, "failed page verification");
            Reporter.attachScreenshot(" failed Corporate", extentTest, "failed Corporate");
        }
    }

    /*
     * Method Name: affiliateProgrameLink
     * Author Name: Deeksha
     * Description: This method used to verify correct link is opening or not.
     * Return Type: void
     * Parameter List: NA
     */
    public void affiliateProgrameLink(String url) {
        try {
            helper.scroll(FooterLinksVerificationLocator.affiliatePrograme);
            helper.waitForElementToBeVisible(FooterLinksVerificationLocator.affiliatePrograme, 10);
            helper.clickElement(FooterLinksVerificationLocator.affiliatePrograme);
            assertion.verifyUrl(url);
            LoggerHandler.info("Affiliate Programe Page is verified");
            extentTest.log(Status.INFO, "Affiliate Programe is verified");
            extentTest.log(Status.PASS, "Affiliate Programe is verified");
            helper.back();
        } catch (Exception e) {
            LoggerHandler.error("Failed page verification");
            extentTest.log(Status.INFO, "failed page verification");
            extentTest.log(Status.FAIL, "failed page verification");
            Reporter.attachScreenshot("failed Affiliate", extentTest, "failed Affiliate");
        }
    }

    /*
     * Method Name: retailStoresLink
     * Author Name: Deeksha
     * Description: This method used to verify correct link is opening or not.
     * Return Type: void
     * Parameter List: NA
     */
    public void retailStoresLink(String url) {
        try {
            helper.scroll(FooterLinksVerificationLocator.retailStores);
            helper.waitForElementToBeVisible(FooterLinksVerificationLocator.retailStores, 10);
            helper.clickElement(FooterLinksVerificationLocator.retailStores);
            assertion.verifyUrl(url);
            LoggerHandler.info("Retail Stores Page is verified");
            extentTest.log(Status.INFO, "Retail Stores Page is verified");
            extentTest.log(Status.PASS, "Retail Stores Page is verified");
            helper.back();
        } catch (Exception e) {
            LoggerHandler.error("Failed page verification");
            extentTest.log(Status.INFO, "failed page verification");
            extentTest.log(Status.FAIL, "failed page verification");
            Reporter.attachScreenshot("failed Retail Stores", extentTest, "failed Retail Stores");
        }
    }

    /*
     * Method Name: franchiseLink
     * Author Name: Deeksha
     * Description: This method used to verify correct link is opening or not.
     * Return Type: void
     * Parameter List: NA
     */
    public void franchiseLink(String url) {
        try {
            helper.scroll(FooterLinksVerificationLocator.franchies);
            helper.waitForElementToBeVisible(FooterLinksVerificationLocator.franchies, 10);
            helper.clickElement(FooterLinksVerificationLocator.franchies);
            assertion.verifyUrl(url);
            LoggerHandler.info("Franchise Page is verified");
            extentTest.log(Status.INFO, "Retail Stores Page is verified");
            extentTest.log(Status.PASS, "Retail Stores Page is verified");
            helper.back();
        } catch (Exception e) {
            LoggerHandler.error("Failed page verification");
            extentTest.log(Status.INFO, "failed page verification");
            extentTest.log(Status.FAIL, "failed page verification");
            Reporter.attachScreenshot("failed Franchise", extentTest, "failed Franchise");
        }
    }

    /*
     * Method Name: quotesNWishesLink
     * Author Name: Deeksha
     * Description: This method used to verify correct link is opening or not.
     * Return Type: void
     * Parameter List: NA
     */
    public void quotesNWishesLink(String url) {
        try {
            helper.scroll(FooterLinksVerificationLocator.QuotesNWishesLink);
            helper.waitForElementToBeVisible(FooterLinksVerificationLocator.QuotesNWishesLink, 10);
            helper.clickElement(FooterLinksVerificationLocator.QuotesNWishesLink);
            assertion.verifyUrl(url);
            LoggerHandler.info("Quotes N Wishes Page is verified");
            extentTest.log(Status.INFO, "Quotes N Wishes Page is verified");
            extentTest.log(Status.PASS, "Quotes N Wishes Page is verified");
            helper.back();
        } catch (Exception e) {
            LoggerHandler.error("Failed page verification");
            extentTest.log(Status.INFO, "failed page verification");
            extentTest.log(Status.FAIL, "failed page verification");
            Reporter.attachScreenshot("Failed QuotesNWishesLink", extentTest, " Failed QuotesNWishesLink");
        }
    }

    /*
     * Method Name: blogLink
     * Author Name: Deeksha
     * Description: This method used to verify correct link is opening or not.
     * Return Type: void
     * Parameter List: NA
     */
    public void blogLink(String url) {
        try {
            helper.scroll(FooterLinksVerificationLocator.blog);
            helper.waitForElementToBeVisible(FooterLinksVerificationLocator.blog, 10);
            helper.clickElement(FooterLinksVerificationLocator.blog);
            assertion.verifyUrl(url);
            LoggerHandler.info("Blog Page is verified");
            extentTest.log(Status.INFO, "Blog Page is verified");
            extentTest.log(Status.PASS, "Blog Page is verified");
            helper.back();
        } catch (Exception e) {
            LoggerHandler.error("Failed page verification");
            extentTest.log(Status.INFO, "failed page verification");
            extentTest.log(Status.FAIL, "failed page verification");
            Reporter.attachScreenshot("failed Blog", extentTest, "failed Blog");
        }
    }

}
