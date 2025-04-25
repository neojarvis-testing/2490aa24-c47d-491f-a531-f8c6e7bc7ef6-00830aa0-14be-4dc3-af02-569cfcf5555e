package stepdefinitions;

import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.PersonalisedPageActions;
import utils.Base;

public class PersonalisedStepDefinitions extends Base{
    public static ExtentTest extentTest = Hooks.extentReport.createTest("PersonalisedMugs");
    public PersonalisedPageActions personalisedObject = new PersonalisedPageActions(extentTest);

    @Given("I am on fnp website")
    public void i_am_on_fnp_website() {
    }
    @When("I click on the close pop up")
    public void i_click_on_the_close_pop_up() {
        personalisedObject.closePopUp();
    }
    @When("click on {string}")
    public void click_on(String string) {
        personalisedObject.clickOnWhereToDeliver();
    }
    @When("I enter the location {string} from the table below")
    public void i_enter_the_location_from_the_table_below(String string) {
        personalisedObject.enterKeyword(string);
    }
    @When("I click {string}")
    public void i_click(String string) {
        personalisedObject.clickOnContinueShopping();
    }
    @When("I verify the pincode {string}")
    public void i_verify_the_pincode(String string) {
        personalisedObject.hoverOnPersonalised();
    }
    @When("click on Personalised on the navigation bar")
    public void click_on_personalised_on_the_navigation_bar() {
        personalisedObject.clickMugs();
    }
    @When("click on Mugs under gifts")
    public void click_on_mugs_under_gifts() {
        personalisedObject.clickmagicalMugs();
    }
    @When("click on first product under Magical Mugs")
    public void click_on_first_product_under_magical_mugs() {
        personalisedObject.clickOnFirstProduct();
    }
    @When("switch to a new tab")
    public void switch_to_a_new_tab() {
        personalisedObject.tabSwitch();
    }
    @When("click on {string} button")
    public void click_on_button(String string) {
        personalisedObject.clickOnCart();
    }
    @Then("I capture the screenshot")
    public void i_capture_the_screenshot() {
        personalisedObject.availableScreenshot();
    }
}
