package com.orangeHRM.seleniumuiframwork_genricutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.orangeHRM.seleniumuiframwork_Object_repository.DashbordPage;
import com.orangeHRM.seleniumuiframwork_Object_repository.LoginPage;
import com.orangeHRM.seleniumuiframwork_Object_repository_pim.AddUserPage;

public class Pages  {

	public static LoginPage lp;
	public static DashbordPage d;
	public static AddUserPage aup;
	
	public static void loadAllPages(WebDriver driver) {
		lp=PageFactory.initElements(driver, LoginPage.class);
		d=PageFactory.initElements(driver, DashbordPage.class);
		aup=PageFactory.initElements(driver, AddUserPage.class);
	}
	
}
