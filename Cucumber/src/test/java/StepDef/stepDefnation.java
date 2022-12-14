package StepDef;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.Browser;
import pageObjects.Credentials;
import pageObjects.PageObjectManager;
import pageObjects.Searching;
import pageObjects.Validation;
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
		WebDriverManager.chromedriver().setup();
		//test.dr=new ChromeDriver();
		test.pom.Browser().land();
		//pro.browser.land();
//		Browser browser=new Browser(test.driver);
//		browser.land();
    }
	@When("^user entered mobile number\"([^\"]*)\" and password \"([^\"]*)\"$")
    public void details(String str1, String str2) throws Throwable {
		Credentials land=new Credentials(base.WebDriverManager(),str1,str2);
		land.log_In();
		
    }
	 @And("^user searched for \"([^\"]*)\" in search bar$")
	    public void search(String mbl) throws Throwable {
		 Searching search=new Searching(base.WebDriverManager(),mbl);
		 search.add();
	    }
	 @Then("^user able to see products retated to one plus 10 pro$")
	 public void result()
	 {
		 
//		 Validation valid=new Validation(test.driver);
//		 valid.add();
	 }

}
