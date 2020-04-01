package zum;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class ApplyPage extends BasePage {

    public ApplyPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(css = "input[id]")
    private List<WebElement> listApplyFields;

    @FindBy(css = "#application_form_first_name")
    private WebElement firstNameField;

    @FindBy(css = ".main-menu__link")
    private List<WebElement> menuList;

    @FindBy(css = "#application_form_applicant_state")
    private WebElement selectStateField;



    public void clickFirstNameList() {
        waitUntilClickable(listApplyFields.get(0));
        listApplyFields.get(0).click();
    }

    public void clickFirstName() {
        waitUntilClickable(firstNameField);
        firstNameField.click();
    }

    public void inputFirstName(String firstName) {
        waitUntilClickable(firstNameField);
        firstNameField.sendKeys(firstName);
    }

    public void inputLastName(String lastName){
        waitUntilClickable(listApplyFields.get(1));
        listApplyFields.get(1).sendKeys(lastName);
    }

    public void inputEmail(String email) {
        waitUntilClickable(listApplyFields.get(2));
        listApplyFields.get(2).sendKeys(email);
    }

    public void inputPhone(String phone) {
        waitUntilClickable(listApplyFields.get(3));
        listApplyFields.get(3).sendKeys(phone);
    }

    public void selectStateByIndex(int index) {
        waitUntilClickable(selectStateField);
        Select select = new Select(selectStateField);
        select.selectByIndex(index);
    }

    public void  selectStateByName(String name) {
        waitUntilClickable(selectStateField);
        Select select = new Select(selectStateField);
        select.selectByValue(name);
    }

    public void inputZipCode(String zipCode) {
        waitUntilClickable(listApplyFields.get(6));
        listApplyFields.get(6).sendKeys(zipCode);
    }

    public void inputReferralCode(String referralCode) {
        waitUntilClickable(listApplyFields.get(7));
        listApplyFields.get(7).sendKeys(referralCode);
    }





}
