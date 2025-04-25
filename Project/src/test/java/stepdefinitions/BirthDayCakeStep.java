package stepdefinitions;

import com.aventstack.extentreports.ExtentTest;

import actions.BirthdayCakeAction;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BirthDayCakeStep {

    public static ExtentTest extentTest;
    BirthdayCakeAction BirthdayCakeObject;

    @Given("I open the website in chrome")
    public void i_open_the_website_in_chrome() {
        extentTest = Hooks.extentReport.createTest("BirthdatCake_Action");
        BirthdayCakeObject = new BirthdayCakeAction(extentTest);

    }

    @When("I enter the {string} from the table below")
    public void i_enter_the_from_the_table_below(String string) {
        BirthdayCakeObject.selectLocation();
        BirthdayCakeObject.searchLocation(string);
        BirthdayCakeObject.continueShopping();

    }

    @Then("I hover on the CAKES")
    public void i_hover_on_the_cakes() {
        BirthdayCakeObject.hoverOnCakes();

    }

    @Then("I click on the BIRTHDAY CAKES then verify the cake relevant content")
    public void i_click_on_the_birthday_cakes_then_verify_the_cake_relevant_content() {
        BirthdayCakeObject.birthdayCakes();
    }

    @Then("I click on Same Day Delivery and 1st product")
    public void i_click_on_same_day_delivery_and_1st_product() {
        BirthdayCakeObject.sameDayDelivery();
        BirthdayCakeObject.firstProduct();

    }

    @Then("I switch the tab then verify the relevant content")
    public void i_switch_the_tab_then_verify_the_relevant_content() {
        BirthdayCakeObject.verifyCakeText();

    }

    @Then("I add to the cart and capture the screeshot.")
    public void i_add_to_the_cart_and_capture_the_screeshot() {
        BirthdayCakeObject.productAddToCart();

    }
}
