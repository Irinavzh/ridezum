package zum;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class JobsLeverCoPage extends BasePage {

    public JobsLeverCoPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".posting-btn-submit.template-btn-submit.hex-color")
    private List<WebElement> listApplyButtons;

    public JobDescriptionPage clickApplyButton() {
        waitUntilClickable(listApplyButtons.get(0));
        listApplyButtons.get(0).click();
        return new JobDescriptionPage(driver);
    }

}
