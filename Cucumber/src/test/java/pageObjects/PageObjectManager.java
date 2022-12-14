package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	public WebDriver dr;
	public Browser browser;
	public Validation validation;
	public PageObjectManager(WebDriver dr)
	{
		this.dr=dr;
	}
	public Browser Browser()
	{
		browser=new Browser(dr);
		return browser;
	}
	public Validation Validation(WebDriver dr)
	{
		validation=new Validation(dr);
		return  validation;
	}
}
