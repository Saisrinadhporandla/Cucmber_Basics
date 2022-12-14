package utils;

import org.openqa.selenium.WebDriver;

import pageObjects.PageObjectManager;

public class TestContext {
	public WebDriver dr;
	public BrowserBase browser;
	public PageObjectManager pom;
	public TestContext()
	{
		browser=new BrowserBase();
		pom=new PageObjectManager(browser.WebDriverManager());
	}


}
