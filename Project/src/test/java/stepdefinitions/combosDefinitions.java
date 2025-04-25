package stepdefinitions;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Cake;
import pages.Combos;
import utils.Base;

public class combosDefinitions {
    WebDriver driver = Base.driver;
    static ExtentTest extentTest=Hooks.extentReport.createTest("fnp");
    Combos cob;
    //  @Given("I click on Where to deliver")
    //     public void i_click_on_where_to_deliver() {
    //         cob=new Combos(extentTest);
    //         cob.clickWhere();
    // }
    // @When("I enter the city as {string}")
    // public void i_enter_the_city_as(String string) {
    //     cob.enteringLocation(string);
    // }
    // @When("I click on continue shopping")
    // public void i_click_on_continue_shopping() {
    //     cob.continueShopping();
    // }
    @When("I hovered on combos")
    public void i_hovered_on_combos() {
        cob=new Combos(extentTest);
        cob.hoverCombos();
    }
    @When("I clicked on hampers")
    public void i_clicked_on_hampers() {
        cob.clickHampers();
    }
    @When("I clicked on availability")
    public void i_clicked_on_availability() {
        cob.clickAvailability();
    }
    @When("I clicked on true")
    public void i_clicked_on_true() {
        cob.clickTrue();
    }
    @When("I clicked on product")
    public void i_clicked_on_product() {
        cob.clickProduct();
    }
    @Then("I added to cart")
    public void i_added_to_cart() {
        cob.addToCart();
    }
}
