package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.datatable.DataTable;

public class Searching {
	WebDriver dr;
	DataTable mbl;
	public Searching(WebDriver dr,DataTable mbl)
	{
		this.mbl=mbl;
		this.dr=dr;
		PageFactory.initElements(dr, this);
	}
	@FindBy(id="twotabsearchtextbox")
	WebElement search;
	@FindBy(id="nav-search-submit-button")
	WebElement click5;
	public void add()
	{
		List<List<String>> obj=mbl.asLists();
		String mbl1=obj.get(0).get(0);
		search.sendKeys(mbl1);
		click5.click();

}
}
