package com.orangeHRM.seleniumuiframwork_genricutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.orangeHRM.seleniumuiframwork_Object_repository.DashbordPage;
import com.orangeHRM.seleniumuiframwork_Object_repository.LoginPage;
import com.orangeHRM.seleniumuiframwork_Object_repository_Admin.addJobTitlePage;
import com.orangeHRM.seleniumuiframwork_Object_repository_Admin.addUserPage;
import com.orangeHRM.seleniumuiframwork_Object_repository_Admin.organizationPage;
import com.orangeHRM.seleniumuiframwork_Object_repository_NewPage.PimCusDataPage;
import com.orangeHRM.seleniumuiframwork_Object_repository_NewPage.pimAddEmpPage;

public class Pages  {

	public static LoginPage lp;
	public static DashbordPage d;
	public static addUserPage au;
	public static addJobTitlePage jt;
	public static organizationPage ong;
	public static pimAddEmpPage aep;
	public static PimCusDataPage pcd;
	
	public static void loadAllPages(WebDriver driver) {
		lp=PageFactory.initElements(driver, LoginPage.class);
		d=PageFactory.initElements(driver, DashbordPage.class);
		ong=PageFactory.initElements(driver, organizationPage.class);
		aep=PageFactory.initElements(driver, pimAddEmpPage.class);
		jt=PageFactory.initElements(driver, addJobTitlePage.class);
		au=PageFactory.initElements(driver, addUserPage.class);
		pcd=PageFactory.initElements(driver, PimCusDataPage.class);
	}
	
}
