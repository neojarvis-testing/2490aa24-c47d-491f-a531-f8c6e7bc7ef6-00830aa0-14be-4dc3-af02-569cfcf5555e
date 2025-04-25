package stepdefinitions;

import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AnniversaryPageActions;

public class AnniversaryPageDefinitions {
    public static ExtentTest extentTest;
    AnniversaryPageActions anniversaryPageObject;
    
    @Given("I opened the browser")
    public void i_opened_the_browser() {
        extentTest=Hooks.extentReport.createTest("Anniversary_Test");
        anniversaryPageObject = new AnniversaryPageActions(extentTest);
    }
    @When("I clicked on Where to deliver")
    public void i_clicked_on_where_to_deliver() {
        anniversaryPageObject.clickOnWhereToDeliver();
    }
    @When("I entered the city as {string}")
    public void i_entered_the_city_as(String string) {
        anniversaryPageObject.inputCity(string);
    }
    @When("I clicked on continue shopping")
    public void i_click_on_continue_shopping() {
        anniversaryPageObject.clickOnContinueShopping();
    }
    @When("I hover on Anniversary")
    public void i_hover_on_anniversary() {
        anniversaryPageObject.hoverOnAnniversary();
    }
    @When("I click on roses which is under Flowers category")
    public void i_click_on_flowers_which_is_under_flowers_category() {
        anniversaryPageObject.clickOnFlowersAndRoses();
    }
    @When("I select the first product")
    public void i_select_the_first_product() {
        anniversaryPageObject.clickOnFirstProduct();
    }
    @When("I click on Buy Now")
    public void i_click_on_buy_now() {
        anniversaryPageObject.clickOnBuyNow();
    }
    // @Then("I verify the page contains {string} and capture the screenshot")
    // public void i_verify_the_page_contains_and_capture_the_screenshot(String string) {
    //     anniversaryPageObject.verifyHome(string);
    // }

}
