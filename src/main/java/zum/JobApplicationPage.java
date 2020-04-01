package zum;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class JobApplicationPage extends BasePage {

    public JobApplicationPage(WebDriver driver){
        super(driver);
    }

    @FindBy(css = "input")
    private List<WebElement> listInputFields;

    @FindBy(css = "#additional-information")
    private WebElement additionalInformation;

    @FindBy(css = "select[name=\"eeo[gender]\"]")
    private WebElement selectGender;

    @FindBy(css = "select[name=\"eeo[race]\"]")
    private WebElement selectRace;


    @FindBy(css = "select[name=\"eeo[veteran]\"]")
    private WebElement selectVeteranStatus;

    @FindBy(css = ".section.eeo-section.page-centered.application-form")
    private WebElement form;



    public void inputFullName(String fullName) {
        waitUntilClickable(listInputFields.get(1));
        listInputFields.get(1).sendKeys(fullName);
    }

    public void inputEmail(String email) {
        waitUntilClickable(listInputFields.get(2));
        listInputFields.get(2).sendKeys(email);
    }

    public void inputPhone(String phone) {
        waitUntilClickable(listInputFields.get(3));
        listInputFields.get(3).sendKeys(phone);
    }

    public void inputCurrentCompany(String company) {
        waitUntilClickable(listInputFields.get(4));
        listInputFields.get(4).sendKeys(company);
    }

    public void inputLinkedInURL(String linkedInURL) {
        waitUntilClickable(listInputFields.get(5));
        listInputFields.get(5).sendKeys(linkedInURL);
    }

    public void inputPortfolioURL(String portfolio) {
        waitUntilClickable(listInputFields.get(6));
        listInputFields.get(6).sendKeys(portfolio);
    }

    public void inputAdditionalInformation(String addinfo) {
        waitUntilClickable(additionalInformation);
        additionalInformation.sendKeys(addinfo);
    }

    public void selectGenderByText(String text) {
        waitUntilClickable(selectGender);
        selectGender.click();
        Select select = new Select(selectGender);
        select.selectByVisibleText(text);
    }

    public void selectRaceByText(String text) {
        waitUntilClickable(selectRace);
        selectRace.click();
        Select select = new Select(selectRace);
        select.selectByVisibleText(text);
    }

    public void selectVeteranStatusByText(String text) {
        waitUntilClickable(selectVeteranStatus);
        selectVeteranStatus.click();
        Select select = new Select(selectVeteranStatus);
        select.selectByVisibleText(text);
    }

    public void clickOnForm() {
        form.click();
    }


//    public void selectGenderByIndex(int index) {
//        waitUntilClickable(listSelectFields.get(0));
//        listSelectFields.get(0).click();
//        Select select = new Select(listSelectFields.get(0));
//        select.selectByIndex(index);
//    }






}
