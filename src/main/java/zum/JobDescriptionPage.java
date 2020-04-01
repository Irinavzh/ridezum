package zum;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class JobDescriptionPage extends BasePage {

    public JobDescriptionPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".postings-btn.template-btn-submit.hex-color")
    private List<WebElement> applyForThisJobButton;

    public JobApplicationPage clickApplyForThisJobButton() {
        waitUntilClickable(applyForThisJobButton.get(0));
        applyForThisJobButton.get(0).click();
        return new JobApplicationPage(driver);
    }
}
