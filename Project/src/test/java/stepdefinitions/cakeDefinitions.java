package stepdefinitions;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Cake;
import utils.Base;


public class cakeDefinitions {
    WebDriver driver = Base.driver;
    static ExtentTest extentTest=Hooks.extentReport.createTest("fnp");
    Cake ca;
        @Given("I click on Where to deliver")
        public void i_click_on_where_to_deliver() {
            ca=new Cake(extentTest);
            ca.clickDeliver();
    }
    @When("I enter the city as {string}")
    public void i_enter_the_city_as(String string) {
        ca.clickArea();
        ca.enterArea(string);
    }
    @When("I click on continue shopping")
    public void i_click_on_continue_shopping() {
        ca.clickContinueShopping();
    }
    @When("I clicked on searchbar")
    public void i_clicked_on_searchbar() {
        ca.clickSearch();
    }
    @When("I enter {string}")
    public void i_enter(String string) {
        ca.typeSearch(string);
    }
    @When("I clicked on flavour")
    public void i_clicked_on_flavour() {
        ca.clickFlavour();
    }
    @When("I clicked on Chocolate")
    public void i_clicked_on_chocolate() {
        ca.clickChocolates();
    }
    @When("I clicked the firstProduct")
    public void i_clicked_the_first_product() {
        ca.clickFirstProduct();
    }
    @Then("I clicked on Buynow")
    public void i_clicked_on_buynow() {
        ca.clickBuyNow();
    }
}
