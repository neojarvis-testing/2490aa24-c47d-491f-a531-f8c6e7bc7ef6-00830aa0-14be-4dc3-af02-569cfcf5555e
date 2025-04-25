package pages;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.FooterLocators;
import utils.Assertion;
import utils.Base;
import utils.LoggerHandler;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;

public class FooterPageActions {
    public ExtentReports extentReport;
    public ExtentTest extentTest;
    public WebDriverHelper helper;
    public Assertion assertion;

    /*
     * Method name: FooterPageActions
     * Author Name: Lagisetty Srihith
     * Description: This is the constructor
     * Parameters: None
     * Return type: void
     */
    public FooterPageActions(ExtentTest extentTest) {
        helper = new WebDriverHelper(Base.driver);
        this.extentTest = extentTest;
    }

    /*
     * Method name: verifyTermsAndConditions
     * Author Name: Lagisetty Srihith
     * Description: This methods verifies the URL
     * Parameters: None
     * Return type: void
     */
    public void verifyTermsAndConditions(String termsAndConditionsURL) {
        try {
            helper.clickNoThanks();
            helper.scroll(FooterLocators.termsAndConditions);
            LoggerHandler.info("Scrolled to Terms and Conditions");
            extentTest.log(Status.INFO, "Scrolled to Terms and Conditions");
            extentTest.log(Status.PASS, "Scrolled to Terms and Conditions");
            helper.clickElement(FooterLocators.termsAndConditions);
            LoggerHandler.info("Clicked on Terms and Conditions");
            extentTest.log(Status.PASS, "Clicked on Terms and Conditions");
            assertion.verifyUrl(termsAndConditionsURL);
            LoggerHandler.info("Terms and Conditions url is correct");
            extentTest.log(Status.INFO, "Terms and Conditions url is correct");
            extentTest.log(Status.PASS, "Terms and Conditions url is correct");
            helper.back();
        } catch (Exception e) {
            LoggerHandler.info("Terms and Conditions url is incorrect");
            extentTest.log(Status.INFO, "Terms and Conditions url is incorrect");
            extentTest.log(Status.FAIL, "Terms and Conditions url is incorrect");
            Reporter.attachScreenshot("verify_Terms_And_Conditions", extentTest, "Couldn't verify URL");

        }
    }

    /*
     * Method name: verifyPrivacyPolicy
     * Author Name: Lagisetty Srihith
     * Description: This methods verifies the URL
     * Parameters: None
     * Return type: void
     */
    public void verifyPrivacyPolicy(String privacyPolicyURL) {
        try {
            helper.scroll(FooterLocators.privacyPolicy);
            LoggerHandler.info("Scrolled to Privacy Policy");
            extentTest.log(Status.INFO, "Scrolled to Privacy Policy");
            extentTest.log(Status.PASS, "Scrolled to Privacy Policy");
            helper.clickElement(FooterLocators.privacyPolicy);
            LoggerHandler.info("Clicked on Privacy Policy");
            extentTest.log(Status.INFO, "Clicked on Privacy Policy");
            extentTest.log(Status.PASS, "Clicked on Privacy Policy");
            assertion.verifyUrl(privacyPolicyURL);
            LoggerHandler.info("Privacy Policy url is correct");
            extentTest.log(Status.INFO, "Privacy Policy url is correct");
            extentTest.log(Status.PASS, "Privacy Policy url is correct");
            helper.back();
        } catch (Exception e) {
            LoggerHandler.info("Privacy Policy url is incorrect");
            extentTest.log(Status.INFO, "Privacy Policy url is incorrect");
            extentTest.log(Status.FAIL, "Privacy Policy url is incorrect");
            Reporter.attachScreenshot("verify_Privacy_Policy", extentTest, "Couldn't verify URL");
        }
    }

