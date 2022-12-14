package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserBase {
	public WebDriver dr;
	public WebDriver WebDriverManager()
	{
		if(dr==null) {
		WebDriverManager.chromedriver().setup();
		dr=new ChromeDriver();
		dr.get("https://www.amazon.com/");	
		}
		return dr;
	}

}
