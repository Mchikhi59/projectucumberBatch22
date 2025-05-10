package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utils.CommonMethods;
import utils.ConfigReader;

public class AddEmplyeeSteps extends CommonMethods {

    @Given("user is able to access HRMS application")
    public void user_is_able_to_access_hrms_application() {
          openBrowserAndLaunchApplication();
    }

    @When("user enters valid username and password")
    public void user_enters_valid_username_and_password() {
        sendText(ConfigReader.read("userName"), loginPage.usernameField);
        sendText(ConfigReader.read("password"), loginPage.passwordField);
    }

    @When("user clicks on login button")
    public void user_clicks_on_login_button() {
        click(loginPage.loginButton);
    }

    @Then("user is able to see dashboard page")
    public void user_is_able_to_see_dashboard_page() {
        System.out.println(dashboardPage.dashboard.getText());
    }

    @When("user clicks on PIM option")
    public void user_clicks_on_pim_option() {
       click(dashboardPage.pimoption);
    }

    @When("user clicks on Add employee option")
    public void user_clicks_on_add_employee_option() {
        click(dashboardPage.addEmpoption);
    }

    @When("user enters <firstname> and <lastname>")
    public void user_enters_firstname_and_lastname() {
        sendText("chikhi",addEmployeePage.firstNameLocator);
        sendText("miloud",addEmployeePage.lastNameLocator);
    }

    @When("user clicks on save button")
    public void user_clicks_on_save_button() {
        click(addEmployeePage.savebutton);
    }

    @Then("the system should generate a unique employee ID")
    public void the_system_should_generate_a_unique_employee_id()  {

        System.out.println(addEmployeePage.employeeId.getText());

    }

    @Then("the employee should be added successfully")
    public void the_employee_should_be_added_successfully() {
        //System.out.println(addEmployeePage.saveSuccess.getText());
        //System.out.println(addEmployeePage.saveSuccess.getText());
        Assert.assertEquals(addEmployeePage.success.getText(),"Personal Details");
    }

    @Then("user providing a unique employee ID")
    public void user_providing_a_unique_employee_id() {
        String empId = generateUniqueEmployeeId();
        sendText(empId,addEmployeePage.addID);
    }

    @When("user enters incomplete or invalid information")
    public void user_enters_incomplete_or_invalid_information() {
        sendText(" ",addEmployeePage.firstNameLocator);
        sendText("miloud",addEmployeePage.lastNameLocator);
    }

    @Then("user can see the error message Required")
    public void user_can_see_the_error_message_required() {
        Assert.assertEquals(addEmployeePage.errorMsg.getText(),"Required");
    }


}