    /*
     * Method name: verifyTermsOfUse
     * Author Name: Lagisetty Srihith
     * Description: This methods verifies the URL
     * Parameters: None
     * Return type: void
     */
    public void verifyTermsOfUse(String termsOfUseURL) {
        try {
            helper.scroll(FooterLocators.termsOfUse);
            LoggerHandler.info("Scrolled to Terms of Use");
            extentTest.log(Status.INFO, "Scrolled to Terms of Use");
            extentTest.log(Status.PASS, "Scrolled to Terms of Use");
            helper.clickElement(FooterLocators.termsOfUse);
            LoggerHandler.info("Clicked on Terms of Use");
            extentTest.log(Status.INFO, "Clicked on Terms of Use");
            extentTest.log(Status.PASS, "Clicked on Terms of Use");
            assertion.verifyUrl(termsOfUseURL);
            LoggerHandler.info("Terms of Use url is correct");
            extentTest.log(Status.INFO, "Terms of Use url is correct");
            extentTest.log(Status.PASS, "Terms of Use url is correct");
            helper.back();
        } catch (Exception e) {
            LoggerHandler.info("Terms of Use url is incorrect");
            extentTest.log(Status.INFO, "Terms of Use url is incorrect");
            extentTest.log(Status.FAIL, "Terms of Use url is incorrect");
            Reporter.attachScreenshot("verify_Terms_Of_Use", extentTest, "Couldn't verify URL");
        }
    }

    /*
     * Method name: verifyDisclaimer
     * Author Name: Lagisetty Srihith
     * Description: This methods verifies the URL
     * Parameters: None
     * Return type: void
     */
    public void verifyDisclaimer(String disclaimerURL) {
        try {
            helper.scroll(FooterLocators.disclaimer);
            LoggerHandler.info("Scrolled to Disclaimer");
            extentTest.log(Status.INFO, "Scrolled to Disclaimer");
            extentTest.log(Status.PASS, "Scrolled to Disclaimer");
            helper.clickElement(FooterLocators.disclaimer);
            LoggerHandler.info("Clicked on Disclaimer");
            extentTest.log(Status.INFO, "Clicked on Disclaimer");
            extentTest.log(Status.PASS, "Clicked on Disclaimer");
            assertion.verifyUrl(disclaimerURL);
            LoggerHandler.info("Disclaimer url is correct");
            extentTest.log(Status.INFO, "Disclaimer url is correct");
            extentTest.log(Status.PASS, "Disclaimer url is correct");
            helper.back();
        } catch (Exception e) {
            LoggerHandler.info("Disclaimer url is incorrect");
            extentTest.log(Status.INFO, "Disclaimer url is incorrect");
            extentTest.log(Status.FAIL, "Disclaimer url is incorrect");
            Reporter.attachScreenshot("verify_Disclaimer", extentTest, "Couldn't verify URL");
        }
    }

    /*
     * Method name: verifyAboutUs
     * Author Name: Lagisetty Srihith
     * Description: This methods verifies the URL
     * Parameters: None
     * Return type: void
     */
    public void verifyAboutUs(String aboutUsURL) {
        try {
            helper.scroll(FooterLocators.aboutUs);
            LoggerHandler.info("Scrolled to About Us");
            extentTest.log(Status.INFO, "Scrolled to About Us");
            extentTest.log(Status.PASS, "Scrolled to About Us");
            helper.clickElement(FooterLocators.aboutUs);
            LoggerHandler.info("Clicked on About Us");
            extentTest.log(Status.INFO, "Clicked on About Us");
            extentTest.log(Status.PASS, "Clicked on About Us");
            assertion.verifyUrl(aboutUsURL);
            LoggerHandler.info("About Us url is correct");
            extentTest.log(Status.INFO, "About Us url is correct");
            extentTest.log(Status.PASS, "About Us url is correct");
            helper.back();
        } catch (Exception e) {
            LoggerHandler.info("About Us url is incorrect");
            extentTest.log(Status.INFO, "About Us url is incorrect");
            extentTest.log(Status.FAIL, "About Us url is incorrect");
            Reporter.attachScreenshot("verify_About_Us", extentTest, "Couldn't verify URL");
        }
    }

