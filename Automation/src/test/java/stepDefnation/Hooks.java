package stepDefnation;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	@Before("@RegTest")
	public void beforeValidation()
	{
		System.out.println("before test");
	}
	@After("@RegTest")
	public void afterValidation()
	{
		System.out.println("After test");
	}
}
