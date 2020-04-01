package zum;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class JobApplicationPage extends BasePage {

    public JobApplicationPage(WebDriver driver){
        super(driver);
    }

    @FindBy(css = "input")
    private List<WebElement> listInputFields;

    public void inputFullName(String fullName) {
        waitUntilClickable(listInputFields.get(1));
        listInputFields.get(1).sendKeys(fullName);
    }

    public void inputEmail (String email) {
        waitUntilClickable(listInputFields.get(2));
        listInputFields.get(2).sendKeys(email);
    }




}
