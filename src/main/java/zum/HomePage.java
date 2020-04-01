package zum;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import java.util.List;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".m-btn.front-banner__btn")
    private List<WebElement> listButtons;

    @FindBy(css = ".footer-menu__link")
    private List<WebElement> linksFooterMenu;


    public ApplyPage clickApplyToDriveButton() {
        waitUntilClickable(listButtons.get(1));
        listButtons.get(1).click();
        return new ApplyPage(driver);
    }

    public CareersPage clickCareersLink() {
        waitUntilClickable(linksFooterMenu.get(3));
        linksFooterMenu.get(3).click();
        return new CareersPage(driver);
    }

}
