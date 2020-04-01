package zum;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;


import java.util.List;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".m-btn.front-banner__btn")
    protected List<WebElement> listButtons;

    public ApplyPage clickApplyToDriveButton() {

        wait.until(ExpectedConditions.elementToBeClickable(listButtons.get(1)));

        listButtons.get(1).click();

        return new ApplyPage(driver);
    }

}
