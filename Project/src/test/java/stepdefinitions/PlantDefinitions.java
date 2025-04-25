package stepdefinitions;

import com.aventstack.extentreports.ExtentTest;
import pages.Plants;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PlantDefinitions {
   // WebDriver driver = Base.driver;
     ExtentTest extentTest=Hooks.extentReport.createTest("Plant_test");
    Plants plant;
    @Given("I open the browser")
public void i_open_the_browser() {
    plant=new Plants(extentTest);
}
@When("I click Where to deliver")
public void i_click_where_to_deliver() {
    plant.clickDeliver();
}
@When("I click on the area selection field")
public void i_click_on_the_area_selection_field() {
    plant.clickArea();
}
@When("I enter the location {string}")
public void i_enter_the_location(String string) {
    plant.enterArea(string);
}
@When("I click Continue Shopping")
public void i_click_continue_shopping() {
    plant.clickContinueShopping();
}
@When("I click on Plants present on the navigation bar")
public void i_click_on_plants_present_on_the_navigation_bar() {
    plant.clickPlant();
}
@When("I click on Lucky Bamboo under Plants and navigate back to homepage")
public void i_click_on_lucky_bamboo_under_plants_and_navigate_back_to_homepage() {
    plant.clickBamboo();
}
@When("I click on Jade Plants under Plants and navigate back to homepage")
public void i_click_on_jade_plants_under_plants_and_navigate_back_to_homepage() {
    plant.clickJadePlant();
}
@When("I click on Money Plants under Plants and navigate back to homepage")
public void i_click_on_money_plants_under_plants_and_navigate_back_to_homepage() {
    plant.clickMoneyPlant();
}
@Then("I click on cart")
public void i_click_on_cart() {
    plant.clickCart();
}


    
}
