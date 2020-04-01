package zum;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;


public class ApplyTest extends BaseTest {

    @Test
    public void testApply() {

        HomePage homePage = new HomePage(driver);

        ApplyPage applyPage = homePage.clickApplyToDriveButton();

        String expectedApplyPageTitle = "Zumer, Become a Driver, Drivers for Kids | Zum";
        String actualApplyPageTitle = driver.getTitle();
        Assert.assertEquals(expectedApplyPageTitle, actualApplyPageTitle);

        System.out.println("ApplyPage Title Test Passed");

        driver.switchTo().frame(driver.findElement(By.cssSelector(".iframe-container.m-banner-drive__iframe")));

        applyPage.inputFirstName(user.getFirstName());
        applyPage.inputLastName(user.getLastName());
        applyPage.inputEmail(user.getEmail());
        applyPage.inputPhone(user.getPhoneNumber());
        applyPage.selectStateByIndex(3);
//        applyPage.selectStateByName("California");
        applyPage.inputZipCode(user.getZipCode());
        applyPage.inputReferralCode(user.getReferralCode());
    }
}
