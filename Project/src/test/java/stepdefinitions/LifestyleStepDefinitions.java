package stepdefinitions;

import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.LifestylePageActions;

public class LifestyleStepDefinitions {
    public static ExtentTest extentTest = Hooks.extentReport.createTest("Rings");
    public LifestylePageActions lifestyleObject = new LifestylePageActions(extentTest);

    @Given("I am on fnp homepage")
    public void i_am_on_fnp_homepage() {
    }
    @When("click on Lifestyle on the navigation bar")
    public void click_on_lifestyle_on_the_navigation_bar() {
        lifestyleObject.hoverOnLifestyle();
    }
    @When("click on Rings under jewellery")
    public void click_on_rings_under_jewellery() {
        lifestyleObject.clickOnJewellery();
    }
    @When("click on first product under Rings")
    public void click_on_first_product_under_rings() {
        lifestyleObject.clickOnRings();
        lifestyleObject.clickOnfirstProduct();
        lifestyleObject.reviewsScreenshot();
    }
}