    /*
     * Method name: verifyFNPTeam
     * Author Name: Lagisetty Srihith
     * Description: This methods verifies the URL
     * Parameters: None
     * Return type: void
     */
    public void verifyFNPTeam(String fnpTeam) {
        try {
            helper.scroll(FooterLocators.fnpTeam);
            LoggerHandler.info("Scrolled to FNP Team");
            extentTest.log(Status.INFO, "Scrolled to FNP Team");
            extentTest.log(Status.PASS, "Scrolled to FNP Team");
            helper.clickElement(FooterLocators.fnpTeam);
            LoggerHandler.info("Clicked on FNP Team");
            extentTest.log(Status.INFO, "Clicked on FNP Team");
            extentTest.log(Status.PASS, "Clicked on FNP Team");
            assertion.verifyUrl(fnpTeam);
            LoggerHandler.info("Disclaimer url is correct");
            extentTest.log(Status.INFO, "Disclaimer url is correct");
            extentTest.log(Status.PASS, "Disclaimer url is correct");
            helper.back();
        } catch (Exception e) {
            LoggerHandler.info("Disclaimer url is incorrect");
            extentTest.log(Status.INFO, "Disclaimer url is incorrect");
            extentTest.log(Status.FAIL, "Disclaimer url is incorrect");
            Reporter.attachScreenshot("verify_FNP_Team", extentTest, "Couldn't verify URL");
        }
    }

    /*
     * Method name: verifyCareers
     * Author Name: Lagisetty Srihith
     * Description: This methods verifies the URL
     * Parameters: None
     * Return type: void
     */
    public void verifyCareers(String careersURL) {
        try {
            helper.scroll(FooterLocators.careers);
            LoggerHandler.info("Scrolled to Careers");
            extentTest.log(Status.INFO, "Scrolled to Careers");
            extentTest.log(Status.PASS, "Scrolled to Careers");
            helper.clickElement(FooterLocators.careers);
            LoggerHandler.info("Clicked on Careers");
            extentTest.log(Status.INFO, "Clicked on Careers");
            extentTest.log(Status.PASS, "Clicked on Careers");
            assertion.verifyUrl(careersURL);
            LoggerHandler.info("Careers url is correct");
            extentTest.log(Status.INFO, "Careers url is correct");
            extentTest.log(Status.PASS, "Careers url is correct");
            helper.back();
        } catch (Exception e) {
            LoggerHandler.info("Careers url is incorrect");
            extentTest.log(Status.INFO, "Disclaimer url is incorrect");
            extentTest.log(Status.FAIL, "Disclaimer url is incorrect");
            Reporter.attachScreenshot("verify_Careers", extentTest, "Couldn't verify URL");
        }
    }

    /*
     * Method name: verifyTestimonials
     * Author Name: Lagisetty Srihith
     * Description: This methods verifies the URL
     * Parameters: None
     * Return type: void
     */
    public void verifyTestimonials(String testimonialsURL) {
        try {
            helper.scroll(FooterLocators.testimonial);
            LoggerHandler.info("Scrolled to Testimonials");
            extentTest.log(Status.INFO, "Scrolled to Testimonials");
            extentTest.log(Status.PASS, "Scrolled to Testimonials");
            helper.clickElement(FooterLocators.testimonial);
            LoggerHandler.info("Clicked on Testimonials");
            extentTest.log(Status.INFO, "Clicked on Testimonials");
            extentTest.log(Status.PASS, "Clicked on Testimonials");
            assertion.verifyUrl(testimonialsURL);
            LoggerHandler.info("Testimonials url is correct");
            extentTest.log(Status.INFO, "Testimonials url is correct");
            extentTest.log(Status.PASS, "Testimonials url is correct");
            helper.back();
        } catch (Exception e) {
            LoggerHandler.info("Testimonials url is incorrect");
            extentTest.log(Status.INFO, "Testimonials url is incorrect");
            extentTest.log(Status.FAIL, "Testimonials url is incorrect");
            Reporter.attachScreenshot("verify_Testimonials", extentTest, "Couldn't verify URL");
        }
    }

    public void verifyPolicyInfo(String expected) {
        try {
            helper.scroll(FooterLocators.policyInfo);
            Assertion.verifyText(FooterLocators.policyInfo, expected);
            LoggerHandler.info("Policy info is verified");
            extentTest.log(Status.INFO, "Policy info is verified");
            extentTest.log(Status.PASS, "Policy info is verified");
            Screenshot.captureScreenShot("Footer");
        } catch (Exception e) {
            LoggerHandler.info("Policy info couldn't verified");
            extentTest.log(Status.INFO, "Policy info couldn't verified");
            extentTest.log(Status.FAIL, "Policy info couldn't verified");
        }
    }
}