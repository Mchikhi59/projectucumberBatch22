package pages;

import utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddEmployeePage extends CommonMethods {

    //object repositories
    @FindBy(id="firstName")
    public WebElement firstNameLocator;

    @FindBy(id="middleName")
    public WebElement middleNameLocator;

    @FindBy(id="lastName")
    public WebElement lastNameLocator;

    @FindBy(id="btnSave")
    public WebElement savebutton;

    @FindBy(xpath= "//*[@id='pdMainContainer']/div[1]/h1")
    public WebElement success;

    @FindBy(id = "personal_txtEmployeeId")
    public WebElement employeeId;
    @FindBy(xpath ="//*[@id='pdMainContainer']/div[1]/h1")
    public WebElement saveSuccess;
    @FindBy(xpath = "//span[contains(text(),'Required')]")
    public WebElement errorMsg;

    @FindBy(id = "employeeId")
    public WebElement addID;













    public AddEmployeePage(){
        PageFactory.initElements(driver, this);
    }

}
