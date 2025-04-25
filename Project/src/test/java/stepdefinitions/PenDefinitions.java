package stepdefinitions;

import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Pen;

public class PenDefinitions {
    public static ExtentTest extentTest=Hooks.extentReport.createTest("FNP_Report");
    Pen pen;
    
@Given("open the browser")
public void open_the_browser() {
    pen=new Pen(extentTest);

}
@When("click on the where to deliver")
public void click_on_the_where_to_deliver() {
    pen.clickDeliver();
    
}
@When("enter the location {string} from the table below")
public void enter_the_location_from_the_table_below(String string) {
    pen.enterArea(string);
    
}
@When("click Continue Shopping")
public void click_continue_shopping() {
    pen.clickContinueShopping();
    
}
@When("verify the pincode {string}")
public void verify_the_pincode(String string) {
    pen.verifyPinCode(string);
    
}
@When("click the search icon")
public void click_the_search_icon() {
    pen.clickSearch();
    
}
@When("enter the keyword {string} in the search bar")
public void enter_the_keyword_in_the_search_bar(String string) {
    pen.typeSearch(string);
}
@When("click on the first product first product")
public void click_on_the_first_product_first_product() {
    pen.clickFirstProduct();
}
@When("click cart Add to cart")
public void click_cart_add_to_cart() {
    pen.clickCart();
}
@When("verify the button labeled Buy Now is present")
public void verify_the_button_labeled_buy_now_is_present() {
    pen.verifyBuyNow();    
}
@Then("capture the screenshot")
public void capture_the_screenshot() {
    pen.captureScreenshot();
}
    
}
