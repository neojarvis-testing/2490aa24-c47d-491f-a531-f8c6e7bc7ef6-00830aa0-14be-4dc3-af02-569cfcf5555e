package stepdefinitions;

import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.FooterPageActions;

public class FooterPageDefinitions {
    public static ExtentTest extentTest;
    FooterPageActions footerPageObject;
    
    @Given("I'm in the browser")
    public void i_m_in_the_browser() {
        extentTest=Hooks.extentReport.createTest("Footer_Test");
        footerPageObject = new FooterPageActions(extentTest);
    }
    @When("I navigate to Terms & Conditions to verify {string}")
    public void i_navigate_to_terms_conditions_to_verify(String string) {
        footerPageObject.verifyTermsAndConditions(string);
    }
    @When("I navigate to Privacy Policy to verify {string}")
    public void i_navigate_to_privacy_policy_to_verify(String string) {
        footerPageObject.verifyPrivacyPolicy(string);
    }
    @When("I navigate to Terms of use to verify {string}")
    public void i_navigate_to_terms_of_use_to_verify(String string) {
        footerPageObject.verifyTermsOfUse(string);
    }
    @When("I navigate to Disclimer to verify {string}")
    public void i_navigate_to_disclimer_to_verify(String string) {
        footerPageObject.verifyDisclaimer(string);
    }
    @When("I navigate to About us to verify {string}")
    public void i_navigate_to_about_us_to_verify(String string) {
        footerPageObject.verifyAboutUs(string);
    }
    @When("I navigate to FNP team to verify {string}")
    public void i_navigate_to_fnp_team_to_verify(String string) {
        footerPageObject.verifyFNPTeam(string);
    }
    @When("I navigate to Careers to verify {string}")
    public void i_navigate_to_careers_to_verify(String string) {
        footerPageObject.verifyCareers(string);
    }
    @When("I navigate to Testimonial to verify {string}")
    public void i_navigate_to_testimonial_to_verify(String string) {
        footerPageObject.verifyTestimonials(string);
    }
    @Then("I verify the key word {string} and capture the screenshot")
    public void i_verify_the_key_word_and_capture_the_screenshot(String string) {
        footerPageObject.verifyPolicyInfo(string);
    }
}
