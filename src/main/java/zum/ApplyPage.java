package zum;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class ApplyPage extends BasePage {

    public ApplyPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".m-banner-drive__form-wrap")
    private WebElement block;

    @FindBy(css = "input[id]")
    private List<WebElement> listApplyFields;


    @FindBy(css = "#application_form_first_name")
    private WebElement firstNameField;


    @FindBy(css = ".main-menu__link")
    private List<WebElement> menuList;

    @FindBy(css = "#application_form_applicant_state")
    private WebElement selectStateField;



    public void clickFirstNameList() {
        wait.until(ExpectedConditions.elementToBeClickable(listApplyFields.get(0)));
        listApplyFields.get(0).click();
    }

    public void clickFirstName() {
        firstNameField.click();
    }

    public void inputFirstName(String firstName) {
        wait.until(ExpectedConditions.elementToBeClickable(firstNameField));
        firstNameField.sendKeys(firstName);
    }

    public void inputLastName(String lastName){
        wait.until(ExpectedConditions.elementToBeClickable(listApplyFields.get(1)));
        listApplyFields.get(1).sendKeys(lastName);
    }
    public void inputEmail(String email) {
        listApplyFields.get(2).sendKeys(email);
    }

    public void inputPhone(String phone) {
        listApplyFields.get(3).sendKeys(phone);
    }

    public void selectStateByIndex(int index) {
        Select select = new Select(selectStateField);
        select.selectByIndex(index);
    }

    public void  selectStateByName(String name) {
        Select select = new Select(selectStateField);
        select.selectByValue(name);
    }





}
