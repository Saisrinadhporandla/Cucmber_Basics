package pageObjects;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.datatable.DataTable;

public class Credentials {
	
	 DataTable data;
	 WebDriver dr;
	public Credentials(WebDriver dr,DataTable data)
	{
		this.data=data;
		this.dr=dr;
		PageFactory.initElements(dr, this);
	}
@FindBy(xpath="//input[@id='ap_email']")
WebElement user;
@FindBy(css="input#continue")
WebElement click2;
@FindBy(id="ap_password")
WebElement pswd;
@FindBy(id="signInSubmit")
WebElement click3;

public void log_In()
{
	List<List<String>> obj=data.asLists();
	String user1=obj.get(0).get(0);
	String pass=obj.get(0).get(1);
	//click1.click();
	user.sendKeys(user1);
	click2.click();
	pswd.sendKeys(pass);
	click3.click();
}
	


}
