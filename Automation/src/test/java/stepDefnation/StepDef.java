package stepDefnation;




import java.util.List;

import org.junit.runner.RunWith;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class StepDef {
	@Given("^user on amazon landing page$")
    public void user_on_amazon_landing_page() throws Throwable {
		

    }

	@When("^user entered mobile number\"([^\"]*)\" and password \"([^\"]*)\"$")
    public void user_entered_mobile_numbersomething_and_password_something(String str1, String str2) throws Throwable {
		System.out.println(str1);
		System.out.println(str2);
    }

    @When("^user entered below Details$")
    public void user_entered_below_details(DataTable data) throws Throwable {
    	List<List<String>> obj=data.asLists();
//    	for(List<String> dat:obj)
//    	{
//    		System.out.println(dat);
//    	}
    	System.out.println(obj.get(0).get(0));
      //  System.out.println();
    }

    @When("^user entered mobile number(.+) and (.+) in$")
    public void user_entered_mobile_number_and_in(String username, String password) throws Throwable {
       System.out.println(username);
    	System.out.println(password);
    }



    @Then("^user able to see amazon home page$")
    public void click() throws Throwable {
        System.out.println("executed");
    }
    
  

    @And("^click on sign up$")
    public void click_on_sign_up() throws Throwable {
        System.out.println("executed");
    }
    @Given("^url of the page$")
    public void url_of_the_page() throws Throwable {
        System.out.println("url page1");
    }

    @When("^Browser is Trigerred$")
    public void browser_is_trigerred() throws Throwable {
    	 System.out.println("url page2");
    }

    @Then("^Browser is opend$")
    public void browser_is_opend() throws Throwable {
    	 System.out.println("url page3");
    }



}
