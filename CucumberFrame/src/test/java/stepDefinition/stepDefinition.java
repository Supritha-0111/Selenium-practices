package stepDefinition;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDefinition {

	@Given("^User is on Netbanking landing page$")
    public void user_is_on_netbanking_landing_page() throws Throwable {
		System.out.println("Login page");
    }

    @When("^User login into application with username and password$")
    public void user_login_into_application_with_username_and_password() throws Throwable {
    	System.out.println("LOgging in to account");
    }

   @Then("^Home page is populated$")
    public void home_page_is_populated() throws Throwable {
    	System.out.println("Home page is displayed");
    }
    
    @When("^User login into application with username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void user_login_into_application_with_username_something_and_password_something(String strArg1, String strArg2) throws Throwable {
          System.out.println(strArg1);
          System.out.println(strArg2);
    }

    @And("^Cards are displayed$")
    public void cards_are_displayed() throws Throwable {
    	System.out.println("Cards are validated");
    }

    @When("^User sign up with following details$")
    public void user_sign_up_with_following_details(DataTable data) throws Throwable {
    	List<List<String>> obj=data.asLists();
    	System.out.println(obj.get(0).get(0));
    	System.out.println(obj.get(0).get(1));
    	System.out.println(obj.get(0).get(2));
    	System.out.println(obj.get(0).get(3));
    	System.out.println(obj.get(0).get(4));

    }
    
    @When("^User login in to application with (.+) and (.+)$")
    public void user_login_to_application_with_and(String username, String password) throws Throwable {

    System.out.println(username);
    System.out.println(password);
    }

}
