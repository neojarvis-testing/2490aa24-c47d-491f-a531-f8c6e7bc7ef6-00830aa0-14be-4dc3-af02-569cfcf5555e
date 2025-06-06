package uistore;

import org.openqa.selenium.By;

public class CakeLocators {
        public static By noThanks=By.xpath("//button[text()='No, Thanks']");
        public static By deliver=By.xpath("//span[text()='Where to deliver?']");
        public static By area=By.id("pincode-location-input");
        public static By continueshopping=By.xpath("//div[text()='Continue Shopping']");
        public static By search=By.xpath("(//input[@id='search_bar'])[1]");
        public static By flavour=By.xpath("//span[text()='Flavour']");
        public static By chocolate=By.id("checkbox-Flavour_0");
        public static By first_product=By.xpath("(//div[@itemprop='name'])[1]");
        public static By buynow=By.xpath("//div[text()='Buy Now']"); 

}
