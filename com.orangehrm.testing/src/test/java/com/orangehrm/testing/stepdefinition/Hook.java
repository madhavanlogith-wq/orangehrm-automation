package com.orangehrm.testing.stepdefinition;


import java.io.IOException;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.orangeHRM.seleniumuiframwork_genricutility.AllUtilityFunction;
import com.orangeHRM.seleniumuiframwork_genricutility.Base;
import com.orangeHRM.seleniumuiframwork_genricutility.Pages;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hook extends AllUtilityFunction{
	private Base base;
	
	public Hook(Base base) {
		this.base=base;
	}
	
	@Before
	public void setup() throws IOException {
		base.driver=new EdgeDriver();
		initProperties("C:\\Users\\acer\\git\\orangehrm-automation\\com.orangehrm.testing\\src\\main\\resources\\commondate.properties");
		
		String URL = getPropertyValue("url");
		String USER = getPropertyValue("username");
		String PASS = getPropertyValue("password");
		
		configMaximizedBrowser(base.driver);
		implicit(base.driver);
		
		base.driver.get(URL);
		
		Pages.loadAllPages(base.driver);
		Pages.loginpage.loginPage(USER, PASS);
	}
	
	@After
	public void teardown() {
//		Pages.dashboardpage.logout();
//		base.driver.quit();
	}
}
