package com.orangehrm.testing.stepdefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;

import org.openqa.selenium.chrome.ChromeDriver;

import com.orangeHRM.seleniumuiframwork_genricutility.AllUtilityFunction;
import com.orangeHRM.seleniumuiframwork_genricutility.Base;
import com.orangeHRM.seleniumuiframwork_genricutility.Pages;

import java.io.IOException;

public class Hook extends AllUtilityFunction {
private Base base;
	
	public Hook(Base base) {
		this.base=base;
	}
	
	@Before
	public void setup() throws IOException {
		Base.driver=new ChromeDriver();
		initProperties("./src/test/resources/Reader/commondata.properties");
		
		String URL = getPropertyValue("url");
		String USER = getPropertyValue("username");
		String PASS = getPropertyValue("password");
		
		configMaximizedBrowser(Base.driver);
		implicit(Base.driver);
		
		Base.driver.get(URL);
		
		Pages.loadAllPages(Base.driver);
		Pages.lp.loginPage(USER, PASS);
	}
		@After
		public void teardown() {
			Pages.d.getLogoutDroupDown();
			Pages.d.getLogoutButton();
			Base.driver.quit();
		}
	}
