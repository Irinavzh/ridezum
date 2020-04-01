package zum;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class BaseTest {

    protected static WebDriver driver;
    protected static User user;

    @BeforeClass
    public static void setUp() {

        System.setProperty("webdriver.chrome.driver", "/Users/kotenok/Desktop/driver/chromedriver");

        driver = new ChromeDriver();
        driver.manage().window().fullscreen();

        user = new User("Petr", "Ivanov", "petr@gmail.com", "4012223344",
                "RI", "02864", "11111");


        driver.get("https://www.ridezum.com/");

        /* HomePage Title Test */

        String expectedTitle = "Zūm";
        String actualTitle = driver.getTitle();

        Assert.assertEquals(expectedTitle, actualTitle);

        System.out.println("HomePage Title Test Passed.");
    }

//    @AfterClass
//    public static void tearDown() {
//
//        System.out.println("Test Completed.");
//
//        driver.quit();
//    }
}
