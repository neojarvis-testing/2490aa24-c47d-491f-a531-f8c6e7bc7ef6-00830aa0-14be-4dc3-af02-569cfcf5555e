package utils;
import java.time.Duration;
import java.util.List;
import java.util.Set;
 
 

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
 
import org.openqa.selenium.support.ui.WebDriverWait;
 
import com.aventstack.extentreports.Status;
 
// import uistore.LoginLocators;
 
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverHelper {
    private WebDriver driver;
    public WebDriverHelper(WebDriver driver){
        this.driver=driver;
    }
    public void clickElement(By locator) {
        try {
            driver.findElement(locator).click();
        } catch (Exception e) {
            LoggerHandler.error("Failed to click element: " + locator);
        }
    }
    public void hoverElement(By Locator) {
        try {
            WebElement webElement = driver.findElement(Locator);
            Actions action = new Actions(driver);
            action.moveToElement(webElement).perform();
        } catch (Exception e) {
            LoggerHandler.error("Failed to hover over element: " + Locator);
        }
    }
    public void enterText(By locator, String text) {
        try {
            WebElement webElement = driver.findElement(locator);
            webElement.sendKeys(text);
        } catch (Exception e) {
            LoggerHandler.error("Failed to enter text into element: " + locator);
        }
    }
    public String getText(By locator) {
        try {
            return driver.findElement(locator).getText();
        } catch (Exception e) {
            LoggerHandler.error("Failed to get text from element: " + locator);
            return "";
        }
    }
    public void enterAction(By locator) {
        try {
            driver.findElement(locator).sendKeys(Keys.ENTER);
        } catch (Exception e) {
            LoggerHandler.error("Failed to send ENTER key to element: " + locator);
        }
    }
    public void waitForElementToBeVisible(By locator, int timeoutInSeconds) {
        try {
            new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds))
                .until(ExpectedConditions.visibilityOfElementLocated(locator));
        } catch (Exception e) {
            LoggerHandler.error("Failed to wait for element visibility: " + locator);
        }
    }
    public void switchWindow() {
        try {
            String currWin = driver.getWindowHandle();
            Set<String> allWin = driver.getWindowHandles();
            for (String i : allWin) {
                if (!i.equalsIgnoreCase(currWin)) {
                    driver.switchTo().window(i);
                    LoggerHandler.info("Switched to window: " + i);
                    break;
                }
            }
        } catch (Exception e) {
            LoggerHandler.error("Failed to switch window");
        }
    }
    public void scroll(By locator){
        try{
            WebElement webElement= driver.findElement(locator);
            JavascriptExecutor js = (JavascriptExecutor)driver;
            js.executeScript("arguments[0].scrollIntoView(True);",webElement);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    public List<WebElement> getElementsByXPath(String xpath) {
        return driver.findElements(By.xpath(xpath));
    }
 
    public void scrollBy() {
        try {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,5000);");
        } catch (Exception e) {
            LoggerHandler.error("Failed to scroll the webpage");
        }
    }
 
 
    public void jsClick(By locator) {
        try {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            WebElement ele = driver.findElement(locator);
            js.executeScript("arguments[0].click();", ele);
        } catch (Exception e) {
            LoggerHandler.error("Failed to click element using JavaScript: " + locator);
        }
    }
    public void dropDown(By locator, String value) {
        try {
            WebElement webElement = driver.findElement(locator);
            Select option = new Select(webElement);
            option.selectByVisibleText(value);
        } catch (Exception e) {
            LoggerHandler.error("Failed to select dropdown value: " + value + " for element: " + locator);
        }
    }
 
    public void back() {
        try {
            driver.navigate().back();
            LoggerHandler.info("Navigated back");
        } catch (Exception e) {
            LoggerHandler.error("Failed to navigate back");
        }
    }
 
    public void home() {
        try {
            driver.navigate().to("https://www.fnp.com/");
            LoggerHandler.info("Navigated to home");
        } catch (Exception e) {
            LoggerHandler.error("Failed to navigate to home");
        }
    }
 
    public void popup() {
		WebElement webelement = driver.findElement(By.xpath("//button[text()='No, Thanks']"));
		webelement.click();
	}
 
public void waitForAction() {
    	try {
			Thread.sleep(3000);
		} catch (Exception e) {
			LoggerHandler.info("failed waitForAction");
		}
    }
 
 
    public boolean isElementPresent(By locator) {
        try {
            return Base.driver.findElements(locator).size() > 0;
        } catch (Exception e) {
            LoggerHandler.error("Error checking element presence: " + locator);
            return false;
        }
    }
 
    public boolean verifyUrl(String expectedUrl) {
        try {
            return Base.driver.getCurrentUrl().equals(expectedUrl);
        } catch (Exception e) {
            LoggerHandler.error("Error verifying URL: Expected - " + expectedUrl);
            return false;
        }
    }
}
