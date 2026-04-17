package com.orangehrm.testing.stepdefinition;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.orangeHRM.seleniumuiframwork_Object_repository.LoginPage;
import com.orangeHRM.seleniumuiframwork_genricutility.AllUtilityFunctions;
import com.orangeHRM.seleniumuiframwork_genricutility.Base;
import com.orangeHRM.seleniumuiframwork_genricutility.Pages;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends AllUtilityFunctions{
	private Base base;
	
	public Hooks(Base base) {
		this.base=base;
	}
	
	@Before
	public void setup() throws IOException {
		base.driver=new EdgeDriver();
		initProperties("./src/test/resources/Reader/commondata.properties");
		
		String URL = getPropertyValue("url");
		String USER = getPropertyValue("username");
		String PASS = getPropertyValue("password");
		
		configMaximizedBrowser(base.driver);
		implicit(base.driver);
		
		base.driver.get(URL);
		
		Pages.loadAllPages(base.driver);
		Pages.LoginPage.loginPage(USER, PASS);
	}
	
	@After
	public void teardown() {
		Pages.dashboardpage.logout();
		base.driver.quit();
	}
}