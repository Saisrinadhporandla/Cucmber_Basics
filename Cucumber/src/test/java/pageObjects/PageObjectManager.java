package pageObjects;

import org.openqa.selenium.WebDriver;

import io.cucumber.datatable.DataTable;

public class PageObjectManager {
	public WebDriver dr;
	public Browser browser;
	public Validation validation;
	public Credentials credentials;
	public Searching search;
	public PageObjectManager(WebDriver dr)
	{
		this.dr=dr;
	}
//	public Browser Browser()
//	{
//		browser=new Browser(dr);
//		return browser;
//	}
	public Credentials Credentials(DataTable data)
	{
		credentials=new Credentials(dr,data);
		return credentials;
				
	}
	public Searching Searching(DataTable mbl)
	{
		search= new Searching(dr,mbl);
		return search;
	}
	public Validation Validation()
	{
		validation=new Validation(dr);
		return  validation;
	}
}
