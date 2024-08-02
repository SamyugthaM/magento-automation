package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.*;

public class SignUpSteps {
    WebDriver driver;

    @Given("I am on the sign-up page")
    public void i_am_on_the_sign_up_page() {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://magento.softwaretestingboard.com/customer/account/create/");
    }

    @When("I fill in the sign-up form with valid details")
    public void i_fill_in_the_sign_up_form_with_valid_details() {
        // Code to fill the form
    }

    @When("I submit the sign-up form")
    public void i_submit_the_sign_up_form() {
        // Code to submit the form
    }

    @Then("I should see a confirmation message")
    public void i_should_see_a_confirmation_message() {
        // Code to verify confirmation message
    }

    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
        driver.get("https://magento.softwaretestingboard.com/customer/account/login/");
    }

    @When("I fill in the login form with valid credentials")
    public void i_fill_in_the_login_form_with_valid_credentials() {
        // Code to fill the login form
    }

    @When("I submit the login form")
    public void i_submit_the_login_form() {
        // Code to submit the login form
    }

    @Then("I should be logged in successfully")
    public void i_should_be_logged_in_successfully() {
        // Code to verify successful login
    }
}
