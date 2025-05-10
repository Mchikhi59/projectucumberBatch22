package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

import static utils.CommonMethods.driver;

public class DashboardPage extends CommonMethods {

    @FindBy(id="menu_pim_viewPimModule")
    public WebElement pimoption;

    @FindBy(id="menu_pim_addEmployee")
    public WebElement addEmpoption;

    /*@FindBy(id="menu_pim_viewEmployeeList")
    public WebElement empListOption;*/
    @FindBy(id= "welcome")
    public WebElement dashboard;

    public DashboardPage(){
        PageFactory.initElements(driver,this);
    }

}
