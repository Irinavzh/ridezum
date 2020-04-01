package zum;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class ApplyJobTest extends BaseTest {

    @Test
    public void testApplyJob() {

        HomePage homePage = new HomePage(driver);

        CareersPage careersPage = homePage.clickCareersLink();

        String expectedTitle = "Zūm | Careers";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);

        System.out.println("Title 'Zūm | Careers' Test Passed.");

        String winHandleBefore = driver.getWindowHandle();

        JobsLeverCoPage jobsLeverCoPage = careersPage.clickViewJobsButton();

        for(String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }

        JobDescriptionPage jobDescriptionPage = jobsLeverCoPage.clickApplyButton();

        JobApplicationPage jobApplicationPage = jobDescriptionPage.clickApplyForThisJobButton();

        jobApplicationPage.inputFullName(user.getFullName());

        jobApplicationPage.inputEmail(user.getEmail());
    }
}
