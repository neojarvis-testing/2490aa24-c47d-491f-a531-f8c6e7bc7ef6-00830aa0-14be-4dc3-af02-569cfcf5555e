package stepdefinitions;

import com.aventstack.extentreports.ExtentTest;

import actions.FooterAction;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FooterStep {

    public static ExtentTest extentTest;
    FooterAction footerObject;

    @Given("I open FNP url")
    public void i_open_fnp_url() {
        extentTest = Hooks.extentReport.createTest("Footer_Action");
        footerObject = new FooterAction(extentTest);

    }

    @When("I click on decoration link it should navigate to {string} link")
    public void i_click_on_decoration_link_it_should_navigate_to_link(String string) {
        footerObject.scrollToFooter();
        footerObject.verifyDecorationLink(string);

    }

    @Then("I navigate back and click on Corporate Services, it shoul navigate to {string} link")
    public void i_navigate_back_and_click_on_corporate_services_it_shoul_navigate_to_link(String string) {
        footerObject.corporateServiceLink(string);
    }

    @Then("I navigate back and click on Affiliate Program, it should redirect to {string} link")
    public void i_navigate_back_and_click_on_affiliate_program_it_should_redirect_to_link(String string) {
        footerObject.affiliateProgrameLink(string);

    }

    @Then("I navigate back and click on Retail Stores, it should redirect to {string} link")
    public void i_navigate_back_and_click_on_retail_stores_it_should_redirect_to_link(String string) {
        footerObject.retailStoresLink(string);

    }

    @Then("I navigate back and click on Franchise, it should redirect to {string} link")
    public void i_navigate_back_and_click_on_franchise_it_should_redirect_to_link(String string) {
        footerObject.franchiseLink(string);
    }

    @Then("I navigate back & click on Quotes N Wishes, it should redirect {string} link")
    public void i_navigate_back_click_on_quotes_n_wishes_it_should_redirect_link(String string) {
        footerObject.quotesNWishesLink(string);

    }

    @Then("I navigate back & click on Blog, it should redirect {string} link.")
    public void i_navigate_back_click_on_blog_it_should_redirect_link(String string) {
        footerObject.blogLink(string);

    }

}
