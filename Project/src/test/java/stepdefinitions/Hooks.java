package stepdefinitions;
import com.aventstack.extentreports.ExtentReports;
 
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import utils.Base;
import utils.Reporter;

public class Hooks extends Base{
    public static ExtentReports extentReport;
    @BeforeAll
    public static void report(){
        extentReport = Reporter.generateReport("FNP_Report");
    }
 
    @Before
    public void open(){
        openBrowser();
    }
    @After
    public void close(){
        driver.quit();
    }
 
    @AfterAll
    public static void generate(){
        extentReport.flush();
    }
}