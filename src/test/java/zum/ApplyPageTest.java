package zum;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.lang.model.element.Element;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ApplyPageTest extends BaseTest {

    @Test
    public void testApplyPage() throws InterruptedException {

        HomePage homePage = new HomePage(driver);
//
//        ApplyPage applyPage = new ApplyPage(driver);



        ApplyPage applyPage = homePage.clickApplyToDriveButton();

        String expectedApplyPageTitle = "Zumer, Become a Driver, Drivers for Kids | Zum";
        String actualApplyPageTitle = driver.getTitle();
        Assert.assertEquals(expectedApplyPageTitle, actualApplyPageTitle);

        System.out.println("ApplyPage Title Test Passed");

        Thread.sleep(1000);

        driver.switchTo().frame(driver.findElement(By.cssSelector(".iframe-container.m-banner-drive__iframe")));

        applyPage.inputFirstName(user.getFirstName());
        applyPage.inputLastName(user.getLastName());
        applyPage.inputEmail(user.getEmail());
        applyPage.inputPhone(user.getPhoneNumber());
    //        applyPage.selectStateByIndex(3);
        applyPage.selectStateByName("California");



    }
}
