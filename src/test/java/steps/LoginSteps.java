package steps;

import utils.CommonMethods;
import utils.ConfigReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginSteps extends CommonMethods {


    @Given("user is able to access to HRMS application")
    public void user_is_able_to_access_to_hrms_application() {
       openBrowserAndLaunchApplication();
    }
    @When("user login with empty username")
    public void user_login_with_empty_username() {
        sendText(ConfigReader.read("emptyUserName"), loginPage.usernameField);
        sendText(ConfigReader.read("password"), loginPage.passwordField);
    }

    @When("user click on login button")
    public void user_click_on_login_button() {
        click(loginPage.loginButton);
    }

    @Then("user see the error Username cannot be empty")
    public void user_see_the_error_username_cannot_be_empty() {
        String errorMessage = loginPage.errorMessage.getText();
        Assert.assertEquals(errorMessage, "Username cannot be empty");

    }
    @When("user login with empty password")
    public void user_login_with_empty_password() {
        sendText(ConfigReader.read("userName"), loginPage.usernameField);
        sendText(ConfigReader.read("emptyPassword"), loginPage.passwordField);
    }

    @Then("user see the error Password is Empty")
    public void user_see_the_error_password_is_empty() {
        String errorMessage = loginPage.errorMessage.getText();
        Assert.assertEquals(errorMessage, "Password is Empty");
    }

    @When("user login with wrong username or password")
    public void user_login_with_wrong_username_or_password() {
        sendText(ConfigReader.read("wrongUsername"), loginPage.usernameField);
        sendText(ConfigReader.read("wrongPassword"), loginPage.passwordField);
    }

    @Then("user see the error Invalid credentials")
    public void user_see_the_error_invalid_credentials() {
        String errorMessage = loginPage.errorMessage.getText();
        Assert.assertEquals(errorMessage, "Invalid credentials");
    }


    @When("user re-enters correct username and password")
    public void user_re_enters_correct_username_and_password() {
        sendText(ConfigReader.read("userName"), loginPage.usernameField);
        sendText(ConfigReader.read("password"), loginPage.passwordField);
    }

    @Then("attempt to log in again succesfully")
    public void attempt_to_log_in_again_succesfully() {
        System.out.println("User logged in successfully");
    }
}


