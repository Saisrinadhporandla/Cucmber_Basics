package StepDef;


import org.openqa.selenium.WebDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.PageObjectManager;
import utils.BrowserBase;
import utils.TestContext;

//@RunWith(Cucumber.class)
public class stepDefnation {
	public WebDriver dr;
	public TestContext test;
	public PageObjectManager pom;
	public BrowserBase base;
	public stepDefnation(TestContext test)
	{
		this.test=test;
	}
	@Given("^user on amazon landing page$")
    public void landing() throws Throwable {
		test.browser.WebDriverManager();
    }
	@When("^user entered mobile number and password$")
    public void user_entered_mobile_number_and_password(DataTable data) throws Throwable {
		
        test.pom.Credentials(data).log_In();		
    }
	 @And("^user searched the following item in search bar$")
	    public void search(DataTable mbl) throws Throwable {
		 test.pom.Searching(mbl).add();
	    }
	 @Then("^user able to see products retated to one plus 10 pro$")
	 public void result()
	 {
		 test.pom.Validation().add();
	 }

}